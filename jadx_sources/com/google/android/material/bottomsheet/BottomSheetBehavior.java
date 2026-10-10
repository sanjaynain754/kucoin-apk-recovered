package com.google.android.material.bottomsheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;

    @VisibleForTesting
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";

    @VisibleForTesting
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;

    @Nullable
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;

    @Nullable
    private ColorStateList backgroundTint;

    @Nullable
    MaterialBottomContainerBackHelper bottomContainerBackHelper;

    @NonNull
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final ViewDragHelper.Callback dragCallback;

    @Nullable
    WeakReference<View> dragHandleViewRef;
    private boolean draggable;
    private boolean draggableOnNestedScroll;
    private boolean draggableOnNestedScrollLastDragIgnored;
    float elevation;

    @VisibleForTesting
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;

    @Nullable
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;

    @Nullable
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;

    @Nullable
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    ViewDragHelper viewDragHelper;

    @Nullable
    WeakReference<V> viewRef;

    /* JADX INFO: loaded from: classes45.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SaveFlags {
    }

    /* JADX INFO: loaded from: classes45.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
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
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i11) {
            super(parcelable);
            this.state = i11;
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableState {
    }

    /* JADX INFO: loaded from: classes45.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    ViewDragHelper viewDragHelper = BottomSheetBehavior.this.viewDragHelper;
                    if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i11) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.targetState = i11;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            BottomSheetBehavior.this.viewRef.get().postOnAnimation(this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.draggableOnNestedScroll = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i11) {
                if (i11 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:6:0x0010  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f11, float f12) {
                int i11 = 6;
                if (f12 >= 0.0f) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f12)) {
                        if ((Math.abs(f11) < Math.abs(f12) && f12 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view)) {
                            i11 = 5;
                        } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                            i11 = 3;
                        }
                    } else if (f12 == 0.0f || Math.abs(f11) > Math.abs(f12)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i12 = bottomSheetBehavior2.halfExpandedOffset;
                            if (top < i12) {
                                if (top < Math.abs(top - bottomSheetBehavior2.collapsedOffset)) {
                                    i11 = 3;
                                } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    i11 = 4;
                                }
                            } else if (Math.abs(top - i12) >= Math.abs(top - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i11 = 4;
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top - BottomSheetBehavior.this.collapsedOffset)) {
                            i11 = 3;
                        } else {
                            i11 = 4;
                        }
                    } else if (BottomSheetBehavior.this.fitToContents) {
                        i11 = 4;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i11 = 4;
                        }
                    }
                } else if (BottomSheetBehavior.this.fitToContents) {
                    i11 = 3;
                } else {
                    int top3 = view.getTop();
                    long jUptimeMillis = SystemClock.uptimeMillis() - this.viewCapturedMillis;
                    if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        if (!bottomSheetBehavior3.shouldExpandOnUpwardDrag(jUptimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.parentHeight)) {
                            i11 = 4;
                        }
                    } else if (top3 <= BottomSheetBehavior.this.halfExpandedOffset) {
                    }
                    i11 = 3;
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i11, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
                return MathUtils.clamp(i11, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                return BottomSheetBehavior.this.canBeHiddenByDragging() ? BottomSheetBehavior.this.parentHeight : BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
                BottomSheetBehavior.this.dispatchOnSlide(i12);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i11) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i12 = bottomSheetBehavior.state;
                if (i12 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i12 == 3 && bottomSheetBehavior.activePointerId == i11) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = SystemClock.uptimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }

            private boolean releasedLow(@NonNull View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
                return view.getLeft();
            }
        };
    }

    @RequiresApi(31)
    private float calculateCornerInterpolation(float f11, @Nullable RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f11 > 0.0f) {
                return radius / f11;
            }
        }
        return 0.0f;
    }

    private int getTopOffsetForState(int i11) {
        if (i11 == 3) {
            return getExpandedOffset();
        }
        if (i11 == 4) {
            return this.collapsedOffset;
        }
        if (i11 == 5) {
            return this.parentHeight;
        }
        if (i11 == 6) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i11);
    }

    private void replaceAccessibilityActionForState(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i11) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i11));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateDrawableForTargetState(int i11, boolean z11) {
        boolean zIsExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i11 == 2 || this.expandedCornersRemoved == (zIsExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = zIsExpandedAndShouldRemoveCorners;
        if (!z11 || (valueAnimator = this.interpolatorAnimator) == null) {
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            this.materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.interpolatorAnimator.reverse();
        } else {
            this.interpolatorAnimator.setFloatValues(this.materialShapeDrawable.getInterpolation(), zIsExpandedAndShouldRemoveCorners ? calculateInterpolationWithCornersRemoved() : 1.0f);
            this.interpolatorAnimator.start();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        if (i13 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v11.getTop();
            int i14 = top - i12;
            if (i12 > 0) {
                if (!this.nestedScrolled && !this.draggableOnNestedScroll && view == view2 && view.canScrollVertically(1)) {
                    this.draggableOnNestedScrollLastDragIgnored = true;
                    return;
                }
                if (i14 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    ViewCompat.offsetTopAndBottom(v11, -expandedOffset);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i12;
                    ViewCompat.offsetTopAndBottom(v11, -i12);
                    setStateInternal(1);
                }
            } else if (i12 < 0) {
                boolean zCanScrollVertically = view.canScrollVertically(-1);
                if (!this.nestedScrolled && !this.draggableOnNestedScroll && view == view2 && zCanScrollVertically) {
                    this.draggableOnNestedScrollLastDragIgnored = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i14 > this.collapsedOffset && !canBeHiddenByDragging()) {
                        int i15 = top - this.collapsedOffset;
                        iArr[1] = i15;
                        ViewCompat.offsetTopAndBottom(v11, -i15);
                        setStateInternal(4);
                    } else {
                        if (!this.draggable) {
                            return;
                        }
                        iArr[1] = i12;
                        ViewCompat.offsetTopAndBottom(v11, -i12);
                        setStateInternal(1);
                    }
                }
            }
            dispatchOnSlide(v11.getTop());
            this.lastNestedScrollDy = i12;
            this.nestedScrolled = true;
            this.draggableOnNestedScrollLastDragIgnored = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i11 & 2) != 0;
    }

    public void setAccessibilityDelegateView(@Nullable View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.accessibilityDelegateViewRef) == null) {
            this.accessibilityDelegateViewRef = new WeakReference<>(view);
            updateAccessibilityActions(view, 1);
        } else {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        }
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f11) {
        if (f11 <= 0.0f || f11 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f11;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setPeekHeight(int i11) {
        setPeekHeight(i11, false);
    }

    public void setState(int i11) {
        if (i11 == 1 || i11 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i11 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.hideable && i11 == 5) {
            Log.w(TAG, "Cannot set state: " + i11);
            return;
        }
        final int i12 = (i11 == 6 && this.fitToContents && getTopOffsetForState(i11) <= this.fitToContentsOffset) ? 3 : i11;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i11);
        } else {
            final V v11 = this.viewRef.get();
            runAfterLayout(v11, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.startSettling(v11, i12, false);
                }
            });
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j11, @FloatRange(from = 0.0d, m1552to = 100.0d) float f11) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v11 = this.viewRef.get();
        if (!isAtTopOfScreen() || (rootWindowInsets = v11.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(calculateCornerInterpolation(this.materialShapeDrawable.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), calculateCornerInterpolation(this.materialShapeDrawable.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int calculatePeekHeight() {
        int i11;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        return (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i11 = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i11 + this.peekHeightGestureInsetBuffer);
    }

    private float calculateSlideOffsetWithTop(int i11) {
        float f11;
        float expandedOffset;
        int i12 = this.collapsedOffset;
        if (i11 > i12 || i12 == getExpandedOffset()) {
            int i13 = this.collapsedOffset;
            f11 = i13 - i11;
            expandedOffset = this.parentHeight - i13;
        } else {
            int i14 = this.collapsedOffset;
            f11 = i14 - i11;
            expandedOffset = i14 - getExpandedOffset();
        }
        return f11 / expandedOffset;
    }

    private void clearAccessibilityAction(View view, int i11) {
        if (view == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 524288);
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        int i12 = this.expandHalfwayActionIds.get(i11, -1);
        if (i12 != -1) {
            ViewCompat.removeAccessibilityAction(view, i12);
            this.expandHalfwayActionIds.delete(i11);
        }
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i11) {
        return new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                BottomSheetBehavior.this.setState(i11);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.viewRef.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3) {
            return this.shouldRemoveExpandedCorners || isAtTopOfScreen();
        }
        return false;
    }

    private boolean isTouchingDragHandle(@NonNull CoordinatorLayout coordinatorLayout, int i11, int i12) {
        WeakReference<View> weakReference = this.dragHandleViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        return view != null && coordinatorLayout.isPointInChildBounds(view, i11, i12);
    }

    private boolean isTouchingScrollingChild(@NonNull CoordinatorLayout coordinatorLayout, int i11, int i12) {
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view = weakReference != null ? weakReference.get() : null;
        return view != null && coordinatorLayout.isPointInChildBounds(view, i11, i12);
    }

    private void restoreOptionalState(@NonNull SavedState savedState) {
        int i11 = this.saveFlags;
        if (i11 == 0) {
            return;
        }
        if (i11 == -1 || (i11 & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i11 == -1 || (i11 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i11 == -1 || (i11 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i11 == -1 || (i11 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void setWindowInsetsListener(@NonNull View view) {
        final boolean z11 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z11) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                /* JADX WARN: Code duplicated, block: B:22:0x0080  */
                /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                    boolean z12;
                    int i11;
                    int i12;
                    Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                    Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures());
                    BottomSheetBehavior.this.insetTop = insets.top;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                    int paddingBottom = view2.getPaddingBottom();
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingRight = view2.getPaddingRight();
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        BottomSheetBehavior.this.insetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
                        paddingBottom = relativePadding.bottom + BottomSheetBehavior.this.insetBottom;
                    }
                    if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                        if (zIsLayoutRtl) {
                            i12 = relativePadding.end;
                        } else {
                            i12 = relativePadding.start;
                        }
                        paddingLeft = i12 + insets.left;
                    }
                    if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                        if (zIsLayoutRtl) {
                            i11 = relativePadding.start;
                        } else {
                            i11 = relativePadding.end;
                        }
                        paddingRight = i11 + insets.right;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    boolean z13 = true;
                    if (BottomSheetBehavior.this.marginLeftSystemWindowInsets) {
                        int i13 = marginLayoutParams.leftMargin;
                        int i14 = insets.left;
                        if (i13 != i14) {
                            marginLayoutParams.leftMargin = i14;
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                    if (BottomSheetBehavior.this.marginRightSystemWindowInsets) {
                        int i15 = marginLayoutParams.rightMargin;
                        int i16 = insets.right;
                        if (i15 != i16) {
                            marginLayoutParams.rightMargin = i16;
                            z12 = true;
                        }
                    }
                    if (BottomSheetBehavior.this.marginTopSystemWindowInsets) {
                        int i17 = marginLayoutParams.topMargin;
                        int i18 = insets.top;
                        if (i17 != i18) {
                            marginLayoutParams.topMargin = i18;
                        } else {
                            z13 = z12;
                        }
                    } else {
                        z13 = z12;
                    }
                    if (z13) {
                        view2.setLayoutParams(marginLayoutParams);
                    }
                    view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                    if (z11) {
                        BottomSheetBehavior.this.gestureInsetBottom = insets2.bottom;
                    }
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets || z11) {
                        BottomSheetBehavior.this.updatePeekHeight(false);
                        return windowInsetsCompat;
                    }
                    return windowInsetsCompat;
                }
            });
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private void updateImportantForAccessibility(boolean z11) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (childAt != this.viewRef.get()) {
                    if (z11) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (!z11) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z11) {
        V v11;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v11 = this.viewRef.get()) == null) {
                return;
            }
            if (z11) {
                setState(4);
            } else {
                v11.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    public void dispatchOnSlide(int i11) {
        V v11 = this.viewRef.get();
        if (v11 == null || this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i11);
        for (int i12 = 0; i12 < this.callbacks.size(); i12++) {
            this.callbacks.get(i12).onSlide(v11, fCalculateSlideOffsetWithTop);
        }
    }

    @Nullable
    @VisibleForTesting
    public MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    @Px
    public int getMaxHeight() {
        return this.maxHeight;
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @VisibleForTesting
    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        if (backEventCompatOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(this.hideable ? 5 : 4);
        } else if (this.hideable) {
            this.bottomContainerBackHelper.finishBackProgressNotPersistent(backEventCompatOnHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.setStateInternal(5);
                    WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    BottomSheetBehavior.this.viewRef.get().requestLayout();
                }
            });
        } else {
            this.bottomContainerBackHelper.finishBackProgressPersistent(backEventCompatOnHandleBackInvoked, null);
            setState(4);
        }
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isDraggableOnNestedScroll() {
        return this.draggableOnNestedScroll;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v11, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i11 = savedState.state;
        if (i11 == 1 || i11 == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i11;
            this.lastStableState = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v11), (BottomSheetBehavior<?>) this);
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDragHandleView(@Nullable BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.dragHandleViewRef = bottomSheetDragHandleView != null ? new WeakReference<>(bottomSheetDragHandleView) : null;
    }

    public void setDraggable(boolean z11) {
        this.draggable = z11;
    }

    public void setDraggableOnNestedScroll(boolean z11) {
        this.draggableOnNestedScroll = z11;
    }

    public void setExpandedOffset(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i11;
        updateDrawableForTargetState(this.state, true);
    }

    public void setFitToContents(boolean z11) {
        if (this.fitToContents == z11) {
            return;
        }
        this.fitToContents = z11;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z11) {
        this.gestureInsetBottomIgnored = z11;
    }

    public void setHideFriction(float f11) {
        this.hideFriction = f11;
    }

    public void setHideable(boolean z11) {
        if (this.hideable != z11) {
            this.hideable = z11;
            if (!z11 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean z11) {
        this.hideable = z11;
    }

    public void setMaxHeight(@Px int i11) {
        this.maxHeight = i11;
    }

    public void setMaxWidth(@Px int i11) {
        this.maxWidth = i11;
    }

    public final void setPeekHeight(int i11, boolean z11) {
        if (i11 == -1) {
            if (this.peekHeightAuto) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i11) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i11);
        }
        updatePeekHeight(z11);
    }

    public void setSaveFlags(int i11) {
        this.saveFlags = i11;
    }

    public void setShouldRemoveExpandedCorners(boolean z11) {
        if (this.shouldRemoveExpandedCorners != z11) {
            this.shouldRemoveExpandedCorners = z11;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i11) {
        this.significantVelocityThreshold = i11;
    }

    public void setSkipCollapsed(boolean z11) {
        this.skipCollapsed = z11;
    }

    public void setStateInternal(int i11) {
        V v11;
        if (this.state == i11) {
            return;
        }
        this.state = i11;
        if (i11 == 4 || i11 == 3 || i11 == 6 || (this.hideable && i11 == 5)) {
            this.lastStableState = i11;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        if (i11 == 3) {
            updateImportantForAccessibility(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i11, true);
        for (int i12 = 0; i12 < this.callbacks.size(); i12++) {
            this.callbacks.get(i12).onStateChanged(v11, i11);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z11) {
        this.updateImportantForAccessibilityOnSiblings = z11;
    }

    public boolean shouldHide(@NonNull View view, float f11) {
        if (this.skipCollapsed) {
            return true;
        }
        if (isHideableWhenDragging() && view.getTop() >= this.collapsedOffset) {
            return Math.abs((((float) view.getTop()) + (f11 * this.hideFriction)) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
        }
        return false;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(backEventCompat);
    }

    private int addAccessibilityActionForState(View view, @StringRes int i11, int i12) {
        return ViewCompat.addAccessibilityAction(view, view.getResources().getString(i11), createAccessibilityViewCommandForState(i12));
    }

    private void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - iCalculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - iCalculatePeekHeight;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        if (isHideable() && isHideableWhenDragging()) {
            return true;
        }
        return false;
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(fFloatValue);
                }
            }
        });
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v11) {
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int getChildMeasureSpec(int i11, int i12, int i13, int i14) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i12, i14);
        if (i13 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i13 = Math.min(size, i13);
            }
            return View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i13), 1073741824);
    }

    private boolean isLayouting(V v11) {
        ViewParent parent = v11.getParent();
        if (parent != null && parent.isLayoutRequested() && v11.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    private void runAfterLayout(V v11, Runnable runnable) {
        if (isLayouting(v11)) {
            v11.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i11, boolean z11) {
        int topOffsetForState = getTopOffsetForState(i11);
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null && (!z11 ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), topOffsetForState) : viewDragHelper.settleCapturedViewAt(view.getLeft(), topOffsetForState))) {
            setStateInternal(2);
            updateDrawableForTargetState(i11, true);
            this.stateSettlingTracker.continueSettlingToState(i11);
            return;
        }
        setStateInternal(i11);
    }

    @Nullable
    @VisibleForTesting
    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i11));
                if (viewFindScrollingChild != null) {
                    return viewFindScrollingChild;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        boolean z11;
        View view;
        int i11;
        ViewDragHelper viewDragHelper;
        if (v11.isShown() && this.draggable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.touchingScrollingChild = false;
                    this.activePointerId = -1;
                    if (this.ignoreEvents) {
                        this.ignoreEvents = false;
                        return false;
                    }
                }
            } else {
                int x11 = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                this.initialY = y11;
                if (this.state != 2 && isTouchingScrollingChild(coordinatorLayout, x11, y11)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    if (!isTouchingDragHandle(coordinatorLayout, x11, this.initialY)) {
                        this.touchingScrollingChild = true;
                    }
                }
                if (this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v11, x11, this.initialY)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.ignoreEvents = z11;
            }
            if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference = this.nestedScrollingChildRef;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            if (actionMasked != 2 || view == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i11 = this.initialY) == -1 || Math.abs(i11 - motionEvent.getY()) <= this.viewDragHelper.getTouchSlop()) {
                return false;
            }
            return true;
        }
        this.ignoreEvents = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        if (coordinatorLayout.getFitsSystemWindows() && !v11.getFitsSystemWindows()) {
            v11.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(C7090R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v11);
            ViewCompat.setWindowInsetsAnimationCallback(v11, new InsetsAnimationCallback(v11));
            this.viewRef = new WeakReference<>(v11);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(v11);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                v11.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float elevation = this.elevation;
                if (elevation == -1.0f) {
                    elevation = v11.getElevation();
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v11, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (v11.getImportantForAccessibility() == 0) {
                v11.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int top = v11.getTop();
        coordinatorLayout.onLayoutChild(v11, i11);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v11.getHeight();
        this.childHeight = height;
        int iMin = this.parentHeight;
        int i12 = iMin - height;
        int i13 = this.insetTop;
        if (i12 < i13) {
            if (this.paddingTopSystemWindowInsets) {
                int i14 = this.maxHeight;
                if (i14 != -1) {
                    iMin = Math.min(iMin, i14);
                }
                this.childHeight = iMin;
            } else {
                int iMin2 = iMin - i13;
                int i15 = this.maxHeight;
                if (i15 != -1) {
                    iMin2 = Math.min(iMin2, i15);
                }
                this.childHeight = iMin2;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i16 = this.state;
        if (i16 == 3) {
            ViewCompat.offsetTopAndBottom(v11, getExpandedOffset());
        } else if (i16 == 6) {
            ViewCompat.offsetTopAndBottom(v11, this.halfExpandedOffset);
        } else if (this.hideable && i16 == 5) {
            ViewCompat.offsetTopAndBottom(v11, this.parentHeight);
        } else if (i16 == 4) {
            ViewCompat.offsetTopAndBottom(v11, this.collapsedOffset);
        } else if (i16 == 1 || i16 == 2) {
            ViewCompat.offsetTopAndBottom(v11, top - v11.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v11));
        for (int i17 = 0; i17 < this.callbacks.size(); i17++) {
            this.callbacks.get(i17).onLayout(v11);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        v11.measure(getChildMeasureSpec(i11, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i13, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f11, float f12) {
        WeakReference<View> weakReference;
        if (!isNestedScrollingCheckEnabled() || (weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get() || ((this.state == 3 || this.draggableOnNestedScrollLastDragIgnored) && !super.onNestedPreFling(coordinatorLayout, v11, view, f11, f12))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11) {
        WeakReference<View> weakReference;
        int i12 = 3;
        if (v11.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (isNestedScrollingCheckEnabled() && ((weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get() || !this.nestedScrolled)) {
            return;
        }
        if (this.lastNestedScrollDy > 0) {
            if (!this.fitToContents && v11.getTop() > this.halfExpandedOffset) {
                i12 = 6;
            }
        } else if (this.hideable && shouldHide(v11, getYVelocity())) {
            i12 = 5;
        } else if (this.lastNestedScrollDy == 0) {
            int top = v11.getTop();
            if (this.fitToContents) {
                if (Math.abs(top - this.fitToContentsOffset) >= Math.abs(top - this.collapsedOffset)) {
                    i12 = 4;
                }
            } else {
                int i13 = this.halfExpandedOffset;
                if (top < i13) {
                    if (top >= Math.abs(top - this.collapsedOffset)) {
                        if (shouldSkipHalfExpandedStateWhenDragging()) {
                            i12 = 4;
                        } else {
                            i12 = 6;
                        }
                    }
                } else if (Math.abs(top - i13) >= Math.abs(top - this.collapsedOffset)) {
                    i12 = 4;
                } else {
                    i12 = 6;
                }
            }
        } else {
            if (!this.fitToContents) {
                int top2 = v11.getTop();
                if (Math.abs(top2 - this.halfExpandedOffset) < Math.abs(top2 - this.collapsedOffset)) {
                    i12 = 6;
                }
            }
            i12 = 4;
        }
        startSettling(v11, i12, false);
        this.nestedScrolled = false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        if (!v11.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
            this.viewDragHelper.captureChildView(v11, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    private void updateAccessibilityActions(View view, int i11) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i11);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i11, addAccessibilityActionForState(view, C7090R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        int i12 = this.state;
        if (i12 == 3) {
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, this.fitToContents ? 4 : 6);
            return;
        }
        if (i12 == 4) {
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, this.fitToContents ? 3 : 6);
        } else {
            if (i12 != 6) {
                return;
            }
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i11;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.draggableOnNestedScroll = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i12) {
                if (i12 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:6:0x0010  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f11, float f12) {
                int i12 = 6;
                if (f12 >= 0.0f) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f12)) {
                        if ((Math.abs(f11) < Math.abs(f12) && f12 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view)) {
                            i12 = 5;
                        } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                            i12 = 3;
                        }
                    } else if (f12 == 0.0f || Math.abs(f11) > Math.abs(f12)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i13 = bottomSheetBehavior2.halfExpandedOffset;
                            if (top < i13) {
                                if (top < Math.abs(top - bottomSheetBehavior2.collapsedOffset)) {
                                    i12 = 3;
                                } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    i12 = 4;
                                }
                            } else if (Math.abs(top - i13) >= Math.abs(top - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i12 = 4;
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top - BottomSheetBehavior.this.collapsedOffset)) {
                            i12 = 3;
                        } else {
                            i12 = 4;
                        }
                    } else if (BottomSheetBehavior.this.fitToContents) {
                        i12 = 4;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i12 = 4;
                        }
                    }
                } else if (BottomSheetBehavior.this.fitToContents) {
                    i12 = 3;
                } else {
                    int top3 = view.getTop();
                    long jUptimeMillis = SystemClock.uptimeMillis() - this.viewCapturedMillis;
                    if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        if (!bottomSheetBehavior3.shouldExpandOnUpwardDrag(jUptimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.parentHeight)) {
                            i12 = 4;
                        }
                    } else if (top3 <= BottomSheetBehavior.this.halfExpandedOffset) {
                    }
                    i12 = 3;
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i12, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i12, int i13) {
                return MathUtils.clamp(i12, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                return BottomSheetBehavior.this.canBeHiddenByDragging() ? BottomSheetBehavior.this.parentHeight : BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i12, int i13, int i14, int i15) {
                BottomSheetBehavior.this.dispatchOnSlide(i13);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i12) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i13 = bottomSheetBehavior.state;
                if (i13 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i13 == 3 && bottomSheetBehavior.activePointerId == i12) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = SystemClock.uptimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }

            private boolean releasedLow(@NonNull View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i12, int i13) {
                return view.getLeft();
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(C7090R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.BottomSheetBehavior_Layout);
        int i12 = C7090R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i12);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C7090R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, C7090R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i13 = C7090R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = C7090R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        int i15 = C7090R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue != null && (i11 = typedValuePeekValue.data) == -1) {
            setPeekHeight(i11);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setDraggableOnNestedScroll(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(C7090R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i16 = C7090R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i16);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i16, 0));
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(C7090R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(@NonNull View view, float f11);

        public abstract void onStateChanged(@NonNull View view, int i11);

        public void onLayout(@NonNull View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
    }
}
