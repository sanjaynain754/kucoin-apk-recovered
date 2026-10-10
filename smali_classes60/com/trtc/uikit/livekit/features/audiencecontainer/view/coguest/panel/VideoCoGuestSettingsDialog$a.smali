.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$a;
.super Lcom/trtc/tuikit/common/permission/d;
.source "VideoCoGuestSettingsDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$initApplyLinkMicButton$1$1",
        "Lcom/trtc/tuikit/common/permission/PermissionCallback;",
        "onGranted",
        "",
        "onDenied",
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
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;

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
.method public a()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;->F()Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "requestCameraPermissions:[onDenied]"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

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
.end method

.method public b()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;->F()Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "requestCameraPermissions:[onGranted]"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v0, Lvc0/f;->a:Lvc0/f;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/trtc/tuikit/common/system/ContextProvider;->b()Landroid/content/Context;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v2, "getApplicationContext(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    new-instance v2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$a$a;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v3}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog$a$a;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsDialog;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lvc0/f;->b(Landroid/content/Context;Lcom/trtc/tuikit/common/permission/d;)V

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
.end method
