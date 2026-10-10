.class public Landroidx/camera/video/internal/audio/SilentAudioStream;
.super Ljava/lang/Object;
.source "SilentAudioStream.java"

# interfaces
.implements Landroidx/camera/video/internal/audio/AudioStream;


# static fields
.field private static final TAG:Ljava/lang/String; = "SilentAudioStream"


# instance fields
.field private mAudioStreamCallback:Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;

.field private final mBytesPerFrame:I

.field private mCallbackExecutor:Ljava/util/concurrent/Executor;

.field private mCurrentReadTimeNs:J

.field private final mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mSampleRate:I

.field private mZeroBytes:[B


# direct methods
.method public constructor <init>(Landroidx/camera/video/internal/audio/AudioSettings;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/camera/video/internal/audio/AudioSettings;->getBytesPerFrame()I

    .line 22
    move-result v0

    .line 23
    .line 24
    iput v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mBytesPerFrame:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/camera/video/internal/audio/AudioSettings;->getCaptureSampleRate()I

    .line 28
    move-result p1

    .line 29
    .line 30
    iput p1, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mSampleRate:I

    .line 31
    return-void
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
.end method

.method public static synthetic a(Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;->onSilenceStateChanged(Z)V

    .line 5
    return-void
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
.end method

.method private static blockUntilSystemTimeReached(J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroidx/camera/video/internal/audio/SilentAudioStream;->currentSystemTimeNs()J

    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr p0, v0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v0, p0, v0

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 17
    move-result-wide p0

    .line 18
    .line 19
    .line 20
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p0

    .line 23
    .line 24
    const-string p1, "SilentAudioStream"

    .line 25
    .line 26
    const-string v0, "Ignore interruption"

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0, p0}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    :cond_0
    return-void
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
.end method

.method private checkNotReleasedOrThrow()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    xor-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    const-string v1, "AudioStream has been released."

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method private checkStartedOrThrow()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    const-string v1, "AudioStream has not been started."

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method private static currentSystemTimeNs()J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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
.end method

.method private notifySilenced()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mAudioStreamCallback:Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v2, Landroidx/camera/video/internal/audio/u;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2, v0}, Landroidx/camera/video/internal/audio/u;-><init>(Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
.end method

.method private writeSilenceToBuffer(Ljava/nio/ByteBuffer;I)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {v0}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mZeroBytes:[B

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    array-length v0, v0

    .line 19
    .line 20
    if-ge v0, p2, :cond_2

    .line 21
    .line 22
    :cond_1
    new-array v0, p2, [B

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mZeroBytes:[B

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 28
    move-result v0

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mZeroBytes:[B

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2, v1, p2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 34
    move-result-object p1

    .line 35
    add-int/2addr p2, v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 43
    return-void
    .line 44
    .line 45
.end method


# virtual methods
.method public read(Ljava/nio/ByteBuffer;)Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/SilentAudioStream;->checkNotReleasedOrThrow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/SilentAudioStream;->checkStartedOrThrow()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 10
    move-result v0

    .line 11
    int-to-long v0, v0

    .line 12
    .line 13
    iget v2, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mBytesPerFrame:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Landroidx/camera/video/internal/audio/AudioUtils;->sizeToFrameCount(JI)J

    .line 17
    move-result-wide v0

    .line 18
    .line 19
    iget v2, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mBytesPerFrame:I

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Landroidx/camera/video/internal/audio/AudioUtils;->frameCountToSize(JI)J

    .line 23
    move-result-wide v2

    .line 24
    long-to-int v2, v2

    .line 25
    .line 26
    if-gtz v2, :cond_0

    .line 27
    const/4 p1, 0x0

    .line 28
    .line 29
    iget-wide v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mCurrentReadTimeNs:J

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0, v1}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->of(IJ)Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;

    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    .line 36
    :cond_0
    iget v3, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mSampleRate:I

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v3}, Landroidx/camera/video/internal/audio/AudioUtils;->frameCountToDurationNs(JI)J

    .line 40
    move-result-wide v0

    .line 41
    .line 42
    iget-wide v3, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mCurrentReadTimeNs:J

    .line 43
    add-long/2addr v3, v0

    .line 44
    .line 45
    .line 46
    invoke-static {v3, v4}, Landroidx/camera/video/internal/audio/SilentAudioStream;->blockUntilSystemTimeReached(J)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1, v2}, Landroidx/camera/video/internal/audio/SilentAudioStream;->writeSilenceToBuffer(Ljava/nio/ByteBuffer;I)V

    .line 50
    .line 51
    iget-wide v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mCurrentReadTimeNs:J

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->of(IJ)Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    iput-wide v3, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mCurrentReadTimeNs:J

    .line 58
    return-object p1
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
.end method

.method public release()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 7
    return-void
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
.end method

.method public setCallback(Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    .line 10
    const-string v2, "AudioStream can not be started when setCallback."

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v2}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/SilentAudioStream;->checkNotReleasedOrThrow()V

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    .line 24
    :cond_1
    :goto_0
    const-string v0, "executor can\'t be null with non-null callback."

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mAudioStreamCallback:Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;

    .line 30
    .line 31
    iput-object p2, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 32
    return-void
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

.method public start()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/SilentAudioStream;->checkNotReleasedOrThrow()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Landroidx/camera/video/internal/audio/SilentAudioStream;->currentSystemTimeNs()J

    .line 17
    move-result-wide v0

    .line 18
    .line 19
    iput-wide v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mCurrentReadTimeNs:J

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/SilentAudioStream;->notifySilenced()V

    .line 23
    return-void
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
.end method

.method public stop()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/SilentAudioStream;->checkNotReleasedOrThrow()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/camera/video/internal/audio/SilentAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

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
.end method
