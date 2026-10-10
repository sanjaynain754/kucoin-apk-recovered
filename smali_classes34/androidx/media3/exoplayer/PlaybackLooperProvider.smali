.class public final Landroidx/media3/exoplayer/PlaybackLooperProvider;
.super Ljava/lang/Object;
.source "PlaybackLooperProvider.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation


# instance fields
.field private internalPlaybackThread:Landroid/os/HandlerThread;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private final lock:Ljava/lang/Object;

.field private playbackLooper:Landroid/os/Looper;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field private referenceCount:I
    .annotation build Landroidx/annotation/GuardedBy;
        value = "lock"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/PlaybackLooperProvider;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->lock:Ljava/lang/Object;

    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->playbackLooper:Landroid/os/Looper;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->internalPlaybackThread:Landroid/os/HandlerThread;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->referenceCount:I

    return-void
.end method


# virtual methods
.method public obtainLooper()Landroid/os/Looper;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->lock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->playbackLooper:Landroid/os/Looper;

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->referenceCount:I

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->internalPlaybackThread:Landroid/os/HandlerThread;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    move v1, v2

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-static {v1}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 25
    .line 26
    new-instance v1, Landroid/os/HandlerThread;

    .line 27
    .line 28
    const-string v3, "ExoPlayer:Playback"

    .line 29
    .line 30
    const/16 v4, -0x10

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    iput-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->internalPlaybackThread:Landroid/os/HandlerThread;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->internalPlaybackThread:Landroid/os/HandlerThread;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    iput-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->playbackLooper:Landroid/os/Looper;

    .line 47
    .line 48
    :cond_1
    iget v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->referenceCount:I

    .line 49
    add-int/2addr v1, v2

    .line 50
    .line 51
    iput v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->referenceCount:I

    .line 52
    .line 53
    iget-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->playbackLooper:Landroid/os/Looper;

    .line 54
    monitor-exit v0

    .line 55
    return-object v1

    .line 56
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    throw v1
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

.method public releaseLooper()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->lock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->referenceCount:I

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v1}, Landroidx/media3/common/util/Assertions;->checkState(Z)V

    .line 15
    .line 16
    iget v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->referenceCount:I

    .line 17
    sub-int/2addr v1, v2

    .line 18
    .line 19
    iput v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->referenceCount:I

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->internalPlaybackThread:Landroid/os/HandlerThread;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    iput-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->internalPlaybackThread:Landroid/os/HandlerThread;

    .line 32
    .line 33
    iput-object v1, p0, Landroidx/media3/exoplayer/PlaybackLooperProvider;->playbackLooper:Landroid/os/Looper;

    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_1
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
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
.end method
