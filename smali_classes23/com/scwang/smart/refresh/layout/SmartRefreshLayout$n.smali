.class public Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;
.super Ljava/lang/Object;
.source "SmartRefreshLayout.java"

# interfaces
.implements Lhb0/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "n"
.end annotation


# instance fields
.field public final synthetic a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;


# direct methods
.method public constructor <init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.method public a(I)Landroid/animation/ValueAnimator;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundInterpolator:Landroid/view/animation/Interpolator;

    .line 5
    .line 6
    iget v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mReboundDuration:I

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v3, v1, v2}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->animSpinner(IILandroid/view/animation/Interpolator;I)Landroid/animation/ValueAnimator;

    .line 11
    move-result-object p1

    .line 12
    return-object p1
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

.method public b()Lhb0/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

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

.method public c(Lhb0/a;I)Lhb0/e;
    .locals 2
    .param p1    # Lhb0/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPaint:Landroid/graphics/Paint;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    new-instance v1, Landroid/graphics/Paint;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    iput-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPaint:Landroid/graphics/Paint;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 28
    .line 29
    iput p2, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderBackgroundColor:I

    .line 30
    return-object p0

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    move-result p1

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 43
    .line 44
    iput p2, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterBackgroundColor:I

    .line 45
    :cond_2
    return-object p0
.end method

.method public d()Lhb0/e;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 5
    .line 6
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->TwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 7
    .line 8
    if-ne v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 11
    .line 12
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->TwoLevelFinish:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 18
    .line 19
    iget v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->f(IZ)Lhb0/e;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 28
    .line 29
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 33
    return-object p0

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a(I)Landroid/animation/ValueAnimator;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 40
    .line 41
    iget v1, v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFloorDuration:I

    .line 42
    int-to-long v1, v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 46
    :cond_1
    return-object p0
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

.method public e(Z)Lhb0/e;
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    new-instance p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n$a;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 13
    move-result v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a(I)Landroid/animation/ValueAnimator;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 22
    .line 23
    iget-object v2, v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    iget v1, v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFloorDuration:I

    .line 28
    int-to-long v1, v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 35
    return-object p0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 40
    return-object p0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a(I)Landroid/animation/ValueAnimator;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 50
    .line 51
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 55
    :cond_2
    return-object p0
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

.method public f(IZ)Lhb0/e;
    .locals 23

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 7
    .line 8
    iget v3, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 9
    .line 10
    if-ne v3, v1, :cond_1

    .line 11
    .line 12
    iget-object v2, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v2}, Lhb0/a;->isSupportHorizontalDrag()Z

    .line 18
    move-result v2

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 23
    .line 24
    iget-object v2, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 25
    .line 26
    if-eqz v2, :cond_28

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, Lhb0/a;->isSupportHorizontalDrag()Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_14

    .line 35
    .line 36
    :cond_1
    iget-object v2, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 37
    .line 38
    iget v3, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 39
    .line 40
    iput v1, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 41
    .line 42
    if-eqz p2, :cond_6

    .line 43
    .line 44
    iget-object v4, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mViceState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 45
    .line 46
    iget-boolean v5, v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isDragging:Z

    .line 47
    .line 48
    if-nez v5, :cond_2

    .line 49
    .line 50
    iget-boolean v4, v4, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 51
    .line 52
    if-eqz v4, :cond_6

    .line 53
    :cond_2
    int-to-float v4, v1

    .line 54
    .line 55
    iget v5, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 56
    int-to-float v5, v5

    .line 57
    .line 58
    iget v6, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTriggerRate:F

    .line 59
    mul-float/2addr v5, v6

    .line 60
    .line 61
    cmpl-float v4, v4, v5

    .line 62
    .line 63
    if-lez v4, :cond_3

    .line 64
    .line 65
    iget-object v4, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 66
    .line 67
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToTwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 68
    .line 69
    if-eq v4, v5, :cond_6

    .line 70
    .line 71
    iget-object v4, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 72
    .line 73
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 74
    .line 75
    .line 76
    invoke-interface {v4, v5}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    neg-int v4, v1

    .line 79
    int-to-float v4, v4

    .line 80
    .line 81
    iget v5, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 82
    int-to-float v5, v5

    .line 83
    .line 84
    iget v6, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTriggerRate:F

    .line 85
    mul-float/2addr v5, v6

    .line 86
    .line 87
    cmpl-float v4, v4, v5

    .line 88
    .line 89
    if-lez v4, :cond_4

    .line 90
    .line 91
    iget-boolean v4, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 92
    .line 93
    if-nez v4, :cond_4

    .line 94
    .line 95
    iget-object v4, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 96
    .line 97
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 98
    .line 99
    .line 100
    invoke-interface {v4, v5}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 101
    goto :goto_0

    .line 102
    .line 103
    :cond_4
    if-gez v1, :cond_5

    .line 104
    .line 105
    iget-boolean v4, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 106
    .line 107
    if-nez v4, :cond_5

    .line 108
    .line 109
    iget-object v4, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 110
    .line 111
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 112
    .line 113
    .line 114
    invoke-interface {v4, v5}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 115
    goto :goto_0

    .line 116
    .line 117
    :cond_5
    if-lez v1, :cond_6

    .line 118
    .line 119
    iget-object v4, v2, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 120
    .line 121
    sget-object v5, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 122
    .line 123
    .line 124
    invoke-interface {v4, v5}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 125
    .line 126
    :cond_6
    :goto_0
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 127
    .line 128
    iget-object v5, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 129
    const/4 v6, 0x1

    .line 130
    const/4 v7, 0x0

    .line 131
    .line 132
    if-eqz v5, :cond_12

    .line 133
    .line 134
    if-ltz v1, :cond_8

    .line 135
    .line 136
    iget-boolean v5, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableHeaderTranslationContent:Z

    .line 137
    .line 138
    iget-object v8, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v5, v8}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableTranslationContent(ZLhb0/a;)Z

    .line 142
    move-result v4

    .line 143
    .line 144
    if-eqz v4, :cond_7

    .line 145
    move v4, v1

    .line 146
    move v5, v6

    .line 147
    goto :goto_1

    .line 148
    .line 149
    :cond_7
    if-gez v3, :cond_8

    .line 150
    move v5, v6

    .line 151
    move v4, v7

    .line 152
    goto :goto_1

    .line 153
    :cond_8
    move v4, v7

    .line 154
    move v5, v4

    .line 155
    .line 156
    :goto_1
    if-gtz v1, :cond_a

    .line 157
    .line 158
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 159
    .line 160
    iget-boolean v9, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterTranslationContent:Z

    .line 161
    .line 162
    iget-object v10, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v8, v9, v10}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableTranslationContent(ZLhb0/a;)Z

    .line 166
    move-result v8

    .line 167
    .line 168
    if-eqz v8, :cond_9

    .line 169
    move v4, v1

    .line 170
    move v5, v6

    .line 171
    goto :goto_2

    .line 172
    .line 173
    :cond_9
    if-lez v3, :cond_a

    .line 174
    move v5, v6

    .line 175
    move v4, v7

    .line 176
    .line 177
    :cond_a
    :goto_2
    if-eqz v5, :cond_12

    .line 178
    .line 179
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 180
    .line 181
    iget-object v8, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 182
    .line 183
    iget v9, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderTranslationViewId:I

    .line 184
    .line 185
    iget v5, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterTranslationViewId:I

    .line 186
    .line 187
    .line 188
    invoke-interface {v8, v4, v9, v5}, Lhb0/b;->e(III)V

    .line 189
    .line 190
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 191
    .line 192
    iget-boolean v8, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 193
    .line 194
    if-eqz v8, :cond_b

    .line 195
    .line 196
    iget-boolean v8, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 197
    .line 198
    if-eqz v8, :cond_b

    .line 199
    .line 200
    iget-boolean v8, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 201
    .line 202
    if-eqz v8, :cond_b

    .line 203
    .line 204
    iget-object v5, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 205
    .line 206
    instance-of v8, v5, Lhb0/c;

    .line 207
    .line 208
    if-eqz v8, :cond_b

    .line 209
    .line 210
    .line 211
    invoke-interface {v5}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 212
    move-result-object v5

    .line 213
    .line 214
    sget-object v8, Lib0/b;->d:Lib0/b;

    .line 215
    .line 216
    if-ne v5, v8, :cond_b

    .line 217
    .line 218
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 219
    .line 220
    iget-boolean v8, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5, v8}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 224
    move-result v5

    .line 225
    .line 226
    if-eqz v5, :cond_b

    .line 227
    .line 228
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 229
    .line 230
    iget-object v5, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 231
    .line 232
    .line 233
    invoke-interface {v5}, Lhb0/a;->getView()Landroid/view/View;

    .line 234
    move-result-object v5

    .line 235
    .line 236
    .line 237
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 238
    move-result v8

    .line 239
    int-to-float v8, v8

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, v8}, Landroid/view/View;->setTranslationY(F)V

    .line 243
    .line 244
    :cond_b
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 245
    .line 246
    iget-boolean v8, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipHeaderWhenFixedBehind:Z

    .line 247
    .line 248
    if-eqz v8, :cond_c

    .line 249
    .line 250
    iget-object v5, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 251
    .line 252
    if-eqz v5, :cond_c

    .line 253
    .line 254
    .line 255
    invoke-interface {v5}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 256
    move-result-object v5

    .line 257
    .line 258
    sget-object v8, Lib0/b;->f:Lib0/b;

    .line 259
    .line 260
    if-ne v5, v8, :cond_c

    .line 261
    goto :goto_3

    .line 262
    .line 263
    :cond_c
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 264
    .line 265
    iget v5, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderBackgroundColor:I

    .line 266
    .line 267
    if-eqz v5, :cond_d

    .line 268
    :goto_3
    move v5, v6

    .line 269
    goto :goto_4

    .line 270
    :cond_d
    move v5, v7

    .line 271
    .line 272
    :goto_4
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 273
    .line 274
    iget-boolean v9, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableClipFooterWhenFixedBehind:Z

    .line 275
    .line 276
    if-eqz v9, :cond_e

    .line 277
    .line 278
    iget-object v8, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 279
    .line 280
    if-eqz v8, :cond_e

    .line 281
    .line 282
    .line 283
    invoke-interface {v8}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 284
    move-result-object v8

    .line 285
    .line 286
    sget-object v9, Lib0/b;->f:Lib0/b;

    .line 287
    .line 288
    if-ne v8, v9, :cond_e

    .line 289
    goto :goto_5

    .line 290
    .line 291
    :cond_e
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 292
    .line 293
    iget v8, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterBackgroundColor:I

    .line 294
    .line 295
    if-eqz v8, :cond_f

    .line 296
    :goto_5
    move v8, v6

    .line 297
    goto :goto_6

    .line 298
    :cond_f
    move v8, v7

    .line 299
    .line 300
    :goto_6
    if-eqz v5, :cond_10

    .line 301
    .line 302
    if-gez v4, :cond_11

    .line 303
    .line 304
    if-gtz v3, :cond_11

    .line 305
    .line 306
    :cond_10
    if-eqz v8, :cond_12

    .line 307
    .line 308
    if-lez v4, :cond_11

    .line 309
    .line 310
    if-gez v3, :cond_12

    .line 311
    .line 312
    .line 313
    :cond_11
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 314
    .line 315
    :cond_12
    const/high16 v4, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/high16 v5, 0x40000000    # 2.0f

    .line 318
    .line 319
    if-gez v1, :cond_14

    .line 320
    .line 321
    if-lez v3, :cond_13

    .line 322
    goto :goto_7

    .line 323
    .line 324
    :cond_13
    move/from16 v16, v4

    .line 325
    .line 326
    goto/16 :goto_f

    .line 327
    .line 328
    :cond_14
    :goto_7
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 329
    .line 330
    iget-object v8, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 331
    .line 332
    if-eqz v8, :cond_13

    .line 333
    .line 334
    .line 335
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 336
    move-result v12

    .line 337
    .line 338
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 339
    .line 340
    iget v13, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 341
    int-to-float v9, v13

    .line 342
    .line 343
    iget v10, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 344
    mul-float/2addr v9, v10

    .line 345
    float-to-int v14, v9

    .line 346
    int-to-float v9, v12

    .line 347
    mul-float/2addr v9, v4

    .line 348
    .line 349
    if-nez v13, :cond_15

    .line 350
    move v10, v6

    .line 351
    goto :goto_8

    .line 352
    :cond_15
    move v10, v13

    .line 353
    :goto_8
    int-to-float v10, v10

    .line 354
    .line 355
    div-float v11, v9, v10

    .line 356
    .line 357
    iget-boolean v9, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 358
    .line 359
    .line 360
    invoke-virtual {v8, v9}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 361
    move-result v8

    .line 362
    .line 363
    if-nez v8, :cond_17

    .line 364
    .line 365
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 366
    .line 367
    iget-object v8, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 368
    .line 369
    sget-object v9, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->RefreshFinish:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 370
    .line 371
    if-ne v8, v9, :cond_16

    .line 372
    .line 373
    if-nez p2, :cond_16

    .line 374
    goto :goto_9

    .line 375
    .line 376
    :cond_16
    move/from16 v16, v4

    .line 377
    .line 378
    goto/16 :goto_e

    .line 379
    .line 380
    :cond_17
    :goto_9
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 381
    .line 382
    iget v9, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 383
    .line 384
    if-eq v3, v9, :cond_1b

    .line 385
    .line 386
    iget-object v8, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 387
    .line 388
    .line 389
    invoke-interface {v8}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 390
    move-result-object v8

    .line 391
    .line 392
    sget-object v9, Lib0/b;->d:Lib0/b;

    .line 393
    .line 394
    if-ne v8, v9, :cond_19

    .line 395
    .line 396
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 397
    .line 398
    iget-object v8, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 399
    .line 400
    .line 401
    invoke-interface {v8}, Lhb0/a;->getView()Landroid/view/View;

    .line 402
    move-result-object v8

    .line 403
    .line 404
    iget-object v9, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 405
    .line 406
    iget v9, v9, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 407
    int-to-float v9, v9

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8, v9}, Landroid/view/View;->setTranslationY(F)V

    .line 411
    .line 412
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 413
    .line 414
    iget v9, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderBackgroundColor:I

    .line 415
    .line 416
    if-eqz v9, :cond_18

    .line 417
    .line 418
    iget-object v9, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPaint:Landroid/graphics/Paint;

    .line 419
    .line 420
    if-eqz v9, :cond_18

    .line 421
    .line 422
    iget-boolean v9, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableHeaderTranslationContent:Z

    .line 423
    .line 424
    iget-object v10, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v8, v9, v10}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableTranslationContent(ZLhb0/a;)Z

    .line 428
    move-result v8

    .line 429
    .line 430
    if-nez v8, :cond_18

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 434
    .line 435
    :cond_18
    move/from16 v16, v4

    .line 436
    goto :goto_b

    .line 437
    .line 438
    :cond_19
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 439
    .line 440
    iget-object v8, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 441
    .line 442
    .line 443
    invoke-interface {v8}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 444
    move-result-object v8

    .line 445
    .line 446
    iget-boolean v8, v8, Lib0/b;->c:Z

    .line 447
    .line 448
    if-eqz v8, :cond_18

    .line 449
    .line 450
    iget-object v8, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 451
    .line 452
    iget-object v8, v8, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 453
    .line 454
    .line 455
    invoke-interface {v8}, Lhb0/a;->getView()Landroid/view/View;

    .line 456
    move-result-object v8

    .line 457
    .line 458
    .line 459
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 460
    move-result-object v9

    .line 461
    .line 462
    instance-of v10, v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 463
    .line 464
    if-eqz v10, :cond_1a

    .line 465
    .line 466
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 467
    goto :goto_a

    .line 468
    .line 469
    :cond_1a
    sget-object v9, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 470
    .line 471
    .line 472
    :goto_a
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 473
    move-result v10

    .line 474
    .line 475
    .line 476
    invoke-static {v10, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 477
    move-result v10

    .line 478
    .line 479
    iget-object v15, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 480
    .line 481
    iget v15, v15, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 482
    .line 483
    move/from16 v16, v4

    .line 484
    .line 485
    iget v4, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 486
    sub-int/2addr v15, v4

    .line 487
    .line 488
    iget v4, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 489
    sub-int/2addr v15, v4

    .line 490
    .line 491
    .line 492
    invoke-static {v15, v7}, Ljava/lang/Math;->max(II)I

    .line 493
    move-result v4

    .line 494
    .line 495
    .line 496
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 497
    move-result v4

    .line 498
    .line 499
    .line 500
    invoke-virtual {v8, v10, v4}, Landroid/view/View;->measure(II)V

    .line 501
    .line 502
    iget v4, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 503
    .line 504
    iget v9, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 505
    .line 506
    iget-object v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 507
    .line 508
    iget v10, v10, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderInsetStart:I

    .line 509
    add-int/2addr v9, v10

    .line 510
    .line 511
    .line 512
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 513
    move-result v10

    .line 514
    add-int/2addr v10, v4

    .line 515
    .line 516
    .line 517
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 518
    move-result v15

    .line 519
    add-int/2addr v15, v9

    .line 520
    .line 521
    .line 522
    invoke-virtual {v8, v4, v9, v10, v15}, Landroid/view/View;->layout(IIII)V

    .line 523
    .line 524
    :goto_b
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 525
    .line 526
    iget-object v9, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 527
    .line 528
    move/from16 v10, p2

    .line 529
    .line 530
    .line 531
    invoke-interface/range {v9 .. v14}, Lhb0/a;->onMoving(ZFIII)V

    .line 532
    goto :goto_c

    .line 533
    .line 534
    :cond_1b
    move/from16 v16, v4

    .line 535
    .line 536
    :goto_c
    if-eqz p2, :cond_1d

    .line 537
    .line 538
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 539
    .line 540
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 541
    .line 542
    .line 543
    invoke-interface {v4}, Lhb0/a;->isSupportHorizontalDrag()Z

    .line 544
    move-result v4

    .line 545
    .line 546
    if-eqz v4, :cond_1d

    .line 547
    .line 548
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 549
    .line 550
    iget v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 551
    float-to-int v4, v4

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 555
    move-result v8

    .line 556
    .line 557
    iget-object v9, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 558
    .line 559
    iget v10, v9, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 560
    .line 561
    if-nez v8, :cond_1c

    .line 562
    move v11, v6

    .line 563
    goto :goto_d

    .line 564
    :cond_1c
    move v11, v8

    .line 565
    :goto_d
    int-to-float v11, v11

    .line 566
    div-float/2addr v10, v11

    .line 567
    .line 568
    iget-object v9, v9, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 569
    .line 570
    .line 571
    invoke-interface {v9, v10, v4, v8}, Lhb0/a;->onHorizontalDrag(FII)V

    .line 572
    .line 573
    :cond_1d
    :goto_e
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 574
    .line 575
    iget v8, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 576
    .line 577
    if-eq v3, v8, :cond_1e

    .line 578
    .line 579
    .line 580
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    :cond_1e
    :goto_f
    if-lez v1, :cond_1f

    .line 583
    .line 584
    if-gez v3, :cond_28

    .line 585
    .line 586
    :cond_1f
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 587
    .line 588
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 589
    .line 590
    if-eqz v4, :cond_28

    .line 591
    .line 592
    .line 593
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 594
    move-result v1

    .line 595
    neg-int v1, v1

    .line 596
    .line 597
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 598
    .line 599
    iget v8, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 600
    int-to-float v9, v8

    .line 601
    .line 602
    iget v10, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterMaxDragRate:F

    .line 603
    mul-float/2addr v9, v10

    .line 604
    float-to-int v9, v9

    .line 605
    int-to-float v10, v1

    .line 606
    .line 607
    mul-float v10, v10, v16

    .line 608
    .line 609
    if-nez v8, :cond_20

    .line 610
    move v11, v6

    .line 611
    goto :goto_10

    .line 612
    :cond_20
    move v11, v8

    .line 613
    :goto_10
    int-to-float v11, v11

    .line 614
    .line 615
    div-float v19, v10, v11

    .line 616
    .line 617
    iget-boolean v10, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 618
    .line 619
    .line 620
    invoke-virtual {v4, v10}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 621
    move-result v4

    .line 622
    .line 623
    if-nez v4, :cond_21

    .line 624
    .line 625
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 626
    .line 627
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 628
    .line 629
    sget-object v10, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadFinish:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 630
    .line 631
    if-ne v4, v10, :cond_27

    .line 632
    .line 633
    if-nez p2, :cond_27

    .line 634
    .line 635
    :cond_21
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 636
    .line 637
    iget v10, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 638
    .line 639
    if-eq v3, v10, :cond_25

    .line 640
    .line 641
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 642
    .line 643
    .line 644
    invoke-interface {v4}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 645
    move-result-object v4

    .line 646
    .line 647
    sget-object v10, Lib0/b;->d:Lib0/b;

    .line 648
    .line 649
    if-ne v4, v10, :cond_22

    .line 650
    .line 651
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 652
    .line 653
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 654
    .line 655
    .line 656
    invoke-interface {v4}, Lhb0/a;->getView()Landroid/view/View;

    .line 657
    move-result-object v4

    .line 658
    .line 659
    iget-object v5, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 660
    .line 661
    iget v5, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 662
    int-to-float v5, v5

    .line 663
    .line 664
    .line 665
    invoke-virtual {v4, v5}, Landroid/view/View;->setTranslationY(F)V

    .line 666
    .line 667
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 668
    .line 669
    iget v5, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterBackgroundColor:I

    .line 670
    .line 671
    if-eqz v5, :cond_24

    .line 672
    .line 673
    iget-object v5, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mPaint:Landroid/graphics/Paint;

    .line 674
    .line 675
    if-eqz v5, :cond_24

    .line 676
    .line 677
    iget-boolean v5, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterTranslationContent:Z

    .line 678
    .line 679
    iget-object v7, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v4, v5, v7}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableTranslationContent(ZLhb0/a;)Z

    .line 683
    move-result v4

    .line 684
    .line 685
    if-nez v4, :cond_24

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 689
    goto :goto_12

    .line 690
    .line 691
    :cond_22
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 692
    .line 693
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 694
    .line 695
    .line 696
    invoke-interface {v4}, Lhb0/a;->getSpinnerStyle()Lib0/b;

    .line 697
    move-result-object v4

    .line 698
    .line 699
    iget-boolean v4, v4, Lib0/b;->c:Z

    .line 700
    .line 701
    if-eqz v4, :cond_24

    .line 702
    .line 703
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 704
    .line 705
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 706
    .line 707
    .line 708
    invoke-interface {v4}, Lhb0/a;->getView()Landroid/view/View;

    .line 709
    move-result-object v4

    .line 710
    .line 711
    .line 712
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 713
    move-result-object v10

    .line 714
    .line 715
    instance-of v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 716
    .line 717
    if-eqz v11, :cond_23

    .line 718
    .line 719
    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 720
    goto :goto_11

    .line 721
    .line 722
    :cond_23
    sget-object v10, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->sDefaultMarginLP:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 723
    .line 724
    .line 725
    :goto_11
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 726
    move-result v11

    .line 727
    .line 728
    .line 729
    invoke-static {v11, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 730
    move-result v11

    .line 731
    .line 732
    iget-object v12, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 733
    .line 734
    iget v12, v12, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 735
    neg-int v12, v12

    .line 736
    .line 737
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 738
    sub-int/2addr v12, v13

    .line 739
    .line 740
    iget v13, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 741
    sub-int/2addr v12, v13

    .line 742
    .line 743
    .line 744
    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    .line 745
    move-result v7

    .line 746
    .line 747
    .line 748
    invoke-static {v7, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 749
    move-result v5

    .line 750
    .line 751
    .line 752
    invoke-virtual {v4, v11, v5}, Landroid/view/View;->measure(II)V

    .line 753
    .line 754
    iget v5, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 755
    .line 756
    iget v7, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 757
    .line 758
    .line 759
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 760
    move-result v10

    .line 761
    add-int/2addr v7, v10

    .line 762
    .line 763
    iget-object v10, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 764
    .line 765
    iget v10, v10, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterInsetStart:I

    .line 766
    sub-int/2addr v7, v10

    .line 767
    .line 768
    .line 769
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 770
    move-result v10

    .line 771
    .line 772
    sub-int v10, v7, v10

    .line 773
    .line 774
    .line 775
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 776
    move-result v11

    .line 777
    add-int/2addr v11, v5

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4, v5, v10, v11, v7}, Landroid/view/View;->layout(IIII)V

    .line 781
    .line 782
    :cond_24
    :goto_12
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 783
    .line 784
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 785
    .line 786
    move/from16 v18, p2

    .line 787
    .line 788
    move/from16 v20, v1

    .line 789
    .line 790
    move-object/from16 v17, v4

    .line 791
    .line 792
    move/from16 v21, v8

    .line 793
    .line 794
    move/from16 v22, v9

    .line 795
    .line 796
    .line 797
    invoke-interface/range {v17 .. v22}, Lhb0/a;->onMoving(ZFIII)V

    .line 798
    .line 799
    :cond_25
    if-eqz p2, :cond_27

    .line 800
    .line 801
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 802
    .line 803
    iget-object v1, v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 804
    .line 805
    .line 806
    invoke-interface {v1}, Lhb0/a;->isSupportHorizontalDrag()Z

    .line 807
    move-result v1

    .line 808
    .line 809
    if-eqz v1, :cond_27

    .line 810
    .line 811
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 812
    .line 813
    iget v1, v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 814
    float-to-int v1, v1

    .line 815
    .line 816
    .line 817
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 818
    move-result v2

    .line 819
    .line 820
    iget-object v4, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 821
    .line 822
    iget v5, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastTouchX:F

    .line 823
    .line 824
    if-nez v2, :cond_26

    .line 825
    goto :goto_13

    .line 826
    :cond_26
    move v6, v2

    .line 827
    :goto_13
    int-to-float v6, v6

    .line 828
    div-float/2addr v5, v6

    .line 829
    .line 830
    iget-object v4, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshFooter:Lhb0/a;

    .line 831
    .line 832
    .line 833
    invoke-interface {v4, v5, v1, v2}, Lhb0/a;->onHorizontalDrag(FII)V

    .line 834
    .line 835
    :cond_27
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 836
    .line 837
    iget v2, v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 838
    .line 839
    if-eq v3, v2, :cond_28

    .line 840
    .line 841
    .line 842
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    :cond_28
    :goto_14
    return-object v0
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

.method public g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;
    .locals 2
    .param p1    # Lcom/scwang/smart/refresh/layout/constant/RefreshState;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$a;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result v1

    .line 7
    .line 8
    aget v0, v0, v1

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :pswitch_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setStateLoading(Z)V

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :pswitch_1
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setStateRefreshing(Z)V

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :pswitch_2
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 36
    .line 37
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 38
    .line 39
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 47
    move-result p1

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 52
    .line 53
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 61
    .line 62
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->LoadReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :pswitch_3
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 70
    .line 71
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 72
    .line 73
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 74
    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 81
    move-result p1

    .line 82
    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 86
    .line 87
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->RefreshReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_1
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 95
    .line 96
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->RefreshReleased:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :pswitch_4
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 104
    .line 105
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 106
    .line 107
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 108
    .line 109
    if-nez v0, :cond_2

    .line 110
    .line 111
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 115
    move-result p1

    .line 116
    .line 117
    if-eqz p1, :cond_2

    .line 118
    .line 119
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 120
    .line 121
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToTwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :cond_2
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 129
    .line 130
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToTwoLevel:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :pswitch_5
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 138
    .line 139
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 143
    move-result p1

    .line 144
    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 148
    .line 149
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 150
    .line 151
    iget-boolean v1, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 152
    .line 153
    if-nez v1, :cond_4

    .line 154
    .line 155
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFinishing:Z

    .line 156
    .line 157
    if-nez v0, :cond_4

    .line 158
    .line 159
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 160
    .line 161
    if-eqz v0, :cond_3

    .line 162
    .line 163
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 164
    .line 165
    if-eqz v0, :cond_3

    .line 166
    .line 167
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 168
    .line 169
    if-nez v0, :cond_4

    .line 170
    .line 171
    :cond_3
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_4
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 179
    .line 180
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :pswitch_6
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 188
    .line 189
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 190
    .line 191
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 192
    .line 193
    if-nez v0, :cond_5

    .line 194
    .line 195
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 199
    move-result p1

    .line 200
    .line 201
    if-eqz p1, :cond_5

    .line 202
    .line 203
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 204
    .line 205
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_5
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 213
    .line 214
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->ReleaseToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :pswitch_7
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 222
    .line 223
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 227
    move-result p1

    .line 228
    .line 229
    if-eqz p1, :cond_7

    .line 230
    .line 231
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 232
    .line 233
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 234
    .line 235
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 236
    .line 237
    if-nez v0, :cond_7

    .line 238
    .line 239
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 240
    .line 241
    if-eqz v0, :cond_6

    .line 242
    .line 243
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 244
    .line 245
    if-eqz v0, :cond_6

    .line 246
    .line 247
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 248
    .line 249
    if-nez v0, :cond_7

    .line 250
    .line 251
    :cond_6
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 255
    .line 256
    sget-object p1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_7
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 264
    .line 265
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :pswitch_8
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 273
    .line 274
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 275
    .line 276
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 277
    .line 278
    if-nez v0, :cond_8

    .line 279
    .line 280
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 284
    move-result p1

    .line 285
    .line 286
    if-eqz p1, :cond_8

    .line 287
    .line 288
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 289
    .line 290
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 294
    .line 295
    sget-object p1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_8
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 303
    .line 304
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownCanceled:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    :pswitch_9
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 312
    .line 313
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableLoadMore:Z

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 317
    move-result p1

    .line 318
    .line 319
    if-eqz p1, :cond_a

    .line 320
    .line 321
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 322
    .line 323
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 324
    .line 325
    iget-boolean v1, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 326
    .line 327
    if-nez v1, :cond_a

    .line 328
    .line 329
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isFinishing:Z

    .line 330
    .line 331
    if-nez v0, :cond_a

    .line 332
    .line 333
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreData:Z

    .line 334
    .line 335
    if-eqz v0, :cond_9

    .line 336
    .line 337
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 338
    .line 339
    if-eqz v0, :cond_9

    .line 340
    .line 341
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterNoMoreDataEffective:Z

    .line 342
    .line 343
    if-nez v0, :cond_a

    .line 344
    .line 345
    :cond_9
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 346
    .line 347
    .line 348
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 349
    goto :goto_0

    .line 350
    .line 351
    :cond_a
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 352
    .line 353
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullUpToLoad:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 357
    goto :goto_0

    .line 358
    .line 359
    :pswitch_a
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 360
    .line 361
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 362
    .line 363
    iget-boolean v0, v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->isOpening:Z

    .line 364
    .line 365
    if-nez v0, :cond_b

    .line 366
    .line 367
    iget-boolean v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableRefresh:Z

    .line 368
    .line 369
    .line 370
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->isEnableRefreshOrLoadMore(Z)Z

    .line 371
    move-result p1

    .line 372
    .line 373
    if-eqz p1, :cond_b

    .line 374
    .line 375
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 376
    .line 377
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 381
    goto :goto_0

    .line 382
    .line 383
    :cond_b
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 384
    .line 385
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->PullDownToRefresh:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setViceState(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 389
    goto :goto_0

    .line 390
    .line 391
    :pswitch_b
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 392
    .line 393
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mState:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 394
    .line 395
    sget-object v1, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 396
    .line 397
    if-eq v0, v1, :cond_c

    .line 398
    .line 399
    iget v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 400
    .line 401
    if-nez v0, :cond_c

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1, v1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 405
    goto :goto_0

    .line 406
    .line 407
    :cond_c
    iget p1, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 408
    .line 409
    if-eqz p1, :cond_d

    .line 410
    const/4 p1, 0x0

    .line 411
    .line 412
    .line 413
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$n;->a(I)Landroid/animation/ValueAnimator;

    .line 414
    :cond_d
    :goto_0
    const/4 p1, 0x0

    .line 415
    return-object p1

    .line 416
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
