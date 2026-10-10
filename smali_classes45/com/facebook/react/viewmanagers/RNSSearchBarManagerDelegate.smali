.class public Lcom/facebook/react/viewmanagers/RNSSearchBarManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSSearchBarManagerDelegate.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U:",
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "TT;+",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        ">;:",
        "Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface<",
        "TT;>;>",
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate<",
        "TT;TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

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
.end method


# virtual methods
.method public receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3
    .param p3    # Lcom/facebook/react/bridge/ReadableArray;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ReadableArray;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 9
    move-result v2

    .line 10
    .line 11
    .line 12
    sparse-switch v2, :sswitch_data_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :sswitch_0
    const-string/jumbo v2, "setText"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result p2

    .line 21
    .line 22
    if-nez p2, :cond_0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x5

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :sswitch_1
    const-string v2, "focus"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    move-result p2

    .line 32
    .line 33
    if-nez p2, :cond_1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v1, 0x4

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :sswitch_2
    const-string v2, "blur"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result p2

    .line 43
    .line 44
    if-nez p2, :cond_2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v1, 0x3

    .line 47
    goto :goto_0

    .line 48
    .line 49
    .line 50
    :sswitch_3
    const-string/jumbo v2, "toggleCancelButton"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    move-result p2

    .line 55
    .line 56
    if-nez p2, :cond_3

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    const/4 v1, 0x2

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :sswitch_4
    const-string v2, "clearText"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result p2

    .line 66
    .line 67
    if-nez p2, :cond_4

    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const/4 v1, 0x1

    .line 70
    goto :goto_0

    .line 71
    .line 72
    :sswitch_5
    const-string v2, "cancelSearch"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    move-result p2

    .line 77
    .line 78
    if-nez p2, :cond_5

    .line 79
    goto :goto_0

    .line 80
    :cond_5
    move v1, v0

    .line 81
    .line 82
    .line 83
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 84
    return-void

    .line 85
    .line 86
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 87
    .line 88
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 89
    .line 90
    .line 91
    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 92
    move-result-object p3

    .line 93
    .line 94
    .line 95
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setText(Landroid/view/View;Ljava/lang/String;)V

    .line 96
    return-void

    .line 97
    .line 98
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 99
    .line 100
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 101
    .line 102
    .line 103
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->focus(Landroid/view/View;)V

    .line 104
    return-void

    .line 105
    .line 106
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 107
    .line 108
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 109
    .line 110
    .line 111
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->blur(Landroid/view/View;)V

    .line 112
    return-void

    .line 113
    .line 114
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 115
    .line 116
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 117
    .line 118
    .line 119
    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    .line 120
    move-result p3

    .line 121
    .line 122
    .line 123
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->toggleCancelButton(Landroid/view/View;Z)V

    .line 124
    return-void

    .line 125
    .line 126
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 127
    .line 128
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 129
    .line 130
    .line 131
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->clearText(Landroid/view/View;)V

    .line 132
    return-void

    .line 133
    .line 134
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 135
    .line 136
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 137
    .line 138
    .line 139
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->cancelSearch(Landroid/view/View;)V

    .line 140
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x6d48c33e -> :sswitch_5
        -0x4bc07ee6 -> :sswitch_4
        -0x27995040 -> :sswitch_3
        0x2e3067 -> :sswitch_2
        0x5d154d8 -> :sswitch_1
        0x765074af -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 5
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, -0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v4

    .line 12
    .line 13
    .line 14
    sparse-switch v4, :sswitch_data_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    .line 19
    :sswitch_0
    const-string/jumbo v4, "placement"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result v4

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    const/16 v3, 0xe

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :sswitch_1
    const-string v4, "inputType"

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result v4

    .line 38
    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_1
    const/16 v3, 0xd

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :sswitch_2
    const-string v4, "obscureBackground"

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    move-result v4

    .line 52
    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_2
    const/16 v3, 0xc

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    .line 62
    :sswitch_3
    const-string/jumbo v4, "tintColor"

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    move-result v4

    .line 67
    .line 68
    if-nez v4, :cond_3

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :cond_3
    const/16 v3, 0xb

    .line 73
    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    .line 77
    :sswitch_4
    const-string/jumbo v4, "placeholder"

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    move-result v4

    .line 82
    .line 83
    if-nez v4, :cond_4

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_4
    const/16 v3, 0xa

    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    .line 92
    :sswitch_5
    const-string/jumbo v4, "shouldShowHintSearchIcon"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    move-result v4

    .line 97
    .line 98
    if-nez v4, :cond_5

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :cond_5
    const/16 v3, 0x9

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :sswitch_6
    const-string v4, "disableBackButtonOverride"

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    move-result v4

    .line 111
    .line 112
    if-nez v4, :cond_6

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :cond_6
    const/16 v3, 0x8

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :sswitch_7
    const-string v4, "cancelButtonText"

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    move-result v4

    .line 125
    .line 126
    if-nez v4, :cond_7

    .line 127
    goto :goto_0

    .line 128
    :cond_7
    const/4 v3, 0x7

    .line 129
    goto :goto_0

    .line 130
    .line 131
    :sswitch_8
    const-string v4, "hideWhenScrolling"

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    move-result v4

    .line 136
    .line 137
    if-nez v4, :cond_8

    .line 138
    goto :goto_0

    .line 139
    :cond_8
    const/4 v3, 0x6

    .line 140
    goto :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v4, "hintTextColor"

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    move-result v4

    .line 147
    .line 148
    if-nez v4, :cond_9

    .line 149
    goto :goto_0

    .line 150
    :cond_9
    const/4 v3, 0x5

    .line 151
    goto :goto_0

    .line 152
    .line 153
    :sswitch_a
    const-string v4, "barTintColor"

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    move-result v4

    .line 158
    .line 159
    if-nez v4, :cond_a

    .line 160
    goto :goto_0

    .line 161
    :cond_a
    const/4 v3, 0x4

    .line 162
    goto :goto_0

    .line 163
    .line 164
    .line 165
    :sswitch_b
    const-string/jumbo v4, "textColor"

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    move-result v4

    .line 170
    .line 171
    if-nez v4, :cond_b

    .line 172
    goto :goto_0

    .line 173
    :cond_b
    const/4 v3, 0x3

    .line 174
    goto :goto_0

    .line 175
    .line 176
    :sswitch_c
    const-string v4, "autoCapitalize"

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    move-result v4

    .line 181
    .line 182
    if-nez v4, :cond_c

    .line 183
    goto :goto_0

    .line 184
    :cond_c
    const/4 v3, 0x2

    .line 185
    goto :goto_0

    .line 186
    .line 187
    :sswitch_d
    const-string v4, "headerIconColor"

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    move-result v4

    .line 192
    .line 193
    if-nez v4, :cond_d

    .line 194
    goto :goto_0

    .line 195
    :cond_d
    move v3, v0

    .line 196
    goto :goto_0

    .line 197
    .line 198
    :sswitch_e
    const-string v4, "hideNavigationBar"

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    move-result v4

    .line 203
    .line 204
    if-nez v4, :cond_e

    .line 205
    goto :goto_0

    .line 206
    :cond_e
    move v3, v2

    .line 207
    .line 208
    .line 209
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 210
    .line 211
    .line 212
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 213
    return-void

    .line 214
    .line 215
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 216
    .line 217
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 218
    .line 219
    check-cast p3, Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setPlacement(Landroid/view/View;Ljava/lang/String;)V

    .line 223
    return-void

    .line 224
    .line 225
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 226
    .line 227
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 228
    .line 229
    if-nez p3, :cond_f

    .line 230
    goto :goto_1

    .line 231
    :cond_f
    move-object v1, p3

    .line 232
    .line 233
    check-cast v1, Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    :goto_1
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setInputType(Landroid/view/View;Ljava/lang/String;)V

    .line 237
    return-void

    .line 238
    .line 239
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 240
    .line 241
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 242
    .line 243
    if-nez p3, :cond_10

    .line 244
    goto :goto_2

    .line 245
    .line 246
    :cond_10
    check-cast p3, Ljava/lang/Boolean;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 250
    move-result v2

    .line 251
    .line 252
    .line 253
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setObscureBackground(Landroid/view/View;Z)V

    .line 254
    return-void

    .line 255
    .line 256
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 257
    .line 258
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 262
    move-result-object v0

    .line 263
    .line 264
    .line 265
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 266
    move-result-object p3

    .line 267
    .line 268
    .line 269
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setTintColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 270
    return-void

    .line 271
    .line 272
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 273
    .line 274
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 275
    .line 276
    if-nez p3, :cond_11

    .line 277
    goto :goto_3

    .line 278
    :cond_11
    move-object v1, p3

    .line 279
    .line 280
    check-cast v1, Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    :goto_3
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setPlaceholder(Landroid/view/View;Ljava/lang/String;)V

    .line 284
    return-void

    .line 285
    .line 286
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 287
    .line 288
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 289
    .line 290
    if-nez p3, :cond_12

    .line 291
    goto :goto_4

    .line 292
    .line 293
    :cond_12
    check-cast p3, Ljava/lang/Boolean;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    move-result v0

    .line 298
    .line 299
    .line 300
    :goto_4
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setShouldShowHintSearchIcon(Landroid/view/View;Z)V

    .line 301
    return-void

    .line 302
    .line 303
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 304
    .line 305
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 306
    .line 307
    if-nez p3, :cond_13

    .line 308
    goto :goto_5

    .line 309
    .line 310
    :cond_13
    check-cast p3, Ljava/lang/Boolean;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    move-result v2

    .line 315
    .line 316
    .line 317
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setDisableBackButtonOverride(Landroid/view/View;Z)V

    .line 318
    return-void

    .line 319
    .line 320
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 321
    .line 322
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 323
    .line 324
    if-nez p3, :cond_14

    .line 325
    goto :goto_6

    .line 326
    :cond_14
    move-object v1, p3

    .line 327
    .line 328
    check-cast v1, Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    :goto_6
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setCancelButtonText(Landroid/view/View;Ljava/lang/String;)V

    .line 332
    return-void

    .line 333
    .line 334
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 335
    .line 336
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 337
    .line 338
    if-nez p3, :cond_15

    .line 339
    goto :goto_7

    .line 340
    .line 341
    :cond_15
    check-cast p3, Ljava/lang/Boolean;

    .line 342
    .line 343
    .line 344
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 345
    move-result v2

    .line 346
    .line 347
    .line 348
    :goto_7
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setHideWhenScrolling(Landroid/view/View;Z)V

    .line 349
    return-void

    .line 350
    .line 351
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 352
    .line 353
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 357
    move-result-object v0

    .line 358
    .line 359
    .line 360
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 361
    move-result-object p3

    .line 362
    .line 363
    .line 364
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setHintTextColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 365
    return-void

    .line 366
    .line 367
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 368
    .line 369
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 373
    move-result-object v0

    .line 374
    .line 375
    .line 376
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 377
    move-result-object p3

    .line 378
    .line 379
    .line 380
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setBarTintColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 381
    return-void

    .line 382
    .line 383
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 384
    .line 385
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 389
    move-result-object v0

    .line 390
    .line 391
    .line 392
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 393
    move-result-object p3

    .line 394
    .line 395
    .line 396
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setTextColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 397
    return-void

    .line 398
    .line 399
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 400
    .line 401
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 402
    .line 403
    check-cast p3, Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setAutoCapitalize(Landroid/view/View;Ljava/lang/String;)V

    .line 407
    return-void

    .line 408
    .line 409
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 410
    .line 411
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 415
    move-result-object v0

    .line 416
    .line 417
    .line 418
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 419
    move-result-object p3

    .line 420
    .line 421
    .line 422
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setHeaderIconColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 423
    return-void

    .line 424
    .line 425
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 426
    .line 427
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;

    .line 428
    .line 429
    if-nez p3, :cond_16

    .line 430
    goto :goto_8

    .line 431
    .line 432
    :cond_16
    check-cast p3, Ljava/lang/Boolean;

    .line 433
    .line 434
    .line 435
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 436
    move-result v2

    .line 437
    .line 438
    .line 439
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSSearchBarManagerInterface;->setHideNavigationBar(Landroid/view/View;Z)V

    .line 440
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x6084c0c3 -> :sswitch_e
        -0x575e4da3 -> :sswitch_d
        -0x4fd7d605 -> :sswitch_c
        -0x3f64d1ca -> :sswitch_b
        -0x140ee5ab -> :sswitch_a
        -0xf4f2891 -> :sswitch_9
        -0xb1efa47 -> :sswitch_8
        -0x8b94e67 -> :sswitch_7
        -0x6850513 -> :sswitch_6
        -0x2596c68 -> :sswitch_5
        0x23a88573 -> :sswitch_4
        0x4f219128 -> :sswitch_3
        0x5e763a33 -> :sswitch_2
        0x65be6624 -> :sswitch_1
        0x6ade12e5 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
