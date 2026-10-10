.class public Lcom/tencent/liteav/live/TXLivePusherJni;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/rtmp/ITXLivePushListener;
.implements Lcom/tencent/rtmp/TXLivePusher$AudioCustomProcessListener;
.implements Lcom/tencent/rtmp/TXLivePusher$ITXAudioVolumeEvaluationListener;
.implements Lcom/tencent/rtmp/TXLivePusher$ITXSnapshotListener;
.implements Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;
.implements Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;
.implements Lcom/tencent/rtmp/b;
.implements Lcom/tencent/rtmp/ui/TXCloudVideoView$b;


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav"
.end annotation


# instance fields
.field private mAudioCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$AudioCustomProcessListener;

.field private mAudioEffectManager:Lcom/tencent/liteav/audio/TXAudioEffectManager;

.field private mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

.field private mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

.field private mITXAudioVolumeEvaluationListener:Lcom/tencent/rtmp/TXLivePusher$ITXAudioVolumeEvaluationListener;

.field private mITXLivePushListener:Lcom/tencent/rtmp/ITXLivePushListener;

.field private mITXSnapshotListener:Lcom/tencent/rtmp/TXLivePusher$ITXSnapshotListener;

.field private mITXVideoRecordListener:Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;

.field private mNativeTXLivePusherJni:J

.field private mOnBGMNotify:Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;

.field private mVideoCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;

.field private mVideoQuality:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 8
    const/4 v0, -0x1

    .line 9
    .line 10
    iput v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mVideoQuality:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/tencent/liteav/base/ContextUtils;->initApplicationContext(Landroid/content/Context;)V

    .line 18
    .line 19
    const-string v0, "liteav"

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/tencent/liteav/base/ContextUtils;->setDataDirectorySuffix(Ljava/lang/String;)V

    .line 23
    .line 24
    new-instance v0, Lcom/tencent/rtmp/TXLivePushConfig;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lcom/tencent/rtmp/TXLivePushConfig;-><init>()V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 30
    .line 31
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeCreate(Ljava/lang/ref/WeakReference;)J

    .line 38
    move-result-wide v0

    .line 39
    .line 40
    iput-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 41
    .line 42
    new-instance v2, Lcom/tencent/liteav/audio/TXAudioEffectManagerImpl;

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeCreateAudioEffectManager(J)J

    .line 46
    move-result-wide v0

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v0, v1}, Lcom/tencent/liteav/audio/TXAudioEffectManagerImpl;-><init>(J)V

    .line 50
    .line 51
    iput-object v2, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mAudioEffectManager:Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 52
    .line 53
    new-instance v0, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 54
    .line 55
    iget-wide v1, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeCreateBeautyManager(J)J

    .line 59
    move-result-wide v1

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;-><init>(J)V

    .line 63
    .line 64
    iput-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 65
    .line 66
    instance-of v0, p1, Landroid/app/Activity;

    .line 67
    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lcom/tencent/liteav/base/util/j;->a()Lcom/tencent/liteav/base/util/j;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    check-cast p1, Landroid/app/Activity;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/base/util/j;->a(Landroid/app/Activity;)V

    .line 78
    :cond_0
    return-void
    .line 79
    .line 80
    .line 81
.end method

.method public static getMapKeys(Ljava/util/HashMap;)[Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    add-int/lit8 v3, v1, 0x1

    .line 30
    .line 31
    aput-object v2, v0, v1

    .line 32
    move v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-object v0
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

.method public static getMapValues(Ljava/util/HashMap;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            ")[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 4
    move-result v0

    .line 5
    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    aget-object v4, p1, v2

    .line 14
    .line 15
    add-int/lit8 v5, v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    check-cast v4, Ljava/lang/String;

    .line 22
    .line 23
    aput-object v4, v0, v3

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    move v3, v5

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0
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

.method public static isMapValid(Ljava/util/HashMap;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_2
    const/4 p0, 0x1

    .line 32
    return p0
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

.method private static native nativeCallExperimentalAPI(JLjava/lang/String;)V
.end method

.method private static native nativeCreate(Ljava/lang/ref/WeakReference;)J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/live/TXLivePusherJni;",
            ">;)J"
        }
    .end annotation
.end method

.method private static native nativeCreateAudioEffectManager(J)J
.end method

.method private static native nativeCreateBeautyManager(J)J
.end method

.method private static native nativeDestroy(J)V
.end method

.method private static native nativeEnableAudioVolumeEvaluation(JI)V
.end method

.method private static native nativeGetMaxZoom(J)I
.end method

.method private static native nativeGetMusicDuration(JLjava/lang/String;)I
.end method

.method private static native nativeIsPushing(J)Z
.end method

.method private static native nativeOnLogRecord(JLjava/lang/String;)V
.end method

.method private static native nativePauseBGM(J)Z
.end method

.method private static native nativePausePusher(J)V
.end method

.method private static native nativePlayBGM(JLjava/lang/String;)Z
.end method

.method private static native nativeResumeBGM(J)Z
.end method

.method private static native nativeResumePusher(J)V
.end method

.method private static native nativeSendCustomPCMData(J[B)V
.end method

.method private static native nativeSendCustomVideoFrame(JIIIIILjava/lang/Object;[B)V
.end method

.method private static native nativeSendMessage(J[B)V
.end method

.method private static native nativeSendMessageEx(J[B)Z
.end method

.method private static native nativeSetAudioConfig(JIIIZZ)V
.end method

.method private static native nativeSetBGMPitch(JF)V
.end method

.method private static native nativeSetBGMPosition(JI)Z
.end method

.method private static native nativeSetBGMVolume(JF)Z
.end method

.method private static native nativeSetBeautyFilter(JIIII)Z
.end method

.method private static native nativeSetCaptureConfig(JIILandroid/graphics/Bitmap;IZZZZZI)V
.end method

.method private static native nativeSetEncoderConfig(JIIZIIIIIZIZ)V
.end method

.method private static native nativeSetExposureCompensation(JF)V
.end method

.method private static native nativeSetFilter(JLandroid/graphics/Bitmap;)V
.end method

.method private static native nativeSetFocusPosition(JFF)V
.end method

.method private static native nativeSetMicVolume(JF)Z
.end method

.method private static native nativeSetMirror(JZ)Z
.end method

.method private static native nativeSetMute(JZ)V
.end method

.method private static native nativeSetNetworkConfig(JIZIIILjava/util/HashMap;)V
.end method

.method private static native nativeSetRenderRotation(JI)V
.end method

.method private static native nativeSetReverb(JI)V
.end method

.method private static native nativeSetSpecialRatio(JF)V
.end method

.method private static native nativeSetView(JLcom/tencent/liteav/videobase/videobase/DisplayTarget;)V
.end method

.method private static native nativeSetVoiceChangerType(JI)V
.end method

.method private static native nativeSetWaterMark(JLandroid/graphics/Bitmap;FFF)V
.end method

.method private static native nativeSetZoom(JI)Z
.end method

.method private static native nativeShowDebugView(JZ)V
.end method

.method private static native nativeSnapshot(J)V
.end method

.method private static native nativeStartCamera(J)V
.end method

.method private static native nativeStartPusher(JLjava/lang/String;)I
.end method

.method private static native nativeStartRecord(JLjava/lang/String;)I
.end method

.method private static native nativeStartScreenCapture(J)V
.end method

.method private static native nativeStopBGM(J)Z
.end method

.method private static native nativeStopCameraPreview(JZ)V
.end method

.method private static native nativeStopPusher(J)V
.end method

.method private static native nativeStopRecord(J)V
.end method

.method private static native nativeStopScreenCapture(J)V
.end method

.method private static native nativeSwitchCamera(J)V
.end method

.method private static native nativeTurnOnFlashLight(JZ)Z
.end method

.method public static weakToStrongReference(Ljava/lang/ref/WeakReference;)Lcom/tencent/liteav/live/TXLivePusherJni;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/live/TXLivePusherJni;",
            ">;)",
            "Lcom/tencent/liteav/live/TXLivePusherJni;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/tencent/liteav/live/TXLivePusherJni;

    .line 7
    return-object p0
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


# virtual methods
.method public callExperimentalAPI(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeCallExperimentalAPI(JLjava/lang/String;)V

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

.method public enableAudioVolumeEvaluation(I)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeEnableAudioVolumeEvaluation(JI)V

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

.method public finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/liteav/live/TXLivePusherJni;->release()V

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
.end method

.method public getAudioEffectManager()Lcom/tencent/liteav/audio/TXAudioEffectManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mAudioEffectManager:Lcom/tencent/liteav/audio/TXAudioEffectManager;

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

.method public getBeautyManager()Lcom/tencent/liteav/beauty/TXBeautyManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

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

.method public getConfig()Lcom/tencent/rtmp/TXLivePushConfig;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

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

.method public getMaxZoom()I
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeGetMaxZoom(J)I

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

.method public getMusicDuration(Ljava/lang/String;)I
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeGetMusicDuration(JLjava/lang/String;)I

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
.end method

.method public isPushing()Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeIsPushing(J)Z

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

.method public onAudioVolumeEvaluationNotify(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXAudioVolumeEvaluationListener:Lcom/tencent/rtmp/TXLivePusher$ITXAudioVolumeEvaluationListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/tencent/rtmp/TXLivePusher$ITXAudioVolumeEvaluationListener;->onAudioVolumeEvaluationNotify(I)V

    .line 8
    :cond_0
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

.method public onBGMComplete(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mOnBGMNotify:Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;->onBGMComplete(I)V

    .line 8
    :cond_0
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

.method public onBGMProgress(JJ)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mOnBGMNotify:Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;->onBGMProgress(JJ)V

    .line 8
    :cond_0
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

.method public onBGMStart()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mOnBGMNotify:Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;->onBGMStart()V

    .line 8
    :cond_0
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

.method public onCustomPreprocessFrame(III)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/liteav/live/TXLivePusherJni;->onTextureCustomProcess(III)I

    .line 4
    move-result p1

    .line 5
    return p1
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

.method public onDetectFacePoints([F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mVideoCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;->onDetectFacePoints([F)V

    .line 8
    :cond_0
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

.method public onLogRecord(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeOnLogRecord(JLjava/lang/String;)V

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

.method public onNativeRecordPcmData([BJIII)[B
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Lcom/tencent/liteav/live/TXLivePusherJni;->onRecordPcmData([BJIII)V

    .line 4
    return-object p1
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
.end method

.method public onNativeRecordRawPcmData([BJIIIZ)[B
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p7}, Lcom/tencent/liteav/live/TXLivePusherJni;->onRecordRawPcmData([BJIIIZ)V

    .line 4
    return-object p1
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
.end method

.method public onNetStatus(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXLivePushListener:Lcom/tencent/rtmp/ITXLivePushListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/tencent/rtmp/ITXLivePushListener;->onNetStatus(Landroid/os/Bundle;)V

    .line 8
    :cond_0
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

.method public onPushEvent(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXLivePushListener:Lcom/tencent/rtmp/ITXLivePushListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/tencent/rtmp/ITXLivePushListener;->onPushEvent(ILandroid/os/Bundle;)V

    .line 8
    :cond_0
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

.method public onRecordComplete(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXVideoRecordListener:Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v1, Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;-><init>()V

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    iput p1, v1, Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;->retCode:I

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, -0x1

    .line 17
    .line 18
    iput p1, v1, Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;->retCode:I

    .line 19
    .line 20
    :goto_0
    iput-object p2, v1, Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;->descMsg:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p3, v1, Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;->videoPath:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p4, v1, Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;->coverPath:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;->onRecordComplete(Lcom/tencent/ugc/TXRecordCommon$TXRecordResult;)V

    .line 28
    :cond_1
    return-void
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
.end method

.method public onRecordEvent(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXVideoRecordListener:Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;->onRecordEvent(ILandroid/os/Bundle;)V

    .line 8
    :cond_0
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

.method public onRecordPcmData([BJIII)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mAudioCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$AudioCustomProcessListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    move v4, p4

    .line 8
    move v5, p5

    .line 9
    move v6, p6

    .line 10
    .line 11
    .line 12
    invoke-interface/range {v0 .. v6}, Lcom/tencent/rtmp/TXLivePusher$AudioCustomProcessListener;->onRecordPcmData([BJIII)V

    .line 13
    :cond_0
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
.end method

.method public onRecordProgress(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXVideoRecordListener:Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;->onRecordProgress(J)V

    .line 8
    :cond_0
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

.method public onRecordRawPcmData([BJIIIZ)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mAudioCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$AudioCustomProcessListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    move v4, p4

    .line 8
    move v5, p5

    .line 9
    move v6, p6

    .line 10
    move v7, p7

    .line 11
    .line 12
    .line 13
    invoke-interface/range {v0 .. v7}, Lcom/tencent/rtmp/TXLivePusher$AudioCustomProcessListener;->onRecordRawPcmData([BJIIIZ)V

    .line 14
    :cond_0
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
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
.end method

.method public onShowLog(Z)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeShowDebugView(JZ)V

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

.method public onSnapshot(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXSnapshotListener:Lcom/tencent/rtmp/TXLivePusher$ITXSnapshotListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/tencent/rtmp/TXLivePusher$ITXSnapshotListener;->onSnapshot(Landroid/graphics/Bitmap;)V

    .line 8
    :cond_0
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

.method public onTextureCustomProcess(III)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mVideoCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3}, Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;->onTextureCustomProcess(III)I

    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, -0x1

    .line 11
    return p1
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

.method public onTextureDestoryed()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mVideoCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;->onTextureDestoryed()V

    .line 8
    :cond_0
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

.method public pauseBGM()Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativePauseBGM(J)Z

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

.method public pausePusher()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativePausePusher(J)V

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

.method public playBGM(Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativePlayBGM(JLjava/lang/String;)Z

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
.end method

.method public release()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->clear()V

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v4, v0, v2

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeDestroy(J)V

    .line 19
    .line 20
    iput-wide v2, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 21
    :cond_1
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
.end method

.method public resumeBGM()Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeResumeBGM(J)Z

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

.method public resumePusher()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeResumePusher(J)V

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

.method public sendCustomPCMData([B)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSendCustomPCMData(J[B)V

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

.method public sendCustomVideoData([BIII)I
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    if-eq p2, v0, :cond_1

    .line 4
    const/4 v0, 0x5

    .line 5
    .line 6
    if-eq p2, v0, :cond_0

    .line 7
    const/4 p1, -0x3

    .line 8
    return p1

    .line 9
    .line 10
    :cond_0
    sget-object p2, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_1
    sget-object p2, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->a:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 14
    .line 15
    :goto_0
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 16
    .line 17
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->d:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 18
    .line 19
    iget v4, v2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->mValue:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->getValue()I

    .line 23
    move-result v5

    .line 24
    const/4 v6, -0x1

    .line 25
    const/4 v7, 0x0

    .line 26
    move-object v8, p1

    .line 27
    move v2, p3

    .line 28
    move v3, p4

    .line 29
    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSendCustomVideoFrame(JIIIIILjava/lang/Object;[B)V

    .line 32
    const/4 p1, 0x0

    .line 33
    return p1
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
.end method

.method public sendCustomVideoTexture(III)I
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentContext()Landroid/opengl/EGLContext;

    .line 4
    move-result-object v7

    .line 5
    .line 6
    if-nez v7, :cond_0

    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 11
    .line 12
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->b:Lcom/tencent/liteav/videobase/base/GLConstants$a;

    .line 13
    .line 14
    iget v4, v2, Lcom/tencent/liteav/videobase/base/GLConstants$a;->mValue:I

    .line 15
    .line 16
    sget-object v2, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->f:Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/tencent/liteav/videobase/base/GLConstants$PixelFormatType;->getValue()I

    .line 20
    move-result v5

    .line 21
    const/4 v8, 0x0

    .line 22
    move v6, p1

    .line 23
    move v2, p2

    .line 24
    move v3, p3

    .line 25
    .line 26
    .line 27
    invoke-static/range {v0 .. v8}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSendCustomVideoFrame(JIIIIILjava/lang/Object;[B)V

    .line 28
    const/4 p1, 0x0

    .line 29
    return p1
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

.method public sendMessage([B)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSendMessage(J[B)V

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

.method public sendMessageEx([B)Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSendMessageEx(J[B)Z

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
.end method

.method public setAudioProcessListener(Lcom/tencent/rtmp/TXLivePusher$AudioCustomProcessListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mAudioCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$AudioCustomProcessListener;

    .line 3
    return-void
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
.end method

.method public setAudioVolumeEvaluationListener(Lcom/tencent/rtmp/TXLivePusher$ITXAudioVolumeEvaluationListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXAudioVolumeEvaluationListener:Lcom/tencent/rtmp/TXLivePusher$ITXAudioVolumeEvaluationListener;

    .line 3
    return-void
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
.end method

.method public setBGMNofify(Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mOnBGMNotify:Lcom/tencent/rtmp/TXLivePusher$OnBGMNotify;

    .line 3
    return-void
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
.end method

.method public setBGMPitch(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetBGMPitch(JF)V

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

.method public setBGMPosition(I)Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetBGMPosition(JI)Z

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
.end method

.method public setBGMVolume(F)Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetBGMVolume(JF)Z

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
.end method

.method public setBeautyFilter(IIII)Z
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    move v2, p1

    .line 4
    move v3, p2

    .line 5
    move v4, p3

    .line 6
    move v5, p4

    .line 7
    .line 8
    .line 9
    invoke-static/range {v0 .. v5}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetBeautyFilter(JIIII)Z

    .line 10
    move-result p1

    .line 11
    return p1
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
.end method

.method public setChinLevel(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    int-to-float p1, p1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setChinLevel(F)I

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setConfig(Lcom/tencent/rtmp/TXLivePushConfig;)V
    .locals 29

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iput-object v1, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 10
    .line 11
    iget-wide v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 12
    move-wide v4, v2

    .line 13
    .line 14
    iget v3, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mCustomModeType:I

    .line 15
    move-wide v5, v4

    .line 16
    .line 17
    iget v4, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mLocalVideoMirrorType:I

    .line 18
    move-wide v6, v5

    .line 19
    .line 20
    iget-object v5, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mPauseImg:Landroid/graphics/Bitmap;

    .line 21
    move-wide v7, v6

    .line 22
    .line 23
    iget v6, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mPauseFps:I

    .line 24
    move-wide v8, v7

    .line 25
    .line 26
    iget-boolean v7, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mFrontCamera:Z

    .line 27
    move-wide v9, v8

    .line 28
    .line 29
    iget-boolean v8, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mTouchFocus:Z

    .line 30
    move-wide v10, v9

    .line 31
    .line 32
    iget-boolean v9, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mEnableZoom:Z

    .line 33
    move-wide v11, v10

    .line 34
    .line 35
    iget-boolean v10, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mEnableScreenCaptureAutoRotate:Z

    .line 36
    move-wide v12, v11

    .line 37
    .line 38
    iget-boolean v11, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mEnableHighResolutionCapture:Z

    .line 39
    .line 40
    iget v1, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mPauseFlag:I

    .line 41
    .line 42
    move-wide/from16 v27, v12

    .line 43
    move v12, v1

    .line 44
    .line 45
    move-wide/from16 v1, v27

    .line 46
    .line 47
    .line 48
    invoke-static/range {v1 .. v12}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetCaptureConfig(JIILandroid/graphics/Bitmap;IZZZZZI)V

    .line 49
    .line 50
    iget-wide v14, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 51
    .line 52
    iget-object v1, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 53
    .line 54
    iget v2, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mHomeOrientation:I

    .line 55
    .line 56
    iget-object v1, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mVideoResolution:Lcom/tencent/rtmp/TXVideoResolution;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 60
    move-result v17

    .line 61
    .line 62
    iget-object v1, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 63
    .line 64
    iget-boolean v3, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mAutoAdjustBitrate:Z

    .line 65
    .line 66
    iget v4, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mVideoBitrate:I

    .line 67
    .line 68
    iget v5, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mMaxVideoBitrate:I

    .line 69
    .line 70
    iget v6, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mMinVideoBitrate:I

    .line 71
    .line 72
    iget v7, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mVideoEncodeGop:I

    .line 73
    .line 74
    iget v8, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mVideoFPS:I

    .line 75
    .line 76
    iget-boolean v9, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mVideoEncoderXMirror:Z

    .line 77
    .line 78
    iget v10, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mHardwareAccel:I

    .line 79
    .line 80
    iget-boolean v1, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mEnableVideoHardEncoderMainProfile:Z

    .line 81
    .line 82
    move/from16 v26, v1

    .line 83
    .line 84
    move/from16 v16, v2

    .line 85
    .line 86
    move/from16 v18, v3

    .line 87
    .line 88
    move/from16 v19, v4

    .line 89
    .line 90
    move/from16 v20, v5

    .line 91
    .line 92
    move/from16 v21, v6

    .line 93
    .line 94
    move/from16 v22, v7

    .line 95
    .line 96
    move/from16 v23, v8

    .line 97
    .line 98
    move/from16 v24, v9

    .line 99
    .line 100
    move/from16 v25, v10

    .line 101
    .line 102
    .line 103
    invoke-static/range {v14 .. v26}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetEncoderConfig(JIIZIIIIIZIZ)V

    .line 104
    .line 105
    iget-wide v1, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 106
    .line 107
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 108
    .line 109
    iget-object v4, v3, Lcom/tencent/rtmp/TXLivePushConfig;->mWatermark:Landroid/graphics/Bitmap;

    .line 110
    .line 111
    iget v5, v3, Lcom/tencent/rtmp/TXLivePushConfig;->mWatermarkXF:F

    .line 112
    .line 113
    iget v6, v3, Lcom/tencent/rtmp/TXLivePushConfig;->mWatermarkYF:F

    .line 114
    .line 115
    iget v3, v3, Lcom/tencent/rtmp/TXLivePushConfig;->mWatermarkWidth:F

    .line 116
    .line 117
    move-wide/from16 v18, v1

    .line 118
    .line 119
    move/from16 v23, v3

    .line 120
    .line 121
    move-object/from16 v20, v4

    .line 122
    .line 123
    move/from16 v21, v5

    .line 124
    .line 125
    move/from16 v22, v6

    .line 126
    .line 127
    .line 128
    invoke-static/range {v18 .. v23}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetWaterMark(JLandroid/graphics/Bitmap;FFF)V

    .line 129
    .line 130
    iget-wide v7, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 131
    .line 132
    iget-object v1, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 133
    .line 134
    iget v9, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mAudioChannels:I

    .line 135
    .line 136
    iget v10, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mAudioSample:I

    .line 137
    .line 138
    iget v11, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mVolumeType:I

    .line 139
    .line 140
    iget-boolean v12, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mEnableAudioPreview:Z

    .line 141
    .line 142
    iget-boolean v13, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mEnableAns:Z

    .line 143
    .line 144
    .line 145
    invoke-static/range {v7 .. v13}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetAudioConfig(JIIIZZ)V

    .line 146
    .line 147
    iget-wide v14, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 148
    .line 149
    iget-object v1, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 150
    .line 151
    iget v2, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mAutoAdjustStrategy:I

    .line 152
    .line 153
    iget-boolean v3, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mEnablePureAudioPush:Z

    .line 154
    .line 155
    iget v4, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mConnectRetryCount:I

    .line 156
    .line 157
    iget v5, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mConnectRetryInterval:I

    .line 158
    .line 159
    iget v6, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mRtmpChannelType:I

    .line 160
    .line 161
    iget-object v1, v1, Lcom/tencent/rtmp/TXLivePushConfig;->mMetaData:Ljava/util/HashMap;

    .line 162
    .line 163
    move-object/from16 v21, v1

    .line 164
    .line 165
    move/from16 v16, v2

    .line 166
    .line 167
    move/from16 v17, v3

    .line 168
    .line 169
    move/from16 v18, v4

    .line 170
    .line 171
    move/from16 v19, v5

    .line 172
    .line 173
    move/from16 v20, v6

    .line 174
    .line 175
    .line 176
    invoke-static/range {v14 .. v21}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetNetworkConfig(JIZIIILjava/util/HashMap;)V

    .line 177
    return-void
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
.end method

.method public setExposureCompensation(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetExposureCompensation(JF)V

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

.method public setEyeScaleLevel(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    int-to-float p1, p1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setEyeScaleLevel(F)I

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setFaceShortLevel(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    int-to-float p1, p1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setFaceShortLevel(F)I

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setFaceSlimLevel(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    int-to-float p1, p1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setFaceSlimLevel(F)I

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setFaceVLevel(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    int-to-float p1, p1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setFaceVLevel(F)I

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setFilter(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetFilter(JLandroid/graphics/Bitmap;)V

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

.method public setFocusPosition(FF)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetFocusPosition(JFF)V

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
.end method

.method public setGreenScreenFile(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setGreenScreenFile(Ljava/lang/String;)I

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
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

.method public setMicVolume(F)Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetMicVolume(JF)Z

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
.end method

.method public setMirror(Z)Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetMirror(JZ)Z

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
.end method

.method public setMotionMute(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setMotionMute(Z)V

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

.method public setMotionTmpl(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setMotionTmpl(Ljava/lang/String;)V

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

.method public setMute(Z)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetMute(JZ)V

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

.method public setNoseSlimLevel(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mBeautyManager:Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;

    .line 3
    int-to-float p1, p1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/beauty/TXBeautyManagerImpl;->setNoseSlimLevel(F)I

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
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setPushListener(Lcom/tencent/rtmp/ITXLivePushListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXLivePushListener:Lcom/tencent/rtmp/ITXLivePushListener;

    .line 3
    return-void
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
.end method

.method public setRenderRotation(I)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetRenderRotation(JI)V

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

.method public setReverb(I)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetReverb(JI)V

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

.method public setSpecialRatio(F)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetSpecialRatio(JF)V

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

.method public setSurface(Landroid/view/Surface;)V
    .locals 3

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    new-instance v2, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2, p1}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;-><init>(Landroid/view/Surface;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetView(JLcom/tencent/liteav/videobase/videobase/DisplayTarget;)V

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
    .line 25
.end method

.method public setSurfaceSize(II)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public setVideoProcessListener(Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mVideoCustomProcessListener:Lcom/tencent/rtmp/TXLivePusher$VideoCustomProcessListener;

    .line 3
    return-void
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
.end method

.method public setVideoQuality(IZZ)V
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    move/from16 v2, p2

    .line 7
    .line 8
    move/from16 v3, p3

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    move v6, v5

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v6, v4

    .line 18
    .line 19
    :goto_0
    iget-object v7, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v7, v5}, Lcom/tencent/rtmp/TXLivePushConfig;->setHardwareAcceleration(I)V

    .line 23
    .line 24
    iget-object v7, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v7, v2}, Lcom/tencent/rtmp/TXLivePushConfig;->setAutoAdjustBitrate(Z)V

    .line 28
    .line 29
    const/16 v8, 0x3e8

    .line 30
    const/4 v9, 0x2

    .line 31
    .line 32
    const/16 v10, 0x384

    .line 33
    .line 34
    const/16 v11, 0x1f4

    .line 35
    const/4 v12, 0x4

    .line 36
    .line 37
    const/16 v13, 0x1e

    .line 38
    .line 39
    const/16 v14, 0x258

    .line 40
    .line 41
    const/16 v2, 0x320

    .line 42
    .line 43
    const/16 v7, 0xbb8

    .line 44
    const/4 v15, 0x3

    .line 45
    .line 46
    .line 47
    packed-switch v1, :pswitch_data_0

    .line 48
    return-void

    .line 49
    .line 50
    :pswitch_0
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v13}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 54
    .line 55
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setAutoAdjustStrategy(I)V

    .line 59
    .line 60
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v15}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoEncodeGop(I)V

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v14}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_1
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 74
    .line 75
    const/16 v3, 0x9c4

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 79
    .line 80
    :goto_1
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v7}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 84
    .line 85
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v7}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 89
    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :pswitch_1
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v4}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 96
    .line 97
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 98
    const/4 v3, 0x5

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setAutoAdjustStrategy(I)V

    .line 102
    .line 103
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v5}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoEncodeGop(I)V

    .line 107
    .line 108
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 109
    .line 110
    const/16 v3, 0xbe

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 114
    .line 115
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 116
    .line 117
    const/16 v3, 0x190

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 121
    .line 122
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 123
    .line 124
    const/16 v3, 0x32a

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 128
    .line 129
    goto/16 :goto_6

    .line 130
    .line 131
    :pswitch_2
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 132
    const/4 v3, 0x6

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 136
    .line 137
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 138
    .line 139
    const/16 v3, 0x15e

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 143
    .line 144
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 148
    .line 149
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 153
    .line 154
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v12}, Lcom/tencent/rtmp/TXLivePushConfig;->setAutoAdjustStrategy(I)V

    .line 158
    .line 159
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v5}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoEncodeGop(I)V

    .line 163
    .line 164
    goto/16 :goto_6

    .line 165
    .line 166
    :pswitch_3
    iget v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mVideoQuality:I

    .line 167
    .line 168
    if-ne v3, v5, :cond_2

    .line 169
    .line 170
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v4}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 174
    .line 175
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v11}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 179
    .line 180
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v2}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 184
    .line 185
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v10}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 189
    goto :goto_2

    .line 190
    .line 191
    :cond_2
    if-ne v3, v15, :cond_3

    .line 192
    .line 193
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v9}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 197
    .line 198
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v8}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 202
    .line 203
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 204
    .line 205
    const/16 v3, 0x708

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 209
    .line 210
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 214
    goto :goto_2

    .line 215
    :cond_3
    const/4 v4, 0x7

    .line 216
    .line 217
    if-ne v3, v4, :cond_4

    .line 218
    .line 219
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v13}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 223
    .line 224
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 225
    .line 226
    const/16 v3, 0x7d0

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 230
    .line 231
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v7}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 235
    .line 236
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v7}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 240
    goto :goto_2

    .line 241
    .line 242
    :cond_4
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, v5}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 246
    .line 247
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3, v2}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 251
    .line 252
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 253
    .line 254
    const/16 v3, 0x4b0

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 258
    .line 259
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 260
    .line 261
    const/16 v3, 0x5dc

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 265
    .line 266
    :goto_2
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v12}, Lcom/tencent/rtmp/TXLivePushConfig;->setAutoAdjustStrategy(I)V

    .line 270
    .line 271
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v5}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoEncodeGop(I)V

    .line 275
    .line 276
    goto/16 :goto_6

    .line 277
    .line 278
    :pswitch_4
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v9}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 282
    .line 283
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setAutoAdjustStrategy(I)V

    .line 287
    .line 288
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v15}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoEncodeGop(I)V

    .line 292
    .line 293
    if-eqz v6, :cond_5

    .line 294
    .line 295
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v14}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 299
    goto :goto_3

    .line 300
    .line 301
    :cond_5
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v8}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 305
    .line 306
    :goto_3
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 307
    .line 308
    const/16 v3, 0x708

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 312
    .line 313
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 317
    goto :goto_6

    .line 318
    .line 319
    :pswitch_5
    iget-object v4, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v5}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 323
    .line 324
    iget-object v4, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v4, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setAutoAdjustStrategy(I)V

    .line 328
    .line 329
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3, v15}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoEncodeGop(I)V

    .line 333
    .line 334
    if-eqz v6, :cond_6

    .line 335
    .line 336
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v14}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 340
    goto :goto_4

    .line 341
    .line 342
    :cond_6
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v2}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 346
    .line 347
    :goto_4
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 348
    .line 349
    const/16 v3, 0x4b0

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 353
    .line 354
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 355
    .line 356
    const/16 v3, 0x5dc

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 360
    goto :goto_6

    .line 361
    .line 362
    :pswitch_6
    iget-object v5, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5, v4}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoResolution(I)V

    .line 366
    .line 367
    iget-object v4, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v4, v3}, Lcom/tencent/rtmp/TXLivePushConfig;->setAutoAdjustStrategy(I)V

    .line 371
    .line 372
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, v15}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoEncodeGop(I)V

    .line 376
    .line 377
    if-eqz v6, :cond_7

    .line 378
    .line 379
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 380
    .line 381
    const/16 v4, 0x12d

    .line 382
    .line 383
    .line 384
    invoke-virtual {v3, v4}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 385
    goto :goto_5

    .line 386
    .line 387
    :cond_7
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v11}, Lcom/tencent/rtmp/TXLivePushConfig;->setMinVideoBitrate(I)V

    .line 391
    .line 392
    :goto_5
    iget-object v3, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3, v2}, Lcom/tencent/rtmp/TXLivePushConfig;->setVideoBitrate(I)V

    .line 396
    .line 397
    iget-object v2, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v10}, Lcom/tencent/rtmp/TXLivePushConfig;->setMaxVideoBitrate(I)V

    .line 401
    .line 402
    :goto_6
    iput v1, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mVideoQuality:I

    .line 403
    .line 404
    iget-object v1, v0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->setConfig(Lcom/tencent/rtmp/TXLivePushConfig;)V

    .line 408
    return-void

    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
.end method

.method public setVideoRecordListener(Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXVideoRecordListener:Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;

    .line 3
    return-void
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
.end method

.method public setVoiceChangerType(I)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetVoiceChangerType(JI)V

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

.method public setZoom(I)Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetZoom(JI)Z

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
.end method

.method public snapshot(Lcom/tencent/rtmp/TXLivePusher$ITXSnapshotListener;)V
    .locals 2

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mITXSnapshotListener:Lcom/tencent/rtmp/TXLivePusher$ITXSnapshotListener;

    .line 3
    .line 4
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSnapshot(J)V

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

.method public startCameraPreview(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/tencent/liteav/live/a;->a(Lcom/tencent/rtmp/ui/TXCloudVideoView;Ljava/lang/ref/WeakReference;)V

    .line 11
    .line 12
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/tencent/liteav/live/a;->a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)Z

    .line 16
    move-result v2

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeShowDebugView(JZ)V

    .line 20
    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 22
    .line 23
    new-instance v2, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p1}, Lcom/tencent/liteav/videobase/videobase/DisplayTarget;-><init>(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSetView(JLcom/tencent/liteav/videobase/videobase/DisplayTarget;)V

    .line 30
    .line 31
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStartCamera(J)V

    .line 35
    return-void
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

.method public startPusher(Ljava/lang/String;)I
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStartPusher(JLjava/lang/String;)I

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
.end method

.method public startRecord(Ljava/lang/String;)I
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStartRecord(JLjava/lang/String;)I

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
.end method

.method public startScreenCapture()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStartScreenCapture(J)V

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

.method public stopBGM()Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStopBGM(J)Z

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

.method public stopCameraPreview(Z)V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStopCameraPreview(JZ)V

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

.method public stopPusher()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStopPusher(J)V

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

.method public stopRecord()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStopRecord(J)V

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

.method public stopScreenCapture()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeStopScreenCapture(J)V

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

.method public switchCamera()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mConfig:Lcom/tencent/rtmp/TXLivePushConfig;

    .line 3
    .line 4
    iget-boolean v1, v0, Lcom/tencent/rtmp/TXLivePushConfig;->mFrontCamera:Z

    .line 5
    .line 6
    xor-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePushConfig;->setFrontCamera(Z)V

    .line 10
    .line 11
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeSwitchCamera(J)V

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public turnOnFlashLight(Z)Z
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/live/TXLivePusherJni;->mNativeTXLivePusherJni:J

    .line 3
    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/live/TXLivePusherJni;->nativeTurnOnFlashLight(JZ)Z

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
.end method
