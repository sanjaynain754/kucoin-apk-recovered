.class public final Lcom/kubi/quotefacade/market/MarketListViewModel;
.super Lcom/kubi/mvi/state/m;
.source "MarketListViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/m<",
        "Lcom/kubi/quotefacade/event/MarketListContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016J\u0008\u0010\u0014\u001a\u00020\u0013H\u0016J\u0008\u0010\u0015\u001a\u00020\u0013H\u0016J\u0008\u0010\u0016\u001a\u00020\u0013H\u0014J\u0008\u0010\u0017\u001a\u00020\u0013H\u0002J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0094@\u00a2\u0006\u0002\u0010\u001bJ*\u0010\u001c\u001a\u00020\u00132\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010\"JH\u0010#\u001a\u00020\u00132\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001e2\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u00060(j\u0008\u0012\u0004\u0012\u00020\u0006`)H\u0082@\u00a2\u0006\u0002\u0010*JD\u0010+\u001a\u00020\u00132\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0008\u0010,\u001a\u0004\u0018\u00010-2\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u00060(j\u0008\u0012\u0004\u0012\u00020\u0006`)2\u0008\u0008\u0002\u0010.\u001a\u00020/H\u0082@\u00a2\u0006\u0002\u00100J=\u00101\u001a\u00020\u00132\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00060(j\u0008\u0012\u0004\u0012\u00020\u0006`)2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020 04H\u0002\u00a2\u0006\u0002\u00105R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u00066"
    }
    d2 = {
        "Lcom/kubi/quotefacade/market/MarketListViewModel;",
        "Lcom/kubi/mvi/state/SingleSimpleStateVM;",
        "Lcom/kubi/quotefacade/event/MarketListContract$UIState;",
        "<init>",
        "()V",
        "TAG",
        "",
        "wsDataController",
        "Lcom/kubi/quotefacade/helper/QuoteWSDataController;",
        "repository",
        "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;",
        "lastFetchListIntent",
        "Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;",
        "networkRecovery",
        "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;",
        "initState",
        "getInitState",
        "()Lcom/kubi/quotefacade/event/MarketListContract$UIState;",
        "onShow",
        "",
        "onFirstShow",
        "onHide",
        "onCleared",
        "requestNetworkRecoveryRefresh",
        "dispatchIntent",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateCoinStatus",
        "marketType",
        "",
        "tradeItemBean",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "position",
        "(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchListData",
        "l1p",
        "l2p",
        "pageSize",
        "symbol",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleData",
        "marketListEntity",
        "Lcom/kubi/quotefacade/entity/MarketListEntity;",
        "needSubscribe",
        "",
        "(Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/MarketListEntity;Ljava/util/ArrayList;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "pageDataSubscribe",
        "symbols",
        "futuresSymbols",
        "",
        "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/List;)V",
        "QuoteFacadeLib_googleRelease"
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
        "SMAP\nMarketListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketListViewModel.kt\ncom/kubi/quotefacade/market/MarketListViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n25#2:233\n26#2:235\n25#2:236\n26#2:238\n25#2:239\n26#2:241\n25#2:242\n26#2:244\n25#2:245\n26#2:247\n25#2:248\n26#2:250\n1#3:234\n1#3:237\n1#3:240\n1#3:243\n1#3:246\n1#3:249\n1#3:265\n1563#4:251\n1634#4,3:252\n1617#4,9:255\n1869#4:264\n1870#4:266\n1626#4:267\n*S KotlinDebug\n*F\n+ 1 MarketListViewModel.kt\ncom/kubi/quotefacade/market/MarketListViewModel\n*L\n112#1:233\n112#1:235\n122#1:236\n122#1:238\n132#1:239\n132#1:241\n152#1:242\n152#1:244\n163#1:245\n163#1:247\n172#1:248\n172#1:250\n112#1:234\n122#1:237\n132#1:240\n152#1:243\n163#1:246\n172#1:249\n226#1:265\n198#1:251\n198#1:252,3\n226#1:255,9\n226#1:264\n226#1:266\n226#1:267\n*E\n"
    }
.end annotation


# instance fields
.field public final X:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b0:Lyz/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/m;-><init>()V

    .line 4
    .line 5
    const-string v0, "MarketListViewModel"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->X:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;-><init>()V

    .line 13
    .line 14
    iput-object v1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 15
    .line 16
    new-instance v1, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;-><init>()V

    .line 20
    .line 21
    iput-object v1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Z:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 22
    .line 23
    new-instance v1, Lyz/a;

    .line 24
    .line 25
    new-instance v2, Lcom/kubi/quotefacade/market/MarketListViewModel$networkRecovery$1;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, p0}, Lcom/kubi/quotefacade/market/MarketListViewModel$networkRecovery$1;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v0, v2}, Lyz/a;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    iput-object v1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->b0:Lyz/a;

    .line 34
    return-void
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
.end method

.method public static final A(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ldv/t;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Ldv/t;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
.end method

.method private final B()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->a0:Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->X:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "network recovered: skip FetchListData, no previous params"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance v2, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getMarketType()I

    .line 18
    move-result v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getL1p()Ljava/lang/String;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getL2p()Ljava/lang/String;

    .line 26
    move-result-object v5

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getPageSize()I

    .line 30
    move-result v6

    .line 31
    .line 32
    new-instance v7, Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getSymbol()Ljava/util/ArrayList;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v2 .. v7}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v2}, Lcom/kubi/mvi/state/BaseStateVM;->sendIntent(Lcom/kubi/mvi/state/d;)V

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
.end method

.method public static synthetic b(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/market/MarketListViewModel;->r(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

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
.end method

.method public static synthetic d(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/market/MarketListViewModel;->x(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

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
.end method

.method public static synthetic e(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/market/MarketListViewModel;->z(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/util/List;)Lkotlin/Unit;

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
.end method

.method public static synthetic f(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/market/MarketListViewModel;->s(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

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
.end method

.method public static synthetic g(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/market/MarketListViewModel;->w(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

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
.end method

.method public static synthetic h(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/market/MarketListViewModel;->A(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/util/List;)Lkotlin/Unit;

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
.end method

.method public static synthetic i(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/market/MarketListViewModel;->t(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

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
.end method

.method public static final synthetic j(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Lcom/kubi/quotefacade/market/MarketListViewModel;->q(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic k(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/MarketListEntity;Ljava/util/ArrayList;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lcom/kubi/quotefacade/market/MarketListViewModel;->v(Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/MarketListEntity;Ljava/util/ArrayList;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic n(Lcom/kubi/quotefacade/market/MarketListViewModel;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/quotefacade/market/MarketListViewModel;->B()V

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
.end method

.method public static final synthetic o(Lcom/kubi/quotefacade/market/MarketListViewModel;Ldr/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

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
.end method

.method public static final synthetic p(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/quotefacade/market/MarketListViewModel;->C(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final r(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v4, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/kubi/quotefacade/event/MarketListContract$UIState;->copy$default(Lcom/kubi/quotefacade/event/MarketListContract$UIState;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static final s(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v4, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/kubi/quotefacade/event/MarketListContract$UIState;->copy$default(Lcom/kubi/quotefacade/event/MarketListContract$UIState;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static final t(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v4, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/kubi/quotefacade/event/MarketListContract$UIState;->copy$default(Lcom/kubi/quotefacade/event/MarketListContract$UIState;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static final w(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v3, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v5, 0x5

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/kubi/quotefacade/event/MarketListContract$UIState;->copy$default(Lcom/kubi/quotefacade/event/MarketListContract$UIState;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static final x(Lcom/kubi/quotefacade/event/MarketListContract$UIState;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v3, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v5, 0x5

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/kubi/quotefacade/event/MarketListContract$UIState;->copy$default(Lcom/kubi/quotefacade/event/MarketListContract$UIState;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lcom/kubi/quotefacade/event/MarketListContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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
.end method

.method public static final z(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ldv/u;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Ldv/u;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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
.end method


# virtual methods
.method public final C(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lcom/kubi/data/entity/TradeItemBean;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p4

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p4}, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p4, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->label:I

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    const/16 v7, 0x96

    .line 38
    .line 39
    const-string v8, "420000"

    .line 40
    const/4 v3, 0x2

    .line 41
    const/4 v5, 0x1

    .line 42
    const/4 v9, 0x0

    .line 43
    .line 44
    if-eqz v1, :cond_4

    .line 45
    .line 46
    if-eq v1, v5, :cond_3

    .line 47
    .line 48
    if-eq v1, v3, :cond_2

    .line 49
    .line 50
    if-ne v1, v2, :cond_1

    .line 51
    .line 52
    iget-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lcom/kubi/data/entity/TradeItemBean;

    .line 55
    .line 56
    iget-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    goto/16 :goto_a

    .line 64
    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    throw p1

    .line 72
    .line 73
    :cond_2
    iget-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$1:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lcom/kubi/data/entity/TradeItemBean;

    .line 76
    .line 77
    iget-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_3
    iget-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Lcom/kubi/data/entity/TradeItemBean;

    .line 89
    .line 90
    iget-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 96
    goto :goto_3

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 100
    const/4 p4, 0x0

    .line 101
    .line 102
    if-nez p1, :cond_5

    .line 103
    goto :goto_4

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 107
    move-result v1

    .line 108
    .line 109
    if-nez v1, :cond_8

    .line 110
    .line 111
    iget-object v1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Z:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 112
    .line 113
    if-eqz p2, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 117
    move-result-object v2

    .line 118
    goto :goto_2

    .line 119
    :cond_6
    move-object v2, p4

    .line 120
    .line 121
    .line 122
    :goto_2
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->j(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    new-instance v2, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$2;

    .line 126
    .line 127
    .line 128
    invoke-direct {v2, p0, p2, p3, p4}, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$2;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    iput-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$0:Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    move-result-object p1

    .line 139
    .line 140
    iput-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$1:Ljava/lang/Object;

    .line 141
    .line 142
    iput p3, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->I$0:I

    .line 143
    .line 144
    iput v5, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->label:I

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v9, v2, v4}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 148
    move-result-object p4

    .line 149
    .line 150
    if-ne p4, v0, :cond_7

    .line 151
    .line 152
    goto/16 :goto_9

    .line 153
    .line 154
    :cond_7
    :goto_3
    check-cast p4, Lcom/kubi/network/retrofit/utils/f;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p4}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    if-eqz p1, :cond_10

    .line 161
    .line 162
    instance-of p2, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 163
    .line 164
    if-eqz p2, :cond_10

    .line 165
    .line 166
    check-cast p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 167
    .line 168
    iget-object p1, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    move-result p1

    .line 173
    .line 174
    if-eqz p1, :cond_10

    .line 175
    .line 176
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 177
    .line 178
    sget p2, Lcom/kubi/quotefacade/R$string;->rank_fav_limit:I

    .line 179
    .line 180
    .line 181
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 182
    move-result-object p3

    .line 183
    .line 184
    .line 185
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 186
    move-result-object p3

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p2, p3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    move-result-object p1

    .line 191
    .line 192
    new-array p2, v9, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    .line 197
    goto/16 :goto_b

    .line 198
    .line 199
    :cond_8
    :goto_4
    if-nez p1, :cond_a

    .line 200
    :cond_9
    move v5, v3

    .line 201
    goto :goto_7

    .line 202
    .line 203
    .line 204
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 205
    move-result v1

    .line 206
    .line 207
    if-ne v1, v5, :cond_9

    .line 208
    .line 209
    iget-object v1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Z:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 210
    .line 211
    if-eqz p2, :cond_b

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 215
    move-result-object v2

    .line 216
    goto :goto_5

    .line 217
    :cond_b
    move-object v2, p4

    .line 218
    .line 219
    .line 220
    :goto_5
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->e(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 221
    move-result-object v1

    .line 222
    move v5, v3

    .line 223
    .line 224
    new-instance v3, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$4;

    .line 225
    .line 226
    .line 227
    invoke-direct {v3, p0, p2, p3, p4}, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$4;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)V

    .line 228
    .line 229
    .line 230
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    move-result-object p1

    .line 232
    .line 233
    iput-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$0:Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    move-result-object p1

    .line 238
    .line 239
    iput-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$1:Ljava/lang/Object;

    .line 240
    .line 241
    iput p3, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->I$0:I

    .line 242
    .line 243
    iput v5, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->label:I

    .line 244
    const/4 v2, 0x0

    .line 245
    const/4 v5, 0x1

    .line 246
    const/4 v6, 0x0

    .line 247
    .line 248
    .line 249
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 250
    move-result-object p4

    .line 251
    .line 252
    if-ne p4, v0, :cond_c

    .line 253
    goto :goto_9

    .line 254
    .line 255
    :cond_c
    :goto_6
    check-cast p4, Lcom/kubi/network/retrofit/utils/f;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p4}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 259
    move-result-object p1

    .line 260
    .line 261
    if-eqz p1, :cond_10

    .line 262
    .line 263
    instance-of p2, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 264
    .line 265
    if-eqz p2, :cond_10

    .line 266
    .line 267
    check-cast p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 268
    .line 269
    iget-object p1, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    move-result p1

    .line 274
    .line 275
    if-eqz p1, :cond_10

    .line 276
    .line 277
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 278
    .line 279
    sget p2, Lcom/kubi/quotefacade/R$string;->rank_fav_limit:I

    .line 280
    .line 281
    .line 282
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 283
    move-result-object p3

    .line 284
    .line 285
    .line 286
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 287
    move-result-object p3

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, p2, p3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 291
    move-result-object p1

    .line 292
    .line 293
    new-array p2, v9, [Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    goto :goto_b

    .line 298
    .line 299
    :goto_7
    if-nez p1, :cond_d

    .line 300
    goto :goto_b

    .line 301
    .line 302
    .line 303
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 304
    move-result v1

    .line 305
    .line 306
    if-ne v1, v5, :cond_10

    .line 307
    .line 308
    iget-object v1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Z:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 309
    .line 310
    if-eqz p2, :cond_e

    .line 311
    .line 312
    .line 313
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 314
    move-result-object v3

    .line 315
    goto :goto_8

    .line 316
    :cond_e
    move-object v3, p4

    .line 317
    .line 318
    .line 319
    :goto_8
    invoke-virtual {v1, v3}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->g(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    new-instance v3, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$6;

    .line 323
    .line 324
    .line 325
    invoke-direct {v3, p0, p2, p3, p4}, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$6;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)V

    .line 326
    .line 327
    .line 328
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    move-result-object p1

    .line 330
    .line 331
    iput-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$0:Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    move-result-object p1

    .line 336
    .line 337
    iput-object p1, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->L$1:Ljava/lang/Object;

    .line 338
    .line 339
    iput p3, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->I$0:I

    .line 340
    .line 341
    iput v2, v4, Lcom/kubi/quotefacade/market/MarketListViewModel$updateCoinStatus$1;->label:I

    .line 342
    const/4 v2, 0x0

    .line 343
    const/4 v5, 0x1

    .line 344
    const/4 v6, 0x0

    .line 345
    .line 346
    .line 347
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 348
    move-result-object p4

    .line 349
    .line 350
    if-ne p4, v0, :cond_f

    .line 351
    :goto_9
    return-object v0

    .line 352
    .line 353
    :cond_f
    :goto_a
    check-cast p4, Lcom/kubi/network/retrofit/utils/f;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p4}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 357
    move-result-object p1

    .line 358
    .line 359
    if-eqz p1, :cond_10

    .line 360
    .line 361
    instance-of p2, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 362
    .line 363
    if-eqz p2, :cond_10

    .line 364
    .line 365
    check-cast p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 366
    .line 367
    iget-object p1, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 371
    move-result p1

    .line 372
    .line 373
    if-eqz p1, :cond_10

    .line 374
    .line 375
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 376
    .line 377
    sget p2, Lcom/kubi/quotefacade/R$string;->rank_fav_limit:I

    .line 378
    .line 379
    .line 380
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 381
    move-result-object p3

    .line 382
    .line 383
    .line 384
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 385
    move-result-object p3

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, p2, p3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 389
    move-result-object p1

    .line 390
    .line 391
    new-array p2, v9, [Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    .line 396
    :cond_10
    :goto_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 397
    return-object p1
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
.end method

.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Lcom/kubi/mvi/state/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/mvi/state/d;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->label:I

    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->label:I

    .line 35
    const/4 v2, 0x3

    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x1

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    if-eq v1, v4, :cond_3

    .line 42
    .line 43
    if-eq v1, v3, :cond_2

    .line 44
    .line 45
    if-ne v1, v2, :cond_1

    .line 46
    .line 47
    iget-object p1, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    move-object v1, p0

    .line 54
    .line 55
    goto/16 :goto_5

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
    iget-object p1, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 68
    .line 69
    .line 70
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    move-object v1, p0

    .line 72
    goto :goto_3

    .line 73
    .line 74
    :cond_3
    iget-object p1, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Lcom/kubi/mvi/state/d;

    .line 77
    .line 78
    .line 79
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 80
    goto :goto_2

    .line 81
    .line 82
    .line 83
    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    iput-object p1, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    iput v4, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->label:I

    .line 88
    .line 89
    .line 90
    invoke-super {p0, p1, v7}, Lcom/kubi/mvi/state/BaseStateVM;->dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 91
    move-result-object p2

    .line 92
    .line 93
    if-ne p2, v0, :cond_5

    .line 94
    move-object v1, p0

    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_5
    :goto_2
    iget-object p2, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->X:Ljava/lang/String;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    const-string v4, "dispatchIntent="

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    .line 118
    invoke-static {p2, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    instance-of p2, p1, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;

    .line 121
    .line 122
    if-eqz p2, :cond_7

    .line 123
    move-object p2, p1

    .line 124
    .line 125
    check-cast p2, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;

    .line 126
    .line 127
    iput-object p2, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->a0:Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getMarketType()I

    .line 131
    move-result v1

    .line 132
    .line 133
    .line 134
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 135
    move-result-object v2

    .line 136
    move v1, v3

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getL1p()Ljava/lang/String;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getL2p()Ljava/lang/String;

    .line 144
    move-result-object v4

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getPageSize()I

    .line 148
    move-result v5

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;->getSymbol()Ljava/util/ArrayList;

    .line 152
    move-result-object v6

    .line 153
    .line 154
    .line 155
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    move-result-object p1

    .line 157
    .line 158
    iput-object p1, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 159
    .line 160
    iput v1, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->label:I

    .line 161
    move-object v1, p0

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v1 .. v7}, Lcom/kubi/quotefacade/market/MarketListViewModel;->q(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 165
    move-result-object p1

    .line 166
    .line 167
    if-ne p1, v0, :cond_6

    .line 168
    goto :goto_4

    .line 169
    .line 170
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 171
    return-object p1

    .line 172
    :cond_7
    move-object v1, p0

    .line 173
    .line 174
    instance-of p2, p1, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$CollectOrCancelCoin;

    .line 175
    .line 176
    if-eqz p2, :cond_9

    .line 177
    move-object p2, p1

    .line 178
    .line 179
    check-cast p2, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$CollectOrCancelCoin;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$CollectOrCancelCoin;->getMarketType()I

    .line 183
    move-result v3

    .line 184
    .line 185
    .line 186
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 187
    move-result-object v3

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$CollectOrCancelCoin;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 191
    move-result-object v4

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2}, Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$CollectOrCancelCoin;->getItemPosition()I

    .line 195
    move-result p2

    .line 196
    .line 197
    .line 198
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    iput-object p1, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->L$0:Ljava/lang/Object;

    .line 202
    .line 203
    iput v2, v7, Lcom/kubi/quotefacade/market/MarketListViewModel$dispatchIntent$1;->label:I

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v3, v4, p2, v7}, Lcom/kubi/quotefacade/market/MarketListViewModel;->C(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 207
    move-result-object p1

    .line 208
    .line 209
    if-ne p1, v0, :cond_8

    .line 210
    :goto_4
    return-object v0

    .line 211
    .line 212
    :cond_8
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 213
    return-object p1

    .line 214
    .line 215
    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 216
    return-object p1
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
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
.end method

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/market/MarketListViewModel;->u()Lcom/kubi/quotefacade/event/MarketListContract$UIState;

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
.end method

.method public onCleared()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->b0:Lyz/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lyz/a;->e()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateVM;->onCleared()V

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
.end method

.method public onFirstShow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onFirstShow()V

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
.end method

.method public onHide()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->b0:Lyz/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lyz/a;->f()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onHide()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->c()V

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
.end method

.method public onShow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onShow()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->b0:Lyz/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lyz/a;->g()V

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
.end method

.method public final q(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p6, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p6

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p6}, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p6, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->label:I

    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Ljava/lang/String;

    .line 56
    .line 57
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    throw p1

    .line 73
    .line 74
    :cond_2
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$4:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Ljava/lang/String;

    .line 77
    .line 78
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$3:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Ljava/util/ArrayList;

    .line 81
    .line 82
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$2:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Ljava/lang/String;

    .line 85
    .line 86
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Ljava/lang/String;

    .line 89
    .line 90
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :cond_3
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$3:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$2:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Ljava/lang/String;

    .line 106
    .line 107
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$1:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    iget-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 117
    goto :goto_1

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-static {p6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 121
    const/4 p6, 0x0

    .line 122
    const/4 v2, 0x0

    .line 123
    .line 124
    if-nez p1, :cond_5

    .line 125
    goto :goto_2

    .line 126
    .line 127
    .line 128
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 129
    move-result v6

    .line 130
    .line 131
    if-nez v6, :cond_7

    .line 132
    .line 133
    iget-object v3, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Z:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, p2, p3, p4}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->T(Ljava/lang/String;Ljava/lang/String;I)Lkotlinx/coroutines/flow/e;

    .line 137
    move-result-object v3

    .line 138
    .line 139
    new-instance v4, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$2;

    .line 140
    .line 141
    .line 142
    invoke-direct {v4, p0, p1, p5, p6}, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$2;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/lang/Integer;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)V

    .line 143
    .line 144
    .line 145
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$1:Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$2:Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    invoke-static {p5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$3:Ljava/lang/Object;

    .line 167
    .line 168
    iput p4, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->I$0:I

    .line 169
    .line 170
    iput v5, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->label:I

    .line 171
    .line 172
    .line 173
    invoke-static {v3, v2, v4, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 174
    move-result-object p6

    .line 175
    .line 176
    if-ne p6, v1, :cond_6

    .line 177
    .line 178
    goto/16 :goto_5

    .line 179
    .line 180
    :cond_6
    :goto_1
    check-cast p6, Lcom/kubi/network/retrofit/utils/f;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p6}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 184
    move-result-object p1

    .line 185
    .line 186
    if-eqz p1, :cond_d

    .line 187
    .line 188
    new-instance p1, Lcom/kubi/quotefacade/market/f0;

    .line 189
    .line 190
    .line 191
    invoke-direct {p1}, Lcom/kubi/quotefacade/market/f0;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 195
    .line 196
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 197
    return-object p1

    .line 198
    .line 199
    :cond_7
    :goto_2
    if-nez p1, :cond_8

    .line 200
    goto :goto_4

    .line 201
    .line 202
    .line 203
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 204
    move-result v6

    .line 205
    .line 206
    if-ne v6, v5, :cond_a

    .line 207
    .line 208
    sget-object v3, Lcom/kubi/quotefacade/helper/QuoteBusinessConfigHelp;->a:Lcom/kubi/quotefacade/helper/QuoteBusinessConfigHelp;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Lcom/kubi/quotefacade/helper/QuoteBusinessConfigHelp;->i()Ljava/lang/String;

    .line 212
    move-result-object v3

    .line 213
    .line 214
    iget-object v5, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Z:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, p2, p3, p4, v3}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->F(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 218
    move-result-object v5

    .line 219
    .line 220
    new-instance v6, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$4;

    .line 221
    .line 222
    .line 223
    invoke-direct {v6, p0, p1, p5, p6}, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$4;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/lang/Integer;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)V

    .line 224
    .line 225
    .line 226
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    move-result-object p1

    .line 228
    .line 229
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$0:Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    move-result-object p1

    .line 234
    .line 235
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$1:Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    move-result-object p1

    .line 240
    .line 241
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$2:Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    invoke-static {p5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    move-result-object p1

    .line 246
    .line 247
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$3:Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    move-result-object p1

    .line 252
    .line 253
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$4:Ljava/lang/Object;

    .line 254
    .line 255
    iput p4, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->I$0:I

    .line 256
    .line 257
    iput v4, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->label:I

    .line 258
    .line 259
    .line 260
    invoke-static {v5, v2, v6, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 261
    move-result-object p6

    .line 262
    .line 263
    if-ne p6, v1, :cond_9

    .line 264
    goto :goto_5

    .line 265
    .line 266
    :cond_9
    :goto_3
    check-cast p6, Lcom/kubi/network/retrofit/utils/f;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p6}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 270
    move-result-object p1

    .line 271
    .line 272
    if-eqz p1, :cond_d

    .line 273
    .line 274
    new-instance p1, Lcom/kubi/quotefacade/market/g0;

    .line 275
    .line 276
    .line 277
    invoke-direct {p1}, Lcom/kubi/quotefacade/market/g0;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 281
    .line 282
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 283
    return-object p1

    .line 284
    .line 285
    :cond_a
    :goto_4
    if-nez p1, :cond_b

    .line 286
    goto :goto_7

    .line 287
    .line 288
    .line 289
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 290
    move-result v5

    .line 291
    .line 292
    if-ne v5, v4, :cond_d

    .line 293
    .line 294
    iget-object v4, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Z:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, p2, p3, p4}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->C(Ljava/lang/String;Ljava/lang/String;I)Lkotlinx/coroutines/flow/e;

    .line 298
    move-result-object v4

    .line 299
    .line 300
    new-instance v5, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$6;

    .line 301
    .line 302
    .line 303
    invoke-direct {v5, p0, p1, p5, p6}, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$6;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;Ljava/lang/Integer;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)V

    .line 304
    .line 305
    .line 306
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    move-result-object p1

    .line 308
    .line 309
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$0:Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    move-result-object p1

    .line 314
    .line 315
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$1:Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    move-result-object p1

    .line 320
    .line 321
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$2:Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    invoke-static {p5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    move-result-object p1

    .line 326
    .line 327
    iput-object p1, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->L$3:Ljava/lang/Object;

    .line 328
    .line 329
    iput p4, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->I$0:I

    .line 330
    .line 331
    iput v3, v0, Lcom/kubi/quotefacade/market/MarketListViewModel$fetchListData$1;->label:I

    .line 332
    .line 333
    .line 334
    invoke-static {v4, v2, v5, v0}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->d(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 335
    move-result-object p6

    .line 336
    .line 337
    if-ne p6, v1, :cond_c

    .line 338
    :goto_5
    return-object v1

    .line 339
    .line 340
    :cond_c
    :goto_6
    check-cast p6, Lcom/kubi/network/retrofit/utils/f;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p6}, Lcom/kubi/network/retrofit/utils/f;->b()Ljava/lang/Throwable;

    .line 344
    move-result-object p1

    .line 345
    .line 346
    if-eqz p1, :cond_d

    .line 347
    .line 348
    new-instance p1, Lcom/kubi/quotefacade/market/h0;

    .line 349
    .line 350
    .line 351
    invoke-direct {p1}, Lcom/kubi/quotefacade/market/h0;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 355
    .line 356
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 357
    return-object p1

    .line 358
    .line 359
    :cond_d
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 360
    return-object p1
.end method

.method public u()Lcom/kubi/quotefacade/event/MarketListContract$UIState;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/event/MarketListContract$UIState;

    .line 3
    const/4 v4, 0x7

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/kubi/quotefacade/event/MarketListContract$UIState;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    return-object v0
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
.end method

.method public final v(Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/MarketListEntity;Ljava/util/ArrayList;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lcom/kubi/quotefacade/entity/MarketListEntity;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p5, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->X:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v1, "fetchSpotList start "

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-static {p5, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    new-instance p1, Lcom/kubi/quotefacade/market/i0;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1}, Lcom/kubi/quotefacade/market/i0;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 33
    .line 34
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    return-object p1

    .line 36
    .line 37
    :cond_0
    iget-object p5, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->X:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    const-string v1, "fetchSpotList marketListEntity = "

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/MarketListEntity;->getItems()Ljava/util/List;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 57
    move-result v1

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 61
    move-result-object v1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 v1, 0x0

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-static {p5, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/MarketListEntity;->getItems()Ljava/util/List;

    .line 77
    move-result-object p5

    .line 78
    .line 79
    if-eqz p5, :cond_6

    .line 80
    .line 81
    .line 82
    invoke-interface {p5}, Ljava/util/Collection;->isEmpty()Z

    .line 83
    move-result p5

    .line 84
    .line 85
    if-eqz p5, :cond_2

    .line 86
    goto :goto_4

    .line 87
    .line 88
    :cond_2
    if-nez p1, :cond_3

    .line 89
    goto :goto_1

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 93
    move-result p5

    .line 94
    const/4 v0, 0x1

    .line 95
    .line 96
    if-eq p5, v0, :cond_4

    .line 97
    .line 98
    :goto_1
    new-instance p5, Lkv/i;

    .line 99
    .line 100
    .line 101
    invoke-direct {p5}, Lkv/i;-><init>()V

    .line 102
    goto :goto_2

    .line 103
    .line 104
    :cond_4
    new-instance p5, Lkv/h;

    .line 105
    .line 106
    .line 107
    invoke-direct {p5}, Lkv/h;-><init>()V

    .line 108
    .line 109
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    .line 110
    .line 111
    .line 112
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/MarketListEntity;->getItems()Ljava/util/List;

    .line 116
    move-result-object p2

    .line 117
    .line 118
    if-eqz p2, :cond_5

    .line 119
    .line 120
    new-instance v1, Ljava/util/ArrayList;

    .line 121
    .line 122
    const/16 v2, 0xa

    .line 123
    .line 124
    .line 125
    invoke-static {p2, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 126
    move-result v2

    .line 127
    .line 128
    .line 129
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    move-result-object p2

    .line 134
    .line 135
    .line 136
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    move-result v2

    .line 138
    .line 139
    if-eqz v2, :cond_5

    .line 140
    .line 141
    .line 142
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    move-result-object v2

    .line 144
    .line 145
    check-cast v2, Lcom/kubi/quotefacade/entity/MarketListEntityItem;

    .line 146
    .line 147
    .line 148
    invoke-interface {p5, v2}, Lkv/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    .line 152
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    move-result v2

    .line 154
    .line 155
    .line 156
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 157
    move-result-object v2

    .line 158
    .line 159
    .line 160
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 161
    goto :goto_3

    .line 162
    .line 163
    :cond_5
    iget-object p2, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->X:Ljava/lang/String;

    .line 164
    .line 165
    const-string p5, "updateState!!!"

    .line 166
    .line 167
    .line 168
    invoke-static {p2, p5}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    new-instance p2, Ldv/s;

    .line 171
    .line 172
    .line 173
    invoke-direct {p2, v0}, Ldv/s;-><init>(Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 177
    .line 178
    if-eqz p4, :cond_7

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, p1, p3, v0}, Lcom/kubi/quotefacade/market/MarketListViewModel;->y(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 182
    goto :goto_5

    .line 183
    .line 184
    :cond_6
    :goto_4
    new-instance p1, Lcom/kubi/quotefacade/market/j0;

    .line 185
    .line 186
    .line 187
    invoke-direct {p1}, Lcom/kubi/quotefacade/market/j0;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 191
    move-result p1

    .line 192
    .line 193
    .line 194
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    :cond_7
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 197
    return-object p1
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
.end method

.method public final y(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    :goto_0
    if-nez p1, :cond_1

    .line 18
    goto :goto_1

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x2

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    goto :goto_3

    .line 27
    .line 28
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->X:Ljava/lang/String;

    .line 29
    .line 30
    const-string p2, "wsDataController.futureSubscribe"

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    iget-object p1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 36
    .line 37
    new-instance p2, Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    move-result-object p3

    .line 45
    .line 46
    .line 47
    :cond_3
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    .line 53
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    check-cast v0, Lcom/kubi/data/entity/TradeItemBean;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    .line 65
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    goto :goto_2

    .line 67
    .line 68
    :cond_4
    new-instance p3, Lcom/kubi/quotefacade/market/l0;

    .line 69
    .line 70
    .line 71
    invoke-direct {p3, p0}, Lcom/kubi/quotefacade/market/l0;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2, p3}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->d(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 75
    return-void

    .line 76
    .line 77
    :cond_5
    :goto_3
    iget-object p1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->X:Ljava/lang/String;

    .line 78
    .line 79
    const-string p3, "wsDataController.spotSubscribe"

    .line 80
    .line 81
    .line 82
    invoke-static {p1, p3}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    iget-object p1, p0, Lcom/kubi/quotefacade/market/MarketListViewModel;->Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 85
    .line 86
    new-instance p3, Lcom/kubi/quotefacade/market/k0;

    .line 87
    .line 88
    .line 89
    invoke-direct {p3, p0}, Lcom/kubi/quotefacade/market/k0;-><init>(Lcom/kubi/quotefacade/market/MarketListViewModel;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2, p3}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->f(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 93
    :cond_6
    return-void
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
.end method
