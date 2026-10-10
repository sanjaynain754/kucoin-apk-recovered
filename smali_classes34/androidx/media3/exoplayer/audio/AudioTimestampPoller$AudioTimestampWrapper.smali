.class final Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;
.super Ljava/lang/Object;
.source "AudioTimestampPoller.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/audio/AudioTimestampPoller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioTimestampWrapper"
.end annotation


# instance fields
.field private accumulatedRawTimestampFramePosition:J

.field private final audioTimestamp:Landroid/media/AudioTimestamp;

.field private final audioTrack:Landroid/media/AudioTrack;

.field private expectTimestampFramePositionReset:Z

.field private lastTimestampPositionFrames:J

.field private lastTimestampRawPositionFrames:J

.field private rawTimestampFramePositionWrapCount:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->audioTrack:Landroid/media/AudioTrack;

    .line 6
    .line 7
    new-instance p1, Landroid/media/AudioTimestamp;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Landroid/media/AudioTimestamp;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->audioTimestamp:Landroid/media/AudioTimestamp;

    .line 13
    return-void
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
.method public expectTimestampFramePositionReset()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->expectTimestampFramePositionReset:Z

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

.method public getTimestampPositionFrames()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->lastTimestampPositionFrames:J

    .line 3
    return-wide v0
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
.end method

.method public getTimestampSystemTimeUs()J
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->audioTimestamp:Landroid/media/AudioTimestamp;

    .line 3
    .line 4
    iget-wide v0, v0, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 5
    .line 6
    const-wide/16 v2, 0x3e8

    .line 7
    div-long/2addr v0, v2

    .line 8
    return-wide v0
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

.method public maybeUpdateTimestamp()Z
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->audioTrack:Landroid/media/AudioTrack;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->audioTimestamp:Landroid/media/AudioTimestamp;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->audioTimestamp:Landroid/media/AudioTimestamp;

    .line 13
    .line 14
    iget-wide v1, v1, Landroid/media/AudioTimestamp;->framePosition:J

    .line 15
    .line 16
    iget-wide v3, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->lastTimestampRawPositionFrames:J

    .line 17
    .line 18
    cmp-long v5, v3, v1

    .line 19
    .line 20
    if-lez v5, :cond_1

    .line 21
    .line 22
    iget-boolean v5, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->expectTimestampFramePositionReset:Z

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    iget-wide v5, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->accumulatedRawTimestampFramePosition:J

    .line 27
    add-long/2addr v5, v3

    .line 28
    .line 29
    iput-wide v5, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->accumulatedRawTimestampFramePosition:J

    .line 30
    const/4 v3, 0x0

    .line 31
    .line 32
    iput-boolean v3, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->expectTimestampFramePositionReset:Z

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_0
    iget-wide v3, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->rawTimestampFramePositionWrapCount:J

    .line 36
    .line 37
    const-wide/16 v5, 0x1

    .line 38
    add-long/2addr v3, v5

    .line 39
    .line 40
    iput-wide v3, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->rawTimestampFramePositionWrapCount:J

    .line 41
    .line 42
    :cond_1
    :goto_0
    iput-wide v1, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->lastTimestampRawPositionFrames:J

    .line 43
    .line 44
    iget-wide v3, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->accumulatedRawTimestampFramePosition:J

    .line 45
    add-long/2addr v1, v3

    .line 46
    .line 47
    iget-wide v3, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->rawTimestampFramePositionWrapCount:J

    .line 48
    .line 49
    const/16 v5, 0x20

    .line 50
    shl-long/2addr v3, v5

    .line 51
    add-long/2addr v1, v3

    .line 52
    .line 53
    iput-wide v1, p0, Landroidx/media3/exoplayer/audio/AudioTimestampPoller$AudioTimestampWrapper;->lastTimestampPositionFrames:J

    .line 54
    :cond_2
    return v0
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
.end method
