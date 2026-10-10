.class public Lcom/facebook/react/viewmanagers/RNCWebViewManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNCWebViewManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface<",
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
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v2, "injectJavaScript"

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
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v1, 0xa

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    .line 31
    :sswitch_1
    const-string/jumbo v2, "postMessage"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    move-result p2

    .line 36
    .line 37
    if-nez p2, :cond_1

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_1
    const/16 v1, 0x9

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    .line 46
    :sswitch_2
    const-string/jumbo v2, "requestFocus"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result p2

    .line 51
    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_2
    const/16 v1, 0x8

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :sswitch_3
    const-string v2, "clearHistory"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result p2

    .line 65
    .line 66
    if-nez p2, :cond_3

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/4 v1, 0x7

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :sswitch_4
    const-string v2, "loadUrl"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    move-result p2

    .line 76
    .line 77
    if-nez p2, :cond_4

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    const/4 v1, 0x6

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :sswitch_5
    const-string v2, "clearFormData"

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    move-result p2

    .line 87
    .line 88
    if-nez p2, :cond_5

    .line 89
    goto :goto_0

    .line 90
    :cond_5
    const/4 v1, 0x5

    .line 91
    goto :goto_0

    .line 92
    .line 93
    :sswitch_6
    const-string v2, "goForward"

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    move-result p2

    .line 98
    .line 99
    if-nez p2, :cond_6

    .line 100
    goto :goto_0

    .line 101
    :cond_6
    const/4 v1, 0x4

    .line 102
    goto :goto_0

    .line 103
    .line 104
    :sswitch_7
    const-string v2, "clearCache"

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    move-result p2

    .line 109
    .line 110
    if-nez p2, :cond_7

    .line 111
    goto :goto_0

    .line 112
    :cond_7
    const/4 v1, 0x3

    .line 113
    goto :goto_0

    .line 114
    .line 115
    .line 116
    :sswitch_8
    const-string/jumbo v2, "reload"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    move-result p2

    .line 121
    .line 122
    if-nez p2, :cond_8

    .line 123
    goto :goto_0

    .line 124
    :cond_8
    const/4 v1, 0x2

    .line 125
    goto :goto_0

    .line 126
    .line 127
    .line 128
    :sswitch_9
    const-string/jumbo v2, "stopLoading"

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    move-result p2

    .line 133
    .line 134
    if-nez p2, :cond_9

    .line 135
    goto :goto_0

    .line 136
    :cond_9
    const/4 v1, 0x1

    .line 137
    goto :goto_0

    .line 138
    .line 139
    :sswitch_a
    const-string v2, "goBack"

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    move-result p2

    .line 144
    .line 145
    if-nez p2, :cond_a

    .line 146
    goto :goto_0

    .line 147
    :cond_a
    move v1, v0

    .line 148
    .line 149
    .line 150
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 151
    return-void

    .line 152
    .line 153
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 154
    .line 155
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 156
    .line 157
    .line 158
    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 159
    move-result-object p3

    .line 160
    .line 161
    .line 162
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->injectJavaScript(Landroid/view/View;Ljava/lang/String;)V

    .line 163
    return-void

    .line 164
    .line 165
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 166
    .line 167
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 168
    .line 169
    .line 170
    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 171
    move-result-object p3

    .line 172
    .line 173
    .line 174
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->postMessage(Landroid/view/View;Ljava/lang/String;)V

    .line 175
    return-void

    .line 176
    .line 177
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 178
    .line 179
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 180
    .line 181
    .line 182
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->requestFocus(Landroid/view/View;)V

    .line 183
    return-void

    .line 184
    .line 185
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 186
    .line 187
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 188
    .line 189
    .line 190
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->clearHistory(Landroid/view/View;)V

    .line 191
    return-void

    .line 192
    .line 193
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 194
    .line 195
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 196
    .line 197
    .line 198
    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 199
    move-result-object p3

    .line 200
    .line 201
    .line 202
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->loadUrl(Landroid/view/View;Ljava/lang/String;)V

    .line 203
    return-void

    .line 204
    .line 205
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 206
    .line 207
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 208
    .line 209
    .line 210
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->clearFormData(Landroid/view/View;)V

    .line 211
    return-void

    .line 212
    .line 213
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 214
    .line 215
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 216
    .line 217
    .line 218
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->goForward(Landroid/view/View;)V

    .line 219
    return-void

    .line 220
    .line 221
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 222
    .line 223
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 224
    .line 225
    .line 226
    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    .line 227
    move-result p3

    .line 228
    .line 229
    .line 230
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->clearCache(Landroid/view/View;Z)V

    .line 231
    return-void

    .line 232
    .line 233
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 234
    .line 235
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 236
    .line 237
    .line 238
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->reload(Landroid/view/View;)V

    .line 239
    return-void

    .line 240
    .line 241
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 242
    .line 243
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 244
    .line 245
    .line 246
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->stopLoading(Landroid/view/View;)V

    .line 247
    return-void

    .line 248
    .line 249
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 250
    .line 251
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 252
    .line 253
    .line 254
    invoke-interface {p2, p1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->goBack(Landroid/view/View;)V

    .line 255
    return-void

    .line 256
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x4a012e11 -> :sswitch_a
        -0x38833526 -> :sswitch_9
        -0x37b57e67 -> :sswitch_8
        -0x2d410ecb -> :sswitch_7
        -0x12f8b743 -> :sswitch_6
        -0xfcc1405 -> :sswitch_5
        0x141096a9 -> :sswitch_4
        0x35d48587 -> :sswitch_3
        0x4c4bb389 -> :sswitch_2
        0x58d00b47 -> :sswitch_1
        0x7d7149fe -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 4
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
    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, -0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    sparse-switch v3, :sswitch_data_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :sswitch_0
    const-string v3, "contentInsetAdjustmentBehavior"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    const/16 v2, 0x4a

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :sswitch_1
    const-string v3, "decelerationRate"

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    move-result v3

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_1
    const/16 v2, 0x49

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    .line 46
    :sswitch_2
    const-string/jumbo v3, "scalesPageToFit"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result v3

    .line 51
    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_2
    const/16 v2, 0x48

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    .line 61
    :sswitch_3
    const-string/jumbo v3, "showsHorizontalScrollIndicator"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    move-result v3

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_3
    const/16 v2, 0x47

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    .line 76
    :sswitch_4
    const-string/jumbo v3, "suppressMenuItems"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    move-result v3

    .line 81
    .line 82
    if-nez v3, :cond_4

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :cond_4
    const/16 v2, 0x46

    .line 87
    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :sswitch_5
    const-string v3, "androidLayerType"

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v3

    .line 95
    .line 96
    if-nez v3, :cond_5

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :cond_5
    const/16 v2, 0x45

    .line 101
    .line 102
    goto/16 :goto_0

    .line 103
    .line 104
    :sswitch_6
    const-string v3, "autoManageStatusBarEnabled"

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    move-result v3

    .line 109
    .line 110
    if-nez v3, :cond_6

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :cond_6
    const/16 v2, 0x44

    .line 115
    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    .line 119
    :sswitch_7
    const-string/jumbo v3, "thirdPartyCookiesEnabled"

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    move-result v3

    .line 124
    .line 125
    if-nez v3, :cond_7

    .line 126
    .line 127
    goto/16 :goto_0

    .line 128
    .line 129
    :cond_7
    const/16 v2, 0x43

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :sswitch_8
    const-string v3, "mediaPlaybackRequiresUserAction"

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    move-result v3

    .line 138
    .line 139
    if-nez v3, :cond_8

    .line 140
    .line 141
    goto/16 :goto_0

    .line 142
    .line 143
    :cond_8
    const/16 v2, 0x42

    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :sswitch_9
    const-string v3, "enableApplePay"

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    move-result v3

    .line 152
    .line 153
    if-nez v3, :cond_9

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_9
    const/16 v2, 0x41

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :sswitch_a
    const-string v3, "basicAuthCredential"

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    move-result v3

    .line 166
    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_a
    const/16 v2, 0x40

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :sswitch_b
    const-string v3, "downloadingMessage"

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    move-result v3

    .line 180
    .line 181
    if-nez v3, :cond_b

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_b
    const/16 v2, 0x3f

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :sswitch_c
    const-string v3, "geolocationEnabled"

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    move-result v3

    .line 194
    .line 195
    if-nez v3, :cond_c

    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_c
    const/16 v2, 0x3e

    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :sswitch_d
    const-string v3, "fraudulentWebsiteWarningEnabled"

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    move-result v3

    .line 208
    .line 209
    if-nez v3, :cond_d

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_d
    const/16 v2, 0x3d

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    .line 218
    :sswitch_e
    const-string/jumbo v3, "refreshControlLightMode"

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    move-result v3

    .line 223
    .line 224
    if-nez v3, :cond_e

    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_e
    const/16 v2, 0x3c

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    .line 233
    :sswitch_f
    const-string/jumbo v3, "pullToRefreshEnabled"

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    move-result v3

    .line 238
    .line 239
    if-nez v3, :cond_f

    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_f
    const/16 v2, 0x3b

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    .line 248
    :sswitch_10
    const-string/jumbo v3, "setBuiltInZoomControls"

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    move-result v3

    .line 253
    .line 254
    if-nez v3, :cond_10

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_10
    const/16 v2, 0x3a

    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :sswitch_11
    const-string v3, "limitsNavigationsToAppBoundDomains"

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    move-result v3

    .line 267
    .line 268
    if-nez v3, :cond_11

    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_11
    const/16 v2, 0x39

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :sswitch_12
    const-string v3, "allowFileAccess"

    .line 277
    .line 278
    .line 279
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    move-result v3

    .line 281
    .line 282
    if-nez v3, :cond_12

    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_12
    const/16 v2, 0x38

    .line 287
    .line 288
    goto/16 :goto_0

    .line 289
    .line 290
    :sswitch_13
    const-string v3, "allowsAirPlayForMediaPlayback"

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    move-result v3

    .line 295
    .line 296
    if-nez v3, :cond_13

    .line 297
    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :cond_13
    const/16 v2, 0x37

    .line 301
    .line 302
    goto/16 :goto_0

    .line 303
    .line 304
    :sswitch_14
    const-string v3, "allowsBackForwardNavigationGestures"

    .line 305
    .line 306
    .line 307
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    move-result v3

    .line 309
    .line 310
    if-nez v3, :cond_14

    .line 311
    .line 312
    goto/16 :goto_0

    .line 313
    .line 314
    :cond_14
    const/16 v2, 0x36

    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :sswitch_15
    const-string v3, "contentInset"

    .line 319
    .line 320
    .line 321
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 322
    move-result v3

    .line 323
    .line 324
    if-nez v3, :cond_15

    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :cond_15
    const/16 v2, 0x35

    .line 329
    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :sswitch_16
    const-string v3, "mixedContentMode"

    .line 333
    .line 334
    .line 335
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    move-result v3

    .line 337
    .line 338
    if-nez v3, :cond_16

    .line 339
    .line 340
    goto/16 :goto_0

    .line 341
    .line 342
    :cond_16
    const/16 v2, 0x34

    .line 343
    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :sswitch_17
    const-string v3, "applicationNameForUserAgent"

    .line 347
    .line 348
    .line 349
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    move-result v3

    .line 351
    .line 352
    if-nez v3, :cond_17

    .line 353
    .line 354
    goto/16 :goto_0

    .line 355
    .line 356
    :cond_17
    const/16 v2, 0x33

    .line 357
    .line 358
    goto/16 :goto_0

    .line 359
    .line 360
    :sswitch_18
    const-string v3, "injectedJavaScriptObject"

    .line 361
    .line 362
    .line 363
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    move-result v3

    .line 365
    .line 366
    if-nez v3, :cond_18

    .line 367
    .line 368
    goto/16 :goto_0

    .line 369
    .line 370
    :cond_18
    const/16 v2, 0x32

    .line 371
    .line 372
    goto/16 :goto_0

    .line 373
    .line 374
    .line 375
    :sswitch_19
    const-string/jumbo v3, "webviewDebuggingEnabled"

    .line 376
    .line 377
    .line 378
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    move-result v3

    .line 380
    .line 381
    if-nez v3, :cond_19

    .line 382
    .line 383
    goto/16 :goto_0

    .line 384
    .line 385
    :cond_19
    const/16 v2, 0x31

    .line 386
    .line 387
    goto/16 :goto_0

    .line 388
    .line 389
    :sswitch_1a
    const-string v3, "injectedJavaScriptForMainFrameOnly"

    .line 390
    .line 391
    .line 392
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    move-result v3

    .line 394
    .line 395
    if-nez v3, :cond_1a

    .line 396
    .line 397
    goto/16 :goto_0

    .line 398
    .line 399
    :cond_1a
    const/16 v2, 0x30

    .line 400
    .line 401
    goto/16 :goto_0

    .line 402
    .line 403
    :sswitch_1b
    const-string v3, "cacheEnabled"

    .line 404
    .line 405
    .line 406
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    move-result v3

    .line 408
    .line 409
    if-nez v3, :cond_1b

    .line 410
    .line 411
    goto/16 :goto_0

    .line 412
    .line 413
    :cond_1b
    const/16 v2, 0x2f

    .line 414
    .line 415
    goto/16 :goto_0

    .line 416
    .line 417
    :sswitch_1c
    const-string v3, "allowsInlineMediaPlayback"

    .line 418
    .line 419
    .line 420
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    move-result v3

    .line 422
    .line 423
    if-nez v3, :cond_1c

    .line 424
    .line 425
    goto/16 :goto_0

    .line 426
    .line 427
    :cond_1c
    const/16 v2, 0x2e

    .line 428
    .line 429
    goto/16 :goto_0

    .line 430
    .line 431
    .line 432
    :sswitch_1d
    const-string/jumbo v3, "userAgent"

    .line 433
    .line 434
    .line 435
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    move-result v3

    .line 437
    .line 438
    if-nez v3, :cond_1d

    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :cond_1d
    const/16 v2, 0x2d

    .line 443
    .line 444
    goto/16 :goto_0

    .line 445
    .line 446
    :sswitch_1e
    const-string v3, "automaticallyAdjustContentInsets"

    .line 447
    .line 448
    .line 449
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    move-result v3

    .line 451
    .line 452
    if-nez v3, :cond_1e

    .line 453
    .line 454
    goto/16 :goto_0

    .line 455
    .line 456
    :cond_1e
    const/16 v2, 0x2c

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :sswitch_1f
    const-string v3, "injectedJavaScript"

    .line 461
    .line 462
    .line 463
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    move-result v3

    .line 465
    .line 466
    if-nez v3, :cond_1f

    .line 467
    .line 468
    goto/16 :goto_0

    .line 469
    .line 470
    :cond_1f
    const/16 v2, 0x2b

    .line 471
    .line 472
    goto/16 :goto_0

    .line 473
    .line 474
    :sswitch_20
    const-string v3, "lackPermissionToDownloadMessage"

    .line 475
    .line 476
    .line 477
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 478
    move-result v3

    .line 479
    .line 480
    if-nez v3, :cond_20

    .line 481
    .line 482
    goto/16 :goto_0

    .line 483
    .line 484
    :cond_20
    const/16 v2, 0x2a

    .line 485
    .line 486
    goto/16 :goto_0

    .line 487
    .line 488
    .line 489
    :sswitch_21
    const-string/jumbo v3, "setSupportMultipleWindows"

    .line 490
    .line 491
    .line 492
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 493
    move-result v3

    .line 494
    .line 495
    if-nez v3, :cond_21

    .line 496
    .line 497
    goto/16 :goto_0

    .line 498
    .line 499
    :cond_21
    const/16 v2, 0x29

    .line 500
    .line 501
    goto/16 :goto_0

    .line 502
    .line 503
    :sswitch_22
    const-string v3, "bounces"

    .line 504
    .line 505
    .line 506
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    move-result v3

    .line 508
    .line 509
    if-nez v3, :cond_22

    .line 510
    .line 511
    goto/16 :goto_0

    .line 512
    .line 513
    :cond_22
    const/16 v2, 0x28

    .line 514
    .line 515
    goto/16 :goto_0

    .line 516
    .line 517
    :sswitch_23
    const-string v3, "hasOnScroll"

    .line 518
    .line 519
    .line 520
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 521
    move-result v3

    .line 522
    .line 523
    if-nez v3, :cond_23

    .line 524
    .line 525
    goto/16 :goto_0

    .line 526
    .line 527
    :cond_23
    const/16 v2, 0x27

    .line 528
    .line 529
    goto/16 :goto_0

    .line 530
    .line 531
    :sswitch_24
    const-string v3, "injectedJavaScriptBeforeContentLoadedForMainFrameOnly"

    .line 532
    .line 533
    .line 534
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 535
    move-result v3

    .line 536
    .line 537
    if-nez v3, :cond_24

    .line 538
    .line 539
    goto/16 :goto_0

    .line 540
    .line 541
    :cond_24
    const/16 v2, 0x26

    .line 542
    .line 543
    goto/16 :goto_0

    .line 544
    .line 545
    :sswitch_25
    const-string v3, "nestedScrollEnabled"

    .line 546
    .line 547
    .line 548
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 549
    move-result v3

    .line 550
    .line 551
    if-nez v3, :cond_25

    .line 552
    .line 553
    goto/16 :goto_0

    .line 554
    .line 555
    :cond_25
    const/16 v2, 0x25

    .line 556
    .line 557
    goto/16 :goto_0

    .line 558
    .line 559
    :sswitch_26
    const-string v3, "allowsFullscreenVideo"

    .line 560
    .line 561
    .line 562
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 563
    move-result v3

    .line 564
    .line 565
    if-nez v3, :cond_26

    .line 566
    .line 567
    goto/16 :goto_0

    .line 568
    .line 569
    :cond_26
    const/16 v2, 0x24

    .line 570
    .line 571
    goto/16 :goto_0

    .line 572
    .line 573
    .line 574
    :sswitch_27
    const-string/jumbo v3, "setDisplayZoomControls"

    .line 575
    .line 576
    .line 577
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 578
    move-result v3

    .line 579
    .line 580
    if-nez v3, :cond_27

    .line 581
    .line 582
    goto/16 :goto_0

    .line 583
    .line 584
    :cond_27
    const/16 v2, 0x23

    .line 585
    .line 586
    goto/16 :goto_0

    .line 587
    .line 588
    :sswitch_28
    const-string v3, "javaScriptCanOpenWindowsAutomatically"

    .line 589
    .line 590
    .line 591
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 592
    move-result v3

    .line 593
    .line 594
    if-nez v3, :cond_28

    .line 595
    .line 596
    goto/16 :goto_0

    .line 597
    .line 598
    :cond_28
    const/16 v2, 0x22

    .line 599
    .line 600
    goto/16 :goto_0

    .line 601
    .line 602
    :sswitch_29
    const-string v3, "hasOnOpenWindowEvent"

    .line 603
    .line 604
    .line 605
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 606
    move-result v3

    .line 607
    .line 608
    if-nez v3, :cond_29

    .line 609
    .line 610
    goto/16 :goto_0

    .line 611
    .line 612
    :cond_29
    const/16 v2, 0x21

    .line 613
    .line 614
    goto/16 :goto_0

    .line 615
    .line 616
    :sswitch_2a
    const-string v3, "messagingModuleName"

    .line 617
    .line 618
    .line 619
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 620
    move-result v3

    .line 621
    .line 622
    if-nez v3, :cond_2a

    .line 623
    .line 624
    goto/16 :goto_0

    .line 625
    .line 626
    :cond_2a
    const/16 v2, 0x20

    .line 627
    .line 628
    goto/16 :goto_0

    .line 629
    .line 630
    :sswitch_2b
    const-string v3, "contentMode"

    .line 631
    .line 632
    .line 633
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 634
    move-result v3

    .line 635
    .line 636
    if-nez v3, :cond_2b

    .line 637
    .line 638
    goto/16 :goto_0

    .line 639
    .line 640
    :cond_2b
    const/16 v2, 0x1f

    .line 641
    .line 642
    goto/16 :goto_0

    .line 643
    .line 644
    :sswitch_2c
    const-string v3, "pagingEnabled"

    .line 645
    .line 646
    .line 647
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 648
    move-result v3

    .line 649
    .line 650
    if-nez v3, :cond_2c

    .line 651
    .line 652
    goto/16 :goto_0

    .line 653
    .line 654
    :cond_2c
    const/16 v2, 0x1e

    .line 655
    .line 656
    goto/16 :goto_0

    .line 657
    .line 658
    :sswitch_2d
    const-string v3, "cacheMode"

    .line 659
    .line 660
    .line 661
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 662
    move-result v3

    .line 663
    .line 664
    if-nez v3, :cond_2d

    .line 665
    .line 666
    goto/16 :goto_0

    .line 667
    .line 668
    :cond_2d
    const/16 v2, 0x1d

    .line 669
    .line 670
    goto/16 :goto_0

    .line 671
    .line 672
    :sswitch_2e
    const-string v3, "hasOnFileDownload"

    .line 673
    .line 674
    .line 675
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 676
    move-result v3

    .line 677
    .line 678
    if-nez v3, :cond_2e

    .line 679
    .line 680
    goto/16 :goto_0

    .line 681
    .line 682
    :cond_2e
    const/16 v2, 0x1c

    .line 683
    .line 684
    goto/16 :goto_0

    .line 685
    .line 686
    :sswitch_2f
    const-string v3, "newSource"

    .line 687
    .line 688
    .line 689
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 690
    move-result v3

    .line 691
    .line 692
    if-nez v3, :cond_2f

    .line 693
    .line 694
    goto/16 :goto_0

    .line 695
    .line 696
    :cond_2f
    const/16 v2, 0x1b

    .line 697
    .line 698
    goto/16 :goto_0

    .line 699
    .line 700
    :sswitch_30
    const-string v3, "mediaCapturePermissionGrantType"

    .line 701
    .line 702
    .line 703
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 704
    move-result v3

    .line 705
    .line 706
    if-nez v3, :cond_30

    .line 707
    .line 708
    goto/16 :goto_0

    .line 709
    .line 710
    :cond_30
    const/16 v2, 0x1a

    .line 711
    .line 712
    goto/16 :goto_0

    .line 713
    .line 714
    :sswitch_31
    const-string v3, "allowUniversalAccessFromFileURLs"

    .line 715
    .line 716
    .line 717
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 718
    move-result v3

    .line 719
    .line 720
    if-nez v3, :cond_31

    .line 721
    .line 722
    goto/16 :goto_0

    .line 723
    .line 724
    :cond_31
    const/16 v2, 0x19

    .line 725
    .line 726
    goto/16 :goto_0

    .line 727
    .line 728
    :sswitch_32
    const-string v3, "hideKeyboardAccessoryView"

    .line 729
    .line 730
    .line 731
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 732
    move-result v3

    .line 733
    .line 734
    if-nez v3, :cond_32

    .line 735
    .line 736
    goto/16 :goto_0

    .line 737
    .line 738
    :cond_32
    const/16 v2, 0x18

    .line 739
    .line 740
    goto/16 :goto_0

    .line 741
    .line 742
    :sswitch_33
    const-string v3, "minimumFontSize"

    .line 743
    .line 744
    .line 745
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 746
    move-result v3

    .line 747
    .line 748
    if-nez v3, :cond_33

    .line 749
    .line 750
    goto/16 :goto_0

    .line 751
    .line 752
    :cond_33
    const/16 v2, 0x17

    .line 753
    .line 754
    goto/16 :goto_0

    .line 755
    .line 756
    :sswitch_34
    const-string v3, "forceDarkOn"

    .line 757
    .line 758
    .line 759
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 760
    move-result v3

    .line 761
    .line 762
    if-nez v3, :cond_34

    .line 763
    .line 764
    goto/16 :goto_0

    .line 765
    .line 766
    :cond_34
    const/16 v2, 0x16

    .line 767
    .line 768
    goto/16 :goto_0

    .line 769
    .line 770
    .line 771
    :sswitch_35
    const-string/jumbo v3, "showsVerticalScrollIndicator"

    .line 772
    .line 773
    .line 774
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 775
    move-result v3

    .line 776
    .line 777
    if-nez v3, :cond_35

    .line 778
    .line 779
    goto/16 :goto_0

    .line 780
    .line 781
    :cond_35
    const/16 v2, 0x15

    .line 782
    .line 783
    goto/16 :goto_0

    .line 784
    .line 785
    .line 786
    :sswitch_36
    const-string/jumbo v3, "textZoom"

    .line 787
    .line 788
    .line 789
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 790
    move-result v3

    .line 791
    .line 792
    if-nez v3, :cond_36

    .line 793
    .line 794
    goto/16 :goto_0

    .line 795
    .line 796
    :cond_36
    const/16 v2, 0x14

    .line 797
    .line 798
    goto/16 :goto_0

    .line 799
    .line 800
    .line 801
    :sswitch_37
    const-string/jumbo v3, "useSharedProcessPool"

    .line 802
    .line 803
    .line 804
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 805
    move-result v3

    .line 806
    .line 807
    if-nez v3, :cond_37

    .line 808
    .line 809
    goto/16 :goto_0

    .line 810
    .line 811
    :cond_37
    const/16 v2, 0x13

    .line 812
    .line 813
    goto/16 :goto_0

    .line 814
    .line 815
    :sswitch_38
    const-string v3, "allowsLinkPreview"

    .line 816
    .line 817
    .line 818
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 819
    move-result v3

    .line 820
    .line 821
    if-nez v3, :cond_38

    .line 822
    .line 823
    goto/16 :goto_0

    .line 824
    .line 825
    :cond_38
    const/16 v2, 0x12

    .line 826
    .line 827
    goto/16 :goto_0

    .line 828
    .line 829
    :sswitch_39
    const-string v3, "domStorageEnabled"

    .line 830
    .line 831
    .line 832
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 833
    move-result v3

    .line 834
    .line 835
    if-nez v3, :cond_39

    .line 836
    .line 837
    goto/16 :goto_0

    .line 838
    .line 839
    :cond_39
    const/16 v2, 0x11

    .line 840
    .line 841
    goto/16 :goto_0

    .line 842
    .line 843
    :sswitch_3a
    const-string v3, "keyboardDisplayRequiresUserAction"

    .line 844
    .line 845
    .line 846
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 847
    move-result v3

    .line 848
    .line 849
    if-nez v3, :cond_3a

    .line 850
    .line 851
    goto/16 :goto_0

    .line 852
    .line 853
    :cond_3a
    const/16 v2, 0x10

    .line 854
    .line 855
    goto/16 :goto_0

    .line 856
    .line 857
    .line 858
    :sswitch_3b
    const-string/jumbo v3, "scrollEnabled"

    .line 859
    .line 860
    .line 861
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 862
    move-result v3

    .line 863
    .line 864
    if-nez v3, :cond_3b

    .line 865
    .line 866
    goto/16 :goto_0

    .line 867
    .line 868
    :cond_3b
    const/16 v2, 0xf

    .line 869
    .line 870
    goto/16 :goto_0

    .line 871
    .line 872
    :sswitch_3c
    const-string v3, "overScrollMode"

    .line 873
    .line 874
    .line 875
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 876
    move-result v3

    .line 877
    .line 878
    if-nez v3, :cond_3c

    .line 879
    .line 880
    goto/16 :goto_0

    .line 881
    .line 882
    :cond_3c
    const/16 v2, 0xe

    .line 883
    .line 884
    goto/16 :goto_0

    .line 885
    .line 886
    :sswitch_3d
    const-string v3, "allowingReadAccessToURL"

    .line 887
    .line 888
    .line 889
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 890
    move-result v3

    .line 891
    .line 892
    if-nez v3, :cond_3d

    .line 893
    .line 894
    goto/16 :goto_0

    .line 895
    .line 896
    :cond_3d
    const/16 v2, 0xd

    .line 897
    .line 898
    goto/16 :goto_0

    .line 899
    .line 900
    :sswitch_3e
    const-string v3, "incognito"

    .line 901
    .line 902
    .line 903
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 904
    move-result v3

    .line 905
    .line 906
    if-nez v3, :cond_3e

    .line 907
    .line 908
    goto/16 :goto_0

    .line 909
    .line 910
    :cond_3e
    const/16 v2, 0xc

    .line 911
    .line 912
    goto/16 :goto_0

    .line 913
    .line 914
    :sswitch_3f
    const-string v3, "menuItems"

    .line 915
    .line 916
    .line 917
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 918
    move-result v3

    .line 919
    .line 920
    if-nez v3, :cond_3f

    .line 921
    .line 922
    goto/16 :goto_0

    .line 923
    .line 924
    :cond_3f
    const/16 v2, 0xb

    .line 925
    .line 926
    goto/16 :goto_0

    .line 927
    .line 928
    :sswitch_40
    const-string v3, "dataDetectorTypes"

    .line 929
    .line 930
    .line 931
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 932
    move-result v3

    .line 933
    .line 934
    if-nez v3, :cond_40

    .line 935
    .line 936
    goto/16 :goto_0

    .line 937
    .line 938
    :cond_40
    const/16 v2, 0xa

    .line 939
    .line 940
    goto/16 :goto_0

    .line 941
    .line 942
    :sswitch_41
    const-string v3, "messagingEnabled"

    .line 943
    .line 944
    .line 945
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 946
    move-result v3

    .line 947
    .line 948
    if-nez v3, :cond_41

    .line 949
    .line 950
    goto/16 :goto_0

    .line 951
    .line 952
    :cond_41
    const/16 v2, 0x9

    .line 953
    .line 954
    goto/16 :goto_0

    .line 955
    .line 956
    :sswitch_42
    const-string v3, "javaScriptEnabled"

    .line 957
    .line 958
    .line 959
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 960
    move-result v3

    .line 961
    .line 962
    if-nez v3, :cond_42

    .line 963
    .line 964
    goto/16 :goto_0

    .line 965
    .line 966
    :cond_42
    const/16 v2, 0x8

    .line 967
    .line 968
    goto/16 :goto_0

    .line 969
    .line 970
    :sswitch_43
    const-string v3, "directionalLockEnabled"

    .line 971
    .line 972
    .line 973
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 974
    move-result v3

    .line 975
    .line 976
    if-nez v3, :cond_43

    .line 977
    goto :goto_0

    .line 978
    :cond_43
    const/4 v2, 0x7

    .line 979
    goto :goto_0

    .line 980
    .line 981
    :sswitch_44
    const-string v3, "injectedJavaScriptBeforeContentLoaded"

    .line 982
    .line 983
    .line 984
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 985
    move-result v3

    .line 986
    .line 987
    if-nez v3, :cond_44

    .line 988
    goto :goto_0

    .line 989
    :cond_44
    const/4 v2, 0x6

    .line 990
    goto :goto_0

    .line 991
    .line 992
    .line 993
    :sswitch_45
    const-string/jumbo v3, "textInteractionEnabled"

    .line 994
    .line 995
    .line 996
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 997
    move-result v3

    .line 998
    .line 999
    if-nez v3, :cond_45

    .line 1000
    goto :goto_0

    .line 1001
    :cond_45
    const/4 v2, 0x5

    .line 1002
    goto :goto_0

    .line 1003
    .line 1004
    .line 1005
    :sswitch_46
    const-string/jumbo v3, "saveFormDataDisabled"

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1009
    move-result v3

    .line 1010
    .line 1011
    if-nez v3, :cond_46

    .line 1012
    goto :goto_0

    .line 1013
    :cond_46
    const/4 v2, 0x4

    .line 1014
    goto :goto_0

    .line 1015
    .line 1016
    :sswitch_47
    const-string v3, "allowsProtectedMedia"

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1020
    move-result v3

    .line 1021
    .line 1022
    if-nez v3, :cond_47

    .line 1023
    goto :goto_0

    .line 1024
    :cond_47
    const/4 v2, 0x3

    .line 1025
    goto :goto_0

    .line 1026
    .line 1027
    :sswitch_48
    const-string v3, "allowsPictureInPictureMediaPlayback"

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1031
    move-result v3

    .line 1032
    .line 1033
    if-nez v3, :cond_48

    .line 1034
    goto :goto_0

    .line 1035
    :cond_48
    const/4 v2, 0x2

    .line 1036
    goto :goto_0

    .line 1037
    .line 1038
    .line 1039
    :sswitch_49
    const-string/jumbo v3, "sharedCookiesEnabled"

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1043
    move-result v3

    .line 1044
    .line 1045
    if-nez v3, :cond_49

    .line 1046
    goto :goto_0

    .line 1047
    :cond_49
    const/4 v2, 0x1

    .line 1048
    goto :goto_0

    .line 1049
    .line 1050
    :sswitch_4a
    const-string v3, "allowFileAccessFromFileURLs"

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1054
    move-result v3

    .line 1055
    .line 1056
    if-nez v3, :cond_4a

    .line 1057
    goto :goto_0

    .line 1058
    :cond_4a
    move v2, v1

    .line 1059
    .line 1060
    .line 1061
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 1062
    .line 1063
    .line 1064
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1065
    return-void

    .line 1066
    .line 1067
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1068
    .line 1069
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1070
    .line 1071
    check-cast p3, Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setContentInsetAdjustmentBehavior(Landroid/view/View;Ljava/lang/String;)V

    .line 1075
    return-void

    .line 1076
    .line 1077
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1078
    .line 1079
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1080
    .line 1081
    if-nez p3, :cond_4b

    .line 1082
    .line 1083
    const-wide/16 v0, 0x0

    .line 1084
    goto :goto_1

    .line 1085
    .line 1086
    :cond_4b
    check-cast p3, Ljava/lang/Double;

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 1090
    move-result-wide v0

    .line 1091
    .line 1092
    .line 1093
    :goto_1
    invoke-interface {p2, p1, v0, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setDecelerationRate(Landroid/view/View;D)V

    .line 1094
    return-void

    .line 1095
    .line 1096
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1097
    .line 1098
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1099
    .line 1100
    if-nez p3, :cond_4c

    .line 1101
    goto :goto_2

    .line 1102
    .line 1103
    :cond_4c
    check-cast p3, Ljava/lang/Boolean;

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1107
    move-result v1

    .line 1108
    .line 1109
    .line 1110
    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setScalesPageToFit(Landroid/view/View;Z)V

    .line 1111
    return-void

    .line 1112
    .line 1113
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1114
    .line 1115
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1116
    .line 1117
    if-nez p3, :cond_4d

    .line 1118
    goto :goto_3

    .line 1119
    .line 1120
    :cond_4d
    check-cast p3, Ljava/lang/Boolean;

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1124
    move-result v1

    .line 1125
    .line 1126
    .line 1127
    :goto_3
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setShowsHorizontalScrollIndicator(Landroid/view/View;Z)V

    .line 1128
    return-void

    .line 1129
    .line 1130
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1131
    .line 1132
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1133
    .line 1134
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1135
    .line 1136
    .line 1137
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setSuppressMenuItems(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1138
    return-void

    .line 1139
    .line 1140
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1141
    .line 1142
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1143
    .line 1144
    check-cast p3, Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAndroidLayerType(Landroid/view/View;Ljava/lang/String;)V

    .line 1148
    return-void

    .line 1149
    .line 1150
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1151
    .line 1152
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1153
    .line 1154
    if-nez p3, :cond_4e

    .line 1155
    goto :goto_4

    .line 1156
    .line 1157
    :cond_4e
    check-cast p3, Ljava/lang/Boolean;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1161
    move-result v1

    .line 1162
    .line 1163
    .line 1164
    :goto_4
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAutoManageStatusBarEnabled(Landroid/view/View;Z)V

    .line 1165
    return-void

    .line 1166
    .line 1167
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1168
    .line 1169
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1170
    .line 1171
    if-nez p3, :cond_4f

    .line 1172
    goto :goto_5

    .line 1173
    .line 1174
    :cond_4f
    check-cast p3, Ljava/lang/Boolean;

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1178
    move-result v1

    .line 1179
    .line 1180
    .line 1181
    :goto_5
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setThirdPartyCookiesEnabled(Landroid/view/View;Z)V

    .line 1182
    return-void

    .line 1183
    .line 1184
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1185
    .line 1186
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1187
    .line 1188
    if-nez p3, :cond_50

    .line 1189
    goto :goto_6

    .line 1190
    .line 1191
    :cond_50
    check-cast p3, Ljava/lang/Boolean;

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1195
    move-result v1

    .line 1196
    .line 1197
    .line 1198
    :goto_6
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setMediaPlaybackRequiresUserAction(Landroid/view/View;Z)V

    .line 1199
    return-void

    .line 1200
    .line 1201
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1202
    .line 1203
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1204
    .line 1205
    if-nez p3, :cond_51

    .line 1206
    goto :goto_7

    .line 1207
    .line 1208
    :cond_51
    check-cast p3, Ljava/lang/Boolean;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1212
    move-result v1

    .line 1213
    .line 1214
    .line 1215
    :goto_7
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setEnableApplePay(Landroid/view/View;Z)V

    .line 1216
    return-void

    .line 1217
    .line 1218
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1219
    .line 1220
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1221
    .line 1222
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1223
    .line 1224
    .line 1225
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setBasicAuthCredential(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1226
    return-void

    .line 1227
    .line 1228
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1229
    .line 1230
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1231
    .line 1232
    if-nez p3, :cond_52

    .line 1233
    goto :goto_8

    .line 1234
    :cond_52
    move-object v0, p3

    .line 1235
    .line 1236
    check-cast v0, Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    :goto_8
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setDownloadingMessage(Landroid/view/View;Ljava/lang/String;)V

    .line 1240
    return-void

    .line 1241
    .line 1242
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1243
    .line 1244
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1245
    .line 1246
    if-nez p3, :cond_53

    .line 1247
    goto :goto_9

    .line 1248
    .line 1249
    :cond_53
    check-cast p3, Ljava/lang/Boolean;

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1253
    move-result v1

    .line 1254
    .line 1255
    .line 1256
    :goto_9
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setGeolocationEnabled(Landroid/view/View;Z)V

    .line 1257
    return-void

    .line 1258
    .line 1259
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1260
    .line 1261
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1262
    .line 1263
    if-nez p3, :cond_54

    .line 1264
    goto :goto_a

    .line 1265
    .line 1266
    :cond_54
    check-cast p3, Ljava/lang/Boolean;

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1270
    move-result v1

    .line 1271
    .line 1272
    .line 1273
    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setFraudulentWebsiteWarningEnabled(Landroid/view/View;Z)V

    .line 1274
    return-void

    .line 1275
    .line 1276
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1277
    .line 1278
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1279
    .line 1280
    if-nez p3, :cond_55

    .line 1281
    goto :goto_b

    .line 1282
    .line 1283
    :cond_55
    check-cast p3, Ljava/lang/Boolean;

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1287
    move-result v1

    .line 1288
    .line 1289
    .line 1290
    :goto_b
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setRefreshControlLightMode(Landroid/view/View;Z)V

    .line 1291
    return-void

    .line 1292
    .line 1293
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1294
    .line 1295
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1296
    .line 1297
    if-nez p3, :cond_56

    .line 1298
    goto :goto_c

    .line 1299
    .line 1300
    :cond_56
    check-cast p3, Ljava/lang/Boolean;

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1304
    move-result v1

    .line 1305
    .line 1306
    .line 1307
    :goto_c
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setPullToRefreshEnabled(Landroid/view/View;Z)V

    .line 1308
    return-void

    .line 1309
    .line 1310
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1311
    .line 1312
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1313
    .line 1314
    if-nez p3, :cond_57

    .line 1315
    goto :goto_d

    .line 1316
    .line 1317
    :cond_57
    check-cast p3, Ljava/lang/Boolean;

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1321
    move-result v1

    .line 1322
    .line 1323
    .line 1324
    :goto_d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setSetBuiltInZoomControls(Landroid/view/View;Z)V

    .line 1325
    return-void

    .line 1326
    .line 1327
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1328
    .line 1329
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1330
    .line 1331
    if-nez p3, :cond_58

    .line 1332
    goto :goto_e

    .line 1333
    .line 1334
    :cond_58
    check-cast p3, Ljava/lang/Boolean;

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1338
    move-result v1

    .line 1339
    .line 1340
    .line 1341
    :goto_e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setLimitsNavigationsToAppBoundDomains(Landroid/view/View;Z)V

    .line 1342
    return-void

    .line 1343
    .line 1344
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1345
    .line 1346
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1347
    .line 1348
    if-nez p3, :cond_59

    .line 1349
    goto :goto_f

    .line 1350
    .line 1351
    :cond_59
    check-cast p3, Ljava/lang/Boolean;

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1355
    move-result v1

    .line 1356
    .line 1357
    .line 1358
    :goto_f
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowFileAccess(Landroid/view/View;Z)V

    .line 1359
    return-void

    .line 1360
    .line 1361
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1362
    .line 1363
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1364
    .line 1365
    if-nez p3, :cond_5a

    .line 1366
    goto :goto_10

    .line 1367
    .line 1368
    :cond_5a
    check-cast p3, Ljava/lang/Boolean;

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1372
    move-result v1

    .line 1373
    .line 1374
    .line 1375
    :goto_10
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowsAirPlayForMediaPlayback(Landroid/view/View;Z)V

    .line 1376
    return-void

    .line 1377
    .line 1378
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1379
    .line 1380
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1381
    .line 1382
    if-nez p3, :cond_5b

    .line 1383
    goto :goto_11

    .line 1384
    .line 1385
    :cond_5b
    check-cast p3, Ljava/lang/Boolean;

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1389
    move-result v1

    .line 1390
    .line 1391
    .line 1392
    :goto_11
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowsBackForwardNavigationGestures(Landroid/view/View;Z)V

    .line 1393
    return-void

    .line 1394
    .line 1395
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1396
    .line 1397
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1398
    .line 1399
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1400
    .line 1401
    .line 1402
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setContentInset(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1403
    return-void

    .line 1404
    .line 1405
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1406
    .line 1407
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1408
    .line 1409
    check-cast p3, Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setMixedContentMode(Landroid/view/View;Ljava/lang/String;)V

    .line 1413
    return-void

    .line 1414
    .line 1415
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1416
    .line 1417
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1418
    .line 1419
    if-nez p3, :cond_5c

    .line 1420
    goto :goto_12

    .line 1421
    :cond_5c
    move-object v0, p3

    .line 1422
    .line 1423
    check-cast v0, Ljava/lang/String;

    .line 1424
    .line 1425
    .line 1426
    :goto_12
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setApplicationNameForUserAgent(Landroid/view/View;Ljava/lang/String;)V

    .line 1427
    return-void

    .line 1428
    .line 1429
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1430
    .line 1431
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1432
    .line 1433
    if-nez p3, :cond_5d

    .line 1434
    goto :goto_13

    .line 1435
    :cond_5d
    move-object v0, p3

    .line 1436
    .line 1437
    check-cast v0, Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    :goto_13
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setInjectedJavaScriptObject(Landroid/view/View;Ljava/lang/String;)V

    .line 1441
    return-void

    .line 1442
    .line 1443
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1444
    .line 1445
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1446
    .line 1447
    if-nez p3, :cond_5e

    .line 1448
    goto :goto_14

    .line 1449
    .line 1450
    :cond_5e
    check-cast p3, Ljava/lang/Boolean;

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1454
    move-result v1

    .line 1455
    .line 1456
    .line 1457
    :goto_14
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setWebviewDebuggingEnabled(Landroid/view/View;Z)V

    .line 1458
    return-void

    .line 1459
    .line 1460
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1461
    .line 1462
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1463
    .line 1464
    if-nez p3, :cond_5f

    .line 1465
    goto :goto_15

    .line 1466
    .line 1467
    :cond_5f
    check-cast p3, Ljava/lang/Boolean;

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1471
    move-result v1

    .line 1472
    .line 1473
    .line 1474
    :goto_15
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setInjectedJavaScriptForMainFrameOnly(Landroid/view/View;Z)V

    .line 1475
    return-void

    .line 1476
    .line 1477
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1478
    .line 1479
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1480
    .line 1481
    if-nez p3, :cond_60

    .line 1482
    goto :goto_16

    .line 1483
    .line 1484
    :cond_60
    check-cast p3, Ljava/lang/Boolean;

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1488
    move-result v1

    .line 1489
    .line 1490
    .line 1491
    :goto_16
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setCacheEnabled(Landroid/view/View;Z)V

    .line 1492
    return-void

    .line 1493
    .line 1494
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1495
    .line 1496
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1497
    .line 1498
    if-nez p3, :cond_61

    .line 1499
    goto :goto_17

    .line 1500
    .line 1501
    :cond_61
    check-cast p3, Ljava/lang/Boolean;

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1505
    move-result v1

    .line 1506
    .line 1507
    .line 1508
    :goto_17
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowsInlineMediaPlayback(Landroid/view/View;Z)V

    .line 1509
    return-void

    .line 1510
    .line 1511
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1512
    .line 1513
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1514
    .line 1515
    if-nez p3, :cond_62

    .line 1516
    goto :goto_18

    .line 1517
    :cond_62
    move-object v0, p3

    .line 1518
    .line 1519
    check-cast v0, Ljava/lang/String;

    .line 1520
    .line 1521
    .line 1522
    :goto_18
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setUserAgent(Landroid/view/View;Ljava/lang/String;)V

    .line 1523
    return-void

    .line 1524
    .line 1525
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1526
    .line 1527
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1528
    .line 1529
    if-nez p3, :cond_63

    .line 1530
    goto :goto_19

    .line 1531
    .line 1532
    :cond_63
    check-cast p3, Ljava/lang/Boolean;

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1536
    move-result v1

    .line 1537
    .line 1538
    .line 1539
    :goto_19
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAutomaticallyAdjustContentInsets(Landroid/view/View;Z)V

    .line 1540
    return-void

    .line 1541
    .line 1542
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1543
    .line 1544
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1545
    .line 1546
    if-nez p3, :cond_64

    .line 1547
    goto :goto_1a

    .line 1548
    :cond_64
    move-object v0, p3

    .line 1549
    .line 1550
    check-cast v0, Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    :goto_1a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setInjectedJavaScript(Landroid/view/View;Ljava/lang/String;)V

    .line 1554
    return-void

    .line 1555
    .line 1556
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1557
    .line 1558
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1559
    .line 1560
    if-nez p3, :cond_65

    .line 1561
    goto :goto_1b

    .line 1562
    :cond_65
    move-object v0, p3

    .line 1563
    .line 1564
    check-cast v0, Ljava/lang/String;

    .line 1565
    .line 1566
    .line 1567
    :goto_1b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setLackPermissionToDownloadMessage(Landroid/view/View;Ljava/lang/String;)V

    .line 1568
    return-void

    .line 1569
    .line 1570
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1571
    .line 1572
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1573
    .line 1574
    if-nez p3, :cond_66

    .line 1575
    goto :goto_1c

    .line 1576
    .line 1577
    :cond_66
    check-cast p3, Ljava/lang/Boolean;

    .line 1578
    .line 1579
    .line 1580
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1581
    move-result v1

    .line 1582
    .line 1583
    .line 1584
    :goto_1c
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setSetSupportMultipleWindows(Landroid/view/View;Z)V

    .line 1585
    return-void

    .line 1586
    .line 1587
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1588
    .line 1589
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1590
    .line 1591
    if-nez p3, :cond_67

    .line 1592
    goto :goto_1d

    .line 1593
    .line 1594
    :cond_67
    check-cast p3, Ljava/lang/Boolean;

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1598
    move-result v1

    .line 1599
    .line 1600
    .line 1601
    :goto_1d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setBounces(Landroid/view/View;Z)V

    .line 1602
    return-void

    .line 1603
    .line 1604
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1605
    .line 1606
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1607
    .line 1608
    if-nez p3, :cond_68

    .line 1609
    goto :goto_1e

    .line 1610
    .line 1611
    :cond_68
    check-cast p3, Ljava/lang/Boolean;

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1615
    move-result v1

    .line 1616
    .line 1617
    .line 1618
    :goto_1e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setHasOnScroll(Landroid/view/View;Z)V

    .line 1619
    return-void

    .line 1620
    .line 1621
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1622
    .line 1623
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1624
    .line 1625
    if-nez p3, :cond_69

    .line 1626
    goto :goto_1f

    .line 1627
    .line 1628
    :cond_69
    check-cast p3, Ljava/lang/Boolean;

    .line 1629
    .line 1630
    .line 1631
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1632
    move-result v1

    .line 1633
    .line 1634
    .line 1635
    :goto_1f
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(Landroid/view/View;Z)V

    .line 1636
    return-void

    .line 1637
    .line 1638
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1639
    .line 1640
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1641
    .line 1642
    if-nez p3, :cond_6a

    .line 1643
    goto :goto_20

    .line 1644
    .line 1645
    :cond_6a
    check-cast p3, Ljava/lang/Boolean;

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1649
    move-result v1

    .line 1650
    .line 1651
    .line 1652
    :goto_20
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setNestedScrollEnabled(Landroid/view/View;Z)V

    .line 1653
    return-void

    .line 1654
    .line 1655
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1656
    .line 1657
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1658
    .line 1659
    if-nez p3, :cond_6b

    .line 1660
    goto :goto_21

    .line 1661
    .line 1662
    :cond_6b
    check-cast p3, Ljava/lang/Boolean;

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1666
    move-result v1

    .line 1667
    .line 1668
    .line 1669
    :goto_21
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowsFullscreenVideo(Landroid/view/View;Z)V

    .line 1670
    return-void

    .line 1671
    .line 1672
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1673
    .line 1674
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1675
    .line 1676
    if-nez p3, :cond_6c

    .line 1677
    goto :goto_22

    .line 1678
    .line 1679
    :cond_6c
    check-cast p3, Ljava/lang/Boolean;

    .line 1680
    .line 1681
    .line 1682
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1683
    move-result v1

    .line 1684
    .line 1685
    .line 1686
    :goto_22
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setSetDisplayZoomControls(Landroid/view/View;Z)V

    .line 1687
    return-void

    .line 1688
    .line 1689
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1690
    .line 1691
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1692
    .line 1693
    if-nez p3, :cond_6d

    .line 1694
    goto :goto_23

    .line 1695
    .line 1696
    :cond_6d
    check-cast p3, Ljava/lang/Boolean;

    .line 1697
    .line 1698
    .line 1699
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1700
    move-result v1

    .line 1701
    .line 1702
    .line 1703
    :goto_23
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setJavaScriptCanOpenWindowsAutomatically(Landroid/view/View;Z)V

    .line 1704
    return-void

    .line 1705
    .line 1706
    :pswitch_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1707
    .line 1708
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1709
    .line 1710
    if-nez p3, :cond_6e

    .line 1711
    goto :goto_24

    .line 1712
    .line 1713
    :cond_6e
    check-cast p3, Ljava/lang/Boolean;

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1717
    move-result v1

    .line 1718
    .line 1719
    .line 1720
    :goto_24
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setHasOnOpenWindowEvent(Landroid/view/View;Z)V

    .line 1721
    return-void

    .line 1722
    .line 1723
    :pswitch_2a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1724
    .line 1725
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1726
    .line 1727
    if-nez p3, :cond_6f

    .line 1728
    goto :goto_25

    .line 1729
    :cond_6f
    move-object v0, p3

    .line 1730
    .line 1731
    check-cast v0, Ljava/lang/String;

    .line 1732
    .line 1733
    .line 1734
    :goto_25
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setMessagingModuleName(Landroid/view/View;Ljava/lang/String;)V

    .line 1735
    return-void

    .line 1736
    .line 1737
    :pswitch_2b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1738
    .line 1739
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1740
    .line 1741
    check-cast p3, Ljava/lang/String;

    .line 1742
    .line 1743
    .line 1744
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setContentMode(Landroid/view/View;Ljava/lang/String;)V

    .line 1745
    return-void

    .line 1746
    .line 1747
    :pswitch_2c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1748
    .line 1749
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1750
    .line 1751
    if-nez p3, :cond_70

    .line 1752
    goto :goto_26

    .line 1753
    .line 1754
    :cond_70
    check-cast p3, Ljava/lang/Boolean;

    .line 1755
    .line 1756
    .line 1757
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1758
    move-result v1

    .line 1759
    .line 1760
    .line 1761
    :goto_26
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setPagingEnabled(Landroid/view/View;Z)V

    .line 1762
    return-void

    .line 1763
    .line 1764
    :pswitch_2d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1765
    .line 1766
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1767
    .line 1768
    check-cast p3, Ljava/lang/String;

    .line 1769
    .line 1770
    .line 1771
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setCacheMode(Landroid/view/View;Ljava/lang/String;)V

    .line 1772
    return-void

    .line 1773
    .line 1774
    :pswitch_2e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1775
    .line 1776
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1777
    .line 1778
    if-nez p3, :cond_71

    .line 1779
    goto :goto_27

    .line 1780
    .line 1781
    :cond_71
    check-cast p3, Ljava/lang/Boolean;

    .line 1782
    .line 1783
    .line 1784
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1785
    move-result v1

    .line 1786
    .line 1787
    .line 1788
    :goto_27
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setHasOnFileDownload(Landroid/view/View;Z)V

    .line 1789
    return-void

    .line 1790
    .line 1791
    :pswitch_2f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1792
    .line 1793
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1794
    .line 1795
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1796
    .line 1797
    .line 1798
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setNewSource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1799
    return-void

    .line 1800
    .line 1801
    :pswitch_30
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1802
    .line 1803
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1804
    .line 1805
    check-cast p3, Ljava/lang/String;

    .line 1806
    .line 1807
    .line 1808
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setMediaCapturePermissionGrantType(Landroid/view/View;Ljava/lang/String;)V

    .line 1809
    return-void

    .line 1810
    .line 1811
    :pswitch_31
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1812
    .line 1813
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1814
    .line 1815
    if-nez p3, :cond_72

    .line 1816
    goto :goto_28

    .line 1817
    .line 1818
    :cond_72
    check-cast p3, Ljava/lang/Boolean;

    .line 1819
    .line 1820
    .line 1821
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1822
    move-result v1

    .line 1823
    .line 1824
    .line 1825
    :goto_28
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowUniversalAccessFromFileURLs(Landroid/view/View;Z)V

    .line 1826
    return-void

    .line 1827
    .line 1828
    :pswitch_32
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1829
    .line 1830
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1831
    .line 1832
    if-nez p3, :cond_73

    .line 1833
    goto :goto_29

    .line 1834
    .line 1835
    :cond_73
    check-cast p3, Ljava/lang/Boolean;

    .line 1836
    .line 1837
    .line 1838
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1839
    move-result v1

    .line 1840
    .line 1841
    .line 1842
    :goto_29
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setHideKeyboardAccessoryView(Landroid/view/View;Z)V

    .line 1843
    return-void

    .line 1844
    .line 1845
    :pswitch_33
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1846
    .line 1847
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1848
    .line 1849
    if-nez p3, :cond_74

    .line 1850
    goto :goto_2a

    .line 1851
    .line 1852
    :cond_74
    check-cast p3, Ljava/lang/Double;

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1856
    move-result v1

    .line 1857
    .line 1858
    .line 1859
    :goto_2a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setMinimumFontSize(Landroid/view/View;I)V

    .line 1860
    return-void

    .line 1861
    .line 1862
    :pswitch_34
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1863
    .line 1864
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1865
    .line 1866
    if-nez p3, :cond_75

    .line 1867
    goto :goto_2b

    .line 1868
    .line 1869
    :cond_75
    check-cast p3, Ljava/lang/Boolean;

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1873
    move-result v1

    .line 1874
    .line 1875
    .line 1876
    :goto_2b
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setForceDarkOn(Landroid/view/View;Z)V

    .line 1877
    return-void

    .line 1878
    .line 1879
    :pswitch_35
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1880
    .line 1881
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1882
    .line 1883
    if-nez p3, :cond_76

    .line 1884
    goto :goto_2c

    .line 1885
    .line 1886
    :cond_76
    check-cast p3, Ljava/lang/Boolean;

    .line 1887
    .line 1888
    .line 1889
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1890
    move-result v1

    .line 1891
    .line 1892
    .line 1893
    :goto_2c
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setShowsVerticalScrollIndicator(Landroid/view/View;Z)V

    .line 1894
    return-void

    .line 1895
    .line 1896
    :pswitch_36
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1897
    .line 1898
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1899
    .line 1900
    if-nez p3, :cond_77

    .line 1901
    goto :goto_2d

    .line 1902
    .line 1903
    :cond_77
    check-cast p3, Ljava/lang/Double;

    .line 1904
    .line 1905
    .line 1906
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1907
    move-result v1

    .line 1908
    .line 1909
    .line 1910
    :goto_2d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setTextZoom(Landroid/view/View;I)V

    .line 1911
    return-void

    .line 1912
    .line 1913
    :pswitch_37
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1914
    .line 1915
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1916
    .line 1917
    if-nez p3, :cond_78

    .line 1918
    goto :goto_2e

    .line 1919
    .line 1920
    :cond_78
    check-cast p3, Ljava/lang/Boolean;

    .line 1921
    .line 1922
    .line 1923
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1924
    move-result v1

    .line 1925
    .line 1926
    .line 1927
    :goto_2e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setUseSharedProcessPool(Landroid/view/View;Z)V

    .line 1928
    return-void

    .line 1929
    .line 1930
    :pswitch_38
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1931
    .line 1932
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1933
    .line 1934
    if-nez p3, :cond_79

    .line 1935
    goto :goto_2f

    .line 1936
    .line 1937
    :cond_79
    check-cast p3, Ljava/lang/Boolean;

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1941
    move-result v1

    .line 1942
    .line 1943
    .line 1944
    :goto_2f
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowsLinkPreview(Landroid/view/View;Z)V

    .line 1945
    return-void

    .line 1946
    .line 1947
    :pswitch_39
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1948
    .line 1949
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1950
    .line 1951
    if-nez p3, :cond_7a

    .line 1952
    goto :goto_30

    .line 1953
    .line 1954
    :cond_7a
    check-cast p3, Ljava/lang/Boolean;

    .line 1955
    .line 1956
    .line 1957
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1958
    move-result v1

    .line 1959
    .line 1960
    .line 1961
    :goto_30
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setDomStorageEnabled(Landroid/view/View;Z)V

    .line 1962
    return-void

    .line 1963
    .line 1964
    :pswitch_3a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1965
    .line 1966
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1967
    .line 1968
    if-nez p3, :cond_7b

    .line 1969
    goto :goto_31

    .line 1970
    .line 1971
    :cond_7b
    check-cast p3, Ljava/lang/Boolean;

    .line 1972
    .line 1973
    .line 1974
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1975
    move-result v1

    .line 1976
    .line 1977
    .line 1978
    :goto_31
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setKeyboardDisplayRequiresUserAction(Landroid/view/View;Z)V

    .line 1979
    return-void

    .line 1980
    .line 1981
    :pswitch_3b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1982
    .line 1983
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 1984
    .line 1985
    if-nez p3, :cond_7c

    .line 1986
    goto :goto_32

    .line 1987
    .line 1988
    :cond_7c
    check-cast p3, Ljava/lang/Boolean;

    .line 1989
    .line 1990
    .line 1991
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1992
    move-result v1

    .line 1993
    .line 1994
    .line 1995
    :goto_32
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setScrollEnabled(Landroid/view/View;Z)V

    .line 1996
    return-void

    .line 1997
    .line 1998
    :pswitch_3c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1999
    .line 2000
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2001
    .line 2002
    if-nez p3, :cond_7d

    .line 2003
    goto :goto_33

    .line 2004
    :cond_7d
    move-object v0, p3

    .line 2005
    .line 2006
    check-cast v0, Ljava/lang/String;

    .line 2007
    .line 2008
    .line 2009
    :goto_33
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setOverScrollMode(Landroid/view/View;Ljava/lang/String;)V

    .line 2010
    return-void

    .line 2011
    .line 2012
    :pswitch_3d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2013
    .line 2014
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2015
    .line 2016
    if-nez p3, :cond_7e

    .line 2017
    goto :goto_34

    .line 2018
    :cond_7e
    move-object v0, p3

    .line 2019
    .line 2020
    check-cast v0, Ljava/lang/String;

    .line 2021
    .line 2022
    .line 2023
    :goto_34
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowingReadAccessToURL(Landroid/view/View;Ljava/lang/String;)V

    .line 2024
    return-void

    .line 2025
    .line 2026
    :pswitch_3e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2027
    .line 2028
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2029
    .line 2030
    if-nez p3, :cond_7f

    .line 2031
    goto :goto_35

    .line 2032
    .line 2033
    :cond_7f
    check-cast p3, Ljava/lang/Boolean;

    .line 2034
    .line 2035
    .line 2036
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2037
    move-result v1

    .line 2038
    .line 2039
    .line 2040
    :goto_35
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setIncognito(Landroid/view/View;Z)V

    .line 2041
    return-void

    .line 2042
    .line 2043
    :pswitch_3f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2044
    .line 2045
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2046
    .line 2047
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 2048
    .line 2049
    .line 2050
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setMenuItems(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 2051
    return-void

    .line 2052
    .line 2053
    :pswitch_40
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2054
    .line 2055
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2056
    .line 2057
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 2058
    .line 2059
    .line 2060
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setDataDetectorTypes(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 2061
    return-void

    .line 2062
    .line 2063
    :pswitch_41
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2064
    .line 2065
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2066
    .line 2067
    if-nez p3, :cond_80

    .line 2068
    goto :goto_36

    .line 2069
    .line 2070
    :cond_80
    check-cast p3, Ljava/lang/Boolean;

    .line 2071
    .line 2072
    .line 2073
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2074
    move-result v1

    .line 2075
    .line 2076
    .line 2077
    :goto_36
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setMessagingEnabled(Landroid/view/View;Z)V

    .line 2078
    return-void

    .line 2079
    .line 2080
    :pswitch_42
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2081
    .line 2082
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2083
    .line 2084
    if-nez p3, :cond_81

    .line 2085
    goto :goto_37

    .line 2086
    .line 2087
    :cond_81
    check-cast p3, Ljava/lang/Boolean;

    .line 2088
    .line 2089
    .line 2090
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2091
    move-result v1

    .line 2092
    .line 2093
    .line 2094
    :goto_37
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setJavaScriptEnabled(Landroid/view/View;Z)V

    .line 2095
    return-void

    .line 2096
    .line 2097
    :pswitch_43
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2098
    .line 2099
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2100
    .line 2101
    if-nez p3, :cond_82

    .line 2102
    goto :goto_38

    .line 2103
    .line 2104
    :cond_82
    check-cast p3, Ljava/lang/Boolean;

    .line 2105
    .line 2106
    .line 2107
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2108
    move-result v1

    .line 2109
    .line 2110
    .line 2111
    :goto_38
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setDirectionalLockEnabled(Landroid/view/View;Z)V

    .line 2112
    return-void

    .line 2113
    .line 2114
    :pswitch_44
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2115
    .line 2116
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2117
    .line 2118
    if-nez p3, :cond_83

    .line 2119
    goto :goto_39

    .line 2120
    :cond_83
    move-object v0, p3

    .line 2121
    .line 2122
    check-cast v0, Ljava/lang/String;

    .line 2123
    .line 2124
    .line 2125
    :goto_39
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setInjectedJavaScriptBeforeContentLoaded(Landroid/view/View;Ljava/lang/String;)V

    .line 2126
    return-void

    .line 2127
    .line 2128
    :pswitch_45
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2129
    .line 2130
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2131
    .line 2132
    if-nez p3, :cond_84

    .line 2133
    goto :goto_3a

    .line 2134
    .line 2135
    :cond_84
    check-cast p3, Ljava/lang/Boolean;

    .line 2136
    .line 2137
    .line 2138
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2139
    move-result v1

    .line 2140
    .line 2141
    .line 2142
    :goto_3a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setTextInteractionEnabled(Landroid/view/View;Z)V

    .line 2143
    return-void

    .line 2144
    .line 2145
    :pswitch_46
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2146
    .line 2147
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2148
    .line 2149
    if-nez p3, :cond_85

    .line 2150
    goto :goto_3b

    .line 2151
    .line 2152
    :cond_85
    check-cast p3, Ljava/lang/Boolean;

    .line 2153
    .line 2154
    .line 2155
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2156
    move-result v1

    .line 2157
    .line 2158
    .line 2159
    :goto_3b
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setSaveFormDataDisabled(Landroid/view/View;Z)V

    .line 2160
    return-void

    .line 2161
    .line 2162
    :pswitch_47
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2163
    .line 2164
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2165
    .line 2166
    if-nez p3, :cond_86

    .line 2167
    goto :goto_3c

    .line 2168
    .line 2169
    :cond_86
    check-cast p3, Ljava/lang/Boolean;

    .line 2170
    .line 2171
    .line 2172
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2173
    move-result v1

    .line 2174
    .line 2175
    .line 2176
    :goto_3c
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowsProtectedMedia(Landroid/view/View;Z)V

    .line 2177
    return-void

    .line 2178
    .line 2179
    :pswitch_48
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2180
    .line 2181
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2182
    .line 2183
    if-nez p3, :cond_87

    .line 2184
    goto :goto_3d

    .line 2185
    .line 2186
    :cond_87
    check-cast p3, Ljava/lang/Boolean;

    .line 2187
    .line 2188
    .line 2189
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2190
    move-result v1

    .line 2191
    .line 2192
    .line 2193
    :goto_3d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowsPictureInPictureMediaPlayback(Landroid/view/View;Z)V

    .line 2194
    return-void

    .line 2195
    .line 2196
    :pswitch_49
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2197
    .line 2198
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2199
    .line 2200
    if-nez p3, :cond_88

    .line 2201
    goto :goto_3e

    .line 2202
    .line 2203
    :cond_88
    check-cast p3, Ljava/lang/Boolean;

    .line 2204
    .line 2205
    .line 2206
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2207
    move-result v1

    .line 2208
    .line 2209
    .line 2210
    :goto_3e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setSharedCookiesEnabled(Landroid/view/View;Z)V

    .line 2211
    return-void

    .line 2212
    .line 2213
    :pswitch_4a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 2214
    .line 2215
    check-cast p2, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;

    .line 2216
    .line 2217
    if-nez p3, :cond_89

    .line 2218
    goto :goto_3f

    .line 2219
    .line 2220
    :cond_89
    check-cast p3, Ljava/lang/Boolean;

    .line 2221
    .line 2222
    .line 2223
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2224
    move-result v1

    .line 2225
    .line 2226
    .line 2227
    :goto_3f
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNCWebViewManagerInterface;->setAllowFileAccessFromFileURLs(Landroid/view/View;Z)V

    .line 2228
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x781574ed -> :sswitch_4a
        -0x6ddfea89 -> :sswitch_49
        -0x6c93c106 -> :sswitch_48
        -0x678c0640 -> :sswitch_47
        -0x66d9f539 -> :sswitch_46
        -0x662b5324 -> :sswitch_45
        -0x6223823e -> :sswitch_44
        -0x61e476b4 -> :sswitch_43
        -0x5fd28b0c -> :sswitch_42
        -0x5d1a4063 -> :sswitch_41
        -0x5cb83f37 -> :sswitch_40
        -0x5c369a5f -> :sswitch_3f
        -0x54db4b54 -> :sswitch_3e
        -0x534a0abf -> :sswitch_3d
        -0x4ec079fc -> :sswitch_3c
        -0x449b944c -> :sswitch_3b
        -0x4492f196 -> :sswitch_3a
        -0x4458d9d8 -> :sswitch_39
        -0x43dd523c -> :sswitch_38
        -0x3c249141 -> :sswitch_37
        -0x3bcf8160 -> :sswitch_36
        -0x36f6028a -> :sswitch_35
        -0x360fb140 -> :sswitch_34
        -0x2fb958e2 -> :sswitch_33
        -0x2bd69ff2 -> :sswitch_32
        -0x2b64a590 -> :sswitch_31
        -0x2b5440bb -> :sswitch_30
        -0x23c6ba25 -> :sswitch_2f
        -0x2218c523 -> :sswitch_2e
        -0x210233bb -> :sswitch_2d
        -0x1df149eb -> :sswitch_2c
        -0x17350244 -> :sswitch_2b
        -0x16a962c5 -> :sswitch_2a
        -0x122e8f79 -> :sswitch_29
        -0xd908e93 -> :sswitch_28
        -0xad6be37 -> :sswitch_27
        -0x7a5e62a -> :sswitch_26
        -0x79d3c03 -> :sswitch_25
        -0x6375767 -> :sswitch_24
        0x42f7a46 -> :sswitch_23
        0x430daeb -> :sswitch_22
        0x5d27586 -> :sswitch_21
        0x83bf978 -> :sswitch_20
        0xcd48b9d -> :sswitch_1f
        0xd7ae4dd -> :sswitch_1e
        0x12900dfa -> :sswitch_1d
        0x15f50d5c -> :sswitch_1c
        0x17ad5d5f -> :sswitch_1b
        0x1a57a074 -> :sswitch_1a
        0x1c5cea8c -> :sswitch_19
        0x1d98313c -> :sswitch_18
        0x2337f2cc -> :sswitch_17
        0x2d5b5ec1 -> :sswitch_16
        0x305c2024 -> :sswitch_15
        0x318750d2 -> :sswitch_14
        0x4025a1ea -> :sswitch_13
        0x43d84229 -> :sswitch_12
        0x45c8eeb0 -> :sswitch_11
        0x463017ca -> :sswitch_10
        0x48b6e3a6 -> :sswitch_f
        0x4a299bf7 -> :sswitch_e
        0x4e103450 -> :sswitch_d
        0x5022225b -> :sswitch_c
        0x51037c4d -> :sswitch_b
        0x5a2c67ed -> :sswitch_a
        0x5acb1591 -> :sswitch_9
        0x69ca70ae -> :sswitch_8
        0x6c08f151 -> :sswitch_7
        0x6c176554 -> :sswitch_6
        0x6e497e7c -> :sswitch_5
        0x6f649a6c -> :sswitch_4
        0x7232cc88 -> :sswitch_3
        0x7ba883de -> :sswitch_2
        0x7ee6439f -> :sswitch_1
        0x7ff4e223 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
.end method
