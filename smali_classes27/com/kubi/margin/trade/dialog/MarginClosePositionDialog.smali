.class public final Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;
.super Lcom/kubi/resources/dialog/GravityDialogFragment;
.source "MarginClosePositionDialog.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "KCCyclomaticComplexityCheck",
        "KCLongMethodCheck"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u0002032\u0008\u00105\u001a\u0004\u0018\u000106H\u0016J&\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\u0008\u0010;\u001a\u0004\u0018\u00010<2\u0008\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u0010=\u001a\u0002032\u0006\u0010>\u001a\u0002082\u0008\u00105\u001a\u0004\u0018\u000106H\u0016J\u0008\u0010?\u001a\u000203H\u0002J\n\u0010@\u001a\u0004\u0018\u00010AH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0013R#\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001aR#\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u001c\u001a\u0004\u0008$\u0010%R\u001d\u0010\'\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u001c\u001a\u0004\u0008)\u0010*R\u0012\u0010,\u001a\u0004\u0018\u00010-X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000100X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"
    }
    d2 = {
        "Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;",
        "Lcom/kubi/resources/dialog/GravityDialogFragment;",
        "position",
        "Lcom/kubi/margin/api/entity/MarginPosition;",
        "symbolInfo",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "action",
        "Lio/reactivex/functions/Action;",
        "<init>",
        "(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/data/entity/SymbolInfoEntity;Lio/reactivex/functions/Action;)V",
        "getPosition",
        "()Lcom/kubi/margin/api/entity/MarginPosition;",
        "getSymbolInfo",
        "()Lcom/kubi/data/entity/SymbolInfoEntity;",
        "getAction",
        "()Lio/reactivex/functions/Action;",
        "bmarginDialogMarginClosePositionBinding",
        "Lcom/kubi/margin/databinding/BmarginDialogMarginClosePositionBinding;",
        "getBmarginDialogMarginClosePositionBinding",
        "()Lcom/kubi/margin/databinding/BmarginDialogMarginClosePositionBinding;",
        "bmarginDialogMarginClosePositionBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "marketApi",
        "Lcom/kubi/margin/api/MarketApi;",
        "kotlin.jvm.PlatformType",
        "getMarketApi",
        "()Lcom/kubi/margin/api/MarketApi;",
        "marketApi$delegate",
        "Lkotlin/Lazy;",
        "marginApi",
        "Lcom/kubi/margin/api/MarginApi;",
        "getMarginApi",
        "()Lcom/kubi/margin/api/MarginApi;",
        "marginApi$delegate",
        "positionFragment",
        "Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;",
        "getPositionFragment",
        "()Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;",
        "positionFragment$delegate",
        "isolateConfig",
        "Lcom/kubi/margin/entity/IsolateMarginPositionConfig;",
        "getIsolateConfig",
        "()Lcom/kubi/margin/entity/IsolateMarginPositionConfig;",
        "isolateConfig$delegate",
        "isLong",
        "",
        "Ljava/lang/Boolean;",
        "baseAsset",
        "Lcom/kubi/tradebase/entity/CurrencyBalance;",
        "quoteAsset",
        "dismiss",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "onViewCreated",
        "view",
        "requestOrder",
        "marginFragment",
        "Lcom/kubi/margin/trade/BaseMarginFragment;",
        "MarginLib_googleRelease"
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
        "SMAP\nMarginClosePositionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginClosePositionDialog.kt\ncom/kubi/margin/trade/dialog/MarginClosePositionDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,331:1\n143#2,20:332\n*S KotlinDebug\n*F\n+ 1 MarginClosePositionDialog.kt\ncom/kubi/margin/trade/dialog/MarginClosePositionDialog\n*L\n72#1:332,20\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic n0:[Lkotlin/reflect/KProperty;
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
.field public final c0:Lcom/kubi/margin/api/entity/MarginPosition;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d0:Lcom/kubi/data/entity/SymbolInfoEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final e0:Lio/reactivex/functions/Action;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k0:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l0:Lcom/kubi/tradebase/entity/CurrencyBalance;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final m0:Lcom/kubi/tradebase/entity/CurrencyBalance;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    const-string v1, "getBmarginDialogMarginClosePositionBinding()Lcom/kubi/margin/databinding/BmarginDialogMarginClosePositionBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;

    .line 8
    .line 9
    const-string v4, "bmarginDialogMarginClosePositionBinding"

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
    sput-object v1, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->n0:[Lkotlin/reflect/KProperty;

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
.end method

.method public constructor <init>(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/data/entity/SymbolInfoEntity;Lio/reactivex/functions/Action;)V
    .locals 1
    .param p1    # Lcom/kubi/margin/api/entity/MarginPosition;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lio/reactivex/functions/Action;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/kubi/resources/dialog/GravityDialogFragment;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->c0:Lcom/kubi/margin/api/entity/MarginPosition;

    .line 4
    iput-object p2, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->d0:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 5
    iput-object p3, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->e0:Lio/reactivex/functions/Action;

    .line 6
    sget-object p2, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog$special$$inlined$viewBindingFragment$default$1;->INSTANCE:Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog$special$$inlined$viewBindingFragment$default$1;

    .line 7
    new-instance p3, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog$special$$inlined$viewBindingFragment$default$2;

    invoke-direct {p3}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog$special$$inlined$viewBindingFragment$default$2;-><init>()V

    invoke-static {p0, p3, p2}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    move-result-object p2

    .line 8
    iput-object p2, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->f0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 9
    new-instance p2, Lcom/kubi/margin/trade/dialog/r;

    invoke-direct {p2}, Lcom/kubi/margin/trade/dialog/r;-><init>()V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->g0:Lkotlin/Lazy;

    .line 10
    new-instance p2, Lcom/kubi/margin/trade/dialog/s;

    invoke-direct {p2}, Lcom/kubi/margin/trade/dialog/s;-><init>()V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->h0:Lkotlin/Lazy;

    .line 11
    new-instance p2, Lcom/kubi/margin/trade/dialog/t;

    invoke-direct {p2, p0}, Lcom/kubi/margin/trade/dialog/t;-><init>(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->i0:Lkotlin/Lazy;

    .line 12
    new-instance p2, Lcom/kubi/margin/trade/dialog/u;

    invoke-direct {p2, p0}, Lcom/kubi/margin/trade/dialog/u;-><init>(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->j0:Lkotlin/Lazy;

    .line 13
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->isShowDirection()Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 14
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    move-result-object p2

    iput-object p2, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 15
    invoke-virtual {p1}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/data/entity/SymbolInfoEntity;Lio/reactivex/functions/Action;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;-><init>(Lcom/kubi/margin/api/entity/MarginPosition;Lcom/kubi/data/entity/SymbolInfoEntity;Lio/reactivex/functions/Action;)V

    return-void
.end method

.method public static synthetic A3()Lxo/h;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->V3()Lxo/h;

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
.end method

.method public static synthetic B3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->a4()Lkotlin/Unit;

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
.end method

.method public static synthetic C3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;Ldp/d;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->W3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;Ldp/d;)Lkotlin/Unit;

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
.end method

.method public static synthetic D3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lcom/kubi/margin/entity/IsolateMarginPositionConfig;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->S3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lcom/kubi/margin/entity/IsolateMarginPositionConfig;

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
.end method

.method public static synthetic E3()Lxo/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->T3()Lxo/f;

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
.end method

.method public static synthetic F3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->X3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lkotlin/Unit;

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
.end method

.method public static synthetic G3(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->b4(Ljava/lang/Throwable;)Lkotlin/Unit;

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
.end method

.method public static final synthetic H3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lio/reactivex/disposables/CompositeDisposable;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->getDestroyDisposable()Lio/reactivex/disposables/CompositeDisposable;

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
.end method

.method public static final synthetic I3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lcom/kubi/margin/entity/IsolateMarginPositionConfig;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->N3()Lcom/kubi/margin/entity/IsolateMarginPositionConfig;

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
.end method

.method public static final synthetic J3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lxo/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->O3()Lxo/f;

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
.end method

.method public static final synthetic K3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lcom/kubi/margin/trade/BaseMarginFragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->U3()Lcom/kubi/margin/trade/BaseMarginFragment;

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
.end method

.method private final O3()Lxo/f;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->h0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lxo/f;

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
.end method

.method public static final S3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lcom/kubi/margin/entity/IsolateMarginPositionConfig;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/margin/trade/MarginConfigManager;->a:Lcom/kubi/margin/trade/MarginConfigManager;

    .line 3
    .line 4
    iget-object p0, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->c0:Lcom/kubi/margin/api/entity/MarginPosition;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/kubi/margin/trade/MarginConfigManager;->S0(Ljava/lang/String;)Lcom/kubi/margin/entity/IsolateMarginPositionConfig;

    .line 16
    move-result-object p0

    .line 17
    return-object p0
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
.end method

.method public static final T3()Lxo/f;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lxo/f;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lxo/f;

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

.method public static final V3()Lxo/h;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lxo/h;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lxo/h;

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

.method public static final W3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;Ldp/d;)Lkotlin/Unit;
    .locals 11

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->c0:Lcom/kubi/margin/api/entity/MarginPosition;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "symbol"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    iget-object p1, p1, Ldp/d;->n:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/kubi/resources/widget/RadioGroupPlus;->getCheckedRadioButtonId()I

    .line 22
    move-result p1

    .line 23
    .line 24
    sget v1, Lcom/kubi/margin/R$id;->rb_one:I

    .line 25
    .line 26
    const-string v2, "retainBase"

    .line 27
    .line 28
    const-string v3, "retainQuote"

    .line 29
    const/4 v4, 0x1

    .line 30
    .line 31
    if-ne p1, v1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v4}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 37
    move-result p1

    .line 38
    .line 39
    if-eqz p1, :cond_4

    .line 40
    :cond_0
    move-object v2, v3

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_1
    sget v1, Lcom/kubi/margin/R$id;->rb_two:I

    .line 44
    .line 45
    if-ne p1, v1, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v4}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 51
    move-result p1

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_2
    sget v1, Lcom/kubi/margin/R$id;->rb_three:I

    .line 57
    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    const-string v2, "liquidationLiability"

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_3
    const-string v2, ""

    .line 64
    .line 65
    :cond_4
    :goto_0
    const-string p1, "model"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 71
    .line 72
    const-string p1, "B4tradingIsolated"

    .line 73
    .line 74
    const-string v1, "orderManagement"

    .line 75
    .line 76
    const-string v2, "15"

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v1, v2, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->U3()Lcom/kubi/margin/trade/BaseMarginFragment;

    .line 83
    move-result-object p1

    .line 84
    const/4 v0, 0x0

    .line 85
    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/kubi/margin/trade/BaseMarginFragment;->M()Z

    .line 90
    move-result p1

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    move-result-object p1

    .line 95
    goto :goto_1

    .line 96
    :cond_5
    move-object p1, v0

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 100
    move-result p1

    .line 101
    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    sget p1, Lcom/kubi/margin/R$string;->outage_tip:I

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->dismissAllowingStateLoss()V

    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 113
    return-object p0

    .line 114
    .line 115
    :cond_6
    sget-object p1, Lmp/a;->a:Lmp/a;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lmp/a;->g()Lcom/kubi/user/api/IUserService;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-interface {p1}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/kubi/user/model/LoginUserEntity;->isHasOpenLever()Z

    .line 127
    move-result p1

    .line 128
    .line 129
    if-nez p1, :cond_7

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->dismissAllowingStateLoss()V

    .line 133
    .line 134
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 135
    .line 136
    const/16 v9, 0x7f

    .line 137
    const/4 v10, 0x0

    .line 138
    const/4 v2, 0x0

    .line 139
    const/4 v3, 0x0

    .line 140
    const/4 v4, 0x0

    .line 141
    const/4 v5, 0x0

    .line 142
    const/4 v6, 0x0

    .line 143
    const/4 v7, 0x0

    .line 144
    const/4 v8, 0x0

    .line 145
    .line 146
    .line 147
    invoke-static/range {v1 .. v10}, Lg00/h$a;->e(Lg00/h;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 150
    return-object p0

    .line 151
    .line 152
    :cond_7
    iget-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->d0:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 153
    .line 154
    if-eqz p1, :cond_8

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEnableTrading()Z

    .line 158
    move-result p1

    .line 159
    .line 160
    .line 161
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    move-result-object p1

    .line 163
    goto :goto_2

    .line 164
    :cond_8
    move-object p1, v0

    .line 165
    .line 166
    .line 167
    :goto_2
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 168
    move-result p1

    .line 169
    .line 170
    if-nez p1, :cond_c

    .line 171
    .line 172
    iget-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->d0:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 173
    .line 174
    if-eqz p1, :cond_9

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getDisabledTip()Ljava/lang/String;

    .line 178
    move-result-object p1

    .line 179
    goto :goto_3

    .line 180
    :cond_9
    move-object p1, v0

    .line 181
    .line 182
    .line 183
    :goto_3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 184
    move-result p1

    .line 185
    .line 186
    if-eqz p1, :cond_a

    .line 187
    .line 188
    sget p1, Lcom/kubi/margin/R$string;->current_trade_pause:I

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 192
    move-result-object v0

    .line 193
    goto :goto_4

    .line 194
    .line 195
    :cond_a
    iget-object p1, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->d0:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 196
    .line 197
    if-eqz p1, :cond_b

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getDisabledTip()Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    :cond_b
    :goto_4
    const/4 p1, 0x0

    .line 203
    .line 204
    new-array p1, p1, [Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    invoke-static {v0, p1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->dismissAllowingStateLoss()V

    .line 211
    .line 212
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 213
    return-object p0

    .line 214
    .line 215
    .line 216
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->Q3()Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 217
    move-result-object p1

    .line 218
    .line 219
    .line 220
    invoke-static {p1}, Lqp/p;->b(Lcom/kubi/sdk/BaseFragment;)Z

    .line 221
    move-result p1

    .line 222
    .line 223
    if-eqz p1, :cond_d

    .line 224
    .line 225
    .line 226
    invoke-direct {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->Z3()V

    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 229
    return-object p0

    .line 230
    .line 231
    .line 232
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->dismissAllowingStateLoss()V

    .line 233
    .line 234
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 235
    return-object p0
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
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method

.method public static final X3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->dismissAllowingStateLoss()V

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
.end method

.method public static final Y3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type com.kubi.margin.trade.position.MarginIsolatedPositionFragment"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    check-cast p0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

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
.end method

.method private final Z3()V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->M3()Ldp/d;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Ldp/d;->n:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/kubi/resources/widget/RadioGroupPlus;->getCheckedRadioButtonId()I

    .line 17
    move-result v1

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    move-result-object v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v1, v2

    .line 24
    .line 25
    :goto_0
    sget v3, Lcom/kubi/margin/R$id;->rb_one:I

    .line 26
    .line 27
    const-string v4, "retainBase"

    .line 28
    .line 29
    const-string v5, "retainQuote"

    .line 30
    const/4 v6, 0x1

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    goto :goto_1

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 37
    move-result v7

    .line 38
    .line 39
    if-ne v7, v3, :cond_3

    .line 40
    .line 41
    iget-object v1, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-eqz v1, :cond_8

    .line 48
    :cond_2
    move-object v4, v5

    .line 49
    goto :goto_4

    .line 50
    .line 51
    :cond_3
    :goto_1
    sget v3, Lcom/kubi/margin/R$id;->rb_two:I

    .line 52
    .line 53
    if-nez v1, :cond_4

    .line 54
    goto :goto_2

    .line 55
    .line 56
    .line 57
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 58
    move-result v7

    .line 59
    .line 60
    if-ne v7, v3, :cond_5

    .line 61
    .line 62
    iget-object v1, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v6}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 66
    move-result v1

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    goto :goto_4

    .line 70
    .line 71
    :cond_5
    :goto_2
    sget v3, Lcom/kubi/margin/R$id;->rb_three:I

    .line 72
    .line 73
    if-nez v1, :cond_6

    .line 74
    goto :goto_3

    .line 75
    .line 76
    .line 77
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 78
    move-result v1

    .line 79
    .line 80
    if-ne v1, v3, :cond_7

    .line 81
    .line 82
    const-string v4, "liquidationLiability"

    .line 83
    goto :goto_4

    .line 84
    .line 85
    :cond_7
    :goto_3
    const-string v4, ""

    .line 86
    .line 87
    :cond_8
    :goto_4
    iget-object v1, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->c0:Lcom/kubi/margin/api/entity/MarginPosition;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    move-result-object v1

    .line 96
    .line 97
    new-instance v3, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    const-string v5, "{\"symbol\":\""

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v5, "\",\"model\":\""

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v5, "\"}"

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    move-result-object v9

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->U3()Lcom/kubi/margin/trade/BaseMarginFragment;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    if-eqz v6, :cond_b

    .line 132
    .line 133
    sget-object v7, Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;->MARGIN_ISOLATED_CLOSE:Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->U3()Lcom/kubi/margin/trade/BaseMarginFragment;

    .line 137
    move-result-object v3

    .line 138
    .line 139
    if-eqz v3, :cond_a

    .line 140
    .line 141
    .line 142
    invoke-static {v3}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 143
    move-result-object v3

    .line 144
    .line 145
    if-nez v3, :cond_9

    .line 146
    goto :goto_6

    .line 147
    :cond_9
    :goto_5
    move-object v8, v3

    .line 148
    goto :goto_7

    .line 149
    .line 150
    .line 151
    :cond_a
    :goto_6
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 152
    move-result-object v3

    .line 153
    goto :goto_5

    .line 154
    .line 155
    :goto_7
    new-instance v3, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog$requestOrder$1;

    .line 156
    .line 157
    .line 158
    invoke-direct {v3, v0, v1, v4, v2}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog$requestOrder$1;-><init>(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 159
    .line 160
    new-instance v17, Lcom/kubi/margin/trade/dialog/x;

    .line 161
    .line 162
    .line 163
    invoke-direct/range {v17 .. v17}, Lcom/kubi/margin/trade/dialog/x;-><init>()V

    .line 164
    .line 165
    new-instance v18, Lcom/kubi/margin/trade/dialog/y;

    .line 166
    .line 167
    .line 168
    invoke-direct/range {v18 .. v18}, Lcom/kubi/margin/trade/dialog/y;-><init>()V

    .line 169
    .line 170
    const/16 v19, 0x1f8

    .line 171
    .line 172
    const/16 v20, 0x0

    .line 173
    const/4 v10, 0x0

    .line 174
    const/4 v11, 0x0

    .line 175
    const/4 v12, 0x0

    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    .line 180
    move-object/from16 v16, v3

    .line 181
    .line 182
    .line 183
    invoke-static/range {v6 .. v20}, Lcom/kubi/safe/api/service/TradePasswordExtensionsKt;->e(Landroidx/fragment/app/Fragment;Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;Lkotlinx/coroutines/m0;Ljava/lang/String;Ley/b;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 184
    :cond_b
    return-void
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
.end method

.method public static final a4()Lkotlin/Unit;
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
.end method

.method public static final b4(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0, v1, v0}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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
.end method

.method public static synthetic z3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->Y3(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

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
.end method


# virtual methods
.method public final L3()Lio/reactivex/functions/Action;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->e0:Lio/reactivex/functions/Action;

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
.end method

.method public final M3()Ldp/d;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->f0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->n0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ldp/d;

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
.end method

.method public final N3()Lcom/kubi/margin/entity/IsolateMarginPositionConfig;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->j0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/margin/entity/IsolateMarginPositionConfig;

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
.end method

.method public final P3()Lcom/kubi/margin/api/entity/MarginPosition;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->c0:Lcom/kubi/margin/api/entity/MarginPosition;

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
.end method

.method public final Q3()Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->i0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

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
.end method

.method public final R3()Lcom/kubi/data/entity/SymbolInfoEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->d0:Lcom/kubi/data/entity/SymbolInfoEntity;

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
.end method

.method public final U3()Lcom/kubi/margin/trade/BaseMarginFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->Q3()Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;->z4()Lcom/kubi/margin/trade/BaseMarginFragment;

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

.method public dismiss()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->dismiss()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/blankj/utilcode/util/KeyboardUtils;->e(Landroid/app/Activity;)V

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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/kubi/resources/dialog/GravityDialogFragment;->y3(I)V

    .line 8
    .line 9
    .line 10
    const p1, 0x3f333333    # 0.7f

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/kubi/resources/dialog/GravityDialogFragment;->x3(F)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string p3, "inflater"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget p3, Lcom/kubi/margin/R$layout;->bmargin_dialog_margin_close_position:I

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 21
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
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "view"

    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super/range {p0 .. p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->M3()Ldp/d;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-eqz v1, :cond_2b

    .line 19
    .line 20
    iget-object v2, v1, Ldp/d;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 21
    .line 22
    const-string v3, "close"

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    new-instance v5, Lcom/kubi/margin/trade/dialog/v;

    .line 28
    .line 29
    .line 30
    invoke-direct {v5, v0}, Lcom/kubi/margin/trade/dialog/v;-><init>(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)V

    .line 31
    const/4 v6, 0x1

    .line 32
    const/4 v7, 0x0

    .line 33
    .line 34
    const-wide/16 v3, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 38
    .line 39
    iget-object v2, v1, Ldp/d;->y:Lcom/kubi/resources/widget/BaseTextView;

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 46
    .line 47
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    move-result v3

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 57
    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    sget v4, Lcom/kubi/margin/R$string;->multi:I

    .line 61
    goto :goto_0

    .line 62
    .line 63
    :cond_0
    sget v4, Lcom/kubi/margin/R$string;->empty:I

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    const-string v5, "requireContext(...)"

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v4, v3}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 79
    move-result v3

    .line 80
    .line 81
    const/high16 v4, 0x40800000    # 4.0f

    .line 82
    .line 83
    .line 84
    invoke-static {v3, v4}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 85
    move-result-object v3

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 89
    .line 90
    :cond_1
    iget-object v2, v1, Ldp/d;->t:Lcom/kubi/resources/widget/BaseTextView;

    .line 91
    .line 92
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->d0:Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 93
    const/4 v4, 0x0

    .line 94
    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 99
    move-result-object v3

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move-object v3, v4

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    iget-object v2, v1, Ldp/d;->e:Lcom/kubi/margin/view/MarginRiskView;

    .line 107
    .line 108
    new-instance v3, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog$a;

    .line 109
    .line 110
    .line 111
    invoke-direct {v3, v0}, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog$a;-><init>(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;)V

    .line 112
    const/4 v5, 0x1

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v3, v5}, Lcom/kubi/margin/view/MarginRiskView;->e(Lcom/kubi/margin/view/MarginRiskView$a;Z)V

    .line 116
    .line 117
    iget-object v2, v1, Ldp/d;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 118
    .line 119
    new-instance v3, Lcom/kubi/utils/v0;

    .line 120
    .line 121
    .line 122
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 123
    .line 124
    sget v6, Lcom/kubi/margin/R$string;->margin_current_position:I

    .line 125
    .line 126
    const-string v7, ""

    .line 127
    .line 128
    .line 129
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 130
    move-result-object v8

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v6, v8}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 134
    move-result-object v6

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 141
    .line 142
    if-eqz v6, :cond_3

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getTotalBalance()Ljava/math/BigDecimal;

    .line 146
    move-result-object v6

    .line 147
    goto :goto_2

    .line 148
    :cond_3
    move-object v6, v4

    .line 149
    .line 150
    .line 151
    :goto_2
    invoke-static {v6, v4, v5, v4}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 152
    move-result-object v6

    .line 153
    .line 154
    sget-object v8, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 158
    move-result v6

    .line 159
    .line 160
    const-string v9, " + "

    .line 161
    .line 162
    const-string v10, " "

    .line 163
    .line 164
    if-lez v6, :cond_9

    .line 165
    .line 166
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 167
    .line 168
    if-eqz v6, :cond_4

    .line 169
    .line 170
    .line 171
    invoke-static {v6}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 172
    move-result-object v6

    .line 173
    goto :goto_3

    .line 174
    :cond_4
    move-object v6, v4

    .line 175
    .line 176
    :goto_3
    sget-object v11, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 177
    .line 178
    sget v12, Lcom/kubi/margin/R$color;->c_text:I

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11, v12}, Lcom/kubi/utils/c;->a(I)I

    .line 182
    move-result v13

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v6, v13}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 186
    move-result-object v6

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6, v10}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 190
    move-result-object v6

    .line 191
    .line 192
    iget-object v13, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 193
    .line 194
    if-eqz v13, :cond_5

    .line 195
    .line 196
    .line 197
    invoke-virtual {v13}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 198
    move-result-object v13

    .line 199
    goto :goto_4

    .line 200
    :cond_5
    move-object v13, v4

    .line 201
    .line 202
    .line 203
    :goto_4
    invoke-virtual {v6, v13}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 204
    .line 205
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 206
    .line 207
    if-eqz v6, :cond_6

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getTotalBalance()Ljava/math/BigDecimal;

    .line 211
    move-result-object v6

    .line 212
    goto :goto_5

    .line 213
    :cond_6
    move-object v6, v4

    .line 214
    .line 215
    .line 216
    :goto_5
    invoke-static {v6, v4, v5, v4}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 217
    move-result-object v6

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 221
    move-result v6

    .line 222
    .line 223
    if-lez v6, :cond_d

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3, v9}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 227
    move-result-object v6

    .line 228
    .line 229
    iget-object v13, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 230
    .line 231
    if-eqz v13, :cond_7

    .line 232
    .line 233
    .line 234
    invoke-static {v13}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 235
    move-result-object v13

    .line 236
    goto :goto_6

    .line 237
    :cond_7
    move-object v13, v4

    .line 238
    .line 239
    .line 240
    :goto_6
    invoke-virtual {v11, v12}, Lcom/kubi/utils/c;->a(I)I

    .line 241
    move-result v11

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v13, v11}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 245
    move-result-object v6

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6, v10}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 249
    move-result-object v6

    .line 250
    .line 251
    iget-object v10, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 252
    .line 253
    if-eqz v10, :cond_8

    .line 254
    .line 255
    .line 256
    invoke-virtual {v10}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 257
    move-result-object v10

    .line 258
    goto :goto_7

    .line 259
    :cond_8
    move-object v10, v4

    .line 260
    .line 261
    .line 262
    :goto_7
    invoke-virtual {v6, v10}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 263
    goto :goto_b

    .line 264
    .line 265
    :cond_9
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 266
    .line 267
    if-eqz v6, :cond_a

    .line 268
    .line 269
    .line 270
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getTotalBalance()Ljava/math/BigDecimal;

    .line 271
    move-result-object v6

    .line 272
    goto :goto_8

    .line 273
    :cond_a
    move-object v6, v4

    .line 274
    .line 275
    .line 276
    :goto_8
    invoke-static {v6, v4, v5, v4}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 277
    move-result-object v6

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 281
    move-result v6

    .line 282
    .line 283
    if-lez v6, :cond_d

    .line 284
    .line 285
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 286
    .line 287
    if-eqz v6, :cond_b

    .line 288
    .line 289
    .line 290
    invoke-static {v6}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 291
    move-result-object v6

    .line 292
    goto :goto_9

    .line 293
    :cond_b
    move-object v6, v4

    .line 294
    .line 295
    :goto_9
    sget-object v11, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 296
    .line 297
    sget v12, Lcom/kubi/margin/R$color;->c_text:I

    .line 298
    .line 299
    .line 300
    invoke-virtual {v11, v12}, Lcom/kubi/utils/c;->a(I)I

    .line 301
    move-result v11

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, v6, v11}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 305
    move-result-object v6

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6, v10}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 309
    move-result-object v6

    .line 310
    .line 311
    iget-object v10, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 312
    .line 313
    if-eqz v10, :cond_c

    .line 314
    .line 315
    .line 316
    invoke-virtual {v10}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 317
    move-result-object v10

    .line 318
    goto :goto_a

    .line 319
    :cond_c
    move-object v10, v4

    .line 320
    .line 321
    .line 322
    :goto_a
    invoke-virtual {v6, v10}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 323
    .line 324
    .line 325
    :cond_d
    :goto_b
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    .line 327
    iget-object v2, v1, Ldp/d;->p:Lcom/kubi/resources/widget/BaseTextView;

    .line 328
    .line 329
    sget v3, Lcom/kubi/margin/R$string;->margin_close_out_total:I

    .line 330
    .line 331
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->c0:Lcom/kubi/margin/api/entity/MarginPosition;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6}, Lcom/kubi/margin/api/entity/MarginPosition;->totalConversionCompat()Ljava/math/BigDecimal;

    .line 335
    move-result-object v6

    .line 336
    .line 337
    if-eqz v6, :cond_e

    .line 338
    .line 339
    const-string v10, "BTC"

    .line 340
    .line 341
    .line 342
    invoke-static {v6, v10}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 343
    move-result-wide v11

    .line 344
    .line 345
    const/16 v19, 0x3f

    .line 346
    .line 347
    const/16 v20, 0x0

    .line 348
    const/4 v13, 0x0

    .line 349
    const/4 v14, 0x0

    .line 350
    const/4 v15, 0x0

    .line 351
    .line 352
    const/16 v16, 0x0

    .line 353
    .line 354
    const/16 v17, 0x0

    .line 355
    .line 356
    const/16 v18, 0x0

    .line 357
    .line 358
    .line 359
    invoke-static/range {v11 .. v20}, Lkf/a;->v(DLjava/lang/String;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 360
    move-result-object v6

    .line 361
    goto :goto_c

    .line 362
    :cond_e
    move-object v6, v4

    .line 363
    .line 364
    .line 365
    :goto_c
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    move-result-object v6

    .line 367
    .line 368
    .line 369
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 370
    move-result-object v6

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v3, v6}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 374
    move-result-object v3

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 378
    .line 379
    iget-object v2, v1, Ldp/d;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 380
    .line 381
    sget v3, Lcom/kubi/margin/R$string;->hold_position_qty:I

    .line 382
    .line 383
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 384
    .line 385
    .line 386
    invoke-static {v6, v5}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 387
    move-result v6

    .line 388
    .line 389
    if-eqz v6, :cond_10

    .line 390
    .line 391
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 392
    .line 393
    if-eqz v6, :cond_f

    .line 394
    .line 395
    .line 396
    :goto_d
    invoke-virtual {v6}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 397
    move-result-object v6

    .line 398
    goto :goto_e

    .line 399
    :cond_f
    move-object v6, v4

    .line 400
    .line 401
    .line 402
    :goto_e
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    move-result-object v6

    .line 404
    goto :goto_f

    .line 405
    .line 406
    :cond_10
    iget-object v6, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 407
    .line 408
    if-eqz v6, :cond_f

    .line 409
    goto :goto_d

    .line 410
    .line 411
    .line 412
    :goto_f
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 413
    move-result-object v6

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v3, v6}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 417
    move-result-object v6

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 421
    .line 422
    iget-object v2, v1, Ldp/d;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 423
    .line 424
    sget v6, Lcom/kubi/margin/R$string;->margin_close_out_hold_tip:I

    .line 425
    .line 426
    iget-object v10, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 427
    .line 428
    .line 429
    invoke-static {v10, v5}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 430
    move-result v10

    .line 431
    .line 432
    if-eqz v10, :cond_12

    .line 433
    .line 434
    iget-object v10, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 435
    .line 436
    if-eqz v10, :cond_11

    .line 437
    .line 438
    .line 439
    :goto_10
    invoke-virtual {v10}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 440
    move-result-object v10

    .line 441
    goto :goto_11

    .line 442
    :cond_11
    move-object v10, v4

    .line 443
    .line 444
    .line 445
    :goto_11
    invoke-static {v10}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 446
    move-result-object v10

    .line 447
    goto :goto_12

    .line 448
    .line 449
    :cond_12
    iget-object v10, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 450
    .line 451
    if-eqz v10, :cond_11

    .line 452
    goto :goto_10

    .line 453
    .line 454
    .line 455
    :goto_12
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 456
    move-result-object v10

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v6, v10}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 460
    move-result-object v10

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 464
    .line 465
    iget-object v2, v1, Ldp/d;->f:Landroid/widget/ImageView;

    .line 466
    .line 467
    sget-object v10, Lgf/n;->a:Lgf/n;

    .line 468
    .line 469
    iget-object v11, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 470
    .line 471
    .line 472
    invoke-static {v11, v5}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 473
    move-result v11

    .line 474
    .line 475
    if-eqz v11, :cond_14

    .line 476
    .line 477
    iget-object v11, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 478
    .line 479
    if-eqz v11, :cond_13

    .line 480
    .line 481
    .line 482
    :goto_13
    invoke-virtual {v11}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 483
    move-result-object v11

    .line 484
    goto :goto_14

    .line 485
    :cond_13
    move-object v11, v4

    .line 486
    .line 487
    .line 488
    :goto_14
    invoke-static {v11}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    move-result-object v11

    .line 490
    goto :goto_15

    .line 491
    .line 492
    :cond_14
    iget-object v11, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 493
    .line 494
    if-eqz v11, :cond_13

    .line 495
    goto :goto_13

    .line 496
    .line 497
    .line 498
    :goto_15
    invoke-virtual {v10, v11}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 499
    move-result-object v11

    .line 500
    .line 501
    if-eqz v11, :cond_15

    .line 502
    .line 503
    .line 504
    invoke-virtual {v11}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 505
    move-result-object v11

    .line 506
    goto :goto_16

    .line 507
    :cond_15
    move-object v11, v4

    .line 508
    .line 509
    .line 510
    :goto_16
    invoke-static {v2, v11}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 511
    .line 512
    iget-object v2, v1, Ldp/d;->v:Lcom/kubi/resources/widget/BaseTextView;

    .line 513
    .line 514
    iget-object v11, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 515
    .line 516
    .line 517
    invoke-static {v11, v5}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 518
    move-result v11

    .line 519
    .line 520
    if-nez v11, :cond_17

    .line 521
    .line 522
    iget-object v11, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 523
    .line 524
    if-eqz v11, :cond_16

    .line 525
    .line 526
    .line 527
    :goto_17
    invoke-virtual {v11}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 528
    move-result-object v11

    .line 529
    goto :goto_18

    .line 530
    :cond_16
    move-object v11, v4

    .line 531
    .line 532
    .line 533
    :goto_18
    invoke-static {v11}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 534
    move-result-object v11

    .line 535
    goto :goto_19

    .line 536
    .line 537
    :cond_17
    iget-object v11, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 538
    .line 539
    if-eqz v11, :cond_16

    .line 540
    goto :goto_17

    .line 541
    .line 542
    .line 543
    :goto_19
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 544
    move-result-object v11

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0, v3, v11}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 548
    move-result-object v3

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    .line 553
    iget-object v2, v1, Ldp/d;->x:Lcom/kubi/resources/widget/BaseTextView;

    .line 554
    .line 555
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 556
    .line 557
    .line 558
    invoke-static {v3, v5}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 559
    move-result v3

    .line 560
    .line 561
    if-nez v3, :cond_19

    .line 562
    .line 563
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 564
    .line 565
    if-eqz v3, :cond_18

    .line 566
    .line 567
    .line 568
    :goto_1a
    invoke-virtual {v3}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 569
    move-result-object v3

    .line 570
    goto :goto_1b

    .line 571
    :cond_18
    move-object v3, v4

    .line 572
    .line 573
    .line 574
    :goto_1b
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 575
    move-result-object v3

    .line 576
    goto :goto_1c

    .line 577
    .line 578
    :cond_19
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 579
    .line 580
    if-eqz v3, :cond_18

    .line 581
    goto :goto_1a

    .line 582
    .line 583
    .line 584
    :goto_1c
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 585
    move-result-object v3

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, v6, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 589
    move-result-object v3

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 593
    .line 594
    iget-object v2, v1, Ldp/d;->i:Landroid/widget/ImageView;

    .line 595
    .line 596
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->k0:Ljava/lang/Boolean;

    .line 597
    .line 598
    .line 599
    invoke-static {v3, v5}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 600
    move-result v3

    .line 601
    .line 602
    if-nez v3, :cond_1b

    .line 603
    .line 604
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 605
    .line 606
    if-eqz v3, :cond_1a

    .line 607
    .line 608
    .line 609
    :goto_1d
    invoke-virtual {v3}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 610
    move-result-object v3

    .line 611
    goto :goto_1e

    .line 612
    :cond_1a
    move-object v3, v4

    .line 613
    .line 614
    .line 615
    :goto_1e
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 616
    move-result-object v3

    .line 617
    goto :goto_1f

    .line 618
    .line 619
    :cond_1b
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 620
    .line 621
    if-eqz v3, :cond_1a

    .line 622
    goto :goto_1d

    .line 623
    .line 624
    .line 625
    :goto_1f
    invoke-virtual {v10, v3}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 626
    move-result-object v3

    .line 627
    .line 628
    if-eqz v3, :cond_1c

    .line 629
    .line 630
    .line 631
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 632
    move-result-object v3

    .line 633
    goto :goto_20

    .line 634
    :cond_1c
    move-object v3, v4

    .line 635
    .line 636
    .line 637
    :goto_20
    invoke-static {v2, v3}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 638
    .line 639
    iget-object v2, v1, Ldp/d;->g:Landroid/widget/ImageView;

    .line 640
    .line 641
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 642
    .line 643
    if-eqz v3, :cond_1d

    .line 644
    .line 645
    .line 646
    invoke-virtual {v3}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 647
    move-result-object v3

    .line 648
    goto :goto_21

    .line 649
    :cond_1d
    move-object v3, v4

    .line 650
    .line 651
    .line 652
    :goto_21
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 653
    move-result-object v3

    .line 654
    .line 655
    .line 656
    invoke-virtual {v10, v3}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 657
    move-result-object v3

    .line 658
    .line 659
    if-eqz v3, :cond_1e

    .line 660
    .line 661
    .line 662
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 663
    move-result-object v3

    .line 664
    goto :goto_22

    .line 665
    :cond_1e
    move-object v3, v4

    .line 666
    .line 667
    .line 668
    :goto_22
    invoke-static {v2, v3}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 669
    .line 670
    iget-object v2, v1, Ldp/d;->h:Landroid/widget/ImageView;

    .line 671
    .line 672
    iget-object v3, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 673
    .line 674
    if-eqz v3, :cond_1f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v3}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 678
    move-result-object v3

    .line 679
    goto :goto_23

    .line 680
    :cond_1f
    move-object v3, v4

    .line 681
    .line 682
    .line 683
    :goto_23
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 684
    move-result-object v3

    .line 685
    .line 686
    .line 687
    invoke-virtual {v10, v3}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 688
    move-result-object v3

    .line 689
    .line 690
    if-eqz v3, :cond_20

    .line 691
    .line 692
    .line 693
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 694
    move-result-object v3

    .line 695
    goto :goto_24

    .line 696
    :cond_20
    move-object v3, v4

    .line 697
    .line 698
    .line 699
    :goto_24
    invoke-static {v2, v3}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 700
    .line 701
    iget-object v2, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 702
    .line 703
    if-eqz v2, :cond_21

    .line 704
    .line 705
    .line 706
    invoke-static {v2}, Lzo/a;->k(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/math/BigDecimal;

    .line 707
    move-result-object v2

    .line 708
    goto :goto_25

    .line 709
    :cond_21
    move-object v2, v4

    .line 710
    .line 711
    .line 712
    :goto_25
    invoke-static {v2, v4, v5, v4}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 713
    move-result-object v2

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 717
    move-result v2

    .line 718
    .line 719
    const-string v3, "ivThree2"

    .line 720
    .line 721
    const-string v6, "ivThree1"

    .line 722
    .line 723
    if-lez v2, :cond_27

    .line 724
    .line 725
    iget-object v2, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 726
    .line 727
    if-eqz v2, :cond_22

    .line 728
    .line 729
    .line 730
    invoke-static {v2}, Lzo/a;->k(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/math/BigDecimal;

    .line 731
    move-result-object v2

    .line 732
    goto :goto_26

    .line 733
    :cond_22
    move-object v2, v4

    .line 734
    .line 735
    .line 736
    :goto_26
    invoke-static {v2, v4, v5, v4}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 737
    move-result-object v2

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 741
    move-result v2

    .line 742
    .line 743
    if-lez v2, :cond_25

    .line 744
    .line 745
    iget-object v2, v1, Ldp/d;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 746
    .line 747
    sget v5, Lcom/kubi/margin/R$string;->margin_close_out_repay_debt_only:I

    .line 748
    .line 749
    new-instance v7, Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 753
    .line 754
    iget-object v8, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 755
    .line 756
    if-eqz v8, :cond_23

    .line 757
    .line 758
    .line 759
    invoke-virtual {v8}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 760
    move-result-object v8

    .line 761
    goto :goto_27

    .line 762
    :cond_23
    move-object v8, v4

    .line 763
    .line 764
    .line 765
    :goto_27
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 766
    move-result-object v8

    .line 767
    .line 768
    .line 769
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    iget-object v8, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 775
    .line 776
    if-eqz v8, :cond_24

    .line 777
    .line 778
    .line 779
    invoke-virtual {v8}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 780
    move-result-object v4

    .line 781
    .line 782
    .line 783
    :cond_24
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 784
    move-result-object v4

    .line 785
    .line 786
    .line 787
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    move-result-object v4

    .line 792
    .line 793
    .line 794
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 795
    move-result-object v4

    .line 796
    .line 797
    .line 798
    invoke-virtual {v0, v5, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 799
    move-result-object v4

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 803
    .line 804
    iget-object v2, v1, Ldp/d;->g:Landroid/widget/ImageView;

    .line 805
    .line 806
    .line 807
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 811
    .line 812
    iget-object v2, v1, Ldp/d;->h:Landroid/widget/ImageView;

    .line 813
    .line 814
    .line 815
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 819
    .line 820
    goto/16 :goto_29

    .line 821
    .line 822
    :cond_25
    iget-object v2, v1, Ldp/d;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 823
    .line 824
    sget v5, Lcom/kubi/margin/R$string;->margin_close_out_repay_debt_only:I

    .line 825
    .line 826
    iget-object v7, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->l0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 827
    .line 828
    if-eqz v7, :cond_26

    .line 829
    .line 830
    .line 831
    invoke-virtual {v7}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 832
    move-result-object v4

    .line 833
    .line 834
    .line 835
    :cond_26
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 836
    move-result-object v4

    .line 837
    .line 838
    .line 839
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 840
    move-result-object v4

    .line 841
    .line 842
    .line 843
    invoke-virtual {v0, v5, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 844
    move-result-object v4

    .line 845
    .line 846
    .line 847
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 848
    .line 849
    iget-object v2, v1, Ldp/d;->g:Landroid/widget/ImageView;

    .line 850
    .line 851
    .line 852
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 856
    .line 857
    iget-object v2, v1, Ldp/d;->h:Landroid/widget/ImageView;

    .line 858
    .line 859
    .line 860
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 864
    goto :goto_29

    .line 865
    .line 866
    :cond_27
    iget-object v2, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 867
    .line 868
    if-eqz v2, :cond_28

    .line 869
    .line 870
    .line 871
    invoke-static {v2}, Lzo/a;->k(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/math/BigDecimal;

    .line 872
    move-result-object v2

    .line 873
    goto :goto_28

    .line 874
    :cond_28
    move-object v2, v4

    .line 875
    .line 876
    .line 877
    :goto_28
    invoke-static {v2, v4, v5, v4}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 878
    move-result-object v2

    .line 879
    .line 880
    .line 881
    invoke-virtual {v2, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 882
    move-result v2

    .line 883
    .line 884
    if-lez v2, :cond_2a

    .line 885
    .line 886
    iget-object v2, v1, Ldp/d;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 887
    .line 888
    sget v5, Lcom/kubi/margin/R$string;->margin_close_out_repay_debt_only:I

    .line 889
    .line 890
    iget-object v7, v0, Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;->m0:Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 891
    .line 892
    if-eqz v7, :cond_29

    .line 893
    .line 894
    .line 895
    invoke-virtual {v7}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 896
    move-result-object v4

    .line 897
    .line 898
    .line 899
    :cond_29
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 900
    move-result-object v4

    .line 901
    .line 902
    .line 903
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 904
    move-result-object v4

    .line 905
    .line 906
    .line 907
    invoke-virtual {v0, v5, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 908
    move-result-object v4

    .line 909
    .line 910
    .line 911
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 912
    .line 913
    iget-object v2, v1, Ldp/d;->g:Landroid/widget/ImageView;

    .line 914
    .line 915
    .line 916
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 920
    .line 921
    iget-object v2, v1, Ldp/d;->h:Landroid/widget/ImageView;

    .line 922
    .line 923
    .line 924
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 928
    goto :goto_29

    .line 929
    .line 930
    :cond_2a
    iget-object v2, v1, Ldp/d;->u:Lcom/kubi/resources/widget/BaseTextView;

    .line 931
    .line 932
    .line 933
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 934
    .line 935
    iget-object v2, v1, Ldp/d;->g:Landroid/widget/ImageView;

    .line 936
    .line 937
    .line 938
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 942
    .line 943
    iget-object v2, v1, Ldp/d;->h:Landroid/widget/ImageView;

    .line 944
    .line 945
    .line 946
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 950
    .line 951
    :goto_29
    iget-object v2, v1, Ldp/d;->n:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 952
    .line 953
    sget v3, Lcom/kubi/margin/R$id;->rb_one:I

    .line 954
    .line 955
    .line 956
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/RadioGroupPlus;->f(I)V

    .line 957
    .line 958
    iget-object v4, v1, Ldp/d;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 959
    .line 960
    const-string v2, "confirm"

    .line 961
    .line 962
    .line 963
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 964
    .line 965
    new-instance v7, Lcom/kubi/margin/trade/dialog/w;

    .line 966
    .line 967
    .line 968
    invoke-direct {v7, v0, v1}, Lcom/kubi/margin/trade/dialog/w;-><init>(Lcom/kubi/margin/trade/dialog/MarginClosePositionDialog;Ldp/d;)V

    .line 969
    const/4 v8, 0x1

    .line 970
    const/4 v9, 0x0

    .line 971
    .line 972
    const-wide/16 v5, 0x0

    .line 973
    .line 974
    .line 975
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 976
    :cond_2b
    return-void
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method
