.class final Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BundleLoader.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/rn/core/BundleLoader;->createReactInstance(Landroid/app/Application;Ljava/lang/String;ZLcom/kubi/rn/core/EngineExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/facebook/react/ReactInstanceManager;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/facebook/react/ReactInstanceManager;",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.rn.core.BundleLoader$createReactInstance$3"
    f = "BundleLoader.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x132,
        0x1dd
    }
    m = "invokeSuspend"
    n = {
        "reactInstanceManager",
        "contextListener",
        "managerDestroyed",
        "$i$f$suspendCancellableCoroutine"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBundleLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader$createReactInstance$3\n+ 2 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,474:1\n45#2,2:475\n45#2,2:486\n45#2,2:490\n426#3,9:477\n435#3,2:488\n*S KotlinDebug\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader$createReactInstance$3\n*L\n308#1:475,2\n445#1:486,2\n452#1:490,2\n325#1:477,9\n325#1:488,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $application:Landroid/app/Application;

.field final synthetic $bundleFilePath:Ljava/lang/String;

.field final synthetic $exceptionHandler:Lcom/kubi/rn/core/EngineExceptionHandler;

.field final synthetic $isDebug:Z

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;Lcom/kubi/rn/core/EngineExceptionHandler;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Ljava/lang/String;",
            "Lcom/kubi/rn/core/EngineExceptionHandler;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$application:Landroid/app/Application;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$bundleFilePath:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$exceptionHandler:Lcom/kubi/rn/core/EngineExceptionHandler;

    .line 7
    .line 8
    iput-boolean p4, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$isDebug:Z

    .line 9
    const/4 p1, 0x2

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method

.method public static synthetic a(Lcom/facebook/react/ReactInstanceManager;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->g(Lcom/facebook/react/ReactInstanceManager;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic access$invokeSuspend$destroyCreatedManager(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->f(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V

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
.end method

.method public static final f(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/facebook/react/ReactInstanceManager;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast p0, Lcom/facebook/react/ReactInstanceManager;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 13
    move-result p1

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    new-instance p1, Lcom/kubi/rn/core/b;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/kubi/rn/core/b;-><init>(Lcom/facebook/react/ReactInstanceManager;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/kubi/utils/x0;->e(Lkotlin/jvm/functions/Function0;)V

    .line 24
    :cond_1
    :goto_0
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
.end method

.method public static final g(Lcom/facebook/react/ReactInstanceManager;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/ReactInstanceManager;->destroy()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$application:Landroid/app/Application;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$bundleFilePath:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$exceptionHandler:Lcom/kubi/rn/core/EngineExceptionHandler;

    .line 9
    .line 10
    iget-boolean v4, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$isDebug:Z

    .line 11
    move-object v5, p2

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;-><init>(Landroid/app/Application;Ljava/lang/String;Lcom/kubi/rn/core/EngineExceptionHandler;ZLkotlin/coroutines/Continuation;)V

    .line 15
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/facebook/react/ReactInstanceManager;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v1

    .line 5
    .line 6
    iget v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->label:I

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$5:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$4:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/app/Application;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$3:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/kubi/rn/core/EngineExceptionHandler;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$2:Ljava/lang/Object;

    .line 30
    move-object v1, v0

    .line 31
    .line 32
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$1:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 37
    .line 38
    iget-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$0:Ljava/lang/Object;

    .line 39
    move-object v3, v0

    .line 40
    .line 41
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    move-object v7, p1

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 60
    .line 61
    .line 62
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    goto :goto_0

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    move-object v6, p1

    .line 67
    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    :try_start_2
    sget-object p1, Lcom/kubi/rn/core/RNApplicationInitGate;->INSTANCE:Lcom/kubi/rn/core/RNApplicationInitGate;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$application:Landroid/app/Application;

    .line 76
    .line 77
    const-string v5, "BundleLoader.createReactInstance"

    .line 78
    .line 79
    iput v3, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->label:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0, v5, p0}, Lcom/kubi/rn/core/RNApplicationInitGate;->awaitReady(Landroid/app/Application;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 83
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    .line 85
    if-ne p1, v1, :cond_3

    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_3
    :goto_0
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 90
    .line 91
    .line 92
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 93
    .line 94
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 95
    .line 96
    .line 97
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 98
    .line 99
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 100
    const/4 v6, 0x0

    .line 101
    .line 102
    .line 103
    invoke-direct {v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 104
    .line 105
    :try_start_3
    iget-object v7, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$exceptionHandler:Lcom/kubi/rn/core/EngineExceptionHandler;

    .line 106
    .line 107
    iget-object v8, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$application:Landroid/app/Application;

    .line 108
    .line 109
    iget-object v9, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$bundleFilePath:Ljava/lang/String;

    .line 110
    .line 111
    iget-boolean v10, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$isDebug:Z

    .line 112
    .line 113
    iput-object p1, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v5, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$2:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v7, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$3:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v8, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$4:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v9, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->L$5:Ljava/lang/Object;

    .line 124
    .line 125
    iput-boolean v10, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->Z$0:Z

    .line 126
    .line 127
    iput v6, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->I$0:I

    .line 128
    .line 129
    iput v2, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->label:I

    .line 130
    .line 131
    new-instance v6, Lkotlinx/coroutines/o;

    .line 132
    .line 133
    .line 134
    invoke-static {p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 135
    move-result-object v11

    .line 136
    .line 137
    .line 138
    invoke-direct {v6, v11, v3}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Lkotlinx/coroutines/o;->E()V

    .line 142
    .line 143
    new-instance v3, Lcom/kubi/rn/core/OnceCallback;

    .line 144
    .line 145
    new-instance v11, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$e;

    .line 146
    .line 147
    .line 148
    invoke-direct {v11, v7}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$e;-><init>(Lcom/kubi/rn/core/EngineExceptionHandler;)V

    .line 149
    .line 150
    .line 151
    invoke-direct {v3, v6, v11}, Lcom/kubi/rn/core/OnceCallback;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function0;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v3}, Lcom/kubi/rn/core/EngineExceptionHandler;->beginInitialization(Lcom/facebook/react/bridge/JSExceptionHandler;)Z

    .line 155
    move-result v11

    .line 156
    .line 157
    if-eqz v11, :cond_c

    .line 158
    .line 159
    new-instance v11, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$a;

    .line 160
    .line 161
    .line 162
    invoke-direct {v11, v3, v0, p1, v5}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$a;-><init>(Lcom/kubi/rn/core/OnceCallback;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v6, v11}, Lkotlinx/coroutines/m;->t(Lkotlin/jvm/functions/Function1;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v6}, Lkotlinx/coroutines/m;->isActive()Z

    .line 169
    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 170
    .line 171
    if-eqz v11, :cond_9

    .line 172
    .line 173
    :try_start_4
    new-instance v11, Lcom/facebook/react/PackageList;

    .line 174
    .line 175
    .line 176
    invoke-direct {v11, v8}, Lcom/facebook/react/PackageList;-><init>(Landroid/app/Application;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11}, Lcom/facebook/react/PackageList;->getPackages()Ljava/util/ArrayList;

    .line 180
    move-result-object v11

    .line 181
    .line 182
    const-string v12, "getPackages(...)"

    .line 183
    .line 184
    .line 185
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    new-instance v12, Lcom/kubi/rn/modules/BusinessPackage;

    .line 188
    .line 189
    .line 190
    invoke-direct {v12}, Lcom/kubi/rn/modules/BusinessPackage;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    new-instance v12, Lcom/kubi/rn/kline/KlineMiniReactPackage;

    .line 196
    .line 197
    .line 198
    invoke-direct {v12}, Lcom/kubi/rn/kline/KlineMiniReactPackage;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    new-instance v12, Lcom/kubi/rn/kline/KlineHybridBridgePackage;

    .line 204
    .line 205
    .line 206
    invoke-direct {v12}, Lcom/kubi/rn/kline/KlineHybridBridgePackage;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    new-instance v12, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$1$host$1;

    .line 212
    .line 213
    .line 214
    invoke-direct {v12, v8, v10, v11}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$1$host$1;-><init>(Landroid/app/Application;ZLjava/util/List;)V

    .line 215
    .line 216
    .line 217
    invoke-static {}, Lcom/facebook/react/ReactInstanceManager;->builder()Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 218
    move-result-object v13

    .line 219
    .line 220
    .line 221
    invoke-virtual {v13, v8}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setApplication(Landroid/app/Application;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 222
    move-result-object v8

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8, v11}, Lcom/facebook/react/ReactInstanceManagerBuilder;->addPackages(Ljava/util/List;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 226
    move-result-object v8

    .line 227
    .line 228
    const-string v11, "index"

    .line 229
    .line 230
    .line 231
    invoke-virtual {v8, v11}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setJSMainModulePath(Ljava/lang/String;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 232
    move-result-object v8

    .line 233
    .line 234
    new-instance v11, Lcom/kubi/rn/core/SafeJSBundleLoader;

    .line 235
    .line 236
    new-instance v13, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$b;

    .line 237
    .line 238
    .line 239
    invoke-direct {v13, v9, v3, p1, v5}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$b;-><init>(Ljava/lang/String;Lcom/kubi/rn/core/OnceCallback;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v11, v9, v13}, Lcom/kubi/rn/core/SafeJSBundleLoader;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v8, v11}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setJSBundleLoader(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 246
    move-result-object v8

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v10}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setUseDeveloperSupport(Z)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 250
    move-result-object v8

    .line 251
    .line 252
    sget-object v11, Lcom/facebook/react/common/LifecycleState;->BEFORE_CREATE:Lcom/facebook/react/common/LifecycleState;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v8, v11}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setInitialLifecycleState(Lcom/facebook/react/common/LifecycleState;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 256
    move-result-object v8

    .line 257
    .line 258
    .line 259
    invoke-virtual {v8, v7}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setJSExceptionHandler(Lcom/facebook/react/bridge/JSExceptionHandler;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 260
    move-result-object v7

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$1$host$1;->getReactPackageTurboModuleManagerDelegateBuilder()Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;

    .line 264
    move-result-object v8

    .line 265
    .line 266
    .line 267
    invoke-virtual {v7, v8}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setReactPackageTurboModuleManagerDelegateBuilder(Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 268
    move-result-object v7

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$1$host$1;->getUIManagerProvider()Lcom/facebook/react/bridge/UIManagerProvider;

    .line 272
    move-result-object v8

    .line 273
    .line 274
    .line 275
    invoke-virtual {v7, v8}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setUIManagerProvider(Lcom/facebook/react/bridge/UIManagerProvider;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 276
    move-result-object v7

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$1$host$1;->getJavaScriptExecutorFactory()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 280
    move-result-object v8

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7, v8}, Lcom/facebook/react/ReactInstanceManagerBuilder;->setJavaScriptExecutorFactory(Lcom/facebook/react/bridge/JavaScriptExecutorFactory;)Lcom/facebook/react/ReactInstanceManagerBuilder;

    .line 284
    move-result-object v7

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7}, Lcom/facebook/react/ReactInstanceManagerBuilder;->build()Lcom/facebook/react/ReactInstanceManager;

    .line 288
    move-result-object v7

    .line 289
    .line 290
    iput-object v7, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    invoke-interface {v6}, Lkotlinx/coroutines/m;->isActive()Z

    .line 294
    move-result v7

    .line 295
    .line 296
    if-nez v7, :cond_4

    .line 297
    .line 298
    .line 299
    invoke-static {p1, v5}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->access$invokeSuspend$destroyCreatedManager(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 300
    goto :goto_2

    .line 301
    :catchall_2
    move-exception v0

    .line 302
    move-object v8, v0

    .line 303
    goto :goto_1

    .line 304
    .line 305
    :cond_4
    iget-object v7, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 306
    .line 307
    if-eqz v7, :cond_8

    .line 308
    .line 309
    check-cast v7, Lcom/facebook/react/ReactInstanceManager;

    .line 310
    .line 311
    if-eqz v10, :cond_5

    .line 312
    .line 313
    sget-object v8, Lcom/kubi/rn/core/BundleLoader;->INSTANCE:Lcom/kubi/rn/core/BundleLoader;

    .line 314
    .line 315
    .line 316
    invoke-static {v8, v7}, Lcom/kubi/rn/core/BundleLoader;->access$logMetroSourceUrlIfNeeded(Lcom/kubi/rn/core/BundleLoader;Lcom/facebook/react/ReactInstanceManager;)V

    .line 317
    .line 318
    :cond_5
    new-instance v8, Lcom/kubi/rn/core/ContextInitializedListenerWrapper;

    .line 319
    .line 320
    new-instance v10, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$d;

    .line 321
    .line 322
    .line 323
    invoke-direct {v10, v9, v3}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$d;-><init>(Ljava/lang/String;Lcom/kubi/rn/core/OnceCallback;)V

    .line 324
    .line 325
    .line 326
    invoke-direct {v8, v7, v10}, Lcom/kubi/rn/core/ContextInitializedListenerWrapper;-><init>(Lcom/facebook/react/ReactInstanceManager;Lkotlin/jvm/functions/Function1;)V

    .line 327
    .line 328
    iput-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    invoke-interface {v6}, Lkotlinx/coroutines/m;->isActive()Z

    .line 332
    move-result v0

    .line 333
    .line 334
    if-nez v0, :cond_6

    .line 335
    .line 336
    .line 337
    invoke-static {p1, v5}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->access$invokeSuspend$destroyCreatedManager(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 338
    goto :goto_2

    .line 339
    .line 340
    .line 341
    :cond_6
    invoke-virtual {v7, v8}, Lcom/facebook/react/ReactInstanceManager;->addReactInstanceEventListener(Lcom/facebook/react/ReactInstanceEventListener;)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v6}, Lkotlinx/coroutines/m;->isActive()Z

    .line 345
    move-result v0

    .line 346
    .line 347
    if-nez v0, :cond_7

    .line 348
    .line 349
    new-instance v0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$c;

    .line 350
    .line 351
    .line 352
    invoke-direct {v0, v7, v8}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3$c;-><init>(Lcom/facebook/react/ReactInstanceManager;Lcom/kubi/rn/core/ContextInitializedListenerWrapper;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v0}, Lcom/kubi/utils/x0;->e(Lkotlin/jvm/functions/Function0;)V

    .line 356
    .line 357
    .line 358
    invoke-static {p1, v5}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->access$invokeSuspend$destroyCreatedManager(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 359
    goto :goto_2

    .line 360
    .line 361
    .line 362
    :cond_7
    invoke-virtual {v7}, Lcom/facebook/react/ReactInstanceManager;->createReactContextInBackground()V

    .line 363
    goto :goto_2

    .line 364
    .line 365
    :cond_8
    const-string v0, "Required value was null."

    .line 366
    .line 367
    new-instance v7, Ljava/lang/IllegalStateException;

    .line 368
    .line 369
    .line 370
    invoke-direct {v7, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 371
    throw v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 372
    .line 373
    :goto_1
    :try_start_5
    const-string v9, "react-native"

    .line 374
    .line 375
    new-instance v7, Lcom/kubi/rn/exception/RNException;

    .line 376
    .line 377
    const/16 v12, 0x8

    .line 378
    const/4 v13, 0x0

    .line 379
    const/4 v10, 0x0

    .line 380
    const/4 v11, 0x0

    .line 381
    .line 382
    .line 383
    invoke-direct/range {v7 .. v13}, Lcom/kubi/rn/exception/RNException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v7, v4, v2, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v8}, Lcom/kubi/rn/core/OnceCallback;->resumeWithException(Ljava/lang/Throwable;)V

    .line 390
    goto :goto_2

    .line 391
    :catchall_3
    move-exception v0

    .line 392
    move-object v3, p1

    .line 393
    move-object v7, v0

    .line 394
    move-object v1, v5

    .line 395
    goto :goto_5

    .line 396
    .line 397
    .line 398
    :cond_9
    :goto_2
    invoke-virtual {v6}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    .line 399
    move-result-object v0

    .line 400
    .line 401
    .line 402
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 403
    move-result-object v3

    .line 404
    .line 405
    if-ne v0, v3, :cond_a

    .line 406
    .line 407
    .line 408
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 409
    .line 410
    :cond_a
    if-ne v0, v1, :cond_b

    .line 411
    :goto_3
    return-object v1

    .line 412
    :cond_b
    move-object v3, p1

    .line 413
    move-object p1, v0

    .line 414
    move-object v1, v5

    .line 415
    .line 416
    :goto_4
    :try_start_6
    check-cast p1, Lcom/facebook/react/ReactInstanceManager;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 417
    return-object p1

    .line 418
    .line 419
    :cond_c
    :try_start_7
    const-string v0, "ReactInstanceManager initialization handler is already registered"

    .line 420
    .line 421
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 422
    .line 423
    .line 424
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 425
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 426
    .line 427
    :goto_5
    new-instance v6, Lcom/kubi/rn/exception/RNException;

    .line 428
    .line 429
    const/16 v11, 0x8

    .line 430
    const/4 v12, 0x0

    .line 431
    .line 432
    const-string v8, "react-native"

    .line 433
    const/4 v9, 0x0

    .line 434
    const/4 v10, 0x0

    .line 435
    .line 436
    .line 437
    invoke-direct/range {v6 .. v12}, Lcom/kubi/rn/exception/RNException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 438
    .line 439
    .line 440
    invoke-static {v6, v4, v2, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    invoke-static {v3, v1}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->f(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 444
    throw v7

    .line 445
    .line 446
    :goto_6
    new-instance v5, Lcom/kubi/rn/exception/RNException;

    .line 447
    .line 448
    const/16 v10, 0x8

    .line 449
    const/4 v11, 0x0

    .line 450
    .line 451
    const-string v7, "awaitApplicationInitInCreateReactInstance"

    .line 452
    const/4 v8, 0x0

    .line 453
    const/4 v9, 0x0

    .line 454
    .line 455
    .line 456
    invoke-direct/range {v5 .. v11}, Lcom/kubi/rn/exception/RNException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v5, v4, v2, v4}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 460
    .line 461
    sget-object v7, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 462
    .line 463
    new-instance p1, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 467
    .line 468
    const-string v0, "createReactInstance "

    .line 469
    .line 470
    .line 471
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    iget-object v0, p0, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;->$bundleFilePath:Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    const-string v0, " \u7b49\u5f85 RN \u521d\u59cb\u5316\u5931\u8d25: "

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 485
    move-result-object v0

    .line 486
    .line 487
    .line 488
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    move-result-object v9

    .line 493
    const/4 v11, 0x4

    .line 494
    const/4 v12, 0x0

    .line 495
    .line 496
    const-string v8, "loadBundle"

    .line 497
    const/4 v10, 0x0

    .line 498
    .line 499
    .line 500
    invoke-static/range {v7 .. v12}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 501
    .line 502
    new-instance p1, Lcom/kubi/rn/core/ReactHostException;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 506
    move-result-object v0

    .line 507
    .line 508
    if-nez v0, :cond_d

    .line 509
    .line 510
    const-string v0, "RN runtime \u521d\u59cb\u5316\u5931\u8d25"

    .line 511
    .line 512
    :cond_d
    const/16 v1, 0x12e

    .line 513
    .line 514
    .line 515
    invoke-direct {p1, v1, v0}, Lcom/kubi/rn/core/ReactHostException;-><init>(ILjava/lang/String;)V

    .line 516
    throw p1
.end method
