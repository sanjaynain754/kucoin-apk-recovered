.class public Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "FinanceCoinChildAdapter.kt"

# interfaces
.implements Lcom/kubi/assets/finance/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/assets/entity/ProductChildEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;",
        "Lcom/kubi/assets/finance/b0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B!\u0012\u0010\u0010\u0005\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u000f\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00032\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/assets/entity/ProductChildEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "Lcom/kubi/assets/finance/FinanceSettable;",
        "data",
        "",
        "hideSubNumber",
        "",
        "<init>",
        "(Ljava/util/List;Z)V",
        "convert",
        "",
        "helper",
        "item",
        "isShowEndDate",
        "getIncomeAmountColor",
        "",
        "getReturnStr",
        "",
        "bindCommonFields",
        "bindRevenueName",
        "itemClick",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinanceCoinChildAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceCoinChildAdapter.kt\ncom/kubi/assets/finance/coin/FinanceCoinChildAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1869#2,2:212\n*S KotlinDebug\n*F\n+ 1 FinanceCoinChildAdapter.kt\ncom/kubi/assets/finance/coin/FinanceCoinChildAdapter\n*L\n38#1:212,2\n*E\n"
    }
.end annotation


# instance fields
.field public i:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Z)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/ProductChildEntity;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    iput-boolean p2, p0, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->i:Z

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/assets/finance/ProductType;->getEntries()Lkotlin/enums/EnumEntries;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result p2

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    check-cast p2, Lcom/kubi/assets/finance/ProductType;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/kubi/assets/finance/ProductType;->getLayoutResId()I

    .line 29
    move-result v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/kubi/assets/finance/ProductType;->getLayoutResId()I

    .line 33
    move-result p2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
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

.method public static synthetic g(Lcom/kubi/assets/entity/ProductChildEntity;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->p(Lcom/kubi/assets/entity/ProductChildEntity;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;

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
.end method

.method public static synthetic h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->q(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)Lkotlin/Unit;

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
.end method

.method private final i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V
    .locals 8

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$id;->tvName:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getCategoryText()Ljava/lang/String;

    .line 9
    move-result-object v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, v1

    .line 12
    .line 13
    :goto_0
    const-string v3, "--"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sget v2, Lcom/kubi/assets/R$id;->tvAmount:I

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getLockAmountWithCurrencyStr()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object v3, v1

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-virtual {v0, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 35
    .line 36
    const-wide/16 v2, 0x0

    .line 37
    const/4 v0, 0x1

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getPersonalLockPeriod()Ljava/lang/String;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-static {v4, v2, v3, v0, v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->h(Ljava/lang/String;DILjava/lang/Object;)D

    .line 49
    move-result-wide v4

    .line 50
    .line 51
    .line 52
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 53
    move-result-object v4

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v4, v1

    .line 56
    :goto_2
    const/4 v5, 0x0

    .line 57
    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    sget v2, Lcom/kubi/assets/R$id;->tvLabel:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 64
    goto :goto_3

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 68
    move-result-wide v6

    .line 69
    .line 70
    cmpl-double v6, v6, v2

    .line 71
    .line 72
    if-lez v6, :cond_4

    .line 73
    .line 74
    sget v2, Lcom/kubi/assets/R$id;->tvLabel:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 78
    .line 79
    new-instance v3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getPersonalLockPeriod()Ljava/lang/String;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const/16 v4, 0x44

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    move-result-object v3

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 102
    goto :goto_3

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-static {v4, v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Double;D)Z

    .line 106
    move-result v2

    .line 107
    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    sget v2, Lcom/kubi/assets/R$id;->tvLabel:I

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 114
    .line 115
    sget v3, Lcom/kubi/assets/R$string;->soft_staking:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 119
    goto :goto_3

    .line 120
    .line 121
    :cond_5
    sget v2, Lcom/kubi/assets/R$id;->tvLabel:I

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v2, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 125
    .line 126
    :goto_3
    if-eqz p2, :cond_6

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getManualRedeemLocked()Z

    .line 130
    move-result v2

    .line 131
    .line 132
    if-ne v2, v0, :cond_6

    .line 133
    .line 134
    sget v1, Lcom/kubi/assets/R$id;->tvStatusLabel:I

    .line 135
    .line 136
    sget v2, Lcom/kubi/assets/R$string;->kc_asset_staking_lock:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setVisible(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 144
    goto :goto_4

    .line 145
    .line 146
    :cond_6
    if-eqz p2, :cond_7

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getStatus()Ljava/lang/String;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    :cond_7
    const-string v2, "SETTLING"

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    move-result v1

    .line 157
    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    sget v1, Lcom/kubi/assets/R$id;->tvStatusLabel:I

    .line 161
    .line 162
    sget v2, Lcom/kubi/assets/R$string;->kc_earn_setting_state:I

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 166
    move-result-object v2

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setVisible(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 170
    goto :goto_4

    .line 171
    .line 172
    :cond_8
    sget v0, Lcom/kubi/assets/R$id;->tvStatusLabel:I

    .line 173
    .line 174
    const-string v1, " "

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v0, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setVisible(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 182
    .line 183
    .line 184
    :goto_4
    invoke-direct {p0, p1, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V

    .line 185
    return-void
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
.end method

.method private final j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V
    .locals 4

    .line 1
    .line 2
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 3
    .line 4
    sget v0, Lcom/kubi/assets/R$id;->tvRevenueName:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Landroid/widget/TextView;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sget v1, Lcom/kubi/assets/R$string;->earn_total_profit:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    const-string v1, "getString(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getIncomeCurrencyCount()Ljava/lang/Integer;

    .line 37
    move-result-object v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v2, v1

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x1

    .line 45
    .line 46
    if-le v2, v3, :cond_3

    .line 47
    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const/16 v0, 0x28

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getIncomeCurrencyCount()Ljava/lang/Integer;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const/16 p2, 0x29

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    return-void
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

.method private final l(Lcom/kubi/assets/entity/ProductChildEntity;)I
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->getIncomeAmountColor()I

    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    .line 9
    :cond_0
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 10
    .line 11
    sget v0, Lcom/kubi/assets/R$color;->c_text:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/kubi/utils/c;->a(I)I

    .line 15
    move-result p1

    .line 16
    return p1
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

.method private final m(Lcom/kubi/assets/entity/ProductChildEntity;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->getCategory()Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    :goto_0
    const-string v2, "SHARKFIN"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->getMinReturnStr()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const/16 v1, 0x2d

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->getMaxReturnStr()Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    .line 48
    :cond_1
    if-eqz p1, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->getTotalReturnStr()Ljava/lang/String;

    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_2
    return-object v0
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

.method private final n(Lcom/kubi/assets/entity/ProductChildEntity;)Z
    .locals 0

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->isShowEndDate()Z

    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
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

.method private final o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 3
    .line 4
    const-string v1, "itemView"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v3, Lcom/kubi/assets/finance/coin/b;

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p2, p1}, Lcom/kubi/assets/finance/coin/b;-><init>(Lcom/kubi/assets/entity/ProductChildEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 20
    return-void
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

.method public static final p(Lcom/kubi/assets/entity/ProductChildEntity;Lio/chad/library/adapter/base/BaseViewHolder;)Lkotlin/Unit;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/assets/entity/ProductChildEntity;->getStatus()Ljava/lang/String;

    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    .line 11
    :goto_0
    const-string v2, "PENDING"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    sget p0, Lcom/kubi/assets/R$string;->earn_purchaseing:I

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    return-object p0

    .line 26
    .line 27
    :cond_1
    if-eqz p0, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/assets/entity/ProductChildEntity;->getCategory()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object v1, v0

    .line 34
    .line 35
    :goto_1
    const-string v2, "LOAN_PLEDGE"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    new-instance v0, Lcom/kubi/assets/finance/coin/c;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, p1, p0}, Lcom/kubi/assets/finance/coin/c;-><init>(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v0}, Lcom/kubi/assets/finance/FinanceSettableKt;->a(Lcom/kubi/assets/entity/ProductChildEntity;Lkotlin/jvm/functions/Function0;)V

    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    return-object p0

    .line 53
    .line 54
    :cond_3
    if-eqz p0, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/kubi/assets/entity/ProductChildEntity;->getJumpUrl()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    :cond_4
    if-eqz v0, :cond_7

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 64
    move-result v0

    .line 65
    .line 66
    if-nez v0, :cond_5

    .line 67
    goto :goto_3

    .line 68
    .line 69
    .line 70
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/assets/entity/ProductChildEntity;->getJumpType()Ljava/lang/String;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    const-string v1, "H5"

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    move-result v0

    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    sget-object v2, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Lcom/kubi/host/HostManager;->m()Ljava/lang/String;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/kubi/assets/entity/ProductChildEntity;->getJumpUrl()Ljava/lang/String;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    .line 102
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    move-result-object v2

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    const-wide/16 v3, 0x2

    .line 113
    .line 114
    .line 115
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    move-result-object v4

    .line 117
    .line 118
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 119
    .line 120
    const/16 v9, 0x72

    .line 121
    const/4 v10, 0x0

    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v6, 0x0

    .line 124
    const/4 v7, 0x0

    .line 125
    const/4 v8, 0x0

    .line 126
    .line 127
    .line 128
    invoke-static/range {v1 .. v10}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 129
    goto :goto_2

    .line 130
    .line 131
    :cond_6
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/kubi/assets/entity/ProductChildEntity;->getJumpUrl()Ljava/lang/String;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    .line 138
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Lay/a;->k()Z

    .line 147
    .line 148
    :goto_2
    sget-object v0, Lcom/kubi/assets/finance/b;->a:Lcom/kubi/assets/finance/b;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 152
    move-result p1

    .line 153
    .line 154
    add-int/lit8 p1, p1, 0x1

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/kubi/assets/entity/ProductChildEntity;->getCurrency()Ljava/lang/String;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    .line 165
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/kubi/assets/entity/ProductChildEntity;->getCategory()Ljava/lang/String;

    .line 170
    move-result-object p0

    .line 171
    .line 172
    .line 173
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    move-result-object p0

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, p1, v1, p0}, Lcom/kubi/assets/finance/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 180
    return-object p0

    .line 181
    .line 182
    :cond_7
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 183
    return-object p0
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

.method public static final q(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/finance/b;->a:Lcom/kubi/assets/finance/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 6
    move-result p0

    .line 7
    .line 8
    add-int/lit8 p0, p0, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->getCurrency()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/assets/entity/ProductChildEntity;->getCategory()Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0, v1, p1}, Lcom/kubi/assets/finance/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    return-object p0
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


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/ProductChildEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V

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

.method public k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V
    .locals 5
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/ProductChildEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/assets/finance/ProductType;->Companion:Lcom/kubi/assets/finance/ProductType$Companion;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getCategory()Ljava/lang/String;

    .line 14
    move-result-object v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v2, v1

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, v2}, Lcom/kubi/assets/finance/ProductType$Companion;->fromCategory(Ljava/lang/String;)Lcom/kubi/assets/finance/ProductType;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V

    .line 27
    .line 28
    sget-object v2, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter$a;->$EnumSwitchMapping$0:[I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 32
    move-result v0

    .line 33
    .line 34
    aget v0, v2, v0

    .line 35
    .line 36
    .line 37
    packed-switch v0, :pswitch_data_0

    .line 38
    .line 39
    sget v0, Lcom/kubi/assets/R$id;->tvAnnualized:I

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->m(Lcom/kubi/assets/entity/ProductChildEntity;)Ljava/lang/String;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    sget v2, Lcom/kubi/assets/R$id;->tvEndDate:I

    .line 50
    .line 51
    if-eqz p2, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getLockEndTimeStr()Ljava/lang/String;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {v0, v2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 59
    .line 60
    goto/16 :goto_a

    .line 61
    .line 62
    :pswitch_0
    sget p2, Lcom/kubi/assets/R$id;->tvAnnualizedName:I

    .line 63
    const/4 v0, 0x0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    sget v1, Lcom/kubi/assets/R$id;->tvAnnualized:I

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    sget v1, Lcom/kubi/assets/R$id;->tvRevenueName:I

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 79
    move-result-object p2

    .line 80
    .line 81
    sget v1, Lcom/kubi/assets/R$id;->tvRevenue:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 85
    .line 86
    goto/16 :goto_a

    .line 87
    .line 88
    :pswitch_1
    sget v0, Lcom/kubi/assets/R$id;->tvTargetBuyPrice:I

    .line 89
    .line 90
    if-eqz p2, :cond_2

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getTargetPriceStr()Ljava/lang/String;

    .line 94
    move-result-object v2

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    move-object v2, v1

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 100
    .line 101
    sget v0, Lcom/kubi/assets/R$id;->tvKoPrice:I

    .line 102
    .line 103
    if-eqz p2, :cond_3

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getKoPriceStr()Ljava/lang/String;

    .line 107
    move-result-object v2

    .line 108
    goto :goto_2

    .line 109
    :cond_3
    move-object v2, v1

    .line 110
    .line 111
    .line 112
    :goto_2
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 113
    .line 114
    sget v0, Lcom/kubi/assets/R$id;->tvEndDate:I

    .line 115
    .line 116
    if-eqz p2, :cond_4

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getLockEndTimeStr()Ljava/lang/String;

    .line 120
    move-result-object v2

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    move-object v2, v1

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 126
    .line 127
    sget v0, Lcom/kubi/assets/R$id;->tvKoApr:I

    .line 128
    .line 129
    if-eqz p2, :cond_5

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getTotalReturnStr()Ljava/lang/String;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    .line 136
    :cond_5
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 137
    .line 138
    sget-object p2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 139
    .line 140
    sget v1, Lcom/kubi/assets/R$color;->brandGreen:I

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v1}, Lcom/kubi/utils/c;->a(I)I

    .line 144
    move-result p2

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 148
    .line 149
    goto/16 :goto_a

    .line 150
    .line 151
    :pswitch_2
    sget v0, Lcom/kubi/assets/R$id;->tvLeverage:I

    .line 152
    .line 153
    if-eqz p2, :cond_6

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getLeverage()Ljava/math/BigDecimal;

    .line 157
    move-result-object v2

    .line 158
    .line 159
    if-eqz v2, :cond_6

    .line 160
    .line 161
    .line 162
    invoke-static {v2}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 163
    move-result-object v2

    .line 164
    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 169
    move-result-object v2

    .line 170
    .line 171
    if-eqz v2, :cond_6

    .line 172
    .line 173
    new-instance v3, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const/16 v2, 0x78

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    move-result-object v2

    .line 189
    goto :goto_4

    .line 190
    :cond_6
    move-object v2, v1

    .line 191
    .line 192
    :goto_4
    const-string v3, "--"

    .line 193
    .line 194
    .line 195
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    move-result-object v2

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 200
    move-result-object v0

    .line 201
    .line 202
    sget v2, Lcom/kubi/assets/R$id;->tvEndDate:I

    .line 203
    .line 204
    if-eqz p2, :cond_7

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getLockEndTimeStr()Ljava/lang/String;

    .line 208
    move-result-object v1

    .line 209
    .line 210
    .line 211
    :cond_7
    invoke-virtual {v0, v2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 212
    .line 213
    goto/16 :goto_a

    .line 214
    .line 215
    :pswitch_3
    sget v0, Lcom/kubi/assets/R$id;->tvEndDate:I

    .line 216
    .line 217
    if-eqz p2, :cond_8

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getLockEndTimeStr()Ljava/lang/String;

    .line 221
    move-result-object v1

    .line 222
    .line 223
    .line 224
    :cond_8
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 225
    .line 226
    goto/16 :goto_a

    .line 227
    .line 228
    .line 229
    :pswitch_4
    invoke-direct {p0, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->n(Lcom/kubi/assets/entity/ProductChildEntity;)Z

    .line 230
    move-result v0

    .line 231
    .line 232
    sget v2, Lcom/kubi/assets/R$id;->tvAnnualized:I

    .line 233
    .line 234
    if-eqz p2, :cond_9

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getTotalReturnStr()Ljava/lang/String;

    .line 238
    move-result-object v3

    .line 239
    goto :goto_5

    .line 240
    :cond_9
    move-object v3, v1

    .line 241
    .line 242
    .line 243
    :goto_5
    invoke-virtual {p1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 244
    move-result-object v2

    .line 245
    .line 246
    sget v3, Lcom/kubi/assets/R$id;->tvEndDate:I

    .line 247
    .line 248
    if-eqz p2, :cond_a

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getLockEndTimeStr()Ljava/lang/String;

    .line 252
    move-result-object v4

    .line 253
    goto :goto_6

    .line 254
    :cond_a
    move-object v4, v1

    .line 255
    .line 256
    .line 257
    :goto_6
    invoke-virtual {v2, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 258
    move-result-object v2

    .line 259
    .line 260
    sget v4, Lcom/kubi/assets/R$id;->tvRevenue:I

    .line 261
    .line 262
    if-eqz p2, :cond_b

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getIncomeSumStr()Ljava/lang/String;

    .line 266
    move-result-object v1

    .line 267
    .line 268
    .line 269
    :cond_b
    invoke-virtual {v2, v4, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 270
    move-result-object v1

    .line 271
    .line 272
    .line 273
    invoke-direct {p0, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->l(Lcom/kubi/assets/entity/ProductChildEntity;)I

    .line 274
    move-result v2

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v4, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 278
    move-result-object v1

    .line 279
    .line 280
    sget v2, Lcom/kubi/assets/R$id;->tvEndDateName:I

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 284
    move-result-object v1

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v3, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 288
    .line 289
    .line 290
    invoke-interface {p0, p2, p1}, Lcom/kubi/assets/finance/b0;->d(Lcom/kubi/assets/entity/ProductChildEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 291
    .line 292
    sget-object v0, Lcom/kubi/assets/finance/FinanceAutoRenewBinder;->a:Lcom/kubi/assets/finance/FinanceAutoRenewBinder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, p1, p2}, Lcom/kubi/assets/finance/FinanceAutoRenewBinder;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, p1, p2}, Lcom/kubi/assets/finance/FinanceAutoRenewBinder;->f(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ProductChildEntity;)V

    .line 299
    .line 300
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 301
    goto :goto_a

    .line 302
    .line 303
    :pswitch_5
    sget v0, Lcom/kubi/assets/R$id;->tvAnnualized:I

    .line 304
    .line 305
    if-eqz p2, :cond_c

    .line 306
    .line 307
    .line 308
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getTotalReturnStr()Ljava/lang/String;

    .line 309
    move-result-object v2

    .line 310
    goto :goto_7

    .line 311
    :cond_c
    move-object v2, v1

    .line 312
    .line 313
    .line 314
    :goto_7
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 315
    move-result-object v0

    .line 316
    .line 317
    sget v2, Lcom/kubi/assets/R$id;->tvRedemptionPeriod:I

    .line 318
    .line 319
    if-eqz p2, :cond_d

    .line 320
    .line 321
    .line 322
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getUnLockPeriodStr()Ljava/lang/String;

    .line 323
    move-result-object v3

    .line 324
    goto :goto_8

    .line 325
    :cond_d
    move-object v3, v1

    .line 326
    .line 327
    .line 328
    :goto_8
    invoke-virtual {v0, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 329
    move-result-object v0

    .line 330
    .line 331
    sget v2, Lcom/kubi/assets/R$id;->tvRevenue:I

    .line 332
    .line 333
    if-eqz p2, :cond_e

    .line 334
    .line 335
    .line 336
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getIncomeSumStr()Ljava/lang/String;

    .line 337
    move-result-object v1

    .line 338
    .line 339
    .line 340
    :cond_e
    invoke-virtual {v0, v2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 341
    move-result-object v0

    .line 342
    .line 343
    .line 344
    invoke-direct {p0, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->l(Lcom/kubi/assets/entity/ProductChildEntity;)I

    .line 345
    move-result v1

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 349
    .line 350
    .line 351
    invoke-interface {p0, p2, p1}, Lcom/kubi/assets/finance/b0;->d(Lcom/kubi/assets/entity/ProductChildEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 352
    .line 353
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 354
    goto :goto_a

    .line 355
    .line 356
    :pswitch_6
    sget v0, Lcom/kubi/assets/R$id;->tvAnnualized:I

    .line 357
    .line 358
    if-eqz p2, :cond_f

    .line 359
    .line 360
    .line 361
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getTotalReturnStr()Ljava/lang/String;

    .line 362
    move-result-object v2

    .line 363
    goto :goto_9

    .line 364
    :cond_f
    move-object v2, v1

    .line 365
    .line 366
    .line 367
    :goto_9
    invoke-virtual {p1, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 368
    move-result-object v0

    .line 369
    .line 370
    sget v2, Lcom/kubi/assets/R$id;->tvRevenue:I

    .line 371
    .line 372
    if-eqz p2, :cond_10

    .line 373
    .line 374
    .line 375
    invoke-virtual {p2}, Lcom/kubi/assets/entity/ProductChildEntity;->getIncomeSumStr()Ljava/lang/String;

    .line 376
    move-result-object v1

    .line 377
    .line 378
    .line 379
    :cond_10
    invoke-virtual {v0, v2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 380
    move-result-object v0

    .line 381
    .line 382
    .line 383
    invoke-direct {p0, p2}, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->l(Lcom/kubi/assets/entity/ProductChildEntity;)I

    .line 384
    move-result v1

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 388
    .line 389
    .line 390
    invoke-interface {p0, p2, p1}, Lcom/kubi/assets/finance/b0;->d(Lcom/kubi/assets/entity/ProductChildEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 391
    .line 392
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 393
    .line 394
    :goto_a
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 395
    .line 396
    iget-boolean p2, p0, Lcom/kubi/assets/finance/coin/FinanceCoinChildAdapter;->i:Z

    .line 397
    .line 398
    .line 399
    invoke-static {p1, p2}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 400
    return-void

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
