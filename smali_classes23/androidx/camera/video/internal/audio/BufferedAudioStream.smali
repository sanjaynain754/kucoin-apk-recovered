.class public Landroidx/camera/video/internal/audio/BufferedAudioStream;
.super Ljava/lang/Object;
.source "BufferedAudioStream.java"

# interfaces
.implements Landroidx/camera/video/internal/audio/AudioStream;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;
    }
.end annotation


# static fields
.field private static final DATA_WAITING_TIME_MILLIS:I = 0x1

.field private static final DEFAULT_BUFFER_SIZE_IN_FRAME:I = 0x400

.field private static final DEFAULT_QUEUE_SIZE:I = 0x1f4

.field private static final TAG:Ljava/lang/String; = "BufferedAudioStream"


# instance fields
.field private mAudioDataNotFullyRead:Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private final mAudioDataQueue:Ljava/util/Queue;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;",
            ">;"
        }
    .end annotation
.end field

.field private final mAudioStream:Landroidx/camera/video/internal/audio/AudioStream;

.field private mBufferSize:I

.field private final mBytesPerFrame:I

.field private final mIsCollectingAudioData:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mLock:Ljava/lang/Object;

.field private final mProducerExecutor:Ljava/util/concurrent/Executor;

.field private final mQueueMaxSize:I

.field private final mSampleRate:I


# direct methods
.method public constructor <init>(Landroidx/camera/video/internal/audio/AudioStream;Landroidx/camera/video/internal/audio/AudioSettings;)V
    .locals 8

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
    iput-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataQueue:Ljava/util/Queue;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->audioExecutor()Ljava/util/concurrent/Executor;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->newSequentialExecutor(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iput-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mProducerExecutor:Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    iput-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mLock:Ljava/lang/Object;

    .line 43
    const/4 v0, 0x0

    .line 44
    .line 45
    iput-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataNotFullyRead:Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 51
    .line 52
    iput-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsCollectingAudioData:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    iput-object p1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioStream:Landroidx/camera/video/internal/audio/AudioStream;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Landroidx/camera/video/internal/audio/AudioSettings;->getBytesPerFrame()I

    .line 58
    move-result p1

    .line 59
    .line 60
    iput p1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mBytesPerFrame:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Landroidx/camera/video/internal/audio/AudioSettings;->getCaptureSampleRate()I

    .line 64
    move-result p2

    .line 65
    .line 66
    iput p2, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mSampleRate:I

    .line 67
    int-to-long v2, p1

    .line 68
    .line 69
    const-wide/16 v4, 0x0

    .line 70
    .line 71
    cmp-long v0, v2, v4

    .line 72
    const/4 v2, 0x1

    .line 73
    .line 74
    if-lez v0, :cond_0

    .line 75
    move v0, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move v0, v1

    .line 78
    .line 79
    .line 80
    :goto_0
    const-string/jumbo v3, "mBytesPerFrame must be greater than 0."

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v3}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 84
    int-to-long v6, p2

    .line 85
    .line 86
    cmp-long p2, v6, v4

    .line 87
    .line 88
    if-lez p2, :cond_1

    .line 89
    move v1, v2

    .line 90
    .line 91
    .line 92
    :cond_1
    const-string/jumbo p2, "mSampleRate must be greater than 0."

    .line 93
    .line 94
    .line 95
    invoke-static {v1, p2}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 96
    .line 97
    const/16 p2, 0x1f4

    .line 98
    .line 99
    iput p2, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mQueueMaxSize:I

    .line 100
    .line 101
    mul-int/lit16 p1, p1, 0x400

    .line 102
    .line 103
    iput p1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mBufferSize:I

    .line 104
    return-void
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static synthetic a(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsCollectingAudioData:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioStream:Landroidx/camera/video/internal/audio/AudioStream;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/camera/video/internal/audio/AudioStream;->stop()V

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mLock:Ljava/lang/Object;

    .line 14
    monitor-enter v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    :try_start_0
    iput-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataNotFullyRead:Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;

    .line 18
    .line 19
    iget-object p0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataQueue:Ljava/util/Queue;

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->clear()V

    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0
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
.end method

.method public static synthetic b(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioStream:Landroidx/camera/video/internal/audio/AudioStream;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/camera/video/internal/audio/AudioStream;->start()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->startCollectingAudioData()V
    :try_end_0
    .catch Landroidx/camera/video/internal/audio/AudioStream$AudioStreamException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p0

    .line 14
    .line 15
    new-instance v0, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic c(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsCollectingAudioData:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioStream:Landroidx/camera/video/internal/audio/AudioStream;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/camera/video/internal/audio/AudioStream;->release()V

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mLock:Ljava/lang/Object;

    .line 14
    monitor-enter v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    :try_start_0
    iput-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataNotFullyRead:Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;

    .line 18
    .line 19
    iget-object p0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataQueue:Ljava/util/Queue;

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->clear()V

    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0
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
.end method

.method private checkNotReleasedOrThrow()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

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

.method private collectAudioData()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsCollectingAudioData:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mBufferSize:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioStream:Landroidx/camera/video/internal/audio/AudioStream;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v0}, Landroidx/camera/video/internal/audio/AudioStream;->read(Ljava/nio/ByteBuffer;)Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    new-instance v2, Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;

    .line 24
    .line 25
    iget v3, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mBytesPerFrame:I

    .line 26
    .line 27
    iget v4, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mSampleRate:I

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, v0, v1, v3, v4}, Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;-><init>(Ljava/nio/ByteBuffer;Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;II)V

    .line 31
    .line 32
    iget v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mQueueMaxSize:I

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mLock:Ljava/lang/Object;

    .line 35
    monitor-enter v1

    .line 36
    .line 37
    :try_start_0
    iget-object v3, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataQueue:Ljava/util/Queue;

    .line 38
    .line 39
    .line 40
    invoke-interface {v3, v2}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 41
    .line 42
    :goto_0
    iget-object v2, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataQueue:Ljava/util/Queue;

    .line 43
    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 46
    move-result v2

    .line 47
    .line 48
    if-le v2, v0, :cond_1

    .line 49
    .line 50
    iget-object v2, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataQueue:Ljava/util/Queue;

    .line 51
    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 54
    .line 55
    const-string v2, "BufferedAudioStream"

    .line 56
    .line 57
    const-string v3, "Drop audio data due to full of queue."

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsCollectingAudioData:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 70
    move-result v0

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mProducerExecutor:Ljava/util/concurrent/Executor;

    .line 75
    .line 76
    new-instance v1, Landroidx/camera/video/internal/audio/r;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, p0}, Landroidx/camera/video/internal/audio/r;-><init>(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 83
    :cond_2
    :goto_1
    return-void

    .line 84
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    throw v0
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
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
.end method

.method public static synthetic d(Landroidx/camera/video/internal/audio/BufferedAudioStream;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->updateCollectionBufferSize(I)V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static synthetic e(Landroidx/camera/video/internal/audio/BufferedAudioStream;Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioStream:Landroidx/camera/video/internal/audio/AudioStream;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Landroidx/camera/video/internal/audio/AudioStream;->setCallback(Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;Ljava/util/concurrent/Executor;)V

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
    .line 105
.end method

.method public static synthetic f(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->collectAudioData()V

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
.end method

.method private startCollectingAudioData()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsCollectingAudioData:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->collectAudioData()V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method private updateCollectionBufferSize(I)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mBufferSize:I

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mBytesPerFrame:I

    .line 8
    div-int/2addr p1, v1

    .line 9
    mul-int/2addr p1, v1

    .line 10
    .line 11
    iput p1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mBufferSize:I

    .line 12
    .line 13
    new-instance p1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const-string v1, "Update buffer size from "

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v0, " to "

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    iget v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mBufferSize:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    const-string v0, "BufferedAudioStream"

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-void
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

.method private updateCollectionBufferSizeAsync(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mProducerExecutor:Ljava/util/concurrent/Executor;

    .line 3
    .line 4
    new-instance v1, Landroidx/camera/video/internal/audio/s;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Landroidx/camera/video/internal/audio/s;-><init>(Landroidx/camera/video/internal/audio/BufferedAudioStream;I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

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
    .line 24
.end method


# virtual methods
.method public read(Ljava/nio/ByteBuffer;)Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanThreadSleep"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->checkNotReleasedOrThrow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->checkStartedOrThrow()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 10
    move-result v0

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->updateCollectionBufferSizeAsync(I)V

    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v0, v1}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->of(IJ)Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mLock:Ljava/lang/Object;

    .line 23
    monitor-enter v1

    .line 24
    .line 25
    :try_start_0
    iget-object v3, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataNotFullyRead:Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    iput-object v4, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataNotFullyRead:Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget-object v3, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataQueue:Ljava/util/Queue;

    .line 33
    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    check-cast v3, Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_4

    .line 42
    .line 43
    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p1}, Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;->read(Ljava/nio/ByteBuffer;)Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;->getRemainingBufferSizeInBytes()I

    .line 51
    move-result v4

    .line 52
    .line 53
    if-lez v4, :cond_2

    .line 54
    .line 55
    iput-object v3, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mAudioDataNotFullyRead:Landroidx/camera/video/internal/audio/BufferedAudioStream$AudioData;

    .line 56
    :cond_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioStream$PacketInfo;->getSizeInBytes()I

    .line 60
    move-result v1

    .line 61
    .line 62
    if-gtz v1, :cond_3

    .line 63
    .line 64
    iget-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 68
    move-result v1

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 76
    move-result v1

    .line 77
    .line 78
    if-nez v1, :cond_3

    .line 79
    const/4 v1, 0x1

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move v1, v2

    .line 82
    .line 83
    :goto_1
    if-eqz v1, :cond_4

    .line 84
    .line 85
    const-wide/16 v3, 0x1

    .line 86
    .line 87
    .line 88
    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 89
    goto :goto_2

    .line 90
    :catch_0
    move-exception p1

    .line 91
    .line 92
    const-string v1, "BufferedAudioStream"

    .line 93
    .line 94
    const-string v2, "Interruption while waiting for audio data"

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v2, p1}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    goto :goto_3

    .line 99
    .line 100
    :cond_4
    :goto_2
    if-nez v1, :cond_0

    .line 101
    :goto_3
    return-object v0

    .line 102
    :goto_4
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    throw p1
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public release()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsReleased:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mProducerExecutor:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance v1, Landroidx/camera/video/internal/audio/t;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0}, Landroidx/camera/video/internal/audio/t;-><init>(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    return-void
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
.end method

.method public setCallback(Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->checkNotReleasedOrThrow()V

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
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mProducerExecutor:Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    new-instance v1, Landroidx/camera/video/internal/audio/p;

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/video/internal/audio/p;-><init>(Landroidx/camera/video/internal/audio/BufferedAudioStream;Landroidx/camera/video/internal/audio/AudioStream$AudioStreamCallback;Ljava/util/concurrent/Executor;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public start()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/video/internal/audio/AudioStream$AudioStreamException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->checkNotReleasedOrThrow()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    :cond_0
    new-instance v0, Ljava/util/concurrent/FutureTask;

    .line 16
    .line 17
    new-instance v1, Landroidx/camera/video/internal/audio/q;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0}, Landroidx/camera/video/internal/audio/q;-><init>(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mProducerExecutor:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-void

    .line 34
    :catch_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v0

    .line 37
    .line 38
    :goto_0
    iget-object v1, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 43
    .line 44
    new-instance v1, Landroidx/camera/video/internal/audio/AudioStream$AudioStreamException;

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v0}, Landroidx/camera/video/internal/audio/AudioStream$AudioStreamException;-><init>(Ljava/lang/Throwable;)V

    .line 48
    throw v1
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
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->checkNotReleasedOrThrow()V

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mIsStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/internal/audio/BufferedAudioStream;->mProducerExecutor:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    new-instance v1, Landroidx/camera/video/internal/audio/o;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0}, Landroidx/camera/video/internal/audio/o;-><init>(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 24
    return-void
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
