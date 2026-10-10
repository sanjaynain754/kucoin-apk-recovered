.class public final Lshark/internal/a;
.super Ljava/lang/Object;
.source "AndroidNativeSizeMapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lshark/internal/a;",
        "",
        "Lshark/i;",
        "graph",
        "<init>",
        "(Lshark/i;)V",
        "",
        "",
        "",
        "a",
        "()Ljava/util/Map;",
        "Lshark/i;",
        "shark"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field public final a:Lshark/i;


# direct methods
.method public constructor <init>(Lshark/i;)V
    .locals 0
    .param p1    # Lshark/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lshark/internal/a;->a:Lshark/i;

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


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lshark/internal/a;->a:Lshark/i;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "sun.misc.Cleaner"

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lshark/HeapObject$HeapClass;->l()Lkotlin/sequences/Sequence;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    move-result v3

    .line 29
    .line 30
    if-eqz v3, :cond_5

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    check-cast v3, Lshark/HeapObject$HeapInstance;

    .line 37
    .line 38
    .line 39
    const-string/jumbo v4, "thunk"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2, v4}, Lshark/HeapObject$HeapInstance;->j(Ljava/lang/String;Ljava/lang/String;)Lshark/h;

    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x0

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Lshark/h;->c()Lshark/j;

    .line 50
    move-result-object v6

    .line 51
    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Lshark/j;->c()Ljava/lang/Long;

    .line 56
    move-result-object v6

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v6, v5

    .line 59
    .line 60
    :goto_1
    const-string v7, "java.lang.ref.Reference"

    .line 61
    .line 62
    const-string v8, "referent"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v7, v8}, Lshark/HeapObject$HeapInstance;->j(Ljava/lang/String;Ljava/lang/String;)Lshark/h;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Lshark/h;->c()Lshark/j;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Lshark/j;->c()Ljava/lang/Long;

    .line 78
    move-result-object v5

    .line 79
    .line 80
    :cond_2
    if-eqz v6, :cond_0

    .line 81
    .line 82
    if-eqz v5, :cond_0

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lshark/h;->c()Lshark/j;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Lshark/j;->d()Lshark/HeapObject;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    instance-of v4, v3, Lshark/HeapObject$HeapInstance;

    .line 93
    .line 94
    if-eqz v4, :cond_0

    .line 95
    .line 96
    check-cast v3, Lshark/HeapObject$HeapInstance;

    .line 97
    .line 98
    const-string v4, "libcore.util.NativeAllocationRegistry$CleanerThunk"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v4}, Lshark/HeapObject$HeapInstance;->q(Ljava/lang/String;)Z

    .line 102
    move-result v6

    .line 103
    .line 104
    if-eqz v6, :cond_0

    .line 105
    .line 106
    .line 107
    const-string/jumbo v6, "this$0"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v4, v6}, Lshark/HeapObject$HeapInstance;->j(Ljava/lang/String;Ljava/lang/String;)Lshark/h;

    .line 111
    move-result-object v3

    .line 112
    .line 113
    if-eqz v3, :cond_0

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Lshark/h;->c()Lshark/j;

    .line 117
    move-result-object v4

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Lshark/j;->f()Z

    .line 121
    move-result v4

    .line 122
    .line 123
    if-eqz v4, :cond_0

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Lshark/h;->c()Lshark/j;

    .line 127
    move-result-object v3

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Lshark/j;->d()Lshark/HeapObject;

    .line 131
    move-result-object v3

    .line 132
    .line 133
    instance-of v4, v3, Lshark/HeapObject$HeapInstance;

    .line 134
    .line 135
    if-eqz v4, :cond_0

    .line 136
    .line 137
    check-cast v3, Lshark/HeapObject$HeapInstance;

    .line 138
    .line 139
    const-string v4, "libcore.util.NativeAllocationRegistry"

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v4}, Lshark/HeapObject$HeapInstance;->q(Ljava/lang/String;)Z

    .line 143
    move-result v6

    .line 144
    .line 145
    if-eqz v6, :cond_0

    .line 146
    .line 147
    .line 148
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    move-result-object v6

    .line 150
    .line 151
    check-cast v6, Ljava/lang/Integer;

    .line 152
    const/4 v7, 0x0

    .line 153
    .line 154
    if-eqz v6, :cond_3

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 158
    move-result v6

    .line 159
    goto :goto_2

    .line 160
    :cond_3
    move v6, v7

    .line 161
    .line 162
    .line 163
    :goto_2
    const-string/jumbo v8, "size"

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v4, v8}, Lshark/HeapObject$HeapInstance;->j(Ljava/lang/String;Ljava/lang/String;)Lshark/h;

    .line 167
    move-result-object v3

    .line 168
    .line 169
    if-eqz v3, :cond_4

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Lshark/h;->c()Lshark/j;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    if-eqz v3, :cond_4

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3}, Lshark/j;->b()Ljava/lang/Long;

    .line 179
    move-result-object v3

    .line 180
    .line 181
    if-eqz v3, :cond_4

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 185
    move-result-wide v3

    .line 186
    long-to-int v7, v3

    .line 187
    :cond_4
    add-int/2addr v6, v7

    .line 188
    .line 189
    .line 190
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    move-result-object v3

    .line 192
    .line 193
    .line 194
    invoke-interface {v0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    :cond_5
    return-object v0
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
