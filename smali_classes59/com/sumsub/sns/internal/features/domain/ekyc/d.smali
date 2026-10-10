.class public final Lcom/sumsub/sns/internal/features/domain/ekyc/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/ekyc/d;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p4

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    instance-of v4, v1, Lcom/sumsub/sns/internal/features/domain/ekyc/c;

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    move-object v4, v1

    .line 12
    .line 13
    check-cast v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;

    .line 14
    .line 15
    iget v5, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->g:I

    .line 16
    .line 17
    const/high16 v6, -0x80000000

    .line 18
    .line 19
    and-int v7, v5, v6

    .line 20
    .line 21
    if-eqz v7, :cond_0

    .line 22
    sub-int/2addr v5, v6

    .line 23
    .line 24
    iput v5, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->g:I

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    new-instance v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;

    .line 28
    .line 29
    .line 30
    invoke-direct {v4, v0, v1}, Lcom/sumsub/sns/internal/features/domain/ekyc/c;-><init>(Lcom/sumsub/sns/internal/features/domain/ekyc/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 31
    .line 32
    :goto_0
    iget-object v1, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->e:Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    iget v6, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->g:I

    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x0

    .line 41
    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    if-eq v6, v3, :cond_2

    .line 45
    .line 46
    if-ne v6, v7, :cond_1

    .line 47
    .line 48
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 49
    .line 50
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->c:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v9, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->a:Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    goto :goto_3

    .line 59
    .line 60
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    throw v1

    .line 67
    .line 68
    :cond_2
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->c:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v9, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->b:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v10, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->a:Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    move-object v15, v10

    .line 77
    move-object v10, v6

    .line 78
    move-object v6, v15

    .line 79
    goto :goto_1

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    .line 84
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/d;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 85
    .line 86
    move-object/from16 v6, p1

    .line 87
    .line 88
    iput-object v6, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->a:Ljava/lang/String;

    .line 89
    .line 90
    move-object/from16 v9, p2

    .line 91
    .line 92
    iput-object v9, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->b:Ljava/lang/String;

    .line 93
    .line 94
    move-object/from16 v10, p3

    .line 95
    .line 96
    iput-object v10, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->c:Ljava/lang/String;

    .line 97
    .line 98
    iput v3, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->g:I

    .line 99
    .line 100
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 101
    .line 102
    iget-object v11, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 103
    .line 104
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 105
    .line 106
    .line 107
    invoke-interface {v11}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 108
    move-result-object v11

    .line 109
    .line 110
    new-instance v12, Lcom/sumsub/sns/internal/features/data/repository/dynamic/A;

    .line 111
    .line 112
    .line 113
    invoke-direct {v12, v1, v8}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/A;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v11, v12, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    if-ne v1, v5, :cond_4

    .line 120
    goto :goto_2

    .line 121
    .line 122
    :cond_4
    :goto_1
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 129
    .line 130
    if-nez v1, :cond_5

    .line 131
    return-object v8

    .line 132
    .line 133
    :cond_5
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/domain/ekyc/d;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 134
    .line 135
    iput-object v6, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->a:Ljava/lang/String;

    .line 136
    .line 137
    iput-object v9, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->b:Ljava/lang/String;

    .line 138
    .line 139
    iput-object v10, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->c:Ljava/lang/String;

    .line 140
    .line 141
    iput-object v1, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 142
    .line 143
    iput v7, v4, Lcom/sumsub/sns/internal/features/domain/ekyc/c;->g:I

    .line 144
    .line 145
    check-cast v11, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v2, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 149
    move-result-object v4

    .line 150
    .line 151
    if-ne v4, v5, :cond_6

    .line 152
    :goto_2
    return-object v5

    .line 153
    :cond_6
    move-object v5, v1

    .line 154
    move-object v1, v4

    .line 155
    move-object v4, v6

    .line 156
    move-object v6, v10

    .line 157
    .line 158
    :goto_3
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 165
    .line 166
    if-nez v1, :cond_7

    .line 167
    return-object v8

    .line 168
    .line 169
    :cond_7
    new-array v10, v3, [C

    .line 170
    .line 171
    const/16 v3, 0x2e

    .line 172
    .line 173
    aput-char v3, v10, v2

    .line 174
    const/4 v13, 0x6

    .line 175
    const/4 v14, 0x0

    .line 176
    const/4 v11, 0x0

    .line 177
    const/4 v12, 0x0

    .line 178
    .line 179
    .line 180
    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 181
    move-result-object v2

    .line 182
    .line 183
    .line 184
    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/T0;->a(Ljava/util/List;)Ljava/lang/String;

    .line 185
    move-result-object v2

    .line 186
    .line 187
    sget-object v3, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 188
    .line 189
    .line 190
    filled-new-array {v4, v2}, [Ljava/lang/Object;

    .line 191
    move-result-object v3

    .line 192
    .line 193
    .line 194
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 195
    move-result-object v3

    .line 196
    .line 197
    .line 198
    const-string/jumbo v7, "sns_ekyc_source_%s::%s"

    .line 199
    .line 200
    .line 201
    invoke-static {v7, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    move-result-object v3

    .line 203
    .line 204
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/h;->o:Ljava/util/Map;

    .line 205
    .line 206
    if-eqz v1, :cond_8

    .line 207
    .line 208
    .line 209
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    move-result-object v1

    .line 211
    .line 212
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/s3;

    .line 213
    .line 214
    if-eqz v1, :cond_8

    .line 215
    .line 216
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/s3;->a:Ljava/util/Map;

    .line 217
    .line 218
    if-eqz v1, :cond_8

    .line 219
    .line 220
    .line 221
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    move-result-object v1

    .line 223
    .line 224
    check-cast v1, Ljava/lang/String;

    .line 225
    goto :goto_4

    .line 226
    :cond_8
    move-object v1, v8

    .line 227
    .line 228
    .line 229
    :goto_4
    invoke-virtual {v5, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    move-result-object v2

    .line 231
    .line 232
    if-eqz v2, :cond_b

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 236
    move-result v3

    .line 237
    .line 238
    if-lez v3, :cond_9

    .line 239
    goto :goto_5

    .line 240
    :cond_9
    move-object v2, v8

    .line 241
    .line 242
    :goto_5
    if-nez v2, :cond_a

    .line 243
    goto :goto_6

    .line 244
    :cond_a
    return-object v2

    .line 245
    .line 246
    :cond_b
    :goto_6
    if-eqz v1, :cond_c

    .line 247
    .line 248
    if-eqz v6, :cond_d

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 252
    move-result v2

    .line 253
    .line 254
    if-lez v2, :cond_c

    .line 255
    goto :goto_7

    .line 256
    :cond_c
    move-object v1, v8

    .line 257
    .line 258
    :cond_d
    :goto_7
    if-nez v1, :cond_f

    .line 259
    .line 260
    if-eqz v6, :cond_e

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    move-result-object v1

    .line 265
    .line 266
    if-eqz v1, :cond_e

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 270
    move-result v2

    .line 271
    .line 272
    if-lez v2, :cond_e

    .line 273
    return-object v1

    .line 274
    :cond_e
    return-object v8

    .line 275
    :cond_f
    return-object v1
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
.end method
