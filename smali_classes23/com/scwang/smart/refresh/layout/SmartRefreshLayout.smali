.class public Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;
.super Landroid/view/ViewGroup;
.source "SmartRefreshLayout.java"

# interfaces
.implements Lhb0/f;
.implements Landroidx/core/view/NestedScrollingParent;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;,
        Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;,
        Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$k;,
        Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$l;
    }
.end annotation


# static fields
.field protected static sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

.field protected static sFooterCreator:Ljb0/b;

.field protected static sHeaderCreator:Ljb0/c;

.field protected static sRefreshInitializer:Ljb0/d;


# instance fields
.field protected animationRunnable:Ljava/lang/Runnable;

.field protected mAttachedToWindow:Z

.field protected mCurrentVelocity:I

.field protected mDisableContentWhenLoading:Z

.field protected mDisableContentWhenRefresh:Z

.field protected mDragDirection:C

.field protected mDragRate:F

.field protected mEnableAutoLoadMore:Z

.field protected mEnableClipFooterWhenFixedBehind:Z

.field protected mEnableClipHeaderWhenFixedBehind:Z

.field protected mEnableDisallowIntercept:Z

.field protected mEnableFooterFollowWhenNoMoreData:Z

.field protected mEnableFooterTranslationContent:Z

.field protected mEnableHeaderTranslationContent:Z

.field protected mEnableLoadMore:Z

.field protected mEnableLoadMoreWhenContentNotFull:Z

.field protected mEnableNestedScrolling:Z

.field protected mEnableOverScrollBounce:Z

.field protected mEnableOverScrollDrag:Z

.field protected mEnablePreviewInEditMode:Z

.field protected mEnablePureScrollMode:Z

.field protected mEnableRefresh:Z

.field protected mEnableScrollContentWhenLoaded:Z

.field protected mEnableScrollContentWhenRefreshed:Z

.field protected mFalsifyEvent:Landroid/view/MotionEvent;

.field protected mFixedFooterViewId:I

.field protected mFixedHeaderViewId:I

.field protected mFloorDuration:I

.field protected mFooterBackgroundColor:I

.field protected mFooterHeight:I

.field protected mFooterHeightStatus:Lib0/a;

.field protected mFooterInsetStart:I

.field protected mFooterLocked:Z

.field protected mFooterMaxDragRate:F

.field protected mFooterNeedTouchEventWhenLoading:Z

.field protected mFooterNoMoreData:Z

.field protected mFooterNoMoreDataEffective:Z

.field protected mFooterTranslationViewId:I

.field protected mFooterTriggerRate:F

.field protected mHandler:Landroid/os/Handler;

.field protected mHeaderBackgroundColor:I

.field protected mHeaderHeight:I

.field protected mHeaderHeightStatus:Lib0/a;

.field protected mHeaderInsetStart:I

.field protected mHeaderMaxDragRate:F

.field protected mHeaderNeedTouchEventWhenRefreshing:Z

.field protected mHeaderTranslationViewId:I

.field protected mHeaderTriggerRate:F

.field protected mIsBeingDragged:Z

.field protected mKernel:Lhb0/e;

.field protected mLastOpenTime:J

.field protected mLastSpinner:I

.field protected mLastTouchX:F

.field protected mLastTouchY:F

.field protected mLoadMoreListener:Ljb0/e;

.field protected mManualFooterTranslationContent:Z

.field protected mManualHeaderTranslationContent:Z

.field protected mManualLoadMore:Z

.field protected mMaximumVelocity:I

.field protected mMinimumVelocity:I

.field protected mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

.field protected mNestedInProgress:Z

.field protected mNestedParent:Landroidx/core/view/NestedScrollingParentHelper;

.field protected mOnMultiListener:Ljb0/f;

.field protected mPaint:Landroid/graphics/Paint;

.field protected mParentOffsetInWindow:[I

.field protected mPrimaryColors:[I

.field protected mReboundDuration:I

.field protected mReboundInterpolator:Landroid/view/animation/Interpolator;

.field protected mRefreshContent:Lhb0/b;

.field protected mRefreshFooter:Lhb0/a;

.field protected mRefreshHeader:Lhb0/a;

.field protected mRefreshListener:Ljb0/g;

.field protected mScreenHeightPixels:I

.field protected mScrollBoundaryDecider:Ljb0/j;

.field protected mScroller:Landroid/widget/Scroller;

.field protected mSpinner:I

.field protected mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

.field protected mSuperDispatchTouchEvent:Z

.field protected mTotalUnconsumed:I

.field protected mTouchSlop:I

.field protected mTouchSpinner:I

.field protected mTouchX:F

.field protected mTouchY:F

.field protected mTwoLevelBottomPullUpToCloseRate:F

.field protected mVelocityTracker:Landroid/view/VelocityTracker;

.field protected mVerticalPermit:Z

.field protected mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

.field protected reboundAnimator:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3
    const/4 v1, -0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 7
    .line 8
    sput-object v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x12c

    .line 3
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFloorDuration:I

    .line 4
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    const/high16 v0, 0x3f000000    # 0.5f

    .line 5
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragRate:F

    const/16 v0, 0x6e

    .line 6
    iput-char v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragDirection:C

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedHeaderViewId:I

    .line 8
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedFooterViewId:I

    .line 9
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTranslationViewId:I

    .line 10
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTranslationViewId:I

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 13
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipHeaderWhenFixedBehind:Z

    .line 14
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipFooterWhenFixedBehind:Z

    .line 15
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableHeaderTranslationContent:Z

    .line 16
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterTranslationContent:Z

    .line 17
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 18
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    .line 19
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollBounce:Z

    .line 20
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 21
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableAutoLoadMore:Z

    .line 22
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePureScrollMode:Z

    .line 23
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenLoaded:Z

    .line 24
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenRefreshed:Z

    .line 25
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMoreWhenContentNotFull:Z

    .line 26
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableNestedScrolling:Z

    .line 27
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenRefresh:Z

    .line 28
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenLoading:Z

    .line 29
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 30
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 31
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    .line 32
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualHeaderTranslationContent:Z

    .line 33
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualFooterTranslationContent:Z

    const/4 v2, 0x2

    .line 34
    new-array v2, v2, [I

    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mParentOffsetInWindow:[I

    .line 35
    new-instance v2, Landroidx/core/view/NestedScrollingChildHelper;

    invoke-direct {v2, p0}, Landroidx/core/view/NestedScrollingChildHelper;-><init>(Landroid/view/View;)V

    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    .line 36
    new-instance v2, Landroidx/core/view/NestedScrollingParentHelper;

    invoke-direct {v2, p0}, Landroidx/core/view/NestedScrollingParentHelper;-><init>(Landroid/view/ViewGroup;)V

    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedParent:Landroidx/core/view/NestedScrollingParentHelper;

    .line 37
    sget-object v2, Lib0/a;->c:Lib0/a;

    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 38
    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    const/high16 v2, 0x40200000    # 2.5f

    .line 39
    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 40
    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    const/high16 v2, 0x3f800000    # 1.0f

    .line 41
    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTriggerRate:F

    .line 42
    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTriggerRate:F

    const v2, 0x3e2aaaab

    .line 43
    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTwoLevelBottomPullUpToCloseRate:F

    .line 44
    new-instance v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;

    invoke-direct {v2, p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;)V

    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 45
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 46
    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    const-wide/16 v2, 0x0

    .line 47
    iput-wide v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastOpenTime:J

    .line 48
    iput v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderBackgroundColor:I

    .line 49
    iput v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterBackgroundColor:I

    .line 50
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 51
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVerticalPermit:Z

    const/4 v2, 0x0

    .line 52
    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFalsifyEvent:Landroid/view/MotionEvent;

    .line 53
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    .line 54
    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHandler:Landroid/os/Handler;

    .line 55
    new-instance v3, Landroid/widget/Scroller;

    invoke-direct {v3, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 56
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v3

    iput-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScreenHeightPixels:I

    .line 58
    new-instance v3, Llb0/b;

    sget v4, Llb0/b;->b:I

    invoke-direct {v3, v4}, Llb0/b;-><init>(I)V

    iput-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundInterpolator:Landroid/view/animation/Interpolator;

    .line 59
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSlop:I

    .line 60
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v3

    iput v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mMinimumVelocity:I

    .line 61
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v2

    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mMaximumVelocity:I

    const/high16 v2, 0x42700000    # 60.0f

    .line 62
    invoke-static {v2}, Llb0/b;->c(F)I

    move-result v2

    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    const/high16 v2, 0x42c80000    # 100.0f

    .line 63
    invoke-static {v2}, Llb0/b;->c(F)I

    move-result v2

    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 64
    sget-object v2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 65
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_android_clipToPadding:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-nez p2, :cond_0

    .line 66
    invoke-super {p0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 67
    :cond_0
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_android_clipChildren:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-nez p2, :cond_1

    .line 68
    invoke-super {p0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 69
    :cond_1
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlDragRate:I

    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragRate:F

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragRate:F

    .line 70
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlHeaderMaxDragRate:I

    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 71
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlFooterMaxDragRate:I

    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 72
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlHeaderTriggerRate:I

    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTriggerRate:F

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTriggerRate:F

    .line 73
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlFooterTriggerRate:I

    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTriggerRate:F

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTriggerRate:F

    .line 74
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableRefresh:I

    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 75
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlReboundDuration:I

    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    .line 76
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableLoadMore:I

    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 77
    sget v2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlHeaderHeight:I

    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 78
    sget v3, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlFooterHeight:I

    iget v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 79
    sget v4, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlHeaderInsetStart:I

    iget v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderInsetStart:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderInsetStart:I

    .line 80
    sget v4, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlFooterInsetStart:I

    iget v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterInsetStart:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterInsetStart:I

    .line 81
    sget v4, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlDisableContentWhenRefresh:I

    iget-boolean v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenRefresh:Z

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenRefresh:Z

    .line 82
    sget v4, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlDisableContentWhenLoading:I

    iget-boolean v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenLoading:Z

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenLoading:Z

    .line 83
    sget v4, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableHeaderTranslationContent:I

    iget-boolean v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableHeaderTranslationContent:Z

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableHeaderTranslationContent:Z

    .line 84
    sget v5, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableFooterTranslationContent:I

    iget-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterTranslationContent:Z

    invoke-virtual {p1, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterTranslationContent:Z

    .line 85
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnablePreviewInEditMode:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    .line 86
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableAutoLoadMore:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableAutoLoadMore:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableAutoLoadMore:Z

    .line 87
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableOverScrollBounce:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollBounce:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollBounce:Z

    .line 88
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnablePureScrollMode:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePureScrollMode:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePureScrollMode:Z

    .line 89
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableScrollContentWhenLoaded:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenLoaded:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenLoaded:Z

    .line 90
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableScrollContentWhenRefreshed:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenRefreshed:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenRefreshed:Z

    .line 91
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMoreWhenContentNotFull:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMoreWhenContentNotFull:Z

    .line 92
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 93
    sget v7, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData:I

    invoke-virtual {p1, v7, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 94
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipHeaderWhenFixedBehind:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipHeaderWhenFixedBehind:Z

    .line 95
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipFooterWhenFixedBehind:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipFooterWhenFixedBehind:Z

    .line 96
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableOverScrollDrag:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 97
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlFixedHeaderViewId:I

    iget v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedHeaderViewId:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedHeaderViewId:I

    .line 98
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlFixedFooterViewId:I

    iget v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedFooterViewId:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedFooterViewId:I

    .line 99
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlHeaderTranslationViewId:I

    iget v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTranslationViewId:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTranslationViewId:I

    .line 100
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlFooterTranslationViewId:I

    iget v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTranslationViewId:I

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    iput v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTranslationViewId:I

    .line 101
    sget v6, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlEnableNestedScrolling:I

    iget-boolean v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableNestedScrolling:Z

    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableNestedScrolling:Z

    .line 102
    iget-object v7, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v7, v6}, Landroidx/core/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    .line 103
    iget-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    if-nez v6, :cond_3

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    move p2, v1

    goto :goto_1

    :cond_3
    :goto_0
    move p2, v0

    :goto_1
    iput-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    .line 104
    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualHeaderTranslationContent:Z

    if-nez p2, :cond_5

    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    move p2, v1

    goto :goto_3

    :cond_5
    :goto_2
    move p2, v0

    :goto_3
    iput-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualHeaderTranslationContent:Z

    .line 105
    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualFooterTranslationContent:Z

    if-nez p2, :cond_7

    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_4

    :cond_6
    move p2, v1

    goto :goto_5

    :cond_7
    :goto_4
    move p2, v0

    :goto_5
    iput-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualFooterTranslationContent:Z

    .line 106
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_8

    sget-object p2, Lib0/a;->i:Lib0/a;

    goto :goto_6

    :cond_8
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    :goto_6
    iput-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 107
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_9

    sget-object p2, Lib0/a;->i:Lib0/a;

    goto :goto_7

    :cond_9
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    :goto_7
    iput-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 108
    sget p2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlAccentColor:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    .line 109
    sget v2, Lcom/scwang/smart/refresh/layout/kernel/R$styleable;->SmartRefreshLayout_srlPrimaryColor:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    if-eqz v2, :cond_b

    if-eqz p2, :cond_a

    .line 110
    filled-new-array {v2, p2}, [I

    move-result-object p2

    iput-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPrimaryColors:[I

    goto :goto_8

    .line 111
    :cond_a
    filled-new-array {v2}, [I

    move-result-object p2

    iput-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPrimaryColors:[I

    goto :goto_8

    :cond_b
    if-eqz p2, :cond_c

    .line 112
    filled-new-array {v1, p2}, [I

    move-result-object p2

    iput-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPrimaryColors:[I

    .line 113
    :cond_c
    :goto_8
    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePureScrollMode:Z

    if-eqz p2, :cond_d

    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    if-nez p2, :cond_d

    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    if-nez p2, :cond_d

    .line 114
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 115
    :cond_d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic access$001(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic access$101(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic access$201(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic access$301(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic access$401(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic access$501(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static setDefaultRefreshFooterCreator(Ljb0/b;)V
    .locals 0
    .param p0    # Ljb0/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static setDefaultRefreshHeaderCreator(Ljb0/c;)V
    .locals 0
    .param p0    # Ljb0/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sput-object p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sHeaderCreator:Ljb0/c;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static setDefaultRefreshInitializer(Ljb0/d;)V
    .locals 0
    .param p0    # Ljb0/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public animSpinner(IILandroid/view/animation/Interpolator;I)Landroid/animation/ValueAnimator;
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eq v0, p1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 20
    .line 21
    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    :cond_0
    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animationRunnable:Ljava/lang/Runnable;

    .line 24
    .line 25
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 26
    .line 27
    .line 28
    filled-new-array {v0, p1}, [I

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 36
    int-to-long v0, p4

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 40
    .line 41
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 45
    .line 46
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 47
    .line 48
    new-instance p3, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$d;

    .line 49
    .line 50
    .line 51
    invoke-direct {p3, p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$d;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 55
    .line 56
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 57
    .line 58
    new-instance p3, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$e;

    .line 59
    .line 60
    .line 61
    invoke-direct {p3, p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$e;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 65
    .line 66
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 67
    int-to-long p2, p2

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2, p3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 71
    .line 72
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 76
    .line 77
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 78
    return-object p1

    .line 79
    :cond_1
    return-object v1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
.end method

.method public animSpinnerBounce(F)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 3
    .line 4
    if-nez v0, :cond_5

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    cmpl-float v1, p1, v0

    .line 8
    .line 9
    if-lez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 12
    .line 13
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 14
    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->TwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 18
    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$k;

    .line 22
    .line 23
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, p1, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$k;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;FI)V

    .line 27
    .line 28
    iput-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animationRunnable:Ljava/lang/Runnable;

    .line 29
    return-void

    .line 30
    .line 31
    :cond_1
    cmpg-float v0, p1, v0

    .line 32
    .line 33
    if-gez v0, :cond_4

    .line 34
    .line 35
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 36
    .line 37
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 38
    .line 39
    if-eq v0, v1, :cond_3

    .line 40
    .line 41
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    :cond_2
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableAutoLoadMore:Z

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 78
    .line 79
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 80
    .line 81
    if-eq v0, v1, :cond_4

    .line 82
    .line 83
    :cond_3
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$k;

    .line 84
    .line 85
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 86
    neg-int v1, v1

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, p0, p1, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$k;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;FI)V

    .line 90
    .line 91
    iput-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animationRunnable:Ljava/lang/Runnable;

    .line 92
    return-void

    .line 93
    .line 94
    :cond_4
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 95
    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollBounce:Z

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$k;

    .line 103
    const/4 v1, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct {v0, p0, p1, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$k;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;FI)V

    .line 107
    .line 108
    iput-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animationRunnable:Ljava/lang/Runnable;

    .line 109
    :cond_5
    return-void
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public autoLoadMore()Z
    .locals 5

    .line 1
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    int-to-float v2, v1

    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    if-nez v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    int-to-float v1, v1

    div-float/2addr v2, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v2, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->autoLoadMore(IIFZ)Z

    move-result v0

    return v0
.end method

.method public autoLoadMore(I)Z
    .locals 5

    .line 2
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    int-to-float v2, v1

    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v3, v4

    mul-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    if-nez v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    int-to-float v1, v1

    div-float/2addr v2, v1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v2, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->autoLoadMore(IIFZ)Z

    move-result p1

    return p1
.end method

.method public autoLoadMore(IIFZ)Z
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$j;

    invoke-direct {v0, p0, p3, p2, p4}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$j;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;FIZ)V

    .line 5
    sget-object p2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    invoke-virtual {p0, p2}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    if-lez p1, :cond_0

    .line 6
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHandler:Landroid/os/Handler;

    int-to-long p3, p1

    invoke-virtual {p2, v0, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public autoLoadMoreAnimationOnly()Z
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    .line 3
    .line 4
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 5
    int-to-float v2, v1

    .line 6
    .line 7
    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 8
    .line 9
    const/high16 v4, 0x40000000    # 2.0f

    .line 10
    div-float/2addr v3, v4

    .line 11
    .line 12
    const/high16 v4, 0x3f000000    # 0.5f

    .line 13
    add-float/2addr v3, v4

    .line 14
    mul-float/2addr v2, v3

    .line 15
    .line 16
    const/high16 v3, 0x3f800000    # 1.0f

    .line 17
    mul-float/2addr v2, v3

    .line 18
    const/4 v3, 0x1

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    move v1, v3

    .line 22
    :cond_0
    int-to-float v1, v1

    .line 23
    div-float/2addr v2, v1

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->autoLoadMore(IIFZ)Z

    .line 28
    move-result v0

    .line 29
    return v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method public autoRefresh()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/16 v0, 0x190

    :goto_0
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v3, v4

    iget v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    int-to-float v5, v4

    mul-float/2addr v3, v5

    const/high16 v5, 0x3f800000    # 1.0f

    mul-float/2addr v3, v5

    if-nez v4, :cond_1

    const/4 v4, 0x1

    :cond_1
    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->autoRefresh(IIFZ)Z

    move-result v0

    return v0
.end method

.method public autoRefresh(I)Z
    .locals 4

    .line 2
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    int-to-float v3, v2

    mul-float/2addr v1, v3

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v1, v3

    if-nez v2, :cond_0

    const/4 v2, 0x1

    :cond_0
    int-to-float v2, v2

    div-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->autoRefresh(IIFZ)Z

    move-result p1

    return p1
.end method

.method public autoRefresh(IIFZ)Z
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$i;

    invoke-direct {v0, p0, p3, p2, p4}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$i;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;FIZ)V

    .line 5
    sget-object p2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    invoke-virtual {p0, p2}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    if-lez p1, :cond_0

    .line 6
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHandler:Landroid/os/Handler;

    int-to-long p3, p1

    invoke-virtual {p2, v0, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public autoRefreshAnimationOnly()Z
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    const/16 v0, 0x190

    .line 9
    .line 10
    :goto_0
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    .line 11
    .line 12
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 13
    .line 14
    const/high16 v3, 0x40000000    # 2.0f

    .line 15
    div-float/2addr v2, v3

    .line 16
    .line 17
    const/high16 v3, 0x3f000000    # 0.5f

    .line 18
    add-float/2addr v2, v3

    .line 19
    .line 20
    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 21
    int-to-float v4, v3

    .line 22
    mul-float/2addr v2, v4

    .line 23
    .line 24
    const/high16 v4, 0x3f800000    # 1.0f

    .line 25
    mul-float/2addr v2, v4

    .line 26
    const/4 v4, 0x1

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    move v3, v4

    .line 30
    :cond_1
    int-to-float v3, v3

    .line 31
    div-float/2addr v2, v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2, v4}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->autoRefresh(IIFZ)Z

    .line 35
    move-result v0

    .line 36
    return v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method public closeHeaderOrFooter()Lhb0/f;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    .line 4
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 9
    .line 10
    sget-object v3, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 11
    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
    sget-object v3, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 15
    .line 16
    if-ne v2, v3, :cond_1

    .line 17
    .line 18
    :cond_0
    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 19
    .line 20
    :cond_1
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 21
    .line 22
    if-ne v0, v2, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishRefresh()Lhb0/f;

    .line 26
    return-object p0

    .line 27
    .line 28
    :cond_2
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 29
    .line 30
    if-ne v0, v2, :cond_3

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishLoadMore()Lhb0/f;

    .line 34
    return-object p0

    .line 35
    .line 36
    :cond_3
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 37
    const/4 v2, 0x0

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v2}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 47
    return-object p0

    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 50
    .line 51
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isHeader:Z

    .line 52
    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 59
    return-object p0

    .line 60
    .line 61
    :cond_5
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 65
    return-object p0
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method public computeScroll()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalY()I

    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    :cond_0
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Lhb0/b;->i()Z

    .line 36
    move-result v2

    .line 37
    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    :cond_1
    if-lez v0, :cond_6

    .line 41
    .line 42
    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 47
    .line 48
    if-eqz v2, :cond_6

    .line 49
    .line 50
    :cond_2
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 51
    .line 52
    .line 53
    invoke-interface {v2}, Lhb0/b;->g()Z

    .line 54
    move-result v2

    .line 55
    .line 56
    if-eqz v2, :cond_6

    .line 57
    .line 58
    :cond_3
    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVerticalPermit:Z

    .line 59
    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    if-lez v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrVelocity()F

    .line 68
    move-result v0

    .line 69
    neg-float v0, v0

    .line 70
    goto :goto_0

    .line 71
    .line 72
    :cond_4
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrVelocity()F

    .line 76
    move-result v0

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animSpinnerBounce(F)V

    .line 80
    .line 81
    :cond_5
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 85
    return-void

    .line 86
    .line 87
    :cond_6
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVerticalPermit:Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 91
    :cond_7
    return-void
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 8
    move-result v6

    .line 9
    const/4 v10, 0x0

    .line 10
    const/4 v11, 0x1

    .line 11
    const/4 v2, 0x6

    .line 12
    .line 13
    if-ne v6, v2, :cond_0

    .line 14
    move v3, v11

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v10

    .line 17
    .line 18
    :goto_0
    if-eqz v3, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 22
    move-result v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v4, -0x1

    .line 25
    .line 26
    .line 27
    :goto_1
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 28
    move-result v5

    .line 29
    const/4 v7, 0x0

    .line 30
    move v9, v7

    .line 31
    move v12, v9

    .line 32
    move v8, v10

    .line 33
    .line 34
    :goto_2
    if-ge v8, v5, :cond_3

    .line 35
    .line 36
    if-ne v4, v8, :cond_2

    .line 37
    goto :goto_3

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getX(I)F

    .line 41
    move-result v13

    .line 42
    add-float/2addr v9, v13

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getY(I)F

    .line 46
    move-result v13

    .line 47
    add-float/2addr v12, v13

    .line 48
    .line 49
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 50
    goto :goto_2

    .line 51
    .line 52
    :cond_3
    if-eqz v3, :cond_4

    .line 53
    .line 54
    add-int/lit8 v5, v5, -0x1

    .line 55
    :cond_4
    int-to-float v3, v5

    .line 56
    div-float/2addr v9, v3

    .line 57
    .line 58
    div-float v8, v12, v3

    .line 59
    .line 60
    if-eq v6, v2, :cond_5

    .line 61
    const/4 v2, 0x5

    .line 62
    .line 63
    if-ne v6, v2, :cond_6

    .line 64
    .line 65
    :cond_5
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 66
    .line 67
    if-eqz v2, :cond_6

    .line 68
    .line 69
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 70
    .line 71
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchY:F

    .line 72
    .line 73
    sub-float v3, v8, v3

    .line 74
    add-float/2addr v2, v3

    .line 75
    .line 76
    iput v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 77
    .line 78
    :cond_6
    iput v9, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 79
    .line 80
    iput v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchY:F

    .line 81
    .line 82
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedInProgress:Z

    .line 83
    const/4 v3, 0x2

    .line 84
    .line 85
    if-eqz v2, :cond_a

    .line 86
    .line 87
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 88
    .line 89
    .line 90
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 91
    move-result v1

    .line 92
    .line 93
    if-ne v6, v3, :cond_9

    .line 94
    .line 95
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 96
    .line 97
    if-ne v2, v3, :cond_9

    .line 98
    .line 99
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 100
    float-to-int v2, v2

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 104
    move-result v3

    .line 105
    .line 106
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 107
    .line 108
    if-nez v3, :cond_7

    .line 109
    goto :goto_4

    .line 110
    :cond_7
    move v11, v3

    .line 111
    :goto_4
    int-to-float v5, v11

    .line 112
    div-float/2addr v4, v5

    .line 113
    .line 114
    iget-boolean v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v5}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 118
    move-result v5

    .line 119
    .line 120
    if-eqz v5, :cond_8

    .line 121
    .line 122
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 123
    .line 124
    if-lez v5, :cond_8

    .line 125
    .line 126
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 127
    .line 128
    if-eqz v5, :cond_8

    .line 129
    .line 130
    .line 131
    invoke-interface {v5}, Lhb0/a;->isSupportHorizontalDrag()Z

    .line 132
    move-result v5

    .line 133
    .line 134
    if-eqz v5, :cond_8

    .line 135
    .line 136
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 137
    .line 138
    .line 139
    invoke-interface {v5, v4, v2, v3}, Lhb0/a;->onHorizontalDrag(FII)V

    .line 140
    return v1

    .line 141
    .line 142
    :cond_8
    iget-boolean v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v5}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 146
    move-result v5

    .line 147
    .line 148
    if-eqz v5, :cond_9

    .line 149
    .line 150
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 151
    .line 152
    if-gez v5, :cond_9

    .line 153
    .line 154
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 155
    .line 156
    if-eqz v5, :cond_9

    .line 157
    .line 158
    .line 159
    invoke-interface {v5}, Lhb0/a;->isSupportHorizontalDrag()Z

    .line 160
    move-result v5

    .line 161
    .line 162
    if-eqz v5, :cond_9

    .line 163
    .line 164
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 165
    .line 166
    .line 167
    invoke-interface {v5, v4, v2, v3}, Lhb0/a;->onHorizontalDrag(FII)V

    .line 168
    :cond_9
    return v1

    .line 169
    .line 170
    .line 171
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 172
    move-result v2

    .line 173
    .line 174
    if-eqz v2, :cond_37

    .line 175
    .line 176
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 177
    .line 178
    if-nez v2, :cond_b

    .line 179
    .line 180
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 181
    .line 182
    if-nez v2, :cond_b

    .line 183
    .line 184
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 185
    .line 186
    if-eqz v2, :cond_37

    .line 187
    .line 188
    :cond_b
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderNeedTouchEventWhenRefreshing:Z

    .line 189
    .line 190
    if-eqz v2, :cond_d

    .line 191
    .line 192
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 193
    .line 194
    iget-boolean v4, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 195
    .line 196
    if-nez v4, :cond_c

    .line 197
    .line 198
    iget-boolean v4, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFinishing:Z

    .line 199
    .line 200
    if-eqz v4, :cond_d

    .line 201
    .line 202
    :cond_c
    iget-boolean v2, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isHeader:Z

    .line 203
    .line 204
    if-nez v2, :cond_37

    .line 205
    .line 206
    :cond_d
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNeedTouchEventWhenLoading:Z

    .line 207
    .line 208
    if-eqz v2, :cond_f

    .line 209
    .line 210
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 211
    .line 212
    iget-boolean v4, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 213
    .line 214
    if-nez v4, :cond_e

    .line 215
    .line 216
    iget-boolean v4, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFinishing:Z

    .line 217
    .line 218
    if-eqz v4, :cond_f

    .line 219
    .line 220
    :cond_e
    iget-boolean v2, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFooter:Z

    .line 221
    .line 222
    if-eqz v2, :cond_f

    .line 223
    .line 224
    goto/16 :goto_d

    .line 225
    .line 226
    .line 227
    :cond_f
    invoke-virtual {v0, v6}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->interceptAnimatorByAction(I)Z

    .line 228
    move-result v2

    .line 229
    .line 230
    if-nez v2, :cond_36

    .line 231
    .line 232
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 233
    .line 234
    iget-boolean v4, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFinishing:Z

    .line 235
    .line 236
    if-nez v4, :cond_36

    .line 237
    .line 238
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 239
    .line 240
    if-ne v2, v4, :cond_10

    .line 241
    .line 242
    iget-boolean v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenLoading:Z

    .line 243
    .line 244
    if-nez v5, :cond_36

    .line 245
    .line 246
    :cond_10
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 247
    .line 248
    if-ne v2, v5, :cond_11

    .line 249
    .line 250
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenRefresh:Z

    .line 251
    .line 252
    if-eqz v2, :cond_11

    .line 253
    .line 254
    goto/16 :goto_c

    .line 255
    .line 256
    :cond_11
    const/16 v2, 0x68

    .line 257
    .line 258
    if-eqz v6, :cond_33

    .line 259
    const/4 v5, 0x0

    .line 260
    .line 261
    if-eq v6, v11, :cond_2f

    .line 262
    const/4 v12, 0x3

    .line 263
    .line 264
    if-eq v6, v3, :cond_12

    .line 265
    .line 266
    if-eq v6, v12, :cond_30

    .line 267
    .line 268
    goto/16 :goto_b

    .line 269
    .line 270
    :cond_12
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchX:F

    .line 271
    sub-float/2addr v9, v3

    .line 272
    .line 273
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 274
    .line 275
    sub-float v3, v8, v3

    .line 276
    .line 277
    iget-object v6, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 281
    .line 282
    iget-boolean v6, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 283
    .line 284
    if-nez v6, :cond_1f

    .line 285
    .line 286
    iget-boolean v6, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableDisallowIntercept:Z

    .line 287
    .line 288
    if-nez v6, :cond_1f

    .line 289
    .line 290
    iget-char v6, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragDirection:C

    .line 291
    .line 292
    if-eq v6, v2, :cond_1f

    .line 293
    .line 294
    iget-object v13, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 295
    .line 296
    if-eqz v13, :cond_1f

    .line 297
    .line 298
    const/16 v13, 0x76

    .line 299
    .line 300
    if-eq v6, v13, :cond_14

    .line 301
    .line 302
    .line 303
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 304
    move-result v6

    .line 305
    .line 306
    iget v14, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSlop:I

    .line 307
    int-to-float v14, v14

    .line 308
    .line 309
    cmpl-float v6, v6, v14

    .line 310
    .line 311
    if-ltz v6, :cond_13

    .line 312
    .line 313
    .line 314
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 315
    move-result v6

    .line 316
    .line 317
    .line 318
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 319
    move-result v14

    .line 320
    .line 321
    cmpg-float v6, v6, v14

    .line 322
    .line 323
    if-gez v6, :cond_13

    .line 324
    goto :goto_5

    .line 325
    .line 326
    .line 327
    :cond_13
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 328
    move-result v4

    .line 329
    .line 330
    iget v6, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSlop:I

    .line 331
    int-to-float v6, v6

    .line 332
    .line 333
    cmpl-float v4, v4, v6

    .line 334
    .line 335
    if-ltz v4, :cond_1f

    .line 336
    .line 337
    .line 338
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 339
    move-result v4

    .line 340
    .line 341
    .line 342
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 343
    move-result v6

    .line 344
    .line 345
    cmpl-float v4, v4, v6

    .line 346
    .line 347
    if-lez v4, :cond_1f

    .line 348
    .line 349
    iget-char v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragDirection:C

    .line 350
    .line 351
    if-eq v4, v13, :cond_1f

    .line 352
    .line 353
    iput-char v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragDirection:C

    .line 354
    .line 355
    goto/16 :goto_9

    .line 356
    .line 357
    :cond_14
    :goto_5
    iput-char v13, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragDirection:C

    .line 358
    .line 359
    cmpl-float v2, v3, v7

    .line 360
    .line 361
    if-lez v2, :cond_17

    .line 362
    .line 363
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 364
    .line 365
    if-ltz v2, :cond_16

    .line 366
    .line 367
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 368
    .line 369
    if-nez v2, :cond_15

    .line 370
    .line 371
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 372
    .line 373
    if-eqz v2, :cond_17

    .line 374
    .line 375
    :cond_15
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 376
    .line 377
    .line 378
    invoke-interface {v2}, Lhb0/b;->i()Z

    .line 379
    move-result v2

    .line 380
    .line 381
    if-eqz v2, :cond_17

    .line 382
    .line 383
    :cond_16
    iput-boolean v11, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 384
    .line 385
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSlop:I

    .line 386
    int-to-float v2, v2

    .line 387
    .line 388
    sub-float v2, v8, v2

    .line 389
    .line 390
    iput v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 391
    goto :goto_6

    .line 392
    .line 393
    :cond_17
    cmpg-float v2, v3, v7

    .line 394
    .line 395
    if-gez v2, :cond_1b

    .line 396
    .line 397
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 398
    .line 399
    if-gtz v2, :cond_1a

    .line 400
    .line 401
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 402
    .line 403
    if-nez v2, :cond_18

    .line 404
    .line 405
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 406
    .line 407
    if-eqz v2, :cond_1b

    .line 408
    .line 409
    :cond_18
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 410
    .line 411
    if-ne v2, v4, :cond_19

    .line 412
    .line 413
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 414
    .line 415
    if-nez v2, :cond_1a

    .line 416
    .line 417
    :cond_19
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 418
    .line 419
    .line 420
    invoke-interface {v2}, Lhb0/b;->g()Z

    .line 421
    move-result v2

    .line 422
    .line 423
    if-eqz v2, :cond_1b

    .line 424
    .line 425
    :cond_1a
    iput-boolean v11, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 426
    .line 427
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSlop:I

    .line 428
    int-to-float v2, v2

    .line 429
    add-float/2addr v2, v8

    .line 430
    .line 431
    iput v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 432
    .line 433
    :cond_1b
    :goto_6
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 434
    .line 435
    if-eqz v2, :cond_1f

    .line 436
    .line 437
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 438
    .line 439
    sub-float v3, v8, v2

    .line 440
    .line 441
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSuperDispatchTouchEvent:Z

    .line 442
    .line 443
    if-eqz v2, :cond_1c

    .line 444
    .line 445
    .line 446
    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->setAction(I)V

    .line 447
    .line 448
    .line 449
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 450
    .line 451
    :cond_1c
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 452
    .line 453
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 454
    .line 455
    if-gtz v4, :cond_1e

    .line 456
    .line 457
    if-nez v4, :cond_1d

    .line 458
    .line 459
    cmpl-float v4, v3, v7

    .line 460
    .line 461
    if-lez v4, :cond_1d

    .line 462
    goto :goto_7

    .line 463
    .line 464
    :cond_1d
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 465
    goto :goto_8

    .line 466
    .line 467
    :cond_1e
    :goto_7
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 468
    .line 469
    .line 470
    :goto_8
    invoke-interface {v2, v4}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 474
    move-result-object v2

    .line 475
    .line 476
    instance-of v4, v2, Landroid/view/ViewGroup;

    .line 477
    .line 478
    if-eqz v4, :cond_1f

    .line 479
    .line 480
    check-cast v2, Landroid/view/ViewGroup;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v11}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 484
    .line 485
    :cond_1f
    :goto_9
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 486
    .line 487
    if-eqz v2, :cond_2e

    .line 488
    float-to-int v2, v3

    .line 489
    .line 490
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSpinner:I

    .line 491
    add-int/2addr v2, v4

    .line 492
    .line 493
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 494
    .line 495
    iget-boolean v6, v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isHeader:Z

    .line 496
    .line 497
    if-eqz v6, :cond_20

    .line 498
    .line 499
    if-ltz v2, :cond_21

    .line 500
    .line 501
    iget v6, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastSpinner:I

    .line 502
    .line 503
    if-ltz v6, :cond_21

    .line 504
    .line 505
    :cond_20
    iget-boolean v4, v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFooter:Z

    .line 506
    .line 507
    if-eqz v4, :cond_2d

    .line 508
    .line 509
    if-gtz v2, :cond_21

    .line 510
    .line 511
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastSpinner:I

    .line 512
    .line 513
    if-lez v4, :cond_2d

    .line 514
    .line 515
    :cond_21
    iput v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastSpinner:I

    .line 516
    .line 517
    .line 518
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 519
    move-result-wide v13

    .line 520
    .line 521
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFalsifyEvent:Landroid/view/MotionEvent;

    .line 522
    .line 523
    if-nez v1, :cond_22

    .line 524
    .line 525
    iget v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchX:F

    .line 526
    .line 527
    add-float v18, v1, v9

    .line 528
    .line 529
    iget v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 530
    .line 531
    const/16 v20, 0x0

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    move-wide v15, v13

    .line 535
    .line 536
    move/from16 v19, v1

    .line 537
    .line 538
    .line 539
    invoke-static/range {v13 .. v20}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 540
    move-result-object v1

    .line 541
    .line 542
    iput-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFalsifyEvent:Landroid/view/MotionEvent;

    .line 543
    .line 544
    .line 545
    invoke-super {v0, v1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 546
    .line 547
    :cond_22
    iget v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchX:F

    .line 548
    .line 549
    add-float v18, v1, v9

    .line 550
    .line 551
    iget v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 552
    int-to-float v4, v2

    .line 553
    .line 554
    add-float v19, v1, v4

    .line 555
    .line 556
    const/16 v20, 0x0

    .line 557
    .line 558
    const/16 v17, 0x2

    .line 559
    move-wide v15, v13

    .line 560
    .line 561
    .line 562
    invoke-static/range {v13 .. v20}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 563
    move-result-object v1

    .line 564
    .line 565
    .line 566
    invoke-super {v0, v1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 567
    .line 568
    iget-boolean v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 569
    .line 570
    if-eqz v4, :cond_23

    .line 571
    .line 572
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSlop:I

    .line 573
    int-to-float v4, v4

    .line 574
    .line 575
    cmpl-float v3, v3, v4

    .line 576
    .line 577
    if-lez v3, :cond_23

    .line 578
    .line 579
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 580
    .line 581
    if-gez v3, :cond_23

    .line 582
    .line 583
    iput-boolean v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 584
    .line 585
    :cond_23
    if-lez v2, :cond_25

    .line 586
    .line 587
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 588
    .line 589
    if-nez v3, :cond_24

    .line 590
    .line 591
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 592
    .line 593
    if-eqz v3, :cond_25

    .line 594
    .line 595
    :cond_24
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 596
    .line 597
    .line 598
    invoke-interface {v3}, Lhb0/b;->i()Z

    .line 599
    move-result v3

    .line 600
    .line 601
    if-eqz v3, :cond_25

    .line 602
    .line 603
    iput v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchY:F

    .line 604
    .line 605
    iput v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 606
    .line 607
    iput v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSpinner:I

    .line 608
    .line 609
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 610
    .line 611
    sget-object v3, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 612
    .line 613
    .line 614
    invoke-interface {v2, v3}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 615
    goto :goto_a

    .line 616
    .line 617
    :cond_25
    if-gez v2, :cond_27

    .line 618
    .line 619
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 620
    .line 621
    if-nez v3, :cond_26

    .line 622
    .line 623
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 624
    .line 625
    if-eqz v3, :cond_27

    .line 626
    .line 627
    :cond_26
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 628
    .line 629
    .line 630
    invoke-interface {v3}, Lhb0/b;->g()Z

    .line 631
    move-result v3

    .line 632
    .line 633
    if-eqz v3, :cond_27

    .line 634
    .line 635
    iput v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchY:F

    .line 636
    .line 637
    iput v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 638
    .line 639
    iput v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSpinner:I

    .line 640
    .line 641
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 642
    .line 643
    sget-object v3, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 644
    .line 645
    .line 646
    invoke-interface {v2, v3}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 647
    goto :goto_a

    .line 648
    :cond_27
    move v10, v2

    .line 649
    .line 650
    :goto_a
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 651
    .line 652
    iget-boolean v3, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isHeader:Z

    .line 653
    .line 654
    if-eqz v3, :cond_28

    .line 655
    .line 656
    if-ltz v10, :cond_29

    .line 657
    .line 658
    :cond_28
    iget-boolean v2, v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFooter:Z

    .line 659
    .line 660
    if-eqz v2, :cond_2b

    .line 661
    .line 662
    if-lez v10, :cond_2b

    .line 663
    .line 664
    :cond_29
    iget v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 665
    .line 666
    if-eqz v1, :cond_2a

    .line 667
    .line 668
    .line 669
    invoke-virtual {v0, v7}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->moveSpinnerInfinitely(F)V

    .line 670
    :cond_2a
    return v11

    .line 671
    .line 672
    :cond_2b
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFalsifyEvent:Landroid/view/MotionEvent;

    .line 673
    .line 674
    if-eqz v2, :cond_2c

    .line 675
    .line 676
    iput-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFalsifyEvent:Landroid/view/MotionEvent;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->setAction(I)V

    .line 680
    .line 681
    .line 682
    invoke-super {v0, v1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 683
    .line 684
    .line 685
    :cond_2c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 686
    move v2, v10

    .line 687
    :cond_2d
    int-to-float v1, v2

    .line 688
    .line 689
    .line 690
    invoke-virtual {v0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->moveSpinnerInfinitely(F)V

    .line 691
    return v11

    .line 692
    .line 693
    :cond_2e
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 694
    .line 695
    if-eqz v2, :cond_32

    .line 696
    .line 697
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSlop:I

    .line 698
    int-to-float v2, v2

    .line 699
    .line 700
    cmpl-float v2, v3, v2

    .line 701
    .line 702
    if-lez v2, :cond_32

    .line 703
    .line 704
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 705
    .line 706
    if-gez v2, :cond_32

    .line 707
    .line 708
    iput-boolean v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 709
    goto :goto_b

    .line 710
    .line 711
    :cond_2f
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 715
    .line 716
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 717
    .line 718
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mMaximumVelocity:I

    .line 719
    int-to-float v3, v3

    .line 720
    .line 721
    const/16 v4, 0x3e8

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v4, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 725
    .line 726
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 730
    move-result v2

    .line 731
    float-to-int v2, v2

    .line 732
    .line 733
    iput v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mCurrentVelocity:I

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0, v7}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->startFlingIfNeed(F)Z

    .line 737
    .line 738
    :cond_30
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V

    .line 742
    .line 743
    const/16 v2, 0x6e

    .line 744
    .line 745
    iput-char v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragDirection:C

    .line 746
    .line 747
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFalsifyEvent:Landroid/view/MotionEvent;

    .line 748
    .line 749
    if-eqz v2, :cond_31

    .line 750
    .line 751
    .line 752
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 753
    .line 754
    iput-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFalsifyEvent:Landroid/view/MotionEvent;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 758
    move-result-wide v2

    .line 759
    .line 760
    iget v7, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchX:F

    .line 761
    const/4 v9, 0x0

    .line 762
    move-wide v4, v2

    .line 763
    .line 764
    .line 765
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 766
    move-result-object v2

    .line 767
    .line 768
    .line 769
    invoke-super {v0, v2}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 770
    .line 771
    .line 772
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 773
    .line 774
    .line 775
    :cond_31
    invoke-virtual {v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->overSpinner()V

    .line 776
    .line 777
    iget-boolean v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 778
    .line 779
    if-eqz v2, :cond_32

    .line 780
    .line 781
    iput-boolean v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 782
    return v11

    .line 783
    .line 784
    .line 785
    :cond_32
    :goto_b
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 786
    move-result v1

    .line 787
    return v1

    .line 788
    .line 789
    :cond_33
    iput v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mCurrentVelocity:I

    .line 790
    .line 791
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v3, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 795
    .line 796
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v3, v11}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 800
    .line 801
    iput v9, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchX:F

    .line 802
    .line 803
    iput v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 804
    .line 805
    iput v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastSpinner:I

    .line 806
    .line 807
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 808
    .line 809
    iput v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchSpinner:I

    .line 810
    .line 811
    iput-boolean v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 812
    .line 813
    iput-boolean v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableDisallowIntercept:Z

    .line 814
    .line 815
    .line 816
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 817
    move-result v3

    .line 818
    .line 819
    iput-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSuperDispatchTouchEvent:Z

    .line 820
    .line 821
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 822
    .line 823
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->TwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 824
    .line 825
    if-ne v3, v4, :cond_34

    .line 826
    .line 827
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTouchY:F

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 831
    move-result v4

    .line 832
    int-to-float v4, v4

    .line 833
    .line 834
    const/high16 v5, 0x3f800000    # 1.0f

    .line 835
    .line 836
    iget v6, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTwoLevelBottomPullUpToCloseRate:F

    .line 837
    sub-float/2addr v5, v6

    .line 838
    mul-float/2addr v4, v5

    .line 839
    .line 840
    cmpg-float v3, v3, v4

    .line 841
    .line 842
    if-gez v3, :cond_34

    .line 843
    .line 844
    iput-char v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragDirection:C

    .line 845
    .line 846
    iget-boolean v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSuperDispatchTouchEvent:Z

    .line 847
    return v1

    .line 848
    .line 849
    :cond_34
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 850
    .line 851
    if-eqz v2, :cond_35

    .line 852
    .line 853
    .line 854
    invoke-interface {v2, v1}, Lhb0/b;->a(Landroid/view/MotionEvent;)V

    .line 855
    :cond_35
    return v11

    .line 856
    :cond_36
    :goto_c
    return v10

    .line 857
    .line 858
    .line 859
    :cond_37
    :goto_d
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 860
    move-result v1

    .line 861
    return v1
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lhb0/b;->getView()Landroid/view/View;

    .line 8
    move-result-object v0

    .line 9
    :goto_0
    move-object v6, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :goto_1
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 15
    const/4 v7, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_8

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    if-ne v0, p2, :cond_8

    .line 24
    .line 25
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-eqz v0, :cond_7

    .line 32
    .line 33
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 39
    move-result v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_1
    if-eqz v6, :cond_8

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 49
    move-result v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    .line 53
    move-result v1

    .line 54
    add-int/2addr v0, v1

    .line 55
    .line 56
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 57
    add-int/2addr v0, v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 61
    move-result v1

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 65
    move-result v0

    .line 66
    .line 67
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderBackgroundColor:I

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPaint:Landroid/graphics/Paint;

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    .line 78
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    iget-boolean v1, v1, Lib0/b;->c:Z

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    .line 90
    move-result v0

    .line 91
    :cond_2
    :goto_2
    move v8, v0

    .line 92
    goto :goto_3

    .line 93
    .line 94
    :cond_3
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 95
    .line 96
    .line 97
    invoke-interface {v1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    sget-object v2, Lib0/b;->d:Lib0/b;

    .line 101
    .line 102
    if-ne v1, v2, :cond_2

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    .line 106
    move-result v0

    .line 107
    .line 108
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 109
    add-int/2addr v0, v1

    .line 110
    goto :goto_2

    .line 111
    .line 112
    .line 113
    :goto_3
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 114
    move-result v0

    .line 115
    int-to-float v2, v0

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 119
    move-result v0

    .line 120
    int-to-float v3, v0

    .line 121
    int-to-float v4, v8

    .line 122
    .line 123
    iget-object v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPaint:Landroid/graphics/Paint;

    .line 124
    const/4 v1, 0x0

    .line 125
    move-object v0, p1

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 129
    move v0, v8

    .line 130
    .line 131
    :cond_4
    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipHeaderWhenFixedBehind:Z

    .line 132
    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 136
    .line 137
    .line 138
    invoke-interface {v2}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 139
    move-result-object v2

    .line 140
    .line 141
    sget-object v3, Lib0/b;->f:Lib0/b;

    .line 142
    .line 143
    if-eq v2, v3, :cond_6

    .line 144
    .line 145
    :cond_5
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 146
    .line 147
    .line 148
    invoke-interface {v2}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    iget-boolean v2, v2, Lib0/b;->c:Z

    .line 152
    .line 153
    if-eqz v2, :cond_8

    .line 154
    .line 155
    .line 156
    :cond_6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 160
    move-result v2

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 164
    move-result v3

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 168
    move-result v4

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v2, v3, v4, v0}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 172
    .line 173
    .line 174
    invoke-super/range {p0 .. p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 175
    move-result v0

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 179
    return v0

    .line 180
    :cond_7
    :goto_4
    return v7

    .line 181
    .line 182
    :cond_8
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 183
    .line 184
    if-eqz v0, :cond_10

    .line 185
    .line 186
    .line 187
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    if-ne v0, p2, :cond_10

    .line 191
    .line 192
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 196
    move-result v0

    .line 197
    .line 198
    if-eqz v0, :cond_f

    .line 199
    .line 200
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    .line 201
    .line 202
    if-nez v0, :cond_9

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 206
    move-result v0

    .line 207
    .line 208
    if-eqz v0, :cond_9

    .line 209
    .line 210
    goto/16 :goto_7

    .line 211
    .line 212
    :cond_9
    if-eqz v6, :cond_10

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    .line 216
    move-result v0

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6}, Landroid/view/View;->getPaddingBottom()I

    .line 220
    move-result v2

    .line 221
    sub-int/2addr v0, v2

    .line 222
    .line 223
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 224
    add-int/2addr v0, v2

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    .line 228
    move-result v2

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 232
    move-result v0

    .line 233
    .line 234
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterBackgroundColor:I

    .line 235
    .line 236
    if-eqz v2, :cond_c

    .line 237
    .line 238
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPaint:Landroid/graphics/Paint;

    .line 239
    .line 240
    if-eqz v3, :cond_c

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 244
    .line 245
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 246
    .line 247
    .line 248
    invoke-interface {v2}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 249
    move-result-object v2

    .line 250
    .line 251
    iget-boolean v2, v2, Lib0/b;->c:Z

    .line 252
    .line 253
    if-eqz v2, :cond_b

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 257
    move-result v0

    .line 258
    :cond_a
    :goto_5
    move v6, v0

    .line 259
    goto :goto_6

    .line 260
    .line 261
    :cond_b
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 262
    .line 263
    .line 264
    invoke-interface {v2}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 265
    move-result-object v2

    .line 266
    .line 267
    sget-object v3, Lib0/b;->d:Lib0/b;

    .line 268
    .line 269
    if-ne v2, v3, :cond_a

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 273
    move-result v0

    .line 274
    .line 275
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 276
    add-int/2addr v0, v2

    .line 277
    goto :goto_5

    .line 278
    :goto_6
    int-to-float v2, v6

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 282
    move-result v0

    .line 283
    int-to-float v3, v0

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    .line 287
    move-result v0

    .line 288
    int-to-float v4, v0

    .line 289
    .line 290
    iget-object v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPaint:Landroid/graphics/Paint;

    .line 291
    const/4 v1, 0x0

    .line 292
    move-object v0, p1

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 296
    move v0, v6

    .line 297
    .line 298
    :cond_c
    iget-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipFooterWhenFixedBehind:Z

    .line 299
    .line 300
    if-eqz v2, :cond_d

    .line 301
    .line 302
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 303
    .line 304
    .line 305
    invoke-interface {v2}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 306
    move-result-object v2

    .line 307
    .line 308
    sget-object v3, Lib0/b;->f:Lib0/b;

    .line 309
    .line 310
    if-eq v2, v3, :cond_e

    .line 311
    .line 312
    :cond_d
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 313
    .line 314
    .line 315
    invoke-interface {v2}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 316
    move-result-object v2

    .line 317
    .line 318
    iget-boolean v2, v2, Lib0/b;->c:Z

    .line 319
    .line 320
    if-eqz v2, :cond_10

    .line 321
    .line 322
    .line 323
    :cond_e
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 324
    .line 325
    .line 326
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 327
    move-result v2

    .line 328
    .line 329
    .line 330
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 331
    move-result v3

    .line 332
    .line 333
    .line 334
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    .line 335
    move-result v4

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1, v2, v0, v3, v4}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 339
    .line 340
    .line 341
    invoke-super/range {p0 .. p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 342
    move-result v0

    .line 343
    .line 344
    .line 345
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 346
    return v0

    .line 347
    :cond_f
    :goto_7
    return v7

    .line 348
    .line 349
    .line 350
    :cond_10
    invoke-super/range {p0 .. p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 351
    move-result v0

    .line 352
    return v0
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method

.method public finishLoadMore()Lhb0/f;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishLoadMore(Z)Lhb0/f;

    move-result-object v0

    return-object v0
.end method

.method public finishLoadMore(I)Lhb0/f;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishLoadMore(IZZ)Lhb0/f;

    move-result-object p1

    return-object p1
.end method

.method public finishLoadMore(IZZ)Lhb0/f;
    .locals 4

    shr-int/lit8 v0, p1, 0x10

    shl-int/lit8 p1, p1, 0x10

    shr-int/lit8 p1, p1, 0x10

    .line 5
    new-instance v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;

    invoke-direct {v1, p0, v0, p3, p2}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;IZZ)V

    if-lez p1, :cond_0

    .line 6
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHandler:Landroid/os/Handler;

    int-to-long v2, p1

    invoke-virtual {p2, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p0

    .line 7
    :cond_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    return-object p0
.end method

.method public finishLoadMore(Z)Lhb0/f;
    .locals 4

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastOpenTime:J

    sub-long/2addr v0, v2

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    long-to-int v0, v0

    const/16 v1, 0x12c

    rsub-int v0, v0, 0x12c

    .line 4
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0, v0, p1, v2}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishLoadMore(IZZ)Lhb0/f;

    move-result-object p1

    return-object p1
.end method

.method public finishLoadMoreWithNoMoreData()Lhb0/f;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastOpenTime:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    .line 10
    const/16 v1, 0x12c

    .line 11
    .line 12
    rsub-int v0, v0, 0x12c

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 21
    move-result v0

    .line 22
    .line 23
    shl-int/lit8 v0, v0, 0x10

    .line 24
    const/4 v1, 0x1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0, v1, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishLoadMore(IZZ)Lhb0/f;

    .line 28
    move-result-object v0

    .line 29
    return-object v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method public finishRefresh()Lhb0/f;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishRefresh(Z)Lhb0/f;

    move-result-object v0

    return-object v0
.end method

.method public finishRefresh(I)Lhb0/f;
    .locals 2

    .line 2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishRefresh(IZLjava/lang/Boolean;)Lhb0/f;

    move-result-object p1

    return-object p1
.end method

.method public finishRefresh(IZLjava/lang/Boolean;)Lhb0/f;
    .locals 4

    shr-int/lit8 v0, p1, 0x10

    shl-int/lit8 p1, p1, 0x10

    shr-int/lit8 p1, p1, 0x10

    .line 7
    new-instance v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$g;

    invoke-direct {v1, p0, v0, p3, p2}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$g;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;ILjava/lang/Boolean;Z)V

    if-lez p1, :cond_0

    .line 8
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHandler:Landroid/os/Handler;

    int-to-long v2, p1

    invoke-virtual {p2, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p0

    .line 9
    :cond_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    return-object p0
.end method

.method public finishRefresh(Z)Lhb0/f;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastOpenTime:J

    sub-long/2addr v1, v3

    long-to-int p1, v1

    const/16 v1, 0x12c

    rsub-int p1, p1, 0x12c

    .line 4
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    shl-int/lit8 p1, p1, 0x10

    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishRefresh(IZLjava/lang/Boolean;)Lhb0/f;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, v0, v0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishRefresh(IZLjava/lang/Boolean;)Lhb0/f;

    move-result-object p1

    return-object p1
.end method

.method public finishRefreshWithNoMoreData()Lhb0/f;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastOpenTime:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    .line 10
    const/16 v1, 0x12c

    .line 11
    .line 12
    rsub-int v0, v0, 0x12c

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 21
    move-result v0

    .line 22
    .line 23
    shl-int/lit8 v0, v0, 0x10

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    const/4 v2, 0x1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0, v2, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishRefresh(IZLjava/lang/Boolean;)Lhb0/f;

    .line 30
    move-result-object v0

    .line 31
    return-object v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getLayout()Landroid/view/ViewGroup;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedParent:Landroidx/core/view/NestedScrollingParentHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingParentHelper;->getNestedScrollAxes()I

    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getRefreshFooter()Lhb0/c;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 3
    .line 4
    instance-of v1, v0, Lhb0/c;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lhb0/c;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getRefreshHeader()Lhb0/d;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 3
    .line 4
    instance-of v1, v0, Lhb0/d;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lhb0/d;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public getState()Lcom/scwang/smart/refresh/layout/constant/RefreshState;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public interceptAnimatorByAction(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-nez p1, :cond_5

    .line 4
    .line 5
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 11
    .line 12
    iget-boolean v2, p1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFinishing:Z

    .line 13
    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->TwoLevelReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 17
    .line 18
    if-eq p1, v2, :cond_3

    .line 19
    .line 20
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->RefreshReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 21
    .line 22
    if-eq p1, v2, :cond_3

    .line 23
    .line 24
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 25
    .line 26
    if-ne p1, v2, :cond_0

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_0
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 30
    .line 31
    if-ne p1, v2, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 34
    .line 35
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, v2}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_1
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 42
    .line 43
    if-ne p1, v2, :cond_2

    .line 44
    .line 45
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 46
    .line 47
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v2}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 51
    .line 52
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 53
    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 58
    .line 59
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 63
    .line 64
    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :goto_1
    return v0

    .line 67
    .line 68
    :cond_4
    :goto_2
    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animationRunnable:Ljava/lang/Runnable;

    .line 69
    .line 70
    :cond_5
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 71
    .line 72
    if-eqz p1, :cond_6

    .line 73
    return v0

    .line 74
    :cond_6
    const/4 p1, 0x0

    .line 75
    return p1
    .line 76
    .line 77
    .line 78
.end method

.method public isEnableRefreshOrLoadMore(Z)Z
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePureScrollMode:Z

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public isEnableTranslationContent(ZLhb0/a;)Z
    .locals 0
    .param p2    # Lhb0/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePureScrollMode:Z

    .line 5
    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    sget-object p2, Lib0/b;->f:Lib0/b;

    .line 15
    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public isLoading()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    .line 4
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableNestedScrolling:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public isRefreshing()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    .line 4
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public moveSpinnerInfinitely(F)V
    .locals 20

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-boolean v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedInProgress:Z

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-boolean v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMoreWhenContentNotFull:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    cmpg-float v1, p1, v2

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Lhb0/b;->g()Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    move v1, v2

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    move/from16 v1, p1

    .line 28
    .line 29
    :goto_0
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScreenHeightPixels:I

    .line 30
    .line 31
    mul-int/lit8 v3, v3, 0x5

    .line 32
    int-to-float v3, v3

    .line 33
    .line 34
    cmpl-float v3, v1, v3

    .line 35
    const/4 v4, 0x0

    .line 36
    .line 37
    if-lez v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    sget v3, Lcom/scwang/smart/refresh/layout/kernel/R$id;->srl_tag:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    if-nez v5, :cond_1

    .line 52
    .line 53
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchY:F

    .line 54
    .line 55
    iget v6, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScreenHeightPixels:I

    .line 56
    int-to-float v7, v6

    .line 57
    .line 58
    const/high16 v8, 0x40c00000    # 6.0f

    .line 59
    div-float/2addr v7, v8

    .line 60
    .line 61
    cmpg-float v5, v5, v7

    .line 62
    .line 63
    if-gez v5, :cond_1

    .line 64
    .line 65
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 66
    int-to-float v6, v6

    .line 67
    .line 68
    const/high16 v7, 0x41800000    # 16.0f

    .line 69
    div-float/2addr v6, v7

    .line 70
    .line 71
    cmpg-float v5, v5, v6

    .line 72
    .line 73
    if-gez v5, :cond_1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    move-result-object v5

    .line 78
    .line 79
    .line 80
    const-string/jumbo v6, "\u4f60\u8fd9\u4e48\u6b7b\u62c9\uff0c\u81e3\u59be\u505a\u4e0d\u5230\u554a\uff01"

    .line 81
    .line 82
    .line 83
    invoke-static {v5, v6, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v3, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 91
    .line 92
    :cond_1
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 93
    .line 94
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->TwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 95
    const/4 v6, 0x1

    .line 96
    .line 97
    if-ne v3, v5, :cond_2

    .line 98
    .line 99
    cmpl-float v5, v1, v2

    .line 100
    .line 101
    if-lez v5, :cond_2

    .line 102
    .line 103
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 104
    float-to-int v5, v1

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 108
    move-result v7

    .line 109
    .line 110
    .line 111
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 112
    move-result v5

    .line 113
    .line 114
    .line 115
    invoke-interface {v3, v5, v6}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 116
    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :cond_2
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 120
    .line 121
    const/high16 v7, 0x3f800000    # 1.0f

    .line 122
    .line 123
    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    .line 124
    .line 125
    if-ne v3, v5, :cond_5

    .line 126
    .line 127
    cmpl-float v5, v1, v2

    .line 128
    .line 129
    if-ltz v5, :cond_5

    .line 130
    .line 131
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 132
    int-to-float v5, v3

    .line 133
    .line 134
    cmpg-float v5, v1, v5

    .line 135
    .line 136
    if-gez v5, :cond_3

    .line 137
    .line 138
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 139
    float-to-int v5, v1

    .line 140
    .line 141
    .line 142
    invoke-interface {v3, v5, v6}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :cond_3
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 147
    sub-float/2addr v5, v7

    .line 148
    int-to-float v3, v3

    .line 149
    mul-float/2addr v5, v3

    .line 150
    float-to-double v14, v5

    .line 151
    .line 152
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScreenHeightPixels:I

    .line 153
    .line 154
    mul-int/lit8 v3, v3, 0x4

    .line 155
    .line 156
    div-int/lit8 v3, v3, 0x3

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 160
    move-result v5

    .line 161
    .line 162
    .line 163
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 164
    move-result v3

    .line 165
    .line 166
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 167
    sub-int/2addr v3, v5

    .line 168
    .line 169
    const-wide/16 v16, 0x0

    .line 170
    int-to-double v8, v3

    .line 171
    int-to-float v3, v5

    .line 172
    .line 173
    sub-float v3, v1, v3

    .line 174
    .line 175
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragRate:F

    .line 176
    mul-float/2addr v3, v5

    .line 177
    .line 178
    .line 179
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 180
    move-result v3

    .line 181
    .line 182
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 183
    float-to-double v12, v3

    .line 184
    neg-double v4, v12

    .line 185
    .line 186
    cmpl-double v3, v8, v16

    .line 187
    .line 188
    if-nez v3, :cond_4

    .line 189
    .line 190
    move-wide/from16 v8, v18

    .line 191
    :cond_4
    div-double/2addr v4, v8

    .line 192
    .line 193
    .line 194
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 195
    move-result-wide v3

    .line 196
    .line 197
    sub-double v3, v18, v3

    .line 198
    mul-double/2addr v14, v3

    .line 199
    .line 200
    .line 201
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->min(DD)D

    .line 202
    move-result-wide v3

    .line 203
    .line 204
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 205
    double-to-int v3, v3

    .line 206
    .line 207
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 208
    add-int/2addr v3, v4

    .line 209
    .line 210
    .line 211
    invoke-interface {v5, v3, v6}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :cond_5
    const-wide/16 v16, 0x0

    .line 216
    .line 217
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 218
    .line 219
    cmpg-float v4, v1, v2

    .line 220
    .line 221
    if-gez v4, :cond_a

    .line 222
    .line 223
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 224
    .line 225
    if-eq v3, v4, :cond_7

    .line 226
    .line 227
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 228
    .line 229
    if-eqz v3, :cond_6

    .line 230
    .line 231
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 232
    .line 233
    if-eqz v3, :cond_6

    .line 234
    .line 235
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 236
    .line 237
    if-eqz v3, :cond_6

    .line 238
    .line 239
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v3}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 243
    move-result v3

    .line 244
    .line 245
    if-nez v3, :cond_7

    .line 246
    .line 247
    :cond_6
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableAutoLoadMore:Z

    .line 248
    .line 249
    if-eqz v3, :cond_a

    .line 250
    .line 251
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 252
    .line 253
    if-nez v3, :cond_a

    .line 254
    .line 255
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v3}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 259
    move-result v3

    .line 260
    .line 261
    if-eqz v3, :cond_a

    .line 262
    .line 263
    :cond_7
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 264
    neg-int v4, v3

    .line 265
    int-to-float v4, v4

    .line 266
    .line 267
    cmpl-float v4, v1, v4

    .line 268
    .line 269
    if-lez v4, :cond_8

    .line 270
    .line 271
    iget-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 272
    float-to-int v4, v1

    .line 273
    .line 274
    .line 275
    invoke-interface {v3, v4, v6}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 276
    .line 277
    goto/16 :goto_1

    .line 278
    .line 279
    :cond_8
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 280
    sub-float/2addr v4, v7

    .line 281
    int-to-float v3, v3

    .line 282
    mul-float/2addr v4, v3

    .line 283
    float-to-double v3, v4

    .line 284
    .line 285
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScreenHeightPixels:I

    .line 286
    .line 287
    mul-int/lit8 v5, v5, 0x4

    .line 288
    .line 289
    div-int/lit8 v5, v5, 0x3

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 293
    move-result v7

    .line 294
    .line 295
    .line 296
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 297
    move-result v5

    .line 298
    .line 299
    iget v7, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 300
    sub-int/2addr v5, v7

    .line 301
    int-to-double v8, v5

    .line 302
    int-to-float v5, v7

    .line 303
    add-float/2addr v5, v1

    .line 304
    .line 305
    iget v7, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragRate:F

    .line 306
    mul-float/2addr v5, v7

    .line 307
    .line 308
    .line 309
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 310
    move-result v5

    .line 311
    neg-float v5, v5

    .line 312
    float-to-double v12, v5

    .line 313
    neg-double v14, v12

    .line 314
    .line 315
    cmpl-double v5, v8, v16

    .line 316
    .line 317
    if-nez v5, :cond_9

    .line 318
    .line 319
    move-wide/from16 v8, v18

    .line 320
    :cond_9
    div-double/2addr v14, v8

    .line 321
    .line 322
    .line 323
    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 324
    move-result-wide v7

    .line 325
    .line 326
    sub-double v7, v18, v7

    .line 327
    mul-double/2addr v3, v7

    .line 328
    .line 329
    .line 330
    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->min(DD)D

    .line 331
    move-result-wide v3

    .line 332
    neg-double v3, v3

    .line 333
    .line 334
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 335
    double-to-int v3, v3

    .line 336
    .line 337
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 338
    sub-int/2addr v3, v4

    .line 339
    .line 340
    .line 341
    invoke-interface {v5, v3, v6}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 342
    goto :goto_1

    .line 343
    .line 344
    :cond_a
    cmpl-float v3, v1, v2

    .line 345
    .line 346
    if-ltz v3, :cond_c

    .line 347
    .line 348
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 349
    .line 350
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 351
    int-to-float v4, v4

    .line 352
    mul-float/2addr v3, v4

    .line 353
    float-to-double v3, v3

    .line 354
    .line 355
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScreenHeightPixels:I

    .line 356
    .line 357
    div-int/lit8 v5, v5, 0x2

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 361
    move-result v7

    .line 362
    .line 363
    .line 364
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 365
    move-result v5

    .line 366
    int-to-double v7, v5

    .line 367
    .line 368
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragRate:F

    .line 369
    mul-float/2addr v5, v1

    .line 370
    .line 371
    .line 372
    invoke-static {v2, v5}, Ljava/lang/Math;->max(FF)F

    .line 373
    move-result v5

    .line 374
    float-to-double v12, v5

    .line 375
    neg-double v14, v12

    .line 376
    .line 377
    cmpl-double v5, v7, v16

    .line 378
    .line 379
    if-nez v5, :cond_b

    .line 380
    .line 381
    move-wide/from16 v7, v18

    .line 382
    :cond_b
    div-double/2addr v14, v7

    .line 383
    .line 384
    .line 385
    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 386
    move-result-wide v7

    .line 387
    .line 388
    sub-double v7, v18, v7

    .line 389
    mul-double/2addr v3, v7

    .line 390
    .line 391
    .line 392
    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->min(DD)D

    .line 393
    move-result-wide v3

    .line 394
    .line 395
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 396
    double-to-int v3, v3

    .line 397
    .line 398
    .line 399
    invoke-interface {v5, v3, v6}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 400
    goto :goto_1

    .line 401
    .line 402
    :cond_c
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 403
    .line 404
    iget v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 405
    int-to-float v4, v4

    .line 406
    mul-float/2addr v3, v4

    .line 407
    float-to-double v3, v3

    .line 408
    .line 409
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScreenHeightPixels:I

    .line 410
    .line 411
    div-int/lit8 v5, v5, 0x2

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 415
    move-result v7

    .line 416
    .line 417
    .line 418
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 419
    move-result v5

    .line 420
    int-to-double v7, v5

    .line 421
    .line 422
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragRate:F

    .line 423
    mul-float/2addr v5, v1

    .line 424
    .line 425
    .line 426
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 427
    move-result v5

    .line 428
    neg-float v5, v5

    .line 429
    float-to-double v12, v5

    .line 430
    neg-double v14, v12

    .line 431
    .line 432
    cmpl-double v5, v7, v16

    .line 433
    .line 434
    if-nez v5, :cond_d

    .line 435
    .line 436
    move-wide/from16 v7, v18

    .line 437
    :cond_d
    div-double/2addr v14, v7

    .line 438
    .line 439
    .line 440
    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 441
    move-result-wide v7

    .line 442
    .line 443
    sub-double v7, v18, v7

    .line 444
    mul-double/2addr v3, v7

    .line 445
    .line 446
    .line 447
    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->min(DD)D

    .line 448
    move-result-wide v3

    .line 449
    neg-double v3, v3

    .line 450
    .line 451
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 452
    double-to-int v3, v3

    .line 453
    .line 454
    .line 455
    invoke-interface {v5, v3, v6}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 456
    .line 457
    :goto_1
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableAutoLoadMore:Z

    .line 458
    .line 459
    if-eqz v3, :cond_f

    .line 460
    .line 461
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 462
    .line 463
    if-nez v3, :cond_f

    .line 464
    .line 465
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v3}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 469
    move-result v3

    .line 470
    .line 471
    if-eqz v3, :cond_f

    .line 472
    .line 473
    cmpg-float v1, v1, v2

    .line 474
    .line 475
    if-gez v1, :cond_f

    .line 476
    .line 477
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 478
    .line 479
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 480
    .line 481
    if-eq v1, v2, :cond_f

    .line 482
    .line 483
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 484
    .line 485
    if-eq v1, v2, :cond_f

    .line 486
    .line 487
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadFinish:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 488
    .line 489
    if-eq v1, v2, :cond_f

    .line 490
    .line 491
    iget-boolean v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenLoading:Z

    .line 492
    .line 493
    if-eqz v1, :cond_e

    .line 494
    const/4 v1, 0x0

    .line 495
    .line 496
    iput-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animationRunnable:Ljava/lang/Runnable;

    .line 497
    .line 498
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 499
    .line 500
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 501
    neg-int v2, v2

    .line 502
    .line 503
    .line 504
    invoke-interface {v1, v2}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 505
    :cond_e
    const/4 v1, 0x0

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setStateDirectLoading(Z)V

    .line 509
    .line 510
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHandler:Landroid/os/Handler;

    .line 511
    .line 512
    new-instance v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$f;

    .line 513
    .line 514
    .line 515
    invoke-direct {v2, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$f;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;)V

    .line 516
    .line 517
    iget v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    .line 518
    int-to-long v3, v3

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 522
    :cond_f
    return-void
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
.end method

.method public notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    .line 4
    if-eq v0, p1, :cond_2

    .line 5
    .line 6
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, p0, v0, p1}, Ljb0/i;->onStateChanged(Lhb0/f;Lcom/scwang/smart/refresh/layout/constant/RefreshState;Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 18
    .line 19
    :cond_0
    if-eqz v2, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v2, p0, v0, p1}, Ljb0/i;->onStateChanged(Lhb0/f;Lcom/scwang/smart/refresh/layout/constant/RefreshState;Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadFinish:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 25
    .line 26
    if-ne p1, v0, :cond_3

    .line 27
    const/4 p1, 0x0

    .line 28
    .line 29
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 30
    return-void

    .line 31
    .line 32
    :cond_2
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 33
    .line 34
    if-eq p1, v0, :cond_3

    .line 35
    .line 36
    iput-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 37
    :cond_3
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public onAttachedToWindow()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-nez v1, :cond_a

    .line 13
    .line 14
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sHeaderCreator:Ljb0/c;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v2, p0}, Ljb0/c;->a(Landroid/content/Context;Lhb0/f;)Lhb0/d;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setRefreshHeader(Lhb0/d;)Lhb0/f;

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 37
    .line 38
    const-string v1, "DefaultRefreshHeaderCreator can not return null"

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 42
    throw v0

    .line 43
    .line 44
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 45
    const/4 v2, 0x0

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    goto :goto_2

    .line 49
    .line 50
    :cond_2
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 51
    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    .line 55
    .line 56
    if-nez v1, :cond_3

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move v0, v2

    .line 59
    .line 60
    :cond_4
    :goto_1
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 61
    .line 62
    :goto_2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 63
    .line 64
    if-nez v0, :cond_8

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 68
    move-result v0

    .line 69
    move v1, v2

    .line 70
    .line 71
    :goto_3
    if-ge v1, v0, :cond_8

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 75
    move-result-object v3

    .line 76
    .line 77
    iget-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 78
    .line 79
    if-eqz v4, :cond_5

    .line 80
    .line 81
    .line 82
    invoke-interface {v4}, Lhb0/a;->getView()Landroid/view/View;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    if-eq v3, v4, :cond_7

    .line 86
    .line 87
    :cond_5
    iget-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 88
    .line 89
    if-eqz v4, :cond_6

    .line 90
    .line 91
    .line 92
    invoke-interface {v4}, Lhb0/a;->getView()Landroid/view/View;

    .line 93
    move-result-object v4

    .line 94
    .line 95
    if-eq v3, v4, :cond_7

    .line 96
    .line 97
    :cond_6
    new-instance v4, Lmb0/a;

    .line 98
    .line 99
    .line 100
    invoke-direct {v4, v3}, Lmb0/a;-><init>(Landroid/view/View;)V

    .line 101
    .line 102
    iput-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 103
    .line 104
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 105
    goto :goto_3

    .line 106
    .line 107
    :cond_8
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 108
    .line 109
    if-nez v0, :cond_9

    .line 110
    .line 111
    const/high16 v0, 0x41a00000    # 20.0f

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Llb0/b;->c(F)I

    .line 115
    move-result v1

    .line 116
    .line 117
    new-instance v3, Landroid/widget/TextView;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    .line 124
    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    const v4, -0x9a00

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 131
    .line 132
    const/16 v4, 0x11

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 139
    .line 140
    sget v0, Lcom/scwang/smart/refresh/layout/kernel/R$string;->srl_content_empty:I

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    .line 144
    .line 145
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    .line 146
    const/4 v4, -0x1

    .line 147
    .line 148
    .line 149
    invoke-direct {v0, v4, v4}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;-><init>(II)V

    .line 150
    .line 151
    .line 152
    invoke-super {p0, v3, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 153
    .line 154
    new-instance v0, Lmb0/a;

    .line 155
    .line 156
    .line 157
    invoke-direct {v0, v3}, Lmb0/a;-><init>(Landroid/view/View;)V

    .line 158
    .line 159
    iput-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 160
    .line 161
    .line 162
    invoke-interface {v0}, Lhb0/b;->getView()Landroid/view/View;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 167
    .line 168
    :cond_9
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedHeaderViewId:I

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedFooterViewId:I

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 181
    .line 182
    iget-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScrollBoundaryDecider:Ljb0/j;

    .line 183
    .line 184
    .line 185
    invoke-interface {v3, v4}, Lhb0/b;->b(Ljb0/j;)V

    .line 186
    .line 187
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 188
    .line 189
    iget-boolean v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMoreWhenContentNotFull:Z

    .line 190
    .line 191
    .line 192
    invoke-interface {v3, v4}, Lhb0/b;->c(Z)V

    .line 193
    .line 194
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 195
    .line 196
    iget-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 197
    .line 198
    .line 199
    invoke-interface {v3, v4, v0, v1}, Lhb0/b;->f(Lhb0/e;Landroid/view/View;Landroid/view/View;)V

    .line 200
    .line 201
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 202
    .line 203
    if-eqz v0, :cond_a

    .line 204
    .line 205
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 209
    .line 210
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 211
    .line 212
    iput v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 213
    .line 214
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTranslationViewId:I

    .line 215
    .line 216
    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTranslationViewId:I

    .line 217
    .line 218
    .line 219
    invoke-interface {v0, v2, v1, v3}, Lhb0/b;->e(III)V

    .line 220
    .line 221
    :cond_a
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPrimaryColors:[I

    .line 222
    .line 223
    if-eqz v0, :cond_c

    .line 224
    .line 225
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 226
    .line 227
    if-eqz v1, :cond_b

    .line 228
    .line 229
    .line 230
    invoke-interface {v1, v0}, Lhb0/a;->setPrimaryColors([I)V

    .line 231
    .line 232
    :cond_b
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 233
    .line 234
    if-eqz v0, :cond_c

    .line 235
    .line 236
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPrimaryColors:[I

    .line 237
    .line 238
    .line 239
    invoke-interface {v0, v1}, Lhb0/a;->setPrimaryColors([I)V

    .line 240
    .line 241
    :cond_c
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 242
    .line 243
    if-eqz v0, :cond_d

    .line 244
    .line 245
    .line 246
    invoke-interface {v0}, Lhb0/b;->getView()Landroid/view/View;

    .line 247
    move-result-object v0

    .line 248
    .line 249
    .line 250
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    .line 251
    .line 252
    :cond_d
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 253
    .line 254
    if-eqz v0, :cond_e

    .line 255
    .line 256
    .line 257
    invoke-interface {v0}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 258
    move-result-object v0

    .line 259
    .line 260
    iget-boolean v0, v0, Lib0/b;->b:Z

    .line 261
    .line 262
    if-eqz v0, :cond_e

    .line 263
    .line 264
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 265
    .line 266
    .line 267
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    .line 268
    move-result-object v0

    .line 269
    .line 270
    .line 271
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    .line 272
    .line 273
    :cond_e
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 274
    .line 275
    if-eqz v0, :cond_f

    .line 276
    .line 277
    .line 278
    invoke-interface {v0}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 279
    move-result-object v0

    .line 280
    .line 281
    iget-boolean v0, v0, Lib0/b;->b:Z

    .line 282
    .line 283
    if-eqz v0, :cond_f

    .line 284
    .line 285
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 286
    .line 287
    .line 288
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    .line 289
    move-result-object v0

    .line 290
    .line 291
    .line 292
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    .line 293
    :cond_f
    return-void
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public onDetachedFromWindow()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animationRunnable:Ljava/lang/Runnable;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Landroid/animation/Animator;->removeAllListeners()V

    .line 20
    .line 21
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 25
    .line 26
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->cancel()V

    .line 37
    .line 38
    iput-object v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    :cond_0
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iget-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 45
    .line 46
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-interface {v3, p0, v0}, Lhb0/a;->onFinish(Lhb0/f;Z)I

    .line 52
    .line 53
    :cond_1
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    iget-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 58
    .line 59
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 60
    .line 61
    if-ne v4, v5, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-interface {v3, p0, v0}, Lhb0/a;->onFinish(Lhb0/f;Z)I

    .line 65
    .line 66
    :cond_2
    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 67
    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 71
    .line 72
    .line 73
    invoke-interface {v3, v0, v1}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 74
    .line 75
    :cond_3
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 76
    .line 77
    sget-object v3, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 78
    .line 79
    if-eq v1, v3, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v3}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 83
    .line 84
    :cond_4
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHandler:Landroid/os/Handler;

    .line 85
    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 90
    .line 91
    :cond_5
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 92
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public onFinishInflate()V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x3

    .line 9
    .line 10
    if-gt v0, v1, :cond_11

    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    move v5, v2

    .line 14
    move v4, v3

    .line 15
    move v6, v4

    .line 16
    :goto_0
    const/4 v7, 0x2

    .line 17
    const/4 v8, 0x1

    .line 18
    .line 19
    if-ge v4, v0, :cond_4

    .line 20
    .line 21
    .line 22
    invoke-super {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    move-result-object v9

    .line 24
    .line 25
    .line 26
    invoke-static {v9}, Llb0/b;->e(Landroid/view/View;)Z

    .line 27
    move-result v10

    .line 28
    .line 29
    if-eqz v10, :cond_1

    .line 30
    .line 31
    if-lt v6, v7, :cond_0

    .line 32
    .line 33
    if-ne v4, v8, :cond_1

    .line 34
    :cond_0
    move v5, v4

    .line 35
    move v6, v7

    .line 36
    goto :goto_2

    .line 37
    .line 38
    :cond_1
    instance-of v7, v9, Lhb0/a;

    .line 39
    .line 40
    if-nez v7, :cond_3

    .line 41
    .line 42
    if-ge v6, v8, :cond_3

    .line 43
    .line 44
    if-lez v4, :cond_2

    .line 45
    move v6, v8

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v6, v3

    .line 48
    :goto_1
    move v5, v4

    .line 49
    .line 50
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_4
    if-ltz v5, :cond_7

    .line 54
    .line 55
    new-instance v4, Lmb0/a;

    .line 56
    .line 57
    .line 58
    invoke-super {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 59
    move-result-object v6

    .line 60
    .line 61
    .line 62
    invoke-direct {v4, v6}, Lmb0/a;-><init>(Landroid/view/View;)V

    .line 63
    .line 64
    iput-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 65
    .line 66
    if-ne v5, v8, :cond_6

    .line 67
    .line 68
    if-ne v0, v1, :cond_5

    .line 69
    :goto_3
    move v1, v3

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    move v7, v2

    .line 72
    goto :goto_3

    .line 73
    .line 74
    :cond_6
    if-ne v0, v7, :cond_7

    .line 75
    move v1, v2

    .line 76
    move v7, v8

    .line 77
    goto :goto_4

    .line 78
    :cond_7
    move v1, v2

    .line 79
    move v7, v1

    .line 80
    :goto_4
    move v4, v3

    .line 81
    .line 82
    :goto_5
    if-ge v4, v0, :cond_10

    .line 83
    .line 84
    .line 85
    invoke-super {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 86
    move-result-object v5

    .line 87
    .line 88
    if-eq v4, v1, :cond_d

    .line 89
    .line 90
    if-eq v4, v7, :cond_8

    .line 91
    .line 92
    if-ne v1, v2, :cond_8

    .line 93
    .line 94
    iget-object v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 95
    .line 96
    if-nez v6, :cond_8

    .line 97
    .line 98
    instance-of v6, v5, Lhb0/d;

    .line 99
    .line 100
    if-eqz v6, :cond_8

    .line 101
    goto :goto_9

    .line 102
    .line 103
    :cond_8
    if-eq v4, v7, :cond_9

    .line 104
    .line 105
    if-ne v7, v2, :cond_f

    .line 106
    .line 107
    instance-of v6, v5, Lhb0/c;

    .line 108
    .line 109
    if-eqz v6, :cond_f

    .line 110
    .line 111
    :cond_9
    iget-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 112
    .line 113
    if-nez v6, :cond_b

    .line 114
    .line 115
    iget-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    .line 116
    .line 117
    if-nez v6, :cond_a

    .line 118
    goto :goto_6

    .line 119
    :cond_a
    move v6, v3

    .line 120
    goto :goto_7

    .line 121
    :cond_b
    :goto_6
    move v6, v8

    .line 122
    .line 123
    :goto_7
    iput-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 124
    .line 125
    instance-of v6, v5, Lhb0/c;

    .line 126
    .line 127
    if-eqz v6, :cond_c

    .line 128
    .line 129
    check-cast v5, Lhb0/c;

    .line 130
    goto :goto_8

    .line 131
    .line 132
    :cond_c
    new-instance v6, Lcom/scwang/smart/refresh/layout/wrapper/RefreshFooterWrapper;

    .line 133
    .line 134
    .line 135
    invoke-direct {v6, v5}, Lcom/scwang/smart/refresh/layout/wrapper/RefreshFooterWrapper;-><init>(Landroid/view/View;)V

    .line 136
    move-object v5, v6

    .line 137
    .line 138
    :goto_8
    iput-object v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 139
    goto :goto_b

    .line 140
    .line 141
    :cond_d
    :goto_9
    instance-of v6, v5, Lhb0/d;

    .line 142
    .line 143
    if-eqz v6, :cond_e

    .line 144
    .line 145
    check-cast v5, Lhb0/d;

    .line 146
    goto :goto_a

    .line 147
    .line 148
    :cond_e
    new-instance v6, Lcom/scwang/smart/refresh/layout/wrapper/RefreshHeaderWrapper;

    .line 149
    .line 150
    .line 151
    invoke-direct {v6, v5}, Lcom/scwang/smart/refresh/layout/wrapper/RefreshHeaderWrapper;-><init>(Landroid/view/View;)V

    .line 152
    move-object v5, v6

    .line 153
    .line 154
    :goto_a
    iput-object v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 155
    .line 156
    :cond_f
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 157
    goto :goto_5

    .line 158
    :cond_10
    return-void

    .line 159
    .line 160
    :cond_11
    new-instance v0, Ljava/lang/RuntimeException;

    .line 161
    .line 162
    .line 163
    const-string/jumbo v1, "\u6700\u591a\u53ea\u652f\u63013\u4e2a\u5b50View\uff0cMost only support three sub view"

    .line 164
    .line 165
    .line 166
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 167
    throw v0
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public onLayout(ZIIII)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 8
    move-result p2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    move-result p3

    .line 16
    const/4 p4, 0x0

    .line 17
    move p5, p4

    .line 18
    .line 19
    :goto_0
    if-ge p5, p3, :cond_13

    .line 20
    .line 21
    .line 22
    invoke-super {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 27
    move-result v1

    .line 28
    .line 29
    const/16 v2, 0x8

    .line 30
    .line 31
    if-eq v1, v2, :cond_12

    .line 32
    .line 33
    sget v1, Lcom/scwang/smart/refresh/layout/kernel/R$id;->srl_tag:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    const-string v2, "GONE"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    move-result v1

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    goto/16 :goto_c

    .line 48
    .line 49
    :cond_0
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 50
    const/4 v2, 0x1

    .line 51
    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Lhb0/b;->getView()Landroid/view/View;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    if-ne v1, v0, :cond_4

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 79
    .line 80
    if-eqz v1, :cond_1

    .line 81
    move v1, v2

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move v1, p4

    .line 84
    .line 85
    :goto_1
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 86
    .line 87
    .line 88
    invoke-interface {v3}, Lhb0/b;->getView()Landroid/view/View;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 93
    move-result-object v4

    .line 94
    .line 95
    instance-of v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 96
    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 100
    goto :goto_2

    .line 101
    .line 102
    :cond_2
    sget-object v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 103
    .line 104
    :goto_2
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 105
    add-int/2addr v5, p1

    .line 106
    .line 107
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 108
    add-int/2addr v4, p2

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 112
    move-result v6

    .line 113
    add-int/2addr v6, v5

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 117
    move-result v7

    .line 118
    add-int/2addr v7, v4

    .line 119
    .line 120
    if-eqz v1, :cond_3

    .line 121
    .line 122
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableHeaderTranslationContent:Z

    .line 123
    .line 124
    iget-object v8, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v1, v8}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableTranslationContent(ZLhb0/a;)Z

    .line 128
    move-result v1

    .line 129
    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 133
    add-int/2addr v4, v1

    .line 134
    add-int/2addr v7, v1

    .line 135
    .line 136
    .line 137
    :cond_3
    invoke-virtual {v3, v5, v4, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 138
    .line 139
    :cond_4
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 140
    .line 141
    if-eqz v1, :cond_8

    .line 142
    .line 143
    .line 144
    invoke-interface {v1}, Lhb0/a;->getView()Landroid/view/View;

    .line 145
    move-result-object v1

    .line 146
    .line 147
    if-ne v1, v0, :cond_8

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 151
    move-result v1

    .line 152
    .line 153
    if-eqz v1, :cond_5

    .line 154
    .line 155
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    .line 156
    .line 157
    if-eqz v1, :cond_5

    .line 158
    .line 159
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 163
    move-result v1

    .line 164
    .line 165
    if-eqz v1, :cond_5

    .line 166
    move v1, v2

    .line 167
    goto :goto_3

    .line 168
    :cond_5
    move v1, p4

    .line 169
    .line 170
    :goto_3
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 171
    .line 172
    .line 173
    invoke-interface {v3}, Lhb0/a;->getView()Landroid/view/View;

    .line 174
    move-result-object v3

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 178
    move-result-object v4

    .line 179
    .line 180
    instance-of v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 181
    .line 182
    if-eqz v5, :cond_6

    .line 183
    .line 184
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 185
    goto :goto_4

    .line 186
    .line 187
    :cond_6
    sget-object v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 188
    .line 189
    :goto_4
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 190
    .line 191
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 192
    .line 193
    iget v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderInsetStart:I

    .line 194
    add-int/2addr v4, v6

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 198
    move-result v6

    .line 199
    add-int/2addr v6, v5

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 203
    move-result v7

    .line 204
    add-int/2addr v7, v4

    .line 205
    .line 206
    if-nez v1, :cond_7

    .line 207
    .line 208
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 209
    .line 210
    .line 211
    invoke-interface {v1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 212
    move-result-object v1

    .line 213
    .line 214
    sget-object v8, Lib0/b;->d:Lib0/b;

    .line 215
    .line 216
    if-ne v1, v8, :cond_7

    .line 217
    .line 218
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 219
    sub-int/2addr v4, v1

    .line 220
    sub-int/2addr v7, v1

    .line 221
    .line 222
    .line 223
    :cond_7
    invoke-virtual {v3, v5, v4, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 224
    .line 225
    :cond_8
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 226
    .line 227
    if-eqz v1, :cond_12

    .line 228
    .line 229
    .line 230
    invoke-interface {v1}, Lhb0/a;->getView()Landroid/view/View;

    .line 231
    move-result-object v1

    .line 232
    .line 233
    if-ne v1, v0, :cond_12

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 237
    move-result v0

    .line 238
    .line 239
    if-eqz v0, :cond_9

    .line 240
    .line 241
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    .line 242
    .line 243
    if-eqz v0, :cond_9

    .line 244
    .line 245
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 249
    move-result v0

    .line 250
    .line 251
    if-eqz v0, :cond_9

    .line 252
    goto :goto_5

    .line 253
    :cond_9
    move v2, p4

    .line 254
    .line 255
    :goto_5
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 256
    .line 257
    .line 258
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    .line 259
    move-result-object v0

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 263
    move-result-object v1

    .line 264
    .line 265
    instance-of v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 266
    .line 267
    if-eqz v3, :cond_a

    .line 268
    .line 269
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 270
    goto :goto_6

    .line 271
    .line 272
    :cond_a
    sget-object v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 273
    .line 274
    :goto_6
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 275
    .line 276
    .line 277
    invoke-interface {v3}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 278
    move-result-object v3

    .line 279
    .line 280
    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 281
    .line 282
    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 286
    move-result v6

    .line 287
    add-int/2addr v5, v6

    .line 288
    .line 289
    iget v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterInsetStart:I

    .line 290
    sub-int/2addr v5, v6

    .line 291
    .line 292
    iget-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 293
    .line 294
    if-eqz v6, :cond_c

    .line 295
    .line 296
    iget-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 297
    .line 298
    if-eqz v6, :cond_c

    .line 299
    .line 300
    iget-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 301
    .line 302
    if-eqz v6, :cond_c

    .line 303
    .line 304
    iget-object v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 305
    .line 306
    if-eqz v6, :cond_c

    .line 307
    .line 308
    iget-object v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 309
    .line 310
    .line 311
    invoke-interface {v6}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 312
    move-result-object v6

    .line 313
    .line 314
    sget-object v7, Lib0/b;->d:Lib0/b;

    .line 315
    .line 316
    if-ne v6, v7, :cond_c

    .line 317
    .line 318
    iget-boolean v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0, v6}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 322
    move-result v6

    .line 323
    .line 324
    if-eqz v6, :cond_c

    .line 325
    .line 326
    iget-object v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 327
    .line 328
    .line 329
    invoke-interface {v5}, Lhb0/b;->getView()Landroid/view/View;

    .line 330
    move-result-object v5

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 334
    move-result-object v6

    .line 335
    .line 336
    instance-of v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 337
    .line 338
    if-eqz v7, :cond_b

    .line 339
    .line 340
    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 341
    .line 342
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 343
    goto :goto_7

    .line 344
    :cond_b
    move v6, p4

    .line 345
    .line 346
    :goto_7
    add-int v7, p2, p2

    .line 347
    add-int/2addr v7, v6

    .line 348
    .line 349
    .line 350
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 351
    move-result v5

    .line 352
    add-int/2addr v5, v7

    .line 353
    .line 354
    :cond_c
    sget-object v6, Lib0/b;->h:Lib0/b;

    .line 355
    .line 356
    if-ne v3, v6, :cond_d

    .line 357
    .line 358
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 359
    .line 360
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterInsetStart:I

    .line 361
    .line 362
    sub-int v5, v1, v2

    .line 363
    goto :goto_b

    .line 364
    .line 365
    :cond_d
    if-nez v2, :cond_10

    .line 366
    .line 367
    sget-object v1, Lib0/b;->g:Lib0/b;

    .line 368
    .line 369
    if-eq v3, v1, :cond_10

    .line 370
    .line 371
    sget-object v1, Lib0/b;->f:Lib0/b;

    .line 372
    .line 373
    if-ne v3, v1, :cond_e

    .line 374
    goto :goto_a

    .line 375
    .line 376
    :cond_e
    iget-boolean v1, v3, Lib0/b;->c:Z

    .line 377
    .line 378
    if-eqz v1, :cond_11

    .line 379
    .line 380
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 381
    .line 382
    if-gez v1, :cond_11

    .line 383
    .line 384
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 388
    move-result v1

    .line 389
    .line 390
    if-eqz v1, :cond_f

    .line 391
    .line 392
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 393
    neg-int v1, v1

    .line 394
    goto :goto_8

    .line 395
    :cond_f
    move v1, p4

    .line 396
    .line 397
    .line 398
    :goto_8
    invoke-static {v1, p4}, Ljava/lang/Math;->max(II)I

    .line 399
    move-result v1

    .line 400
    :goto_9
    sub-int/2addr v5, v1

    .line 401
    goto :goto_b

    .line 402
    .line 403
    :cond_10
    :goto_a
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 404
    goto :goto_9

    .line 405
    .line 406
    .line 407
    :cond_11
    :goto_b
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 408
    move-result v1

    .line 409
    add-int/2addr v1, v4

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 413
    move-result v2

    .line 414
    add-int/2addr v2, v5

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v4, v5, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 418
    .line 419
    :cond_12
    :goto_c
    add-int/lit8 p5, p5, 0x1

    .line 420
    .line 421
    goto/16 :goto_0

    .line 422
    :cond_13
    return-void
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
.end method

.method public onMeasure(II)V
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    move/from16 v2, p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 10
    move-result v3

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    iget-boolean v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePreviewInEditMode:Z

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    const/4 v3, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-super {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    move-result v6

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    .line 27
    :goto_1
    if-ge v7, v6, :cond_21

    .line 28
    .line 29
    .line 30
    invoke-super {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    move-result-object v9

    .line 32
    .line 33
    .line 34
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 35
    move-result v10

    .line 36
    .line 37
    const/16 v11, 0x8

    .line 38
    .line 39
    if-eq v10, v11, :cond_1

    .line 40
    .line 41
    sget v10, Lcom/scwang/smart/refresh/layout/kernel/R$id;->srl_tag:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {v9, v10}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    move-result-object v10

    .line 46
    .line 47
    const-string v11, "GONE"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    move-result v10

    .line 52
    .line 53
    if-eqz v10, :cond_2

    .line 54
    :cond_1
    const/4 v12, 0x0

    .line 55
    .line 56
    goto/16 :goto_14

    .line 57
    .line 58
    :cond_2
    iget-object v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 59
    .line 60
    if-eqz v10, :cond_e

    .line 61
    .line 62
    .line 63
    invoke-interface {v10}, Lhb0/a;->getView()Landroid/view/View;

    .line 64
    move-result-object v10

    .line 65
    .line 66
    if-ne v10, v9, :cond_e

    .line 67
    .line 68
    iget-object v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 69
    .line 70
    .line 71
    invoke-interface {v10}, Lhb0/a;->getView()Landroid/view/View;

    .line 72
    move-result-object v10

    .line 73
    .line 74
    .line 75
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 76
    move-result-object v15

    .line 77
    .line 78
    instance-of v4, v15, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    move-object v4, v15

    .line 82
    .line 83
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 84
    goto :goto_2

    .line 85
    .line 86
    :cond_3
    sget-object v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 87
    .line 88
    :goto_2
    iget v11, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 89
    .line 90
    iget v14, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 91
    add-int/2addr v11, v14

    .line 92
    .line 93
    iget v14, v15, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v11, v14}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 97
    move-result v11

    .line 98
    .line 99
    iget v14, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 100
    .line 101
    iget-object v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 102
    .line 103
    iget v5, v12, Lib0/a;->a:I

    .line 104
    .line 105
    sget-object v13, Lib0/a;->i:Lib0/a;

    .line 106
    .line 107
    iget v13, v13, Lib0/a;->a:I

    .line 108
    .line 109
    if-ge v5, v13, :cond_8

    .line 110
    .line 111
    iget v5, v15, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 112
    .line 113
    if-lez v5, :cond_5

    .line 114
    .line 115
    iget v13, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 116
    add-int/2addr v5, v13

    .line 117
    .line 118
    iget v13, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 119
    add-int/2addr v5, v13

    .line 120
    .line 121
    sget-object v13, Lib0/a;->g:Lib0/a;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v13}, Lib0/a;->a(Lib0/a;)Z

    .line 125
    move-result v12

    .line 126
    .line 127
    if-eqz v12, :cond_4

    .line 128
    .line 129
    iget v12, v15, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 130
    .line 131
    iget v14, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 132
    add-int/2addr v12, v14

    .line 133
    .line 134
    iget v14, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 135
    add-int/2addr v12, v14

    .line 136
    .line 137
    iput v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 138
    .line 139
    iput-object v13, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 140
    :cond_4
    move v14, v5

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    const/4 v12, -0x2

    .line 143
    .line 144
    if-ne v5, v12, :cond_8

    .line 145
    .line 146
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 147
    .line 148
    .line 149
    invoke-interface {v5}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 150
    move-result-object v5

    .line 151
    .line 152
    sget-object v12, Lib0/b;->h:Lib0/b;

    .line 153
    .line 154
    if-ne v5, v12, :cond_6

    .line 155
    .line 156
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 157
    .line 158
    iget-boolean v5, v5, Lib0/a;->b:Z

    .line 159
    .line 160
    if-nez v5, :cond_8

    .line 161
    .line 162
    .line 163
    :cond_6
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 164
    move-result v5

    .line 165
    .line 166
    iget v12, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 167
    sub-int/2addr v5, v12

    .line 168
    .line 169
    iget v12, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 170
    sub-int/2addr v5, v12

    .line 171
    const/4 v12, 0x0

    .line 172
    .line 173
    .line 174
    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    .line 175
    move-result v5

    .line 176
    .line 177
    const/high16 v12, -0x80000000

    .line 178
    .line 179
    .line 180
    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 181
    move-result v13

    .line 182
    .line 183
    .line 184
    invoke-virtual {v10, v11, v13}, Landroid/view/View;->measure(II)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 188
    move-result v12

    .line 189
    .line 190
    if-lez v12, :cond_8

    .line 191
    .line 192
    if-eq v12, v5, :cond_7

    .line 193
    .line 194
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 195
    .line 196
    sget-object v13, Lib0/a;->e:Lib0/a;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v13}, Lib0/a;->a(Lib0/a;)Z

    .line 200
    move-result v5

    .line 201
    .line 202
    if-eqz v5, :cond_7

    .line 203
    .line 204
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 205
    add-int/2addr v12, v5

    .line 206
    .line 207
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 208
    add-int/2addr v12, v5

    .line 209
    .line 210
    iput v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 211
    .line 212
    iput-object v13, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 213
    :cond_7
    const/4 v14, -0x1

    .line 214
    .line 215
    :cond_8
    :goto_3
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 216
    .line 217
    .line 218
    invoke-interface {v5}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 219
    move-result-object v5

    .line 220
    .line 221
    sget-object v12, Lib0/b;->h:Lib0/b;

    .line 222
    .line 223
    if-ne v5, v12, :cond_9

    .line 224
    .line 225
    .line 226
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 227
    move-result v14

    .line 228
    const/4 v5, -0x1

    .line 229
    const/4 v12, 0x0

    .line 230
    goto :goto_7

    .line 231
    .line 232
    :cond_9
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 233
    .line 234
    .line 235
    invoke-interface {v5}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 236
    move-result-object v5

    .line 237
    .line 238
    iget-boolean v5, v5, Lib0/b;->c:Z

    .line 239
    .line 240
    if-eqz v5, :cond_b

    .line 241
    .line 242
    if-nez v3, :cond_b

    .line 243
    .line 244
    iget-boolean v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v5}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 248
    move-result v5

    .line 249
    .line 250
    if-eqz v5, :cond_a

    .line 251
    .line 252
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 253
    :goto_4
    const/4 v12, 0x0

    .line 254
    goto :goto_5

    .line 255
    :cond_a
    const/4 v5, 0x0

    .line 256
    goto :goto_4

    .line 257
    .line 258
    .line 259
    :goto_5
    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    .line 260
    move-result v14

    .line 261
    :goto_6
    const/4 v5, -0x1

    .line 262
    goto :goto_7

    .line 263
    :cond_b
    const/4 v12, 0x0

    .line 264
    goto :goto_6

    .line 265
    .line 266
    :goto_7
    if-eq v14, v5, :cond_c

    .line 267
    .line 268
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 269
    sub-int/2addr v14, v5

    .line 270
    .line 271
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 272
    sub-int/2addr v14, v4

    .line 273
    .line 274
    .line 275
    invoke-static {v14, v12}, Ljava/lang/Math;->max(II)I

    .line 276
    move-result v4

    .line 277
    .line 278
    const/high16 v5, 0x40000000    # 2.0f

    .line 279
    .line 280
    .line 281
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 282
    move-result v4

    .line 283
    .line 284
    .line 285
    invoke-virtual {v10, v11, v4}, Landroid/view/View;->measure(II)V

    .line 286
    .line 287
    :cond_c
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 288
    .line 289
    iget-boolean v5, v4, Lib0/a;->b:Z

    .line 290
    .line 291
    if-nez v5, :cond_d

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4}, Lib0/a;->b()Lib0/a;

    .line 295
    move-result-object v4

    .line 296
    .line 297
    iput-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 298
    .line 299
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 300
    .line 301
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 302
    .line 303
    iget v11, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 304
    .line 305
    iget v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 306
    int-to-float v13, v11

    .line 307
    mul-float/2addr v12, v13

    .line 308
    float-to-int v12, v12

    .line 309
    .line 310
    .line 311
    invoke-interface {v4, v5, v11, v12}, Lhb0/a;->onInitialized(Lhb0/e;II)V

    .line 312
    .line 313
    :cond_d
    if-eqz v3, :cond_e

    .line 314
    .line 315
    iget-boolean v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v4}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 319
    move-result v4

    .line 320
    .line 321
    if-eqz v4, :cond_e

    .line 322
    .line 323
    .line 324
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 325
    move-result v4

    .line 326
    add-int/2addr v8, v4

    .line 327
    .line 328
    :cond_e
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 329
    .line 330
    if-eqz v4, :cond_19

    .line 331
    .line 332
    .line 333
    invoke-interface {v4}, Lhb0/a;->getView()Landroid/view/View;

    .line 334
    move-result-object v4

    .line 335
    .line 336
    if-ne v4, v9, :cond_19

    .line 337
    .line 338
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 339
    .line 340
    .line 341
    invoke-interface {v4}, Lhb0/a;->getView()Landroid/view/View;

    .line 342
    move-result-object v4

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 346
    move-result-object v5

    .line 347
    .line 348
    instance-of v10, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 349
    .line 350
    if-eqz v10, :cond_f

    .line 351
    move-object v10, v5

    .line 352
    .line 353
    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 354
    goto :goto_8

    .line 355
    .line 356
    :cond_f
    sget-object v10, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 357
    .line 358
    :goto_8
    iget v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 359
    .line 360
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 361
    add-int/2addr v11, v12

    .line 362
    .line 363
    iget v12, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 364
    .line 365
    .line 366
    invoke-static {v1, v11, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 367
    move-result v11

    .line 368
    .line 369
    iget v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 370
    .line 371
    iget-object v13, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 372
    .line 373
    iget v14, v13, Lib0/a;->a:I

    .line 374
    .line 375
    sget-object v15, Lib0/a;->i:Lib0/a;

    .line 376
    .line 377
    iget v15, v15, Lib0/a;->a:I

    .line 378
    .line 379
    if-ge v14, v15, :cond_10

    .line 380
    .line 381
    iget v14, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 382
    .line 383
    if-lez v14, :cond_11

    .line 384
    .line 385
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 386
    add-int/2addr v14, v12

    .line 387
    .line 388
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 389
    add-int/2addr v12, v14

    .line 390
    .line 391
    sget-object v14, Lib0/a;->g:Lib0/a;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v13, v14}, Lib0/a;->a(Lib0/a;)Z

    .line 395
    move-result v13

    .line 396
    .line 397
    if-eqz v13, :cond_10

    .line 398
    .line 399
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 400
    .line 401
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 402
    add-int/2addr v5, v13

    .line 403
    .line 404
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 405
    add-int/2addr v5, v13

    .line 406
    .line 407
    iput v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 408
    .line 409
    iput-object v14, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 410
    :cond_10
    move v5, v12

    .line 411
    goto :goto_9

    .line 412
    :cond_11
    const/4 v5, -0x2

    .line 413
    .line 414
    if-ne v14, v5, :cond_10

    .line 415
    .line 416
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 417
    .line 418
    .line 419
    invoke-interface {v5}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 420
    move-result-object v5

    .line 421
    .line 422
    sget-object v13, Lib0/b;->h:Lib0/b;

    .line 423
    .line 424
    if-ne v5, v13, :cond_12

    .line 425
    .line 426
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 427
    .line 428
    iget-boolean v5, v5, Lib0/a;->b:Z

    .line 429
    .line 430
    if-nez v5, :cond_10

    .line 431
    .line 432
    .line 433
    :cond_12
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 434
    move-result v5

    .line 435
    .line 436
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 437
    sub-int/2addr v5, v13

    .line 438
    .line 439
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 440
    sub-int/2addr v5, v13

    .line 441
    const/4 v13, 0x0

    .line 442
    .line 443
    .line 444
    invoke-static {v5, v13}, Ljava/lang/Math;->max(II)I

    .line 445
    move-result v5

    .line 446
    .line 447
    const/high16 v13, -0x80000000

    .line 448
    .line 449
    .line 450
    invoke-static {v5, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 451
    move-result v13

    .line 452
    .line 453
    .line 454
    invoke-virtual {v4, v11, v13}, Landroid/view/View;->measure(II)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 458
    move-result v13

    .line 459
    .line 460
    if-lez v13, :cond_10

    .line 461
    .line 462
    if-eq v13, v5, :cond_13

    .line 463
    .line 464
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 465
    .line 466
    sget-object v12, Lib0/a;->e:Lib0/a;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v5, v12}, Lib0/a;->a(Lib0/a;)Z

    .line 470
    move-result v5

    .line 471
    .line 472
    if-eqz v5, :cond_13

    .line 473
    .line 474
    iget v5, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 475
    add-int/2addr v13, v5

    .line 476
    .line 477
    iget v5, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 478
    add-int/2addr v13, v5

    .line 479
    .line 480
    iput v13, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 481
    .line 482
    iput-object v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 483
    :cond_13
    const/4 v5, -0x1

    .line 484
    .line 485
    :goto_9
    iget-object v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 486
    .line 487
    .line 488
    invoke-interface {v12}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 489
    move-result-object v12

    .line 490
    .line 491
    sget-object v13, Lib0/b;->h:Lib0/b;

    .line 492
    .line 493
    if-ne v12, v13, :cond_15

    .line 494
    .line 495
    .line 496
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 497
    move-result v5

    .line 498
    :cond_14
    const/4 v12, 0x0

    .line 499
    :goto_a
    const/4 v13, -0x1

    .line 500
    goto :goto_d

    .line 501
    .line 502
    :cond_15
    iget-object v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 503
    .line 504
    .line 505
    invoke-interface {v12}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 506
    move-result-object v12

    .line 507
    .line 508
    iget-boolean v12, v12, Lib0/b;->c:Z

    .line 509
    .line 510
    if-eqz v12, :cond_14

    .line 511
    .line 512
    if-nez v3, :cond_14

    .line 513
    .line 514
    iget-boolean v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, v5}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 518
    move-result v5

    .line 519
    .line 520
    if-eqz v5, :cond_16

    .line 521
    .line 522
    iget v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 523
    neg-int v12, v5

    .line 524
    move v5, v12

    .line 525
    :goto_b
    const/4 v12, 0x0

    .line 526
    goto :goto_c

    .line 527
    :cond_16
    const/4 v5, 0x0

    .line 528
    goto :goto_b

    .line 529
    .line 530
    .line 531
    :goto_c
    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    .line 532
    move-result v5

    .line 533
    goto :goto_a

    .line 534
    .line 535
    :goto_d
    if-eq v5, v13, :cond_17

    .line 536
    .line 537
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 538
    sub-int/2addr v5, v13

    .line 539
    .line 540
    iget v10, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 541
    sub-int/2addr v5, v10

    .line 542
    .line 543
    .line 544
    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    .line 545
    move-result v5

    .line 546
    .line 547
    const/high16 v10, 0x40000000    # 2.0f

    .line 548
    .line 549
    .line 550
    invoke-static {v5, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 551
    move-result v5

    .line 552
    .line 553
    .line 554
    invoke-virtual {v4, v11, v5}, Landroid/view/View;->measure(II)V

    .line 555
    .line 556
    :cond_17
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 557
    .line 558
    iget-boolean v10, v5, Lib0/a;->b:Z

    .line 559
    .line 560
    if-nez v10, :cond_18

    .line 561
    .line 562
    .line 563
    invoke-virtual {v5}, Lib0/a;->b()Lib0/a;

    .line 564
    move-result-object v5

    .line 565
    .line 566
    iput-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 567
    .line 568
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 569
    .line 570
    iget-object v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 571
    .line 572
    iget v11, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 573
    .line 574
    iget v13, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 575
    int-to-float v14, v11

    .line 576
    mul-float/2addr v13, v14

    .line 577
    float-to-int v13, v13

    .line 578
    .line 579
    .line 580
    invoke-interface {v5, v10, v11, v13}, Lhb0/a;->onInitialized(Lhb0/e;II)V

    .line 581
    .line 582
    :cond_18
    if-eqz v3, :cond_1a

    .line 583
    .line 584
    iget-boolean v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 585
    .line 586
    .line 587
    invoke-virtual {v0, v5}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 588
    move-result v5

    .line 589
    .line 590
    if-eqz v5, :cond_1a

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 594
    move-result v4

    .line 595
    add-int/2addr v8, v4

    .line 596
    goto :goto_e

    .line 597
    :cond_19
    const/4 v12, 0x0

    .line 598
    .line 599
    :cond_1a
    :goto_e
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 600
    .line 601
    if-eqz v4, :cond_20

    .line 602
    .line 603
    .line 604
    invoke-interface {v4}, Lhb0/b;->getView()Landroid/view/View;

    .line 605
    move-result-object v4

    .line 606
    .line 607
    if-ne v4, v9, :cond_20

    .line 608
    .line 609
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 610
    .line 611
    .line 612
    invoke-interface {v4}, Lhb0/b;->getView()Landroid/view/View;

    .line 613
    move-result-object v4

    .line 614
    .line 615
    .line 616
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 617
    move-result-object v5

    .line 618
    .line 619
    instance-of v9, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 620
    .line 621
    if-eqz v9, :cond_1b

    .line 622
    move-object v9, v5

    .line 623
    .line 624
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 625
    goto :goto_f

    .line 626
    .line 627
    :cond_1b
    sget-object v9, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 628
    .line 629
    :goto_f
    iget-object v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 630
    .line 631
    if-eqz v10, :cond_1c

    .line 632
    .line 633
    iget-boolean v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0, v10}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 637
    move-result v10

    .line 638
    .line 639
    if-eqz v10, :cond_1c

    .line 640
    .line 641
    iget-boolean v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableHeaderTranslationContent:Z

    .line 642
    .line 643
    iget-object v11, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0, v10, v11}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableTranslationContent(ZLhb0/a;)Z

    .line 647
    move-result v10

    .line 648
    .line 649
    if-eqz v10, :cond_1c

    .line 650
    const/4 v10, 0x1

    .line 651
    goto :goto_10

    .line 652
    :cond_1c
    move v10, v12

    .line 653
    .line 654
    :goto_10
    iget-object v11, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 655
    .line 656
    if-eqz v11, :cond_1d

    .line 657
    .line 658
    iget-boolean v11, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 659
    .line 660
    .line 661
    invoke-virtual {v0, v11}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 662
    move-result v11

    .line 663
    .line 664
    if-eqz v11, :cond_1d

    .line 665
    .line 666
    iget-boolean v11, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterTranslationContent:Z

    .line 667
    .line 668
    iget-object v13, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0, v11, v13}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableTranslationContent(ZLhb0/a;)Z

    .line 672
    move-result v11

    .line 673
    .line 674
    if-eqz v11, :cond_1d

    .line 675
    const/4 v11, 0x1

    .line 676
    goto :goto_11

    .line 677
    :cond_1d
    move v11, v12

    .line 678
    .line 679
    .line 680
    :goto_11
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 681
    move-result v13

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 685
    move-result v14

    .line 686
    add-int/2addr v13, v14

    .line 687
    .line 688
    iget v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 689
    add-int/2addr v13, v14

    .line 690
    .line 691
    iget v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 692
    add-int/2addr v13, v14

    .line 693
    .line 694
    iget v14, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 695
    .line 696
    .line 697
    invoke-static {v1, v13, v14}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 698
    move-result v13

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 702
    move-result v14

    .line 703
    .line 704
    .line 705
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 706
    move-result v15

    .line 707
    add-int/2addr v14, v15

    .line 708
    .line 709
    iget v15, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 710
    add-int/2addr v14, v15

    .line 711
    .line 712
    iget v9, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 713
    add-int/2addr v14, v9

    .line 714
    .line 715
    if-eqz v3, :cond_1e

    .line 716
    .line 717
    if-eqz v10, :cond_1e

    .line 718
    .line 719
    iget v9, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 720
    goto :goto_12

    .line 721
    :cond_1e
    move v9, v12

    .line 722
    :goto_12
    add-int/2addr v14, v9

    .line 723
    .line 724
    if-eqz v3, :cond_1f

    .line 725
    .line 726
    if-eqz v11, :cond_1f

    .line 727
    .line 728
    iget v9, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 729
    goto :goto_13

    .line 730
    :cond_1f
    move v9, v12

    .line 731
    :goto_13
    add-int/2addr v14, v9

    .line 732
    .line 733
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 734
    .line 735
    .line 736
    invoke-static {v2, v14, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 737
    move-result v5

    .line 738
    .line 739
    .line 740
    invoke-virtual {v4, v13, v5}, Landroid/view/View;->measure(II)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 744
    move-result v4

    .line 745
    add-int/2addr v8, v4

    .line 746
    .line 747
    :cond_20
    :goto_14
    add-int/lit8 v7, v7, 0x1

    .line 748
    .line 749
    goto/16 :goto_1

    .line 750
    .line 751
    .line 752
    :cond_21
    invoke-super {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 753
    move-result v3

    .line 754
    .line 755
    .line 756
    invoke-static {v3, v1}, Landroid/view/View;->resolveSize(II)I

    .line 757
    move-result v1

    .line 758
    .line 759
    .line 760
    invoke-static {v8, v2}, Landroid/view/View;->resolveSize(II)I

    .line 761
    move-result v2

    .line 762
    .line 763
    .line 764
    invoke-super {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 768
    move-result v1

    .line 769
    int-to-float v1, v1

    .line 770
    .line 771
    const/high16 v2, 0x40000000    # 2.0f

    .line 772
    div-float/2addr v1, v2

    .line 773
    .line 774
    iput v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 775
    return-void
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, p3, p4}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedFling(FFZ)Z

    .line 6
    move-result p1

    .line 7
    return p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    cmpl-float p1, p3, p1

    .line 8
    .line 9
    if-gtz p1, :cond_2

    .line 10
    :cond_0
    neg-float p1, p3

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->startFlingIfNeed(F)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-nez p1, :cond_2

    .line 17
    .line 18
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreFling(FF)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 3
    .line 4
    mul-int v0, p3, p1

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 11
    move-result p1

    .line 12
    .line 13
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 17
    move-result v0

    .line 18
    .line 19
    if-le p1, v0, :cond_0

    .line 20
    .line 21
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 22
    .line 23
    iput v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 24
    move v1, p1

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 28
    sub-int/2addr p1, p3

    .line 29
    .line 30
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 31
    move v1, p3

    .line 32
    .line 33
    :goto_0
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 34
    int-to-float p1, p1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->moveSpinnerInfinitely(F)V

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_1
    if-lez p3, :cond_2

    .line 41
    .line 42
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    sub-int/2addr p1, p3

    .line 46
    .line 47
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 48
    int-to-float p1, p1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->moveSpinnerInfinitely(F)V

    .line 52
    move v1, p3

    .line 53
    .line 54
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    .line 55
    sub-int/2addr p3, v1

    .line 56
    const/4 v0, 0x0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2, p3, p4, v0}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[I)Z

    .line 60
    const/4 p1, 0x1

    .line 61
    .line 62
    aget p2, p4, p1

    .line 63
    add-int/2addr p2, v1

    .line 64
    .line 65
    aput p2, p4, p1

    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    .line 3
    .line 4
    iget-object v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mParentOffsetInWindow:[I

    .line 5
    move v1, p2

    .line 6
    move v2, p3

    .line 7
    move v3, p4

    .line 8
    move v4, p5

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[I)Z

    .line 12
    move-result p1

    .line 13
    .line 14
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mParentOffsetInWindow:[I

    .line 15
    const/4 p3, 0x1

    .line 16
    .line 17
    aget p2, p2, p3

    .line 18
    .line 19
    add-int p5, v4, p2

    .line 20
    .line 21
    if-gez p5, :cond_1

    .line 22
    .line 23
    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 24
    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    :cond_0
    iget p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 32
    .line 33
    if-nez p2, :cond_3

    .line 34
    .line 35
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScrollBoundaryDecider:Ljb0/j;

    .line 36
    .line 37
    if-eqz p2, :cond_3

    .line 38
    .line 39
    iget-object p4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 40
    .line 41
    .line 42
    invoke-interface {p4}, Lhb0/b;->getView()Landroid/view/View;

    .line 43
    move-result-object p4

    .line 44
    .line 45
    .line 46
    invoke-interface {p2, p4}, Ljb0/j;->b(Landroid/view/View;)Z

    .line 47
    move-result p2

    .line 48
    .line 49
    if-nez p2, :cond_3

    .line 50
    .line 51
    :cond_1
    if-lez p5, :cond_7

    .line 52
    .line 53
    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 54
    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    iget-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 58
    .line 59
    if-eqz p2, :cond_7

    .line 60
    .line 61
    :cond_2
    iget p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 62
    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScrollBoundaryDecider:Ljb0/j;

    .line 66
    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    iget-object p4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 70
    .line 71
    .line 72
    invoke-interface {p4}, Lhb0/b;->getView()Landroid/view/View;

    .line 73
    move-result-object p4

    .line 74
    .line 75
    .line 76
    invoke-interface {p2, p4}, Ljb0/j;->a(Landroid/view/View;)Z

    .line 77
    move-result p2

    .line 78
    .line 79
    if-eqz p2, :cond_7

    .line 80
    .line 81
    :cond_3
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 82
    .line 83
    sget-object p4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 84
    .line 85
    if-eq p2, p4, :cond_4

    .line 86
    .line 87
    iget-boolean p2, p2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 88
    .line 89
    if-eqz p2, :cond_6

    .line 90
    .line 91
    :cond_4
    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 92
    .line 93
    if-lez p5, :cond_5

    .line 94
    .line 95
    sget-object p4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 96
    goto :goto_0

    .line 97
    .line 98
    :cond_5
    sget-object p4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 99
    .line 100
    .line 101
    :goto_0
    invoke-interface {p2, p4}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 102
    .line 103
    if-nez p1, :cond_6

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    if-eqz p1, :cond_6

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, p3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 113
    .line 114
    :cond_6
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 115
    sub-int/2addr p1, p5

    .line 116
    .line 117
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 118
    int-to-float p1, p1

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->moveSpinnerInfinitely(F)V

    .line 122
    .line 123
    :cond_7
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 124
    .line 125
    if-eqz p1, :cond_8

    .line 126
    .line 127
    if-gez v2, :cond_8

    .line 128
    const/4 p1, 0x0

    .line 129
    .line 130
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 131
    :cond_8
    return-void
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedParent:Landroidx/core/view/NestedScrollingParentHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/NestedScrollingParentHelper;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    .line 8
    .line 9
    and-int/lit8 p2, p3, 0x2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroidx/core/view/NestedScrollingChildHelper;->startNestedScroll(I)Z

    .line 13
    .line 14
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 15
    .line 16
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 17
    const/4 p1, 0x1

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedInProgress:Z

    .line 20
    const/4 p1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->interceptAnimatorByAction(I)Z

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isNestedScrollingEnabled()Z

    .line 10
    move-result p1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    and-int/lit8 p1, p3, 0x2

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    :cond_0
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedParent:Landroidx/core/view/NestedScrollingParentHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingParentHelper;->onStopNestedScroll(Landroid/view/View;)V

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedInProgress:Z

    .line 9
    .line 10
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mTotalUnconsumed:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->overSpinner()V

    .line 14
    .line 15
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/core/view/NestedScrollingChildHelper;->stopNestedScroll()V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public overSpinner()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    .line 4
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->TwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mCurrentVelocity:I

    .line 9
    .line 10
    const/16 v1, -0x3e8

    .line 11
    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    move-result v1

    .line 19
    .line 20
    div-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    if-le v0, v1, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    move-result v1

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    if-eqz v0, :cond_f

    .line 35
    .line 36
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFloorDuration:I

    .line 37
    int-to-long v1, v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 41
    return-void

    .line 42
    .line 43
    :cond_0
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mIsBeingDragged:Z

    .line 44
    .line 45
    if-eqz v0, :cond_f

    .line 46
    .line 47
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Lhb0/e;->d()Lhb0/e;

    .line 51
    return-void

    .line 52
    .line 53
    :cond_1
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 54
    const/4 v2, 0x0

    .line 55
    .line 56
    if-eq v0, v1, :cond_d

    .line 57
    .line 58
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 71
    .line 72
    if-gez v0, :cond_2

    .line 73
    .line 74
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 78
    move-result v0

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :cond_2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 85
    .line 86
    sget-object v3, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 87
    .line 88
    if-ne v0, v3, :cond_4

    .line 89
    .line 90
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 91
    .line 92
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 93
    .line 94
    if-le v0, v1, :cond_3

    .line 95
    .line 96
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v1}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 100
    return-void

    .line 101
    .line 102
    :cond_3
    if-gez v0, :cond_f

    .line 103
    .line 104
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v2}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 108
    return-void

    .line 109
    .line 110
    :cond_4
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 111
    .line 112
    if-ne v0, v4, :cond_5

    .line 113
    .line 114
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 115
    .line 116
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v1}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 120
    return-void

    .line 121
    .line 122
    :cond_5
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 123
    .line 124
    if-ne v0, v4, :cond_6

    .line 125
    .line 126
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 127
    .line 128
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 129
    .line 130
    .line 131
    invoke-interface {v0, v1}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 132
    return-void

    .line 133
    .line 134
    :cond_6
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 135
    .line 136
    if-ne v0, v4, :cond_7

    .line 137
    .line 138
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 139
    .line 140
    .line 141
    invoke-interface {v0, v3}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 142
    return-void

    .line 143
    .line 144
    :cond_7
    sget-object v3, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 145
    .line 146
    if-ne v0, v3, :cond_8

    .line 147
    .line 148
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 149
    .line 150
    .line 151
    invoke-interface {v0, v1}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 152
    return-void

    .line 153
    .line 154
    :cond_8
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToTwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 155
    .line 156
    if-ne v0, v1, :cond_9

    .line 157
    .line 158
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 159
    .line 160
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->TwoLevelReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 161
    .line 162
    .line 163
    invoke-interface {v0, v1}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 164
    return-void

    .line 165
    .line 166
    :cond_9
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->RefreshReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 167
    .line 168
    if-ne v0, v1, :cond_a

    .line 169
    .line 170
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 171
    .line 172
    if-nez v0, :cond_f

    .line 173
    .line 174
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 175
    .line 176
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 177
    .line 178
    .line 179
    invoke-interface {v0, v1}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 180
    return-void

    .line 181
    .line 182
    :cond_a
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 183
    .line 184
    if-ne v0, v1, :cond_b

    .line 185
    .line 186
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 187
    .line 188
    if-nez v0, :cond_f

    .line 189
    .line 190
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 191
    .line 192
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 193
    neg-int v1, v1

    .line 194
    .line 195
    .line 196
    invoke-interface {v0, v1}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 197
    return-void

    .line 198
    .line 199
    :cond_b
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadFinish:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 200
    .line 201
    if-ne v0, v1, :cond_c

    .line 202
    goto :goto_1

    .line 203
    .line 204
    :cond_c
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 205
    .line 206
    if-eqz v0, :cond_f

    .line 207
    .line 208
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 209
    .line 210
    .line 211
    invoke-interface {v0, v2}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 212
    return-void

    .line 213
    .line 214
    :cond_d
    :goto_0
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 215
    .line 216
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 217
    neg-int v3, v1

    .line 218
    .line 219
    if-ge v0, v3, :cond_e

    .line 220
    .line 221
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 222
    neg-int v1, v1

    .line 223
    .line 224
    .line 225
    invoke-interface {v0, v1}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 226
    return-void

    .line 227
    .line 228
    :cond_e
    if-lez v0, :cond_f

    .line 229
    .line 230
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 231
    .line 232
    .line 233
    invoke-interface {v0, v2}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 234
    :cond_f
    :goto_1
    return-void
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lhb0/b;->h()Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroidx/core/view/ViewCompat;->isNestedScrollingEnabled(Landroid/view/View;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableDisallowIntercept:Z

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public resetNoMoreData()Lhb0/f;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setNoMoreData(Z)Lhb0/f;

    .line 5
    move-result-object v0

    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public setDisableContentWhenLoading(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenLoading:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setDisableContentWhenRefresh(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDisableContentWhenRefresh:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setDragRate(F)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mDragRate:F

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableAutoLoadMore(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableAutoLoadMore:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableClipFooterWhenFixedBehind(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipFooterWhenFixedBehind:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableClipHeaderWhenFixedBehind(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipHeaderWhenFixedBehind:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableFooterFollowWhenNoMoreData(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableFooterTranslationContent(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterTranslationContent:Z

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualFooterTranslationContent:Z

    .line 6
    return-object p0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableHeaderTranslationContent(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableHeaderTranslationContent:Z

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualHeaderTranslationContent:Z

    .line 6
    return-object p0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableLoadMore(Z)Lhb0/f;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 6
    return-object p0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableLoadMoreWhenContentNotFull(Z)Lhb0/f;
    .locals 1

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMoreWhenContentNotFull:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lhb0/b;->c(Z)V

    .line 10
    :cond_0
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableNestedScroll(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setNestedScrollingEnabled(Z)V

    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableOverScrollBounce(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollBounce:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableOverScrollDrag(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnablePureScrollMode(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnablePureScrollMode:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableRefresh(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableScrollContentWhenLoaded(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenLoaded:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setEnableScrollContentWhenRefreshed(Z)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenRefreshed:Z

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFixedFooterViewId(I)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedFooterViewId:I

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFixedHeaderViewId(I)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedHeaderViewId:I

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFooterHeight(F)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Llb0/b;->c(F)I

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setFooterHeightPx(I)Lhb0/f;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFooterHeightPx(I)Lhb0/f;
    .locals 7

    .line 1
    .line 2
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 9
    .line 10
    sget-object v1, Lib0/a;->l:Lib0/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lib0/a;->a(Lib0/a;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_5

    .line 17
    .line 18
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 19
    .line 20
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 21
    .line 22
    if-eqz p1, :cond_4

    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 29
    .line 30
    iget-boolean v0, v0, Lib0/a;->b:Z

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    sget-object v0, Lib0/b;->h:Lib0/b;

    .line 39
    .line 40
    if-eq p1, v0, :cond_3

    .line 41
    .line 42
    iget-boolean v0, p1, Lib0/b;->c:Z

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    instance-of v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_1
    sget-object v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 67
    move-result v3

    .line 68
    .line 69
    const/high16 v4, 0x40000000    # 2.0f

    .line 70
    .line 71
    .line 72
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 73
    move-result v3

    .line 74
    .line 75
    iget v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 76
    .line 77
    iget v6, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 78
    sub-int/2addr v5, v6

    .line 79
    .line 80
    iget v6, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 81
    sub-int/2addr v5, v6

    .line 82
    const/4 v6, 0x0

    .line 83
    .line 84
    .line 85
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 86
    move-result v5

    .line 87
    .line 88
    .line 89
    invoke-static {v5, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 90
    move-result v4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3, v4}, Landroid/view/View;->measure(II)V

    .line 94
    .line 95
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 96
    .line 97
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 101
    move-result v4

    .line 102
    add-int/2addr v2, v4

    .line 103
    .line 104
    iget v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterInsetStart:I

    .line 105
    sub-int/2addr v2, v4

    .line 106
    .line 107
    sget-object v4, Lib0/b;->d:Lib0/b;

    .line 108
    .line 109
    if-eq p1, v4, :cond_2

    .line 110
    .line 111
    iget v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 112
    :cond_2
    sub-int/2addr v2, v6

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 116
    move-result p1

    .line 117
    add-int/2addr p1, v3

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 121
    move-result v4

    .line 122
    add-int/2addr v4, v2

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v3, v2, p1, v4}, Landroid/view/View;->layout(IIII)V

    .line 126
    .line 127
    :cond_3
    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 128
    .line 129
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 130
    .line 131
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 132
    .line 133
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 134
    .line 135
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 136
    int-to-float v3, v1

    .line 137
    mul-float/2addr v2, v3

    .line 138
    float-to-int v2, v2

    .line 139
    .line 140
    .line 141
    invoke-interface {p1, v0, v1, v2}, Lhb0/a;->onInitialized(Lhb0/e;II)V

    .line 142
    return-object p0

    .line 143
    .line 144
    :cond_4
    sget-object p1, Lib0/a;->k:Lib0/a;

    .line 145
    .line 146
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 147
    :cond_5
    :goto_1
    return-object p0
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public setFooterInsetStart(F)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Llb0/b;->c(F)I

    .line 4
    move-result p1

    .line 5
    .line 6
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterInsetStart:I

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFooterInsetStartPx(I)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterInsetStart:I

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFooterMaxDragRate(F)Lhb0/f;
    .locals 4

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 3
    .line 4
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 13
    .line 14
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 15
    int-to-float v3, v2

    .line 16
    mul-float/2addr v3, p1

    .line 17
    float-to-int p1, v3

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, v2, p1}, Lhb0/a;->onInitialized(Lhb0/e;II)V

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lib0/a;->c()Lib0/a;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 30
    return-object p0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setFooterTranslationViewId(I)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTranslationViewId:I

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setFooterTriggerRate(F)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTriggerRate:F

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setHeaderHeight(F)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Llb0/b;->c(F)I

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setHeaderHeightPx(I)Lhb0/f;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setHeaderHeightPx(I)Lhb0/f;
    .locals 7

    .line 1
    .line 2
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 9
    .line 10
    sget-object v1, Lib0/a;->l:Lib0/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lib0/a;->a(Lib0/a;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_5

    .line 17
    .line 18
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 19
    .line 20
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 21
    .line 22
    if-eqz p1, :cond_4

    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 29
    .line 30
    iget-boolean v0, v0, Lib0/a;->b:Z

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    sget-object v0, Lib0/b;->h:Lib0/b;

    .line 39
    .line 40
    if-eq p1, v0, :cond_3

    .line 41
    .line 42
    iget-boolean v0, p1, Lib0/b;->c:Z

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    instance-of v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_1
    sget-object v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 67
    move-result v3

    .line 68
    .line 69
    const/high16 v4, 0x40000000    # 2.0f

    .line 70
    .line 71
    .line 72
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 73
    move-result v3

    .line 74
    .line 75
    iget v5, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 76
    .line 77
    iget v6, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 78
    sub-int/2addr v5, v6

    .line 79
    .line 80
    iget v6, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 81
    sub-int/2addr v5, v6

    .line 82
    const/4 v6, 0x0

    .line 83
    .line 84
    .line 85
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 86
    move-result v5

    .line 87
    .line 88
    .line 89
    invoke-static {v5, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 90
    move-result v4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3, v4}, Landroid/view/View;->measure(II)V

    .line 94
    .line 95
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 96
    .line 97
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 98
    .line 99
    iget v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderInsetStart:I

    .line 100
    add-int/2addr v2, v4

    .line 101
    .line 102
    sget-object v4, Lib0/b;->d:Lib0/b;

    .line 103
    .line 104
    if-ne p1, v4, :cond_2

    .line 105
    .line 106
    iget v6, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 107
    :cond_2
    sub-int/2addr v2, v6

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 111
    move-result p1

    .line 112
    add-int/2addr p1, v3

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 116
    move-result v4

    .line 117
    add-int/2addr v4, v2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v3, v2, p1, v4}, Landroid/view/View;->layout(IIII)V

    .line 121
    .line 122
    :cond_3
    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 123
    .line 124
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 125
    .line 126
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 127
    .line 128
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 129
    .line 130
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 131
    int-to-float v3, v1

    .line 132
    mul-float/2addr v2, v3

    .line 133
    float-to-int v2, v2

    .line 134
    .line 135
    .line 136
    invoke-interface {p1, v0, v1, v2}, Lhb0/a;->onInitialized(Lhb0/e;II)V

    .line 137
    return-object p0

    .line 138
    .line 139
    :cond_4
    sget-object p1, Lib0/a;->k:Lib0/a;

    .line 140
    .line 141
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 142
    :cond_5
    :goto_1
    return-object p0
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public setHeaderInsetStart(F)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Llb0/b;->c(F)I

    .line 4
    move-result p1

    .line 5
    .line 6
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderInsetStart:I

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setHeaderInsetStartPx(I)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderInsetStart:I

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setHeaderMaxDragRate(F)Lhb0/f;
    .locals 4

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 3
    .line 4
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 13
    .line 14
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 15
    int-to-float v3, v2

    .line 16
    mul-float/2addr p1, v3

    .line 17
    float-to-int p1, p1

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, v2, p1}, Lhb0/a;->onInitialized(Lhb0/e;II)V

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lib0/a;->c()Lib0/a;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    .line 30
    return-object p0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setHeaderTranslationViewId(I)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTranslationViewId:I

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setHeaderTriggerRate(F)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTriggerRate:F

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableNestedScrolling:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mNestedChild:Landroidx/core/view/NestedScrollingChildHelper;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setNoMoreData(Z)Lhb0/f;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    .line 4
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishRefreshWithNoMoreData()Lhb0/f;

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_0
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishLoadMoreWithNoMoreData()Lhb0/f;

    .line 22
    return-object p0

    .line 23
    .line 24
    :cond_1
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 25
    .line 26
    if-eq v0, p1, :cond_3

    .line 27
    .line 28
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 29
    .line 30
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 31
    .line 32
    instance-of v1, v0, Lhb0/c;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    check-cast v0, Lhb0/c;

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, p1}, Lhb0/c;->a(Z)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    const/4 p1, 0x1

    .line 44
    .line 45
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 46
    .line 47
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 56
    .line 57
    if-lez p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    sget-object v0, Lib0/b;->d:Lib0/b;

    .line 66
    .line 67
    if-ne p1, v0, :cond_3

    .line 68
    .line 69
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 73
    move-result p1

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 78
    .line 79
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableTranslationContent(ZLhb0/a;)Z

    .line 83
    move-result p1

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 94
    int-to-float v0, v0

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 98
    return-object p0

    .line 99
    :cond_2
    const/4 p1, 0x0

    .line 100
    .line 101
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 102
    .line 103
    new-instance p1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    const-string v0, "Footer:"

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v0, " NoMoreData is not supported.(\u4e0d\u652f\u6301NoMoreData\uff0c\u8bf7\u4f7f\u7528[ClassicsFooter]\u6216\u8005[\u81ea\u5b9a\u4e49Footer\u5e76\u5b9e\u73b0setNoMoreData\u65b9\u6cd5\u4e14\u8fd4\u56detrue])"

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    new-instance v0, Ljava/lang/RuntimeException;

    .line 128
    .line 129
    .line 130
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 134
    :cond_3
    return-object p0
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public setOnLoadMoreListener(Ljb0/e;)Lhb0/f;
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLoadMoreListener:Ljb0/e;

    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    .line 18
    :goto_1
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setOnMultiListener(Ljb0/f;)Lhb0/f;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setOnRefreshListener(Ljb0/g;)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshListener:Ljb0/g;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setOnRefreshLoadMoreListener(Ljb0/h;)Lhb0/f;
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshListener:Ljb0/g;

    .line 3
    .line 4
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLoadMoreListener:Ljb0/e;

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 19
    .line 20
    :goto_1
    iput-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
.end method

.method public varargs setPrimaryColors([I)Lhb0/f;
    .locals 1
    .param p1    # [I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lhb0/a;->setPrimaryColors([I)V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p1}, Lhb0/a;->setPrimaryColors([I)V

    .line 15
    .line 16
    :cond_1
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPrimaryColors:[I

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public varargs setPrimaryColorsId([I)Lhb0/f;
    .locals 4
    .param p1    # [I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p1

    .line 6
    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    aget v3, p1, v1

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 17
    move-result v2

    .line 18
    .line 19
    aput v2, v0, v1

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setPrimaryColors([I)Lhb0/f;

    .line 26
    return-object p0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setReboundDuration(I)Lhb0/f;
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setReboundInterpolator(Landroid/view/animation/Interpolator;)Lhb0/f;
    .locals 0
    .param p1    # Landroid/view/animation/Interpolator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundInterpolator:Landroid/view/animation/Interpolator;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setRefreshContent(Landroid/view/View;)Lhb0/f;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setRefreshContent(Landroid/view/View;II)Lhb0/f;

    move-result-object p1

    return-object p1
.end method

.method public setRefreshContent(Landroid/view/View;II)Lhb0/f;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lhb0/b;->getView()Landroid/view/View;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v0, -0x1

    if-nez p2, :cond_1

    move p2, v0

    :cond_1
    if-nez p3, :cond_2

    move p3, v0

    .line 4
    :cond_2
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    invoke-direct {v0, p2, p3}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;-><init>(II)V

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 6
    instance-of p3, p2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    if-eqz p3, :cond_3

    .line 7
    move-object v0, p2

    check-cast v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    .line 8
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    invoke-super {p0, p1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 9
    new-instance p2, Lmb0/a;

    invoke-direct {p2, p1}, Lmb0/a;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 10
    iget-boolean p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mAttachedToWindow:Z

    if-eqz p1, :cond_4

    .line 11
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedHeaderViewId:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 12
    iget p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFixedFooterViewId:I

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 13
    iget-object p3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScrollBoundaryDecider:Ljb0/j;

    invoke-interface {p3, v0}, Lhb0/b;->b(Ljb0/j;)V

    .line 14
    iget-object p3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMoreWhenContentNotFull:Z

    invoke-interface {p3, v0}, Lhb0/b;->c(Z)V

    .line 15
    iget-object p3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    invoke-interface {p3, v0, p1, p2}, Lhb0/b;->f(Lhb0/e;Landroid/view/View;Landroid/view/View;)V

    .line 16
    :cond_4
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    move-result-object p1

    iget-boolean p1, p1, Lib0/b;->b:Z

    if-eqz p1, :cond_5

    .line 17
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    .line 18
    :cond_5
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    move-result-object p1

    iget-boolean p1, p1, Lib0/b;->b:Z

    if-eqz p1, :cond_6

    .line 19
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    :cond_6
    return-object p0
.end method

.method public setRefreshFooter(Lhb0/c;)Lhb0/f;
    .locals 1
    .param p1    # Lhb0/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setRefreshFooter(Lhb0/c;II)Lhb0/f;

    move-result-object p1

    return-object p1
.end method

.method public setRefreshFooter(Lhb0/c;II)Lhb0/f;
    .locals 2
    .param p1    # Lhb0/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 6
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterBackgroundColor:I

    .line 7
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 8
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNeedTouchEventWhenLoading:Z

    .line 9
    sget-object v1, Lib0/a;->c:Lib0/a;

    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeightStatus:Lib0/a;

    .line 10
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mManualLoadMore:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    if-nez p2, :cond_3

    const/4 p2, -0x1

    :cond_3
    if-nez p3, :cond_4

    const/4 p3, -0x2

    .line 11
    :cond_4
    new-instance v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    invoke-direct {v1, p2, p3}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;-><init>(II)V

    .line 12
    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 13
    instance-of p2, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    if-eqz p2, :cond_5

    .line 14
    move-object v1, p1

    check-cast v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    .line 15
    :cond_5
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    invoke-interface {p1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    move-result-object p1

    iget-boolean p1, p1, Lib0/b;->b:Z

    if-eqz p1, :cond_6

    .line 16
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    invoke-super {p0, p1, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    .line 17
    :cond_6
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-super {p0, p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 18
    :goto_2
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPrimaryColors:[I

    if-eqz p1, :cond_7

    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    if-eqz p2, :cond_7

    .line 19
    invoke-interface {p2, p1}, Lhb0/a;->setPrimaryColors([I)V

    :cond_7
    return-object p0
.end method

.method public setRefreshHeader(Lhb0/d;)Lhb0/f;
    .locals 1
    .param p1    # Lhb0/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setRefreshHeader(Lhb0/d;II)Lhb0/f;

    move-result-object p1

    return-object p1
.end method

.method public setRefreshHeader(Lhb0/d;II)Lhb0/f;
    .locals 2
    .param p1    # Lhb0/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderBackgroundColor:I

    .line 6
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderNeedTouchEventWhenRefreshing:Z

    .line 7
    sget-object v1, Lib0/a;->c:Lib0/a;

    iput-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeightStatus:Lib0/a;

    if-nez p2, :cond_1

    const/4 p2, -0x1

    :cond_1
    if-nez p3, :cond_2

    const/4 p3, -0x2

    .line 8
    :cond_2
    new-instance v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    invoke-direct {v1, p2, p3}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;-><init>(II)V

    .line 9
    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 10
    instance-of p2, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    if-eqz p2, :cond_3

    .line 11
    move-object v1, p1

    check-cast v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$m;

    .line 12
    :cond_3
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    invoke-interface {p1}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    move-result-object p1

    iget-boolean p1, p1, Lib0/b;->b:Z

    if-eqz p1, :cond_4

    .line 13
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    invoke-super {p0, p1, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 14
    :cond_4
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    invoke-interface {p1}, Lhb0/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-super {p0, p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 15
    :goto_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPrimaryColors:[I

    if-eqz p1, :cond_5

    iget-object p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    if-eqz p2, :cond_5

    .line 16
    invoke-interface {p2, p1}, Lhb0/a;->setPrimaryColors([I)V

    :cond_5
    return-object p0
.end method

.method public setScrollBoundaryDecider(Ljb0/j;)Lhb0/f;
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScrollBoundaryDecider:Ljb0/j;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lhb0/b;->b(Ljb0/j;)V

    .line 10
    :cond_0
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setStateDirectLoading(Z)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    .line 4
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 5
    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    move-result-wide v2

    .line 11
    .line 12
    iput-wide v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastOpenTime:J

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterLocked:Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 19
    .line 20
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLoadMoreListener:Ljb0/e;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, p0}, Ljb0/e;->b(Lhb0/f;)V

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    const/16 p1, 0x7d0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishLoadMore(I)Lhb0/f;

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 40
    .line 41
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 42
    int-to-float v2, v0

    .line 43
    mul-float/2addr v1, v2

    .line 44
    float-to-int v1, v1

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p0, v0, v1}, Lhb0/a;->onStartAnimator(Lhb0/f;II)V

    .line 48
    :cond_2
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setStateLoading(Z)V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$b;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Z)V

    .line 6
    .line 7
    sget-object p1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 11
    .line 12
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 13
    .line 14
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 15
    neg-int v1, v1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 25
    .line 26
    :cond_0
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 31
    .line 32
    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 33
    int-to-float v4, v2

    .line 34
    mul-float/2addr v3, v4

    .line 35
    float-to-int v3, v3

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, p0, v2, v3}, Lhb0/a;->onReleased(Lhb0/f;II)V

    .line 39
    .line 40
    :cond_1
    if-nez p1, :cond_2

    .line 41
    const/4 p1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 45
    :cond_2
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setStateRefreshing(Z)V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Z)V

    .line 6
    .line 7
    sget-object p1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->RefreshReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 11
    .line 12
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 13
    .line 14
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v1}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 30
    .line 31
    iget v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 32
    int-to-float v4, v2

    .line 33
    mul-float/2addr v3, v4

    .line 34
    float-to-int v3, v3

    .line 35
    .line 36
    .line 37
    invoke-interface {v1, p0, v2, v3}, Lhb0/a;->onReleased(Lhb0/f;II)V

    .line 38
    .line 39
    :cond_1
    if-nez p1, :cond_2

    .line 40
    const/4 p1, 0x0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 44
    :cond_2
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 3
    .line 4
    iget-boolean v1, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isDragging:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isHeader:Z

    .line 9
    .line 10
    iget-boolean v1, p1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isHeader:Z

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 20
    .line 21
    if-eq v0, p1, :cond_1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 24
    :cond_1
    return-void
.end method

.method public startFlingIfNeed(F)Z
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    cmpl-float v1, p1, v0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mCurrentVelocity:I

    .line 8
    int-to-float p1, p1

    .line 9
    .line 10
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1b

    .line 13
    .line 14
    if-le v1, v2, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    .line 22
    .line 23
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Lhb0/b;->getView()Landroid/view/View;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    .line 31
    move-result v2

    .line 32
    .line 33
    const/high16 v3, -0x40800000    # -1.0f

    .line 34
    .line 35
    cmpl-float v2, v2, v3

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/view/View;->getScaleY()F

    .line 41
    move-result v1

    .line 42
    .line 43
    cmpl-float v1, v1, v3

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    neg-float p1, p1

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 50
    move-result v1

    .line 51
    .line 52
    iget v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mMinimumVelocity:I

    .line 53
    int-to-float v2, v2

    .line 54
    .line 55
    cmpl-float v1, v1, v2

    .line 56
    const/4 v2, 0x0

    .line 57
    .line 58
    if-lez v1, :cond_a

    .line 59
    .line 60
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 61
    int-to-float v3, v1

    .line 62
    mul-float/2addr v3, p1

    .line 63
    .line 64
    cmpg-float v3, v3, v0

    .line 65
    .line 66
    if-gez v3, :cond_4

    .line 67
    .line 68
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 69
    .line 70
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 71
    const/4 v5, 0x1

    .line 72
    .line 73
    if-eq v3, v4, :cond_3

    .line 74
    .line 75
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 76
    .line 77
    if-eq v3, v4, :cond_3

    .line 78
    .line 79
    if-gez v1, :cond_2

    .line 80
    .line 81
    iget-boolean v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 82
    .line 83
    if-eqz v4, :cond_2

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_2
    iget-boolean v3, v3, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isReleaseToOpening:Z

    .line 87
    .line 88
    if-eqz v3, :cond_4

    .line 89
    return v5

    .line 90
    .line 91
    :cond_3
    :goto_0
    new-instance v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$l;

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$l;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;F)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$l;->a()Ljava/lang/Runnable;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animationRunnable:Ljava/lang/Runnable;

    .line 101
    return v5

    .line 102
    .line 103
    :cond_4
    cmpg-float v3, p1, v0

    .line 104
    .line 105
    if-gez v3, :cond_7

    .line 106
    .line 107
    iget-boolean v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollBounce:Z

    .line 108
    .line 109
    if-eqz v3, :cond_5

    .line 110
    .line 111
    iget-boolean v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 112
    .line 113
    if-nez v3, :cond_9

    .line 114
    .line 115
    iget-boolean v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 116
    .line 117
    if-nez v3, :cond_9

    .line 118
    .line 119
    :cond_5
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 120
    .line 121
    sget-object v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Loading:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 122
    .line 123
    if-ne v3, v4, :cond_6

    .line 124
    .line 125
    if-gez v1, :cond_9

    .line 126
    .line 127
    :cond_6
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableAutoLoadMore:Z

    .line 128
    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 135
    move-result v1

    .line 136
    .line 137
    if-nez v1, :cond_9

    .line 138
    .line 139
    :cond_7
    cmpl-float v0, p1, v0

    .line 140
    .line 141
    if-lez v0, :cond_a

    .line 142
    .line 143
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollBounce:Z

    .line 144
    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 148
    .line 149
    if-nez v0, :cond_9

    .line 150
    .line 151
    :cond_8
    iget-boolean v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableOverScrollDrag:Z

    .line 152
    .line 153
    if-nez v0, :cond_9

    .line 154
    .line 155
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 156
    .line 157
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 158
    .line 159
    if-ne v0, v1, :cond_a

    .line 160
    .line 161
    iget v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 162
    .line 163
    if-gtz v0, :cond_a

    .line 164
    .line 165
    :cond_9
    iput-boolean v2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mVerticalPermit:Z

    .line 166
    .line 167
    iget-object v3, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 168
    neg-float p1, p1

    .line 169
    float-to-int v7, p1

    .line 170
    .line 171
    .line 172
    const v10, -0x7fffffff

    .line 173
    .line 174
    .line 175
    const v11, 0x7fffffff

    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v5, 0x0

    .line 178
    const/4 v6, 0x0

    .line 179
    const/4 v8, 0x0

    .line 180
    const/4 v9, 0x0

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v3 .. v11}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 184
    .line 185
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mScroller:Landroid/widget/Scroller;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 192
    :cond_a
    return v2
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method
