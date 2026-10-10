.class public final Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;
.super Ljava/lang/Object;
.source "ShowSignProtocolDialogHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0011H\u0082@\u00a2\u0006\u0002\u0010\u0015J0\u0010\u0016\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u00020\u001c*\u00020\u001d2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006!"
    }
    d2 = {
        "Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "MAX_PROTOCOL_COUNT",
        "",
        "baseSupportUrl",
        "getBaseSupportUrl",
        "()Ljava/lang/String;",
        "showSignProtocolDialogs",
        "",
        "signTermListJson",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "showSignProtocolLinkDialogList",
        "protocolLinkItemList",
        "",
        "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;",
        "protocolContentItemList",
        "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;",
        "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "showSignProtocolContentDialogList",
        "",
        "activeIndex",
        "isFromFirstStep",
        "(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "configLinkProtocolContent",
        "",
        "Lcom/kubi/resources/widget/BaseTextView;",
        "linkProtocolList",
        "linkListName",
        "protocolLinkDialogPageId",
        "UserCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nShowSignProtocolDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowSignProtocolDialogHelper.kt\ncom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,157:1\n1563#2:158\n1634#2,3:159\n37#3:162\n36#3,3:163\n37#3:166\n36#3,3:167\n*S KotlinDebug\n*F\n+ 1 ShowSignProtocolDialogHelper.kt\ncom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper\n*L\n124#1:158\n124#1:159,3\n124#1:162\n124#1:163,3\n155#1:166\n155#1:167,3\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;->a:Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;

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
.end method

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
.end method

.method public static final synthetic a(Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;->e()Ljava/lang/String;

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
.end method

.method public static final synthetic b(Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;->f(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic c(Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;->h(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method


# virtual methods
.method public final d(Lcom/kubi/resources/widget/BaseTextView;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .param p1    # Lcom/kubi/resources/widget/BaseTextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/resources/widget/BaseTextView;",
            "Ljava/util/List<",
            "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "linkProtocolList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "linkListName"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "protocolLinkDialogPageId"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    const/4 v2, 0x4

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 30
    move-result v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object p3

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    const-string v3, "string"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p3, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    move-result p3

    .line 68
    .line 69
    .line 70
    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    new-instance v2, Ljava/util/ArrayList;

    .line 74
    .line 75
    const/16 v3, 0xa

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 79
    move-result v3

    .line 80
    .line 81
    .line 82
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    move-result v3

    .line 91
    .line 92
    if-eqz v3, :cond_1

    .line 93
    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    move-result-object v3

    .line 97
    .line 98
    check-cast v3, Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;->getProtocolName()Ljava/lang/String;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    if-nez v3, :cond_0

    .line 105
    .line 106
    const-string v3, ""

    .line 107
    .line 108
    .line 109
    :cond_0
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const/4 v1, 0x0

    .line 112
    .line 113
    new-array v3, v1, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    check-cast v2, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 123
    move-result-object v3

    .line 124
    array-length v4, v2

    .line 125
    .line 126
    .line 127
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, p3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    move-result-object p3

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    sget-object p3, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 138
    .line 139
    sget-object v2, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN1:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 140
    .line 141
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN2:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 142
    .line 143
    sget-object v4, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN3:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 144
    .line 145
    .line 146
    filled-new-array {p3, v2, v3, v4}, [Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 147
    move-result-object p3

    .line 148
    .line 149
    new-instance v2, Ljava/util/ArrayList;

    .line 150
    .line 151
    .line 152
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 153
    move v3, v1

    .line 154
    .line 155
    :goto_1
    if-ge v3, v0, :cond_3

    .line 156
    .line 157
    .line 158
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    move-result-object v4

    .line 160
    .line 161
    check-cast v4, Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;

    .line 162
    .line 163
    .line 164
    invoke-static {p3, v3}, Lkotlin/collections/ArraysKt;->getOrNull([Ljava/lang/Object;I)Ljava/lang/Object;

    .line 165
    move-result-object v5

    .line 166
    .line 167
    check-cast v5, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 168
    .line 169
    if-nez v5, :cond_2

    .line 170
    .line 171
    sget-object v5, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 172
    .line 173
    :cond_2
    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    .line 174
    .line 175
    sget-object v7, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 176
    .line 177
    sget v8, Lcom/kubi/user/R$color;->c_text:I

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v8}, Lcom/kubi/utils/c;->a(I)I

    .line 181
    move-result v7

    .line 182
    .line 183
    .line 184
    invoke-direct {v6, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 188
    move-result-object v6

    .line 189
    .line 190
    .line 191
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    new-instance v6, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$c;

    .line 194
    .line 195
    .line 196
    invoke-direct {v6, v4, p4}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$c;-><init>(Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;Ljava/lang/String;)V

    .line 197
    .line 198
    new-instance v4, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$b;

    .line 199
    .line 200
    .line 201
    invoke-direct {v4, v8, v6}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$b;-><init>(ILcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$c;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 205
    move-result-object v4

    .line 206
    .line 207
    .line 208
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    add-int/lit8 v3, v3, 0x1

    .line 211
    goto :goto_1

    .line 212
    .line 213
    :cond_3
    sget-object p2, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 214
    .line 215
    new-array p3, v1, [Lkotlin/Pair;

    .line 216
    .line 217
    .line 218
    invoke-interface {v2, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 219
    move-result-object p3

    .line 220
    .line 221
    check-cast p3, [Lkotlin/Pair;

    .line 222
    array-length p4, p3

    .line 223
    .line 224
    .line 225
    invoke-static {p3, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 226
    move-result-object p3

    .line 227
    .line 228
    check-cast p3, [Lkotlin/Pair;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2, p1, p3}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 232
    return-void
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
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->m()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "/support"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    return-object v0
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
.end method

.method public final f(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;",
            ">;IZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p4, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p4

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p4}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;-><init>(Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p4, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->label:I

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    if-eq v2, v6, :cond_3

    .line 41
    .line 42
    if-eq v2, v5, :cond_2

    .line 43
    .line 44
    if-ne v2, v4, :cond_1

    .line 45
    .line 46
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$2:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 49
    .line 50
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 53
    .line 54
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/util/List;

    .line 57
    .line 58
    .line 59
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    return-object p4

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    throw p1

    .line 69
    .line 70
    :cond_2
    iget p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->I$1:I

    .line 71
    .line 72
    iget-boolean p2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->Z$0:Z

    .line 73
    .line 74
    iget p3, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->I$0:I

    .line 75
    .line 76
    iget-object v2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 79
    .line 80
    iget-object v5, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Ljava/util/List;

    .line 83
    .line 84
    .line 85
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 86
    goto :goto_2

    .line 87
    .line 88
    :cond_3
    iget-boolean p3, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->Z$0:Z

    .line 89
    .line 90
    iget p2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->I$0:I

    .line 91
    .line 92
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Ljava/util/List;

    .line 95
    .line 96
    .line 97
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    goto :goto_1

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 102
    .line 103
    sget-object p4, Lcom/kubi/user/protocol/text/SignProtocolContentDialog;->t0:Lcom/kubi/user/protocol/text/SignProtocolContentDialog$Companion;

    .line 104
    .line 105
    iput-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$0:Ljava/lang/Object;

    .line 106
    .line 107
    iput p2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->I$0:I

    .line 108
    .line 109
    iput-boolean p3, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->Z$0:Z

    .line 110
    .line 111
    iput v6, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->label:I

    .line 112
    .line 113
    .line 114
    invoke-virtual {p4, p1, p2, p3, v0}, Lcom/kubi/user/protocol/text/SignProtocolContentDialog$Companion;->show(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 115
    move-result-object p4

    .line 116
    .line 117
    if-ne p4, v1, :cond_5

    .line 118
    goto :goto_3

    .line 119
    .line 120
    :cond_5
    :goto_1
    check-cast p4, Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 124
    move-result-object v2

    .line 125
    .line 126
    check-cast v2, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 130
    move-result-object p4

    .line 131
    .line 132
    check-cast p4, Ljava/lang/Number;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 136
    move-result p4

    .line 137
    .line 138
    sget-object v7, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$a;->$EnumSwitchMapping$0:[I

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 142
    move-result v8

    .line 143
    .line 144
    aget v7, v7, v8

    .line 145
    .line 146
    if-eq v7, v6, :cond_a

    .line 147
    .line 148
    if-eq v7, v5, :cond_8

    .line 149
    .line 150
    if-ne v7, v4, :cond_9

    .line 151
    .line 152
    sget-object v7, Lcom/kubi/user/protocol/text/SignProtocolContentRetainDialog;->t0:Lcom/kubi/user/protocol/text/SignProtocolContentRetainDialog$Companion;

    .line 153
    .line 154
    iput-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    move-result-object v8

    .line 159
    .line 160
    iput-object v8, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$1:Ljava/lang/Object;

    .line 161
    .line 162
    iput p2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->I$0:I

    .line 163
    .line 164
    iput-boolean p3, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->Z$0:Z

    .line 165
    .line 166
    iput p4, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->I$1:I

    .line 167
    .line 168
    iput v5, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->label:I

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, p1, p4, v0}, Lcom/kubi/user/protocol/text/SignProtocolContentRetainDialog$Companion;->show(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 172
    move-result-object v5

    .line 173
    .line 174
    if-ne v5, v1, :cond_6

    .line 175
    goto :goto_3

    .line 176
    :cond_6
    move-object v9, v5

    .line 177
    move-object v5, p1

    .line 178
    move p1, p4

    .line 179
    move-object p4, v9

    .line 180
    move v9, p3

    .line 181
    move p3, p2

    .line 182
    move p2, v9

    .line 183
    .line 184
    :goto_2
    check-cast p4, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 185
    .line 186
    sget-object v7, Lcom/kubi/user/protocol/entity/SignProtocolResult;->AGREED:Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 187
    .line 188
    if-ne p4, v7, :cond_8

    .line 189
    .line 190
    .line 191
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    move-result-object v6

    .line 193
    .line 194
    iput-object v6, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$0:Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    move-result-object v2

    .line 199
    .line 200
    iput-object v2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$1:Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    move-result-object p4

    .line 205
    .line 206
    iput-object p4, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->L$2:Ljava/lang/Object;

    .line 207
    .line 208
    iput p3, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->I$0:I

    .line 209
    .line 210
    iput-boolean p2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->Z$0:Z

    .line 211
    .line 212
    iput p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->I$1:I

    .line 213
    .line 214
    iput v4, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolContentDialogList$1;->label:I

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v5, p1, v3, v0}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;->f(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 218
    move-result-object p1

    .line 219
    .line 220
    if-ne p1, v1, :cond_7

    .line 221
    :goto_3
    return-object v1

    .line 222
    :cond_7
    return-object p1

    .line 223
    :cond_8
    move v3, v6

    .line 224
    goto :goto_4

    .line 225
    .line 226
    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 227
    .line 228
    .line 229
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 230
    throw p1

    .line 231
    .line 232
    .line 233
    :cond_a
    :goto_4
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 234
    move-result-object p1

    .line 235
    return-object p1
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
.end method

.method public final g(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolDialogs$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolDialogs$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public final h(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;-><init>(Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->label:I

    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    if-eq v2, v7, :cond_4

    .line 42
    .line 43
    if-eq v2, v6, :cond_1

    .line 44
    .line 45
    if-eq v2, v5, :cond_3

    .line 46
    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$3:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 52
    .line 53
    :cond_1
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 56
    .line 57
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ljava/util/List;

    .line 60
    .line 61
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Ljava/util/List;

    .line 64
    .line 65
    .line 66
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    return-object p3

    .line 68
    .line 69
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    throw p1

    .line 76
    .line 77
    :cond_3
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$2:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 80
    .line 81
    iget-object p2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$1:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Ljava/util/List;

    .line 84
    .line 85
    iget-object v2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Ljava/util/List;

    .line 88
    .line 89
    .line 90
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    goto :goto_2

    .line 92
    .line 93
    :cond_4
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$1:Ljava/lang/Object;

    .line 94
    move-object p2, p1

    .line 95
    .line 96
    check-cast p2, Ljava/util/List;

    .line 97
    .line 98
    iget-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Ljava/util/List;

    .line 101
    .line 102
    .line 103
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 104
    goto :goto_1

    .line 105
    .line 106
    .line 107
    :cond_5
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 108
    .line 109
    sget-object p3, Lcom/kubi/user/protocol/link/SignProtocolLinkDialog;->t0:Lcom/kubi/user/protocol/link/SignProtocolLinkDialog$Companion;

    .line 110
    .line 111
    iput-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object p2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$1:Ljava/lang/Object;

    .line 114
    .line 115
    iput v7, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->label:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3, p1, v0}, Lcom/kubi/user/protocol/link/SignProtocolLinkDialog$Companion;->show(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    move-result-object p3

    .line 120
    .line 121
    if-ne p3, v1, :cond_6

    .line 122
    .line 123
    goto/16 :goto_3

    .line 124
    .line 125
    :cond_6
    :goto_1
    check-cast p3, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 126
    .line 127
    sget-object v2, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$a;->$EnumSwitchMapping$0:[I

    .line 128
    .line 129
    .line 130
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 131
    move-result v8

    .line 132
    .line 133
    aget v2, v2, v8

    .line 134
    .line 135
    if-eq v2, v7, :cond_d

    .line 136
    .line 137
    if-eq v2, v6, :cond_b

    .line 138
    .line 139
    if-ne v2, v5, :cond_a

    .line 140
    .line 141
    sget-object v2, Lcom/kubi/user/protocol/link/SignProtocolLinkRetainDialog;->t0:Lcom/kubi/user/protocol/link/SignProtocolLinkRetainDialog$Companion;

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    move-result-object v6

    .line 146
    .line 147
    iput-object v6, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object p2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$1:Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    move-result-object v6

    .line 154
    .line 155
    iput-object v6, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$2:Ljava/lang/Object;

    .line 156
    .line 157
    iput v5, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->label:I

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, p1, v0}, Lcom/kubi/user/protocol/link/SignProtocolLinkRetainDialog$Companion;->show(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 161
    move-result-object v2

    .line 162
    .line 163
    if-ne v2, v1, :cond_7

    .line 164
    goto :goto_3

    .line 165
    :cond_7
    move-object v9, v2

    .line 166
    move-object v2, p1

    .line 167
    move-object p1, p3

    .line 168
    move-object p3, v9

    .line 169
    .line 170
    :goto_2
    check-cast p3, Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 171
    .line 172
    sget-object v5, Lcom/kubi/user/protocol/entity/SignProtocolResult;->AGREED:Lcom/kubi/user/protocol/entity/SignProtocolResult;

    .line 173
    .line 174
    if-ne p3, v5, :cond_9

    .line 175
    .line 176
    .line 177
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 178
    move-result v5

    .line 179
    .line 180
    if-nez v5, :cond_9

    .line 181
    .line 182
    .line 183
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    move-result-object v2

    .line 185
    .line 186
    iput-object v2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$0:Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    move-result-object v2

    .line 191
    .line 192
    iput-object v2, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$1:Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    move-result-object p1

    .line 197
    .line 198
    iput-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$2:Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    iput-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$3:Ljava/lang/Object;

    .line 205
    .line 206
    iput v3, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->label:I

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p2, v4, v7, v0}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;->f(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 210
    move-result-object p1

    .line 211
    .line 212
    if-ne p1, v1, :cond_8

    .line 213
    goto :goto_3

    .line 214
    :cond_8
    return-object p1

    .line 215
    :cond_9
    move v4, v7

    .line 216
    goto :goto_4

    .line 217
    .line 218
    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 219
    .line 220
    .line 221
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 222
    throw p1

    .line 223
    .line 224
    .line 225
    :cond_b
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 226
    move-result v2

    .line 227
    .line 228
    if-nez v2, :cond_9

    .line 229
    .line 230
    .line 231
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    move-result-object p1

    .line 233
    .line 234
    iput-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$0:Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    move-result-object p1

    .line 239
    .line 240
    iput-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$1:Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    move-result-object p1

    .line 245
    .line 246
    iput-object p1, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->L$2:Ljava/lang/Object;

    .line 247
    .line 248
    iput v6, v0, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper$showSignProtocolLinkDialogList$1;->label:I

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, p2, v4, v7, v0}, Lcom/kubi/user/protocol/helper/ShowSignProtocolDialogHelper;->f(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 252
    move-result-object p1

    .line 253
    .line 254
    if-ne p1, v1, :cond_c

    .line 255
    :goto_3
    return-object v1

    .line 256
    :cond_c
    return-object p1

    .line 257
    .line 258
    .line 259
    :cond_d
    :goto_4
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 260
    move-result-object p1

    .line 261
    return-object p1
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
.end method
