.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$b;
.super Lcom/trtc/tuikit/common/permission/d;
.source "VideoCoGuestSettingsDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$initCameraView$1",
        "Lcom/trtc/tuikit/common/permission/PermissionCallback;",
        "onGranted",
        "",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/trtc/tuikit/common/permission/d;-><init>()V

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
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;->D(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;)Lee0/f;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lee0/f;->k()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->switchCamera(Z)V

    .line 15
    .line 16
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$b;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;->E(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;)Lio/trtc/tuikit/atomicxcore/api/view/CameraView;

    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    const-string v1, "cameraView"

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 35
    move-object v1, v2

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->startCameraTest(Lio/trtc/tuikit/atomicxcore/api/view/CameraView;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
.end method
