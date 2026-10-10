.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;
.super Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;
.source "ApplyCoGuestFloatView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0008\u0010\u001c\u001a\u00020\u0019H\u0014J\u0008\u0010\u001d\u001a\u00020\u0019H\u0014J\u0008\u0010\u001e\u001a\u00020\u0019H\u0002J\u0008\u0010\u001f\u001a\u00020\u0019H\u0014J\u0008\u0010 \u001a\u00020\u0019H\u0014J\u0008\u0010!\u001a\u00020\u0019H\u0003J\u000e\u0010\"\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0002\u0010#R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "layoutRoot",
        "Landroid/widget/LinearLayout;",
        "imageFirstApplyLinkAudience",
        "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;",
        "imageSecondApplyLinkAudience",
        "layoutSecondApplyLinkAudience",
        "Landroid/widget/RelativeLayout;",
        "layoutEllipsis",
        "textApplyLinkAudienceCount",
        "Landroid/widget/TextView;",
        "liveStream",
        "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;",
        "subscribeStateJob",
        "Lkotlinx/coroutines/Job;",
        "init",
        "",
        "manager",
        "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;",
        "initView",
        "refreshView",
        "initRootView",
        "addObserver",
        "removeObserver",
        "initApplyLinkAudienceListView",
        "onApplyLinkAudienceListChange",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field public n:Landroid/widget/LinearLayout;

.field public o:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

.field public p:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

.field public q:Landroid/widget/RelativeLayout;

.field public r:Landroid/widget/RelativeLayout;

.field public s:Landroid/widget/TextView;

.field public t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

.field public u:Lkotlinx/coroutines/x1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic f(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->m(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;Landroid/view/View;)V

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
.end method

.method public static synthetic g(Landroid/view/View;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->n(Landroid/view/View;Landroid/content/DialogInterface;)V

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
.end method

.method public static final synthetic h(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->k()V

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

.method public static final synthetic i(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->o(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final m(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 12
    .line 13
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestManageDialog;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->getBaseContext()Landroid/content/Context;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->getAnchorStore()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    iget-object p0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    const-string p0, "liveStream"

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 31
    const/4 p0, 0x0

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-direct {v0, v1, v2, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestManageDialog;-><init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 35
    .line 36
    new-instance p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/s;

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/s;-><init>(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 46
    return-void
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
.end method

.method public static final n(Landroid/view/View;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

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
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v4, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$addObserver$1;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v4, p0, v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$addObserver$1;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->u:Lkotlinx/coroutines/x1;

    .line 25
    return-void
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

.method public c()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget v1, Lcom/trtc/uikit/livekit/R$layout;->livekit_layout_anchor_apply_link_audience:I

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    sget v0, Lcom/trtc/uikit/livekit/R$id;->ll_root:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "findViewById(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    check-cast v0, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->n:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    sget v0, Lcom/trtc/uikit/livekit/R$id;->tv_apply_link_audience_count:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    check-cast v0, Landroid/widget/TextView;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->s:Landroid/widget/TextView;

    .line 43
    .line 44
    sget v0, Lcom/trtc/uikit/livekit/R$id;->rl_second_apply_link_audience:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 54
    .line 55
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->q:Landroid/widget/RelativeLayout;

    .line 56
    .line 57
    sget v0, Lcom/trtc/uikit/livekit/R$id;->rl_ellipsis:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 67
    .line 68
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->r:Landroid/widget/RelativeLayout;

    .line 69
    .line 70
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_first_apply_link_audience:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    check-cast v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 80
    .line 81
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 82
    .line 83
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_second_apply_link_audience:I

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    check-cast v0, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 93
    .line 94
    iput-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->p:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 95
    return-void
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
.end method

.method public d()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->k()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->l()V

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

.method public e()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->u:Lkotlinx/coroutines/x1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 10
    :cond_0
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

.method public final j(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "manager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "liveStream"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->t:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->b(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V

    .line 16
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
.end method

.method public final k()V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StringFormatMatches"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getApplicants()Lkotlinx/coroutines/flow/w;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    check-cast v0, Ljava/util/List;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 48
    move-result v1

    .line 49
    .line 50
    const/16 v2, 0x8

    .line 51
    const/4 v3, 0x0

    .line 52
    .line 53
    if-nez v1, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    :goto_0
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 69
    move-result v4

    .line 70
    .line 71
    const-string v5, "imageFirstApplyLinkAudience"

    .line 72
    .line 73
    const-string v6, "layoutEllipsis"

    .line 74
    .line 75
    const-string v7, "layoutSecondApplyLinkAudience"

    .line 76
    const/4 v8, 0x1

    .line 77
    const/4 v9, 0x0

    .line 78
    .line 79
    if-ne v4, v8, :cond_4

    .line 80
    .line 81
    iget-object v4, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->q:Landroid/widget/RelativeLayout;

    .line 82
    .line 83
    if-nez v4, :cond_1

    .line 84
    .line 85
    .line 86
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 87
    move-object v4, v9

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 91
    .line 92
    iget-object v4, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->r:Landroid/widget/RelativeLayout;

    .line 93
    .line 94
    if-nez v4, :cond_2

    .line 95
    .line 96
    .line 97
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 98
    move-object v4, v9

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 104
    .line 105
    if-nez v2, :cond_3

    .line 106
    .line 107
    .line 108
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 109
    move-object v2, v9

    .line 110
    .line 111
    :cond_3
    new-instance v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    sget v3, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_avatar:I

    .line 124
    .line 125
    .line 126
    invoke-direct {v4, v1, v3}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;-><init>(Ljava/lang/String;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->setContent(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b;)V

    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    .line 134
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 135
    move-result v4

    .line 136
    .line 137
    const-string v10, "imageSecondApplyLinkAudience"

    .line 138
    const/4 v11, 0x2

    .line 139
    .line 140
    if-ne v4, v11, :cond_9

    .line 141
    .line 142
    iget-object v4, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->q:Landroid/widget/RelativeLayout;

    .line 143
    .line 144
    if-nez v4, :cond_5

    .line 145
    .line 146
    .line 147
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 148
    move-object v4, v9

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 152
    .line 153
    iget-object v4, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->r:Landroid/widget/RelativeLayout;

    .line 154
    .line 155
    if-nez v4, :cond_6

    .line 156
    .line 157
    .line 158
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 159
    move-object v4, v9

    .line 160
    .line 161
    .line 162
    :cond_6
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 165
    .line 166
    if-nez v2, :cond_7

    .line 167
    .line 168
    .line 169
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 170
    move-object v2, v9

    .line 171
    .line 172
    :cond_7
    new-instance v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    sget v5, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_avatar:I

    .line 185
    .line 186
    .line 187
    invoke-direct {v4, v3, v5}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;-><init>(Ljava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->setContent(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b;)V

    .line 191
    .line 192
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->p:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 193
    .line 194
    if-nez v2, :cond_8

    .line 195
    .line 196
    .line 197
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 198
    move-object v2, v9

    .line 199
    .line 200
    :cond_8
    new-instance v3, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 204
    move-result-object v1

    .line 205
    .line 206
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    .line 213
    invoke-direct {v3, v1, v5}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;-><init>(Ljava/lang/String;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v3}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->setContent(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b;)V

    .line 217
    goto :goto_1

    .line 218
    .line 219
    .line 220
    :cond_9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 221
    move-result v4

    .line 222
    .line 223
    if-le v4, v11, :cond_e

    .line 224
    .line 225
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->q:Landroid/widget/RelativeLayout;

    .line 226
    .line 227
    if-nez v2, :cond_a

    .line 228
    .line 229
    .line 230
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 231
    move-object v2, v9

    .line 232
    .line 233
    .line 234
    :cond_a
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 235
    .line 236
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->r:Landroid/widget/RelativeLayout;

    .line 237
    .line 238
    if-nez v2, :cond_b

    .line 239
    .line 240
    .line 241
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 242
    move-object v2, v9

    .line 243
    .line 244
    .line 245
    :cond_b
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 246
    .line 247
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->o:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 248
    .line 249
    if-nez v2, :cond_c

    .line 250
    .line 251
    .line 252
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 253
    move-object v2, v9

    .line 254
    .line 255
    :cond_c
    new-instance v4, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 259
    move-result-object v3

    .line 260
    .line 261
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 265
    move-result-object v3

    .line 266
    .line 267
    sget v5, Lcom/trtc/uikit/livekit/R$drawable;->livekit_ic_avatar:I

    .line 268
    .line 269
    .line 270
    invoke-direct {v4, v3, v5}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;-><init>(Ljava/lang/String;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->setContent(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b;)V

    .line 274
    .line 275
    iget-object v2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->p:Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;

    .line 276
    .line 277
    if-nez v2, :cond_d

    .line 278
    .line 279
    .line 280
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 281
    move-object v2, v9

    .line 282
    .line 283
    :cond_d
    new-instance v3, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 287
    move-result-object v1

    .line 288
    .line 289
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getAvatarURL()Ljava/lang/String;

    .line 293
    move-result-object v1

    .line 294
    .line 295
    .line 296
    invoke-direct {v3, v1, v5}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b$c;-><init>(Ljava/lang/String;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v3}, Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;->setContent(Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar$b;)V

    .line 300
    goto :goto_1

    .line 301
    .line 302
    .line 303
    :cond_e
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 304
    .line 305
    :goto_1
    iget-object v1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->s:Landroid/widget/TextView;

    .line 306
    .line 307
    if-nez v1, :cond_f

    .line 308
    .line 309
    const-string v1, "textApplyLinkAudienceCount"

    .line 310
    .line 311
    .line 312
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 313
    goto :goto_2

    .line 314
    :cond_f
    move-object v9, v1

    .line 315
    .line 316
    .line 317
    :goto_2
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;->getBaseContext()Landroid/content/Context;

    .line 318
    move-result-object v1

    .line 319
    .line 320
    sget v2, Lcom/trtc/uikit/livekit/R$string;->common_seat_application_title:I

    .line 321
    .line 322
    .line 323
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 324
    move-result v0

    .line 325
    .line 326
    .line 327
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    move-result-object v0

    .line 329
    .line 330
    .line 331
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 332
    move-result-object v0

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 336
    move-result-object v0

    .line 337
    .line 338
    .line 339
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    return-void
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
.end method

.method public final l()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;->n:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "layoutRoot"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/r;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/r;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    return-void
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

.method public final o(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-eq v2, v3, :cond_1

    .line 38
    .line 39
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    throw p1

    .line 46
    .line 47
    :cond_1
    iget-object v0, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getApplicants()Lkotlinx/coroutines/flow/w;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    new-instance v4, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$a;

    .line 97
    .line 98
    .line 99
    invoke-direct {v4, p0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$a;-><init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    iput-object p1, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;->L$0:Ljava/lang/Object;

    .line 106
    .line 107
    iput v3, v0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1;->label:I

    .line 108
    .line 109
    .line 110
    invoke-interface {v2, v4, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    if-ne p1, v1, :cond_3

    .line 114
    return-object v1

    .line 115
    .line 116
    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 117
    .line 118
    .line 119
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 120
    throw p1
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
.end method
