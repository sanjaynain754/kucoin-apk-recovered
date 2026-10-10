.class public final Lcom/kubi/assets/options/AssetOptionsHeaderView;
.super Landroid/widget/FrameLayout;
.source "AssetOptionsHeaderView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0008\u0010\u001c\u001a\u00020\u0011H\u0002R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/kubi/assets/options/AssetOptionsHeaderView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attributes",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/kubi/assets/databinding/AssetViewOptionsHeaderBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/AssetViewOptionsHeaderBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "fragment",
        "Lcom/kubi/assets/options/AssetOptionsFragment;",
        "bindFragment",
        "",
        "assetOptionsFragment",
        "getAccountInfoHeader",
        "Lcom/kubi/assets/view/AccountInfoHeaderView;",
        "getPnlViewHeader",
        "Lcom/kubi/assets/options/view/OptionsPnlHeaderView;",
        "bindInfo2View",
        "asset",
        "Lcom/kubi/assets/entity/OptionsOverviewEntity;",
        "assetsOverview",
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
        "SMAP\nAssetOptionsHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOptionsHeaderView.kt\ncom/kubi/assets/options/AssetOptionsHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,95:1\n52#2:96\n80#2,7:97\n*S KotlinDebug\n*F\n+ 1 AssetOptionsHeaderView.kt\ncom/kubi/assets/options/AssetOptionsHeaderView\n*L\n39#1:96\n39#1:97,7\n*E\n"
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

.field public c:Lcom/kubi/assets/options/AssetOptionsFragment;
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/AssetViewOptionsHeaderBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/options/AssetOptionsHeaderView;

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
    sput-object v1, Lcom/kubi/assets/options/AssetOptionsHeaderView;->d:[Lkotlin/reflect/KProperty;

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-static {}, Lcom/kubi/sdk/viewbindingdelegate/internal/UtilsKt;->b()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    .line 5
    new-instance v0, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;

    new-instance v1, Lcom/kubi/assets/options/AssetOptionsHeaderView$special$$inlined$customViewBinding$1;

    invoke-direct {v1}, Lcom/kubi/assets/options/AssetOptionsHeaderView$special$$inlined$customViewBinding$1;-><init>()V

    invoke-direct {v0, p2, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 6
    iput-object v0, p0, Lcom/kubi/assets/options/AssetOptionsHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/kubi/assets/R$layout;->asset_view_options_header:I

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/kubi/assets/options/AssetOptionsHeaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->g()Lkotlin/Unit;

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

.method public static synthetic b()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->e()Lkotlin/Unit;

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

.method public static final e()Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "krn/router?component=kucoin_options_rn&biz=options&entry=main&route="

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "HistoryPage?tab=ORDER_HISTORY"

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lay/a;->k()Z

    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
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

.method public static final g()Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 3
    const/4 v4, 0x5

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const-string v2, "OPTION"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, Lcom/kubi/assets/service/AssetsHelper;->N(Lcom/kubi/assets/service/AssetsHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private final getBinding()Lta/q2;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/options/AssetOptionsHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/options/AssetOptionsHeaderView;->d:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/q2;

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
.method public final c(Lcom/kubi/assets/options/AssetOptionsFragment;)V
    .locals 2
    .param p1    # Lcom/kubi/assets/options/AssetOptionsFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "assetOptionsFragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/options/AssetOptionsHeaderView;->c:Lcom/kubi/assets/options/AssetOptionsFragment;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lta/q2;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v1, "B4optionsAccount"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lcom/kubi/assets/view/AccountInfoHeaderView;->d(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->f()V

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

.method public final d(Lcom/kubi/assets/entity/OptionsOverviewEntity;Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 21
    .param p1    # Lcom/kubi/assets/entity/OptionsOverviewEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/AssetV2OverviewEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "asset"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v2, "--"

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, v0, Lta/q2;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 30
    move-result-object v5

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 34
    move-result-object v6

    .line 35
    .line 36
    .line 37
    invoke-static {v6}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 38
    move-result v6

    .line 39
    .line 40
    .line 41
    invoke-static {v4, v5, v6}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 42
    move-result-object v4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v4, v3

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-static {v4, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 52
    move-result-object v5

    .line 53
    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    .line 61
    invoke-static {v5, v6}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 62
    move-result-wide v7

    .line 63
    .line 64
    const/16 v16, 0x2f

    .line 65
    .line 66
    const/16 v17, 0x0

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x0

    .line 71
    const/4 v13, 0x1

    .line 72
    const/4 v14, 0x0

    .line 73
    const/4 v15, 0x1

    .line 74
    .line 75
    .line 76
    invoke-static/range {v7 .. v17}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 77
    move-result-object v5

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v5, v3

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-static {v5, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    move-result-object v5

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 87
    move-result-object v6

    .line 88
    .line 89
    move-object/from16 v7, p2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v4, v5, v6, v7}, Lcom/kubi/assets/view/AccountInfoHeaderView;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 96
    move-result-object v0

    .line 97
    const/4 v4, 0x3

    .line 98
    const/4 v5, 0x2

    .line 99
    const/4 v6, 0x0

    .line 100
    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    iget-object v0, v0, Lta/q2;->i:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    new-instance v7, Lrs/c$a;

    .line 108
    .line 109
    .line 110
    invoke-direct {v7, v6, v6, v4, v3}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v7, v6, v5, v3}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 120
    move-result-object v7

    .line 121
    .line 122
    if-eqz v7, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 126
    move-result-object v8

    .line 127
    .line 128
    .line 129
    invoke-static {v7, v8, v6, v5, v3}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 130
    move-result-object v7

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    move-object v7, v3

    .line 133
    .line 134
    .line 135
    :goto_2
    invoke-static {v7, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    move-result-object v7

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    iget-object v0, v0, Lta/q2;->h:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 148
    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 153
    move-result-object v7

    .line 154
    .line 155
    if-eqz v7, :cond_5

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/math/BigDecimal;->doubleValue()D

    .line 159
    move-result-wide v7

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 163
    move-result-object v9

    .line 164
    .line 165
    .line 166
    invoke-static {v7, v8, v9}, Lkf/a;->m(DLjava/lang/String;)D

    .line 167
    move-result-wide v10

    .line 168
    .line 169
    const/16 v19, 0x2f

    .line 170
    .line 171
    const/16 v20, 0x0

    .line 172
    const/4 v12, 0x0

    .line 173
    const/4 v13, 0x0

    .line 174
    const/4 v14, 0x0

    .line 175
    const/4 v15, 0x0

    .line 176
    .line 177
    const/16 v16, 0x1

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/16 v18, 0x1

    .line 182
    .line 183
    .line 184
    invoke-static/range {v10 .. v20}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 185
    move-result-object v7

    .line 186
    goto :goto_3

    .line 187
    :cond_5
    move-object v7, v3

    .line 188
    .line 189
    .line 190
    :goto_3
    invoke-static {v7, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    move-result-object v7

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    :cond_6
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 198
    move-result-object v0

    .line 199
    .line 200
    if-eqz v0, :cond_8

    .line 201
    .line 202
    iget-object v0, v0, Lta/q2;->l:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 203
    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    new-instance v7, Lrs/c$a;

    .line 207
    .line 208
    .line 209
    invoke-direct {v7, v6, v6, v4, v3}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v0, v7, v6, v5, v3}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    if-eqz v0, :cond_8

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getAssetBalance()Ljava/math/BigDecimal;

    .line 219
    move-result-object v4

    .line 220
    .line 221
    if-eqz v4, :cond_7

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 225
    move-result-object v7

    .line 226
    .line 227
    .line 228
    invoke-static {v4, v7, v6, v5, v3}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 229
    move-result-object v4

    .line 230
    goto :goto_4

    .line 231
    :cond_7
    move-object v4, v3

    .line 232
    .line 233
    .line 234
    :goto_4
    invoke-static {v4, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    move-result-object v4

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    .line 240
    .line 241
    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 242
    move-result-object v0

    .line 243
    .line 244
    if-eqz v0, :cond_a

    .line 245
    .line 246
    iget-object v0, v0, Lta/q2;->k:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 247
    .line 248
    if-eqz v0, :cond_a

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getAssetBalance()Ljava/math/BigDecimal;

    .line 252
    move-result-object v4

    .line 253
    .line 254
    if-eqz v4, :cond_9

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/math/BigDecimal;->doubleValue()D

    .line 258
    move-result-wide v3

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 262
    move-result-object v1

    .line 263
    .line 264
    .line 265
    invoke-static {v3, v4, v1}, Lkf/a;->m(DLjava/lang/String;)D

    .line 266
    move-result-wide v5

    .line 267
    .line 268
    const/16 v14, 0x2f

    .line 269
    const/4 v15, 0x0

    .line 270
    const/4 v7, 0x0

    .line 271
    const/4 v8, 0x0

    .line 272
    const/4 v9, 0x0

    .line 273
    const/4 v10, 0x0

    .line 274
    const/4 v11, 0x1

    .line 275
    const/4 v12, 0x0

    .line 276
    const/4 v13, 0x1

    .line 277
    .line 278
    .line 279
    invoke-static/range {v5 .. v15}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 280
    move-result-object v3

    .line 281
    .line 282
    .line 283
    :cond_9
    invoke-static {v3, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    move-result-object v1

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 288
    .line 289
    .line 290
    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 291
    move-result-object v0

    .line 292
    .line 293
    if-eqz v0, :cond_b

    .line 294
    .line 295
    iget-object v1, v0, Lta/q2;->c:Landroid/widget/ImageView;

    .line 296
    .line 297
    if-eqz v1, :cond_b

    .line 298
    .line 299
    new-instance v4, Lcom/kubi/assets/options/f;

    .line 300
    .line 301
    .line 302
    invoke-direct {v4}, Lcom/kubi/assets/options/f;-><init>()V

    .line 303
    const/4 v5, 0x1

    .line 304
    const/4 v6, 0x0

    .line 305
    .line 306
    const-wide/16 v2, 0x0

    .line 307
    .line 308
    .line 309
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 310
    :cond_b
    return-void
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
.end method

.method public final f()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lta/q2;->m:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v4, Lcom/kubi/assets/options/g;

    .line 13
    .line 14
    .line 15
    invoke-direct {v4}, Lcom/kubi/assets/options/g;-><init>()V

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
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final getAccountInfoHeader()Lcom/kubi/assets/view/AccountInfoHeaderView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/q2;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

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

.method public final getPnlViewHeader()Lcom/kubi/assets/options/view/OptionsPnlHeaderView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/options/AssetOptionsHeaderView;->getBinding()Lta/q2;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/q2;->n:Lcom/kubi/assets/options/view/OptionsPnlHeaderView;

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
