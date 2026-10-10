package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;

    @ColorInt
    private int backgroundOriginalColor;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private boolean haveChildWithInterpolator;

    @Nullable
    private WindowInsetsCompat lastInsets;
    private boolean liftOnScroll;

    @Nullable
    private ColorStateList liftOnScrollColor;

    @Nullable
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;

    @Nullable
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;

    @Nullable
    private WeakReference<View> liftOnScrollTargetView;

    @IdRes
    private int liftOnScrollTargetViewId;
    private final LinkedHashSet<LiftOnScrollProgressListener> liftProgressListeners;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;

    @Nullable
    private Drawable statusBarForeground;

    @Nullable
    private Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;

        @Nullable
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(@NonNull T t11);
        }

        public BaseBehavior() {
        }

        private static boolean checkFlag(int i11, int i12) {
            return (i11 & i12) == i12;
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                @Override // android.os.Parcelable.Creator
                @NonNull
                public SavedState[] newArray(int i11) {
                    return new SavedState[i11];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @Nullable
                public SavedState createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i11) {
                super.writeToParcel(parcel, i11);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int calculateSnapOffset(int i11, int i12, int i13) {
            return i11 < (i12 + i13) / 2 ? i12 : i13;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(T t11) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t11);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(@NonNull T t11) {
            return (-t11.getDownNestedScrollRange()) + t11.getTopInset();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(@NonNull T t11) {
            return t11.getTotalScrollRange();
        }

        @VisibleForTesting
        public boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            snapToChildIfNeeded(coordinatorLayout, t11);
            if (t11.isLiftOnScroll()) {
                t11.setLiftedState(t11.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11) {
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, t11, i11);
            int pendingAction = t11.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z11 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i12 = -t11.getUpNestedPreScrollRange();
                        if (z11) {
                            animateOffsetTo(coordinatorLayout, t11, i12, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t11, i12);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z11) {
                            animateOffsetTo(coordinatorLayout, t11, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t11, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, t11, -t11.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, t11, 0);
            } else {
                View childAt = t11.getChildAt(savedState.firstVisibleChildIndex);
                setHeaderTopBottomOffset(coordinatorLayout, t11, (-childAt.getBottom()) + (this.savedState.firstVisibleChildAtMinimumHeight ? childAt.getMinimumHeight() + t11.getTopInset() : Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown)));
            }
            t11.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -t11.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t11, getTopAndBottomOffset(), 0, true);
            t11.onOffsetChanged(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t11);
            return zOnLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, int i13, int i14) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) t11.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t11, i11, i12, i13, i14);
            }
            coordinatorLayout.onMeasureChild(t11, i11, i12, View.MeasureSpec.makeMeasureSpec(0, 0), i14);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull T t11, View view, int i11, int i12, int[] iArr, int i13) {
            T t12;
            int i14;
            int downNestedPreScrollRange;
            if (i12 == 0) {
                t12 = t11;
            } else {
                if (i12 < 0) {
                    i14 = -t11.getTotalScrollRange();
                    downNestedPreScrollRange = t11.getDownNestedPreScrollRange() + i14;
                } else {
                    i14 = -t11.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i15 = i14;
                int i16 = downNestedPreScrollRange;
                if (i15 != i16) {
                    t12 = t11;
                    iArr[1] = scroll(coordinatorLayout, t12, i12, i15, i16);
                } else {
                    t12 = t11;
                }
            }
            if (t12.isLiftOnScroll()) {
                t12.setLiftedState(t12.shouldLift(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t11, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t12;
            int i16;
            if (i14 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                i16 = i14;
                iArr[1] = scroll(coordinatorLayout2, t12, i16, -t11.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                i16 = i14;
            }
            if (i16 == 0) {
                addAccessibilityDelegateIfNeeded(coordinatorLayout2, t12);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, t11, this.savedState.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, t11, parcelable);
                this.savedState = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t11);
            SavedState savedStateSaveScrollState = saveScrollState(parcelableOnSaveInstanceState, t11);
            return savedStateSaveScrollState == null ? parcelableOnSaveInstanceState : savedStateSaveScrollState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, @NonNull View view, View view2, int i11, int i12) {
            ValueAnimator valueAnimator;
            boolean z11 = (i11 & 2) != 0 && (t11.isLiftOnScroll() || t11.isLifted() || canScrollChildren(coordinatorLayout, t11, view));
            if (z11 && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i12;
            return z11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t11, View view, int i11) {
            if (this.lastStartedType == 0 || i11 == 1) {
                snapToChildIfNeeded(coordinatorLayout, t11);
                if (t11.isLiftOnScroll()) {
                    t11.setLiftedState(t11.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        public void restoreScrollState(@Nullable SavedState savedState, boolean z11) {
            if (this.savedState == null || z11) {
                this.savedState = savedState;
            }
        }

        public void setDragCallback(@Nullable BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int setHeaderTopBottomOffset(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, int i13) {
            CoordinatorLayout coordinatorLayout2;
            T t12;
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i14 = 0;
            if (i12 == 0 || topBottomOffsetForScrollingSibling < i12 || topBottomOffsetForScrollingSibling > i13) {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                this.offsetDelta = 0;
            } else {
                int iClamp = MathUtils.clamp(i11, i12, i13);
                if (topBottomOffsetForScrollingSibling != iClamp) {
                    int iInterpolateOffset = t11.hasChildWithInterpolator() ? interpolateOffset(t11, iClamp) : iClamp;
                    boolean topAndBottomOffset = setTopAndBottomOffset(iInterpolateOffset);
                    int i15 = topBottomOffsetForScrollingSibling - iClamp;
                    this.offsetDelta = iClamp - iInterpolateOffset;
                    if (topAndBottomOffset) {
                        while (i14 < t11.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t11.getChildAt(i14).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(t11, t11.getChildAt(i14), getTopAndBottomOffset());
                            }
                            i14++;
                        }
                    }
                    if (!topAndBottomOffset && t11.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t11);
                    }
                    t11.onOffsetChanged(getTopAndBottomOffset());
                    coordinatorLayout2 = coordinatorLayout;
                    t12 = t11;
                    updateAppBarLayoutDrawableState(coordinatorLayout2, t12, iClamp, iClamp < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i14 = i15;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t12 = t11;
                }
            }
            addAccessibilityDelegateIfNeeded(coordinatorLayout2, t12);
            return i14;
        }

        private void addAccessibilityDelegateIfNeeded(final CoordinatorLayout coordinatorLayout, @NonNull final T t11) {
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new AccessibilityDelegateCompat() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
                        if (i11 == 4096) {
                            t11.setExpanded(false);
                            return true;
                        }
                        if (i11 != 8192) {
                            return super.performAccessibilityAction(view, i11, bundle);
                        }
                        if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                            View childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout);
                            if (!childWithScrollingBehavior.canScrollVertically(-1)) {
                                t11.setExpanded(true);
                                return true;
                            }
                            int i12 = -t11.getDownNestedPreScrollRange();
                            if (i12 != 0) {
                                BaseBehavior.this.onNestedPreScroll(coordinatorLayout, t11, childWithScrollingBehavior, 0, i12, new int[]{0, 0}, 1);
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        View childWithScrollingBehavior;
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
                        if (t11.getTotalScrollRange() != 0 && (childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout)) != null && BaseBehavior.this.childrenHaveScrollFlags(t11)) {
                            if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != (-t11.getTotalScrollRange())) {
                                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                                accessibilityNodeInfoCompat.setScrollable(true);
                            }
                            if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                                if (childWithScrollingBehavior.canScrollVertically(-1)) {
                                    if ((-t11.getDownNestedPreScrollRange()) != 0) {
                                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                        accessibilityNodeInfoCompat.setScrollable(true);
                                        return;
                                    }
                                    return;
                                }
                                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                accessibilityNodeInfoCompat.setScrollable(true);
                            }
                        }
                    }
                });
            }
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, float f11) {
            int height;
            int iAbs = Math.abs(getTopBottomOffsetForScrollingSibling() - i11);
            float fAbs = Math.abs(f11);
            if (fAbs > 0.0f) {
                height = Math.round((iAbs / fAbs) * 1000.0f) * 3;
            } else {
                height = (int) (((iAbs / t11.getHeight()) + 1.0f) * 150.0f);
            }
            animateOffsetWithDuration(coordinatorLayout, t11, i11, height);
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T t11, int i11, int i12) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i11) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.offsetAnimator.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator4) {
                        BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t11, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i12, 600));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i11);
            this.offsetAnimator.start();
        }

        private boolean canScrollChildren(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, @NonNull View view) {
            if (t11.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= t11.getHeight()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (((LayoutParams) appBarLayout.getChildAt(i11).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        private View findFirstScrollingChild(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Nullable
        private static View getAppBarChildOnOffset(@NonNull AppBarLayout appBarLayout, int i11) {
            int iAbs = Math.abs(i11);
            int childCount = appBarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = appBarLayout.getChildAt(i12);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(@NonNull T t11, int i11) {
            int childCount = t11.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = t11.getChildAt(i12);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i13 = -i11;
                if (top <= i13 && bottom >= i13) {
                    return i12;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int interpolateOffset(@NonNull T t11, int i11) {
            int iAbs = Math.abs(i11);
            int childCount = t11.getChildCount();
            int topInset = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = t11.getChildAt(i12);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (scrollInterpolator == null) {
                        break;
                    }
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= t11.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f11 = topInset;
                    return Integer.signum(i11) * (childAt.getTop() + Math.round(f11 * scrollInterpolator.getInterpolation((iAbs - childAt.getTop()) / f11)));
                }
            }
            return i11;
        }

        private boolean shouldJumpElevationState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            List<View> dependents = coordinatorLayout.getDependents(t11);
            int size = dependents.size();
            for (int i11 = 0; i11 < size; i11++) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i11).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) behavior).getOverlayTop() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            int topInset = t11.getTopInset() + t11.getPaddingTop();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - topInset;
            int childIndexOnOffset = getChildIndexOnOffset(t11, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t11.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && t11.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= t11.getTopInset();
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (checkFlag(scrollFlags, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (topBottomOffsetForScrollingSibling < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t11, MathUtils.clamp(calculateSnapOffset(topBottomOffsetForScrollingSibling, minimumHeight, topInset2) + topInset, -t11.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAppBarLayoutDrawableState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, boolean z11) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t11, i11);
            boolean zShouldLift = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = appBarChildOnOffset.getMinimumHeight();
                    if (i12 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i11) < (appBarChildOnOffset.getBottom() - minimumHeight) - t11.getTopInset()) : (-i11) >= (appBarChildOnOffset.getBottom() - minimumHeight) - t11.getTopInset()) {
                        zShouldLift = true;
                    }
                }
            }
            if (t11.isLiftOnScroll()) {
                zShouldLift = t11.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = t11.setLiftedState(zShouldLift);
            if (z11 || (liftedState && shouldJumpElevationState(coordinatorLayout, t11))) {
                if (t11.getBackground() != null) {
                    t11.getBackground().jumpToCurrentState();
                }
                if (t11.getForeground() != null) {
                    t11.getForeground().jumpToCurrentState();
                }
                if (t11.getStateListAnimator() != null) {
                    t11.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        @Nullable
        public SavedState saveScrollState(@Nullable Parcelable parcelable, @NonNull T t11) {
            boolean z11;
            boolean z12;
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t11.getChildCount();
            boolean z13 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t11.getChildAt(i11);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (topAndBottomOffset == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    savedState.fullyExpanded = z11;
                    if (!z11 && (-topAndBottomOffset) >= t11.getTotalScrollRange()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    savedState.fullyScrolled = z12;
                    savedState.firstVisibleChildIndex = i11;
                    if (bottom == childAt.getMinimumHeight() + t11.getTopInset()) {
                        z13 = true;
                    }
                    savedState.firstVisibleChildAtMinimumHeight = z13;
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t11, int i11);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i11) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i11, int i12, int i13, int i14) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i11, i12, i13, i14);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11, int i12, int[] iArr, int i13) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i11, i12, iArr, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i11, i12, i13, i14, i15, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i11, int i12) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i11, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i11);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@Nullable BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z11) {
            super.setHorizontalOffsetEnabled(z11);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i11) {
            return super.setLeftAndRightOffset(i11);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i11) {
            return super.setTopAndBottomOffset(i11);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z11) {
            super.setVerticalOffsetEnabled(z11);
        }
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f11);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect relativeRect = new Rect();
        private final Rect ghostRect = new Rect();

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f11) {
            updateRelativeRect(this.relativeRect, appBarLayout, view);
            float fAbs = this.relativeRect.top - Math.abs(f11);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fClamp = 1.0f - MathUtils.clamp(Math.abs(fAbs / this.relativeRect.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.relativeRect.height() * COMPRESS_DISTANCE_FACTOR) * (1.0f - (fClamp * fClamp)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.ghostRect);
            this.ghostRect.offset(0, (int) (-fHeight));
            if (fHeight >= this.ghostRect.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.ghostRect);
        }

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.AppBarLayout_Layout);
            this.scrollFlags = typedArrayObtainStyledAttributes.getInt(C7090R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(typedArrayObtainStyledAttributes.getInt(C7090R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i11 = C7090R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i11, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        @Nullable
        private ChildScrollEffect createScrollEffectFromInt(int i11) {
            if (i11 != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        public void setScrollEffect(@Nullable ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        @Nullable
        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        public boolean isCollapsible() {
            int i11 = this.scrollFlags;
            return (i11 & 1) == 1 && (i11 & 10) != 0;
        }

        public void setScrollEffect(int i11) {
            this.scrollEffect = createScrollEffectFromInt(i11);
        }

        public void setScrollFlags(int i11) {
            this.scrollFlags = i11;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i11, int i12, float f11) {
            super(i11, i12, f11);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }

    @Deprecated
    public interface LiftOnScrollListener {
        void onUpdate(@Dimension float f11, @ColorInt int i11);
    }

    public static abstract class LiftOnScrollProgressListener {
        public abstract void onUpdate(@Dimension float f11, @ColorInt int i11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i11);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        public /* bridge */ /* synthetic */ View findFirstDependency(@NonNull List list) {
            return findFirstDependency((List<View>) list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        public AppBarLayout findFirstDependency(@NonNull List<View> list) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = list.get(i11);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float getOverlapRatioForOffset(View view) {
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i11) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.getScrollRange(view);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        private static int getAppBarLayoutOffset(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
            return super.onLayoutChild(coordinatorLayout, view, i11);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13, int i14) {
            return super.onMeasureChild(coordinatorLayout, view, i11, i12, i13, i14);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z11) {
            AppBarLayout appBarLayoutFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (appBarLayoutFindFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutFindFirstDependency.setExpanded(false, !z11);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z11) {
            super.setHorizontalOffsetEnabled(z11);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i11) {
            return super.setLeftAndRightOffset(i11);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i11) {
            return super.setTopAndBottomOffset(i11);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z11) {
            super.setVerticalOffsetEnabled(z11);
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    public void addOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public void removeOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    public void setExpanded(boolean z11) {
        setExpanded(z11, isLaidOut());
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(view);
        }
    }

    public boolean setLiftable(boolean z11) {
        this.liftableOverride = true;
        return setLiftableState(z11);
    }

    public boolean setLifted(boolean z11) {
        return setLiftedState(z11, true);
    }

    public boolean setLiftedState(boolean z11) {
        return setLiftedState(z11, !this.liftableOverride);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (i11 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i11);
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.appBarLayoutStyle);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    @Nullable
    private Integer extractStatusBarForegroundColor() {
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @Nullable
    private View findLiftOnScrollTargetView(@Nullable View view) {
        int i11;
        if (this.liftOnScrollTargetView == null && (i11 = this.liftOnScrollTargetViewId) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i11) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (viewFindViewById != null) {
                this.liftOnScrollTargetView = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void invalidateScrollRanges() {
        Behavior behavior = this.behavior;
        BaseBehavior.SavedState savedStateSaveScrollState = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.saveScrollState(AbsSavedState.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (savedStateSaveScrollState != null) {
            this.behavior.restoreScrollState(savedStateSaveScrollState, false);
        }
    }

    @Nullable
    private MaterialShapeDrawable maybeConvertToMaterialShapeDrawable(Drawable drawable) {
        if (drawable instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) drawable;
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.setFillColor(colorStateListOrNull);
        return materialShapeDrawable;
    }

    private boolean setLiftableState(boolean z11) {
        if (this.liftable == z11) {
            return false;
        }
        this.liftable = z11;
        refreshDrawableState();
        return true;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private void startLiftOnScrollColorAnimation(float f11, float f12) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f12);
        this.liftOnScrollColorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    @Deprecated
    public void addLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public void addLiftOnScrollProgressListener(@NonNull LiftOnScrollProgressListener liftOnScrollProgressListener) {
        this.liftProgressListeners.add(liftOnScrollProgressListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Deprecated
    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    public void clearLiftOnScrollProgressListener() {
        this.liftProgressListeners.clear();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i11 = this.downPreScrollRange;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = layoutParams.scrollFlags;
                if ((i13 & 5) != 5) {
                    if (i12 > 0) {
                        break;
                    }
                } else {
                    int i14 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i13 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i13 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i14 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i12 += iMin;
                    }
                    iMin = i14 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i12 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i12);
        this.downPreScrollRange = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i11 = this.downScrollRange;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i13 = layoutParams.scrollFlags;
                if ((i13 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i13 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.downScrollRange = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public int getPendingAction() {
        return this.pendingAction;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i11 = this.totalScrollRange;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = layoutParams.scrollFlags;
                if ((i13 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i12 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i13 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.totalScrollRange = iMax;
        return iMax;
    }

    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i11) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + iArr.length);
        boolean z11 = this.liftable;
        int i12 = C7090R.attr.state_liftable;
        if (!z11) {
            i12 = -i12;
        }
        iArr[0] = i12;
        iArr[1] = (z11 && this.lifted) ? C7090R.attr.state_lifted : -C7090R.attr.state_lifted;
        int i13 = C7090R.attr.state_collapsible;
        if (!z11) {
            i13 = -i13;
        }
        iArr[2] = i13;
        iArr[3] = (z11 && this.lifted) ? C7090R.attr.state_collapsed : -C7090R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    public void onOffsetChanged(int i11) {
        this.currentOffset = i11;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i12);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i11);
                }
            }
        }
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean removeLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    @CanIgnoreReturnValue
    public boolean removeLiftOnScrollProgressListener(@NonNull LiftOnScrollProgressListener liftOnScrollProgressListener) {
        return this.liftProgressListeners.remove(liftOnScrollProgressListener);
    }

    public void setExpanded(boolean z11, boolean z12) {
        setExpanded(z11, z12, true);
    }

    public void setLiftOnScroll(boolean z11) {
        this.liftOnScroll = z11;
    }

    public void setLiftOnScrollColor(@Nullable ColorStateList colorStateList) {
        if (this.liftOnScrollColor != colorStateList) {
            this.liftOnScrollColor = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i11) {
        this.liftOnScrollTargetViewId = i11;
        clearLiftOnScrollTargetView();
    }

    public void setLiftableOverrideEnabled(boolean z11) {
        this.liftableOverride = z11;
    }

    public boolean setLiftedState(boolean z11, boolean z12) {
        if (!z12 || this.lifted == z11) {
            return false;
        }
        this.lifted = z11;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        if (this.liftOnScrollColor != null) {
            startLiftOnScrollColorAnimation(z11 ? 0.0f : 1.0f, z11 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        startLiftOnScrollColorAnimation(z11 ? 0.0f : this.appBarElevation, z11 ? this.appBarElevation : 0.0f);
        return true;
    }

    public void setPendingAction(int i11) {
        this.pendingAction = i11;
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.statusBarForeground = drawable != null ? drawable.mutate() : null;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            Drawable drawable3 = this.statusBarForeground;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.statusBarForeground, getLayoutDirection());
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i11) {
        setStatusBarForeground(new ColorDrawable(i11));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new ArrayList();
        this.liftProgressListeners = new LinkedHashSet<>();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            ViewUtilsLollipop.setBoundsViewOutlineProvider(this);
        }
        ViewUtilsLollipop.setStateListAnimatorFromAttrs(this, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C7090R.styleable.AppBarLayout, i11, i12, new int[0]);
        this.liftOnScrollColor = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C7090R.styleable.AppBarLayout_liftOnScrollColor);
        this.liftOnScrollColorDuration = MotionUtils.resolveThemeDuration(context2, C7090R.attr.motionDurationMedium2, getResources().getInteger(C7090R.integer.app_bar_elevation_anim_duration));
        this.liftOnScrollColorInterpolator = MotionUtils.resolveThemeInterpolator(context2, C7090R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        int i13 = C7090R.styleable.AppBarLayout_expanded;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setExpanded(typedArrayObtainStyledAttributes.getBoolean(i13, false), false, false);
        }
        int i14 = C7090R.styleable.AppBarLayout_elevation;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, 0));
        }
        setBackground(typedArrayObtainStyledAttributes.getDrawable(C7090R.styleable.AppBarLayout_android_background));
        if (Build.VERSION.SDK_INT >= 26) {
            int i15 = C7090R.styleable.AppBarLayout_android_keyboardNavigationCluster;
            if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(i15, false));
            }
            int i16 = C7090R.styleable.AppBarLayout_android_touchscreenBlocksFocus;
            if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(i16, false));
            }
        }
        this.appBarElevation = getResources().getDimension(C7090R.dimen.design_appbar_elevation);
        this.liftOnScroll = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.AppBarLayout_liftOnScroll, false);
        this.liftOnScrollTargetViewId = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayObtainStyledAttributes.getDrawable(C7090R.styleable.AppBarLayout_statusBarForeground));
        typedArrayObtainStyledAttributes.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.AppBarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AppBarLayout.this.onWindowInsetChanged(windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12915a(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(fFloatValue);
        Drawable drawable = appBarLayout.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(fFloatValue);
        }
        Iterator<LiftOnScrollListener> it = appBarLayout.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(fFloatValue, materialShapeDrawable.getResolvedTintColor());
        }
        Iterator<LiftOnScrollProgressListener> it2 = appBarLayout.liftProgressListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onUpdate(fFloatValue, materialShapeDrawable.getResolvedTintColor(), fFloatValue / appBarLayout.appBarElevation);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12916b(AppBarLayout appBarLayout, ColorStateList colorStateList, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int iLayer = MaterialColors.layer(appBarLayout.backgroundOriginalColor, colorStateList.getDefaultColor(), fFloatValue);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iLayer));
        if (appBarLayout.statusBarForeground != null && (num2 = appBarLayout.statusBarForegroundOriginalColor) != null && num2.equals(num)) {
            appBarLayout.statusBarForeground.setTint(iLayer);
        }
        if (!appBarLayout.liftOnScrollListeners.isEmpty()) {
            for (LiftOnScrollListener liftOnScrollListener : appBarLayout.liftOnScrollListeners) {
                if (materialShapeDrawable.getFillColor() != null) {
                    liftOnScrollListener.onUpdate(0.0f, iLayer);
                }
            }
        }
        if (!appBarLayout.liftProgressListeners.isEmpty()) {
            Iterator<LiftOnScrollProgressListener> it = appBarLayout.liftProgressListeners.iterator();
            while (it.hasNext()) {
                it.next().onUpdate(0.0f, iLayer, fFloatValue);
            }
        }
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((LayoutParams) getChildAt(i11).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(final MaterialShapeDrawable materialShapeDrawable, @NonNull final ColorStateList colorStateList) {
        final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), C7090R.attr.colorSurface);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.m12916b(this.f11741b, colorStateList, materialShapeDrawable, colorOrNull, valueAnimator);
            }
        };
    }

    private void initializeLiftOnScrollWithElevation(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.m12915a(this.f11745b, materialShapeDrawable, valueAnimator);
            }
        };
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    private Drawable maybeCreateLiftOnScrollBackground(@NonNull Context context, @NonNull Drawable drawable) {
        MaterialShapeDrawable materialShapeDrawableMaybeConvertToMaterialShapeDrawable = maybeConvertToMaterialShapeDrawable(drawable);
        if (materialShapeDrawableMaybeConvertToMaterialShapeDrawable != null && materialShapeDrawableMaybeConvertToMaterialShapeDrawable.getFillColor() != null) {
            this.backgroundOriginalColor = materialShapeDrawableMaybeConvertToMaterialShapeDrawable.getFillColor().getDefaultColor();
            ColorStateList colorStateList = this.liftOnScrollColor;
            if (colorStateList != null) {
                initializeLiftOnScrollWithColor(materialShapeDrawableMaybeConvertToMaterialShapeDrawable, colorStateList);
                return materialShapeDrawableMaybeConvertToMaterialShapeDrawable;
            }
            initializeLiftOnScrollWithElevation(context, materialShapeDrawableMaybeConvertToMaterialShapeDrawable);
            return materialShapeDrawableMaybeConvertToMaterialShapeDrawable;
        }
        return drawable;
    }

    private void setExpanded(boolean z11, boolean z12, boolean z13) {
        this.pendingAction = (z11 ? 1 : 2) | (z12 ? 4 : 0) | (z13 ? 8 : 0);
        requestLayout();
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int minimumHeight;
        int topInset = getTopInset();
        int minimumHeight2 = getMinimumHeight();
        if (minimumHeight2 != 0) {
            int i11 = (minimumHeight2 * 2) + topInset;
            if (i11 < getHeight()) {
                return i11;
            }
            return minimumHeight2 + topInset;
        }
        int childCount = getChildCount();
        if (childCount >= 1) {
            minimumHeight = getChildAt(childCount - 1).getMinimumHeight();
        } else {
            minimumHeight = 0;
        }
        if (minimumHeight != 0) {
            int i12 = (minimumHeight * 2) + topInset;
            if (i12 < getHeight()) {
                return i12;
            }
            return minimumHeight + topInset;
        }
        return getHeight() / 3;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean hasScrollableChildren() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = true;
        if (getFitsSystemWindows() && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            if (((LayoutParams) getChildAt(i15).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.liftableOverride) {
            if (!this.liftOnScroll && !hasCollapsibleChild()) {
                z12 = false;
            }
            setLiftableState(z12);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != 1073741824 && getFitsSystemWindows() && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i12));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    public WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (getFitsSystemWindows()) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            updateWillNotDraw();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(maybeCreateLiftOnScrollBackground(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        MaterialShapeUtils.setElevation(this, f11);
    }

    public void setStatusBarForegroundResource(@DrawableRes int i11) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i11));
    }

    @Deprecated
    public void setTargetElevation(float f11) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f11);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        boolean z11;
        super.setVisibility(i11);
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
    }

    public boolean shouldLift(@Nullable View view) {
        View viewFindLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (viewFindLiftOnScrollTargetView != null) {
            view = viewFindLiftOnScrollTargetView;
        }
        if (view != null) {
            if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.statusBarForeground) {
            return false;
        }
        return true;
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
