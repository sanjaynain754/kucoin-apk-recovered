.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/v;
.super Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/v;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;-><init>()V

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
.method public final onFriendInfoChanged(Ljava/util/List;)V
    .locals 29

    .line 1
    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/v;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 7
    .line 8
    .line 9
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v3

    .line 15
    .line 16
    if-eqz v3, :cond_8

    .line 17
    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    check-cast v3, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v5, "c2c_"

    .line 30
    .line 31
    .line 32
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserID()Ljava/lang/String;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getFriendRemark()Ljava/lang/String;

    .line 47
    move-result-object v5

    .line 48
    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 53
    move-result v5

    .line 54
    .line 55
    if-nez v5, :cond_1

    .line 56
    goto :goto_2

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getFriendRemark()Ljava/lang/String;

    .line 60
    move-result-object v3

    .line 61
    :goto_1
    move-object v10, v3

    .line 62
    goto :goto_4

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_2
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserProfile()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 66
    move-result-object v5

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    .line 70
    move-result-object v5

    .line 71
    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    .line 75
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 76
    move-result v5

    .line 77
    .line 78
    if-nez v5, :cond_3

    .line 79
    goto :goto_3

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserProfile()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    .line 87
    move-result-object v3

    .line 88
    goto :goto_1

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_3
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserID()Ljava/lang/String;

    .line 92
    move-result-object v3

    .line 93
    goto :goto_1

    .line 94
    .line 95
    :goto_4
    iget-object v3, v1, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->e:Lkotlinx/coroutines/flow/n;

    .line 96
    .line 97
    .line 98
    :goto_5
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 99
    move-result-object v5

    .line 100
    move-object v6, v5

    .line 101
    .line 102
    check-cast v6, Ljava/util/List;

    .line 103
    .line 104
    new-instance v7, Ljava/util/ArrayList;

    .line 105
    .line 106
    const/16 v8, 0xa

    .line 107
    .line 108
    .line 109
    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 110
    move-result v8

    .line 111
    .line 112
    .line 113
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    move-result-object v26

    .line 118
    .line 119
    .line 120
    :goto_6
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    move-result v6

    .line 122
    .line 123
    if-eqz v6, :cond_6

    .line 124
    .line 125
    .line 126
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    move-result-object v6

    .line 128
    .line 129
    check-cast v6, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getConversationID()Ljava/lang/String;

    .line 133
    move-result-object v8

    .line 134
    .line 135
    .line 136
    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    move-result v8

    .line 138
    .line 139
    if-eqz v8, :cond_5

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getTitle()Ljava/lang/String;

    .line 143
    move-result-object v8

    .line 144
    .line 145
    .line 146
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    move-result v8

    .line 148
    .line 149
    if-nez v8, :cond_5

    .line 150
    .line 151
    .line 152
    const v24, 0xffef

    .line 153
    .line 154
    const/16 v25, 0x0

    .line 155
    move-object v8, v5

    .line 156
    move-object v5, v6

    .line 157
    const/4 v6, 0x0

    .line 158
    move-object v9, v7

    .line 159
    const/4 v7, 0x0

    .line 160
    move-object v11, v8

    .line 161
    const/4 v8, 0x0

    .line 162
    move-object v12, v9

    .line 163
    const/4 v9, 0x0

    .line 164
    move-object v13, v11

    .line 165
    const/4 v11, 0x0

    .line 166
    move-object v14, v12

    .line 167
    const/4 v12, 0x0

    .line 168
    move-object v15, v13

    .line 169
    .line 170
    move-object/from16 v16, v14

    .line 171
    .line 172
    const-wide/16 v13, 0x0

    .line 173
    .line 174
    move-object/from16 v17, v15

    .line 175
    const/4 v15, 0x0

    .line 176
    .line 177
    move-object/from16 v18, v16

    .line 178
    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    move-object/from16 v19, v17

    .line 182
    .line 183
    move-object/from16 v20, v18

    .line 184
    .line 185
    const-wide/16 v17, 0x0

    .line 186
    .line 187
    move-object/from16 v21, v19

    .line 188
    .line 189
    const/16 v19, 0x0

    .line 190
    .line 191
    move-object/from16 v22, v20

    .line 192
    .line 193
    const/16 v20, 0x0

    .line 194
    .line 195
    move-object/from16 v23, v21

    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    move-object/from16 v27, v22

    .line 200
    .line 201
    const/16 v22, 0x0

    .line 202
    .line 203
    move-object/from16 v28, v23

    .line 204
    .line 205
    const/16 v23, 0x0

    .line 206
    .line 207
    move-object/from16 v0, v27

    .line 208
    .line 209
    move-object/from16 v27, v1

    .line 210
    move-object v1, v0

    .line 211
    .line 212
    move-object/from16 v0, v28

    .line 213
    .line 214
    .line 215
    invoke-static/range {v5 .. v25}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;JIZJLio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMConversation;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 216
    move-result-object v6

    .line 217
    goto :goto_7

    .line 218
    .line 219
    :cond_5
    move-object/from16 v27, v1

    .line 220
    move-object v0, v5

    .line 221
    move-object v5, v6

    .line 222
    move-object v1, v7

    .line 223
    move-object v6, v5

    .line 224
    .line 225
    .line 226
    :goto_7
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 227
    move-object v5, v0

    .line 228
    move-object v7, v1

    .line 229
    .line 230
    move-object/from16 v1, v27

    .line 231
    .line 232
    move-object/from16 v0, p0

    .line 233
    goto :goto_6

    .line 234
    .line 235
    :cond_6
    move-object/from16 v27, v1

    .line 236
    move-object v0, v5

    .line 237
    move-object v1, v7

    .line 238
    .line 239
    .line 240
    invoke-interface {v3, v0, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    move-result v0

    .line 242
    .line 243
    if-eqz v0, :cond_7

    .line 244
    .line 245
    move-object/from16 v0, p0

    .line 246
    .line 247
    move-object/from16 v1, v27

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_7
    move-object/from16 v0, p0

    .line 252
    .line 253
    move-object/from16 v1, v27

    .line 254
    .line 255
    goto/16 :goto_5

    .line 256
    :cond_8
    return-void
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
.end method
