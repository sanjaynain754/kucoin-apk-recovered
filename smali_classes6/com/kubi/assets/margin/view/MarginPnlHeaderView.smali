.class public final Lcom/kubi/assets/margin/view/MarginPnlHeaderView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "MarginPnlHeaderView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0011J\u0014\u0010\u0012\u001a\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0011J\u0012\u0010\u0013\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0012\u0010\u0016\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0017R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/kubi/assets/margin/view/MarginPnlHeaderView;",
        "Landroidx/appcompat/widget/LinearLayoutCompat;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "setTitleClickListener",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "setPnlClickListener",
        "bindMarginPnl",
        "pnlEntity",
        "Lcom/kubi/assets/entity/MarginPnlEntity;",
        "bindSpotPnl",
        "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;",
        "AssetsCenterLib_googleRelease"
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
        "SMAP\nMarginPnlHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginPnlHeaderView.kt\ncom/kubi/assets/margin/view/MarginPnlHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n52#2:167\n80#2,7:168\n1#3:175\n*S KotlinDebug\n*F\n+ 1 MarginPnlHeaderView.kt\ncom/kubi/assets/margin/view/MarginPnlHeaderView\n*L\n42#1:167\n42#1:168,7\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic c:[Lkotlin/reflect/KProperty;
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
.field public final b:Lcom/kubi/sdk/viewbindingdelegate/base/a;
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/ViewMarginPnlAssetsHeaderBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

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
    sput-object v1, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->c:[Lkotlin/reflect/KProperty;

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "attrs"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/kubi/sdk/viewbindingdelegate/internal/UtilsKt;->b()Lkotlin/jvm/functions/Function1;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    new-instance v0, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;

    .line 20
    .line 21
    new-instance v1, Lcom/kubi/assets/margin/view/MarginPnlHeaderView$special$$inlined$customViewBinding$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView$special$$inlined$customViewBinding$1;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p2, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    sget p2, Lcom/kubi/assets/R$layout;->view_margin_pnl_assets_header:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

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
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->j(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

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
.end method

.method public static synthetic b(Lcom/kubi/assets/margin/view/MarginPnlHeaderView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->f(Lcom/kubi/assets/margin/view/MarginPnlHeaderView;)Lkotlin/Unit;

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
.end method

.method public static synthetic c(Lcom/kubi/assets/margin/view/MarginPnlHeaderView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->h(Lcom/kubi/assets/margin/view/MarginPnlHeaderView;)Lkotlin/Unit;

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
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->i(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

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
.end method

.method public static final f(Lcom/kubi/assets/margin/view/MarginPnlHeaderView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lta/f6;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

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
.end method

.method private final getBinding()Lta/f6;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->c:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/f6;

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
.end method

.method public static final h(Lcom/kubi/assets/margin/view/MarginPnlHeaderView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lta/f6;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

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
.end method

.method public static final i(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

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
.end method

.method public static final j(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

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
.end method


# virtual methods
.method public final e(Lcom/kubi/assets/entity/MarginPnlEntity;)V
    .locals 17
    .param p1    # Lcom/kubi/assets/entity/MarginPnlEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/MarginPnlEntity;->getTodayPnlAmount()Ljava/math/BigDecimal;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 13
    move-result-wide v1

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    cmpg-double v1, v1, v3

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, v2

    .line 24
    .line 25
    :goto_1
    if-eqz p1, :cond_e

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/MarginPnlEntity;->getBaseCurrency()Ljava/lang/String;

    .line 29
    move-result-object v5

    .line 30
    .line 31
    sget-object v6, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 35
    move-result-object v6

    .line 36
    .line 37
    .line 38
    invoke-interface {v6}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 39
    move-result-object v6

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, Lcom/kubi/user/model/LoginUserEntity;->getBalanceCurrency()Ljava/lang/String;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result v5

    .line 48
    .line 49
    if-nez v5, :cond_2

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static/range {p0 .. p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/MarginPnlEntity;->getTodayPnlAmount()Ljava/math/BigDecimal;

    .line 58
    move-result-object v5

    .line 59
    .line 60
    .line 61
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 62
    move-result-wide v5

    .line 63
    .line 64
    cmpl-double v3, v5, v3

    .line 65
    .line 66
    if-lez v3, :cond_3

    .line 67
    .line 68
    const-string v3, "+"

    .line 69
    goto :goto_2

    .line 70
    .line 71
    :cond_3
    const-string v3, "-"

    .line 72
    .line 73
    .line 74
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/MarginPnlEntity;->getTodayPnlAmount()Ljava/math/BigDecimal;

    .line 75
    move-result-object v4

    .line 76
    .line 77
    if-eqz v4, :cond_4

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    sget-object v5, Lhf/b;->a:Lhf/b;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Lhf/b;->a()Ljava/lang/String;

    .line 89
    move-result-object v5

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v5}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 93
    move-result-wide v6

    .line 94
    .line 95
    const/16 v15, 0x7f

    .line 96
    .line 97
    const/16 v16, 0x0

    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v9, 0x0

    .line 100
    const/4 v10, 0x0

    .line 101
    const/4 v11, 0x0

    .line 102
    const/4 v12, 0x0

    .line 103
    const/4 v13, 0x0

    .line 104
    const/4 v14, 0x0

    .line 105
    .line 106
    .line 107
    invoke-static/range {v6 .. v16}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 108
    move-result-object v4

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    move-object v4, v0

    .line 111
    .line 112
    :goto_3
    const-string v5, "--"

    .line 113
    .line 114
    .line 115
    invoke-static {v4, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object v4

    .line 117
    .line 118
    .line 119
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 120
    move-result-object v5

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/MarginPnlEntity;->getTodayPnlRatio()Ljava/math/BigDecimal;

    .line 124
    move-result-object v6

    .line 125
    .line 126
    if-eqz v6, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 130
    move-result-object v6

    .line 131
    goto :goto_4

    .line 132
    :cond_5
    move-object v6, v0

    .line 133
    .line 134
    .line 135
    :goto_4
    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->b(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 136
    move-result-object v6

    .line 137
    .line 138
    .line 139
    invoke-static {v6}, Lnf/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    move-result-object v6

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v6}, Landroid/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    move-result-object v5

    .line 145
    .line 146
    if-eqz v1, :cond_9

    .line 147
    .line 148
    .line 149
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 150
    move-result-object v3

    .line 151
    .line 152
    if-eqz v3, :cond_6

    .line 153
    .line 154
    iget-object v3, v3, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 155
    .line 156
    if-eqz v3, :cond_6

    .line 157
    .line 158
    sget-object v4, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 159
    .line 160
    sget v5, Lcom/kubi/assets/R$string;->kc_assets_pnl_updating:I

    .line 161
    .line 162
    new-array v2, v2, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v5, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    move-result-object v2

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    :cond_6
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 173
    move-result-object v2

    .line 174
    .line 175
    if-eqz v2, :cond_7

    .line 176
    .line 177
    iget-object v2, v2, Lta/f6;->b:Landroid/widget/ImageView;

    .line 178
    .line 179
    if-eqz v2, :cond_7

    .line 180
    .line 181
    .line 182
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 183
    .line 184
    .line 185
    :cond_7
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    if-eqz v2, :cond_8

    .line 189
    .line 190
    iget-object v2, v2, Lta/f6;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 191
    .line 192
    if-eqz v2, :cond_8

    .line 193
    .line 194
    .line 195
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 199
    move-result-object v2

    .line 200
    .line 201
    if-eqz v2, :cond_d

    .line 202
    .line 203
    iget-object v2, v2, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 204
    .line 205
    if-eqz v2, :cond_d

    .line 206
    .line 207
    const/high16 v3, 0x41500000    # 13.0f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 211
    goto :goto_5

    .line 212
    .line 213
    .line 214
    :cond_9
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 215
    move-result-object v2

    .line 216
    .line 217
    if-eqz v2, :cond_a

    .line 218
    .line 219
    iget-object v2, v2, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 220
    .line 221
    if-eqz v2, :cond_a

    .line 222
    .line 223
    new-instance v6, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    const/16 v3, 0x28

    .line 235
    .line 236
    .line 237
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    const/16 v3, 0x29

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    move-result-object v3

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 256
    move-result-object v2

    .line 257
    .line 258
    if-eqz v2, :cond_b

    .line 259
    .line 260
    iget-object v2, v2, Lta/f6;->b:Landroid/widget/ImageView;

    .line 261
    .line 262
    if-eqz v2, :cond_b

    .line 263
    .line 264
    .line 265
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 266
    .line 267
    .line 268
    :cond_b
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 269
    move-result-object v2

    .line 270
    .line 271
    if-eqz v2, :cond_c

    .line 272
    .line 273
    iget-object v2, v2, Lta/f6;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 274
    .line 275
    if-eqz v2, :cond_c

    .line 276
    .line 277
    .line 278
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 279
    .line 280
    .line 281
    :cond_c
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 282
    move-result-object v2

    .line 283
    .line 284
    if-eqz v2, :cond_d

    .line 285
    .line 286
    iget-object v2, v2, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 287
    .line 288
    if-eqz v2, :cond_d

    .line 289
    .line 290
    const/high16 v3, 0x41800000    # 16.0f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 294
    .line 295
    :cond_d
    :goto_5
    move-object/from16 v3, p0

    .line 296
    goto :goto_6

    .line 297
    .line 298
    :cond_e
    new-instance v2, Lcb/a;

    .line 299
    .line 300
    move-object/from16 v3, p0

    .line 301
    .line 302
    .line 303
    invoke-direct {v2, v3}, Lcb/a;-><init>(Lcom/kubi/assets/margin/view/MarginPnlHeaderView;)V

    .line 304
    .line 305
    .line 306
    :goto_6
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 307
    move-result-object v2

    .line 308
    .line 309
    const-string v4, "getContext(...)"

    .line 310
    .line 311
    .line 312
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    if-eqz p1, :cond_f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/MarginPnlEntity;->getTodayPnlAmount()Ljava/math/BigDecimal;

    .line 318
    move-result-object v0

    .line 319
    .line 320
    .line 321
    :cond_f
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 322
    move-result-wide v4

    .line 323
    .line 324
    if-eqz v1, :cond_10

    .line 325
    .line 326
    sget v0, Lcom/kubi/assets/R$color;->c_text40:I

    .line 327
    goto :goto_7

    .line 328
    .line 329
    :cond_10
    sget v0, Lcom/kubi/assets/R$color;->c_text:I

    .line 330
    .line 331
    .line 332
    :goto_7
    invoke-static {v2, v4, v5, v0}, Lcom/kubi/resources/g;->c(Landroid/content/Context;DI)I

    .line 333
    move-result v0

    .line 334
    .line 335
    .line 336
    invoke-direct {v3}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 337
    move-result-object v2

    .line 338
    .line 339
    if-eqz v2, :cond_11

    .line 340
    .line 341
    iget-object v2, v2, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 342
    .line 343
    if-eqz v2, :cond_11

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 347
    .line 348
    :cond_11
    if-eqz v1, :cond_12

    .line 349
    .line 350
    .line 351
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 352
    move-result-object v0

    .line 353
    .line 354
    sget v1, Lcom/kubi/assets/R$color;->c_icon60:I

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 358
    move-result v0

    .line 359
    .line 360
    .line 361
    :cond_12
    invoke-direct {v3}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 362
    move-result-object v1

    .line 363
    .line 364
    if-eqz v1, :cond_13

    .line 365
    .line 366
    iget-object v1, v1, Lta/f6;->b:Landroid/widget/ImageView;

    .line 367
    .line 368
    if-eqz v1, :cond_13

    .line 369
    .line 370
    .line 371
    invoke-static {v1, v0}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 372
    .line 373
    .line 374
    :cond_13
    invoke-direct {v3}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 375
    move-result-object v1

    .line 376
    .line 377
    if-eqz v1, :cond_14

    .line 378
    .line 379
    iget-object v1, v1, Lta/f6;->b:Landroid/widget/ImageView;

    .line 380
    .line 381
    if-eqz v1, :cond_14

    .line 382
    .line 383
    const/16 v2, 0x14

    .line 384
    .line 385
    .line 386
    invoke-static {v0, v2}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 387
    move-result v0

    .line 388
    .line 389
    const/high16 v2, 0x40800000    # 4.0f

    .line 390
    .line 391
    .line 392
    invoke-static {v0, v2}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 393
    move-result-object v0

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 397
    :cond_14
    return-void
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
.end method

.method public final g(Lcom/kubi/assets/entity/SpotAccountOverviewEntity;)V
    .locals 19
    .param p1    # Lcom/kubi/assets/entity/SpotAccountOverviewEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/SpotAccountOverviewEntity;->getTodayPnl()Ljava/lang/String;

    .line 11
    move-result-object v5

    .line 12
    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-static {v5}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 17
    move-result-object v5

    .line 18
    .line 19
    if-eqz v5, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 23
    move-result-wide v5

    .line 24
    .line 25
    cmpg-double v5, v5, v1

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    move v5, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v5, v3

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    move-result-object v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v5, v4

    .line 37
    .line 38
    :goto_1
    if-nez v5, :cond_2

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v0, v3

    .line 41
    .line 42
    :goto_2
    if-eqz p1, :cond_11

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/SpotAccountOverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    sget-object v7, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 52
    move-result-object v7

    .line 53
    .line 54
    .line 55
    invoke-interface {v7}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 56
    move-result-object v7

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7}, Lcom/kubi/user/model/LoginUserEntity;->getBalanceCurrency()Ljava/lang/String;

    .line 60
    move-result-object v7

    .line 61
    .line 62
    .line 63
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result v6

    .line 65
    .line 66
    if-nez v6, :cond_3

    .line 67
    .line 68
    goto/16 :goto_8

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-static/range {p0 .. p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/SpotAccountOverviewEntity;->getTodayPnl()Ljava/lang/String;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    .line 78
    invoke-static {v6}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 79
    move-result-object v6

    .line 80
    .line 81
    .line 82
    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 83
    move-result-wide v6

    .line 84
    .line 85
    cmpl-double v1, v6, v1

    .line 86
    .line 87
    if-lez v1, :cond_4

    .line 88
    .line 89
    const-string v1, "+"

    .line 90
    goto :goto_3

    .line 91
    .line 92
    :cond_4
    const-string v1, "-"

    .line 93
    .line 94
    :goto_3
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    move-result v6

    .line 99
    .line 100
    if-eqz v6, :cond_5

    .line 101
    .line 102
    const-string v6, "0.00"

    .line 103
    goto :goto_5

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/SpotAccountOverviewEntity;->getTodayPnl()Ljava/lang/String;

    .line 107
    move-result-object v6

    .line 108
    .line 109
    if-eqz v6, :cond_6

    .line 110
    .line 111
    .line 112
    invoke-static {v6}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 113
    move-result-object v6

    .line 114
    .line 115
    if-eqz v6, :cond_6

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 119
    move-result-object v6

    .line 120
    .line 121
    if-eqz v6, :cond_6

    .line 122
    .line 123
    sget-object v7, Lhf/b;->a:Lhf/b;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7}, Lhf/b;->a()Ljava/lang/String;

    .line 127
    move-result-object v7

    .line 128
    .line 129
    .line 130
    invoke-static {v6, v7}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 131
    move-result-wide v8

    .line 132
    .line 133
    const/16 v17, 0x7f

    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x0

    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    .line 146
    invoke-static/range {v8 .. v18}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 147
    move-result-object v6

    .line 148
    goto :goto_4

    .line 149
    :cond_6
    move-object v6, v4

    .line 150
    .line 151
    :goto_4
    const-string v7, "--"

    .line 152
    .line 153
    .line 154
    invoke-static {v6, v7}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    move-result-object v6

    .line 156
    .line 157
    .line 158
    :goto_5
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 159
    move-result-object v7

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/SpotAccountOverviewEntity;->getTodayRoe()Ljava/lang/String;

    .line 163
    move-result-object v8

    .line 164
    .line 165
    if-eqz v8, :cond_7

    .line 166
    .line 167
    .line 168
    invoke-static {v8}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 169
    move-result-object v8

    .line 170
    goto :goto_6

    .line 171
    :cond_7
    move-object v8, v4

    .line 172
    .line 173
    .line 174
    :goto_6
    invoke-static {v8}, Lcom/kubi/utils/extensions/d;->b(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 175
    move-result-object v8

    .line 176
    .line 177
    .line 178
    invoke-static {v8}, Lnf/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    move-result-object v8

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7, v8}, Landroid/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    move-result-object v7

    .line 184
    .line 185
    if-eqz v0, :cond_b

    .line 186
    .line 187
    .line 188
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 189
    move-result-object v1

    .line 190
    .line 191
    if-eqz v1, :cond_8

    .line 192
    .line 193
    iget-object v1, v1, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 194
    .line 195
    if-eqz v1, :cond_8

    .line 196
    .line 197
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 198
    .line 199
    sget v5, Lcom/kubi/assets/R$string;->kc_assets_pnl_updating:I

    .line 200
    .line 201
    new-array v3, v3, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v5, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 205
    move-result-object v2

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 212
    move-result-object v1

    .line 213
    .line 214
    if-eqz v1, :cond_9

    .line 215
    .line 216
    iget-object v1, v1, Lta/f6;->b:Landroid/widget/ImageView;

    .line 217
    .line 218
    if-eqz v1, :cond_9

    .line 219
    .line 220
    .line 221
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 222
    .line 223
    .line 224
    :cond_9
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 225
    move-result-object v1

    .line 226
    .line 227
    if-eqz v1, :cond_a

    .line 228
    .line 229
    iget-object v1, v1, Lta/f6;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 230
    .line 231
    if-eqz v1, :cond_a

    .line 232
    .line 233
    .line 234
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 235
    .line 236
    .line 237
    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 238
    move-result-object v1

    .line 239
    .line 240
    if-eqz v1, :cond_10

    .line 241
    .line 242
    iget-object v1, v1, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 243
    .line 244
    if-eqz v1, :cond_10

    .line 245
    .line 246
    const/high16 v2, 0x41500000    # 13.0f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 250
    goto :goto_8

    .line 251
    .line 252
    .line 253
    :cond_b
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 254
    move-result-object v3

    .line 255
    .line 256
    if-eqz v3, :cond_d

    .line 257
    .line 258
    iget-object v3, v3, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 259
    .line 260
    if-eqz v3, :cond_d

    .line 261
    .line 262
    .line 263
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    move-result v2

    .line 265
    .line 266
    if-eqz v2, :cond_c

    .line 267
    goto :goto_7

    .line 268
    .line 269
    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    const/16 v1, 0x28

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    const/16 v1, 0x29

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    move-result-object v6

    .line 296
    .line 297
    .line 298
    :goto_7
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    .line 300
    .line 301
    :cond_d
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 302
    move-result-object v1

    .line 303
    .line 304
    if-eqz v1, :cond_e

    .line 305
    .line 306
    iget-object v1, v1, Lta/f6;->b:Landroid/widget/ImageView;

    .line 307
    .line 308
    if-eqz v1, :cond_e

    .line 309
    .line 310
    .line 311
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    :cond_e
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 315
    move-result-object v1

    .line 316
    .line 317
    if-eqz v1, :cond_f

    .line 318
    .line 319
    iget-object v1, v1, Lta/f6;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 320
    .line 321
    if-eqz v1, :cond_f

    .line 322
    .line 323
    .line 324
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 325
    .line 326
    .line 327
    :cond_f
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 328
    move-result-object v1

    .line 329
    .line 330
    if-eqz v1, :cond_10

    .line 331
    .line 332
    iget-object v1, v1, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 333
    .line 334
    if-eqz v1, :cond_10

    .line 335
    .line 336
    const/high16 v2, 0x41800000    # 16.0f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 340
    .line 341
    :cond_10
    :goto_8
    move-object/from16 v2, p0

    .line 342
    goto :goto_9

    .line 343
    .line 344
    :cond_11
    new-instance v1, Lcb/d;

    .line 345
    .line 346
    move-object/from16 v2, p0

    .line 347
    .line 348
    .line 349
    invoke-direct {v1, v2}, Lcb/d;-><init>(Lcom/kubi/assets/margin/view/MarginPnlHeaderView;)V

    .line 350
    .line 351
    .line 352
    :goto_9
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 353
    move-result-object v1

    .line 354
    .line 355
    const-string v3, "getContext(...)"

    .line 356
    .line 357
    .line 358
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    if-eqz p1, :cond_12

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/entity/SpotAccountOverviewEntity;->getTodayPnl()Ljava/lang/String;

    .line 364
    move-result-object v4

    .line 365
    .line 366
    .line 367
    :cond_12
    invoke-static {v4}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 368
    move-result-object v3

    .line 369
    .line 370
    .line 371
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 372
    move-result-wide v3

    .line 373
    .line 374
    if-eqz v0, :cond_13

    .line 375
    .line 376
    sget v5, Lcom/kubi/assets/R$color;->c_text40:I

    .line 377
    goto :goto_a

    .line 378
    .line 379
    :cond_13
    sget v5, Lcom/kubi/assets/R$color;->c_text:I

    .line 380
    .line 381
    .line 382
    :goto_a
    invoke-static {v1, v3, v4, v5}, Lcom/kubi/resources/g;->c(Landroid/content/Context;DI)I

    .line 383
    move-result v1

    .line 384
    .line 385
    .line 386
    invoke-direct {v2}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 387
    move-result-object v3

    .line 388
    .line 389
    if-eqz v3, :cond_14

    .line 390
    .line 391
    iget-object v3, v3, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 392
    .line 393
    if-eqz v3, :cond_14

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 397
    .line 398
    :cond_14
    if-eqz v0, :cond_15

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 402
    move-result-object v0

    .line 403
    .line 404
    sget v1, Lcom/kubi/assets/R$color;->c_icon60:I

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 408
    move-result v1

    .line 409
    .line 410
    .line 411
    :cond_15
    invoke-direct {v2}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 412
    move-result-object v0

    .line 413
    .line 414
    if-eqz v0, :cond_16

    .line 415
    .line 416
    iget-object v0, v0, Lta/f6;->b:Landroid/widget/ImageView;

    .line 417
    .line 418
    if-eqz v0, :cond_16

    .line 419
    .line 420
    .line 421
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 422
    .line 423
    .line 424
    :cond_16
    invoke-direct {v2}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 425
    move-result-object v0

    .line 426
    .line 427
    if-eqz v0, :cond_17

    .line 428
    .line 429
    iget-object v0, v0, Lta/f6;->b:Landroid/widget/ImageView;

    .line 430
    .line 431
    if-eqz v0, :cond_17

    .line 432
    .line 433
    const/16 v3, 0x14

    .line 434
    .line 435
    .line 436
    invoke-static {v1, v3}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 437
    move-result v1

    .line 438
    .line 439
    const/high16 v3, 0x40800000    # 4.0f

    .line 440
    .line 441
    .line 442
    invoke-static {v1, v3}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 443
    move-result-object v1

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 447
    :cond_17
    return-void
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
.end method

.method public final setPnlClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 7
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "onClick"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, Lta/f6;->d:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v4, Lcb/b;

    .line 18
    .line 19
    .line 20
    invoke-direct {v4, p1}, Lcb/b;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x0

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 28
    :cond_0
    return-void
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
.end method

.method public final setTitleClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 7
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "onClick"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->getBinding()Lta/f6;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, Lta/f6;->f:Lcom/kubi/resources/widget/DashTextView;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v4, Lcb/c;

    .line 18
    .line 19
    .line 20
    invoke-direct {v4, p1}, Lcb/c;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x0

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 28
    :cond_0
    return-void
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
.end method
