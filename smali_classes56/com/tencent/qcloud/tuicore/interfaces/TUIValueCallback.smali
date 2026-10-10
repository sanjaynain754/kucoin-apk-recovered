.class public abstract Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback;
.super Ljava/lang/Object;
.source "TUIValueCallback.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static onError(Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback<",
            "TT;>;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static onProgress(Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback;JJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback<",
            "TT;>;JJ)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback;->onProgress(JJ)V

    :cond_0
    return-void
.end method

.method public static onSuccess(Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback<",
            "TT;>;TT;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/qcloud/tuicore/interfaces/TUIValueCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract onError(ILjava/lang/String;)V
.end method

.method public onProgress(JJ)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract onSuccess(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
