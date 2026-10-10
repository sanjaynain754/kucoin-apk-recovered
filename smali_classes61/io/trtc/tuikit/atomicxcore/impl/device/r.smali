.class public final Lio/trtc/tuikit/atomicxcore/impl/device/r;
.super Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;
.source "SourceFile"


# static fields
.field public static final s:Lkotlin/Lazy;


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public final j:Lkotlinx/coroutines/flow/n;

.field public final k:Lkotlinx/coroutines/flow/n;

.field public final l:Lkotlinx/coroutines/flow/n;

.field public final m:Lkotlinx/coroutines/flow/n;

.field public final n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public final o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

.field public final p:Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

.field public q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

.field public final r:Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/j;->a:Lio/trtc/tuikit/atomicxcore/impl/device/j;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 9
    return-void
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
.end method

.method public constructor <init>()V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 11
    move-result-object v3

    .line 12
    .line 13
    iput-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->a:Lkotlinx/coroutines/flow/n;

    .line 14
    .line 15
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_ERROR:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    iput-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->b:Lkotlinx/coroutines/flow/n;

    .line 22
    .line 23
    const/16 v5, 0x64

    .line 24
    .line 25
    .line 26
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    move-result-object v5

    .line 28
    move-object v6, v5

    .line 29
    .line 30
    .line 31
    invoke-static {v6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 32
    move-result-object v5

    .line 33
    .line 34
    iput-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->c:Lkotlinx/coroutines/flow/n;

    .line 35
    const/4 v7, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    move-result-object v7

    .line 40
    .line 41
    .line 42
    invoke-static {v7}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 43
    move-result-object v7

    .line 44
    .line 45
    iput-object v7, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->d:Lkotlinx/coroutines/flow/n;

    .line 46
    .line 47
    .line 48
    invoke-static {v6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 49
    move-result-object v6

    .line 50
    .line 51
    iput-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->e:Lkotlinx/coroutines/flow/n;

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    iput-object v8, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->f:Lkotlinx/coroutines/flow/n;

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 61
    move-result-object v9

    .line 62
    .line 63
    iput-object v9, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->g:Lkotlinx/coroutines/flow/n;

    .line 64
    .line 65
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 69
    move-result-object v10

    .line 70
    .line 71
    iput-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->h:Lkotlinx/coroutines/flow/n;

    .line 72
    .line 73
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;->AUTO:Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;

    .line 74
    .line 75
    .line 76
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 77
    move-result-object v11

    .line 78
    .line 79
    iput-object v11, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->i:Lkotlinx/coroutines/flow/n;

    .line 80
    .line 81
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_1080P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 85
    move-result-object v12

    .line 86
    .line 87
    iput-object v12, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->j:Lkotlinx/coroutines/flow/n;

    .line 88
    .line 89
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;->SPEAKERPHONE:Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 93
    move-result-object v13

    .line 94
    .line 95
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->k:Lkotlinx/coroutines/flow/n;

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 99
    move-result-object v14

    .line 100
    .line 101
    iput-object v14, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->l:Lkotlinx/coroutines/flow/n;

    .line 102
    .line 103
    new-instance v15, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;

    .line 104
    .line 105
    const/16 v21, 0x1f

    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    const/16 v19, 0x0

    .line 116
    .line 117
    const/16 v20, 0x0

    .line 118
    .line 119
    .line 120
    invoke-direct/range {v15 .. v22}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v15}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 124
    move-result-object v15

    .line 125
    .line 126
    iput-object v15, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->m:Lkotlinx/coroutines/flow/n;

    .line 127
    .line 128
    const-string v1, "file"

    .line 129
    .line 130
    const-string v2, "AtomicXCore-Live"

    .line 131
    .line 132
    move-object/from16 v16, v3

    .line 133
    .line 134
    const-string v3, "DeviceStoreImpl"

    .line 135
    .line 136
    .line 137
    invoke-static {v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 147
    .line 148
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/device/l;

    .line 149
    .line 150
    .line 151
    invoke-direct {v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/l;-><init>(Lio/trtc/tuikit/atomicxcore/impl/device/r;)V

    .line 152
    .line 153
    move-object/from16 v17, v2

    .line 154
    .line 155
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;->NONE:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 156
    .line 157
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 158
    .line 159
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 160
    .line 161
    move-object/from16 v18, v7

    .line 162
    move-object v7, v6

    .line 163
    .line 164
    move-object/from16 v6, v18

    .line 165
    .line 166
    move-object/from16 v18, v1

    .line 167
    .line 168
    move-object/from16 v23, v3

    .line 169
    .line 170
    move-object/from16 v3, v16

    .line 171
    .line 172
    move-object/from16 v1, v17

    .line 173
    .line 174
    .line 175
    invoke-direct/range {v2 .. v15}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 176
    .line 177
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->r:Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 178
    .line 179
    move-object/from16 v2, v23

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 183
    .line 184
    .line 185
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    if-nez v1, :cond_0

    .line 189
    .line 190
    const-string v1, "liteav"

    .line 191
    .line 192
    .line 193
    invoke-static {v1}, Lcom/tencent/liteav/base/ContextUtils;->initContextFromNative(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 197
    move-result-object v1

    .line 198
    .line 199
    :cond_0
    if-nez v1, :cond_1

    .line 200
    .line 201
    const-string v1, "message"

    .line 202
    .line 203
    const-string v2, "init callEngine fail, invalid context."

    .line 204
    .line 205
    .line 206
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    const/4 v1, 0x2

    .line 208
    .line 209
    move-object/from16 v3, v18

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 213
    return-void

    .line 214
    .line 215
    .line 216
    :cond_1
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->createInstance(Landroid/content/Context;)Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 217
    move-result-object v1

    .line 218
    .line 219
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->p:Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 220
    return-void
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
.end method


# virtual methods
.method public final closeLocalCamera()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: closeLocalCamera called with focus="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    const-string v2, "message"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 33
    .line 34
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/m;->a:[I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 38
    move-result v0

    .line 39
    .line 40
    aget v0, v1, v0

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    if-ne v0, v1, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->p:Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->closeCamera()V

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->closeLocalCamera()V

    .line 57
    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->f:Lkotlinx/coroutines/flow/n;

    .line 59
    .line 60
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->g:Lkotlinx/coroutines/flow/n;

    .line 66
    .line 67
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_ERROR:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 71
    return-void
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
.end method

.method public final closeLocalMicrophone()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: closeLocalMicrophone called with focus="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    const-string v2, "message"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 33
    .line 34
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/m;->a:[I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 38
    move-result v0

    .line 39
    .line 40
    aget v0, v1, v0

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    if-ne v0, v1, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->p:Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->closeMicrophone()V

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->closeLocalMicrophone()V

    .line 57
    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->a:Lkotlinx/coroutines/flow/n;

    .line 59
    .line 60
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->b:Lkotlinx/coroutines/flow/n;

    .line 66
    .line 67
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_ERROR:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 71
    return-void
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
.end method

.method public final getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->r:Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 3
    return-object v0
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
.end method

.method public final openLocalCamera(ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: openLocalCamera called with isFront="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, ", focus="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    const-string v2, "message"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    const/4 v3, 0x0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 39
    .line 40
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 41
    .line 42
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/m;->a:[I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 46
    move-result v0

    .line 47
    .line 48
    aget v0, v1, v0

    .line 49
    const/4 v1, 0x1

    .line 50
    .line 51
    if-ne v0, v1, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->f:Lkotlinx/coroutines/flow/n;

    .line 54
    .line 55
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 56
    .line 57
    .line 58
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->g:Lkotlinx/coroutines/flow/n;

    .line 61
    .line 62
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;->NO_ERROR:Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->h:Lkotlinx/coroutines/flow/n;

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 80
    .line 81
    const-string v1, "isFront"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 85
    .line 86
    new-instance p1, Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 90
    .line 91
    const-string v1, "api"

    .line 92
    .line 93
    const-string v3, "openCamera"

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    .line 98
    const-string v1, "params"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->p:Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 104
    .line 105
    if-eqz v0, :cond_0

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->callExperimentalAPI(Ljava/lang/String;)V

    .line 113
    goto :goto_0

    .line 114
    :catch_0
    move-exception p1

    .line 115
    goto :goto_1

    .line 116
    .line 117
    :cond_0
    :goto_0
    if-eqz p2, :cond_2

    .line 118
    .line 119
    .line 120
    invoke-interface {p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    return-void

    .line 122
    .line 123
    :goto_1
    if-eqz p2, :cond_1

    .line 124
    const/4 v0, -0x1

    .line 125
    .line 126
    const-string v1, "callEngine openLocalCamera fail"

    .line 127
    .line 128
    .line 129
    invoke-interface {p2, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 130
    .line 131
    :cond_1
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 132
    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v1, "callEngine openLocalCamera fail, e: "

    .line 136
    .line 137
    .line 138
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    const/4 v0, 0x2

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 160
    :cond_2
    return-void

    .line 161
    .line 162
    :cond_3
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 163
    .line 164
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->j:Lkotlinx/coroutines/flow/n;

    .line 165
    .line 166
    .line 167
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 171
    .line 172
    .line 173
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/device/i;->a(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;

    .line 174
    move-result-object v1

    .line 175
    .line 176
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/device/o;

    .line 177
    .line 178
    .line 179
    invoke-direct {v2, p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/device/o;-><init>(Lio/trtc/tuikit/atomicxcore/impl/device/r;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->openLocalCamera(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 183
    return-void
    .line 184
    .line 185
    .line 186
.end method

.method public final openLocalMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: openLocalMicrophone called with focus="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    const-string v2, "message"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 33
    .line 34
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/m;->a:[I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 38
    move-result v0

    .line 39
    .line 40
    aget v0, v1, v0

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    if-ne v0, v1, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->p:Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/device/n;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/device/n;-><init>(Lio/trtc/tuikit/atomicxcore/impl/device/r;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->openMicrophone(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Callback;)V

    .line 56
    :cond_0
    return-void

    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 59
    .line 60
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;->DEFAULT:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;

    .line 61
    .line 62
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/device/p;

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/device/p;-><init>(Lio/trtc/tuikit/atomicxcore/impl/device/r;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->openLocalMicrophone(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$AudioQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 69
    return-void
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
.end method

.method public final reset()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "API: reset called"

    .line 5
    .line 6
    const-string v2, "message"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    const/16 v0, 0x64

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/r;->setCaptureVolume(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/r;->setOutputVolume(I)V

    .line 19
    .line 20
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;->SPEAKERPHONE:Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/r;->setAudioRoute(Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;)V

    .line 24
    .line 25
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;->AUTO:Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/r;->switchMirror(Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;)V

    .line 29
    .line 30
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;->QUALITY_1080P:Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/device/r;->updateVideoQuality(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/device/r;->closeLocalMicrophone()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/device/r;->closeLocalCamera()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/device/r;->stopScreenShare()V

    .line 43
    .line 44
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->d:Lkotlinx/coroutines/flow/n;

    .line 45
    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->h:Lkotlinx/coroutines/flow/n;

    .line 54
    .line 55
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

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
.end method

.method public final setAudioRoute(Lio/trtc/tuikit/atomicxcore/api/device/AudioRoute;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "audioRoute"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v3, "API: setAudioRoute called with audioRoute="

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    const-string v3, "message"

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const/4 v3, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v3, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 34
    .line 35
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getMediaDeviceManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/h;->c:[I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 48
    move-result v2

    .line 49
    .line 50
    aget v0, v0, v2

    .line 51
    const/4 v2, 0x1

    .line 52
    .line 53
    if-eq v0, v2, :cond_1

    .line 54
    const/4 v2, 0x2

    .line 55
    .line 56
    if-ne v0, v2, :cond_0

    .line 57
    .line 58
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager$AudioRoute;->SPEAKERPHONE:Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager$AudioRoute;

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 65
    throw p1

    .line 66
    .line 67
    :cond_1
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager$AudioRoute;->EARPIECE:Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager$AudioRoute;

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-virtual {v1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;->setAudioRoute(Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager$AudioRoute;)V

    .line 71
    .line 72
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->k:Lkotlinx/coroutines/flow/n;

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 76
    return-void
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
.end method

.method public final setCaptureVolume(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: setCaptureVolume called with volume="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lcom/tencent/trtc/TRTCCloud;->setAudioCaptureVolume(I)V

    .line 38
    .line 39
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->c:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 47
    return-void
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
.end method

.method public final setFocus$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "owner"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: setFocus called with owner="

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    const-string v2, "message"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 34
    .line 35
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 36
    return-void
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
.end method

.method public final setOutputVolume(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: setOutputVolume called with volume="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/tencent/trtc/TRTCCloud;->getAudioEffectManager()Lcom/tencent/liteav/audio/TXAudioEffectManager;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, p1}, Lcom/tencent/liteav/audio/TXAudioEffectManager;->setVoiceCaptureVolume(I)V

    .line 42
    .line 43
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->e:Lkotlinx/coroutines/flow/n;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 51
    return-void
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
.end method

.method public final startCameraTest(Lio/trtc/tuikit/atomicxcore/api/view/CameraView;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "cameraView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: startCameraTest called with cameraView="

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, ", focus="

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    const-string v2, "message"

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    const/4 v3, 0x0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 44
    .line 45
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setLocalVideoView(Lcom/tencent/cloud/tuikit/engine/common/TUIVideoView;)V

    .line 49
    .line 50
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 51
    .line 52
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/m;->a:[I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 56
    move-result p1

    .line 57
    .line 58
    aget p1, v0, p1

    .line 59
    const/4 v0, 0x1

    .line 60
    .line 61
    if-ne p1, v0, :cond_3

    .line 62
    .line 63
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 67
    .line 68
    const-string v1, "isFront"

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 72
    .line 73
    new-instance v0, Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 77
    .line 78
    const-string v1, "api"

    .line 79
    .line 80
    const-string v3, "openCamera"

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    .line 85
    const-string v1, "params"

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->p:Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 91
    .line 92
    if-eqz p1, :cond_0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->callExperimentalAPI(Ljava/lang/String;)V

    .line 100
    goto :goto_0

    .line 101
    :catch_0
    move-exception p1

    .line 102
    goto :goto_1

    .line 103
    .line 104
    :cond_0
    :goto_0
    if-eqz p2, :cond_2

    .line 105
    .line 106
    .line 107
    invoke-interface {p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    return-void

    .line 109
    .line 110
    :goto_1
    if-eqz p2, :cond_1

    .line 111
    const/4 v0, -0x1

    .line 112
    .line 113
    const-string v1, "callEngine startCameraTest fail"

    .line 114
    .line 115
    .line 116
    invoke-interface {p2, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 117
    .line 118
    :cond_1
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 119
    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v1, "callEngine startCameraTest fail, e: "

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    const/4 v0, 0x2

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 147
    :cond_2
    return-void

    .line 148
    .line 149
    :cond_3
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 150
    .line 151
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->j:Lkotlinx/coroutines/flow/n;

    .line 152
    .line 153
    .line 154
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;

    .line 158
    .line 159
    .line 160
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/device/i;->a(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/device/q;

    .line 164
    .line 165
    .line 166
    invoke-direct {v2, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/device/q;-><init>(Lio/trtc/tuikit/atomicxcore/impl/device/r;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->openLocalCamera(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 170
    return-void
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
.end method

.method public final startScreenShare()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: startScreenShare called"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->startScreenSharing()V

    .line 16
    .line 17
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->l:Lkotlinx/coroutines/flow/n;

    .line 18
    .line 19
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 23
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
.end method

.method public final stopCameraTest()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: stopCameraTest called with focus="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    const-string v2, "message"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 31
    .line 32
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->q:Lio/trtc/tuikit/atomicxcore/api/device/DeviceFocusOwner;

    .line 33
    .line 34
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/m;->a:[I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 38
    move-result v0

    .line 39
    .line 40
    aget v0, v1, v0

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    if-ne v0, v1, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->p:Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/call/TUICallEngine;->closeCamera()V

    .line 51
    :cond_0
    return-void

    .line 52
    .line 53
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->closeLocalCamera()V

    .line 57
    return-void
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
.end method

.method public final stopScreenShare()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    const-string v1, "message"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-string v3, "API: stopScreenShare called"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v3, v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->stopScreenSharing()V

    .line 16
    .line 17
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->l:Lkotlinx/coroutines/flow/n;

    .line 18
    .line 19
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 23
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
.end method

.method public final switchCamera(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "API: switchCamera called with isFront="

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "message"

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getMediaDeviceManager()Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIRoomDeviceManager;->switchCamera(Z)V

    .line 38
    .line 39
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->h:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 47
    return-void
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
.end method

.method public final switchMirror(Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "mirrorType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v3, "API: switchMirror called with mirrorType="

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    const-string v3, "message"

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const/4 v3, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v3, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 34
    .line 35
    new-instance v1, Lcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1}, Lcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/device/h;->a:[I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 47
    move-result v2

    .line 48
    .line 49
    aget v0, v0, v2

    .line 50
    const/4 v2, 0x1

    .line 51
    .line 52
    if-eq v0, v2, :cond_2

    .line 53
    const/4 v3, 0x2

    .line 54
    .line 55
    if-eq v0, v3, :cond_1

    .line 56
    const/4 v2, 0x3

    .line 57
    .line 58
    if-ne v0, v2, :cond_0

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 62
    .line 63
    .line 64
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 65
    throw p1

    .line 66
    :cond_1
    move v3, v2

    .line 67
    .line 68
    :cond_2
    :goto_0
    iput v3, v1, Lcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;->mirrorType:I

    .line 69
    .line 70
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getTRTCCloud()Lcom/tencent/trtc/TRTCCloud;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/tencent/trtc/TRTCCloud;->setLocalRenderParams(Lcom/tencent/trtc/TRTCCloudDef$TRTCRenderParams;)V

    .line 78
    .line 79
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->i:Lkotlinx/coroutines/flow/n;

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 83
    return-void
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
.end method

.method public final updateVideoQuality(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "quality"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->n:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "API: updateVideoQuality called with quality="

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    const-string v2, "message"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 34
    .line 35
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->o:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/device/i;->a(Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->updateVideoQuality(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoQuality;)V

    .line 43
    .line 44
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->j:Lkotlinx/coroutines/flow/n;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 48
    return-void
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
.end method
