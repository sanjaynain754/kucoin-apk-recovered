package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.C1533R;
import androidx.core.os.BuildCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final float SCROLL_FRICTION = 0.015f;
    private static final String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final NestedScrollingChildHelper mChildHelper;
    private View mChildToScrollTo;

    @VisibleForTesting
    DifferentialMotionFlingController mDifferentialMotionFlingController;

    @VisibleForTesting
    final DifferentialMotionFlingTargetImpl mDifferentialMotionFlingTarget;

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect mEdgeGlowBottom;

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private OnScrollChangeListener mOnScrollChangeListener;
    private final NestedScrollingParentHelper mParentHelper;
    private final float mPhysicalCoeff;
    private SavedState mSavedState;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final AccessibilityDelegate ACCESSIBILITY_DELEGATE = new AccessibilityDelegate();
    private static final int[] SCROLLVIEW_STYLEABLE = {R.attr.fillViewport};

    public class DifferentialMotionFlingTargetImpl implements DifferentialMotionFlingTarget {
        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public boolean startDifferentialMotionFling(float f11) {
            if (f11 == 0.0f) {
                return false;
            }
            stopDifferentialMotionFling();
            NestedScrollView.this.fling((int) f11);
            return true;
        }

        public DifferentialMotionFlingTargetImpl() {
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public float getScaledScrollFactor() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public void stopDifferentialMotionFling() {
            NestedScrollView.this.mScroller.abortAnimation();
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface OnScrollChangeListener {
        void onScrollChange(@NonNull NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.core.widget.NestedScrollView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        };
        public int scrollPosition;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }

        @NonNull
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollPosition + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.scrollPosition);
        }
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    private void endTouchDrag() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        recycleVelocityTracker();
        stopNestedScroll(0);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private View findFocusableViewInBounds(boolean z11, int i11, int i12) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private boolean isOffScreen(View view) {
        return !isWithinDeltaOfScreen(view, 0, getHeight());
    }

    private static boolean isViewDescendantOf(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && isViewDescendantOf((View) parent, view2);
    }

    private void runAnimatedScroll(boolean z11) {
        if (z11) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.mLastScrollerY = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i11) {
        if (i11 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i11) < EdgeEffectCompat.getDistance(edgeEffect) * ((float) getHeight());
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i11, int i12, @Nullable int[] iArr, @Nullable int[] iArr2, int i13) {
        return this.mChildHelper.dispatchNestedPreScroll(i11, i12, iArr, iArr2, i13);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i11, int i12, int i13, int i14, @Nullable int[] iArr, int i15, @NonNull int[] iArr2) {
        this.mChildHelper.dispatchNestedScroll(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i11) {
        return this.mChildHelper.hasNestedScrollingParent(i11);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        dispatchNestedPreScroll(i11, i12, iArr, null, i13);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        onNestedScrollInternal(i14, i15, iArr);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i11, int i12) {
        this.mParentHelper.onNestedScrollAccepted(view, view2, i11, i12);
        startNestedScroll(2, i12);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (i11 == 2) {
            i11 = 130;
        } else if (i11 == 1) {
            i11 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i11) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i11);
        if (viewFindNextFocus == null || isOffScreen(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i11, rect);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i11, int i12) {
        return (i11 & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i11) {
        this.mParentHelper.onStopNestedScroll(view, i11);
        stopNestedScroll(i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void smoothScrollBy(int i11, int i12) {
        smoothScrollBy(i11, i12, 250, false);
    }

    public final void smoothScrollTo(int i11, int i12) {
        smoothScrollTo(i11, i12, 250, false);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i11, int i12) {
        return this.mChildHelper.startNestedScroll(i11, i12);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i11) {
        this.mChildHelper.stopNestedScroll(i11);
    }

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z11;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            accessibilityEvent.setScrollable(z11);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AccessibilityRecordCompat.setMaxScrollX(accessibilityEvent, nestedScrollView.getScrollX());
            AccessibilityRecordCompat.setMaxScrollY(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                accessibilityNodeInfoCompat.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (super.performAccessibilityAction(view, i11, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i11 != 4096) {
                if (i11 != 8192 && i11 != 16908344) {
                    if (i11 != 16908346) {
                        return false;
                    }
                } else {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.smoothScrollTo(0, iMax, true);
                    return true;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.smoothScrollTo(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static boolean getClipToPadding(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(35)
    public static final class Api35Impl {
        private Api35Impl() {
        }

        public static void setFrameContentVelocity(View view, float f11) {
            try {
                view.setFrameContentVelocity(f11);
            } catch (LinkageError unused) {
            }
        }
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C1533R.attr.nestedScrollViewStyle);
    }

    private void abortAnimatedScroll() {
        this.mScroller.abortAnimation();
        stopNestedScroll(1);
    }

    private static int clamp(int i11, int i12, int i13) {
        if (i12 >= i13 || i11 < 0) {
            return 0;
        }
        return i12 + i11 > i13 ? i13 - i12 : i11;
    }

    private void doScrollY(int i11) {
        if (i11 != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothScrollBy(0, i11);
            } else {
                scrollBy(0, i11);
            }
        }
    }

    private boolean edgeEffectFling(int i11) {
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
            if (shouldAbsorb(this.mEdgeGlowTop, i11)) {
                this.mEdgeGlowTop.onAbsorb(i11);
                return true;
            }
            fling(-i11);
            return true;
        }
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
            return false;
        }
        int i12 = -i11;
        if (shouldAbsorb(this.mEdgeGlowBottom, i12)) {
            this.mEdgeGlowBottom.onAbsorb(i12);
            return true;
        }
        fling(i12);
        return true;
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initScrollView() {
        this.mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void initializeTouchDrag(int i11, int i12) {
        this.mLastMotionY = i11;
        this.mActivePointerId = i12;
        startNestedScroll(2, 0);
    }

    private boolean isWithinDeltaOfScreen(View view, int i11, int i12) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return this.mTempRect.bottom + i11 >= getScrollY() && this.mTempRect.top - i11 <= getScrollY() + i12;
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private int scrollBy(int i11, int i12, int i13, boolean z11) {
        int i14;
        int i15;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            startNestedScroll(2, i13);
        }
        boolean z12 = false;
        if (dispatchNestedPreScroll(0, i11, this.mScrollConsumed, this.mScrollOffset, i13)) {
            int i16 = i11 - this.mScrollConsumed[1];
            i15 = this.mScrollOffset[1];
            i14 = i16;
        } else {
            i14 = i11;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z13 = canOverScroll() && !z11;
        int i17 = i14;
        boolean z14 = overScrollByCompat(0, i14, 0, scrollY, 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(i13);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i17 - scrollY2, this.mScrollOffset, i13, iArr);
        int i18 = i15 + this.mScrollOffset[1];
        int i19 = i17 - this.mScrollConsumed[1];
        int i21 = scrollY + i19;
        if (i21 < 0) {
            if (z13) {
                EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, (-i19) / getHeight(), i12 / getWidth());
                if (!this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
        } else if (i21 > scrollRange && z13) {
            EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, i19 / getHeight(), 1.0f - (i12 / getWidth()));
            if (!this.mEdgeGlowTop.isFinished()) {
                this.mEdgeGlowTop.onRelease();
            }
        }
        if (this.mEdgeGlowTop.isFinished() && this.mEdgeGlowBottom.isFinished()) {
            z12 = z14;
        } else {
            postInvalidateOnAnimation();
        }
        if (z12 && i13 == 0 && (velocityTracker = this.mVelocityTracker) != null) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            stopNestedScroll(i13);
            this.mEdgeGlowTop.onRelease();
            this.mEdgeGlowBottom.onRelease();
        }
        return i18;
    }

    private void scrollToChild(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z11;
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
            EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, 0.0f, motionEvent.getX() / getWidth());
            z11 = true;
        } else {
            z11 = false;
        }
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
            return z11;
        }
        EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.isFinished()) {
            return;
        }
        this.mScroller.computeScrollOffset();
        int currY = this.mScroller.getCurrY();
        int iConsumeFlingInVerticalStretch = consumeFlingInVerticalStretch(currY - this.mLastScrollerY);
        this.mLastScrollerY = currY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, iConsumeFlingInVerticalStretch, iArr, null, 1);
        int i11 = iConsumeFlingInVerticalStretch - this.mScrollConsumed[1];
        int scrollRange = getScrollRange();
        if (BuildCompat.isAtLeastV()) {
            Api35Impl.setFrameContentVelocity(this, Math.abs(this.mScroller.getCurrVelocity()));
        }
        if (i11 != 0) {
            int scrollY = getScrollY();
            overScrollByCompat(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.mScrollConsumed;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i12, this.mScrollOffset, 1, iArr2);
            i11 = i12 - this.mScrollConsumed[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i11 < 0) {
                    if (this.mEdgeGlowTop.isFinished()) {
                        this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
                    }
                } else if (this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
                }
            }
            abortAnimatedScroll();
        }
        if (this.mScroller.isFinished()) {
            stopNestedScroll(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.mChildHelper.dispatchNestedFling(f11, f12, z11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.mChildHelper.dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i11, int i12, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return dispatchNestedPreScroll(i11, i12, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, @Nullable int[] iArr, int i15) {
        return this.mChildHelper.dispatchNestedScroll(i11, i12, i13, i14, iArr, i15);
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        this.mTempRect.setEmpty();
        if (!canScroll()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? fullScroll(33) : arrowScroll(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? fullScroll(130) : arrowScroll(130);
            }
            if (keyCode == 62) {
                pageScroll(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return fullScroll(33);
            }
            if (keyCode == 93) {
                return fullScroll(130);
            }
            if (keyCode == 122) {
                pageScroll(33);
                return false;
            }
            if (keyCode == 123) {
                pageScroll(130);
                return false;
            }
        }
        return false;
    }

    public boolean fullScroll(int i11) {
        int childCount;
        boolean z11 = i11 == 130;
        int height = getHeight();
        Rect rect = this.mTempRect;
        rect.top = 0;
        rect.bottom = height;
        if (z11 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.mTempRect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.mTempRect;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.mTempRect;
        return scrollAndFocus(i11, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }

    @VisibleForTesting
    public float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.mVerticalScrollFactor;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean isFillViewport() {
        return this.mFillViewport;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.isNestedScrollingEnabled();
    }

    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f11, float f12, boolean z11) {
        if (z11) {
            return false;
        }
        dispatchNestedFling(0.0f, f12, true);
        fling((int) f12);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i11, int i12, @NonNull int[] iArr) {
        onNestedPreScroll(view, i11, i12, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15) {
        onNestedScrollInternal(i14, i15, null);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSavedState = savedState;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i11) {
        return onStartNestedScroll(view, view2, i11, 0);
    }

    public boolean pageScroll(int i11) {
        boolean z11 = i11 == 130;
        int height = getHeight();
        if (z11) {
            this.mTempRect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.mTempRect;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.mTempRect.top = getScrollY() - height;
            Rect rect2 = this.mTempRect;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.mTempRect;
        int i12 = rect3.top;
        int i13 = height + i12;
        rect3.bottom = i13;
        return scrollAndFocus(i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.mIsLayoutDirty) {
            this.mChildToScrollTo = view2;
        } else {
            scrollToChild(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (z11) {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public void setFillViewport(boolean z11) {
        if (z11 != this.mFillViewport) {
            this.mFillViewport = z11;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z11) {
        this.mChildHelper.setNestedScrollingEnabled(z11);
    }

    public void setOnScrollChangeListener(@Nullable OnScrollChangeListener onScrollChangeListener) {
        this.mOnScrollChangeListener = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z11) {
        this.mSmoothScrollingEnabled = z11;
    }

    public final void smoothScrollBy(int i11, int i12, int i13) {
        smoothScrollBy(i11, i12, i13, false);
    }

    public final void smoothScrollTo(int i11, int i12, int i13) {
        smoothScrollTo(i11, i12, i13, false);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i11) {
        return startNestedScroll(i11, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        DifferentialMotionFlingTargetImpl differentialMotionFlingTargetImpl = new DifferentialMotionFlingTargetImpl();
        this.mDifferentialMotionFlingTarget = differentialMotionFlingTargetImpl;
        this.mDifferentialMotionFlingController = new DifferentialMotionFlingController(getContext(), differentialMotionFlingTargetImpl);
        this.mEdgeGlowTop = EdgeEffectCompat.create(context, attributeSet);
        this.mEdgeGlowBottom = EdgeEffectCompat.create(context, attributeSet);
        this.mPhysicalCoeff = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        initScrollView();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SCROLLVIEW_STYLEABLE, i11, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.mParentHelper = new NestedScrollingParentHelper(this);
        this.mChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, ACCESSIBILITY_DELEGATE);
    }

    private boolean canOverScroll() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) {
            return true;
        }
        return false;
    }

    private boolean canScroll() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private float getSplineFlingDistance(int i11) {
        double dLog = Math.log((Math.abs(i11) * INFLEXION) / (this.mPhysicalCoeff * SCROLL_FRICTION));
        float f11 = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoeff * SCROLL_FRICTION)) * Math.exp((((double) f11) / (((double) f11) - 1.0d)) * dLog));
    }

    private boolean inChild(int i11, int i12) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i12 >= childAt.getTop() - scrollY && i12 < childAt.getBottom() - scrollY && i11 >= childAt.getLeft() && i11 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private void onNestedScrollInternal(int i11, int i12, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i11);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.mChildHelper.dispatchNestedScroll(0, scrollY2, 0, i11 - scrollY2, null, i12, iArr);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.mLastMotionY = (int) motionEvent.getY(i11);
            this.mActivePointerId = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    private int releaseVerticalGlow(int i11, float f11) {
        float fOnPullDistance;
        int iRound;
        float width = f11 / getWidth();
        float height = i11 / getHeight();
        float f12 = 0.0f;
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
            fOnPullDistance = -EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, -height, width);
            if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) {
                this.mEdgeGlowTop.onRelease();
            }
        } else {
            if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
                fOnPullDistance = EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, height, 1.0f - width);
                if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
            iRound = Math.round(f12 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        f12 = fOnPullDistance;
        iRound = Math.round(f12 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private boolean scrollAndFocus(int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int height = getHeight();
        int scrollY = getScrollY();
        int i15 = height + scrollY;
        boolean z12 = false;
        if (i11 == 33) {
            z11 = true;
        } else {
            z11 = false;
        }
        View viewFindFocusableViewInBounds = findFocusableViewInBounds(z11, i12, i13);
        if (viewFindFocusableViewInBounds == null) {
            viewFindFocusableViewInBounds = this;
        }
        if (i12 < scrollY || i13 > i15) {
            if (z11) {
                i14 = i12 - scrollY;
            } else {
                i14 = i13 - i15;
            }
            scrollBy(i14, 0, 1, true);
            z12 = true;
        }
        if (viewFindFocusableViewInBounds != findFocus()) {
            viewFindFocusableViewInBounds.requestFocus(i11);
        }
        return z12;
    }

    private boolean scrollToChildRect(Rect rect, boolean z11) {
        boolean z12;
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z11) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
                return z12;
            }
            smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
        return z12;
    }

    private void smoothScrollBy(int i11, int i12, int i13, boolean z11) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.mScroller.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i12 + scrollY, Math.max(0, height - height2))) - scrollY, i13);
            runAnimatedScroll(z11);
        } else {
            if (!this.mScroller.isFinished()) {
                abortAnimatedScroll();
            }
            scrollBy(i11, i12);
        }
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean arrowScroll(int i11) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i11);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus != null && isWithinDeltaOfScreen(viewFindNextFocus, maxScrollAmount, getHeight())) {
            viewFindNextFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.mTempRect);
            scrollBy(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect), 0, 1, true);
            viewFindNextFocus.requestFocus(i11);
        } else {
            if (i11 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i11 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i11 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            scrollBy(maxScrollAmount, 0, 1, true);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && isOffScreen(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i11;
        int i12;
        int i13;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i11 = i14 - verticalFadingEdgeLength;
        } else {
            i11 = i14;
        }
        int i15 = rect.bottom;
        if (i15 > i11 && rect.top > scrollY) {
            if (rect.height() > height) {
                i13 = rect.top - scrollY;
            } else {
                i13 = rect.bottom - i11;
            }
            return Math.min(i13, (childAt.getBottom() + layoutParams.bottomMargin) - i14);
        }
        if (rect.top >= scrollY || i15 >= i11) {
            return 0;
        }
        if (rect.height() > height) {
            i12 = 0 - (i11 - rect.bottom);
        } else {
            i12 = 0 - (scrollY - rect.top);
        }
        return Math.max(i12, -getScrollY());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > iMax) {
            return bottom + (scrollY - iMax);
        }
        return bottom;
    }

    public int consumeFlingInVerticalStretch(int i11) {
        int height = getHeight();
        if (i11 > 0 && EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
            int iRound = Math.round(((-height) / FLING_DESTRETCH_FACTOR) * EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, ((-i11) * FLING_DESTRETCH_FACTOR) / height, 0.5f));
            if (iRound != i11) {
                this.mEdgeGlowTop.finish();
            }
            return i11 - iRound;
        }
        if (i11 < 0 && EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
            float f11 = height;
            int iRound2 = Math.round((f11 / FLING_DESTRETCH_FACTOR) * EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, (i11 * FLING_DESTRETCH_FACTOR) / f11, 0.5f));
            if (iRound2 != i11) {
                this.mEdgeGlowBottom.finish();
            }
            return i11 - iRound2;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, @Nullable int[] iArr) {
        return this.mChildHelper.dispatchNestedScroll(i11, i12, i13, i14, iArr);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.mEdgeGlowTop.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (Api21Impl.getClipToPadding(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (Api21Impl.getClipToPadding(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.mEdgeGlowTop.setSize(width, height);
            if (this.mEdgeGlowTop.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (!this.mEdgeGlowBottom.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (Api21Impl.getClipToPadding(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = getPaddingLeft();
            }
            if (Api21Impl.getClipToPadding(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.mEdgeGlowBottom.setSize(width2, height2);
            if (this.mEdgeGlowBottom.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    public void fling(int i11) {
        if (getChildCount() > 0) {
            this.mScroller.fling(getScrollX(), getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            runAnimatedScroll(true);
            if (BuildCompat.isAtLeastV()) {
                Api35Impl.setFrameContentVelocity(this, Math.abs(this.mScroller.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public void measureChild(@NonNull View view, int i11, int i12) {
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsLaidOut = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        int i11;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.mIsBeingDragged) {
            if (MotionEventCompat.isFromSource(motionEvent, 2)) {
                i11 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (MotionEventCompat.isFromSource(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i11 = 26;
                axisValue = axisValue2;
            } else {
                i11 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                scrollBy(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, MotionEventCompat.isFromSource(motionEvent, 8194));
                if (i11 != 0) {
                    this.mDifferentialMotionFlingController.onMotionEvent(motionEvent, i11);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.mIsBeingDragged) {
            return true;
        }
        int i11 = action & 255;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 6) {
                            onSecondaryPointerUp(motionEvent);
                        }
                    } else {
                        this.mIsBeingDragged = false;
                        this.mActivePointerId = -1;
                        recycleVelocityTracker();
                        if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        stopNestedScroll(0);
                    }
                } else {
                    int i12 = this.mActivePointerId;
                    if (i12 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                        if (iFindPointerIndex == -1) {
                            Log.e(TAG, "Invalid pointerId=" + i12 + " in onInterceptTouchEvent");
                        } else {
                            int y11 = (int) motionEvent.getY(iFindPointerIndex);
                            if (Math.abs(y11 - this.mLastMotionY) > this.mTouchSlop && (2 & getNestedScrollAxes()) == 0) {
                                this.mIsBeingDragged = true;
                                this.mLastMotionY = y11;
                                initVelocityTrackerIfNotExists();
                                this.mVelocityTracker.addMovement(motionEvent);
                                this.mNestedYOffset = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            } else {
                this.mIsBeingDragged = false;
                this.mActivePointerId = -1;
                recycleVelocityTracker();
                if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                stopNestedScroll(0);
            }
        } else {
            int y12 = (int) motionEvent.getY();
            if (!inChild((int) motionEvent.getX(), y12)) {
                if (!stopGlowAnimations(motionEvent) && this.mScroller.isFinished()) {
                    z11 = false;
                }
                this.mIsBeingDragged = z11;
                recycleVelocityTracker();
            } else {
                this.mLastMotionY = y12;
                this.mActivePointerId = motionEvent.getPointerId(0);
                initOrResetVelocityTracker();
                this.mVelocityTracker.addMovement(motionEvent);
                this.mScroller.computeScrollOffset();
                if (!stopGlowAnimations(motionEvent) && this.mScroller.isFinished()) {
                    z11 = false;
                }
                this.mIsBeingDragged = z11;
                startNestedScroll(2, 0);
            }
        }
        return this.mIsBeingDragged;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int measuredHeight = 0;
        this.mIsLayoutDirty = false;
        View view = this.mChildToScrollTo;
        if (view != null && isViewDescendantOf(view, this)) {
            scrollToChild(this.mChildToScrollTo);
        }
        this.mChildToScrollTo = null;
        if (!this.mIsLaidOut) {
            if (this.mSavedState != null) {
                scrollTo(getScrollX(), this.mSavedState.scrollPosition);
                this.mSavedState = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iClamp = clamp(scrollY, paddingTop, measuredHeight);
            if (iClamp != scrollY) {
                scrollTo(getScrollX(), iClamp);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.mIsLaidOut = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.mFillViewport && View.MeasureSpec.getMode(i12) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14) {
        onNestedScrollInternal(i14, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i11) {
        onNestedScrollAccepted(view, view2, i11, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        super.scrollTo(i11, i12);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        OnScrollChangeListener onScrollChangeListener = this.mOnScrollChangeListener;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        View viewFindFocus = findFocus();
        if (viewFindFocus != null && this != viewFindFocus && isWithinDeltaOfScreen(viewFindFocus, 0, i14)) {
            viewFindFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(viewFindFocus, this.mTempRect);
            doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        initVelocityTrackerIfNotExists();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.mNestedYOffset);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onSecondaryPointerUp(motionEvent);
                                this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionY = (int) motionEvent.getY(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.mIsBeingDragged && getChildCount() > 0 && this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        endTouchDrag();
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (iFindPointerIndex == -1) {
                        Log.e(TAG, "Invalid pointerId=" + this.mActivePointerId + " in onTouchEvent");
                    } else {
                        int y11 = (int) motionEvent.getY(iFindPointerIndex);
                        int i11 = this.mLastMotionY - y11;
                        int iReleaseVerticalGlow = i11 - releaseVerticalGlow(i11, motionEvent.getX(iFindPointerIndex));
                        if (!this.mIsBeingDragged && Math.abs(iReleaseVerticalGlow) > this.mTouchSlop) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.mIsBeingDragged = true;
                            iReleaseVerticalGlow = iReleaseVerticalGlow > 0 ? iReleaseVerticalGlow - this.mTouchSlop : iReleaseVerticalGlow + this.mTouchSlop;
                        }
                        if (this.mIsBeingDragged) {
                            int iScrollBy = scrollBy(iReleaseVerticalGlow, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.mLastMotionY = y11 - iScrollBy;
                            this.mNestedYOffset += iScrollBy;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int yVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
                if (Math.abs(yVelocity) >= this.mMinimumVelocity) {
                    if (!edgeEffectFling(yVelocity)) {
                        int i12 = -yVelocity;
                        float f11 = i12;
                        if (!dispatchNestedPreFling(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            fling(i12);
                        }
                    }
                } else if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                endTouchDrag();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.mIsBeingDragged && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.mScroller.isFinished()) {
                abortAnimatedScroll();
            }
            initializeTouchDrag((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean overScrollByCompat(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i19;
        int i21;
        boolean z16;
        boolean z17;
        int i22;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z12)) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z13)) {
            z15 = false;
        } else {
            z15 = true;
        }
        int i23 = i13 + i11;
        if (!z14) {
            i19 = 0;
        } else {
            i19 = i17;
        }
        int i24 = i14 + i12;
        if (!z15) {
            i21 = 0;
        } else {
            i21 = i18;
        }
        int i25 = -i19;
        int i26 = i19 + i15;
        int i27 = -i21;
        int i28 = i21 + i16;
        if (i23 > i26) {
            i23 = i26;
            z16 = true;
        } else if (i23 < i25) {
            z16 = true;
            i23 = i25;
        } else {
            z16 = false;
        }
        if (i24 > i28) {
            i24 = i28;
            z17 = true;
        } else if (i24 < i27) {
            z17 = true;
            i24 = i27;
        } else {
            z17 = false;
        }
        if (z17 && !hasNestedScrollingParent(1)) {
            int i29 = i23;
            this.mScroller.springBack(i29, i24, 0, 0, 0, getScrollRange());
            i22 = i29;
        } else {
            i22 = i23;
        }
        onOverScrolled(i22, i24, z16, z17);
        if (!z16 && !z17) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z11) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return scrollToChildRect(rect, z11);
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iClamp = clamp(i11, width, width2);
            int iClamp2 = clamp(i12, height, height2);
            if (iClamp != getScrollX() || iClamp2 != getScrollY()) {
                super.scrollTo(iClamp, iClamp2);
            }
        }
    }

    public void smoothScrollTo(int i11, int i12, boolean z11) {
        smoothScrollTo(i11, i12, 250, z11);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        if (getChildCount() <= 0) {
            super.addView(view, i11);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void smoothScrollTo(int i11, int i12, int i13, boolean z11) {
        smoothScrollBy(i11 - getScrollX(), i12 - getScrollY(), i13, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i11, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
