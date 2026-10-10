.class public final Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;
.super Lcom/trtc/uikit/livekit/common/ui/BasicView;
.source "NetworkInfoView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u001f\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019J\u0008\u0010#\u001a\u00020\"H\u0014J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&J\u0008\u0010\'\u001a\u00020\"H\u0002J\u0008\u0010(\u001a\u00020\"H\u0002J\u0008\u0010)\u001a\u00020\"H\u0014J\u0008\u0010*\u001a\u00020\"H\u0014J\u0008\u0010+\u001a\u00020\"H\u0014J\u0008\u0010,\u001a\u00020\"H\u0014J\u0008\u0010-\u001a\u00020\"H\u0002J\u0008\u0010.\u001a\u00020\"H\u0002J\u0008\u0010/\u001a\u00020\"H\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0017H\u0003J\u0010\u00103\u001a\u00020\"2\u0006\u00104\u001a\u000205H\u0002J\u0017\u00106\u001a\u00020\"2\u0008\u00107\u001a\u0004\u0018\u00010&H\u0002\u00a2\u0006\u0002\u00108R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010 \u00a8\u00069"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;",
        "Lcom/trtc/uikit/livekit/common/ui/BasicView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "networkInfoStore",
        "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;",
        "state",
        "Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;",
        "imageNetworkStatus",
        "Landroid/widget/ImageView;",
        "textCreateTime",
        "Landroid/widget/TextView;",
        "networkInfoPanel",
        "Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;",
        "layoutNetworkInfo",
        "Landroid/widget/LinearLayout;",
        "createTime",
        "",
        "liveInfo",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
        "liveTimeRunnable",
        "Ljava/lang/Runnable;",
        "handler",
        "Landroid/os/Handler;",
        "liveListListener",
        "com/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$liveListListener$1",
        "Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$liveListListener$1;",
        "init",
        "",
        "initStore",
        "setScreenOrientation",
        "isPortrait",
        "",
        "initView",
        "bindViewId",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "addObserver",
        "removeObserver",
        "initNetworkView",
        "startLiveTimer",
        "stopLiveTimer",
        "formatDuration",
        "",
        "durationMillis",
        "onNetworkQualityChange",
        "networkQuality",
        "Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;",
        "onNetworkWeakTipsChange",
        "isShow",
        "(Ljava/lang/Boolean;)V",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetworkInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkInfoView.kt\ncom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"
    }
.end annotation


# instance fields
.field public final d:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/TextView;

.field public h:Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public i:Landroid/widget/LinearLayout;

.field public j:J

.field public k:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

.field public l:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final m:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
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

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/common/ui/BasicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p2, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    invoke-direct {p2, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->d:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 6
    invoke-virtual {p2}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->i()Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    move-result-object p1

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->e:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 7
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->m:Landroid/os/Handler;

    .line 8
    new-instance p1, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$b;

    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$b;-><init>(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->n:Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$b;

    .line 9
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->v()V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic f(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->u(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;Landroid/view/View;)V

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

.method public static final synthetic g(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;J)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->r(J)Ljava/lang/String;

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

.method public static final synthetic h(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->j:J

    .line 3
    return-wide v0
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
.end method

.method public static final synthetic i(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)Landroid/os/Handler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->m:Landroid/os/Handler;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic j(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic k(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->h:Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic l(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->d:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic m(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->e:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic n(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)Landroid/widget/TextView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->g:Landroid/widget/TextView;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic o(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->w(Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;)V

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

.method public static final synthetic p(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->x(Ljava/lang/Boolean;)V

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

.method private final q()V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/trtc/uikit/livekit/R$id;->ll_network_info:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "findViewById(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Landroid/widget/LinearLayout;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->i:Landroid/widget/LinearLayout;

    .line 16
    .line 17
    sget v0, Lcom/trtc/uikit/livekit/R$id;->iv_network_status:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    check-cast v0, Landroid/widget/ImageView;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->f:Landroid/widget/ImageView;

    .line 29
    .line 30
    sget v0, Lcom/trtc/uikit/livekit/R$id;->tv_live_time:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    check-cast v0, Landroid/widget/TextView;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->g:Landroid/widget/TextView;

    .line 42
    return-void
.end method

.method public static final u(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;Landroid/view/View;)V
    .locals 3

    .line 1
    .line 2
    new-instance p1, Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "getContext(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->d:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->e:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoState;->m()Lkotlinx/coroutines/flow/n;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    move-result v2

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v0, v1, v2}, Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;-><init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;Z)V

    .line 33
    .line 34
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->h:Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkInfoPanel;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;->show()V

    .line 38
    return-void
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

.method private final v()V
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
    sget v1, Lcom/trtc/uikit/livekit/R$layout;->network_info_view:I

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->q()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->t()V

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
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->d:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->f()V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->n:Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$b;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->addLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    new-instance v4, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$addObserver$1;

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct {v4, p0, v0}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$addObserver$1;-><init>(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;Lkotlin/coroutines/Continuation;)V

    .line 31
    const/4 v5, 0x3

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->setSubscribeStateJob(Lkotlinx/coroutines/x1;)V

    .line 42
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "liveInfo"

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 20
    return-void
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

.method public d()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->d:Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/networkInfo/store/NetworkInfoStore;->t()V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->n:Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$b;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->removeLiveListListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getSubscribeStateJob()Lkotlinx/coroutines/x1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    const/4 v1, 0x1

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 28
    :cond_0
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
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->onAttachedToWindow()V

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
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->z()V

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

.method public final r(J)Ljava/lang/String;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x3e8

    .line 3
    int-to-long v0, v0

    .line 4
    div-long/2addr p1, v0

    .line 5
    .line 6
    const/16 v0, 0xe10

    .line 7
    int-to-long v0, v0

    .line 8
    .line 9
    div-long v2, p1, v0

    .line 10
    .line 11
    rem-long v0, p1, v0

    .line 12
    .line 13
    const/16 v4, 0x3c

    .line 14
    int-to-long v4, v4

    .line 15
    div-long/2addr v0, v4

    .line 16
    rem-long/2addr p1, v4

    .line 17
    .line 18
    sget-object v4, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    filled-new-array {v2, v0, p1}, [Ljava/lang/Object;

    .line 34
    move-result-object p1

    .line 35
    const/4 p2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    const-string p2, "%02d:%02d:%02d"

    .line 42
    .line 43
    .line 44
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    const-string p2, "format(...)"

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    return-object p1
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
.end method

.method public final s(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 4
    .param p1    # Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "liveInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getCreateTime()J

    .line 22
    move-result-wide v2

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 26
    move-result-wide v0

    .line 27
    .line 28
    iput-wide v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->j:J

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->y()V

    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public final setScreenOrientation(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->i:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "layoutNetworkInfo"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

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
.end method

.method public final t()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->i:Landroid/widget/LinearLayout;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "layoutNetworkInfo"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcom/trtc/uikit/livekit/component/networkInfo/a;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/trtc/uikit/livekit/component/networkInfo/a;-><init>(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)V

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

.method public final w(Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$a;->$EnumSwitchMapping$0:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    const/4 v0, 0x2

    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    const/4 v0, 0x3

    .line 16
    .line 17
    if-eq p1, v0, :cond_0

    .line 18
    const/4 v0, 0x4

    .line 19
    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    sget p1, Lcom/trtc/uikit/livekit/R$drawable;->network_info_network_status_good:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    sget p1, Lcom/trtc/uikit/livekit/R$drawable;->network_info_network_status_down:I

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    sget p1, Lcom/trtc/uikit/livekit/R$drawable;->network_info_network_status_very_bad:I

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_2
    sget p1, Lcom/trtc/uikit/livekit/R$drawable;->network_info_network_status_poor:I

    .line 32
    .line 33
    :goto_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->f:Landroid/widget/ImageView;

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    const-string v0, "imageNetworkStatus"

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 41
    const/4 v0, 0x0

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 45
    return-void
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
.end method

.method public final x(Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkBadTipsDialog;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, "getContext(...)"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkBadTipsDialog;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/component/networkInfo/view/NetworkBadTipsDialog;->show()V

    .line 26
    :cond_0
    return-void
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

.method public final y()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->l:Ljava/lang/Runnable;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->m:Landroid/os/Handler;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$c;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView$c;-><init>(Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;)V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->l:Ljava/lang/Runnable;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->m:Landroid/os/Handler;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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

.method public final z()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->l:Ljava/lang/Runnable;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->m:Landroid/os/Handler;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/networkInfo/NetworkInfoView;->l:Ljava/lang/Runnable;

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
.end method
