.class public final Lee/c;
.super Ljava/lang/Object;
.source "TradeCoreService.kt"

# interfaces
.implements Lcom/kubi/trade/core/biz/api/ITradeCoreService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0012\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00120\u001cH\u0017J\u0008\u0010\u001d\u001a\u00020\u001eH\u0016J.\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010%H\u0016J\u001e\u0010&\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"H\u0016J\u0012\u0010\'\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0008\u0010(\u001a\u00020\u000fH\u0016J\u0008\u0010)\u001a\u00020\u000fH\u0016J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u000c2\u0006\u0010.\u001a\u00020,H\u0016J,\u0010/\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020201002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000fH\u0016J$\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\"H\u0016J\u0018\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006<"
    }
    d2 = {
        "Lcom/kubi/core/service/TradeCoreService;",
        "Lcom/kubi/trade/core/biz/api/ITradeCoreService;",
        "<init>",
        "()V",
        "marketApi",
        "Lcom/kubi/core/spot/api/MarketApi;",
        "kotlin.jvm.PlatformType",
        "getMarketApi",
        "()Lcom/kubi/core/spot/api/MarketApi;",
        "marketApi$delegate",
        "Lkotlin/Lazy;",
        "isUtaMode",
        "",
        "isMaintenance",
        "symbol",
        "",
        "allowCancelOrder",
        "getFavor",
        "",
        "saveNewFavor",
        "",
        "list",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "isNativeFavor",
        "changedFavor",
        "tradeBean",
        "getMarkets",
        "consumer",
        "Lio/reactivex/functions/Consumer;",
        "getSpotType",
        "",
        "getMaintenanceStatus",
        "Lio/reactivex/disposables/Disposable;",
        "complete",
        "Lkotlin/Function1;",
        "Lcom/kubi/data/entity/MaintenanceEntity;",
        "error",
        "Lkotlin/Function0;",
        "getCDNMaintenanceStatus",
        "getMaintenance",
        "getMarketsSpotPageId",
        "getTradingPageId",
        "baseTradeFragmentScrollToTop",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "isBaseTradeFragment",
        "currentFragment",
        "getPreviewInfo",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "Lcom/kubi/data/entity/SymbolPreviewEntity;",
        "currency",
        "lang",
        "bindFlowEvent",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "block",
        "getRnOrderCenterFragment",
        "tradeType",
        "currentSymbol",
        "TradeCoreBizLib_googleRelease"
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
        "SMAP\nTradeCoreService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCoreService.kt\ncom/kubi/core/service/TradeCoreService\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,127:1\n81#2,2:128\n*S KotlinDebug\n*F\n+ 1 TradeCoreService.kt\ncom/kubi/core/service/TradeCoreService\n*L\n120#1:128,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lee/b;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lee/b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lee/c;->b:Lkotlin/Lazy;

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static synthetic b()Lge/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lee/c;->c()Lge/b;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final c()Lge/b;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lge/b;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lge/b;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/BaseFragment;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "tradeType"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "currentSymbol"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/core/biz/bottomtab/RnOrderCenterFragment;->V:Lcom/kubi/core/biz/bottomtab/RnOrderCenterFragment$Companion;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lcom/kubi/core/biz/bottomtab/RnOrderCenterFragment$Companion;->newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/biz/bottomtab/RnOrderCenterFragment;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
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
.end method
