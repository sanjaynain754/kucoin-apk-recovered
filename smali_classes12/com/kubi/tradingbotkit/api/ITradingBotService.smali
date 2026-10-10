.class public interface abstract Lcom/kubi/tradingbotkit/api/ITradingBotService;
.super Ljava/lang/Object;
.source "ITradingBotService.kt"

# interfaces
.implements Le40/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/tradingbotkit/api/ITradingBotService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u0000 22\u00020\u0001:\u00012J\u001c\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H&J\u0008\u0010\n\u001a\u00020\u0003H&J\u0008\u0010\u000b\u001a\u00020\u000cH&J\u0008\u0010\r\u001a\u00020\u000eH&J\u0008\u0010\u000f\u001a\u00020\u000eH&J\u0008\u0010\u0010\u001a\u00020\u0005H&J\u0008\u0010\u0011\u001a\u00020\u0005H&J\u0008\u0010\u0012\u001a\u00020\u0005H&J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0014H&J\u0008\u0010\u0015\u001a\u00020\u0007H&J\u0008\u0010\u0016\u001a\u00020\u0007H&J\u0008\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000cH&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H&J\u0008\u0010\u001c\u001a\u00020\u0003H&J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0008\u0010\u001f\u001a\u00020\u0003H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J\u0008\u0010#\u001a\u00020\u000cH&J\u0008\u0010$\u001a\u00020\u0003H&J\u001e\u0010%\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00030\'H&J\u0008\u0010(\u001a\u00020\u0003H&J\u0008\u0010)\u001a\u00020\u0003H&J\u0008\u0010*\u001a\u00020\u0003H&J\"\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010,j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`-H\u00a6@\u00a2\u0006\u0002\u0010.J\u0008\u0010/\u001a\u00020\u0003H&J\u0008\u00100\u001a\u000201H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00063\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/api/ITradingBotService;",
        "Lcom/kubi/tradingbotkit/api/ITradingBotAssetService;",
        "updateStrategyListCurSymbol",
        "",
        "curSymbol",
        "",
        "strategyListFragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "getStrategyListFragment",
        "type",
        "jumpToRobotH5",
        "tradingEntranceVisible",
        "",
        "getRobotSpotType",
        "",
        "getFuturesGridType",
        "getGridTradingTypeKey",
        "getContractGrid",
        "getSpotGrid",
        "getGridDialogOpenedKey",
        "Lcom/kubi/utils/storage/StorageId;",
        "getRobotSpotFragment",
        "getFuturesGridFragment",
        "dialogAutoShowHelperDismiss",
        "canShowPutValue",
        "newValue",
        "updateFragment",
        "tradeFragment",
        "autoShowHandlerRequest",
        "getFirDialog",
        "Lcom/kubi/resources/dialog/BaseDialogFragment;",
        "updateSelectedGrid",
        "registerObserver",
        "viewLifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "dialogAutoIsShowing",
        "autoShowDialog",
        "observerSelectGridType",
        "function",
        "Lkotlin/Function0;",
        "requestGridTradingList",
        "onDestroy",
        "jumpToRobotH5HistoryPage",
        "fetchSpotGridSymbols",
        "Ljava/util/HashSet;",
        "Lkotlin/collections/HashSet;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "jumpToWebBot",
        "getWidgetOfCopyTradingRobot",
        "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;",
        "Companion",
        "TradingBotKitApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lvx/b;
.end annotation


# static fields
.field public static final a:Lcom/kubi/tradingbotkit/api/ITradingBotService$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/tradingbotkit/api/ITradingBotService$Companion;->a:Lcom/kubi/tradingbotkit/api/ITradingBotService$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/kubi/tradingbotkit/api/ITradingBotService;->a:Lcom/kubi/tradingbotkit/api/ITradingBotService$Companion;

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
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Lcom/kubi/sdk/BaseFragment;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract b()V
.end method

.method public abstract c()V
.end method

.method public abstract d()I
.end method

.method public abstract f()Lcom/kubi/kucoin/home/v2/cards/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;)Lcom/kubi/sdk/BaseFragment;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract h()V
.end method

.method public abstract i()I
.end method

.method public abstract j(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract k()Z
.end method
