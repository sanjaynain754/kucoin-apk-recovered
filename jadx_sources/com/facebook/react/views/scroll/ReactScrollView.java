package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.react.C5771R;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.systrace.Systrace;
import java.lang.reflect.Field;
import java.util.List;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactScrollView extends ScrollView implements ReactClippingViewGroup, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, ReactOverflowViewWithInset, ReactScrollViewHelper.HasScrollState, ReactScrollViewHelper.HasStateWrapper, ReactScrollViewHelper.HasFlingAnimator, ReactScrollViewHelper.HasScrollEventThrottle, ReactScrollViewHelper.HasSmoothScroll {
    private static final int UNSET_CONTENT_OFFSET = -1;

    @Nullable
    private static Field sScrollerField;
    private static boolean sTriedToGetScrollerField;
    private final ValueAnimator DEFAULT_FLING_ANIMATOR;
    private boolean mActivelyScrolling;

    @Nullable
    private Rect mClippingRect;

    @Nullable
    private View mContentView;

    @Nullable
    private ReadableMap mCurrentContentOffset;
    private boolean mDisableIntervalMomentum;
    private boolean mDragging;

    @Nullable
    private Drawable mEndBackground;
    private int mEndFillColor;

    @Nullable
    private FpsListener mFpsListener;
    private long mLastScrollDispatchTime;

    @Nullable
    private MaintainVisibleScrollPositionHelper mMaintainVisibleContentPositionHelper;
    private final OnScrollDispatchHelper mOnScrollDispatchHelper;
    private Overflow mOverflow;
    private final Rect mOverflowInset;
    private boolean mPagingEnabled;
    private PointerEvents mPointerEvents;

    @Nullable
    private Runnable mPostTouchRunnable;
    private final ReactScrollViewHelper.ReactScrollViewScrollState mReactScrollViewScrollState;
    private boolean mRemoveClippedSubviews;
    private boolean mScrollEnabled;
    private int mScrollEventThrottle;

    @Nullable
    private String mScrollPerfTag;

    @Nullable
    private final OverScroller mScroller;
    private boolean mSendMomentumEvents;
    private int mSnapInterval;

    @Nullable
    private List<Integer> mSnapOffsets;
    private int mSnapToAlignment;
    private boolean mSnapToEnd;
    private boolean mSnapToStart;

    @Nullable
    private StateWrapper mStateWrapper;
    private final Rect mTempRect;
    private final VelocityHelper mVelocityHelper;
    private int pendingContentOffsetX;
    private int pendingContentOffsetY;

    public ReactScrollView(Context context) {
        this(context, null);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getItemStartOffset(int i11, int i12, int i13, int i14) {
        int i15;
        if (i11 == 1) {
            return i12;
        }
        if (i11 == 2) {
            i15 = (i14 - i13) / 2;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.mSnapToAlignment);
            }
            i15 = i14 - i13;
        }
        return i12 - i15;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public int getFlingExtrapolatedDistance(int i11) {
        return ReactScrollViewHelper.predictFinalScrollPosition(this, 0, i11, 0, getMaxScrollY()).y;
    }

    public void setBorderRadius(float f11) {
        setBorderRadius(f11, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.ReactScrollView$2 */
    public static /* synthetic */ class C62022 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$style$Overflow;

        static {
            int[] iArr = new int[Overflow.values().length];
            $SwitchMap$com$facebook$react$uimanager$style$Overflow = iArr;
            try {
                iArr[Overflow.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReactScrollView(Context context, @Nullable FpsListener fpsListener) {
        super(context);
        this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
        this.mVelocityHelper = new VelocityHelper();
        this.mTempRect = new Rect();
        this.mOverflowInset = new Rect();
        this.mOverflow = Overflow.SCROLL;
        this.mPagingEnabled = false;
        this.mScrollEnabled = true;
        this.mFpsListener = null;
        this.mEndFillColor = 0;
        this.mDisableIntervalMomentum = false;
        this.mSnapInterval = 0;
        this.mSnapToStart = true;
        this.mSnapToEnd = true;
        this.mSnapToAlignment = 0;
        this.mCurrentContentOffset = null;
        this.pendingContentOffsetX = -1;
        this.pendingContentOffsetY = -1;
        this.mStateWrapper = null;
        this.mReactScrollViewScrollState = new ReactScrollViewHelper.ReactScrollViewScrollState();
        this.DEFAULT_FLING_ANIMATOR = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.mPointerEvents = PointerEvents.AUTO;
        this.mLastScrollDispatchTime = 0L;
        this.mScrollEventThrottle = 0;
        this.mMaintainVisibleContentPositionHelper = null;
        this.mFpsListener = fpsListener;
        this.mScroller = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, new ReactScrollViewAccessibilityDelegate());
    }

    private void cancelPostTouchScrolling() {
        Runnable runnable = this.mPostTouchRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mPostTouchRunnable = null;
            getFlingAnimator().cancel();
        }
    }

    private int correctFlingVelocityY(int i11) {
        if (Build.VERSION.SDK_INT != 28) {
            return i11;
        }
        float fSignum = Math.signum(this.mOnScrollDispatchHelper.getYFlingVelocity());
        if (fSignum == 0.0f) {
            fSignum = Math.signum(i11);
        }
        return (int) (Math.abs(i11) * fSignum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:84:0x0198  */
    public void flingAndSnap(int i11) {
        int iFloor;
        int iMin;
        int iIntValue;
        int top;
        int top2;
        int height;
        int scrollY;
        OverScroller overScroller;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.mSnapInterval == 0 && this.mSnapOffsets == null && this.mSnapToAlignment == 0) {
            smoothScrollAndSnap(i11);
            return;
        }
        boolean z11 = getFlingAnimator() != this.DEFAULT_FLING_ANIMATOR;
        int maxScrollY = getMaxScrollY();
        int iPredictFinalScrollPosition = predictFinalScrollPosition(i11);
        if (this.mDisableIntervalMomentum) {
            iPredictFinalScrollPosition = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.mSnapOffsets;
        int i12 = 2;
        if (list != null) {
            iIntValue = list.get(0).intValue();
            List<Integer> list2 = this.mSnapOffsets;
            maxScrollY = list2.get(list2.size() - 1).intValue();
            iMin = maxScrollY;
            iFloor = 0;
            for (int i13 = 0; i13 < this.mSnapOffsets.size(); i13++) {
                int iIntValue2 = this.mSnapOffsets.get(i13).intValue();
                if (iIntValue2 <= iPredictFinalScrollPosition && iPredictFinalScrollPosition - iIntValue2 < iPredictFinalScrollPosition - iFloor) {
                    iFloor = iIntValue2;
                }
                if (iIntValue2 >= iPredictFinalScrollPosition && iIntValue2 - iPredictFinalScrollPosition < iMin - iPredictFinalScrollPosition) {
                    iMin = iIntValue2;
                }
            }
        } else {
            int i14 = this.mSnapToAlignment;
            if (i14 != 0) {
                int i15 = this.mSnapInterval;
                if (i15 > 0) {
                    double d11 = ((double) iPredictFinalScrollPosition) / ((double) i15);
                    double dFloor = Math.floor(d11);
                    int i16 = this.mSnapInterval;
                    int iMax = Math.max(getItemStartOffset(i14, (int) (dFloor * ((double) i16)), i16, height2), 0);
                    int i17 = this.mSnapToAlignment;
                    double dCeil = Math.ceil(d11);
                    int i18 = this.mSnapInterval;
                    iMin = Math.min(getItemStartOffset(i17, (int) (dCeil * ((double) i18)), i18, height2), maxScrollY);
                    iFloor = iMax;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = maxScrollY;
                    int i19 = iMin2;
                    int i21 = 0;
                    int i22 = 0;
                    int iMax2 = 0;
                    while (i21 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i21);
                        int i23 = this.mSnapToAlignment;
                        if (i23 != 1) {
                            if (i23 == i12) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else {
                                if (i23 != 3) {
                                    throw new IllegalStateException("Invalid SnapToAlignment value: " + this.mSnapToAlignment);
                                }
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top = top2 - height;
                        } else {
                            i12 = i12;
                            top = childAt.getTop();
                        }
                        if (top <= iPredictFinalScrollPosition && iPredictFinalScrollPosition - top < iPredictFinalScrollPosition - i22) {
                            i22 = top;
                        }
                        if (top >= iPredictFinalScrollPosition && top - iPredictFinalScrollPosition < i19 - iPredictFinalScrollPosition) {
                            i19 = top;
                        }
                        iMin2 = Math.min(iMin2, top);
                        iMax2 = Math.max(iMax2, top);
                        i21++;
                        i12 = i12;
                    }
                    iFloor = Math.max(i22, iMin2);
                    iMin = Math.min(i19, iMax2);
                }
                iIntValue = 0;
            } else {
                double snapInterval = getSnapInterval();
                double d12 = ((double) iPredictFinalScrollPosition) / snapInterval;
                iFloor = (int) (Math.floor(d12) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d12) * snapInterval), maxScrollY);
            }
            iIntValue = 0;
        }
        int i24 = iPredictFinalScrollPosition - iFloor;
        int i25 = iMin - iPredictFinalScrollPosition;
        int i26 = Math.abs(i24) < Math.abs(i25) ? iFloor : iMin;
        if (this.mSnapToEnd || iPredictFinalScrollPosition < maxScrollY) {
            if (!this.mSnapToStart && iPredictFinalScrollPosition <= iIntValue) {
                if (getScrollY() <= iIntValue) {
                    iIntValue = iPredictFinalScrollPosition;
                }
                scrollY = i11;
            } else if (i11 > 0) {
                scrollY = !z11 ? i11 + ((int) (((double) i25) * 10.0d)) : i11;
                iIntValue = iMin;
            } else if (i11 < 0) {
                scrollY = !z11 ? i11 - ((int) (((double) i24) * 10.0d)) : i11;
                iIntValue = iFloor;
            } else {
                scrollY = i11;
                iIntValue = i26;
            }
        } else if (getScrollY() >= maxScrollY) {
            iIntValue = iPredictFinalScrollPosition;
            scrollY = i11;
        } else {
            scrollY = i11;
            iIntValue = maxScrollY;
        }
        int iMin3 = Math.min(Math.max(0, iIntValue), maxScrollY);
        if (z11 || (overScroller = this.mScroller) == null) {
            reactSmoothScrollTo(getScrollX(), iMin3);
            return;
        }
        this.mActivelyScrolling = true;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        if (scrollY == 0) {
            scrollY = iMin3 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY2, 0, scrollY, 0, 0, iMin3, iMin3, 0, (iMin3 == 0 || iMin3 == maxScrollY) ? height2 / 2 : 0);
        postInvalidateOnAnimation();
    }

    private int getMaxScrollY() {
        View view = this.mContentView;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        if (!sTriedToGetScrollerField) {
            sTriedToGetScrollerField = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                sScrollerField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                C45999a.m101488I(ReactConstants.TAG, "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = sScrollerField;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    C45999a.m101488I(ReactConstants.TAG, "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e11);
            }
        }
        return overScroller;
    }

    private int getScrollDelta(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
    }

    private int getSnapInterval() {
        int i11 = this.mSnapInterval;
        return i11 != 0 ? i11 : getHeight();
    }

    private void handlePostTouchScrolling(int i11, int i12) {
        if (this.mPostTouchRunnable != null) {
            return;
        }
        if (this.mSendMomentumEvents) {
            enableFpsListener();
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i11, i12);
        }
        this.mActivelyScrolling = false;
        Runnable runnable = new Runnable() { // from class: com.facebook.react.views.scroll.ReactScrollView.1
            private boolean mSnappingToPage = false;
            private int mStableFrames = 0;

            @Override // java.lang.Runnable
            public void run() {
                NativeAnimatedModule nativeAnimatedModule;
                if (ReactScrollView.this.mActivelyScrolling) {
                    ReactScrollView.this.mActivelyScrolling = false;
                    this.mStableFrames = 0;
                    ViewCompat.postOnAnimationDelayed(ReactScrollView.this, this, 20L);
                    return;
                }
                ReactScrollViewHelper.updateFabricScrollState(ReactScrollView.this);
                int i13 = this.mStableFrames + 1;
                this.mStableFrames = i13;
                if (i13 < 3) {
                    if (ReactScrollView.this.mPagingEnabled && !this.mSnappingToPage) {
                        this.mSnappingToPage = true;
                        ReactScrollView.this.flingAndSnap(0);
                    }
                    ViewCompat.postOnAnimationDelayed(ReactScrollView.this, this, 20L);
                    return;
                }
                ReactScrollView.this.mPostTouchRunnable = null;
                if (ReactScrollView.this.mSendMomentumEvents) {
                    ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactScrollView.this);
                }
                ReactContext reactContext = (ReactContext) ReactScrollView.this.getContext();
                if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                    nativeAnimatedModule.userDrivenScrollEnded(ReactScrollView.this.getId());
                }
                ReactScrollView.this.disableFpsListener();
            }
        };
        this.mPostTouchRunnable = runnable;
        ViewCompat.postOnAnimationDelayed(this, runnable, 20L);
    }

    private boolean isScrollPerfLoggingEnabled() {
        String str;
        return (this.mFpsListener == null || (str = this.mScrollPerfTag) == null || str.isEmpty()) ? false : true;
    }

    private void scrollToChild(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    public void abortAnimation() {
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.mScroller.abortAnimation();
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View contentView = getContentView();
            if (this.mEndBackground != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.mEndBackground.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(Rect rect) {
        rect.set((Rect) C38115a.m86047c(this.mClippingRect));
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    @NonNull
    public ValueAnimator getFlingAnimator() {
        return this.DEFAULT_FLING_ANIMATOR;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public long getLastScrollDispatchTime() {
        return this.mLastScrollDispatchTime;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowView
    @Nullable
    public String getOverflow() {
        int i11 = C62022.$SwitchMap$com$facebook$react$uimanager$style$Overflow[this.mOverflow.ordinal()];
        if (i11 == 1) {
            return ViewProps.HIDDEN;
        }
        if (i11 == 2) {
            return ViewProps.SCROLL;
        }
        if (i11 != 3) {
            return null;
        }
        return ViewProps.VISIBLE;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    public PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollState
    public ReactScrollViewHelper.ReactScrollViewScrollState getReactScrollViewScrollState() {
        return this.mReactScrollViewScrollState;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    public boolean getScrollEnabled() {
        return this.mScrollEnabled;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public int getScrollEventThrottle() {
        return this.mScrollEventThrottle;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasStateWrapper
    @Nullable
    public StateWrapper getStateWrapper() {
        return this.mStateWrapper;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.mContentView = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.mContentView;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.mContentView = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mOverflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        if (!PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                handleInterceptedTouchEvent(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e11) {
            C45999a.m101489J(ReactConstants.TAG, "Error intercepting touch event.", e11);
        }
        return false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.mContentView == null) {
            return;
        }
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.updateScrollPosition();
        }
        if (isShown() && isContentReady()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
        ReactScrollViewHelper.emitLayoutChangeEvent(this);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        int maxScrollY;
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && this.mContentView != null && !overScroller.isFinished() && this.mScroller.getCurrY() != this.mScroller.getFinalY() && i12 >= (maxScrollY = getMaxScrollY())) {
            this.mScroller.abortAnimation();
            i12 = maxScrollY;
        }
        super.onOverScrolled(i11, i12, z11, z12);
    }

    @Override // android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        Systrace.m10662c(0L, "ReactScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i11, i12, i13, i14);
            this.mActivelyScrolling = true;
            if (this.mOnScrollDispatchHelper.onScrollChanged(i11, i12)) {
                if (this.mRemoveClippedSubviews) {
                    updateClippingRect();
                }
                ReactScrollViewHelper.updateStateOnScrollChanged(this, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity());
            }
        } finally {
            Systrace.m10667i(0L);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled || !PointerEvents.canBeTouchTarget(this.mPointerEvents)) {
            return false;
        }
        this.mVelocityHelper.calculateVelocity(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.mDragging) {
            ReactScrollViewHelper.updateFabricScrollState(this);
            float xVelocity = this.mVelocityHelper.getXVelocity();
            float yVelocity = this.mVelocityHelper.getYVelocity();
            ReactScrollViewHelper.emitScrollEndDragEvent(this, xVelocity, yVelocity);
            NativeGestureUtil.notifyNativeGestureEnded(this, motionEvent);
            this.mDragging = false;
            handlePostTouchScrolling(Math.round(xVelocity), Math.round(yVelocity));
        }
        if (actionMasked == 0) {
            cancelPostTouchScrolling();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            scrollToChild(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void setBorderRadius(float f11, int i11) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f11), LengthPercentageType.POINT));
    }

    public void setBorderStyle(@Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.mCurrentContentOffset;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.mCurrentContentOffset = readableMap;
            if (readableMap != null) {
                scrollTo((int) PixelUtil.toPixelFromDIP(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) PixelUtil.toPixelFromDIP(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
            } else {
                scrollTo(0, 0);
            }
        }
    }

    public void setDisableIntervalMomentum(boolean z11) {
        this.mDisableIntervalMomentum = z11;
    }

    public void setEndFillColor(int i11) {
        if (i11 != this.mEndFillColor) {
            this.mEndFillColor = i11;
            this.mEndBackground = new ColorDrawable(this.mEndFillColor);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public void setLastScrollDispatchTime(long j11) {
        this.mLastScrollDispatchTime = j11;
    }

    public void setMaintainVisibleContentPosition(@Nullable MaintainVisibleScrollPositionHelper.Config config) {
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper;
        if (config != null && this.mMaintainVisibleContentPositionHelper == null) {
            MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper2 = new MaintainVisibleScrollPositionHelper(this, false);
            this.mMaintainVisibleContentPositionHelper = maintainVisibleScrollPositionHelper2;
            maintainVisibleScrollPositionHelper2.start();
        } else if (config == null && (maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper) != null) {
            maintainVisibleScrollPositionHelper.stop();
            this.mMaintainVisibleContentPositionHelper = null;
        }
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper3 = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper3 != null) {
            maintainVisibleScrollPositionHelper3.setConfig(config);
        }
    }

    public void setOverflow(@Nullable String str) {
        if (str == null) {
            this.mOverflow = Overflow.SCROLL;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.SCROLL;
            }
            this.mOverflow = overflowFromString;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public void setOverflowInset(int i11, int i12, int i13, int i14) {
        this.mOverflowInset.set(i11, i12, i13, i14);
    }

    public void setPagingEnabled(boolean z11) {
        this.mPagingEnabled = z11;
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void setRemoveClippedSubviews(boolean z11) {
        if (z11 && this.mClippingRect == null) {
            this.mClippingRect = new Rect();
        }
        this.mRemoveClippedSubviews = z11;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z11) {
        this.mScrollEnabled = z11;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public void setScrollEventThrottle(int i11) {
        this.mScrollEventThrottle = i11;
    }

    public void setScrollPerfTag(@Nullable String str) {
        this.mScrollPerfTag = str;
    }

    public void setSendMomentumEvents(boolean z11) {
        this.mSendMomentumEvents = z11;
    }

    public void setSnapInterval(int i11) {
        this.mSnapInterval = i11;
    }

    public void setSnapOffsets(@Nullable List<Integer> list) {
        this.mSnapOffsets = list;
    }

    public void setSnapToAlignment(int i11) {
        this.mSnapToAlignment = i11;
    }

    public void setSnapToEnd(boolean z11) {
        this.mSnapToEnd = z11;
    }

    public void setSnapToStart(boolean z11) {
        this.mSnapToStart = z11;
    }

    public void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public void startFlingAnimator(int i11, int i12) {
        this.DEFAULT_FLING_ANIMATOR.cancel();
        int defaultScrollAnimationDuration = ReactScrollViewHelper.getDefaultScrollAnimationDuration(getContext());
        this.DEFAULT_FLING_ANIMATOR.setDuration(defaultScrollAnimationDuration).setIntValues(i11, i12);
        this.DEFAULT_FLING_ANIMATOR.start();
        if (this.mSendMomentumEvents) {
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, 0, defaultScrollAnimationDuration > 0 ? (i12 - i11) / defaultScrollAnimationDuration : 0);
            ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd(this);
        }
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            Systrace.m10662c(0L, "ReactScrollView.updateClippingRect");
            try {
                C38115a.m86047c(this.mClippingRect);
                ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
                KeyEvent.Callback contentView = getContentView();
                if (contentView instanceof ReactClippingViewGroup) {
                    ((ReactClippingViewGroup) contentView).updateClippingRect();
                }
            } finally {
                Systrace.m10667i(0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            C38115a.m86047c(this.mFpsListener);
            C38115a.m86047c(this.mScrollPerfTag);
            this.mFpsListener.disable(this.mScrollPerfTag);
        }
    }

    private void enableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            C38115a.m86047c(this.mFpsListener);
            C38115a.m86047c(this.mScrollPerfTag);
            this.mFpsListener.enable(this.mScrollPerfTag);
        }
    }

    private boolean isContentReady() {
        View contentView = getContentView();
        if (contentView != null && contentView.getWidth() != 0 && contentView.getHeight() != 0) {
            return true;
        }
        return false;
    }

    private int predictFinalScrollPosition(int i11) {
        if (getFlingAnimator() == this.DEFAULT_FLING_ANIMATOR) {
            return ReactScrollViewHelper.predictFinalScrollPosition(this, 0, i11, 0, getMaxScrollY()).y;
        }
        return ReactScrollViewHelper.getNextFlingStartValue(this, getScrollY(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().y, i11) + getFlingExtrapolatedDistance(i11);
    }

    private void recreateFlingAnimation(int i11) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && !overScroller.isFinished()) {
            int currY = this.mScroller.getCurrY();
            boolean zComputeScrollOffset = this.mScroller.computeScrollOffset();
            this.mScroller.forceFinished(true);
            if (zComputeScrollOffset) {
                this.mScroller.fling(getScrollX(), i11, 0, (int) (this.mScroller.getCurrVelocity() * Math.signum(this.mScroller.getFinalY() - this.mScroller.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
                return;
            }
            scrollTo(getScrollX(), i11 + (this.mScroller.getCurrX() - currY));
        }
    }

    private void setPendingContentOffsets(int i11, int i12) {
        if (isContentReady()) {
            this.pendingContentOffsetX = -1;
            this.pendingContentOffsetY = -1;
        } else {
            this.pendingContentOffsetX = i11;
            this.pendingContentOffsetY = i12;
        }
    }

    private void smoothScrollAndSnap(int i11) {
        double snapInterval = getSnapInterval();
        double nextFlingStartValue = ReactScrollViewHelper.getNextFlingStartValue(this, getScrollY(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().y, i11);
        double dPredictFinalScrollPosition = predictFinalScrollPosition(i11);
        double d11 = nextFlingStartValue / snapInterval;
        int iFloor = (int) Math.floor(d11);
        int iCeil = (int) Math.ceil(d11);
        int iRound = (int) Math.round(d11);
        int iRound2 = (int) Math.round(dPredictFinalScrollPosition / snapInterval);
        if (i11 > 0 && iCeil == iFloor) {
            iCeil++;
        } else if (i11 < 0 && iFloor == iCeil) {
            iFloor--;
        }
        if (i11 > 0 && iRound < iCeil && iRound2 > iFloor) {
            iRound = iCeil;
        } else if (i11 < 0 && iRound > iFloor && iRound2 < iCeil) {
            iRound = iFloor;
        }
        double d12 = ((double) iRound) * snapInterval;
        if (d12 != nextFlingStartValue) {
            this.mActivelyScrolling = true;
            reactSmoothScrollTo(getScrollX(), (int) d12);
        }
    }

    private void updateScrollAwayState(int i11) {
        getReactScrollViewScrollState().setScrollAwayPaddingTop(i11);
        ReactScrollViewHelper.forceUpdateState(this);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!this.mScrollEnabled && (keyCode == 19 || keyCode == 20)) {
            return false;
        }
        return super.executeKeyEvent(keyEvent);
    }

    public void flashScrollIndicators() {
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView
    public void fling(int i11) {
        int iCorrectFlingVelocityY = correctFlingVelocityY(i11);
        if (this.mPagingEnabled) {
            flingAndSnap(iCorrectFlingVelocityY);
        } else if (this.mScroller != null) {
            this.mScroller.fling(getScrollX(), getScrollY(), 0, iCorrectFlingVelocityY, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(iCorrectFlingVelocityY);
        }
        handlePostTouchScrolling(0, iCorrectFlingVelocityY);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    public void handleInterceptedTouchEvent(MotionEvent motionEvent) {
        NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
        ReactScrollViewHelper.emitScrollBeginDragEvent(this);
        this.mDragging = true;
        enableFpsListener();
        getFlingAnimator().cancel();
    }

    public boolean isPartiallyScrolledInView(View view) {
        int scrollDelta = getScrollDelta(view);
        view.getDrawingRect(this.mTempRect);
        if (scrollDelta != 0 && Math.abs(scrollDelta) < this.mTempRect.width()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.start();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.stop();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(C5771R.id.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (isContentReady()) {
            int scrollX = this.pendingContentOffsetX;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.pendingContentOffsetY;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        ReactScrollViewHelper.emitLayoutEvent(this);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i11, i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void reactSmoothScrollTo(int i11, int i12) {
        ReactScrollViewHelper.smoothScrollTo(this, i11, i12);
        setPendingContentOffsets(i11, i12);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i11, int i12) {
        super.scrollTo(i11, i12);
        ReactScrollViewHelper.updateFabricScrollState(this);
        setPendingContentOffsets(i11, i12);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void scrollToPreservingMomentum(int i11, int i12) {
        scrollTo(i11, i12);
        recreateFlingAnimation(i12);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i11));
    }

    public void setBorderColor(int i11, @Nullable Integer num) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i11], num);
    }

    public void setBorderWidth(int i11, float f11) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i11], Float.valueOf(PixelUtil.toDIPFromPixel(f11)));
    }

    public void setDecelerationRate(float f11) {
        getReactScrollViewScrollState().setDecelerationRate(f11);
        OverScroller overScroller = this.mScroller;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f11);
        }
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i11) {
        int childCount = getChildCount();
        boolean z11 = true;
        if (childCount > 1) {
            z11 = false;
        }
        C38115a.m86046b(z11, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).setTranslationY(i11);
            }
            setPadding(0, 0, 0, i11);
        }
        updateScrollAwayState(i11);
        setRemoveClippedSubviews(this.mRemoveClippedSubviews);
    }
}
