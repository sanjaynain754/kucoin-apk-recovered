.class public final Lfd0/a;
.super Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;
.source "BeautyPanelDialog.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/beauty/BeautyPanelDialog;",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
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
.field public final m:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, v0, v1, v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;-><init>(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    iput-object p1, p0, Lfd0/a;->m:Landroid/content/Context;

    .line 13
    const/4 p1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->v(Z)V

    .line 17
    const/4 p1, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->u(Z)V

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
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget-object p1, Lcom/trtc/uikit/livekit/component/beauty/tebeauty/a;->a:Lcom/trtc/uikit/livekit/component/beauty/tebeauty/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/beauty/tebeauty/a;->r()Z

    .line 9
    move-result p1

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyView;

    .line 14
    .line 15
    iget-object v0, p0, Lfd0/a;->m:Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyView;-><init>(Landroid/content/Context;)V

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v1, Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/BeautyListPanel;

    .line 22
    .line 23
    iget-object v2, p0, Lfd0/a;->m:Landroid/content/Context;

    .line 24
    const/4 v5, 0x6

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/BeautyListPanel;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    move-object p1, v1

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0, p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->q(Landroid/view/View;)V

    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
.end method
