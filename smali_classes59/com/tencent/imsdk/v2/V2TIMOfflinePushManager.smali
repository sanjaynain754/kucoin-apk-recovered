.class public abstract Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;
.super Ljava/lang/Object;
.source "V2TIMOfflinePushManager.java"


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
    .line 17
.end method

.method public static getInstance()Lcom/tencent/imsdk/v2/V2TIMOfflinePushManager;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMOfflinePushManagerImpl;->getInstance()Lcom/tencent/imsdk/v2/V2TIMOfflinePushManagerImpl;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method


# virtual methods
.method public abstract doBackground(ILcom/tencent/imsdk/v2/V2TIMCallback;)V
.end method

.method public abstract doForeground(Lcom/tencent/imsdk/v2/V2TIMCallback;)V
.end method

.method public abstract setOfflinePushConfig(Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;Lcom/tencent/imsdk/v2/V2TIMCallback;)V
.end method
