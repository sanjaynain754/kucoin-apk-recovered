.class public Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;
.super Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;
.source "TUICallObserverProxy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TUICallObserverProxy"


# instance fields
.field private final mFunctionMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mMainHandler:Landroid/os/Handler;

.field private final mObserverList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/pipelinebridge/TUIPipelineBridgeObserver;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mObserverList:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mFunctionMap:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v0, Landroid/os/Handler;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mMainHandler:Landroid/os/Handler;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->registerEventHandler()V

    .line 32
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;JLcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, p5

    .line 4
    move-wide p4, p3

    .line 5
    move-object p3, p2

    .line 6
    move-object p2, v0

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p5}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallEnd(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;J)V

    .line 10
    return-void
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
.end method

.method public static synthetic b(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserVideoAvailable(Ljava/lang/String;Z)V

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
.end method

.method private bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mFunctionMap:Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    :cond_1
    :goto_0
    return-void
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
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p4, p0, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallReceived(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;)V

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
.end method

.method public static synthetic d(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserLeave(Ljava/lang/String;)V

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
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p3

    .line 6
    move-object p3, p2

    .line 7
    move-object p2, v0

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p5}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallReceived(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Ljava/lang/String;)V

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
.end method

.method public static synthetic f(Lorg/json/JSONArray;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getQualityInfoListFromJSONArray(Lorg/json/JSONArray;)Ljava/util/List;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserNetworkQualityChanged(Ljava/util/List;)V

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
.end method

.method public static synthetic g(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserInviting(Ljava/lang/String;)V

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
.end method

.method public static synthetic h(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onKickedOffline()V

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
.end method

.method public static synthetic i(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p3, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallBegin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;)V

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
.end method

.method public static synthetic j(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallMediaTypeChanged(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;)V

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
.end method

.method public static synthetic k(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserNoResponse(Ljava/lang/String;)V

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
.end method

.method public static synthetic l(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserSigExpired()V

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
.end method

.method public static synthetic m(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p3

    .line 6
    move-object p3, p2

    .line 7
    move-object p2, v0

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p5}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallReceived(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;)V

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
.end method

.method public static synthetic n(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallCancelled(Ljava/lang/String;)V

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
.end method

.method private notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor<",
            "TR;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mObserverList:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;

    .line 19
    .line 20
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/call/w0;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p1, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/w0;-><init>(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v2}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
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
.end method

.method public static synthetic o(Ljava/lang/Integer;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    move-result p0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0, p1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onError(ILjava/lang/String;)V

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
.end method

.method private onCallBeginHandler(Ljava/lang/String;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    const-class v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 23
    const/4 v2, 0x3

    .line 24
    .line 25
    const-class v3, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v2, v3}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 32
    const/4 v3, 0x4

    .line 33
    .line 34
    const-class v4, Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v3, v4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    check-cast v3, Ljava/lang/String;

    .line 41
    const/4 v5, 0x5

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v5, v4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    new-instance v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;

    .line 50
    .line 51
    .line 52
    invoke-direct {v4}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;-><init>()V

    .line 53
    .line 54
    iput-object v0, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->roomId:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 55
    .line 56
    iput-object v2, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->role:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 57
    .line 58
    iput-object p1, v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->chatGroupId:Ljava/lang/String;

    .line 59
    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    const-string v5, "call_engine - onCallBegin callId:"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v5, ", mediaType:"

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v5, ", extraInfo:"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    const-string v5, "TUICallObserverProxy"

    .line 94
    .line 95
    .line 96
    invoke-static {v5, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/call/c0;

    .line 99
    .line 100
    .line 101
    invoke-direct {p1, v3, v1, v4}, Lcom/tencent/cloud/tuikit/engine/impl/call/c0;-><init>(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 105
    .line 106
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/call/d0;

    .line 107
    .line 108
    .line 109
    invoke-direct {p1, v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/call/d0;-><init>(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 113
    return-void
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
.end method

.method private onCallEndHandler(Ljava/lang/String;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    .line 14
    check-cast v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 15
    const/4 v0, 0x2

    .line 16
    .line 17
    const-class v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    move-object v3, v0

    .line 23
    .line 24
    check-cast v3, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 25
    const/4 v0, 0x3

    .line 26
    .line 27
    const-class v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 34
    const/4 v1, 0x4

    .line 35
    .line 36
    const-class v4, Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v1, v4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    const/4 v5, 0x5

    .line 44
    .line 45
    const-class v6, Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v5, v6}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    check-cast v5, Ljava/lang/Integer;

    .line 52
    const/4 v6, 0x6

    .line 53
    .line 54
    const-class v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v6, v7}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    check-cast v6, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;

    .line 61
    const/4 v7, 0x7

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v7, v4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 65
    move-result-object v7

    .line 66
    .line 67
    check-cast v7, Ljava/lang/String;

    .line 68
    .line 69
    const/16 v8, 0x8

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v8, v4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v5, :cond_0

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Integer;->longValue()J

    .line 81
    move-result-wide v4

    .line 82
    :goto_0
    move-wide v8, v4

    .line 83
    goto :goto_1

    .line 84
    .line 85
    :cond_0
    const-wide/16 v4, 0x0

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :goto_1
    new-instance v10, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;

    .line 89
    .line 90
    .line 91
    invoke-direct {v10}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;-><init>()V

    .line 92
    .line 93
    iput-object v2, v10, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->roomId:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 94
    .line 95
    iput-object v0, v10, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->role:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 96
    .line 97
    iput-object p1, v10, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->chatGroupId:Ljava/lang/String;

    .line 98
    .line 99
    new-instance p1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    const-string v4, "call_engine - onCallEnd callId:"

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v4, ", mediaType:"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v4, ", reason:"

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v4, ", userId:"

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v4, ", extraInfo:"

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    const-string v4, "TUICallObserverProxy"

    .line 149
    .line 150
    .line 151
    invoke-static {v4, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    move-object v5, v3

    .line 153
    .line 154
    new-instance v3, Lcom/tencent/cloud/tuikit/engine/impl/call/r0;

    .line 155
    move-object v4, v1

    .line 156
    .line 157
    .line 158
    invoke-direct/range {v3 .. v10}, Lcom/tencent/cloud/tuikit/engine/impl/call/r0;-><init>(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;Ljava/lang/String;JLcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;)V

    .line 159
    .line 160
    .line 161
    invoke-direct {p0, v3}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 162
    .line 163
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/call/s0;

    .line 164
    move-object v4, v0

    .line 165
    move-object v3, v5

    .line 166
    move-wide v5, v8

    .line 167
    .line 168
    .line 169
    invoke-direct/range {v1 .. v6}, Lcom/tencent/cloud/tuikit/engine/impl/call/s0;-><init>(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;J)V

    .line 170
    .line 171
    .line 172
    invoke-direct {p0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 173
    return-void
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
.end method

.method private onCallMediaTypeChangedHandler(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 14
    const/4 v2, 0x1

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v2, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    const-string v2, "call_engine - onCallMediaTypeChanged oldMediaType:"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, ", newMediaType:"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    const-string v2, "TUICallObserverProxy"

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/call/k0;

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/k0;-><init>(Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 59
    return-void
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
.end method

.method private onCallNotConnectedHandler(Ljava/lang/String;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    move-object v6, v0

    .line 13
    .line 14
    check-cast v6, Ljava/lang/String;

    .line 15
    const/4 v0, 0x1

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    move-object v3, v0

    .line 21
    .line 22
    check-cast v3, Ljava/lang/String;

    .line 23
    const/4 v0, 0x2

    .line 24
    .line 25
    const-class v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0, v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 32
    const/4 v2, 0x4

    .line 33
    .line 34
    const-class v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v2, v4}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 38
    move-result-object v2

    .line 39
    move-object v4, v2

    .line 40
    .line 41
    check-cast v4, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 42
    const/4 v2, 0x5

    .line 43
    .line 44
    const-class v5, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v2, v5}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    check-cast v2, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 51
    const/4 v5, 0x6

    .line 52
    .line 53
    const-class v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v5, v7}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 57
    move-result-object v5

    .line 58
    .line 59
    check-cast v5, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;

    .line 60
    const/4 v7, 0x7

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v7, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    check-cast p1, Ljava/lang/String;

    .line 67
    .line 68
    new-instance v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;

    .line 69
    .line 70
    .line 71
    invoke-direct {v7}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;-><init>()V

    .line 72
    .line 73
    iput-object v0, v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->roomId:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 74
    .line 75
    iput-object v2, v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->role:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 76
    .line 77
    iput-object p1, v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->chatGroupId:Ljava/lang/String;

    .line 78
    .line 79
    new-instance p1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    const-string v0, "call_engine - onCallNotConnected callId:"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v0, ", mediaType:"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v0, ", reason:"

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v0, ", userId:"

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v0, ", extraInfo:"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    const-string v0, "TUICallObserverProxy"

    .line 129
    .line 130
    .line 131
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/call/p0;

    .line 134
    .line 135
    .line 136
    invoke-direct/range {v2 .. v7}, Lcom/tencent/cloud/tuikit/engine/impl/call/p0;-><init>(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {p0, v2}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 140
    .line 141
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/call/q0;

    .line 142
    .line 143
    .line 144
    invoke-direct {p1, v6}, Lcom/tencent/cloud/tuikit/engine/impl/call/q0;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 148
    return-void
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
.end method

.method private onCallReceivedHandler(Ljava/lang/String;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    move-object v3, v0

    .line 13
    .line 14
    check-cast v3, Ljava/lang/String;

    .line 15
    const/4 v0, 0x1

    .line 16
    .line 17
    const-class v2, Lorg/json/JSONArray;

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0, v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Lorg/json/JSONArray;

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->JSONArrayToList(Lorg/json/JSONArray;Ljava/lang/Class;)Ljava/util/List;

    .line 27
    move-result-object v4

    .line 28
    const/4 v0, 0x2

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Ljava/lang/String;

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    const-class v5, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v2, v5}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 41
    move-result-object v2

    .line 42
    move-object v6, v2

    .line 43
    .line 44
    check-cast v6, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;

    .line 45
    const/4 v2, 0x4

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v2, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 49
    move-result-object v2

    .line 50
    move-object v8, v2

    .line 51
    .line 52
    check-cast v8, Ljava/lang/String;

    .line 53
    const/4 v2, 0x5

    .line 54
    .line 55
    const-class v5, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v2, v5}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    check-cast v2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 62
    const/4 v5, 0x7

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v5, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    const/16 v5, 0x8

    .line 71
    .line 72
    const-class v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v5, v7}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 76
    move-result-object v5

    .line 77
    .line 78
    check-cast v5, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 79
    .line 80
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    const/16 v9, 0x9

    .line 83
    .line 84
    const-class v10, Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v9, v10}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 92
    move-result p1

    .line 93
    .line 94
    new-instance v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;

    .line 95
    .line 96
    .line 97
    invoke-direct {v7}, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;-><init>()V

    .line 98
    .line 99
    iput-object v2, v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->roomId:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;

    .line 100
    .line 101
    iput-object v5, v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->role:Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;

    .line 102
    .line 103
    iput-object v8, v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->userData:Ljava/lang/String;

    .line 104
    .line 105
    iput-object v0, v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->chatGroupId:Ljava/lang/String;

    .line 106
    .line 107
    iput-boolean p1, v7, Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;->isEphemeralCall:Z

    .line 108
    .line 109
    new-instance p1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    const-string v2, "call_engine - onCallReceived callId:"

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v2, ", callerId:"

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v2, ", calleeIdList:"

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v2, ", mediaType:"

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v2, ", extraInfo:"

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    move-result-object p1

    .line 157
    .line 158
    const-string v2, "TUICallObserverProxy"

    .line 159
    .line 160
    .line 161
    invoke-static {v2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/call/f0;

    .line 164
    move-object v5, v4

    .line 165
    move-object v4, v3

    .line 166
    move-object v3, v1

    .line 167
    .line 168
    .line 169
    invoke-direct/range {v2 .. v7}, Lcom/tencent/cloud/tuikit/engine/impl/call/f0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;)V

    .line 170
    move-object v3, v4

    .line 171
    move-object v4, v5

    .line 172
    .line 173
    .line 174
    invoke-direct {p0, v2}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 175
    .line 176
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/call/g0;

    .line 177
    move-object v5, v0

    .line 178
    move-object v7, v8

    .line 179
    .line 180
    .line 181
    invoke-direct/range {v2 .. v7}, Lcom/tencent/cloud/tuikit/engine/impl/call/g0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-direct {p0, v2}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 185
    .line 186
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/call/h0;

    .line 187
    .line 188
    .line 189
    invoke-direct {p1, v3, v4, v5, v6}, Lcom/tencent/cloud/tuikit/engine/impl/call/h0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;)V

    .line 190
    .line 191
    .line 192
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 193
    return-void
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
.end method

.method private onErrorHandler(Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    const-class v2, Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    check-cast p1, Ljava/lang/String;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    const-string v2, "call_engine - onError code:"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, ", message:"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    const-string v2, "TUICallObserverProxy"

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/call/n0;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/n0;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 61
    return-void
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
.end method

.method private onKickedOfflineHandler(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string p1, "TUICallObserverProxy"

    .line 3
    .line 4
    const-string v0, "call_engine - onKickedOffline"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/call/b0;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/b0;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private onUserAudioAvailableHandler(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    const-class v3, Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v2, v3}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 26
    move-result p1

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    const-string v2, "call_engine - onUserAudioAvailable userId:"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, ", isAudioAvailable:"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    const-string v2, "TUICallObserverProxy"

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/call/o0;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/o0;-><init>(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 65
    return-void
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
.end method

.method private onUserInvitingHandler(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v1, "call_engine - onUserInviting userId:"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    const-string v1, "TUICallObserverProxy"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/call/x0;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/x0;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 44
    return-void
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
.end method

.method private onUserJoinHandler(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v1, "call_engine - onUserJoin userId:"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    const-string v1, "TUICallObserverProxy"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/call/i0;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/i0;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 44
    return-void
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
.end method

.method private onUserLeaveHandler(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v1, "call_engine - onUserLeave userId:"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    const-string v1, "TUICallObserverProxy"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/call/u0;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/u0;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 44
    return-void
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
.end method

.method private onUserLineBusyHandler(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v1, "call_engine - onUserLineBusy userId:"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    const-string v1, "TUICallObserverProxy"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/call/y0;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/y0;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 44
    return-void
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
.end method

.method private onUserNetworkQualityChangedHandler(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/call/t0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/t0;-><init>(Lorg/json/JSONArray;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 13
    return-void
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
.end method

.method private onUserNoResponseHandler(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const-class v0, Lorg/json/JSONArray;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Lorg/json/JSONArray;

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 20
    move-result v0

    .line 21
    .line 22
    if-ge v1, v0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    const-string v3, "call_engine - onUserNoResponse userId:"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    const-string v3, "TUICallObserverProxy"

    .line 46
    .line 47
    .line 48
    invoke-static {v3, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/impl/call/j0;

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/j0;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v2}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-void
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
.end method

.method private onUserRejectHandler(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    const-string v1, "call_engine - onUserReject userId:"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    const-string v1, "TUICallObserverProxy"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/call/e0;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/e0;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 44
    return-void
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
.end method

.method private onUserSigExpiredHandler(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string p1, "TUICallObserverProxy"

    .line 3
    .line 4
    const-string v0, "call_engine - onUserSigExpired"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/impl/call/l0;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/l0;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private onUserVideoAvailableHandler(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    const-class v3, Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v2, v3}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 26
    move-result p1

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    const-string v2, "call_engine - onUserVideoAvailable userId:"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, ", isVideoAvailable:"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    const-string v2, "TUICallObserverProxy"

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/impl/call/v0;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/v0;-><init>(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 65
    return-void
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
.end method

.method private onUserVoiceVolumeChangedHandler(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->StringToJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    const-class v1, Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->getParamFromJSONArray(Lorg/json/JSONArray;ILjava/lang/Class;)Ljava/lang/Object;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    check-cast p1, Lorg/json/JSONObject;

    .line 14
    .line 15
    const-class v0, Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/utils/ParamsParse;->JSONObjectToMap(Lorg/json/JSONObject;Ljava/lang/Class;)Ljava/util/Map;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/impl/call/m0;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p1}, Lcom/tencent/cloud/tuikit/engine/impl/call/m0;-><init>(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->notifyObservers(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;)V

    .line 28
    return-void
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
.end method

.method public static synthetic p(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p3, p0, p1, p2}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallBegin(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$RoomId;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$Role;)V

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
.end method

.method public static synthetic q(Ljava/util/Map;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserVoiceVolumeChanged(Ljava/util/Map;)V

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
.end method

.method public static synthetic r(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserReject(Ljava/lang/String;)V

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
.end method

.method private registerEventHandler()V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "onError"

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "onErrorHandler"

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "onCallReceived"

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "onCallReceivedHandler"

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string/jumbo v0, "onCallNotConnected"

    .line 22
    .line 23
    .line 24
    const-string/jumbo v1, "onCallNotConnectedHandler"

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string/jumbo v0, "onCallBegin"

    .line 31
    .line 32
    .line 33
    const-string/jumbo v1, "onCallBeginHandler"

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string/jumbo v0, "onCallEnd"

    .line 40
    .line 41
    .line 42
    const-string/jumbo v1, "onCallEndHandler"

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string/jumbo v0, "onCallMediaTypeChanged"

    .line 49
    .line 50
    .line 51
    const-string/jumbo v1, "onCallMediaTypeChangedHandler"

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string/jumbo v0, "onUserReject"

    .line 58
    .line 59
    .line 60
    const-string/jumbo v1, "onUserRejectHandler"

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string/jumbo v0, "onUserNoResponse"

    .line 67
    .line 68
    .line 69
    const-string/jumbo v1, "onUserNoResponseHandler"

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string/jumbo v0, "onUserInviting"

    .line 76
    .line 77
    .line 78
    const-string/jumbo v1, "onUserInvitingHandler"

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string/jumbo v0, "onUserLineBusy"

    .line 85
    .line 86
    .line 87
    const-string/jumbo v1, "onUserLineBusyHandler"

    .line 88
    .line 89
    .line 90
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string/jumbo v0, "onUserJoin"

    .line 94
    .line 95
    .line 96
    const-string/jumbo v1, "onUserJoinHandler"

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string/jumbo v0, "onUserLeave"

    .line 103
    .line 104
    .line 105
    const-string/jumbo v1, "onUserLeaveHandler"

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const-string/jumbo v0, "onUserVideoAvailable"

    .line 112
    .line 113
    .line 114
    const-string/jumbo v1, "onUserVideoAvailableHandler"

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string/jumbo v0, "onUserAudioAvailable"

    .line 121
    .line 122
    .line 123
    const-string/jumbo v1, "onUserAudioAvailableHandler"

    .line 124
    .line 125
    .line 126
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-string/jumbo v0, "onUserVoiceVolumeChanged"

    .line 130
    .line 131
    .line 132
    const-string/jumbo v1, "onUserVoiceVolumeChangedHandler"

    .line 133
    .line 134
    .line 135
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string/jumbo v0, "onUserNetworkQualityChanged"

    .line 139
    .line 140
    .line 141
    const-string/jumbo v1, "onUserNetworkQualityChangedHandler"

    .line 142
    .line 143
    .line 144
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const-string/jumbo v0, "onKickedOffline"

    .line 148
    .line 149
    .line 150
    const-string/jumbo v1, "onKickedOfflineHandler"

    .line 151
    .line 152
    .line 153
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string/jumbo v0, "onUserSigExpired"

    .line 157
    .line 158
    .line 159
    const-string/jumbo v1, "onUserSigExpiredHandler"

    .line 160
    .line 161
    .line 162
    invoke-direct {p0, v0, v1}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->bindEventHandler(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    return-void
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
.end method

.method private runOnMainThread(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mMainHandler:Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 16
    return-void

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mMainHandler:Landroid/os/Handler;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic s(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;Ljava/lang/String;JLcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, p7

    .line 4
    move-object p7, p6

    .line 5
    move-wide p5, p4

    .line 6
    move-object p4, p3

    .line 7
    move-object p3, p2

    .line 8
    move-object p2, v0

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p0 .. p7}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallEnd(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;Ljava/lang/String;JLcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;)V

    .line 12
    return-void
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
.end method

.method public static synthetic t(Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p1, v0}, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy$CallBackExecutor;->execute(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V

    .line 5
    return-void
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
.end method

.method public static synthetic u(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserAudioAvailable(Ljava/lang/String;Z)V

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
.end method

.method public static synthetic v(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserJoin(Ljava/lang/String;)V

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
.end method

.method public static synthetic w(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p3

    .line 6
    move-object p3, p2

    .line 7
    move-object p2, v0

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p5}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onCallNotConnected(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$MediaType;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallEndReason;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallDefine$CallObserverExtraInfo;)V

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
.end method

.method public static synthetic x(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;->onUserLineBusy(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public addObserver(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mObserverList:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public destroy()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mObserverList:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mFunctionMap:Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public onReceiveEventFromPipeline(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mFunctionMap:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    :try_start_0
    const-class v0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;

    .line 13
    .line 14
    const-class v1, Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    .line 33
    new-instance p2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    const-string v0, "call_engine - onReceiveEventFromPipeline invoke error: "

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    const-string p2, "TUICallObserverProxy"

    .line 51
    .line 52
    .line 53
    invoke-static {p2, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    :cond_0
    return-void
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
.end method

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/call/TUICallObserver;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/impl/call/TUICallObserverProxy;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 8
    :cond_0
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
.end method
