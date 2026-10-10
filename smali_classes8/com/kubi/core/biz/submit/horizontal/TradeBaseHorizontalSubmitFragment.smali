.class public final Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;
.super Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;
.source "TradeBaseHorizontalSubmitFragment.kt"

# interfaces
.implements Lhe/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment<",
        "Ljava/lang/Object;",
        "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiState;",
        "Lcom/kubi/core/biz/submit/c1;",
        ">;",
        "Lhe/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0008\u00105\u001a\u000206H\u0002J\u0008\u00107\u001a\u000202H\u0002J\u0010\u00108\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0002J\u0008\u0010;\u001a\u00020<H\u0014J\u001a\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?2\u0008\u0010@\u001a\u0004\u0018\u000104H\u0016J\u0008\u0010A\u001a\u000202H\u0002J\u0014\u0010B\u001a\u0002062\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020E0DJ\u0008\u0010F\u001a\u00020<H\u0002J\u0008\u0010G\u001a\u000202H\u0016J\u0018\u0010H\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020:H\u0016J\u0018\u0010L\u001a\u0002022\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020&H\u0016J\u0018\u0010P\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010Q\u001a\u00020RH\u0016J\u0018\u0010S\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010T\u001a\u00020<H\u0016J\u0018\u0010U\u001a\u0002022\u0006\u0010M\u001a\u00020N2\u0006\u0010V\u001a\u00020<H\u0016J\u0010\u0010W\u001a\u0002022\u0006\u0010Q\u001a\u00020XH\u0016J\u001a\u0010Y\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0008\u0010Z\u001a\u0004\u0018\u00010[H\u0002J\u0008\u0010\\\u001a\u000202H\u0016J\u0008\u0010]\u001a\u000202H\u0017J\u0008\u0010^\u001a\u000202H\u0016J\u0008\u0010_\u001a\u000202H\u0016J\u0010\u0010`\u001a\u0002022\u0006\u0010Z\u001a\u00020[H\u0016J\u0018\u0010a\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010b\u001a\u00020:H\u0016J\u0018\u0010c\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010b\u001a\u00020:H\u0002J\u0010\u0010d\u001a\u0002022\u0006\u0010O\u001a\u00020<H\u0016J\u0010\u0010e\u001a\u0002022\u0006\u0010O\u001a\u00020<H\u0016J\u0008\u0010f\u001a\u000202H\u0016J\u0010\u0010g\u001a\u0002022\u0006\u0010V\u001a\u00020<H\u0002J\u0008\u0010h\u001a\u000202H\u0002J,\u0010n\u001a\u0002022\u0006\u0010o\u001a\u00020&2\u0006\u0010p\u001a\u00020q2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'0%H\u0002J\u0008\u0010s\u001a\u000202H\u0016R\u001b\u0010\u0008\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00138TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\r\u001a\u0004\u0008!\u0010\"R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010\r\u001a\u0004\u0008+\u0010,R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u0010\r\u001a\u0004\u0008/\u0010,R\u001b\u0010i\u001a\u00020j8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008m\u0010\r\u001a\u0004\u0008k\u0010l\u00a8\u0006t"
    }
    d2 = {
        "Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;",
        "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;",
        "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiIntent;",
        "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiState;",
        "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitVM;",
        "Lcom/kubi/core/spot/business/ITradeChildBehavior;",
        "<init>",
        "()V",
        "submitVM",
        "Lcom/kubi/core/biz/submit/TradeSubmitVM;",
        "getSubmitVM",
        "()Lcom/kubi/core/biz/submit/TradeSubmitVM;",
        "submitVM$delegate",
        "Lkotlin/Lazy;",
        "biz",
        "Lcom/kubi/core/config/TradeBiz;",
        "getBiz",
        "()Lcom/kubi/core/config/TradeBiz;",
        "vmClass",
        "Lkotlin/reflect/KClass;",
        "getVmClass",
        "()Lkotlin/reflect/KClass;",
        "createVM",
        "manager",
        "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;",
        "binding",
        "Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;",
        "getBinding",
        "()Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "mParent",
        "Lcom/kubi/core/spot/business/ITradeParentBehavior;",
        "getMParent",
        "()Lcom/kubi/core/spot/business/ITradeParentBehavior;",
        "mParent$delegate",
        "mViewHoldersBuy",
        "",
        "Lcom/kubi/tradebase/tradetype/TradeType;",
        "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;",
        "mViewHoldersSell",
        "mBuyAdapter",
        "Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;",
        "getMBuyAdapter",
        "()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;",
        "mBuyAdapter$delegate",
        "mSellAdapter",
        "getMSellAdapter",
        "mSellAdapter$delegate",
        "onSaveInstanceState",
        "",
        "outState",
        "Landroid/os/Bundle;",
        "startCollectData",
        "Lkotlinx/coroutines/Job;",
        "updateSupportTradeTypes",
        "updateEtfViewLabel",
        "enable",
        "",
        "getLayout",
        "",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "initUI",
        "setTradeTypeTabBar",
        "tradeTypes",
        "",
        "Lcom/kubi/core/biz/submit/TradeTypeUiData;",
        "lastPrecision",
        "onShow",
        "reloadSymbols",
        "symbolInfo",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "onlyResetUI",
        "tradeModeChanged",
        "labelStr",
        "",
        "type",
        "onBboDataGet",
        "data",
        "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;",
        "showOrderBookAmountType",
        "adapterPosition",
        "onOrderBookPrecisionChanged",
        "precision",
        "onOrderBookDataGet",
        "Lcom/kubi/data/entity/OrderBookEntity;",
        "updateExtValue",
        "value",
        "Ljava/math/BigDecimal;",
        "onCurrencyChanged",
        "notifyOrderBookAdapter",
        "onAssetGet",
        "onAvailableTradeAmountChanged",
        "onClickPriceChange",
        "refreshButtonStatus",
        "isMaintenance",
        "updateActionBtn",
        "hideDialogInType",
        "showDialogInType",
        "isSupportBorrow",
        "updateSelectPrecisionTextSize",
        "mergeMax",
        "mHolderImp",
        "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;",
        "getMHolderImp",
        "()Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;",
        "mHolderImp$delegate",
        "addContainerView",
        "tradeType",
        "container",
        "Landroid/widget/FrameLayout;",
        "mViewHolders",
        "onRefresh",
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
        "SMAP\nTradeBaseHorizontalSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeBaseHorizontalSubmitFragment.kt\ncom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,652:1\n106#2,15:653\n147#3,16:668\n360#4,7:684\n1869#4,2:691\n1869#4,2:693\n1869#4,2:696\n1869#4,2:698\n360#4,7:700\n1869#4,2:707\n1869#4,2:709\n1869#4,2:711\n1869#4,2:713\n1869#4,2:715\n1869#4,2:717\n1869#4,2:719\n1869#4,2:721\n1869#4,2:723\n1869#4,2:725\n1869#4,2:727\n1869#4,2:729\n1563#4:731\n1634#4,3:732\n1#5:695\n37#6:735\n36#6,3:736\n*S KotlinDebug\n*F\n+ 1 TradeBaseHorizontalSubmitFragment.kt\ncom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment\n*L\n70#1:653,15\n79#1:668,16\n173#1:684,7\n302#1:691,2\n303#1:693,2\n354#1:696,2\n355#1:698,2\n361#1:700,7\n395#1:707,2\n396#1:709,2\n434#1:711,2\n435#1:713,2\n445#1:715,2\n446#1:717,2\n450#1:719,2\n451#1:721,2\n466#1:723,2\n467#1:725,2\n535#1:727,2\n536#1:729,2\n254#1:731\n254#1:732,3\n254#1:735\n254#1:736,3\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic h0:[Lkotlin/reflect/KProperty;
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
.field public final Y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Lbe/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/kubi/tradebase/tradetype/TradeType;",
            "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/kubi/tradebase/tradetype/TradeType;",
            "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g0:Lkotlin/Lazy;
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
    const-string v1, "getBinding()Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;

    .line 8
    .line 9
    const-string v4, "binding"

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
    sput-object v1, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->h0:[Lkotlin/reflect/KProperty;

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
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/core/biz/submit/horizontal/r;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/kubi/core/biz/submit/horizontal/r;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 9
    .line 10
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 11
    .line 12
    new-instance v2, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$1;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, v0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    const-class v1, Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    new-instance v2, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$2;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, v0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$2;-><init>(Lkotlin/Lazy;)V

    .line 31
    .line 32
    new-instance v3, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$3;

    .line 33
    const/4 v4, 0x0

    .line 34
    .line 35
    .line 36
    invoke-direct {v3, v4, v0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 37
    .line 38
    new-instance v4, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$4;

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, p0, v0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->Y:Lkotlin/Lazy;

    .line 48
    .line 49
    sget-object v0, Lbe/a$j;->a:Lbe/a$j;

    .line 50
    .line 51
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->Z:Lbe/a;

    .line 52
    .line 53
    sget-object v0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewBindingFragment$1;

    .line 54
    .line 55
    new-instance v1, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewBindingFragment$2;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->a0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 65
    .line 66
    new-instance v0, Lcom/kubi/core/biz/submit/horizontal/b;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, p0}, Lcom/kubi/core/biz/submit/horizontal/b;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->b0:Lkotlin/Lazy;

    .line 76
    .line 77
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 78
    .line 79
    .line 80
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 81
    .line 82
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 83
    .line 84
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    .line 87
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 88
    .line 89
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 90
    .line 91
    new-instance v0, Lcom/kubi/core/biz/submit/horizontal/c;

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, p0}, Lcom/kubi/core/biz/submit/horizontal/c;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->e0:Lkotlin/Lazy;

    .line 101
    .line 102
    new-instance v0, Lcom/kubi/core/biz/submit/horizontal/d;

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, p0}, Lcom/kubi/core/biz/submit/horizontal/d;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->f0:Lkotlin/Lazy;

    .line 112
    .line 113
    new-instance v0, Lcom/kubi/core/biz/submit/horizontal/e;

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, p0}, Lcom/kubi/core/biz/submit/horizontal/e;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    iput-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->g0:Lkotlin/Lazy;

    .line 123
    return-void
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
.end method

.method public static final A4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/business/holder/f0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type com.kubi.core.spot.business.holder.ITradeHolderDependDelegate"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast p0, Lcom/kubi/core/spot/business/holder/f0;

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
.end method

.method public static final B4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lhe/b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type com.kubi.core.spot.business.ITradeParentBehavior"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast p0, Lhe/b;

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
.end method

.method public static final C4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Lhe/b;->z0()Ljava/util/ArrayList;

    .line 10
    move-result-object p0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2, p0}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;-><init>(IILjava/util/ArrayList;)V

    .line 16
    return-object v0
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
.end method

.method public static final H4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "requireParentFragment(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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
.end method

.method public static synthetic I3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->C4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

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
.end method

.method public static synthetic J3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lhe/b;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->B4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lhe/b;

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
.end method

.method public static final J4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/data/entity/SymbolInfoEntity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 16
    .line 17
    const-class p1, Lcom/kubi/user/api/IUserService;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/kubi/router/core/Router;->n(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    check-cast p0, Lcom/kubi/user/api/IUserService;

    .line 24
    .line 25
    sget-object p1, Lcom/kubi/router/model/IRedirect;->a:Lcom/kubi/router/model/IRedirect$Companion;

    .line 26
    .line 27
    new-instance v0, Lcom/kubi/core/biz/submit/horizontal/h;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Lcom/kubi/core/biz/submit/horizontal/h;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lcom/kubi/router/model/IRedirect$Companion;->obtain(Lkotlin/jvm/functions/Function0;)Lcom/kubi/router/model/IRedirect;

    .line 34
    move-result-object p1

    .line 35
    const/4 v0, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, p1, v1, v0}, Lcom/kubi/user/api/IUserService;->O(Lcom/kubi/user/api/IUserService;Ljava/util/Map;Lcom/kubi/router/model/IRedirect;ILjava/lang/Object;)V

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;->A3()Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;

    .line 43
    move-result-object p0

    .line 44
    .line 45
    check-cast p0, Lcom/kubi/core/biz/submit/c1;

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/kubi/core/biz/submit/c1;->r(Lcom/kubi/data/entity/SymbolInfoEntity;)Z

    .line 51
    move-result p0

    .line 52
    .line 53
    if-ne p0, v1, :cond_1

    .line 54
    .line 55
    sget-object p0, Lee/a;->a:Lee/a;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lee/a;->a()Lcom/kubi/margin/api/IMarginService;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    .line 62
    invoke-interface {p0}, Lcom/kubi/margin/api/IMarginService;->T()V

    .line 63
    .line 64
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 65
    return-object p0
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
.end method

.method public static synthetic K3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lv30/x;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->u4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lv30/x;)Lkotlin/Unit;

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
.end method

.method public static final K4()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 3
    return-object v0
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
.end method

.method public static synthetic L3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->w4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Landroid/view/View;)Lkotlin/Unit;

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
.end method

.method public static synthetic M3(Lv30/x;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->t4(Lv30/x;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic N3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/business/holder/f0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->A4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/business/holder/f0;

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
.end method

.method public static synthetic O3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;I[Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->s4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;I[Ljava/lang/String;)V

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
.end method

.method public static synthetic P3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->y4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;

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
.end method

.method public static final P4(Ljava/util/List;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 7
    move-result p3

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p3}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    check-cast p0, Lcom/kubi/core/biz/submit/j2;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Lcom/kubi/core/biz/submit/j2;->a()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, p2, p0}, Lhe/b;->e(Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;)V

    .line 33
    :cond_1
    :goto_0
    return-void
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
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
.end method

.method public static synthetic Q3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->x4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic R3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->v4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Landroid/view/View;)Lkotlin/Unit;

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
.end method

.method public static synthetic S3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->z4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

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
.end method

.method public static synthetic T3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/tradebase/tradetype/TradeType;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->h4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/tradebase/tradetype/TradeType;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/Observable;

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
.end method

.method public static synthetic U3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;I[Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->r4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;I[Ljava/lang/String;)V

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
.end method

.method public static synthetic V3(Ljava/util/List;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->P4(Ljava/util/List;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Ljava/lang/String;Ljava/lang/Integer;)V

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
.end method

.method public static synthetic W3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/data/entity/SymbolInfoEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->J4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/data/entity/SymbolInfoEntity;)Lkotlin/Unit;

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
.end method

.method public static synthetic X3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->H4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

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
.end method

.method public static synthetic Y3(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->q4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic Z3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->K4()Lkotlin/Unit;

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public static final synthetic a4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lv30/x;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

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
.end method

.method public static final synthetic b4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/biz/submit/TradeSubmitVM;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

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
.end method

.method public static final synthetic c4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;->D3()Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;

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
.end method

.method public static final synthetic d4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->L4(Z)V

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
.end method

.method public static final synthetic e4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->M4(Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;)V

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
.end method

.method public static final synthetic f4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->O4()V

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
.end method

.method public static final h4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/tradebase/tradetype/TradeType;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1

    .line 1
    .line 2
    const-string p4, "requestData"

    .line 3
    .line 4
    .line 5
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 14
    const/4 p4, 0x0

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->u0()Z

    .line 20
    move-result p2

    .line 21
    const/4 v0, 0x1

    .line 22
    .line 23
    if-ne p2, v0, :cond_0

    .line 24
    move p4, v0

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0, p1, p4, p3}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->q0(Lcom/kubi/tradebase/tradetype/TradeType;ZLjava/util/Map;)Lio/reactivex/Observable;

    .line 28
    move-result-object p0

    .line 29
    return-object p0
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
.end method

.method public static final q4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    return-object p0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lhe/b;->D(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    return-object p0
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
.end method

.method public static final r4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;I[Ljava/lang/String;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    aget-object p1, p2, p1

    .line 8
    const/4 p2, 0x0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2, v0, p2}, Llf/b;->b(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2, v0, p2}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, p1}, Lhe/b;->T(Ljava/math/BigDecimal;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/kubi/core/utils/a;->a()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const/16 v4, 0x8

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    const-string v1, "orderPriceNum"

    .line 30
    .line 31
    const-string v2, "1"

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 36
    return-void
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
.end method

.method private final s0()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lhe/b;->s0()I

    .line 8
    move-result v0

    .line 9
    return v0
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
.end method

.method public static final s4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;I[Ljava/lang/String;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    aget-object p1, p2, p1

    .line 8
    const/4 p2, 0x0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2, v0, p2}, Llf/b;->b(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2, v0, p2}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, p1}, Lhe/b;->T(Ljava/math/BigDecimal;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/kubi/core/utils/a;->a()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const/16 v4, 0x8

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    const-string v1, "orderPriceNum"

    .line 30
    .line 31
    const-string v2, "2"

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 36
    return-void
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
.end method

.method public static final t4(Lv30/x;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/core/biz/submit/horizontal/i;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1, p0}, Lcom/kubi/core/biz/submit/horizontal/i;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lv30/x;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/kubi/utils/x0;->e(Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object p0
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
.end method

.method public static final u4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lv30/x;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    iget-object p1, p1, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, v1, v0}, Llf/b;->b(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0, v1, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1}, Lhe/b;->T(Ljava/math/BigDecimal;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/kubi/core/utils/a;->a()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    const/16 v4, 0xc

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    const-string v1, "bidAskPriceClick"

    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    return-object p0
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
.end method

.method public static final v4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 9

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
    invoke-static {}, Lcom/kubi/core/utils/a;->a()Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    const/16 v5, 0xc

    .line 12
    const/4 v6, 0x0

    .line 13
    .line 14
    const-string v2, "orderIntroButton"

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v6}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    check-cast p1, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSupportTradeTypes()Ljava/util/List;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    return-object p0

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    move-result v1

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    move-result-object v1

    .line 53
    move-object v2, v1

    .line 54
    .line 55
    check-cast v2, Lcom/kubi/core/biz/submit/j2;

    .line 56
    .line 57
    .line 58
    invoke-interface {v2}, Lcom/kubi/core/biz/submit/j2;->isChecked()Z

    .line 59
    move-result v2

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 v1, 0x0

    .line 64
    .line 65
    :goto_0
    check-cast v1, Lcom/kubi/core/biz/submit/j2;

    .line 66
    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 70
    return-object p0

    .line 71
    .line 72
    :cond_3
    sget-object v0, Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;->x0:Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;

    .line 73
    .line 74
    new-instance v2, Ljava/util/ArrayList;

    .line 75
    .line 76
    const/16 v3, 0xa

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 80
    move-result v3

    .line 81
    .line 82
    .line 83
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    move-result v3

    .line 92
    .line 93
    if-eqz v3, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    check-cast v3, Lcom/kubi/core/biz/submit/j2;

    .line 100
    .line 101
    .line 102
    invoke-interface {v3}, Lcom/kubi/core/biz/submit/j2;->a()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Lcom/kubi/tradebase/tradetype/TradeType;->getValue()Ljava/lang/String;

    .line 107
    move-result-object v3

    .line 108
    .line 109
    .line 110
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    goto :goto_1

    .line 112
    :cond_4
    const/4 p1, 0x0

    .line 113
    .line 114
    new-array p1, p1, [Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    invoke-interface {v2, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    check-cast p1, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    invoke-interface {v1}, Lcom/kubi/core/biz/submit/j2;->a()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 124
    move-result-object v2

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lcom/kubi/core/utils/a;->a()Ljava/lang/String;

    .line 128
    move-result-object v3

    .line 129
    .line 130
    const/16 v7, 0x38

    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v4, 0x0

    .line 133
    const/4 v5, 0x0

    .line 134
    const/4 v6, 0x0

    .line 135
    move-object v1, p1

    .line 136
    .line 137
    .line 138
    invoke-static/range {v0 .. v8}, Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;->newInstance$default(Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;[Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Ljava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 143
    move-result-object p0

    .line 144
    .line 145
    const-string v0, "getChildFragmentManager(...)"

    .line 146
    .line 147
    .line 148
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    const-string v0, "showTradeInfoDialog"

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p0, v0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 154
    .line 155
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 156
    return-object p0
    .line 157
    .line 158
.end method

.method public static final w4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Landroid/view/View;)Lkotlin/Unit;
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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string p1, "getChildFragmentManager(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lnd/a;->a(Landroidx/fragment/app/FragmentManager;)V

    .line 18
    .line 19
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
.end method

.method public static final x4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/spot/api/ISpotService;->a:Lcom/kubi/spot/api/ISpotService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/spot/api/ISpotService$Companion;->get()Lcom/kubi/spot/api/ISpotService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    const-string v1, "getChildFragmentManager(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p0}, Lcom/kubi/spot/api/ISpotService;->s(Landroidx/fragment/app/FragmentManager;)V

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    return-object p0
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
.end method

.method public static final y4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v0}, Lhe/b;->n(Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 24
    .line 25
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    return-object p0
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
.end method

.method public static final z4(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Lhe/b;->z0()Ljava/util/ArrayList;

    .line 10
    move-result-object p0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v1, p0}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;-><init>(IILjava/util/ArrayList;)V

    .line 15
    return-object v0
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
.end method


# virtual methods
.method public final D4()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 16
    move-result-wide v2

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(DD)D

    .line 20
    move-result-wide v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->p(D)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->p(D)V

    .line 35
    return-void
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
.end method

.method public E(Lcom/kubi/data/entity/SymbolInfoEntity;I)V
    .locals 2
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbolInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->v(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->v(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-object p2, p2, Lv30/x;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    sget v0, Lcom/kubi/tradecorebiz/R$string;->total_stub:I

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_0
    sget v0, Lcom/kubi/tradecorebiz/R$string;->amount_stub:I

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    if-eqz p2, :cond_3

    .line 66
    .line 67
    iget-object p2, p2, Lv30/x;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 68
    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 77
    move-result v0

    .line 78
    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    sget v0, Lcom/kubi/tradecorebiz/R$string;->total_stub:I

    .line 82
    goto :goto_1

    .line 83
    .line 84
    :cond_2
    sget v0, Lcom/kubi/tradecorebiz/R$string;->amount_stub:I

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    .line 91
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0()V

    .line 103
    return-void
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
.end method

.method public E4(Lcom/kubi/data/entity/SymbolInfoEntity;Z)V
    .locals 7
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbolInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 28
    const/4 v5, 0x4

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v2, p1

    .line 32
    move v3, p2

    .line 33
    .line 34
    .line 35
    invoke-static/range {v1 .. v6}, Lcom/kubi/core/spot/business/holder/g0;->a(Lcom/kubi/core/spot/business/holder/g0;Lcom/kubi/data/entity/SymbolInfoEntity;ZZILjava/lang/Object;)V

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    move-result v1

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 59
    const/4 v5, 0x4

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    move-object v2, p1

    .line 63
    move v3, p2

    .line 64
    .line 65
    .line 66
    invoke-static/range {v1 .. v6}, Lcom/kubi/core/spot/business/holder/g0;->a(Lcom/kubi/core/spot/business/holder/g0;Lcom/kubi/data/entity/SymbolInfoEntity;ZZILjava/lang/Object;)V

    .line 67
    goto :goto_1

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual/range {p0 .. p2}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->I4(Lcom/kubi/data/entity/SymbolInfoEntity;Z)V

    .line 71
    return-void
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
.end method

.method public F0(Lcom/kubi/data/entity/OrderBookEntity;)V
    .locals 2
    .param p1    # Lcom/kubi/data/entity/OrderBookEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getAsks()Ljava/util/List;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lcom/kubi/utils/extensions/b;->b(Ljava/util/List;)Ljava/util/List;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->q(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getBids()Ljava/util/List;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lcom/kubi/utils/extensions/b;->b(Ljava/util/List;)Ljava/util/List;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->q(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->D4()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iget-object v0, v0, Lv30/x;->c:Lcom/kubi/resources/widget/BuySellRatioView;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getBids()Ljava/util/List;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getAsks()Ljava/util/List;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1, p1}, Lcom/kubi/resources/widget/BuySellRatioView;->g(Ljava/util/List;Ljava/util/List;)V

    .line 60
    :cond_0
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
.end method

.method public final F4(Ljava/util/List;)Lkotlinx/coroutines/x1;
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/core/biz/submit/j2;",
            ">;)",
            "Lkotlinx/coroutines/x1;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "tradeTypes"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p1, p0, v2}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1;-><init>(Ljava/util/List;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final G4()Lkotlinx/coroutines/x1;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$startCollectData$1;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0, v2}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$startCollectData$1;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 14
    move-result-object v0

    .line 15
    return-object v0
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
.end method

.method public final I4(Lcom/kubi/data/entity/SymbolInfoEntity;Z)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v1, v0, Lv30/x;->p:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 16
    const/4 p1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 20
    .line 21
    const/high16 p1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    .line 25
    .line 26
    sget p1, Lcom/kubi/tradecorebiz/R$string;->outage_tip:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    .line 30
    .line 31
    sget p1, Lcom/kubi/tradecorebiz/R$drawable;->shape_complementary16_24r:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    sget p2, Lcom/kubi/tradecorebiz/R$color;->complementary:I

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 44
    move-result p1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 48
    return-void

    .line 49
    :cond_0
    const/4 p2, 0x1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p2}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    sget v2, Lcom/kubi/tradecorebiz/R$color;->primary:I

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 62
    move-result v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    sget v2, Lcom/kubi/tradecorebiz/R$color;->c_textEmphasis:I

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 75
    move-result v0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 79
    .line 80
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    .line 87
    invoke-interface {v2}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 88
    move-result v2

    .line 89
    .line 90
    if-nez v2, :cond_1

    .line 91
    .line 92
    sget p2, Lcom/kubi/tradecorebiz/R$string;->login:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 99
    goto :goto_0

    .line 100
    .line 101
    .line 102
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;->A3()Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;

    .line 103
    move-result-object v2

    .line 104
    .line 105
    check-cast v2, Lcom/kubi/core/biz/submit/c1;

    .line 106
    .line 107
    if-eqz v2, :cond_2

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, p1}, Lcom/kubi/core/biz/submit/c1;->r(Lcom/kubi/data/entity/SymbolInfoEntity;)Z

    .line 111
    move-result v2

    .line 112
    .line 113
    if-ne v2, p2, :cond_2

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 117
    move-result-object p2

    .line 118
    .line 119
    .line 120
    invoke-interface {p2}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Lcom/kubi/user/model/LoginUserEntity;->isAgreeEtf()Z

    .line 125
    move-result p2

    .line 126
    .line 127
    if-nez p2, :cond_2

    .line 128
    .line 129
    .line 130
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 131
    .line 132
    sget p2, Lcom/kubi/tradecorebiz/R$string;->etf_agree_terms:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 136
    goto :goto_0

    .line 137
    .line 138
    .line 139
    :cond_2
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 140
    .line 141
    :goto_0
    new-instance v4, Lcom/kubi/core/biz/submit/horizontal/a;

    .line 142
    .line 143
    .line 144
    invoke-direct {v4, p0, p1}, Lcom/kubi/core/biz/submit/horizontal/a;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/data/entity/SymbolInfoEntity;)V

    .line 145
    const/4 v5, 0x1

    .line 146
    const/4 v6, 0x0

    .line 147
    .line 148
    const-wide/16 v2, 0x0

    .line 149
    .line 150
    .line 151
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 152
    :cond_3
    return-void
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method

.method public final L4(Z)V
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Lv30/x;->o:Lcom/kubi/resources/widget/DashTextView;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p1, Lv30/x;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    if-eqz p1, :cond_5

    .line 35
    .line 36
    iget-object p1, p1, Lv30/x;->r:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 37
    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 42
    return-void

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    iget-object p1, p1, Lv30/x;->o:Lcom/kubi/resources/widget/DashTextView;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    iget-object p1, p1, Lv30/x;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->r(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    iget-object p1, p1, Lv30/x;->r:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 77
    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 82
    :cond_5
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
.end method

.method public final M4(Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lv30/x;->o:Lcom/kubi/resources/widget/DashTextView;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    const/16 v9, 0x6e

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x1

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    move-object v1, p2

    .line 27
    .line 28
    .line 29
    invoke-static/range {v1 .. v10}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    .line 34
    :goto_0
    const-string p2, "--"

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    :cond_1
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
.end method

.method public final N4(I)V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    if-gt p1, v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    iget-object p1, p1, Lv30/x;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    const/high16 v0, 0x41400000    # 12.0f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    const/16 v0, 0xa

    .line 23
    .line 24
    if-gt p1, v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p1, Lv30/x;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    const/high16 v0, 0x41300000    # 11.0f

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 40
    return-void

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object p1, p1, Lv30/x;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    const/high16 v0, 0x41200000    # 10.0f

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 56
    :cond_2
    return-void
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
.end method

.method public final O4()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSupportTradeTypes()Ljava/util/List;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    iget-object v2, v1, Lv30/x;->l:Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    const-string v4, "requireContext(...)"

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v3}, Lcom/kubi/core/biz/submit/h;->a(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;->setTabData(Ljava/util/List;)V

    .line 45
    .line 46
    iget-object v2, v1, Lv30/x;->l:Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    move-result-object v3

    .line 51
    const/4 v4, 0x0

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result v5

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object v5

    .line 62
    .line 63
    check-cast v5, Lcom/kubi/core/biz/submit/j2;

    .line 64
    .line 65
    .line 66
    invoke-interface {v5}, Lcom/kubi/core/biz/submit/j2;->isChecked()Z

    .line 67
    move-result v5

    .line 68
    const/4 v6, 0x1

    .line 69
    .line 70
    if-ne v5, v6, :cond_1

    .line 71
    goto :goto_1

    .line 72
    .line 73
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v4, -0x1

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {v2, v4}, Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;->setCurrent(I)V

    .line 79
    .line 80
    iget-object v1, v1, Lv30/x;->l:Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;

    .line 81
    .line 82
    new-instance v2, Lcom/kubi/core/biz/submit/horizontal/g;

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, v0, p0}, Lcom/kubi/core/biz/submit/horizontal/g;-><init>(Ljava/util/List;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;->setPositionChanged(Lio/reactivex/functions/BiConsumer;)V

    .line 89
    :cond_3
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
.end method

.method public S()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->x0()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->x0()V

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-void
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
.end method

.method public U()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->C0()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->C0()V

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-void
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
.end method

.method public a(Ljava/math/BigDecimal;)V
    .locals 5
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v1, v0, Lv30/x;->e:Landroid/widget/FrameLayout;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    if-lez v1, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, Lv30/x;->e:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    const-string v4, "flBuy"

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/k;->m(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    instance-of v4, v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v1, v2

    .line 41
    .line 42
    :goto_0
    if-eqz v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->A0(Ljava/math/BigDecimal;)V

    .line 46
    .line 47
    :cond_1
    iget-object v1, v0, Lv30/x;->f:Landroid/widget/FrameLayout;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 51
    move-result v1

    .line 52
    .line 53
    if-lez v1, :cond_3

    .line 54
    .line 55
    iget-object v0, v0, Lv30/x;->f:Landroid/widget/FrameLayout;

    .line 56
    .line 57
    const-string v1, "flSell"

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v3}, Lcom/kubi/utils/extensions/k;->m(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    instance-of v1, v0, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    move-object v2, v0

    .line 70
    .line 71
    check-cast v2, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 72
    .line 73
    :cond_2
    if-eqz v2, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->A0(Ljava/math/BigDecimal;)V

    .line 77
    :cond_3
    return-void
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
.end method

.method public b(I)V
    .locals 6

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iget-object v0, p1, Lv30/x;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    sget v1, Lcom/kubi/tradecorebiz/R$drawable;->ic2_triangle_top_12:I

    .line 19
    const/4 v4, 0x4

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object v0, p1, Lv30/x;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget v1, Lcom/kubi/tradecorebiz/R$drawable;->ic_drop_triangle_small_up:I

    .line 39
    const/4 v4, 0x4

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    iget-object v0, p1, Lv30/x;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    sget v1, Lcom/kubi/tradecorebiz/R$drawable;->ic_drop_triangle_small_up:I

    .line 58
    const/4 v4, 0x4

    .line 59
    const/4 v5, 0x0

    .line 60
    const/4 v2, 0x0

    .line 61
    const/4 v3, 0x0

    .line 62
    .line 63
    .line 64
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 65
    :cond_3
    :goto_0
    return-void
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
.end method

.method public c(I)V
    .locals 6

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iget-object v0, p1, Lv30/x;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    sget v1, Lcom/kubi/tradecorebiz/R$drawable;->ic2_triangle_bottom_12:I

    .line 19
    const/4 v4, 0x4

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object v0, p1, Lv30/x;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget v1, Lcom/kubi/tradecorebiz/R$mipmap;->ic_drop_triangle_small:I

    .line 39
    const/4 v4, 0x4

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    iget-object v0, p1, Lv30/x;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    sget v1, Lcom/kubi/tradecorebiz/R$mipmap;->ic_drop_triangle_small:I

    .line 58
    const/4 v4, 0x4

    .line 59
    const/4 v5, 0x0

    .line 60
    const/4 v2, 0x0

    .line 61
    const/4 v3, 0x0

    .line 62
    .line 63
    .line 64
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->i(Landroid/widget/TextView;IIIILjava/lang/Object;)V

    .line 65
    :cond_3
    :goto_0
    return-void
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
.end method

.method public c0()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

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
.end method

.method public d(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "labelStr"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lv30/x;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p2}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->N4(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->r(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->r(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->D4()V

    .line 39
    return-void
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
.end method

.method public f(Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/tradebase/tradetype/TradeType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "labelStr"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "type"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-eqz p1, :cond_4

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSupportTradeTypes()Ljava/util/List;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x0

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v2

    .line 46
    const/4 v3, -0x1

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    check-cast v2, Lcom/kubi/core/biz/submit/j2;

    .line 55
    .line 56
    .line 57
    invoke-interface {v2}, Lcom/kubi/core/biz/submit/j2;->a()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    if-ne v2, p2, :cond_1

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v1, v3

    .line 66
    .line 67
    :goto_1
    if-ne v1, v3, :cond_3

    .line 68
    goto :goto_2

    .line 69
    .line 70
    :cond_3
    iget-object v0, p1, Lv30/x;->l:Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;->setCurrentIndex(I)V

    .line 74
    .line 75
    iget-object v0, p1, Lv30/x;->f:Landroid/widget/FrameLayout;

    .line 76
    .line 77
    const-string v1, "flSell"

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    iget-object v1, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p2, v0, v1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->g4(Lcom/kubi/tradebase/tradetype/TradeType;Landroid/widget/FrameLayout;Ljava/util/Map;)V

    .line 86
    .line 87
    iget-object p1, p1, Lv30/x;->e:Landroid/widget/FrameLayout;

    .line 88
    .line 89
    const-string v0, "flBuy"

    .line 90
    .line 91
    .line 92
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p2, p1, v0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->g4(Lcom/kubi/tradebase/tradetype/TradeType;Landroid/widget/FrameLayout;Ljava/util/Map;)V

    .line 98
    :cond_4
    :goto_2
    return-void
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
.end method

.method public final g4(Lcom/kubi/tradebase/tradetype/TradeType;Landroid/widget/FrameLayout;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/tradebase/tradetype/TradeType;",
            "Landroid/widget/FrameLayout;",
            "Ljava/util/Map<",
            "Lcom/kubi/tradebase/tradetype/TradeType;",
            "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p3

    .line 5
    .line 6
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object v3

    .line 14
    .line 15
    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    new-instance v10, Lcom/kubi/core/biz/submit/horizontal/f;

    .line 20
    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    .line 24
    invoke-direct {v10, v3, v0, v2}, Lcom/kubi/core/biz/submit/horizontal/f;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;Lcom/kubi/tradebase/tradetype/TradeType;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 25
    .line 26
    sget-object v4, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$a;->$EnumSwitchMapping$0:[I

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 30
    move-result v5

    .line 31
    .line 32
    aget v4, v4, v5

    .line 33
    .line 34
    const-string v5, "requireContext(...)"

    .line 35
    .line 36
    .line 37
    packed-switch v4, :pswitch_data_0

    .line 38
    const/4 v4, 0x0

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :pswitch_0
    new-instance v4, Lcom/kubi/core/spot/business/holder/SegmentOrderHolder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    .line 49
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    move-object v5, v6

    .line 51
    .line 52
    sget-object v6, Lcom/kubi/tradebase/tradetype/TradeType;->SEGMENT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->l4()Lcom/kubi/core/spot/business/holder/f0;

    .line 56
    move-result-object v7

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 60
    move-result-object v8

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->p0()Ljava/util/LinkedList;

    .line 64
    move-result-object v8

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 68
    move-result-object v11

    .line 69
    .line 70
    const/16 v13, 0x80

    .line 71
    const/4 v14, 0x0

    .line 72
    move-object v9, v10

    .line 73
    move-object v10, v8

    .line 74
    const/4 v8, 0x1

    .line 75
    const/4 v12, 0x0

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v4 .. v14}, Lcom/kubi/core/spot/business/holder/SegmentOrderHolder;-><init>(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/f0;ZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/e0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :pswitch_1
    new-instance v4, Lcom/kubi/core/spot/business/holder/MarketOrderHolder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 86
    move-result-object v6

    .line 87
    .line 88
    .line 89
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    move-object v5, v6

    .line 91
    .line 92
    sget-object v6, Lcom/kubi/tradebase/tradetype/TradeType;->MARKET_STOP:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->l4()Lcom/kubi/core/spot/business/holder/f0;

    .line 96
    move-result-object v7

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 100
    move-result-object v8

    .line 101
    .line 102
    .line 103
    invoke-virtual {v8}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->p0()Ljava/util/LinkedList;

    .line 104
    move-result-object v11

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 108
    move-result-object v12

    .line 109
    .line 110
    const/16 v14, 0x100

    .line 111
    const/4 v15, 0x0

    .line 112
    const/4 v8, 0x1

    .line 113
    const/4 v9, 0x1

    .line 114
    const/4 v13, 0x0

    .line 115
    .line 116
    .line 117
    invoke-direct/range {v4 .. v15}, Lcom/kubi/core/spot/business/holder/MarketOrderHolder;-><init>(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/f0;ZZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/e0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :pswitch_2
    new-instance v4, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 125
    move-result-object v6

    .line 126
    .line 127
    .line 128
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    move-object v5, v6

    .line 130
    .line 131
    sget-object v6, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT_STOP:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->l4()Lcom/kubi/core/spot/business/holder/f0;

    .line 135
    move-result-object v7

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 139
    move-result-object v8

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->p0()Ljava/util/LinkedList;

    .line 143
    move-result-object v11

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 147
    move-result-object v12

    .line 148
    .line 149
    const/16 v14, 0x100

    .line 150
    const/4 v15, 0x0

    .line 151
    const/4 v8, 0x1

    .line 152
    const/4 v9, 0x1

    .line 153
    const/4 v13, 0x0

    .line 154
    .line 155
    .line 156
    invoke-direct/range {v4 .. v15}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;-><init>(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/f0;ZZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/e0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 157
    goto :goto_0

    .line 158
    .line 159
    :pswitch_3
    new-instance v4, Lcom/kubi/core/spot/business/holder/AdvancedLimitOrderHolder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 163
    move-result-object v6

    .line 164
    .line 165
    .line 166
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    move-object v5, v6

    .line 168
    .line 169
    sget-object v6, Lcom/kubi/tradebase/tradetype/TradeType;->ADVANCED_LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->l4()Lcom/kubi/core/spot/business/holder/f0;

    .line 173
    move-result-object v7

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 177
    move-result-object v8

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->p0()Ljava/util/LinkedList;

    .line 181
    move-result-object v11

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 185
    move-result-object v12

    .line 186
    .line 187
    const/16 v14, 0x108

    .line 188
    const/4 v15, 0x0

    .line 189
    const/4 v8, 0x0

    .line 190
    const/4 v9, 0x1

    .line 191
    const/4 v13, 0x0

    .line 192
    .line 193
    .line 194
    invoke-direct/range {v4 .. v15}, Lcom/kubi/core/spot/business/holder/AdvancedLimitOrderHolder;-><init>(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/f0;ZZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/e0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 195
    goto :goto_0

    .line 196
    .line 197
    :pswitch_4
    new-instance v4, Lcom/kubi/core/spot/business/holder/MarketOrderHolder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 201
    move-result-object v6

    .line 202
    .line 203
    .line 204
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    move-object v5, v6

    .line 206
    .line 207
    sget-object v6, Lcom/kubi/tradebase/tradetype/TradeType;->MARKET:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->l4()Lcom/kubi/core/spot/business/holder/f0;

    .line 211
    move-result-object v7

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 215
    move-result-object v8

    .line 216
    .line 217
    .line 218
    invoke-virtual {v8}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->p0()Ljava/util/LinkedList;

    .line 219
    move-result-object v11

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 223
    move-result-object v12

    .line 224
    .line 225
    const/16 v14, 0x108

    .line 226
    const/4 v15, 0x0

    .line 227
    const/4 v8, 0x0

    .line 228
    const/4 v9, 0x1

    .line 229
    const/4 v13, 0x0

    .line 230
    .line 231
    .line 232
    invoke-direct/range {v4 .. v15}, Lcom/kubi/core/spot/business/holder/MarketOrderHolder;-><init>(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/f0;ZZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/e0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 233
    goto :goto_0

    .line 234
    .line 235
    :pswitch_5
    new-instance v4, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 239
    move-result-object v6

    .line 240
    .line 241
    .line 242
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    move-object v5, v6

    .line 244
    .line 245
    sget-object v6, Lcom/kubi/tradebase/tradetype/TradeType;->LIMIT:Lcom/kubi/tradebase/tradetype/TradeType;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->l4()Lcom/kubi/core/spot/business/holder/f0;

    .line 249
    move-result-object v7

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 253
    move-result-object v8

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8}, Lcom/kubi/core/biz/submit/TradeSubmitVM;->p0()Ljava/util/LinkedList;

    .line 257
    move-result-object v11

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 261
    move-result-object v12

    .line 262
    .line 263
    const/16 v14, 0x108

    .line 264
    const/4 v15, 0x0

    .line 265
    const/4 v8, 0x0

    .line 266
    const/4 v9, 0x1

    .line 267
    const/4 v13, 0x0

    .line 268
    .line 269
    .line 270
    invoke-direct/range {v4 .. v15}, Lcom/kubi/core/spot/business/holder/LimitOrderHolder;-><init>(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/f0;ZZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/e0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 271
    .line 272
    :goto_0
    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 273
    .line 274
    if-eqz v4, :cond_1

    .line 275
    .line 276
    .line 277
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->w0()V

    .line 281
    goto :goto_1

    .line 282
    .line 283
    :cond_0
    move-object/from16 v3, p0

    .line 284
    .line 285
    :cond_1
    :goto_1
    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 288
    .line 289
    if-eqz v0, :cond_3

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {p2 .. p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getId()I

    .line 296
    move-result v1

    .line 297
    .line 298
    sget v2, Lcom/kubi/tradecorebiz/R$id;->fl_buy:I

    .line 299
    .line 300
    if-ne v1, v2, :cond_2

    .line 301
    const/4 v1, 0x1

    .line 302
    goto :goto_2

    .line 303
    :cond_2
    const/4 v1, 0x0

    .line 304
    .line 305
    .line 306
    :goto_2
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->setIsBuyHolder(Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->x0()V

    .line 310
    .line 311
    move-object/from16 v1, p2

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->F0()V

    .line 318
    :cond_3
    return-void

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/tradecorebiz/R$layout;->fragment_trade_horizontal:I

    .line 3
    return v0
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
.end method

.method public getVmClass()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/kubi/core/biz/submit/c1;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/core/biz/submit/c1;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

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
.end method

.method public h2()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->w0()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->w0()V

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-void
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
.end method

.method public i4(Lzc/c;)Lcom/kubi/core/biz/submit/c1;
    .locals 1
    .param p1    # Lzc/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "manager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/core/biz/submit/c1;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/kubi/core/biz/submit/c1;-><init>(Lzc/c;)V

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
.end method

.method public final j4()Lv30/x;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->a0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->h0:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lv30/x;

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
.end method

.method public final k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->e0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

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
.end method

.method public final l4()Lcom/kubi/core/spot/business/holder/f0;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->g0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/core/spot/business/holder/f0;

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
.end method

.method public final m4()Lhe/b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->b0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lhe/b;

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
.end method

.method public final n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->f0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

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
.end method

.method public final o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->Y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitVM;

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
.end method

.method public onRefresh()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "outState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Bundle;->clear()V

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
.end method

.method public onShow()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;->D3()Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;->t()Lcom/kubi/core/biz/symbol/SymbolBizUiState;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/core/biz/symbol/SymbolBizUiState;->getSymbolInfo()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/core/biz/symbol/SymbolBizUiState;->isMaintenance()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->E4(Lcom/kubi/data/entity/SymbolInfoEntity;Z)V

    .line 22
    const/4 v0, 0x1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1, v0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->v(Lcom/kubi/data/entity/SymbolInfoEntity;Z)V

    .line 26
    .line 27
    :cond_0
    new-instance v0, Ljava/math/BigDecimal;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getPrice()D

    .line 39
    move-result-wide v1

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    iget-object v1, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    move-result v2

    .line 61
    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    check-cast v2, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 69
    .line 70
    .line 71
    invoke-interface {v2, v0}, Lcom/kubi/core/spot/business/holder/g0;->b(Ljava/math/BigDecimal;)V

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_1
    iget-object v1, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    move-result v2

    .line 87
    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    check-cast v2, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 95
    .line 96
    .line 97
    invoke-interface {v2, v0}, Lcom/kubi/core/spot/business/holder/g0;->b(Ljava/math/BigDecimal;)V

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    return-void
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/mvi/state/BaseStateFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->p4()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->G4()Lkotlinx/coroutines/x1;

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
.end method

.method public p2()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->H()V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->H()V

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-void
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
.end method

.method public final p4()V
    .locals 15

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-object v3, v2, Lv30/x;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 11
    .line 12
    const-string v4, "cbOrderbookSelectPrecision"

    .line 13
    .line 14
    .line 15
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    new-instance v6, Lcom/kubi/core/biz/submit/horizontal/j;

    .line 18
    .line 19
    .line 20
    invoke-direct {v6, p0}, Lcom/kubi/core/biz/submit/horizontal/j;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 21
    const/4 v7, 0x1

    .line 22
    const/4 v8, 0x0

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 28
    .line 29
    iget-object v3, v2, Lv30/x;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 30
    .line 31
    const-string v4, "tvAmountUnit"

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    iget-object v4, v2, Lv30/x;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 37
    .line 38
    const-string v5, "tvAmountUnit1"

    .line 39
    .line 40
    .line 41
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const/4 v5, 0x2

    .line 43
    .line 44
    new-array v5, v5, [Landroid/view/View;

    .line 45
    .line 46
    aput-object v3, v5, v1

    .line 47
    .line 48
    aput-object v4, v5, v0

    .line 49
    .line 50
    new-instance v3, Lcom/kubi/core/biz/submit/horizontal/k;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3, p0}, Lcom/kubi/core/biz/submit/horizontal/k;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v5, v3}, Lcom/kubi/utils/extensions/k;->D([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 57
    .line 58
    iget-object v3, v2, Lv30/x;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 62
    .line 63
    iget-object v3, v2, Lv30/x;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    iget-object v4, v2, Lv30/x;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v4}, Lio/chad/library/adapter/base/BaseQuickAdapter;->bindToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 79
    move-result-object v3

    .line 80
    .line 81
    iget-object v4, v2, Lv30/x;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v4}, Lio/chad/library/adapter/base/BaseQuickAdapter;->bindToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 88
    move-result-object v3

    .line 89
    .line 90
    sget v4, Lcom/kubi/tradecorebiz/R$layout;->trade_core_view_orderbook_loading:I

    .line 91
    .line 92
    iget-object v5, v2, Lv30/x;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v4, v5}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setEmptyView(ILandroid/view/ViewGroup;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    iget-object v5, v2, Lv30/x;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v4, v5}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setEmptyView(ILandroid/view/ViewGroup;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 108
    move-result-object v3

    .line 109
    const/4 v4, 0x5

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v4}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->u(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v4}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->u(I)V

    .line 120
    .line 121
    iget-object v3, v2, Lv30/x;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 122
    .line 123
    const-string v4, "rcvSell"

    .line 124
    .line 125
    .line 126
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    const/4 v4, 0x0

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v1, v0, v4}, Lcom/kubi/resources/t;->h(Landroidx/recyclerview/widget/RecyclerView;ZILjava/lang/Object;)V

    .line 131
    .line 132
    iget-object v3, v2, Lv30/x;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 133
    .line 134
    const-string v5, "rcvBuy"

    .line 135
    .line 136
    .line 137
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v3, v1, v0, v4}, Lcom/kubi/resources/t;->h(Landroidx/recyclerview/widget/RecyclerView;ZILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    new-instance v1, Lcom/kubi/core/biz/submit/horizontal/l;

    .line 147
    .line 148
    .line 149
    invoke-direct {v1, p0}, Lcom/kubi/core/biz/submit/horizontal/l;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->setSelectListener(Lcom/kubi/resources/widget/OrderBookItemView$a;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 156
    move-result-object v0

    .line 157
    .line 158
    new-instance v1, Lcom/kubi/core/biz/submit/horizontal/m;

    .line 159
    .line 160
    .line 161
    invoke-direct {v1, p0}, Lcom/kubi/core/biz/submit/horizontal/m;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->setSelectListener(Lcom/kubi/resources/widget/OrderBookItemView$a;)V

    .line 165
    .line 166
    iget-object v3, v2, Lv30/x;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 167
    .line 168
    const-string v0, "llCenter"

    .line 169
    .line 170
    .line 171
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    new-instance v6, Lcom/kubi/core/biz/submit/horizontal/n;

    .line 174
    .line 175
    .line 176
    invoke-direct {v6, v2, p0}, Lcom/kubi/core/biz/submit/horizontal/n;-><init>(Lv30/x;Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 177
    .line 178
    const-wide/16 v4, 0x0

    .line 179
    .line 180
    .line 181
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 182
    .line 183
    iget-object v9, v2, Lv30/x;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 184
    .line 185
    const-string v0, "ivPriceTypeInfo"

    .line 186
    .line 187
    .line 188
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    new-instance v12, Lcom/kubi/core/biz/submit/horizontal/o;

    .line 191
    .line 192
    .line 193
    invoke-direct {v12, p0}, Lcom/kubi/core/biz/submit/horizontal/o;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 194
    const/4 v13, 0x1

    .line 195
    const/4 v14, 0x0

    .line 196
    .line 197
    const-wide/16 v10, 0x0

    .line 198
    .line 199
    .line 200
    invoke-static/range {v9 .. v14}, Lcom/kubi/core/base/utils/d;->d(Landroid/view/View;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 201
    .line 202
    iget-object v3, v2, Lv30/x;->o:Lcom/kubi/resources/widget/DashTextView;

    .line 203
    .line 204
    const-string v0, "tvEtfValue"

    .line 205
    .line 206
    .line 207
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    new-instance v6, Lcom/kubi/core/biz/submit/horizontal/p;

    .line 210
    .line 211
    .line 212
    invoke-direct {v6, p0}, Lcom/kubi/core/biz/submit/horizontal/p;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 213
    .line 214
    .line 215
    invoke-static/range {v3 .. v8}, Lcom/kubi/core/base/utils/d;->d(Landroid/view/View;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 216
    .line 217
    iget-object v9, v2, Lv30/x;->c:Lcom/kubi/resources/widget/BuySellRatioView;

    .line 218
    .line 219
    const-string v0, "buySellRatioView"

    .line 220
    .line 221
    .line 222
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    new-instance v12, Lcom/kubi/core/biz/submit/horizontal/q;

    .line 225
    .line 226
    .line 227
    invoke-direct {v12, p0}, Lcom/kubi/core/biz/submit/horizontal/q;-><init>(Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;)V

    .line 228
    .line 229
    .line 230
    invoke-static/range {v9 .. v14}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 231
    :cond_0
    return-void
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
.end method

.method public s(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/core/spot/entity/OrderBookCenterEntity;)V
    .locals 12
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/core/spot/entity/OrderBookCenterEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbolInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "data"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getPrice()D

    .line 30
    move-result-wide v0

    .line 31
    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    cmpg-double p2, v0, v2

    .line 35
    .line 36
    if-nez p2, :cond_3

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    const-string p2, "--"

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p1, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p1, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    sget v0, Lcom/kubi/tradecorebiz/R$color;->c_text40:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 67
    move-result v0

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    if-eqz p1, :cond_c

    .line 77
    .line 78
    iget-object p1, p1, Lv30/x;->r:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 79
    .line 80
    if-eqz p1, :cond_c

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    return-void

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    const-string v0, "requireContext(...)"

    .line 91
    .line 92
    .line 93
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 97
    move-result-object v0

    .line 98
    const/4 v1, 0x0

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, v0, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 108
    move-result-object v0

    .line 109
    goto :goto_0

    .line 110
    :cond_4
    move-object v0, v1

    .line 111
    .line 112
    :goto_0
    instance-of v2, v0, Ljava/lang/Double;

    .line 113
    .line 114
    if-eqz v2, :cond_5

    .line 115
    move-object v1, v0

    .line 116
    .line 117
    check-cast v1, Ljava/lang/Double;

    .line 118
    .line 119
    .line 120
    :cond_5
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 121
    move-result-wide v0

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    .line 128
    invoke-interface {v2}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getPrice()D

    .line 133
    move-result-wide v2

    .line 134
    .line 135
    .line 136
    invoke-static {p2, v0, v1, v2, v3}, Lcom/kubi/sdk/util/b;->a(Landroid/content/Context;DD)I

    .line 137
    move-result p2

    .line 138
    const/4 v0, -0x1

    .line 139
    .line 140
    if-eq p2, v0, :cond_6

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    iget-object v0, v0, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 154
    .line 155
    .line 156
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 157
    move-result-object p2

    .line 158
    .line 159
    if-eqz p2, :cond_7

    .line 160
    .line 161
    iget-object p2, p2, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 162
    .line 163
    if-eqz p2, :cond_7

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    .line 170
    invoke-interface {v0}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 171
    move-result-object v0

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getPrice()D

    .line 175
    move-result-wide v0

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 179
    move-result-object v0

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 186
    move-result-object p2

    .line 187
    .line 188
    if-eqz p2, :cond_8

    .line 189
    .line 190
    iget-object p2, p2, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 191
    .line 192
    if-eqz p2, :cond_8

    .line 193
    .line 194
    new-instance v0, Ljava/math/BigDecimal;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 198
    move-result-object v1

    .line 199
    .line 200
    .line 201
    invoke-interface {v1}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getPrice()D

    .line 206
    move-result-wide v1

    .line 207
    .line 208
    .line 209
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    .line 213
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getCode()Ljava/lang/String;

    .line 217
    move-result-object v1

    .line 218
    .line 219
    const/16 v8, 0x6e

    .line 220
    const/4 v9, 0x0

    .line 221
    const/4 v2, 0x0

    .line 222
    const/4 v3, 0x0

    .line 223
    const/4 v4, 0x0

    .line 224
    const/4 v5, 0x1

    .line 225
    const/4 v6, 0x0

    .line 226
    const/4 v7, 0x0

    .line 227
    .line 228
    .line 229
    invoke-static/range {v0 .. v9}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 230
    move-result-object v0

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    .line 235
    .line 236
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 237
    move-result-object p2

    .line 238
    .line 239
    if-eqz p2, :cond_9

    .line 240
    .line 241
    iget-object p2, p2, Lv30/x;->r:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 242
    .line 243
    if-eqz p2, :cond_9

    .line 244
    .line 245
    .line 246
    invoke-static {p2}, Lcom/kubi/sdk/util/n1;->c(Landroid/widget/TextView;)V

    .line 247
    .line 248
    .line 249
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 250
    move-result-object p2

    .line 251
    .line 252
    if-eqz p2, :cond_a

    .line 253
    .line 254
    iget-object p2, p2, Lv30/x;->r:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 255
    .line 256
    if-eqz p2, :cond_a

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 260
    move-result-object v0

    .line 261
    .line 262
    .line 263
    invoke-interface {v0}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 264
    move-result-object v0

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getPrice()D

    .line 268
    move-result-wide v0

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 272
    move-result-object p1

    .line 273
    .line 274
    .line 275
    invoke-static {v0, v1, p1}, Lkf/a;->m(DLjava/lang/String;)D

    .line 276
    move-result-wide v2

    .line 277
    .line 278
    const/16 v10, 0xf

    .line 279
    const/4 v11, 0x0

    .line 280
    const/4 v4, 0x0

    .line 281
    const/4 v5, 0x0

    .line 282
    const/4 v6, 0x0

    .line 283
    const/4 v7, 0x0

    .line 284
    const/4 v8, 0x1

    .line 285
    const/4 v9, 0x1

    .line 286
    .line 287
    .line 288
    invoke-static/range {v2 .. v11}, Lkf/a;->v(DLjava/lang/String;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 289
    move-result-object p1

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    .line 294
    :cond_a
    iget-object p1, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 295
    .line 296
    .line 297
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 298
    move-result-object p1

    .line 299
    .line 300
    .line 301
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    move-result-object p1

    .line 303
    .line 304
    .line 305
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    move-result p2

    .line 307
    .line 308
    if-eqz p2, :cond_b

    .line 309
    .line 310
    .line 311
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    move-result-object p2

    .line 313
    .line 314
    check-cast p2, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 315
    .line 316
    new-instance v0, Ljava/math/BigDecimal;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    .line 323
    invoke-interface {v1}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 324
    move-result-object v1

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getPrice()D

    .line 328
    move-result-wide v1

    .line 329
    .line 330
    .line 331
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 332
    move-result-object v1

    .line 333
    .line 334
    .line 335
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p2, v0}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->z0(Ljava/math/BigDecimal;)V

    .line 339
    goto :goto_1

    .line 340
    .line 341
    :cond_b
    iget-object p1, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 342
    .line 343
    .line 344
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 345
    move-result-object p1

    .line 346
    .line 347
    .line 348
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 349
    move-result-object p1

    .line 350
    .line 351
    .line 352
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    move-result p2

    .line 354
    .line 355
    if-eqz p2, :cond_c

    .line 356
    .line 357
    .line 358
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    move-result-object p2

    .line 360
    .line 361
    check-cast p2, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 362
    .line 363
    new-instance v0, Ljava/math/BigDecimal;

    .line 364
    .line 365
    .line 366
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 367
    move-result-object v1

    .line 368
    .line 369
    .line 370
    invoke-interface {v1}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 371
    move-result-object v1

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1}, Lcom/kubi/core/spot/entity/OrderBookCenterEntity;->getPrice()D

    .line 375
    move-result-wide v1

    .line 376
    .line 377
    .line 378
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 379
    move-result-object v1

    .line 380
    .line 381
    .line 382
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p2, v0}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->z0(Ljava/math/BigDecimal;)V

    .line 386
    goto :goto_2

    .line 387
    :cond_c
    :goto_3
    return-void
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
.end method

.method public v(Lcom/kubi/data/entity/SymbolInfoEntity;Z)V
    .locals 4
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "symbolInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->o4()Lcom/kubi/core/biz/submit/TradeSubmitVM;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/mvi/state/BaseStateVM;->getState()Lcom/kubi/mvi/state/f;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;->getSupportTradeTypes()Ljava/util/List;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    const-string v2, "requireContext(...)"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lcom/kubi/core/biz/submit/h;->a(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, v2, Lv30/x;->l:Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;->getTabCount()I

    .line 52
    move-result v2

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 56
    move-result v3

    .line 57
    .line 58
    if-ne v2, v3, :cond_1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    iget-object v2, v2, Lv30/x;->l:Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;

    .line 68
    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;->setTabData(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    move-result v1

    .line 85
    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    move-result-object v1

    .line 91
    move-object v2, v1

    .line 92
    .line 93
    check-cast v2, Lcom/kubi/core/biz/submit/j2;

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, Lcom/kubi/core/biz/submit/j2;->isChecked()Z

    .line 97
    move-result v2

    .line 98
    .line 99
    if-eqz v2, :cond_3

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    const/4 v1, 0x0

    .line 102
    .line 103
    :goto_1
    check-cast v1, Lcom/kubi/core/biz/submit/j2;

    .line 104
    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    goto/16 :goto_7

    .line 108
    .line 109
    .line 110
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Lcom/kubi/core/biz/submit/j2;->b()I

    .line 115
    move-result v2

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    const-string v2, "getString(...)"

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v1}, Lcom/kubi/core/biz/submit/j2;->a()Lcom/kubi/tradebase/tradetype/TradeType;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0, v1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->f(Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 139
    move-result v1

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->o(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 150
    move-result v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->o(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    iget-object v0, v0, Lv30/x;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 167
    move-result v1

    .line 168
    .line 169
    .line 170
    invoke-static {v1}, Laf/a;->b(I)Ljava/util/ArrayList;

    .line 171
    move-result-object v1

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 175
    move-result v2

    .line 176
    .line 177
    .line 178
    invoke-direct {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->s0()I

    .line 179
    move-result v3

    .line 180
    sub-int/2addr v2, v3

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 184
    move-result v3

    .line 185
    .line 186
    if-le v3, v2, :cond_6

    .line 187
    .line 188
    if-ltz v2, :cond_6

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 192
    move-result-object v1

    .line 193
    .line 194
    check-cast v1, Ljava/lang/String;

    .line 195
    goto :goto_2

    .line 196
    :cond_6
    const/4 v2, 0x0

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 200
    move-result-object v1

    .line 201
    .line 202
    check-cast v1, Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    .line 207
    .line 208
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 209
    move-result-object v0

    .line 210
    .line 211
    .line 212
    invoke-direct {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->s0()I

    .line 213
    move-result v1

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->r(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    .line 223
    invoke-direct {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->s0()I

    .line 224
    move-result v1

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v1}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->r(I)V

    .line 228
    .line 229
    if-nez p2, :cond_a

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 233
    move-result-object v0

    .line 234
    .line 235
    const-string v1, "--"

    .line 236
    .line 237
    if-eqz v0, :cond_8

    .line 238
    .line 239
    iget-object v0, v0, Lv30/x;->s:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 240
    .line 241
    if-eqz v0, :cond_8

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    .line 246
    .line 247
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 248
    move-result-object v0

    .line 249
    .line 250
    if-eqz v0, :cond_9

    .line 251
    .line 252
    iget-object v0, v0, Lv30/x;->r:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 253
    .line 254
    if-eqz v0, :cond_9

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    .line 259
    .line 260
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 261
    move-result-object v0

    .line 262
    .line 263
    if-eqz v0, :cond_a

    .line 264
    .line 265
    iget-object v0, v0, Lv30/x;->o:Lcom/kubi/resources/widget/DashTextView;

    .line 266
    .line 267
    if-eqz v0, :cond_a

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 274
    move-result-object v0

    .line 275
    .line 276
    if-eqz v0, :cond_b

    .line 277
    .line 278
    iget-object v0, v0, Lv30/x;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 279
    .line 280
    if-eqz v0, :cond_b

    .line 281
    .line 282
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 283
    .line 284
    sget v2, Lcom/kubi/tradecorebiz/R$string;->price_order:I

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 288
    move-result-object v3

    .line 289
    .line 290
    .line 291
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 292
    move-result-object v3

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 296
    move-result-object v1

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    .line 301
    .line 302
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 303
    move-result-object v0

    .line 304
    .line 305
    if-eqz v0, :cond_d

    .line 306
    .line 307
    iget-object v0, v0, Lv30/x;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 308
    .line 309
    if-eqz v0, :cond_d

    .line 310
    .line 311
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 315
    move-result-object v2

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 319
    move-result v2

    .line 320
    .line 321
    if-nez v2, :cond_c

    .line 322
    .line 323
    sget v2, Lcom/kubi/tradecorebiz/R$string;->total_stub:I

    .line 324
    goto :goto_3

    .line 325
    .line 326
    :cond_c
    sget v2, Lcom/kubi/tradecorebiz/R$string;->amount_stub:I

    .line 327
    .line 328
    .line 329
    :goto_3
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 330
    move-result-object v3

    .line 331
    .line 332
    .line 333
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 334
    move-result-object v3

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 338
    move-result-object v1

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    .line 343
    .line 344
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->j4()Lv30/x;

    .line 345
    move-result-object v0

    .line 346
    .line 347
    if-eqz v0, :cond_f

    .line 348
    .line 349
    iget-object v0, v0, Lv30/x;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 350
    .line 351
    if-eqz v0, :cond_f

    .line 352
    .line 353
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 357
    move-result-object v2

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 361
    move-result v2

    .line 362
    .line 363
    if-nez v2, :cond_e

    .line 364
    .line 365
    sget v2, Lcom/kubi/tradecorebiz/R$string;->total_stub:I

    .line 366
    goto :goto_4

    .line 367
    .line 368
    :cond_e
    sget v2, Lcom/kubi/tradecorebiz/R$string;->amount_stub:I

    .line 369
    .line 370
    .line 371
    :goto_4
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 372
    move-result-object v3

    .line 373
    .line 374
    .line 375
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 376
    move-result-object v3

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 380
    move-result-object v1

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 384
    .line 385
    .line 386
    :cond_f
    invoke-direct {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->s0()I

    .line 387
    move-result v0

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0, v0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->N4(I)V

    .line 391
    .line 392
    if-eqz p2, :cond_10

    .line 393
    goto :goto_7

    .line 394
    .line 395
    .line 396
    :cond_10
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->k4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 397
    move-result-object p2

    .line 398
    .line 399
    .line 400
    invoke-virtual {p2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->h()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->n4()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;

    .line 404
    move-result-object p2

    .line 405
    .line 406
    .line 407
    invoke-virtual {p2}, Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;->h()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->m4()Lhe/b;

    .line 411
    move-result-object p2

    .line 412
    .line 413
    .line 414
    invoke-interface {p2}, Lhe/b;->G()Lcom/kubi/core/spot/entity/OrderBookCenterEntity;

    .line 415
    move-result-object p2

    .line 416
    .line 417
    .line 418
    invoke-virtual {p0, p1, p2}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->s(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/core/spot/entity/OrderBookCenterEntity;)V

    .line 419
    .line 420
    iget-object p1, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->c0:Ljava/util/Map;

    .line 421
    .line 422
    .line 423
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 424
    move-result-object p1

    .line 425
    .line 426
    .line 427
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 428
    move-result-object p1

    .line 429
    .line 430
    .line 431
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    move-result p2

    .line 433
    .line 434
    if-eqz p2, :cond_11

    .line 435
    .line 436
    .line 437
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    move-result-object p2

    .line 439
    .line 440
    check-cast p2, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {p2}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->E0()V

    .line 444
    goto :goto_5

    .line 445
    .line 446
    :cond_11
    iget-object p1, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->d0:Ljava/util/Map;

    .line 447
    .line 448
    .line 449
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 450
    move-result-object p1

    .line 451
    .line 452
    .line 453
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 454
    move-result-object p1

    .line 455
    .line 456
    .line 457
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    move-result p2

    .line 459
    .line 460
    if-eqz p2, :cond_12

    .line 461
    .line 462
    .line 463
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    move-result-object p2

    .line 465
    .line 466
    check-cast p2, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {p2}, Lcom/kubi/core/spot/business/holder/BaseOrderHolder;->E0()V

    .line 470
    goto :goto_6

    .line 471
    :cond_12
    :goto_7
    return-void
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
.end method

.method public bridge synthetic v3(Lzc/c;)Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->i4(Lzc/c;)Lcom/kubi/core/biz/submit/c1;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public y3()Lbe/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;->Z:Lbe/a;

    .line 3
    return-object v0
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
.end method
