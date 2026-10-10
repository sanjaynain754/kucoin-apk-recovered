.class public abstract Lio/trtc/tuikit/atomicxcore/impl/conversation/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/tencent/imsdk/v2/V2TIMConversation;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;
    .locals 20

    .line 1
    .line 2
    const-string v0, "imConversation"

    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getGroupAtInfoList()Ljava/util/List;

    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    move-result v3

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v2

    .line 23
    .line 24
    :goto_0
    if-eqz v0, :cond_2

    .line 25
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v4, 0xa

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 32
    move-result v4

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    move-result v4

    .line 44
    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;

    .line 52
    .line 53
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtInfo;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;->getSeq()J

    .line 57
    move-result-wide v6

    .line 58
    .line 59
    sget-object v8, Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtType;->Companion:Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtType$Companion;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMGroupAtInfo;->getAtType()I

    .line 63
    move-result v4

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8, v4}, Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtType$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtType;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    .line 70
    invoke-direct {v5, v6, v7, v4}, Lio/trtc/tuikit/atomicxcore/api/conversation/GroupAtInfo;-><init>(JLio/trtc/tuikit/atomicxcore/api/conversation/GroupAtType;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :cond_1
    move-object/from16 v16, v3

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :cond_2
    move-object/from16 v16, v2

    .line 80
    .line 81
    .line 82
    :goto_2
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getMarkList()Ljava/util/List;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->Companion:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType$Companion;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType$Companion;->parseList(Ljava/util/List;)Ljava/util/List;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    if-nez v0, :cond_4

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    :cond_4
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->UNREAD:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 103
    move-result v3

    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getUnreadCount()I

    .line 109
    move-result v3

    .line 110
    .line 111
    if-nez v3, :cond_5

    .line 112
    const/4 v3, 0x1

    .line 113
    :goto_3
    move v11, v3

    .line 114
    move-object v3, v2

    .line 115
    goto :goto_4

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getUnreadCount()I

    .line 119
    move-result v3

    .line 120
    goto :goto_3

    .line 121
    .line 122
    .line 123
    :goto_4
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getConversationID()Ljava/lang/String;

    .line 124
    move-result-object v2

    .line 125
    .line 126
    const-string v4, "getConversationID(...)"

    .line 127
    .line 128
    .line 129
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;->Companion:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType$Companion;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getType()I

    .line 135
    move-result v5

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v5}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    .line 139
    move-result-object v4

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getType()I

    .line 143
    move-result v5

    .line 144
    const/4 v6, 0x2

    .line 145
    .line 146
    if-ne v5, v6, :cond_6

    .line 147
    .line 148
    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/GroupType$Companion;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getGroupType()Ljava/lang/String;

    .line 152
    move-result-object v6

    .line 153
    .line 154
    const-string v7, "getGroupType(...)"

    .line 155
    .line 156
    .line 157
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5, v6}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupType$Companion;->parse(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;

    .line 161
    move-result-object v5

    .line 162
    goto :goto_5

    .line 163
    :cond_6
    move-object v5, v3

    .line 164
    .line 165
    .line 166
    :goto_5
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getFaceUrl()Ljava/lang/String;

    .line 167
    move-result-object v6

    .line 168
    move-object v7, v3

    .line 169
    move-object v3, v4

    .line 170
    move-object v4, v5

    .line 171
    move-object v5, v6

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getShowName()Ljava/lang/String;

    .line 175
    move-result-object v6

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getLastMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 179
    move-result-object v8

    .line 180
    .line 181
    if-eqz v8, :cond_7

    .line 182
    .line 183
    .line 184
    invoke-static {v8}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 185
    move-result-object v7

    .line 186
    .line 187
    .line 188
    :cond_7
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getDraftText()Ljava/lang/String;

    .line 189
    move-result-object v8

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getDraftText()Ljava/lang/String;

    .line 193
    move-result-object v9

    .line 194
    .line 195
    if-eqz v9, :cond_9

    .line 196
    .line 197
    .line 198
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 199
    move-result v9

    .line 200
    .line 201
    if-nez v9, :cond_8

    .line 202
    goto :goto_6

    .line 203
    .line 204
    .line 205
    :cond_8
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getDraftTimestamp()J

    .line 206
    move-result-wide v9

    .line 207
    goto :goto_7

    .line 208
    .line 209
    .line 210
    :cond_9
    :goto_6
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getLastMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 211
    move-result-object v9

    .line 212
    .line 213
    if-eqz v9, :cond_a

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getLastMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 217
    move-result-object v9

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getTimestamp()J

    .line 221
    move-result-wide v9

    .line 222
    goto :goto_7

    .line 223
    .line 224
    :cond_a
    const-wide/16 v9, 0x0

    .line 225
    .line 226
    .line 227
    :goto_7
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->isPinned()Z

    .line 228
    move-result v12

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getOrderKey()J

    .line 232
    move-result-wide v13

    .line 233
    .line 234
    sget-object v15, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt$Companion;

    .line 235
    .line 236
    move-object/from16 v18, v0

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getRecvOpt()I

    .line 240
    move-result v0

    .line 241
    .line 242
    .line 243
    invoke-virtual {v15, v0}, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    .line 244
    move-result-object v15

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getConversationGroupList()Ljava/util/List;

    .line 248
    move-result-object v0

    .line 249
    .line 250
    if-nez v0, :cond_b

    .line 251
    .line 252
    .line 253
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 254
    move-result-object v0

    .line 255
    .line 256
    :cond_b
    move-object/from16 v17, v0

    .line 257
    .line 258
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 259
    .line 260
    move-object/from16 v19, p0

    .line 261
    .line 262
    .line 263
    invoke-direct/range {v1 .. v19}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;JIZJLio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMConversation;)V

    .line 264
    return-object v1
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
