.class public final Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;
.super Landroid/widget/FrameLayout;
.source "AssetV2CrossHeaderView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0008\u0010\u001e\u001a\u00020\u0015H\u0002R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/kubi/assets/databinding/ViewCrossAssetsHeaderBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/ViewCrossAssetsHeaderBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "fragment",
        "Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;",
        "getFragment",
        "()Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;",
        "setFragment",
        "(Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;)V",
        "bindFragment",
        "",
        "assetV2CrossFragment",
        "getAccountInfoHeader",
        "Lcom/kubi/assets/view/AccountInfoHeaderView;",
        "getPnlViewHeader",
        "Lcom/kubi/assets/margin/view/MarginPnlHeaderView;",
        "bindInfo2View",
        "asset",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "initListener",
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
        "SMAP\nAssetV2CrossHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2CrossHeaderView.kt\ncom/kubi/assets/margin/cross/AssetV2CrossHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,186:1\n52#2:187\n80#2,7:188\n*S KotlinDebug\n*F\n+ 1 AssetV2CrossHeaderView.kt\ncom/kubi/assets/margin/cross/AssetV2CrossHeaderView\n*L\n57#1:187\n57#1:188,7\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic d:[Lkotlin/reflect/KProperty;
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

.field public c:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/ViewCrossAssetsHeaderBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;

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
    sput-object v1, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->d:[Lkotlin/reflect/KProperty;

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
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    new-instance v1, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView$special$$inlined$customViewBinding$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView$special$$inlined$customViewBinding$1;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p2, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    sget p2, Lcom/kubi/assets/R$layout;->view_cross_assets_header:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

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
.end method

.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->o()Lkotlin/Unit;

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
.end method

.method public static synthetic b(Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->r(Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;)Lkotlin/Unit;

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

.method public static synthetic c(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->n(Landroid/content/DialogInterface;I)V

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
.end method

.method public static synthetic d()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->t()Lkotlin/Unit;

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
.end method

.method public static synthetic e()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->q()Lkotlin/Unit;

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
.end method

.method public static synthetic f()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->l()Lkotlin/Unit;

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
.end method

.method public static synthetic g()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->u()Lkotlin/Unit;

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
.end method

.method private final getBinding()Lta/x5;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->d:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/x5;

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

.method public static synthetic h()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->s()Lkotlin/Unit;

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
.end method

.method public static synthetic i()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->m()Lkotlin/Unit;

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
.end method

.method public static final l()Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/margin/api/IMarginService;->a:Lcom/kubi/margin/api/IMarginService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/margin/api/IMarginService$Companion;->get()Lcom/kubi/margin/api/IMarginService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Lyo/b$a;->a:Lyo/b$a;

    .line 9
    .line 10
    sget-object v2, Lyo/a$a;->b:Lyo/a$a;

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1, v2, v3, v3}, Lcom/kubi/margin/api/IMarginService;->p0(Lyo/b;Lyo/a;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    return-object v0
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

.method public static final m()Lkotlin/Unit;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/a;->h()Landroid/app/Activity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v1, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    sget v2, Lcom/kubi/assets/R$string;->analysis_todays_pnl:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 29
    .line 30
    sget v3, Lcom/kubi/assets/R$string;->margin_pnl_tips:I

    .line 31
    .line 32
    sget-object v4, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-interface {v4}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/kubi/user/model/LoginUserEntity;->getBalanceCurrency()Ljava/lang/String;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    .line 47
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    sget v2, Lcom/kubi/assets/R$string;->already_know:I

    .line 59
    .line 60
    new-instance v3, Lcom/kubi/assets/margin/cross/q;

    .line 61
    .line 62
    .line 63
    invoke-direct {v3}, Lcom/kubi/assets/margin/cross/q;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    const-string v2, "getSupportFragmentManager(...)"

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    const-string v2, "MarginPnlHeaderView"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 82
    .line 83
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 84
    return-object v0
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
.end method

.method public static final n(Landroid/content/DialogInterface;I)V
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
    .line 65
.end method

.method public static final o()Lkotlin/Unit;
    .locals 11

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4crossMarginAccount"

    .line 6
    .line 7
    const-string v1, "revenueStatistics"

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
    invoke-static {}, Lcom/kubi/assets/z0;->k()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/kubi/assets/z0;->d()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/kubi/assets/z0;->a()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    sget-object v1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lay/a;->k()Z

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_0
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 54
    .line 55
    sget-object v0, Lcom/kubi/assets/b1;->a:Lcom/kubi/assets/b1;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/kubi/assets/b1;->d()Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    const-string v0, "decode(...)"

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    const/16 v9, 0x7e

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v3, 0x0

    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    .line 79
    .line 80
    invoke-static/range {v1 .. v10}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 81
    .line 82
    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 83
    return-object v0
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
.end method

.method public static final q()Lkotlin/Unit;
    .locals 12

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4crossMarginAccount"

    .line 6
    .line 7
    const-string v1, "transfer"

    .line 8
    .line 9
    const-string v2, "1"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v6, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x4

    .line 18
    .line 19
    const-string v2, "B4crossMarginAccount"

    .line 20
    .line 21
    const-string v3, "transfer"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1, v0}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object v9

    .line 26
    const/4 v10, 0x1

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    .line 30
    const-string v8, "MARGIN"

    .line 31
    .line 32
    .line 33
    invoke-static/range {v6 .. v11}, Lcom/kubi/assets/service/AssetsHelper;->N(Lcom/kubi/assets/service/AssetsHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 36
    return-object v0
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
.end method

.method public static final r(Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4crossMarginAccount"

    .line 6
    .line 7
    const-string v1, "isolatedMargin"

    .line 8
    .line 9
    const-string v2, "1"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    iget-object p0, p0, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->c:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p0, v0

    .line 25
    .line 26
    :goto_0
    instance-of v1, p0, Lcom/kubi/assets/margin/AssetV2MarginFragment;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    move-object v0, p0

    .line 30
    .line 31
    check-cast v0, Lcom/kubi/assets/margin/AssetV2MarginFragment;

    .line 32
    .line 33
    :cond_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/kubi/assets/margin/AssetV2MarginFragment;->I3()V

    .line 37
    .line 38
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    return-object p0
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static final s()Lkotlin/Unit;
    .locals 9

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const/16 v7, 0x3e

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v8}, Lg00/h$a;->a(Lg00/h;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static final t()Lkotlin/Unit;
    .locals 16

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4crossMarginAccount"

    .line 6
    .line 7
    const-string v1, "borrowButton"

    .line 8
    .line 9
    const-string v2, "1"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v6, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    const-string v1, "BTC-"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    sget-object v1, Lhf/b;->a:Lhf/b;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lhf/b;->a()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v8

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lhf/b;->a()Ljava/lang/String;

    .line 42
    move-result-object v7

    .line 43
    .line 44
    const-string v0, "borrowButton"

    .line 45
    .line 46
    const-string v1, "1"

    .line 47
    .line 48
    const-string v2, "B4crossMarginAccount"

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v0, v1}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    move-result-object v11

    .line 53
    .line 54
    const/16 v14, 0x60

    .line 55
    const/4 v15, 0x0

    .line 56
    .line 57
    const-string v9, "borrow"

    .line 58
    .line 59
    const-string v10, "cross"

    .line 60
    const/4 v12, 0x0

    .line 61
    const/4 v13, 0x0

    .line 62
    .line 63
    .line 64
    invoke-static/range {v6 .. v15}, Lg00/h$a;->b(Lg00/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    return-object v0
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
.end method

.method public static final u()Lkotlin/Unit;
    .locals 15

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B4crossMarginAccount"

    .line 6
    .line 7
    const-string v1, "repayButton"

    .line 8
    .line 9
    const-string v2, "1"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v6, Lf00/a;->a:Lf00/a;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    move-result-object v7

    .line 22
    .line 23
    const-string v0, "repayButton"

    .line 24
    .line 25
    const-string v1, "1"

    .line 26
    .line 27
    const-string v2, "B4crossMarginAccount"

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v10

    .line 32
    .line 33
    const/16 v13, 0x36

    .line 34
    const/4 v14, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v6 .. v14}, Lg00/h$a;->a(Lg00/h;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 42
    .line 43
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    return-object v0
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
.end method


# virtual methods
.method public final getAccountInfoHeader()Lcom/kubi/assets/view/AccountInfoHeaderView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/x5;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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
.end method

.method public final getFragment()Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->c:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

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
.end method

.method public final getPnlViewHeader()Lcom/kubi/assets/margin/view/MarginPnlHeaderView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/x5;->s:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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
.end method

.method public final j(Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;)V
    .locals 2
    .param p1    # Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "assetV2CrossFragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->c:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lta/x5;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v1, "B4crossMarginAccount"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lcom/kubi/assets/view/AccountInfoHeaderView;->d(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->p()V

    .line 26
    return-void
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

.method public final k(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 24
    .param p1    # Lcom/kubi/assets/entity/AssetV2OverviewEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "asset"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getCrossMarginAsset()Lcom/kubi/margin/api/entity/LeverBalance;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Lcom/kubi/margin/api/entity/LeverBalance;->setValuableCurrency(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    const-string v4, "--"

    .line 29
    const/4 v5, 0x0

    .line 30
    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    iget-object v3, v3, Lta/x5;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getTotalBalance()Ljava/math/BigDecimal;

    .line 41
    move-result-object v6

    .line 42
    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 51
    move-result-object v8

    .line 52
    .line 53
    .line 54
    invoke-static {v8}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 55
    move-result v8

    .line 56
    .line 57
    .line 58
    invoke-static {v6, v7, v8}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 59
    move-result-object v6

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object v6, v5

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-static {v6, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    move-result-object v6

    .line 66
    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getTotalBalance()Ljava/math/BigDecimal;

    .line 71
    move-result-object v7

    .line 72
    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 77
    move-result-object v8

    .line 78
    .line 79
    .line 80
    invoke-static {v7, v8}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 81
    move-result-wide v9

    .line 82
    .line 83
    const/16 v18, 0x2f

    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    const/4 v11, 0x0

    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v14, 0x0

    .line 90
    const/4 v15, 0x1

    .line 91
    .line 92
    const/16 v16, 0x0

    .line 93
    .line 94
    const/16 v17, 0x1

    .line 95
    .line 96
    .line 97
    invoke-static/range {v9 .. v19}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 98
    move-result-object v7

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move-object v7, v5

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-static {v7, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    move-result-object v7

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v1, v6, v7}, Lcom/kubi/assets/view/AccountInfoHeaderView;->B(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 111
    move-result-object v3

    .line 112
    const/4 v6, 0x2

    .line 113
    const/4 v7, 0x3

    .line 114
    const/4 v8, 0x0

    .line 115
    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    iget-object v3, v3, Lta/x5;->m:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 119
    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    new-instance v9, Lrs/c$a;

    .line 123
    .line 124
    .line 125
    invoke-direct {v9, v8, v8, v7, v5}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v3, v9, v8, v6, v5}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 129
    move-result-object v3

    .line 130
    .line 131
    if-eqz v3, :cond_5

    .line 132
    .line 133
    if-eqz v2, :cond_4

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getTotalLiability()Ljava/math/BigDecimal;

    .line 137
    move-result-object v9

    .line 138
    .line 139
    if-eqz v9, :cond_4

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 143
    move-result-object v10

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 147
    move-result-object v11

    .line 148
    .line 149
    .line 150
    invoke-static {v11}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 151
    move-result v11

    .line 152
    .line 153
    .line 154
    invoke-static {v9, v10, v11}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 155
    move-result-object v9

    .line 156
    goto :goto_2

    .line 157
    :cond_4
    move-object v9, v5

    .line 158
    .line 159
    .line 160
    :goto_2
    invoke-static {v9, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    move-result-object v9

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    :cond_5
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    if-eqz v3, :cond_7

    .line 171
    .line 172
    iget-object v3, v3, Lta/x5;->l:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 173
    .line 174
    if-eqz v3, :cond_7

    .line 175
    .line 176
    if-eqz v2, :cond_6

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getTotalLiability()Ljava/math/BigDecimal;

    .line 180
    move-result-object v9

    .line 181
    .line 182
    if-eqz v9, :cond_6

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/math/BigDecimal;->doubleValue()D

    .line 186
    move-result-wide v9

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 190
    move-result-object v1

    .line 191
    .line 192
    .line 193
    invoke-static {v9, v10, v1}, Lkf/a;->m(DLjava/lang/String;)D

    .line 194
    move-result-wide v11

    .line 195
    .line 196
    const/16 v20, 0x2f

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v15, 0x0

    .line 202
    .line 203
    const/16 v16, 0x0

    .line 204
    .line 205
    const/16 v17, 0x1

    .line 206
    .line 207
    const/16 v18, 0x0

    .line 208
    .line 209
    const/16 v19, 0x1

    .line 210
    .line 211
    .line 212
    invoke-static/range {v11 .. v21}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 213
    move-result-object v1

    .line 214
    goto :goto_3

    .line 215
    :cond_6
    move-object v1, v5

    .line 216
    .line 217
    .line 218
    :goto_3
    invoke-static {v1, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    .line 224
    :cond_7
    sget-object v1, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 228
    move-result-object v9

    .line 229
    .line 230
    .line 231
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 232
    move-result-object v3

    .line 233
    .line 234
    if-eqz v3, :cond_8

    .line 235
    .line 236
    iget-object v3, v3, Lta/x5;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 237
    .line 238
    if-eqz v3, :cond_8

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Lcom/kubi/assets/view/AccountInfoHeaderView;->Y()Landroid/view/ViewGroup;

    .line 242
    move-result-object v3

    .line 243
    move-object v10, v3

    .line 244
    goto :goto_4

    .line 245
    :cond_8
    move-object v10, v5

    .line 246
    .line 247
    :goto_4
    iget-object v11, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->c:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 248
    .line 249
    .line 250
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 251
    .line 252
    if-eqz v2, :cond_9

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getStatus()Ljava/lang/String;

    .line 256
    move-result-object v3

    .line 257
    goto :goto_5

    .line 258
    :cond_9
    move-object v3, v5

    .line 259
    .line 260
    .line 261
    :goto_5
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    move-result-object v12

    .line 263
    .line 264
    if-eqz v2, :cond_a

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getLiabilityRate()Ljava/math/BigDecimal;

    .line 268
    move-result-object v3

    .line 269
    goto :goto_6

    .line 270
    :cond_a
    move-object v3, v5

    .line 271
    .line 272
    .line 273
    :goto_6
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 274
    move-result-wide v13

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 278
    move-result-object v3

    .line 279
    .line 280
    .line 281
    invoke-interface {v3}, Lcom/kubi/margin/api/IMarginService;->W()Ljava/lang/String;

    .line 282
    move-result-object v3

    .line 283
    .line 284
    .line 285
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    move-result-object v15

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 290
    move-result-object v3

    .line 291
    .line 292
    const-string v4, ""

    .line 293
    .line 294
    .line 295
    invoke-interface {v3, v8, v4}, Lcom/kubi/margin/api/IMarginService;->u0(ZLjava/lang/String;)Ljava/math/BigDecimal;

    .line 296
    move-result-object v17

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 300
    move-result-object v1

    .line 301
    .line 302
    .line 303
    invoke-interface {v1, v8, v4}, Lcom/kubi/margin/api/IMarginService;->u(ZLjava/lang/String;)Ljava/math/BigDecimal;

    .line 304
    move-result-object v18

    .line 305
    .line 306
    iget-object v1, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->c:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 307
    .line 308
    if-eqz v1, :cond_b

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1}, Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;->E3()Ljava/lang/String;

    .line 312
    move-result-object v1

    .line 313
    .line 314
    move-object/from16 v20, v1

    .line 315
    goto :goto_7

    .line 316
    .line 317
    :cond_b
    move-object/from16 v20, v5

    .line 318
    .line 319
    :goto_7
    const/16 v22, 0x400

    .line 320
    .line 321
    const/16 v23, 0x0

    .line 322
    .line 323
    const/16 v16, 0x0

    .line 324
    .line 325
    const/16 v19, 0x0

    .line 326
    .line 327
    const/16 v21, 0x0

    .line 328
    .line 329
    .line 330
    invoke-static/range {v9 .. v23}, Lcom/kubi/margin/api/IMarginService;->R(Lcom/kubi/margin/api/IMarginService;Landroid/view/ViewGroup;Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;DLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;ZILjava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 334
    move-result-object v1

    .line 335
    .line 336
    if-eqz v1, :cond_d

    .line 337
    .line 338
    iget-object v1, v1, Lta/x5;->p:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 339
    .line 340
    if-eqz v1, :cond_d

    .line 341
    .line 342
    new-instance v3, Lrs/c$a;

    .line 343
    .line 344
    .line 345
    invoke-direct {v3, v8, v8, v7, v5}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v1, v3, v8, v6, v5}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 349
    move-result-object v1

    .line 350
    .line 351
    if-eqz v1, :cond_d

    .line 352
    .line 353
    if-eqz v2, :cond_c

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getValuableCurrency()Ljava/lang/String;

    .line 357
    move-result-object v3

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getValuableCurrency()Ljava/lang/String;

    .line 361
    move-result-object v4

    .line 362
    .line 363
    .line 364
    invoke-static {v4}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 365
    move-result v4

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v3, v4}, Lcom/kubi/margin/api/entity/LeverBalance;->getRealBalanceString(Ljava/lang/String;I)Ljava/lang/String;

    .line 369
    move-result-object v3

    .line 370
    goto :goto_8

    .line 371
    :cond_c
    move-object v3, v5

    .line 372
    .line 373
    .line 374
    :goto_8
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    .line 377
    :cond_d
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 378
    move-result-object v1

    .line 379
    .line 380
    if-eqz v1, :cond_f

    .line 381
    .line 382
    iget-object v1, v1, Lta/x5;->o:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 383
    .line 384
    if-eqz v1, :cond_f

    .line 385
    .line 386
    if-eqz v2, :cond_e

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/LeverBalance;->getRealBalancePriceString()Ljava/lang/String;

    .line 390
    move-result-object v5

    .line 391
    .line 392
    .line 393
    :cond_e
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 394
    .line 395
    .line 396
    :cond_f
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 397
    move-result-object v1

    .line 398
    .line 399
    if-eqz v1, :cond_10

    .line 400
    .line 401
    iget-object v2, v1, Lta/x5;->c:Landroid/widget/ImageView;

    .line 402
    .line 403
    if-eqz v2, :cond_10

    .line 404
    .line 405
    new-instance v5, Lcom/kubi/assets/margin/cross/n;

    .line 406
    .line 407
    .line 408
    invoke-direct {v5}, Lcom/kubi/assets/margin/cross/n;-><init>()V

    .line 409
    const/4 v6, 0x1

    .line 410
    const/4 v7, 0x0

    .line 411
    .line 412
    const-wide/16 v3, 0x0

    .line 413
    .line 414
    .line 415
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    :cond_10
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 419
    move-result-object v1

    .line 420
    .line 421
    if-eqz v1, :cond_11

    .line 422
    .line 423
    iget-object v1, v1, Lta/x5;->s:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 424
    .line 425
    if-eqz v1, :cond_11

    .line 426
    .line 427
    new-instance v2, Lcom/kubi/assets/margin/cross/o;

    .line 428
    .line 429
    .line 430
    invoke-direct {v2}, Lcom/kubi/assets/margin/cross/o;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1, v2}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->setTitleClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 434
    .line 435
    .line 436
    :cond_11
    invoke-direct {v0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 437
    move-result-object v1

    .line 438
    .line 439
    if-eqz v1, :cond_12

    .line 440
    .line 441
    iget-object v1, v1, Lta/x5;->s:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 442
    .line 443
    if-eqz v1, :cond_12

    .line 444
    .line 445
    new-instance v2, Lcom/kubi/assets/margin/cross/p;

    .line 446
    .line 447
    .line 448
    invoke-direct {v2}, Lcom/kubi/assets/margin/cross/p;-><init>()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v2}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->setPnlClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 452
    :cond_12
    return-void
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

.method public final p()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lta/x5;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v4, Lcom/kubi/assets/margin/cross/r;

    .line 13
    .line 14
    .line 15
    invoke-direct {v4, p0}, Lcom/kubi/assets/margin/cross/r;-><init>(Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;)V

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-direct {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v1, v0, Lta/x5;->f:Landroid/widget/LinearLayout;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    new-instance v4, Lcom/kubi/assets/margin/cross/s;

    .line 35
    .line 36
    .line 37
    invoke-direct {v4}, Lcom/kubi/assets/margin/cross/s;-><init>()V

    .line 38
    const/4 v5, 0x1

    .line 39
    const/4 v6, 0x0

    .line 40
    .line 41
    const-wide/16 v2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-direct {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v1, v0, Lta/x5;->j:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    new-instance v4, Lcom/kubi/assets/margin/cross/t;

    .line 57
    .line 58
    .line 59
    invoke-direct {v4}, Lcom/kubi/assets/margin/cross/t;-><init>()V

    .line 60
    const/4 v5, 0x1

    .line 61
    const/4 v6, 0x0

    .line 62
    .line 63
    const-wide/16 v2, 0x0

    .line 64
    .line 65
    .line 66
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-direct {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-object v1, v0, Lta/x5;->q:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    new-instance v4, Lcom/kubi/assets/margin/cross/u;

    .line 79
    .line 80
    .line 81
    invoke-direct {v4}, Lcom/kubi/assets/margin/cross/u;-><init>()V

    .line 82
    const/4 v5, 0x1

    .line 83
    const/4 v6, 0x0

    .line 84
    .line 85
    const-wide/16 v2, 0x0

    .line 86
    .line 87
    .line 88
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-direct {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->getBinding()Lta/x5;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    iget-object v1, v0, Lta/x5;->r:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 97
    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    new-instance v4, Lcom/kubi/assets/margin/cross/v;

    .line 101
    .line 102
    .line 103
    invoke-direct {v4}, Lcom/kubi/assets/margin/cross/v;-><init>()V

    .line 104
    const/4 v5, 0x1

    .line 105
    const/4 v6, 0x0

    .line 106
    .line 107
    const-wide/16 v2, 0x0

    .line 108
    .line 109
    .line 110
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 111
    :cond_4
    return-void
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
.end method

.method public final setFragment(Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;)V
    .locals 0
    .param p1    # Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/margin/cross/AssetV2CrossHeaderView;->c:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 3
    return-void
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
.end method
