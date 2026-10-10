.class public final Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;
.super Lcom/trtc/uikit/livekit/common/ui/BasicView;
.source "GiftPlayView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$Companion;,
        Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$a;,
        Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$b;,
        Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 >2\u00020\u0001:\u0004;<=>B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0008\u0010%\u001a\u00020\"H\u0014J\u0008\u0010&\u001a\u00020\"H\u0014J\u0008\u0010\'\u001a\u00020\"H\u0014J\u0008\u0010(\u001a\u00020\"H\u0002J\u0008\u0010)\u001a\u00020\"H\u0002J\u0008\u0010*\u001a\u00020\"H\u0002J\u0008\u0010+\u001a\u00020\"H\u0014J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020$J\u0010\u0010.\u001a\u00020\"2\u0008\u0010/\u001a\u0004\u0018\u00010\u0013J \u00100\u001a\u00020\"2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0002J\u0008\u00106\u001a\u00020\"H\u0002J\u0008\u00107\u001a\u00020\"H\u0002J\u0010\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0007H\u0002J\u0008\u0010:\u001a\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00060\u001eR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;",
        "Lcom/trtc/uikit/livekit/common/ui/BasicView;",
        "mContext",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "logger",
        "Lcom/trtc/uikit/livekit/common/LiveKitLogger;",
        "imageAnimationView",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;",
        "animationView",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;",
        "heartLayout",
        "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout;",
        "giftPlayViewListener",
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$TUIGiftPlayViewListener;",
        "giftStore",
        "Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;",
        "likeStore",
        "Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;",
        "giftAnimationManager",
        "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;",
        "giftImageAnimationManager",
        "likeListenerImpl",
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$LikeListenerImpl;",
        "giftListenerImpl",
        "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$GiftListenerImpl;",
        "mainScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "init",
        "",
        "roomId",
        "",
        "initStore",
        "addObserver",
        "removeObserver",
        "initView",
        "initAnimationPlayer",
        "initImageAnimationPlayer",
        "onDetachedFromWindow",
        "playGiftAnimation",
        "playUrl",
        "setListener",
        "listener",
        "playGift",
        "gift",
        "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;",
        "giftCount",
        "sender",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;",
        "playLike",
        "playLikeFromSelf",
        "playLikeFromOther",
        "count",
        "getLanguage",
        "TUIGiftPlayViewListener",
        "GiftListenerImpl",
        "LikeListenerImpl",
        "Companion",
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
        "SMAP\nGiftPlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPlayView.kt\ncom/trtc/uikit/livekit/component/gift/GiftPlayView\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,293:1\n106#2,2:294\n*S KotlinDebug\n*F\n+ 1 GiftPlayView.kt\ncom/trtc/uikit/livekit/component/gift/GiftPlayView\n*L\n70#1:294,2\n*E\n"
    }
.end annotation


# static fields
.field public static final q:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final d:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public f:Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public i:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public j:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Lkotlinx/coroutines/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->q:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$Companion;

    .line 9
    return-void
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "mContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const-string v0, "mContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    const-string v0, "mContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/common/ui/BasicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->d:Landroid/content/Context;

    .line 6
    sget-object p1, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->c:Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;

    const-string p2, "GiftPlayView"

    invoke-virtual {p1, p2}, Lcom/trtc/uikit/livekit/common/LiveKitLogger$Companion;->getComponentLogger(Ljava/lang/String;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    move-result-object p1

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->e:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 7
    new-instance p1, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    invoke-direct {p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;-><init>()V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->l:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 8
    new-instance p1, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    invoke-direct {p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;-><init>()V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->m:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 9
    new-instance p1, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$b;

    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$b;-><init>(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->n:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$b;

    .line 10
    new-instance p1, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$a;

    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$a;-><init>(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->o:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$a;

    .line 11
    invoke-static {}, Lkotlinx/coroutines/n0;->b()Lkotlinx/coroutines/m0;

    move-result-object p1

    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->p:Lkotlinx/coroutines/m0;

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget p3, Lcom/trtc/uikit/livekit/R$layout;->gift_layout_animator:I

    const/4 v0, 0x1

    invoke-virtual {p2, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->r()V

    .line 14
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->p()V

    .line 15
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->q()V

    .line 16
    sget-object p2, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    invoke-virtual {p2}, Lcom/kubi/event/api/b;->a()Z

    move-result p2

    const-string p3, "com.trtc.uikit.livekit.kc.LiveEvent:like_event"

    if-eqz p2, :cond_0

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p2

    .line 17
    :cond_0
    new-instance p2, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$special$$inlined$bindFlowEvent$1;

    const/4 v0, 0x0

    invoke-direct {p2, p3, v0, p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$special$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V

    invoke-static {p1, p2}, Lcom/kubi/event/api/a;->b(Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic f(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lpd0/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->u(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lpd0/a;)V

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

.method public static final synthetic g(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->g:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

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

.method private final getLanguage()Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    iget-object v2, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->e:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    const-string v4, "getLanguage language:"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v4, ", languageTag:"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    move-result v2

    .line 51
    .line 52
    const-string v3, "en"

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    move-result v2

    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    goto :goto_1

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    const-string v4, "getDefault(...)"

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    const-string v2, "toLowerCase(...)"

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    const/4 v2, 0x1

    .line 84
    .line 85
    const-string v4, "zh"

    .line 86
    .line 87
    .line 88
    invoke-static {v4, v0, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 89
    move-result v0

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    const/4 v0, 0x2

    .line 93
    const/4 v2, 0x0

    .line 94
    .line 95
    const-string v3, "zh-hans"

    .line 96
    const/4 v5, 0x0

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v3, v5, v0, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-nez v0, :cond_2

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-nez v0, :cond_2

    .line 109
    .line 110
    const-string v0, "zh-cn"

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    move-result v0

    .line 115
    .line 116
    if-nez v0, :cond_2

    .line 117
    .line 118
    const-string v0, "zh-sg"

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    move-result v0

    .line 123
    .line 124
    if-nez v0, :cond_2

    .line 125
    .line 126
    const-string v0, "zh-my"

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    move-result v0

    .line 131
    .line 132
    if-eqz v0, :cond_1

    .line 133
    goto :goto_0

    .line 134
    .line 135
    :cond_1
    const-string v0, "zh-Hant"

    .line 136
    return-object v0

    .line 137
    .line 138
    :cond_2
    :goto_0
    const-string v0, "zh-Hans"

    .line 139
    return-object v0

    .line 140
    :cond_3
    :goto_1
    return-object v3
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

.method public static final synthetic h(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->m:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

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

.method public static final synthetic i(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->i:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;

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

.method public static final synthetic j(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->f:Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;

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

.method public static final synthetic k(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->e:Lcom/trtc/uikit/livekit/common/LiveKitLogger;

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

.method public static final synthetic l(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

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
.end method

.method public static final synthetic m(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lio/trtc/tuikit/atomicxcore/api/gift/Gift;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->s(Lio/trtc/tuikit/atomicxcore/api/gift/Gift;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

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
.end method

.method public static final synthetic n(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->v()V

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

.method public static final synthetic o(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->w(I)V

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

.method private final r()V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/trtc/uikit/livekit/R$id;->gift_image_anim_view:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->f:Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;

    .line 11
    .line 12
    sget v0, Lcom/trtc/uikit/livekit/R$id;->gift_anim_view:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->g:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 21
    .line 22
    sget v0, Lcom/trtc/uikit/livekit/R$id;->heart_layout:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    check-cast v0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->h:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout;

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

.method public static final u(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lpd0/a;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->l:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->g(Lpd0/a;)V

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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->j:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->o:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->addGiftListener(Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;)V

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->n:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;->addLikeListener(Lio/trtc/tuikit/atomicxcore/api/live/LikeListener;)V

    .line 19
    :cond_1
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

.method public b(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "roomId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->j:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->getLanguage()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->setLanguage(Ljava/lang/String;)V

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->g:Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;->setRoomId(Ljava/lang/String;)V

    .line 27
    :cond_1
    return-void
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

.method public c()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->j:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 13
    .line 14
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LikeStore$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

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

.method public d()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->j:Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->o:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;->removeGiftListener(Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;)V

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->n:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;->removeLikeListener(Lio/trtc/tuikit/atomicxcore/api/live/LikeListener;)V

    .line 19
    :cond_1
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

.method public onDetachedFromWindow()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->l:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->h()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->m:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->h()V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->p:Lkotlinx/coroutines/m0;

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->onDetachedFromWindow()V

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

.method public final p()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$d;-><init>(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->l:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->e(Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/a;)V

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

.method public final q()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$e;-><init>(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->m:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->e(Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/a;)V

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

.method public final s(Lio/trtc/tuikit/atomicxcore/api/gift/Gift;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lpd0/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lpd0/a;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lpd0/a;->f(Lio/trtc/tuikit/atomicxcore/api/gift/Gift;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Lpd0/a;->g(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p3}, Lpd0/a;->h(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->shared:Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;->getLoginUserInfo()Lkotlinx/coroutines/flow/w;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getUserID()Ljava/lang/String;

    .line 40
    move-result-object v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v2, 0x0

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 46
    move-result v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lpd0/a;->e(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/gift/Gift;->getResourceURL()Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 57
    move-result v1

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->m:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->b(Lpd0/a;)V

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_1
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->l:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->b(Lpd0/a;)V

    .line 71
    .line 72
    :goto_1
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->i:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;->b(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lio/trtc/tuikit/atomicxcore/api/gift/Gift;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V

    .line 78
    :cond_2
    return-void
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
.end method

.method public final setListener(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;)V
    .locals 0
    .param p1    # Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->i:Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$c;

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

.method public final t(Ljava/lang/String;)V
    .locals 14
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "playUrl"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lpd0/a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lpd0/a;-><init>()V

    .line 11
    .line 12
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/gift/Gift;

    .line 13
    .line 14
    const/16 v12, 0xef

    .line 15
    const/4 v13, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const-wide/16 v9, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    move-object v6, p1

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v1 .. v13}, Lio/trtc/tuikit/atomicxcore/api/gift/Gift;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lpd0/a;->f(Lio/trtc/tuikit/atomicxcore/api/gift/Gift;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    move-result p1

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->l:Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;->g(Lpd0/a;)V

    .line 51
    return-void

    .line 52
    .line 53
    :cond_0
    new-instance p1, Lcom/trtc/uikit/livekit/component/gift/a;

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p0, v0}, Lcom/trtc/uikit/livekit/component/gift/a;-><init>(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;Lpd0/a;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 60
    return-void
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

.method public final v()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;->h:Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout;->a()V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final w(I)V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x1e

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 11
    move-result p1

    .line 12
    .line 13
    .line 14
    filled-new-array {p1}, [I

    .line 15
    move-result-object p1

    .line 16
    .line 17
    new-instance v0, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$f;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$f;-><init>([ILcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 24
    return-void
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
