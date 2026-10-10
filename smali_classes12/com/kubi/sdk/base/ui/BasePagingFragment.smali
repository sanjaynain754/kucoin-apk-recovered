.class public abstract Lcom/kubi/sdk/base/ui/BasePagingFragment;
.super Lcom/kubi/sdk/base/ui/OldBaseFragment;
.source "BasePagingFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/Parcelable;",
        ">",
        "Lcom/kubi/sdk/base/ui/OldBaseFragment;"
    }
.end annotation


# instance fields
.field public U:I

.field public V:Ljava/lang/Boolean;

.field public W:Lio/chad/library/adapter/base/BaseQuickAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/chad/library/adapter/base/BaseQuickAdapter<",
            "TT;",
            "Lio/chad/library/adapter/base/BaseViewHolder;",
            ">;"
        }
    .end annotation
.end field

.field public X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

.field public Y:Lio/reactivex/disposables/Disposable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->U:I

    .line 7
    .line 8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->V:Ljava/lang/Boolean;

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic k3(Lcom/kubi/sdk/base/ui/BasePagingFragment;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    goto :goto_3

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    goto :goto_3

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->setRefreshing(Z)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 35
    .line 36
    new-instance v2, Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addData(Ljava/util/Collection;)V

    .line 43
    .line 44
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 52
    move-result v0

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->loadMoreFail()V

    .line 60
    goto :goto_2

    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 66
    move-result v0

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showEmpty()V

    .line 72
    goto :goto_0

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->u3()Landroid/view/View;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->showContent()V

    .line 82
    .line 83
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->u3()Landroid/view/View;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addFooterView(Landroid/view/View;)I

    .line 91
    .line 92
    :cond_4
    :goto_0
    instance-of v0, p1, Lretrofit2/HttpException;

    .line 93
    .line 94
    if-nez v0, :cond_6

    .line 95
    .line 96
    instance-of v0, p1, Ljava/net/ConnectException;

    .line 97
    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    goto :goto_1

    .line 104
    .line 105
    :cond_5
    sget v0, Lcom/kubi/sdk/R$string;->load_failed_click_retry:I

    .line 106
    .line 107
    sget v2, Lcom/kubi/sdk/R$mipmap;->ic_load_fail:I

    .line 108
    .line 109
    new-instance v3, Lcom/kubi/sdk/base/ui/e;

    .line 110
    .line 111
    .line 112
    invoke-direct {v3, p0}, Lcom/kubi/sdk/base/ui/e;-><init>(Lcom/kubi/sdk/base/ui/BasePagingFragment;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0, v2, v3}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->showEmpty(IILandroid/view/View$OnClickListener;)V

    .line 116
    goto :goto_2

    .line 117
    .line 118
    :cond_6
    :goto_1
    sget v0, Lcom/kubi/sdk/R$string;->network_error:I

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showNetWorkError()V

    .line 125
    .line 126
    .line 127
    :goto_2
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->D3(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->E3(Z)V

    .line 131
    :cond_7
    :goto_3
    return-void
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
.end method

.method public static synthetic l3(Lcom/kubi/sdk/base/ui/BasePagingFragment;Lcom/kubi/sdk/base/entity/BasePageEntity;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_b

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_b

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->getAllowCancelAll()Ljava/lang/Boolean;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->getAllowCancelAll()Ljava/lang/Boolean;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    iput-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->V:Ljava/lang/Boolean;

    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->isHasNext()Z

    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    const/4 v3, 0x1

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->getItems()Ljava/util/List;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 60
    move-result v1

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    move v1, v3

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    move v1, v2

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setEnableLoadMore(Z)V

    .line 69
    .line 70
    iget v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->U:I

    .line 71
    .line 72
    if-ne v0, v3, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->setRefreshing(Z)V

    .line 78
    .line 79
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->getItems()Ljava/util/List;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->q3(Ljava/util/List;)Ljava/util/Collection;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_4
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->getItems()Ljava/util/List;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->q3(Ljava/util/List;)Ljava/util/Collection;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addData(Ljava/util/Collection;)V

    .line 105
    .line 106
    .line 107
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->z3()Z

    .line 108
    move-result v0

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->getContext()Lcom/kubi/sdk/base/entity/BasePageEntity$BaseContext;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/kubi/sdk/base/entity/BasePageEntity$BaseContext;->getIndex()I

    .line 118
    move-result v0

    .line 119
    .line 120
    iput v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->U:I

    .line 121
    goto :goto_2

    .line 122
    .line 123
    :cond_5
    iget v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->U:I

    .line 124
    add-int/2addr v0, v3

    .line 125
    .line 126
    iput v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->U:I

    .line 127
    .line 128
    :goto_2
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 132
    move-result-object v0

    .line 133
    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 136
    move-result v0

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->y3()I

    .line 140
    move-result v1

    .line 141
    .line 142
    if-ge v0, v1, :cond_9

    .line 143
    .line 144
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 145
    .line 146
    iget v1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->U:I

    .line 147
    .line 148
    if-ne v1, v3, :cond_6

    .line 149
    move v2, v3

    .line 150
    .line 151
    .line 152
    :cond_6
    invoke-virtual {v0, v2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->loadMoreEnd(Z)V

    .line 153
    .line 154
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 162
    move-result v0

    .line 163
    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 170
    move-result p1

    .line 171
    .line 172
    if-nez p1, :cond_7

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showEmpty()V

    .line 176
    goto :goto_3

    .line 177
    .line 178
    .line 179
    :cond_7
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->u3()Landroid/view/View;

    .line 180
    move-result-object p1

    .line 181
    .line 182
    if-eqz p1, :cond_a

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->showContent()V

    .line 186
    .line 187
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->u3()Landroid/view/View;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addFooterView(Landroid/view/View;)I

    .line 195
    goto :goto_3

    .line 196
    .line 197
    .line 198
    :cond_8
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->showContent()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->w3()Landroid/view/View;

    .line 202
    move-result-object v0

    .line 203
    .line 204
    if-eqz v0, :cond_a

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->isHasNext()Z

    .line 208
    move-result p1

    .line 209
    .line 210
    if-nez p1, :cond_a

    .line 211
    .line 212
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->w3()Landroid/view/View;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addFooterView(Landroid/view/View;)I

    .line 220
    goto :goto_3

    .line 221
    .line 222
    :cond_9
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->loadMoreComplete()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->showContent()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->w3()Landroid/view/View;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    if-eqz v0, :cond_a

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1}, Lcom/kubi/sdk/base/entity/BasePageEntity;->isHasNext()Z

    .line 238
    move-result p1

    .line 239
    .line 240
    if-nez p1, :cond_a

    .line 241
    .line 242
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->w3()Landroid/view/View;

    .line 246
    move-result-object v0

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addFooterView(Landroid/view/View;)I

    .line 250
    .line 251
    .line 252
    :cond_a
    :goto_3
    invoke-virtual {p0, v3}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->E3(Z)V

    .line 253
    :cond_b
    :goto_4
    return-void
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
.end method

.method public static synthetic m3(Lcom/kubi/sdk/base/ui/BasePagingFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

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
.end method

.method public static synthetic n3(Lcom/kubi/sdk/base/ui/BasePagingFragment;Lhb0/f;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

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
.end method


# virtual methods
.method public A3()V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->U:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->y3()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->r3(II)Lio/reactivex/Observable;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->showContent()V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->setRefreshing(Z)V

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->Y:Lio/reactivex/disposables/Disposable;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Lio/reactivex/disposables/Disposable;->dispose()V

    .line 30
    .line 31
    :cond_1
    new-instance v1, Lcom/kubi/sdk/base/ui/c;

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, p0}, Lcom/kubi/sdk/base/ui/c;-><init>(Lcom/kubi/sdk/base/ui/BasePagingFragment;)V

    .line 35
    .line 36
    new-instance v2, Lcom/kubi/sdk/base/ui/d;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, p0}, Lcom/kubi/sdk/base/ui/d;-><init>(Lcom/kubi/sdk/base/ui/BasePagingFragment;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    iput-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->Y:Lio/reactivex/disposables/Disposable;

    .line 46
    return-void
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
.end method

.method public B3()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public C3()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public D3(Ljava/lang/Throwable;)V
    .locals 0

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

.method public E3(Z)V
    .locals 0

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

.method public F3()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->p3()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->U:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->A3()V

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showEmpty()V

    .line 17
    return-void
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

.method public G3()V
    .locals 0

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

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/sdk/R$layout;->view_swipe_refresh_view:I

    .line 3
    return v0
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

.method public abstract o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/chad/library/adapter/base/BaseViewHolder;",
            "TT;)V"
        }
    .end annotation
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget p2, Lcom/kubi/sdk/R$id;->m_swipe_recycler_view:I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 14
    .line 15
    new-instance p1, Lcom/kubi/sdk/base/ui/BasePagingFragment$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->x3()I

    .line 19
    move-result p2

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p0, p2}, Lcom/kubi/sdk/base/ui/BasePagingFragment$a;-><init>(Lcom/kubi/sdk/base/ui/BasePagingFragment;I)V

    .line 23
    .line 24
    iput-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 25
    .line 26
    new-instance p2, Lcom/kubi/resources/widget/g1;

    .line 27
    .line 28
    .line 29
    invoke-direct {p2}, Lcom/kubi/resources/widget/g1;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setLoadMoreView(Lio/chad/library/adapter/base/loadmore/LoadMoreView;)V

    .line 33
    .line 34
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 35
    .line 36
    new-instance p2, Lcom/kubi/sdk/base/ui/a;

    .line 37
    .line 38
    .line 39
    invoke-direct {p2, p0}, Lcom/kubi/sdk/base/ui/a;-><init>(Lcom/kubi/sdk/base/ui/BasePagingFragment;)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setOnLoadMoreListener(Lio/chad/library/adapter/base/BaseQuickAdapter$RequestLoadMoreListener;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 49
    .line 50
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    iget-object p2, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 60
    .line 61
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 62
    .line 63
    new-instance p2, Lcom/kubi/sdk/base/ui/b;

    .line 64
    .line 65
    .line 66
    invoke-direct {p2, p0}, Lcom/kubi/sdk/base/ui/b;-><init>(Lcom/kubi/sdk/base/ui/BasePagingFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setOnRefreshListener(Ljb0/g;)Lhb0/f;

    .line 70
    .line 71
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->y3()I

    .line 75
    move-result p2

    .line 76
    .line 77
    div-int/lit8 p2, p2, 0x2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setPreLoadNumber(I)V

    .line 81
    .line 82
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 86
    move-result-object p1

    .line 87
    const/4 p2, 0x0

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showLoading()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->G3()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->B3()Z

    .line 100
    move-result p1

    .line 101
    .line 102
    if-eqz p1, :cond_0

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

    .line 106
    :cond_0
    return-void
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
.end method

.method public p3()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public q3(Ljava/util/List;)Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/Collection<",
            "+TT;>;"
        }
    .end annotation

    .line 1
    return-object p1
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

.method public abstract r3(II)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public s3()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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

.method public showContent()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showContent()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->removeAllFooterView()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->C3()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 19
    .line 20
    sget v2, Lcom/kubi/sdk/R$color;->c_background:I

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 28
    :cond_0
    return-void
    .line 29
    .line 30
.end method

.method public showEmpty(IILandroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showEmpty(IILandroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->C3()Z

    .line 7
    move-result p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 12
    .line 13
    iget-object p2, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 14
    .line 15
    sget p3, Lcom/kubi/sdk/R$color;->c_overlay:I

    .line 16
    .line 17
    .line 18
    invoke-static {p2, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 19
    move-result p2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 23
    :cond_0
    return-void
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
.end method

.method public t3()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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

.method public u3()Landroid/view/View;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->C3()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->X:Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    sget v2, Lcom/kubi/sdk/R$color;->c_overlay:I

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 16
    move-result v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 22
    .line 23
    sget v1, Lcom/kubi/sdk/R$layout;->view_empty:I

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sget v1, Lcom/kubi/sdk/R$id;->empty_icon:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    check-cast v2, Landroid/widget/ImageView;

    .line 37
    .line 38
    sget v3, Lcom/kubi/sdk/R$drawable;->ic2_common_empty:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->s3()I

    .line 45
    move-result v2

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Landroid/widget/ImageView;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->s3()I

    .line 57
    move-result v2

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->t3()I

    .line 64
    move-result v1

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    sget v1, Lcom/kubi/sdk/R$id;->empty_tips:I

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    check-cast v1, Landroid/widget/TextView;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->t3()I

    .line 78
    move-result v2

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 82
    :cond_2
    return-object v0
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
.end method

.method public v3()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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

.method public w3()Landroid/view/View;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->v3()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 10
    .line 11
    sget v2, Lcom/kubi/sdk/R$layout;->view_end:I

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget v1, Lcom/kubi/sdk/R$id;->tv_end:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Landroid/widget/TextView;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->v3()I

    .line 27
    move-result v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 31
    return-object v0

    .line 32
    :cond_0
    return-object v1
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
.end method

.method public abstract x3()I
.end method

.method public y3()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xa

    .line 3
    return v0
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

.method public z3()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
