.class public final Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2;
.super Ljava/lang/Object;
.source "Emitters.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,49:1\n18#2:50\n19#2:76\n124#3,2:51\n106#4:53\n78#4,22:54\n*S KotlinDebug\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1\n*L\n125#1:53\n125#1:54,22\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/coroutines/flow/f;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2;->c:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16

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
    instance-of v3, v2, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    move-object v3, v2

    .line 12
    .line 13
    check-cast v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;

    .line 14
    .line 15
    iget v4, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->label:I

    .line 16
    .line 17
    const/high16 v5, -0x80000000

    .line 18
    .line 19
    and-int v6, v4, v5

    .line 20
    .line 21
    if-eqz v6, :cond_0

    .line 22
    sub-int/2addr v4, v5

    .line 23
    .line 24
    iput v4, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->label:I

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    new-instance v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;

    .line 28
    .line 29
    .line 30
    invoke-direct {v3, v0, v2}, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;-><init>(Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2;Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    :goto_0
    iget-object v2, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    iget v5, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->label:I

    .line 39
    const/4 v6, 0x1

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    if-ne v5, v6, :cond_1

    .line 44
    .line 45
    iget-object v1, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lkotlinx/coroutines/flow/f;

    .line 48
    .line 49
    iget-object v1, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    throw v1

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    iget-object v2, v0, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 70
    move-object v5, v1

    .line 71
    .line 72
    check-cast v5, Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    .line 76
    if-eqz v5, :cond_9

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;->getCurrency()Ljava/lang/String;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    if-eqz v5, :cond_9

    .line 83
    .line 84
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 85
    .line 86
    const-string v10, "ROOT"

    .line 87
    .line 88
    .line 89
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 93
    move-result-object v5

    .line 94
    .line 95
    const-string v9, "toLowerCase(...)"

    .line 96
    .line 97
    .line 98
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    if-eqz v5, :cond_9

    .line 101
    .line 102
    iget-object v11, v0, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2;->c:Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 106
    move-result v12

    .line 107
    sub-int/2addr v12, v6

    .line 108
    move v13, v8

    .line 109
    move v14, v13

    .line 110
    .line 111
    :goto_1
    if-gt v13, v12, :cond_8

    .line 112
    .line 113
    if-nez v14, :cond_3

    .line 114
    move v15, v13

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    move v15, v12

    .line 117
    .line 118
    .line 119
    :goto_2
    invoke-interface {v11, v15}, Ljava/lang/CharSequence;->charAt(I)C

    .line 120
    move-result v15

    .line 121
    .line 122
    move/from16 p2, v6

    .line 123
    .line 124
    const/16 v6, 0x20

    .line 125
    .line 126
    .line 127
    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    .line 128
    move-result v6

    .line 129
    .line 130
    if-gtz v6, :cond_4

    .line 131
    .line 132
    move/from16 v6, p2

    .line 133
    goto :goto_3

    .line 134
    :cond_4
    move v6, v8

    .line 135
    .line 136
    :goto_3
    if-nez v14, :cond_6

    .line 137
    .line 138
    if-nez v6, :cond_5

    .line 139
    .line 140
    move/from16 v6, p2

    .line 141
    move v14, v6

    .line 142
    goto :goto_1

    .line 143
    .line 144
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 145
    .line 146
    :goto_4
    move/from16 v6, p2

    .line 147
    goto :goto_1

    .line 148
    .line 149
    :cond_6
    if-nez v6, :cond_7

    .line 150
    goto :goto_5

    .line 151
    .line 152
    :cond_7
    add-int/lit8 v12, v12, -0x1

    .line 153
    goto :goto_4

    .line 154
    .line 155
    :cond_8
    move/from16 p2, v6

    .line 156
    .line 157
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 158
    .line 159
    .line 160
    invoke-interface {v11, v13, v12}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 161
    move-result-object v6

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    move-result-object v6

    .line 166
    .line 167
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 168
    .line 169
    .line 170
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 174
    move-result-object v6

    .line 175
    .line 176
    .line 177
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    const/4 v9, 0x2

    .line 179
    .line 180
    .line 181
    invoke-static {v5, v6, v8, v9, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 182
    move-result v5

    .line 183
    .line 184
    .line 185
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 186
    move-result-object v7

    .line 187
    goto :goto_6

    .line 188
    .line 189
    :cond_9
    move/from16 p2, v6

    .line 190
    .line 191
    .line 192
    :goto_6
    invoke-static {v7}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 193
    move-result v5

    .line 194
    .line 195
    if-eqz v5, :cond_a

    .line 196
    .line 197
    .line 198
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    move-result-object v5

    .line 200
    .line 201
    iput-object v5, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->L$0:Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object v5

    .line 206
    .line 207
    iput-object v5, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->L$1:Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    move-result-object v5

    .line 212
    .line 213
    iput-object v5, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->L$2:Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    move-result-object v5

    .line 218
    .line 219
    iput-object v5, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->L$3:Ljava/lang/Object;

    .line 220
    .line 221
    iput v8, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->I$0:I

    .line 222
    .line 223
    move/from16 v5, p2

    .line 224
    .line 225
    iput v5, v3, Lcom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1;->label:I

    .line 226
    .line 227
    .line 228
    invoke-interface {v2, v1, v3}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 229
    move-result-object v1

    .line 230
    .line 231
    if-ne v1, v4, :cond_a

    .line 232
    return-object v4

    .line 233
    .line 234
    :cond_a
    :goto_7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 235
    return-object v1
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
.end method
