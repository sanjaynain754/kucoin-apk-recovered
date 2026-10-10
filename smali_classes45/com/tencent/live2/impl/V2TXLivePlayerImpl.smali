.class public Lcom/tencent/live2/impl/V2TXLivePlayerImpl;
.super Lcom/tencent/live2/V2TXLivePlayer;
.source "SourceFile"


# instance fields
.field private mImpl:Lcom/tencent/live2/V2TXLivePlayer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/util/SoLoader;->loadAllLibraries()Z

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/live2/V2TXLivePlayer;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/liteav/live/V2TXLivePlayerJni;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, Lcom/tencent/liteav/live/V2TXLivePlayerJni;-><init>(Landroid/content/Context;Lcom/tencent/live2/impl/V2TXLivePlayerImpl;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 11
    return-void
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
.end method


# virtual methods
.method public enableObserveAudioFrame(Z)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->enableObserveAudioFrame(Z)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public enableObserveVideoFrame(ZLcom/tencent/live2/V2TXLiveDef$V2TXLivePixelFormat;Lcom/tencent/live2/V2TXLiveDef$V2TXLiveBufferType;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/live2/V2TXLivePlayer;->enableObserveVideoFrame(ZLcom/tencent/live2/V2TXLiveDef$V2TXLivePixelFormat;Lcom/tencent/live2/V2TXLiveDef$V2TXLiveBufferType;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method

.method public enableReceiveSeiMessage(ZI)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/live2/V2TXLivePlayer;->enableReceiveSeiMessage(ZI)I

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public enableVolumeEvaluation(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->enableVolumeEvaluation(I)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public getStreamList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/live2/V2TXLiveDef$V2TXLiveStreamInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->getStreamList()Ljava/util/ArrayList;

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
    .line 18
.end method

.method public isPlaying()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->isPlaying()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public pauseAudio()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->pauseAudio()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public pauseVideo()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->pauseVideo()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public resumeAudio()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->resumeAudio()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public resumeVideo()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->resumeVideo()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public setCacheParams(FF)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/live2/V2TXLivePlayer;->setCacheParams(FF)I

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public setObserver(Lcom/tencent/live2/V2TXLivePlayerObserver;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->setObserver(Lcom/tencent/live2/V2TXLivePlayerObserver;)V

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
.end method

.method public setPlayoutVolume(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->setPlayoutVolume(I)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/tencent/live2/V2TXLivePlayer;->setProperty(Ljava/lang/String;Ljava/lang/Object;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public setRenderFillMode(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveFillMode;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->setRenderFillMode(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveFillMode;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setRenderMirrorMode(Z)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->setRenderMirrorMode(Z)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setRenderRotation(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveRotation;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->setRenderRotation(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveRotation;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setRenderView(Landroid/view/SurfaceView;)I
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->setRenderView(Landroid/view/SurfaceView;)I

    move-result p1

    return p1
.end method

.method public setRenderView(Landroid/view/TextureView;)I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->setRenderView(Landroid/view/TextureView;)I

    move-result p1

    return p1
.end method

.method public setRenderView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->setRenderView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)I

    move-result p1

    return p1
.end method

.method public showDebugView(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->showDebugView(Z)V

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
.end method

.method public snapshot()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->snapshot()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public startLivePlay(Ljava/lang/String;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->startLivePlay(Ljava/lang/String;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public startLocalRecording(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveLocalRecordingParams;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->startLocalRecording(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveLocalRecordingParams;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public stopLocalRecording()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->stopLocalRecording()V

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
.end method

.method public stopPlay()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/live2/V2TXLivePlayer;->stopPlay()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public switchStream(Ljava/lang/String;)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/live2/impl/V2TXLivePlayerImpl;->mImpl:Lcom/tencent/live2/V2TXLivePlayer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/live2/V2TXLivePlayer;->switchStream(Ljava/lang/String;)I

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method
