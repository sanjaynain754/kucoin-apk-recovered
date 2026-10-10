.class public final Lcom/sumsub/sns/internal/features/data/network/prooface/l;
.super Lokhttp3/WebSocketListener;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/network/prooface/o;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lokhttp3/WebSocketListener;-><init>()V

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
.method public final onClosed(Lokhttp3/WebSocket;ILjava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v0, "Liveness3dFaceRepository.onClosed: code="

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string p2, " reason="

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 31
    const/4 p2, 0x0

    .line 32
    .line 33
    iput-boolean p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->k:Z

    .line 34
    return-void
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
.end method

.method public final onClosing(Lokhttp3/WebSocket;ILjava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v0, "Liveness3dFaceRepository.onClosing: code="

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v0, " reason="

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    const/16 p1, 0xfa1

    .line 31
    const/4 p3, 0x1

    .line 32
    .line 33
    if-eq p2, p1, :cond_0

    .line 34
    .line 35
    const/16 p1, 0xfa2

    .line 36
    .line 37
    if-eq p2, p1, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 40
    .line 41
    iput-boolean p3, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->j:Z

    .line 42
    return-void

    .line 43
    .line 44
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    sget-object p2, Lcom/sumsub/sns/internal/features/data/network/prooface/g;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/g;

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, p2}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    .line 54
    .line 55
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 56
    .line 57
    const-string p2, "Liveness3dFaceRepository.updateToken"

    .line 58
    .line 59
    .line 60
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    iget p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->g:I

    .line 63
    add-int/2addr p2, p3

    .line 64
    .line 65
    iput p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->g:I

    .line 66
    const/4 p3, 0x3

    .line 67
    .line 68
    if-le p2, p3, :cond_3

    .line 69
    .line 70
    const-string p2, "Liveness3dFaceRepository. Max reconnect attempts reached"

    .line 71
    .line 72
    .line 73
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    new-instance p2, Lcom/sumsub/sns/internal/features/data/network/prooface/e;

    .line 80
    .line 81
    new-instance p3, Ljava/lang/Exception;

    .line 82
    .line 83
    const-string v0, "Invalid access token"

    .line 84
    .line 85
    .line 86
    invoke-direct {p3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p2, p3}, Lcom/sumsub/sns/internal/features/data/network/prooface/e;-><init>(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, p2}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    .line 93
    :cond_2
    return-void

    .line 94
    .line 95
    :cond_3
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->f:Lkotlinx/coroutines/m0;

    .line 96
    .line 97
    new-instance v4, Lcom/sumsub/sns/internal/features/data/network/prooface/n;

    .line 98
    const/4 p2, 0x0

    .line 99
    .line 100
    .line 101
    invoke-direct {v4, p1, p2}, Lcom/sumsub/sns/internal/features/data/network/prooface/n;-><init>(Lcom/sumsub/sns/internal/features/data/network/prooface/o;Lkotlin/coroutines/Continuation;)V

    .line 102
    const/4 v5, 0x3

    .line 103
    const/4 v6, 0x0

    .line 104
    const/4 v2, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    .line 107
    .line 108
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
.end method

.method public final onFailure(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 3
    .line 4
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->j:Z

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string p3, "Liveness3dFaceRepository.onFailure: e="

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string p3, " "

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    new-instance p3, Lcom/sumsub/sns/internal/features/data/network/prooface/e;

    .line 40
    .line 41
    .line 42
    invoke-direct {p3, p2}, Lcom/sumsub/sns/internal/features/data/network/prooface/e;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, p3}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    .line 46
    .line 47
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 48
    const/4 p2, 0x0

    .line 49
    .line 50
    iput-boolean p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->k:Z

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
.end method

.method public final onMessage(Lokhttp3/WebSocket;Ljava/lang/String;)V
    .locals 8

    .line 1
    const/4 p1, 0x1

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->c:Lxg0/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lxg0/a;->getSerializersModule()Lyg0/a;

    .line 9
    .line 10
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/z;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/prooface/z;->serializer()Ltg0/d;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Ltg0/c;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, p2}, Lxg0/a;->a(Ltg0/c;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;

    .line 23
    .line 24
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/B;

    .line 25
    .line 26
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->a:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->values()[Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;

    .line 33
    move-result-object v1

    .line 34
    array-length v3, v1

    .line 35
    const/4 v4, 0x0

    .line 36
    move v5, v4

    .line 37
    .line 38
    :goto_0
    if-ge v5, v3, :cond_1

    .line 39
    .line 40
    aget-object v6, v1, v5

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->getType()Ljava/lang/String;

    .line 44
    move-result-object v7

    .line 45
    .line 46
    .line 47
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    move-result v7

    .line 49
    .line 50
    if-eqz v7, :cond_0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/2addr v5, p1

    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    const/4 v6, 0x0

    .line 57
    .line 58
    :goto_1
    if-nez v6, :cond_2

    .line 59
    .line 60
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->unknown:Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;

    .line 61
    .line 62
    :cond_2
    sget-object v1, Lcom/sumsub/sns/internal/features/data/network/prooface/k;->a:[I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 66
    move-result v2

    .line 67
    .line 68
    aget v1, v1, v2

    .line 69
    .line 70
    if-eq v1, p1, :cond_6

    .line 71
    const/4 p1, 0x2

    .line 72
    .line 73
    if-eq v1, p1, :cond_5

    .line 74
    const/4 p1, 0x3

    .line 75
    .line 76
    if-eq v1, p1, :cond_4

    .line 77
    const/4 p1, 0x4

    .line 78
    .line 79
    if-eq v1, p1, :cond_3

    .line 80
    .line 81
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 82
    .line 83
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 84
    .line 85
    if-eqz p1, :cond_7

    .line 86
    .line 87
    new-instance v0, Lcom/sumsub/sns/internal/features/data/network/prooface/j;

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, p2}, Lcom/sumsub/sns/internal/features/data/network/prooface/j;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    .line 94
    return-void

    .line 95
    .line 96
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 99
    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    new-instance v1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;

    .line 103
    .line 104
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/i;-><init>(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1, v1}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    .line 111
    return-void

    .line 112
    .line 113
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 114
    .line 115
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 116
    .line 117
    if-eqz p1, :cond_7

    .line 118
    .line 119
    new-instance v1, Lcom/sumsub/sns/internal/features/data/network/prooface/d;

    .line 120
    .line 121
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 122
    .line 123
    .line 124
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/d;-><init>(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p1, v1}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    .line 128
    return-void

    .line 129
    .line 130
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 131
    .line 132
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 133
    .line 134
    if-eqz p1, :cond_7

    .line 135
    .line 136
    new-instance v1, Lcom/sumsub/sns/internal/features/data/network/prooface/f;

    .line 137
    .line 138
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 139
    .line 140
    .line 141
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/f;-><init>(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p1, v1}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    .line 145
    return-void

    .line 146
    .line 147
    :cond_6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 148
    .line 149
    iput v4, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->g:I

    .line 150
    .line 151
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 152
    .line 153
    if-eqz p1, :cond_7

    .line 154
    .line 155
    new-instance v1, Lcom/sumsub/sns/internal/features/data/network/prooface/h;

    .line 156
    .line 157
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->e:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 158
    .line 159
    .line 160
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/h;-><init>(Lcom/sumsub/sns/internal/features/data/model/prooface/M;)V

    .line 161
    .line 162
    .line 163
    invoke-interface {p1, v1}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    return-void

    .line 165
    .line 166
    :goto_2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 167
    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    const-string v1, "Can\'t parse liveness message="

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    move-result-object p2

    .line 184
    .line 185
    const-string v0, "Liveness3dFaceRepository"

    .line 186
    .line 187
    .line 188
    invoke-static {v0, p2, p1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 191
    .line 192
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 193
    .line 194
    if-eqz p2, :cond_7

    .line 195
    .line 196
    new-instance v0, Lcom/sumsub/sns/internal/features/data/network/prooface/e;

    .line 197
    .line 198
    .line 199
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/data/network/prooface/e;-><init>(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    invoke-interface {p2, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    .line 203
    :cond_7
    return-void
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
.end method

.method public final onOpen(Lokhttp3/WebSocket;Lokhttp3/Response;)V
    .locals 4

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/l;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    .line 3
    const/4 p2, 0x0

    .line 4
    .line 5
    iput-boolean p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->j:Z

    .line 6
    const/4 p2, 0x1

    .line 7
    .line 8
    iput-boolean p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->k:Z

    .line 9
    .line 10
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->b:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/prooface/A;

    .line 13
    .line 14
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->startLivenessSession:Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;->getType()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/prooface/P;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p2}, Lcom/sumsub/sns/internal/features/data/model/prooface/P;-><init>(Ljava/lang/String;)V

    .line 24
    const/4 p2, 0x0

    .line 25
    .line 26
    const/16 v3, 0x1c

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2, p2, v3}, Lcom/sumsub/sns/internal/features/data/model/prooface/A;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/prooface/P;Lcom/sumsub/sns/internal/features/data/model/prooface/u;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/A;)V

    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method
