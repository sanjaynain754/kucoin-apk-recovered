.class public final Lcom/kubi/assets/options/view/OptionsPnlHeaderView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "OptionsPnlHeaderView.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/kubi/assets/options/view/OptionsPnlHeaderView;",
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
        "bindPnlData",
        "",
        "optionsOverviewEntity",
        "Lcom/kubi/assets/entity/OptionsOverviewEntity;",
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
        "SMAP\nOptionsPnlHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionsPnlHeaderView.kt\ncom/kubi/assets/options/view/OptionsPnlHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,93:1\n52#2:94\n80#2,7:95\n*S KotlinDebug\n*F\n+ 1 OptionsPnlHeaderView.kt\ncom/kubi/assets/options/view/OptionsPnlHeaderView\n*L\n39#1:94\n39#1:95,7\n*E\n"
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
    const-class v3, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;

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
    sput-object v1, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->c:[Lkotlin/reflect/KProperty;

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
        .annotation build Lorg/jetbrains/annotations/Nullable;
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
    .line 8
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/kubi/sdk/viewbindingdelegate/internal/UtilsKt;->b()Lkotlin/jvm/functions/Function1;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;

    .line 15
    .line 16
    new-instance v1, Lcom/kubi/assets/options/view/OptionsPnlHeaderView$special$$inlined$customViewBinding$1;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView$special$$inlined$customViewBinding$1;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p2, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    sget p2, Lcom/kubi/assets/R$layout;->view_margin_pnl_assets_header:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->getBinding()Lta/f6;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p1, Lta/f6;->f:Lcom/kubi/resources/widget/DashTextView;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    sget p2, Lcom/kubi/assets/R$string;->unrealised_pnl:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 52
    :cond_0
    return-void
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

.method private final getBinding()Lta/f6;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->b:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->c:[Lkotlin/reflect/KProperty;

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


# virtual methods
.method public final a(Lcom/kubi/assets/entity/OptionsOverviewEntity;)V
    .locals 8
    .param p1    # Lcom/kubi/assets/entity/OptionsOverviewEntity;
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
    if-eqz p1, :cond_d

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/kubi/assets/service/a;->j()Lcom/kubi/user/api/IUserService;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, Lcom/kubi/user/api/IUserService;->d0()Lcom/kubi/user/model/LoginUserEntity;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/kubi/user/model/LoginUserEntity;->getBalanceCurrency()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->getBinding()Lta/f6;

    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x0

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, v0, Lta/f6;->f:Lcom/kubi/resources/widget/DashTextView;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-direct {p0}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->getBinding()Lta/f6;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, v0, Lta/f6;->b:Landroid/widget/ImageView;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    const/16 v2, 0x8

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getUnrealizedProfitAndLossAmount()Ljava/math/BigDecimal;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 68
    move-result-wide v2

    .line 69
    .line 70
    const-wide/16 v4, 0x0

    .line 71
    .line 72
    cmpg-double v0, v2, v4

    .line 73
    const/4 v2, 0x1

    .line 74
    .line 75
    if-nez v0, :cond_3

    .line 76
    move v0, v2

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move v0, v1

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getUnrealizedProfitAndLossRate()Ljava/math/BigDecimal;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    .line 85
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 86
    move-result-wide v6

    .line 87
    .line 88
    cmpl-double v3, v6, v4

    .line 89
    .line 90
    if-lez v3, :cond_4

    .line 91
    move v1, v2

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getUnrealizedProfitAndLossAmount()Ljava/math/BigDecimal;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 99
    move-result-wide v2

    .line 100
    .line 101
    cmpl-double v2, v2, v4

    .line 102
    .line 103
    const-string v3, ""

    .line 104
    .line 105
    const-string v4, "+"

    .line 106
    .line 107
    if-lez v2, :cond_5

    .line 108
    move-object v2, v4

    .line 109
    goto :goto_1

    .line 110
    :cond_5
    move-object v2, v3

    .line 111
    .line 112
    :goto_1
    if-eqz v1, :cond_6

    .line 113
    move-object v3, v4

    .line 114
    .line 115
    .line 116
    :cond_6
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getUnrealizedProfitAndLossAmount()Ljava/math/BigDecimal;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 123
    move-result-object v4

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getCurrency()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    .line 130
    invoke-static {v5}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 131
    move-result v5

    .line 132
    .line 133
    .line 134
    invoke-static {v1, v4, v5}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 135
    move-result-object v1

    .line 136
    goto :goto_2

    .line 137
    :cond_7
    const/4 v1, 0x0

    .line 138
    .line 139
    :goto_2
    const-string v4, "--"

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    .line 146
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 147
    move-result-object v4

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getUnrealizedProfitAndLossRate()Ljava/math/BigDecimal;

    .line 151
    move-result-object v5

    .line 152
    .line 153
    .line 154
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->b(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 155
    move-result-object v5

    .line 156
    .line 157
    .line 158
    invoke-static {v5}, Lnf/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    move-result-object v5

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v5}, Landroid/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    move-result-object v4

    .line 164
    .line 165
    if-eqz v0, :cond_8

    .line 166
    .line 167
    .line 168
    invoke-direct {p0}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->getBinding()Lta/f6;

    .line 169
    move-result-object v2

    .line 170
    .line 171
    if-eqz v2, :cond_9

    .line 172
    .line 173
    iget-object v2, v2, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 174
    .line 175
    if-eqz v2, :cond_9

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    goto :goto_3

    .line 180
    .line 181
    .line 182
    :cond_8
    invoke-direct {p0}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->getBinding()Lta/f6;

    .line 183
    move-result-object v5

    .line 184
    .line 185
    if-eqz v5, :cond_9

    .line 186
    .line 187
    iget-object v5, v5, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 188
    .line 189
    if-eqz v5, :cond_9

    .line 190
    .line 191
    new-instance v6, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    const/16 v1, 0x28

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const/16 v1, 0x29

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    move-result-object v1

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    :cond_9
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    move-result-object v1

    .line 228
    .line 229
    const-string v2, "getContext(...)"

    .line 230
    .line 231
    .line 232
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OptionsOverviewEntity;->getUnrealizedProfitAndLossRate()Ljava/math/BigDecimal;

    .line 236
    move-result-object p1

    .line 237
    .line 238
    .line 239
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 240
    move-result-wide v2

    .line 241
    .line 242
    sget p1, Lcom/kubi/assets/R$color;->c_text:I

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v2, v3, p1}, Lcom/kubi/resources/g;->c(Landroid/content/Context;DI)I

    .line 246
    move-result p1

    .line 247
    .line 248
    .line 249
    invoke-direct {p0}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->getBinding()Lta/f6;

    .line 250
    move-result-object v1

    .line 251
    .line 252
    if-eqz v1, :cond_a

    .line 253
    .line 254
    iget-object v1, v1, Lta/f6;->e:Lcom/kubi/resources/widget/ShowHideTextView;

    .line 255
    .line 256
    if-eqz v1, :cond_a

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 260
    .line 261
    :cond_a
    if-eqz v0, :cond_b

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 265
    move-result-object p1

    .line 266
    .line 267
    sget v0, Lcom/kubi/assets/R$color;->c_icon60:I

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 271
    move-result p1

    .line 272
    .line 273
    .line 274
    :cond_b
    invoke-direct {p0}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->getBinding()Lta/f6;

    .line 275
    move-result-object v0

    .line 276
    .line 277
    if-eqz v0, :cond_c

    .line 278
    .line 279
    iget-object v0, v0, Lta/f6;->b:Landroid/widget/ImageView;

    .line 280
    .line 281
    if-eqz v0, :cond_c

    .line 282
    .line 283
    .line 284
    invoke-static {v0, p1}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 285
    .line 286
    .line 287
    :cond_c
    invoke-direct {p0}, Lcom/kubi/assets/options/view/OptionsPnlHeaderView;->getBinding()Lta/f6;

    .line 288
    move-result-object v0

    .line 289
    .line 290
    if-eqz v0, :cond_d

    .line 291
    .line 292
    iget-object v0, v0, Lta/f6;->b:Landroid/widget/ImageView;

    .line 293
    .line 294
    if-eqz v0, :cond_d

    .line 295
    .line 296
    const/16 v1, 0x14

    .line 297
    .line 298
    .line 299
    invoke-static {p1, v1}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 300
    move-result p1

    .line 301
    .line 302
    const/high16 v1, 0x40800000    # 4.0f

    .line 303
    .line 304
    .line 305
    invoke-static {p1, v1}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 306
    move-result-object p1

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 310
    :cond_d
    :goto_4
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
