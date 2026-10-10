.class public abstract Lcom/tencent/live2/V2TXLivePusher;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public abstract enableAudioProcessObserver(ZLcom/tencent/live2/V2TXLiveDef$V2TXLiveAudioFrameObserverFormat;)I
.end method

.method public abstract enableCustomAudioCapture(Z)I
.end method

.method public abstract enableCustomVideoCapture(Z)I
.end method

.method public abstract enableCustomVideoProcess(ZLcom/tencent/live2/V2TXLiveDef$V2TXLivePixelFormat;Lcom/tencent/live2/V2TXLiveDef$V2TXLiveBufferType;)I
.end method

.method public abstract enableVoiceActivityDetection(Z)V
.end method

.method public abstract enableVolumeEvaluation(I)I
.end method

.method public abstract getAudioEffectManager()Lcom/tencent/liteav/audio/TXAudioEffectManager;
.end method

.method public abstract getBeautyManager()Lcom/tencent/liteav/beauty/TXBeautyManager;
.end method

.method public abstract getDeviceManager()Lcom/tencent/liteav/device/TXDeviceManager;
.end method

.method public abstract getProperty(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract isPushing()I
.end method

.method public abstract pauseAudio()I
.end method

.method public abstract pauseVideo()I
.end method

.method public abstract release()V
.end method

.method public abstract resumeAudio()I
.end method

.method public abstract resumeVideo()I
.end method

.method public abstract sendCustomAudioFrame(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveAudioFrame;)I
.end method

.method public abstract sendCustomVideoFrame(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveVideoFrame;)I
.end method

.method public abstract sendSeiMessage(I[B)I
.end method

.method public abstract setAudioQuality(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveAudioQuality;)I
.end method

.method public abstract setEncoderMirror(Z)I
.end method

.method public abstract setMixTranscodingConfig(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveTranscodingConfig;)I
.end method

.method public abstract setObserver(Lcom/tencent/live2/V2TXLivePusherObserver;)V
.end method

.method public abstract setProperty(Ljava/lang/String;Ljava/lang/Object;)I
.end method

.method public abstract setRenderFillMode(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveFillMode;)I
.end method

.method public abstract setRenderMirror(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveMirrorType;)I
.end method

.method public abstract setRenderRotation(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveRotation;)I
.end method

.method public abstract setRenderView(Landroid/view/SurfaceView;)I
.end method

.method public abstract setRenderView(Landroid/view/TextureView;)I
.end method

.method public abstract setRenderView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)I
.end method

.method public abstract setVideoQuality(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveVideoEncoderParam;)I
.end method

.method public abstract setWatermark(Landroid/graphics/Bitmap;FFF)I
.end method

.method public abstract showDebugView(Z)V
.end method

.method public abstract snapshot()I
.end method

.method public abstract startCamera(Z)I
.end method

.method public abstract startLocalRecording(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveLocalRecordingParams;)I
.end method

.method public abstract startMicrophone()I
.end method

.method public abstract startPush(Ljava/lang/String;)I
.end method

.method public abstract startScreenCapture()I
.end method

.method public abstract startSystemAudioLoopback()I
.end method

.method public abstract startVirtualCamera(Landroid/graphics/Bitmap;)I
.end method

.method public abstract stopCamera()I
.end method

.method public abstract stopLocalRecording()V
.end method

.method public abstract stopMicrophone()I
.end method

.method public abstract stopPush()I
.end method

.method public abstract stopScreenCapture()I
.end method

.method public abstract stopSystemAudioLoopback()I
.end method

.method public abstract stopVirtualCamera()I
.end method
