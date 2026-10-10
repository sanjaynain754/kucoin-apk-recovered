.class public abstract Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;
.super Ljava/lang/Object;
.source "BGAOnNoDoubleClickListener.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public b:I

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x3e8

    .line 6
    .line 7
    iput v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;->b:I

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;->c:J

    .line 12
    return-void
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
.end method


# virtual methods
.method public abstract a(Landroid/view/View;)V
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;->c:J

    .line 7
    .line 8
    sub-long v2, v0, v2

    .line 9
    .line 10
    iget v4, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;->b:I

    .line 11
    int-to-long v4, v4

    .line 12
    .line 13
    cmp-long v2, v2, v4

    .line 14
    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;->c:J

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/bingoogolapple/bgabanner/d;->a(Landroid/view/View;)V

    .line 21
    :cond_0
    return-void
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
.end method
