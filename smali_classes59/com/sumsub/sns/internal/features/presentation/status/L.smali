.class public final Lcom/sumsub/sns/internal/features/presentation/status/L;
.super Lcom/sumsub/sns/core/presentation/base/M0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic o:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final b:Lcom/sumsub/sns/internal/features/domain/W;

.field public final c:Lcom/sumsub/sns/internal/features/domain/z;

.field public final d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final e:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

.field public final f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final g:Lcom/sumsub/sns/internal/features/presentation/utils/e;

.field public final h:Lkotlinx/coroutines/flow/e;

.field public final i:Lkotlinx/coroutines/flow/e;

.field public j:Lcom/sumsub/sns/internal/features/data/model/common/p;

.field public k:Ljava/util/List;

.field public l:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

.field public m:Lkotlinx/coroutines/x1;

.field public final n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getSumsubIdChecked()Z"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v3, "sumsubIdChecked"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    aput-object v0, v2, v1

    .line 18
    .line 19
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/status/L;->o:[Lkotlin/reflect/KProperty;

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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/domain/W;Lcom/sumsub/sns/internal/features/domain/z;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/core/domain/d;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/presentation/main/j2;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p4}, Lcom/sumsub/sns/core/presentation/base/M0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->b:Lcom/sumsub/sns/internal/features/domain/W;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->c:Lcom/sumsub/sns/internal/features/domain/z;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->e:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 16
    .line 17
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/utils/e;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p6}, Lcom/sumsub/sns/internal/features/presentation/utils/e;-><init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;)V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->g:Lcom/sumsub/sns/internal/features/presentation/utils/e;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getViewState()Lkotlinx/coroutines/flow/r;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iget-object p2, p8, Lcom/sumsub/sns/internal/features/presentation/main/j2;->b:Lkotlinx/coroutines/flow/n;

    .line 29
    .line 30
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/status/K;

    .line 31
    const/4 p5, 0x0

    .line 32
    .line 33
    .line 34
    invoke-direct {p3, p5}, Lcom/sumsub/sns/internal/features/presentation/status/K;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2, p3}, Lkotlinx/coroutines/flow/g;->L(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->h:Lkotlinx/coroutines/flow/e;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getViewState()Lkotlinx/coroutines/flow/r;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    iget-object p2, p8, Lcom/sumsub/sns/internal/features/presentation/main/j2;->b:Lkotlinx/coroutines/flow/n;

    .line 47
    .line 48
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/status/u;

    .line 49
    .line 50
    .line 51
    invoke-direct {p3, p5}, Lcom/sumsub/sns/internal/features/presentation/status/u;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2, p3}, Lkotlinx/coroutines/flow/g;->L(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->E(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->i:Lkotlinx/coroutines/flow/e;

    .line 62
    .line 63
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 64
    .line 65
    sget-object p2, Lcom/sumsub/sns/internal/ff/a;->a0:Lcom/sumsub/sns/internal/ff/core/a;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 69
    move-result p2

    .line 70
    const/4 p3, 0x0

    .line 71
    .line 72
    if-eqz p2, :cond_0

    .line 73
    move p2, p3

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_0
    check-cast p4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a()Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    if-eqz p2, :cond_1

    .line 83
    .line 84
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->m:Lcom/sumsub/sns/internal/features/data/model/common/w3;

    .line 85
    .line 86
    if-eqz p2, :cond_1

    .line 87
    .line 88
    iget-boolean p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/w3;->b:Z

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const/4 p2, 0x1

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    move-result-object p2

    .line 95
    .line 96
    .line 97
    const-string/jumbo p4, "sumsub_id_status"

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, p7, p4, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 101
    .line 102
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 103
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/L;)Lcom/sumsub/sns/internal/features/presentation/status/U;
    .locals 11

    .line 250
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 251
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/h;->m:Lcom/sumsub/sns/internal/features/data/model/common/w3;

    if-eqz v0, :cond_2

    .line 252
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/w3;->a:Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;

    .line 253
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;->INTRUSIVE:Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;

    if-ne v0, v2, :cond_2

    .line 254
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/U;

    .line 255
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 256
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 257
    const-string/jumbo v3, "sumsubid.banner.title"

    invoke-static {v3, v2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 258
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 259
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/h;->v:Ljava/util/Map;

    .line 260
    const-string/jumbo v4, "sumsubid.banner.description"

    invoke-static {v4, v3}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    const/4 v9, 0x4

    const/4 v10, 0x0

    .line 261
    const-string/jumbo v6, "{learnMoreLink}"

    const-string/jumbo v7, "sumsub://sumsubid-learn-more"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 262
    :cond_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/status/L;->o:[Lkotlin/reflect/KProperty;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    .line 263
    invoke-direct {v0, v2, v1, p0}, Lcom/sumsub/sns/internal/features/presentation/status/U;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    return-object v0

    :cond_2
    return-object v1
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/Document;)Ljava/lang/CharSequence;
    .locals 0

    .line 59
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p0

    .line 60
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/v;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/status/v;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/v;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->g:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    iget-boolean p0, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->f:Z

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->e:Ljava/lang/CharSequence;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->d:Ljava/lang/CharSequence;

    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_1
    iget-boolean v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->f:Z

    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->d:Ljava/lang/CharSequence;

    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_2
    iget-boolean v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->f:Z

    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_3
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_4
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/intro/b;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_5
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/intro/b;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    new-instance v4, Lcom/sumsub/sns/internal/core/presentation/intro/b;

    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v5

    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    move-object v6, p1

    goto :goto_1

    :cond_1
    move-object v6, v3

    .line 8
    :goto_1
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->VIDEO_IDENT:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->getSceneName()Ljava/lang/String;

    move-result-object v9

    const/4 v8, 0x0

    const/4 v10, 0x1

    .line 9
    const-string v7, "VIDEO_IDENT"

    invoke-direct/range {v4 .. v10}, Lcom/sumsub/sns/internal/core/presentation/intro/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 10
    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/status/L;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_a

    :cond_2
    move-object v2, v4

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    move-object p1, v3

    goto :goto_4

    .line 11
    :cond_3
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    const-string/jumbo p1, "sns_status_VIDEO_IDENT_footerHtml_noAgreement"

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_a

    .line 12
    :cond_4
    :goto_3
    check-cast p1, Ljava/lang/String;

    .line 13
    :goto_4
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/intro/b;->e:Ljava/util/Map;

    .line 14
    const-string v4, "actionTitle"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_5

    check-cast v4, Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object v4, v3

    .line 15
    :goto_5
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->c:Lcom/sumsub/sns/internal/features/domain/z;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->b:Ljava/lang/Object;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->c:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    invoke-virtual {v5, v0}, Lcom/sumsub/sns/internal/features/domain/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_6

    goto/16 :goto_a

    :cond_6
    move-object v13, v4

    move-object v4, p1

    move-object p1, v5

    move-object v5, v2

    move-object v2, v13

    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 16
    sget-object v6, Lcom/sumsub/sns/internal/ff/a;->D:Lcom/sumsub/sns/internal/ff/core/a;

    .line 17
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_7

    :cond_7
    move-object v6, v3

    :goto_7
    if-eqz v6, :cond_b

    .line 18
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->b:Ljava/lang/Object;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->c:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->f:Z

    const/4 v3, 0x4

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    const-string/jumbo v3, "sns_alert_aboutToExitVerification"

    invoke-virtual {p0, v3, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_8

    goto :goto_a

    :cond_8
    move-object v13, v2

    move v2, p1

    move-object p1, v3

    move-object v3, v13

    .line 19
    :goto_8
    check-cast p1, Ljava/lang/CharSequence;

    .line 20
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->b:Ljava/lang/Object;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->c:Ljava/lang/Object;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->d:Ljava/lang/CharSequence;

    iput-boolean v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->f:Z

    const/4 v6, 0x5

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    const-string/jumbo v6, "sns_alert_action_confirm"

    invoke-virtual {p0, v6, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_9

    goto :goto_a

    :cond_9
    move-object v13, v6

    move-object v6, p1

    move-object p1, v13

    .line 21
    :goto_9
    check-cast p1, Ljava/lang/CharSequence;

    .line 22
    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->b:Ljava/lang/Object;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->c:Ljava/lang/Object;

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->d:Ljava/lang/CharSequence;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->e:Ljava/lang/CharSequence;

    iput-boolean v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->f:Z

    const/4 v7, 0x6

    iput v7, v0, Lcom/sumsub/sns/internal/features/presentation/status/v;->i:I

    const-string/jumbo v7, "sns_alert_action_cancel"

    invoke-virtual {p0, v7, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_a

    :goto_a
    return-object v1

    :cond_a
    move-object v0, p1

    move-object p1, p0

    move p0, v2

    move-object v2, v4

    move-object v4, v0

    move-object v1, v3

    move-object v3, v5

    move-object v0, v6

    .line 23
    :goto_b
    check-cast p1, Ljava/lang/CharSequence;

    .line 24
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/status/b;

    invoke-direct {v5, v0, v4, p1}, Lcom/sumsub/sns/internal/features/presentation/status/b;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    move v10, p0

    move-object v9, v1

    move-object v8, v2

    move-object v7, v3

    move-object v11, v5

    goto :goto_c

    :cond_b
    move v10, p1

    move-object v9, v2

    move-object v11, v3

    move-object v8, v4

    move-object v7, v5

    .line 25
    :goto_c
    sget-object v12, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->VideoIdent:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 26
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/status/S;

    invoke-direct/range {v6 .. v12}, Lcom/sumsub/sns/internal/features/presentation/status/S;-><init>(Ljava/util/Map;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLcom/sumsub/sns/internal/features/presentation/status/b;Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;)V

    return-object v6

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

.method public static a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/p;)Ljava/util/ArrayList;
    .locals 6

    .line 275
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 276
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    move-object v2, v1

    .line 277
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 278
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v4

    .line 279
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 280
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v5

    .line 281
    iget-boolean v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/n;->b:Z

    if-eqz v5, :cond_5

    .line 282
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v5

    .line 283
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/n;->d:Ljava/util/List;

    if-eqz v5, :cond_1

    .line 284
    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_1
    if-nez v2, :cond_2

    .line 285
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    new-instance v4, Lcom/sumsub/sns/internal/features/data/model/common/X;

    const-string v5, "VIDEO_IDENT"

    invoke-direct {v4, v5}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getResult()Lcom/sumsub/sns/internal/features/data/model/common/M;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V

    goto :goto_0

    .line 286
    :cond_2
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isRejected()Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_4

    .line 287
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isReviewing()Z

    move-result v4

    if-ne v4, v5, :cond_3

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isReviewing()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 288
    :cond_3
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    move-result v4

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    move-result v4

    if-nez v4, :cond_0

    .line 289
    :cond_4
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getResult()Lcom/sumsub/sns/internal/features/data/model/common/M;

    move-result-object v3

    invoke-static {v2, v1, v3, v5, v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->copy$default(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;ILjava/lang/Object;)Lcom/sumsub/sns/internal/features/data/model/common/Document;

    move-result-object v2

    goto :goto_0

    .line 290
    :cond_5
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    if-eqz v2, :cond_7

    .line 291
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/L;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 274
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/r;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/core/presentation/helper/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v7, 0x1

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/status/G;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/status/G;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/status/G;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/status/G;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 67
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    const-string/jumbo v6, "sns_status_REJECT_action_continue"

    const-string/jumbo v8, "sns_status_APPROVED_footerHtml"

    const/4 v9, 0x3

    const-string/jumbo v10, "sns_status_APPROVED_subtitle"

    const-string/jumbo v11, "sns_status_REJECT_footerHtml"

    const-string/jumbo v12, "sns_status_REJECT_subtitle"

    const/16 v13, 0xa

    const/4 v14, 0x0

    const/4 v15, 0x0

    packed-switch v5, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->f:Ljava/util/List;

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->e:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v6, Ljava/lang/CharSequence;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v8

    move-object v8, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v6

    move-object v6, v5

    move-object/from16 v5, v16

    move/from16 v16, v7

    move-object v7, v4

    goto/16 :goto_3d

    :pswitch_1
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v10, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v5

    move-object v5, v1

    move-object/from16 v1, v16

    move/from16 v16, v7

    goto/16 :goto_3b

    :pswitch_2
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v16, v7

    move-object v10, v8

    goto/16 :goto_3a

    :pswitch_3
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v5

    move-object v5, v1

    move-object/from16 v1, v16

    move/from16 v16, v7

    goto/16 :goto_39

    :pswitch_4
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v1

    move-object v1, v5

    move/from16 v16, v7

    move-object v5, v4

    goto/16 :goto_35

    :pswitch_5
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v6, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v16, v7

    goto/16 :goto_34

    :pswitch_6
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v5

    move-object v5, v1

    move-object/from16 v1, v16

    move/from16 v16, v7

    goto/16 :goto_33

    :pswitch_7
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->f:Ljava/util/List;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->e:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/status/N;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/status/N;

    iget-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v10, Lcom/sumsub/sns/internal/features/presentation/status/N;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v16, v7

    goto/16 :goto_25

    :pswitch_8
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->f:Ljava/util/List;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->e:Ljava/lang/Object;

    check-cast v6, Ljava/lang/CharSequence;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    check-cast v8, Ljava/lang/CharSequence;

    iget-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v10, Ljava/lang/CharSequence;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v11, Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v12, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v21, v1

    move-object/from16 v17, v10

    move-object v10, v11

    :goto_1
    move-object/from16 v20, v5

    move-object/from16 v19, v6

    move-object/from16 v18, v8

    goto/16 :goto_10

    :pswitch_9
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->f:Ljava/util/List;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->e:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    iget-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    check-cast v6, Ljava/lang/CharSequence;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v8, Ljava/lang/CharSequence;

    iget-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v11, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v11, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v12, v5

    move-object v5, v1

    move-object v1, v8

    move-object v8, v6

    move-object v6, v12

    move-object v12, v11

    goto/16 :goto_f

    :pswitch_a
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v10, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_b
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v8

    goto/16 :goto_d

    :pswitch_c
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v25, v5

    move-object v5, v1

    move-object/from16 v1, v25

    goto/16 :goto_c

    :pswitch_d
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v16, v7

    goto/16 :goto_30

    :pswitch_e
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v16, v7

    goto/16 :goto_2e

    :pswitch_f
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v16, v7

    goto/16 :goto_2a

    :pswitch_10
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_11
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_12
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_13
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_14
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_15
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->j:Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-nez v2, :cond_1

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 69
    :cond_1
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->k:Ljava/util/List;

    if-nez v5, :cond_2

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 70
    :cond_2
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->n()Z

    move-result v16

    if-eqz v16, :cond_8

    .line 71
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    move-result-object v1

    instance-of v1, v1, Lcom/sumsub/sns/internal/features/presentation/status/O;

    if-nez v1, :cond_3

    .line 72
    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    const-wide/16 v1, 0xbb8

    invoke-static {v1, v2, v3}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_3

    goto/16 :goto_3c

    :cond_3
    :goto_2
    const/4 v1, 0x2

    .line 73
    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v10, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    goto/16 :goto_3c

    :cond_4
    :goto_3
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_5

    .line 74
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v1, Lcom/sumsub/sns/internal/core/domain/d;

    .line 75
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 76
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 77
    invoke-static {v2, v1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v1

    goto :goto_4

    :cond_5
    move-object v1, v14

    .line 78
    :goto_4
    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 79
    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;

    invoke-direct {v5, v1, v14, v2}, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;-><init>(Ljava/lang/CharSequence;Landroid/text/Spanned;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 80
    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v8, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    goto/16 :goto_3c

    :cond_6
    move-object v1, v5

    .line 81
    :goto_5
    check-cast v2, Ljava/lang/CharSequence;

    .line 82
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->Approved:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 83
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/status/Q;

    invoke-direct {v4, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/status/Q;-><init>(Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;)V

    :goto_6
    move/from16 v16, v7

    :cond_7
    :goto_7
    move-object v7, v4

    goto/16 :goto_40

    .line 84
    :cond_8
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->o()Z

    move-result v16

    if-eqz v16, :cond_d

    .line 85
    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    const/4 v1, 0x4

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    const-string/jumbo v1, "sns_status_FINAL_REJECT_subtitle"

    invoke-virtual {v0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_9

    goto/16 :goto_3c

    :cond_9
    move-object/from16 v25, v2

    move-object v2, v1

    move-object/from16 v1, v25

    :goto_8
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_a

    .line 86
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v5, Lcom/sumsub/sns/internal/core/domain/d;

    .line 87
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 88
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 89
    invoke-static {v2, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v2

    goto :goto_9

    :cond_a
    move-object v2, v14

    .line 90
    :goto_9
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v1

    .line 91
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    if-eqz v1, :cond_b

    .line 92
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/n3;->a:Ljava/lang/String;

    if-eqz v1, :cond_b

    .line 93
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v5, Lcom/sumsub/sns/internal/core/domain/d;

    .line 94
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 95
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 96
    invoke-static {v1, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v1

    goto :goto_a

    :cond_b
    move-object v1, v14

    .line 97
    :goto_a
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 98
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;

    invoke-direct {v6, v2, v1, v5}, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;-><init>(Ljava/lang/CharSequence;Landroid/text/Spanned;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 99
    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    const-string/jumbo v1, "sns_status_FINAL_REJECT_footerHtml"

    invoke-virtual {v0, v1, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_c

    goto/16 :goto_3c

    :cond_c
    move-object v1, v6

    .line 100
    :goto_b
    check-cast v2, Ljava/lang/CharSequence;

    .line 101
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->FinallyRejected:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 102
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/status/Q;

    invoke-direct {v4, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/status/Q;-><init>(Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;)V

    goto :goto_6

    .line 103
    :cond_d
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->p()Z

    move-result v16

    const-string/jumbo v9, "sns_status_REJECT_title"

    if-eqz v16, :cond_3b

    .line 104
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_f

    :cond_e
    move/from16 v16, v7

    goto/16 :goto_29

    .line 105
    :cond_f
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 106
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    move-result v8

    if-nez v8, :cond_10

    .line 107
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    const/16 v5, 0x9

    iput v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v9, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_11

    goto/16 :goto_3c

    :cond_11
    move-object/from16 v25, v5

    move-object v5, v2

    move-object/from16 v2, v25

    .line 108
    :goto_c
    check-cast v2, Ljava/lang/CharSequence;

    .line 109
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    iput v13, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v12, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_12

    goto/16 :goto_3c

    :cond_12
    move-object v10, v1

    move-object v1, v2

    move-object v2, v8

    .line 110
    :goto_d
    check-cast v2, Ljava/lang/CharSequence;

    .line 111
    iput-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    const/16 v8, 0xb

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v11, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_13

    goto/16 :goto_3c

    :cond_13
    move-object/from16 v25, v5

    move-object v5, v1

    move-object v1, v2

    move-object v2, v8

    move-object/from16 v8, v25

    .line 112
    :goto_e
    check-cast v2, Ljava/lang/CharSequence;

    .line 113
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    .line 114
    iput-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->e:Ljava/lang/Object;

    iput-object v9, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->f:Ljava/util/List;

    const/16 v11, 0xc

    iput v11, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v6, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_14

    goto/16 :goto_3c

    :cond_14
    move-object v12, v6

    move-object v6, v2

    move-object v2, v12

    move-object v12, v10

    move-object v10, v8

    move-object v8, v1

    move-object v1, v5

    move-object v5, v9

    .line 115
    :goto_f
    check-cast v2, Ljava/lang/CharSequence;

    .line 116
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->c:Lcom/sumsub/sns/internal/features/domain/z;

    iput-object v12, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->e:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->f:Ljava/util/List;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->g:Ljava/lang/Object;

    const/16 v11, 0xd

    iput v11, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v9, v3}, Lcom/sumsub/sns/internal/features/domain/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v4, :cond_15

    goto/16 :goto_3c

    :cond_15
    move-object/from16 v17, v1

    move-object/from16 v21, v2

    move-object v2, v9

    goto/16 :goto_1

    :goto_10
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v22

    .line 117
    sget-object v23, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->TemporarilyDeclined:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 118
    new-instance v16, Lcom/sumsub/sns/internal/features/presentation/status/N;

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v24}, Lcom/sumsub/sns/internal/features/presentation/status/N;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;ZLcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;Lcom/sumsub/sns/internal/features/presentation/status/U;)V

    move-object/from16 v5, v16

    .line 119
    iget-object v1, v12, Lcom/sumsub/sns/internal/core/presentation/helper/c;->c:Ljava/util/List;

    .line 120
    invoke-static {v1, v10}, Lcom/sumsub/sns/internal/features/presentation/status/L;->a(Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/p;)Ljava/util/ArrayList;

    move-result-object v1

    .line 121
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v8, v15

    :goto_11
    if-ge v8, v6, :cond_16

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/2addr v8, v7

    .line 123
    check-cast v9, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 124
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v11

    move/from16 v16, v7

    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewed:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    const/16 v14, 0x20

    invoke-static {v11, v9, v7, v12, v14}, Lcom/sumsub/sns/internal/core/presentation/helper/b;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;Lcom/sumsub/sns/internal/core/presentation/helper/c;I)Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    move-result-object v7

    .line 125
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v7, v16

    const/4 v14, 0x0

    goto :goto_11

    :cond_16
    move/from16 v16, v7

    .line 126
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v15

    :cond_17
    :goto_12
    if-ge v7, v6, :cond_1a

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    move-object v9, v8

    check-cast v9, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    .line 128
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v11

    .line 129
    iget-boolean v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/n;->b:Z

    if-eqz v11, :cond_19

    .line 130
    invoke-virtual {v10}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object v11

    .line 131
    iget-object v11, v11, Lcom/sumsub/sns/internal/features/data/model/common/n;->d:Ljava/util/List;

    if-eqz v11, :cond_18

    .line 132
    iget-object v9, v9, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->f:Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 133
    iget-object v9, v9, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 134
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v9

    .line 135
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 136
    invoke-interface {v11, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_13

    :cond_18
    move v9, v15

    :goto_13
    if-nez v9, :cond_19

    move/from16 v9, v16

    goto :goto_14

    :cond_19
    move v9, v15

    :goto_14
    if-eqz v9, :cond_17

    .line 137
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 138
    :cond_1a
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2a

    .line 139
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1b

    goto :goto_15

    .line 140
    :cond_1b
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v15

    :cond_1c
    if-ge v7, v6, :cond_1d

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    .line 141
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->f:Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 142
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 143
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    move-result v8

    if-nez v8, :cond_1c

    move/from16 v6, v16

    goto :goto_16

    :cond_1d
    :goto_15
    move v6, v15

    :goto_16
    if-eqz v6, :cond_2a

    .line 144
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1e

    goto :goto_18

    .line 145
    :cond_1e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v15

    :cond_1f
    if-ge v7, v6, :cond_21

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    .line 146
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->b:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 147
    sget-object v9, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    if-ne v8, v9, :cond_20

    move/from16 v8, v16

    goto :goto_17

    :cond_20
    move v8, v15

    :goto_17
    if-nez v8, :cond_1f

    move v6, v15

    goto :goto_19

    :cond_21
    :goto_18
    move/from16 v6, v16

    :goto_19
    if-eqz v6, :cond_2a

    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_22

    goto :goto_1f

    .line 149
    :cond_22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v15

    :cond_23
    if-ge v7, v6, :cond_29

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    check-cast v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    .line 150
    iget-object v9, v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->f:Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 151
    iget-object v9, v9, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 152
    invoke-virtual {v9}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getReview()Lcom/sumsub/sns/internal/features/data/model/common/n3;

    move-result-object v9

    if-eqz v9, :cond_24

    .line 153
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/data/model/common/n3;->a:Ljava/lang/String;

    goto :goto_1a

    :cond_24
    const/4 v9, 0x0

    :goto_1a
    if-eqz v9, :cond_26

    .line 154
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_25

    goto :goto_1b

    :cond_25
    move v9, v15

    goto :goto_1c

    :cond_26
    :goto_1b
    move/from16 v9, v16

    :goto_1c
    if-nez v9, :cond_28

    .line 155
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->f:Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 156
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 157
    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/features/data/model/common/X;->c()Z

    move-result v8

    if-eqz v8, :cond_27

    goto :goto_1d

    :cond_27
    move v8, v15

    goto :goto_1e

    :cond_28
    :goto_1d
    move/from16 v8, v16

    :goto_1e
    if-nez v8, :cond_23

    move v6, v15

    goto :goto_20

    :cond_29
    :goto_1f
    move/from16 v6, v16

    :goto_20
    if-eqz v6, :cond_2a

    move/from16 v6, v16

    goto :goto_21

    :cond_2a
    move v6, v15

    :goto_21
    if-eqz v6, :cond_2b

    goto :goto_22

    :cond_2b
    const/4 v1, 0x0

    :goto_22
    if-eqz v1, :cond_31

    .line 158
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 159
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v8, v15

    :cond_2c
    :goto_23
    if-ge v8, v7, :cond_2d

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v8, v8, 0x1

    move-object v11, v9

    check-cast v11, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    .line 160
    invoke-interface {v1, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2c

    .line 161
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_23

    .line 162
    :cond_2d
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v6

    .line 163
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v1, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v9, v15

    :goto_24
    if-ge v9, v8, :cond_2e

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v9, v9, 0x1

    .line 165
    check-cast v11, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    .line 166
    iget-object v11, v11, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;->f:Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 167
    iget-object v11, v11, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 168
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 169
    :cond_2e
    iput-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->e:Ljava/lang/Object;

    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->f:Ljava/util/List;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->g:Ljava/lang/Object;

    const/16 v1, 0xe

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v7, v3}, Lcom/sumsub/sns/internal/features/presentation/status/L;->a(Ljava/util/ArrayList;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_2f

    goto/16 :goto_3c

    :cond_2f
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move-object v8, v5

    move-object v4, v6

    move-object v3, v10

    move-object v10, v8

    .line 170
    :goto_25
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v6, :cond_30

    move-object v4, v10

    goto :goto_27

    :cond_30
    move-object v2, v1

    move-object v1, v5

    move-object v5, v10

    move-object v10, v3

    goto :goto_26

    :cond_31
    move-object v1, v5

    move-object v8, v1

    :goto_26
    move-object v6, v2

    move-object v4, v5

    move-object v3, v10

    move-object v5, v1

    .line 171
    :goto_27
    iput-object v6, v5, Lcom/sumsub/sns/internal/features/presentation/status/T;->d:Ljava/util/List;

    .line 172
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v1

    .line 173
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    if-eqz v1, :cond_7

    .line 174
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/n3;->a:Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 175
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_32

    goto :goto_28

    :cond_32
    const/4 v1, 0x0

    :goto_28
    if-eqz v1, :cond_7

    .line 176
    iget-object v2, v8, Lcom/sumsub/sns/internal/features/presentation/status/T;->d:Ljava/util/List;

    .line 177
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 178
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/base/adapter/d;

    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/core/presentation/base/adapter/d;-><init>(Ljava/lang/String;)V

    .line 179
    invoke-interface {v2, v15, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 180
    iput-object v2, v8, Lcom/sumsub/sns/internal/features/presentation/status/T;->d:Ljava/util/List;

    .line 181
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_7

    .line 182
    :goto_29
    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    const/4 v1, 0x6

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v9, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_33

    goto/16 :goto_3c

    :cond_33
    move-object/from16 v25, v2

    move-object v2, v1

    move-object/from16 v1, v25

    :goto_2a
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_34

    .line 183
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v5, Lcom/sumsub/sns/internal/core/domain/d;

    .line 184
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 185
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 186
    invoke-static {v2, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v2

    goto :goto_2b

    :cond_34
    const/4 v2, 0x0

    .line 187
    :goto_2b
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v1

    .line 188
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    if-eqz v1, :cond_37

    .line 189
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/n3;->a:Ljava/lang/String;

    if-eqz v1, :cond_37

    .line 190
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_35

    move/from16 v5, v16

    goto :goto_2c

    :cond_35
    move v5, v15

    :goto_2c
    if-nez v5, :cond_36

    goto :goto_2d

    :cond_36
    const/4 v1, 0x0

    :goto_2d
    if-eqz v1, :cond_37

    .line 191
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v5, Lcom/sumsub/sns/internal/core/domain/d;

    .line 192
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 193
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 194
    invoke-static {v1, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v1

    if-eqz v1, :cond_37

    goto :goto_2f

    .line 195
    :cond_37
    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    const/4 v1, 0x7

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v12, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_38

    goto/16 :goto_3c

    :cond_38
    move-object/from16 v25, v2

    move-object v2, v1

    move-object/from16 v1, v25

    :goto_2e
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_39

    .line 196
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/L;->f:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v5, Lcom/sumsub/sns/internal/core/domain/d;

    .line 197
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 198
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 199
    invoke-static {v2, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v2

    move-object/from16 v25, v2

    move-object v2, v1

    move-object/from16 v1, v25

    goto :goto_2f

    :cond_39
    move-object v2, v1

    const/4 v1, 0x0

    .line 200
    :goto_2f
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 201
    new-instance v6, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;

    invoke-direct {v6, v2, v1, v5}, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;-><init>(Ljava/lang/CharSequence;Landroid/text/Spanned;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 202
    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    const/16 v1, 0x8

    iput v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v11, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_3a

    goto/16 :goto_3c

    :cond_3a
    move-object v1, v6

    .line 203
    :goto_30
    check-cast v2, Ljava/lang/CharSequence;

    .line 204
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->TemporarilyDeclined:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 205
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/status/Q;

    invoke-direct {v4, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/status/Q;-><init>(Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;)V

    goto/16 :goto_7

    :cond_3b
    move/from16 v16, v7

    .line 206
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3c

    goto :goto_31

    .line 207
    :cond_3c
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 208
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isApproved()Z

    move-result v7

    if-nez v7, :cond_3d

    move v2, v15

    goto :goto_32

    :cond_3e
    :goto_31
    move/from16 v2, v16

    :goto_32
    if-eqz v2, :cond_42

    .line 209
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    const/16 v2, 0xf

    iput v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    const-string/jumbo v2, "sns_status_APPROVED_title"

    invoke-virtual {v0, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_3f

    goto/16 :goto_3c

    .line 210
    :cond_3f
    :goto_33
    check-cast v2, Ljava/lang/CharSequence;

    .line 211
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    const/16 v6, 0x10

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v10, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_40

    goto/16 :goto_3c

    :cond_40
    move-object/from16 v25, v6

    move-object v6, v1

    move-object v1, v2

    move-object/from16 v2, v25

    .line 212
    :goto_34
    check-cast v2, Ljava/lang/CharSequence;

    .line 213
    iput-object v6, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    const/16 v7, 0x11

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v8, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_41

    goto/16 :goto_3c

    :cond_41
    move-object/from16 v25, v5

    move-object v5, v1

    move-object/from16 v1, v25

    move-object/from16 v25, v6

    move-object v6, v2

    move-object v2, v3

    move-object/from16 v3, v25

    .line 214
    :goto_35
    move-object v7, v2

    check-cast v7, Ljava/lang/CharSequence;

    .line 215
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    .line 216
    sget-object v11, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->Approved:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 217
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/status/N;

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v12}, Lcom/sumsub/sns/internal/features/presentation/status/N;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;ZLcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;Lcom/sumsub/sns/internal/features/presentation/status/U;)V

    :goto_36
    move-object v5, v1

    goto/16 :goto_3e

    .line 218
    :cond_42
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_43

    goto :goto_37

    .line 219
    :cond_43
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_44
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_45

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 220
    invoke-virtual {v7}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isRejected()Z

    move-result v7

    if-eqz v7, :cond_44

    move/from16 v2, v16

    goto :goto_38

    :cond_45
    :goto_37
    move v2, v15

    :goto_38
    if-eqz v2, :cond_4a

    .line 221
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    const/16 v2, 0x12

    iput v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v9, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_46

    goto :goto_3c

    .line 222
    :cond_46
    :goto_39
    check-cast v2, Ljava/lang/CharSequence;

    .line 223
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    const/16 v7, 0x13

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v12, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_47

    goto :goto_3c

    :cond_47
    move-object v10, v1

    move-object v1, v2

    move-object v2, v7

    .line 224
    :goto_3a
    check-cast v2, Ljava/lang/CharSequence;

    .line 225
    iput-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    const/16 v7, 0x14

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v11, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_48

    goto :goto_3c

    :cond_48
    move-object v8, v5

    move-object v5, v2

    move-object v2, v7

    .line 226
    :goto_3b
    check-cast v2, Ljava/lang/CharSequence;

    .line 227
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 228
    iput-object v10, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->a:Ljava/lang/Object;

    iput-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->b:Ljava/lang/Object;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->c:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->d:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->e:Ljava/lang/Object;

    iput-object v7, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->f:Ljava/util/List;

    const/16 v9, 0x15

    iput v9, v3, Lcom/sumsub/sns/internal/features/presentation/status/G;->j:I

    invoke-virtual {v0, v6, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_49

    :goto_3c
    return-object v4

    :cond_49
    move-object v6, v5

    move-object v5, v1

    move-object v1, v8

    move-object v8, v7

    move-object v7, v2

    move-object v2, v3

    move-object v3, v10

    .line 229
    :goto_3d
    move-object v9, v2

    check-cast v9, Ljava/lang/CharSequence;

    .line 230
    sget-object v11, Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;->TemporarilyDeclined:Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;

    .line 231
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/status/N;

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v12}, Lcom/sumsub/sns/internal/features/presentation/status/N;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;ZLcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;Lcom/sumsub/sns/internal/features/presentation/status/U;)V

    goto/16 :goto_36

    .line 232
    :cond_4a
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/status/O;->h:Lcom/sumsub/sns/internal/features/presentation/status/O;

    move-object v3, v1

    move-object v4, v2

    .line 233
    :goto_3e
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v5, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 234
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 235
    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 236
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings()Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    move-result-object v6

    sget-object v7, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewed:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    const/16 v8, 0x28

    invoke-static {v6, v5, v7, v3, v8}, Lcom/sumsub/sns/internal/core/presentation/helper/b;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;Lcom/sumsub/sns/internal/core/presentation/helper/c;I)Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    move-result-object v5

    .line 237
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3f

    .line 238
    :cond_4b
    iput-object v1, v4, Lcom/sumsub/sns/internal/features/presentation/status/T;->d:Ljava/util/List;

    goto/16 :goto_7

    .line 239
    :goto_40
    instance-of v1, v7, Lcom/sumsub/sns/internal/features/presentation/status/Q;

    if-eqz v1, :cond_50

    .line 240
    iget-object v1, v7, Lcom/sumsub/sns/internal/features/presentation/status/T;->d:Ljava/util/List;

    .line 241
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 242
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4c
    :goto_41
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;

    if-eqz v4, :cond_4c

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_41

    .line 243
    :cond_4d
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;

    if-eqz v1, :cond_4e

    .line 244
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/e;->d:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    goto :goto_42

    :cond_4e
    const/4 v1, 0x0

    .line 245
    :goto_42
    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getAutoCloseOnApproveTimeout()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_4f

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_43

    :cond_4f
    const/4 v9, 0x3

    .line 246
    :goto_43
    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    if-ne v1, v2, :cond_50

    if-lez v9, :cond_50

    .line 247
    new-instance v1, Lcom/sumsub/sns/internal/core/common/v;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/v;-><init>()V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v3, v9

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v3

    const/16 v5, 0xa

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 248
    :cond_50
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/status/H;

    const/4 v2, 0x0

    invoke-direct {v1, v7, v2}, Lcom/sumsub/sns/internal/features/presentation/status/H;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/T;Lkotlin/coroutines/Continuation;)V

    move/from16 v3, v16

    invoke-static {v0, v15, v1, v3, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 249
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/B3;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    move-object/from16 v4, p4

    move-object/from16 v1, p5

    instance-of v5, v1, Lcom/sumsub/sns/internal/features/presentation/status/w;

    if-eqz v5, :cond_0

    move-object v5, v1

    check-cast v5, Lcom/sumsub/sns/internal/features/presentation/status/w;

    iget v6, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->e:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->e:I

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/status/w;

    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/status/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 27
    iget v7, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->e:I

    const-string v8, "SNSApplicantStatusViewModel"

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v7, :cond_3

    if-eq v7, v10, :cond_2

    if-ne v7, v9, :cond_1

    iget-object v2, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->a:Ljava/lang/Object;

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v2, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->b:Ljava/util/List;

    iget-object v3, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->a:Ljava/lang/Object;

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p3, :cond_5

    if-eqz p2, :cond_5

    if-eqz v4, :cond_4

    .line 28
    iget-object v1, v4, Lcom/sumsub/sns/internal/features/data/model/common/B3;->a:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    goto :goto_1

    :cond_4
    move-object v1, v11

    .line 29
    :goto_1
    invoke-static {p2, p3, v1}, Lcom/sumsub/sns/internal/features/data/model/common/H;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;)Lcom/sumsub/sns/core/data/model/SNSSDKState;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    invoke-virtual {v7, v1}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    :cond_5
    if-eqz p3, :cond_6

    .line 30
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-ne v1, v10, :cond_6

    .line 31
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No documents"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 33
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 34
    const-string v3, "Error when getting data..."

    invoke-virtual {v2, v8, v3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 35
    const-string v2, "TYPE_UNKNOWN"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 36
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 37
    :cond_6
    iput-object p2, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->a:Ljava/lang/Object;

    iput-object p3, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->b:Ljava/util/List;

    iput v10, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->e:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/status/L;->b(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/B3;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_7

    goto :goto_3

    :cond_7
    move-object v3, p2

    move-object v2, p3

    :goto_2
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    if-eqz v1, :cond_d

    .line 38
    iput-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->j:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 39
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->k:Ljava/util/List;

    .line 40
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/helper/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    .line 41
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->l:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    .line 42
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/presentation/helper/c;->c:Ljava/util/List;

    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "showApplicantStatus status="

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " docs="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 44
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 45
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 46
    invoke-virtual {v3, v8, v2, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    iget-object v2, v1, Lcom/sumsub/sns/internal/core/presentation/helper/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    .line 48
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/status/s;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x0

    if-eq v2, v10, :cond_c

    if-eq v2, v9, :cond_b

    const/4 v4, 0x3

    if-eq v2, v4, :cond_a

    const/4 v3, 0x4

    if-eq v2, v3, :cond_9

    const/4 v1, 0x5

    if-ne v2, v1, :cond_8

    .line 49
    new-instance v1, Lcom/sumsub/sns/internal/core/common/v;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/v;-><init>()V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    goto :goto_4

    .line 50
    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 51
    :cond_9
    iput-object v1, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->a:Ljava/lang/Object;

    iput-object v11, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->b:Ljava/util/List;

    iput v9, v5, Lcom/sumsub/sns/internal/features/presentation/status/w;->e:I

    invoke-virtual {p0, v1, v5}, Lcom/sumsub/sns/internal/features/presentation/status/L;->a(Lcom/sumsub/sns/internal/core/presentation/helper/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_d

    :goto_3
    return-object v6

    .line 52
    :cond_a
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 53
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/status/I;

    invoke-direct {v2, v1, p0, v11}, Lcom/sumsub/sns/internal/features/presentation/status/I;-><init>(Lcom/sumsub/sns/internal/core/presentation/helper/c;Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v3, v2, v10, v11}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    goto :goto_4

    .line 54
    :cond_b
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 55
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/status/J;

    invoke-direct {v2, v1, p0, v11}, Lcom/sumsub/sns/internal/features/presentation/status/J;-><init>(Lcom/sumsub/sns/internal/core/presentation/helper/c;Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v3, v2, v10, v11}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    goto :goto_4

    .line 56
    :cond_c
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 57
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/status/F;

    invoke-direct {v2, v1, p0, v11}, Lcom/sumsub/sns/internal/features/presentation/status/F;-><init>(Lcom/sumsub/sns/internal/core/presentation/helper/c;Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v3, v2, v10, v11}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 58
    :cond_d
    :goto_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a(Ljava/util/ArrayList;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/status/x;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/status/x;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/x;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/status/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 264
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->c:Ljava/lang/String;

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->b:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, p1

    move-object v4, v1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->b:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v2

    move-object v2, p1

    move-object p1, v9

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 265
    sget-object p2, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 266
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->a:Ljava/util/List;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->b:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->f:I

    const-string/jumbo v2, "sns_step_VIDEO_IDENT_title"

    invoke-virtual {p0, v2, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v9, v2

    move-object v2, p2

    move-object p2, v9

    :goto_1
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_5

    const-string p2, ""

    .line 267
    :cond_5
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->a:Ljava/util/List;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->b:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->c:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/status/x;->f:I

    const-string/jumbo v3, "sns_iddoc_status_notSubmitted"

    invoke-virtual {p0, v3, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object v5, p2

    move-object p2, v0

    move-object v4, v2

    move-object v0, p1

    .line 268
    :goto_3
    move-object v6, p2

    check-cast v6, Ljava/lang/CharSequence;

    .line 269
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;

    .line 270
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;->VIDEO_IDENTIFICATION:Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;

    .line 271
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 272
    invoke-direct {v8, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/base/adapter/c;-><init>(Lcom/sumsub/sns/internal/core/presentation/base/adapter/SNSDocumentViewTypeInfo$Type;Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 273
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;

    const/4 v7, 0x1

    invoke-direct/range {v3 .. v8}, Lcom/sumsub/sns/internal/core/presentation/base/adapter/b;-><init>(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLcom/sumsub/sns/internal/core/presentation/base/adapter/c;)V

    return-object v3
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/y;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/status/y;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/y;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/y;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/y;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/y;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 61
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/y;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/y;->c:I

    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p1, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p1, :cond_4

    .line 63
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 64
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/j3;->c:Lcom/sumsub/sns/internal/features/data/model/common/D3;

    if-eqz p1, :cond_4

    .line 65
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/D3;->a:Ljava/lang/Boolean;

    .line 66
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :cond_4
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/B3;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    instance-of v6, v5, Lcom/sumsub/sns/internal/features/presentation/status/C;

    if-eqz v6, :cond_0

    move-object v6, v5

    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/status/C;

    iget v7, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->j:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->j:I

    goto :goto_0

    :cond_0
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/status/C;

    invoke-direct {v6, v0, v5}, Lcom/sumsub/sns/internal/features/presentation/status/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 1
    iget v8, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->j:I

    const-string v9, "SNSApplicantStatusViewModel"

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v8, :cond_2

    if-ne v8, v10, :cond_1

    iget v1, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->g:I

    iget v2, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->f:I

    iget-object v3, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iget-object v4, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->d:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iget-object v7, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->c:Ljava/util/List;

    iget-object v8, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v6, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v14, v1

    move v12, v2

    move-object v1, v6

    move-object v2, v8

    move-object v8, v4

    move-object v4, v3

    move-object v3, v7

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz v1, :cond_1c

    if-eqz v2, :cond_1c

    if-eqz v3, :cond_1c

    .line 2
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_c

    .line 3
    :cond_3
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v5

    .line 4
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/o;->e:Lcom/sumsub/sns/internal/features/data/model/common/n3;

    .line 5
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    move-result-object v8

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "On Load Data Success for applicant: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 6
    sget-object v12, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 7
    iget-object v13, v12, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    invoke-virtual {v13, v9, v8, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v8

    .line 10
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 11
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Review status: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " result="

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 12
    iget-object v12, v12, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 13
    invoke-virtual {v12, v9, v8, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v8

    .line 15
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-eqz v4, :cond_4

    .line 16
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/B3;->a:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    goto :goto_1

    :cond_4
    move-object v4, v11

    .line 17
    :goto_1
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v12

    .line 18
    iget-object v12, v12, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 19
    sget-object v13, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Init:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    const/4 v14, 0x0

    if-ne v12, v13, :cond_5

    move v12, v10

    goto :goto_2

    :cond_5
    move v12, v14

    :goto_2
    if-eqz v5, :cond_6

    .line 20
    iget-object v13, v5, Lcom/sumsub/sns/internal/features/data/model/common/n3;->c:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    goto :goto_3

    :cond_6
    move-object v13, v11

    .line 21
    :goto_3
    sget-object v15, Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;->Green:Lcom/sumsub/sns/internal/features/data/model/common/ReviewAnswerType;

    if-eq v13, v15, :cond_8

    if-eqz v5, :cond_7

    .line 22
    iget-object v5, v5, Lcom/sumsub/sns/internal/features/data/model/common/n3;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    goto :goto_4

    :cond_7
    move-object v5, v11

    .line 23
    :goto_4
    sget-object v13, Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;->Final:Lcom/sumsub/sns/internal/features/data/model/common/ReviewRejectType;

    if-ne v5, v13, :cond_9

    :cond_8
    move v14, v10

    .line 24
    :cond_9
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->c(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v5

    if-eqz v5, :cond_b

    iput-object v1, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object v2, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-object v3, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->c:Ljava/util/List;

    iput-object v8, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->d:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iput-object v4, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->e:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    iput v12, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->f:I

    iput v14, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->g:I

    iput v10, v6, Lcom/sumsub/sns/internal/features/presentation/status/C;->j:I

    invoke-virtual {v0, v6}, Lcom/sumsub/sns/internal/features/presentation/status/L;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_a

    return-object v7

    :cond_a
    :goto_5
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_b

    .line 25
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Skip:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    :goto_6
    move/from16 v21, v12

    move-object v12, v3

    move/from16 v3, v21

    goto :goto_7

    .line 26
    :cond_b
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewing:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_6

    .line 27
    :goto_7
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/status/s;->b:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_0

    if-eqz v3, :cond_c

    if-eqz v4, :cond_c

    .line 28
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Submitting:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto/16 :goto_b

    :cond_c
    if-eqz v12, :cond_d

    .line 29
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_9

    .line 30
    :cond_d
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 31
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v3

    if-eqz v3, :cond_e

    if-eqz v12, :cond_f

    .line 32
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_8

    .line 33
    :cond_f
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 34
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v3

    if-nez v3, :cond_10

    if-eqz v12, :cond_11

    .line 35
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_8

    .line 36
    :cond_11
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 37
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result v3

    if-eqz v3, :cond_12

    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Submitting:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    .line 38
    :cond_13
    :goto_8
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewing:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    .line 39
    :cond_14
    :goto_9
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->None:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    .line 40
    :pswitch_0
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Pending:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-ne v4, v1, :cond_1b

    .line 41
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Submitting:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    .line 42
    :pswitch_1
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Processing:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-ne v4, v1, :cond_1b

    .line 43
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Submitting:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    :pswitch_2
    if-eqz v14, :cond_16

    .line 44
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->b(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 45
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Skip:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    .line 46
    :cond_15
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewed:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    :cond_16
    if-eqz v12, :cond_17

    .line 47
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_17

    goto :goto_a

    .line 48
    :cond_17
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 49
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isReviewing()Z

    move-result v4

    if-nez v4, :cond_18

    .line 50
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->e(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result v1

    if-eqz v1, :cond_19

    .line 51
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Skip:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    .line 52
    :cond_19
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewed:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    goto :goto_b

    .line 53
    :cond_1a
    :goto_a
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Reviewing:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    .line 54
    :cond_1b
    :goto_b
    :pswitch_3
    new-instance v18, Lcom/sumsub/sns/internal/features/presentation/status/b0;

    invoke-direct/range {v18 .. v18}, Lcom/sumsub/sns/internal/features/presentation/status/b0;-><init>()V

    const/16 v19, 0x1f

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v20}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Show screen for the following documents: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Status: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 56
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 57
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 58
    invoke-virtual {v3, v9, v1, v11}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/helper/c;

    invoke-direct {v1, v5, v2, v12}, Lcom/sumsub/sns/internal/core/presentation/helper/c;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;)V

    return-object v1

    :cond_1c
    :goto_c
    return-object v11

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/status/A;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/status/A;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/A;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/status/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 60
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->e:I

    .line 62
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p1, v6, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    .line 63
    :cond_5
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-nez p1, :cond_6

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 64
    :cond_6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->e:I

    .line 65
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v2, v6, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object v7, v2

    move-object v2, p1

    move-object p1, v7

    .line 66
    :goto_2
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-nez p1, :cond_8

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 67
    :cond_8
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/utils/e;->b:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 68
    :cond_9
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->a:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/status/A;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_a

    :goto_3
    return-object v1

    :cond_a
    move-object v1, p1

    move-object p1, v0

    move-object v0, v2

    :goto_4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 69
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->b:Ljava/util/List;

    if-eqz p1, :cond_c

    .line 70
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_5

    .line 71
    :cond_b
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/e;->b:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    invoke-static {v0, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;)Z

    move-result p1

    xor-int/2addr p1, v5

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 72
    :cond_c
    :goto_5
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 11

    .line 73
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->g:Lcom/sumsub/sns/internal/features/presentation/utils/e;

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/status/a0;

    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/status/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;)V

    .line 74
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    new-instance v0, Lcom/sumsub/sns/internal/core/common/d1;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/common/d1;-><init>(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/presentation/utils/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final e()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->j:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 10
    .line 11
    const-string v2, "SNSApplicantStatusViewModel"

    .line 12
    .line 13
    .line 14
    const-string/jumbo v3, "onContinueClicked: applicant is null"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, v3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/e;->b:Lcom/sumsub/sns/internal/features/presentation/utils/a;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/status/E;

    .line 33
    .line 34
    .line 35
    invoke-direct {v5, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/status/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 43
    return-void

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/status/L;->f()V

    .line 47
    return-void
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
.end method

.method public final f()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 4
    move-result-object v1

    .line 5
    .line 6
    instance-of v1, v1, Lcom/sumsub/sns/internal/features/presentation/status/S;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/p;->a:Lcom/sumsub/sns/internal/features/presentation/status/p;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/status/T;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/status/T;->g:Lcom/sumsub/sns/internal/features/presentation/status/U;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 27
    .line 28
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/status/L;->o:[Lkotlin/reflect/KProperty;

    .line 29
    const/4 v3, 0x0

    .line 30
    .line 31
    aget-object v2, v2, v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/h;->m:Lcom/sumsub/sns/internal/features/data/model/common/w3;

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/w3;->a:Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;

    .line 56
    .line 57
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;->INTRUSIVE:Lcom/sumsub/sns/internal/features/data/model/common/SumsubIdType;

    .line 58
    .line 59
    if-ne v1, v2, :cond_1

    .line 60
    .line 61
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/status/o;->a:Lcom/sumsub/sns/internal/features/presentation/status/o;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 65
    return-void

    .line 66
    .line 67
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->l:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    .line 68
    .line 69
    if-nez v1, :cond_2

    .line 70
    return-void

    .line 71
    .line 72
    :cond_2
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;->Submitting:Lcom/sumsub/sns/internal/features/data/model/common/ApplicantStatus;

    .line 73
    .line 74
    if-ne v1, v2, :cond_3

    .line 75
    .line 76
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    .line 80
    .line 81
    const/16 v5, 0xe

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v2, 0x0

    .line 84
    const/4 v3, 0x0

    .line 85
    const/4 v4, 0x0

    .line 86
    move-object v0, p0

    .line 87
    .line 88
    .line 89
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 90
    return-void

    .line 91
    .line 92
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSEvent$UserStartedVerification;->INSTANCE:Lcom/sumsub/sns/core/data/listener/SNSEvent$UserStartedVerification;

    .line 101
    .line 102
    .line 103
    invoke-interface {v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSEventHandler;->onEvent(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 104
    .line 105
    :cond_4
    new-instance v1, Lcom/sumsub/sns/internal/core/common/t;

    .line 106
    .line 107
    .line 108
    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    .line 109
    .line 110
    const/16 v5, 0xe

    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v2, 0x0

    .line 113
    const/4 v3, 0x0

    .line 114
    const/4 v4, 0x0

    .line 115
    move-object v0, p0

    .line 116
    .line 117
    .line 118
    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 119
    return-void
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

.method public final getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/status/O;->h:Lcom/sumsub/sns/internal/features/presentation/status/O;

    .line 3
    return-object v0
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
.end method

.method public final getDocumentType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "Status"

    .line 3
    return-object v0
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
.end method

.method public final onAttach()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/C;->onAttach()V

    .line 4
    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    .line 9
    const-string v1, "SNSApplicantStatusViewModel"

    .line 10
    .line 11
    const-string v2, "Start listening data"

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->m:Lkotlinx/coroutines/x1;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    const/4 v1, 0x1

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v3, v1, v3}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->d:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 26
    .line 27
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->i:Lkotlinx/coroutines/flow/n;

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/status/z;

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/status/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/L;Lkotlin/coroutines/Continuation;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1, v2}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->m:Lkotlinx/coroutines/x1;

    .line 45
    return-void
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
.end method

.method public final onDetach()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v1, "SNSApplicantStatusViewModel"

    .line 7
    .line 8
    const-string v2, "Stop listening data"

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/L;->m:Lkotlinx/coroutines/x1;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v3, v1, v3}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 21
    :cond_0
    return-void
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
.end method
