.class public final Lyu/r;
.super Ljava/lang/Object;
.source "ChainListItemView.kt"

# interfaces
.implements Lyu/y;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/quotefacade/adapter/ChainTradeCountItemView;",
        "Lcom/kubi/quotefacade/adapter/IChainListItemView;",
        "<init>",
        "()V",
        "bindItemView",
        "",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "Lcom/kubi/quotefacade/entity/ChainItemEntity;",
        "QuoteFacadeLib_googleRelease"
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/ChainItemEntity;)V
    .locals 10
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/quotefacade/entity/ChainItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v0, "item"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_trade_count:I

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/ChainItemEntity;->getTokenTxCount()Ljava/lang/Integer;

    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x3

    .line 23
    .line 24
    const-string v5, "--"

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    move-object v3, v5

    .line 30
    goto :goto_1

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/ChainItemEntity;->getTokenTxCount()Ljava/lang/Integer;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 40
    move-result v3

    .line 41
    int-to-long v8, v3

    .line 42
    .line 43
    .line 44
    invoke-static {v8, v9}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    const-string v8, "valueOf(...)"

    .line 48
    .line 49
    .line 50
    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v3, v6

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-static {v3, v7, v7, v4, v6}, Lkf/a;->c(Ljava/math/BigDecimal;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {v2, v0, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/ChainItemEntity;->getTokenBuyTxCount()Ljava/lang/Integer;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    const-string v2, ""

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    move-object v0, v2

    .line 69
    goto :goto_2

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/ChainItemEntity;->getTokenBuyTxCount()Ljava/lang/Integer;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    :goto_2
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/ChainItemEntity;->getTokenSellTxCount()Ljava/lang/Integer;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    if-nez v3, :cond_3

    .line 84
    goto :goto_3

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-virtual {p2}, Lcom/kubi/quotefacade/entity/ChainItemEntity;->getTokenSellTxCount()Ljava/lang/Integer;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    .line 91
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    :goto_3
    sget p2, Lcom/kubi/quotefacade/R$id;->layout_count:I

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 101
    move-result p2

    .line 102
    .line 103
    const-string v3, "0"

    .line 104
    .line 105
    if-nez p2, :cond_4

    .line 106
    .line 107
    sget p2, Lcom/kubi/quotefacade/R$id;->tv_buy_count:I

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 111
    goto :goto_4

    .line 112
    .line 113
    :cond_4
    sget p2, Lcom/kubi/quotefacade/R$id;->tv_buy_count:I

    .line 114
    .line 115
    new-instance v8, Ljava/math/BigDecimal;

    .line 116
    .line 117
    .line 118
    invoke-direct {v8, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v8, v7, v7, v4, v6}, Lkf/a;->c(Ljava/math/BigDecimal;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 122
    move-result-object v8

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 126
    .line 127
    .line 128
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    move-result v8

    .line 130
    .line 131
    if-eqz v8, :cond_5

    .line 132
    .line 133
    sget-object v8, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 134
    .line 135
    sget v9, Lcom/kubi/quotefacade/R$color;->c_text:I

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8, v9}, Lcom/kubi/utils/c;->a(I)I

    .line 139
    move-result v8

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p2, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 143
    goto :goto_4

    .line 144
    .line 145
    :cond_5
    sget-object v8, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 149
    move-result-object v8

    .line 150
    .line 151
    .line 152
    invoke-static {v8}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    .line 153
    move-result v8

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, p2, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 157
    .line 158
    .line 159
    :goto_4
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 160
    move-result p2

    .line 161
    .line 162
    if-nez p2, :cond_6

    .line 163
    .line 164
    sget p2, Lcom/kubi/quotefacade/R$id;->tv_sell_count:I

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p2, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 168
    goto :goto_5

    .line 169
    .line 170
    :cond_6
    sget p2, Lcom/kubi/quotefacade/R$id;->tv_sell_count:I

    .line 171
    .line 172
    new-instance v5, Ljava/math/BigDecimal;

    .line 173
    .line 174
    .line 175
    invoke-direct {v5, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v5, v7, v7, v4, v6}, Lkf/a;->c(Ljava/math/BigDecimal;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 179
    move-result-object v4

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p2, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 183
    .line 184
    .line 185
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    move-result v3

    .line 187
    .line 188
    if-eqz v3, :cond_7

    .line 189
    .line 190
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 191
    .line 192
    sget v4, Lcom/kubi/quotefacade/R$color;->c_text:I

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v4}, Lcom/kubi/utils/c;->a(I)I

    .line 196
    move-result v3

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, p2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 200
    goto :goto_5

    .line 201
    .line 202
    :cond_7
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 206
    move-result-object v3

    .line 207
    .line 208
    .line 209
    invoke-static {v3}, Lcom/kubi/resources/g;->n(Landroid/content/Context;)I

    .line 210
    move-result v3

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, p2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 214
    .line 215
    .line 216
    :goto_5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 217
    move-result p2

    .line 218
    .line 219
    if-nez p2, :cond_8

    .line 220
    .line 221
    .line 222
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 223
    move-result p2

    .line 224
    .line 225
    if-nez p2, :cond_8

    .line 226
    .line 227
    sget p2, Lcom/kubi/quotefacade/R$id;->tv_split:I

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, p2, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 231
    return-void

    .line 232
    .line 233
    :cond_8
    sget p2, Lcom/kubi/quotefacade/R$id;->tv_split:I

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, p2, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 237
    return-void
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
    .line 797
    .line 798
    .line 799
    .line 800
.end method
