.class Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/trtc/TrtcCloudJni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RemoteStatistics"
.end annotation


# instance fields
.field public a:Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;->a:Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static addRemoteStatistics(Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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

.method public static createRemoteStatistics(Ljava/lang/String;IIIIIIIIIIIIIIIIII)Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;-><init>()V

    .line 6
    .line 7
    iget-object v1, v0, Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;->a:Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;

    .line 8
    .line 9
    iput-object p0, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->userId:Ljava/lang/String;

    .line 10
    .line 11
    iput p1, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->streamType:I

    .line 12
    .line 13
    iput p2, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->width:I

    .line 14
    .line 15
    iput p3, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->height:I

    .line 16
    .line 17
    iput p4, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->frameRate:I

    .line 18
    .line 19
    iput p11, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->audioPacketLoss:I

    .line 20
    .line 21
    iput p5, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->videoPacketLoss:I

    .line 22
    .line 23
    iput p8, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->videoBlockRate:I

    .line 24
    .line 25
    iput p7, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->videoTotalBlockTime:I

    .line 26
    .line 27
    iput p6, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->videoBitrate:I

    .line 28
    .line 29
    iput p10, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->audioBitrate:I

    .line 30
    .line 31
    iput p9, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->audioSampleRate:I

    .line 32
    .line 33
    iput p12, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->audioTotalBlockTime:I

    .line 34
    .line 35
    iput p13, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->audioBlockRate:I

    .line 36
    .line 37
    move/from16 p0, p14

    .line 38
    .line 39
    iput p0, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->jitterBufferDelay:I

    .line 40
    .line 41
    move/from16 p0, p15

    .line 42
    .line 43
    iput p0, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->point2PointDelay:I

    .line 44
    .line 45
    move/from16 p0, p16

    .line 46
    .line 47
    iput p0, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->finalLoss:I

    .line 48
    .line 49
    move/from16 p0, p17

    .line 50
    .line 51
    iput p0, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->remoteNetworkUplinkLoss:I

    .line 52
    .line 53
    move/from16 p0, p18

    .line 54
    .line 55
    iput p0, v1, Lcom/tencent/trtc/TRTCStatistics$TRTCRemoteStatistics;->remoteNetworkRTT:I

    .line 56
    return-object v0
.end method

.method public static createRemoteStatisticsArray()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/trtc/TrtcCloudJni$RemoteStatistics;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    return-object v0
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
