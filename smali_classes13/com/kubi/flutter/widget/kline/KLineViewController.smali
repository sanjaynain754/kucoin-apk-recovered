.class public final Lcom/kubi/flutter/widget/kline/KLineViewController;
.super Ljava/lang/Object;
.source "KLineViewController.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;,
        Lcom/kubi/flutter/widget/kline/KLineViewController$a;,
        Lcom/kubi/flutter/widget/kline/KLineViewController$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 d2\u00020\u0001:\u0003defB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ3\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u0010\'J\u0018\u0010(\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020&J\u0014\u0010)\u001a\u00020\u001e2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+J\u0014\u0010-\u001a\u00020\u001e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020/0+J\u000e\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u001e2\u0006\u0010#\u001a\u000204J\u000e\u00105\u001a\u00020\u001e2\u0006\u0010#\u001a\u000206J\u000e\u00107\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020&J\u000e\u0010:\u001a\u00020\u001e2\u0006\u00109\u001a\u00020&J\u0016\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020 H\u0082@\u00a2\u0006\u0002\u0010=J\u0008\u0010>\u001a\u00020\u001eH\u0002J\u0008\u0010?\u001a\u00020\u001eH\u0007J\u0008\u0010@\u001a\u00020\u001eH\u0002J\u0008\u0010A\u001a\u00020\u001eH\u0007J\u0008\u0010B\u001a\u00020\u001eH\u0007J\u0008\u0010C\u001a\u00020\u001eH\u0007J\u0010\u0010D\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020FH\u0002J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0082@\u00a2\u0006\u0002\u0010KJ\u0016\u0010L\u001a\u00020H2\u0006\u0010M\u001a\u00020NH\u0082@\u00a2\u0006\u0002\u0010OJ\u0016\u0010P\u001a\u00020H2\u0006\u0010Q\u001a\u00020RH\u0082@\u00a2\u0006\u0002\u0010SJ\u0018\u0010T\u001a\u00020H2\u0008\u0010U\u001a\u0004\u0018\u00010VH\u0082@\u00a2\u0006\u0002\u0010WJ\u0018\u0010X\u001a\u00020H2\u0008\u0010Y\u001a\u0004\u0018\u00010ZH\u0082@\u00a2\u0006\u0002\u0010[J\u0018\u0010\\\u001a\u00020H2\u0008\u0010]\u001a\u0004\u0018\u00010^H\u0082@\u00a2\u0006\u0002\u0010_J\u0018\u0010`\u001a\u00020H2\u0008\u0010a\u001a\u0004\u0018\u00010bH\u0082@\u00a2\u0006\u0002\u0010cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006g"
    }
    d2 = {
        "Lcom/kubi/flutter/widget/kline/KLineViewController;",
        "",
        "initState",
        "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;",
        "container",
        "Lcom/kubi/flutter/widget/kline/IKLineContainer;",
        "interactor",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;",
        "<init>",
        "(Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;Lcom/kubi/flutter/widget/kline/IKLineContainer;Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;)V",
        "state",
        "Lcom/kubi/flutter/widget/kline/KLineViewController$RunningState;",
        "channel",
        "Lcom/kubi/flutter/widget/kline/IKLineChannel;",
        "controllerScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "dataSessionFactory",
        "Lcom/kubi/flutter/widget/kline/KLineDataSession$Factory;",
        "dataSession",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lcom/kubi/flutter/widget/kline/KLineDataSession;",
        "isInited",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "viewState",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "selectPadConfig",
        "Lcom/kubi/flutter/proto/kline/SelectPadConfig;",
        "volumeConfig",
        "Lcom/kubi/flutter/proto/kline/VolumeConfig;",
        "changeSymbol",
        "",
        "symbol",
        "",
        "precisionValue",
        "",
        "type",
        "Lcom/kubi/flutter/widget/kline/KLineType;",
        "isLine",
        "",
        "(Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/Boolean;)V",
        "changeType",
        "changeMainTypes",
        "mainIndexTypes",
        "",
        "Lcom/kubi/flutter/proto/kline/MainIndexType;",
        "changeSubTypes",
        "subIndexTypes",
        "Lcom/kubi/flutter/proto/kline/SubIndexType;",
        "changeToolBar",
        "toolBarType",
        "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;",
        "initDrawTool",
        "Lcom/kubi/flutter/proto/kline/PaintFromType;",
        "deleteAllDraw",
        "Lcom/kubi/flutter/proto/kline/AlertClickType;",
        "changeSelectPadConfig",
        "changeHistoryShow",
        "isChecked",
        "changeActiveShow",
        "openDataPush",
        "from",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "closeDataPush",
        "onInit",
        "reload",
        "onShow",
        "onHide",
        "onDestroy",
        "onUpdateSetupConfig",
        "config",
        "Lcom/kubi/flutter/proto/kline/ChartSetupConfig;",
        "handleEventMessage",
        "Lcom/kubi/flutter/proto/kline/Response;",
        "eventMessage",
        "Lcom/kubi/flutter/proto/kline/EventMessage;",
        "(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onLoadMore",
        "loadMoreEvent",
        "Lcom/kubi/flutter/proto/kline/LoadMoreEvent;",
        "(Lcom/kubi/flutter/proto/kline/LoadMoreEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onJump",
        "jumpEvent",
        "Lcom/kubi/flutter/proto/kline/JumpOrderEvent;",
        "(Lcom/kubi/flutter/proto/kline/JumpOrderEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onToolBarMode",
        "toolBarMode",
        "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;",
        "(Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onConfirmAlertEvent",
        "confirmAlert",
        "Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;",
        "(Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onPaintGuide",
        "paintGuide",
        "Lcom/kubi/flutter/proto/kline/PaintGuideEvent;",
        "(Lcom/kubi/flutter/proto/kline/PaintGuideEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onToastEvent",
        "toast",
        "Lcom/kubi/flutter/proto/kline/ToastEvent;",
        "(Lcom/kubi/flutter/proto/kline/ToastEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "InitParam",
        "RunningState",
        "LKLineWidget_googleRelease"
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
        "SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$Companion\n+ 4 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n+ 5 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,627:1\n47#2,4:628\n85#3:632\n85#3:633\n87#3:634\n87#3:635\n85#3:636\n85#3:637\n85#3:638\n85#3:639\n85#3:640\n9#4:641\n45#5,4:642\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController\n*L\n97#1:628,4\n229#1:632\n230#1:633\n231#1:634\n232#1:635\n273#1:636\n360#1:637\n361#1:638\n375#1:639\n392#1:640\n432#1:641\n541#1:642,4\n*E\n"
    }
.end annotation


# static fields
.field public static final l:Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/kubi/flutter/widget/kline/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/flutter/widget/kline/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/kubi/flutter/widget/kline/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlinx/coroutines/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/kubi/flutter/widget/kline/KLineDataSession$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/kubi/flutter/widget/kline/KLineDataSession;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Lcom/kubi/flutter/proto/kline/SelectPadConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Lcom/kubi/flutter/proto/kline/VolumeConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/flutter/widget/kline/KLineViewController;->l:Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;

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
.end method

.method public constructor <init>(Lcom/kubi/flutter/widget/kline/KLineViewController$a;Lcom/kubi/flutter/widget/kline/b;Lcom/kubi/flutter/widget/kline/c;)V
    .locals 3
    .param p1    # Lcom/kubi/flutter/widget/kline/KLineViewController$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/flutter/widget/kline/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/flutter/widget/kline/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "initState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "container"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "interactor"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    iput-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->a:Lcom/kubi/flutter/widget/kline/b;

    .line 21
    .line 22
    iput-object p3, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->b:Lcom/kubi/flutter/widget/kline/c;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$a;->g()Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 29
    .line 30
    .line 31
    invoke-interface {p2}, Lcom/kubi/flutter/widget/kline/b;->getChannel()Lcom/kubi/flutter/widget/kline/a;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->d:Lcom/kubi/flutter/widget/kline/a;

    .line 35
    .line 36
    new-instance v0, Lkotlinx/coroutines/l0;

    .line 37
    .line 38
    const-string v1, "kline_controller_scope"

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1}, Lkotlinx/coroutines/l0;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    sget-object v1, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 52
    .line 53
    new-instance v2, Lcom/kubi/flutter/widget/kline/KLineViewController$f;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$f;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 67
    .line 68
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineDataSession$a;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, p2, p3}, Lcom/kubi/flutter/widget/kline/KLineDataSession$a;-><init>(Lcom/kubi/flutter/widget/kline/b;Lcom/kubi/flutter/widget/kline/c;)V

    .line 72
    .line 73
    iput-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->f:Lcom/kubi/flutter/widget/kline/KLineDataSession$a;

    .line 74
    .line 75
    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 76
    const/4 p3, 0x0

    .line 77
    .line 78
    .line 79
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 80
    .line 81
    iput-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 82
    .line 83
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    const/4 p3, 0x0

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 88
    .line 89
    iput-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 90
    .line 91
    new-instance p2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 92
    .line 93
    .line 94
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 95
    .line 96
    iput-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$a;->c()Lcom/kubi/flutter/proto/kline/SelectPadConfig;

    .line 100
    move-result-object p2

    .line 101
    .line 102
    iput-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->j:Lcom/kubi/flutter/proto/kline/SelectPadConfig;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$a;->f()Lcom/kubi/flutter/proto/kline/VolumeConfig;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    iput-object p1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->k:Lcom/kubi/flutter/proto/kline/VolumeConfig;

    .line 109
    return-void
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
.end method

.method public static final synthetic a(Lcom/kubi/flutter/widget/kline/KLineViewController;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineViewController;->B()V

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
.end method

.method public static final synthetic b(Lcom/kubi/flutter/widget/kline/KLineViewController;)Lcom/kubi/flutter/widget/kline/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->d:Lcom/kubi/flutter/widget/kline/a;

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
.end method

.method public static final synthetic c(Lcom/kubi/flutter/widget/kline/KLineViewController;)Lcom/kubi/flutter/widget/kline/b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->a:Lcom/kubi/flutter/widget/kline/b;

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
.end method

.method public static final synthetic d(Lcom/kubi/flutter/widget/kline/KLineViewController;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->g:Ljava/util/concurrent/atomic/AtomicReference;

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
.end method

.method public static final synthetic e(Lcom/kubi/flutter/widget/kline/KLineViewController;)Lcom/kubi/flutter/proto/kline/SelectPadConfig;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->j:Lcom/kubi/flutter/proto/kline/SelectPadConfig;

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
.end method

.method public static final synthetic f(Lcom/kubi/flutter/widget/kline/KLineViewController;)Lcom/kubi/flutter/widget/kline/KLineViewController$b;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

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
.end method

.method public static final synthetic g(Lcom/kubi/flutter/widget/kline/KLineViewController;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->i:Ljava/util/concurrent/atomic/AtomicInteger;

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
.end method

.method public static final synthetic h(Lcom/kubi/flutter/widget/kline/KLineViewController;)Lcom/kubi/flutter/proto/kline/VolumeConfig;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->k:Lcom/kubi/flutter/proto/kline/VolumeConfig;

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
.end method

.method public static final synthetic i(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->D(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic j(Lcom/kubi/flutter/widget/kline/KLineViewController;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

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
.end method

.method public static final synthetic k(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->F(Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic l(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/JumpOrderEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->J(Lcom/kubi/flutter/proto/kline/JumpOrderEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic m(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/LoadMoreEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->K(Lcom/kubi/flutter/proto/kline/LoadMoreEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic n(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/PaintGuideEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->L(Lcom/kubi/flutter/proto/kline/PaintGuideEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic o(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/ToastEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->N(Lcom/kubi/flutter/proto/kline/ToastEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic p(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->O(Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic q(Lcom/kubi/flutter/widget/kline/KLineViewController;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->P(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic r(Lcom/kubi/flutter/widget/kline/KLineViewController;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineViewController;->Q()V

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
.end method

.method public static synthetic y(Lcom/kubi/flutter/widget/kline/KLineViewController;Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/Boolean;ILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p6, p5, 0x4

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p6, :cond_0

    .line 6
    move-object p3, v0

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    move-object p4, v0

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/flutter/widget/kline/KLineViewController;->x(Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/Boolean;)V

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
.end method


# virtual methods
.method public final A(Lcom/kubi/flutter/widget/kline/KLineType;Z)V
    .locals 8
    .param p1    # Lcom/kubi/flutter/widget/kline/KLineType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->k()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->l()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-ne v0, p2, :cond_0

    .line 26
    return-void

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->l()Z

    .line 32
    move-result v0

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-static {p2, v0}, Lcom/kubi/flutter/widget/kline/e;->a(ZLjava/lang/Boolean;)Lcom/kubi/flutter/proto/kline/SwitchType;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->u(Lcom/kubi/flutter/widget/kline/KLineType;)V

    .line 46
    .line 47
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->m(Z)V

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    const-string v2, "changeType "

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const/16 v2, 0x5b

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const/16 p2, 0x5d

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    const-string v1, "KLineViewController"

    .line 83
    .line 84
    .line 85
    invoke-static {v1, p2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 88
    .line 89
    new-instance v5, Lcom/kubi/flutter/widget/kline/KLineViewController$changeType$1;

    .line 90
    const/4 p2, 0x0

    .line 91
    .line 92
    .line 93
    invoke-direct {v5, p0, p1, v0, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController$changeType$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/widget/kline/KLineType;Lcom/kubi/flutter/proto/kline/SwitchType;Lkotlin/coroutines/Continuation;)V

    .line 94
    const/4 v6, 0x3

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v3, 0x0

    .line 97
    const/4 v4, 0x0

    .line 98
    .line 99
    .line 100
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 101
    return-void
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
.end method

.method public final B()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    check-cast v0, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->m()V

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
.end method

.method public final C(Lcom/kubi/flutter/proto/kline/AlertClickType;)V
    .locals 7
    .param p1    # Lcom/kubi/flutter/proto/kline/AlertClickType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    new-instance v4, Lcom/kubi/flutter/widget/kline/KLineViewController$deleteAllDraw$1;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$deleteAllDraw$1;-><init>(Lcom/kubi/flutter/proto/kline/AlertClickType;Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final D(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/EventMessage;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlinx/coroutines/m0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineViewController$handleEventMessage$2;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p1, p0, v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$handleEventMessage$2;-><init>(Lcom/kubi/flutter/proto/kline/EventMessage;Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
.end method

.method public final E(Lcom/kubi/flutter/proto/kline/PaintFromType;)V
    .locals 7
    .param p1    # Lcom/kubi/flutter/proto/kline/PaintFromType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    new-instance v4, Lcom/kubi/flutter/widget/kline/KLineViewController$initDrawTool$1;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$initDrawTool$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/PaintFromType;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final F(Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineViewController$onConfirmAlertEvent$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$onConfirmAlertEvent$2;-><init>(Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final G()V
    .locals 3
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    const/4 v1, 0x3

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v1, "onDestroy "

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->j()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->k()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->a()Ljava/lang/String;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    const-string v1, "KLineViewController"

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    :try_start_0
    sget-object v0, Lcom/kubi/flutter/widget/kline/o;->a:Lcom/kubi/flutter/widget/kline/o;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->j()Ljava/lang/String;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/widget/kline/o;->d(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineViewController;->B()V

    .line 79
    .line 80
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 81
    const/4 v1, 0x1

    .line 82
    const/4 v2, 0x0

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/n0;->e(Lkotlinx/coroutines/m0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 86
    .line 87
    sget-object v0, Lcom/kubi/flutter/widget/kline/n;->a:Lcom/kubi/flutter/widget/kline/n;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/n;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->a:Lcom/kubi/flutter/widget/kline/b;

    .line 93
    .line 94
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 95
    .line 96
    .line 97
    invoke-interface {v0, v1}, Lcom/kubi/flutter/widget/kline/b;->b(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 98
    return-void

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto :goto_0

    .line 101
    :catch_0
    move-exception v0

    .line 102
    .line 103
    :try_start_1
    const-string v1, "controllerScope cannel error"

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 107
    move-result v2

    .line 108
    .line 109
    if-nez v2, :cond_0

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v1}, Log/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    :cond_0
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->a:Lcom/kubi/flutter/widget/kline/b;

    .line 115
    .line 116
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v1}, Lcom/kubi/flutter/widget/kline/b;->b(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 120
    return-void

    .line 121
    .line 122
    :goto_0
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->a:Lcom/kubi/flutter/widget/kline/b;

    .line 123
    .line 124
    sget-object v2, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 125
    .line 126
    .line 127
    invoke-interface {v1, v2}, Lcom/kubi/flutter/widget/kline/b;->b(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 128
    throw v0
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
.end method

.method public final H()V
    .locals 2
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    const/4 v1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/KLineViewController;->B()V

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
.end method

.method public final I()V
    .locals 8
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->a:Lcom/kubi/flutter/widget/kline/b;

    .line 7
    .line 8
    new-instance v3, Lcom/kubi/flutter/widget/kline/KLineViewController$c;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3, p0, v0, v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$c;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;J)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v2, v3}, Lcom/kubi/flutter/widget/kline/b;->e(Lcom/kubi/flutter/widget/kline/b$a;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->d:Lcom/kubi/flutter/widget/kline/a;

    .line 17
    .line 18
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineViewController$d;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/kubi/flutter/widget/kline/KLineViewController$d;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/kubi/flutter/widget/kline/a;->d(Lcom/kubi/flutter/widget/kline/a$a;)V

    .line 25
    .line 26
    sget-object v0, Lcom/kubi/flutter/widget/kline/o;->a:Lcom/kubi/flutter/widget/kline/o;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->j()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    new-instance v2, Lcom/kubi/flutter/widget/kline/KLineViewController$e;

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, p0}, Lcom/kubi/flutter/widget/kline/KLineViewController$e;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Lcom/kubi/flutter/widget/kline/o;->a(Ljava/lang/String;Lcom/kubi/flutter/widget/kline/o$a;)V

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    const-string v1, "onInit "

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->j()Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const/16 v1, 0x20

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->k()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->a()Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    const-string v1, "KLineViewController"

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 101
    .line 102
    new-instance v5, Lcom/kubi/flutter/widget/kline/KLineViewController$onInit$4;

    .line 103
    const/4 v0, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct {v5, p0, v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$onInit$4;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 107
    const/4 v6, 0x3

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v3, 0x0

    .line 110
    const/4 v4, 0x0

    .line 111
    .line 112
    .line 113
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 114
    return-void
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
.end method

.method public final J(Lcom/kubi/flutter/proto/kline/JumpOrderEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/JumpOrderEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineViewController$onJump$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, p1, v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$onJump$2;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/JumpOrderEvent;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final K(Lcom/kubi/flutter/proto/kline/LoadMoreEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/LoadMoreEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineViewController$onLoadMore$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, p0, v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$onLoadMore$2;-><init>(Lcom/kubi/flutter/proto/kline/LoadMoreEvent;Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final L(Lcom/kubi/flutter/proto/kline/PaintGuideEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/PaintGuideEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineViewController$onPaintGuide$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$onPaintGuide$2;-><init>(Lcom/kubi/flutter/proto/kline/PaintGuideEvent;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final M()V
    .locals 7
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 17
    .line 18
    new-instance v4, Lcom/kubi/flutter/widget/kline/KLineViewController$onShow$1;

    .line 19
    const/4 v0, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v4, p0, v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$onShow$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 23
    const/4 v5, 0x3

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 30
    :cond_0
    return-void
    .line 31
    .line 32
    .line 33
.end method

.method public final N(Lcom/kubi/flutter/proto/kline/ToastEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/ToastEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineViewController$onToastEvent$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$onToastEvent$2;-><init>(Lcom/kubi/flutter/proto/kline/ToastEvent;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final O(Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/flutter/widget/kline/KLineViewController$onToolBarMode$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Lcom/kubi/flutter/widget/kline/KLineViewController$onToolBarMode$2;-><init>(Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final P(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->label:I

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
    iput v1, v0, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->label:I

    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->label:I

    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    iget-object p1, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 47
    .line 48
    iget-object p1, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    throw p1

    .line 64
    .line 65
    :cond_2
    iget-boolean p1, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->Z$0:Z

    .line 66
    .line 67
    iget-object v1, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 70
    .line 71
    iget-object v3, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 77
    move p2, p1

    .line 78
    move-object p1, v3

    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    iget-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 94
    return-object p1

    .line 95
    .line 96
    :cond_4
    iget-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->f:Lcom/kubi/flutter/widget/kline/KLineDataSession$a;

    .line 97
    .line 98
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->v()Lcom/kubi/flutter/widget/kline/c$a;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v1}, Lcom/kubi/flutter/widget/kline/KLineDataSession$a;->a(Lcom/kubi/flutter/widget/kline/c$a;)Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    iget-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 109
    const/4 v4, 0x0

    .line 110
    .line 111
    .line 112
    invoke-static {p2, v4, v1}, Landroidx/camera/view/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    move-result p2

    .line 114
    .line 115
    if-eqz p2, :cond_7

    .line 116
    .line 117
    sget-object p2, Lcom/kubi/flutter/widget/kline/utils/g;->a:Lcom/kubi/flutter/widget/kline/utils/g;

    .line 118
    .line 119
    new-instance v4, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    const-string v6, "openDataPush,from="

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v6, ",symbol="

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    iget-object v6, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->j()Ljava/lang/String;

    .line 141
    move-result-object v6

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v6, ",type="

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    iget-object v6, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->k()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 155
    move-result-object v6

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 159
    move-result-object v6

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v6, ",showHistory="

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    iget-object v6, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->h()Z

    .line 173
    move-result v6

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v6, ",enableHistory="

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    iget-object v6, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->c()Z

    .line 187
    move-result v6

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    move-result-object v4

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2, v4}, Lcom/kubi/flutter/widget/kline/utils/g;->a(Ljava/lang/String;)V

    .line 198
    .line 199
    const-string p2, "show"

    .line 200
    .line 201
    .line 202
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    move-result p2

    .line 204
    .line 205
    .line 206
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    move-result-object v4

    .line 208
    .line 209
    iput-object v4, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->L$0:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v1, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->L$1:Ljava/lang/Object;

    .line 212
    .line 213
    iput-boolean p2, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->Z$0:Z

    .line 214
    .line 215
    iput v3, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->label:I

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, p2, p1, v5}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->l(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 219
    move-result-object v3

    .line 220
    .line 221
    if-ne v3, v0, :cond_5

    .line 222
    goto :goto_3

    .line 223
    .line 224
    :cond_5
    :goto_2
    iget-object v3, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->w()Lcom/kubi/flutter/widget/kline/c$b;

    .line 228
    move-result-object v3

    .line 229
    .line 230
    .line 231
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    move-result-object p1

    .line 233
    .line 234
    iput-object p1, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->L$0:Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    move-result-object p1

    .line 239
    .line 240
    iput-object p1, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->L$1:Ljava/lang/Object;

    .line 241
    .line 242
    iput-boolean p2, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->Z$0:Z

    .line 243
    .line 244
    iput v2, v5, Lcom/kubi/flutter/widget/kline/KLineViewController$openDataPush$1;->label:I

    .line 245
    move-object v2, v3

    .line 246
    .line 247
    const-wide/16 v3, 0x0

    .line 248
    const/4 v6, 0x2

    .line 249
    const/4 v7, 0x0

    .line 250
    .line 251
    .line 252
    invoke-static/range {v1 .. v7}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->q(Lcom/kubi/flutter/widget/kline/KLineDataSession;Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 253
    move-result-object p1

    .line 254
    .line 255
    if-ne p1, v0, :cond_6

    .line 256
    :goto_3
    return-object v0

    .line 257
    .line 258
    :cond_6
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 259
    return-object p1

    .line 260
    .line 261
    :cond_7
    const-string p1, "openDataPush 2 times -- KLineViewController"

    .line 262
    .line 263
    .line 264
    invoke-static {p1}, Lro/b;->i(Ljava/lang/String;)V

    .line 265
    .line 266
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 267
    return-object p1
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
.end method

.method public final Q()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lcom/kubi/flutter/widget/kline/KLineViewController$reload$1;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$reload$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final s(Z)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->g()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->q(Z)V

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    const-string v1, "changeActiveShow isChecked:"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    const-string v1, "KLineViewController"

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 39
    .line 40
    new-instance v5, Lcom/kubi/flutter/widget/kline/KLineViewController$changeActiveShow$1;

    .line 41
    const/4 v0, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct {v5, p0, p1, v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$changeActiveShow$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;ZLkotlin/coroutines/Continuation;)V

    .line 45
    const/4 v6, 0x3

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 52
    return-void
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
.end method

.method public final t(Z)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->h()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->r(Z)V

    .line 15
    .line 16
    const-string v0, "KLineViewController"

    .line 17
    .line 18
    const-string v1, "changeHistoryShow"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 24
    .line 25
    new-instance v5, Lcom/kubi/flutter/widget/kline/KLineViewController$changeHistoryShow$1;

    .line 26
    const/4 v0, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v5, p0, p1, v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$changeHistoryShow$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;ZLkotlin/coroutines/Continuation;)V

    .line 30
    const/4 v6, 0x3

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 37
    return-void
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
.end method

.method public final u(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/flutter/proto/kline/MainIndexType;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "mainIndexTypes"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/flutter/widget/kline/KLineViewController;->l:Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->d()Ljava/util/List;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;->access$isNotChanged(Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;Ljava/util/List;Ljava/util/List;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->n(Ljava/util/List;)V

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    const-string v1, "changeMainTypes "

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    const-string v0, "KLineViewController"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 50
    .line 51
    new-instance v4, Lcom/kubi/flutter/widget/kline/KLineViewController$changeMainTypes$1;

    .line 52
    const/4 p1, 0x0

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, p0, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$changeMainTypes$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 56
    const/4 v5, 0x3

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    .line 61
    .line 62
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final v(Lcom/kubi/flutter/proto/kline/SelectPadConfig;)V
    .locals 9
    .param p1    # Lcom/kubi/flutter/proto/kline/SelectPadConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "selectPadConfig"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->f()Lcom/kubi/flutter/proto/kline/SelectPadConfig;

    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/SelectPadConfig;->getViewMode()Lcom/kubi/flutter/proto/kline/SelectPadViewMode;

    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v1

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/SelectPadConfig;->getViewMode()Lcom/kubi/flutter/proto/kline/SelectPadViewMode;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->f()Lcom/kubi/flutter/proto/kline/SelectPadConfig;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/SelectPadConfig;->getItemTypesList()Ljava/util/List;

    .line 42
    move-result-object v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v1

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/SelectPadConfig;->getItemTypesList()Ljava/util/List;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    move-result v0

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    return-void

    .line 56
    .line 57
    :cond_2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->p(Lcom/kubi/flutter/proto/kline/SelectPadConfig;)V

    .line 61
    .line 62
    const-string v0, "KLineViewController"

    .line 63
    .line 64
    const-string v2, "changeSelectPadConfig"

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    iget-object v3, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 70
    .line 71
    new-instance v6, Lcom/kubi/flutter/widget/kline/KLineViewController$changeSelectPadConfig$1;

    .line 72
    .line 73
    .line 74
    invoke-direct {v6, p0, p1, v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$changeSelectPadConfig$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/SelectPadConfig;Lkotlin/coroutines/Continuation;)V

    .line 75
    const/4 v7, 0x3

    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 82
    return-void
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
.end method

.method public final w(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/flutter/proto/kline/SubIndexType;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "subIndexTypes"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/flutter/widget/kline/KLineViewController;->l:Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->i()Ljava/util/List;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;->access$isNotChanged(Lcom/kubi/flutter/widget/kline/KLineViewController$Companion;Ljava/util/List;Ljava/util/List;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->s(Ljava/util/List;)V

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    const-string v1, "changeSubTypes "

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    const-string v0, "KLineViewController"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    iget-object v1, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 50
    .line 51
    new-instance v4, Lcom/kubi/flutter/widget/kline/KLineViewController$changeSubTypes$1;

    .line 52
    const/4 p1, 0x0

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, p0, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$changeSubTypes$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lkotlin/coroutines/Continuation;)V

    .line 56
    const/4 v5, 0x3

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    .line 61
    .line 62
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final x(Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/Boolean;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/flutter/widget/kline/KLineType;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->j()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->e()I

    .line 23
    move-result v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->k()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz p3, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->l()Z

    .line 57
    move-result v0

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    if-eqz p4, :cond_1

    .line 64
    .line 65
    .line 66
    invoke-static {v0, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v0

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    :cond_1
    return-void

    .line 71
    .line 72
    :cond_2
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->t(Ljava/lang/String;)V

    .line 76
    .line 77
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->o(I)V

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    const-string v1, "changeSymbol "

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const/16 p1, 0x5b

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const/16 p1, 0x5d

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    const-string p2, "KLineViewController"

    .line 113
    .line 114
    .line 115
    invoke-static {p2, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    if-eqz p4, :cond_3

    .line 118
    .line 119
    .line 120
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    move-result p1

    .line 122
    .line 123
    iget-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->l()Z

    .line 127
    move-result p2

    .line 128
    .line 129
    .line 130
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    move-result-object p2

    .line 132
    .line 133
    .line 134
    invoke-static {p1, p2}, Lcom/kubi/flutter/widget/kline/e;->a(ZLjava/lang/Boolean;)Lcom/kubi/flutter/proto/kline/SwitchType;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    if-nez p1, :cond_4

    .line 138
    .line 139
    :cond_3
    sget-object p1, Lcom/kubi/flutter/proto/kline/SwitchType;->NO_CHANGE:Lcom/kubi/flutter/proto/kline/SwitchType;

    .line 140
    .line 141
    :cond_4
    if-eqz p3, :cond_5

    .line 142
    .line 143
    iget-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, p3}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->u(Lcom/kubi/flutter/widget/kline/KLineType;)V

    .line 147
    .line 148
    :cond_5
    if-eqz p4, :cond_6

    .line 149
    .line 150
    iget-object p2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->c:Lcom/kubi/flutter/widget/kline/KLineViewController$b;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    move-result p3

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, p3}, Lcom/kubi/flutter/widget/kline/KLineViewController$b;->m(Z)V

    .line 158
    .line 159
    :cond_6
    iget-object v0, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 160
    .line 161
    new-instance v3, Lcom/kubi/flutter/widget/kline/KLineViewController$changeSymbol$1;

    .line 162
    const/4 p2, 0x0

    .line 163
    .line 164
    .line 165
    invoke-direct {v3, p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController$changeSymbol$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/SwitchType;Lkotlin/coroutines/Continuation;)V

    .line 166
    const/4 v4, 0x3

    .line 167
    const/4 v5, 0x0

    .line 168
    const/4 v1, 0x0

    .line 169
    const/4 v2, 0x0

    .line 170
    .line 171
    .line 172
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 173
    return-void
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
.end method

.method public final z(Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;)V
    .locals 8
    .param p1    # Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "toolBarType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "changeToolBar "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v1, "KLineViewController"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    iget-object v2, p0, Lcom/kubi/flutter/widget/kline/KLineViewController;->e:Lkotlinx/coroutines/m0;

    .line 30
    .line 31
    new-instance v5, Lcom/kubi/flutter/widget/kline/KLineViewController$changeToolBar$1;

    .line 32
    const/4 v0, 0x0

    .line 33
    .line 34
    .line 35
    invoke-direct {v5, p0, p1, v0}, Lcom/kubi/flutter/widget/kline/KLineViewController$changeToolBar$1;-><init>(Lcom/kubi/flutter/widget/kline/KLineViewController;Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;Lkotlin/coroutines/Continuation;)V

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 43
    return-void
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
.end method
