.class public Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;
.super Ljava/lang/Object;
.source "V2TIMOfflinePushConfig.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private offlinePushToken:Lcom/tencent/imsdk/offlinepush/OfflinePushToken;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

    invoke-direct {v0}, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;-><init>()V

    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;->offlinePushToken:Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

    long-to-int p1, p1

    .line 3
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;->setBusinessID(I)V

    .line 4
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;->offlinePushToken:Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

    invoke-virtual {p1, p3}, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;->setDeviceToken(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;->offlinePushToken:Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;->setIsTPNSToken(Z)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

    invoke-direct {v0}, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;-><init>()V

    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;->offlinePushToken:Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

    long-to-int p1, p1

    .line 8
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;->setBusinessID(I)V

    .line 9
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;->offlinePushToken:Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

    invoke-virtual {p1, p3}, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;->setDeviceToken(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;->offlinePushToken:Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

    invoke-virtual {p1, p4}, Lcom/tencent/imsdk/offlinepush/OfflinePushToken;->setIsTPNSToken(Z)V

    return-void
.end method


# virtual methods
.method public getOfflinePushToken()Lcom/tencent/imsdk/offlinepush/OfflinePushToken;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushConfig;->offlinePushToken:Lcom/tencent/imsdk/offlinepush/OfflinePushToken;

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
.end method
