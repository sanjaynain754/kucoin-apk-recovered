.class public Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;
.super Ljava/lang/Object;
.source "SmartRefreshLayout.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;


# direct methods
.method public constructor <init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;I)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->c:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;

    .line 3
    .line 4
    iput p2, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->b:I

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public run()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->c:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;->f:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 5
    .line 6
    iget-boolean v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableScrollContentWhenLoaded:Z

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->b:I

    .line 13
    .line 14
    if-gez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mRefreshContent:Lhb0/b;

    .line 17
    .line 18
    iget v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, v0}, Lhb0/b;->d(I)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    filled-new-array {v2, v2}, [I

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Landroid/animation/ValueAnimator$AnimatorUpdateListener;->onAnimationUpdate(Landroid/animation/ValueAnimator;)V

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v3

    .line 38
    .line 39
    :cond_1
    :goto_0
    new-instance v1, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a$a;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a$a;-><init>(Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;)V

    .line 43
    .line 44
    iget-object v4, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->c:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;

    .line 45
    .line 46
    iget-object v5, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;->f:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 47
    .line 48
    iget v6, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mSpinner:I

    .line 49
    .line 50
    if-lez v6, :cond_2

    .line 51
    .line 52
    iget-object v0, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v2}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 56
    move-result-object v0

    .line 57
    goto :goto_3

    .line 58
    .line 59
    :cond_2
    if-nez v0, :cond_6

    .line 60
    .line 61
    if-nez v6, :cond_3

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :cond_3
    iget-boolean v0, v4, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;->d:Z

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    iget-boolean v0, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mEnableFooterFollowWhenNoMoreData:Z

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    iget v0, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mFooterHeight:I

    .line 73
    neg-int v2, v0

    .line 74
    .line 75
    if-lt v6, v2, :cond_4

    .line 76
    .line 77
    sget-object v0, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v0}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->notifyStateChanged(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)V

    .line 81
    goto :goto_2

    .line 82
    .line 83
    :cond_4
    iget-object v2, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 84
    neg-int v0, v0

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v0}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 88
    move-result-object v0

    .line 89
    goto :goto_3

    .line 90
    .line 91
    :cond_5
    iget-object v0, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v2}, Lhb0/e;->a(I)Landroid/animation/ValueAnimator;

    .line 95
    move-result-object v0

    .line 96
    goto :goto_3

    .line 97
    .line 98
    :cond_6
    :goto_1
    iget-object v0, v5, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 99
    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    const-wide/16 v4, 0x0

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 106
    .line 107
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->c:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;

    .line 108
    .line 109
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;->f:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 110
    .line 111
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 115
    .line 116
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->c:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;

    .line 117
    .line 118
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;->f:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 119
    .line 120
    iput-object v3, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->reboundAnimator:Landroid/animation/ValueAnimator;

    .line 121
    .line 122
    :cond_7
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->c:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;

    .line 123
    .line 124
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;->f:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 125
    .line 126
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v2, v2}, Lhb0/e;->f(IZ)Lhb0/e;

    .line 130
    .line 131
    iget-object v0, p0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h$a;->c:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;

    .line 132
    .line 133
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout$h;->f:Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;

    .line 134
    .line 135
    iget-object v0, v0, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->mKernel:Lhb0/e;

    .line 136
    .line 137
    sget-object v2, Lcom/scwang/smart/refresh/layout/constant/RefreshState;->None:Lcom/scwang/smart/refresh/layout/constant/RefreshState;

    .line 138
    .line 139
    .line 140
    invoke-interface {v0, v2}, Lhb0/e;->g(Lcom/scwang/smart/refresh/layout/constant/RefreshState;)Lhb0/e;

    .line 141
    :goto_2
    move-object v0, v3

    .line 142
    .line 143
    :goto_3
    if-eqz v0, :cond_8

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 147
    return-void

    .line 148
    .line 149
    .line 150
    :cond_8
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 151
    return-void
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
.end method
