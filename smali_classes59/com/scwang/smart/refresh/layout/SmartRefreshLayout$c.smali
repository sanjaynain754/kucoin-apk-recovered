.class public Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SmartRefreshLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setStateRefreshing(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;


# direct methods
.method public constructor <init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->b:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->a:Z

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

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
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/animation/Animator;->getDuration()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->b:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    move-result-wide v0

    .line 20
    .line 21
    iput-wide v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mLastOpenTime:J

    .line 22
    .line 23
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->b:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 24
    .line 25
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->Refreshing:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 29
    .line 30
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->b:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 31
    .line 32
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshListener:Ljb0/g;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-boolean v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->a:Z

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, p1}, Ljb0/g;->a(Lhb0/f;)V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->b:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 48
    .line 49
    const/16 v0, 0xbb8

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->finishRefresh(I)Lhb0/f;

    .line 53
    .line 54
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->b:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 55
    .line 56
    iget-object v0, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshHeader:Lhb0/a;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget v1, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderHeight:I

    .line 61
    .line 62
    iget v2, p1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mHeaderMaxDragRate:F

    .line 63
    int-to-float v3, v1

    .line 64
    mul-float/2addr v2, v3

    .line 65
    float-to-int v2, v2

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, p1, v1, v2}, Lhb0/a;->onStartAnimator(Lhb0/f;II)V

    .line 69
    .line 70
    :cond_3
    iget-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$c;->b:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    return-void
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
