package com.google.android.material.sidesheet;

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
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.tencent.bugly.proguard.C33978va;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = C7090R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;

    @Nullable
    private ColorStateList backgroundTint;

    @NonNull
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;

    @IdRes
    private int coplanarSiblingViewId;

    @Nullable
    private WeakReference<View> coplanarSiblingViewRef;
    private final ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;

    @Nullable
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;

    @Nullable
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    private ViewDragHelper viewDragHelper;

    @Nullable
    private WeakReference<V> viewRef;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
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
        final int state;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = ((SideSheetBehavior) sideSheetBehavior).state;
        }
    }

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.StateSettlingTracker.m13175a(this.f11913b);
            }
        };
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13175a(StateSettlingTracker stateSettlingTracker) {
            stateSettlingTracker.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.this.viewDragHelper != null && SideSheetBehavior.this.viewDragHelper.continueSettling(true)) {
                stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
            } else if (SideSheetBehavior.this.state == 2) {
                SideSheetBehavior.this.setStateInternal(stateSettlingTracker.targetState);
            }
        }

        public StateSettlingTracker() {
        }

        public void continueSettlingToState(int i11) {
            if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i11;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            ((View) SideSheetBehavior.this.viewRef.get()).postOnAnimation(this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i11) {
                if (i11 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
                return MathUtils.clamp(i11, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(@NonNull View view) {
                return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i11);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f11, float f12) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f11, f12);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i11) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
                return view.getTop();
            }
        };
    }

    private float calculateDragDistance(float f11, float f12) {
        return Math.abs(f11 - f12);
    }

    private void replaceAccessibilityActionForState(V v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i11) {
        ViewCompat.replaceAccessibilityAction(v11, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i11));
    }

    private void setSheetEdge(@NonNull V v11, int i11) {
        setSheetEdge(Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) v11.getLayoutParams()).gravity, i11) == 3 ? 1 : 0);
    }

    public void expand() {
        setState(3);
    }

    public int getOuterEdgeOffsetForState(int i11) {
        if (i11 == 3) {
            return getExpandedOffset();
        }
        if (i11 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i11);
    }

    public void hide() {
        setState(5);
    }

    public void setCoplanarSiblingView(@Nullable View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v11 = weakReference.get();
            if (v11.isLaidOut()) {
                v11.requestLayout();
            }
        }
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i11) {
        if (i11 == 1 || i11 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i11 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i11);
        } else {
            runAfterLayout(this.viewRef.get(), new Runnable() { // from class: com.google.android.material.sidesheet.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.m13173b(this.f11905b, i11);
                }
            });
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13173b(SideSheetBehavior sideSheetBehavior, int i11) {
        V v11 = sideSheetBehavior.viewRef.get();
        if (v11 != null) {
            sideSheetBehavior.startSettling(v11, i11, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13174c(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i11, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, AnimationUtils.lerp(i11, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private int calculateCurrentOffset(int i11, V v11) {
        int i12 = this.state;
        if (i12 == 1 || i12 == 2) {
            return i11 - this.sheetDelegate.getOuterEdge(v11);
        }
        if (i12 == 3) {
            return 0;
        }
        if (i12 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalStateException("Unexpected value: " + this.state);
    }

    private void clearCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i11) {
        return new AccessibilityViewCommand() { // from class: com.google.android.material.sidesheet.c
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return SideSheetBehavior.m13172a(this.f11907a, i11, view, commandArguments);
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(@NonNull View view, int i11) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i11);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSlide(view, fCalculateSlideOffset);
        }
    }

    @GravityInt
    private int getGravityFromSheetEdge() {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        return (sheetDelegate == null || sheetDelegate.getSheetEdge() == 0) ? 5 : 3;
    }

    @Nullable
    private CoordinatorLayout.LayoutParams getViewLayoutParams() {
        V v11;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v11 = weakReference.get()) == null || !(v11.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        return (CoordinatorLayout.LayoutParams) v11.getLayoutParams();
    }

    private boolean isExpandingOutwards(float f11) {
        return this.sheetDelegate.isExpandingOutwards(f11);
    }

    private void maybeAssignCoplanarSiblingViewBasedId(@NonNull CoordinatorLayout coordinatorLayout) {
        int i11;
        View viewFindViewById;
        if (this.coplanarSiblingViewRef != null || (i11 = this.coplanarSiblingViewId) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i11)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(viewFindViewById);
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private void updateAccessibilityActions() {
        V v11;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v11, 262144);
        ViewCompat.removeAccessibilityAction(v11, 1048576);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v11 = this.viewRef.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((this.childWidth * v11.getScaleX()) + this.innerMargin));
        coplanarSiblingView.requestLayout();
    }

    private void updateMaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void updateSheetVisibility(@NonNull View view) {
        int i11 = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    @Nullable
    @VisibleForTesting
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public int getChildWidth() {
        return this.childWidth;
    }

    @Nullable
    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public float getHideThreshold() {
        return 0.5f;
    }

    public int getInnerMargin() {
        return this.innerMargin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    public int getParentWidth() {
        return this.parentWidth;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    @Nullable
    public ViewDragHelper getViewDragHelper() {
        return this.viewDragHelper;
    }

    public float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompatOnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (backEventCompatOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
        } else {
            this.sideContainerBackHelper.finishBackProgress(backEventCompatOnHandleBackInvoked, getGravityFromSheetEdge(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SideSheetBehavior.this.setStateInternal(5);
                    if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                        return;
                    }
                    ((View) SideSheetBehavior.this.viewRef.get()).requestLayout();
                }
            }, getCoplanarFinishAnimatorUpdateListener());
        }
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v11, savedState.getSuperState());
        }
        int i11 = savedState.state;
        if (i11 == 1 || i11 == 2) {
            i11 = 5;
        }
        this.state = i11;
        this.lastStableState = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v11), (SideSheetBehavior<?>) this);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    public void setCoplanarSiblingViewId(@IdRes int i11) {
        this.coplanarSiblingViewId = i11;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v11 = weakReference.get();
            if (i11 == -1 || !v11.isLaidOut()) {
                return;
            }
            v11.requestLayout();
        }
    }

    public void setDraggable(boolean z11) {
        this.draggable = z11;
    }

    public void setHideFriction(float f11) {
        this.hideFriction = f11;
    }

    public void setStateInternal(int i11) {
        V v11;
        if (this.state == i11) {
            return;
        }
        this.state = i11;
        if (i11 == 3 || i11 == 5) {
            this.lastStableState = i11;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(v11);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v11, i11);
        }
        updateAccessibilityActions();
    }

    public boolean shouldHide(@NonNull View view, float f11) {
        return this.sheetDelegate.shouldHide(view, f11);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(backEventCompat, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m13172a(SideSheetBehavior sideSheetBehavior, int i11, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        sideSheetBehavior.setState(i11);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(@NonNull View view, float f11, float f12) {
        if (isExpandingOutwards(f11)) {
            return 3;
        }
        if (shouldHide(view, f11)) {
            if (!this.sheetDelegate.isSwipeSignificant(f11, f12) && !this.sheetDelegate.isReleasedCloseToInnerEdge(view)) {
                return 3;
            }
            return 5;
        }
        if (f11 != 0.0f && SheetUtils.isSwipeMostlyHorizontal(f11, f12)) {
            return 5;
        }
        int left = view.getLeft();
        if (Math.abs(left - getExpandedOffset()) < Math.abs(left - this.sheetDelegate.getHiddenOffset())) {
            return 3;
        }
        return 5;
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
            ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> from(@NonNull V v11) {
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof SideSheetBehavior) {
                return (SideSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
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

    @Nullable
    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int coplanarSiblingAdjacentMargin = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.m13174c(this.f11909b, marginLayoutParams, coplanarSiblingAdjacentMargin, coplanarSiblingView, valueAnimator);
            }
        };
    }

    private boolean hasLeftMargin() {
        CoordinatorLayout.LayoutParams viewLayoutParams = getViewLayoutParams();
        if (viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin > 0) {
            return true;
        }
        return false;
    }

    private boolean hasRightMargin() {
        CoordinatorLayout.LayoutParams viewLayoutParams = getViewLayoutParams();
        if (viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin > 0) {
            return true;
        }
        return false;
    }

    private boolean isDraggedFarEnough(@NonNull MotionEvent motionEvent) {
        if (!shouldHandleDraggingWithHelper() || calculateDragDistance(this.initialX, motionEvent.getX()) <= this.viewDragHelper.getTouchSlop()) {
            return false;
        }
        return true;
    }

    private boolean isLayingOut(@NonNull V v11) {
        ViewParent parent = v11.getParent();
        if (parent != null && parent.isLayoutRequested() && v11.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    private boolean isSettling(View view, int i11, boolean z11) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i11);
        ViewDragHelper viewDragHelper = getViewDragHelper();
        if (viewDragHelper != null) {
            if (z11) {
                if (viewDragHelper.settleCapturedViewAt(outerEdgeOffsetForState, view.getTop())) {
                    return true;
                }
                return false;
            }
            if (viewDragHelper.smoothSlideViewTo(view, outerEdgeOffsetForState, view.getTop())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void runAfterLayout(@NonNull V v11, Runnable runnable) {
        if (isLayingOut(v11)) {
            v11.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean shouldInterceptTouchEvent(@NonNull V v11) {
        if ((v11.isShown() || ViewCompat.getAccessibilityPaneTitle(v11) != null) && this.draggable) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i11, boolean z11) {
        if (isSettling(view, i11, z11)) {
            setStateInternal(2);
            this.stateSettlingTracker.continueSettlingToState(i11);
        } else {
            setStateInternal(i11);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!shouldInterceptTouchEvent(v11)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        } else {
            this.initialX = (int) motionEvent.getX();
        }
        if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        int iCalculateInnerMargin;
        if (coordinatorLayout.getFitsSystemWindows() && !v11.getFitsSystemWindows()) {
            v11.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(v11);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(v11);
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
            updateSheetVisibility(v11);
            updateAccessibilityActions();
            if (v11.getImportantForAccessibility() == 0) {
                v11.setImportantForAccessibility(1);
            }
            ensureAccessibilityPaneTitleIsSet(v11);
        }
        setSheetEdge(v11, i11);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(v11);
        coordinatorLayout.onLayoutChild(v11, i11);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(coordinatorLayout);
        this.childWidth = v11.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        if (marginLayoutParams != null) {
            iCalculateInnerMargin = this.sheetDelegate.calculateInnerMargin(marginLayoutParams);
        } else {
            iCalculateInnerMargin = 0;
        }
        this.innerMargin = iCalculateInnerMargin;
        ViewCompat.offsetLeftAndRight(v11, calculateCurrentOffset(outerEdge, v11));
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        for (SideSheetCallback sideSheetCallback : this.callbacks) {
            if (sideSheetCallback instanceof SideSheetCallback) {
                sideSheetCallback.onLayout(v11);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        v11.measure(getChildMeasureSpec(i11, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, -1, marginLayoutParams.width), getChildMeasureSpec(i13, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, -1, marginLayoutParams.height));
        return true;
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
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.captureChildView(v11, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    private void setSheetEdge(int i11) {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i11) {
            if (i11 == 0) {
                this.sheetDelegate = new RightSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i11 == 1) {
                this.sheetDelegate = new LeftSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                updateMaterialShapeDrawable(builder2.build());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i11 + ". Must be 0 or 1" + C33978va.f72339h);
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i11) {
                if (i11 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
                return MathUtils.clamp(i11, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(@NonNull View view) {
                return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i11);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f11, float f12) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f11, f12);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i11) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
                return view.getTop();
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.SideSheetBehavior_Layout);
        int i11 = C7090R.styleable.SideSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C7090R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        int i12 = C7090R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(i12, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
