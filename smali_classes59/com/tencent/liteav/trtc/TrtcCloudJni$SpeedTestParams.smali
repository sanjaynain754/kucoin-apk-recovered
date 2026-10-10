.class Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/trtc/TrtcCloudJni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SpeedTestParams"
.end annotation


# instance fields
.field private final a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

.field private final b:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    invoke-direct {v0}, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    .line 6
    iput p1, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->sdkAppId:I

    .line 7
    iput-object p2, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->userId:Ljava/lang/String;

    .line 8
    iput-object p3, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->userSig:Ljava/lang/String;

    const/4 p1, 0x1

    .line 9
    iput p1, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->scene:I

    .line 10
    iput-boolean p1, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->b:Z

    return-void
.end method

.method public constructor <init>(Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->b:Z

    return-void
.end method


# virtual methods
.method public getExpectedDownBandwidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->expectedDownBandwidth:I

    .line 5
    return v0
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

.method public getExpectedUpBandwidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->expectedUpBandwidth:I

    .line 5
    return v0
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

.method public getIsCalledFromDeprecatedApi()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->b:Z

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

.method public getSDKAppId()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->sdkAppId:I

    .line 5
    return v0
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

.method public getScene()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->scene:I

    .line 5
    return v0
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

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->userId:Ljava/lang/String;

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

.method public getUserSig()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$SpeedTestParams;->a:Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/trtc/TRTCCloudDef$TRTCSpeedTestParams;->userSig:Ljava/lang/String;

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
