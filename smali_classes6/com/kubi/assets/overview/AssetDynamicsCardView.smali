.class public final Lcom/kubi/assets/overview/AssetDynamicsCardView;
.super Lcom/kubi/sdk/widget/shape/layout/ShapeConstraintLayout;
.source "AssetDynamicsCardView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/kubi/assets/overview/AssetDynamicsCardView;",
        "Lcom/kubi/sdk/widget/shape/layout/ShapeConstraintLayout;",
        "context",
        "Landroid/content/Context;",
        "attributes",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/kubi/assets/databinding/AssetItemDynamicsCardBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/AssetItemDynamicsCardBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "updateView",
        "",
        "dynamicsEntity",
        "Lcom/kubi/assets/entity/DynamicsEntity;",
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
        "SMAP\nAssetDynamicsCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetDynamicsCardView.kt\ncom/kubi/assets/overview/AssetDynamicsCardView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,74:1\n41#2:75\n65#2:76\n80#2,7:77\n*S KotlinDebug\n*F\n+ 1 AssetDynamicsCardView.kt\ncom/kubi/assets/overview/AssetDynamicsCardView\n*L\n30#1:75\n30#1:76\n30#1:77,7\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic q:[Lkotlin/reflect/KProperty;
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
.field public final p:Lcom/kubi/sdk/viewbindingdelegate/base/a;
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/AssetItemDynamicsCardBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/overview/AssetDynamicsCardView;

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
    sput-object v1, Lcom/kubi/assets/overview/AssetDynamicsCardView;->q:[Lkotlin/reflect/KProperty;

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
    const-string v0, "attributes"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lcom/kubi/sdk/widget/shape/layout/ShapeConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    new-instance v1, Lcom/kubi/assets/overview/AssetDynamicsCardView$special$$inlined$viewBinding$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Lcom/kubi/assets/overview/AssetDynamicsCardView$special$$inlined$viewBinding$1;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p2, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    iput-object v0, p0, Lcom/kubi/assets/overview/AssetDynamicsCardView;->p:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    sget p2, Lcom/kubi/assets/R$layout;->asset_item_dynamics_card:I

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

.method public static synthetic a(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetDynamicsCardView;->i(Landroid/content/DialogInterface;)V

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
.end method

.method public static synthetic b(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetDynamicsCardView;->h(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;

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

.method public static synthetic c(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetDynamicsCardView;->g(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;

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

.method public static synthetic d(Lcom/kubi/assets/entity/DynamicsEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetDynamicsCardView;->f(Lcom/kubi/assets/entity/DynamicsEntity;)Lkotlin/Unit;

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

.method public static final f(Lcom/kubi/assets/entity/DynamicsEntity;)Lkotlin/Unit;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/assets/entity/DynamicsEntity;->getType()Ljava/lang/Integer;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x2

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    new-instance v1, Lcom/kubi/assets/overview/b;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1}, Lcom/kubi/assets/overview/b;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Lny/b;->c(Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    const/16 v6, 0x8

    .line 28
    const/4 v7, 0x0

    .line 29
    .line 30
    const-string v2, "B1overview"

    .line 31
    .line 32
    const-string v3, "holdToEarn"

    .line 33
    .line 34
    const-string v4, "1"

    .line 35
    const/4 v5, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static/range {v2 .. v7}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 39
    goto :goto_5

    .line 40
    .line 41
    :cond_1
    :goto_0
    if-eqz p0, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/assets/entity/DynamicsEntity;->getType()Ljava/lang/Integer;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    goto :goto_1

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 52
    move-result v1

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    new-instance v1, Lcom/kubi/assets/overview/c;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1}, Lcom/kubi/assets/overview/c;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lny/b;->c(Lkotlin/jvm/functions/Function1;)V

    .line 63
    goto :goto_5

    .line 64
    .line 65
    :cond_3
    :goto_1
    if-eqz p0, :cond_4

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kubi/assets/entity/DynamicsEntity;->getUrl()Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    move-object v1, v0

    .line 72
    .line 73
    :goto_2
    if-eqz v1, :cond_7

    .line 74
    .line 75
    .line 76
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 77
    move-result v1

    .line 78
    .line 79
    if-nez v1, :cond_5

    .line 80
    goto :goto_4

    .line 81
    .line 82
    :cond_5
    if-eqz p0, :cond_6

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/kubi/assets/entity/DynamicsEntity;->getUrl()Ljava/lang/String;

    .line 86
    move-result-object v1

    .line 87
    goto :goto_3

    .line 88
    :cond_6
    move-object v1, v0

    .line 89
    .line 90
    .line 91
    :goto_3
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, Lcom/kubi/router/utils/RouteExKt;->H(Ljava/lang/String;)Z

    .line 96
    goto :goto_5

    .line 97
    .line 98
    :cond_7
    :goto_4
    sget-object v2, Lf00/a;->a:Lf00/a;

    .line 99
    .line 100
    const/16 v7, 0xe

    .line 101
    const/4 v8, 0x0

    .line 102
    .line 103
    const-string v3, "finance"

    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    const/4 v6, 0x0

    .line 107
    .line 108
    .line 109
    invoke-static/range {v2 .. v8}, Lg00/f$a;->b(Lg00/f;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 110
    .line 111
    :goto_5
    sget-object v1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 112
    .line 113
    if-eqz p0, :cond_8

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/kubi/assets/entity/DynamicsEntity;->getDynamicsType()Ljava/lang/Integer;

    .line 117
    move-result-object v2

    .line 118
    goto :goto_6

    .line 119
    :cond_8
    move-object v2, v0

    .line 120
    .line 121
    .line 122
    :goto_6
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 123
    move-result v2

    .line 124
    .line 125
    if-eqz p0, :cond_9

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/kubi/assets/entity/DynamicsEntity;->getStyle()Ljava/lang/String;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    :cond_9
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    move-result-object p0

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2, p0}, Lcom/kubi/assets/overview/b1;->f(ILjava/lang/String;)V

    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 139
    return-object p0
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

.method public static final g(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/assets/holdearn/HoldEarnOpenDialog;->y0:Lcom/kubi/assets/holdearn/HoldEarnOpenDialog$Companion;

    .line 8
    .line 9
    const-string v1, "holdToEarn"

    .line 10
    .line 11
    const-string v2, "1"

    .line 12
    .line 13
    const-string v3, "B1overview"

    .line 14
    .line 15
    .line 16
    invoke-static {v3, v1, v2}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/kubi/assets/holdearn/HoldEarnOpenDialog$Companion;->create(Ljava/lang/String;)Lcom/kubi/assets/holdearn/HoldEarnOpenDialog;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    const-string v1, "getSupportFragmentManager(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    const-string v1, "HoldEarnOpenDialog"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method private final getBinding()Lta/b1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetDynamicsCardView;->p:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/overview/AssetDynamicsCardView;->q:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/b1;

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

.method public static final h(Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;->x0:Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$Companion;

    .line 8
    .line 9
    const-string v1, "autoEarn"

    .line 10
    .line 11
    const-string v2, "1"

    .line 12
    .line 13
    const-string v3, "B1overview"

    .line 14
    .line 15
    .line 16
    invoke-static {v3, v1, v2}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v3, v1, v2, v3}, Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$Companion;->create$default(Lcom/kubi/assets/autoearn/AutoEarnOpenDialog$Companion;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/assets/autoearn/AutoEarnOpenDialog;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    new-instance v1, Lcom/kubi/assets/overview/d;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1}, Lcom/kubi/assets/overview/d;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->r3(Landroid/content/DialogInterface$OnDismissListener;)Lcom/kubi/resources/dialog/BaseDialogFragment;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    const-string v1, "getSupportFragmentManager(...)"

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    const-string v1, "AutoEarnOpenDialog"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    return-object p0
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

.method public static final i(Landroid/content/DialogInterface;)V
    .locals 6

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    .line 4
    const-string v0, "AUTO_EARN_STATE_REFRESH"

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 11
    return-void
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
.method public final e(Lcom/kubi/assets/entity/DynamicsEntity;)V
    .locals 7
    .param p1    # Lcom/kubi/assets/entity/DynamicsEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetDynamicsCardView;->getBinding()Lta/b1;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, Lta/b1;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getTypePhrases()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetDynamicsCardView;->getBinding()Lta/b1;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, v0, Lta/b1;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getButtonName()Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v2, v1

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    :cond_3
    if-eqz p1, :cond_5

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getType()Ljava/lang/Integer;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    goto :goto_2

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 64
    move-result v0

    .line 65
    const/4 v2, 0x2

    .line 66
    .line 67
    if-ne v0, v2, :cond_5

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/kubi/user/model/LoginUserEntity;->getType()I

    .line 75
    move-result v0

    .line 76
    const/4 v2, 0x3

    .line 77
    .line 78
    if-ne v0, v2, :cond_5

    .line 79
    const/4 v0, 0x0

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v0}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_2
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetDynamicsCardView;->getBinding()Lta/b1;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    iget-object v0, v0, Lta/b1;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 91
    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    if-eqz p1, :cond_6

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getPhrases()Ljava/lang/String;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    .line 101
    :cond_6
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    :cond_7
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetDynamicsCardView;->getBinding()Lta/b1;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    iget-object v1, v0, Lta/b1;->b:Lcom/kubi/sdk/widget/shape/layout/ShapeConstraintLayout;

    .line 114
    .line 115
    if-eqz v1, :cond_8

    .line 116
    .line 117
    new-instance v4, Lcom/kubi/assets/overview/a;

    .line 118
    .line 119
    .line 120
    invoke-direct {v4, p1}, Lcom/kubi/assets/overview/a;-><init>(Lcom/kubi/assets/entity/DynamicsEntity;)V

    .line 121
    const/4 v5, 0x1

    .line 122
    const/4 v6, 0x0

    .line 123
    .line 124
    const-wide/16 v2, 0x0

    .line 125
    .line 126
    .line 127
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 128
    :cond_8
    return-void
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
