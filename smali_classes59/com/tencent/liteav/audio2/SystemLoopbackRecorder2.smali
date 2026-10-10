.class public Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::audio"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2$Recorder;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SystemLoopbackRecorder2"

.field public static final synthetic a:I

.field private static final mLock:Ljava/lang/Object;

.field private static mMediaProjection:Landroid/media/projection/MediaProjection;

.field private static volatile mNativeSystemLoopbackRecorder:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mLock:Ljava/lang/Object;

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
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sput-wide p1, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mNativeSystemLoopbackRecorder:J

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
.end method

.method private static native nativeSetMediaProjectionSession(JLandroid/media/projection/MediaProjection;)V
.end method

.method public static notifyMediaProjectionState(Landroid/media/projection/MediaProjection;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "SystemLoopbackRecorder2"

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "Received MediaProjection state "

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    const/4 v3, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v3, v2

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    new-array v2, v2, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    sget-object v0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mLock:Ljava/lang/Object;

    .line 30
    monitor-enter v0

    .line 31
    .line 32
    :try_start_0
    sput-object p0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mMediaProjection:Landroid/media/projection/MediaProjection;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->setMediaProjectionSession()V

    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
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

.method public static setMediaProjectionSession()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mMediaProjection:Landroid/media/projection/MediaProjection;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v1, "SystemLoopbackRecorder2"

    .line 10
    .line 11
    const-string v2, "MediaProjection is null."

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/Log;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    sget-wide v0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mNativeSystemLoopbackRecorder:J

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    cmp-long v0, v0, v2

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-wide v0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mNativeSystemLoopbackRecorder:J

    .line 26
    .line 27
    sget-object v2, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mMediaProjection:Landroid/media/projection/MediaProjection;

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->nativeSetMediaProjectionSession(JLandroid/media/projection/MediaProjection;)V

    .line 31
    :cond_1
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
.end method


# virtual methods
.method public getMediaProjection()Landroid/media/projection/MediaProjection;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mMediaProjection:Landroid/media/projection/MediaProjection;

    .line 3
    return-object v0
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

.method public releaseNativeSystemLoopbackRecorder()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    sput-wide v0, Lcom/tencent/liteav/audio2/SystemLoopbackRecorder2;->mNativeSystemLoopbackRecorder:J

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
.end method
