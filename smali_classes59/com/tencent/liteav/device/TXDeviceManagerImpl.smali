.class public Lcom/tencent/liteav/device/TXDeviceManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/device/TXDeviceManager;


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::manager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;
    }
.end annotation


# instance fields
.field private mNativeDeviceMgr:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

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

.method public static audioRouteAsInt(Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;)I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;->TXAudioRouteSpeakerphone:Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;->TXAudioRouteEarpiece:Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    return v1
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

.method public static audioRouteFromInt(I)Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;->TXAudioRouteSpeakerphone:Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;

    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;->TXAudioRouteEarpiece:Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;

    .line 11
    return-object p0

    .line 12
    .line 13
    :cond_1
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;->TXAudioRouteSpeakerphone:Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;

    .line 14
    return-object p0
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

.method public static cameraCaptureModeAsInt(Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;)I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraResolutionStrategyAuto:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraResolutionStrategyPerformance:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    .line 14
    :cond_1
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraResolutionStrategyHighQuality:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 15
    .line 16
    if-ne p0, v0, :cond_2

    .line 17
    const/4 p0, 0x2

    .line 18
    return p0

    .line 19
    .line 20
    :cond_2
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraCaptureManual:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 21
    .line 22
    if-ne p0, v0, :cond_3

    .line 23
    const/4 p0, 0x3

    .line 24
    return p0

    .line 25
    :cond_3
    return v1
.end method

.method public static cameraCaptureModeFromInt(I)Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraResolutionStrategyAuto:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraResolutionStrategyPerformance:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x2

    .line 13
    .line 14
    if-ne p0, v0, :cond_2

    .line 15
    .line 16
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraResolutionStrategyHighQuality:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 17
    return-object p0

    .line 18
    :cond_2
    const/4 v0, 0x3

    .line 19
    .line 20
    if-ne p0, v0, :cond_3

    .line 21
    .line 22
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraCaptureManual:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_3
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;->TXCameraResolutionStrategyAuto:Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureMode;

    .line 26
    return-object p0
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

.method private static native nativeDestroy(J)V
.end method

.method private static native nativeEnableCameraAutoFocus(JZ)I
.end method

.method private static native nativeEnableCameraTorch(JZ)Z
.end method

.method private static native nativeGetCameraZoomMaxRatio(J)F
.end method

.method private static native nativeIsAutoFocusEnabled(J)Z
.end method

.method private static native nativeIsCameraAutoFocusFaceModeSupported(J)Z
.end method

.method private static native nativeIsCameraFocusPositionInPreviewSupported(J)Z
.end method

.method private static native nativeIsCameraTorchSupported(J)Z
.end method

.method private static native nativeIsCameraZoomSupported(J)Z
.end method

.method private static native nativeIsFrontCamera(J)Z
.end method

.method private static native nativeIsLowLatencyEarMonitorSupported(J)Z
.end method

.method private static native nativeSetAudioRoute(JI)I
.end method

.method private static native nativeSetCameraCapturerParam(JLcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;)V
.end method

.method private static native nativeSetCameraFocusPosition(JII)I
.end method

.method private static native nativeSetCameraZoomRatio(JF)I
.end method

.method private static native nativeSetExposureCompensation(JF)I
.end method

.method private static native nativeSetSystemVolumeType(JI)I
.end method

.method private static native nativeSwitchCamera(JZ)I
.end method

.method public static systemVolumeTypeAsInt(Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;)I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeAuto:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeMedia:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    .line 14
    :cond_1
    sget-object v0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeVOIP:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 15
    .line 16
    if-ne p0, v0, :cond_2

    .line 17
    const/4 p0, 0x2

    .line 18
    return p0

    .line 19
    :cond_2
    return v1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static systemVolumeTypefromInt(I)Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeAuto:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeMedia:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x2

    .line 13
    .line 14
    if-ne p0, v0, :cond_2

    .line 15
    .line 16
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeVOIP:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 17
    return-object p0

    .line 18
    .line 19
    :cond_2
    sget-object p0, Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;->TXSystemVolumeTypeAuto:Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;

    .line 20
    return-object p0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public enableCameraAutoFocus(Z)I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeEnableCameraAutoFocus(JZ)I

    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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

.method public enableCameraTorch(Z)Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeEnableCameraTorch(JZ)Z

    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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
    .locals 5
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
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeDestroy(J)V

    .line 15
    .line 16
    iput-wide v2, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 17
    :cond_0
    return-void
.end method

.method public getCameraZoomMaxRatio()F
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeGetCameraZoomMaxRatio(J)F

    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public isAutoFocusEnabled()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeIsAutoFocusEnabled(J)Z

    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public isCameraAutoFocusFaceModeSupported()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeIsCameraAutoFocusFaceModeSupported(J)Z

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public isCameraFocusPositionInPreviewSupported()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeIsCameraFocusPositionInPreviewSupported(J)Z

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public isCameraTorchSupported()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeIsCameraTorchSupported(J)Z

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public isCameraZoomSupported()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeIsCameraZoomSupported(J)Z

    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public isFrontCamera()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeIsFrontCamera(J)Z

    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public isLowLatencyEarMonitorSupported()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeIsLowLatencyEarMonitorSupported(J)Z

    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public setAudioRoute(Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;)I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->audioRouteAsInt(Lcom/tencent/liteav/device/TXDeviceManager$TXAudioRoute;)I

    .line 12
    move-result p1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeSetAudioRoute(JI)I

    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setCameraCapturerParam(Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance v2, Lcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;-><init>(Lcom/tencent/liteav/device/TXDeviceManager$TXCameraCaptureParam;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeSetCameraCapturerParam(JLcom/tencent/liteav/device/TXDeviceManagerImpl$CameraCaptureParam;)V

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setCameraFocusPosition(II)I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeSetCameraFocusPosition(JII)I

    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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

.method public setCameraZoomRatio(F)I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeSetCameraZoomRatio(JF)I

    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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

.method public setExposureCompensation(F)I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeSetExposureCompensation(JF)I

    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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

.method public setSystemVolumeType(Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;)I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->systemVolumeTypeAsInt(Lcom/tencent/liteav/device/TXDeviceManager$TXSystemVolumeType;)I

    .line 12
    move-result p1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeSetSystemVolumeType(JI)I

    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public switchCamera(Z)I
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->mNativeDeviceMgr:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/device/TXDeviceManagerImpl;->nativeSwitchCamera(JZ)I

    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
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
