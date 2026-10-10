.class public Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::audio"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "MusicResourceDecoderAndroid"


# instance fields
.field private final mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

.field private mPath:Ljava/lang/String;

.field private mTrackIndex:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mTrackIndex:I

    .line 7
    .line 8
    new-instance v0, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public decode()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->processFrame()Ljava/nio/ByteBuffer;

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

.method public getBitrate()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->getOutputFormat()Landroid/media/MediaFormat;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    :try_start_0
    const-string v2, "bitrate"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 16
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    return v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "getBitrate failed. "

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    const/4 v2, 0x0

    .line 38
    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string v3, "MusicResourceDecoderAndroid"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    return v1
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

.method public getChannelCount()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->getOutputFormat()Landroid/media/MediaFormat;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    :try_start_0
    const-string v2, "channel-count"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 16
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    return v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "getChannelCount failed. "

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    const/4 v2, 0x0

    .line 38
    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string v3, "MusicResourceDecoderAndroid"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    return v1
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

.method public getDuration()J
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->getLongestDuration()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    const-wide/16 v2, 0x1f4

    .line 9
    add-long/2addr v0, v2

    .line 10
    .line 11
    const-wide/16 v2, 0x3e8

    .line 12
    div-long/2addr v0, v2

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public getSampleRate()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->getOutputFormat()Landroid/media/MediaFormat;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    .line 13
    :cond_0
    :try_start_0
    const-string/jumbo v2, "sample-rate"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 17
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v3, "getSampleRate failed. "

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    const/4 v2, 0x0

    .line 39
    .line 40
    new-array v2, v2, [Ljava/lang/Object;

    .line 41
    .line 42
    const-string v3, "MusicResourceDecoderAndroid"

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v0, v2}, Lcom/tencent/liteav/base/Log;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return v1
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

.method public getTotalRawDataSize()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->getTotalRawDataSize()I

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
.end method

.method public getTrackCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->getTrackCount()I

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
.end method

.method public isDecodeEnd()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->isDecodeEnd()Z

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
.end method

.method public seekTo(J)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->isDecodeEnd()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->stop()V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mPath:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->initAndStart(Ljava/lang/String;)Z

    .line 21
    .line 22
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 23
    .line 24
    iget v1, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mTrackIndex:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->setMusicTrack(I)V

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 30
    .line 31
    const-wide/16 v1, 0x3e8

    .line 32
    mul-long/2addr p1, v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->seekTo(J)Z

    .line 36
    move-result p1

    .line 37
    return p1
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
.end method

.method public setMusicTrack(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mTrackIndex:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->setMusicTrack(I)V

    .line 8
    return-void
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

.method public start(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mPath:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->initAndStart(Ljava/lang/String;)Z

    .line 8
    move-result p1

    .line 9
    return p1
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

.method public stop()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/audio/musicdecoder/MusicResourceDecoderAndroid;->mDecoder:Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/audio/musicdecoder/MediaCodecBridge;->stop()V

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
.end method
