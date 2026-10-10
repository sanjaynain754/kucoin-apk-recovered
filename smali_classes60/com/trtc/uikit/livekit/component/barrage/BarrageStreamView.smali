.class public final Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;
.super Lcom/trtc/uikit/livekit/common/ui/BasicView;
.source "BarrageStreamView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$Companion;,
        Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0008\u0005*\u0001<\u0008\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002>?B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\'J\u0016\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020*J\u000e\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-J\u0008\u0010.\u001a\u00020!H\u0014J\u0008\u0010/\u001a\u00020!H\u0014J\u0008\u00100\u001a\u00020!H\u0014J!\u00101\u001a\u00020!2\u0012\u00102\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u001903\"\u00020\u0019H\u0016\u00a2\u0006\u0002\u00104J\u0014\u00105\u001a\u00020!2\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u001906J\u0006\u00107\u001a\u00020\u0008J\u0008\u00108\u001a\u00020!H\u0007J\u0006\u00109\u001a\u00020!J\u0008\u0010:\u001a\u00020!H\u0002R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u00020<X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010=\u00a8\u0006@"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;",
        "Lcom/trtc/uikit/livekit/common/ui/BasicView;",
        "Lcom/trtc/uikit/livekit/component/barrage/view/IBarrageDisplayView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "timestampOnLastUpdate",
        "",
        "smoothScroll",
        "",
        "updateViewTask",
        "Ljava/lang/Runnable;",
        "recyclerMsg",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "getRecyclerMsg",
        "()Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerMsg$delegate",
        "Lkotlin/Lazy;",
        "msgList",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;",
        "adapter",
        "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;",
        "barrageStore",
        "Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;",
        "liveAudienceStore",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;",
        "init",
        "",
        "roomId",
        "",
        "ownerId",
        "setItemTypeDelegate",
        "delegate",
        "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemTypeDelegate;",
        "setItemAdapter",
        "itemType",
        "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemAdapter;",
        "setOnMessageClickListener",
        "listener",
        "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$OnMessageClickListener;",
        "initStore",
        "addObserver",
        "removeObserver",
        "insertBarrages",
        "barrages",
        "",
        "([Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V",
        "onBarrageListChanged",
        "",
        "getBarrageCount",
        "notifyDataSetChanged",
        "scrollToLastPosition",
        "reportData",
        "liveAudienceListener",
        "com/trtc/uikit/livekit/component/barrage/BarrageStreamView$liveAudienceListener$1",
        "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$liveAudienceListener$1;",
        "Companion",
        "OnMessageClickListener",
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
        "SMAP\nBarrageStreamView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarrageStreamView.kt\ncom/trtc/uikit/livekit/component/barrage/BarrageStreamView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,186:1\n13472#2,2:187\n*S KotlinDebug\n*F\n+ 1 BarrageStreamView.kt\ncom/trtc/uikit/livekit/component/barrage/BarrageStreamView\n*L\n101#1:187,2\n*E\n"
    }
.end annotation


# static fields
.field public static final m:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public d:J

.field public e:Z

.field public final f:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->m:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$Companion;

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
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    const/4 p2, 0x1

    .line 5
    iput-boolean p2, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->e:Z

    .line 6
    new-instance p2, Lcom/trtc/uikit/livekit/component/barrage/c;

    invoke-direct {p2, p0}, Lcom/trtc/uikit/livekit/component/barrage/c;-><init>(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->f:Ljava/lang/Runnable;

    .line 7
    new-instance p2, Lcom/trtc/uikit/livekit/component/barrage/d;

    invoke-direct {p2, p0}, Lcom/trtc/uikit/livekit/component/barrage/d;-><init>(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->g:Lkotlin/Lazy;

    .line 8
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->h:Ljava/util/List;

    .line 9
    new-instance p3, Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;

    invoke-direct {p3, p2}, Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;-><init>(Ljava/util/List;)V

    iput-object p3, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->i:Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;

    .line 10
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lcom/trtc/uikit/livekit/R$layout;->livekit_barrage_view_display:I

    invoke-virtual {p2, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->getRecyclerMsg()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 12
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->getRecyclerMsg()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 13
    new-instance p2, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$b;

    invoke-direct {p2, p0, p1}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$b;-><init>(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->l:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$b;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic f(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->n(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)Landroidx/recyclerview/widget/RecyclerView;

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

.method public static synthetic g(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->q(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;I)V

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

.method private final getRecyclerMsg()Landroidx/recyclerview/widget/RecyclerView;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "getValue(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    return-object v0
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

.method public static synthetic h(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->s(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)V

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

.method public static final synthetic i(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->j:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

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

.method public static final n(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/trtc/uikit/livekit/R$id;->rv_msg:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    return-object p0
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

.method public static final q(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;I)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->e:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->getRecyclerMsg()Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->getRecyclerMsg()Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

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

.method public static final s(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->l()V

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
    new-instance v4, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$addObserver$1;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v4, p0, v0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$addObserver$1;-><init>(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;Lkotlin/coroutines/Continuation;)V

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
    .line 25
    invoke-virtual {p0, v0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->setSubscribeStateJob(Lkotlinx/coroutines/x1;)V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->l:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$b;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->addLiveAudienceListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;)V

    .line 35
    :cond_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public c()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->j:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 13
    .line 14
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iput-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

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
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getSubscribeStateJob()Lkotlinx/coroutines/x1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->l:Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$b;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;->removeLiveAudienceListener(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;)V

    .line 21
    :cond_1
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

.method public final getBarrageCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->j:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->getBarrageState()Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageState;->getMessageList()Lkotlinx/coroutines/flow/w;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    move-result v0

    .line 29
    return v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0
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

.method public final j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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
    const-string v0, "ownerId"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->setRoomId(Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->i:Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;

    .line 19
    .line 20
    new-instance v0, Lcd0/b;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-string v2, "getContext(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, p2}, Lcd0/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 33
    const/4 p2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2, v0}, Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;->i(ILcd0/a;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->o()V

    .line 40
    return-void
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

.method public varargs k([Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V
    .locals 4
    .param p1    # [Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "barrages"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    :goto_0
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    iget-object v3, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->j:Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v2}, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;->appendLocalTip(Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V

    .line 19
    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void
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

.method public final l()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->d:J

    .line 7
    .line 8
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->i:Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->p()V

    .line 15
    return-void
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

.method public final m(Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "barrages"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    move-result v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->h:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    move-result v1

    .line 16
    sub-int/2addr v0, v1

    .line 17
    .line 18
    const/16 v1, 0x64

    .line 19
    .line 20
    if-ge v0, v1, :cond_0

    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    .line 25
    :goto_0
    iput-boolean v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->e:Z

    .line 26
    .line 27
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->h:Ljava/util/List;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->h:Ljava/util/List;

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 36
    .line 37
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->f:Ljava/lang/Runnable;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    move-result-wide v0

    .line 45
    .line 46
    iget-wide v2, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->d:J

    .line 47
    sub-long/2addr v0, v2

    .line 48
    .line 49
    const-wide/16 v2, 0xfa

    .line 50
    .line 51
    cmp-long p1, v0, v2

    .line 52
    .line 53
    if-ltz p1, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->l()V

    .line 57
    return-void

    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->f:Ljava/lang/Runnable;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 63
    return-void
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

.method public final o()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/common/ui/BasicView;->getRoomId()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    const-string v3, "voice_"

    .line 19
    const/4 v4, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v3, v4, v1, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    const v0, 0x2ea24

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_0
    const v0, 0x2e63d

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v0}, Lvc0/e;->a(I)V

    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public final p()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->getRecyclerMsg()Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "null cannot be cast to non-null type com.trtc.uikit.livekit.component.barrage.view.CustomRecyclerView"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast v0, Lcom/trtc/uikit/livekit/component/barrage/view/CustomRecyclerView;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/barrage/view/CustomRecyclerView;->d()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->i:Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;->getItemCount()I

    .line 24
    move-result v0

    .line 25
    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 31
    move-result v0

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->getRecyclerMsg()Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    new-instance v2, Lcom/trtc/uikit/livekit/component/barrage/e;

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, p0, v0}, Lcom/trtc/uikit/livekit/component/barrage/e;-><init>(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 44
    return-void
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
.end method

.method public final r(ILcd0/a;)V
    .locals 1
    .param p2    # Lcd0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "adapter"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->i:Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;->i(ILcd0/a;)V

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

.method public final setItemTypeDelegate(Lcd0/c;)V
    .locals 1
    .param p1    # Lcd0/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "delegate"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->i:Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;->j(Lcd0/c;)V

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
.end method

.method public final setOnMessageClickListener(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$a;)V
    .locals 1
    .param p1    # Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;->i:Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;->setOnMessageClickListener(Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$a;)V

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
.end method
