.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/E;
.super Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListStore;
.source "SourceFile"


# instance fields
.field public final a:Lkotlinx/coroutines/m0;

.field public final b:Landroid/os/Handler;

.field public c:Z

.field public final d:Ljava/lang/Runnable;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public h:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;

.field public i:J

.field public j:J

.field public k:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

.field public final l:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;

.field public volatile m:Lio/trtc/tuikit/atomicxcore/impl/conversation/q;

.field public volatile n:Lio/trtc/tuikit/atomicxcore/impl/conversation/v;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListStore;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->a:Lkotlinx/coroutines/m0;

    .line 14
    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 23
    .line 24
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->b:Landroid/os/Handler;

    .line 25
    .line 26
    new-instance v0, Leg0/a;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0}, Leg0/a;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;)V

    .line 30
    .line 31
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->d:Ljava/lang/Runnable;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->e:Lkotlinx/coroutines/flow/n;

    .line 42
    .line 43
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->f:Lkotlinx/coroutines/flow/n;

    .line 50
    .line 51
    const-wide/16 v3, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    .line 58
    invoke-static {v3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 59
    move-result-object v3

    .line 60
    .line 61
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->g:Lkotlinx/coroutines/flow/n;

    .line 62
    .line 63
    new-instance v4, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    .line 74
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 75
    move-result-object v3

    .line 76
    .line 77
    .line 78
    invoke-direct {v4, v0, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 79
    .line 80
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->l:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;

    .line 81
    .line 82
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/q;

    .line 83
    .line 84
    .line 85
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/q;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;)V

    .line 86
    .line 87
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->m:Lio/trtc/tuikit/atomicxcore/impl/conversation/q;

    .line 88
    .line 89
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/v;

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/v;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;)V

    .line 93
    .line 94
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->n:Lio/trtc/tuikit/atomicxcore/impl/conversation/v;

    .line 95
    .line 96
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/common/w;

    .line 97
    .line 98
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->m:Lio/trtc/tuikit/atomicxcore/impl/conversation/q;

    .line 99
    .line 100
    .line 101
    invoke-direct {v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/w;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 102
    .line 103
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/x;

    .line 104
    .line 105
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->n:Lio/trtc/tuikit/atomicxcore/impl/conversation/v;

    .line 106
    .line 107
    .line 108
    invoke-direct {v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/x;-><init>(Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;)V

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 112
    move-result-object v3

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->addConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v2}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->addFriendListener(Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;)V

    .line 123
    .line 124
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/conversation/l;

    .line 125
    const/4 v0, 0x0

    .line 126
    .line 127
    .line 128
    invoke-direct {v4, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/l;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lkotlin/coroutines/Continuation;)V

    .line 129
    const/4 v5, 0x3

    .line 130
    const/4 v6, 0x0

    .line 131
    const/4 v2, 0x0

    .line 132
    const/4 v3, 0x0

    .line 133
    .line 134
    .line 135
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 136
    return-void
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

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->c:Z

    .line 2
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    move-object/from16 v0, p0

    .line 3
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    .line 4
    sget-boolean v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->h:Z

    if-nez v2, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->h:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;->getFilter()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 6
    :goto_0
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->g:Lkotlinx/coroutines/flow/n;

    iget-wide v4, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->j:J

    .line 7
    sget-boolean v6, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->h:Z

    if-nez v6, :cond_2

    goto/16 :goto_c

    .line 8
    :cond_2
    sget-object v6, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v6

    const-string v7, "<get-values>(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 11
    sget-object v11, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v10, v2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 12
    invoke-virtual {v10}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getReceiveOption()Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    move-result-object v11

    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->NOT_NOTIFY:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    if-eq v11, v12, :cond_3

    .line 13
    invoke-virtual {v10}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getReceiveOption()Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    move-result-object v10

    sget-object v11, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->NOT_NOTIFY_EXCEPT_MENTION:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    if-ne v10, v11, :cond_4

    goto :goto_1

    .line 14
    :cond_4
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 15
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const-wide/16 v8, 0x0

    move-wide v10, v8

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    sget-object v14, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {v12}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getRawConversation$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMConversation;

    move-result-object v12

    if-eqz v12, :cond_6

    invoke-virtual {v12}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getUnreadCount()I

    move-result v13

    goto :goto_3

    :cond_6
    const/4 v13, 0x0

    :goto_3
    int-to-long v12, v13

    add-long/2addr v10, v12

    goto :goto_2

    .line 17
    :cond_7
    sget-object v6, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 19
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 20
    sget-object v16, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v15, v2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x1

    .line 21
    invoke-virtual {v15}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getReceiveOption()Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    move-result-object v1

    sget-object v13, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->NOT_NOTIFY:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    if-eq v1, v13, :cond_8

    .line 22
    invoke-virtual {v15}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getReceiveOption()Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    move-result-object v1

    sget-object v13, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->NOT_NOTIFY_EXCEPT_MENTION:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    if-ne v1, v13, :cond_9

    goto :goto_4

    .line 23
    :cond_9
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    const/16 v16, 0x1

    .line 24
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-wide v12, v8

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    sget-object v14, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getRawConversation$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMConversation;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getUnreadCount()I

    move-result v6

    goto :goto_6

    :cond_b
    const/4 v6, 0x0

    :goto_6
    int-to-long v14, v6

    add-long/2addr v12, v14

    goto :goto_5

    .line 26
    :cond_c
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v6, 0x0

    goto :goto_b

    .line 28
    :cond_d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v6, 0x0

    :cond_e
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 29
    sget-object v14, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v7, v2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;)Z

    move-result v14

    if-eqz v14, :cond_11

    .line 30
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getReceiveOption()Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    move-result-object v14

    sget-object v15, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->NOT_NOTIFY:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    if-eq v14, v15, :cond_11

    .line 31
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getReceiveOption()Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    move-result-object v14

    sget-object v15, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->NOT_NOTIFY_EXCEPT_MENTION:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    if-ne v14, v15, :cond_f

    goto :goto_9

    .line 32
    :cond_f
    sget-object v14, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getConversationID()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_11

    .line 33
    sget-object v14, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getConversationID()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_11

    .line 34
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getRawConversation$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMConversation;

    move-result-object v7

    if-eqz v7, :cond_10

    invoke-virtual {v7}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getUnreadCount()I

    move-result v7

    goto :goto_8

    :cond_10
    const/4 v7, 0x0

    :goto_8
    if-nez v7, :cond_11

    move/from16 v7, v16

    goto :goto_a

    :cond_11
    :goto_9
    const/4 v7, 0x0

    :goto_a
    if-eqz v7, :cond_e

    add-int/lit8 v6, v6, 0x1

    if-gez v6, :cond_e

    .line 35
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_7

    :cond_12
    :goto_b
    int-to-long v1, v6

    add-long/2addr v4, v1

    sub-long/2addr v4, v10

    sub-long/2addr v4, v12

    .line 36
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 37
    :goto_c
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;)V
    .locals 3

    .line 38
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;

    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;-><init>()V

    if-nez p1, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;->getValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setConversationType(I)V

    .line 40
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getConversationGroup()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 41
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setConversationGroup(Ljava/lang/String;)V

    .line 42
    :cond_1
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getMarkType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 43
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->getValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setMarkType(J)V

    .line 44
    :cond_2
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getHasUnreadCount()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 45
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setHasUnreadCount(Z)V

    .line 46
    :cond_3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getHasGroupAtInfo()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 47
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setHasGroupAtInfo(Z)V

    .line 48
    :cond_4
    :goto_0
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->unsubscribeUnreadMessageCountByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;)V

    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->k:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

    return-void
.end method

.method public final clearConversationMessages(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "conversationID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    const-string v2, "c2c_"

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x2

    .line 13
    const/4 v9, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v2, v7, v8, v9}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    const/4 v5, 0x4

    .line 21
    const/4 v6, 0x0

    .line 22
    .line 23
    const-string v3, ""

    .line 24
    const/4 v4, 0x0

    .line 25
    move-object v1, p1

    .line 26
    .line 27
    .line 28
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, p1

    .line 32
    move-object p1, v9

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    const-string v2, "group_"

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2, v7, v8, v9}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 41
    move-result v0

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    const/4 v5, 0x4

    .line 45
    const/4 v6, 0x0

    .line 46
    .line 47
    const-string v3, ""

    .line 48
    const/4 v4, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 52
    move-result-object v9

    .line 53
    .line 54
    :cond_1
    if-eqz p1, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 58
    move-result v0

    .line 59
    .line 60
    if-lez v0, :cond_2

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/m;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/m;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->clearC2CHistoryMessage(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 73
    return-void

    .line 74
    .line 75
    :cond_2
    if-eqz v9, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 79
    move-result p1

    .line 80
    .line 81
    if-lez p1, :cond_3

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/n;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/n;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v9, v0}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->clearGroupHistoryMessage(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 94
    :cond_3
    return-void
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
.end method

.method public final clearConversationUnreadCount(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 8

    .line 1
    .line 2
    const-string v0, "conversationID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/conversation/o;

    .line 12
    .line 13
    .line 14
    invoke-direct {v7, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/o;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    const-wide/16 v5, 0x0

    .line 19
    move-object v2, p1

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {v1 .. v7}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->cleanConversationUnreadMessageCount(Ljava/lang/String;JJLcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 23
    return-void
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

.method public final deleteConversation(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "conversationID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/r;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/r;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->deleteConversation(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

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

.method public final fetchConversationInfo(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "conversationID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/s;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/s;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/impl/conversation/E;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->getConversation(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

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

.method public final fetchConversationList(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "option"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;->getFilter()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;-><init>()V

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;->getValue()I

    .line 25
    move-result v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setConversationType(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getConversationGroup()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setConversationGroup(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getMarkType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->getValue()J

    .line 47
    move-result-wide v3

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3, v4}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setMarkType(J)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getHasUnreadCount()Ljava/lang/Boolean;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    move-result v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setHasUnreadCount(Z)V

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getHasGroupAtInfo()Ljava/lang/Boolean;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    move-result v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v0}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setHasGroupAtInfo(Z)V

    .line 77
    .line 78
    :cond_4
    :goto_0
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/d;->d:Lio/trtc/tuikit/atomicxcore/impl/common/d;

    .line 79
    .line 80
    const-string v1, "componentType"

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    new-instance v0, Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 89
    .line 90
    const/16 v1, 0x3ec

    .line 91
    int-to-long v3, v1

    .line 92
    .line 93
    const-string v1, "UIComponentType"

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    .line 103
    const-string/jumbo v1, "toString(...)"

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/common/m;

    .line 113
    .line 114
    .line 115
    invoke-direct {v3}, Lio/trtc/tuikit/atomicxcore/impl/common/m;-><init>()V

    .line 116
    .line 117
    const-string v4, "reportTUIFeatureUsage"

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v4, v0, v3}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 121
    .line 122
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->h:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;->getCount()I

    .line 130
    move-result v5

    .line 131
    .line 132
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/conversation/t;

    .line 133
    .line 134
    .line 135
    invoke-direct {v6, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/t;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 136
    .line 137
    const-wide/16 v3, 0x0

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->getConversationListByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;JILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 141
    return-void
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
.end method

.method public final fetchMoreConversationList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->f:Lkotlinx/coroutines/flow/n;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    const/16 v1, 0x1781

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    if-eqz p1, :cond_7

    .line 19
    .line 20
    const-string v0, "No more conversation"

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->h:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;

    .line 27
    .line 28
    if-eqz v0, :cond_6

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;->getFilter()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    new-instance v3, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;

    .line 35
    .line 36
    .line 37
    invoke-direct {v3}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;-><init>()V

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;->getValue()I

    .line 48
    move-result v2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setConversationType(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getConversationGroup()Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setConversationGroup(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getMarkType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->getValue()J

    .line 70
    move-result-wide v4

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v4, v5}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setMarkType(J)V

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getHasUnreadCount()Ljava/lang/Boolean;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    move-result v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setHasUnreadCount(Z)V

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getHasGroupAtInfo()Ljava/lang/Boolean;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    move-result v1

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setHasGroupAtInfo(Z)V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_0
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 103
    move-result-object v2

    .line 104
    .line 105
    iget-wide v4, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->i:J

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationFetchOption;->getCount()I

    .line 109
    move-result v6

    .line 110
    .line 111
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/conversation/u;

    .line 112
    .line 113
    .line 114
    invoke-direct {v7, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/u;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->getConversationListByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;JILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 118
    return-void

    .line 119
    .line 120
    :cond_6
    if-eqz p1, :cond_7

    .line 121
    .line 122
    const-string v0, "Please call fetchConversationList first"

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, v1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 126
    :cond_7
    return-void
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
.end method

.method public final getConversationListState()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->l:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListState;

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

.method public final getConversationTotalUnreadCount(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->a:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/conversation/x;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/x;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 15
    return-void
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

.method public final markConversation(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "conversationIDList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "markType"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->getValue()J

    .line 18
    move-result-wide v3

    .line 19
    .line 20
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/conversation/z;

    .line 21
    .line 22
    .line 23
    invoke-direct {v6, p4}, Lio/trtc/tuikit/atomicxcore/impl/conversation/z;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 24
    move-object v2, p1

    .line 25
    move v5, p3

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->markConversation(Ljava/util/List;JZLcom/tencent/imsdk/v2/V2TIMValueCallback;)V

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
.end method

.method public final muteConversation(Ljava/lang/String;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "conversationID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    const-string v2, "c2c_"

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x2

    .line 13
    const/4 v9, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v2, v7, v8, v9}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    const/4 v5, 0x4

    .line 21
    const/4 v6, 0x0

    .line 22
    .line 23
    const-string v3, ""

    .line 24
    const/4 v4, 0x0

    .line 25
    move-object v1, p1

    .line 26
    .line 27
    .line 28
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, p1

    .line 32
    move-object p1, v9

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    const-string v2, "group_"

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2, v7, v8, v9}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 41
    move-result v0

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    const/4 v5, 0x4

    .line 45
    const/4 v6, 0x0

    .line 46
    .line 47
    const-string v3, ""

    .line 48
    const/4 v4, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 52
    move-result-object v9

    .line 53
    .line 54
    :cond_1
    if-eqz p2, :cond_2

    .line 55
    move v7, v8

    .line 56
    .line 57
    :cond_2
    if-eqz v9, :cond_4

    .line 58
    .line 59
    .line 60
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 61
    move-result v0

    .line 62
    .line 63
    if-nez v0, :cond_3

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/A;

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, p3, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/A;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v9, v7, v0}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->setGroupReceiveMessageOpt(Ljava/lang/String;ILcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 77
    return-void

    .line 78
    .line 79
    :cond_4
    :goto_1
    if-eqz p1, :cond_6

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 83
    move-result v0

    .line 84
    .line 85
    if-nez v0, :cond_5

    .line 86
    goto :goto_2

    .line 87
    .line 88
    .line 89
    :cond_5
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/B;

    .line 97
    .line 98
    .line 99
    invoke-direct {v2, p3, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/B;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1, v7, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->setC2CReceiveMessageOpt(Ljava/util/List;ILcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 103
    return-void

    .line 104
    .line 105
    :cond_6
    :goto_2
    if-eqz p3, :cond_7

    .line 106
    .line 107
    const/16 p1, 0x1781

    .line 108
    .line 109
    const-string p2, "conversationID is invalid"

    .line 110
    .line 111
    .line 112
    invoke-interface {p3, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 113
    :cond_7
    return-void
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

.method public final pinConversation(Ljava/lang/String;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "conversationID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/C;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0, p3, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/C;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->pinConversation(Ljava/lang/String;ZLcom/tencent/imsdk/v2/V2TIMCallback;)V

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

.method public final setConversationDraft(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "conversationID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    const-string v1, ""

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, p2

    .line 16
    .line 17
    :goto_0
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/D;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, p0, p3, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/D;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->setConversationDraft(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

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
