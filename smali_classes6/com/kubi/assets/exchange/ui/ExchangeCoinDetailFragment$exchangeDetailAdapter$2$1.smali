.class public final Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "ExchangeCoinDetailFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/assets/entity/ExchangeRecordEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014\u00a8\u0006\u0008"
    }
    d2 = {
        "com/kubi/assets/exchange/ui/ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/assets/entity/ExchangeRecordEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "convert",
        "",
        "helper",
        "item",
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
.field public final synthetic i:Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment;I)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1;->i:Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

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


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/ExchangeRecordEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1;->g(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ExchangeRecordEntity;)V

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

.method public g(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/ExchangeRecordEntity;)V
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    const-string v2, "helper"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "item"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/kubi/assets/entity/ExchangeRecordEntity;->getCurrency()Ljava/lang/String;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    sget v3, Lcom/kubi/assets/R$id;->iv_icon:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    check-cast v3, Landroid/widget/ImageView;

    .line 37
    const/4 v4, 0x0

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 43
    move-result-object v5

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v5, v4

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v5}, Lcom/kubi/sdk/util/v;->g(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 53
    .line 54
    sget v3, Lcom/kubi/assets/R$id;->tv_coin_name:I

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 60
    move-result-object v5

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move-object v5, v4

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    move-result-object v5

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v3, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    sget v3, Lcom/kubi/assets/R$id;->tv_coin_full_name:I

    .line 73
    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getName()Ljava/lang/String;

    .line 78
    move-result-object v2

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    move-object v2, v4

    .line 81
    .line 82
    .line 83
    :goto_2
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    sget v2, Lcom/kubi/assets/R$id;->tv_convert_amount:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/kubi/assets/entity/ExchangeRecordEntity;->getSourceAmount()Ljava/math/BigDecimal;

    .line 94
    move-result-object v5

    .line 95
    .line 96
    if-eqz v5, :cond_3

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lcom/kubi/assets/entity/ExchangeRecordEntity;->getCurrency()Ljava/lang/String;

    .line 100
    move-result-object v6

    .line 101
    .line 102
    const/16 v14, 0xfe

    .line 103
    const/4 v15, 0x0

    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    const/4 v13, 0x0

    .line 111
    .line 112
    .line 113
    invoke-static/range {v5 .. v15}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 114
    move-result-object v3

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    move-object v3, v4

    .line 117
    .line 118
    .line 119
    :goto_3
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    move-result-object v3

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    sget v2, Lcom/kubi/assets/R$id;->tv_convert_amount_kcs:I

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/kubi/assets/entity/ExchangeRecordEntity;->getRealExchangeAmount()Ljava/math/BigDecimal;

    .line 130
    move-result-object v5

    .line 131
    .line 132
    if-eqz v5, :cond_4

    .line 133
    .line 134
    const/16 v14, 0xfe

    .line 135
    const/4 v15, 0x0

    .line 136
    .line 137
    const-string v6, "KCS"

    .line 138
    const/4 v7, 0x0

    .line 139
    const/4 v8, 0x0

    .line 140
    const/4 v9, 0x0

    .line 141
    const/4 v10, 0x0

    .line 142
    const/4 v11, 0x0

    .line 143
    const/4 v12, 0x0

    .line 144
    const/4 v13, 0x0

    .line 145
    .line 146
    .line 147
    invoke-static/range {v5 .. v15}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 148
    move-result-object v3

    .line 149
    goto :goto_4

    .line 150
    :cond_4
    move-object v3, v4

    .line 151
    .line 152
    .line 153
    :goto_4
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    move-result-object v3

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    sget v2, Lcom/kubi/assets/R$id;->tv_fee:I

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/kubi/assets/entity/ExchangeRecordEntity;->getFee()Ljava/math/BigDecimal;

    .line 164
    move-result-object v5

    .line 165
    .line 166
    if-eqz v5, :cond_5

    .line 167
    .line 168
    const/16 v14, 0xfe

    .line 169
    const/4 v15, 0x0

    .line 170
    .line 171
    const-string v6, "KCS"

    .line 172
    const/4 v7, 0x0

    .line 173
    const/4 v8, 0x0

    .line 174
    const/4 v9, 0x0

    .line 175
    const/4 v10, 0x0

    .line 176
    const/4 v11, 0x0

    .line 177
    const/4 v12, 0x0

    .line 178
    const/4 v13, 0x0

    .line 179
    .line 180
    .line 181
    invoke-static/range {v5 .. v15}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 182
    move-result-object v4

    .line 183
    .line 184
    .line 185
    :cond_5
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    move-result-object v3

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 190
    move-result-object v0

    .line 191
    .line 192
    sget v2, Lcom/kubi/assets/R$id;->tv_account:I

    .line 193
    .line 194
    move-object/from16 v3, p0

    .line 195
    .line 196
    iget-object v4, v3, Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1;->i:Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment;

    .line 197
    .line 198
    .line 199
    invoke-static {v4, v1}, Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment;->q3(Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment;Lcom/kubi/assets/entity/ExchangeRecordEntity;)Ljava/lang/String;

    .line 200
    move-result-object v4

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v2, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    sget v4, Lcom/kubi/assets/R$id;->tv_account_name:I

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/kubi/assets/entity/ExchangeRecordEntity;->getPositionType()Ljava/lang/String;

    .line 210
    move-result-object v5

    .line 211
    .line 212
    .line 213
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 214
    move-result v5

    .line 215
    .line 216
    xor-int/lit8 v5, v5, 0x1

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Lcom/kubi/assets/entity/ExchangeRecordEntity;->getPositionType()Ljava/lang/String;

    .line 224
    move-result-object v1

    .line 225
    .line 226
    .line 227
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 228
    move-result v1

    .line 229
    .line 230
    xor-int/lit8 v1, v1, 0x1

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 234
    return-void
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
