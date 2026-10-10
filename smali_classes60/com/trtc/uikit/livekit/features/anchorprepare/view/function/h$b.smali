.class public final Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h$b;
.super Ljava/lang/Object;
.source "PrepareVideoSettingPanel.kt"

# interfaces
.implements Lud0/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/anchorprepare/view/function/PrepareVideoSettingPanel$initView$1$1",
        "Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$OnMirrorTypeSelectedListener;",
        "onVideoQualitySelected",
        "",
        "mirrorType",
        "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;",
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h$b;->a:Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public a(Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "mirrorType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->switchMirror(Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;)V

    .line 15
    .line 16
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h$b;->a:Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;->E(Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;)Landroid/widget/TextView;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const-string p1, "textMirror"

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 28
    const/4 p1, 0x0

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h$b;->a:Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;->G(Lcom/trtc/uikit/livekit/features/anchorprepare/view/function/h;)Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    return-void
    .line 39
.end method
