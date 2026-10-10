.class public final Ldd/a;
.super Ljava/lang/Object;
.source "HistoryOrderData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0002\u00a8\u0006\n"
    }
    d2 = {
        "toHistoryOrdersUiDataItemEntity",
        "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;",
        "Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;",
        "getAmountUnit",
        "",
        "isMarket",
        "",
        "side",
        "symbolInfo",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "TradeCoreBizLib_googleRelease"
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
.method public static final a(ZLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    const-string v0, "--"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const-string p0, "buy"

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 12
    move-result p0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {v1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    .line 27
    :cond_1
    if-eqz p2, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-static {v1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    .line 38
    :cond_3
    if-eqz p2, :cond_4

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    :cond_4
    invoke-static {v1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object p0

    .line 47
    return-object p0
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
.end method

.method public static final b(Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;)Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;
    .locals 27
    .param p0    # Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getOrderId()Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getSymbol()Ljava/lang/String;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    sget-object v0, Lgf/n;->a:Lgf/n;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getSide()Ljava/lang/String;

    .line 25
    move-result-object v7

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getOrderTime()Ljava/lang/Long;

    .line 29
    move-result-object v8

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getHidden()Ljava/lang/Boolean;

    .line 33
    move-result-object v5

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getIceberg()Ljava/lang/Boolean;

    .line 37
    move-result-object v6

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getAvgPrice()Ljava/lang/String;

    .line 41
    move-result-object v9

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFilledSize()Ljava/lang/String;

    .line 45
    move-result-object v10

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getSize()Ljava/lang/String;

    .line 49
    move-result-object v15

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getOrderType()Ljava/lang/String;

    .line 53
    move-result-object v16

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getStp()Ljava/lang/String;

    .line 57
    move-result-object v17

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getStatus()Ljava/lang/String;

    .line 61
    move-result-object v18

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getOrderDisplayType()Ljava/lang/String;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 71
    move-result v11

    .line 72
    const/4 v12, 0x1

    .line 73
    const/4 v13, 0x0

    .line 74
    .line 75
    .line 76
    packed-switch v11, :pswitch_data_0

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :pswitch_0
    const-string v11, "4"

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    move-result v0

    .line 85
    .line 86
    if-nez v0, :cond_0

    .line 87
    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :cond_0
    new-instance v1, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$AdvancedLimit;

    .line 91
    move-object v0, v2

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getPrice()Ljava/lang/String;

    .line 95
    move-result-object v2

    .line 96
    move-object v11, v5

    .line 97
    move-object v5, v3

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTimeInForce()Ljava/lang/String;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    move-object/from16 v14, v17

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFunds()Ljava/lang/String;

    .line 107
    move-result-object v17

    .line 108
    .line 109
    move-object/from16 v12, v16

    .line 110
    .line 111
    move-object/from16 v16, v18

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFilledFunds()Ljava/lang/String;

    .line 115
    move-result-object v18

    .line 116
    .line 117
    .line 118
    invoke-static {v13, v7, v4}, Ldd/a;->a(ZLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/String;

    .line 119
    move-result-object v19

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFee()Ljava/lang/String;

    .line 123
    move-result-object v20

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFeeCurrency()Ljava/lang/String;

    .line 127
    move-result-object v21

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTax()Ljava/lang/String;

    .line 131
    move-result-object v22

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTaxCurrency()Ljava/lang/String;

    .line 135
    move-result-object v23

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getCancelReason()Ljava/lang/String;

    .line 139
    move-result-object v24

    .line 140
    move-object v13, v9

    .line 141
    move-object v9, v7

    .line 142
    move-object v7, v11

    .line 143
    move-object v11, v13

    .line 144
    move-object v13, v15

    .line 145
    move-object v15, v14

    .line 146
    move-object v14, v12

    .line 147
    move-object v12, v10

    .line 148
    move-object v10, v8

    .line 149
    move-object v8, v6

    .line 150
    move-object v6, v4

    .line 151
    move-object v4, v0

    .line 152
    .line 153
    .line 154
    invoke-direct/range {v1 .. v24}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$AdvancedLimit;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    return-object v1

    .line 156
    :pswitch_1
    move-object v11, v10

    .line 157
    .line 158
    move-object/from16 v14, v17

    .line 159
    .line 160
    move-object/from16 v17, v18

    .line 161
    move-object v10, v9

    .line 162
    move-object v9, v6

    .line 163
    move-object v6, v5

    .line 164
    move-object v5, v3

    .line 165
    .line 166
    const-string v1, "3"

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    move-result v0

    .line 171
    .line 172
    if-nez v0, :cond_1

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    .line 177
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTriggerPrice()Ljava/lang/String;

    .line 178
    move-result-object v3

    .line 179
    move-object v0, v2

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTriggerDirection()Ljava/lang/String;

    .line 183
    move-result-object v2

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTriggerPriceType()Ljava/lang/String;

    .line 187
    move-result-object v1

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFunds()Ljava/lang/String;

    .line 191
    move-result-object v18

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFilledFunds()Ljava/lang/String;

    .line 195
    move-result-object v19

    .line 196
    .line 197
    .line 198
    invoke-static {v12, v7, v4}, Ldd/a;->a(ZLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/String;

    .line 199
    move-result-object v20

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFee()Ljava/lang/String;

    .line 203
    move-result-object v21

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFeeCurrency()Ljava/lang/String;

    .line 207
    move-result-object v22

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTax()Ljava/lang/String;

    .line 211
    move-result-object v23

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTaxCurrency()Ljava/lang/String;

    .line 215
    move-result-object v24

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getCancelReason()Ljava/lang/String;

    .line 219
    move-result-object v25

    .line 220
    move-object v12, v10

    .line 221
    move-object v10, v7

    .line 222
    move-object v7, v4

    .line 223
    move-object v4, v1

    .line 224
    .line 225
    new-instance v1, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopMarket;

    .line 226
    .line 227
    move-object/from16 v13, v16

    .line 228
    .line 229
    move-object/from16 v16, v14

    .line 230
    move-object v14, v15

    .line 231
    move-object v15, v13

    .line 232
    move-object v13, v11

    .line 233
    move-object v11, v8

    .line 234
    move-object v8, v6

    .line 235
    move-object v6, v5

    .line 236
    move-object v5, v0

    .line 237
    .line 238
    .line 239
    invoke-direct/range {v1 .. v25}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopMarket;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    return-object v1

    .line 241
    :pswitch_2
    move-object v11, v10

    .line 242
    .line 243
    move-object/from16 v14, v17

    .line 244
    .line 245
    move-object/from16 v17, v18

    .line 246
    move-object v10, v9

    .line 247
    move-object v9, v6

    .line 248
    move-object v6, v5

    .line 249
    move-object v5, v3

    .line 250
    .line 251
    const-string v1, "2"

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    move-result v0

    .line 256
    .line 257
    if-nez v0, :cond_2

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    :cond_2
    move-object v0, v2

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getPrice()Ljava/lang/String;

    .line 264
    move-result-object v2

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTriggerPrice()Ljava/lang/String;

    .line 268
    move-result-object v1

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTriggerDirection()Ljava/lang/String;

    .line 272
    move-result-object v3

    .line 273
    move-object v12, v5

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTriggerPriceType()Ljava/lang/String;

    .line 277
    move-result-object v5

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFunds()Ljava/lang/String;

    .line 281
    move-result-object v19

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFilledFunds()Ljava/lang/String;

    .line 285
    move-result-object v20

    .line 286
    .line 287
    .line 288
    invoke-static {v13, v7, v4}, Ldd/a;->a(ZLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/String;

    .line 289
    move-result-object v21

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFee()Ljava/lang/String;

    .line 293
    move-result-object v22

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFeeCurrency()Ljava/lang/String;

    .line 297
    move-result-object v23

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTax()Ljava/lang/String;

    .line 301
    move-result-object v24

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTaxCurrency()Ljava/lang/String;

    .line 305
    move-result-object v25

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getCancelReason()Ljava/lang/String;

    .line 309
    move-result-object v26

    .line 310
    move-object v13, v11

    .line 311
    move-object v11, v7

    .line 312
    move-object v7, v12

    .line 313
    move-object v12, v8

    .line 314
    move-object v8, v4

    .line 315
    move-object v4, v1

    .line 316
    .line 317
    new-instance v1, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopLimit;

    .line 318
    .line 319
    move-object/from16 v18, v17

    .line 320
    .line 321
    move-object/from16 v17, v14

    .line 322
    move-object v14, v13

    .line 323
    move-object v13, v10

    .line 324
    move-object v10, v9

    .line 325
    move-object v9, v6

    .line 326
    move-object v6, v0

    .line 327
    .line 328
    .line 329
    invoke-direct/range {v1 .. v26}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$StopLimit;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    return-object v1

    .line 331
    :pswitch_3
    move-object v11, v10

    .line 332
    .line 333
    move-object/from16 v14, v17

    .line 334
    .line 335
    move-object/from16 v17, v18

    .line 336
    move-object v10, v9

    .line 337
    move-object v9, v6

    .line 338
    move-object v6, v5

    .line 339
    move-object v5, v3

    .line 340
    .line 341
    const-string v1, "1"

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    move-result v0

    .line 346
    .line 347
    if-nez v0, :cond_3

    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_3
    new-instance v1, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Market;

    .line 352
    move-object v13, v15

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFunds()Ljava/lang/String;

    .line 356
    move-result-object v15

    .line 357
    .line 358
    move-object/from16 v0, v16

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFilledFunds()Ljava/lang/String;

    .line 362
    move-result-object v16

    .line 363
    .line 364
    .line 365
    invoke-static {v12, v7, v4}, Ldd/a;->a(ZLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/String;

    .line 366
    move-result-object v3

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFee()Ljava/lang/String;

    .line 370
    move-result-object v18

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFeeCurrency()Ljava/lang/String;

    .line 374
    move-result-object v19

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTax()Ljava/lang/String;

    .line 378
    move-result-object v20

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTaxCurrency()Ljava/lang/String;

    .line 382
    move-result-object v21

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getCancelReason()Ljava/lang/String;

    .line 386
    move-result-object v22

    .line 387
    .line 388
    move-object/from16 v12, v17

    .line 389
    .line 390
    move-object/from16 v17, v3

    .line 391
    move-object v3, v5

    .line 392
    move-object v5, v6

    .line 393
    move-object v6, v9

    .line 394
    move-object v9, v10

    .line 395
    move-object v10, v11

    .line 396
    move-object v11, v13

    .line 397
    move-object v13, v14

    .line 398
    move-object v14, v12

    .line 399
    move-object v12, v0

    .line 400
    .line 401
    .line 402
    invoke-direct/range {v1 .. v22}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Market;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    return-object v1

    .line 404
    :pswitch_4
    move-object v11, v10

    .line 405
    .line 406
    move-object/from16 v14, v17

    .line 407
    .line 408
    move-object/from16 v17, v18

    .line 409
    move-object v10, v9

    .line 410
    move-object v9, v6

    .line 411
    move-object v6, v5

    .line 412
    move-object v5, v3

    .line 413
    .line 414
    const-string v1, "0"

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    move-result v0

    .line 419
    .line 420
    if-nez v0, :cond_4

    .line 421
    goto :goto_0

    .line 422
    .line 423
    :cond_4
    new-instance v1, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Limit;

    .line 424
    move-object v0, v2

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getPrice()Ljava/lang/String;

    .line 428
    move-result-object v2

    .line 429
    .line 430
    move-object/from16 v12, v16

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFunds()Ljava/lang/String;

    .line 434
    move-result-object v16

    .line 435
    .line 436
    move-object/from16 v18, v17

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFilledFunds()Ljava/lang/String;

    .line 440
    move-result-object v17

    .line 441
    .line 442
    .line 443
    invoke-static {v13, v7, v4}, Ldd/a;->a(ZLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/lang/String;

    .line 444
    move-result-object v3

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFee()Ljava/lang/String;

    .line 448
    move-result-object v19

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getFeeCurrency()Ljava/lang/String;

    .line 452
    move-result-object v20

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTax()Ljava/lang/String;

    .line 456
    move-result-object v21

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getTaxCurrency()Ljava/lang/String;

    .line 460
    move-result-object v22

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/core/base/order/data/HistoryOrderList$ResponseItemEntity;->getCancelReason()Ljava/lang/String;

    .line 464
    move-result-object v23

    .line 465
    move-object v13, v5

    .line 466
    move-object v5, v4

    .line 467
    move-object v4, v13

    .line 468
    move-object v13, v8

    .line 469
    move-object v8, v7

    .line 470
    move-object v7, v9

    .line 471
    move-object v9, v13

    .line 472
    move-object v13, v12

    .line 473
    move-object v12, v15

    .line 474
    .line 475
    move-object/from16 v15, v18

    .line 476
    .line 477
    move-object/from16 v18, v3

    .line 478
    move-object v3, v0

    .line 479
    .line 480
    .line 481
    invoke-direct/range {v1 .. v23}, Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity$Limit;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    return-object v1

    .line 483
    :cond_5
    :goto_0
    const/4 v0, 0x0

    .line 484
    return-object v0

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
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
