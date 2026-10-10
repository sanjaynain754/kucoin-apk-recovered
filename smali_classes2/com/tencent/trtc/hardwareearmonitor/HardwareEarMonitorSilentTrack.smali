.class public Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::extensions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;
    }
.end annotation


# static fields
.field private static final DEFAULT_SAMPLE_RATE:I = 0xbb80

.field private static final TAG:Ljava/lang/String; = "HardwareEarMonitorSilentTrack"


# instance fields
.field private mAudioFormat:I

.field private mChannelConfig:I

.field private mIsPlaying:Z

.field private mPlaybackThread:Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mChannelConfig:I

    .line 8
    const/4 v0, 0x2

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mAudioFormat:I

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mIsPlaying:Z

    .line 14
    return-void
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
.end method

.method public static synthetic access$000(Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mChannelConfig:I

    .line 3
    return p0
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
.end method

.method public static synthetic access$100(Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mAudioFormat:I

    .line 3
    return p0
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
.end method

.method public static create()Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;-><init>()V

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
.end method


# virtual methods
.method public StartAudioTrack()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mIsPlaying:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mPlaybackThread:Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mIsPlaying:Z

    .line 12
    .line 13
    new-instance v0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;-><init>(Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;)V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mPlaybackThread:Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 22
    :cond_0
    return-void
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
.end method

.method public StopAudioTrack()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mPlaybackThread:Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    iput-boolean v1, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mIsPlaying:Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;->closeThread()V

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mPlaybackThread:Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    const-string v1, "HardwareEarMonitorSilentTrack"

    .line 28
    .line 29
    const-string v2, "mPlaybackThread join,Throwable ex : %s"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    :goto_0
    const/4 v0, 0x0

    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack;->mPlaybackThread:Lcom/tencent/trtc/hardwareearmonitor/HardwareEarMonitorSilentTrack$PlaybackThread;

    .line 36
    :cond_0
    return-void
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
.end method
