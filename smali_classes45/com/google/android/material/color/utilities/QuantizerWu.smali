.class public final Lcom/google/android/material/color/utilities/QuantizerWu;
.super Ljava/lang/Object;
.source "QuantizerWu.java"

# interfaces
.implements Lcom/google/android/material/color/utilities/Quantizer;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/color/utilities/QuantizerWu$CreateBoxesResult;,
        Lcom/google/android/material/color/utilities/QuantizerWu$Box;,
        Lcom/google/android/material/color/utilities/QuantizerWu$Direction;,
        Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;
    }
.end annotation


# static fields
.field private static final INDEX_BITS:I = 0x5

.field private static final INDEX_COUNT:I = 0x21

.field private static final TOTAL_SIZE:I = 0x8c61


# instance fields
.field cubes:[Lcom/google/android/material/color/utilities/QuantizerWu$Box;

.field moments:[D

.field momentsB:[I

.field momentsG:[I

.field momentsR:[I

.field weights:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static bottom(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;[I)I
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    const/4 v1, 0x2

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 15
    .line 16
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 17
    .line 18
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 22
    move-result p1

    .line 23
    .line 24
    aget p1, p2, p1

    .line 25
    neg-int p1, p1

    .line 26
    .line 27
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 28
    .line 29
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 30
    .line 31
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 35
    move-result v0

    .line 36
    .line 37
    aget v0, p2, v0

    .line 38
    add-int/2addr p1, v0

    .line 39
    .line 40
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 41
    .line 42
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 43
    .line 44
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 48
    move-result v0

    .line 49
    .line 50
    aget v0, p2, v0

    .line 51
    add-int/2addr p1, v0

    .line 52
    .line 53
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 54
    .line 55
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 56
    .line 57
    iget p0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1, p0}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 61
    move-result p0

    .line 62
    .line 63
    aget p0, p2, p0

    .line 64
    :goto_0
    sub-int/2addr p1, p0

    .line 65
    return p1

    .line 66
    .line 67
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    new-instance p2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string/jumbo v0, "unexpected direction "

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    throw p0

    .line 90
    .line 91
    :cond_1
    iget p1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 92
    .line 93
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 94
    .line 95
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v0, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 99
    move-result p1

    .line 100
    .line 101
    aget p1, p2, p1

    .line 102
    neg-int p1, p1

    .line 103
    .line 104
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 105
    .line 106
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 107
    .line 108
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 112
    move-result v0

    .line 113
    .line 114
    aget v0, p2, v0

    .line 115
    add-int/2addr p1, v0

    .line 116
    .line 117
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 118
    .line 119
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 120
    .line 121
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 125
    move-result v0

    .line 126
    .line 127
    aget v0, p2, v0

    .line 128
    add-int/2addr p1, v0

    .line 129
    .line 130
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 131
    .line 132
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 133
    .line 134
    iget p0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1, p0}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 138
    move-result p0

    .line 139
    .line 140
    aget p0, p2, p0

    .line 141
    goto :goto_0

    .line 142
    .line 143
    :cond_2
    iget p1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 144
    .line 145
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 146
    .line 147
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 148
    .line 149
    .line 150
    invoke-static {p1, v0, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 151
    move-result p1

    .line 152
    .line 153
    aget p1, p2, p1

    .line 154
    neg-int p1, p1

    .line 155
    .line 156
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 157
    .line 158
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 159
    .line 160
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 164
    move-result v0

    .line 165
    .line 166
    aget v0, p2, v0

    .line 167
    add-int/2addr p1, v0

    .line 168
    .line 169
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 170
    .line 171
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 172
    .line 173
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 177
    move-result v0

    .line 178
    .line 179
    aget v0, p2, v0

    .line 180
    add-int/2addr p1, v0

    .line 181
    .line 182
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 183
    .line 184
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 185
    .line 186
    iget p0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v1, p0}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 190
    move-result p0

    .line 191
    .line 192
    aget p0, p2, p0

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

.method public static getIndex(III)I
    .locals 2

    .line 1
    .line 2
    shl-int/lit8 v0, p0, 0xa

    .line 3
    .line 4
    shl-int/lit8 v1, p0, 0x6

    .line 5
    add-int/2addr v0, v1

    .line 6
    add-int/2addr v0, p0

    .line 7
    .line 8
    shl-int/lit8 p0, p1, 0x5

    .line 9
    add-int/2addr v0, p0

    .line 10
    add-int/2addr v0, p1

    .line 11
    add-int/2addr v0, p2

    .line 12
    return v0
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

.method public static top(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;I[I)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    const/4 v1, 0x2

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 15
    .line 16
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0, p2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 20
    move-result p1

    .line 21
    .line 22
    aget p1, p3, p1

    .line 23
    .line 24
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 25
    .line 26
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, p2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 30
    move-result v0

    .line 31
    .line 32
    aget v0, p3, v0

    .line 33
    sub-int/2addr p1, v0

    .line 34
    .line 35
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 36
    .line 37
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1, p2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 41
    move-result v0

    .line 42
    .line 43
    aget v0, p3, v0

    .line 44
    sub-int/2addr p1, v0

    .line 45
    .line 46
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 47
    .line 48
    iget p0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 49
    .line 50
    .line 51
    invoke-static {v0, p0, p2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 52
    move-result p0

    .line 53
    .line 54
    aget p0, p3, p0

    .line 55
    :goto_0
    add-int/2addr p1, p0

    .line 56
    return p1

    .line 57
    .line 58
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string/jumbo p3, "unexpected direction "

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    throw p0

    .line 81
    .line 82
    :cond_1
    iget p1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 83
    .line 84
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2, v0}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 88
    move-result p1

    .line 89
    .line 90
    aget p1, p3, p1

    .line 91
    .line 92
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 93
    .line 94
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 95
    .line 96
    .line 97
    invoke-static {v0, p2, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 98
    move-result v0

    .line 99
    .line 100
    aget v0, p3, v0

    .line 101
    sub-int/2addr p1, v0

    .line 102
    .line 103
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 104
    .line 105
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 106
    .line 107
    .line 108
    invoke-static {v0, p2, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 109
    move-result v0

    .line 110
    .line 111
    aget v0, p3, v0

    .line 112
    sub-int/2addr p1, v0

    .line 113
    .line 114
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 115
    .line 116
    iget p0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 117
    .line 118
    .line 119
    invoke-static {v0, p2, p0}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 120
    move-result p0

    .line 121
    .line 122
    aget p0, p3, p0

    .line 123
    goto :goto_0

    .line 124
    .line 125
    :cond_2
    iget p1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 126
    .line 127
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 128
    .line 129
    .line 130
    invoke-static {p2, p1, v0}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 131
    move-result p1

    .line 132
    .line 133
    aget p1, p3, p1

    .line 134
    .line 135
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 136
    .line 137
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 138
    .line 139
    .line 140
    invoke-static {p2, v0, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 141
    move-result v0

    .line 142
    .line 143
    aget v0, p3, v0

    .line 144
    sub-int/2addr p1, v0

    .line 145
    .line 146
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 147
    .line 148
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 149
    .line 150
    .line 151
    invoke-static {p2, v0, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 152
    move-result v0

    .line 153
    .line 154
    aget v0, p3, v0

    .line 155
    sub-int/2addr p1, v0

    .line 156
    .line 157
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 158
    .line 159
    iget p0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 160
    .line 161
    .line 162
    invoke-static {p2, v0, p0}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 163
    move-result p0

    .line 164
    .line 165
    aget p0, p3, p0

    .line 166
    goto :goto_0
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

.method public static volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 3
    .line 4
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 5
    .line 6
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 10
    move-result v0

    .line 11
    .line 12
    aget v0, p1, v0

    .line 13
    .line 14
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 15
    .line 16
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 17
    .line 18
    iget v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2, v3}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 22
    move-result v1

    .line 23
    .line 24
    aget v1, p1, v1

    .line 25
    sub-int/2addr v0, v1

    .line 26
    .line 27
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 28
    .line 29
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 30
    .line 31
    iget v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2, v3}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 35
    move-result v1

    .line 36
    .line 37
    aget v1, p1, v1

    .line 38
    sub-int/2addr v0, v1

    .line 39
    .line 40
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 41
    .line 42
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 43
    .line 44
    iget v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2, v3}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 48
    move-result v1

    .line 49
    .line 50
    aget v1, p1, v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    .line 53
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 54
    .line 55
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 56
    .line 57
    iget v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2, v3}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 61
    move-result v1

    .line 62
    .line 63
    aget v1, p1, v1

    .line 64
    sub-int/2addr v0, v1

    .line 65
    .line 66
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 67
    .line 68
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 69
    .line 70
    iget v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v2, v3}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 74
    move-result v1

    .line 75
    .line 76
    aget v1, p1, v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    .line 79
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 80
    .line 81
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 82
    .line 83
    iget v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v2, v3}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 87
    move-result v1

    .line 88
    .line 89
    aget v1, p1, v1

    .line 90
    add-int/2addr v0, v1

    .line 91
    .line 92
    iget v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 93
    .line 94
    iget v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 95
    .line 96
    iget p0, p0, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v2, p0}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 100
    move-result p0

    .line 101
    .line 102
    aget p0, p1, p0

    .line 103
    sub-int/2addr v0, p0

    .line 104
    return v0
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


# virtual methods
.method public constructHistogram(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    const v0, 0x8c61

    .line 4
    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 8
    .line 9
    new-array v1, v0, [I

    .line 10
    .line 11
    iput-object v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 12
    .line 13
    new-array v1, v0, [I

    .line 14
    .line 15
    iput-object v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 16
    .line 17
    new-array v1, v0, [I

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 20
    .line 21
    new-array v0, v0, [D

    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    check-cast v0, Ljava/util/Map$Entry;

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 53
    move-result v1

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    check-cast v0, Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    move-result v0

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lcom/google/android/material/color/utilities/ColorUtils;->redFromArgb(I)I

    .line 67
    move-result v2

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Lcom/google/android/material/color/utilities/ColorUtils;->greenFromArgb(I)I

    .line 71
    move-result v3

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lcom/google/android/material/color/utilities/ColorUtils;->blueFromArgb(I)I

    .line 75
    move-result v1

    .line 76
    .line 77
    shr-int/lit8 v4, v2, 0x3

    .line 78
    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    shr-int/lit8 v5, v3, 0x3

    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    shr-int/lit8 v6, v1, 0x3

    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    .line 90
    invoke-static {v4, v5, v6}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 91
    move-result v4

    .line 92
    .line 93
    iget-object v5, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 94
    .line 95
    aget v6, v5, v4

    .line 96
    add-int/2addr v6, v0

    .line 97
    .line 98
    aput v6, v5, v4

    .line 99
    .line 100
    iget-object v5, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 101
    .line 102
    aget v6, v5, v4

    .line 103
    .line 104
    mul-int v7, v2, v0

    .line 105
    add-int/2addr v6, v7

    .line 106
    .line 107
    aput v6, v5, v4

    .line 108
    .line 109
    iget-object v5, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 110
    .line 111
    aget v6, v5, v4

    .line 112
    .line 113
    mul-int v7, v3, v0

    .line 114
    add-int/2addr v6, v7

    .line 115
    .line 116
    aput v6, v5, v4

    .line 117
    .line 118
    iget-object v5, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 119
    .line 120
    aget v6, v5, v4

    .line 121
    .line 122
    mul-int v7, v1, v0

    .line 123
    add-int/2addr v6, v7

    .line 124
    .line 125
    aput v6, v5, v4

    .line 126
    .line 127
    iget-object v5, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 128
    .line 129
    aget-wide v6, v5, v4

    .line 130
    mul-int/2addr v2, v2

    .line 131
    mul-int/2addr v3, v3

    .line 132
    add-int/2addr v2, v3

    .line 133
    mul-int/2addr v1, v1

    .line 134
    add-int/2addr v2, v1

    .line 135
    mul-int/2addr v0, v2

    .line 136
    int-to-double v0, v0

    .line 137
    add-double/2addr v6, v0

    .line 138
    .line 139
    aput-wide v6, v5, v4

    .line 140
    goto :goto_0

    .line 141
    :cond_0
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

.method public createBoxes(I)Lcom/google/android/material/color/utilities/QuantizerWu$CreateBoxesResult;
    .locals 13

    .line 1
    .line 2
    new-array v0, p1, [Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->cubes:[Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    .line 8
    :goto_0
    if-ge v1, p1, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->cubes:[Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 11
    .line 12
    new-instance v3, Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/QuantizerWu$Box;-><init>(Lcom/google/android/material/color/utilities/QuantizerWu$1;)V

    .line 17
    .line 18
    aput-object v3, v2, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_0
    new-array v1, p1, [D

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->cubes:[Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 26
    .line 27
    aget-object v2, v2, v0

    .line 28
    .line 29
    const/16 v3, 0x20

    .line 30
    .line 31
    iput v3, v2, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 32
    .line 33
    iput v3, v2, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 34
    .line 35
    iput v3, v2, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 36
    const/4 v2, 0x1

    .line 37
    move v4, v0

    .line 38
    move v3, v2

    .line 39
    .line 40
    :goto_1
    if-ge v3, p1, :cond_7

    .line 41
    .line 42
    iget-object v5, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->cubes:[Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 43
    .line 44
    aget-object v6, v5, v4

    .line 45
    .line 46
    aget-object v5, v5, v3

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v6, v5}, Lcom/google/android/material/color/utilities/QuantizerWu;->cut(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Box;)Ljava/lang/Boolean;

    .line 50
    move-result-object v5

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    move-result v5

    .line 55
    .line 56
    const-wide/16 v6, 0x0

    .line 57
    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    iget-object v5, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->cubes:[Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 61
    .line 62
    aget-object v5, v5, v4

    .line 63
    .line 64
    iget v8, v5, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->vol:I

    .line 65
    .line 66
    if-le v8, v2, :cond_1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v5}, Lcom/google/android/material/color/utilities/QuantizerWu;->variance(Lcom/google/android/material/color/utilities/QuantizerWu$Box;)D

    .line 70
    move-result-wide v8

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    move-wide v8, v6

    .line 73
    .line 74
    :goto_2
    aput-wide v8, v1, v4

    .line 75
    .line 76
    iget-object v4, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->cubes:[Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 77
    .line 78
    aget-object v4, v4, v3

    .line 79
    .line 80
    iget v5, v4, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->vol:I

    .line 81
    .line 82
    if-le v5, v2, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v4}, Lcom/google/android/material/color/utilities/QuantizerWu;->variance(Lcom/google/android/material/color/utilities/QuantizerWu$Box;)D

    .line 86
    move-result-wide v4

    .line 87
    goto :goto_3

    .line 88
    :cond_2
    move-wide v4, v6

    .line 89
    .line 90
    :goto_3
    aput-wide v4, v1, v3

    .line 91
    goto :goto_4

    .line 92
    .line 93
    :cond_3
    aput-wide v6, v1, v4

    .line 94
    .line 95
    add-int/lit8 v3, v3, -0x1

    .line 96
    .line 97
    :goto_4
    aget-wide v4, v1, v0

    .line 98
    move v8, v0

    .line 99
    move v9, v2

    .line 100
    .line 101
    :goto_5
    if-gt v9, v3, :cond_5

    .line 102
    .line 103
    aget-wide v10, v1, v9

    .line 104
    .line 105
    cmpl-double v12, v10, v4

    .line 106
    .line 107
    if-lez v12, :cond_4

    .line 108
    move v8, v9

    .line 109
    move-wide v4, v10

    .line 110
    .line 111
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 112
    goto :goto_5

    .line 113
    .line 114
    :cond_5
    cmpg-double v4, v4, v6

    .line 115
    .line 116
    if-gtz v4, :cond_6

    .line 117
    add-int/2addr v3, v2

    .line 118
    goto :goto_6

    .line 119
    .line 120
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 121
    move v4, v8

    .line 122
    goto :goto_1

    .line 123
    :cond_7
    move v3, p1

    .line 124
    .line 125
    :goto_6
    new-instance v0, Lcom/google/android/material/color/utilities/QuantizerWu$CreateBoxesResult;

    .line 126
    .line 127
    .line 128
    invoke-direct {v0, p1, v3}, Lcom/google/android/material/color/utilities/QuantizerWu$CreateBoxesResult;-><init>(II)V

    .line 129
    return-object v0
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

.method public createMoments()V
    .locals 22

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v2, 0x1

    .line 4
    .line 5
    :goto_0
    const/16 v3, 0x21

    .line 6
    .line 7
    if-ge v2, v3, :cond_2

    .line 8
    .line 9
    new-array v4, v3, [I

    .line 10
    .line 11
    new-array v5, v3, [I

    .line 12
    .line 13
    new-array v6, v3, [I

    .line 14
    .line 15
    new-array v7, v3, [I

    .line 16
    .line 17
    new-array v8, v3, [D

    .line 18
    const/4 v9, 0x1

    .line 19
    .line 20
    :goto_1
    if-ge v9, v3, :cond_1

    .line 21
    const/4 v10, 0x0

    .line 22
    .line 23
    const-wide/16 v11, 0x0

    .line 24
    move v13, v10

    .line 25
    move-wide v14, v11

    .line 26
    const/4 v1, 0x1

    .line 27
    move v11, v13

    .line 28
    move v12, v11

    .line 29
    .line 30
    :goto_2
    if-ge v1, v3, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v9, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 34
    move-result v16

    .line 35
    .line 36
    iget-object v3, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 37
    .line 38
    aget v3, v3, v16

    .line 39
    add-int/2addr v10, v3

    .line 40
    .line 41
    iget-object v3, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 42
    .line 43
    aget v3, v3, v16

    .line 44
    add-int/2addr v11, v3

    .line 45
    .line 46
    iget-object v3, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 47
    .line 48
    aget v3, v3, v16

    .line 49
    add-int/2addr v12, v3

    .line 50
    .line 51
    iget-object v3, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 52
    .line 53
    aget v3, v3, v16

    .line 54
    add-int/2addr v13, v3

    .line 55
    .line 56
    iget-object v3, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 57
    .line 58
    aget-wide v17, v3, v16

    .line 59
    .line 60
    add-double v14, v14, v17

    .line 61
    .line 62
    aget v3, v4, v1

    .line 63
    add-int/2addr v3, v10

    .line 64
    .line 65
    aput v3, v4, v1

    .line 66
    .line 67
    aget v3, v5, v1

    .line 68
    add-int/2addr v3, v11

    .line 69
    .line 70
    aput v3, v5, v1

    .line 71
    .line 72
    aget v3, v6, v1

    .line 73
    add-int/2addr v3, v12

    .line 74
    .line 75
    aput v3, v6, v1

    .line 76
    .line 77
    aget v3, v7, v1

    .line 78
    add-int/2addr v3, v13

    .line 79
    .line 80
    aput v3, v7, v1

    .line 81
    .line 82
    aget-wide v17, v8, v1

    .line 83
    .line 84
    add-double v17, v17, v14

    .line 85
    .line 86
    aput-wide v17, v8, v1

    .line 87
    .line 88
    add-int/lit8 v3, v2, -0x1

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v9, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 92
    move-result v3

    .line 93
    .line 94
    move/from16 v17, v1

    .line 95
    .line 96
    iget-object v1, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 97
    .line 98
    aget v18, v1, v3

    .line 99
    .line 100
    aget v19, v4, v17

    .line 101
    .line 102
    add-int v18, v18, v19

    .line 103
    .line 104
    aput v18, v1, v16

    .line 105
    .line 106
    iget-object v1, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 107
    .line 108
    aget v18, v1, v3

    .line 109
    .line 110
    aget v19, v5, v17

    .line 111
    .line 112
    add-int v18, v18, v19

    .line 113
    .line 114
    aput v18, v1, v16

    .line 115
    .line 116
    iget-object v1, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 117
    .line 118
    aget v18, v1, v3

    .line 119
    .line 120
    aget v19, v6, v17

    .line 121
    .line 122
    add-int v18, v18, v19

    .line 123
    .line 124
    aput v18, v1, v16

    .line 125
    .line 126
    iget-object v1, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 127
    .line 128
    aget v18, v1, v3

    .line 129
    .line 130
    aget v19, v7, v17

    .line 131
    .line 132
    add-int v18, v18, v19

    .line 133
    .line 134
    aput v18, v1, v16

    .line 135
    .line 136
    iget-object v1, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 137
    .line 138
    aget-wide v18, v1, v3

    .line 139
    .line 140
    aget-wide v20, v8, v17

    .line 141
    .line 142
    add-double v18, v18, v20

    .line 143
    .line 144
    aput-wide v18, v1, v16

    .line 145
    .line 146
    add-int/lit8 v1, v17, 0x1

    .line 147
    .line 148
    const/16 v3, 0x21

    .line 149
    goto :goto_2

    .line 150
    .line 151
    :cond_0
    add-int/lit8 v9, v9, 0x1

    .line 152
    .line 153
    const/16 v3, 0x21

    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    :cond_2
    return-void
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

.method public createResult(I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v1, p1, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->cubes:[Lcom/google/android/material/color/utilities/QuantizerWu$Box;

    .line 11
    .line 12
    aget-object v2, v2, v1

    .line 13
    .line 14
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 18
    move-result v3

    .line 19
    .line 20
    if-lez v3, :cond_0

    .line 21
    .line 22
    iget-object v4, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v4}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 26
    move-result v4

    .line 27
    div-int/2addr v4, v3

    .line 28
    .line 29
    iget-object v5, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v5}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 33
    move-result v5

    .line 34
    div-int/2addr v5, v3

    .line 35
    .line 36
    iget-object v6, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v6}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 40
    move-result v2

    .line 41
    div-int/2addr v2, v3

    .line 42
    .line 43
    and-int/lit16 v3, v4, 0xff

    .line 44
    .line 45
    shl-int/lit8 v3, v3, 0x10

    .line 46
    .line 47
    const/high16 v4, -0x1000000

    .line 48
    or-int/2addr v3, v4

    .line 49
    .line 50
    and-int/lit16 v4, v5, 0xff

    .line 51
    .line 52
    shl-int/lit8 v4, v4, 0x8

    .line 53
    or-int/2addr v3, v4

    .line 54
    .line 55
    and-int/lit16 v2, v2, 0xff

    .line 56
    or-int/2addr v2, v3

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return-object v0
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

.method public cut(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Box;)Ljava/lang/Boolean;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v9, p2

    .line 7
    .line 8
    iget-object v2, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 12
    move-result v5

    .line 13
    .line 14
    iget-object v2, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 18
    move-result v6

    .line 19
    .line 20
    iget-object v2, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 24
    move-result v7

    .line 25
    .line 26
    iget-object v2, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 30
    move-result v8

    .line 31
    .line 32
    sget-object v2, Lcom/google/android/material/color/utilities/QuantizerWu$Direction;->RED:Lcom/google/android/material/color/utilities/QuantizerWu$Direction;

    .line 33
    .line 34
    iget v3, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 35
    const/4 v10, 0x1

    .line 36
    add-int/2addr v3, v10

    .line 37
    .line 38
    iget v4, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {v0 .. v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->maximize(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;IIIIII)Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;

    .line 42
    move-result-object v11

    .line 43
    move-object v12, v2

    .line 44
    .line 45
    sget-object v2, Lcom/google/android/material/color/utilities/QuantizerWu$Direction;->GREEN:Lcom/google/android/material/color/utilities/QuantizerWu$Direction;

    .line 46
    .line 47
    iget v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 48
    .line 49
    add-int/lit8 v3, v0, 0x1

    .line 50
    .line 51
    iget v4, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 52
    .line 53
    move-object/from16 v0, p0

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {v0 .. v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->maximize(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;IIIIII)Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;

    .line 57
    move-result-object v13

    .line 58
    move-object v14, v2

    .line 59
    .line 60
    sget-object v2, Lcom/google/android/material/color/utilities/QuantizerWu$Direction;->BLUE:Lcom/google/android/material/color/utilities/QuantizerWu$Direction;

    .line 61
    .line 62
    iget v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 63
    .line 64
    add-int/lit8 v3, v0, 0x1

    .line 65
    .line 66
    iget v4, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 67
    .line 68
    move-object/from16 v0, p0

    .line 69
    .line 70
    .line 71
    invoke-virtual/range {v0 .. v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->maximize(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;IIIIII)Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    iget-wide v4, v11, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;->maximum:D

    .line 75
    .line 76
    iget-wide v6, v13, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;->maximum:D

    .line 77
    move-object v8, v11

    .line 78
    .line 79
    iget-wide v10, v3, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;->maximum:D

    .line 80
    .line 81
    cmpl-double v15, v4, v6

    .line 82
    .line 83
    if-ltz v15, :cond_1

    .line 84
    .line 85
    cmpl-double v15, v4, v10

    .line 86
    .line 87
    if-ltz v15, :cond_1

    .line 88
    .line 89
    iget v2, v8, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;->cutLocation:I

    .line 90
    .line 91
    if-gez v2, :cond_0

    .line 92
    .line 93
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 94
    return-object v0

    .line 95
    :cond_0
    move-object v2, v12

    .line 96
    goto :goto_0

    .line 97
    .line 98
    :cond_1
    cmpl-double v4, v6, v4

    .line 99
    .line 100
    if-ltz v4, :cond_2

    .line 101
    .line 102
    cmpl-double v4, v6, v10

    .line 103
    .line 104
    if-ltz v4, :cond_2

    .line 105
    move-object v2, v14

    .line 106
    .line 107
    :cond_2
    :goto_0
    iget v4, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 108
    .line 109
    iput v4, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 110
    .line 111
    iget v4, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 112
    .line 113
    iput v4, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 114
    .line 115
    iget v4, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 116
    .line 117
    iput v4, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 121
    move-result v2

    .line 122
    .line 123
    if-eqz v2, :cond_5

    .line 124
    const/4 v0, 0x1

    .line 125
    .line 126
    if-eq v2, v0, :cond_4

    .line 127
    const/4 v0, 0x2

    .line 128
    .line 129
    if-eq v2, v0, :cond_3

    .line 130
    goto :goto_1

    .line 131
    .line 132
    :cond_3
    iget v0, v3, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;->cutLocation:I

    .line 133
    .line 134
    iput v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 135
    .line 136
    iget v2, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 137
    .line 138
    iput v2, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 139
    .line 140
    iget v2, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 141
    .line 142
    iput v2, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 143
    .line 144
    iput v0, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 145
    goto :goto_1

    .line 146
    .line 147
    :cond_4
    iget v0, v13, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;->cutLocation:I

    .line 148
    .line 149
    iput v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 150
    .line 151
    iget v2, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 152
    .line 153
    iput v2, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 154
    .line 155
    iput v0, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 156
    .line 157
    iget v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 158
    .line 159
    iput v0, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 160
    goto :goto_1

    .line 161
    .line 162
    :cond_5
    iget v0, v8, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;->cutLocation:I

    .line 163
    .line 164
    iput v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 165
    .line 166
    iput v0, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 167
    .line 168
    iget v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 169
    .line 170
    iput v0, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 171
    .line 172
    iget v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 173
    .line 174
    iput v0, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 175
    .line 176
    :goto_1
    iget v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 177
    .line 178
    iget v2, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 179
    sub-int/2addr v0, v2

    .line 180
    .line 181
    iget v2, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 182
    .line 183
    iget v3, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 184
    sub-int/2addr v2, v3

    .line 185
    mul-int/2addr v0, v2

    .line 186
    .line 187
    iget v2, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 188
    .line 189
    iget v3, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 190
    sub-int/2addr v2, v3

    .line 191
    mul-int/2addr v0, v2

    .line 192
    .line 193
    iput v0, v1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->vol:I

    .line 194
    .line 195
    iget v0, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 196
    .line 197
    iget v1, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 198
    sub-int/2addr v0, v1

    .line 199
    .line 200
    iget v1, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 201
    .line 202
    iget v2, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 203
    sub-int/2addr v1, v2

    .line 204
    mul-int/2addr v0, v1

    .line 205
    .line 206
    iget v1, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 207
    .line 208
    iget v2, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 209
    sub-int/2addr v1, v2

    .line 210
    mul-int/2addr v0, v1

    .line 211
    .line 212
    iput v0, v9, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->vol:I

    .line 213
    .line 214
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 215
    return-object v0
.end method

.method public maximize(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;IIIIII)Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    iget-object v3, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2, v3}, Lcom/google/android/material/color/utilities/QuantizerWu;->bottom(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;[I)I

    .line 12
    move-result v3

    .line 13
    .line 14
    iget-object v4, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v4}, Lcom/google/android/material/color/utilities/QuantizerWu;->bottom(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;[I)I

    .line 18
    move-result v4

    .line 19
    .line 20
    iget-object v5, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2, v5}, Lcom/google/android/material/color/utilities/QuantizerWu;->bottom(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;[I)I

    .line 24
    move-result v5

    .line 25
    .line 26
    iget-object v6, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2, v6}, Lcom/google/android/material/color/utilities/QuantizerWu;->bottom(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;[I)I

    .line 30
    move-result v6

    .line 31
    .line 32
    const-wide/16 v7, 0x0

    .line 33
    const/4 v9, -0x1

    .line 34
    .line 35
    move/from16 v11, p4

    .line 36
    move v10, v9

    .line 37
    move-wide v8, v7

    .line 38
    .line 39
    move/from16 v7, p3

    .line 40
    .line 41
    :goto_0
    if-ge v7, v11, :cond_3

    .line 42
    .line 43
    iget-object v12, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2, v7, v12}, Lcom/google/android/material/color/utilities/QuantizerWu;->top(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;I[I)I

    .line 47
    move-result v12

    .line 48
    add-int/2addr v12, v3

    .line 49
    .line 50
    iget-object v13, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2, v7, v13}, Lcom/google/android/material/color/utilities/QuantizerWu;->top(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;I[I)I

    .line 54
    move-result v13

    .line 55
    add-int/2addr v13, v4

    .line 56
    .line 57
    iget-object v14, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2, v7, v14}, Lcom/google/android/material/color/utilities/QuantizerWu;->top(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;I[I)I

    .line 61
    move-result v14

    .line 62
    add-int/2addr v14, v5

    .line 63
    .line 64
    iget-object v15, v0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2, v7, v15}, Lcom/google/android/material/color/utilities/QuantizerWu;->top(Lcom/google/android/material/color/utilities/QuantizerWu$Box;Lcom/google/android/material/color/utilities/QuantizerWu$Direction;I[I)I

    .line 68
    move-result v15

    .line 69
    add-int/2addr v15, v6

    .line 70
    .line 71
    if-nez v15, :cond_0

    .line 72
    goto :goto_1

    .line 73
    .line 74
    :cond_0
    mul-int v16, v12, v12

    .line 75
    .line 76
    mul-int v17, v13, v13

    .line 77
    .line 78
    add-int v16, v16, v17

    .line 79
    .line 80
    mul-int v17, v14, v14

    .line 81
    .line 82
    add-int v0, v16, v17

    .line 83
    int-to-double v0, v0

    .line 84
    .line 85
    move-wide/from16 v16, v0

    .line 86
    int-to-double v0, v15

    .line 87
    .line 88
    div-double v0, v16, v0

    .line 89
    .line 90
    sub-int v12, p5, v12

    .line 91
    .line 92
    sub-int v13, p6, v13

    .line 93
    .line 94
    sub-int v14, p7, v14

    .line 95
    .line 96
    sub-int v15, p8, v15

    .line 97
    .line 98
    if-nez v15, :cond_1

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    mul-int/2addr v12, v12

    .line 101
    mul-int/2addr v13, v13

    .line 102
    add-int/2addr v12, v13

    .line 103
    mul-int/2addr v14, v14

    .line 104
    add-int/2addr v12, v14

    .line 105
    int-to-double v12, v12

    .line 106
    int-to-double v14, v15

    .line 107
    div-double/2addr v12, v14

    .line 108
    add-double/2addr v0, v12

    .line 109
    .line 110
    cmpl-double v12, v0, v8

    .line 111
    .line 112
    if-lez v12, :cond_2

    .line 113
    move-wide v8, v0

    .line 114
    move v10, v7

    .line 115
    .line 116
    :cond_2
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 117
    .line 118
    move-object/from16 v0, p0

    .line 119
    .line 120
    move-object/from16 v1, p1

    .line 121
    goto :goto_0

    .line 122
    .line 123
    :cond_3
    new-instance v0, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v10, v8, v9}, Lcom/google/android/material/color/utilities/QuantizerWu$MaximizeResult;-><init>(ID)V

    .line 127
    return-object v0
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
.end method

.method public quantize([II)Lcom/google/android/material/color/utilities/QuantizerResult;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/QuantizerMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/QuantizerMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/google/android/material/color/utilities/QuantizerMap;->quantize([II)Lcom/google/android/material/color/utilities/QuantizerResult;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iget-object p1, p1, Lcom/google/android/material/color/utilities/QuantizerResult;->colorToCount:Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/google/android/material/color/utilities/QuantizerWu;->constructHistogram(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/QuantizerWu;->createMoments()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p2}, Lcom/google/android/material/color/utilities/QuantizerWu;->createBoxes(I)Lcom/google/android/material/color/utilities/QuantizerWu$CreateBoxesResult;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iget p1, p1, Lcom/google/android/material/color/utilities/QuantizerWu$CreateBoxesResult;->resultCount:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/google/android/material/color/utilities/QuantizerWu;->createResult(I)Ljava/util/List;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    .line 32
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 52
    const/4 v1, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_0
    new-instance p1, Lcom/google/android/material/color/utilities/QuantizerResult;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, p2}, Lcom/google/android/material/color/utilities/QuantizerResult;-><init>(Ljava/util/Map;)V

    .line 66
    return-object p1
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

.method public variance(Lcom/google/android/material/color/utilities/QuantizerWu$Box;)D
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsR:[I

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsG:[I

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 12
    move-result v1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->momentsB:[I

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v2}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 18
    move-result v2

    .line 19
    .line 20
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 21
    .line 22
    iget v4, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 23
    .line 24
    iget v5, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 25
    .line 26
    iget v6, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v5, v6}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 30
    move-result v4

    .line 31
    .line 32
    aget-wide v4, v3, v4

    .line 33
    .line 34
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 35
    .line 36
    iget v6, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 37
    .line 38
    iget v7, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 39
    .line 40
    iget v8, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 41
    .line 42
    .line 43
    invoke-static {v6, v7, v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 44
    move-result v6

    .line 45
    .line 46
    aget-wide v6, v3, v6

    .line 47
    sub-double/2addr v4, v6

    .line 48
    .line 49
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 50
    .line 51
    iget v6, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 52
    .line 53
    iget v7, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 54
    .line 55
    iget v8, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 56
    .line 57
    .line 58
    invoke-static {v6, v7, v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 59
    move-result v6

    .line 60
    .line 61
    aget-wide v6, v3, v6

    .line 62
    sub-double/2addr v4, v6

    .line 63
    .line 64
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 65
    .line 66
    iget v6, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r1:I

    .line 67
    .line 68
    iget v7, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 69
    .line 70
    iget v8, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 71
    .line 72
    .line 73
    invoke-static {v6, v7, v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 74
    move-result v6

    .line 75
    .line 76
    aget-wide v6, v3, v6

    .line 77
    add-double/2addr v4, v6

    .line 78
    .line 79
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 80
    .line 81
    iget v6, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 82
    .line 83
    iget v7, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 84
    .line 85
    iget v8, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 86
    .line 87
    .line 88
    invoke-static {v6, v7, v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 89
    move-result v6

    .line 90
    .line 91
    aget-wide v6, v3, v6

    .line 92
    sub-double/2addr v4, v6

    .line 93
    .line 94
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 95
    .line 96
    iget v6, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 97
    .line 98
    iget v7, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g1:I

    .line 99
    .line 100
    iget v8, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 101
    .line 102
    .line 103
    invoke-static {v6, v7, v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 104
    move-result v6

    .line 105
    .line 106
    aget-wide v6, v3, v6

    .line 107
    add-double/2addr v4, v6

    .line 108
    .line 109
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 110
    .line 111
    iget v6, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 112
    .line 113
    iget v7, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 114
    .line 115
    iget v8, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b1:I

    .line 116
    .line 117
    .line 118
    invoke-static {v6, v7, v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 119
    move-result v6

    .line 120
    .line 121
    aget-wide v6, v3, v6

    .line 122
    add-double/2addr v4, v6

    .line 123
    .line 124
    iget-object v3, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->moments:[D

    .line 125
    .line 126
    iget v6, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->r0:I

    .line 127
    .line 128
    iget v7, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->g0:I

    .line 129
    .line 130
    iget v8, p1, Lcom/google/android/material/color/utilities/QuantizerWu$Box;->b0:I

    .line 131
    .line 132
    .line 133
    invoke-static {v6, v7, v8}, Lcom/google/android/material/color/utilities/QuantizerWu;->getIndex(III)I

    .line 134
    move-result v6

    .line 135
    .line 136
    aget-wide v6, v3, v6

    .line 137
    sub-double/2addr v4, v6

    .line 138
    mul-int/2addr v0, v0

    .line 139
    mul-int/2addr v1, v1

    .line 140
    add-int/2addr v0, v1

    .line 141
    mul-int/2addr v2, v2

    .line 142
    add-int/2addr v0, v2

    .line 143
    .line 144
    iget-object v1, p0, Lcom/google/android/material/color/utilities/QuantizerWu;->weights:[I

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v1}, Lcom/google/android/material/color/utilities/QuantizerWu;->volume(Lcom/google/android/material/color/utilities/QuantizerWu$Box;[I)I

    .line 148
    move-result p1

    .line 149
    int-to-double v0, v0

    .line 150
    int-to-double v2, p1

    .line 151
    div-double/2addr v0, v2

    .line 152
    sub-double/2addr v4, v0

    .line 153
    return-wide v4
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
