.class public Li7/h;
.super Lf7/b;
.source "UTF8DataInputJsonParser.java"


# static fields
.field public static final Z:I

.field public static final a0:I

.field public static final b0:I

.field public static final c0:I

.field public static final d0:I

.field public static final e0:I

.field public static final f0:I

.field public static final g0:I

.field public static final h0:[I

.field public static final i0:[I


# instance fields
.field public S:Lcom/fasterxml/jackson/core/g;

.field public final T:Lk7/a;

.field public U:[I

.field public V:Z

.field public W:I

.field public X:Ljava/io/DataInput;

.field public Y:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_TRAILING_COMMA:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 6
    move-result v0

    .line 7
    .line 8
    sput v0, Li7/h;->Z:I

    .line 9
    .line 10
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NUMERIC_LEADING_ZEROS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 14
    move-result v0

    .line 15
    .line 16
    sput v0, Li7/h;->a0:I

    .line 17
    .line 18
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NON_NUMERIC_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 22
    move-result v0

    .line 23
    .line 24
    sput v0, Li7/h;->b0:I

    .line 25
    .line 26
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_MISSING_VALUES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 30
    move-result v0

    .line 31
    .line 32
    sput v0, Li7/h;->c0:I

    .line 33
    .line 34
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_SINGLE_QUOTES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 38
    move-result v0

    .line 39
    .line 40
    sput v0, Li7/h;->d0:I

    .line 41
    .line 42
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_UNQUOTED_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 46
    move-result v0

    .line 47
    .line 48
    sput v0, Li7/h;->e0:I

    .line 49
    .line 50
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 54
    move-result v0

    .line 55
    .line 56
    sput v0, Li7/h;->f0:I

    .line 57
    .line 58
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_YAML_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    .line 62
    move-result v0

    .line 63
    .line 64
    sput v0, Li7/h;->g0:I

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->j()[I

    .line 68
    move-result-object v0

    .line 69
    .line 70
    sput-object v0, Li7/h;->h0:[I

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->h()[I

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sput-object v0, Li7/h;->i0:[I

    .line 77
    return-void
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
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/d;ILjava/io/DataInput;Lcom/fasterxml/jackson/core/g;Lk7/a;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lf7/b;-><init>(Lcom/fasterxml/jackson/core/io/d;I)V

    .line 4
    .line 5
    const/16 p1, 0x10

    .line 6
    .line 7
    new-array p1, p1, [I

    .line 8
    .line 9
    iput-object p1, p0, Li7/h;->U:[I

    .line 10
    .line 11
    iput-object p4, p0, Li7/h;->S:Lcom/fasterxml/jackson/core/g;

    .line 12
    .line 13
    iput-object p5, p0, Li7/h;->T:Lk7/a;

    .line 14
    .line 15
    iput-object p3, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 16
    .line 17
    iput p6, p0, Li7/h;->Y:I

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
.end method

.method private final F2()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/h;->Y:I

    .line 3
    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 10
    move-result v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :catch_0
    invoke-virtual {p0}, Lf7/b;->k1()I

    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v1, -0x1

    .line 18
    .line 19
    iput v1, p0, Li7/h;->Y:I

    .line 20
    .line 21
    :goto_0
    const/16 v1, 0x20

    .line 22
    .line 23
    if-le v0, v1, :cond_3

    .line 24
    .line 25
    const/16 v1, 0x2f

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    const/16 v1, 0x23

    .line 30
    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    return v0

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    invoke-virtual {p0, v0}, Li7/h;->E2(I)I

    .line 37
    move-result v0

    .line 38
    return v0

    .line 39
    .line 40
    :cond_3
    const/16 v1, 0xd

    .line 41
    .line 42
    if-eq v0, v1, :cond_4

    .line 43
    .line 44
    const/16 v1, 0xa

    .line 45
    .line 46
    if-ne v0, v1, :cond_5

    .line 47
    .line 48
    :cond_4
    iget v0, p0, Lf7/b;->v:I

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    iput v0, p0, Lf7/b;->v:I

    .line 53
    .line 54
    :cond_5
    :try_start_1
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 58
    move-result v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :catch_1
    invoke-virtual {p0}, Lf7/b;->k1()I

    .line 63
    move-result v0

    .line 64
    return v0
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
.end method

.method private final G2()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 3
    .line 4
    sget v1, Li7/h;->g0:I

    .line 5
    and-int/2addr v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Li7/h;->y2()V

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private final L1(Ljava/lang/String;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p3}, Li7/h;->O1(I)I

    .line 4
    move-result p3

    .line 5
    int-to-char p3, p3

    .line 6
    .line 7
    .line 8
    invoke-static {p3}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3, p1}, Li7/h;->s2(ILjava/lang/String;)V

    .line 20
    :cond_0
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
.end method

.method private M1(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x7d

    .line 3
    .line 4
    const/16 v1, 0x5d

    .line 5
    .line 6
    if-ne p1, v1, :cond_1

    .line 7
    .line 8
    iget-object v2, p0, Lf7/b;->A:Li7/d;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 12
    move-result v2

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lf7/b;->t1(IC)V

    .line 18
    .line 19
    :cond_0
    iget-object v2, p0, Lf7/b;->A:Li7/d;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Li7/d;->l()Li7/d;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    iput-object v2, p0, Lf7/b;->A:Li7/d;

    .line 26
    .line 27
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    .line 29
    iput-object v2, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 30
    .line 31
    :cond_1
    if-ne p1, v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, v1}, Lf7/b;->t1(IC)V

    .line 43
    .line 44
    :cond_2
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Li7/d;->l()Li7/d;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iput-object p1, p0, Lf7/b;->A:Li7/d;

    .line 51
    .line 52
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 53
    .line 54
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 55
    :cond_3
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
.end method

.method public static final N2(II)I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    return p0

    .line 5
    .line 6
    :cond_0
    shl-int/lit8 p1, p1, 0x3

    .line 7
    const/4 v0, -0x1

    .line 8
    .line 9
    shl-int p1, v0, p1

    .line 10
    or-int/2addr p0, p1

    .line 11
    return p0
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
.end method

.method private S1()Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Li7/h;->h0:[I

    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    :goto_0
    iget-object v4, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 13
    .line 14
    .line 15
    invoke-interface {v4}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 16
    move-result v4

    .line 17
    .line 18
    aget v5, v1, v4

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x22

    .line 23
    .line 24
    if-ne v4, v1, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/i;->D(I)Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0, v0, v3, v4}, Li7/h;->U1([CII)V

    .line 35
    .line 36
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    .line 43
    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 44
    int-to-char v4, v4

    .line 45
    .line 46
    aput-char v4, v0, v3

    .line 47
    .line 48
    if-lt v5, v2, :cond_2

    .line 49
    .line 50
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 54
    move-result v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0, v5, v1}, Li7/h;->U1([CII)V

    .line 58
    .line 59
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :cond_2
    move v3, v5

    .line 66
    goto :goto_0
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public static W1([II)[I
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-array p0, p1, [I

    .line 5
    return-object p0

    .line 6
    :cond_0
    array-length v0, p0

    .line 7
    add-int/2addr v0, p1

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
.end method

.method private final d2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lf7/b;->E:Z

    .line 4
    .line 5
    iget-object v0, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    iput-object v1, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 15
    .line 16
    iget v2, p0, Lf7/b;->y:I

    .line 17
    .line 18
    iget v3, p0, Lf7/b;->z:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Li7/d;->m(II)Li7/d;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    iput-object v1, p0, Lf7/b;->A:Li7/d;

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 32
    .line 33
    iget v2, p0, Lf7/b;->y:I

    .line 34
    .line 35
    iget v3, p0, Lf7/b;->z:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2, v3}, Li7/d;->n(II)Li7/d;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    iput-object v1, p0, Lf7/b;->A:Li7/d;

    .line 42
    .line 43
    :cond_1
    :goto_0
    iput-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 44
    return-object v0
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
.end method

.method private final e2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x22

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Li7/h;->V:Z

    .line 8
    .line 9
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 10
    .line 11
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 12
    return-object p1

    .line 13
    .line 14
    :cond_0
    const/16 v0, 0x2d

    .line 15
    .line 16
    if-eq p1, v0, :cond_7

    .line 17
    .line 18
    const/16 v0, 0x2e

    .line 19
    .line 20
    if-eq p1, v0, :cond_6

    .line 21
    .line 22
    const/16 v0, 0x5b

    .line 23
    .line 24
    if-eq p1, v0, :cond_5

    .line 25
    .line 26
    const/16 v0, 0x66

    .line 27
    .line 28
    if-eq p1, v0, :cond_4

    .line 29
    .line 30
    const/16 v0, 0x6e

    .line 31
    .line 32
    if-eq p1, v0, :cond_3

    .line 33
    .line 34
    const/16 v0, 0x74

    .line 35
    .line 36
    if-eq p1, v0, :cond_2

    .line 37
    .line 38
    const/16 v0, 0x7b

    .line 39
    .line 40
    if-eq p1, v0, :cond_1

    .line 41
    .line 42
    .line 43
    packed-switch p1, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Li7/h;->b2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 50
    return-object p1

    .line 51
    .line 52
    .line 53
    :pswitch_0
    invoke-virtual {p0, p1}, Li7/h;->n2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 57
    return-object p1

    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 60
    .line 61
    iget v0, p0, Lf7/b;->y:I

    .line 62
    .line 63
    iget v1, p0, Lf7/b;->z:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Li7/d;->n(II)Li7/d;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    iput-object p1, p0, Lf7/b;->A:Li7/d;

    .line 70
    .line 71
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 72
    .line 73
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 74
    return-object p1

    .line 75
    .line 76
    .line 77
    :cond_2
    const-string/jumbo p1, "true"

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1, v1}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 81
    .line 82
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 83
    .line 84
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 85
    return-object p1

    .line 86
    .line 87
    :cond_3
    const-string p1, "null"

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1, v1}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 91
    .line 92
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 93
    .line 94
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 95
    return-object p1

    .line 96
    .line 97
    :cond_4
    const-string p1, "false"

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1, v1}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 101
    .line 102
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 103
    .line 104
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 105
    return-object p1

    .line 106
    .line 107
    :cond_5
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 108
    .line 109
    iget v0, p0, Lf7/b;->y:I

    .line 110
    .line 111
    iget v1, p0, Lf7/b;->z:I

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0, v1}, Li7/d;->m(II)Li7/d;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    iput-object p1, p0, Lf7/b;->A:Li7/d;

    .line 118
    .line 119
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 120
    .line 121
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 122
    return-object p1

    .line 123
    .line 124
    .line 125
    :cond_6
    invoke-virtual {p0}, Li7/h;->h2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 129
    return-object p1

    .line 130
    .line 131
    .line 132
    :cond_7
    invoke-virtual {p0}, Li7/h;->m2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    iput-object p1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 136
    return-object p1

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
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method

.method private r2(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "Invalid UTF-8 middle byte 0x"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 25
    return-void
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
.end method

.method private final u2()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->g()[I

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 10
    move-result v1

    .line 11
    .line 12
    :cond_0
    :goto_0
    aget v2, v0, v1

    .line 13
    .line 14
    if-eqz v2, :cond_6

    .line 15
    const/4 v3, 0x2

    .line 16
    .line 17
    if-eq v2, v3, :cond_5

    .line 18
    const/4 v3, 0x3

    .line 19
    .line 20
    if-eq v2, v3, :cond_4

    .line 21
    const/4 v3, 0x4

    .line 22
    .line 23
    if-eq v2, v3, :cond_3

    .line 24
    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    if-eq v2, v3, :cond_2

    .line 28
    .line 29
    const/16 v3, 0xd

    .line 30
    .line 31
    if-eq v2, v3, :cond_2

    .line 32
    .line 33
    const/16 v3, 0x2a

    .line 34
    .line 35
    if-eq v2, v3, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Li7/h;->p2(I)V

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_1
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 45
    move-result v1

    .line 46
    .line 47
    const/16 v2, 0x2f

    .line 48
    .line 49
    if-ne v1, v2, :cond_0

    .line 50
    return-void

    .line 51
    .line 52
    :cond_2
    iget v1, p0, Lf7/b;->v:I

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    iput v1, p0, Lf7/b;->v:I

    .line 57
    goto :goto_1

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {p0}, Li7/h;->C2()V

    .line 61
    goto :goto_1

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-virtual {p0}, Li7/h;->B2()V

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_5
    invoke-virtual {p0}, Li7/h;->A2()V

    .line 69
    .line 70
    :cond_6
    :goto_1
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 71
    .line 72
    .line 73
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 74
    move-result v1

    .line 75
    goto :goto_0
.end method

.method private final v2()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/h;->Y:I

    .line 3
    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, -0x1

    .line 13
    .line 14
    iput v1, p0, Li7/h;->Y:I

    .line 15
    .line 16
    :goto_0
    const/16 v1, 0x3a

    .line 17
    .line 18
    const/16 v2, 0x9

    .line 19
    .line 20
    const/16 v3, 0x23

    .line 21
    .line 22
    const/16 v4, 0x2f

    .line 23
    const/4 v5, 0x1

    .line 24
    .line 25
    const/16 v6, 0x20

    .line 26
    .line 27
    if-ne v0, v1, :cond_8

    .line 28
    .line 29
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 33
    move-result v0

    .line 34
    .line 35
    if-le v0, v6, :cond_3

    .line 36
    .line 37
    if-eq v0, v4, :cond_2

    .line 38
    .line 39
    if-ne v0, v3, :cond_1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    return v0

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_1
    invoke-virtual {p0, v0, v5}, Li7/h;->w2(IZ)I

    .line 45
    move-result v0

    .line 46
    return v0

    .line 47
    .line 48
    :cond_3
    if-eq v0, v6, :cond_4

    .line 49
    .line 50
    if-ne v0, v2, :cond_7

    .line 51
    .line 52
    :cond_4
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 56
    move-result v0

    .line 57
    .line 58
    if-le v0, v6, :cond_7

    .line 59
    .line 60
    if-eq v0, v4, :cond_6

    .line 61
    .line 62
    if-ne v0, v3, :cond_5

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    return v0

    .line 65
    .line 66
    .line 67
    :cond_6
    :goto_2
    invoke-virtual {p0, v0, v5}, Li7/h;->w2(IZ)I

    .line 68
    move-result v0

    .line 69
    return v0

    .line 70
    .line 71
    .line 72
    :cond_7
    invoke-virtual {p0, v0, v5}, Li7/h;->w2(IZ)I

    .line 73
    move-result v0

    .line 74
    return v0

    .line 75
    .line 76
    :cond_8
    if-eq v0, v6, :cond_9

    .line 77
    .line 78
    if-ne v0, v2, :cond_a

    .line 79
    .line 80
    :cond_9
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 84
    move-result v0

    .line 85
    .line 86
    :cond_a
    if-ne v0, v1, :cond_12

    .line 87
    .line 88
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 92
    move-result v0

    .line 93
    .line 94
    if-le v0, v6, :cond_d

    .line 95
    .line 96
    if-eq v0, v4, :cond_c

    .line 97
    .line 98
    if-ne v0, v3, :cond_b

    .line 99
    goto :goto_3

    .line 100
    :cond_b
    return v0

    .line 101
    .line 102
    .line 103
    :cond_c
    :goto_3
    invoke-virtual {p0, v0, v5}, Li7/h;->w2(IZ)I

    .line 104
    move-result v0

    .line 105
    return v0

    .line 106
    .line 107
    :cond_d
    if-eq v0, v6, :cond_e

    .line 108
    .line 109
    if-ne v0, v2, :cond_11

    .line 110
    .line 111
    :cond_e
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 115
    move-result v0

    .line 116
    .line 117
    if-le v0, v6, :cond_11

    .line 118
    .line 119
    if-eq v0, v4, :cond_10

    .line 120
    .line 121
    if-ne v0, v3, :cond_f

    .line 122
    goto :goto_4

    .line 123
    :cond_f
    return v0

    .line 124
    .line 125
    .line 126
    :cond_10
    :goto_4
    invoke-virtual {p0, v0, v5}, Li7/h;->w2(IZ)I

    .line 127
    move-result v0

    .line 128
    return v0

    .line 129
    .line 130
    .line 131
    :cond_11
    invoke-virtual {p0, v0, v5}, Li7/h;->w2(IZ)I

    .line 132
    move-result v0

    .line 133
    return v0

    .line 134
    :cond_12
    const/4 v1, 0x0

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v0, v1}, Li7/h;->w2(IZ)I

    .line 138
    move-result v0

    .line 139
    return v0
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
.end method

.method private final x2()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 3
    .line 4
    sget v1, Li7/h;->f0:I

    .line 5
    and-int/2addr v0, v1

    .line 6
    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 20
    move-result v0

    .line 21
    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Li7/h;->y2()V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    const/16 v1, 0x2a

    .line 29
    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Li7/h;->u2()V

    .line 34
    return-void

    .line 35
    .line 36
    .line 37
    :cond_2
    const-string/jumbo v1, "was expecting either \'*\' or \'/\' for a comment"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0, v1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 41
    return-void
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
.end method

.method private final y2()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->g()[I

    .line 4
    move-result-object v0

    .line 5
    .line 6
    :cond_0
    :goto_0
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 10
    move-result v1

    .line 11
    .line 12
    aget v2, v0, v1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    const/4 v3, 0x2

    .line 16
    .line 17
    if-eq v2, v3, :cond_4

    .line 18
    const/4 v3, 0x3

    .line 19
    .line 20
    if-eq v2, v3, :cond_3

    .line 21
    const/4 v3, 0x4

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    if-eq v2, v3, :cond_1

    .line 28
    .line 29
    const/16 v3, 0xd

    .line 30
    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    const/16 v3, 0x2a

    .line 34
    .line 35
    if-eq v2, v3, :cond_0

    .line 36
    .line 37
    if-gez v2, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Li7/h;->p2(I)V

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_1
    iget v0, p0, Lf7/b;->v:I

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    iput v0, p0, Lf7/b;->v:I

    .line 48
    return-void

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Li7/h;->C2()V

    .line 52
    goto :goto_0

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0}, Li7/h;->B2()V

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :cond_4
    invoke-virtual {p0}, Li7/h;->A2()V

    .line 60
    goto :goto_0
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
.end method


# virtual methods
.method public final A2()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    and-int/lit16 v1, v0, 0xc0

    .line 9
    .line 10
    const/16 v2, 0x80

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Li7/h;->r2(I)V

    .line 18
    :cond_0
    return-void
.end method

.method public final B2()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    and-int/lit16 v1, v0, 0xc0

    .line 9
    .line 10
    const/16 v2, 0x80

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Li7/h;->r2(I)V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 23
    move-result v0

    .line 24
    .line 25
    and-int/lit16 v1, v0, 0xc0

    .line 26
    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    and-int/lit16 v0, v0, 0xff

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0}, Li7/h;->r2(I)V

    .line 33
    :cond_1
    return-void
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
.end method

.method public final C2()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    and-int/lit16 v1, v0, 0xc0

    .line 9
    .line 10
    const/16 v2, 0x80

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Li7/h;->r2(I)V

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 23
    move-result v0

    .line 24
    .line 25
    and-int/lit16 v1, v0, 0xc0

    .line 26
    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    and-int/lit16 v0, v0, 0xff

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0}, Li7/h;->r2(I)V

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 38
    move-result v0

    .line 39
    .line 40
    and-int/lit16 v1, v0, 0xc0

    .line 41
    .line 42
    if-eq v1, v2, :cond_2

    .line 43
    .line 44
    and-int/lit16 v0, v0, 0xff

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v0}, Li7/h;->r2(I)V

    .line 48
    :cond_2
    return-void
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
.end method

.method public final D2()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/h;->Y:I

    .line 3
    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, -0x1

    .line 13
    .line 14
    iput v1, p0, Li7/h;->Y:I

    .line 15
    .line 16
    :goto_0
    const/16 v1, 0x20

    .line 17
    .line 18
    if-le v0, v1, :cond_3

    .line 19
    .line 20
    const/16 v1, 0x2f

    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/16 v1, 0x23

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    return v0

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_1
    invoke-virtual {p0, v0}, Li7/h;->E2(I)I

    .line 32
    move-result v0

    .line 33
    return v0

    .line 34
    .line 35
    :cond_3
    const/16 v1, 0xd

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    const/16 v1, 0xa

    .line 40
    .line 41
    if-ne v0, v1, :cond_5

    .line 42
    .line 43
    :cond_4
    iget v0, p0, Lf7/b;->v:I

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    iput v0, p0, Lf7/b;->v:I

    .line 48
    .line 49
    :cond_5
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 53
    move-result v0

    .line 54
    goto :goto_0
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
.end method

.method public final E2(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    const/16 v0, 0x20

    .line 3
    .line 4
    if-le p1, v0, :cond_2

    .line 5
    .line 6
    const/16 v0, 0x2f

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Li7/h;->x2()V

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    const/16 v0, 0x23

    .line 15
    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Li7/h;->G2()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_4

    .line 23
    :cond_1
    return p1

    .line 24
    .line 25
    :cond_2
    const/16 v0, 0xd

    .line 26
    .line 27
    if-eq p1, v0, :cond_3

    .line 28
    .line 29
    const/16 v0, 0xa

    .line 30
    .line 31
    if-ne p1, v0, :cond_4

    .line 32
    .line 33
    :cond_3
    iget p1, p0, Lf7/b;->v:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, Lf7/b;->v:I

    .line 38
    .line 39
    :cond_4
    :goto_1
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 43
    move-result p1

    .line 44
    goto :goto_0
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
.end method

.method public final H2()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/h;->Y:I

    .line 3
    .line 4
    const/16 v1, 0x20

    .line 5
    .line 6
    if-gt v0, v1, :cond_2

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    iput v1, p0, Li7/h;->Y:I

    .line 10
    .line 11
    const/16 v1, 0xd

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void

    .line 20
    .line 21
    :cond_1
    :goto_0
    iget v0, p0, Lf7/b;->v:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, Lf7/b;->v:I

    .line 26
    return-void

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-virtual {p0, v0}, Lf7/c;->R0(I)V

    .line 30
    return-void
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
.end method

.method public final I2([III)Ljava/lang/String;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move/from16 v2, p2

    .line 7
    .line 8
    move/from16 v3, p3

    .line 9
    .line 10
    shl-int/lit8 v4, v2, 0x2

    .line 11
    const/4 v5, 0x4

    .line 12
    sub-int/2addr v4, v5

    .line 13
    add-int/2addr v4, v3

    .line 14
    const/4 v7, 0x3

    .line 15
    .line 16
    if-ge v3, v5, :cond_0

    .line 17
    .line 18
    add-int/lit8 v8, v2, -0x1

    .line 19
    .line 20
    aget v9, v1, v8

    .line 21
    .line 22
    rsub-int/lit8 v10, v3, 0x4

    .line 23
    shl-int/2addr v10, v7

    .line 24
    .line 25
    shl-int v10, v9, v10

    .line 26
    .line 27
    aput v10, v1, v8

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v9, 0x0

    .line 30
    .line 31
    :goto_0
    iget-object v8, v0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v8}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 35
    move-result-object v8

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    .line 39
    :goto_1
    if-ge v10, v4, :cond_e

    .line 40
    .line 41
    shr-int/lit8 v12, v10, 0x2

    .line 42
    .line 43
    aget v12, v1, v12

    .line 44
    .line 45
    and-int/lit8 v13, v10, 0x3

    .line 46
    .line 47
    rsub-int/lit8 v13, v13, 0x3

    .line 48
    shl-int/2addr v13, v7

    .line 49
    shr-int/2addr v12, v13

    .line 50
    .line 51
    and-int/lit16 v13, v12, 0xff

    .line 52
    .line 53
    add-int/lit8 v14, v10, 0x1

    .line 54
    .line 55
    const/16 v15, 0x7f

    .line 56
    .line 57
    if-le v13, v15, :cond_c

    .line 58
    .line 59
    and-int/lit16 v15, v12, 0xe0

    .line 60
    .line 61
    move/from16 v16, v7

    .line 62
    .line 63
    const/16 v7, 0xc0

    .line 64
    const/4 v5, 0x1

    .line 65
    .line 66
    if-ne v15, v7, :cond_1

    .line 67
    .line 68
    and-int/lit8 v7, v12, 0x1f

    .line 69
    move v12, v5

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :cond_1
    and-int/lit16 v7, v12, 0xf0

    .line 73
    .line 74
    const/16 v15, 0xe0

    .line 75
    .line 76
    if-ne v7, v15, :cond_2

    .line 77
    .line 78
    and-int/lit8 v7, v12, 0xf

    .line 79
    const/4 v12, 0x2

    .line 80
    goto :goto_2

    .line 81
    .line 82
    :cond_2
    and-int/lit16 v7, v12, 0xf8

    .line 83
    .line 84
    const/16 v15, 0xf0

    .line 85
    .line 86
    if-ne v7, v15, :cond_3

    .line 87
    .line 88
    and-int/lit8 v7, v12, 0x7

    .line 89
    .line 90
    move/from16 v12, v16

    .line 91
    goto :goto_2

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {v0, v13}, Li7/h;->q2(I)V

    .line 95
    move v7, v5

    .line 96
    move v12, v7

    .line 97
    .line 98
    :goto_2
    add-int v13, v14, v12

    .line 99
    .line 100
    if-le v13, v4, :cond_4

    .line 101
    .line 102
    const-string v13, " in field name"

    .line 103
    .line 104
    sget-object v15, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v13, v15}, Lf7/c;->P0(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 108
    .line 109
    :cond_4
    shr-int/lit8 v13, v14, 0x2

    .line 110
    .line 111
    aget v13, v1, v13

    .line 112
    .line 113
    and-int/lit8 v14, v14, 0x3

    .line 114
    .line 115
    rsub-int/lit8 v14, v14, 0x3

    .line 116
    .line 117
    shl-int/lit8 v14, v14, 0x3

    .line 118
    shr-int/2addr v13, v14

    .line 119
    .line 120
    add-int/lit8 v14, v10, 0x2

    .line 121
    .line 122
    and-int/lit16 v15, v13, 0xc0

    .line 123
    .line 124
    const/16 v6, 0x80

    .line 125
    .line 126
    if-eq v15, v6, :cond_5

    .line 127
    .line 128
    .line 129
    invoke-direct {v0, v13}, Li7/h;->r2(I)V

    .line 130
    .line 131
    :cond_5
    shl-int/lit8 v7, v7, 0x6

    .line 132
    .line 133
    and-int/lit8 v13, v13, 0x3f

    .line 134
    or-int/2addr v7, v13

    .line 135
    .line 136
    if-le v12, v5, :cond_9

    .line 137
    .line 138
    shr-int/lit8 v5, v14, 0x2

    .line 139
    .line 140
    aget v5, v1, v5

    .line 141
    .line 142
    and-int/lit8 v13, v14, 0x3

    .line 143
    .line 144
    rsub-int/lit8 v13, v13, 0x3

    .line 145
    .line 146
    shl-int/lit8 v13, v13, 0x3

    .line 147
    shr-int/2addr v5, v13

    .line 148
    .line 149
    add-int/lit8 v14, v10, 0x3

    .line 150
    .line 151
    and-int/lit16 v13, v5, 0xc0

    .line 152
    .line 153
    if-eq v13, v6, :cond_6

    .line 154
    .line 155
    .line 156
    invoke-direct {v0, v5}, Li7/h;->r2(I)V

    .line 157
    .line 158
    :cond_6
    shl-int/lit8 v7, v7, 0x6

    .line 159
    .line 160
    and-int/lit8 v5, v5, 0x3f

    .line 161
    or-int/2addr v5, v7

    .line 162
    const/4 v7, 0x2

    .line 163
    .line 164
    if-le v12, v7, :cond_8

    .line 165
    .line 166
    shr-int/lit8 v7, v14, 0x2

    .line 167
    .line 168
    aget v7, v1, v7

    .line 169
    .line 170
    and-int/lit8 v13, v14, 0x3

    .line 171
    .line 172
    rsub-int/lit8 v13, v13, 0x3

    .line 173
    .line 174
    shl-int/lit8 v13, v13, 0x3

    .line 175
    shr-int/2addr v7, v13

    .line 176
    .line 177
    add-int/lit8 v14, v10, 0x4

    .line 178
    .line 179
    and-int/lit16 v10, v7, 0xc0

    .line 180
    .line 181
    if-eq v10, v6, :cond_7

    .line 182
    .line 183
    and-int/lit16 v6, v7, 0xff

    .line 184
    .line 185
    .line 186
    invoke-direct {v0, v6}, Li7/h;->r2(I)V

    .line 187
    .line 188
    :cond_7
    shl-int/lit8 v5, v5, 0x6

    .line 189
    .line 190
    and-int/lit8 v6, v7, 0x3f

    .line 191
    or-int/2addr v5, v6

    .line 192
    move v13, v5

    .line 193
    :goto_3
    const/4 v7, 0x2

    .line 194
    goto :goto_4

    .line 195
    :cond_8
    move v13, v5

    .line 196
    goto :goto_4

    .line 197
    :cond_9
    move v13, v7

    .line 198
    goto :goto_3

    .line 199
    .line 200
    :goto_4
    if-le v12, v7, :cond_b

    .line 201
    .line 202
    const/high16 v5, 0x10000

    .line 203
    sub-int/2addr v13, v5

    .line 204
    array-length v5, v8

    .line 205
    .line 206
    if-lt v11, v5, :cond_a

    .line 207
    .line 208
    iget-object v5, v0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 212
    move-result-object v8

    .line 213
    .line 214
    :cond_a
    add-int/lit8 v5, v11, 0x1

    .line 215
    .line 216
    shr-int/lit8 v6, v13, 0xa

    .line 217
    .line 218
    .line 219
    const v7, 0xd800

    .line 220
    add-int/2addr v6, v7

    .line 221
    int-to-char v6, v6

    .line 222
    .line 223
    aput-char v6, v8, v11

    .line 224
    .line 225
    and-int/lit16 v6, v13, 0x3ff

    .line 226
    .line 227
    .line 228
    const v7, 0xdc00

    .line 229
    .line 230
    or-int v13, v6, v7

    .line 231
    move v11, v5

    .line 232
    :cond_b
    :goto_5
    move v10, v14

    .line 233
    goto :goto_6

    .line 234
    .line 235
    :cond_c
    move/from16 v16, v7

    .line 236
    goto :goto_5

    .line 237
    :goto_6
    array-length v5, v8

    .line 238
    .line 239
    if-lt v11, v5, :cond_d

    .line 240
    .line 241
    iget-object v5, v0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/util/i;->o()[C

    .line 245
    move-result-object v5

    .line 246
    move-object v8, v5

    .line 247
    .line 248
    :cond_d
    add-int/lit8 v5, v11, 0x1

    .line 249
    int-to-char v6, v13

    .line 250
    .line 251
    aput-char v6, v8, v11

    .line 252
    move v11, v5

    .line 253
    .line 254
    move/from16 v7, v16

    .line 255
    const/4 v5, 0x4

    .line 256
    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    :cond_e
    new-instance v4, Ljava/lang/String;

    .line 260
    const/4 v5, 0x0

    .line 261
    .line 262
    .line 263
    invoke-direct {v4, v8, v5, v11}, Ljava/lang/String;-><init>([CII)V

    .line 264
    const/4 v5, 0x4

    .line 265
    .line 266
    if-ge v3, v5, :cond_f

    .line 267
    .line 268
    add-int/lit8 v3, v2, -0x1

    .line 269
    .line 270
    aput v9, v1, v3

    .line 271
    .line 272
    :cond_f
    iget-object v3, v0, Li7/h;->T:Lk7/a;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v4, v1, v2}, Lk7/a;->p(Ljava/lang/String;[II)Ljava/lang/String;

    .line 276
    move-result-object v1

    .line 277
    return-object v1
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
.end method

.method public final J2(II)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Li7/h;->N2(II)I

    .line 4
    move-result p1

    .line 5
    .line 6
    iget-object v0, p0, Li7/h;->T:Lk7/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lk7/a;->w(I)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Li7/h;->U:[I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    aput p1, v0, v1

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, p1, p2}, Li7/h;->I2([III)Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    return-object p1
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
.end method

.method public final K2(III)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2, p3}, Li7/h;->N2(II)I

    .line 4
    move-result p2

    .line 5
    .line 6
    iget-object v0, p0, Li7/h;->T:Lk7/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lk7/a;->x(II)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Li7/h;->U:[I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    aput p1, v0, v1

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    aput p2, v0, p1

    .line 22
    const/4 p1, 0x2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, p1, p3}, Li7/h;->I2([III)Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    return-object p1
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
.end method

.method public final L2(IIII)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p3, p4}, Li7/h;->N2(II)I

    .line 4
    move-result p3

    .line 5
    .line 6
    iget-object v0, p0, Li7/h;->T:Lk7/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lk7/a;->y(III)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Li7/h;->U:[I

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    aput p1, v0, v1

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    aput p2, v0, p1

    .line 22
    const/4 p1, 0x2

    .line 23
    .line 24
    .line 25
    invoke-static {p3, p4}, Li7/h;->N2(II)I

    .line 26
    move-result p2

    .line 27
    .line 28
    aput p2, v0, p1

    .line 29
    const/4 p1, 0x3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, p1, p4}, Li7/h;->I2([III)Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    return-object p1
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
.end method

.method public final M2([IIII)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    if-lt p2, v0, :cond_0

    .line 4
    array-length v0, p1

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Li7/h;->W1([II)[I

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iput-object p1, p0, Li7/h;->U:[I

    .line 11
    .line 12
    :cond_0
    add-int/lit8 v0, p2, 0x1

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p4}, Li7/h;->N2(II)I

    .line 16
    move-result p3

    .line 17
    .line 18
    aput p3, p1, p2

    .line 19
    .line 20
    iget-object p2, p0, Li7/h;->T:Lk7/a;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1, v0}, Lk7/a;->z([II)Ljava/lang/String;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, v0, p4}, Li7/h;->I2([III)Ljava/lang/String;

    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    return-object p2
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
.end method

.method public final N1(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf7/b;->l1()Lcom/fasterxml/jackson/core/util/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    :cond_0
    :goto_0
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 10
    move-result v1

    .line 11
    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    if-le v1, v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    .line 18
    move-result v2

    .line 19
    .line 20
    const/16 v3, 0x22

    .line 21
    .line 22
    if-gez v2, :cond_2

    .line 23
    .line 24
    if-ne v1, v3, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, v1, v2}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 34
    move-result v2

    .line 35
    .line 36
    if-gez v2, :cond_2

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_2
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 43
    move-result v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    .line 47
    move-result v4

    .line 48
    .line 49
    if-gez v4, :cond_3

    .line 50
    const/4 v4, 0x1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1, v1, v4}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 54
    move-result v4

    .line 55
    .line 56
    :cond_3
    shl-int/lit8 v1, v2, 0x6

    .line 57
    or-int/2addr v1, v4

    .line 58
    .line 59
    iget-object v2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 60
    .line 61
    .line 62
    invoke-interface {v2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 63
    move-result v2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    .line 67
    move-result v4

    .line 68
    const/4 v5, 0x3

    .line 69
    const/4 v6, 0x2

    .line 70
    const/4 v7, -0x2

    .line 71
    .line 72
    if-gez v4, :cond_9

    .line 73
    .line 74
    if-eq v4, v7, :cond_6

    .line 75
    .line 76
    if-ne v2, v3, :cond_5

    .line 77
    .line 78
    shr-int/lit8 v1, v1, 0x4

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    .line 85
    move-result v1

    .line 86
    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lf7/b;->m1(Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    .line 97
    .line 98
    :cond_5
    invoke-virtual {p0, p1, v2, v6}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 99
    move-result v4

    .line 100
    .line 101
    :cond_6
    if-ne v4, v7, :cond_9

    .line 102
    .line 103
    iget-object v2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 104
    .line 105
    .line 106
    invoke-interface {v2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 107
    move-result v2

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPaddingChar(I)Z

    .line 111
    move-result v3

    .line 112
    .line 113
    if-nez v3, :cond_8

    .line 114
    .line 115
    const/16 v3, 0x5c

    .line 116
    .line 117
    if-ne v2, v3, :cond_7

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1, v2, v5}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 121
    move-result v3

    .line 122
    .line 123
    if-ne v3, v7, :cond_7

    .line 124
    goto :goto_1

    .line 125
    .line 126
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    const-string v1, "expected padding character \'"

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getPaddingChar()C

    .line 138
    move-result v1

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v1, "\'"

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1, v2, v5, v0}, Lf7/b;->G1(Lcom/fasterxml/jackson/core/Base64Variant;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 154
    move-result-object p1

    .line 155
    throw p1

    .line 156
    .line 157
    :cond_8
    :goto_1
    shr-int/lit8 v1, v1, 0x4

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->b(I)V

    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_9
    shl-int/lit8 v1, v1, 0x6

    .line 165
    or-int/2addr v1, v4

    .line 166
    .line 167
    iget-object v2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 168
    .line 169
    .line 170
    invoke-interface {v2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 171
    move-result v2

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    .line 175
    move-result v4

    .line 176
    .line 177
    if-gez v4, :cond_d

    .line 178
    .line 179
    if-eq v4, v7, :cond_c

    .line 180
    .line 181
    if-ne v2, v3, :cond_b

    .line 182
    shr-int/2addr v1, v6

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->h(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    .line 189
    move-result v1

    .line 190
    .line 191
    if-eqz v1, :cond_a

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, p1}, Lf7/b;->m1(Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 195
    .line 196
    .line 197
    :cond_a
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 198
    move-result-object p1

    .line 199
    return-object p1

    .line 200
    .line 201
    .line 202
    :cond_b
    invoke-virtual {p0, p1, v2, v5}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 203
    move-result v4

    .line 204
    .line 205
    :cond_c
    if-ne v4, v7, :cond_d

    .line 206
    .line 207
    shr-int/lit8 v1, v1, 0x2

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->h(I)V

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_d
    shl-int/lit8 v1, v1, 0x6

    .line 215
    or-int/2addr v1, v4

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/c;->g(I)V

    .line 219
    .line 220
    goto/16 :goto_0
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
.end method

.method public O1(I)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    and-int/lit16 v0, p1, 0xff

    .line 3
    .line 4
    const/16 v1, 0x7f

    .line 5
    .line 6
    if-le v0, v1, :cond_6

    .line 7
    .line 8
    and-int/lit16 v1, p1, 0xe0

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x1

    .line 11
    .line 12
    const/16 v4, 0xc0

    .line 13
    .line 14
    if-ne v1, v4, :cond_0

    .line 15
    .line 16
    and-int/lit8 v0, p1, 0x1f

    .line 17
    :goto_0
    move p1, v3

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    and-int/lit16 v1, p1, 0xf0

    .line 21
    .line 22
    const/16 v4, 0xe0

    .line 23
    .line 24
    if-ne v1, v4, :cond_1

    .line 25
    .line 26
    and-int/lit8 v0, p1, 0xf

    .line 27
    move p1, v2

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_1
    and-int/lit16 v1, p1, 0xf8

    .line 31
    .line 32
    const/16 v4, 0xf0

    .line 33
    .line 34
    if-ne v1, v4, :cond_2

    .line 35
    .line 36
    and-int/lit8 v0, p1, 0x7

    .line 37
    const/4 p1, 0x3

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_2
    and-int/lit16 p1, p1, 0xff

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Li7/h;->q2(I)V

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :goto_1
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 47
    .line 48
    .line 49
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 50
    move-result v1

    .line 51
    .line 52
    and-int/lit16 v4, v1, 0xc0

    .line 53
    .line 54
    const/16 v5, 0x80

    .line 55
    .line 56
    if-eq v4, v5, :cond_3

    .line 57
    .line 58
    and-int/lit16 v4, v1, 0xff

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v4}, Li7/h;->r2(I)V

    .line 62
    .line 63
    :cond_3
    shl-int/lit8 v0, v0, 0x6

    .line 64
    .line 65
    and-int/lit8 v1, v1, 0x3f

    .line 66
    or-int/2addr v0, v1

    .line 67
    .line 68
    if-le p1, v3, :cond_6

    .line 69
    .line 70
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 71
    .line 72
    .line 73
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 74
    move-result v1

    .line 75
    .line 76
    and-int/lit16 v3, v1, 0xc0

    .line 77
    .line 78
    if-eq v3, v5, :cond_4

    .line 79
    .line 80
    and-int/lit16 v3, v1, 0xff

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, v3}, Li7/h;->r2(I)V

    .line 84
    .line 85
    :cond_4
    shl-int/lit8 v0, v0, 0x6

    .line 86
    .line 87
    and-int/lit8 v1, v1, 0x3f

    .line 88
    or-int/2addr v0, v1

    .line 89
    .line 90
    if-le p1, v2, :cond_6

    .line 91
    .line 92
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 96
    move-result p1

    .line 97
    .line 98
    and-int/lit16 v1, p1, 0xc0

    .line 99
    .line 100
    if-eq v1, v5, :cond_5

    .line 101
    .line 102
    and-int/lit16 v1, p1, 0xff

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, v1}, Li7/h;->r2(I)V

    .line 106
    .line 107
    :cond_5
    shl-int/lit8 v0, v0, 0x6

    .line 108
    .line 109
    and-int/lit8 p1, p1, 0x3f

    .line 110
    or-int/2addr p1, v0

    .line 111
    return p1

    .line 112
    :cond_6
    return v0
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
.end method

.method public final O2([IIIII)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Li7/h;->i0:[I

    .line 3
    .line 4
    :goto_0
    aget v1, v0, p4

    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    if-eqz v1, :cond_a

    .line 9
    .line 10
    const/16 v1, 0x22

    .line 11
    .line 12
    if-ne p4, v1, :cond_3

    .line 13
    .line 14
    if-lez p5, :cond_1

    .line 15
    array-length p4, p1

    .line 16
    .line 17
    if-lt p2, p4, :cond_0

    .line 18
    array-length p4, p1

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p4}, Li7/h;->W1([II)[I

    .line 22
    move-result-object p1

    .line 23
    .line 24
    iput-object p1, p0, Li7/h;->U:[I

    .line 25
    .line 26
    :cond_0
    add-int/lit8 p4, p2, 0x1

    .line 27
    .line 28
    .line 29
    invoke-static {p3, p5}, Li7/h;->N2(II)I

    .line 30
    move-result p3

    .line 31
    .line 32
    aput p3, p1, p2

    .line 33
    move p2, p4

    .line 34
    .line 35
    :cond_1
    iget-object p3, p0, Li7/h;->T:Lk7/a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, p1, p2}, Lk7/a;->z([II)Ljava/lang/String;

    .line 39
    move-result-object p3

    .line 40
    .line 41
    if-nez p3, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1, p2, p5}, Li7/h;->I2([III)Ljava/lang/String;

    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_2
    return-object p3

    .line 48
    .line 49
    :cond_3
    const/16 v1, 0x5c

    .line 50
    .line 51
    if-eq p4, v1, :cond_4

    .line 52
    .line 53
    const-string v1, "name"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p4, v1}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 57
    goto :goto_1

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p0}, Li7/h;->j1()C

    .line 61
    move-result p4

    .line 62
    .line 63
    :goto_1
    const/16 v1, 0x7f

    .line 64
    .line 65
    if-le p4, v1, :cond_a

    .line 66
    const/4 v1, 0x0

    .line 67
    .line 68
    if-lt p5, v2, :cond_6

    .line 69
    array-length p5, p1

    .line 70
    .line 71
    if-lt p2, p5, :cond_5

    .line 72
    array-length p5, p1

    .line 73
    .line 74
    .line 75
    invoke-static {p1, p5}, Li7/h;->W1([II)[I

    .line 76
    move-result-object p1

    .line 77
    .line 78
    iput-object p1, p0, Li7/h;->U:[I

    .line 79
    .line 80
    :cond_5
    add-int/lit8 p5, p2, 0x1

    .line 81
    .line 82
    aput p3, p1, p2

    .line 83
    move p2, p5

    .line 84
    move p3, v1

    .line 85
    move p5, p3

    .line 86
    .line 87
    :cond_6
    const/16 v4, 0x800

    .line 88
    .line 89
    if-ge p4, v4, :cond_7

    .line 90
    .line 91
    shl-int/lit8 p3, p3, 0x8

    .line 92
    .line 93
    shr-int/lit8 v1, p4, 0x6

    .line 94
    .line 95
    or-int/lit16 v1, v1, 0xc0

    .line 96
    or-int/2addr p3, v1

    .line 97
    .line 98
    add-int/lit8 p5, p5, 0x1

    .line 99
    goto :goto_3

    .line 100
    .line 101
    :cond_7
    shl-int/lit8 p3, p3, 0x8

    .line 102
    .line 103
    shr-int/lit8 v4, p4, 0xc

    .line 104
    .line 105
    or-int/lit16 v4, v4, 0xe0

    .line 106
    or-int/2addr p3, v4

    .line 107
    .line 108
    add-int/lit8 p5, p5, 0x1

    .line 109
    .line 110
    if-lt p5, v2, :cond_9

    .line 111
    array-length p5, p1

    .line 112
    .line 113
    if-lt p2, p5, :cond_8

    .line 114
    array-length p5, p1

    .line 115
    .line 116
    .line 117
    invoke-static {p1, p5}, Li7/h;->W1([II)[I

    .line 118
    move-result-object p1

    .line 119
    .line 120
    iput-object p1, p0, Li7/h;->U:[I

    .line 121
    .line 122
    :cond_8
    add-int/lit8 p5, p2, 0x1

    .line 123
    .line 124
    aput p3, p1, p2

    .line 125
    move p2, p5

    .line 126
    move p5, v1

    .line 127
    goto :goto_2

    .line 128
    :cond_9
    move v1, p3

    .line 129
    .line 130
    :goto_2
    shl-int/lit8 p3, v1, 0x8

    .line 131
    .line 132
    shr-int/lit8 v1, p4, 0x6

    .line 133
    .line 134
    and-int/lit8 v1, v1, 0x3f

    .line 135
    .line 136
    or-int/lit16 v1, v1, 0x80

    .line 137
    or-int/2addr p3, v1

    .line 138
    add-int/2addr p5, v3

    .line 139
    .line 140
    :goto_3
    and-int/lit8 p4, p4, 0x3f

    .line 141
    .line 142
    or-int/lit16 p4, p4, 0x80

    .line 143
    .line 144
    :cond_a
    if-ge p5, v2, :cond_b

    .line 145
    .line 146
    add-int/lit8 p5, p5, 0x1

    .line 147
    .line 148
    shl-int/lit8 p3, p3, 0x8

    .line 149
    or-int/2addr p3, p4

    .line 150
    goto :goto_4

    .line 151
    :cond_b
    array-length p5, p1

    .line 152
    .line 153
    if-lt p2, p5, :cond_c

    .line 154
    array-length p5, p1

    .line 155
    .line 156
    .line 157
    invoke-static {p1, p5}, Li7/h;->W1([II)[I

    .line 158
    move-result-object p1

    .line 159
    .line 160
    iput-object p1, p0, Li7/h;->U:[I

    .line 161
    .line 162
    :cond_c
    add-int/lit8 p5, p2, 0x1

    .line 163
    .line 164
    aput p3, p1, p2

    .line 165
    move p3, p4

    .line 166
    move p2, p5

    .line 167
    move p5, v3

    .line 168
    .line 169
    :goto_4
    iget-object p4, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 170
    .line 171
    .line 172
    invoke-interface {p4}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 173
    move-result p4

    .line 174
    .line 175
    goto/16 :goto_0
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
.end method

.method public final P1(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    and-int/lit16 v1, v0, 0xc0

    .line 9
    .line 10
    const/16 v2, 0x80

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    and-int/lit16 v1, v0, 0xff

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, Li7/h;->r2(I)V

    .line 18
    .line 19
    :cond_0
    and-int/lit8 p1, p1, 0x1f

    .line 20
    .line 21
    shl-int/lit8 p1, p1, 0x6

    .line 22
    .line 23
    and-int/lit8 v0, v0, 0x3f

    .line 24
    or-int/2addr p1, v0

    .line 25
    return p1
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
.end method

.method public final P2(III)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v1, p0, Li7/h;->U:[I

    .line 3
    const/4 v2, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move v3, p1

    .line 6
    move v4, p2

    .line 7
    move v5, p3

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {v0 .. v5}, Li7/h;->O2([IIIII)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public final Q1(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    and-int/lit8 p1, p1, 0xf

    .line 3
    .line 4
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 8
    move-result v0

    .line 9
    .line 10
    and-int/lit16 v1, v0, 0xc0

    .line 11
    .line 12
    const/16 v2, 0x80

    .line 13
    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    and-int/lit16 v1, v0, 0xff

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v1}, Li7/h;->r2(I)V

    .line 20
    .line 21
    :cond_0
    shl-int/lit8 p1, p1, 0x6

    .line 22
    .line 23
    and-int/lit8 v0, v0, 0x3f

    .line 24
    or-int/2addr p1, v0

    .line 25
    .line 26
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 30
    move-result v0

    .line 31
    .line 32
    and-int/lit16 v1, v0, 0xc0

    .line 33
    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    and-int/lit16 v1, v0, 0xff

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v1}, Li7/h;->r2(I)V

    .line 40
    .line 41
    :cond_1
    shl-int/lit8 p1, p1, 0x6

    .line 42
    .line 43
    and-int/lit8 v0, v0, 0x3f

    .line 44
    or-int/2addr p1, v0

    .line 45
    return p1
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
.end method

.method public final Q2(IIII)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v1, p0, Li7/h;->U:[I

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    aput p1, v1, v0

    .line 6
    const/4 v2, 0x1

    .line 7
    move-object v0, p0

    .line 8
    move v3, p2

    .line 9
    move v4, p3

    .line 10
    move v5, p4

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {v0 .. v5}, Li7/h;->O2([IIIII)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public final R1(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    and-int/lit16 v1, v0, 0xc0

    .line 9
    .line 10
    const/16 v2, 0x80

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    and-int/lit16 v1, v0, 0xff

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, Li7/h;->r2(I)V

    .line 18
    .line 19
    :cond_0
    and-int/lit8 p1, p1, 0x7

    .line 20
    .line 21
    shl-int/lit8 p1, p1, 0x6

    .line 22
    .line 23
    and-int/lit8 v0, v0, 0x3f

    .line 24
    or-int/2addr p1, v0

    .line 25
    .line 26
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 30
    move-result v0

    .line 31
    .line 32
    and-int/lit16 v1, v0, 0xc0

    .line 33
    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    and-int/lit16 v1, v0, 0xff

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v1}, Li7/h;->r2(I)V

    .line 40
    .line 41
    :cond_1
    shl-int/lit8 p1, p1, 0x6

    .line 42
    .line 43
    and-int/lit8 v0, v0, 0x3f

    .line 44
    or-int/2addr p1, v0

    .line 45
    .line 46
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 50
    move-result v0

    .line 51
    .line 52
    and-int/lit16 v1, v0, 0xc0

    .line 53
    .line 54
    if-eq v1, v2, :cond_2

    .line 55
    .line 56
    and-int/lit16 v1, v0, 0xff

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, v1}, Li7/h;->r2(I)V

    .line 60
    .line 61
    :cond_2
    shl-int/lit8 p1, p1, 0x6

    .line 62
    .line 63
    and-int/lit8 v0, v0, 0x3f

    .line 64
    or-int/2addr p1, v0

    .line 65
    .line 66
    const/high16 v0, 0x10000

    .line 67
    sub-int/2addr p1, v0

    .line 68
    return p1
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
.end method

.method public final R2(IIIII)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v1, p0, Li7/h;->U:[I

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    aput p1, v1, v0

    .line 6
    const/4 p1, 0x1

    .line 7
    .line 8
    aput p2, v1, p1

    .line 9
    const/4 v2, 0x2

    .line 10
    move-object v0, p0

    .line 11
    move v3, p3

    .line 12
    move v4, p4

    .line 13
    move v5, p5

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {v0 .. v5}, Li7/h;->O2([IIIII)Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
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
.end method

.method public T1()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Li7/h;->h0:[I

    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    :goto_0
    iget-object v4, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 13
    .line 14
    .line 15
    invoke-interface {v4}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 16
    move-result v4

    .line 17
    .line 18
    aget v5, v1, v4

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x22

    .line 23
    .line 24
    if-ne v4, v1, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0, v0, v3, v4}, Li7/h;->U1([CII)V

    .line 34
    return-void

    .line 35
    .line 36
    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 37
    int-to-char v4, v4

    .line 38
    .line 39
    aput-char v4, v0, v3

    .line 40
    .line 41
    if-lt v5, v2, :cond_2

    .line 42
    .line 43
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0, v5, v1}, Li7/h;->U1([CII)V

    .line 51
    return-void

    .line 52
    :cond_2
    move v3, v5

    .line 53
    goto :goto_0
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
.end method

.method public U()Lcom/fasterxml/jackson/core/util/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/core/util/f<",
            "Lcom/fasterxml/jackson/core/StreamReadCapability;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lf7/b;->R:Lcom/fasterxml/jackson/core/util/f;

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
.end method

.method public final U1([CII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Li7/h;->h0:[I

    .line 3
    array-length v1, p1

    .line 4
    .line 5
    :goto_0
    aget v2, v0, p3

    .line 6
    const/4 v3, 0x0

    .line 7
    .line 8
    if-nez v2, :cond_1

    .line 9
    .line 10
    if-lt p2, v1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 16
    move-result-object p1

    .line 17
    array-length p2, p1

    .line 18
    move v1, p2

    .line 19
    move p2, v3

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v2, p2, 0x1

    .line 22
    int-to-char p3, p3

    .line 23
    .line 24
    aput-char p3, p1, p2

    .line 25
    .line 26
    iget-object p2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 27
    .line 28
    .line 29
    invoke-interface {p2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 30
    move-result p3

    .line 31
    move p2, v2

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    const/16 v4, 0x22

    .line 35
    .line 36
    if-ne p3, v4, :cond_2

    .line 37
    .line 38
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 42
    return-void

    .line 43
    :cond_2
    const/4 v4, 0x1

    .line 44
    .line 45
    if-eq v2, v4, :cond_8

    .line 46
    const/4 v4, 0x2

    .line 47
    .line 48
    if-eq v2, v4, :cond_7

    .line 49
    const/4 v4, 0x3

    .line 50
    .line 51
    if-eq v2, v4, :cond_6

    .line 52
    const/4 v4, 0x4

    .line 53
    .line 54
    if-eq v2, v4, :cond_4

    .line 55
    .line 56
    const/16 v2, 0x20

    .line 57
    .line 58
    if-ge p3, v2, :cond_3

    .line 59
    .line 60
    .line 61
    const-string/jumbo v2, "string value"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p3, v2}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {p0, p3}, Li7/h;->p2(I)V

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-virtual {p0, p3}, Li7/h;->R1(I)I

    .line 73
    move-result p3

    .line 74
    array-length v2, p1

    .line 75
    .line 76
    if-lt p2, v2, :cond_5

    .line 77
    .line 78
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 82
    move-result-object p1

    .line 83
    array-length v1, p1

    .line 84
    move p2, v3

    .line 85
    .line 86
    :cond_5
    add-int/lit8 v2, p2, 0x1

    .line 87
    .line 88
    shr-int/lit8 v4, p3, 0xa

    .line 89
    .line 90
    .line 91
    const v5, 0xd800

    .line 92
    or-int/2addr v4, v5

    .line 93
    int-to-char v4, v4

    .line 94
    .line 95
    aput-char v4, p1, p2

    .line 96
    .line 97
    and-int/lit16 p2, p3, 0x3ff

    .line 98
    .line 99
    .line 100
    const p3, 0xdc00

    .line 101
    or-int/2addr p3, p2

    .line 102
    move p2, v2

    .line 103
    goto :goto_1

    .line 104
    .line 105
    .line 106
    :cond_6
    invoke-virtual {p0, p3}, Li7/h;->Q1(I)I

    .line 107
    move-result p3

    .line 108
    goto :goto_1

    .line 109
    .line 110
    .line 111
    :cond_7
    invoke-virtual {p0, p3}, Li7/h;->P1(I)I

    .line 112
    move-result p3

    .line 113
    goto :goto_1

    .line 114
    .line 115
    .line 116
    :cond_8
    invoke-virtual {p0}, Li7/h;->j1()C

    .line 117
    move-result p3

    .line 118
    :goto_1
    array-length v2, p1

    .line 119
    .line 120
    if-lt p2, v2, :cond_9

    .line 121
    .line 122
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 126
    move-result-object p1

    .line 127
    array-length p2, p1

    .line 128
    move v1, p2

    .line 129
    goto :goto_2

    .line 130
    :cond_9
    move v3, p2

    .line 131
    .line 132
    :goto_2
    add-int/lit8 p2, v3, 0x1

    .line 133
    int-to-char p3, p3

    .line 134
    .line 135
    aput-char p3, p1, v3

    .line 136
    .line 137
    iget-object p3, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 138
    .line 139
    .line 140
    invoke-interface {p3}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 141
    move-result p3

    .line 142
    .line 143
    goto/16 :goto_0
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
.end method

.method public final V1(Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    .line 11
    if-eq v0, v1, :cond_2

    .line 12
    const/4 v1, 0x6

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    const/4 v1, 0x7

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonToken;->asString()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    .line 35
    :cond_2
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Li7/d;->b()Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    return-object p1
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
.end method

.method public W()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Li7/h;->V:Z

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Li7/h;->S1()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0, v0}, Li7/h;->V1(Lcom/fasterxml/jackson/core/JsonToken;)Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    return-object v0
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
.end method

.method public X()[C
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    const/4 v1, 0x6

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    const/4 v1, 0x7

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asCharArray()[C

    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    .line 31
    :cond_0
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iput-boolean v2, p0, Li7/h;->V:Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li7/h;->T1()V

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->u()[C

    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    .line 47
    :cond_2
    iget-boolean v0, p0, Lf7/b;->E:Z

    .line 48
    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Li7/d;->b()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 59
    move-result v1

    .line 60
    .line 61
    iget-object v3, p0, Lf7/b;->D:[C

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    iget-object v3, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v1}, Lcom/fasterxml/jackson/core/io/d;->f(I)[C

    .line 69
    move-result-object v3

    .line 70
    .line 71
    iput-object v3, p0, Lf7/b;->D:[C

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    array-length v3, v3

    .line 74
    .line 75
    if-ge v3, v1, :cond_4

    .line 76
    .line 77
    new-array v3, v1, [C

    .line 78
    .line 79
    iput-object v3, p0, Lf7/b;->D:[C

    .line 80
    .line 81
    :cond_4
    :goto_0
    iget-object v3, p0, Lf7/b;->D:[C

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2, v1, v3, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 85
    const/4 v0, 0x1

    .line 86
    .line 87
    iput-boolean v0, p0, Lf7/b;->E:Z

    .line 88
    .line 89
    :cond_5
    iget-object v0, p0, Lf7/b;->D:[C

    .line 90
    return-object v0

    .line 91
    :cond_6
    const/4 v0, 0x0

    .line 92
    return-object v0
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
.end method

.method public X1()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Li7/h;->h0:[I

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    array-length v4, v0

    .line 12
    array-length v5, v0

    .line 13
    .line 14
    if-lt v3, v5, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 20
    move-result-object v0

    .line 21
    array-length v4, v0

    .line 22
    move v3, v2

    .line 23
    .line 24
    :cond_0
    iget-object v5, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 25
    .line 26
    .line 27
    invoke-interface {v5}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 28
    move-result v5

    .line 29
    .line 30
    const/16 v6, 0x27

    .line 31
    .line 32
    if-ne v5, v6, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 38
    .line 39
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 40
    return-object v0

    .line 41
    .line 42
    :cond_1
    aget v6, v1, v5

    .line 43
    .line 44
    if-eqz v6, :cond_9

    .line 45
    .line 46
    const/16 v7, 0x22

    .line 47
    .line 48
    if-eq v5, v7, :cond_9

    .line 49
    const/4 v4, 0x1

    .line 50
    .line 51
    if-eq v6, v4, :cond_7

    .line 52
    const/4 v4, 0x2

    .line 53
    .line 54
    if-eq v6, v4, :cond_6

    .line 55
    const/4 v4, 0x3

    .line 56
    .line 57
    if-eq v6, v4, :cond_5

    .line 58
    const/4 v4, 0x4

    .line 59
    .line 60
    if-eq v6, v4, :cond_3

    .line 61
    .line 62
    const/16 v4, 0x20

    .line 63
    .line 64
    if-ge v5, v4, :cond_2

    .line 65
    .line 66
    .line 67
    const-string/jumbo v4, "string value"

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v5, v4}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {p0, v5}, Li7/h;->p2(I)V

    .line 74
    goto :goto_2

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {p0, v5}, Li7/h;->R1(I)I

    .line 78
    move-result v4

    .line 79
    .line 80
    add-int/lit8 v5, v3, 0x1

    .line 81
    .line 82
    shr-int/lit8 v6, v4, 0xa

    .line 83
    .line 84
    .line 85
    const v7, 0xd800

    .line 86
    or-int/2addr v6, v7

    .line 87
    int-to-char v6, v6

    .line 88
    .line 89
    aput-char v6, v0, v3

    .line 90
    array-length v3, v0

    .line 91
    .line 92
    if-lt v5, v3, :cond_4

    .line 93
    .line 94
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 98
    move-result-object v0

    .line 99
    move v3, v2

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    move v3, v5

    .line 102
    .line 103
    :goto_1
    and-int/lit16 v4, v4, 0x3ff

    .line 104
    .line 105
    .line 106
    const v5, 0xdc00

    .line 107
    or-int/2addr v5, v4

    .line 108
    goto :goto_2

    .line 109
    .line 110
    .line 111
    :cond_5
    invoke-virtual {p0, v5}, Li7/h;->Q1(I)I

    .line 112
    move-result v5

    .line 113
    goto :goto_2

    .line 114
    .line 115
    .line 116
    :cond_6
    invoke-virtual {p0, v5}, Li7/h;->P1(I)I

    .line 117
    move-result v5

    .line 118
    goto :goto_2

    .line 119
    .line 120
    .line 121
    :cond_7
    invoke-virtual {p0}, Li7/h;->j1()C

    .line 122
    move-result v5

    .line 123
    :goto_2
    array-length v4, v0

    .line 124
    .line 125
    if-lt v3, v4, :cond_8

    .line 126
    .line 127
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 131
    move-result-object v0

    .line 132
    move v3, v2

    .line 133
    .line 134
    :cond_8
    add-int/lit8 v4, v3, 0x1

    .line 135
    int-to-char v5, v5

    .line 136
    .line 137
    aput-char v5, v0, v3

    .line 138
    move v3, v4

    .line 139
    goto :goto_0

    .line 140
    .line 141
    :cond_9
    add-int/lit8 v6, v3, 0x1

    .line 142
    int-to-char v5, v5

    .line 143
    .line 144
    aput-char v5, v0, v3

    .line 145
    move v3, v6

    .line 146
    .line 147
    if-lt v6, v4, :cond_0

    .line 148
    .line 149
    goto/16 :goto_0
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
.end method

.method public Y()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iput-boolean v2, p0, Li7/h;->V:Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Li7/h;->T1()V

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->F()I

    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    .line 25
    :cond_1
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Li7/d;->b()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 37
    move-result v0

    .line 38
    return v0

    .line 39
    .line 40
    :cond_2
    if-eqz v0, :cond_4

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->isNumeric()Z

    .line 44
    move-result v0

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->F()I

    .line 52
    move-result v0

    .line 53
    return v0

    .line 54
    .line 55
    :cond_3
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->asCharArray()[C

    .line 59
    move-result-object v0

    .line 60
    array-length v0, v0

    .line 61
    return v0

    .line 62
    :cond_4
    return v2
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
.end method

.method public Y1(IZ)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    const/16 v0, 0x49

    .line 3
    .line 4
    if-ne p1, v0, :cond_5

    .line 5
    .line 6
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 10
    move-result p1

    .line 11
    .line 12
    const/16 v0, 0x4e

    .line 13
    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const-string v0, "-INF"

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_0
    const-string v0, "+INF"

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_1
    const/16 v0, 0x6e

    .line 25
    .line 26
    if-ne p1, v0, :cond_5

    .line 27
    .line 28
    if-eqz p2, :cond_2

    .line 29
    .line 30
    const-string v0, "-Infinity"

    .line 31
    goto :goto_1

    .line 32
    .line 33
    :cond_2
    const-string v0, "+Infinity"

    .line 34
    :goto_1
    const/4 v1, 0x3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, v1}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 38
    .line 39
    iget v1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 40
    .line 41
    sget v2, Li7/h;->b0:I

    .line 42
    and-int/2addr v1, v2

    .line 43
    .line 44
    if-eqz v1, :cond_4

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    const-wide/high16 p1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 49
    goto :goto_2

    .line 50
    .line 51
    :cond_3
    const-wide/high16 p1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 52
    .line 53
    .line 54
    :goto_2
    invoke-virtual {p0, v0, p1, p2}, Lf7/b;->I1(Ljava/lang/String;D)Lcom/fasterxml/jackson/core/JsonToken;

    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    .line 58
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    const-string v2, "Non-standard token \'"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v0, "\': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :cond_5
    const-string p2, "expected digit (0-9) to follow minus sign, for valid numeric value"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 88
    const/4 p1, 0x0

    .line 89
    return-object p1
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
.end method

.method public Z()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonToken;->id()I

    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x6

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    const/4 v2, 0x7

    .line 14
    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/16 v2, 0x8

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iput-boolean v1, p0, Li7/h;->V:Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Li7/h;->T1()V

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->v()I

    .line 35
    move-result v0

    .line 36
    return v0

    .line 37
    :cond_2
    :goto_0
    return v1
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
.end method

.method public final Z1()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x30

    .line 9
    .line 10
    if-lt v0, v1, :cond_2

    .line 11
    .line 12
    const/16 v2, 0x39

    .line 13
    .line 14
    if-le v0, v2, :cond_0

    .line 15
    goto :goto_1

    .line 16
    .line 17
    :cond_0
    iget v2, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 18
    .line 19
    sget v3, Li7/h;->a0:I

    .line 20
    and-int/2addr v2, v3

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    const-string v2, "Leading zeroes not allowed"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Lf7/c;->W0(Ljava/lang/String;)V

    .line 28
    .line 29
    :cond_1
    :goto_0
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    :goto_1
    return v0
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
.end method

.method public a0()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lf7/b;->g1()Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget v6, p0, Lf7/b;->y:I

    .line 9
    const/4 v7, -0x1

    .line 10
    .line 11
    const-wide/16 v2, -0x1

    .line 12
    .line 13
    const-wide/16 v4, -0x1

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    .line 17
    return-object v0
    .line 18
.end method

.method public a2(I)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x27

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 7
    .line 8
    sget v1, Li7/h;->d0:I

    .line 9
    and-int/2addr v0, v1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li7/h;->f2()Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 19
    .line 20
    sget v1, Li7/h;->e0:I

    .line 21
    and-int/2addr v0, v1

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Li7/h;->O1(I)I

    .line 27
    move-result v0

    .line 28
    int-to-char v0, v0

    .line 29
    .line 30
    .line 31
    const-string/jumbo v1, "was expecting double-quote to start field name"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-static {}, Lcom/fasterxml/jackson/core/io/b;->k()[I

    .line 38
    move-result-object v0

    .line 39
    .line 40
    aget v1, v0, p1

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    .line 45
    const-string/jumbo v1, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, v1}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 49
    .line 50
    :cond_2
    iget-object v1, p0, Li7/h;->U:[I

    .line 51
    const/4 v2, 0x0

    .line 52
    move v3, v2

    .line 53
    move v4, v3

    .line 54
    :cond_3
    const/4 v5, 0x4

    .line 55
    .line 56
    if-ge v2, v5, :cond_4

    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    shl-int/lit8 v4, v4, 0x8

    .line 61
    or-int/2addr p1, v4

    .line 62
    :goto_0
    move v4, p1

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    array-length v2, v1

    .line 65
    .line 66
    if-lt v3, v2, :cond_5

    .line 67
    array-length v2, v1

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v2}, Li7/h;->W1([II)[I

    .line 71
    move-result-object v1

    .line 72
    .line 73
    iput-object v1, p0, Li7/h;->U:[I

    .line 74
    .line 75
    :cond_5
    add-int/lit8 v2, v3, 0x1

    .line 76
    .line 77
    aput v4, v1, v3

    .line 78
    const/4 v3, 0x1

    .line 79
    move v4, v3

    .line 80
    move v3, v2

    .line 81
    move v2, v4

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :goto_1
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 88
    move-result p1

    .line 89
    .line 90
    aget v5, v0, p1

    .line 91
    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    iput p1, p0, Li7/h;->Y:I

    .line 95
    .line 96
    if-lez v2, :cond_7

    .line 97
    array-length p1, v1

    .line 98
    .line 99
    if-lt v3, p1, :cond_6

    .line 100
    array-length p1, v1

    .line 101
    .line 102
    .line 103
    invoke-static {v1, p1}, Li7/h;->W1([II)[I

    .line 104
    move-result-object v1

    .line 105
    .line 106
    iput-object v1, p0, Li7/h;->U:[I

    .line 107
    .line 108
    :cond_6
    add-int/lit8 p1, v3, 0x1

    .line 109
    .line 110
    aput v4, v1, v3

    .line 111
    move v3, p1

    .line 112
    .line 113
    :cond_7
    iget-object p1, p0, Li7/h;->T:Lk7/a;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v1, v3}, Lk7/a;->z([II)Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    if-nez p1, :cond_8

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v1, v3, v2}, Li7/h;->I2([III)Ljava/lang/String;

    .line 123
    move-result-object p1

    .line 124
    :cond_8
    return-object p1
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
.end method

.method public b2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x27

    .line 3
    .line 4
    if-eq p1, v0, :cond_8

    .line 5
    .line 6
    const/16 v0, 0x49

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eq p1, v0, :cond_6

    .line 10
    .line 11
    const/16 v0, 0x4e

    .line 12
    .line 13
    if-eq p1, v0, :cond_4

    .line 14
    .line 15
    const/16 v0, 0x5d

    .line 16
    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x7d

    .line 20
    .line 21
    if-eq p1, v0, :cond_3

    .line 22
    .line 23
    const/16 v0, 0x2b

    .line 24
    .line 25
    if-eq p1, v0, :cond_0

    .line 26
    .line 27
    const/16 v0, 0x2c

    .line 28
    .line 29
    if-eq p1, v0, :cond_2

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 36
    move-result p1

    .line 37
    const/4 v0, 0x0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, v0}, Li7/h;->Y1(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->f()Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 62
    .line 63
    sget v1, Li7/h;->c0:I

    .line 64
    and-int/2addr v0, v1

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iput p1, p0, Li7/h;->Y:I

    .line 69
    .line 70
    sget-object p1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 71
    return-object p1

    .line 72
    .line 73
    :cond_3
    const-string v0, "expected a value"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_4
    const-string v0, "NaN"

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0, v1}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 83
    .line 84
    iget v1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 85
    .line 86
    sget v2, Li7/h;->b0:I

    .line 87
    and-int/2addr v1, v2

    .line 88
    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0, v1, v2}, Lf7/b;->I1(Ljava/lang/String;D)Lcom/fasterxml/jackson/core/JsonToken;

    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    .line 98
    :cond_5
    const-string v0, "Non-standard token \'NaN\': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 102
    goto :goto_1

    .line 103
    .line 104
    :cond_6
    const-string v0, "Infinity"

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0, v1}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 108
    .line 109
    iget v1, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 110
    .line 111
    sget v2, Li7/h;->b0:I

    .line 112
    and-int/2addr v1, v2

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v0, v1, v2}, Lf7/b;->I1(Ljava/lang/String;D)Lcom/fasterxml/jackson/core/JsonToken;

    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    .line 123
    :cond_7
    const-string v0, "Non-standard token \'Infinity\': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 127
    goto :goto_1

    .line 128
    .line 129
    :cond_8
    :goto_0
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 130
    .line 131
    sget v1, Li7/h;->d0:I

    .line 132
    and-int/2addr v0, v1

    .line 133
    .line 134
    if-eqz v0, :cond_9

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Li7/h;->X1()Lcom/fasterxml/jackson/core/JsonToken;

    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    .line 141
    .line 142
    :cond_9
    :goto_1
    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierStart(I)Z

    .line 143
    move-result v0

    .line 144
    .line 145
    if-eqz v0, :cond_a

    .line 146
    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    const-string v1, ""

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    int-to-char v1, p1

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Lf7/b;->w1()Ljava/lang/String;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, p1, v0, v1}, Li7/h;->t2(ILjava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    const-string v1, "expected a valid value "

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Lf7/b;->x1()Ljava/lang/String;

    .line 184
    move-result-object v1

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, p1, v0}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 195
    const/4 p1, 0x0

    .line 196
    return-object p1
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
.end method

.method public c0()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-super {p0, v0}, Lf7/c;->d0(I)I

    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lf7/b;->H:I

    .line 20
    .line 21
    and-int/lit8 v1, v0, 0x1

    .line 22
    .line 23
    if-nez v1, :cond_3

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lf7/b;->o1()I

    .line 29
    move-result v0

    .line 30
    return v0

    .line 31
    .line 32
    :cond_2
    and-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lf7/b;->B1()V

    .line 38
    .line 39
    :cond_3
    iget v0, p0, Lf7/b;->I:I

    .line 40
    return v0
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
.end method

.method public final c2(Ljava/lang/String;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 14
    move-result v2

    .line 15
    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v2, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1, v2}, Li7/h;->s2(ILjava/lang/String;)V

    .line 25
    .line 26
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 27
    .line 28
    if-lt p2, v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 34
    move-result v0

    .line 35
    .line 36
    const/16 v1, 0x30

    .line 37
    .line 38
    if-lt v0, v1, :cond_2

    .line 39
    .line 40
    const/16 v1, 0x5d

    .line 41
    .line 42
    if-eq v0, v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x7d

    .line 45
    .line 46
    if-eq v0, v1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1, p2, v0}, Li7/h;->L1(Ljava/lang/String;II)V

    .line 50
    .line 51
    :cond_2
    iput v0, p0, Li7/h;->Y:I

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
.end method

.method public d0(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0, p1}, Lf7/c;->d0(I)I

    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    .line 18
    :cond_1
    :goto_0
    iget p1, p0, Lf7/b;->H:I

    .line 19
    .line 20
    and-int/lit8 v0, p1, 0x1

    .line 21
    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lf7/b;->o1()I

    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    .line 31
    :cond_2
    and-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    if-nez p1, :cond_3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lf7/b;->B1()V

    .line 37
    .line 38
    :cond_3
    iget p1, p0, Lf7/b;->I:I

    .line 39
    return p1
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
.end method

.method public f1()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public f2()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Li7/h;->U:[I

    .line 16
    .line 17
    sget-object v3, Li7/h;->i0:[I

    .line 18
    const/4 v4, 0x0

    .line 19
    move v5, v4

    .line 20
    move v6, v5

    .line 21
    move v7, v6

    .line 22
    .line 23
    :goto_0
    if-ne v0, v1, :cond_4

    .line 24
    .line 25
    if-lez v5, :cond_2

    .line 26
    array-length v0, v2

    .line 27
    .line 28
    if-lt v6, v0, :cond_1

    .line 29
    array-length v0, v2

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v0}, Li7/h;->W1([II)[I

    .line 33
    move-result-object v2

    .line 34
    .line 35
    iput-object v2, p0, Li7/h;->U:[I

    .line 36
    .line 37
    :cond_1
    add-int/lit8 v0, v6, 0x1

    .line 38
    .line 39
    .line 40
    invoke-static {v7, v5}, Li7/h;->N2(II)I

    .line 41
    move-result v1

    .line 42
    .line 43
    aput v1, v2, v6

    .line 44
    move v6, v0

    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Li7/h;->T:Lk7/a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2, v6}, Lk7/a;->z([II)Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v2, v6, v5}, Li7/h;->I2([III)Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    :cond_3
    return-object v0

    .line 58
    .line 59
    :cond_4
    const/16 v8, 0x22

    .line 60
    const/4 v9, 0x4

    .line 61
    const/4 v10, 0x1

    .line 62
    .line 63
    if-eq v0, v8, :cond_b

    .line 64
    .line 65
    aget v8, v3, v0

    .line 66
    .line 67
    if-eqz v8, :cond_b

    .line 68
    .line 69
    const/16 v8, 0x5c

    .line 70
    .line 71
    if-eq v0, v8, :cond_5

    .line 72
    .line 73
    const-string v8, "name"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0, v8}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 77
    goto :goto_1

    .line 78
    .line 79
    .line 80
    :cond_5
    invoke-virtual {p0}, Li7/h;->j1()C

    .line 81
    move-result v0

    .line 82
    .line 83
    :goto_1
    const/16 v8, 0x7f

    .line 84
    .line 85
    if-le v0, v8, :cond_b

    .line 86
    .line 87
    if-lt v5, v9, :cond_7

    .line 88
    array-length v5, v2

    .line 89
    .line 90
    if-lt v6, v5, :cond_6

    .line 91
    array-length v5, v2

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v5}, Li7/h;->W1([II)[I

    .line 95
    move-result-object v2

    .line 96
    .line 97
    iput-object v2, p0, Li7/h;->U:[I

    .line 98
    .line 99
    :cond_6
    add-int/lit8 v5, v6, 0x1

    .line 100
    .line 101
    aput v7, v2, v6

    .line 102
    move v7, v4

    .line 103
    move v6, v5

    .line 104
    move v5, v7

    .line 105
    .line 106
    :cond_7
    const/16 v8, 0x800

    .line 107
    .line 108
    if-ge v0, v8, :cond_8

    .line 109
    .line 110
    shl-int/lit8 v7, v7, 0x8

    .line 111
    .line 112
    shr-int/lit8 v8, v0, 0x6

    .line 113
    .line 114
    or-int/lit16 v8, v8, 0xc0

    .line 115
    or-int/2addr v7, v8

    .line 116
    .line 117
    add-int/lit8 v5, v5, 0x1

    .line 118
    goto :goto_2

    .line 119
    .line 120
    :cond_8
    shl-int/lit8 v7, v7, 0x8

    .line 121
    .line 122
    shr-int/lit8 v8, v0, 0xc

    .line 123
    .line 124
    or-int/lit16 v8, v8, 0xe0

    .line 125
    or-int/2addr v7, v8

    .line 126
    .line 127
    add-int/lit8 v5, v5, 0x1

    .line 128
    .line 129
    if-lt v5, v9, :cond_a

    .line 130
    array-length v5, v2

    .line 131
    .line 132
    if-lt v6, v5, :cond_9

    .line 133
    array-length v5, v2

    .line 134
    .line 135
    .line 136
    invoke-static {v2, v5}, Li7/h;->W1([II)[I

    .line 137
    move-result-object v2

    .line 138
    .line 139
    iput-object v2, p0, Li7/h;->U:[I

    .line 140
    .line 141
    :cond_9
    add-int/lit8 v5, v6, 0x1

    .line 142
    .line 143
    aput v7, v2, v6

    .line 144
    move v7, v4

    .line 145
    move v6, v5

    .line 146
    move v5, v7

    .line 147
    .line 148
    :cond_a
    shl-int/lit8 v7, v7, 0x8

    .line 149
    .line 150
    shr-int/lit8 v8, v0, 0x6

    .line 151
    .line 152
    and-int/lit8 v8, v8, 0x3f

    .line 153
    .line 154
    or-int/lit16 v8, v8, 0x80

    .line 155
    or-int/2addr v7, v8

    .line 156
    add-int/2addr v5, v10

    .line 157
    .line 158
    :goto_2
    and-int/lit8 v0, v0, 0x3f

    .line 159
    .line 160
    or-int/lit16 v0, v0, 0x80

    .line 161
    .line 162
    :cond_b
    if-ge v5, v9, :cond_c

    .line 163
    .line 164
    add-int/lit8 v5, v5, 0x1

    .line 165
    .line 166
    shl-int/lit8 v7, v7, 0x8

    .line 167
    or-int/2addr v0, v7

    .line 168
    :goto_3
    move v7, v0

    .line 169
    goto :goto_4

    .line 170
    :cond_c
    array-length v5, v2

    .line 171
    .line 172
    if-lt v6, v5, :cond_d

    .line 173
    array-length v5, v2

    .line 174
    .line 175
    .line 176
    invoke-static {v2, v5}, Li7/h;->W1([II)[I

    .line 177
    move-result-object v2

    .line 178
    .line 179
    iput-object v2, p0, Li7/h;->U:[I

    .line 180
    .line 181
    :cond_d
    add-int/lit8 v5, v6, 0x1

    .line 182
    .line 183
    aput v7, v2, v6

    .line 184
    move v6, v5

    .line 185
    move v5, v10

    .line 186
    goto :goto_3

    .line 187
    .line 188
    :goto_4
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 192
    move-result v0

    .line 193
    .line 194
    goto/16 :goto_0
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
.end method

.method public g0()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Li7/h;->V:Z

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Li7/h;->S1()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    .line 27
    :cond_1
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lf7/b;->w()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    .line 37
    .line 38
    invoke-super {p0, v0}, Lf7/c;->h0(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    return-object v0
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
.end method

.method public final g2([CIIZI)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x2e

    .line 3
    .line 4
    const/16 v1, 0x39

    .line 5
    .line 6
    const/16 v2, 0x30

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    if-ne p3, v0, :cond_4

    .line 10
    .line 11
    add-int/lit8 v0, p2, 0x1

    .line 12
    int-to-char p3, p3

    .line 13
    .line 14
    aput-char p3, p1, p2

    .line 15
    move p2, v0

    .line 16
    move p3, v3

    .line 17
    .line 18
    :goto_0
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 22
    move-result v0

    .line 23
    .line 24
    if-lt v0, v2, :cond_2

    .line 25
    .line 26
    if-le v0, v1, :cond_0

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_0
    add-int/lit8 p3, p3, 0x1

    .line 30
    array-length v4, p1

    .line 31
    .line 32
    if-lt p2, v4, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 38
    move-result-object p1

    .line 39
    move p2, v3

    .line 40
    .line 41
    :cond_1
    add-int/lit8 v4, p2, 0x1

    .line 42
    int-to-char v0, v0

    .line 43
    .line 44
    aput-char v0, p1, p2

    .line 45
    move p2, v4

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_2
    :goto_1
    if-nez p3, :cond_3

    .line 49
    .line 50
    const-string v4, "Decimal point not followed by a digit"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0, v4}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 54
    :cond_3
    move v6, v0

    .line 55
    move v0, p3

    .line 56
    move p3, v6

    .line 57
    goto :goto_2

    .line 58
    :cond_4
    move v0, v3

    .line 59
    .line 60
    :goto_2
    const/16 v4, 0x65

    .line 61
    .line 62
    if-eq p3, v4, :cond_5

    .line 63
    .line 64
    const/16 v4, 0x45

    .line 65
    .line 66
    if-ne p3, v4, :cond_d

    .line 67
    :cond_5
    array-length v4, p1

    .line 68
    .line 69
    if-lt p2, v4, :cond_6

    .line 70
    .line 71
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 75
    move-result-object p1

    .line 76
    move p2, v3

    .line 77
    .line 78
    :cond_6
    add-int/lit8 v4, p2, 0x1

    .line 79
    int-to-char p3, p3

    .line 80
    .line 81
    aput-char p3, p1, p2

    .line 82
    .line 83
    iget-object p2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 84
    .line 85
    .line 86
    invoke-interface {p2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 87
    move-result p2

    .line 88
    .line 89
    const/16 p3, 0x2d

    .line 90
    .line 91
    if-eq p2, p3, :cond_8

    .line 92
    .line 93
    const/16 p3, 0x2b

    .line 94
    .line 95
    if-ne p2, p3, :cond_7

    .line 96
    goto :goto_4

    .line 97
    :cond_7
    :goto_3
    move p3, p2

    .line 98
    move p2, v4

    .line 99
    move v4, v3

    .line 100
    goto :goto_5

    .line 101
    :cond_8
    :goto_4
    array-length p3, p1

    .line 102
    .line 103
    if-lt v4, p3, :cond_9

    .line 104
    .line 105
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 109
    move-result-object p1

    .line 110
    move v4, v3

    .line 111
    .line 112
    :cond_9
    add-int/lit8 p3, v4, 0x1

    .line 113
    int-to-char p2, p2

    .line 114
    .line 115
    aput-char p2, p1, v4

    .line 116
    .line 117
    iget-object p2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 118
    .line 119
    .line 120
    invoke-interface {p2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 121
    move-result p2

    .line 122
    move v4, p3

    .line 123
    goto :goto_3

    .line 124
    .line 125
    :goto_5
    if-gt p3, v1, :cond_b

    .line 126
    .line 127
    if-lt p3, v2, :cond_b

    .line 128
    .line 129
    add-int/lit8 v4, v4, 0x1

    .line 130
    array-length v5, p1

    .line 131
    .line 132
    if-lt p2, v5, :cond_a

    .line 133
    .line 134
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 138
    move-result-object p1

    .line 139
    move p2, v3

    .line 140
    .line 141
    :cond_a
    add-int/lit8 v5, p2, 0x1

    .line 142
    int-to-char p3, p3

    .line 143
    .line 144
    aput-char p3, p1, p2

    .line 145
    .line 146
    iget-object p2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 147
    .line 148
    .line 149
    invoke-interface {p2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 150
    move-result p3

    .line 151
    move p2, v5

    .line 152
    goto :goto_5

    .line 153
    .line 154
    :cond_b
    if-nez v4, :cond_c

    .line 155
    .line 156
    const-string p1, "Exponent indicator not followed by a digit"

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, p3, p1}, Lf7/c;->d1(ILjava/lang/String;)V

    .line 160
    :cond_c
    move v3, v4

    .line 161
    .line 162
    :cond_d
    iput p3, p0, Li7/h;->Y:I

    .line 163
    .line 164
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 168
    move-result p1

    .line 169
    .line 170
    if-eqz p1, :cond_e

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Li7/h;->H2()V

    .line 174
    .line 175
    :cond_e
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, p4, p5, v0, v3}, Lf7/b;->J1(ZIII)Lcom/fasterxml/jackson/core/JsonToken;

    .line 182
    move-result-object p1

    .line 183
    return-object p1
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
.end method

.method public h0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean p1, p0, Li7/h;->V:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    const/4 p1, 0x0

    .line 12
    .line 13
    iput-boolean p1, p0, Li7/h;->V:Z

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Li7/h;->S1()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    .line 27
    :cond_1
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 28
    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lf7/b;->w()Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-super {p0, p1}, Lf7/c;->h0(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    return-object p1
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
.end method

.method public final h2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/fasterxml/jackson/core/json/JsonReadFeature;->ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS:Lcom/fasterxml/jackson/core/json/JsonReadFeature;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadFeature;->mappedFeature()Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->m0(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x2e

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Li7/h;->b2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 25
    move-result-object v2

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    const/16 v4, 0x2e

    .line 31
    move-object v1, p0

    .line 32
    .line 33
    .line 34
    invoke-virtual/range {v1 .. v6}, Li7/h;->g2([CIIZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 35
    move-result-object v0

    .line 36
    return-object v0
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
.end method

.method public final i2(III)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->U:[I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iget v2, p0, Li7/h;->W:I

    .line 6
    .line 7
    aput v2, v0, v1

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    aput p2, v0, v1

    .line 11
    const/4 p2, 0x2

    .line 12
    .line 13
    aput p3, v0, p2

    .line 14
    .line 15
    sget-object p3, Li7/h;->i0:[I

    .line 16
    const/4 v0, 0x3

    .line 17
    move v5, p1

    .line 18
    move v8, v0

    .line 19
    .line 20
    :goto_0
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 24
    move-result v6

    .line 25
    .line 26
    aget p1, p3, v6

    .line 27
    .line 28
    const/16 v2, 0x22

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    if-ne v6, v2, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, Li7/h;->U:[I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1, v8, v5, v1}, Li7/h;->M2([IIII)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    .line 41
    :cond_0
    iget-object v3, p0, Li7/h;->U:[I

    .line 42
    const/4 v7, 0x1

    .line 43
    move-object v2, p0

    .line 44
    move v4, v8

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {v2 .. v7}, Li7/h;->O2([IIIII)Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    move-object v6, v2

    .line 50
    return-object p1

    .line 51
    :cond_1
    move p1, v6

    .line 52
    move-object v6, p0

    .line 53
    .line 54
    shl-int/lit8 v3, v5, 0x8

    .line 55
    .line 56
    or-int v9, v3, p1

    .line 57
    .line 58
    iget-object p1, v6, Li7/h;->X:Ljava/io/DataInput;

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 62
    move-result v10

    .line 63
    .line 64
    aget p1, p3, v10

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    if-ne v10, v2, :cond_2

    .line 69
    .line 70
    iget-object p1, v6, Li7/h;->U:[I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1, v8, v9, p2}, Li7/h;->M2([IIII)Ljava/lang/String;

    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    .line 77
    :cond_2
    iget-object v7, v6, Li7/h;->U:[I

    .line 78
    const/4 v11, 0x2

    .line 79
    .line 80
    .line 81
    invoke-virtual/range {v6 .. v11}, Li7/h;->O2([IIIII)Ljava/lang/String;

    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    .line 85
    :cond_3
    shl-int/lit8 p1, v9, 0x8

    .line 86
    .line 87
    or-int v9, p1, v10

    .line 88
    .line 89
    iget-object p1, v6, Li7/h;->X:Ljava/io/DataInput;

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 93
    move-result v10

    .line 94
    .line 95
    aget p1, p3, v10

    .line 96
    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    if-ne v10, v2, :cond_4

    .line 100
    .line 101
    iget-object p1, v6, Li7/h;->U:[I

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1, v8, v9, v0}, Li7/h;->M2([IIII)Ljava/lang/String;

    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    .line 108
    :cond_4
    iget-object v7, v6, Li7/h;->U:[I

    .line 109
    const/4 v11, 0x3

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v6 .. v11}, Li7/h;->O2([IIIII)Ljava/lang/String;

    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    .line 116
    :cond_5
    shl-int/lit8 p1, v9, 0x8

    .line 117
    .line 118
    or-int v9, p1, v10

    .line 119
    .line 120
    iget-object p1, v6, Li7/h;->X:Ljava/io/DataInput;

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 124
    move-result v10

    .line 125
    .line 126
    aget p1, p3, v10

    .line 127
    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    if-ne v10, v2, :cond_6

    .line 131
    .line 132
    iget-object p1, v6, Li7/h;->U:[I

    .line 133
    const/4 p2, 0x4

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1, v8, v9, p2}, Li7/h;->M2([IIII)Ljava/lang/String;

    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    .line 140
    :cond_6
    iget-object v7, v6, Li7/h;->U:[I

    .line 141
    const/4 v11, 0x4

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v6 .. v11}, Li7/h;->O2([IIIII)Ljava/lang/String;

    .line 145
    move-result-object p1

    .line 146
    return-object p1

    .line 147
    .line 148
    :cond_7
    iget-object p1, v6, Li7/h;->U:[I

    .line 149
    array-length v2, p1

    .line 150
    .line 151
    if-lt v8, v2, :cond_8

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v8}, Li7/h;->W1([II)[I

    .line 155
    move-result-object p1

    .line 156
    .line 157
    iput-object p1, v6, Li7/h;->U:[I

    .line 158
    .line 159
    :cond_8
    iget-object p1, v6, Li7/h;->U:[I

    .line 160
    .line 161
    add-int/lit8 v2, v8, 0x1

    .line 162
    .line 163
    aput v9, p1, v8

    .line 164
    move v8, v2

    .line 165
    move v5, v10

    .line 166
    .line 167
    goto/16 :goto_0
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
.end method

.method public j1()C
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 6
    move-result v0

    .line 7
    .line 8
    const/16 v1, 0x22

    .line 9
    .line 10
    if-eq v0, v1, :cond_8

    .line 11
    .line 12
    const/16 v1, 0x2f

    .line 13
    .line 14
    if-eq v0, v1, :cond_8

    .line 15
    .line 16
    const/16 v1, 0x5c

    .line 17
    .line 18
    if-eq v0, v1, :cond_8

    .line 19
    .line 20
    const/16 v1, 0x62

    .line 21
    .line 22
    if-eq v0, v1, :cond_7

    .line 23
    .line 24
    const/16 v1, 0x66

    .line 25
    .line 26
    if-eq v0, v1, :cond_6

    .line 27
    .line 28
    const/16 v1, 0x6e

    .line 29
    .line 30
    if-eq v0, v1, :cond_5

    .line 31
    .line 32
    const/16 v1, 0x72

    .line 33
    .line 34
    if-eq v0, v1, :cond_4

    .line 35
    .line 36
    const/16 v1, 0x74

    .line 37
    .line 38
    if-eq v0, v1, :cond_3

    .line 39
    .line 40
    const/16 v1, 0x75

    .line 41
    .line 42
    if-eq v0, v1, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Li7/h;->O1(I)I

    .line 46
    move-result v0

    .line 47
    int-to-char v0, v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lf7/b;->n1(C)C

    .line 51
    move-result v0

    .line 52
    return v0

    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    move v1, v0

    .line 55
    :goto_0
    const/4 v2, 0x4

    .line 56
    .line 57
    if-ge v0, v2, :cond_2

    .line 58
    .line 59
    iget-object v2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 60
    .line 61
    .line 62
    invoke-interface {v2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 63
    move-result v2

    .line 64
    .line 65
    .line 66
    invoke-static {v2}, Lcom/fasterxml/jackson/core/io/b;->b(I)I

    .line 67
    move-result v3

    .line 68
    .line 69
    if-gez v3, :cond_1

    .line 70
    .line 71
    const-string v4, "expected a hex-digit for character escape sequence"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v2, v4}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 75
    .line 76
    :cond_1
    shl-int/lit8 v1, v1, 0x4

    .line 77
    or-int/2addr v1, v3

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x1

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    int-to-char v0, v1

    .line 82
    return v0

    .line 83
    .line 84
    :cond_3
    const/16 v0, 0x9

    .line 85
    return v0

    .line 86
    .line 87
    :cond_4
    const/16 v0, 0xd

    .line 88
    return v0

    .line 89
    .line 90
    :cond_5
    const/16 v0, 0xa

    .line 91
    return v0

    .line 92
    .line 93
    :cond_6
    const/16 v0, 0xc

    .line 94
    return v0

    .line 95
    .line 96
    :cond_7
    const/16 v0, 0x8

    .line 97
    return v0

    .line 98
    :cond_8
    int-to-char v0, v0

    .line 99
    return v0
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
.end method

.method public final j2(I)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Li7/h;->i0:[I

    .line 3
    .line 4
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 8
    move-result v1

    .line 9
    .line 10
    aget v2, v0, v1

    .line 11
    .line 12
    const/16 v3, 0x22

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    const/4 v0, 0x1

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    iget v1, p0, Li7/h;->W:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1, p1, v0}, Li7/h;->K2(III)Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_0
    iget v2, p0, Li7/h;->W:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v2, p1, v1, v0}, Li7/h;->Q2(IIII)Ljava/lang/String;

    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    .line 33
    :cond_1
    shl-int/lit8 p1, p1, 0x8

    .line 34
    or-int/2addr p1, v1

    .line 35
    .line 36
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 40
    move-result v1

    .line 41
    .line 42
    aget v2, v0, v1

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    const/4 v0, 0x2

    .line 46
    .line 47
    if-ne v1, v3, :cond_2

    .line 48
    .line 49
    iget v1, p0, Li7/h;->W:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1, p1, v0}, Li7/h;->K2(III)Ljava/lang/String;

    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    .line 56
    :cond_2
    iget v2, p0, Li7/h;->W:I

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v2, p1, v1, v0}, Li7/h;->Q2(IIII)Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    .line 63
    :cond_3
    shl-int/lit8 p1, p1, 0x8

    .line 64
    or-int/2addr p1, v1

    .line 65
    .line 66
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 67
    .line 68
    .line 69
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 70
    move-result v1

    .line 71
    .line 72
    aget v2, v0, v1

    .line 73
    .line 74
    if-eqz v2, :cond_5

    .line 75
    const/4 v0, 0x3

    .line 76
    .line 77
    if-ne v1, v3, :cond_4

    .line 78
    .line 79
    iget v1, p0, Li7/h;->W:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v1, p1, v0}, Li7/h;->K2(III)Ljava/lang/String;

    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    .line 86
    :cond_4
    iget v2, p0, Li7/h;->W:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v2, p1, v1, v0}, Li7/h;->Q2(IIII)Ljava/lang/String;

    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    .line 93
    :cond_5
    shl-int/lit8 p1, p1, 0x8

    .line 94
    or-int/2addr p1, v1

    .line 95
    .line 96
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 97
    .line 98
    .line 99
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 100
    move-result v1

    .line 101
    .line 102
    aget v0, v0, v1

    .line 103
    .line 104
    if-eqz v0, :cond_7

    .line 105
    const/4 v0, 0x4

    .line 106
    .line 107
    if-ne v1, v3, :cond_6

    .line 108
    .line 109
    iget v1, p0, Li7/h;->W:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v1, p1, v0}, Li7/h;->K2(III)Ljava/lang/String;

    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    .line 116
    :cond_6
    iget v2, p0, Li7/h;->W:I

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v2, p1, v1, v0}, Li7/h;->Q2(IIII)Ljava/lang/String;

    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    .line 123
    .line 124
    :cond_7
    invoke-virtual {p0, v1, p1}, Li7/h;->k2(II)Ljava/lang/String;

    .line 125
    move-result-object p1

    .line 126
    return-object p1
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
.end method

.method public final k2(II)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Li7/h;->i0:[I

    .line 3
    .line 4
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 8
    move-result v6

    .line 9
    .line 10
    aget v1, v0, v6

    .line 11
    .line 12
    const/16 v2, 0x22

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-ne v6, v2, :cond_0

    .line 17
    .line 18
    iget v0, p0, Li7/h;->W:I

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, p2, p1, v1}, Li7/h;->L2(IIII)Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    .line 26
    :cond_0
    iget v3, p0, Li7/h;->W:I

    .line 27
    const/4 v7, 0x1

    .line 28
    move-object v2, p0

    .line 29
    move v5, p1

    .line 30
    move v4, p2

    .line 31
    .line 32
    .line 33
    invoke-virtual/range {v2 .. v7}, Li7/h;->R2(IIIII)Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    move-object p2, v2

    .line 36
    return-object p1

    .line 37
    :cond_1
    move v5, p1

    .line 38
    move v4, p2

    .line 39
    move-object p2, p0

    .line 40
    .line 41
    shl-int/lit8 p1, v5, 0x8

    .line 42
    .line 43
    or-int v3, p1, v6

    .line 44
    .line 45
    iget-object p1, p2, Li7/h;->X:Ljava/io/DataInput;

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 49
    move-result p1

    .line 50
    .line 51
    aget v1, v0, p1

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    if-ne p1, v2, :cond_2

    .line 56
    .line 57
    iget p1, p2, Li7/h;->W:I

    .line 58
    const/4 v0, 0x2

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, v4, v3, v0}, Li7/h;->L2(IIII)Ljava/lang/String;

    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    .line 65
    :cond_2
    iget v1, p2, Li7/h;->W:I

    .line 66
    const/4 v5, 0x2

    .line 67
    move-object v0, p2

    .line 68
    move v2, v4

    .line 69
    move v4, p1

    .line 70
    .line 71
    .line 72
    invoke-virtual/range {v0 .. v5}, Li7/h;->R2(IIIII)Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    .line 76
    :cond_3
    shl-int/lit8 v1, v3, 0x8

    .line 77
    .line 78
    or-int v3, v1, p1

    .line 79
    .line 80
    iget-object p1, p2, Li7/h;->X:Ljava/io/DataInput;

    .line 81
    .line 82
    .line 83
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 84
    move-result p1

    .line 85
    .line 86
    aget v1, v0, p1

    .line 87
    .line 88
    if-eqz v1, :cond_5

    .line 89
    .line 90
    if-ne p1, v2, :cond_4

    .line 91
    .line 92
    iget p1, p2, Li7/h;->W:I

    .line 93
    const/4 v0, 0x3

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1, v4, v3, v0}, Li7/h;->L2(IIII)Ljava/lang/String;

    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    .line 100
    :cond_4
    iget v1, p2, Li7/h;->W:I

    .line 101
    const/4 v5, 0x3

    .line 102
    move-object v0, p2

    .line 103
    move v2, v4

    .line 104
    move v4, p1

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v0 .. v5}, Li7/h;->R2(IIIII)Ljava/lang/String;

    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    .line 111
    :cond_5
    shl-int/lit8 v1, v3, 0x8

    .line 112
    .line 113
    or-int v3, v1, p1

    .line 114
    .line 115
    iget-object p1, p2, Li7/h;->X:Ljava/io/DataInput;

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 119
    move-result p1

    .line 120
    .line 121
    aget v0, v0, p1

    .line 122
    .line 123
    if-eqz v0, :cond_7

    .line 124
    .line 125
    if-ne p1, v2, :cond_6

    .line 126
    .line 127
    iget p1, p2, Li7/h;->W:I

    .line 128
    const/4 v0, 0x4

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1, v4, v3, v0}, Li7/h;->L2(IIII)Ljava/lang/String;

    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    .line 135
    :cond_6
    iget v1, p2, Li7/h;->W:I

    .line 136
    const/4 v5, 0x4

    .line 137
    move-object v0, p2

    .line 138
    move v2, v4

    .line 139
    move v4, p1

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v0 .. v5}, Li7/h;->R2(IIIII)Ljava/lang/String;

    .line 143
    move-result-object p1

    .line 144
    return-object p1

    .line 145
    .line 146
    .line 147
    :cond_7
    invoke-virtual {p0, p1, v4, v3}, Li7/h;->i2(III)Ljava/lang/String;

    .line 148
    move-result-object p1

    .line 149
    return-object p1
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
.end method

.method public final l2(I)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x22

    .line 3
    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Li7/h;->a2(I)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    sget-object p1, Li7/h;->i0:[I

    .line 12
    .line 13
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 17
    move-result v1

    .line 18
    .line 19
    aget v2, p1, v1

    .line 20
    .line 21
    if-nez v2, :cond_9

    .line 22
    .line 23
    iget-object v2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 27
    move-result v2

    .line 28
    .line 29
    aget v3, p1, v2

    .line 30
    .line 31
    if-nez v3, :cond_7

    .line 32
    .line 33
    shl-int/lit8 v1, v1, 0x8

    .line 34
    or-int/2addr v1, v2

    .line 35
    .line 36
    iget-object v2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 37
    .line 38
    .line 39
    invoke-interface {v2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 40
    move-result v2

    .line 41
    .line 42
    aget v3, p1, v2

    .line 43
    .line 44
    if-nez v3, :cond_5

    .line 45
    .line 46
    shl-int/lit8 v1, v1, 0x8

    .line 47
    or-int/2addr v1, v2

    .line 48
    .line 49
    iget-object v2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 50
    .line 51
    .line 52
    invoke-interface {v2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 53
    move-result v2

    .line 54
    .line 55
    aget v3, p1, v2

    .line 56
    .line 57
    if-nez v3, :cond_3

    .line 58
    .line 59
    shl-int/lit8 v1, v1, 0x8

    .line 60
    or-int/2addr v1, v2

    .line 61
    .line 62
    iget-object v2, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 63
    .line 64
    .line 65
    invoke-interface {v2}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 66
    move-result v2

    .line 67
    .line 68
    aget p1, p1, v2

    .line 69
    .line 70
    if-nez p1, :cond_1

    .line 71
    .line 72
    iput v1, p0, Li7/h;->W:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v2}, Li7/h;->j2(I)Ljava/lang/String;

    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_1
    const/4 p1, 0x4

    .line 79
    .line 80
    if-ne v2, v0, :cond_2

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1, p1}, Li7/h;->J2(II)Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {p0, v1, v2, p1}, Li7/h;->P2(III)Ljava/lang/String;

    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :cond_3
    const/4 p1, 0x3

    .line 92
    .line 93
    if-ne v2, v0, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v1, p1}, Li7/h;->J2(II)Ljava/lang/String;

    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-virtual {p0, v1, v2, p1}, Li7/h;->P2(III)Ljava/lang/String;

    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :cond_5
    const/4 p1, 0x2

    .line 105
    .line 106
    if-ne v2, v0, :cond_6

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1, p1}, Li7/h;->J2(II)Ljava/lang/String;

    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    .line 113
    .line 114
    :cond_6
    invoke-virtual {p0, v1, v2, p1}, Li7/h;->P2(III)Ljava/lang/String;

    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :cond_7
    const/4 p1, 0x1

    .line 118
    .line 119
    if-ne v2, v0, :cond_8

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v1, p1}, Li7/h;->J2(II)Ljava/lang/String;

    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    .line 126
    .line 127
    :cond_8
    invoke-virtual {p0, v1, v2, p1}, Li7/h;->P2(III)Ljava/lang/String;

    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    .line 131
    :cond_9
    if-ne v1, v0, :cond_a

    .line 132
    .line 133
    const-string p1, ""

    .line 134
    return-object p1

    .line 135
    :cond_a
    const/4 p1, 0x0

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p1, v1, p1}, Li7/h;->P2(III)Ljava/lang/String;

    .line 139
    move-result-object p1

    .line 140
    return-object p1
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
.end method

.method public m2()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 6
    move-result-object v2

    .line 7
    .line 8
    const/16 v0, 0x2d

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    aput-char v0, v2, v1

    .line 12
    .line 13
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 17
    move-result v0

    .line 18
    int-to-char v1, v0

    .line 19
    const/4 v3, 0x1

    .line 20
    .line 21
    aput-char v1, v2, v3

    .line 22
    .line 23
    const/16 v1, 0x39

    .line 24
    .line 25
    const/16 v4, 0x30

    .line 26
    .line 27
    if-gt v0, v4, :cond_1

    .line 28
    .line 29
    if-ne v0, v4, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Li7/h;->Z1()I

    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, v0, v3}, Li7/h;->Y1(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    .line 41
    :cond_1
    if-le v0, v1, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0, v3}, Li7/h;->Y1(IZ)Lcom/fasterxml/jackson/core/JsonToken;

    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 52
    move-result v0

    .line 53
    :goto_0
    const/4 v5, 0x2

    .line 54
    move v6, v3

    .line 55
    .line 56
    :goto_1
    if-gt v0, v1, :cond_3

    .line 57
    .line 58
    if-lt v0, v4, :cond_3

    .line 59
    .line 60
    add-int/lit8 v6, v6, 0x1

    .line 61
    .line 62
    add-int/lit8 v7, v5, 0x1

    .line 63
    int-to-char v0, v0

    .line 64
    .line 65
    aput-char v0, v2, v5

    .line 66
    .line 67
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 68
    .line 69
    .line 70
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 71
    move-result v0

    .line 72
    move v5, v7

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_3
    const/16 v1, 0x2e

    .line 76
    .line 77
    if-eq v0, v1, :cond_4

    .line 78
    .line 79
    const/16 v1, 0x65

    .line 80
    .line 81
    if-eq v0, v1, :cond_4

    .line 82
    .line 83
    const/16 v1, 0x45

    .line 84
    .line 85
    if-ne v0, v1, :cond_5

    .line 86
    :cond_4
    move v3, v5

    .line 87
    goto :goto_2

    .line 88
    .line 89
    :cond_5
    iget-object v1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 93
    .line 94
    iput v0, p0, Li7/h;->Y:I

    .line 95
    .line 96
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 100
    move-result v0

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Li7/h;->H2()V

    .line 106
    .line 107
    .line 108
    :cond_6
    invoke-virtual {p0, v3, v6}, Lf7/b;->K1(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 109
    move-result-object v0

    .line 110
    return-object v0

    .line 111
    :goto_2
    const/4 v5, 0x1

    .line 112
    move-object v1, p0

    .line 113
    move v4, v0

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v1 .. v6}, Li7/h;->g2([CIIZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 117
    move-result-object v0

    .line 118
    return-object v0
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
.end method

.method public n2(I)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->m()[C

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const/16 v1, 0x39

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    const/16 v4, 0x30

    .line 13
    .line 14
    if-ne p1, v4, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Li7/h;->Z1()I

    .line 18
    move-result p1

    .line 19
    .line 20
    if-gt p1, v1, :cond_0

    .line 21
    .line 22
    if-lt p1, v4, :cond_0

    .line 23
    move v2, v3

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    aput-char v4, v0, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    int-to-char p1, p1

    .line 29
    .line 30
    aput-char p1, v0, v3

    .line 31
    .line 32
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 36
    move-result p1

    .line 37
    :goto_0
    move v8, p1

    .line 38
    move-object v6, v0

    .line 39
    move v7, v2

    .line 40
    move v10, v7

    .line 41
    .line 42
    :goto_1
    if-gt v8, v1, :cond_3

    .line 43
    .line 44
    if-lt v8, v4, :cond_3

    .line 45
    .line 46
    add-int/lit8 v10, v10, 0x1

    .line 47
    array-length p1, v6

    .line 48
    .line 49
    if-lt v7, p1, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/i;->p()[C

    .line 55
    move-result-object p1

    .line 56
    move-object v6, p1

    .line 57
    move v7, v3

    .line 58
    .line 59
    :cond_2
    add-int/lit8 p1, v7, 0x1

    .line 60
    int-to-char v0, v8

    .line 61
    .line 62
    aput-char v0, v6, v7

    .line 63
    .line 64
    iget-object v0, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 68
    move-result v8

    .line 69
    move v7, p1

    .line 70
    goto :goto_1

    .line 71
    .line 72
    :cond_3
    const/16 p1, 0x2e

    .line 73
    .line 74
    if-eq v8, p1, :cond_6

    .line 75
    .line 76
    const/16 p1, 0x65

    .line 77
    .line 78
    if-eq v8, p1, :cond_6

    .line 79
    .line 80
    const/16 p1, 0x45

    .line 81
    .line 82
    if-ne v8, p1, :cond_4

    .line 83
    goto :goto_3

    .line 84
    .line 85
    :cond_4
    iget-object p1, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v7}, Lcom/fasterxml/jackson/core/util/i;->E(I)V

    .line 89
    .line 90
    iget-object p1, p0, Lf7/b;->A:Li7/d;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/f;->h()Z

    .line 94
    move-result p1

    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Li7/h;->H2()V

    .line 100
    goto :goto_2

    .line 101
    .line 102
    :cond_5
    iput v8, p0, Li7/h;->Y:I

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-virtual {p0, v3, v10}, Lf7/b;->K1(ZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_6
    :goto_3
    const/4 v9, 0x0

    .line 109
    move-object v5, p0

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v5 .. v10}, Li7/h;->g2([CIIZI)Lcom/fasterxml/jackson/core/JsonToken;

    .line 113
    move-result-object p1

    .line 114
    return-object p1
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
.end method

.method public o2(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;[B)I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p3

    .line 2
    const/4 v1, 0x3

    .line 3
    sub-int/2addr v0, v1

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    .line 8
    :cond_0
    :goto_0
    iget-object v5, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 9
    .line 10
    .line 11
    invoke-interface {v5}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 12
    move-result v5

    .line 13
    .line 14
    const/16 v6, 0x20

    .line 15
    .line 16
    if-le v5, v6, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    .line 20
    move-result v6

    .line 21
    .line 22
    const/16 v7, 0x22

    .line 23
    .line 24
    if-gez v6, :cond_2

    .line 25
    .line 26
    if-ne v5, v7, :cond_1

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, p1, v5, v2}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 32
    move-result v6

    .line 33
    .line 34
    if-gez v6, :cond_2

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_2
    if-le v3, v0, :cond_3

    .line 38
    add-int/2addr v4, v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p3, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 42
    move v3, v2

    .line 43
    .line 44
    :cond_3
    iget-object v5, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 45
    .line 46
    .line 47
    invoke-interface {v5}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 48
    move-result v5

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    .line 52
    move-result v8

    .line 53
    .line 54
    if-gez v8, :cond_4

    .line 55
    const/4 v8, 0x1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v5, v8}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 59
    move-result v8

    .line 60
    .line 61
    :cond_4
    shl-int/lit8 v5, v6, 0x6

    .line 62
    or-int/2addr v5, v8

    .line 63
    .line 64
    iget-object v6, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 65
    .line 66
    .line 67
    invoke-interface {v6}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 68
    move-result v6

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v6}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    .line 72
    move-result v8

    .line 73
    const/4 v9, -0x2

    .line 74
    const/4 v10, 0x2

    .line 75
    .line 76
    if-gez v8, :cond_a

    .line 77
    .line 78
    if-eq v8, v9, :cond_7

    .line 79
    .line 80
    if-ne v6, v7, :cond_6

    .line 81
    .line 82
    shr-int/lit8 v0, v5, 0x4

    .line 83
    .line 84
    add-int/lit8 v1, v3, 0x1

    .line 85
    int-to-byte v0, v0

    .line 86
    .line 87
    aput-byte v0, p3, v3

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    .line 91
    move-result v0

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1}, Lf7/b;->m1(Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 97
    :cond_5
    move v3, v1

    .line 98
    goto :goto_2

    .line 99
    .line 100
    .line 101
    :cond_6
    invoke-virtual {p0, p1, v6, v10}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 102
    move-result v8

    .line 103
    .line 104
    :cond_7
    if-ne v8, v9, :cond_a

    .line 105
    .line 106
    iget-object v6, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 107
    .line 108
    .line 109
    invoke-interface {v6}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 110
    move-result v6

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v6}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPaddingChar(I)Z

    .line 114
    move-result v7

    .line 115
    .line 116
    if-nez v7, :cond_9

    .line 117
    .line 118
    const/16 v7, 0x5c

    .line 119
    .line 120
    if-ne v6, v7, :cond_8

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, v6, v1}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 124
    move-result v7

    .line 125
    .line 126
    if-ne v7, v9, :cond_8

    .line 127
    goto :goto_1

    .line 128
    .line 129
    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    const-string p3, "expected padding character \'"

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getPaddingChar()C

    .line 141
    move-result p3

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string p3, "\'"

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    move-result-object p2

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, p1, v6, v1, p2}, Lf7/b;->G1(Lcom/fasterxml/jackson/core/Base64Variant;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 157
    move-result-object p1

    .line 158
    throw p1

    .line 159
    .line 160
    :cond_9
    :goto_1
    shr-int/lit8 v5, v5, 0x4

    .line 161
    .line 162
    add-int/lit8 v6, v3, 0x1

    .line 163
    int-to-byte v5, v5

    .line 164
    .line 165
    aput-byte v5, p3, v3

    .line 166
    move v3, v6

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_a
    shl-int/lit8 v5, v5, 0x6

    .line 171
    or-int/2addr v5, v8

    .line 172
    .line 173
    iget-object v6, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 174
    .line 175
    .line 176
    invoke-interface {v6}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 177
    move-result v6

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v6}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    .line 181
    move-result v8

    .line 182
    .line 183
    if-gez v8, :cond_f

    .line 184
    .line 185
    if-eq v8, v9, :cond_e

    .line 186
    .line 187
    if-ne v6, v7, :cond_d

    .line 188
    .line 189
    shr-int/lit8 v0, v5, 0x2

    .line 190
    .line 191
    add-int/lit8 v1, v3, 0x1

    .line 192
    .line 193
    shr-int/lit8 v5, v5, 0xa

    .line 194
    int-to-byte v5, v5

    .line 195
    .line 196
    aput-byte v5, p3, v3

    .line 197
    add-int/2addr v3, v10

    .line 198
    int-to-byte v0, v0

    .line 199
    .line 200
    aput-byte v0, p3, v1

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    .line 204
    move-result v0

    .line 205
    .line 206
    if-eqz v0, :cond_b

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p1}, Lf7/b;->m1(Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 210
    .line 211
    :cond_b
    :goto_2
    iput-boolean v2, p0, Li7/h;->V:Z

    .line 212
    .line 213
    if-lez v3, :cond_c

    .line 214
    add-int/2addr v4, v3

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2, p3, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 218
    :cond_c
    return v4

    .line 219
    .line 220
    .line 221
    :cond_d
    invoke-virtual {p0, p1, v6, v1}, Lf7/b;->i1(Lcom/fasterxml/jackson/core/Base64Variant;II)I

    .line 222
    move-result v8

    .line 223
    .line 224
    :cond_e
    if-ne v8, v9, :cond_f

    .line 225
    .line 226
    shr-int/lit8 v6, v5, 0x2

    .line 227
    .line 228
    add-int/lit8 v7, v3, 0x1

    .line 229
    .line 230
    shr-int/lit8 v5, v5, 0xa

    .line 231
    int-to-byte v5, v5

    .line 232
    .line 233
    aput-byte v5, p3, v3

    .line 234
    .line 235
    add-int/lit8 v3, v3, 0x2

    .line 236
    int-to-byte v5, v6

    .line 237
    .line 238
    aput-byte v5, p3, v7

    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_f
    shl-int/lit8 v5, v5, 0x6

    .line 243
    or-int/2addr v5, v8

    .line 244
    .line 245
    add-int/lit8 v6, v3, 0x1

    .line 246
    .line 247
    shr-int/lit8 v7, v5, 0x10

    .line 248
    int-to-byte v7, v7

    .line 249
    .line 250
    aput-byte v7, p3, v3

    .line 251
    .line 252
    add-int/lit8 v7, v3, 0x2

    .line 253
    .line 254
    shr-int/lit8 v8, v5, 0x8

    .line 255
    int-to-byte v8, v8

    .line 256
    .line 257
    aput-byte v8, p3, v6

    .line 258
    .line 259
    add-int/lit8 v3, v3, 0x3

    .line 260
    int-to-byte v5, v5

    .line 261
    .line 262
    aput-byte v5, p3, v7

    .line 263
    .line 264
    goto/16 :goto_0
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
.end method

.method public p(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_EMBEDDED_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lf7/b;->G:[B

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    const-string v1, "Current token ("

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    iget-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 42
    .line 43
    :cond_1
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    .line 48
    :try_start_0
    invoke-virtual {p0, p1}, Li7/h;->N1(Lcom/fasterxml/jackson/core/Base64Variant;)[B

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iput-object v0, p0, Lf7/b;->G:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    const/4 p1, 0x0

    .line 53
    .line 54
    iput-boolean p1, p0, Li7/h;->V:Z

    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    const-string v2, "Failed to decode VALUE_STRING as base64 ("

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string p1, "): "

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonParser;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParseException;

    .line 89
    move-result-object p1

    .line 90
    throw p1

    .line 91
    .line 92
    :cond_2
    iget-object v0, p0, Lf7/b;->G:[B

    .line 93
    .line 94
    if-nez v0, :cond_3

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lf7/b;->l1()Lcom/fasterxml/jackson/core/util/c;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Li7/h;->W()Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v1, v0, p1}, Lf7/c;->E0(Ljava/lang/String;Lcom/fasterxml/jackson/core/util/c;Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/c;->q()[B

    .line 109
    move-result-object p1

    .line 110
    .line 111
    iput-object p1, p0, Lf7/b;->G:[B

    .line 112
    .line 113
    :cond_3
    :goto_0
    iget-object p1, p0, Lf7/b;->G:[B

    .line 114
    return-object p1
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
.end method

.method public p2(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    if-ge p1, v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lf7/c;->U0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Li7/h;->q2(I)V

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
.end method

.method public q2(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "Invalid UTF-8 start byte 0x"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 25
    return-void
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
.end method

.method public r0()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lf7/b;->H:I

    .line 4
    .line 5
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 6
    .line 7
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Li7/h;->d2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 14
    return-object v2

    .line 15
    .line 16
    :cond_0
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Li7/h;->z2()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Li7/h;->D2()I

    .line 25
    move-result v0

    .line 26
    .line 27
    iput-object v2, p0, Lf7/b;->G:[B

    .line 28
    .line 29
    iget v3, p0, Lf7/b;->v:I

    .line 30
    .line 31
    iput v3, p0, Lf7/b;->y:I

    .line 32
    .line 33
    const/16 v3, 0x5d

    .line 34
    .line 35
    if-eq v0, v3, :cond_f

    .line 36
    .line 37
    const/16 v4, 0x7d

    .line 38
    .line 39
    if-ne v0, v4, :cond_2

    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_2
    iget-object v5, p0, Lf7/b;->A:Li7/d;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, Li7/d;->p()Z

    .line 47
    move-result v5

    .line 48
    .line 49
    if-eqz v5, :cond_5

    .line 50
    .line 51
    const/16 v5, 0x2c

    .line 52
    .line 53
    if-eq v0, v5, :cond_3

    .line 54
    .line 55
    new-instance v5, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string/jumbo v6, "was expecting comma to separate "

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    iget-object v6, p0, Lf7/b;->A:Li7/d;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 70
    move-result-object v6

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v6, " entries"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    move-result-object v5

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0, v5}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {p0}, Li7/h;->D2()I

    .line 89
    move-result v0

    .line 90
    .line 91
    iget v5, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 92
    .line 93
    sget v6, Li7/h;->Z:I

    .line 94
    and-int/2addr v5, v6

    .line 95
    .line 96
    if-eqz v5, :cond_5

    .line 97
    .line 98
    if-eq v0, v3, :cond_4

    .line 99
    .line 100
    if-ne v0, v4, :cond_5

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-direct {p0, v0}, Li7/h;->M1(I)V

    .line 104
    return-object v2

    .line 105
    .line 106
    :cond_5
    iget-object v3, p0, Lf7/b;->A:Li7/d;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 110
    move-result v3

    .line 111
    .line 112
    if-nez v3, :cond_6

    .line 113
    .line 114
    .line 115
    invoke-direct {p0, v0}, Li7/h;->e2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 116
    return-object v2

    .line 117
    .line 118
    .line 119
    :cond_6
    invoke-virtual {p0, v0}, Li7/h;->l2(I)Ljava/lang/String;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    iget-object v2, p0, Lf7/b;->A:Li7/d;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v0}, Li7/d;->t(Ljava/lang/String;)V

    .line 126
    .line 127
    iput-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 128
    .line 129
    .line 130
    invoke-direct {p0}, Li7/h;->v2()I

    .line 131
    move-result v1

    .line 132
    .line 133
    const/16 v2, 0x22

    .line 134
    const/4 v3, 0x1

    .line 135
    .line 136
    if-ne v1, v2, :cond_7

    .line 137
    .line 138
    iput-boolean v3, p0, Li7/h;->V:Z

    .line 139
    .line 140
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 141
    .line 142
    iput-object v1, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 143
    return-object v0

    .line 144
    .line 145
    :cond_7
    const/16 v2, 0x2d

    .line 146
    .line 147
    if-eq v1, v2, :cond_e

    .line 148
    .line 149
    const/16 v2, 0x2e

    .line 150
    .line 151
    if-eq v1, v2, :cond_d

    .line 152
    .line 153
    const/16 v2, 0x5b

    .line 154
    .line 155
    if-eq v1, v2, :cond_c

    .line 156
    .line 157
    const/16 v2, 0x66

    .line 158
    .line 159
    if-eq v1, v2, :cond_b

    .line 160
    .line 161
    const/16 v2, 0x6e

    .line 162
    .line 163
    if-eq v1, v2, :cond_a

    .line 164
    .line 165
    const/16 v2, 0x74

    .line 166
    .line 167
    if-eq v1, v2, :cond_9

    .line 168
    .line 169
    const/16 v2, 0x7b

    .line 170
    .line 171
    if-eq v1, v2, :cond_8

    .line 172
    .line 173
    .line 174
    packed-switch v1, :pswitch_data_0

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v1}, Li7/h;->b2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 178
    move-result-object v1

    .line 179
    goto :goto_0

    .line 180
    .line 181
    :cond_8
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 182
    goto :goto_0

    .line 183
    .line 184
    .line 185
    :cond_9
    const-string/jumbo v1, "true"

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v1, v3}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 189
    .line 190
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 191
    goto :goto_0

    .line 192
    .line 193
    :cond_a
    const-string v1, "null"

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v1, v3}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 197
    .line 198
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 199
    goto :goto_0

    .line 200
    .line 201
    :cond_b
    const-string v1, "false"

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v1, v3}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 205
    .line 206
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 207
    goto :goto_0

    .line 208
    .line 209
    :cond_c
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 210
    goto :goto_0

    .line 211
    .line 212
    .line 213
    :cond_d
    invoke-virtual {p0}, Li7/h;->h2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 214
    .line 215
    .line 216
    :pswitch_0
    invoke-virtual {p0, v1}, Li7/h;->n2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 217
    move-result-object v1

    .line 218
    goto :goto_0

    .line 219
    .line 220
    .line 221
    :cond_e
    invoke-virtual {p0}, Li7/h;->m2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 222
    move-result-object v1

    .line 223
    .line 224
    :goto_0
    iput-object v1, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 225
    return-object v0

    .line 226
    .line 227
    .line 228
    :cond_f
    :goto_1
    invoke-direct {p0, v0}, Li7/h;->M1(I)V

    .line 229
    return-object v2

    .line 230
    nop

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public s0()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 3
    .line 4
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-ne v0, v1, :cond_4

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lf7/b;->E:Z

    .line 11
    .line 12
    iget-object v1, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 13
    .line 14
    iput-object v2, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 15
    .line 16
    iput-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 17
    .line 18
    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 19
    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    iget-boolean v1, p0, Li7/h;->V:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iput-boolean v0, p0, Li7/h;->V:Z

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Li7/h;->S1()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lf7/b;->C:Lcom/fasterxml/jackson/core/util/i;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/i;->l()Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    .line 40
    :cond_1
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 41
    .line 42
    if-ne v1, v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 45
    .line 46
    iget v1, p0, Lf7/b;->y:I

    .line 47
    .line 48
    iget v3, p0, Lf7/b;->z:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, v3}, Li7/d;->m(II)Li7/d;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_2
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 58
    .line 59
    if-ne v1, v0, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, Lf7/b;->A:Li7/d;

    .line 62
    .line 63
    iget v1, p0, Lf7/b;->y:I

    .line 64
    .line 65
    iget v3, p0, Lf7/b;->z:I

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, v3}, Li7/d;->n(II)Li7/d;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    iput-object v0, p0, Lf7/b;->A:Li7/d;

    .line 72
    :cond_3
    :goto_0
    return-object v2

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-virtual {p0}, Li7/h;->t0()Lcom/fasterxml/jackson/core/JsonToken;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 79
    .line 80
    if-ne v0, v1, :cond_5

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Li7/h;->W()Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :cond_5
    return-object v2
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
.end method

.method public s1()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lf7/b;->s1()V

    .line 4
    .line 5
    iget-object v0, p0, Li7/h;->T:Lk7/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lk7/a;->G()V

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
.end method

.method public s2(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lf7/b;->w1()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, v0}, Li7/h;->t2(ILjava/lang/String;Ljava/lang/String;)V

    .line 8
    return-void
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
.end method

.method public t0()Lcom/fasterxml/jackson/core/JsonToken;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lf7/b;->r:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    return-object v1

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    .line 11
    .line 12
    if-ne v0, v2, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Li7/h;->d2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    .line 20
    iput v0, p0, Lf7/b;->H:I

    .line 21
    .line 22
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Li7/h;->z2()V

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-direct {p0}, Li7/h;->F2()I

    .line 31
    move-result v0

    .line 32
    .line 33
    if-gez v0, :cond_3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lf7/b;->close()V

    .line 37
    .line 38
    iput-object v1, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 39
    return-object v1

    .line 40
    .line 41
    :cond_3
    iput-object v1, p0, Lf7/b;->G:[B

    .line 42
    .line 43
    iget v1, p0, Lf7/b;->v:I

    .line 44
    .line 45
    iput v1, p0, Lf7/b;->y:I

    .line 46
    .line 47
    const/16 v1, 0x5d

    .line 48
    .line 49
    if-eq v0, v1, :cond_11

    .line 50
    .line 51
    const/16 v3, 0x7d

    .line 52
    .line 53
    if-ne v0, v3, :cond_4

    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :cond_4
    iget-object v4, p0, Lf7/b;->A:Li7/d;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Li7/d;->p()Z

    .line 61
    move-result v4

    .line 62
    .line 63
    if-eqz v4, :cond_7

    .line 64
    .line 65
    const/16 v4, 0x2c

    .line 66
    .line 67
    if-eq v0, v4, :cond_5

    .line 68
    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string/jumbo v5, "was expecting comma to separate "

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    iget-object v5, p0, Lf7/b;->A:Li7/d;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, Lcom/fasterxml/jackson/core/f;->j()Ljava/lang/String;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v5, " entries"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object v4

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0, v4}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    invoke-virtual {p0}, Li7/h;->D2()I

    .line 103
    move-result v0

    .line 104
    .line 105
    iget v4, p0, Lcom/fasterxml/jackson/core/JsonParser;->b:I

    .line 106
    .line 107
    sget v5, Li7/h;->Z:I

    .line 108
    and-int/2addr v4, v5

    .line 109
    .line 110
    if-eqz v4, :cond_7

    .line 111
    .line 112
    if-eq v0, v1, :cond_6

    .line 113
    .line 114
    if-ne v0, v3, :cond_7

    .line 115
    .line 116
    .line 117
    :cond_6
    invoke-direct {p0, v0}, Li7/h;->M1(I)V

    .line 118
    .line 119
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 120
    return-object v0

    .line 121
    .line 122
    :cond_7
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/f;->g()Z

    .line 126
    move-result v1

    .line 127
    .line 128
    if-nez v1, :cond_8

    .line 129
    .line 130
    .line 131
    invoke-direct {p0, v0}, Li7/h;->e2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    .line 135
    .line 136
    :cond_8
    invoke-virtual {p0, v0}, Li7/h;->l2(I)Ljava/lang/String;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    iget-object v1, p0, Lf7/b;->A:Li7/d;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v0}, Li7/d;->t(Ljava/lang/String;)V

    .line 143
    .line 144
    iput-object v2, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 145
    .line 146
    .line 147
    invoke-direct {p0}, Li7/h;->v2()I

    .line 148
    move-result v0

    .line 149
    .line 150
    const/16 v1, 0x22

    .line 151
    const/4 v2, 0x1

    .line 152
    .line 153
    if-ne v0, v1, :cond_9

    .line 154
    .line 155
    iput-boolean v2, p0, Li7/h;->V:Z

    .line 156
    .line 157
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 158
    .line 159
    iput-object v0, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 160
    .line 161
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 162
    return-object v0

    .line 163
    .line 164
    :cond_9
    const/16 v1, 0x2d

    .line 165
    .line 166
    if-eq v0, v1, :cond_10

    .line 167
    .line 168
    const/16 v1, 0x2e

    .line 169
    .line 170
    if-eq v0, v1, :cond_f

    .line 171
    .line 172
    const/16 v1, 0x5b

    .line 173
    .line 174
    if-eq v0, v1, :cond_e

    .line 175
    .line 176
    const/16 v1, 0x66

    .line 177
    .line 178
    if-eq v0, v1, :cond_d

    .line 179
    .line 180
    const/16 v1, 0x6e

    .line 181
    .line 182
    if-eq v0, v1, :cond_c

    .line 183
    .line 184
    const/16 v1, 0x74

    .line 185
    .line 186
    if-eq v0, v1, :cond_b

    .line 187
    .line 188
    const/16 v1, 0x7b

    .line 189
    .line 190
    if-eq v0, v1, :cond_a

    .line 191
    .line 192
    .line 193
    packed-switch v0, :pswitch_data_0

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v0}, Li7/h;->b2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 197
    move-result-object v0

    .line 198
    goto :goto_0

    .line 199
    .line 200
    .line 201
    :pswitch_0
    invoke-virtual {p0, v0}, Li7/h;->n2(I)Lcom/fasterxml/jackson/core/JsonToken;

    .line 202
    move-result-object v0

    .line 203
    goto :goto_0

    .line 204
    .line 205
    :cond_a
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    .line 206
    goto :goto_0

    .line 207
    .line 208
    .line 209
    :cond_b
    const-string/jumbo v0, "true"

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v0, v2}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 213
    .line 214
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 215
    goto :goto_0

    .line 216
    .line 217
    :cond_c
    const-string v0, "null"

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v0, v2}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 221
    .line 222
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    .line 223
    goto :goto_0

    .line 224
    .line 225
    :cond_d
    const-string v0, "false"

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0, v2}, Li7/h;->c2(Ljava/lang/String;I)V

    .line 229
    .line 230
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    .line 231
    goto :goto_0

    .line 232
    .line 233
    :cond_e
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    .line 234
    goto :goto_0

    .line 235
    .line 236
    .line 237
    :cond_f
    invoke-virtual {p0}, Li7/h;->h2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 238
    move-result-object v0

    .line 239
    goto :goto_0

    .line 240
    .line 241
    .line 242
    :cond_10
    invoke-virtual {p0}, Li7/h;->m2()Lcom/fasterxml/jackson/core/JsonToken;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    :goto_0
    iput-object v0, p0, Lf7/b;->B:Lcom/fasterxml/jackson/core/JsonToken;

    .line 246
    .line 247
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 248
    return-object v0

    .line 249
    .line 250
    .line 251
    :cond_11
    :goto_1
    invoke-direct {p0, v0}, Li7/h;->M1(I)V

    .line 252
    .line 253
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 254
    return-object v0

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
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
.end method

.method public t2(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0, p1}, Li7/h;->O1(I)I

    .line 9
    move-result p1

    .line 10
    int-to-char p1, p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 14
    move-result p2

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string p2, "Unrecognized token \'"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string p2, "\': was expecting "

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lf7/c;->K0(Ljava/lang/String;)V

    .line 49
    return-void

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 58
    move-result p1

    .line 59
    goto :goto_0
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
.end method

.method public u()Lcom/fasterxml/jackson/core/g;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Li7/h;->S:Lcom/fasterxml/jackson/core/g;

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
.end method

.method public v()Lcom/fasterxml/jackson/core/JsonLocation;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Lcom/fasterxml/jackson/core/JsonLocation;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lf7/b;->g1()Lcom/fasterxml/jackson/core/io/ContentReference;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    iget v6, p0, Lf7/b;->v:I

    .line 9
    const/4 v7, -0x1

    .line 10
    .line 11
    const-wide/16 v2, -0x1

    .line 12
    .line 13
    const-wide/16 v4, -0x1

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    .line 17
    return-object v0
    .line 18
.end method

.method public final w2(IZ)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    const/16 v0, 0x20

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-le p1, v0, :cond_4

    .line 6
    .line 7
    const/16 v0, 0x2f

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Li7/h;->x2()V

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    const/16 v0, 0x23

    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Li7/h;->G2()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    goto :goto_1

    .line 25
    .line 26
    :cond_1
    if-eqz p2, :cond_2

    .line 27
    return p1

    .line 28
    .line 29
    :cond_2
    const/16 p2, 0x3a

    .line 30
    .line 31
    if-eq p1, p2, :cond_3

    .line 32
    .line 33
    .line 34
    const-string/jumbo p2, "was expecting a colon to separate field name and value"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Lf7/c;->S0(ILjava/lang/String;)V

    .line 38
    :cond_3
    move p2, v1

    .line 39
    goto :goto_1

    .line 40
    .line 41
    :cond_4
    const/16 v0, 0xd

    .line 42
    .line 43
    if-eq p1, v0, :cond_5

    .line 44
    .line 45
    const/16 v0, 0xa

    .line 46
    .line 47
    if-ne p1, v0, :cond_6

    .line 48
    .line 49
    :cond_5
    iget p1, p0, Lf7/b;->v:I

    .line 50
    add-int/2addr p1, v1

    .line 51
    .line 52
    iput p1, p0, Lf7/b;->v:I

    .line 53
    .line 54
    :cond_6
    :goto_1
    iget-object p1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 58
    move-result p1

    .line 59
    goto :goto_0
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
.end method

.method public x0(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Li7/h;->V:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lf7/c;->e:Lcom/fasterxml/jackson/core/JsonToken;

    .line 7
    .line 8
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/d;->d()[B

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Li7/h;->o2(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;[B)I

    .line 21
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    iget-object p2, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/io/d;->o([B)V

    .line 27
    return p1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    .line 30
    iget-object p2, p0, Lf7/b;->q:Lcom/fasterxml/jackson/core/io/d;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/io/d;->o([B)V

    .line 34
    throw p1

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Li7/h;->p(Lcom/fasterxml/jackson/core/Base64Variant;)[B

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    .line 42
    array-length p1, p1

    .line 43
    return p1
    .line 44
    .line 45
.end method

.method public z2()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Li7/h;->V:Z

    .line 4
    .line 5
    sget-object v0, Li7/h;->h0:[I

    .line 6
    .line 7
    :cond_0
    :goto_0
    iget-object v1, p0, Li7/h;->X:Ljava/io/DataInput;

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 11
    move-result v1

    .line 12
    .line 13
    aget v2, v0, v1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/16 v3, 0x22

    .line 18
    .line 19
    if-ne v1, v3, :cond_1

    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v3, 0x1

    .line 22
    .line 23
    if-eq v2, v3, :cond_6

    .line 24
    const/4 v3, 0x2

    .line 25
    .line 26
    if-eq v2, v3, :cond_5

    .line 27
    const/4 v3, 0x3

    .line 28
    .line 29
    if-eq v2, v3, :cond_4

    .line 30
    const/4 v3, 0x4

    .line 31
    .line 32
    if-eq v2, v3, :cond_3

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    if-ge v1, v2, :cond_2

    .line 37
    .line 38
    .line 39
    const-string/jumbo v2, "string value"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1, v2}, Lf7/b;->v1(ILjava/lang/String;)V

    .line 43
    goto :goto_0

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, v1}, Li7/h;->p2(I)V

    .line 47
    goto :goto_0

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-virtual {p0}, Li7/h;->C2()V

    .line 51
    goto :goto_0

    .line 52
    .line 53
    .line 54
    :cond_4
    invoke-virtual {p0}, Li7/h;->B2()V

    .line 55
    goto :goto_0

    .line 56
    .line 57
    .line 58
    :cond_5
    invoke-virtual {p0}, Li7/h;->A2()V

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_6
    invoke-virtual {p0}, Li7/h;->j1()C

    .line 63
    goto :goto_0
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
.end method
