.class public Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;
.super Ljava/lang/Object;
.source "MessageOfflinePushInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/imsdk/message/MessageOfflinePushInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "APNSOfflinePushInfo"
.end annotation


# instance fields
.field private backgroundNotification:I

.field private badgeMode:I

.field private description:Ljava/lang/String;

.field private iOSImageUrl:Ljava/lang/String;

.field private iOSPushType:I

.field private interruptionLevel:Ljava/lang/String;

.field private soundFilePath:Ljava/lang/String;

.field final synthetic this$0:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/message/MessageOfflinePushInfo;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->this$0:Lcom/tencent/imsdk/message/MessageOfflinePushInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const/4 p1, 0x0

    .line 7
    .line 8
    iput p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->iOSPushType:I

    .line 9
    return-void
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


# virtual methods
.method public setBackgroundNotification(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->backgroundNotification:I

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

.method public setBadgeMode(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->badgeMode:I

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

.method public setIOSImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->iOSImageUrl:Ljava/lang/String;

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

.method public setIOSPushType(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->iOSPushType:I

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

.method public setInterruptionLevel(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->interruptionLevel:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageOfflinePushInfo$APNSOfflinePushInfo;->soundFilePath:Ljava/lang/String;

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
