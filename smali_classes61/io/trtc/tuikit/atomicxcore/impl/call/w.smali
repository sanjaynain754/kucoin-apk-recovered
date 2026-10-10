.class public final Lio/trtc/tuikit/atomicxcore/impl/call/w;
.super Lio/trtc/tuikit/atomicxcore/api/call/CallStore;
.source "SourceFile"


# static fields
.field public static final l:Lkotlin/Lazy;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/os/HandlerThread;

.field public c:Landroid/os/Handler;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public final j:Lkotlinx/coroutines/flow/n;

.field public final k:Lio/trtc/tuikit/atomicxcore/api/call/CallState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->SYNCHRONIZED:Lkotlin/LazyThreadSafetyMode;

    .line 3
    .line 4
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/call/c;->a:Lio/trtc/tuikit/atomicxcore/impl/call/c;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->l:Lkotlin/Lazy;

    .line 11
    return-void
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
.end method

.method public constructor <init>()V
    .locals 15

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 6
    .line 7
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    .line 10
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;->Unknown:Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;

    .line 13
    .line 14
    const-wide/16 v8, 0x0

    .line 15
    .line 16
    const-wide/16 v10, 0x0

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    const-string v2, ""

    .line 21
    .line 22
    const-string v3, ""

    .line 23
    .line 24
    const-string v5, ""

    .line 25
    const/4 v6, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v0 .. v11}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;JJ)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->d:Lkotlinx/coroutines/flow/n;

    .line 35
    .line 36
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->e:Lkotlinx/coroutines/flow/n;

    .line 46
    .line 47
    const-string v2, ""

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    new-instance v3, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 54
    .line 55
    sget-object v8, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->None:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    .line 59
    const-string v4, ""

    .line 60
    .line 61
    const-string v5, ""

    .line 62
    .line 63
    const-string v6, ""

    .line 64
    .line 65
    const-string v7, ""

    .line 66
    .line 67
    .line 68
    invoke-direct/range {v3 .. v10}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;ZZ)V

    .line 69
    .line 70
    .line 71
    invoke-static {v3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->f:Lkotlinx/coroutines/flow/n;

    .line 75
    .line 76
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 77
    .line 78
    .line 79
    invoke-direct {v4}, Lio/trtc/tuikit/atomicxcore/impl/common/q;-><init>()V

    .line 80
    .line 81
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 82
    .line 83
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 84
    .line 85
    .line 86
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->h:Lkotlinx/coroutines/flow/n;

    .line 93
    .line 94
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    .line 97
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 101
    move-result-object v5

    .line 102
    .line 103
    iput-object v5, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->i:Lkotlinx/coroutines/flow/n;

    .line 104
    .line 105
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 106
    .line 107
    .line 108
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-static {v6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 112
    move-result-object v6

    .line 113
    .line 114
    iput-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->j:Lkotlinx/coroutines/flow/n;

    .line 115
    .line 116
    new-instance v7, Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 120
    move-result-object v8

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 124
    move-result-object v9

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 128
    move-result-object v10

    .line 129
    .line 130
    .line 131
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 132
    move-result-object v11

    .line 133
    .line 134
    .line 135
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 136
    move-result-object v12

    .line 137
    .line 138
    .line 139
    invoke-static {v5}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 140
    move-result-object v13

    .line 141
    .line 142
    .line 143
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 144
    move-result-object v14

    .line 145
    .line 146
    .line 147
    invoke-direct/range {v7 .. v14}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 148
    .line 149
    iput-object v7, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->k:Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 150
    .line 151
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/call/h;

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/call/h;-><init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;)V

    .line 155
    .line 156
    .line 157
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/common/ContextProvider;->getApplicationContext()Landroid/content/Context;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 164
    move-result-object v1

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;)V

    .line 168
    .line 169
    .line 170
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 171
    move-result-object v0

    .line 172
    .line 173
    .line 174
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 175
    move-result-object v1

    .line 176
    .line 177
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/call/s;

    .line 178
    const/4 v0, 0x0

    .line 179
    .line 180
    .line 181
    invoke-direct {v4, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/call/s;-><init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;Lkotlin/coroutines/Continuation;)V

    .line 182
    const/4 v5, 0x3

    .line 183
    const/4 v6, 0x0

    .line 184
    const/4 v2, 0x0

    .line 185
    const/4 v3, 0x0

    .line 186
    .line 187
    .line 188
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 189
    return-void
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
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/call/w;)V
    .locals 17

    move-object/from16 v0, p0

    .line 31
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->c:Landroid/os/Handler;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->c:Landroid/os/Handler;

    .line 34
    :cond_0
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->b:Landroid/os/HandlerThread;

    if-eqz v1, :cond_1

    .line 35
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 36
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->b:Landroid/os/HandlerThread;

    .line 37
    :cond_1
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->d:Lkotlinx/coroutines/flow/n;

    .line 38
    :cond_2
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 39
    move-object v3, v2

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    const/16 v15, 0xff

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    .line 40
    invoke-static/range {v3 .. v16}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;JJILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    move-result-object v3

    .line 41
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 42
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getCameraStatus()Lkotlinx/coroutines/flow/w;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    if-ne v2, v3, :cond_3

    .line 43
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->closeLocalCamera()V

    .line 44
    :cond_3
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getMicrophoneStatus()Lkotlinx/coroutines/flow/w;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    .line 45
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->closeLocalMicrophone()V

    .line 46
    :cond_4
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->d:Lkotlinx/coroutines/flow/n;

    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    const/16 v14, 0x1ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    invoke-direct/range {v2 .. v15}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 47
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->f:Lkotlinx/coroutines/flow/n;

    .line 48
    :cond_5
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 49
    move-object v3, v1

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 50
    sget-object v8, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->None:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 51
    invoke-static/range {v3 .. v12}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;ZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    move-result-object v3

    .line 52
    invoke-interface {v2, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 53
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->h:Lkotlinx/coroutines/flow/n;

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 54
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->i:Lkotlinx/coroutines/flow/n;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 55
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->j:Lkotlinx/coroutines/flow/n;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/call/w;Ljava/lang/String;)V
    .locals 4

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_3

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 25
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->h:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 26
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 28
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :cond_2
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->h:Lkotlinx/coroutines/flow/n;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {p0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/call/w;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_7

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 3
    :cond_0
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->h:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    if-nez v2, :cond_3

    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    invoke-virtual {v3, p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setId(Ljava/lang/String;)V

    move-object/from16 v9, p2

    .line 6
    invoke-virtual {v3, v9}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->setStatus(Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;)V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/call/v;

    invoke-direct {v1, p0, v3}, Lio/trtc/tuikit/atomicxcore/impl/call/v;-><init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;)V

    .line 10
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    move-result-object p0

    .line 11
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/call/l;

    invoke-direct {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/call/l;-><init>(Lio/trtc/tuikit/atomicxcore/impl/call/v;)V

    invoke-virtual {p0, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->getFriendsInfo(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    return-void

    :cond_3
    move-object/from16 v9, p2

    .line 12
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->h:Lkotlinx/coroutines/flow/n;

    .line 13
    :goto_1
    invoke-interface {p0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 14
    move-object v2, v1

    check-cast v2, Ljava/util/LinkedHashSet;

    .line 15
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 17
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 18
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v12, 0x6f

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 19
    invoke-static/range {v4 .. v13}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;ZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    move-result-object v4

    .line 20
    :cond_4
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v9, p2

    goto :goto_2

    .line 21
    :cond_5
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->toCollection(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/util/LinkedHashSet;

    .line 22
    invoke-interface {p0, v1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    move-object/from16 v9, p2

    goto :goto_1

    :cond_7
    :goto_3
    return-void
.end method


# virtual methods
.method public final accept(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    const-string v1, "accept"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/call/d;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/call/d;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->accept(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final addListener(Lio/trtc/tuikit/atomicxcore/api/call/CallListener;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

    .line 11
    return-void
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
.end method

.method public final calls(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;Lio/trtc/tuikit/atomicxcore/api/call/CallParams;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userIdList"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "mediaType"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "calls, userIdList: "

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, " mediaType: "

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, " params: "

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    const-string v1, "message"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    const/4 v2, 0x0

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 51
    .line 52
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->f:Lkotlinx/coroutines/flow/n;

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 66
    move-result v2

    .line 67
    const/4 v3, 0x2

    .line 68
    .line 69
    if-nez v2, :cond_0

    .line 70
    .line 71
    const-string p1, "calls failed, selfId is empty"

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3, p1}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 78
    .line 79
    if-eqz p4, :cond_4

    .line 80
    .line 81
    sget p2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine;->ERROR_PARAM_INVALID:I

    .line 82
    .line 83
    .line 84
    invoke-interface {p4, p2, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 85
    return-void

    .line 86
    .line 87
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    .line 97
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    move-result v4

    .line 99
    .line 100
    if-eqz v4, :cond_2

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    move-result-object v4

    .line 105
    move-object v5, v4

    .line 106
    .line 107
    check-cast v5, Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    move-result v5

    .line 112
    .line 113
    if-nez v5, :cond_1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    goto :goto_0

    .line 118
    .line 119
    .line 120
    :cond_2
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toHashSet(Ljava/lang/Iterable;)Ljava/util/HashSet;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    .line 124
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 125
    move-result-object v7

    .line 126
    .line 127
    .line 128
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 129
    move-result p1

    .line 130
    .line 131
    if-eqz p1, :cond_3

    .line 132
    .line 133
    const-string p1, "calls failed, userIdList is empty"

    .line 134
    .line 135
    .line 136
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v3, p1}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 140
    .line 141
    if-eqz p4, :cond_4

    .line 142
    .line 143
    sget p2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine;->ERROR_PARAM_INVALID:I

    .line 144
    .line 145
    .line 146
    invoke-interface {p4, p2, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 147
    return-void

    .line 148
    .line 149
    .line 150
    :cond_3
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 151
    move-result p1

    .line 152
    .line 153
    const/16 v0, 0x9

    .line 154
    .line 155
    if-lt p1, v0, :cond_5

    .line 156
    .line 157
    const-string p1, "calls failed, exceeding max user number: 9"

    .line 158
    .line 159
    .line 160
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v3, p1}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 164
    .line 165
    if-eqz p4, :cond_4

    .line 166
    .line 167
    sget p1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine;->ERROR_PARAM_INVALID:I

    .line 168
    .line 169
    const-string p2, "calls failed, exceeding max user number"

    .line 170
    .line 171
    .line 172
    invoke-interface {p4, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 173
    :cond_4
    return-void

    .line 174
    .line 175
    :cond_5
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    if-nez p2, :cond_6

    .line 182
    const/4 v0, -0x1

    .line 183
    goto :goto_1

    .line 184
    .line 185
    :cond_6
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/call/a;->a:[I

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 189
    move-result v1

    .line 190
    .line 191
    aget v0, v0, v1

    .line 192
    :goto_1
    const/4 v1, 0x1

    .line 193
    .line 194
    if-eq v0, v1, :cond_8

    .line 195
    .line 196
    if-eq v0, v3, :cond_7

    .line 197
    .line 198
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;->Unknown:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 199
    goto :goto_2

    .line 200
    .line 201
    :cond_7
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;->Video:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 202
    goto :goto_2

    .line 203
    .line 204
    :cond_8
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;->Audio:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 205
    .line 206
    .line 207
    :goto_2
    invoke-static {p3}, Lio/trtc/tuikit/atomicxcore/impl/call/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallParams;)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;

    .line 208
    move-result-object v1

    .line 209
    .line 210
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/call/j;

    .line 211
    move-object v5, p0

    .line 212
    move-object v8, p2

    .line 213
    move-object v9, p3

    .line 214
    move-object v6, p4

    .line 215
    .line 216
    .line 217
    invoke-direct/range {v4 .. v9}, Lio/trtc/tuikit/atomicxcore/impl/call/j;-><init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;Lio/trtc/tuikit/atomicxcore/api/call/CallParams;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, v7, v0, v1, v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->calls(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V

    .line 221
    return-void
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
.end method

.method public final deleteRecentCalls(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "callIdList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "deleteRecentCalls, callIdList: "

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    const-string v1, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v1, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/call/k;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/call/k;-><init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->deleteRecordCalls(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ValueCallback;)V

    .line 43
    return-void
.end method

.method public final getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->k:Lio/trtc/tuikit/atomicxcore/api/call/CallState;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final hangup(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    const-string v1, "hangup"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/call/m;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/call/m;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->hangup(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final invite(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/call/CallParams;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "participantIds"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "invite, participantIds: "

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, " params: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    const-string v1, "message"

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 v1, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 37
    .line 38
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {p2}, Lio/trtc/tuikit/atomicxcore/impl/call/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallParams;)Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;

    .line 46
    move-result-object p2

    .line 47
    .line 48
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/call/n;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, p3}, Lio/trtc/tuikit/atomicxcore/impl/call/n;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->inviteUser(Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallParams;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ValueCallback;)V

    .line 55
    return-void
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
.end method

.method public final join(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "callId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "join, callId: "

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    const-string v1, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v1, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/call/p;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/call/p;-><init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->join(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V

    .line 43
    return-void
.end method

.method public final queryRecentCalls(Ljava/lang/String;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "cursor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "queryRecentCalls, cursor: "

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string p1, " count "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    const-string p2, "message"

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    const/4 p2, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static {p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 37
    .line 38
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/call/q;

    .line 45
    .line 46
    .line 47
    invoke-direct {p2, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/call/q;-><init>(Lio/trtc/tuikit/atomicxcore/impl/call/w;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 48
    const/4 p3, 0x0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p3, p2}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->queryRecentCalls(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$RecentCallsFilter;Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ValueCallback;)V

    .line 52
    return-void
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
.end method

.method public final reject(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    const-string v1, "reject"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/call/x;->a(ILjava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->a:Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/call/t;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/call/t;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->reject(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final removeListener(Lio/trtc/tuikit/atomicxcore/api/call/CallListener;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/call/w;->g:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

    .line 11
    return-void
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
.end method
