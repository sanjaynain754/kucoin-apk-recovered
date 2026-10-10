.class public final Lcom/kubi/home/rank/impl/f;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "RankListAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/kubi/home/rank/impl/cache/RankItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/home/rank/impl/RankItemDiffCallBack;",
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;",
        "Lcom/kubi/home/rank/impl/cache/RankItem;",
        "<init>",
        "()V",
        "areItemsTheSame",
        "",
        "oldItem",
        "newItem",
        "areContentsTheSame",
        "HomeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

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
.end method


# virtual methods
.method public a(Lcom/kubi/home/rank/impl/cache/RankItem;Lcom/kubi/home/rank/impl/cache/RankItem;)Z
    .locals 5
    .param p1    # Lcom/kubi/home/rank/impl/cache/RankItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/home/rank/impl/cache/RankItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "oldItem"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "newItem"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->isNewCoin()Z

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    if-eqz v0, :cond_7

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->isNewCoin()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_7

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v3

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 47
    move-result-object v4

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v4, v3

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_6

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getPriceString()Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getPriceString()Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v0

    .line 68
    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getMoneyPriceString()Ljava/lang/CharSequence;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getMoneyPriceString()Ljava/lang/CharSequence;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    move-result v0

    .line 82
    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoin()Lcom/kubi/home/api/RankNewCoin;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/kubi/home/api/RankNewCoin;->getIconUrl()Ljava/lang/String;

    .line 93
    move-result-object v0

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    move-object v0, v3

    .line 96
    .line 97
    .line 98
    :goto_2
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoin()Lcom/kubi/home/api/RankNewCoin;

    .line 99
    move-result-object v4

    .line 100
    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Lcom/kubi/home/api/RankNewCoin;->getIconUrl()Ljava/lang/String;

    .line 105
    move-result-object v4

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    move-object v4, v3

    .line 108
    .line 109
    .line 110
    :goto_3
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    move-result v0

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoin()Lcom/kubi/home/api/RankNewCoin;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/kubi/home/api/RankNewCoin;->getFullName()Ljava/lang/String;

    .line 123
    move-result-object v0

    .line 124
    goto :goto_4

    .line 125
    :cond_4
    move-object v0, v3

    .line 126
    .line 127
    .line 128
    :goto_4
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoin()Lcom/kubi/home/api/RankNewCoin;

    .line 129
    move-result-object v4

    .line 130
    .line 131
    if-eqz v4, :cond_5

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Lcom/kubi/home/api/RankNewCoin;->getFullName()Ljava/lang/String;

    .line 135
    move-result-object v3

    .line 136
    .line 137
    .line 138
    :cond_5
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    move-result v0

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateString()Ljava/lang/String;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateString()Ljava/lang/String;

    .line 149
    move-result-object v3

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    move-result v0

    .line 154
    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateColor()I

    .line 159
    move-result v0

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateColor()I

    .line 163
    move-result v3

    .line 164
    .line 165
    if-ne v0, v3, :cond_6

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoinOpeningTime()Ljava/lang/String;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoinOpeningTime()Ljava/lang/String;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    move-result v0

    .line 178
    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoinChangeRateString()Ljava/lang/String;

    .line 183
    move-result-object v0

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoinChangeRateString()Ljava/lang/String;

    .line 187
    move-result-object v3

    .line 188
    .line 189
    .line 190
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    move-result v0

    .line 192
    .line 193
    if-eqz v0, :cond_6

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoinTextColor()I

    .line 197
    move-result p1

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoinTextColor()I

    .line 201
    move-result p2

    .line 202
    .line 203
    if-ne p1, p2, :cond_6

    .line 204
    return v2

    .line 205
    :cond_6
    return v1

    .line 206
    .line 207
    .line 208
    :cond_7
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 209
    move-result-object v0

    .line 210
    .line 211
    if-eqz v0, :cond_8

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 215
    move-result-object v0

    .line 216
    goto :goto_5

    .line 217
    :cond_8
    move-object v0, v3

    .line 218
    .line 219
    .line 220
    :goto_5
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 221
    move-result-object v4

    .line 222
    .line 223
    if-eqz v4, :cond_9

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 227
    move-result-object v3

    .line 228
    .line 229
    .line 230
    :cond_9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    move-result v0

    .line 232
    .line 233
    if-eqz v0, :cond_a

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getPriceString()Ljava/lang/String;

    .line 237
    move-result-object v0

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getPriceString()Ljava/lang/String;

    .line 241
    move-result-object v3

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    move-result v0

    .line 246
    .line 247
    if-eqz v0, :cond_a

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateBg()Landroid/graphics/drawable/Drawable;

    .line 251
    move-result-object v0

    .line 252
    .line 253
    if-eqz v0, :cond_a

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateBg()Landroid/graphics/drawable/Drawable;

    .line 257
    move-result-object v3

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 261
    move-result v0

    .line 262
    .line 263
    if-ne v0, v2, :cond_a

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getMoneyPriceString()Ljava/lang/CharSequence;

    .line 267
    move-result-object v0

    .line 268
    .line 269
    .line 270
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getMoneyPriceString()Ljava/lang/CharSequence;

    .line 271
    move-result-object v3

    .line 272
    .line 273
    .line 274
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    move-result v0

    .line 276
    .line 277
    if-eqz v0, :cond_a

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getValueTvShow()Z

    .line 281
    move-result v0

    .line 282
    .line 283
    .line 284
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getValueTvShow()Z

    .line 285
    move-result v3

    .line 286
    .line 287
    if-ne v0, v3, :cond_a

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getValueString()Ljava/lang/String;

    .line 291
    move-result-object v0

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getValueString()Ljava/lang/String;

    .line 295
    move-result-object v3

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    move-result v0

    .line 300
    .line 301
    if-eqz v0, :cond_a

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateColor()I

    .line 305
    move-result v0

    .line 306
    .line 307
    .line 308
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateColor()I

    .line 309
    move-result v3

    .line 310
    .line 311
    if-ne v0, v3, :cond_a

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateString()Ljava/lang/String;

    .line 315
    move-result-object v0

    .line 316
    .line 317
    .line 318
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getChangeRateString()Ljava/lang/String;

    .line 319
    move-result-object v3

    .line 320
    .line 321
    .line 322
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    move-result v0

    .line 324
    .line 325
    if-eqz v0, :cond_a

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getIconUrl()Ljava/lang/String;

    .line 329
    move-result-object v0

    .line 330
    .line 331
    .line 332
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getIconUrl()Ljava/lang/String;

    .line 333
    move-result-object v3

    .line 334
    .line 335
    .line 336
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    move-result v0

    .line 338
    .line 339
    if-eqz v0, :cond_a

    .line 340
    .line 341
    .line 342
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getCoinLabel()Ljava/lang/String;

    .line 343
    move-result-object p1

    .line 344
    .line 345
    .line 346
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getCoinLabel()Ljava/lang/String;

    .line 347
    move-result-object p2

    .line 348
    .line 349
    .line 350
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    move-result p1

    .line 352
    .line 353
    if-eqz p1, :cond_a

    .line 354
    return v2

    .line 355
    :cond_a
    return v1
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
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/home/rank/impl/cache/RankItem;

    .line 3
    .line 4
    check-cast p2, Lcom/kubi/home/rank/impl/cache/RankItem;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/rank/impl/f;->a(Lcom/kubi/home/rank/impl/cache/RankItem;Lcom/kubi/home/rank/impl/cache/RankItem;)Z

    .line 8
    move-result p1

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
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/home/rank/impl/cache/RankItem;

    .line 3
    .line 4
    check-cast p2, Lcom/kubi/home/rank/impl/cache/RankItem;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/kubi/home/rank/impl/f;->b(Lcom/kubi/home/rank/impl/cache/RankItem;Lcom/kubi/home/rank/impl/cache/RankItem;)Z

    .line 8
    move-result p1

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
.end method

.method public b(Lcom/kubi/home/rank/impl/cache/RankItem;Lcom/kubi/home/rank/impl/cache/RankItem;)Z
    .locals 3
    .param p1    # Lcom/kubi/home/rank/impl/cache/RankItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/home/rank/impl/cache/RankItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "oldItem"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "newItem"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->isNewCoin()Z

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->isNewCoin()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_7

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v1

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v2, v1

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    move-result v0

    .line 52
    .line 53
    if-eqz v0, :cond_6

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoin()Lcom/kubi/home/api/RankNewCoin;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/kubi/home/api/RankNewCoin;->getCurrency()Ljava/lang/String;

    .line 63
    move-result-object v0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v0, v1

    .line 66
    .line 67
    .line 68
    :goto_2
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoin()Lcom/kubi/home/api/RankNewCoin;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/kubi/home/api/RankNewCoin;->getCurrency()Ljava/lang/String;

    .line 75
    move-result-object v2

    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move-object v2, v1

    .line 78
    .line 79
    .line 80
    :goto_3
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    move-result v0

    .line 82
    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoin()Lcom/kubi/home/api/RankNewCoin;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/kubi/home/api/RankNewCoin;->getFullName()Ljava/lang/String;

    .line 93
    move-result-object p1

    .line 94
    goto :goto_4

    .line 95
    :cond_4
    move-object p1, v1

    .line 96
    .line 97
    .line 98
    :goto_4
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getRankNewCoin()Lcom/kubi/home/api/RankNewCoin;

    .line 99
    move-result-object p2

    .line 100
    .line 101
    if-eqz p2, :cond_5

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Lcom/kubi/home/api/RankNewCoin;->getFullName()Ljava/lang/String;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    .line 108
    :cond_5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    move-result p1

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    const/4 p1, 0x1

    .line 113
    return p1

    .line 114
    :cond_6
    const/4 p1, 0x0

    .line 115
    return p1

    .line 116
    .line 117
    .line 118
    :cond_7
    invoke-virtual {p1}, Lcom/kubi/home/rank/impl/cache/RankItem;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    if-eqz p1, :cond_8

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 125
    move-result-object p1

    .line 126
    goto :goto_5

    .line 127
    :cond_8
    move-object p1, v1

    .line 128
    .line 129
    .line 130
    :goto_5
    invoke-virtual {p2}, Lcom/kubi/home/rank/impl/cache/RankItem;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 131
    move-result-object p2

    .line 132
    .line 133
    if-eqz p2, :cond_9

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    .line 140
    :cond_9
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    move-result p1

    .line 142
    return p1
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
.end method
