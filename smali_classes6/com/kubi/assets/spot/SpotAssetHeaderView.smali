.class public final Lcom/kubi/assets/spot/SpotAssetHeaderView;
.super Landroid/widget/FrameLayout;
.source "SpotAssetHeaderView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fJ\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0008\u0010\u0019\u001a\u00020\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0008\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0008\u0010\"\u001a\u0004\u0018\u00010#J\u0012\u0010$\u001a\u00020\u00152\u0008\u0010%\u001a\u0004\u0018\u00010&H\u0007R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/kubi/assets/spot/SpotAssetHeaderView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/kubi/assets/databinding/ViewSpotAssetsHeaderBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/ViewSpotAssetsHeaderBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "fragment",
        "Lcom/kubi/assets/spot/AssetV2SpotFragment;",
        "getFragment",
        "()Lcom/kubi/assets/spot/AssetV2SpotFragment;",
        "setFragment",
        "(Lcom/kubi/assets/spot/AssetV2SpotFragment;)V",
        "bindFragment",
        "",
        "assetV2SpotFragment",
        "getAccountInfoHeader",
        "Lcom/kubi/assets/view/AccountInfoHeaderView;",
        "initView",
        "initUnifiedTip",
        "assets",
        "Ljava/math/BigDecimal;",
        "bindInfo2View",
        "asset",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "initListener",
        "onConvertInfoGet",
        "it",
        "Lcom/kubi/assets/spot/AssetV2SpotContract$CovertFromCoin;",
        "bindSpotPnlData",
        "overview",
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
        "SMAP\nSpotAssetHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotAssetHeaderView.kt\ncom/kubi/assets/spot/SpotAssetHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,184:1\n52#2:185\n80#2,7:186\n*S KotlinDebug\n*F\n+ 1 SpotAssetHeaderView.kt\ncom/kubi/assets/spot/SpotAssetHeaderView\n*L\n48#1:185\n48#1:186,7\n*E\n"
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

.field public c:Lcom/kubi/assets/spot/AssetV2SpotFragment;
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/ViewSpotAssetsHeaderBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/spot/SpotAssetHeaderView;

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
    sput-object v1, Lcom/kubi/assets/spot/SpotAssetHeaderView;->d:[Lkotlin/reflect/KProperty;

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
    new-instance v1, Lcom/kubi/assets/spot/SpotAssetHeaderView$special$$inlined$customViewBinding$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Lcom/kubi/assets/spot/SpotAssetHeaderView$special$$inlined$customViewBinding$1;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p2, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/kubi/assets/spot/SpotAssetHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    sget p2, Lcom/kubi/assets/R$layout;->view_spot_assets_header:I

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
    invoke-static {}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->q()Lkotlin/Unit;

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

.method public static synthetic b(Lcom/kubi/assets/spot/SpotAssetHeaderView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->p(Lcom/kubi/assets/spot/SpotAssetHeaderView;)Lkotlin/Unit;

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

.method public static synthetic c()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->l()V

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
.end method

.method public static synthetic d()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->m()Lkotlin/Unit;

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

.method public static synthetic e(Lcom/kubi/assets/spot/i;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->u(Lcom/kubi/assets/spot/i;)Lkotlin/Unit;

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

.method public static synthetic f()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->o()Lkotlin/Unit;

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
    invoke-static {}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->n()Lkotlin/Unit;

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

.method private final getBinding()Lta/h6;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/spot/SpotAssetHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/spot/SpotAssetHeaderView;->d:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/h6;

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

.method public static final l()V
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
    const-wide/16 v2, 0x2

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    const/16 v7, 0x3c

    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v0 .. v8}, Lg00/n$a;->b(Lg00/n;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 25
    return-void
    .line 26
    .line 27
.end method

.method public static final m()Lkotlin/Unit;
    .locals 12

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B5TradeAccount"

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
    const-string v2, "B5TradeAccount"

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
    const/4 v10, 0x3

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static/range {v6 .. v11}, Lcom/kubi/assets/service/AssetsHelper;->N(Lcom/kubi/assets/service/AssetsHelper;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

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

.method public static final n()Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    const-string v0, "after_page_id"

    .line 3
    .line 4
    const-string v1, "B1depositCoinList"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "norm_version"

    .line 11
    .line 12
    const-string v2, "1"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/kubi/assets/dialog/payment/j;->a()Z

    .line 20
    move-result v3

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    const-string v4, "isABNew"

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v3}, [Lkotlin/Pair;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const-string v1, "B5TradeAccount"

    .line 37
    .line 38
    const-string v3, "deposit"

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3, v2, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 42
    .line 43
    sget-object v4, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 44
    const/4 v0, 0x0

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v3, v0, v2, v0}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 49
    move-result-object v5

    .line 50
    const/4 v8, 0x6

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static/range {v4 .. v9}, Lcom/kubi/assets/service/AssetsHelper;->F(Lcom/kubi/assets/service/AssetsHelper;Ljava/lang/String;IZILjava/lang/Object;)V

    .line 57
    .line 58
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    return-object v0
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

.method public static final o()Lkotlin/Unit;
    .locals 5

    .line 1
    .line 2
    const-string v0, "after_page_id"

    .line 3
    .line 4
    const-string v1, "B1depositCoinList"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "norm_version"

    .line 11
    .line 12
    const-string v2, "1"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/kubi/assets/dialog/payment/j;->a()Z

    .line 20
    move-result v3

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    const-string v4, "isABNew"

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v3}, [Lkotlin/Pair;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const-string v1, "B5TradeAccount"

    .line 37
    .line 38
    const-string v3, "withdraw"

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3, v2, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 42
    .line 43
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/kubi/assets/service/AssetsHelper;->O()V

    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    return-object v0
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

.method public static final p(Lcom/kubi/assets/spot/SpotAssetHeaderView;)Lkotlin/Unit;
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
    sget v1, Lcom/kubi/assets/R$string;->kc_asset_pnl_today_title:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/assets/R$string;->kc_assets_spot_pnl_tip:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->J4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sget v1, Lcom/kubi/assets/R$string;->i_already_know:I

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iget-object p0, p0, Lcom/kubi/assets/spot/SpotAssetHeaderView;->c:Lcom/kubi/assets/spot/AssetV2SpotFragment;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    return-object p0
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static final q()Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/assets/z0;->a()Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/kubi/assets/z0;->g()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    sget-object v1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

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

.method public static final u(Lcom/kubi/assets/spot/i;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B5TradeAccount"

    .line 6
    .line 7
    const-string v1, "convert"

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
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/assets/spot/i;->a()Ljava/util/List;

    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0, p0}, Lcom/kubi/assets/service/AssetsHelper;->B(Ljava/util/List;)V

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
.end method


# virtual methods
.method public final getAccountInfoHeader()Lcom/kubi/assets/view/AccountInfoHeaderView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/h6;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

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

.method public final getFragment()Lcom/kubi/assets/spot/AssetV2SpotFragment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/spot/SpotAssetHeaderView;->c:Lcom/kubi/assets/spot/AssetV2SpotFragment;

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

.method public final h(Lcom/kubi/assets/spot/AssetV2SpotFragment;)V
    .locals 2
    .param p1    # Lcom/kubi/assets/spot/AssetV2SpotFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "assetV2SpotFragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/spot/SpotAssetHeaderView;->c:Lcom/kubi/assets/spot/AssetV2SpotFragment;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lta/h6;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v1, "B5TradeAccount"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lcom/kubi/assets/view/AccountInfoHeaderView;->d(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->s()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->k()V

    .line 29
    return-void
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

.method public final i(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 19
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
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "asset"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getSpotAsset()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-direct/range {p0 .. p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-object v2, v2, Lta/h6;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 38
    move-result-object v6

    .line 39
    .line 40
    .line 41
    invoke-static {v6}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 42
    move-result v6

    .line 43
    .line 44
    .line 45
    invoke-static {v4, v5, v6}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 46
    move-result-object v4

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object v4, v3

    .line 49
    .line 50
    :goto_0
    const-string v5, "--"

    .line 51
    .line 52
    .line 53
    invoke-static {v4, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 60
    move-result-object v6

    .line 61
    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 66
    move-result-object v7

    .line 67
    .line 68
    .line 69
    invoke-static {v6, v7}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 70
    move-result-wide v8

    .line 71
    .line 72
    const/16 v17, 0x2f

    .line 73
    .line 74
    const/16 v18, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v14, 0x1

    .line 80
    const/4 v15, 0x0

    .line 81
    .line 82
    const/16 v16, 0x1

    .line 83
    .line 84
    .line 85
    invoke-static/range {v8 .. v18}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 86
    move-result-object v6

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move-object v6, v3

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-static {v6, v5}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v5

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v0, v4, v5}, Lcom/kubi/assets/view/AccountInfoHeaderView;->B(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    :cond_2
    if-eqz v1, :cond_3

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    :cond_3
    move-object/from16 v0, p0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v3}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->r(Ljava/math/BigDecimal;)V

    .line 107
    return-void
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
.end method

.method public final j(Lcom/kubi/assets/entity/SpotAccountOverviewEntity;)V
    .locals 1
    .param p1    # Lcom/kubi/assets/entity/SpotAccountOverviewEntity;
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
    .line 3
    invoke-static {}, Lcom/kubi/assets/z0;->k()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    iget-object p1, p1, Lta/h6;->f:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 20
    return-void

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, Lta/h6;->f:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, v0, Lta/h6;->f:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->g(Lcom/kubi/assets/entity/SpotAccountOverviewEntity;)V

    .line 47
    :cond_2
    return-void
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
.end method

.method public final k()V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lta/h6;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget v4, Lcom/kubi/assets/R$drawable;->ic2_history_20:I

    .line 13
    .line 14
    new-instance v2, Lcom/kubi/assets/spot/n0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2}, Lcom/kubi/assets/spot/n0;-><init>()V

    .line 18
    .line 19
    const/16 v10, 0xba

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v5, 0x0

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
    invoke-static/range {v1 .. v11}, Lcom/kubi/assets/view/AccountInfoHeaderView;->y(Lcom/kubi/assets/view/AccountInfoHeaderView;Lio/reactivex/functions/Action;Ljava/lang/String;IIILio/reactivex/functions/Action;ZZILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v1, v0, Lta/h6;->i:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 38
    .line 39
    const-string v2, "tvTransfer"

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    new-instance v4, Lcom/kubi/assets/spot/o0;

    .line 45
    .line 46
    .line 47
    invoke-direct {v4}, Lcom/kubi/assets/spot/o0;-><init>()V

    .line 48
    const/4 v5, 0x1

    .line 49
    const/4 v6, 0x0

    .line 50
    .line 51
    const-wide/16 v2, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 55
    .line 56
    iget-object v7, v0, Lta/h6;->h:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 57
    .line 58
    const-string v1, "tvDeposit"

    .line 59
    .line 60
    .line 61
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    new-instance v10, Lcom/kubi/assets/spot/p0;

    .line 64
    .line 65
    .line 66
    invoke-direct {v10}, Lcom/kubi/assets/spot/p0;-><init>()V

    .line 67
    const/4 v11, 0x1

    .line 68
    const/4 v12, 0x0

    .line 69
    .line 70
    const-wide/16 v8, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 74
    .line 75
    iget-object v1, v0, Lta/h6;->k:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 76
    .line 77
    const-string v2, "tvWithdraw"

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    new-instance v4, Lcom/kubi/assets/spot/q0;

    .line 83
    .line 84
    .line 85
    invoke-direct {v4}, Lcom/kubi/assets/spot/q0;-><init>()V

    .line 86
    .line 87
    const-wide/16 v2, 0x0

    .line 88
    .line 89
    .line 90
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 91
    .line 92
    iget-object v1, v0, Lta/h6;->f:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 93
    .line 94
    new-instance v2, Lcom/kubi/assets/spot/r0;

    .line 95
    .line 96
    .line 97
    invoke-direct {v2, p0}, Lcom/kubi/assets/spot/r0;-><init>(Lcom/kubi/assets/spot/SpotAssetHeaderView;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->setTitleClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    iget-object v0, v0, Lta/h6;->f:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 103
    .line 104
    new-instance v1, Lcom/kubi/assets/spot/s0;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1}, Lcom/kubi/assets/spot/s0;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lcom/kubi/assets/margin/view/MarginPnlHeaderView;->setPnlClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 111
    :cond_1
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

.method public final r(Ljava/math/BigDecimal;)V
    .locals 7

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 8
    move-result p1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    sget v0, Lcom/kubi/assets/R$string;->alert_unify_spot_trading_no_asset_upgrade:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    :goto_0
    move-object v1, p1

    .line 22
    goto :goto_1

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    sget v0, Lcom/kubi/assets/R$string;->alert_unify_spot_trading_upgrade:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p1, Lta/h6;->j:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    sget-object v0, Lcom/kubi/unify/api/IUnifyAccountService;->a:Lcom/kubi/unify/api/IUnifyAccountService$Companion;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/kubi/unify/api/IUnifyAccountService$Companion;->get()Lcom/kubi/unify/api/IUnifyAccountService;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Lcom/kubi/unify/api/IUnifyAccountService;->C()Z

    .line 56
    move-result v0

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v0}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    iget-object p1, p1, Lta/h6;->g:Landroid/view/View;

    .line 68
    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    sget-object v0, Lcom/kubi/unify/api/IUnifyAccountService;->a:Lcom/kubi/unify/api/IUnifyAccountService$Companion;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/kubi/unify/api/IUnifyAccountService$Companion;->get()Lcom/kubi/unify/api/IUnifyAccountService;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Lcom/kubi/unify/api/IUnifyAccountService;->C()Z

    .line 79
    move-result v0

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v0}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 83
    .line 84
    :cond_2
    new-instance v0, Lcom/kubi/resources/n;

    .line 85
    .line 86
    .line 87
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 88
    move-result-object p1

    .line 89
    const/4 v2, 0x0

    .line 90
    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    iget-object p1, p1, Lta/h6;->j:Lcom/kubi/resources/widget/AlertTipsTextView;

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move-object p1, v2

    .line 96
    .line 97
    .line 98
    :goto_2
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    iget-object v2, v3, Lta/h6;->c:Landroid/widget/ImageView;

    .line 104
    :cond_4
    move-object v3, v2

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    sget v4, Lcom/kubi/assets/R$drawable;->ic2_arrow_down_16:I

    .line 111
    .line 112
    .line 113
    invoke-static {v2, v4}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    move-result-object v2

    .line 119
    .line 120
    sget v4, Lcom/kubi/assets/R$drawable;->ic2_arrow_up_16:I

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v4}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 124
    move-result-object v6

    .line 125
    const/4 v4, 0x1

    .line 126
    move-object v2, p1

    .line 127
    .line 128
    .line 129
    invoke-direct/range {v0 .. v6}, Lcom/kubi/resources/n;-><init>(Ljava/lang/String;Lcom/kubi/resources/widget/AlertTipsTextView;Landroid/widget/ImageView;ILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 130
    return-void
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
.end method

.method public final s()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/h6;->h:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lta/h6;->k:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Lta/h6;->i:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lta/h6;->f:Lcom/kubi/assets/margin/view/MarginPnlHeaderView;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lcom/kubi/assets/z0;->k()Z

    .line 53
    move-result v1

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 57
    :cond_3
    return-void
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

.method public final setFragment(Lcom/kubi/assets/spot/AssetV2SpotFragment;)V
    .locals 0
    .param p1    # Lcom/kubi/assets/spot/AssetV2SpotFragment;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/spot/SpotAssetHeaderView;->c:Lcom/kubi/assets/spot/AssetV2SpotFragment;

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

.method public final t(Lcom/kubi/assets/spot/i;)V
    .locals 7
    .param p1    # Lcom/kubi/assets/spot/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/assets/spot/i;->b()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Lta/h6;->d:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iget-object v1, v0, Lta/h6;->d:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    new-instance v4, Lcom/kubi/assets/spot/m0;

    .line 44
    .line 45
    .line 46
    invoke-direct {v4, p1}, Lcom/kubi/assets/spot/m0;-><init>(Lcom/kubi/assets/spot/i;)V

    .line 47
    const/4 v5, 0x1

    .line 48
    const/4 v6, 0x0

    .line 49
    .line 50
    const-wide/16 v2, 0x0

    .line 51
    .line 52
    .line 53
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 54
    return-void

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-direct {p0}, Lcom/kubi/assets/spot/SpotAssetHeaderView;->getBinding()Lta/h6;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    iget-object p1, p1, Lta/h6;->d:Lcom/kubi/assets/view/VerticalIconTextBtn;

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 68
    :cond_3
    return-void
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
.end method
