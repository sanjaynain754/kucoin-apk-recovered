.class public Lcom/facebook/react/viewmanagers/ModalHostViewManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "ModalHostViewManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface<",
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
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
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
    const-string v2, "animationType"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v1, 0x9

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v2, "hardwareAccelerated"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 v1, 0x8

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v2, "navigationBarTranslucent"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    move-result v2

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v1, 0x7

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :sswitch_3
    const-string/jumbo v2, "visible"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    move-result v2

    .line 61
    .line 62
    if-nez v2, :cond_3

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const/4 v1, 0x6

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :sswitch_4
    const-string v2, "animated"

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    move-result v2

    .line 72
    .line 73
    if-nez v2, :cond_4

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const/4 v1, 0x5

    .line 76
    goto :goto_0

    .line 77
    .line 78
    .line 79
    :sswitch_5
    const-string/jumbo v2, "statusBarTranslucent"

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    move-result v2

    .line 84
    .line 85
    if-nez v2, :cond_5

    .line 86
    goto :goto_0

    .line 87
    :cond_5
    const/4 v1, 0x4

    .line 88
    goto :goto_0

    .line 89
    .line 90
    :sswitch_6
    const-string v2, "identifier"

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v2

    .line 95
    .line 96
    if-nez v2, :cond_6

    .line 97
    goto :goto_0

    .line 98
    :cond_6
    const/4 v1, 0x3

    .line 99
    goto :goto_0

    .line 100
    .line 101
    .line 102
    :sswitch_7
    const-string/jumbo v2, "transparent"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v2

    .line 107
    .line 108
    if-nez v2, :cond_7

    .line 109
    goto :goto_0

    .line 110
    :cond_7
    const/4 v1, 0x2

    .line 111
    goto :goto_0

    .line 112
    .line 113
    .line 114
    :sswitch_8
    const-string/jumbo v2, "supportedOrientations"

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    move-result v2

    .line 119
    .line 120
    if-nez v2, :cond_8

    .line 121
    goto :goto_0

    .line 122
    :cond_8
    const/4 v1, 0x1

    .line 123
    goto :goto_0

    .line 124
    .line 125
    .line 126
    :sswitch_9
    const-string/jumbo v2, "presentationStyle"

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    move-result v2

    .line 131
    .line 132
    if-nez v2, :cond_9

    .line 133
    goto :goto_0

    .line 134
    :cond_9
    move v1, v0

    .line 135
    .line 136
    .line 137
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 138
    .line 139
    .line 140
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    return-void

    .line 142
    .line 143
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 144
    .line 145
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 146
    .line 147
    check-cast p3, Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setAnimationType(Landroid/view/View;Ljava/lang/String;)V

    .line 151
    return-void

    .line 152
    .line 153
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 154
    .line 155
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 156
    .line 157
    if-nez p3, :cond_a

    .line 158
    goto :goto_1

    .line 159
    .line 160
    :cond_a
    check-cast p3, Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 164
    move-result v0

    .line 165
    .line 166
    .line 167
    :goto_1
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setHardwareAccelerated(Landroid/view/View;Z)V

    .line 168
    return-void

    .line 169
    .line 170
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 171
    .line 172
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 173
    .line 174
    if-nez p3, :cond_b

    .line 175
    goto :goto_2

    .line 176
    .line 177
    :cond_b
    check-cast p3, Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    move-result v0

    .line 182
    .line 183
    .line 184
    :goto_2
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setNavigationBarTranslucent(Landroid/view/View;Z)V

    .line 185
    return-void

    .line 186
    .line 187
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 188
    .line 189
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 190
    .line 191
    if-nez p3, :cond_c

    .line 192
    goto :goto_3

    .line 193
    .line 194
    :cond_c
    check-cast p3, Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 198
    move-result v0

    .line 199
    .line 200
    .line 201
    :goto_3
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setVisible(Landroid/view/View;Z)V

    .line 202
    return-void

    .line 203
    .line 204
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 205
    .line 206
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 207
    .line 208
    if-nez p3, :cond_d

    .line 209
    goto :goto_4

    .line 210
    .line 211
    :cond_d
    check-cast p3, Ljava/lang/Boolean;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 215
    move-result v0

    .line 216
    .line 217
    .line 218
    :goto_4
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setAnimated(Landroid/view/View;Z)V

    .line 219
    return-void

    .line 220
    .line 221
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 222
    .line 223
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 224
    .line 225
    if-nez p3, :cond_e

    .line 226
    goto :goto_5

    .line 227
    .line 228
    :cond_e
    check-cast p3, Ljava/lang/Boolean;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 232
    move-result v0

    .line 233
    .line 234
    .line 235
    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setStatusBarTranslucent(Landroid/view/View;Z)V

    .line 236
    return-void

    .line 237
    .line 238
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 239
    .line 240
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 241
    .line 242
    if-nez p3, :cond_f

    .line 243
    goto :goto_6

    .line 244
    .line 245
    :cond_f
    check-cast p3, Ljava/lang/Double;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 249
    move-result v0

    .line 250
    .line 251
    .line 252
    :goto_6
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setIdentifier(Landroid/view/View;I)V

    .line 253
    return-void

    .line 254
    .line 255
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 256
    .line 257
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 258
    .line 259
    if-nez p3, :cond_10

    .line 260
    goto :goto_7

    .line 261
    .line 262
    :cond_10
    check-cast p3, Ljava/lang/Boolean;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    move-result v0

    .line 267
    .line 268
    .line 269
    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setTransparent(Landroid/view/View;Z)V

    .line 270
    return-void

    .line 271
    .line 272
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 273
    .line 274
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 275
    .line 276
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 277
    .line 278
    .line 279
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setSupportedOrientations(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 280
    return-void

    .line 281
    .line 282
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 283
    .line 284
    check-cast p2, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;

    .line 285
    .line 286
    check-cast p3, Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/ModalHostViewManagerInterface;->setPresentationStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 290
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x6e5d7149 -> :sswitch_9
        -0x6e46a78f -> :sswitch_8
        -0x66e3a2ae -> :sswitch_7
        -0x60775357 -> :sswitch_6
        -0x44e94228 -> :sswitch_5
        -0x2f65d65d -> :sswitch_4
        0x1bd1f072 -> :sswitch_3
        0x4285947a -> :sswitch_2
        0x4749621f -> :sswitch_1
        0x7911bcde -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
