.class public final Lyu/a0;
.super Ljava/lang/Object;
.source "ItemBeanEx.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0004*\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0004*\u00020\u0010\u001a\u0010\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "configTradePair",
        "",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "isSpotType",
        "",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "updateTradePairUI",
        "isFuture",
        "showQuote",
        "getFutureSymbolShow",
        "Lcom/kubi/utils/StyledText;",
        "itemBean",
        "fontSize",
        "",
        "showNewTag",
        "Lcom/kubi/quotefacade/entity/FutureTradeItemBean;",
        "showHotTag",
        "isShowFutureSymbolTag",
        "symbol",
        "",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/data/entity/TradeItemBean;ZLio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 13
    .param p0    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "helper"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_trade_pair:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/kubi/resources/widget/BaseTextView;

    .line 19
    .line 20
    sget v1, Lcom/kubi/quotefacade/R$id;->tv_quote:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Lcom/kubi/resources/widget/BaseTextView;

    .line 27
    .line 28
    sget v2, Lcom/kubi/quotefacade/R$id;->label_prep_group:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    instance-of v3, p0, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

    .line 35
    const/4 v4, 0x0

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    move-object v5, p0

    .line 39
    .line 40
    check-cast v5, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v5, v4

    .line 43
    :goto_0
    const/4 v6, 0x1

    .line 44
    const/4 v7, 0x0

    .line 45
    .line 46
    if-eqz v5, :cond_1

    .line 47
    move v5, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v5, v7

    .line 50
    .line 51
    :goto_1
    instance-of v8, p0, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 52
    .line 53
    if-eqz v8, :cond_2

    .line 54
    move-object v8, p0

    .line 55
    .line 56
    check-cast v8, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move-object v8, v4

    .line 59
    .line 60
    :goto_2
    if-eqz v8, :cond_3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->isFuture()Z

    .line 64
    move-result v8

    .line 65
    .line 66
    if-ne v8, v6, :cond_3

    .line 67
    move v8, v6

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    move v8, v7

    .line 70
    .line 71
    :goto_3
    if-eqz p1, :cond_4

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 75
    move-result-object v9

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 79
    move-result-object v9

    .line 80
    .line 81
    const-string v10, "getQuoteCurrencyName(...)"

    .line 82
    .line 83
    .line 84
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 88
    move-result v9

    .line 89
    .line 90
    if-nez v9, :cond_4

    .line 91
    move v9, v6

    .line 92
    goto :goto_4

    .line 93
    :cond_4
    move v9, v7

    .line 94
    .line 95
    :goto_4
    if-eqz v0, :cond_8

    .line 96
    .line 97
    if-nez v5, :cond_7

    .line 98
    .line 99
    if-eqz v8, :cond_5

    .line 100
    goto :goto_5

    .line 101
    .line 102
    :cond_5
    if-eqz v9, :cond_6

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 106
    move-result-object v10

    .line 107
    .line 108
    .line 109
    invoke-virtual {v10}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 110
    move-result-object v10

    .line 111
    goto :goto_6

    .line 112
    .line 113
    :cond_6
    const-string v10, ""

    .line 114
    goto :goto_6

    .line 115
    .line 116
    :cond_7
    :goto_5
    sget-object v10, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 120
    move-result-object v10

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 124
    move-result-object v11

    .line 125
    .line 126
    const-string v12, "getSymbol(...)"

    .line 127
    .line 128
    .line 129
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v10, v11}, Lcom/kubi/kumex/api/IKuMexService;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    move-result-object v10

    .line 134
    .line 135
    .line 136
    :goto_6
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    :cond_8
    const/16 v0, 0x8

    .line 139
    .line 140
    if-eqz v1, :cond_a

    .line 141
    .line 142
    if-eqz v9, :cond_9

    .line 143
    .line 144
    new-instance v10, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    const/16 v11, 0x2f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 156
    move-result-object v11

    .line 157
    .line 158
    .line 159
    invoke-virtual {v11}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 160
    move-result-object v11

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    move-result-object v10

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    move v10, v7

    .line 172
    goto :goto_7

    .line 173
    :cond_9
    move v10, v0

    .line 174
    .line 175
    .line 176
    :goto_7
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    :cond_a
    if-nez p1, :cond_d

    .line 179
    .line 180
    if-eqz v3, :cond_b

    .line 181
    move-object v4, p0

    .line 182
    .line 183
    check-cast v4, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

    .line 184
    .line 185
    :cond_b
    if-eqz v4, :cond_c

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;->isForeverContract()Z

    .line 189
    move-result p1

    .line 190
    .line 191
    if-ne p1, v6, :cond_c

    .line 192
    goto :goto_8

    .line 193
    .line 194
    .line 195
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 196
    move-result-object p0

    .line 197
    .line 198
    .line 199
    invoke-static {p0}, Lyu/a0;->b(Ljava/lang/String;)Z

    .line 200
    move-result p0

    .line 201
    .line 202
    if-eqz p0, :cond_d

    .line 203
    :goto_8
    move p0, v6

    .line 204
    goto :goto_9

    .line 205
    :cond_d
    move p0, v7

    .line 206
    .line 207
    :goto_9
    if-eqz v2, :cond_f

    .line 208
    .line 209
    if-eqz p0, :cond_e

    .line 210
    move v0, v7

    .line 211
    .line 212
    .line 213
    :cond_e
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 214
    .line 215
    :cond_f
    if-nez v5, :cond_11

    .line 216
    .line 217
    if-eqz v8, :cond_10

    .line 218
    goto :goto_a

    .line 219
    :cond_10
    move v6, v7

    .line 220
    .line 221
    .line 222
    :cond_11
    :goto_a
    invoke-static {p2, v6, v9}, Lyu/a0;->e(Lio/chad/library/adapter/base/BaseViewHolder;ZZ)V

    .line 223
    return-void
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
.end method

.method public static final b(Ljava/lang/String;)Z
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/kubi/quotefacade/service/a;->a:Lcom/kubi/quotefacade/service/a;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/quotefacade/service/a;->c()Lcom/kubi/kumex/api/IKuMexService;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p0}, Lcom/kubi/kumex/api/IKuMexService;->y(Ljava/lang/String;)Lcom/kubi/kumex/entity/ContractEntityOpenData;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/kumex/entity/ContractEntityOpenData;->getType()Ljava/lang/String;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    const-string v0, "FFWCSX"

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return p0
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
.end method

.method public static final c(Lcom/kubi/quotefacade/entity/FutureTradeItemBean;)Z
    .locals 2
    .param p0    # Lcom/kubi/quotefacade/entity/FutureTradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;->getStatusIcon()Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string v0, "HOT"

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 16
    move-result p0

    .line 17
    return p0
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
    .line 71
    .line 72
    .line 73
.end method

.method public static final d(Lcom/kubi/quotefacade/entity/FutureTradeItemBean;)Z
    .locals 2
    .param p0    # Lcom/kubi/quotefacade/entity/FutureTradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;->getStatusIcon()Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string v0, "New"

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 16
    move-result p0

    .line 17
    return p0
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
    .line 71
    .line 72
    .line 73
.end method

.method public static final e(Lio/chad/library/adapter/base/BaseViewHolder;ZZ)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/quotefacade/R$id;->ll_trade_pair:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x3

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_1
    if-eqz p2, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    instance-of p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 33
    goto :goto_1

    .line 34
    :cond_3
    const/4 p0, 0x0

    .line 35
    .line 36
    :goto_1
    if-eqz p0, :cond_5

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lqw/b;->a(I)I

    .line 48
    move-result p1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 55
    return-void

    .line 56
    .line 57
    .line 58
    :cond_4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lqw/b;->a(I)I

    .line 62
    move-result p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 66
    :cond_5
    :goto_2
    return-void
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
.end method
