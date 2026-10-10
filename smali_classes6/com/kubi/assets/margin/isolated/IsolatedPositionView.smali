.class public final Lcom/kubi/assets/margin/isolated/IsolatedPositionView;
.super Landroid/widget/LinearLayout;
.source "IsolatedPositionView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/assets/margin/isolated/IsolatedPositionView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/kubi/assets/databinding/ViewIsolatedAssetsPositionBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/ViewIsolatedAssetsPositionBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "bindData",
        "",
        "fragment",
        "Lcom/kubi/sdk/base/ui/OldBaseFragment;",
        "entity",
        "Lcom/kubi/margin/api/entity/MarginPosition;",
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
        "SMAP\nIsolatedPositionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedPositionView.kt\ncom/kubi/assets/margin/isolated/IsolatedPositionView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n41#2:150\n65#2:151\n80#2,7:152\n1#3:159\n*S KotlinDebug\n*F\n+ 1 IsolatedPositionView.kt\ncom/kubi/assets/margin/isolated/IsolatedPositionView\n*L\n44#1:150\n44#1:151\n44#1:152,7\n*E\n"
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/ViewIsolatedAssetsPositionBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/margin/isolated/IsolatedPositionView;

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
    sput-object v1, Lcom/kubi/assets/margin/isolated/IsolatedPositionView;->c:[Lkotlin/reflect/KProperty;

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
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    new-instance v1, Lcom/kubi/assets/margin/isolated/IsolatedPositionView$special$$inlined$viewBinding$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Lcom/kubi/assets/margin/isolated/IsolatedPositionView$special$$inlined$viewBinding$1;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p2, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/kubi/assets/margin/isolated/IsolatedPositionView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 30
    const/4 p2, 0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    sget p2, Lcom/kubi/assets/R$layout;->view_isolated_assets_position:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

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
.end method

.method public static synthetic a(Lcom/kubi/sdk/base/ui/OldBaseFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/margin/isolated/IsolatedPositionView;->d(Lcom/kubi/sdk/base/ui/OldBaseFragment;)Lkotlin/Unit;

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

.method public static synthetic b(Lcom/kubi/sdk/base/ui/OldBaseFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/margin/isolated/IsolatedPositionView;->e(Lcom/kubi/sdk/base/ui/OldBaseFragment;)Lkotlin/Unit;

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

.method public static final d(Lcom/kubi/sdk/base/ui/OldBaseFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p0}, Lcom/kubi/margin/api/IMarginService;->x(Lcom/kubi/sdk/BaseFragment;)V

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final e(Lcom/kubi/sdk/base/ui/OldBaseFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/assets/R$string;->notice_prompt:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/assets/R$string;->margin_dialog_profit_loss_tips_new:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sget v1, Lcom/kubi/assets/R$string;->i_know:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->T4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 37
    move-result-object p0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    return-object p0
.end method

.method private final getBinding()Lta/d6;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/margin/isolated/IsolatedPositionView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/margin/isolated/IsolatedPositionView;->c:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/d6;

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


# virtual methods
.method public final c(Lcom/kubi/sdk/base/ui/OldBaseFragment;Lcom/kubi/margin/api/entity/MarginPosition;)V
    .locals 13
    .param p1    # Lcom/kubi/sdk/base/ui/OldBaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/margin/api/entity/MarginPosition;
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
    const-string v0, "fragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "entity"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/kubi/assets/margin/isolated/IsolatedPositionView;->getBinding()Lta/d6;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_6

    .line 20
    .line 21
    sget-object v3, Lgf/n;->a:Lgf/n;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 31
    move-result-object v4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v4, v2

    .line 34
    .line 35
    :goto_0
    if-nez v4, :cond_1

    .line 36
    move-object v4, v1

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v3, v4}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 44
    move-result-object v5

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 50
    move-result-object v4

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v4, v2

    .line 53
    .line 54
    :goto_1
    iget-object v6, v0, Lta/d6;->b:Lcom/kubi/resources/widget/CoinAvatarView;

    .line 55
    .line 56
    .line 57
    invoke-static {v5, v4, v6}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 61
    move-result-object v4

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 67
    move-result-object v4

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object v4, v2

    .line 70
    .line 71
    :goto_2
    if-nez v4, :cond_4

    .line 72
    move-object v4, v1

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-virtual {v3, v4}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 86
    move-result-object v3

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move-object v3, v2

    .line 89
    .line 90
    :goto_3
    iget-object v0, v0, Lta/d6;->d:Lcom/kubi/resources/widget/CoinAvatarView;

    .line 91
    .line 92
    .line 93
    invoke-static {v4, v3, v0}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 94
    .line 95
    :cond_6
    new-instance v0, Lio/chad/library/adapter/base/BaseViewHolder;

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, p0}, Lio/chad/library/adapter/base/BaseViewHolder;-><init>(Landroid/view/View;)V

    .line 99
    .line 100
    sget v3, Lcom/kubi/assets/R$id;->iv_question:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 104
    move-result-object v3

    .line 105
    move-object v4, v3

    .line 106
    .line 107
    check-cast v4, Landroid/widget/ImageView;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->showProfitDes()Z

    .line 111
    move-result v3

    .line 112
    .line 113
    .line 114
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    move-result-object v3

    .line 116
    .line 117
    .line 118
    invoke-static {v3}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 119
    move-result v3

    .line 120
    .line 121
    if-eqz v3, :cond_7

    .line 122
    .line 123
    .line 124
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 128
    .line 129
    new-instance v7, Lcom/kubi/assets/margin/isolated/i0;

    .line 130
    .line 131
    .line 132
    invoke-direct {v7, p1}, Lcom/kubi/assets/margin/isolated/i0;-><init>(Lcom/kubi/sdk/base/ui/OldBaseFragment;)V

    .line 133
    const/4 v8, 0x1

    .line 134
    const/4 v9, 0x0

    .line 135
    .line 136
    const-wide/16 v5, 0x0

    .line 137
    .line 138
    .line 139
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 140
    goto :goto_4

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 147
    .line 148
    :goto_4
    sget v3, Lcom/kubi/assets/R$id;->tv_profit:I

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 152
    move-result-object v3

    .line 153
    move-object v4, v3

    .line 154
    .line 155
    check-cast v4, Lcom/kubi/resources/widget/DashTextView;

    .line 156
    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    sget v5, Lcom/kubi/assets/R$string;->margin_profit_loss:I

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 166
    move-result-object v5

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    const/16 v10, 0x28

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 178
    move-result-object v5

    .line 179
    .line 180
    if-eqz v5, :cond_8

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 184
    move-result-object v5

    .line 185
    goto :goto_5

    .line 186
    :cond_8
    move-object v5, v2

    .line 187
    .line 188
    :goto_5
    const-string v11, "-"

    .line 189
    .line 190
    .line 191
    invoke-static {v5, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    move-result-object v5

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const/16 v12, 0x29

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    move-result-object v3

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    const/4 v3, 0x1

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v3}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 212
    .line 213
    .line 214
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 215
    .line 216
    new-instance v7, Lcom/kubi/assets/margin/isolated/j0;

    .line 217
    .line 218
    .line 219
    invoke-direct {v7, p1}, Lcom/kubi/assets/margin/isolated/j0;-><init>(Lcom/kubi/sdk/base/ui/OldBaseFragment;)V

    .line 220
    const/4 v8, 0x1

    .line 221
    const/4 v9, 0x0

    .line 222
    .line 223
    const-wide/16 v5, 0x0

    .line 224
    .line 225
    .line 226
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 227
    .line 228
    sget v4, Lcom/kubi/assets/R$id;->tv_profit_value:I

    .line 229
    .line 230
    sget-object v5, Lcom/kubi/margin/api/IMarginService;->a:Lcom/kubi/margin/api/IMarginService$Companion;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Lcom/kubi/margin/api/IMarginService$Companion;->get()Lcom/kubi/margin/api/IMarginService;

    .line 234
    move-result-object v5

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 238
    move-result-object v6

    .line 239
    .line 240
    if-nez v6, :cond_9

    .line 241
    goto :goto_6

    .line 242
    :cond_9
    move-object v1, v6

    .line 243
    .line 244
    .line 245
    :goto_6
    invoke-interface {v5, v1}, Lcom/kubi/margin/api/IMarginService;->z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 246
    move-result-object v1

    .line 247
    .line 248
    .line 249
    invoke-virtual {p2, v1}, Lcom/kubi/margin/api/entity/MarginPosition;->getProfitValueString(Ljava/lang/Integer;)Ljava/lang/String;

    .line 250
    move-result-object v1

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v4, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 257
    move-result-object v1

    .line 258
    .line 259
    if-eqz v1, :cond_a

    .line 260
    .line 261
    .line 262
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->calculatorProfitValue()Ljava/math/BigDecimal;

    .line 263
    move-result-object v5

    .line 264
    .line 265
    .line 266
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 267
    move-result-wide v5

    .line 268
    .line 269
    sget v7, Lcom/kubi/assets/R$color;->emphasis:I

    .line 270
    .line 271
    .line 272
    invoke-static {v1, v5, v6, v7}, Lcom/kubi/resources/g;->c(Landroid/content/Context;DI)I

    .line 273
    move-result v1

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v4, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 277
    .line 278
    :cond_a
    sget v1, Lcom/kubi/assets/R$id;->tv_profit_value_legal:I

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 282
    move-result-object v1

    .line 283
    .line 284
    check-cast v1, Landroid/widget/TextView;

    .line 285
    .line 286
    .line 287
    invoke-static {p2, v2, v3, v2}, Lcom/kubi/margin/api/entity/MarginPosition;->getProfitValueLegalString$default(Lcom/kubi/margin/api/entity/MarginPosition;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 288
    move-result-object v4

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 295
    move-result-object v4

    .line 296
    .line 297
    .line 298
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 299
    move-result v4

    .line 300
    .line 301
    if-eqz v4, :cond_b

    .line 302
    .line 303
    .line 304
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 308
    goto :goto_7

    .line 309
    .line 310
    .line 311
    :cond_b
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 315
    .line 316
    :goto_7
    sget v1, Lcom/kubi/assets/R$id;->tv_liquid:I

    .line 317
    .line 318
    new-instance v4, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    sget v5, Lcom/kubi/assets/R$string;->margin_liquidation_price:I

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 327
    move-result-object p1

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 337
    move-result-object p1

    .line 338
    .line 339
    if-eqz p1, :cond_c

    .line 340
    .line 341
    .line 342
    invoke-virtual {p1}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 343
    move-result-object p1

    .line 344
    goto :goto_8

    .line 345
    :cond_c
    move-object p1, v2

    .line 346
    .line 347
    .line 348
    :goto_8
    invoke-static {p1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    move-result-object p1

    .line 350
    .line 351
    .line 352
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    move-result-object p1

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v1, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 363
    .line 364
    sget p1, Lcom/kubi/assets/R$id;->tv_liquid_price:I

    .line 365
    .line 366
    sget-object v1, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 370
    move-result-object v1

    .line 371
    .line 372
    .line 373
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getTag()Ljava/lang/String;

    .line 374
    move-result-object v4

    .line 375
    .line 376
    .line 377
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 378
    move-result-object v4

    .line 379
    .line 380
    .line 381
    invoke-interface {v1, v3, v4}, Lcom/kubi/margin/api/IMarginService;->u(ZLjava/lang/String;)Ljava/math/BigDecimal;

    .line 382
    move-result-object v1

    .line 383
    .line 384
    .line 385
    invoke-virtual {p2, v1}, Lcom/kubi/margin/api/entity/MarginPosition;->liquidationPriceString(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 386
    move-result-object v1

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 390
    .line 391
    sget p1, Lcom/kubi/assets/R$id;->tvBase:I

    .line 392
    .line 393
    .line 394
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 395
    move-result-object v1

    .line 396
    .line 397
    if-eqz v1, :cond_d

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 401
    move-result-object v1

    .line 402
    goto :goto_9

    .line 403
    :cond_d
    move-object v1, v2

    .line 404
    .line 405
    .line 406
    :goto_9
    invoke-static {v1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 407
    move-result-object v1

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 411
    .line 412
    sget p1, Lcom/kubi/assets/R$id;->tv_base_total_balance:I

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 416
    move-result-object v1

    .line 417
    .line 418
    const-string v3, "getView(...)"

    .line 419
    .line 420
    .line 421
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    .line 423
    check-cast v1, Landroid/widget/TextView;

    .line 424
    .line 425
    new-instance v4, Lrs/c$a;

    .line 426
    const/4 v5, 0x0

    .line 427
    const/4 v6, 0x3

    .line 428
    .line 429
    .line 430
    invoke-direct {v4, v5, v5, v6, v2}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 431
    const/4 v7, 0x2

    .line 432
    .line 433
    .line 434
    invoke-static {v1, v4, v5, v7, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 435
    .line 436
    .line 437
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 438
    move-result-object v1

    .line 439
    .line 440
    if-eqz v1, :cond_e

    .line 441
    .line 442
    .line 443
    invoke-static {v1}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 444
    move-result-object v1

    .line 445
    goto :goto_a

    .line 446
    :cond_e
    move-object v1, v2

    .line 447
    .line 448
    .line 449
    :goto_a
    invoke-static {v1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 450
    move-result-object v1

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 454
    .line 455
    sget p1, Lcom/kubi/assets/R$id;->tv_base_freeze_balance:I

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 459
    move-result-object v1

    .line 460
    .line 461
    .line 462
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 463
    .line 464
    check-cast v1, Landroid/widget/TextView;

    .line 465
    .line 466
    new-instance v4, Lrs/c$a;

    .line 467
    .line 468
    .line 469
    invoke-direct {v4, v5, v5, v6, v2}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 470
    .line 471
    .line 472
    invoke-static {v1, v4, v5, v7, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 473
    .line 474
    .line 475
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 476
    move-result-object v1

    .line 477
    .line 478
    if-eqz v1, :cond_f

    .line 479
    .line 480
    .line 481
    invoke-static {v1}, Lzo/a;->m(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 482
    move-result-object v1

    .line 483
    goto :goto_b

    .line 484
    :cond_f
    move-object v1, v2

    .line 485
    .line 486
    .line 487
    :goto_b
    invoke-static {v1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 488
    move-result-object v1

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 492
    .line 493
    sget p1, Lcom/kubi/assets/R$id;->tv_base_debt:I

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 497
    move-result-object v1

    .line 498
    .line 499
    .line 500
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    .line 502
    check-cast v1, Landroid/widget/TextView;

    .line 503
    .line 504
    new-instance v4, Lrs/c$a;

    .line 505
    .line 506
    .line 507
    invoke-direct {v4, v5, v5, v6, v2}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 508
    .line 509
    .line 510
    invoke-static {v1, v4, v5, v7, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 511
    .line 512
    .line 513
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getBaseAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 514
    move-result-object v1

    .line 515
    .line 516
    if-eqz v1, :cond_10

    .line 517
    .line 518
    .line 519
    invoke-static {v1}, Lzo/a;->j(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 520
    move-result-object v1

    .line 521
    goto :goto_c

    .line 522
    :cond_10
    move-object v1, v2

    .line 523
    .line 524
    .line 525
    :goto_c
    invoke-static {v1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 526
    move-result-object v1

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 530
    .line 531
    sget p1, Lcom/kubi/assets/R$id;->tvQuote:I

    .line 532
    .line 533
    .line 534
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 535
    move-result-object v1

    .line 536
    .line 537
    if-eqz v1, :cond_11

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 541
    move-result-object v1

    .line 542
    goto :goto_d

    .line 543
    :cond_11
    move-object v1, v2

    .line 544
    .line 545
    .line 546
    :goto_d
    invoke-static {v1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 547
    move-result-object v1

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 551
    .line 552
    sget p1, Lcom/kubi/assets/R$id;->tv_quote_total_balance:I

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 556
    move-result-object v1

    .line 557
    .line 558
    .line 559
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 560
    .line 561
    check-cast v1, Landroid/widget/TextView;

    .line 562
    .line 563
    new-instance v4, Lrs/c$a;

    .line 564
    .line 565
    .line 566
    invoke-direct {v4, v5, v5, v6, v2}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 567
    .line 568
    .line 569
    invoke-static {v1, v4, v5, v7, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 570
    .line 571
    .line 572
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 573
    move-result-object v1

    .line 574
    .line 575
    if-eqz v1, :cond_12

    .line 576
    .line 577
    .line 578
    invoke-static {v1}, Lzo/a;->q(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 579
    move-result-object v1

    .line 580
    goto :goto_e

    .line 581
    :cond_12
    move-object v1, v2

    .line 582
    .line 583
    .line 584
    :goto_e
    invoke-static {v1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 585
    move-result-object v1

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 589
    .line 590
    sget p1, Lcom/kubi/assets/R$id;->tv_quote_freeze_balance:I

    .line 591
    .line 592
    .line 593
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 594
    move-result-object v1

    .line 595
    .line 596
    .line 597
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 598
    .line 599
    check-cast v1, Landroid/widget/TextView;

    .line 600
    .line 601
    new-instance v4, Lrs/c$a;

    .line 602
    .line 603
    .line 604
    invoke-direct {v4, v5, v5, v6, v2}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 605
    .line 606
    .line 607
    invoke-static {v1, v4, v5, v7, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 608
    .line 609
    .line 610
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 611
    move-result-object v1

    .line 612
    .line 613
    if-eqz v1, :cond_13

    .line 614
    .line 615
    .line 616
    invoke-static {v1}, Lzo/a;->m(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 617
    move-result-object v1

    .line 618
    goto :goto_f

    .line 619
    :cond_13
    move-object v1, v2

    .line 620
    .line 621
    .line 622
    :goto_f
    invoke-static {v1, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 623
    move-result-object v1

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0, p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 627
    .line 628
    sget p1, Lcom/kubi/assets/R$id;->tv_quote_debt:I

    .line 629
    .line 630
    .line 631
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 632
    move-result-object v1

    .line 633
    .line 634
    .line 635
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 636
    .line 637
    check-cast v1, Landroid/widget/TextView;

    .line 638
    .line 639
    new-instance v3, Lrs/c$a;

    .line 640
    .line 641
    .line 642
    invoke-direct {v3, v5, v5, v6, v2}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 643
    .line 644
    .line 645
    invoke-static {v1, v3, v5, v7, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 646
    .line 647
    .line 648
    invoke-virtual {p2}, Lcom/kubi/margin/api/entity/MarginPosition;->getQuoteAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 649
    move-result-object p2

    .line 650
    .line 651
    if-eqz p2, :cond_14

    .line 652
    .line 653
    .line 654
    invoke-static {p2}, Lzo/a;->j(Lcom/kubi/tradebase/entity/CurrencyBalance;)Ljava/lang/String;

    .line 655
    move-result-object v2

    .line 656
    .line 657
    .line 658
    :cond_14
    invoke-static {v2, v11}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 659
    move-result-object p2

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 663
    return-void
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
.end method
