.class public Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;
.super Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;
.source "TUIRoomDeviceManagerImpl.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::extension"
.end annotation


# instance fields
.field private final mNativeDeviceManagerJni:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->mNativeDeviceManagerJni:J

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

.method private static native nativeEnableCameraAutoFocus(JZ)V
.end method

.method private static native nativeEnableCameraTorch(JZ)V
.end method

.method private static native nativeIsAutoFocusEnabled(J)Z
.end method

.method private static native nativeIsFrontCamera(J)Z
.end method

.method private static native nativeSetAudioRoute(JI)V
.end method

.method private static native nativeSwitchCamera(JZ)V
.end method


# virtual methods
.method public enableCameraAutoFocus(Z)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->mNativeDeviceManagerJni:J

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
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->nativeEnableCameraAutoFocus(JZ)V

    .line 12
    :cond_0
    return-void
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

.method public enableCameraTorch(Z)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->mNativeDeviceManagerJni:J

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
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->nativeEnableCameraTorch(JZ)V

    .line 12
    :cond_0
    return-void
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

.method public isAutoFocusEnabled()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->mNativeDeviceManagerJni:J

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
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->nativeIsAutoFocusEnabled(J)Z

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
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->mNativeDeviceManagerJni:J

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
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->nativeIsFrontCamera(J)Z

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

.method public setAudioRoute(Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager$AudioRoute;)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->mNativeDeviceManagerJni:J

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
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager$AudioRoute;->getValue()I

    .line 12
    move-result p1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->nativeSetAudioRoute(JI)V

    .line 16
    :cond_0
    return-void
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

.method public switchCamera(Z)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->mNativeDeviceManagerJni:J

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
    invoke-static {v0, v1, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIRoomDeviceManagerImpl;->nativeSwitchCamera(JZ)V

    .line 12
    :cond_0
    return-void
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
