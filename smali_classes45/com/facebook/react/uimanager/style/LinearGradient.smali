.class public final Lcom/facebook/react/uimanager/style/LinearGradient;
.super Ljava/lang/Object;
.source "LinearGradient.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/LinearGradient$Direction;,
        Lcom/facebook/react/uimanager/style/LinearGradient$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0012H\u0002J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/LinearGradient;",
        "",
        "directionMap",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "colors",
        "",
        "positions",
        "",
        "<init>",
        "(Lcom/facebook/react/bridge/ReadableMap;[I[F)V",
        "direction",
        "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;",
        "getShader",
        "Landroid/graphics/Shader;",
        "width",
        "",
        "height",
        "getAngleForKeyword",
        "",
        "keyword",
        "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;",
        "endPointsFromAngle",
        "Lkotlin/Pair;",
        "angle",
        "Direction",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final colors:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final direction:Lcom/facebook/react/uimanager/style/LinearGradient$Direction;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final positions:[F
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;[I[F)V
    .locals 1
    .param p1    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "directionMap"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "colors"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "positions"

    .line 14
    .line 15
    .line 16
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    iput-object p2, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->colors:[I

    .line 22
    .line 23
    iput-object p3, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->positions:[F

    .line 24
    .line 25
    .line 26
    const-string/jumbo p2, "type"

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    const-string p3, "angle"

    .line 33
    .line 34
    .line 35
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    move-result p3

    .line 37
    .line 38
    .line 39
    const-string/jumbo v0, "value"

    .line 40
    .line 41
    if-eqz p3, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 45
    move-result-wide p1

    .line 46
    .line 47
    new-instance p3, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;

    .line 48
    .line 49
    .line 50
    invoke-direct {p3, p1, p2}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;-><init>(D)V

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :cond_0
    const-string p3, "keyword"

    .line 54
    .line 55
    .line 56
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    move-result p3

    .line 58
    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    if-eqz p2, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 69
    move-result p3

    .line 70
    .line 71
    .line 72
    sparse-switch p3, :sswitch_data_0

    .line 73
    goto :goto_2

    .line 74
    .line 75
    .line 76
    :sswitch_0
    const-string/jumbo p3, "to top right"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    move-result p2

    .line 81
    .line 82
    if-eqz p2, :cond_1

    .line 83
    .line 84
    sget-object p1, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;->TO_TOP_RIGHT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;

    .line 85
    goto :goto_0

    .line 86
    .line 87
    .line 88
    :sswitch_1
    const-string/jumbo p3, "to top left"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    move-result p2

    .line 93
    .line 94
    if-eqz p2, :cond_1

    .line 95
    .line 96
    sget-object p1, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;->TO_TOP_LEFT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;

    .line 97
    goto :goto_0

    .line 98
    .line 99
    .line 100
    :sswitch_2
    const-string/jumbo p3, "to bottom right"

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    move-result p2

    .line 105
    .line 106
    if-eqz p2, :cond_1

    .line 107
    .line 108
    sget-object p1, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;->TO_BOTTOM_RIGHT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;

    .line 109
    goto :goto_0

    .line 110
    .line 111
    .line 112
    :sswitch_3
    const-string/jumbo p3, "to bottom left"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    move-result p2

    .line 117
    .line 118
    if-eqz p2, :cond_1

    .line 119
    .line 120
    sget-object p1, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;->TO_BOTTOM_LEFT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;

    .line 121
    .line 122
    :goto_0
    new-instance p3, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;

    .line 123
    .line 124
    .line 125
    invoke-direct {p3, p1}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;-><init>(Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;)V

    .line 126
    .line 127
    :goto_1
    iput-object p3, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->direction:Lcom/facebook/react/uimanager/style/LinearGradient$Direction;

    .line 128
    return-void

    .line 129
    .line 130
    :cond_1
    :goto_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    .line 133
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    new-instance p3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    const-string v0, "Invalid linear gradient direction keyword: "

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    .line 154
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    throw p2

    .line 156
    .line 157
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 158
    .line 159
    new-instance p3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    const-string v0, "Invalid direction type: "

    .line 165
    .line 166
    .line 167
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    move-result-object p2

    .line 175
    .line 176
    .line 177
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 178
    throw p1

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
    :sswitch_data_0
    .sparse-switch
        -0x6e438d49 -> :sswitch_3
        -0x59d7ba94 -> :sswitch_2
        -0x5108b809 -> :sswitch_1
        0x3048182c -> :sswitch_0
    .end sparse-switch
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

.method private final endPointsFromAngle(DFF)Lkotlin/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DFF)",
            "Lkotlin/Pair<",
            "[F[F>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    .line 5
    const/16 v3, 0x168

    .line 6
    int-to-double v3, v3

    .line 7
    rem-double/2addr p1, v3

    .line 8
    .line 9
    const-wide/16 v5, 0x0

    .line 10
    .line 11
    cmpg-double v7, p1, v5

    .line 12
    .line 13
    if-gez v7, :cond_0

    .line 14
    add-double/2addr p1, v3

    .line 15
    .line 16
    :cond_0
    cmpg-double v3, p1, v5

    .line 17
    const/4 v4, 0x0

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    new-instance p1, Lkotlin/Pair;

    .line 22
    .line 23
    new-array p2, v2, [F

    .line 24
    .line 25
    aput v4, p2, v1

    .line 26
    .line 27
    aput p3, p2, v0

    .line 28
    .line 29
    new-array p3, v2, [F

    .line 30
    .line 31
    .line 32
    fill-array-data p3, :array_0

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    return-object p1

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    :cond_1
    const-wide v5, 0x4056800000000000L    # 90.0

    .line 42
    .line 43
    cmpg-double v3, p1, v5

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    new-instance p1, Lkotlin/Pair;

    .line 48
    .line 49
    new-array p2, v2, [F

    .line 50
    .line 51
    .line 52
    fill-array-data p2, :array_1

    .line 53
    .line 54
    new-array p3, v2, [F

    .line 55
    .line 56
    aput p4, p3, v1

    .line 57
    .line 58
    aput v4, p3, v0

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    return-object p1

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    :cond_2
    const-wide v5, 0x4066800000000000L    # 180.0

    .line 68
    .line 69
    cmpg-double v5, p1, v5

    .line 70
    .line 71
    if-nez v5, :cond_3

    .line 72
    .line 73
    new-instance p1, Lkotlin/Pair;

    .line 74
    .line 75
    new-array p2, v2, [F

    .line 76
    .line 77
    .line 78
    fill-array-data p2, :array_2

    .line 79
    .line 80
    new-array p4, v2, [F

    .line 81
    .line 82
    aput v4, p4, v1

    .line 83
    .line 84
    aput p3, p4, v0

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, p2, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    return-object p1

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    :cond_3
    const-wide v6, 0x4070e00000000000L    # 270.0

    .line 94
    .line 95
    cmpg-double v6, p1, v6

    .line 96
    .line 97
    if-nez v6, :cond_4

    .line 98
    .line 99
    new-instance p1, Lkotlin/Pair;

    .line 100
    .line 101
    new-array p2, v2, [F

    .line 102
    .line 103
    aput p4, p2, v1

    .line 104
    .line 105
    aput v4, p2, v0

    .line 106
    .line 107
    new-array p3, v2, [F

    .line 108
    .line 109
    .line 110
    fill-array-data p3, :array_3

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    return-object p1

    .line 115
    .line 116
    :cond_4
    const/16 v4, 0x5a

    .line 117
    int-to-double v7, v4

    .line 118
    sub-double/2addr v7, p1

    .line 119
    .line 120
    .line 121
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 122
    move-result-wide p1

    .line 123
    .line 124
    .line 125
    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    .line 126
    move-result-wide p1

    .line 127
    double-to-float p1, p1

    .line 128
    const/4 p2, -0x1

    .line 129
    int-to-float p2, p2

    .line 130
    div-float/2addr p2, p1

    .line 131
    int-to-float v4, v2

    .line 132
    div-float/2addr p3, v4

    .line 133
    div-float/2addr p4, v4

    .line 134
    .line 135
    if-gez v3, :cond_5

    .line 136
    .line 137
    new-array v3, v2, [F

    .line 138
    .line 139
    aput p4, v3, v1

    .line 140
    .line 141
    aput p3, v3, v0

    .line 142
    goto :goto_0

    .line 143
    .line 144
    :cond_5
    if-gez v5, :cond_6

    .line 145
    .line 146
    new-array v3, v2, [F

    .line 147
    .line 148
    aput p4, v3, v1

    .line 149
    neg-float v4, p3

    .line 150
    .line 151
    aput v4, v3, v0

    .line 152
    goto :goto_0

    .line 153
    .line 154
    :cond_6
    if-gez v6, :cond_7

    .line 155
    .line 156
    new-array v3, v2, [F

    .line 157
    neg-float v4, p4

    .line 158
    .line 159
    aput v4, v3, v1

    .line 160
    neg-float v4, p3

    .line 161
    .line 162
    aput v4, v3, v0

    .line 163
    goto :goto_0

    .line 164
    .line 165
    :cond_7
    new-array v3, v2, [F

    .line 166
    neg-float v4, p4

    .line 167
    .line 168
    aput v4, v3, v1

    .line 169
    .line 170
    aput p3, v3, v0

    .line 171
    .line 172
    :goto_0
    aget v4, v3, v0

    .line 173
    .line 174
    aget v3, v3, v1

    .line 175
    mul-float/2addr v3, p2

    .line 176
    sub-float/2addr v4, v3

    .line 177
    sub-float/2addr p1, p2

    .line 178
    .line 179
    div-float p1, v4, p1

    .line 180
    mul-float/2addr p2, p1

    .line 181
    add-float/2addr p2, v4

    .line 182
    .line 183
    add-float v3, p4, p1

    .line 184
    .line 185
    sub-float v4, p3, p2

    .line 186
    .line 187
    new-array v5, v2, [F

    .line 188
    .line 189
    aput v3, v5, v1

    .line 190
    .line 191
    aput v4, v5, v0

    .line 192
    sub-float/2addr p4, p1

    .line 193
    add-float/2addr p3, p2

    .line 194
    .line 195
    new-array p1, v2, [F

    .line 196
    .line 197
    aput p4, p1, v1

    .line 198
    .line 199
    aput p3, p1, v0

    .line 200
    .line 201
    new-instance p2, Lkotlin/Pair;

    .line 202
    .line 203
    .line 204
    invoke-direct {p2, p1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    return-object p2

    .line 206
    nop

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    :array_2
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data
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

.method private final getAngleForKeyword(Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;DD)D
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    const/16 v1, 0x5a

    .line 12
    .line 13
    if-eq p1, v0, :cond_3

    .line 14
    const/4 v0, 0x2

    .line 15
    .line 16
    if-eq p1, v0, :cond_2

    .line 17
    const/4 v0, 0x3

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    const/4 v0, 0x4

    .line 21
    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    div-double/2addr p4, p2

    .line 24
    .line 25
    .line 26
    invoke-static {p4, p5}, Ljava/lang/Math;->atan(D)D

    .line 27
    move-result-wide p1

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 31
    move-result-wide p1

    .line 32
    .line 33
    const/16 p3, 0xb4

    .line 34
    :goto_0
    int-to-double p3, p3

    .line 35
    :goto_1
    add-double/2addr p1, p3

    .line 36
    return-wide p1

    .line 37
    .line 38
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 39
    .line 40
    .line 41
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 42
    throw p1

    .line 43
    :cond_1
    div-double/2addr p2, p4

    .line 44
    .line 45
    .line 46
    invoke-static {p2, p3}, Ljava/lang/Math;->atan(D)D

    .line 47
    move-result-wide p1

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 51
    move-result-wide p1

    .line 52
    .line 53
    const/16 p3, 0x10e

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    div-double/2addr p2, p4

    .line 56
    .line 57
    .line 58
    invoke-static {p2, p3}, Ljava/lang/Math;->atan(D)D

    .line 59
    move-result-wide p1

    .line 60
    .line 61
    .line 62
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 63
    move-result-wide p1

    .line 64
    int-to-double p3, v1

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    div-double/2addr p2, p4

    .line 67
    .line 68
    .line 69
    invoke-static {p2, p3}, Ljava/lang/Math;->atan(D)D

    .line 70
    move-result-wide p1

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 74
    move-result-wide p1

    .line 75
    int-to-double p3, v1

    .line 76
    sub-double/2addr p3, p1

    .line 77
    return-wide p3
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


# virtual methods
.method public final getShader(FF)Landroid/graphics/Shader;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->direction:Lcom/facebook/react/uimanager/style/LinearGradient$Direction;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;->getValue()D

    .line 12
    move-result-wide v0

    .line 13
    move-wide v2, v0

    .line 14
    move-object v1, p0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    instance-of v1, v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;->getValue()Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;

    .line 25
    move-result-object v2

    .line 26
    float-to-double v3, p1

    .line 27
    float-to-double v5, p2

    .line 28
    move-object v1, p0

    .line 29
    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/uimanager/style/LinearGradient;->getAngleForKeyword(Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keywords;DD)D

    .line 32
    move-result-wide v2

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-direct {p0, v2, v3, p2, p1}, Lcom/facebook/react/uimanager/style/LinearGradient;->endPointsFromAngle(DFF)Lkotlin/Pair;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 40
    move-result-object p2

    .line 41
    .line 42
    check-cast p2, [F

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    check-cast p1, [F

    .line 49
    .line 50
    new-instance v2, Landroid/graphics/LinearGradient;

    .line 51
    const/4 v0, 0x0

    .line 52
    .line 53
    aget v3, p2, v0

    .line 54
    const/4 v4, 0x1

    .line 55
    .line 56
    aget p2, p2, v4

    .line 57
    .line 58
    aget v5, p1, v0

    .line 59
    .line 60
    aget v6, p1, v4

    .line 61
    .line 62
    iget-object v7, v1, Lcom/facebook/react/uimanager/style/LinearGradient;->colors:[I

    .line 63
    .line 64
    iget-object v8, v1, Lcom/facebook/react/uimanager/style/LinearGradient;->positions:[F

    .line 65
    .line 66
    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 67
    move v4, p2

    .line 68
    .line 69
    .line 70
    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 71
    return-object v2

    .line 72
    :cond_1
    move-object v1, p0

    .line 73
    .line 74
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 75
    .line 76
    .line 77
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 78
    throw p1
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
