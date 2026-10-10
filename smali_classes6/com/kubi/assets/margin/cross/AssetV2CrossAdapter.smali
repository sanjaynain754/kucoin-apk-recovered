.class public final Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "AssetV2CrossAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/margin/api/entity/FundsInfo;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/margin/api/entity/FundsInfo;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "fragment",
        "Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;",
        "<init>",
        "(Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;)V",
        "getFragment",
        "()Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;",
        "hideNumber",
        "",
        "getHideNumber",
        "()Z",
        "setHideNumber",
        "(Z)V",
        "convert",
        "",
        "helper",
        "entity",
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


# instance fields
.field public final i:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Z


# direct methods
.method public constructor <init>(Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;)V
    .locals 1
    .param p1    # Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fragment"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget v0, Lcom/kubi/assets/R$layout;->item_asset_cross_account:I

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->i:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 13
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
.end method

.method public static synthetic g(Lcom/kubi/margin/api/entity/FundsInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->i(Lcom/kubi/margin/api/entity/FundsInfo;)Lkotlin/Unit;

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

.method public static final i(Lcom/kubi/margin/api/entity/FundsInfo;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/margin/api/entity/FundsInfo;->getCurrency()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-wide/16 v2, 0x3

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    const/16 v6, 0x1c

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v7}, Lg00/a$a;->d(Lg00/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p0
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
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/margin/api/entity/FundsInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/api/entity/FundsInfo;)V

    .line 6
    return-void
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

.method public h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/margin/api/entity/FundsInfo;)V
    .locals 20
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/margin/api/entity/FundsInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    const-string v3, "helper"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v3, "entity"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getTotalBalance()Ljava/math/BigDecimal;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 24
    move-result-wide v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getLiability()Ljava/math/BigDecimal;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    .line 31
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 32
    move-result-wide v5

    .line 33
    add-double/2addr v3, v5

    .line 34
    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    cmpg-double v3, v3, v5

    .line 38
    const/4 v4, 0x0

    .line 39
    .line 40
    if-nez v3, :cond_0

    .line 41
    const/4 v3, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v3, v4

    .line 44
    .line 45
    :goto_0
    sget v5, Lcom/kubi/assets/R$id;->tv_all_price:I

    .line 46
    .line 47
    xor-int/lit8 v6, v3, 0x1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 51
    .line 52
    sget v6, Lcom/kubi/assets/R$id;->tv_useful_price:I

    .line 53
    .line 54
    xor-int/lit8 v7, v3, 0x1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 58
    .line 59
    sget v7, Lcom/kubi/assets/R$id;->tv_debt_price:I

    .line 60
    .line 61
    xor-int/lit8 v8, v3, 0x1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 65
    .line 66
    sget v8, Lcom/kubi/assets/R$id;->tv_all_amount:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 70
    move-result-object v9

    .line 71
    .line 72
    const-string v10, "getView(...)"

    .line 73
    .line 74
    .line 75
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    check-cast v9, Landroid/widget/TextView;

    .line 78
    .line 79
    new-instance v11, Lrs/c$a;

    .line 80
    const/4 v12, 0x3

    .line 81
    const/4 v13, 0x0

    .line 82
    .line 83
    .line 84
    invoke-direct {v11, v4, v4, v12, v13}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 85
    const/4 v14, 0x2

    .line 86
    .line 87
    .line 88
    invoke-static {v9, v11, v4, v14, v13}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 89
    .line 90
    sget v9, Lcom/kubi/assets/R$id;->tv_useful_amount:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 94
    move-result-object v11

    .line 95
    .line 96
    .line 97
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    check-cast v11, Landroid/widget/TextView;

    .line 100
    .line 101
    new-instance v15, Lrs/c$a;

    .line 102
    .line 103
    .line 104
    invoke-direct {v15, v4, v4, v12, v13}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v11, v15, v4, v14, v13}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 108
    .line 109
    sget v11, Lcom/kubi/assets/R$id;->tv_debt_amount:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 113
    move-result-object v15

    .line 114
    .line 115
    .line 116
    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    check-cast v15, Landroid/widget/TextView;

    .line 119
    .line 120
    new-instance v10, Lrs/c$a;

    .line 121
    .line 122
    .line 123
    invoke-direct {v10, v4, v4, v12, v13}, Lrs/c$a;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v15, v10, v4, v14, v13}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 127
    .line 128
    if-eqz v3, :cond_1

    .line 129
    .line 130
    iget-object v3, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->i:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 131
    .line 132
    sget v4, Lcom/kubi/assets/R$color;->c_text40:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 136
    move-result v3

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v8, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 140
    .line 141
    iget-object v3, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->i:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 145
    move-result v3

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v9, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 149
    .line 150
    iget-object v3, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->i:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 154
    move-result v3

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v11, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 158
    goto :goto_1

    .line 159
    .line 160
    :cond_1
    iget-object v3, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->i:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 161
    .line 162
    sget v4, Lcom/kubi/assets/R$color;->c_text:I

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 166
    move-result v3

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v8, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 170
    .line 171
    iget-object v3, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->i:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 175
    move-result v3

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v9, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 179
    .line 180
    iget-object v3, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->i:Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 184
    move-result v3

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v11, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 188
    .line 189
    :goto_1
    sget v3, Lcom/kubi/assets/R$id;->tv_coin_name:I

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getCurrencyName()Ljava/lang/String;

    .line 193
    move-result-object v4

    .line 194
    .line 195
    .line 196
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    move-result-object v4

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 201
    move-result-object v3

    .line 202
    .line 203
    sget v4, Lcom/kubi/assets/R$id;->tv_all_label:I

    .line 204
    .line 205
    sget v10, Lcom/kubi/assets/R$string;->total_assets:I

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v4, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 209
    move-result-object v3

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getTotalBalanceStr()Ljava/lang/String;

    .line 213
    move-result-object v4

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v8, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 217
    move-result-object v3

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getTotalBalancePriceStr()Ljava/lang/String;

    .line 221
    move-result-object v4

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3, v5, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 225
    move-result-object v3

    .line 226
    .line 227
    sget v4, Lcom/kubi/assets/R$id;->tv_useful_label:I

    .line 228
    .line 229
    sget v5, Lcom/kubi/assets/R$string;->useful:I

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 233
    move-result-object v3

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getAvailableBalanceStr()Ljava/lang/String;

    .line 237
    move-result-object v4

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3, v9, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 241
    move-result-object v3

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getAvailableBalancePriceStr()Ljava/lang/String;

    .line 245
    move-result-object v4

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v6, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 249
    move-result-object v3

    .line 250
    .line 251
    sget v4, Lcom/kubi/assets/R$id;->tv_debt_label:I

    .line 252
    .line 253
    sget v5, Lcom/kubi/assets/R$string;->debt:I

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 257
    move-result-object v3

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getLiabilityStr()Ljava/lang/String;

    .line 261
    move-result-object v4

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v11, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 265
    move-result-object v3

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getLiabilityPriceStr()Ljava/lang/String;

    .line 269
    move-result-object v4

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3, v7, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 273
    .line 274
    iget-object v14, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 275
    .line 276
    const-string v3, "itemView"

    .line 277
    .line 278
    .line 279
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    new-instance v3, Lcom/kubi/assets/margin/cross/a;

    .line 282
    .line 283
    .line 284
    invoke-direct {v3, v2}, Lcom/kubi/assets/margin/cross/a;-><init>(Lcom/kubi/margin/api/entity/FundsInfo;)V

    .line 285
    .line 286
    const/16 v18, 0x1

    .line 287
    .line 288
    const/16 v19, 0x0

    .line 289
    .line 290
    const-wide/16 v15, 0x0

    .line 291
    .line 292
    move-object/from16 v17, v3

    .line 293
    .line 294
    .line 295
    invoke-static/range {v14 .. v19}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 296
    .line 297
    sget-object v3, Lgf/n;->a:Lgf/n;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Lcom/kubi/margin/api/entity/FundsInfo;->getCurrency()Ljava/lang/String;

    .line 301
    move-result-object v2

    .line 302
    .line 303
    .line 304
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 305
    move-result-object v2

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3, v2}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 309
    move-result-object v2

    .line 310
    .line 311
    sget v3, Lcom/kubi/assets/R$id;->iv_icon:I

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 315
    move-result-object v3

    .line 316
    .line 317
    check-cast v3, Landroid/widget/ImageView;

    .line 318
    .line 319
    if-eqz v2, :cond_2

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 323
    move-result-object v13

    .line 324
    .line 325
    .line 326
    :cond_2
    invoke-static {v13}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 327
    move-result-object v2

    .line 328
    .line 329
    .line 330
    invoke-static {v3, v2}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 331
    .line 332
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 333
    .line 334
    iget-boolean v2, v0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->j:Z

    .line 335
    .line 336
    .line 337
    invoke-static {v1, v2}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 338
    return-void
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

.method public final j(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;->j:Z

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
