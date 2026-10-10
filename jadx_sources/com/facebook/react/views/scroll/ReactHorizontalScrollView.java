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
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
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
import java.util.ArrayList;
import java.util.List;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactHorizontalScrollView extends HorizontalScrollView implements ReactClippingViewGroup, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, ReactOverflowViewWithInset, ReactScrollViewHelper.HasScrollState, ReactScrollViewHelper.HasStateWrapper, ReactScrollViewHelper.HasFlingAnimator, ReactScrollViewHelper.HasScrollEventThrottle, ReactScrollViewHelper.HasSmoothScroll {
    private static boolean DEBUG_MODE = false;
    private static int NO_SCROLL_POSITION = Integer.MIN_VALUE;
    private static String TAG = "ReactHorizontalScrollView";
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
    private boolean mPagedArrowScrolling;
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
    private int mScrollXAfterMeasure;

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

    public ReactHorizontalScrollView(Context context) {
        this(context, null);
    }

    @Nullable
    private static HorizontalScrollView findDeepestScrollViewForMotionEvent(View view, MotionEvent motionEvent) {
        return findDeepestScrollViewForMotionEvent(view, motionEvent, true);
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

    public void setBorderRadius(float f11) {
        setBorderRadius(f11, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.ReactHorizontalScrollView$2 */
    public static /* synthetic */ class C62002 {
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

    public ReactHorizontalScrollView(Context context, @Nullable FpsListener fpsListener) {
        super(context);
        this.mScrollXAfterMeasure = NO_SCROLL_POSITION;
        this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
        this.mVelocityHelper = new VelocityHelper();
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
        this.mPagedArrowScrolling = false;
        this.pendingContentOffsetX = -1;
        this.pendingContentOffsetY = -1;
        this.mStateWrapper = null;
        this.DEFAULT_FLING_ANIMATOR = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.mPointerEvents = PointerEvents.AUTO;
        this.mLastScrollDispatchTime = 0L;
        this.mScrollEventThrottle = 0;
        this.mTempRect = new Rect();
        this.mFpsListener = fpsListener;
        ViewCompat.setAccessibilityDelegate(this, new ReactScrollViewAccessibilityDelegate());
        this.mScroller = getOverScrollerFromParent();
        this.mReactScrollViewScrollState = new ReactScrollViewHelper.ReactScrollViewScrollState();
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
    }

    private void cancelPostTouchScrolling() {
        Runnable runnable = this.mPostTouchRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mPostTouchRunnable = null;
            getFlingAnimator().cancel();
        }
    }

    @Nullable
    private static HorizontalScrollView findDeepestScrollViewForMotionEvent(View view, MotionEvent motionEvent, boolean z11) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z11 && (view instanceof HorizontalScrollView) && ViewCompat.isNestedScrollingEnabled(view) && (view instanceof ReactHorizontalScrollView) && ((ReactHorizontalScrollView) view).mScrollEnabled) {
            return (HorizontalScrollView) view;
        }
        if (view instanceof ViewGroup) {
            int i11 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i11 >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView horizontalScrollViewFindDeepestScrollViewForMotionEvent = findDeepestScrollViewForMotionEvent(viewGroup.getChildAt(i11), motionEvent, false);
                if (horizontalScrollViewFindDeepestScrollViewForMotionEvent != null) {
                    return horizontalScrollViewFindDeepestScrollViewForMotionEvent;
                }
                i11++;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flingAndSnap(int i11) {
        int scrollX;
        int iMin;
        int iMax;
        int iIntValue;
        OverScroller overScroller;
        if (DEBUG_MODE) {
            C45999a.m101514t(TAG, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.mSnapInterval == 0 && this.mSnapOffsets == null && this.mSnapToAlignment == 0) {
            smoothScrollAndSnap(i11);
            return;
        }
        boolean z11 = getFlingAnimator() != this.DEFAULT_FLING_ANIMATOR;
        int iMax2 = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iPredictFinalScrollPosition = predictFinalScrollPosition(i11);
        if (this.mDisableIntervalMomentum) {
            iPredictFinalScrollPosition = getScrollX();
        }
        int width = (getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this);
        if (getLayoutDirection() == 1) {
            iPredictFinalScrollPosition = iMax2 - iPredictFinalScrollPosition;
            scrollX = -i11;
        } else {
            scrollX = i11;
        }
        List<Integer> list = this.mSnapOffsets;
        if (list == null || list.isEmpty()) {
            int i12 = this.mSnapToAlignment;
            if (i12 != 0) {
                int i13 = this.mSnapInterval;
                if (i13 > 0) {
                    double d11 = ((double) iPredictFinalScrollPosition) / ((double) i13);
                    double dFloor = Math.floor(d11);
                    int i14 = this.mSnapInterval;
                    int iMax3 = Math.max(getItemStartOffset(i12, (int) (dFloor * ((double) i14)), i14, width), 0);
                    int i15 = this.mSnapToAlignment;
                    double dCeil = Math.ceil(d11);
                    int i16 = this.mSnapInterval;
                    iMin = Math.min(getItemStartOffset(i15, (int) (dCeil * ((double) i16)), i16, width), iMax2);
                    iMax2 = iMax2;
                    iMax = iMax3;
                    iIntValue = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = iMax2;
                    int i17 = iMin2;
                    int i18 = 0;
                    int iMax4 = 0;
                    for (int i19 = 0; i19 < viewGroup.getChildCount(); i19++) {
                        View childAt = viewGroup.getChildAt(i19);
                        int itemStartOffset = getItemStartOffset(this.mSnapToAlignment, childAt.getLeft(), childAt.getWidth(), width);
                        if (itemStartOffset <= iPredictFinalScrollPosition && iPredictFinalScrollPosition - itemStartOffset < iPredictFinalScrollPosition - i18) {
                            i18 = itemStartOffset;
                        }
                        if (itemStartOffset >= iPredictFinalScrollPosition && itemStartOffset - iPredictFinalScrollPosition < i17 - iPredictFinalScrollPosition) {
                            i17 = itemStartOffset;
                        }
                        iMin2 = Math.min(iMin2, itemStartOffset);
                        iMax4 = Math.max(iMax4, itemStartOffset);
                    }
                    iMax = Math.max(i18, iMin2);
                    iMin = Math.min(i17, iMax4);
                }
            } else {
                double snapInterval = getSnapInterval();
                double d12 = ((double) iPredictFinalScrollPosition) / snapInterval;
                int iFloor = (int) (Math.floor(d12) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d12) * snapInterval), iMax2);
                iMax = iFloor;
            }
            iIntValue = 0;
        } else {
            iIntValue = this.mSnapOffsets.get(0).intValue();
            List<Integer> list2 = this.mSnapOffsets;
            iMax2 = list2.get(list2.size() - 1).intValue();
            iMin = iMax2;
            iMax = 0;
            for (int i21 = 0; i21 < this.mSnapOffsets.size(); i21++) {
                int iIntValue2 = this.mSnapOffsets.get(i21).intValue();
                if (iIntValue2 <= iPredictFinalScrollPosition && iPredictFinalScrollPosition - iIntValue2 < iPredictFinalScrollPosition - iMax) {
                    iMax = iIntValue2;
                }
                if (iIntValue2 >= iPredictFinalScrollPosition && iIntValue2 - iPredictFinalScrollPosition < iMin - iPredictFinalScrollPosition) {
                    iMin = iIntValue2;
                }
            }
        }
        int i22 = iPredictFinalScrollPosition - iMax;
        int i23 = iMin - iPredictFinalScrollPosition;
        int i24 = Math.abs(i22) < Math.abs(i23) ? iMax : iMin;
        int scrollX2 = getScrollX();
        if (getLayoutDirection() == 1) {
            scrollX2 = iMax2 - scrollX2;
        }
        if (this.mSnapToEnd || iPredictFinalScrollPosition < iMax2) {
            if (this.mSnapToStart || iPredictFinalScrollPosition > iIntValue) {
                if (scrollX > 0) {
                    if (!z11) {
                        scrollX += (int) (((double) i23) * 10.0d);
                    }
                    iPredictFinalScrollPosition = iMin;
                } else if (scrollX < 0) {
                    if (!z11) {
                        scrollX -= (int) (((double) i22) * 10.0d);
                    }
                    iPredictFinalScrollPosition = iMax;
                } else {
                    iPredictFinalScrollPosition = i24;
                }
            } else if (scrollX2 > iIntValue) {
                iPredictFinalScrollPosition = iIntValue;
            }
        } else if (scrollX2 < iMax2) {
            iPredictFinalScrollPosition = iMax2;
        }
        int iMin3 = Math.min(Math.max(0, iPredictFinalScrollPosition), iMax2);
        if (getLayoutDirection() == 1) {
            iMin3 = iMax2 - iMin3;
            scrollX = -scrollX;
        }
        int i25 = iMin3;
        if (z11 || (overScroller = this.mScroller) == null) {
            reactSmoothScrollTo(i25, getScrollY());
            return;
        }
        this.mActivelyScrolling = true;
        int scrollX3 = getScrollX();
        int scrollY = getScrollY();
        if (scrollX == 0) {
            scrollX = i25 - getScrollX();
        }
        overScroller.fling(scrollX3, scrollY, scrollX, 0, i25, i25, 0, 0, (i25 == 0 || i25 == iMax2) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        if (!sTriedToGetScrollerField) {
            sTriedToGetScrollerField = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                sScrollerField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                C45999a.m101488I(TAG, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
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
                    C45999a.m101488I(TAG, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e11);
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
        return i11 != 0 ? i11 : getWidth();
    }

    private void handlePostTouchScrolling(int i11, int i12) {
        if (DEBUG_MODE) {
            C45999a.m101515u(TAG, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        if (this.mPostTouchRunnable != null) {
            return;
        }
        if (this.mSendMomentumEvents) {
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i11, i12);
        }
        this.mActivelyScrolling = false;
        Runnable runnable = new Runnable() { // from class: com.facebook.react.views.scroll.ReactHorizontalScrollView.1
            private boolean mSnappingToPage = false;
            private int mStableFrames = 0;

            @Override // java.lang.Runnable
            public void run() {
                NativeAnimatedModule nativeAnimatedModule;
                if (ReactHorizontalScrollView.this.mActivelyScrolling) {
                    ReactHorizontalScrollView.this.mActivelyScrolling = false;
                    this.mStableFrames = 0;
                    ViewCompat.postOnAnimationDelayed(ReactHorizontalScrollView.this, this, 20L);
                    return;
                }
                ReactScrollViewHelper.updateFabricScrollState(ReactHorizontalScrollView.this);
                int i13 = this.mStableFrames + 1;
                this.mStableFrames = i13;
                if (i13 < 3) {
                    if (ReactHorizontalScrollView.this.mPagingEnabled && !this.mSnappingToPage) {
                        this.mSnappingToPage = true;
                        ReactHorizontalScrollView.this.flingAndSnap(0);
                    }
                    ViewCompat.postOnAnimationDelayed(ReactHorizontalScrollView.this, this, 20L);
                    return;
                }
                ReactHorizontalScrollView.this.mPostTouchRunnable = null;
                if (ReactHorizontalScrollView.this.mSendMomentumEvents) {
                    ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactHorizontalScrollView.this);
                }
                ReactContext reactContext = (ReactContext) ReactHorizontalScrollView.this.getContext();
                if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                    nativeAnimatedModule.userDrivenScrollEnded(ReactHorizontalScrollView.this.getId());
                }
                ReactHorizontalScrollView.this.disableFpsListener();
            }
        };
        this.mPostTouchRunnable = runnable;
        ViewCompat.postOnAnimationDelayed(this, runnable, 20L);
    }

    private boolean isScrollPerfLoggingEnabled() {
        String str;
        return (this.mFpsListener == null || (str = this.mScrollPerfTag) == null || str.isEmpty()) ? false : true;
    }

    private void setPendingContentOffsets(int i11, int i12) {
        if (DEBUG_MODE) {
            C45999a.m101515u(TAG, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        if (isContentReady()) {
            this.pendingContentOffsetX = -1;
            this.pendingContentOffsetY = -1;
        } else {
            this.pendingContentOffsetX = i11;
            this.pendingContentOffsetY = i12;
        }
    }

    private void smoothScrollAndSnap(int i11) {
        if (DEBUG_MODE) {
            C45999a.m101514t(TAG, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        double snapInterval = getSnapInterval();
        double nextFlingStartValue = ReactScrollViewHelper.getNextFlingStartValue(this, getScrollX(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().x, i11);
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
            reactSmoothScrollTo((int) d12, getScrollY());
        }
    }

    private void smoothScrollToNextPage(int i11) {
        if (DEBUG_MODE) {
            C45999a.m101514t(TAG, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i12 = scrollX / width;
        if (scrollX % width != 0) {
            i12++;
        }
        int i13 = i11 == 17 ? i12 - 1 : i12 + 1;
        if (i13 < 0) {
            i13 = 0;
        }
        reactSmoothScrollTo(i13 * width, getScrollY());
        handlePostTouchScrolling(0, 0);
    }

    public void abortAnimation() {
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.mScroller.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        if (!this.mPagingEnabled || this.mPagedArrowScrolling) {
            super.addFocusables(arrayList, i11, i12);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i11, i12);
        for (View view : arrayList2) {
            if (isScrolledInView(view) || isPartiallyScrolledInView(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i11) {
        if (!this.mPagingEnabled) {
            return super.arrowScroll(i11);
        }
        boolean z11 = true;
        this.mPagedArrowScrolling = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i11);
            View contentView = getContentView();
            if (contentView == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != contentView) {
                smoothScrollToNextPage(i11);
            } else {
                if (!isScrolledInView(viewFindNextFocus) && !isMostlyScrolledInView(viewFindNextFocus)) {
                    smoothScrollToNextPage(i11);
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z11 = false;
        }
        this.mPagedArrowScrolling = false;
        return z11;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        return this.mScrollEnabled && super.canScrollHorizontally(i11);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View contentView = getContentView();
            if (this.mEndBackground != null && contentView != null && contentView.getRight() < getWidth()) {
                this.mEndBackground.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i11) {
        if (DEBUG_MODE) {
            C45999a.m101514t(TAG, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        if (Build.VERSION.SDK_INT == 28) {
            i11 = (int) (Math.abs(i11) * Math.signum(this.mOnScrollDispatchHelper.getXFlingVelocity()));
        }
        int i12 = i11;
        if (this.mPagingEnabled) {
            flingAndSnap(i12);
        } else if (this.mScroller != null) {
            this.mScroller.fling(getScrollX(), getScrollY(), i12, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this)) / 2, 0);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(i12);
        }
        handlePostTouchScrolling(i12, 0);
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(Rect rect) {
        rect.set((Rect) C38115a.m86047c(this.mClippingRect));
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
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
        int i11 = C62002.$SwitchMap$com$facebook$react$uimanager$style$Overflow[this.mOverflow.ordinal()];
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
    @Nullable
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.mContentView;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.mContentView = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mOverflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        if (motionEvent.getAction() == 0 && findDeepestScrollViewForMotionEvent(this, motionEvent) != null) {
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        OverScroller overScroller;
        if (DEBUG_MODE) {
            C45999a.m101516v(TAG, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        int i15 = this.mScrollXAfterMeasure;
        if (i15 != NO_SCROLL_POSITION && (overScroller = this.mScroller) != null && i15 != overScroller.getFinalX() && !this.mScroller.isFinished()) {
            if (DEBUG_MODE) {
                C45999a.m101514t(TAG, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.mScrollXAfterMeasure));
            }
            OverScroller overScroller2 = this.mScroller;
            overScroller2.startScroll(this.mScrollXAfterMeasure, overScroller2.getFinalY(), 0, 0);
            this.mScroller.forceFinished(true);
            this.mScrollXAfterMeasure = NO_SCROLL_POSITION;
        }
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

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.mContentView == null) {
            return;
        }
        if (view.getLayoutDirection() == 1) {
            adjustPositionForContentChangeRTL(i11, i13, i15, i17);
        } else {
            MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
            if (maintainVisibleScrollPositionHelper != null) {
                maintainVisibleScrollPositionHelper.updateScrollPosition();
            }
        }
        ReactScrollViewHelper.emitLayoutChangeEvent(this);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        int iMax;
        if (DEBUG_MODE) {
            C45999a.m101516v(TAG, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11), Boolean.valueOf(z12));
        }
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && !overScroller.isFinished() && this.mScroller.getCurrX() != this.mScroller.getFinalX() && i11 >= (iMax = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            this.mScroller.abortAnimation();
            i11 = iMax;
        }
        super.onOverScrolled(i11, i12, z11, z12);
    }

    @Override // android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        if (DEBUG_MODE) {
            C45999a.m101516v(TAG, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        Systrace.m10662c(0L, "ReactHorizontalScrollView.onScrollChanged");
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

    @Override // android.widget.HorizontalScrollView, android.view.View
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

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.mPagingEnabled) {
            scrollToChild(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i11, int i12) {
        if (DEBUG_MODE) {
            C45999a.m101515u(TAG, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        super.scrollTo(i11, i12);
        ReactScrollViewHelper.updateFabricScrollState(this);
        setPendingContentOffsets(i11, i12);
    }

    public void setBorderRadius(float f11, int i11) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f11), LengthPercentageType.POINT));
    }

    public void setBorderStyle(@Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
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
            MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper2 = new MaintainVisibleScrollPositionHelper(this, true);
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
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, defaultScrollAnimationDuration > 0 ? (i12 - i11) / defaultScrollAnimationDuration : 0, 0);
            ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd(this);
        }
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            Systrace.m10662c(0L, "ReactHorizontalScrollView.updateClippingRect");
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

    private void adjustPositionForContentChangeRTL(int i11, int i12, int i13, int i14) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i15 = i12 - i11;
        int scrollX = i15 - (i14 - getScrollX());
        scrollTo(scrollX, getScrollY());
        recreateFlingAnimation(scrollX, i15 - getWidth());
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

    private boolean isMostlyScrolledInView(View view) {
        int scrollDelta = getScrollDelta(view);
        view.getDrawingRect(this.mTempRect);
        if (scrollDelta != 0 && Math.abs(scrollDelta) < this.mTempRect.width() / 2) {
            return true;
        }
        return false;
    }

    private boolean isScrolledInView(View view) {
        if (getScrollDelta(view) == 0) {
            return true;
        }
        return false;
    }

    private int predictFinalScrollPosition(int i11) {
        int iMax = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.DEFAULT_FLING_ANIMATOR) {
            return ReactScrollViewHelper.predictFinalScrollPosition(this, i11, 0, iMax, 0).x;
        }
        return ReactScrollViewHelper.getNextFlingStartValue(this, getScrollX(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().x, i11) + getFlingExtrapolatedDistance(i11);
    }

    private void recreateFlingAnimation(int i11, int i12) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && !overScroller.isFinished()) {
            int currX = this.mScroller.getCurrX();
            boolean zComputeScrollOffset = this.mScroller.computeScrollOffset();
            this.mScroller.forceFinished(true);
            if (zComputeScrollOffset) {
                this.mScroller.fling(i11, getScrollY(), (int) (this.mScroller.getCurrVelocity() * Math.signum(this.mScroller.getFinalX() - this.mScroller.getStartX())), 0, 0, i12, 0, 0);
                return;
            }
            scrollTo((this.mScroller.getCurrX() - currX) + i11, getScrollY());
        }
    }

    private void scrollToChild(View view) {
        int scrollDelta = getScrollDelta(view);
        if (scrollDelta != 0) {
            scrollBy(scrollDelta, 0);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!this.mScrollEnabled && (keyCode == 21 || keyCode == 22)) {
            return false;
        }
        return super.executeKeyEvent(keyEvent);
    }

    public void flashScrollIndicators() {
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public int getFlingExtrapolatedDistance(int i11) {
        return ReactScrollViewHelper.predictFinalScrollPosition(this, i11, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
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

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.stop();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        OverScroller overScroller;
        MeasureSpecAssertions.assertExplicitMeasureSpec(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (DEBUG_MODE) {
            C45999a.m101515u(TAG, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        if (getMeasuredHeight() != size2) {
            z11 = true;
        } else {
            z11 = false;
        }
        setMeasuredDimension(size, size2);
        if (z11 && (overScroller = this.mScroller) != null) {
            this.mScrollXAfterMeasure = overScroller.getCurrX();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i11) {
        boolean zPageScroll = super.pageScroll(i11);
        if (this.mPagingEnabled && zPageScroll) {
            handlePostTouchScrolling(0, 0);
        }
        return zPageScroll;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void reactSmoothScrollTo(int i11, int i12) {
        ReactScrollViewHelper.smoothScrollTo(this, i11, i12);
        setPendingContentOffsets(i11, i12);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void scrollToPreservingMomentum(int i11, int i12) {
        scrollTo(i11, i12);
        recreateFlingAnimation(i11, Integer.MAX_VALUE);
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
}
