.class public final Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/common/replay/video/SimpleFrameMuxer;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x12
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0011\u001a\u00020\u0008H\u0016J\u0008\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0008\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;",
        "Lcom/tencent/bugly/common/replay/video/SimpleFrameMuxer;",
        "path",
        "",
        "fps",
        "",
        "(Ljava/lang/String;F)V",
        "finalVideoTime",
        "",
        "frameDurationUsec",
        "muxer",
        "Landroid/media/MediaMuxer;",
        "started",
        "",
        "videoFrames",
        "",
        "videoTrackIndex",
        "getVideoTime",
        "isStarted",
        "muxVideoFrame",
        "",
        "encodedData",
        "Ljava/nio/ByteBuffer;",
        "bufferInfo",
        "Landroid/media/MediaCodec$BufferInfo;",
        "release",
        "start",
        "videoFormat",
        "Landroid/media/MediaFormat;",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private finalVideoTime:J

.field private final frameDurationUsec:J

.field private final muxer:Landroid/media/MediaMuxer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private started:Z

.field private videoFrames:I

.field private videoTrackIndex:I


# direct methods
.method public constructor <init>(Ljava/lang/String;F)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "path"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-wide/16 v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 17
    move-result-wide v0

    .line 18
    long-to-float v0, v0

    .line 19
    div-float/2addr v0, p2

    .line 20
    float-to-long v0, v0

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->frameDurationUsec:J

    .line 23
    .line 24
    new-instance p2, Landroid/media/MediaMuxer;

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct {p2, p1, v0}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    iput-object p2, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->muxer:Landroid/media/MediaMuxer;

    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public getVideoTime()J
    .locals 5

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->videoFrames:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    return-wide v0

    .line 8
    .line 9
    :cond_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    iget-wide v1, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->finalVideoTime:J

    .line 12
    .line 13
    iget-wide v3, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->frameDurationUsec:J

    .line 14
    add-long/2addr v1, v3

    .line 15
    .line 16
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
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
.end method

.method public isStarted()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->started:Z

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

.method public muxVideoFrame(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 4
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/media/MediaCodec$BufferInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "encodedData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "bufferInfo"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-wide v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->frameDurationUsec:J

    .line 13
    .line 14
    iget v2, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->videoFrames:I

    .line 15
    .line 16
    add-int/lit8 v3, v2, 0x1

    .line 17
    .line 18
    iput v3, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->videoFrames:I

    .line 19
    int-to-long v2, v2

    .line 20
    mul-long/2addr v0, v2

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->finalVideoTime:J

    .line 23
    .line 24
    iput-wide v0, p2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 25
    .line 26
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->muxer:Landroid/media/MediaMuxer;

    .line 27
    .line 28
    iget v1, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->videoTrackIndex:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, p1, p2}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public release()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->muxer:Landroid/media/MediaMuxer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->muxer:Landroid/media/MediaMuxer;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public start(Landroid/media/MediaFormat;)V
    .locals 1
    .param p1    # Landroid/media/MediaFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "videoFormat"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->muxer:Landroid/media/MediaMuxer;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 12
    move-result p1

    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->videoTrackIndex:I

    .line 15
    .line 16
    iget-object p1, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->muxer:Landroid/media/MediaMuxer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/media/MediaMuxer;->start()V

    .line 20
    const/4 p1, 0x1

    .line 21
    .line 22
    iput-boolean p1, p0, Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;->started:Z

    .line 23
    return-void
    .line 24
    .line 25
.end method
