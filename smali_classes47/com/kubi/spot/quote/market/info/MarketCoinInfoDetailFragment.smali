.class public final Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;
.super Lcom/kubi/sdk/BaseFragment;
.source "MarketCoinInfoDetailFragment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006 "
    }
    d2 = {
        "Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;",
        "Lcom/kubi/sdk/BaseFragment;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/spot/databinding/BkucoinFragmentMarketCoinInfoDetailBinding;",
        "getBinding",
        "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketCoinInfoDetailBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "mCoin",
        "",
        "getMCoin",
        "()Ljava/lang/String;",
        "mCoin$delegate",
        "Lkotlin/Lazy;",
        "mData",
        "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;",
        "getMData",
        "()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;",
        "mData$delegate",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "container",
        "Landroid/view/ViewGroup;",
        "onViewCreated",
        "",
        "view",
        "SpotLib_googleRelease"
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
        "SMAP\nMarketCoinInfoDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoDetailFragment.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n147#2,16:95\n1869#3,2:111\n*S KotlinDebug\n*F\n+ 1 MarketCoinInfoDetailFragment.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment\n*L\n36#1:95,16\n61#1:111,2\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic X:[Lkotlin/reflect/KProperty;
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
.field public final U:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final V:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final W:Lkotlin/Lazy;
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
    const-string v1, "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketCoinInfoDetailBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;

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
    sput-object v1, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->X:[Lkotlin/reflect/KProperty;

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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/BaseFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    const-string v0, "B5ArticleDetails"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 22
    .line 23
    new-instance v0, Lcom/kubi/spot/quote/market/info/l;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/kubi/spot/quote/market/info/l;-><init>(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iput-object v0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->V:Lkotlin/Lazy;

    .line 33
    .line 34
    new-instance v0, Lcom/kubi/spot/quote/market/info/m;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p0}, Lcom/kubi/spot/quote/market/info/m;-><init>(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    iput-object v0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->W:Lkotlin/Lazy;

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
.end method

.method public static synthetic j3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Lcom/kubi/spot/quote/market/info/MarketCoinInfo;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->q3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

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
.end method

.method public static synthetic k3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->r3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic l3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->p3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Ljava/lang/String;

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
.end method

.method private final n3()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->V:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

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

.method public static final p3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "coin"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/kubi/router/utils/RouteExKt;->y(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
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
.end method

.method public static final q3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Lcom/kubi/spot/quote/market/info/MarketCoinInfo;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "data"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/kubi/router/utils/RouteExKt;->t(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
.end method

.method public static final r3(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B5ArticleDetails"

    .line 6
    .line 7
    const-string v1, "OK"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->preformBackPressed()V

    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    return-object p0
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
.end method


# virtual methods
.method public final m3()Lt20/g;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->X:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lt20/g;

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

.method public final o3()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->W:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

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

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/os/Bundle;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string p2, "inflater"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget p2, Lcom/kubi/spot/R$layout;->bkucoin_fragment_market_coin_info_detail:I

    .line 8
    const/4 p3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    const-string p2, "inflate(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 10
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
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    new-instance p2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->o3()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCoinName()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v0, v1

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const/16 v0, 0x28

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->n3()Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const/16 v0, 0x29

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object p2

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2}, Lcom/kubi/sdk/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->m3()Lt20/g;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    iget-object v2, p1, Lt20/g;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 74
    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    new-instance v5, Lcom/kubi/spot/quote/market/info/k;

    .line 78
    .line 79
    .line 80
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/info/k;-><init>(Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;)V

    .line 81
    const/4 v6, 0x1

    .line 82
    const/4 v7, 0x0

    .line 83
    .line 84
    const-wide/16 v3, 0x0

    .line 85
    .line 86
    .line 87
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 88
    .line 89
    :cond_1
    new-instance p1, Lcom/kubi/utils/v0;

    .line 90
    .line 91
    .line 92
    invoke-direct {p1}, Lcom/kubi/utils/v0;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->o3()Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

    .line 96
    move-result-object p2

    .line 97
    .line 98
    if-eqz p2, :cond_9

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;->getCurrencyIntroduction()Ljava/util/List;

    .line 102
    move-result-object p2

    .line 103
    .line 104
    if-eqz p2, :cond_9

    .line 105
    .line 106
    .line 107
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    move-result-object p2

    .line 109
    .line 110
    .line 111
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    move-result v0

    .line 113
    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    check-cast v0, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;->getType()Ljava/lang/String;

    .line 126
    move-result-object v2

    .line 127
    goto :goto_2

    .line 128
    :cond_3
    move-object v2, v1

    .line 129
    .line 130
    :goto_2
    if-eqz v2, :cond_2

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 134
    move-result v3

    .line 135
    .line 136
    const/16 v4, 0x10

    .line 137
    .line 138
    const-string v5, "requireContext(...)"

    .line 139
    .line 140
    const-string v6, "\n"

    .line 141
    .line 142
    const-string v7, "\n\n"

    .line 143
    .line 144
    .line 145
    sparse-switch v3, :sswitch_data_0

    .line 146
    goto :goto_1

    .line 147
    .line 148
    :sswitch_0
    const-string v3, "TITLE"

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    move-result v2

    .line 153
    .line 154
    if-nez v2, :cond_4

    .line 155
    goto :goto_1

    .line 156
    .line 157
    .line 158
    :cond_4
    invoke-virtual {p1, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;->getText()Ljava/lang/String;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 166
    .line 167
    sget-object v6, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 168
    .line 169
    sget v8, Lcom/kubi/spot/R$color;->emphasis:I

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v8}, Lcom/kubi/utils/c;->a(I)I

    .line 173
    move-result v6

    .line 174
    .line 175
    .line 176
    invoke-direct {v3, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 177
    .line 178
    new-instance v6, Landroid/text/style/AbsoluteSizeSpan;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 182
    move-result-object v8

    .line 183
    .line 184
    .line 185
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v8, v4}, Lcom/kubi/utils/extensions/c;->f(Landroid/content/Context;I)F

    .line 189
    move-result v4

    .line 190
    float-to-int v4, v4

    .line 191
    .line 192
    .line 193
    invoke-direct {v6, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 194
    .line 195
    .line 196
    filled-new-array {v3, v6}, [Ljava/lang/Object;

    .line 197
    move-result-object v3

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v0, v3}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v7}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 205
    goto :goto_1

    .line 206
    .line 207
    :sswitch_1
    const-string v0, "WRAP"

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    move-result v0

    .line 212
    .line 213
    if-nez v0, :cond_5

    .line 214
    goto :goto_1

    .line 215
    .line 216
    .line 217
    :cond_5
    invoke-virtual {p1, v7}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 218
    goto :goto_1

    .line 219
    .line 220
    :sswitch_2
    const-string v3, "TEXT"

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    move-result v2

    .line 225
    .line 226
    if-nez v2, :cond_6

    .line 227
    goto :goto_1

    .line 228
    .line 229
    .line 230
    :cond_6
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;->getText()Ljava/lang/String;

    .line 231
    move-result-object v0

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v0}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 235
    goto :goto_1

    .line 236
    .line 237
    :sswitch_3
    const-string v3, "LINK"

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    move-result v2

    .line 242
    .line 243
    if-nez v2, :cond_7

    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    .line 248
    :cond_7
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;->getText()Ljava/lang/String;

    .line 249
    move-result-object v2

    .line 250
    .line 251
    new-instance v3, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment$a;

    .line 252
    .line 253
    .line 254
    invoke-direct {v3, v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment$a;-><init>(Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;)V

    .line 255
    .line 256
    .line 257
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 258
    move-result-object v0

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v2, v0}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :sswitch_4
    const-string v3, "RICHTEXT"

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    move-result v2

    .line 270
    .line 271
    if-nez v2, :cond_8

    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    .line 276
    :cond_8
    invoke-virtual {p1, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 277
    move-result-object v2

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;->getText()Ljava/lang/String;

    .line 281
    move-result-object v3

    .line 282
    .line 283
    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    .line 284
    .line 285
    sget-object v8, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 286
    .line 287
    sget v9, Lcom/kubi/spot/R$color;->emphasis:I

    .line 288
    .line 289
    .line 290
    invoke-virtual {v8, v9}, Lcom/kubi/utils/c;->a(I)I

    .line 291
    move-result v8

    .line 292
    .line 293
    .line 294
    invoke-direct {v6, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 295
    .line 296
    new-instance v8, Landroid/text/style/AbsoluteSizeSpan;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 300
    move-result-object v9

    .line 301
    .line 302
    .line 303
    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v9, v4}, Lcom/kubi/utils/extensions/c;->f(Landroid/content/Context;I)F

    .line 307
    move-result v4

    .line 308
    float-to-int v4, v4

    .line 309
    .line 310
    .line 311
    invoke-direct {v8, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 312
    .line 313
    .line 314
    filled-new-array {v6, v8}, [Ljava/lang/Object;

    .line 315
    move-result-object v4

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v3, v4}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 319
    move-result-object v2

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v7}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 323
    move-result-object v2

    .line 324
    .line 325
    sget-object v3, Lcom/kubi/spot/quote/market/info/e;->a:Lcom/kubi/spot/quote/market/info/e;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;->getSubText()Ljava/lang/String;

    .line 329
    move-result-object v0

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3, v0}, Lcom/kubi/spot/quote/market/info/e;->p(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 333
    move-result-object v0

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v0}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 337
    .line 338
    goto/16 :goto_1

    .line 339
    .line 340
    .line 341
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->m3()Lt20/g;

    .line 342
    move-result-object p2

    .line 343
    .line 344
    if-eqz p2, :cond_a

    .line 345
    .line 346
    iget-object p2, p2, Lt20/g;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 347
    .line 348
    if-eqz p2, :cond_a

    .line 349
    .line 350
    .line 351
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 352
    move-result-object v0

    .line 353
    .line 354
    .line 355
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 356
    .line 357
    .line 358
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/info/MarketCoinInfoDetailFragment;->m3()Lt20/g;

    .line 359
    move-result-object p2

    .line 360
    .line 361
    if-eqz p2, :cond_b

    .line 362
    .line 363
    iget-object p2, p2, Lt20/g;->b:Lcom/kubi/resources/widget/BaseTextView;

    .line 364
    .line 365
    if-eqz p2, :cond_b

    .line 366
    .line 367
    .line 368
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 369
    :cond_b
    return-void

    .line 370
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x2dc62ff7 -> :sswitch_4
        0x23a7fa -> :sswitch_3
        0x273d2d -> :sswitch_2
        0x28c84a -> :sswitch_1
        0x4c22a38 -> :sswitch_0
    .end sparse-switch
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
.end method
