.class public final Lcom/tencent/liteav/videoproducer/encoder/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:J

.field private E:J

.field private final F:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private G:I

.field private final H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final I:Ljava/util/concurrent/atomic/AtomicLong;

.field public a:Ljava/lang/String;

.field public final b:Landroid/os/Bundle;

.field public c:Lcom/tencent/liteav/base/util/CustomHandler;

.field public d:Landroid/media/MediaCodec;

.field public e:Lcom/tencent/liteav/videoproducer/encoder/e$a;

.field public f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

.field public g:J

.field public h:Lcom/tencent/liteav/base/util/w;

.field public final i:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/concurrent/atomic/AtomicLong;

.field public final k:Ljava/lang/Runnable;

.field private final l:Lcom/tencent/liteav/videobase/videobase/c;

.field private final m:Lcom/tencent/liteav/videoproducer/producer/a$a;

.field private n:[B

.field private o:Z

.field private p:J

.field private q:J

.field private r:J

.field private s:I

.field private t:J

.field private u:J

.field private v:J

.field private w:J

.field private x:Z

.field private y:Lcom/tencent/liteav/videoproducer/producer/ServerVideoProducerConfig;

.field private z:D


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Lcom/tencent/liteav/videobase/videobase/c;Ljava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->n:[B

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    iput-boolean v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->o:Z

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->g:J

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->h:Lcom/tencent/liteav/base/util/w;

    .line 16
    .line 17
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->p:J

    .line 18
    .line 19
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->q:J

    .line 20
    .line 21
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->r:J

    .line 22
    const/4 v0, -0x1

    .line 23
    .line 24
    iput v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->s:I

    .line 25
    .line 26
    new-instance v0, Ljava/util/LinkedList;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->i:Ljava/util/Deque;

    .line 32
    .line 33
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->t:J

    .line 34
    .line 35
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->u:J

    .line 36
    .line 37
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->v:J

    .line 38
    .line 39
    const-wide/high16 v3, -0x8000000000000000L

    .line 40
    .line 41
    iput-wide v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->w:J

    .line 42
    const/4 v0, 0x0

    .line 43
    .line 44
    iput-boolean v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->x:Z

    .line 45
    .line 46
    const-wide/16 v3, 0x0

    .line 47
    .line 48
    iput-wide v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->z:D

    .line 49
    .line 50
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->A:J

    .line 51
    .line 52
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->B:J

    .line 53
    .line 54
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->C:J

    .line 55
    .line 56
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->D:J

    .line 57
    .line 58
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->E:J

    .line 59
    .line 60
    new-instance v3, Ljava/util/LinkedList;

    .line 61
    .line 62
    .line 63
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 64
    .line 65
    iput-object v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->F:Ljava/util/Deque;

    .line 66
    .line 67
    iput v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->G:I

    .line 68
    .line 69
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 73
    .line 74
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 75
    .line 76
    new-instance v0, Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->H:Ljava/util/List;

    .line 82
    .line 83
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 87
    .line 88
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->I:Ljava/util/concurrent/atomic/AtomicLong;

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, Lcom/tencent/liteav/videoproducer/encoder/c;->a(Lcom/tencent/liteav/videoproducer/encoder/b;)Ljava/lang/Runnable;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->k:Ljava/lang/Runnable;

    .line 95
    .line 96
    iput-object p2, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->l:Lcom/tencent/liteav/videobase/videobase/c;

    .line 97
    .line 98
    iput-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->b:Landroid/os/Bundle;

    .line 99
    .line 100
    sget-object p1, Lcom/tencent/liteav/videoproducer/producer/a$a;->a:Lcom/tencent/liteav/videoproducer/producer/a$a;

    .line 101
    .line 102
    iput-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->m:Lcom/tencent/liteav/videoproducer/producer/a$a;

    .line 103
    .line 104
    new-instance p1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string p2, "SurfaceInputVideoEncoder_"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 119
    move-result p2

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    iput-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    .line 129
    return-void
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

.method private a(Landroid/media/MediaCodec;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 96
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 97
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string v2, "destroy mediaCodec stop failed."

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Landroid/media/MediaCodec;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 99
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string v1, "destroy mediaCodec release failed."

    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    :goto_1
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string v0, "destroy mediaCodec"

    invoke-static {p1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "notifyEncodeError message = "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->e:Lcom/tencent/liteav/videoproducer/encoder/e$a;

    if-eqz p1, :cond_0

    .line 13
    sget-object v0, Lcom/tencent/liteav/videobase/videobase/e$a;->j:Lcom/tencent/liteav/videobase/videobase/e$a;

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$b;->onEncodedFail(Lcom/tencent/liteav/videobase/videobase/e$a;)V

    :cond_0
    return-void
.end method

.method private a(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 88
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string v2, "configure format: %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 89
    invoke-virtual {p1, p2, v2, v2, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v1

    :catchall_0
    move-exception p1

    .line 90
    iget-object p2, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string v1, "configure failed."

    invoke-static {p2, v1, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method private static a([B)[B
    .locals 6

    .line 91
    array-length v0, p0

    const/4 v1, 0x5

    if-le v0, v1, :cond_6

    const/4 v0, 0x0

    aget-byte v2, p0, v0

    if-nez v2, :cond_6

    const/4 v2, 0x1

    aget-byte v3, p0, v2

    if-nez v3, :cond_6

    const/4 v3, 0x2

    aget-byte v3, p0, v3

    if-nez v3, :cond_6

    const/4 v3, 0x3

    aget-byte v3, p0, v3

    if-nez v3, :cond_6

    const/4 v3, 0x4

    aget-byte v3, p0, v3

    if-nez v3, :cond_6

    aget-byte v1, p0, v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    move v1, v0

    :goto_0
    add-int/lit8 v3, v1, 0x3

    .line 92
    array-length v4, p0

    if-ge v3, v4, :cond_3

    .line 93
    aget-byte v4, p0, v1

    if-nez v4, :cond_1

    add-int/lit8 v5, v1, 0x1

    aget-byte v5, p0, v5

    if-nez v5, :cond_1

    add-int/lit8 v5, v1, 0x2

    aget-byte v5, p0, v5

    if-nez v5, :cond_1

    aget-byte v3, p0, v3

    if-eq v3, v2, :cond_4

    :cond_1
    if-nez v4, :cond_2

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, p0, v3

    if-nez v3, :cond_2

    add-int/lit8 v3, v1, 0x2

    aget-byte v3, p0, v3

    if-ne v3, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    move v1, v0

    :cond_4
    :goto_1
    if-eqz v1, :cond_6

    .line 94
    array-length v2, p0

    sub-int/2addr v2, v1

    invoke-static {v2}, Lcom/tencent/liteav/videobase/utils/d;->a(I)[B

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_2

    .line 95
    :cond_5
    array-length v3, v2

    invoke-static {p0, v1, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_6
    :goto_2
    return-object p0
.end method

.method private b(Ljava/lang/String;)Landroid/media/MediaCodec;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 17
    invoke-static {p1}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p1

    .line 18
    :try_start_0
    invoke-virtual {p1}, Landroid/media/MediaCodec;->getName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 19
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string v2, "mediaCodec getName failed."

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "codecName="

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 21
    const-string v1, "OMX.google.h264.encoder"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 22
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string/jumbo v2, "will be destroyed codecName="

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Landroid/media/MediaCodec;)V

    .line 24
    new-instance p1, Ljava/io/IOException;

    const-string/jumbo v0, "this is a Google H264 soft encoder. cancel use MediaCodec."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    return-object p1
.end method

.method private static b([B)[B
    .locals 12

    .line 5
    array-length v0, p0

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    move v5, v4

    :goto_0
    const/4 v6, 0x4

    const/4 v7, 0x1

    if-gt v3, v0, :cond_5

    add-int/lit8 v8, v3, 0x2

    const/4 v9, 0x3

    if-ge v8, v0, :cond_0

    .line 7
    aget-byte v10, p0, v3

    if-nez v10, :cond_0

    add-int/lit8 v10, v3, 0x1

    aget-byte v10, p0, v10

    if-nez v10, :cond_0

    aget-byte v10, p0, v8

    if-ne v10, v7, :cond_0

    move v7, v9

    goto :goto_1

    :cond_0
    add-int/lit8 v10, v3, 0x3

    if-ge v10, v0, :cond_1

    .line 8
    aget-byte v11, p0, v3

    if-nez v11, :cond_1

    add-int/lit8 v11, v3, 0x1

    aget-byte v11, p0, v11

    if-nez v11, :cond_1

    aget-byte v8, p0, v8

    if-nez v8, :cond_1

    aget-byte v8, p0, v10

    if-ne v8, v7, :cond_1

    move v7, v6

    :cond_1
    :goto_1
    if-eq v7, v9, :cond_2

    if-eq v7, v6, :cond_2

    if-ne v3, v0, :cond_4

    :cond_2
    if-eq v5, v3, :cond_3

    .line 9
    filled-new-array {v5, v3}, [I

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sub-int v5, v3, v5

    add-int/2addr v4, v5

    :cond_3
    add-int v5, v3, v7

    :cond_4
    add-int/2addr v3, v7

    goto :goto_0

    .line 10
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    mul-int/2addr v0, v6

    add-int/2addr v4, v0

    invoke-static {v4}, Lcom/tencent/liteav/videobase/utils/d;->a(I)[B

    move-result-object v0

    if-nez v0, :cond_6

    return-object p0

    .line 11
    :cond_6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v2

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [I

    .line 12
    aget v5, v4, v7

    aget v8, v4, v2

    sub-int/2addr v5, v8

    .line 13
    new-array v8, v6, [B

    invoke-static {v8}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v8

    sget-object v9, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 14
    invoke-virtual {v8, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 15
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v8

    invoke-static {v8, v2, v0, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    aget v4, v4, v2

    add-int/2addr v3, v6

    invoke-static {p0, v4, v0, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v5

    goto :goto_2

    :cond_7
    return-object v0
.end method

.method private e()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->A:J

    .line 7
    .line 8
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    const-wide/16 v5, 0x2

    .line 11
    .line 12
    .line 13
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 14
    move-result-wide v4

    .line 15
    add-long/2addr v2, v4

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    const-wide/16 v3, 0x1

    .line 20
    .line 21
    if-gtz v2, :cond_0

    .line 22
    .line 23
    iget-wide v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->B:J

    .line 24
    add-long/2addr v0, v3

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->B:J

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    iget-wide v5, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->B:J

    .line 30
    long-to-double v5, v5

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide v7, 0x408f400000000000L    # 1000.0

    .line 36
    mul-double/2addr v5, v7

    .line 37
    .line 38
    iget-wide v7, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->A:J

    .line 39
    .line 40
    sub-long v7, v0, v7

    .line 41
    long-to-double v7, v7

    .line 42
    div-double/2addr v5, v7

    .line 43
    .line 44
    iput-wide v5, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->z:D

    .line 45
    .line 46
    iput-wide v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->B:J

    .line 47
    .line 48
    iput-wide v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->A:J

    .line 49
    .line 50
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->H:Ljava/util/List;

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    const-wide/16 v1, -0x1

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    move-result v3

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    check-cast v3, Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 72
    move-result-wide v3

    .line 73
    .line 74
    cmp-long v5, v1, v3

    .line 75
    .line 76
    if-gez v5, :cond_1

    .line 77
    move-wide v1, v3

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->I:Ljava/util/concurrent/atomic/AtomicLong;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 84
    .line 85
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->H:Ljava/util/List;

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 89
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;)Landroid/view/Surface;
    .locals 8

    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->g:J

    const-wide/high16 v0, -0x8000000000000000L

    .line 18
    iput-wide v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->w:J

    .line 19
    iget v0, p1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->bitrate:I

    if-nez v0, :cond_0

    .line 20
    iget v0, p1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->width:I

    mul-int/2addr v0, v0

    iget v1, p1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->height:I

    mul-int/2addr v1, v1

    add-int/2addr v0, v1

    int-to-double v0, v0

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide v2, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->bitrate:I

    .line 22
    :cond_0
    new-instance v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    invoke-direct {v0, p1}, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;-><init>(Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;)V

    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 23
    iget-wide v1, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->baseFrameIndex:J

    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->p:J

    .line 24
    iget-wide v1, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->baseGopIndex:J

    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->q:J

    const-wide/16 v1, 0x0

    .line 25
    iput-wide v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->r:J

    .line 26
    iget-object p1, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->codecType:Lcom/tencent/liteav/videobase/common/CodecType;

    sget-object v1, Lcom/tencent/liteav/videobase/common/CodecType;->c:Lcom/tencent/liteav/videobase/common/CodecType;

    if-ne p1, v1, :cond_1

    .line 27
    const-string/jumbo p1, "video/hevc"

    goto :goto_0

    .line 28
    :cond_1
    const-string/jumbo p1, "video/avc"

    .line 29
    :goto_0
    iget-object v1, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->encoderProfile:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    sget-object v2, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;->b:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    if-ne v1, v2, :cond_2

    .line 30
    sget-object v1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;->c:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    iput-object v1, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->encoderProfile:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    .line 31
    :cond_2
    iget-object v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->encoderProfile:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    sget-object v1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;->c:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    if-eq v0, v1, :cond_3

    if-ne v0, v2, :cond_5

    .line 32
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->y:Lcom/tencent/liteav/videoproducer/producer/ServerVideoProducerConfig;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/tencent/liteav/videoproducer/producer/ServerVideoProducerConfig;->isHardwareEncoderHighProfileAllowed()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    .line 33
    :cond_4
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    sget-object v3, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;->a:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    iput-object v3, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->encoderProfile:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    .line 34
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-object v3, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->encoderProfile:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    if-eq v3, v1, :cond_6

    if-ne v3, v2, :cond_8

    .line 35
    :cond_6
    iget-boolean v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->enableBFrame:Z

    if-nez v0, :cond_8

    .line 36
    new-instance v0, Lcom/tencent/liteav/base/storage/PersistStorageMmkv;

    const-string v1, "com.liteav.storage.global"

    invoke-direct {v0, v1}, Lcom/tencent/liteav/base/storage/PersistStorageMmkv;-><init>(Ljava/lang/String;)V

    .line 37
    const-string v1, "Liteav.Video.android.local.rtc.enable.high.profile"

    .line 38
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/storage/PersistStorageMmkv;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "enable high profile from persist storage:"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_8

    .line 40
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    .line 41
    :cond_7
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    sget-object v1, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;->a:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    iput-object v1, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->encoderProfile:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$EncoderProfile;

    :cond_8
    :goto_2
    const/4 v0, 0x0

    .line 42
    :try_start_0
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoproducer/encoder/b;->b(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 43
    :try_start_1
    new-instance v2, Lcom/tencent/liteav/videoproducer/encoder/a;

    iget-object v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget-object v4, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->y:Lcom/tencent/liteav/videoproducer/producer/ServerVideoProducerConfig;

    .line 44
    invoke-virtual {v4}, Lcom/tencent/liteav/videoproducer/producer/ServerVideoProducerConfig;->isHardwareEncoderBitrateModeCBRSupported()Ljava/lang/Boolean;

    move-result-object v4

    invoke-direct {v2, v1, p1, v3, v4}, Lcom/tencent/liteav/videoproducer/encoder/a;-><init>(Landroid/media/MediaCodec;Ljava/lang/String;Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;Ljava/lang/Boolean;)V

    const/4 p1, 0x1

    .line 45
    iput-boolean p1, v2, Lcom/tencent/liteav/videoproducer/encoder/a;->a:Z

    .line 46
    invoke-virtual {v2}, Lcom/tencent/liteav/videoproducer/encoder/a;->a()Landroid/media/MediaFormat;

    move-result-object v3

    .line 47
    invoke-direct {p0, v1, v3}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)Z

    move-result v4

    if-nez v4, :cond_9

    const/4 v3, 0x0

    .line 48
    iput-boolean v3, v2, Lcom/tencent/liteav/videoproducer/encoder/a;->b:Z

    .line 49
    invoke-virtual {v2}, Lcom/tencent/liteav/videoproducer/encoder/a;->a()Landroid/media/MediaFormat;

    move-result-object v2

    .line 50
    invoke-direct {p0, v1, v2}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)Z

    move-result v4

    if-eqz v4, :cond_a

    move-object v3, v2

    goto :goto_3

    :catchall_0
    move-exception p1

    move-object v3, v0

    goto/16 :goto_8

    :cond_9
    :goto_3
    move-object v2, v3

    move v3, p1

    :cond_a
    if-eqz v3, :cond_11

    .line 51
    invoke-virtual {v1}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    :try_start_2
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 53
    :try_start_3
    iget-object v4, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    const-string/jumbo v5, "width"

    invoke-virtual {v2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v5

    iput v5, v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->width:I

    .line 54
    iget-object v4, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    const-string v5, "height"

    invoke-virtual {v2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v5

    iput v5, v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->height:I

    .line 55
    iget-object v4, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    const-string v5, "bitrate"

    invoke-virtual {v2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v5

    div-int/lit16 v5, v5, 0x400

    iput v5, v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->bitrate:I

    .line 56
    iget-object v4, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    iget v4, v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->bitrate:I

    .line 57
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v5

    const/16 v6, 0x1e

    if-gt v5, v6, :cond_b

    goto :goto_4

    .line 58
    :cond_b
    iget-object v5, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string/jumbo v6, "resetBitrateAfterApiLevel30,bitrate="

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0, v1, v4}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Landroid/media/MediaCodec;I)V

    .line 60
    :goto_4
    iget-object v4, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->e:Lcom/tencent/liteav/videoproducer/encoder/e$a;

    if-eqz v4, :cond_10

    .line 61
    sget-object v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;->a:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;

    .line 62
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v5

    const/16 v6, 0x15

    if-lt v5, v6, :cond_f

    .line 63
    const-string v5, "bitrate-mode"

    const/4 v6, -0x1

    invoke-static {v2, v5, v6}, Landroidx/media3/exoplayer/source/mediaparser/b;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)I

    move-result v5

    if-eq v5, v6, :cond_f

    if-eqz v5, :cond_e

    if-eq v5, p1, :cond_d

    const/4 p1, 0x2

    if-eq v5, p1, :cond_c

    goto :goto_5

    .line 64
    :cond_c
    sget-object v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;->b:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 65
    :cond_d
    sget-object v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;->c:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;

    goto :goto_5

    .line 66
    :cond_e
    sget-object v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;->d:Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;

    .line 67
    :cond_f
    :goto_5
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->e:Lcom/tencent/liteav/videoproducer/encoder/e$a;

    invoke-virtual {p1, v4}, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$b;->onBitrateModeUpdated(Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$BitrateMode;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_7

    .line 68
    :goto_6
    :try_start_4
    iget-object v4, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string v5, "MediaFormat get key fail"

    invoke-static {v4, v5, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    :cond_10
    :goto_7
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string/jumbo v4, "start MediaCodec with format: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 70
    iput-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    return-object v3

    :catchall_2
    move-exception p1

    goto :goto_8

    .line 71
    :cond_11
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    const-string v2, "configure encoder failed."

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_3
    move-exception p1

    move-object v1, v0

    move-object v3, v1

    :goto_8
    if-eqz v3, :cond_12

    .line 72
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 73
    :cond_12
    invoke-direct {p0, v1}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Landroid/media/MediaCodec;)V

    .line 74
    sget-object v1, Lcom/tencent/liteav/videobase/videobase/e$c;->c:Lcom/tencent/liteav/videobase/videobase/e$c;

    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Start encoder failed:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 76
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v3

    const/16 v4, 0x17

    if-lt v3, v4, :cond_13

    instance-of v3, p1, Landroid/media/MediaCodec$CodecException;

    if-eqz v3, :cond_13

    .line 77
    move-object v3, p1

    check-cast v3, Landroid/media/MediaCodec$CodecException;

    .line 78
    invoke-virtual {v3}, Landroid/media/MediaCodec$CodecException;->getErrorCode()I

    move-result v3

    const/16 v4, 0x44c

    if-ne v3, v4, :cond_13

    .line 79
    sget-object v1, Lcom/tencent/liteav/videobase/videobase/e$c;->b:Lcom/tencent/liteav/videobase/videobase/e$c;

    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Insufficient resource, Start encoder failed:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 81
    :cond_13
    iget-object v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->l:Lcom/tencent/liteav/videobase/videobase/c;

    sget-object v4, Lcom/tencent/liteav/videobase/videobase/f;->z:Lcom/tencent/liteav/videobase/videobase/f;

    iget-object v5, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->m:Lcom/tencent/liteav/videoproducer/producer/a$a;

    .line 82
    iget v5, v5, Lcom/tencent/liteav/videoproducer/producer/a$a;->mValue:I

    .line 83
    iget v6, v1, Lcom/tencent/liteav/videobase/videobase/e$c;->mValue:I

    .line 84
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 85
    invoke-interface {v3, v4, v5, v6}, Lcom/tencent/liteav/videobase/videobase/c;->updateStatus(Lcom/tencent/liteav/videobase/videobase/f;ILjava/lang/Object;)V

    .line 86
    iget-object v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->l:Lcom/tencent/liteav/videobase/videobase/c;

    invoke-interface {v3, v1, v2}, Lcom/tencent/liteav/videobase/videobase/c;->notifyWarning(Lcom/tencent/liteav/videobase/videobase/e$c;Ljava/lang/String;)V

    .line 87
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Start MediaCodec failed,encode params:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final a()V
    .locals 2

    .line 14
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Landroid/media/MediaCodec;)V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    return-void
.end method

.method public final a(I)V
    .locals 6

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const/4 v2, 0x1

    :goto_0
    const/4 v3, 0x3

    if-gt v2, v3, :cond_0

    .line 4
    iget-object v3, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->F:Ljava/util/Deque;

    mul-int/lit16 v4, v2, 0x7d0

    int-to-long v4, v4

    add-long/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_0
    iput p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->G:I

    return-void
.end method

.method public final a(Landroid/media/MediaCodec;I)V
    .locals 2

    if-eqz p1, :cond_1

    .line 6
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    move-result v0

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    const-string/jumbo v1, "video-bitrate"

    mul-int/lit16 p2, p2, 0x400

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    invoke-virtual {p1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 10
    iget-object p2, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string/jumbo v0, "updateBitrateToMediaCodec failed."

    invoke-static {p2, v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(Lcom/tencent/liteav/videoproducer/producer/ServerVideoProducerConfig;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->y:Lcom/tencent/liteav/videoproducer/producer/ServerVideoProducerConfig;

    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Set serverConfig: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->y:Lcom/tencent/liteav/videoproducer/producer/ServerVideoProducerConfig;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->h:Lcom/tencent/liteav/base/util/w;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    const-string/jumbo v1, "stopEosTimer"

    invoke-static {v0, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->h:Lcom/tencent/liteav/base/util/w;

    invoke-virtual {v0}, Lcom/tencent/liteav/base/util/w;->a()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->h:Lcom/tencent/liteav/base/util/w;

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 19

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_1a

    .line 9
    .line 10
    :cond_0
    :goto_0
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 14
    .line 15
    :try_start_0
    iget-object v2, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0, v3, v4}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 21
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 22
    const/4 v5, -0x1

    .line 23
    .line 24
    if-eq v2, v5, :cond_2b

    .line 25
    const/4 v6, -0x3

    .line 26
    .line 27
    if-ne v2, v6, :cond_1

    .line 28
    .line 29
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    .line 30
    .line 31
    const-string v2, "encoder output buffers changed"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v6, -0x2

    .line 37
    .line 38
    if-ne v2, v6, :cond_3

    .line 39
    .line 40
    :try_start_1
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iget-object v2, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->e:Lcom/tencent/liteav/videoproducer/encoder/e$a;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$b;->onOutputFormatChanged(Landroid/media/MediaFormat;)V

    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_2

    .line 55
    .line 56
    :cond_2
    :goto_1
    iget-object v2, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    .line 57
    .line 58
    const-string v3, "encoder output format changed: %s"

    .line 59
    .line 60
    .line 61
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v3, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v3, "getOutputFormat failed."

    .line 71
    .line 72
    .line 73
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 88
    .line 89
    goto/16 :goto_18

    .line 90
    .line 91
    :cond_3
    if-gez v2, :cond_4

    .line 92
    .line 93
    const-string v0, "dequeueOutputBuffer return "

    .line 94
    .line 95
    .line 96
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 97
    move-result-object v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 105
    .line 106
    goto/16 :goto_18

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 110
    move-result-wide v6

    .line 111
    .line 112
    iget-object v8, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->H:Ljava/util/List;

    .line 113
    .line 114
    iget-object v9, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    .line 118
    move-result-wide v9

    .line 119
    sub-long/2addr v6, v9

    .line 120
    .line 121
    .line 122
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    move-result-object v6

    .line 124
    .line 125
    .line 126
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :try_start_2
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 130
    move-result v6

    .line 131
    .line 132
    const/16 v7, 0x15

    .line 133
    .line 134
    if-lt v6, v7, :cond_5

    .line 135
    .line 136
    iget-object v6, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v2}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 140
    move-result-object v6

    .line 141
    goto :goto_3

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    .line 144
    goto/16 :goto_17

    .line 145
    .line 146
    :cond_5
    iget-object v6, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 150
    move-result-object v6

    .line 151
    .line 152
    aget-object v6, v6, v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 153
    :goto_3
    const/4 v7, 0x0

    .line 154
    .line 155
    if-eqz v6, :cond_28

    .line 156
    .line 157
    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 158
    .line 159
    if-nez v8, :cond_6

    .line 160
    .line 161
    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 162
    .line 163
    and-int/lit8 v9, v9, 0x4

    .line 164
    .line 165
    if-nez v9, :cond_6

    .line 166
    .line 167
    goto/16 :goto_15

    .line 168
    .line 169
    .line 170
    :cond_6
    invoke-static {v8}, Lcom/tencent/liteav/videobase/utils/d;->a(I)[B

    .line 171
    move-result-object v8

    .line 172
    .line 173
    if-nez v8, :cond_7

    .line 174
    const/4 v6, 0x0

    .line 175
    goto :goto_4

    .line 176
    .line 177
    :cond_7
    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 181
    .line 182
    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 183
    .line 184
    iget v10, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 185
    add-int/2addr v9, v10

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v9}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 192
    .line 193
    .line 194
    invoke-static {v8}, Lcom/tencent/liteav/videoproducer/encoder/b;->a([B)[B

    .line 195
    move-result-object v6

    .line 196
    .line 197
    iget-object v8, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 198
    .line 199
    if-eqz v8, :cond_8

    .line 200
    .line 201
    iget-boolean v8, v8, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->annexb:Z

    .line 202
    .line 203
    if-nez v8, :cond_8

    .line 204
    .line 205
    .line 206
    invoke-static {v6}, Lcom/tencent/liteav/videoproducer/encoder/b;->b([B)[B

    .line 207
    move-result-object v6

    .line 208
    .line 209
    :cond_8
    :goto_4
    if-nez v6, :cond_9

    .line 210
    .line 211
    .line 212
    const-string/jumbo v0, "modifyEncodedData return null byte array"

    .line 213
    .line 214
    .line 215
    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 216
    .line 217
    goto/16 :goto_16

    .line 218
    .line 219
    :cond_9
    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 220
    .line 221
    and-int/lit8 v9, v8, 0x2

    .line 222
    const/4 v10, 0x1

    .line 223
    .line 224
    if-lez v9, :cond_a

    .line 225
    move v9, v10

    .line 226
    goto :goto_5

    .line 227
    :cond_a
    move v9, v7

    .line 228
    .line 229
    :goto_5
    and-int/lit8 v8, v8, 0x1

    .line 230
    .line 231
    if-lez v8, :cond_b

    .line 232
    move v8, v10

    .line 233
    goto :goto_6

    .line 234
    :cond_b
    move v8, v7

    .line 235
    .line 236
    :goto_6
    if-eqz v9, :cond_10

    .line 237
    .line 238
    if-eqz v8, :cond_10

    .line 239
    .line 240
    iget-object v8, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 241
    .line 242
    if-eqz v8, :cond_d

    .line 243
    .line 244
    iget-object v9, v8, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->codecType:Lcom/tencent/liteav/videobase/common/CodecType;

    .line 245
    .line 246
    sget-object v11, Lcom/tencent/liteav/videobase/common/CodecType;->b:Lcom/tencent/liteav/videobase/common/CodecType;

    .line 247
    .line 248
    if-ne v9, v11, :cond_c

    .line 249
    goto :goto_7

    .line 250
    :cond_c
    move v9, v7

    .line 251
    goto :goto_8

    .line 252
    :cond_d
    :goto_7
    move v9, v10

    .line 253
    .line 254
    :goto_8
    if-eqz v8, :cond_f

    .line 255
    .line 256
    iget-boolean v8, v8, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->annexb:Z

    .line 257
    .line 258
    if-eqz v8, :cond_e

    .line 259
    goto :goto_9

    .line 260
    :cond_e
    move v8, v7

    .line 261
    goto :goto_a

    .line 262
    :cond_f
    :goto_9
    move v8, v10

    .line 263
    .line 264
    .line 265
    :goto_a
    invoke-static {v6, v9, v8}, Lcom/tencent/liteav/videoconsumer/decoder/SpsInfo;->nativeGetSpsPps([BZZ)[B

    .line 266
    move-result-object v8

    .line 267
    .line 268
    iput-object v8, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->n:[B

    .line 269
    goto :goto_b

    .line 270
    .line 271
    :cond_10
    if-eqz v9, :cond_11

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6}, [B->clone()Ljava/lang/Object;

    .line 275
    move-result-object v0

    .line 276
    .line 277
    check-cast v0, [B

    .line 278
    .line 279
    iput-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->n:[B

    .line 280
    .line 281
    goto/16 :goto_16

    .line 282
    .line 283
    :cond_11
    iget-boolean v9, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->o:Z

    .line 284
    .line 285
    if-eqz v9, :cond_14

    .line 286
    .line 287
    if-eqz v8, :cond_14

    .line 288
    .line 289
    iget-object v8, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->n:[B

    .line 290
    .line 291
    if-eqz v8, :cond_13

    .line 292
    array-length v8, v8

    .line 293
    array-length v9, v6

    .line 294
    add-int/2addr v8, v9

    .line 295
    .line 296
    .line 297
    invoke-static {v8}, Lcom/tencent/liteav/videobase/utils/d;->a(I)[B

    .line 298
    move-result-object v8

    .line 299
    .line 300
    if-eqz v8, :cond_12

    .line 301
    .line 302
    iget-object v9, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->n:[B

    .line 303
    array-length v11, v9

    .line 304
    .line 305
    .line 306
    invoke-static {v9, v7, v8, v7, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 307
    .line 308
    iget-object v9, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->n:[B

    .line 309
    array-length v9, v9

    .line 310
    array-length v11, v6

    .line 311
    .line 312
    .line 313
    invoke-static {v6, v7, v8, v9, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 314
    move-object v6, v8

    .line 315
    goto :goto_b

    .line 316
    .line 317
    :cond_12
    const-string v8, "add spspps for I frame, allocate buffer failed."

    .line 318
    .line 319
    .line 320
    invoke-direct {v1, v8}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 321
    goto :goto_b

    .line 322
    .line 323
    :cond_13
    const-string v8, "mSpsPps is null."

    .line 324
    .line 325
    .line 326
    invoke-direct {v1, v8}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 327
    .line 328
    :cond_14
    :goto_b
    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 329
    and-int/2addr v8, v10

    .line 330
    .line 331
    if-lez v8, :cond_15

    .line 332
    move v8, v10

    .line 333
    goto :goto_c

    .line 334
    :cond_15
    move v8, v7

    .line 335
    .line 336
    :goto_c
    if-eqz v8, :cond_16

    .line 337
    .line 338
    iput v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->s:I

    .line 339
    .line 340
    :cond_16
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 341
    .line 342
    if-eqz v5, :cond_17

    .line 343
    .line 344
    iget-boolean v9, v5, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->fullIFrame:Z

    .line 345
    .line 346
    if-nez v9, :cond_17

    .line 347
    .line 348
    iget v9, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->s:I

    .line 349
    add-int/2addr v9, v10

    .line 350
    .line 351
    iput v9, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->s:I

    .line 352
    .line 353
    iget v11, v5, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->fps:I

    .line 354
    .line 355
    iget v5, v5, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->gop:I

    .line 356
    mul-int/2addr v11, v5

    .line 357
    .line 358
    if-ne v9, v11, :cond_17

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1}, Lcom/tencent/liteav/videoproducer/encoder/b;->d()V

    .line 362
    :cond_17
    array-length v5, v6

    .line 363
    int-to-long v11, v5

    .line 364
    .line 365
    .line 366
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 367
    move-result-wide v13

    .line 368
    .line 369
    if-eqz v8, :cond_19

    .line 370
    move v9, v8

    .line 371
    .line 372
    iget-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->D:J

    .line 373
    .line 374
    const-wide/16 v15, 0x3e8

    .line 375
    add-long/2addr v15, v7

    .line 376
    .line 377
    cmp-long v15, v13, v15

    .line 378
    .line 379
    if-lez v15, :cond_18

    .line 380
    move-object v15, v6

    .line 381
    .line 382
    iget-wide v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->E:J

    .line 383
    long-to-double v5, v5

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    const-wide v17, 0x40bf400000000000L    # 8000.0

    .line 389
    .line 390
    mul-double v5, v5, v17

    .line 391
    .line 392
    sub-long v7, v13, v7

    .line 393
    long-to-double v7, v7

    .line 394
    div-double/2addr v5, v7

    .line 395
    .line 396
    const-wide/high16 v7, 0x4090000000000000L    # 1024.0

    .line 397
    div-double/2addr v5, v7

    .line 398
    double-to-long v5, v5

    .line 399
    .line 400
    iput-wide v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->C:J

    .line 401
    .line 402
    iput-wide v3, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->E:J

    .line 403
    .line 404
    iput-wide v13, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->D:J

    .line 405
    .line 406
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->F:Ljava/util/Deque;

    .line 407
    .line 408
    .line 409
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 410
    move-result v5

    .line 411
    .line 412
    if-nez v5, :cond_1a

    .line 413
    .line 414
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 415
    .line 416
    iget v5, v5, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->fps:I

    .line 417
    int-to-double v6, v5

    .line 418
    .line 419
    iget-wide v13, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->z:D

    .line 420
    sub-double/2addr v6, v13

    .line 421
    double-to-float v6, v6

    .line 422
    int-to-float v5, v5

    .line 423
    .line 424
    const/high16 v7, 0x40000000    # 2.0f

    .line 425
    div-float/2addr v5, v7

    .line 426
    .line 427
    const/high16 v7, 0x40a00000    # 5.0f

    .line 428
    .line 429
    .line 430
    invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F

    .line 431
    move-result v5

    .line 432
    .line 433
    cmpl-float v5, v6, v5

    .line 434
    .line 435
    if-gtz v5, :cond_1a

    .line 436
    .line 437
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->F:Ljava/util/Deque;

    .line 438
    .line 439
    .line 440
    invoke-interface {v5}, Ljava/util/Deque;->peekFirst()Ljava/lang/Object;

    .line 441
    move-result-object v5

    .line 442
    .line 443
    check-cast v5, Ljava/lang/Long;

    .line 444
    .line 445
    if-eqz v5, :cond_1a

    .line 446
    .line 447
    .line 448
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 449
    move-result-wide v6

    .line 450
    .line 451
    .line 452
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 453
    move-result-wide v13

    .line 454
    .line 455
    cmp-long v5, v6, v13

    .line 456
    .line 457
    if-lez v5, :cond_1a

    .line 458
    .line 459
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->F:Ljava/util/Deque;

    .line 460
    .line 461
    .line 462
    invoke-interface {v5}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    .line 463
    .line 464
    iget v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->G:I

    .line 465
    int-to-long v5, v5

    .line 466
    .line 467
    iget-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->C:J

    .line 468
    sub-long/2addr v5, v7

    .line 469
    .line 470
    iget-object v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 471
    .line 472
    iget v7, v7, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->bitrate:I

    .line 473
    .line 474
    div-int/lit8 v7, v7, 0x2

    .line 475
    .line 476
    const/16 v8, 0x64

    .line 477
    .line 478
    .line 479
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 480
    move-result v7

    .line 481
    int-to-long v7, v7

    .line 482
    .line 483
    cmp-long v5, v5, v7

    .line 484
    .line 485
    if-lez v5, :cond_1a

    .line 486
    .line 487
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    .line 488
    .line 489
    new-instance v6, Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    const-string/jumbo v7, "restart hardware encoder because real bitrate is too low.expectBitrate: "

    .line 493
    .line 494
    .line 495
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    iget v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->G:I

    .line 498
    .line 499
    .line 500
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    const-string v7, ", realBitrate="

    .line 503
    .line 504
    .line 505
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    iget-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->C:J

    .line 508
    .line 509
    .line 510
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 514
    move-result-object v6

    .line 515
    .line 516
    .line 517
    invoke-static {v5, v6}, Lcom/tencent/liteav/base/util/LiteavLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    .line 519
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->b:Landroid/os/Bundle;

    .line 520
    .line 521
    .line 522
    const-string/jumbo v6, "need_restart_when_down_bitrate"

    .line 523
    .line 524
    .line 525
    invoke-virtual {v5, v6, v10}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 526
    .line 527
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->k:Ljava/lang/Runnable;

    .line 528
    .line 529
    .line 530
    invoke-interface {v5}, Ljava/lang/Runnable;->run()V

    .line 531
    .line 532
    iget-object v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->F:Ljava/util/Deque;

    .line 533
    .line 534
    .line 535
    invoke-interface {v5}, Ljava/util/Collection;->clear()V

    .line 536
    goto :goto_d

    .line 537
    :cond_18
    move-object v15, v6

    .line 538
    goto :goto_d

    .line 539
    :cond_19
    move-object v15, v6

    .line 540
    move v9, v8

    .line 541
    .line 542
    :cond_1a
    :goto_d
    iget-wide v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->E:J

    .line 543
    add-long/2addr v5, v11

    .line 544
    .line 545
    iput-wide v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->E:J

    .line 546
    .line 547
    .line 548
    invoke-direct {v1}, Lcom/tencent/liteav/videoproducer/encoder/b;->e()V

    .line 549
    .line 550
    const-wide/16 v5, 0x1

    .line 551
    .line 552
    if-eqz v9, :cond_1b

    .line 553
    .line 554
    iget-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->q:J

    .line 555
    add-long/2addr v7, v5

    .line 556
    .line 557
    iput-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->q:J

    .line 558
    .line 559
    iput-wide v3, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->r:J

    .line 560
    goto :goto_e

    .line 561
    .line 562
    :cond_1b
    iget-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->r:J

    .line 563
    add-long/2addr v7, v5

    .line 564
    .line 565
    iput-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->r:J

    .line 566
    .line 567
    :goto_e
    iget-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->p:J

    .line 568
    add-long/2addr v7, v5

    .line 569
    .line 570
    iput-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->p:J

    .line 571
    .line 572
    iget-object v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->i:Ljava/util/Deque;

    .line 573
    .line 574
    .line 575
    invoke-interface {v7}, Ljava/util/Deque;->pollFirst()Ljava/lang/Object;

    .line 576
    move-result-object v7

    .line 577
    .line 578
    check-cast v7, Ljava/lang/Long;

    .line 579
    .line 580
    if-nez v7, :cond_1c

    .line 581
    move-wide v7, v3

    .line 582
    goto :goto_f

    .line 583
    .line 584
    .line 585
    :cond_1c
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 586
    move-result-wide v7

    .line 587
    .line 588
    :goto_f
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 589
    .line 590
    iget-wide v12, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 591
    .line 592
    .line 593
    invoke-virtual {v11, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 594
    move-result-wide v11

    .line 595
    .line 596
    iget-wide v13, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->t:J

    .line 597
    .line 598
    cmp-long v13, v13, v3

    .line 599
    .line 600
    if-nez v13, :cond_1d

    .line 601
    .line 602
    iput-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->t:J

    .line 603
    .line 604
    :cond_1d
    iget-wide v13, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->u:J

    .line 605
    .line 606
    cmp-long v3, v13, v3

    .line 607
    .line 608
    if-nez v3, :cond_1e

    .line 609
    .line 610
    iput-wide v11, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->u:J

    .line 611
    .line 612
    :cond_1e
    iget-wide v3, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->t:J

    .line 613
    .line 614
    iget-wide v13, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->u:J

    .line 615
    sub-long/2addr v3, v13

    .line 616
    add-long/2addr v11, v3

    .line 617
    .line 618
    iget-wide v3, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->v:J

    .line 619
    .line 620
    cmp-long v13, v7, v3

    .line 621
    .line 622
    if-gtz v13, :cond_1f

    .line 623
    .line 624
    add-long v7, v3, v5

    .line 625
    .line 626
    :cond_1f
    cmp-long v3, v7, v11

    .line 627
    .line 628
    if-lez v3, :cond_20

    .line 629
    move-wide v7, v11

    .line 630
    .line 631
    :cond_20
    iput-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->v:J

    .line 632
    .line 633
    new-instance v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;

    .line 634
    .line 635
    .line 636
    invoke-direct {v3}, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;-><init>()V

    .line 637
    .line 638
    iget-object v4, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 639
    .line 640
    if-eqz v4, :cond_22

    .line 641
    .line 642
    .line 643
    invoke-virtual {v4}, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->isEnablesUnlimitedGop()Z

    .line 644
    move-result v4

    .line 645
    .line 646
    if-eqz v4, :cond_22

    .line 647
    .line 648
    if-eqz v9, :cond_21

    .line 649
    .line 650
    sget-object v4, Lcom/tencent/liteav/videobase/common/c;->b:Lcom/tencent/liteav/videobase/common/c;

    .line 651
    goto :goto_10

    .line 652
    .line 653
    :cond_21
    sget-object v4, Lcom/tencent/liteav/videobase/common/c;->e:Lcom/tencent/liteav/videobase/common/c;

    .line 654
    .line 655
    :goto_10
    iput-object v4, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->nalType:Lcom/tencent/liteav/videobase/common/c;

    .line 656
    goto :goto_12

    .line 657
    .line 658
    :cond_22
    if-eqz v9, :cond_23

    .line 659
    .line 660
    sget-object v4, Lcom/tencent/liteav/videobase/common/c;->b:Lcom/tencent/liteav/videobase/common/c;

    .line 661
    goto :goto_11

    .line 662
    .line 663
    :cond_23
    sget-object v4, Lcom/tencent/liteav/videobase/common/c;->c:Lcom/tencent/liteav/videobase/common/c;

    .line 664
    .line 665
    :goto_11
    iput-object v4, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->nalType:Lcom/tencent/liteav/videobase/common/c;

    .line 666
    :goto_12
    array-length v4, v15

    .line 667
    .line 668
    .line 669
    invoke-static {v4}, Lcom/tencent/liteav/videobase/utils/d;->b(I)Ljava/nio/ByteBuffer;

    .line 670
    move-result-object v4

    .line 671
    .line 672
    iput-object v4, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->data:Ljava/nio/ByteBuffer;

    .line 673
    .line 674
    if-nez v4, :cond_24

    .line 675
    .line 676
    const-string v0, "allocate direct buffer for nal failed"

    .line 677
    .line 678
    .line 679
    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 680
    .line 681
    goto/16 :goto_16

    .line 682
    .line 683
    .line 684
    :cond_24
    invoke-virtual {v4, v15}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 685
    .line 686
    iget-object v4, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->data:Ljava/nio/ByteBuffer;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 690
    .line 691
    iput-wide v7, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->dts:J

    .line 692
    .line 693
    iput-wide v11, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->pts:J

    .line 694
    .line 695
    iput-object v0, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->info:Landroid/media/MediaCodec$BufferInfo;

    .line 696
    .line 697
    iget-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->q:J

    .line 698
    .line 699
    iput-wide v7, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->gopIndex:J

    .line 700
    .line 701
    iget-wide v7, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->r:J

    .line 702
    .line 703
    iput-wide v7, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->frameIndex:J

    .line 704
    .line 705
    iput-wide v7, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->gopFrameIndex:J

    .line 706
    .line 707
    if-eqz v9, :cond_25

    .line 708
    goto :goto_13

    .line 709
    :cond_25
    sub-long/2addr v7, v5

    .line 710
    .line 711
    :goto_13
    iput-wide v7, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->refFrameIndex:J

    .line 712
    .line 713
    sget-object v4, Lcom/tencent/liteav/videobase/common/d;->b:Lcom/tencent/liteav/videobase/common/d;

    .line 714
    .line 715
    iput-object v4, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->profileType:Lcom/tencent/liteav/videobase/common/d;

    .line 716
    .line 717
    iget-object v4, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 718
    .line 719
    iget-object v5, v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->codecType:Lcom/tencent/liteav/videobase/common/CodecType;

    .line 720
    .line 721
    iput-object v5, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->codecType:Lcom/tencent/liteav/videobase/common/CodecType;

    .line 722
    .line 723
    iget v5, v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->width:I

    .line 724
    .line 725
    iput v5, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->width:I

    .line 726
    .line 727
    iget v5, v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->height:I

    .line 728
    .line 729
    iput v5, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->height:I

    .line 730
    .line 731
    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 732
    .line 733
    and-int/lit8 v0, v0, 0x4

    .line 734
    .line 735
    if-lez v0, :cond_26

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1}, Lcom/tencent/liteav/videoproducer/encoder/b;->b()V

    .line 739
    goto :goto_14

    .line 740
    .line 741
    :cond_26
    iget-boolean v0, v4, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->enableBFrame:Z

    .line 742
    .line 743
    if-nez v0, :cond_27

    .line 744
    .line 745
    iget-boolean v4, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->x:Z

    .line 746
    .line 747
    if-nez v4, :cond_27

    .line 748
    .line 749
    iget-wide v4, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->w:J

    .line 750
    .line 751
    cmp-long v4, v11, v4

    .line 752
    .line 753
    if-gez v4, :cond_27

    .line 754
    .line 755
    iget-object v4, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 759
    move-result-object v0

    .line 760
    .line 761
    iget-wide v5, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->w:J

    .line 762
    .line 763
    .line 764
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 765
    move-result-object v5

    .line 766
    .line 767
    iget-wide v6, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->pts:J

    .line 768
    .line 769
    .line 770
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 771
    move-result-object v6

    .line 772
    .line 773
    .line 774
    filled-new-array {v0, v5, v6}, [Ljava/lang/Object;

    .line 775
    move-result-object v0

    .line 776
    .line 777
    const-string v5, "has B frame,isEnablesBframe=%b,mLastPresentationTimestamp=%d,packet.pts=%d"

    .line 778
    .line 779
    .line 780
    invoke-static {v4, v5, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 781
    .line 782
    iput-boolean v10, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->x:Z

    .line 783
    .line 784
    new-instance v0, Lcom/tencent/liteav/base/storage/PersistStorageMmkv;

    .line 785
    .line 786
    const-string v4, "com.liteav.storage.global"

    .line 787
    .line 788
    .line 789
    invoke-direct {v0, v4}, Lcom/tencent/liteav/base/storage/PersistStorageMmkv;-><init>(Ljava/lang/String;)V

    .line 790
    .line 791
    const-string v4, "Liteav.Video.android.local.rtc.enable.high.profile"

    .line 792
    const/4 v5, 0x0

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0, v4, v5}, Lcom/tencent/liteav/base/storage/PersistStorageMmkv;->put(Ljava/lang/String;I)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v0}, Lcom/tencent/liteav/base/storage/PersistStorageMmkv;->commit()V

    .line 799
    .line 800
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->e:Lcom/tencent/liteav/videoproducer/encoder/e$a;

    .line 801
    .line 802
    if-eqz v0, :cond_27

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0}, Lcom/tencent/liteav/videoproducer/encoder/e$a;->a()V

    .line 806
    .line 807
    :cond_27
    iget-wide v6, v3, Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;->pts:J

    .line 808
    .line 809
    iput-wide v6, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->w:J

    .line 810
    const/4 v10, 0x0

    .line 811
    .line 812
    :goto_14
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->e:Lcom/tencent/liteav/videoproducer/encoder/e$a;

    .line 813
    .line 814
    if-eqz v0, :cond_29

    .line 815
    .line 816
    .line 817
    invoke-virtual {v0, v3, v10}, Lcom/tencent/liteav/videoproducer/encoder/VideoEncoderDef$b;->onEncodedNAL(Lcom/tencent/liteav/videobase/common/EncodedVideoFrame;Z)V

    .line 818
    goto :goto_16

    .line 819
    .line 820
    .line 821
    :cond_28
    :goto_15
    const-string/jumbo v0, "size is zero, but it isn\'t end of stream"

    .line 822
    .line 823
    .line 824
    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 825
    .line 826
    :cond_29
    :goto_16
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    .line 827
    .line 828
    if-nez v0, :cond_2a

    .line 829
    goto :goto_1a

    .line 830
    :cond_2a
    const/4 v5, 0x0

    .line 831
    .line 832
    .line 833
    :try_start_3
    invoke-virtual {v0, v2, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 834
    .line 835
    goto/16 :goto_0

    .line 836
    :catchall_2
    move-exception v0

    .line 837
    .line 838
    new-instance v2, Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    const-string/jumbo v3, "releaseOutputBuffer failed."

    .line 842
    .line 843
    .line 844
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 848
    move-result-object v0

    .line 849
    .line 850
    .line 851
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 855
    move-result-object v0

    .line 856
    .line 857
    .line 858
    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 859
    goto :goto_18

    .line 860
    .line 861
    :goto_17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 862
    .line 863
    const-string v3, "getOutputBuffer failed."

    .line 864
    .line 865
    .line 866
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 870
    move-result-object v0

    .line 871
    .line 872
    .line 873
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 877
    move-result-object v0

    .line 878
    .line 879
    .line 880
    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 881
    goto :goto_18

    .line 882
    :catchall_3
    move-exception v0

    .line 883
    .line 884
    new-instance v2, Ljava/lang/StringBuilder;

    .line 885
    .line 886
    const-string v3, "dequeueOutputBuffer failed."

    .line 887
    .line 888
    .line 889
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 893
    move-result-object v0

    .line 894
    .line 895
    .line 896
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 897
    .line 898
    .line 899
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 900
    move-result-object v0

    .line 901
    .line 902
    .line 903
    invoke-direct {v1, v0}, Lcom/tencent/liteav/videoproducer/encoder/b;->a(Ljava/lang/String;)V

    .line 904
    .line 905
    :cond_2b
    :goto_18
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->i:Ljava/util/Deque;

    .line 906
    .line 907
    .line 908
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 909
    move-result v0

    .line 910
    .line 911
    if-nez v0, :cond_2d

    .line 912
    .line 913
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->f:Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;

    .line 914
    .line 915
    iget v0, v0, Lcom/tencent/liteav/videoproducer/encoder/VideoEncodeParams;->fps:I

    .line 916
    .line 917
    const/16 v2, 0xa

    .line 918
    .line 919
    if-eqz v0, :cond_2c

    .line 920
    .line 921
    const/16 v3, 0x1f4

    .line 922
    div-int/2addr v3, v0

    .line 923
    goto :goto_19

    .line 924
    :cond_2c
    move v3, v2

    .line 925
    .line 926
    :goto_19
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 927
    .line 928
    .line 929
    invoke-virtual {v0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 930
    move-result v0

    .line 931
    .line 932
    if-nez v0, :cond_2d

    .line 933
    .line 934
    iget-object v0, v1, Lcom/tencent/liteav/videoproducer/encoder/b;->c:Lcom/tencent/liteav/base/util/CustomHandler;

    .line 935
    int-to-long v3, v3

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 939
    :cond_2d
    :goto_1a
    return-void
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
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public final d()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/base/system/LiteavSystemInfo;->getSystemOSVersionInt()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0x13

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string/jumbo v1, "request-sync"

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->d:Landroid/media/MediaCodec;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    .line 33
    iget-object v1, p0, Lcom/tencent/liteav/videoproducer/encoder/b;->a:Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    const-string/jumbo v2, "requestSyncFrame failed."

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    :cond_0
    return-void
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
