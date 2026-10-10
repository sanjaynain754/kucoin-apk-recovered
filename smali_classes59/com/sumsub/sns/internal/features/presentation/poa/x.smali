.class public final Lcom/sumsub/sns/internal/features/presentation/poa/x;
.super Lcom/sumsub/sns/internal/features/presentation/common/G;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic W:I


# instance fields
.field public final f:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final g:Lcom/sumsub/sns/internal/features/domain/G;

.field public final h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final i:Lcom/sumsub/sns/internal/features/domain/documents/v;

.field public final j:Lcom/sumsub/sns/internal/features/domain/utils/a;

.field public final k:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public l:Z

.field public m:Ljava/util/Map;

.field public final n:Lkotlinx/coroutines/flow/w;

.field public final o:Lkotlinx/coroutines/flow/n;

.field public final p:Lkotlinx/coroutines/flow/n;

.field public final q:Lkotlinx/coroutines/flow/n;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/domain/G;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/documents/v;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/domain/utils/a;Lcom/sumsub/sns/internal/core/domain/d;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2, p4, p6, p7}, Lcom/sumsub/sns/internal/features/presentation/common/G;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/domain/utils/a;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->g:Lcom/sumsub/sns/internal/features/domain/G;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 10
    .line 11
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->i:Lcom/sumsub/sns/internal/features/domain/documents/v;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->j:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 14
    .line 15
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->k:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 16
    const/4 p1, 0x1

    .line 17
    .line 18
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->l:Z

    .line 19
    .line 20
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/poa/u;

    .line 21
    const/4 p2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-direct {p1, p0, p6, p2}, Lcom/sumsub/sns/internal/features/presentation/poa/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/x;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 32
    move-result-object p3

    .line 33
    .line 34
    sget-object v0, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    const-wide/16 v3, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    .line 44
    move-result-object p4

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p3, p4, p2}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->n:Lkotlinx/coroutines/flow/w;

    .line 51
    .line 52
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/poa/SNSProofOfAddressViewModelV2$Step;->DOC_UPLOAD:Lcom/sumsub/sns/internal/features/presentation/poa/SNSProofOfAddressViewModelV2$Step;

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->o:Lkotlinx/coroutines/flow/n;

    .line 59
    .line 60
    .line 61
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->p:Lkotlinx/coroutines/flow/n;

    .line 65
    .line 66
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->q:Lkotlinx/coroutines/flow/n;

    .line 73
    return-void
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
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/e;Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/util/ArrayList;
    .locals 6

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 100
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/e;->c:Ljava/util/List;

    const-string v2, "POA.documentTypes."

    if-eqz v1, :cond_1

    .line 101
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v3, 0x1

    xor-int/2addr v1, v3

    if-ne v1, v3, :cond_1

    .line 102
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/e;->c:Ljava/util/List;

    .line 103
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 104
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/model/common/e;->a:Ljava/lang/String;

    .line 105
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".subType."

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 106
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 107
    invoke-static {v3, v4}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 108
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 109
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/e;->a:Ljava/lang/String;

    .line 110
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".label"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 111
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 112
    invoke-static {v1, v3}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    .line 113
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/e;->a:Ljava/lang/String;

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".title"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 115
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 116
    invoke-static {p0, p1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    .line 117
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/Q2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/poa/r;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/poa/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/x;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->g:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 118
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch v5, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->f:Ljava/util/ArrayList;

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->e:Ljava/lang/String;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v3

    move-object v14, v4

    move-object v13, v5

    move-object v12, v6

    :goto_1
    move-object v15, v1

    move-object v11, v7

    goto/16 :goto_c

    :pswitch_1
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->c:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    check-cast v6, Ljava/lang/CharSequence;

    iget-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v22, v5

    move-object v5, v1

    move-object v1, v7

    :goto_2
    move-object/from16 v7, v22

    goto/16 :goto_a

    :pswitch_2
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_4
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->c:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    iget-object v9, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/Q2;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :pswitch_5
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Q2;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_6
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 119
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->j:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "buildMoreExamplesEvent, preset = "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v9, "SNSPoaViewModelV2"

    invoke-static {v2, v9, v5}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    return-object v8

    .line 120
    :cond_1
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->h:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    .line 121
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v2, v6, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_2

    goto/16 :goto_b

    .line 122
    :cond_2
    :goto_3
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-nez v9, :cond_3

    return-object v8

    .line 123
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 124
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 125
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    iput-object v9, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->c:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->d:Ljava/lang/Object;

    const/4 v10, 0x2

    iput v10, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    const-string/jumbo v10, "sns_poa_instructions_validMonth"

    invoke-virtual {v0, v10, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_4

    goto/16 :goto_b

    :cond_4
    move-object/from16 v22, v10

    move-object v10, v1

    move-object v1, v2

    move-object/from16 v2, v22

    .line 126
    :goto_4
    move-object v11, v2

    check-cast v11, Ljava/lang/String;

    .line 127
    iget-object v2, v10, Lcom/sumsub/sns/internal/features/data/model/common/Q2;->a:Lcom/sumsub/sns/internal/features/data/model/common/S2;

    if-eqz v2, :cond_5

    .line 128
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/S2;->a:Ljava/lang/Boolean;

    .line 129
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    :cond_5
    if-eqz v6, :cond_6

    .line 130
    iget-object v2, v9, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 131
    const-string v6, "POA.documentTypes.poiAsPoa.title"

    invoke-static {v6, v2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 132
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/poa/m;

    invoke-direct {v6, v2}, Lcom/sumsub/sns/internal/features/presentation/poa/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v2

    .line 133
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 134
    :cond_6
    iget-object v2, v10, Lcom/sumsub/sns/internal/features/data/model/common/Q2;->b:Ljava/util/List;

    if-eqz v2, :cond_a

    .line 135
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/e;

    .line 136
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/poa/m;

    .line 137
    iget-object v12, v6, Lcom/sumsub/sns/internal/features/data/model/common/e;->a:Ljava/lang/String;

    .line 138
    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    const-string v13, "POA.documentTypes.%s.title"

    invoke-static {v13, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 139
    iget-object v13, v9, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 140
    invoke-static {v12, v13}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    if-eqz v11, :cond_9

    .line 141
    iget-object v13, v6, Lcom/sumsub/sns/internal/features/data/model/common/e;->b:Ljava/lang/Double;

    if-eqz v13, :cond_7

    .line 142
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    double-to-int v13, v13

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_8

    :cond_7
    const-string v13, ""

    :cond_8
    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v14, v12

    .line 143
    const-string/jumbo v12, "{poaValidMonths}"

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v7, v17

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    goto :goto_6

    :cond_9
    move-object v7, v12

    move-object v12, v8

    .line 144
    :goto_6
    invoke-static {v6, v9}, Lcom/sumsub/sns/internal/features/presentation/poa/x;->a(Lcom/sumsub/sns/internal/features/data/model/common/e;Lcom/sumsub/sns/internal/features/data/model/common/h;)Ljava/util/ArrayList;

    move-result-object v13

    const/16 v20, 0x3e

    const/16 v21, 0x0

    const-string v14, ", "

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v13 .. v21}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 145
    invoke-direct {v10, v7, v12, v6}, Lcom/sumsub/sns/internal/features/presentation/poa/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    goto :goto_5

    .line 146
    :cond_a
    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->c:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->d:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    const-string/jumbo v2, "sns_poa_instructions_weDontAcceptList"

    invoke-virtual {v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_b

    goto/16 :goto_b

    :cond_b
    :goto_7
    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_c

    const-string v2, "\n"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 147
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 148
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/poa/m;

    invoke-direct {v7, v6}, Lcom/sumsub/sns/internal/features/presentation/poa/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 149
    :cond_c
    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    const-string/jumbo v2, "sns_poa_instructions_weAccept"

    invoke-virtual {v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_d

    goto :goto_b

    .line 150
    :cond_d
    :goto_9
    check-cast v2, Ljava/lang/CharSequence;

    .line 151
    sget-object v6, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->SUCCESS_FILLED:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v6}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v6

    .line 152
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->c:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->d:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    const-string/jumbo v7, "sns_poa_instructions_weDontAccept"

    invoke-virtual {v0, v7, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_e

    goto :goto_b

    :cond_e
    move-object/from16 v22, v6

    move-object v6, v2

    move-object v2, v7

    goto/16 :goto_2

    .line 153
    :goto_a
    check-cast v2, Ljava/lang/CharSequence;

    .line 154
    sget-object v8, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->FAILURE_FILLED:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v8}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v8

    .line 155
    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->a:Ljava/lang/Object;

    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->b:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->c:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->d:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->e:Ljava/lang/String;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->f:Ljava/util/ArrayList;

    const/4 v9, 0x6

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/poa/r;->i:I

    const-string/jumbo v9, "sns_alert_action_dismiss"

    invoke-virtual {v0, v9, v3}, Lcom/sumsub/sns/core/presentation/base/p0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_f

    :goto_b
    return-object v4

    :cond_f
    move-object v13, v2

    move-object v2, v3

    move-object v12, v5

    move-object v10, v6

    move-object v14, v8

    goto/16 :goto_1

    .line 156
    :goto_c
    move-object/from16 v16, v2

    check-cast v16, Ljava/lang/CharSequence;

    .line 157
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/poa/n;

    invoke-direct/range {v9 .. v16}, Lcom/sumsub/sns/internal/features/presentation/poa/n;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/List;Ljava/lang/CharSequence;)V

    return-object v9

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/documents/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/poa/v;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/poa/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/x;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 50
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->c:Lcom/sumsub/sns/internal/features/domain/documents/p;

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->a:Lcom/sumsub/sns/internal/features/domain/documents/v;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->j:Lcom/sumsub/sns/internal/features/domain/utils/a;

    const-string v2, "SNSPoaViewModelV2"

    const-string v4, "Show warnings"

    invoke-static {p2, v2, v4}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->i:Lcom/sumsub/sns/internal/features/domain/documents/v;

    .line 53
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 54
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->v:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 55
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->a:Lcom/sumsub/sns/internal/features/domain/documents/v;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->c:Lcom/sumsub/sns/internal/features/domain/documents/p;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/poa/v;->f:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, v0

    move-object v0, p2

    move-object p2, v1

    move-object v1, v2

    .line 56
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 57
    invoke-virtual {v0, v1, p1, p2}, Lcom/sumsub/sns/internal/features/domain/documents/t;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/domain/documents/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/lang/Object;

    move-result-object p1

    .line 58
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    move-object p1, v0

    :cond_4
    check-cast p1, Ljava/util/Map;

    .line 59
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->m:Ljava/util/Map;

    .line 60
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->p:Lkotlinx/coroutines/flow/n;

    .line 61
    :cond_5
    invoke-interface {p2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 62
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_7

    .line 63
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 65
    check-cast v4, Lcom/sumsub/sns/internal/features/domain/documents/w;

    if-eqz p1, :cond_6

    .line 66
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/domain/documents/w;->e:Ljava/lang/String;

    .line 67
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    goto :goto_3

    :cond_6
    move-object v5, v0

    .line 68
    :goto_3
    sget-object v6, Lcom/sumsub/sns/internal/features/domain/documents/O;->a:Lcom/sumsub/sns/internal/features/domain/documents/O;

    const/16 v7, 0x1f

    const/4 v8, 0x0

    .line 69
    invoke-static {v4, v8, v5, v6, v7}, Lcom/sumsub/sns/internal/features/domain/documents/w;->a(Lcom/sumsub/sns/internal/features/domain/documents/w;ILjava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/documents/T;I)Lcom/sumsub/sns/internal/features/domain/documents/w;

    move-result-object v4

    .line 70
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    move-object v3, v0

    .line 71
    :cond_8
    invoke-interface {p2, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 72
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/documents/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->j:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onDocumentsUploadFinished, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SNSPoaViewModelV2"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->q:Lkotlinx/coroutines/flow/n;

    .line 3
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 4
    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    .line 5
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 6
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/domain/documents/l;

    if-eqz v0, :cond_1

    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 9
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->g()V

    .line 10
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/poa/h;

    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/poa/h;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    goto :goto_0

    .line 11
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/domain/documents/p;

    if-eqz v0, :cond_3

    .line 12
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/p;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/poa/x;->a(Lcom/sumsub/sns/internal/features/domain/documents/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 13
    :cond_3
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/domain/documents/e;

    if-nez p2, :cond_5

    .line 14
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/domain/documents/j;

    if-nez p2, :cond_5

    .line 15
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/n;

    if-eqz p1, :cond_4

    goto :goto_0

    .line 16
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 17
    :cond_5
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/Q2;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Ljava/util/ArrayList;
    .locals 11

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 73
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/Q2;->a:Lcom/sumsub/sns/internal/features/data/model/common/S2;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 75
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/S2;->a:Ljava/lang/Boolean;

    .line 76
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    if-eqz v2, :cond_2

    .line 77
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 78
    const-string v4, "POA.documentTypes.poiAsPoa.title"

    invoke-static {v4, v2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 79
    invoke-virtual {p0, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/x;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 80
    :cond_2
    const-string/jumbo v2, "sns_poa_instructions_validMonthShort"

    invoke-virtual {p3, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 81
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/Q2;->b:Ljava/util/List;

    if-eqz p2, :cond_a

    const/4 p3, 0x3

    .line 82
    invoke-static {p2, p3}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_a

    .line 83
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sumsub/sns/internal/features/data/model/common/e;

    .line 84
    iget-object v2, p3, Lcom/sumsub/sns/internal/features/data/model/common/e;->a:Ljava/lang/String;

    .line 85
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v10, 0x1

    invoke-static {v2, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v5, "POA.documentTypes.%s.title"

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v4, :cond_6

    .line 86
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/data/model/common/e;->b:Ljava/lang/Double;

    if-eqz p3, :cond_5

    .line 87
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    double-to-int p3, v5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object v6, p3

    goto :goto_4

    :cond_5
    :goto_3
    const-string p3, ""

    goto :goto_2

    :goto_4
    const/4 v8, 0x4

    const/4 v9, 0x0

    .line 88
    const-string/jumbo v5, "{poaValidMonths}"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    goto :goto_5

    :cond_6
    move-object p3, v0

    .line 89
    :goto_5
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 90
    invoke-static {v2, v5}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    if-eqz p3, :cond_8

    .line 91
    invoke-static {p3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_6

    :cond_7
    move v10, v3

    :cond_8
    :goto_6
    if-nez v10, :cond_9

    .line 92
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ")"

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 93
    :cond_9
    invoke-virtual {p0, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/x;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_1

    :cond_a
    return-object v1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;)Lkotlin/Unit;
    .locals 13

    .line 158
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->j:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onDocumentsSelected, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SNSPoaViewModelV2"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/utils/q;->a:Ljava/util/Map;

    .line 160
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/q;->b:Ljava/util/Map;

    .line 161
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 162
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->p:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 163
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 164
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 165
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 166
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 167
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 168
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 169
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lcom/sumsub/sns/internal/features/presentation/utils/s;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_2

    move-object v5, v2

    goto :goto_4

    .line 170
    :cond_2
    new-instance v5, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 171
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroid/graphics/Bitmap;

    .line 172
    iget-object v7, v3, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 173
    invoke-interface {p1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/domain/documents/c;

    if-eqz v3, :cond_3

    .line 174
    iget v3, v3, Lcom/sumsub/sns/internal/features/domain/documents/c;->a:I

    :goto_1
    move v8, v3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    goto :goto_1

    .line 175
    :goto_2
    invoke-interface {p1, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    .line 176
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->m:Ljava/util/Map;

    if-eqz v3, :cond_4

    invoke-interface {v3, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    move-object v11, v3

    goto :goto_3

    :cond_4
    move-object v11, v2

    :goto_3
    const/16 v12, 0x40

    .line 177
    invoke-direct/range {v5 .. v12}, Lcom/sumsub/sns/internal/features/domain/documents/w;-><init>(Landroid/graphics/Bitmap;Ljava/io/File;IZLjava/lang/String;Ljava/lang/CharSequence;I)V

    :goto_4
    if-eqz v5, :cond_1

    .line 178
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 179
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->p:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 180
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->l:Z

    if-eqz p1, :cond_6

    .line 181
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 182
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->i()V

    .line 183
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(ILjava/io/File;)V
    .locals 7

    .line 184
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->j:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onImageRotationChanged, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SNSPoaViewModelV2"

    invoke-static {v0, v2, v1}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->p:Lkotlinx/coroutines/flow/n;

    .line 186
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 187
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 188
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 190
    check-cast v5, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 191
    iget-object v6, v5, Lcom/sumsub/sns/internal/features/domain/documents/w;->b:Ljava/io/File;

    .line 192
    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x7b

    .line 193
    invoke-static {v5, p1, v3, v3, v6}, Lcom/sumsub/sns/internal/features/domain/documents/w;->a(Lcom/sumsub/sns/internal/features/domain/documents/w;ILjava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/documents/T;I)Lcom/sumsub/sns/internal/features/domain/documents/w;

    move-result-object v5

    .line 194
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object v3, v4

    .line 195
    :cond_3
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/documents/T;I)V
    .locals 7

    .line 28
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 29
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/s;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Upload progress "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", total:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 30
    const-string v1, "SNSPoaViewModelV2"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 31
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->q:Lkotlinx/coroutines/flow/n;

    .line 32
    :cond_0
    invoke-interface {p3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 33
    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    invoke-interface {p3, v0, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->p:Lkotlinx/coroutines/flow/n;

    .line 37
    :cond_1
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p3

    .line 38
    move-object v1, p3

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 39
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 41
    check-cast v4, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 42
    iget-object v5, v4, Lcom/sumsub/sns/internal/features/domain/documents/w;->e:Ljava/lang/String;

    .line 43
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    if-eqz v6, :cond_2

    .line 45
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v2

    .line 46
    :goto_1
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    const/16 v6, 0x3f

    .line 47
    invoke-static {v4, v5, v2, p2, v6}, Lcom/sumsub/sns/internal/features/domain/documents/w;->a(Lcom/sumsub/sns/internal/features/domain/documents/w;ILjava/lang/CharSequence;Lcom/sumsub/sns/internal/features/domain/documents/T;I)Lcom/sumsub/sns/internal/features/domain/documents/w;

    move-result-object v4

    .line 48
    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    move-object v2, v3

    .line 49
    :cond_5
    invoke-interface {v0, p3, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 8

    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->j:Lcom/sumsub/sns/internal/features/domain/utils/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 20
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 21
    const-string v1, "SNSPoaViewModelV2"

    const-string/jumbo v2, "onDocumentsUploadError"

    invoke-virtual {v0, v1, v2, p2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->q:Lkotlinx/coroutines/flow/n;

    .line 23
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 24
    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    .line 27
    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 3

    .line 94
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->k:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "* "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast v0, Lcom/sumsub/sns/internal/core/domain/d;

    .line 95
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 96
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 97
    invoke-static {p1, v0}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p1

    .line 98
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->o:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/poa/s;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/poa/s;-><init>(Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/poa/x;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/g;->n0(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public final e()V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->j:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 3
    .line 4
    const-string v1, "SNSPoaViewModelV2"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "uploadDocuments"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->p:Lkotlinx/coroutines/flow/n;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Ljava/util/List;

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v3

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v3

    .line 36
    move-object v4, v3

    .line 37
    .line 38
    check-cast v4, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 39
    .line 40
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/domain/documents/w;->f:Ljava/lang/CharSequence;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 46
    move-result v4

    .line 47
    .line 48
    if-nez v4, :cond_2

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v3, v1

    .line 51
    .line 52
    :cond_2
    check-cast v3, Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move-object v3, v1

    .line 55
    .line 56
    :goto_1
    if-eqz v3, :cond_4

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/poa/w;

    .line 63
    .line 64
    .line 65
    invoke-direct {v7, p0, v3, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/x;Lcom/sumsub/sns/internal/features/domain/documents/w;Lkotlin/coroutines/Continuation;)V

    .line 66
    const/4 v8, 0x3

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 73
    return-void

    .line 74
    .line 75
    :cond_4
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->m:Ljava/util/Map;

    .line 76
    .line 77
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->b:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 78
    .line 79
    const-string v3, "SNSImageDocumentsAwareViewModel"

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v3, v2}, Lcom/sumsub/sns/internal/features/domain/utils/a;->b(Lcom/sumsub/sns/internal/features/domain/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/common/F;

    .line 89
    .line 90
    .line 91
    invoke-direct {v7, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/common/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/G;Lkotlin/coroutines/Continuation;)V

    .line 92
    const/4 v8, 0x3

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    .line 97
    .line 98
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 99
    return-void
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
.end method

.method public final getDocumentType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 8

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/poa/o;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 9
    move-result-object v2

    .line 10
    .line 11
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/poa/t;

    .line 12
    .line 13
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/poa/o;

    .line 14
    .line 15
    .line 16
    invoke-direct {v5, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/x;Lcom/sumsub/sns/internal/features/presentation/poa/o;Lkotlin/coroutines/Continuation;)V

    .line 17
    const/4 v6, 0x3

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/poa/i;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/G;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 31
    move-object v2, p1

    .line 32
    .line 33
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/poa/i;

    .line 34
    .line 35
    iget p1, v2, Lcom/sumsub/sns/internal/features/presentation/poa/i;->a:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(I)V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;->p:Lkotlinx/coroutines/flow/n;

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 44
    move-result-object p1

    .line 45
    move-object v3, p1

    .line 46
    .line 47
    check-cast v3, Ljava/util/List;

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/poa/i;->a:I

    .line 58
    .line 59
    .line 60
    invoke-interface {v3, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v3, v1

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-interface {v0, p1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    move-result p1

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    return-void

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
