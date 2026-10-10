.class public Lcom/tencent/imsdk/message/MessageOfflinePushInfo;
.super Ljava/lang/Object;
.source "MessageOfflinePushInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;,
        Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;,
        Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;
    }
.end annotation


# static fields
.field public static final OFFLINE_APNS_BADGE_MODE_DEFAULT:I = 0x0

.field public static final OFFLINE_APNS_BADGE_MODE_IGNORE:I = 0x1

.field public static final OFFLINE_HARMONY_BADGE_MODE_DEFAULT:I = 0x0

.field public static final OFFLINE_HARMONY_BADGE_MODE_IGNORE:I = 0x1

.field public static final OFFLINE_PUSH_FLAG_DEFAULT:I = 0x0

.field public static final OFFLINE_PUSH_FLAG_NO_PUSH:I = 0x1


# instance fields
.field private androidConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

.field private apnsConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

.field private description:Ljava/lang/String;

.field private extension:[B

.field private harmonyConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

.field private pushFlag:I

.field private soundFilePath:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private vendorParams:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;-><init>(Lcom/tencent/imsdk/message/MessageOfflinePushInfo;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->apnsConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;-><init>(Lcom/tencent/imsdk/message/MessageOfflinePushInfo;)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->androidConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

    .line 18
    .line 19
    new-instance v0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;-><init>(Lcom/tencent/imsdk/message/MessageOfflinePushInfo;)V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->harmonyConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

    .line 25
    return-void
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
.end method


# virtual methods
.method public getAndroidConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->androidConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

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

.method public getApnsConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->apnsConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

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

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->description:Ljava/lang/String;

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

.method public getExtension()[B
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->extension:[B

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

.method public getHarmonyConfig()Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->harmonyConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

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

.method public getPushFlag()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->pushFlag:I

    .line 3
    return v0
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

.method public getSoundFilePath()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->soundFilePath:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->title:Ljava/lang/String;

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

.method public getVendorParams()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->vendorParams:Ljava/lang/String;

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

.method public setAndroidConfig(Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->androidConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$AndroidOfflinePushInfo;

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
    .line 25
.end method

.method public setApnsConfig(Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->apnsConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;

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
    .line 25
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->description:Ljava/lang/String;

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
    .line 25
.end method

.method public setExtension([B)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->extension:[B

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
    .line 25
.end method

.method public setHarmonyConfig(Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->harmonyConfig:Lcom/tencent/imsdk/message/MessageOfflinePushInfo$HarmonyOfflinePushInfo;

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
    .line 25
.end method

.method public setPushFlag(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->pushFlag:I

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
    .line 25
.end method

.method public setSoundFilePath(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->soundFilePath:Ljava/lang/String;

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
    .line 25
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->title:Ljava/lang/String;

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
    .line 25
.end method

.method public setVendorParams(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo;->vendorParams:Ljava/lang/String;

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
    .line 25
.end method
