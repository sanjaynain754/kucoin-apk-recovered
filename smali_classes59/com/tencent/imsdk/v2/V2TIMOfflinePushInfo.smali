.class public Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;
.super Ljava/lang/Object;
.source "V2TIMOfflinePushInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final IOS_OFFLINE_PUSH_DEFAULT_SOUND:Ljava/lang/String; = "default"

.field public static final IOS_OFFLINE_PUSH_NO_SOUND:Ljava/lang/String; = "push.no_sound"

.field public static final IOS_OFFLINE_PUSH_TYPE_APNS:I = 0x0

.field public static final IOS_OFFLINE_PUSH_TYPE_VOIP:I = 0x1


# instance fields
.field private messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public disablePush(Z)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->setPushFlag(I)V

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->setPushFlag(I)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public enableIOSBackgroundNotification(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getApnsConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->setBackgroundNotification(I)V

    .line 10
    return-void
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
.end method

.method public getAndroidSound()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->getSoundFilePath()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getDesc()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getDescription()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getExt()[B
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getExtension()[B

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getMessageOfflinePushInfo()Lcom/tencent/imsdk/message/MessageOfflinePushInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

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

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getTitle()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getVendorParams()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getVendorParams()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public isDisablePush()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getPushFlag()I

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public setAndroidFCMChannelID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setFCMChannelID(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidFCMImage(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setFCMImageUrl(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidHonorImage(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setHonorImageUrl(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidHonorImportance(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setHonorImportance(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidHuaWeiCategory(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setHuaWeiCategory(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidHuaWeiImage(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setHuaWeiImageUrl(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidMeizuNotifyType(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setMeizuNotifyType(I)V

    .line 10
    return-void
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
.end method

.method public setAndroidOPPOCategory(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setOppoCategory(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidOPPOChannelID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setOppoChannelID(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidOPPONotifyLevel(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setOppoNotifyLevel(I)V

    .line 10
    return-void
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
.end method

.method public setAndroidSound(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setSoundFilePath(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidVIVOCategory(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setVivoCategory(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setAndroidVIVOClassification(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setVivoClassification(I)V

    .line 10
    return-void
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
.end method

.method public setAndroidXiaoMiChannelID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;->setXiaoMiChannelID(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setDesc(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->setDescription(Ljava/lang/String;)V

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
    .line 25
.end method

.method public setExt([B)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->setExtension([B)V

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
    .line 25
.end method

.method public setHarmonyCategory(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getHarmonyConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;->setCategory(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setHarmonyImage(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getHarmonyConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;->setImageUrl(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setIOSImage(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getApnsConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->setIOSImageUrl(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setIOSInterruptionLevel(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getApnsConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->setInterruptionLevel(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setIOSPushType(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getApnsConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->setIOSPushType(I)V

    .line 10
    return-void
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
.end method

.method public setIOSSound(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getApnsConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->setSoundFilePath(Ljava/lang/String;)V

    .line 10
    return-void
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
.end method

.method public setIgnoreHarmonyBadge(Z)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getHarmonyConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;->setBadgeMode(I)V

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getHarmonyConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;->setBadgeMode(I)V

    .line 24
    return-void
    .line 25
.end method

.method public setIgnoreIOSBadge(Z)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getApnsConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->setBadgeMode(I)V

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->getApnsConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 19
    move-result-object p1

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->setBadgeMode(I)V

    .line 24
    return-void
    .line 25
.end method

.method public setMessageOfflinePushInfo(Lcom/tencent/imsdk/message/MessageOfflinePushInfo;)V
    .locals 0

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;-><init>()V

    .line 8
    .line 9
    :cond_0
    iput-object p1, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 10
    return-void
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
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->setTitle(Ljava/lang/String;)V

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
    .line 25
.end method

.method public setVendorParams(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/v2/V2TIMOfflinePushInfo;->messageOfflinePushInfo:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->setVendorParams(Ljava/lang/String;)V

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
    .line 25
.end method
