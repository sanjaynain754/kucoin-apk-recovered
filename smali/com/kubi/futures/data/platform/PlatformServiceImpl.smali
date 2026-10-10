.class public final Lcom/kubi/futures/data/platform/PlatformServiceImpl;
.super Ljava/lang/Object;
.source "PlatformServiceImpl.kt"

# interfaces
.implements Lth/d;
.implements Lth/a;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CheckResult"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/data/platform/PlatformServiceImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0006J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0008\u0010\'\u001a\u00020(H\u0016J\u0008\u0010)\u001a\u00020(H\u0016J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00082\u0006\u0010-\u001a\u00020&H\u0016J\u000e\u0010.\u001a\u0008\u0012\u0004\u0012\u00020+0/H\u0016J\u0016\u00100\u001a\u0008\u0012\u0004\u0012\u00020+0/2\u0006\u00101\u001a\u00020\u0008H\u0016J\"\u00102\u001a\u0008\u0012\u0004\u0012\u0002030/2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000805H\u0016J\u001a\u00106\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00082\u0006\u0010-\u001a\u00020&H\u0016J\u000e\u00108\u001a\u0008\u0012\u0004\u0012\u0002030/H\u0016J\u0016\u00109\u001a\u00020$2\u000c\u0010:\u001a\u0008\u0012\u0004\u0012\u0002030/H\u0016J\u0016\u0010;\u001a\u0008\u0012\u0004\u0012\u0002030<2\u0006\u00107\u001a\u00020\u0008H\u0016J\u0014\u0010=\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002030/0<H\u0016J\u000e\u0010B\u001a\u0008\u0012\u0004\u0012\u00020@0<H\u0016J\u0008\u0010C\u001a\u00020DH\u0016J\u0008\u0010E\u001a\u00020DH\u0016J\u0008\u0010F\u001a\u00020$H\u0016J\u0008\u0010G\u001a\u00020HH\u0016J\u0008\u0010I\u001a\u00020HH\u0016J\u000e\u0010J\u001a\u0008\u0012\u0004\u0012\u00020H0<H\u0016J#\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020L052\u0008\u0010M\u001a\u0004\u0018\u00010&H\u0016\u00a2\u0006\u0002\u0010NJ\u0008\u0010O\u001a\u00020$H\u0016J\u0018\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020\u00082\u0006\u0010R\u001a\u00020\u0008H\u0016J\u0014\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020L05H\u0016J\u001c\u0010T\u001a\u00020$2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020L05H\u0016J\u0012\u0010S\u001a\u0004\u0018\u00010L2\u0006\u00107\u001a\u00020\u0008H\u0016J\u001e\u0010V\u001a\u0004\u0018\u00010\"2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000805H\u0016J\u001c\u0010X\u001a\u00020$2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000805H\u0002J\u001a\u0010Y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020L050<H\u0016J\u0016\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020L0<2\u0006\u00107\u001a\u00020\u0008H\u0016J\u0008\u0010Z\u001a\u00020$H\u0016J\u000e\u0010[\u001a\u0008\u0012\u0004\u0012\u00020]0\\H\u0017J\u000e\u0010^\u001a\u0008\u0012\u0004\u0012\u00020]0\\H\u0016J\u000e\u0010_\u001a\u0008\u0012\u0004\u0012\u00020]0`H\u0016J\u0010\u0010a\u001a\u00020\u00082\u0006\u00107\u001a\u00020\u0008H\u0016J\u0016\u0010b\u001a\u00020$2\u000c\u0010c\u001a\u0008\u0012\u0004\u0012\u00020\u00080/H\u0016J\u000e\u0010d\u001a\u0008\u0012\u0004\u0012\u00020\u00080/H\u0016J\u0008\u0010e\u001a\u00020fH\u0016J\u001c\u0010g\u001a\u00020$2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000805H\u0016J\u000e\u0010i\u001a\u0008\u0012\u0004\u0012\u00020\u00080/H\u0002J\u0010\u0010j\u001a\u00020$2\u0006\u0010k\u001a\u000203H\u0002J\u0008\u0010l\u001a\u00020mH\u0016J\u0008\u0010n\u001a\u00020mH\u0016J\u0008\u0010o\u001a\u00020&H\u0016J\u0008\u0010p\u001a\u00020$H\u0016J\n\u0010q\u001a\u0004\u0018\u00010rH\u0016J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020t\u0018\u00010/H\u0097\u0001J\t\u0010u\u001a\u00020vH\u0097\u0001JD\u0010w\u001a\u0004\u0018\u00010x2\u0008\u0008\u0001\u0010y\u001a\u00020@2\u0008\u0008\u0001\u0010z\u001a\u00020@2\u0008\u0008\u0001\u0010{\u001a\u00020\u00082\u0008\u0008\u0001\u0010|\u001a\u00020\u00082\n\u0008\u0001\u0010}\u001a\u0004\u0018\u00010@H\u0097\u0001\u00a2\u0006\u0002\u0010~J\n\u0010\u007f\u001a\u00030\u0080\u0001H\u0097\u0001J\u001d\u0010\u0081\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010/2\u0008\u0008\u0001\u00107\u001a\u00020\u0008H\u0097\u0001J\r\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0097\u0001J\u0012\u0010\u0085\u0001\u001a\u0004\u0018\u00010&H\u0097\u0001\u00a2\u0006\u0003\u0010\u0086\u0001J\u000c\u0010\u0087\u0001\u001a\u0004\u0018\u00010rH\u0097\u0001J!\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020L052\t\u0008\u0001\u0010\u0089\u0001\u001a\u00020\u0008H\u0097\u0001J\u0016\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020L05H\u0097\u0001J\u0015\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0008\u0008\u0001\u00107\u001a\u00020\u0008H\u0097\u0001J:\u0010\u008d\u0001\u001a\u0010\u0012\u000c\u0012\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u00010\\2\t\u0008\u0001\u0010\u0090\u0001\u001a\u00020\u00082\n\u0008\u0001\u00107\u001a\u0004\u0018\u00010\u00082\t\u0008\u0001\u0010\u0091\u0001\u001a\u00020\u0008H\u0097\u0001J(\u0010\u0092\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0008\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0093\u00010/052\t\u0008\u0001\u0010\u0094\u0001\u001a\u00020\u0008H\u0097\u0001J=\u0010\u0095\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0008\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0093\u00010/052\t\u0008\u0001\u0010\u0094\u0001\u001a\u00020\u00082\t\u0008\u0001\u0010\u0096\u0001\u001a\u00020\u00082\u0008\u0008\u0001\u00107\u001a\u00020\u0008H\u0097\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0014\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0014\u001a\u0004\u0008\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0010\u0012\u000c\u0012\n A*\u0004\u0018\u00010@0@0?X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0098\u0001"
    }
    d2 = {
        "Lcom/kubi/futures/data/platform/PlatformServiceImpl;",
        "Lcom/kubi/futures/data/platform/IPlatformService;",
        "Lcom/kubi/futures/data/platform/IPlatformApi;",
        "platformApi",
        "<init>",
        "(Lcom/kubi/futures/data/platform/IPlatformApi;)V",
        "()V",
        "SYMBOL_CONFIG",
        "",
        "getSYMBOL_CONFIG",
        "()Ljava/lang/String;",
        "SYMBOL_CONFIG$delegate",
        "Lcom/kubi/network/api/utils/Link;",
        "EXPIRED_FLAG",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "platformDao",
        "Lcom/kubi/futures/data/platform/PlatformDaoWrapper;",
        "getPlatformDao",
        "()Lcom/kubi/futures/data/platform/PlatformDaoWrapper;",
        "platformDao$delegate",
        "Lkotlin/Lazy;",
        "platformMemory",
        "Lcom/kubi/futures/data/platform/IPlatformMemory;",
        "platformSocket",
        "Lcom/kubi/futures/data/platform/IPlatformSocket;",
        "getPlatformSocket",
        "()Lcom/kubi/futures/data/platform/IPlatformSocket;",
        "platformSocket$delegate",
        "futuresClient",
        "Lcom/kubi/network/api/IWebSocketClient;",
        "getFuturesClient",
        "()Lcom/kubi/network/api/IWebSocketClient;",
        "futuresClient$delegate",
        "contractCacheLock",
        "",
        "synchronized",
        "",
        "force",
        "",
        "getServerTime",
        "",
        "fetchServerTime",
        "getCoin",
        "Lcom/kubi/kumex/data/platform/model/CoinEntity;",
        "currency",
        "wait",
        "getCoinList",
        "",
        "fetchCoinList",
        "platfrom",
        "fetchContractList",
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "headers",
        "",
        "getContract",
        "symbol",
        "getContractList",
        "insertContractList",
        "list",
        "observeContract",
        "Lio/reactivex/Flowable;",
        "observeContractList",
        "contractVersionBP",
        "Lio/reactivex/processors/BehaviorProcessor;",
        "",
        "kotlin.jvm.PlatformType",
        "observeContractVersion",
        "fetchSystemConfig",
        "Lcom/kubi/kumex/data/platform/model/SystemConfig;",
        "getSystemConfig",
        "loadNoticeConfig",
        "fetchNoticeConfig",
        "Lcom/kubi/kumex/data/platform/model/NoticeConfig;",
        "getNoticeConfig",
        "observeNoticeConfig",
        "fetchSymbolConfig",
        "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
        "isOnLogin",
        "(Ljava/lang/Boolean;)Ljava/util/Map;",
        "expireSymbolConfig",
        "mergeBatchLeverageLocally",
        "primarySymbol",
        "leverage",
        "getSymbolConfig",
        "insertSymbolConfig",
        "config",
        "submitSymbolConfig",
        "map",
        "mergeSymbolConfig",
        "observeSymbolConfig",
        "fetchInitData",
        "fetchMaintainData",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;",
        "observeMaintainData",
        "bindSocketOfContractStatus",
        "Lkotlinx/coroutines/flow/Flow;",
        "getContractStatus",
        "updateFavouriteQuotes",
        "quotes",
        "getFavouriteQuotes",
        "observeContractUpdate",
        "Lio/reactivex/disposables/Disposable;",
        "clearCacheFavoriteStatus",
        "symbolMap",
        "findFavoriteFormCache",
        "putContract",
        "contract",
        "fetchHedgeDiscountRate",
        "Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;",
        "getHedgeDiscountRate",
        "isReversePositionEnable",
        "fetchAndUpdateRobotSiteConfig",
        "getStrategyConfig",
        "Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;",
        "fetchAgreementsOfOpenFutures",
        "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;",
        "fetchAnnouncement",
        "Lcom/kubi/kumex/data/platform/model/NoticeEntity;",
        "fetchCampaignActivities",
        "Lcom/kubi/kumex/data/platform/model/FuturesCampaignActivityEntity;",
        "page",
        "pageSize",
        "lang",
        "categories",
        "weight",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/kumex/data/platform/model/FuturesCampaignActivityEntity;",
        "fetchNasdaqMarketStatus",
        "Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;",
        "fetchRiskLimitList",
        "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;",
        "fetchRobotSiteConfig",
        "Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;",
        "fetchShowCopyTradingGuideConfig",
        "()Ljava/lang/Boolean;",
        "fetchStrategyConfig",
        "fetchSymbolConfig1",
        "time",
        "fetchSymbolConfig2",
        "fetchUserSpreadConfig",
        "Lcom/kubi/kumex/data/platform/model/FuturesSpreadConfigEntity;",
        "getDiscoverTradeDataBySymbols",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "Lcom/kubi/quotefacade/entity/MarketListEntityItem;",
        "datasource",
        "customizations",
        "loadMiddleGroundResource",
        "Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;",
        "code",
        "resourcePositionBanner",
        "tradeType",
        "Companion",
        "KumexLib_googleRelease"
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
        "SMAP\nPlatformServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformServiceImpl.kt\ncom/kubi/futures/data/platform/PlatformServiceImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 8 Response.kt\ncom/kubi/network/websocket/model/Message\n*L\n1#1,779:1\n67#2:780\n67#2:808\n58#2,2:809\n144#2,2:825\n154#2:827\n144#2,2:829\n160#3,4:781\n160#3,4:786\n160#3,4:790\n160#3,4:794\n160#3,4:798\n160#3,4:813\n160#3,4:821\n126#3:837\n126#3:846\n1#4:785\n774#5:802\n865#5,2:803\n774#5:805\n865#5,2:806\n1869#5,2:811\n1869#5,2:817\n216#6,2:819\n178#7:828\n58#8,6:831\n64#8,2:838\n58#8,6:840\n64#8,2:847\n*S KotlinDebug\n*F\n+ 1 PlatformServiceImpl.kt\ncom/kubi/futures/data/platform/PlatformServiceImpl\n*L\n342#1:780\n314#1:808\n316#1:809,2\n769#1:825,2\n777#1:827\n566#1:829,2\n174#1:781,4\n205#1:786,4\n246#1:790,4\n288#1:794,4\n308#1:798,4\n455#1:813,4\n706#1:821,4\n673#1:837\n674#1:846\n311#1:802\n311#1:803,2\n312#1:805\n312#1:806,2\n408#1:811,2\n513#1:817,2\n631#1:819,2\n777#1:828\n673#1:831,6\n673#1:838,2\n674#1:840,6\n674#1:847,2\n*E\n"
    }
.end annotation


# static fields
.field public static final j:Lcom/kubi/futures/data/platform/PlatformServiceImpl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic k:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lth/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lir/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lth/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lio/reactivex/processors/BehaviorProcessor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/processors/BehaviorProcessor<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getSYMBOL_CONFIG()Ljava/lang/String;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/futures/data/platform/PlatformServiceImpl;

    .line 8
    .line 9
    const-string v4, "SYMBOL_CONFIG"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->k:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/futures/data/platform/PlatformServiceImpl$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->j:Lcom/kubi/futures/data/platform/PlatformServiceImpl$Companion;

    .line 32
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-static {}, Lmr/a;->g()Lretrofit2/Retrofit;

    move-result-object v0

    const-class v1, Lth/a;

    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lth/a;

    .line 13
    invoke-direct {p0, v0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;-><init>(Lth/a;)V

    return-void
.end method

.method public constructor <init>(Lth/a;)V
    .locals 2
    .param p1    # Lth/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "platformApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 2
    new-instance p1, Lth/a0;

    invoke-direct {p1}, Lth/a0;-><init>()V

    invoke-static {p1}, Lir/b;->a(Lkotlin/jvm/functions/Function0;)Lir/a;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->b:Lir/a;

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    new-instance p1, Lth/b0;

    invoke-direct {p1}, Lth/b0;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->d:Lkotlin/Lazy;

    .line 5
    new-instance p1, Lcom/kubi/restful/n$a;

    invoke-direct {p1}, Lcom/kubi/restful/n$a;-><init>()V

    invoke-virtual {p1}, Lcom/kubi/restful/n$a;->a()Lcom/kubi/restful/n;

    move-result-object p1

    const-class v1, Lth/c;

    invoke-virtual {p1, v1}, Lcom/kubi/restful/n;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lth/c;

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 6
    new-instance p1, Lth/c0;

    invoke-direct {p1}, Lth/c0;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->f:Lkotlin/Lazy;

    .line 7
    new-instance p1, Lth/d0;

    invoke-direct {p1}, Lth/d0;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->g:Lkotlin/Lazy;

    .line 8
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->h:Ljava/lang/Object;

    .line 9
    sget-object p1, Lzl/j;->a:Lzl/j;

    invoke-virtual {p1}, Lzl/j;->z()Ly70/g;

    move-result-object p1

    .line 10
    invoke-static {p1, v0}, Ly70/a;->e(Ly70/g;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 11
    invoke-static {p1}, Lio/reactivex/processors/BehaviorProcessor;->createDefault(Ljava/lang/Object;)Lio/reactivex/processors/BehaviorProcessor;

    move-result-object p1

    const-string v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->i:Lio/reactivex/processors/BehaviorProcessor;

    return-void
.end method

.method public static synthetic A0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->H1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;Ljava/lang/Object;)V

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
.end method

.method public static final A1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lsh0/b;
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Lsh0/b;

    .line 12
    return-object p0
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
.end method

.method public static synthetic B0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final B1(Ljava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSymbol()Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    move-result p0

    .line 14
    return p0
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
.end method

.method public static synthetic C0(Ljava/util/Map$Entry;)Lcom/kubi/kumex/data/platform/model/SymbolConfig;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->O1(Ljava/util/Map$Entry;)Lcom/kubi/kumex/data/platform/model/SymbolConfig;

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
.end method

.method public static final C1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static synthetic D0(Ljava/util/Map;)Lsh0/b;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->K1(Ljava/util/Map;)Lsh0/b;

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
.end method

.method public static final D1(Lcom/kubi/network/websocket/model/Message;)Z
    .locals 3

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "heartbeat"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    return v1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    const-string/jumbo v2, "socket"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getTopic()Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    const-string v2, "/contract/updated"

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getSubject()Ljava/lang/String;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    const-string v0, "contractUpdated"

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result p0

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    return v1

    .line 58
    :cond_1
    const/4 p0, 0x0

    .line 59
    return p0
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
.end method

.method public static synthetic E0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->c1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final E1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static synthetic F0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->u1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final F1(Lcom/kubi/network/websocket/model/Message;)Ljava/lang/Object;
    .locals 73

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "socket"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 50
    .line 51
    new-instance v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl$h;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$h;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 62
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    :catchall_0
    :cond_1
    :goto_0
    check-cast v3, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 65
    .line 66
    if-nez v3, :cond_5

    .line 67
    .line 68
    new-instance v4, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 69
    .line 70
    .line 71
    const v71, 0x1fffffff

    .line 72
    .line 73
    const/16 v72, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v9, 0x0

    .line 79
    const/4 v10, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v12, 0x0

    .line 82
    .line 83
    const-wide/16 v13, 0x0

    .line 84
    .line 85
    const-wide/16 v15, 0x0

    .line 86
    .line 87
    const-wide/16 v17, 0x0

    .line 88
    .line 89
    const/16 v19, 0x0

    .line 90
    .line 91
    const-wide/16 v20, 0x0

    .line 92
    .line 93
    const/16 v22, 0x0

    .line 94
    .line 95
    const/16 v23, 0x0

    .line 96
    .line 97
    const/16 v24, 0x0

    .line 98
    .line 99
    const/16 v25, 0x0

    .line 100
    .line 101
    const/16 v26, 0x0

    .line 102
    .line 103
    const/16 v27, 0x0

    .line 104
    .line 105
    const/16 v28, 0x0

    .line 106
    .line 107
    const/16 v29, 0x0

    .line 108
    .line 109
    const/16 v30, 0x0

    .line 110
    .line 111
    const/16 v31, 0x0

    .line 112
    .line 113
    const/16 v32, 0x0

    .line 114
    .line 115
    const/16 v33, 0x0

    .line 116
    .line 117
    const/16 v34, 0x0

    .line 118
    .line 119
    const/16 v35, 0x0

    .line 120
    .line 121
    const/16 v36, 0x0

    .line 122
    .line 123
    const/16 v37, 0x0

    .line 124
    .line 125
    const/16 v38, 0x0

    .line 126
    .line 127
    const/16 v39, 0x0

    .line 128
    .line 129
    const/16 v40, 0x0

    .line 130
    .line 131
    const/16 v41, 0x0

    .line 132
    .line 133
    const/16 v42, 0x0

    .line 134
    .line 135
    const/16 v43, 0x0

    .line 136
    .line 137
    const/16 v44, 0x0

    .line 138
    .line 139
    const/16 v45, 0x0

    .line 140
    .line 141
    const/16 v46, 0x0

    .line 142
    .line 143
    const/16 v47, 0x0

    .line 144
    .line 145
    const/16 v48, 0x0

    .line 146
    .line 147
    const/16 v49, 0x0

    .line 148
    .line 149
    const/16 v50, 0x0

    .line 150
    .line 151
    const/16 v51, 0x0

    .line 152
    .line 153
    const/16 v52, 0x0

    .line 154
    .line 155
    const/16 v53, 0x0

    .line 156
    .line 157
    const/16 v54, 0x0

    .line 158
    .line 159
    const/16 v55, 0x0

    .line 160
    .line 161
    const/16 v56, 0x0

    .line 162
    .line 163
    const/16 v57, 0x0

    .line 164
    .line 165
    const/16 v58, 0x0

    .line 166
    .line 167
    const/16 v59, 0x0

    .line 168
    .line 169
    const/16 v60, 0x0

    .line 170
    .line 171
    const/16 v61, 0x0

    .line 172
    .line 173
    const/16 v62, 0x0

    .line 174
    .line 175
    const/16 v63, 0x0

    .line 176
    .line 177
    const/16 v64, 0x0

    .line 178
    .line 179
    const/16 v65, 0x0

    .line 180
    .line 181
    const/16 v66, 0x0

    .line 182
    .line 183
    const/16 v67, 0x0

    .line 184
    .line 185
    const/16 v68, 0x0

    .line 186
    .line 187
    const/16 v69, 0x0

    .line 188
    .line 189
    const/16 v70, -0x1

    .line 190
    .line 191
    .line 192
    invoke-direct/range {v4 .. v72}, Lcom/kubi/kumex/data/platform/model/ContractEntity;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZIZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 193
    move-object v3, v4

    .line 194
    goto :goto_2

    .line 195
    .line 196
    .line 197
    :cond_2
    invoke-virtual {v1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 198
    move-result-object v0

    .line 199
    .line 200
    if-eqz v0, :cond_4

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    .line 207
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 208
    move-result v0

    .line 209
    .line 210
    if-eqz v0, :cond_3

    .line 211
    goto :goto_1

    .line 212
    .line 213
    .line 214
    :cond_3
    :try_start_1
    invoke-virtual {v1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 215
    move-result-object v0

    .line 216
    .line 217
    .line 218
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 221
    .line 222
    new-instance v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl$i;

    .line 223
    .line 224
    .line 225
    invoke-direct {v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$i;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 229
    move-result-object v1

    .line 230
    .line 231
    .line 232
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 233
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    .line 235
    :catchall_1
    :cond_4
    :goto_1
    check-cast v3, Ljava/util/List;

    .line 236
    .line 237
    if-nez v3, :cond_5

    .line 238
    .line 239
    .line 240
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 241
    move-result-object v3

    .line 242
    :cond_5
    :goto_2
    return-object v3
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
.end method

.method public static synthetic G0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->T1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final G1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method

.method public static synthetic H0(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->I1(Ljava/lang/Throwable;)Lkotlin/Unit;

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
.end method

.method public static final H1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;Ljava/lang/Object;)V
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/kubi/kumex/utils/v;->a:Lcom/kubi/kumex/utils/v;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v2, "observeContractUpdate:"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    const-string v2, "PlatformServiceImpl"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lcom/kubi/kumex/utils/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    check-cast p1, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->S1(Lcom/kubi/kumex/data/platform/model/ContractEntity;)V

    .line 34
    return-void

    .line 35
    .line 36
    :cond_0
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<com.kubi.kumex.data.platform.model.ContractEntity>"

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    check-cast p1, Ljava/util/List;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->v1(Ljava/util/List;)V

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
.end method

.method public static synthetic I0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;

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
.end method

.method public static final I1(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    const-string v0, "observeContractUpdate"

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lem/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

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
.end method

.method public static synthetic J0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static synthetic K0()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->Y0()Ljava/lang/String;

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

.method public static final K1(Ljava/util/Map;)Lsh0/b;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lio/reactivex/Flowable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    .line 13
    move-result-object p0

    .line 14
    return-object p0
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
.end method

.method public static synthetic L0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->C1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lsh0/b;
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Lsh0/b;

    .line 12
    return-object p0
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
.end method

.method public static synthetic M0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->b1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final M1(Ljava/lang/String;Ljava/util/Map$Entry;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    move-result p0

    .line 14
    return p0
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
.end method

.method public static synthetic N0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static synthetic O0(Lcom/kubi/network/websocket/model/Message;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->D1(Lcom/kubi/network/websocket/model/Message;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final O1(Ljava/util/Map$Entry;)Lcom/kubi/kumex/data/platform/model/SymbolConfig;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Lcom/kubi/kumex/data/platform/model/SymbolConfig;

    .line 12
    return-object p0
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
.end method

.method public static synthetic P0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->Z0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final P1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/kumex/data/platform/model/SymbolConfig;
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Lcom/kubi/kumex/data/platform/model/SymbolConfig;

    .line 12
    return-object p0
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
.end method

.method public static synthetic Q0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;Lcom/kubi/network/websocket/model/Message;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->h1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;Lcom/kubi/network/websocket/model/Message;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;

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
.end method

.method public static final Q1()Lth/i;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lth/i;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lth/i;-><init>()V

    .line 6
    return-object v0
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

.method public static synthetic R0()Lth/e;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->R1()Lth/e;

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

.method public static final R1()Lth/e;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->f()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lth/e;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lth/e;

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

.method public static synthetic S0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lsh0/b;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->A1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lsh0/b;

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
.end method

.method public static synthetic T0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->o1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final T1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/d;->B(Lth/d;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/Map;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static synthetic U0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->g1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final U1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/a;->y(Lth/a;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static synthetic V0()Ler/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->k1()Ler/a;

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

.method public static final V1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q()Lcom/kubi/kumex/data/platform/model/NoticeConfig;

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static synthetic W0(Ljava/lang/String;Ljava/util/Map$Entry;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->M1(Ljava/lang/String;Ljava/util/Map$Entry;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic X0(Ljava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->B1(Ljava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final Y0()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/service/a;->a:Lcom/kubi/kumex/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->g()Lcom/kubi/user/api/IUserService;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    const-string v2, "config_list"

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->g()Lcom/kubi/user/api/IUserService;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->d()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :cond_0
    return-object v2
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
.end method

.method public static final Z0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a0()J

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final a1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/d;->B(Lth/d;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/Map;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static final b1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/a;->w(Lth/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static final c1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/a;->y(Lth/a;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static final d1()Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/broker/m;->a:Lcom/kubi/broker/m;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v2, v1}, Lcom/kubi/broker/m;->l(Lcom/kubi/broker/m;Lcom/kubi/broker/MultiBizType;ILjava/lang/Object;)Ltg/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ltg/c;->U()Z

    .line 12
    .line 13
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final e1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lth/a;->z()Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lzl/j;->a:Lzl/j;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lzl/j;->T()Ly70/g;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0, p0}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 18
    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final f1(Lcom/kubi/network/websocket/model/Message;)Z
    .locals 3

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "heartbeat"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    return v1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    const-string/jumbo v2, "socket"

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getTopic()Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    const-string v2, "/contract/normal"

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/kubi/network/websocket/model/Message;->getSubject()Ljava/lang/String;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    const-string v0, "contractStatusChange"

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result p0

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    return v1

    .line 58
    :cond_1
    const/4 p0, 0x0

    .line 59
    return p0
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
.end method

.method public static final g1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static final h1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;Lcom/kubi/network/websocket/model/Message;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "socket"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->r(Ljava/util/Map;)Ljava/util/List;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lth/g;->c(Ljava/util/List;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;

    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-static {p1}, Lth/g;->b(Lcom/kubi/network/websocket/model/Message;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;

    .line 35
    move-result-object p0

    .line 36
    return-object p0
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

.method public static synthetic i0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->t1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final i1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;

    .line 12
    return-object p0
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
.end method

.method public static synthetic j0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic k0(Lcom/kubi/network/websocket/model/Message;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->F1(Lcom/kubi/network/websocket/model/Message;)Ljava/lang/Object;

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
.end method

.method public static final k1()Ler/a;
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ler/b;->b()Ler/a;

    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    return-object v0

    .line 6
    .line 7
    .line 8
    :catchall_0
    invoke-static {}, Lcom/kubi/router/utils/b;->a()Landroid/app/Application;

    .line 9
    .line 10
    new-instance v0, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/kubi/router/utils/b;->a()Landroid/app/Application;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "getApp(...)"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/BKumexWebSocketStartUpTask;->run(Landroid/app/Application;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ler/b;->b()Ler/a;

    .line 29
    move-result-object v0

    .line 30
    return-object v0
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
.end method

.method public static synthetic l0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->l1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final l1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/a;->w(Lth/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static synthetic m0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->x1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final m1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/a;->w(Lth/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static synthetic n0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->w1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

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
.end method

.method public static final n1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/a;->y(Lth/a;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static synthetic o0()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->d1()Lkotlin/Unit;

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

.method public static final o1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/a;->y(Lth/a;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static synthetic p0(Lcom/kubi/network/websocket/model/Message;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->f1(Lcom/kubi/network/websocket/model/Message;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic q0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->m1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static synthetic r0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->U1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static synthetic s0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/kumex/data/platform/model/SymbolConfig;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->P1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/kumex/data/platform/model/SymbolConfig;

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
.end method

.method public static synthetic t0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->n1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final t1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a0()J

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static synthetic u0(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->V1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;

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
.end method

.method public static final u1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0, v1, v0}, Lth/d;->B(Lth/d;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/Map;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0
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
.end method

.method public static synthetic v0(Ljava/util/List;)Lsh0/b;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->z1(Ljava/util/List;)Lsh0/b;

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
.end method

.method public static synthetic w0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lsh0/b;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lsh0/b;

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
.end method

.method public static final w1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lth/n0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lth/n0;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/utils/x0;->d(Lkotlin/jvm/functions/Function0;)V

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
.end method

.method public static synthetic x0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->G1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static final x1(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q()Lcom/kubi/kumex/data/platform/model/NoticeConfig;

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static synthetic y0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->E1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic z0()Lth/i;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->Q1()Lth/i;

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

.method public static final z1(Ljava/util/List;)Lsh0/b;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lio/reactivex/Flowable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->G()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lfm/e;->a(Ljava/util/Map;)Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public C(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/FuturesSpreadConfigEntity;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/km/user-spread-config"
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "symbol"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lth/a;->C(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/FuturesSpreadConfigEntity;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public D(Ljava/lang/String;Z)Lcom/kubi/kumex/data/platform/model/ContractEntity;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "symbol"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    new-instance v0, Lth/m0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0}, Lth/m0;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 12
    .line 13
    const-string v1, "contract_list"

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 20
    const/4 v3, 0x3

    .line 21
    const/4 v4, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v4, v4, v3, v4}, Lth/c;->g(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/List;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    move-result v3

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object v3

    .line 40
    move-object v5, v3

    .line 41
    .line 42
    check-cast v5, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSymbol()Ljava/lang/String;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    .line 49
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    move-result v5

    .line 51
    .line 52
    if-eqz v5, :cond_0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v3, v4

    .line 55
    .line 56
    :goto_0
    check-cast v3, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 57
    const/4 v5, 0x1

    .line 58
    .line 59
    if-nez v3, :cond_b

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    if-eqz v0, :cond_7

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->getValue()Ljava/lang/String;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 76
    .line 77
    new-instance v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl$d;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$d;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 88
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-object v0, v4

    .line 91
    :goto_1
    move-object v7, v0

    .line 92
    .line 93
    check-cast v7, Ljava/util/List;

    .line 94
    .line 95
    if-eqz v7, :cond_3

    .line 96
    .line 97
    .line 98
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    move-result v0

    .line 100
    .line 101
    if-eqz v0, :cond_2

    .line 102
    goto :goto_2

    .line 103
    .line 104
    :cond_2
    iget-object v6, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 105
    const/4 v10, 0x6

    .line 106
    const/4 v11, 0x0

    .line 107
    const/4 v8, 0x0

    .line 108
    const/4 v9, 0x0

    .line 109
    .line 110
    .line 111
    invoke-static/range {v6 .. v11}, Lth/c;->f0(Lth/c;Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 112
    .line 113
    :cond_3
    :goto_2
    if-eqz v7, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    move-result v1

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    move-result-object v1

    .line 128
    move-object v3, v1

    .line 129
    .line 130
    check-cast v3, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSymbol()Ljava/lang/String;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    .line 137
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    move-result v3

    .line 139
    .line 140
    if-eqz v3, :cond_4

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    move-object v1, v4

    .line 143
    .line 144
    :goto_3
    check-cast v1, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 145
    goto :goto_4

    .line 146
    :cond_6
    move-object v1, v4

    .line 147
    :goto_4
    move-object v3, v1

    .line 148
    goto :goto_5

    .line 149
    :cond_7
    move-object v3, v4

    .line 150
    .line 151
    :goto_5
    if-nez v3, :cond_b

    .line 152
    .line 153
    if-eqz p2, :cond_a

    .line 154
    .line 155
    .line 156
    :try_start_1
    invoke-static {p0, v4, v5, v4}, Lth/a;->y(Lth/a;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    .line 157
    move-result-object p2

    .line 158
    .line 159
    .line 160
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    move-result-object p2

    .line 162
    .line 163
    .line 164
    :cond_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    move-result v0

    .line 166
    .line 167
    if-eqz v0, :cond_9

    .line 168
    .line 169
    .line 170
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    move-result-object v0

    .line 172
    move-object v1, v0

    .line 173
    .line 174
    check-cast v1, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSymbol()Ljava/lang/String;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    move-result v1

    .line 183
    .line 184
    if-eqz v1, :cond_8

    .line 185
    goto :goto_6

    .line 186
    :catchall_1
    move-exception v0

    .line 187
    move-object p1, v0

    .line 188
    goto :goto_7

    .line 189
    :cond_9
    move-object v0, v4

    .line 190
    .line 191
    :goto_6
    check-cast v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 192
    move-object v4, v0

    .line 193
    goto :goto_8

    .line 194
    .line 195
    :goto_7
    const-string p2, "PlatformServiceImpl-getContract-FetchContractList"

    .line 196
    .line 197
    .line 198
    invoke-static {p1, p2}, Lem/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 199
    :cond_a
    :goto_8
    move-object v3, v4

    .line 200
    .line 201
    :cond_b
    sget-object p1, Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;->CONTRACT_ENTITY_QUERY:Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;

    .line 202
    .line 203
    if-nez v3, :cond_c

    .line 204
    move v2, v5

    .line 205
    .line 206
    .line 207
    :cond_c
    invoke-static {p1, v2}, Lqq/h;->d(Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;I)V

    .line 208
    return-object v3
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
.end method

.method public F()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->H()Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v1, Lzl/j;->a:Lzl/j;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lzl/j;->Q()Ly70/g;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    .line 21
    const-string v1, "fetchRobotSiteConfig"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lem/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 25
    :cond_0
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
.end method

.method public G()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->s1()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lth/w;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Lth/w;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v2, v1}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 16
    const/4 v1, 0x3

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v2, v1, v2}, Lth/c;->q0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/Map;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    return-object v0

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    const-string v1, "config_list"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->getValue()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 47
    .line 48
    new-instance v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl$f;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$f;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 59
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-object v0, v2

    .line 62
    :goto_0
    move-object v4, v0

    .line 63
    .line 64
    check-cast v4, Ljava/util/Map;

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    iget-object v3, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 69
    const/4 v7, 0x6

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    .line 74
    .line 75
    invoke-static/range {v3 .. v8}, Lth/c;->u(Lth/c;Ljava/util/Map;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 76
    move-object v2, v4

    .line 77
    .line 78
    :cond_1
    if-nez v2, :cond_2

    .line 79
    .line 80
    new-instance v2, Ljava/util/HashMap;

    .line 81
    .line 82
    .line 83
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 84
    :cond_2
    return-object v2
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
.end method

.method public H()Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/robot/task/common/site-config"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->H()Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public I(Ljava/lang/String;)Lio/reactivex/Flowable;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Flowable<",
            "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "symbol"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x3

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v1, v2, v1}, Lth/c;->N(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lio/reactivex/Flowable;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Lth/o0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Lth/o0;-><init>()V

    .line 20
    .line 21
    new-instance v2, Lth/p0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v1}, Lth/p0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lio/reactivex/Flowable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    new-instance v1, Lth/r0;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, p1}, Lth/r0;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    new-instance p1, Lth/s0;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v1}, Lth/s0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lio/reactivex/Flowable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Flowable;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    const-string v0, "filter(...)"

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    return-object p1
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
.end method

.method public J(Ljava/util/List;)V
    .locals 8
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "quotes"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->G()Ljava/util/Map;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, com.kubi.kumex.data.platform.model.SymbolConfig>"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableMap(Ljava/lang/Object;)Ljava/util/Map;

    .line 18
    move-result-object v3

    .line 19
    monitor-enter v3

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Ljava/util/Map$Entry;

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 47
    move-result v2

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    check-cast v1, Ljava/util/Map;

    .line 56
    .line 57
    const-string v2, "favourite"

    .line 58
    .line 59
    .line 60
    const-string/jumbo v4, "true"

    .line 61
    .line 62
    .line 63
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object p1, v0

    .line 67
    goto :goto_1

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    check-cast v1, Ljava/util/Map;

    .line 74
    .line 75
    const-string v2, "favourite"

    .line 76
    .line 77
    const-string v4, "false"

    .line 78
    .line 79
    .line 80
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_1
    iget-object v2, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 84
    const/4 v6, 0x6

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v4, 0x0

    .line 87
    const/4 v5, 0x0

    .line 88
    .line 89
    .line 90
    invoke-static/range {v2 .. v7}, Lth/c;->u(Lth/c;Ljava/util/Map;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    monitor-exit v3

    .line 92
    return-void

    .line 93
    :goto_1
    monitor-exit v3

    .line 94
    throw p1
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
.end method

.method public K()Lio/reactivex/disposables/Disposable;
    .locals 13
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "/contract/updated"

    .line 3
    .line 4
    :try_start_0
    new-instance v1, Lcom/kubi/network/websocket/observable/c;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/network/websocket/model/Request;->Companion:Lcom/kubi/network/websocket/model/Request$Companion;

    .line 7
    .line 8
    new-instance v3, Lcom/kubi/network/websocket/model/HeartbeatRequest;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v4, "subscribe"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->r1()Lth/e;

    .line 15
    move-result-object v5

    .line 16
    .line 17
    .line 18
    invoke-interface {v5}, Lth/e;->a()Lokhttp3/Request;

    .line 19
    move-result-object v5

    .line 20
    .line 21
    const/16 v10, 0x3c

    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v3 .. v11}, Lcom/kubi/network/websocket/model/HeartbeatRequest;-><init>(Ljava/lang/String;Lokhttp3/Request;ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    .line 32
    filled-new-array {v0}, [Ljava/lang/String;

    .line 33
    move-result-object v4

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3, v4}, Lcom/kubi/network/websocket/model/Request$Companion;->subscribe(Lcom/kubi/network/websocket/model/HeartbeatRequest;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    new-instance v4, Lcom/kubi/network/websocket/model/HeartbeatRequest;

    .line 40
    .line 41
    .line 42
    const-string/jumbo v5, "unsubscribe"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->r1()Lth/e;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    .line 49
    invoke-interface {v6}, Lth/e;->a()Lokhttp3/Request;

    .line 50
    move-result-object v6

    .line 51
    .line 52
    const/16 v11, 0x3c

    .line 53
    const/4 v12, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    .line 59
    .line 60
    invoke-direct/range {v4 .. v12}, Lcom/kubi/network/websocket/model/HeartbeatRequest;-><init>(Ljava/lang/String;Lokhttp3/Request;ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    filled-new-array {v0}, [Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v4, v0}, Lcom/kubi/network/websocket/model/Request$Companion;->unsubscribe(Lcom/kubi/network/websocket/model/HeartbeatRequest;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->p1()Ler/a;

    .line 72
    move-result-object v6

    .line 73
    .line 74
    const/16 v7, 0xc

    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    move-object v2, v3

    .line 79
    move-object v3, v0

    .line 80
    .line 81
    .line 82
    invoke-direct/range {v1 .. v8}, Lcom/kubi/network/websocket/observable/c;-><init>(Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Message;ZLer/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    .line 84
    new-instance v0, Lth/e0;

    .line 85
    .line 86
    .line 87
    invoke-direct {v0}, Lth/e0;-><init>()V

    .line 88
    .line 89
    new-instance v2, Lth/g0;

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, v0}, Lth/g0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    new-instance v1, Lth/h0;

    .line 99
    .line 100
    .line 101
    invoke-direct {v1}, Lth/h0;-><init>()V

    .line 102
    .line 103
    new-instance v2, Lth/i0;

    .line 104
    .line 105
    .line 106
    invoke-direct {v2, v1}, Lth/i0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lo00/f;->f()Lio/reactivex/Scheduler;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lo00/f;->f()Lio/reactivex/Scheduler;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    new-instance v1, Lth/j0;

    .line 129
    .line 130
    .line 131
    invoke-direct {v1, p0}, Lth/j0;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 132
    .line 133
    new-instance v2, Lth/k0;

    .line 134
    .line 135
    .line 136
    invoke-direct {v2}, Lth/k0;-><init>()V

    .line 137
    .line 138
    new-instance v3, Lth/l0;

    .line 139
    .line 140
    .line 141
    invoke-direct {v3, v2}, Lth/l0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    return-object v0

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    .line 152
    const-string v1, "observeContractUpdate"

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v1}, Lem/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-static {}, Lio/reactivex/disposables/Disposables;->disposed()Lio/reactivex/disposables/Disposable;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    .line 162
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 163
    return-object v0
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
.end method

.method public L(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/km/contracts/risk-limit"
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "symbol"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lth/a;->L(Ljava/lang/String;)Ljava/util/List;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public M(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/kumex/data/platform/model/FuturesCampaignActivityEntity;
    .locals 7
    .param p1    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "page"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "pageSize"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "lang"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "categories"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "weight"
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/cms/articles"
    .end annotation

    .line 1
    .line 2
    const-string v0, "lang"

    .line 3
    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "categories"

    .line 8
    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 13
    move v2, p1

    .line 14
    move v3, p2

    .line 15
    move-object v4, p3

    .line 16
    move-object v5, p4

    .line 17
    move-object v6, p5

    .line 18
    .line 19
    .line 20
    invoke-interface/range {v1 .. v6}, Lth/a;->M(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/kumex/data/platform/model/FuturesCampaignActivityEntity;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
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
.end method

.method public N()Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v2, v2, v1, v2}, Lth/c;->Y(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;->getImhedgeRate()Ljava/math/BigDecimal;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    sget-object v1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 17
    const/4 v3, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v1, v3, v2}, Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;->copy$default(Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;->getMmhedgeRate()Ljava/math/BigDecimal;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    sget-object v1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 30
    const/4 v3, 0x2

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3, v2}, Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;->copy$default(Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;

    .line 34
    move-result-object v0

    .line 35
    :cond_1
    return-object v0
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
.end method

.method public P()Lio/reactivex/Flowable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Flowable<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v1, v2, v1}, Lth/c;->l(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lio/reactivex/Flowable;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public Q()Lio/reactivex/Flowable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Flowable<",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v1, v2, v1}, Lth/c;->N(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lio/reactivex/Flowable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->k()Ljava/util/List;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lio/reactivex/Flowable;->just(Ljava/lang/Object;)Lio/reactivex/Flowable;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lio/reactivex/Flowable;->onErrorResumeNext(Lsh0/b;)Lio/reactivex/Flowable;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "onErrorResumeNext(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    return-object v0
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
.end method

.method public R(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "symbolMap"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->y1(Ljava/util/Map;)V

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
.end method

.method public S()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kumex-trade/user/contractsConfigs"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->S()Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final S1(Lcom/kubi/kumex/data/platform/model/ContractEntity;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iget-object v1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->h:Ljava/lang/Object;

    .line 4
    monitor-enter v1

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->k()Ljava/util/List;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v4, v0, v4}, Lth/a;->y(Lth/a;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_3

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 29
    move-result v3

    .line 30
    const/4 v5, 0x0

    .line 31
    .line 32
    :goto_0
    if-ge v5, v3, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    check-cast v6, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSymbol()Ljava/lang/String;

    .line 44
    move-result-object v7

    .line 45
    .line 46
    .line 47
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSymbol()Ljava/lang/String;

    .line 52
    move-result-object v8

    .line 53
    .line 54
    .line 55
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v8

    .line 57
    .line 58
    .line 59
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    move-result v7

    .line 61
    .line 62
    if-eqz v7, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-interface {v2, v5, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 66
    move-object v4, v6

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/2addr v5, v0

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :cond_2
    :goto_1
    if-nez v4, :cond_3

    .line 72
    .line 73
    .line 74
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {p0, v2}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->v1(Ljava/util/List;)V

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :goto_2
    monitor-exit v1

    .line 81
    return-void

    .line 82
    :goto_3
    monitor-exit v1

    .line 83
    throw p1
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
.end method

.method public T()Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lzl/j;->a:Lzl/j;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lzl/j;->T()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Ly70/a;->a:Ly70/a;

    .line 9
    .line 10
    const-class v2, Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0, v2, v3}, Ly70/a;->j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public U()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/km/user/agreements"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->U()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public W()Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/nasdaq/market-status"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->W()Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public X(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/SymbolConfig;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "symbol"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->G()Ljava/util/Map;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    move-object v3, v1

    .line 31
    .line 32
    check-cast v3, Ljava/util/Map$Entry;

    .line 33
    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v1, v2

    .line 45
    .line 46
    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    check-cast p1, Lcom/kubi/kumex/data/platform/model/SymbolConfig;

    .line 55
    return-object p1

    .line 56
    :cond_2
    return-object v2
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
.end method

.method public Y(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "symbol"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 9
    const/4 v1, 0x3

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v2, v2, v1, v2}, Lth/c;->S(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;->getPausedContracts()Ljava/util/List;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v1, v2

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const-string p1, "Paused"

    .line 39
    return-object p1

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;->getCancelOnlyContracts()Ljava/util/List;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 49
    move-result p1

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 57
    move-result p1

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    const-string p1, "CancelOnly"

    .line 62
    return-object p1

    .line 63
    .line 64
    :cond_3
    const-string p1, "Open"

    .line 65
    return-object p1
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
.end method

.method public Z(Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/CoinEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "platfrom"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lth/a;->Z(Ljava/lang/String;)Ljava/util/List;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    new-instance p1, Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 14
    .line 15
    .line 16
    invoke-direct {p1}, Lcom/kubi/kumex/data/platform/model/DictEntity;-><init>()V

    .line 17
    .line 18
    const-string v0, "coin_list"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->setKey(Ljava/lang/String;)V

    .line 22
    const/4 v0, 0x2

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3, v0, v1}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->setValue(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    filled-new-array {p1}, [Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lth/i;->d(Ljava/util/List;)V

    .line 47
    .line 48
    iget-object v1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 49
    const/4 v5, 0x6

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v1 .. v6}, Lth/c;->X(Lth/c;Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 56
    return-object v2
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
.end method

.method public a(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "map"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/kumex/service/a;->a:Lcom/kubi/kumex/service/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->g()Lcom/kubi/user/api/IUserService;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->y1(Ljava/util/Map;)V

    .line 22
    return-object v1

    .line 23
    .line 24
    :cond_0
    const-string v0, "isNetwork"

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    check-cast v0, Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->y1(Ljava/util/Map;)V

    .line 52
    .line 53
    iget-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 57
    return-object v1

    .line 58
    .line 59
    :cond_1
    const-string v0, "leverage"

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 63
    move-result v1

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    check-cast v0, Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    const-string v2, "defaultLeverage"

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    move-object v1, p1

    .line 91
    .line 92
    :goto_0
    sget-object v0, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-interface {v0}, Lcom/kubi/broker/f;->x()Lcom/kubi/broker/MultiBizType;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    sget-object v2, Lcom/kubi/broker/MultiBizType;->COPY_TRADING:Lcom/kubi/broker/MultiBizType;

    .line 103
    .line 104
    if-ne v0, v2, :cond_3

    .line 105
    .line 106
    sget-object v0, Lcom/kubi/copytrading/ICopyTradingService;->a:Lcom/kubi/copytrading/ICopyTradingService$Companion;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/kubi/copytrading/ICopyTradingService$Companion;->get()Lcom/kubi/copytrading/ICopyTradingService;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    .line 113
    invoke-interface {v0, v1}, Lcom/kubi/copytrading/ICopyTradingService;->a(Ljava/util/Map;)Ljava/lang/Object;

    .line 114
    move-result-object v0

    .line 115
    goto :goto_1

    .line 116
    .line 117
    :cond_3
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 118
    .line 119
    .line 120
    invoke-interface {v0, v1}, Lth/a;->a(Ljava/util/Map;)Ljava/lang/Object;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    .line 124
    :goto_1
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->y1(Ljava/util/Map;)V

    .line 125
    .line 126
    iget-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 130
    return-object v0
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
.end method

.method public a0()J
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    .line 7
    iget-object v4, v0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 8
    .line 9
    .line 10
    invoke-interface {v4}, Lth/a;->a0()J

    .line 11
    move-result-wide v4

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    move-result-wide v6

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    move-result-wide v8

    .line 20
    sub-long/2addr v8, v4

    .line 21
    .line 22
    .line 23
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    .line 24
    move-result-wide v8

    .line 25
    .line 26
    .line 27
    const-wide/32 v10, 0xea60

    .line 28
    .line 29
    cmp-long v8, v8, v10

    .line 30
    .line 31
    if-gez v8, :cond_0

    .line 32
    .line 33
    iget-object v9, v0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 37
    move-result-wide v10

    .line 38
    move-wide v11, v10

    .line 39
    .line 40
    new-array v10, v3, [J

    .line 41
    .line 42
    aput-wide v6, v10, v2

    .line 43
    .line 44
    aput-wide v11, v10, v1

    .line 45
    const/4 v13, 0x6

    .line 46
    const/4 v14, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v12, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static/range {v9 .. v14}, Lth/c;->r(Lth/c;[JLcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 52
    return-wide v4

    .line 53
    .line 54
    :cond_0
    iget-object v15, v0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    move-result-wide v6

    .line 59
    .line 60
    new-array v3, v3, [J

    .line 61
    .line 62
    aput-wide v4, v3, v2

    .line 63
    .line 64
    aput-wide v6, v3, v1

    .line 65
    .line 66
    const/16 v19, 0x6

    .line 67
    .line 68
    const/16 v20, 0x0

    .line 69
    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    const/16 v18, 0x0

    .line 73
    .line 74
    move-object/from16 v16, v3

    .line 75
    .line 76
    .line 77
    invoke-static/range {v15 .. v20}, Lth/c;->r(Lth/c;[JLcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 78
    return-wide v4
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
.end method

.method public b(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "Cache-Time"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kumex/user-contracts-config"
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "time"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lth/a;->b(Ljava/lang/String;)Ljava/util/Map;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public b0()Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->b0()Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 9
    const/4 v5, 0x6

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v1 .. v6}, Lth/c;->p0(Lth/c;Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 16
    return-object v2
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public c(Z)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Futures:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->s1()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    new-instance v1, Lth/l;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0}, Lth/l;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p1, v1}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    new-instance v0, Lth/m;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0}, Lth/m;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 27
    .line 28
    const-string v1, "contract_list"

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    new-instance v0, Lth/n;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p0}, Lth/n;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 37
    .line 38
    const-string v1, "notice_config"

    .line 39
    .line 40
    .line 41
    invoke-static {v1, p1, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 42
    return-void
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
.end method

.method public d()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/CoinEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lth/v;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lth/v;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 6
    .line 7
    const-string v1, "coin_list"

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 14
    const/4 v2, 0x3

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v3, v3, v2, v3}, Lth/c;->R(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/List;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v0

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->getValue()Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 46
    .line 47
    new-instance v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl$c;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$c;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 58
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-object v0, v3

    .line 61
    :goto_1
    move-object v5, v0

    .line 62
    .line 63
    check-cast v5, Ljava/util/List;

    .line 64
    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    iget-object v4, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 68
    const/4 v8, 0x6

    .line 69
    const/4 v9, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    .line 73
    .line 74
    invoke-static/range {v4 .. v9}, Lth/c;->X(Lth/c;Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 75
    move-object v3, v5

    .line 76
    .line 77
    :cond_2
    if-eqz v3, :cond_4

    .line 78
    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 81
    move-result v0

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    return-object v3

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 89
    move-result-object v0

    .line 90
    return-object v0
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public d0(Ljava/lang/Boolean;)Ljava/util/Map;
    .locals 11
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/service/a;->a:Lcom/kubi/kumex/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->g()Lcom/kubi/user/api/IUserService;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_7

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->g()Lcom/kubi/user/api/IUserService;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Lcom/kubi/user/api/IUserService;->d()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v2

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->j1()Ljava/util/List;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 49
    :cond_1
    const/4 v2, 0x0

    .line 50
    .line 51
    :try_start_0
    new-instance v3, Lcom/kubi/kumex/data/platform/model/LeverageConfig;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->g()Lcom/kubi/user/api/IUserService;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    .line 58
    invoke-interface {v4}, Lcom/kubi/user/api/IUserService;->d()Ljava/lang/String;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->d()Lcom/kubi/otc/api/IOtcService;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-interface {v5}, Lcom/kubi/otc/api/IOtcService;->k()Z

    .line 67
    move-result v5

    .line 68
    .line 69
    .line 70
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    move-result-object v5

    .line 72
    .line 73
    iget-object v6, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 74
    .line 75
    .line 76
    invoke-interface {v6}, Lth/a;->S()Ljava/util/Map;

    .line 77
    move-result-object v6

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/kubi/kumex/service/a;->d()Lcom/kubi/otc/api/IOtcService;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    .line 84
    invoke-interface {v0}, Lcom/kubi/otc/api/IOtcService;->d()I

    .line 85
    move-result v0

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    .line 92
    invoke-direct {v3, v4, v5, v6, v0}, Lcom/kubi/kumex/data/platform/model/LeverageConfig;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :goto_0
    move-object v5, v3

    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 101
    const/4 v3, 0x3

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v2, v2, v3, v2}, Lth/c;->j0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/LeverageConfig;

    .line 105
    move-result-object v3

    .line 106
    goto :goto_0

    .line 107
    .line 108
    :goto_1
    iget-object v4, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 109
    const/4 v8, 0x6

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    .line 114
    .line 115
    invoke-static/range {v4 .. v9}, Lth/c;->Q(Lth/c;Lcom/kubi/kumex/data/platform/model/LeverageConfig;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 116
    .line 117
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 118
    const/4 v3, 0x1

    .line 119
    const/4 v4, 0x0

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 123
    move-result v0

    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    const-string v0, "0"

    .line 128
    goto :goto_2

    .line 129
    .line 130
    :cond_2
    const-string v0, "60000"

    .line 131
    .line 132
    :goto_2
    sget-object v3, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 136
    move-result-object v3

    .line 137
    .line 138
    .line 139
    invoke-interface {v3}, Lcom/kubi/broker/f;->x()Lcom/kubi/broker/MultiBizType;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    sget-object v6, Lcom/kubi/broker/MultiBizType;->COPY_TRADING:Lcom/kubi/broker/MultiBizType;

    .line 143
    .line 144
    if-ne v3, v6, :cond_3

    .line 145
    .line 146
    sget-object v3, Lcom/kubi/copytrading/ICopyTradingService;->a:Lcom/kubi/copytrading/ICopyTradingService$Companion;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Lcom/kubi/copytrading/ICopyTradingService$Companion;->get()Lcom/kubi/copytrading/ICopyTradingService;

    .line 150
    move-result-object v3

    .line 151
    .line 152
    .line 153
    invoke-interface {v3, v0}, Lcom/kubi/copytrading/ICopyTradingService;->b(Ljava/lang/String;)Ljava/util/Map;

    .line 154
    move-result-object v0

    .line 155
    goto :goto_3

    .line 156
    .line 157
    :cond_3
    iget-object v3, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 158
    .line 159
    .line 160
    invoke-interface {v3, v0}, Lth/a;->b(Ljava/lang/String;)Ljava/util/Map;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    .line 164
    :goto_3
    invoke-virtual {v5}, Lcom/kubi/kumex/data/platform/model/LeverageConfig;->getLeverage()Ljava/util/Map;

    .line 165
    move-result-object v3

    .line 166
    .line 167
    if-nez v3, :cond_4

    .line 168
    .line 169
    new-instance v3, Ljava/util/HashMap;

    .line 170
    .line 171
    .line 172
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 173
    .line 174
    .line 175
    :cond_4
    invoke-static {v0, v3}, Lth/g;->a(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 176
    move-result-object v6

    .line 177
    .line 178
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    move-result p1

    .line 183
    .line 184
    if-eqz p1, :cond_6

    .line 185
    .line 186
    .line 187
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 188
    move-result p1

    .line 189
    .line 190
    if-nez p1, :cond_6

    .line 191
    .line 192
    .line 193
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    move-result-object p1

    .line 195
    .line 196
    .line 197
    :cond_5
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    move-result v0

    .line 199
    .line 200
    if-eqz v0, :cond_6

    .line 201
    .line 202
    .line 203
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    check-cast v0, Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    check-cast v0, Lcom/kubi/kumex/data/platform/model/SymbolConfig;

    .line 213
    .line 214
    if-eqz v0, :cond_5

    .line 215
    .line 216
    const-string v1, "favourite"

    .line 217
    .line 218
    .line 219
    const-string/jumbo v3, "true"

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    check-cast v0, Ljava/lang/String;

    .line 226
    goto :goto_4

    .line 227
    .line 228
    :cond_6
    new-instance p1, Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 229
    .line 230
    .line 231
    invoke-direct {p1}, Lcom/kubi/kumex/data/platform/model/DictEntity;-><init>()V

    .line 232
    .line 233
    const-string v0, "config_list"

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->setKey(Ljava/lang/String;)V

    .line 237
    const/4 v0, 0x2

    .line 238
    .line 239
    .line 240
    invoke-static {v6, v4, v0, v2}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 241
    move-result-object v0

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->setValue(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 248
    move-result-object v0

    .line 249
    .line 250
    .line 251
    filled-new-array {p1}, [Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 252
    move-result-object p1

    .line 253
    .line 254
    .line 255
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 256
    move-result-object p1

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, p1}, Lth/i;->d(Ljava/util/List;)V

    .line 260
    .line 261
    iget-object v5, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 262
    const/4 v9, 0x6

    .line 263
    const/4 v10, 0x0

    .line 264
    const/4 v7, 0x0

    .line 265
    const/4 v8, 0x0

    .line 266
    .line 267
    .line 268
    invoke-static/range {v5 .. v10}, Lth/c;->u(Lth/c;Ljava/util/Map;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 269
    return-object v6

    .line 270
    .line 271
    :cond_7
    :goto_5
    new-instance p1, Ljava/util/HashMap;

    .line 272
    .line 273
    .line 274
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 275
    return-object p1
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
.end method

.method public e()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lth/o;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lth/o;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 6
    .line 7
    const-string v1, "SERVER_TIME"

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v1, "config_list"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->s1()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    new-instance v1, Lth/p;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, p0}, Lth/p;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2, v1}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-string v1, "coin_list"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Lth/q;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p0}, Lth/q;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    const-string v1, "contract_list"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    new-instance v0, Lth/r;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, p0}, Lth/r;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 76
    .line 77
    :cond_2
    new-instance v0, Lth/s;

    .line 78
    .line 79
    .line 80
    invoke-direct {v0}, Lth/s;-><init>()V

    .line 81
    .line 82
    const-string v1, "fetchFeatureAvailable"

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lcom/kubi/futures/trade/submit/panel/tradeType/twap/z;->a()Z

    .line 89
    move-result v0

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    new-instance v0, Lth/t;

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, p0}, Lth/t;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 97
    .line 98
    const-string v1, "StrategyOrderConfig"

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 102
    :cond_3
    return-void
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
.end method

.method public e0()Lio/reactivex/Observable;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/network/websocket/observable/c;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/network/websocket/model/Request;->Companion:Lcom/kubi/network/websocket/model/Request$Companion;

    .line 5
    .line 6
    new-instance v2, Lcom/kubi/network/websocket/model/HeartbeatRequest;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->r1()Lth/e;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    invoke-interface {v3}, Lth/e;->a()Lokhttp3/Request;

    .line 14
    move-result-object v4

    .line 15
    .line 16
    const/16 v9, 0x1c

    .line 17
    const/4 v10, 0x0

    .line 18
    .line 19
    .line 20
    const-string/jumbo v3, "subscribe"

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    .line 25
    const/16 v8, 0x7530

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v2 .. v10}, Lcom/kubi/network/websocket/model/HeartbeatRequest;-><init>(Ljava/lang/String;Lokhttp3/Request;ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    .line 30
    const-string v3, "/contract/normal"

    .line 31
    .line 32
    .line 33
    filled-new-array {v3}, [Ljava/lang/String;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v4}, Lcom/kubi/network/websocket/model/Request$Companion;->subscribe(Lcom/kubi/network/websocket/model/HeartbeatRequest;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    new-instance v4, Lcom/kubi/network/websocket/model/HeartbeatRequest;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->r1()Lth/e;

    .line 44
    move-result-object v5

    .line 45
    .line 46
    .line 47
    invoke-interface {v5}, Lth/e;->a()Lokhttp3/Request;

    .line 48
    move-result-object v6

    .line 49
    .line 50
    const/16 v11, 0x1c

    .line 51
    const/4 v12, 0x0

    .line 52
    .line 53
    .line 54
    const-string/jumbo v5, "unsubscribe"

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    .line 58
    const/16 v10, 0x7530

    .line 59
    .line 60
    .line 61
    invoke-direct/range {v4 .. v12}, Lcom/kubi/network/websocket/model/HeartbeatRequest;-><init>(Ljava/lang/String;Lokhttp3/Request;ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 62
    .line 63
    .line 64
    filled-new-array {v3}, [Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v4, v3}, Lcom/kubi/network/websocket/model/Request$Companion;->unsubscribe(Lcom/kubi/network/websocket/model/HeartbeatRequest;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->p1()Ler/a;

    .line 73
    move-result-object v5

    .line 74
    .line 75
    const/16 v6, 0xc

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v3, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    move-object v13, v2

    .line 80
    move-object v2, v1

    .line 81
    move-object v1, v13

    .line 82
    .line 83
    .line 84
    invoke-direct/range {v0 .. v7}, Lcom/kubi/network/websocket/observable/c;-><init>(Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Message;ZLer/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 85
    .line 86
    new-instance v1, Lth/w0;

    .line 87
    .line 88
    .line 89
    invoke-direct {v1}, Lth/w0;-><init>()V

    .line 90
    .line 91
    new-instance v2, Lth/x0;

    .line 92
    .line 93
    .line 94
    invoke-direct {v2, v1}, Lth/x0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    const-wide/16 v1, 0x5

    .line 101
    .line 102
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/Observable;->debounce(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    new-instance v1, Lth/y0;

    .line 109
    .line 110
    .line 111
    invoke-direct {v1, p0}, Lth/y0;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 112
    .line 113
    new-instance v2, Lth/k;

    .line 114
    .line 115
    .line 116
    invoke-direct {v2, v1}, Lth/k;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    const-string v1, "map(...)"

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    return-object v0
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
.end method

.method public f(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "code"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/platform-resource-position/position"
    .end annotation

    .line 1
    .line 2
    const-string v0, "code"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lth/a;->f(Ljava/lang/String;)Ljava/util/Map;

    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public f0(Ljava/lang/String;)Lio/reactivex/Flowable;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Flowable<",
            "Lcom/kubi/kumex/data/platform/model/SymbolConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "symbol"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x3

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v1, v2, v1}, Lth/c;->l(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lio/reactivex/Flowable;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Lth/u;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Lth/u;-><init>()V

    .line 20
    .line 21
    new-instance v2, Lth/f0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v1}, Lth/f0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lio/reactivex/Flowable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    new-instance v1, Lth/q0;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, p1}, Lth/q0;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    new-instance p1, Lth/t0;

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v1}, Lth/t0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lio/reactivex/Flowable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Flowable;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    new-instance v0, Lth/u0;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Lth/u0;-><init>()V

    .line 48
    .line 49
    new-instance v1, Lth/v0;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v0}, Lth/v0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, Lio/reactivex/Flowable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    const-string v0, "map(...)"

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    return-object p1
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
.end method

.method public g()Lcom/kubi/kumex/data/platform/model/SystemConfig;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->g()Lcom/kubi/kumex/data/platform/model/SystemConfig;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 9
    const/4 v5, 0x6

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v1 .. v6}, Lth/c;->j(Lth/c;Lcom/kubi/kumex/data/platform/model/SystemConfig;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 16
    return-object v2
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "datasource"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "customizations"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/quotefacade/entity/MarketListEntityItem;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "discover-front/trading/item"
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Cache-Time: 1000",
            "X-KC-CDN-SITE-TYPE: global"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "datasource"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "customizations"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3}, Lth/a;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

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
.end method

.method public h()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/f;->f()Lio/reactivex/Scheduler;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lth/z;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Lth/z;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lio/reactivex/Scheduler;->scheduleDirect(Ljava/lang/Runnable;)Lio/reactivex/disposables/Disposable;

    .line 13
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
.end method

.method public i()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
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
.end method

.method public j()Lkotlinx/coroutines/flow/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e0()Lio/reactivex/Observable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlinx/coroutines/rx2/RxConvertKt;->b(Lio/reactivex/ObservableSource;)Lkotlinx/coroutines/flow/e;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->p()Lio/reactivex/Observable;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lkotlinx/coroutines/rx2/RxConvertKt;->b(Lio/reactivex/ObservableSource;)Lkotlinx/coroutines/flow/e;

    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x2

    .line 18
    .line 19
    new-array v2, v2, [Lkotlinx/coroutines/flow/e;

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    aput-object v0, v2, v3

    .line 23
    const/4 v0, 0x1

    .line 24
    .line 25
    aput-object v1, v2, v0

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->R([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 29
    move-result-object v0

    .line 30
    return-object v0
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
.end method

.method public final j1()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v2, v2, v1, v2}, Lth/c;->q0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lfm/e;->h(Ljava/util/Map;)Ljava/util/List;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "config_list"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->getValue()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 42
    .line 43
    new-instance v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl$a;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$a;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 54
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    :catchall_0
    check-cast v2, Ljava/util/Map;

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, Lfm/e;->h(Ljava/util/Map;)Ljava/util/List;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 71
    move-result-object v0

    .line 72
    return-object v0
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
.end method

.method public k()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lth/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lth/j;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 6
    .line 7
    const-string v1, "contract_list"

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 14
    const/4 v2, 0x3

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v3, v3, v2, v3}, Lth/c;->g(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/List;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v0

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    if-eqz v0, :cond_6

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->getValue()Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 49
    move-result v1

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    goto :goto_2

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->getValue()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 59
    .line 60
    new-instance v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl$e;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$e;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 71
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    :catchall_0
    move-object v5, v3

    .line 73
    .line 74
    check-cast v5, Ljava/util/List;

    .line 75
    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    .line 79
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 80
    move-result v0

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    goto :goto_1

    .line 84
    .line 85
    :cond_3
    iget-object v4, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 86
    const/4 v8, 0x6

    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v7, 0x0

    .line 90
    .line 91
    .line 92
    invoke-static/range {v4 .. v9}, Lth/c;->f0(Lth/c;Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 93
    :cond_4
    :goto_1
    move-object v3, v5

    .line 94
    goto :goto_3

    .line 95
    .line 96
    .line 97
    :cond_5
    :goto_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 98
    move-result-object v0

    .line 99
    move-object v3, v0

    .line 100
    .line 101
    :cond_6
    :goto_3
    if-eqz v3, :cond_8

    .line 102
    .line 103
    .line 104
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 105
    move-result v0

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    goto :goto_4

    .line 109
    :cond_7
    return-object v3

    .line 110
    .line 111
    .line 112
    :cond_8
    :goto_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 113
    move-result-object v0

    .line 114
    return-object v0
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
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;)V
    .locals 11
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
    const-string v0, "primarySymbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "leverage"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x3

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v2, v3, v2}, Lth/c;->q0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/Map;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lkotlin/jvm/internal/TypeIntrinsics;->isMutableMap(Ljava/lang/Object;)Z

    .line 22
    move-result v4

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    iget-object v5, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 27
    .line 28
    new-instance v6, Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    invoke-direct {v6, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 32
    const/4 v9, 0x6

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static/range {v5 .. v10}, Lth/c;->u(Lth/c;Ljava/util/Map;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 39
    .line 40
    :cond_0
    iget-object v1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2, v2, v3, v2}, Lth/c;->q0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/Map;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-static {v1, p1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    const/16 v9, 0x3e

    .line 55
    const/4 v10, 0x0

    .line 56
    .line 57
    const-string v3, ","

    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v5, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v2 .. v10}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    const-string/jumbo v1, "symbol"

    .line 70
    .line 71
    .line 72
    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-static {v0, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    .line 80
    filled-new-array {p1, p2}, [Lkotlin/Pair;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->y1(Ljava/util/Map;)V

    .line 89
    return-void
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
.end method

.method public m()Lcom/kubi/kumex/data/platform/model/NoticeEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/kumex/announcement"
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Cache-Time: 30000"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->m()Lcom/kubi/kumex/data/platform/model/NoticeEntity;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public n()Lcom/kubi/kumex/data/platform/model/NoticeConfig;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v1, v2, v1}, Lth/c;->g0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/NoticeConfig;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public o()Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lgz/a;->a:Lgz/a;

    .line 3
    .line 4
    const-string v1, "kcApp.B6FuturesTrade.BackhandTrading"

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lgz/a;->a(Ljava/lang/String;Z)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Lcom/kubi/broker/f;->o()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    return v2

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
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
.end method

.method public p()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v1, v2, v1}, Lth/c;->k0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lio/reactivex/Observable;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final p1()Ler/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ler/a;

    .line 9
    return-object v0
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

.method public q()Lcom/kubi/kumex/data/platform/model/NoticeConfig;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->q()Lcom/kubi/kumex/data/platform/model/NoticeConfig;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 9
    const/4 v5, 0x6

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v1 .. v6}, Lth/c;->H(Lth/c;Lcom/kubi/kumex/data/platform/model/NoticeConfig;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 16
    return-object v2
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final q1()Lth/i;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->d:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lth/i;

    .line 9
    return-object v0
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

.method public r(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "headers"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lth/a;->r(Ljava/util/Map;)Ljava/util/List;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->v1(Ljava/util/List;)V

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
.end method

.method public final r1()Lth/e;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->f:Lkotlin/Lazy;

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
    check-cast v0, Lth/e;

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
.end method

.method public s(Ljava/lang/String;Z)Lcom/kubi/kumex/data/platform/model/CoinEntity;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "currency"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lth/x;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0}, Lth/x;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 11
    .line 12
    const-string v1, "coin_list"

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 19
    const/4 v2, 0x3

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v3, v3, v2, v3}, Lth/c;->R(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/List;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    move-result-object v2

    .line 39
    move-object v4, v2

    .line 40
    .line 41
    check-cast v4, Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getCurrency()Ljava/lang/String;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    .line 48
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    move-result v5

    .line 50
    .line 51
    if-nez v5, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getCode()Ljava/lang/String;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    .line 58
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    move-result v4

    .line 60
    .line 61
    if-eqz v4, :cond_0

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move-object v2, v3

    .line 64
    .line 65
    :cond_2
    :goto_0
    check-cast v2, Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 66
    .line 67
    if-nez v2, :cond_c

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;->getValue()Ljava/lang/String;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    :try_start_0
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 84
    .line 85
    new-instance v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl$b;

    .line 86
    .line 87
    .line 88
    invoke-direct {v1}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$b;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 96
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-object v0, v3

    .line 99
    :goto_1
    move-object v5, v0

    .line 100
    .line 101
    check-cast v5, Ljava/util/List;

    .line 102
    .line 103
    if-eqz v5, :cond_6

    .line 104
    .line 105
    iget-object v4, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 106
    const/4 v8, 0x6

    .line 107
    const/4 v9, 0x0

    .line 108
    const/4 v6, 0x0

    .line 109
    const/4 v7, 0x0

    .line 110
    .line 111
    .line 112
    invoke-static/range {v4 .. v9}, Lth/c;->X(Lth/c;Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    move-result v1

    .line 121
    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    move-result-object v1

    .line 127
    move-object v2, v1

    .line 128
    .line 129
    check-cast v2, Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getCurrency()Ljava/lang/String;

    .line 133
    move-result-object v4

    .line 134
    .line 135
    .line 136
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    move-result v4

    .line 138
    .line 139
    if-nez v4, :cond_5

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getCode()Ljava/lang/String;

    .line 143
    move-result-object v2

    .line 144
    .line 145
    .line 146
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    move-result v2

    .line 148
    .line 149
    if-eqz v2, :cond_3

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move-object v1, v3

    .line 152
    .line 153
    :cond_5
    :goto_2
    check-cast v1, Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 154
    goto :goto_3

    .line 155
    :cond_6
    move-object v1, v3

    .line 156
    .line 157
    :goto_3
    if-nez v1, :cond_b

    .line 158
    .line 159
    if-eqz p2, :cond_a

    .line 160
    const/4 p2, 0x1

    .line 161
    .line 162
    .line 163
    :try_start_1
    invoke-static {p0, v3, p2, v3}, Lth/a;->w(Lth/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    .line 164
    move-result-object p2

    .line 165
    .line 166
    .line 167
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    move-result-object p2

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    move-result v0

    .line 173
    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    .line 177
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    move-result-object v0

    .line 179
    move-object v1, v0

    .line 180
    .line 181
    check-cast v1, Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getCurrency()Ljava/lang/String;

    .line 185
    move-result-object v2

    .line 186
    .line 187
    .line 188
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    move-result v2

    .line 190
    .line 191
    if-nez v2, :cond_9

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getCode()Ljava/lang/String;

    .line 195
    move-result-object v1

    .line 196
    .line 197
    .line 198
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    move-result v1

    .line 200
    .line 201
    if-eqz v1, :cond_7

    .line 202
    goto :goto_4

    .line 203
    :catchall_1
    move-exception v0

    .line 204
    move-object p1, v0

    .line 205
    goto :goto_5

    .line 206
    :cond_8
    move-object v0, v3

    .line 207
    .line 208
    :cond_9
    :goto_4
    check-cast v0, Lcom/kubi/kumex/data/platform/model/CoinEntity;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 209
    move-object v3, v0

    .line 210
    goto :goto_6

    .line 211
    .line 212
    .line 213
    :goto_5
    invoke-static {p1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 214
    :cond_a
    :goto_6
    move-object v1, v3

    .line 215
    :cond_b
    return-object v1

    .line 216
    :cond_c
    return-object v2
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
.end method

.method public final s1()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->b:Lir/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->k:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lir/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

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
.end method

.method public t()Lcom/kubi/kumex/data/platform/model/SystemConfig;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v1, v2, v1}, Lth/c;->t0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/SystemConfig;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public u()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/copyTrading/isPushGuidePopUp"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->u()Ljava/lang/Boolean;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public v()J
    .locals 9

    .line 1
    .line 2
    new-instance v0, Lth/y;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lth/y;-><init>(Lcom/kubi/futures/data/platform/PlatformServiceImpl;)V

    .line 6
    .line 7
    const-string v1, "SERVER_TIME"

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2, v0}, Lcom/kubi/utils/x0;->b(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v3, 0x3

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v1, v3, v1}, Lth/c;->a0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)[J

    .line 19
    move-result-object v0

    .line 20
    .line 21
    aget-wide v1, v0, v2

    .line 22
    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    cmp-long v5, v1, v3

    .line 26
    const/4 v6, 0x1

    .line 27
    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    aget-wide v7, v0, v6

    .line 31
    .line 32
    cmp-long v3, v7, v3

    .line 33
    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    move-result-wide v0

    .line 39
    return-wide v0

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 43
    move-result-wide v3

    .line 44
    .line 45
    aget-wide v5, v0, v6

    .line 46
    sub-long/2addr v3, v5

    .line 47
    add-long/2addr v1, v3

    .line 48
    return-wide v1
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
.end method

.method public v1(Ljava/util/List;)V
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "list"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;-><init>()V

    .line 11
    .line 12
    const-string v1, "contract_list"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/platform/model/DictEntity;->setKey(Ljava/lang/String;)V

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x2

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v1, v2, v3}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v4}, Lcom/kubi/kumex/data/platform/model/DictEntity;->setValue(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    const-string v5, "contract_list"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v5}, Lth/i;->f(Ljava/lang/String;)Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Lcom/kubi/kumex/data/platform/model/DictEntity;->getValue()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    :try_start_0
    new-instance v5, Lcom/kubi/futures/data/platform/PlatformServiceImpl$g;

    .line 44
    .line 45
    .line 46
    invoke-direct {v5}, Lcom/kubi/futures/data/platform/PlatformServiceImpl$g;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 50
    move-result-object v5

    .line 51
    .line 52
    .line 53
    invoke-static {v4, v5}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 54
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-object v4, v3

    .line 57
    .line 58
    :goto_0
    check-cast v4, Ljava/util/List;

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    move-object v4, v3

    .line 61
    .line 62
    :goto_1
    iget-object v5, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->h:Ljava/lang/Object;

    .line 63
    monitor-enter v5

    .line 64
    .line 65
    .line 66
    :try_start_1
    invoke-static {p1}, Lcom/kubi/utils/extensions/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 67
    move-result-object v6

    .line 68
    .line 69
    new-instance v7, Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    move-result-object v6

    .line 77
    .line 78
    .line 79
    :cond_1
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    move-result v8

    .line 81
    .line 82
    if-eqz v8, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    move-result-object v8

    .line 87
    move-object v9, v8

    .line 88
    .line 89
    check-cast v9, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 90
    .line 91
    .line 92
    invoke-static {v9}, Lfm/b;->o(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Z

    .line 93
    move-result v9

    .line 94
    .line 95
    if-eqz v9, :cond_1

    .line 96
    .line 97
    .line 98
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 99
    goto :goto_2

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    move-object p1, v0

    .line 102
    goto :goto_4

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 106
    move-result v6

    .line 107
    .line 108
    .line 109
    invoke-static {v4}, Lcom/kubi/utils/extensions/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 110
    move-result-object v4

    .line 111
    .line 112
    new-instance v7, Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    .line 122
    :cond_3
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    move-result v8

    .line 124
    .line 125
    if-eqz v8, :cond_4

    .line 126
    .line 127
    .line 128
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    move-result-object v8

    .line 130
    move-object v9, v8

    .line 131
    .line 132
    check-cast v9, Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 133
    .line 134
    .line 135
    invoke-static {v9}, Lfm/b;->o(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Z

    .line 136
    move-result v9

    .line 137
    .line 138
    if-eqz v9, :cond_3

    .line 139
    .line 140
    .line 141
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 142
    goto :goto_3

    .line 143
    .line 144
    .line 145
    :cond_4
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 146
    move-result v4

    .line 147
    .line 148
    if-le v6, v4, :cond_5

    .line 149
    .line 150
    sget-object v4, Lzl/j;->a:Lzl/j;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Lzl/j;->z()Ly70/g;

    .line 154
    move-result-object v6

    .line 155
    .line 156
    .line 157
    invoke-static {v6, v1}, Ly70/a;->e(Ly70/g;I)I

    .line 158
    move-result v1

    .line 159
    .line 160
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Lzl/j;->z()Ly70/g;

    .line 164
    move-result-object v4

    .line 165
    .line 166
    .line 167
    invoke-static {v4, v1}, Ly70/a;->l(Ly70/g;I)Ly70/a;

    .line 168
    .line 169
    iget-object v4, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->i:Lio/reactivex/processors/BehaviorProcessor;

    .line 170
    .line 171
    .line 172
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    move-result-object v1

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v1}, Lio/reactivex/processors/BehaviorProcessor;->offer(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 180
    move-result-object v1

    .line 181
    .line 182
    .line 183
    filled-new-array {v0}, [Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 184
    move-result-object v0

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v0}, Lth/i;->d(Ljava/util/List;)V

    .line 192
    .line 193
    iget-object v6, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 194
    const/4 v10, 0x6

    .line 195
    const/4 v11, 0x0

    .line 196
    const/4 v8, 0x0

    .line 197
    const/4 v9, 0x0

    .line 198
    move-object v7, p1

    .line 199
    .line 200
    .line 201
    invoke-static/range {v6 .. v11}, Lth/c;->f0(Lth/c;Ljava/util/List;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 202
    .line 203
    iget-object p1, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 204
    .line 205
    .line 206
    invoke-static {v7}, Lth/g;->c(Ljava/util/List;)Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;

    .line 207
    move-result-object v0

    .line 208
    .line 209
    .line 210
    invoke-static {p1, v0, v3, v2, v3}, Lth/c;->x(Lth/c;Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;Lcom/kubi/restful/a;ILjava/lang/Object;)V

    .line 211
    .line 212
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    monitor-exit v5

    .line 214
    return-void

    .line 215
    :goto_4
    monitor-exit v5

    .line 216
    throw p1
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
.end method

.method public x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "code"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "tradeType"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbol"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/platform-resource-position/position"
    .end annotation

    .line 1
    .line 2
    const-string v0, "code"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "tradeType"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string/jumbo v0, "symbol"

    .line 15
    .line 16
    .line 17
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, p1, p2, p3}, Lth/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 23
    move-result-object p1

    .line 24
    return-object p1
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
.end method

.method public final y1(Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v2, v2, v1, v2}, Lth/c;->q0(Lth/c;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, com.kubi.kumex.data.platform.model.SymbolConfig>"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableMap(Ljava/lang/Object;)Ljava/util/Map;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    .line 20
    const-string/jumbo v0, "symbol"

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    move-object v5, v0

    .line 26
    .line 27
    check-cast v5, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v5, :cond_4

    .line 30
    monitor-enter v4

    .line 31
    .line 32
    :try_start_0
    const-string v0, ","

    .line 33
    .line 34
    .line 35
    filled-new-array {v0}, [Ljava/lang/String;

    .line 36
    move-result-object v6

    .line 37
    const/4 v9, 0x6

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    move-result-object v3

    .line 65
    .line 66
    check-cast v3, Lcom/kubi/kumex/data/platform/model/SymbolConfig;

    .line 67
    .line 68
    if-nez v3, :cond_0

    .line 69
    .line 70
    new-instance v3, Lcom/kubi/kumex/data/platform/model/SymbolConfig;

    .line 71
    .line 72
    .line 73
    invoke-direct {v3}, Lcom/kubi/kumex/data/platform/model/SymbolConfig;-><init>()V

    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object p1, v0

    .line 77
    goto :goto_3

    .line 78
    .line 79
    .line 80
    :cond_0
    :goto_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 81
    move-result-object v5

    .line 82
    .line 83
    .line 84
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    move-result-object v5

    .line 86
    .line 87
    .line 88
    :cond_1
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    move-result v6

    .line 90
    .line 91
    if-eqz v6, :cond_2

    .line 92
    .line 93
    .line 94
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    move-result-object v6

    .line 96
    .line 97
    check-cast v6, Ljava/util/Map$Entry;

    .line 98
    .line 99
    .line 100
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 101
    move-result-object v7

    .line 102
    .line 103
    check-cast v7, Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    const-string/jumbo v8, "symbol"

    .line 107
    .line 108
    .line 109
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    move-result v8

    .line 111
    .line 112
    if-nez v8, :cond_1

    .line 113
    .line 114
    .line 115
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 116
    move-result-object v6

    .line 117
    .line 118
    .line 119
    invoke-interface {v3, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    goto :goto_2

    .line 121
    .line 122
    .line 123
    :cond_2
    invoke-interface {v4, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    goto :goto_0

    .line 125
    .line 126
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    monitor-exit v4

    .line 128
    .line 129
    iget-object v3, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->e:Lth/c;

    .line 130
    const/4 v7, 0x6

    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v5, 0x0

    .line 133
    const/4 v6, 0x0

    .line 134
    .line 135
    .line 136
    invoke-static/range {v3 .. v8}, Lth/c;->u(Lth/c;Ljava/util/Map;Lcom/kubi/restful/a;Ljava/lang/reflect/Type;ILjava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->q1()Lth/i;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    new-instance v0, Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 143
    .line 144
    .line 145
    invoke-direct {v0}, Lcom/kubi/kumex/data/platform/model/DictEntity;-><init>()V

    .line 146
    .line 147
    const-string v1, "config_list"

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/platform/model/DictEntity;->setKey(Ljava/lang/String;)V

    .line 151
    const/4 v1, 0x0

    .line 152
    const/4 v3, 0x2

    .line 153
    .line 154
    .line 155
    invoke-static {v4, v1, v3, v2}, Lcom/kubi/utils/x;->i(Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Lcom/kubi/kumex/data/platform/model/DictEntity;->setValue(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    filled-new-array {v0}, [Lcom/kubi/kumex/data/platform/model/DictEntity;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    .line 166
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v0}, Lth/i;->d(Ljava/util/List;)V

    .line 171
    return-void

    .line 172
    :goto_3
    monitor-exit v4

    .line 173
    throw p1

    .line 174
    .line 175
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    .line 176
    .line 177
    .line 178
    const-string/jumbo v0, "symbol\u4e3a\u5fc5\u4f20\u5b57\u6bb5"

    .line 179
    .line 180
    .line 181
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 182
    throw p1
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
.end method

.method public z()Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/km/trade/configs/strategy"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/data/platform/PlatformServiceImpl;->a:Lth/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lth/a;->z()Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
