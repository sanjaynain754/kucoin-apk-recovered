.class public abstract Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;
.super Ljava/lang/Object;
.source "TUICallback.java"


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

.method public static onError(Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;ILjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static onSuccess(Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/qcloud/tuicore/interfaces/TUICallback;->onSuccess()V

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract onError(ILjava/lang/String;)V
.end method

.method public abstract onSuccess()V
.end method
