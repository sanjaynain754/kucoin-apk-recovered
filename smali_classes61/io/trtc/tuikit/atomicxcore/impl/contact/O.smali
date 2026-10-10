.class public final Lio/trtc/tuikit/atomicxcore/impl/contact/O;
.super Lio/trtc/tuikit/atomicxcore/api/contact/ContactListStore;
.source "SourceFile"


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public volatile j:Lio/trtc/tuikit/atomicxcore/impl/contact/I;

.field public volatile k:Lio/trtc/tuikit/atomicxcore/impl/contact/J;

.field public volatile l:Lio/trtc/tuikit/atomicxcore/impl/contact/L;

.field public final m:Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;


# direct methods
.method public constructor <init>()V
    .locals 22

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/api/contact/ContactListStore;-><init>()V

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
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->a:Lkotlinx/coroutines/flow/n;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->b:Lkotlinx/coroutines/flow/n;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    iput-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->c:Lkotlinx/coroutines/flow/n;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    .line 42
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    iput-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->d:Lkotlinx/coroutines/flow/n;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    iput-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->e:Lkotlinx/coroutines/flow/n;

    .line 56
    const/4 v6, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    move-result-object v6

    .line 61
    .line 62
    .line 63
    invoke-static {v6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 64
    move-result-object v7

    .line 65
    .line 66
    iput-object v7, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->f:Lkotlinx/coroutines/flow/n;

    .line 67
    .line 68
    .line 69
    invoke-static {v6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    iput-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->g:Lkotlinx/coroutines/flow/n;

    .line 73
    const/4 v8, 0x0

    .line 74
    .line 75
    .line 76
    invoke-static {v8}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 77
    move-result-object v9

    .line 78
    .line 79
    iput-object v9, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->h:Lkotlinx/coroutines/flow/n;

    .line 80
    .line 81
    .line 82
    invoke-static {v8}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 83
    move-result-object v8

    .line 84
    .line 85
    iput-object v8, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->i:Lkotlinx/coroutines/flow/n;

    .line 86
    .line 87
    new-instance v10, Lio/trtc/tuikit/atomicxcore/impl/contact/I;

    .line 88
    .line 89
    .line 90
    invoke-direct {v10, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/I;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;)V

    .line 91
    .line 92
    iput-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->j:Lio/trtc/tuikit/atomicxcore/impl/contact/I;

    .line 93
    .line 94
    new-instance v10, Lio/trtc/tuikit/atomicxcore/impl/contact/J;

    .line 95
    .line 96
    .line 97
    invoke-direct {v10, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/J;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;)V

    .line 98
    .line 99
    iput-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->k:Lio/trtc/tuikit/atomicxcore/impl/contact/J;

    .line 100
    .line 101
    new-instance v10, Lio/trtc/tuikit/atomicxcore/impl/contact/L;

    .line 102
    .line 103
    .line 104
    invoke-direct {v10, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/L;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;)V

    .line 105
    .line 106
    iput-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->l:Lio/trtc/tuikit/atomicxcore/impl/contact/L;

    .line 107
    .line 108
    new-instance v10, Lio/trtc/tuikit/atomicxcore/impl/common/x;

    .line 109
    .line 110
    iget-object v11, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->j:Lio/trtc/tuikit/atomicxcore/impl/contact/I;

    .line 111
    .line 112
    .line 113
    invoke-direct {v10, v11}, Lio/trtc/tuikit/atomicxcore/impl/common/x;-><init>(Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;)V

    .line 114
    .line 115
    new-instance v11, Lio/trtc/tuikit/atomicxcore/impl/common/y;

    .line 116
    .line 117
    iget-object v12, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->k:Lio/trtc/tuikit/atomicxcore/impl/contact/J;

    .line 118
    .line 119
    .line 120
    invoke-direct {v11, v12}, Lio/trtc/tuikit/atomicxcore/impl/common/y;-><init>(Lcom/tencent/imsdk/v2/V2TIMGroupListener;)V

    .line 121
    .line 122
    .line 123
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 124
    move-result-object v12

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v10}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->addFriendListener(Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;)V

    .line 128
    .line 129
    .line 130
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 131
    move-result-object v10

    .line 132
    .line 133
    .line 134
    invoke-virtual {v10, v11}, Lcom/tencent/imsdk/v2/V2TIMManager;->addGroupListener(Lcom/tencent/imsdk/v2/V2TIMGroupListener;)V

    .line 135
    .line 136
    sget-object v10, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 137
    .line 138
    iget-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->l:Lio/trtc/tuikit/atomicxcore/impl/contact/L;

    .line 139
    .line 140
    const-string v11, "groupApplicationUnreadCountCleared"

    .line 141
    .line 142
    .line 143
    invoke-static {v11, v10}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 144
    .line 145
    new-instance v12, Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;

    .line 146
    .line 147
    .line 148
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 149
    move-result-object v13

    .line 150
    .line 151
    .line 152
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 153
    move-result-object v14

    .line 154
    .line 155
    .line 156
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 157
    move-result-object v15

    .line 158
    .line 159
    .line 160
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 161
    move-result-object v16

    .line 162
    .line 163
    .line 164
    invoke-static {v5}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 165
    move-result-object v17

    .line 166
    .line 167
    .line 168
    invoke-static {v7}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 169
    move-result-object v18

    .line 170
    .line 171
    .line 172
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 173
    move-result-object v19

    .line 174
    .line 175
    .line 176
    invoke-static {v9}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 177
    move-result-object v20

    .line 178
    .line 179
    .line 180
    invoke-static {v8}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 181
    move-result-object v21

    .line 182
    .line 183
    .line 184
    invoke-direct/range {v12 .. v21}, Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 185
    .line 186
    iput-object v12, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->m:Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;

    .line 187
    return-void
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

.method public static a(Lcom/tencent/imsdk/v2/V2TIMFriendInfo;)Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;
    .locals 10

    .line 17
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;

    .line 18
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserID()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    .line 19
    :cond_0
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;->USER:Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;

    .line 20
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserProfile()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getFaceUrl()Ljava/lang/String;

    move-result-object v3

    .line 21
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getFriendRemark()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getFriendRemark()Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v4, p0

    goto :goto_3

    .line 22
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserProfile()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserProfile()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 23
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserID()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :goto_3
    const/16 v8, 0x70

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 24
    invoke-direct/range {v0 .. v9}, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static a(Lcom/tencent/imsdk/v2/V2TIMGroupInfo;)Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;
    .locals 10

    .line 25
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;

    .line 26
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getGroupID()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getGroupID(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;->GROUP:Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;

    .line 28
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getFaceUrl()Ljava/lang/String;

    move-result-object v3

    .line 29
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getGroupName()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0x70

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 30
    invoke-direct/range {v0 .. v9}, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/ContactType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/trtc/tuikit/atomicxcore/api/contact/ContactOnlineStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;

    .line 4
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->getType()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 5
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 8
    move-object v2, v0

    check-cast v2, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;

    .line 9
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->getUserID()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, ""

    :cond_2
    move-object v3, v0

    .line 10
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->getFaceUrl()Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->getNickname()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->getNickname()Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v5, v0

    goto :goto_4

    .line 12
    :cond_4
    :goto_3
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->getUserID()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 13
    :goto_4
    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->getAddWording()Ljava/lang/String;

    move-result-object v8

    .line 14
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType$Companion;

    invoke-virtual {v2}, Lcom/tencent/imsdk/v2/V2TIMFriendApplication;->getType()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType;

    move-result-object v7

    .line 15
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v10}, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;-><init>(Lcom/tencent/imsdk/v2/V2TIMFriendApplication;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-object p1
.end method


# virtual methods
.method public final acceptFriendApplication(Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "info"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;->getApplication$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMFriendApplication;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/t;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/t;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;)V

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->acceptFriendApplication(Lcom/tencent/imsdk/v2/V2TIMFriendApplication;ILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

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

.method public final acceptGroupApplication(Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "info"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;->getApplication$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMGroupApplication;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;->getRequestMsg()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/u;

    .line 20
    .line 21
    .line 22
    invoke-direct {v3, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/u;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->acceptGroupApplication(Lcom/tencent/imsdk/v2/V2TIMGroupApplication;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

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
.end method

.method public final addFriend(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p3}, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->setAddWording(Ljava/lang/String;)V

    .line 15
    .line 16
    const-string p1, "Android"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->setAddSource(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2}, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->setFriendRemark(Ljava/lang/String;)V

    .line 23
    const/4 p1, 0x2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;->setAddType(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/contact/v;

    .line 33
    .line 34
    .line 35
    invoke-direct {p2, p4}, Lio/trtc/tuikit/atomicxcore/impl/contact/v;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0, p2}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->addFriend(Lcom/tencent/imsdk/v2/V2TIMFriendAddApplication;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 39
    return-void
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

.method public final clearFriendApplicationUnreadCount(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/w;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/w;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->setFriendApplicationRead(Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 13
    return-void
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

.method public final clearGroupApplicationUnreadCount(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/x;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/x;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->setGroupApplicationRead(Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 13
    return-void
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

.method public final createGroup(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "groupType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "groupName"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupType(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupName(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupID(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p4}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setFaceUrl(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    if-eqz p5, :cond_0

    .line 34
    .line 35
    new-instance p2, Ljava/util/ArrayList;

    .line 36
    .line 37
    const/16 p3, 0xa

    .line 38
    .line 39
    .line 40
    invoke-static {p5, p3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 41
    move-result p3

    .line 42
    .line 43
    .line 44
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    move-result-object p3

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    move-result p4

    .line 53
    .line 54
    if-eqz p4, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    move-result-object p4

    .line 59
    .line 60
    check-cast p4, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;

    .line 61
    .line 62
    new-instance p5, Lcom/tencent/imsdk/v2/V2TIMCreateGroupMemberInfo;

    .line 63
    .line 64
    .line 65
    invoke-direct {p5}, Lcom/tencent/imsdk/v2/V2TIMCreateGroupMemberInfo;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p4}, Lio/trtc/tuikit/atomicxcore/api/contact/ContactInfo;->getContactID()Ljava/lang/String;

    .line 69
    move-result-object p4

    .line 70
    .line 71
    .line 72
    invoke-virtual {p5, p4}, Lcom/tencent/imsdk/v2/V2TIMCreateGroupMemberInfo;->setUserID(Ljava/lang/String;)V

    .line 73
    .line 74
    const/16 p4, 0xc8

    .line 75
    .line 76
    .line 77
    invoke-virtual {p5, p4}, Lcom/tencent/imsdk/v2/V2TIMCreateGroupMemberInfo;->setRole(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    const/4 p2, 0x0

    .line 83
    .line 84
    :cond_1
    new-instance p3, Lio/trtc/tuikit/atomicxcore/impl/contact/y;

    .line 85
    .line 86
    .line 87
    invoke-direct {p3, p0, p6}, Lio/trtc/tuikit/atomicxcore/impl/contact/y;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0, p2, p3}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->createGroup(Lcom/tencent/imsdk/v2/V2TIMGroupInfo;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 91
    return-void
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
.end method

.method public final fetchBlackList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/z;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/z;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->getBlackList(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 13
    return-void
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

.method public final fetchFriendApplicationList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/A;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/A;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->getFriendApplicationList(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 13
    return-void
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

.method public final fetchFriendList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/d;->g:Lio/trtc/tuikit/atomicxcore/impl/common/d;

    .line 3
    .line 4
    const-string v1, "componentType"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v0, Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    const/16 v1, 0x3ef

    .line 15
    int-to-long v1, v1

    .line 16
    .line 17
    const-string v3, "UIComponentType"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    const-string/jumbo v1, "toString(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/m;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2}, Lio/trtc/tuikit/atomicxcore/impl/common/m;-><init>()V

    .line 40
    .line 41
    const-string v3, "reportTUIFeatureUsage"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/B;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/B;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->getFriendList(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 57
    return-void
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
.end method

.method public final fetchGroupApplicationList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/C;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/C;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->getGroupApplicationList(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 13
    return-void
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

.method public final fetchGroupInfo(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "groupID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->i:Lkotlinx/coroutines/flow/n;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/E;

    .line 22
    .line 23
    .line 24
    invoke-direct {v2, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/E;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->getGroupsInfo(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 28
    return-void
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

.method public final fetchJoinedGroupList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/F;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/F;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->getJoinedGroupList(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 13
    return-void
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

.method public final fetchUserInfo(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->h:Lkotlinx/coroutines/flow/n;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/H;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/H;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->getUsersInfo(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

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

.method public final getContactListState()Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/O;->m:Lio/trtc/tuikit/atomicxcore/api/contact/ContactListState;

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

.method public final joinGroup(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "groupID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/K;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p3}, Lio/trtc/tuikit/atomicxcore/impl/contact/K;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->joinGroup(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

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

.method public final refuseFriendApplication(Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "info"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;->getApplication$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMFriendApplication;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/M;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/M;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/api/contact/FriendApplicationInfo;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->refuseFriendApplication(Lcom/tencent/imsdk/v2/V2TIMFriendApplication;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

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
.end method

.method public final refuseGroupApplication(Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "info"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;->getApplication$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMGroupApplication;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;->getRequestMsg()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/N;

    .line 20
    .line 21
    .line 22
    invoke-direct {v3, p0, p2, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/N;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/O;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/api/contact/GroupApplicationInfo;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->refuseGroupApplication(Lcom/tencent/imsdk/v2/V2TIMGroupApplication;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

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
.end method
