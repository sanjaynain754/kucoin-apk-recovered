.class public final Lio/trtc/tuikit/atomicxcore/impl/room/T0;
.super Lio/trtc/tuikit/atomicxcore/api/room/RoomStore;
.source "SourceFile"


# static fields
.field public static final k:Lkotlin/Lazy;


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

.field public final e:I

.field public final f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

.field public final g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

.field public final h:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

.field public final i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

.field public final j:Lio/trtc/tuikit/atomicxcore/api/room/RoomState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/q0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/q0;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->k:Lkotlin/Lazy;

    .line 9
    return-void
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

.method public constructor <init>()V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomStore;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->a:Lkotlinx/coroutines/flow/n;

    .line 16
    .line 17
    const-string v2, ""

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->b:Lkotlinx/coroutines/flow/n;

    .line 24
    .line 25
    new-instance v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 26
    .line 27
    const/16 v22, 0x7fff

    .line 28
    .line 29
    const/16 v23, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    .line 35
    const-wide/16 v8, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    .line 38
    const-wide/16 v11, 0x0

    .line 39
    .line 40
    const-wide/16 v13, 0x0

    .line 41
    const/4 v15, 0x0

    .line 42
    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    const/16 v17, 0x0

    .line 46
    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x0

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    const/16 v21, 0x0

    .line 54
    .line 55
    .line 56
    invoke-direct/range {v3 .. v23}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    iput-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 63
    .line 64
    const-string v4, "file"

    .line 65
    .line 66
    const-string v5, "RoomStoreImpl"

    .line 67
    .line 68
    .line 69
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 72
    .line 73
    .line 74
    invoke-direct {v4, v5}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    iput-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->d:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 77
    .line 78
    const/16 v4, 0x14

    .line 79
    .line 80
    iput v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->e:I

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    .line 87
    const-string/jumbo v5, "sharedInstance(...)"

    .line 88
    .line 89
    .line 90
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    iput-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 93
    .line 94
    sget-object v5, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->CONFERENCE_LIST_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v5}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;

    .line 98
    move-result-object v5

    .line 99
    .line 100
    const-string v6, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager"

    .line 101
    .line 102
    .line 103
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    check-cast v5, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 106
    .line 107
    iput-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 108
    .line 109
    sget-object v6, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->CONFERENCE_INVITATION_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v6}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;

    .line 113
    move-result-object v6

    .line 114
    .line 115
    const-string v7, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager"

    .line 116
    .line 117
    .line 118
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    check-cast v6, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 121
    .line 122
    iput-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->h:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 123
    .line 124
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/room/G0;

    .line 125
    .line 126
    .line 127
    invoke-direct {v7, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/G0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;)V

    .line 128
    .line 129
    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/room/F0;

    .line 130
    .line 131
    .line 132
    invoke-direct {v8, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/F0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;)V

    .line 133
    .line 134
    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/room/y0;

    .line 135
    .line 136
    .line 137
    invoke-direct {v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/y0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;)V

    .line 138
    .line 139
    new-instance v10, Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 140
    .line 141
    .line 142
    invoke-direct {v10}, Lio/trtc/tuikit/atomicxcore/impl/common/q;-><init>()V

    .line 143
    .line 144
    iput-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v7}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, v8}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v9}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;)V

    .line 154
    .line 155
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/room/RoomState;

    .line 156
    .line 157
    .line 158
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 159
    move-result-object v1

    .line 160
    .line 161
    .line 162
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 163
    move-result-object v2

    .line 164
    .line 165
    .line 166
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 167
    move-result-object v3

    .line 168
    .line 169
    .line 170
    invoke-direct {v4, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/room/RoomState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 171
    .line 172
    iput-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->j:Lio/trtc/tuikit/atomicxcore/api/room/RoomState;

    .line 173
    return-void
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

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/room/T0;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/List;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v0, 0xa

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;->getUserID()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 42
    move-result-object p0

    .line 43
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object p2

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object v1

    .line 62
    move-object v2, v1

    .line 63
    .line 64
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;->getUserID()Ljava/lang/String;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 72
    move-result v2

    .line 73
    .line 74
    if-nez v2, :cond_1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    goto :goto_1

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 82
    move-result-object p0

    .line 83
    return-object p0
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


# virtual methods
.method public final acceptCall(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->h:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 8
    .line 9
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x6

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p2, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->accept(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 18
    return-void
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
.end method

.method public final addRoomListener(Lio/trtc/tuikit/atomicxcore/api/room/RoomListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

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
.end method

.method public final addScheduledAttendees(Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "userIDList"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 14
    .line 15
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x6

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p3, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->addAttendeesByAdmin(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    return-void
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
.end method

.method public final callUserToRoom(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "userIDList"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->h:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 14
    .line 15
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/room/J0;

    .line 16
    .line 17
    .line 18
    invoke-direct {v6, p5}, Lio/trtc/tuikit/atomicxcore/impl/room/J0;-><init>(Lio/trtc/tuikit/atomicxcore/api/room/CallUserToRoomCompletionHandler;)V

    .line 19
    move-object v2, p1

    .line 20
    move-object v3, p2

    .line 21
    move v4, p3

    .line 22
    move-object v5, p4

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->inviteUsers(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InviteUsersCallback;)V

    .line 26
    return-void
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
.end method

.method public final cancelCall(Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string p3, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo p3, "userIDList"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->h:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 14
    .line 15
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x7

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v1, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3, p1, p2, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->cancelInvitation(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    return-void
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
.end method

.method public final cancelScheduledRoom(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 8
    .line 9
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x6

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p2, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->cancelConference(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 18
    return-void
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
.end method

.method public final createAndJoinRoom(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v1, "options"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 24
    .line 25
    iput-object p1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;->getRoomName()Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;->getPassword()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->password:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;->isAllMicrophoneDisabled()Z

    .line 41
    move-result v1

    .line 42
    .line 43
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;->isAllCameraDisabled()Z

    .line 47
    move-result v1

    .line 48
    .line 49
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;->isAllScreenShareDisabled()Z

    .line 53
    move-result v1

    .line 54
    .line 55
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;->isAllMessageDisabled()Z

    .line 59
    move-result v1

    .line 60
    .line 61
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 62
    .line 63
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/K0;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, p0, p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/K0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/CreateRoomOptions;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->createRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 70
    return-void
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

.method public final endRoom(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 3
    .line 4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/L0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/L0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->destroyRoom(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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

.method public final getPendingCalls(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const-string p2, ""

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->h:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 12
    .line 13
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->e:I

    .line 14
    .line 15
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/room/M0;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/M0;-><init>(Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->getInvitationList(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$GetInvitationListCallback;)V

    .line 22
    return-void
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
.end method

.method public final getRoomInfo(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 8
    .line 9
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/N0;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/N0;-><init>(Lio/trtc/tuikit/atomicxcore/api/room/GetRoomInfoCompletionHandler;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->fetchConferenceInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchConferenceInfoCallback;)V

    .line 16
    return-void
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
.end method

.method public final getScheduledAttendees(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const-string p2, ""

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 12
    .line 13
    iget v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->e:I

    .line 14
    .line 15
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/room/O0;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p1, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/O0;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/room/T0;Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->fetchAttendeeList(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledAttendeesCallback;)V

    .line 22
    return-void
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
.end method

.method public final getScheduledRoomList(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const-string p1, ""

    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 7
    .line 8
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;->NOT_STARTED:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 9
    .line 10
    sget-object v2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;->RUNNING:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 11
    .line 12
    .line 13
    filled-new-array {v1, v2}, [Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iget v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->e:I

    .line 21
    .line 22
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/room/P0;

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, p1, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/P0;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/room/T0;Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->fetchScheduledConferenceList(Ljava/util/List;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;)V

    .line 29
    return-void
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
.end method

.method public final getState()Lio/trtc/tuikit/atomicxcore/api/room/RoomState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->j:Lio/trtc/tuikit/atomicxcore/api/room/RoomState;

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

.method public final joinRoom(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const-string p2, ""

    .line 10
    .line 11
    :cond_0
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;-><init>()V

    .line 15
    .line 16
    iput-object p2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;->password:Ljava/lang/String;

    .line 17
    .line 18
    sget-object p2, Lio/trtc/tuikit/atomicxcore/impl/room/p0;->b:Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/room/o0;->a()Lio/trtc/tuikit/atomicxcore/impl/room/p0;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomStore;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v3

    .line 43
    .line 44
    .line 45
    const-string/jumbo v4, "type is not supported"

    .line 46
    .line 47
    const-string v5, "getName(...)"

    .line 48
    .line 49
    const-class v6, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->k:Lkotlin/Lazy;

    .line 54
    .line 55
    .line 56
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    goto :goto_2

    .line 63
    .line 64
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 65
    .line 66
    const-string p2, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.room.RoomStore"

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 70
    throw p1

    .line 71
    .line 72
    :cond_2
    iget-object v3, p2, Lio/trtc/tuikit/atomicxcore/impl/room/p0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    move-result-object v7

    .line 77
    .line 78
    if-nez v7, :cond_4

    .line 79
    .line 80
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    .line 81
    .line 82
    .line 83
    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, p1, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    if-nez v3, :cond_3

    .line 90
    goto :goto_0

    .line 91
    :cond_3
    move-object v7, v3

    .line 92
    .line 93
    :cond_4
    :goto_0
    check-cast v7, Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    invoke-static {v7, v2, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object v3

    .line 98
    .line 99
    .line 100
    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object v8

    .line 102
    .line 103
    if-nez v8, :cond_6

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    move-result-object v8

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 111
    move-result-object v9

    .line 112
    .line 113
    .line 114
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    move-result v8

    .line 116
    .line 117
    if-eqz v8, :cond_5

    .line 118
    .line 119
    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 120
    .line 121
    .line 122
    invoke-direct {v8, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v7, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    goto :goto_1

    .line 127
    .line 128
    :cond_5
    new-instance p1, Ljava/lang/Exception;

    .line 129
    .line 130
    .line 131
    invoke-direct {p1, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 132
    throw p1

    .line 133
    :cond_6
    :goto_1
    move-object v3, v8

    .line 134
    .line 135
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomStore;

    .line 136
    .line 137
    :goto_2
    instance-of v7, v3, Lio/trtc/tuikit/atomicxcore/impl/room/c;

    .line 138
    const/4 v8, 0x0

    .line 139
    .line 140
    if-eqz v7, :cond_7

    .line 141
    .line 142
    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/room/c;

    .line 143
    goto :goto_3

    .line 144
    :cond_7
    move-object v3, v8

    .line 145
    .line 146
    :goto_3
    if-eqz v3, :cond_8

    .line 147
    .line 148
    check-cast v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 149
    .line 150
    .line 151
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    iget-object v7, v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 154
    .line 155
    iget-object v9, v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->v:Lio/trtc/tuikit/atomicxcore/impl/room/E;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7, v9}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 159
    .line 160
    iget-object v7, v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->A:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 161
    .line 162
    iget-object v9, v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->x:Lio/trtc/tuikit/atomicxcore/impl/room/f;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7, v9}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;)V

    .line 166
    .line 167
    iget-object v7, v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->z:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 168
    .line 169
    iget-object v3, v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->w:Lio/trtc/tuikit/atomicxcore/impl/room/h;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7, v3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;)V

    .line 173
    .line 174
    .line 175
    :cond_8
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 180
    move-result-object v2

    .line 181
    .line 182
    .line 183
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    move-result v2

    .line 185
    .line 186
    if-eqz v2, :cond_a

    .line 187
    .line 188
    sget-object p2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->k:Lkotlin/Lazy;

    .line 189
    .line 190
    .line 191
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 192
    move-result-object p2

    .line 193
    .line 194
    check-cast p2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 195
    .line 196
    if-eqz p2, :cond_9

    .line 197
    .line 198
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;

    .line 199
    goto :goto_6

    .line 200
    .line 201
    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    .line 202
    .line 203
    const-string p2, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore"

    .line 204
    .line 205
    .line 206
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 207
    throw p1

    .line 208
    .line 209
    :cond_a
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/room/p0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    move-result-object v2

    .line 214
    .line 215
    if-nez v2, :cond_c

    .line 216
    .line 217
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 218
    .line 219
    .line 220
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    move-result-object p2

    .line 225
    .line 226
    if-nez p2, :cond_b

    .line 227
    goto :goto_4

    .line 228
    :cond_b
    move-object v2, p2

    .line 229
    .line 230
    :cond_c
    :goto_4
    check-cast v2, Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    invoke-static {v2, v6, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    move-result-object p2

    .line 235
    .line 236
    .line 237
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    move-result-object v3

    .line 239
    .line 240
    if-nez v3, :cond_e

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 244
    move-result-object v3

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 248
    move-result-object v5

    .line 249
    .line 250
    .line 251
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    move-result v3

    .line 253
    .line 254
    if-eqz v3, :cond_d

    .line 255
    .line 256
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 257
    .line 258
    .line 259
    invoke-direct {v3, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v2, p2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    goto :goto_5

    .line 264
    .line 265
    :cond_d
    new-instance p1, Ljava/lang/Exception;

    .line 266
    .line 267
    .line 268
    invoke-direct {p1, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 269
    throw p1

    .line 270
    :cond_e
    :goto_5
    move-object p2, v3

    .line 271
    .line 272
    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;

    .line 273
    .line 274
    :goto_6
    instance-of v2, p2, Lio/trtc/tuikit/atomicxcore/impl/room/c;

    .line 275
    .line 276
    if-eqz v2, :cond_f

    .line 277
    move-object v8, p2

    .line 278
    .line 279
    check-cast v8, Lio/trtc/tuikit/atomicxcore/impl/room/c;

    .line 280
    .line 281
    :cond_f
    if-eqz v8, :cond_10

    .line 282
    .line 283
    check-cast v8, Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 284
    .line 285
    .line 286
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    iget-object p2, v8, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 289
    .line 290
    iget-object v0, v8, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->v:Lio/trtc/tuikit/atomicxcore/impl/room/E;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 294
    .line 295
    iget-object p2, v8, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->A:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 296
    .line 297
    iget-object v0, v8, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->x:Lio/trtc/tuikit/atomicxcore/impl/room/f;

    .line 298
    .line 299
    .line 300
    invoke-virtual {p2, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Observer;)V

    .line 301
    .line 302
    iget-object p2, v8, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->z:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 303
    .line 304
    iget-object v0, v8, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->w:Lio/trtc/tuikit/atomicxcore/impl/room/h;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p2, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;)V

    .line 308
    .line 309
    :cond_10
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 310
    .line 311
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->CONFERENCE:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 312
    .line 313
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/room/Q0;

    .line 314
    .line 315
    .line 316
    invoke-direct {v2, p0, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/Q0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2, p1, v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->enterRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$EnterRoomOptions;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetRoomInfoCallback;)V

    .line 320
    return-void
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
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final leaveRoom(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 3
    .line 4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/R0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/R0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/T0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 8
    const/4 p1, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->exitRoom(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 12
    return-void
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

.method public final rejectCall(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/CallRejectionReason;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "reason"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->h:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/room/l0;->h:[I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 21
    move-result p2

    .line 22
    .line 23
    aget p2, v0, p2

    .line 24
    const/4 v0, 0x1

    .line 25
    .line 26
    if-eq p2, v0, :cond_1

    .line 27
    const/4 v0, 0x2

    .line 28
    .line 29
    if-ne p2, v0, :cond_0

    .line 30
    .line 31
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;->IN_OTHER_CONFERENCE:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 38
    throw p1

    .line 39
    .line 40
    :cond_1
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;->REJECT_TO_ENTER:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;

    .line 41
    .line 42
    :goto_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 43
    const/4 v2, 0x6

    .line 44
    const/4 v3, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, p3, v3, v3, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1, p2, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->reject(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$RejectedReason;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 51
    return-void
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
.end method

.method public final removeRoomListener(Lio/trtc/tuikit/atomicxcore/api/room/RoomListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->i:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

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
.end method

.method public final removeScheduledAttendees(Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "userIDList"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 14
    .line 15
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x6

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p3, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->removeAttendeesByAdmin(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    return-void
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
.end method

.method public final reset()V
    .locals 23

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->d:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    const-string v2, "message"

    .line 10
    .line 11
    const-string v3, "reset"

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 19
    .line 20
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->a:Lkotlinx/coroutines/flow/n;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->b:Lkotlinx/coroutines/flow/n;

    .line 30
    .line 31
    const-string v2, ""

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 37
    .line 38
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 39
    .line 40
    const/16 v21, 0x7fff

    .line 41
    .line 42
    const/16 v22, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    .line 48
    const-wide/16 v7, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    .line 51
    const-wide/16 v10, 0x0

    .line 52
    .line 53
    const-wide/16 v12, 0x0

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    .line 57
    const/16 v16, 0x0

    .line 58
    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    const/16 v18, 0x0

    .line 62
    .line 63
    const/16 v19, 0x0

    .line 64
    .line 65
    const/16 v20, 0x0

    .line 66
    .line 67
    .line 68
    invoke-direct/range {v2 .. v22}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 72
    return-void
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
.end method

.method public final scheduleRoom(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "options"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x6

    .line 21
    .line 22
    .line 23
    invoke-direct {p2, p3, v1, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->scheduleConference(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 27
    return-void
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
.end method

.method public final updateRoomInfo(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/UpdateRoomOptions;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "options"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p1, "modifyFlagList"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->INVALID_PARAMETER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 29
    move-result p1

    .line 30
    .line 31
    const-string p2, "modifyFlagList is empty"

    .line 32
    .line 33
    .line 34
    invoke-interface {p4, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 39
    move-result p1

    .line 40
    const/4 v0, 0x1

    .line 41
    .line 42
    if-le p1, v0, :cond_1

    .line 43
    .line 44
    if-eqz p4, :cond_2

    .line 45
    .line 46
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->INVALID_PARAMETER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 50
    move-result p1

    .line 51
    .line 52
    const-string p2, "only one modification is allowed"

    .line 53
    .line 54
    .line 55
    invoke-interface {p4, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 56
    return-void

    .line 57
    :cond_1
    const/4 p1, 0x0

    .line 58
    .line 59
    .line 60
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/room/UpdateRoomOptions$ModifyFlag;

    .line 64
    .line 65
    sget-object p3, Lio/trtc/tuikit/atomicxcore/impl/room/H0;->a:[I

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 69
    move-result p1

    .line 70
    .line 71
    aget p1, p3, p1

    .line 72
    const/4 p3, 0x6

    .line 73
    const/4 v1, 0x0

    .line 74
    .line 75
    if-eq p1, v0, :cond_4

    .line 76
    const/4 v0, 0x2

    .line 77
    .line 78
    if-eq p1, v0, :cond_3

    .line 79
    :cond_2
    return-void

    .line 80
    .line 81
    :cond_3
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/UpdateRoomOptions;->getPassword()Ljava/lang/String;

    .line 85
    move-result-object p2

    .line 86
    .line 87
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, p4, v1, v1, p3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p2, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->updateRoomPasswordByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 94
    return-void

    .line 95
    .line 96
    :cond_4
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->f:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/room/UpdateRoomOptions;->getRoomName()Ljava/lang/String;

    .line 100
    move-result-object p2

    .line 101
    .line 102
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, p4, v1, v1, p3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p2, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->updateRoomNameByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 109
    return-void
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
.end method

.method public final updateScheduledRoom(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "roomID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "options"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "modifyFlagList"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->g:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    new-instance p2, Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;->ROOM_NAME:Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;

    .line 32
    .line 33
    .line 34
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->ROOM_NAME:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    :cond_0
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;->SCHEDULE_START_TIME:Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;

    .line 45
    .line 46
    .line 47
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->SCHEDULE_START_TIME:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    :cond_1
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;->SCHEDULE_END_TIME:Lio/trtc/tuikit/atomicxcore/api/room/ScheduleRoomOptions$ModifyFlag;

    .line 58
    .line 59
    .line 60
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 61
    move-result p3

    .line 62
    .line 63
    if-eqz p3, :cond_2

    .line 64
    .line 65
    sget-object p3, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->SCHEDULE_END_TIME:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    :cond_2
    new-instance p3, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 71
    const/4 v0, 0x6

    .line 72
    const/4 v2, 0x0

    .line 73
    .line 74
    .line 75
    invoke-direct {p3, p4, v2, v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->updateConferenceInfo(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 79
    return-void
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
.end method
