.class public abstract Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;
.super Ljava/lang/Object;
.source "KLineBaseDataInteractor.kt"

# interfaces
.implements Lcom/kubi/flutter/widget/kline/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$Companion;,
        Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$WsCandlesEntity;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u0000 12\u00020\u0001:\u000212B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\u000cJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u0016H\u0004J\u000c\u0010\u0017\u001a\u00020\u0006*\u00020\u0016H\u0002J\u000c\u0010\u0017\u001a\u00020\u0006*\u00020\u0018H\u0002J!\u0010\u0019\u001a\u00020\u0015*\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0008\u0008\u0003\u0010\u001c\u001a\u00020\u001bH$\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0008H$J\u0008\u0010\u001f\u001a\u00020 H\u0014J \u0010!\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH$J,\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u00a4@\u00a2\u0006\u0002\u0010&J\u0008\u0010\'\u001a\u00020(H\u0014J\u001c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0007\u001a\u00020\u000fH\u00a4@\u00a2\u0006\u0002\u0010\u0010J$\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000bH\u00a4@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010,\u001a\u00020**\u00020-2\u0006\u0010.\u001a\u00020/H$J\u0014\u00100\u001a\u00020**\u00020-2\u0006\u0010.\u001a\u00020/H$\u00a8\u00063"
    }
    d2 = {
        "Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;",
        "<init>",
        "()V",
        "bindDataPushFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/flutter/proto/kline/CandleList;",
        "param",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;",
        "loadCdnData",
        "previousTime",
        "",
        "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadActiveOrderData",
        "Lcom/kubi/flutter/proto/kline/OrderList;",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;",
        "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadHistoryOrderData",
        "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "toCandles",
        "",
        "Lcom/kubi/flutter/proto/kline/CandleItem;",
        "Lcom/kubi/network/websocket/model/Message;",
        "toCandleList",
        "Lcom/kubi/kucoin/manager/SpotCandlePushEntity;",
        "toCandleItem",
        "",
        "",
        "source",
        "([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;",
        "getTopic",
        "useSpotMarketCandleAdapter",
        "",
        "buildKlineRequest",
        "Lokhttp3/Request;",
        "begin",
        "end",
        "fetchCdnKlineList",
        "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getSocketClient",
        "Lcom/kubi/network/api/IWebSocketClient;",
        "fetchActiveOrderList",
        "Lcom/kubi/flutter/proto/kline/OrderItem;",
        "fetchHistoryOrderList",
        "toActiveOrderItem",
        "Lcom/kubi/flutter/widget/kline/KlineOrderEntity;",
        "biz",
        "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;",
        "toHistoryOrderItem",
        "Companion",
        "WsCandlesEntity",
        "LKLineWidget_googleRelease"
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
        "SMAP\nKLineBaseDataInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineBaseDataInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CandleListKt.kt\ncom/kubi/flutter/proto/kline/CandleListKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 OrderListKt.kt\ncom/kubi/flutter/proto/kline/OrderListKtKt\n+ 6 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 9 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n*L\n1#1,225:1\n774#2:226\n865#2,2:227\n1056#2:229\n1056#2:232\n1068#2:235\n1563#2:247\n1634#2,3:248\n774#2:261\n865#2,2:262\n1056#2:264\n774#2:274\n865#2,2:275\n8#3:230\n8#3:265\n8#3:267\n8#3:279\n1#4:231\n1#4:234\n1#4:237\n1#4:260\n1#4:266\n1#4:268\n1#4:273\n1#4:280\n8#5:233\n8#5:236\n58#6,6:238\n64#6,2:245\n58#6,6:251\n64#6,2:258\n126#7:244\n126#7:257\n37#8:269\n36#8,3:270\n8#9:277\n8#9:278\n*S KotlinDebug\n*F\n+ 1 KLineBaseDataInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor\n*L\n103#1:226\n103#1:227,2\n104#1:229\n113#1:232\n125#1:235\n139#1:247\n139#1:248,3\n143#1:261\n143#1:262,2\n143#1:264\n153#1:274\n153#1:275,2\n106#1:230\n146#1:265\n152#1:267\n82#1:279\n106#1:231\n114#1:234\n126#1:237\n146#1:266\n152#1:268\n82#1:280\n114#1:233\n126#1:236\n139#1:238,6\n139#1:245,2\n141#1:251,6\n141#1:258,2\n139#1:244\n141#1:257\n153#1:269\n153#1:270,3\n62#1:277\n72#1:278\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->a:Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$Companion;

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
.end method

.method public static synthetic A(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;[Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/kubi/flutter/proto/kline/CandleItem;
    .locals 0

    .line 1
    .line 2
    if-nez p4, :cond_1

    .line 3
    .line 4
    and-int/lit8 p3, p3, 0x1

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const-string p2, "heartbeat"

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->z([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    const-string p1, "Super calls with default arguments not supported in this target, function: toCandleItem"

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 21
    throw p0
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
.end method

.method public static synthetic e(Ljava/lang/String;Lcom/kubi/network/websocket/model/Message;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->m(Ljava/lang/String;Lcom/kubi/network/websocket/model/Message;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic f(Lcom/kubi/flutter/widget/kline/c$a;Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Ljava/lang/String;)Lcom/kubi/network/websocket/observable/c;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->k(Lcom/kubi/flutter/widget/kline/c$a;Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Ljava/lang/String;)Lcom/kubi/network/websocket/observable/c;

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
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic h(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/network/websocket/model/Message;)Lcom/kubi/flutter/proto/kline/CandleList;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->o(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/network/websocket/model/Message;)Lcom/kubi/flutter/proto/kline/CandleList;

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
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/flutter/proto/kline/CandleList;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/flutter/proto/kline/CandleList;

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
.end method

.method public static synthetic j(Lcom/kubi/flutter/widget/kline/c$a;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function0;)Lio/reactivex/Observable;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->l(Lcom/kubi/flutter/widget/kline/c$a;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function0;)Lio/reactivex/Observable;

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
.end method

.method public static final k(Lcom/kubi/flutter/widget/kline/c$a;Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Ljava/lang/String;)Lcom/kubi/network/websocket/observable/c;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    move-result-wide v1

    .line 9
    .line 10
    const/16 v3, 0x3e8

    .line 11
    int-to-long v3, v3

    .line 12
    div-long/2addr v1, v3

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lcom/kubi/flutter/widget/kline/p;->c(Lcom/kubi/flutter/widget/kline/KLineType;J)Lcom/kubi/flutter/widget/kline/d;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/d;->a()J

    .line 20
    move-result-wide v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/d;->b()J

    .line 24
    move-result-wide v5

    .line 25
    move-object v2, p0

    .line 26
    move-object v1, p1

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->q(Lcom/kubi/flutter/widget/kline/c$a;JJ)Lokhttp3/Request;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    sget-object p1, Lcom/kubi/network/websocket/model/Request;->Companion:Lcom/kubi/network/websocket/model/Request$Companion;

    .line 33
    .line 34
    .line 35
    filled-new-array {p2}, [Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p0, v0}, Lcom/kubi/network/websocket/model/Request$Companion;->subscribe(Lokhttp3/Request;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    filled-new-array {p2}, [Ljava/lang/String;

    .line 44
    move-result-object p2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p0, p2}, Lcom/kubi/network/websocket/model/Request$Companion;->unsubscribe(Lokhttp3/Request;[Ljava/lang/String;)Lcom/kubi/network/websocket/model/Request;

    .line 48
    move-result-object v3

    .line 49
    move-object p0, v1

    .line 50
    .line 51
    new-instance v1, Lcom/kubi/network/websocket/observable/c;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->u()Ler/a;

    .line 55
    move-result-object v6

    .line 56
    .line 57
    const/16 v7, 0xc

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v1 .. v8}, Lcom/kubi/network/websocket/observable/c;-><init>(Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Request;Lcom/kubi/network/websocket/model/Message;ZLer/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    return-object v1
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
.end method

.method public static final l(Lcom/kubi/flutter/widget/kline/c$a;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function0;)Lio/reactivex/Observable;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    const/16 v2, 0x3e8

    .line 11
    int-to-long v2, v2

    .line 12
    div-long/2addr v0, v2

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0, v1}, Lcom/kubi/flutter/widget/kline/p;->c(Lcom/kubi/flutter/widget/kline/KLineType;J)Lcom/kubi/flutter/widget/kline/d;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 40
    move-result-object p0

    .line 41
    .line 42
    const-string p1, "get(...)"

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    check-cast p0, Lio/reactivex/Observable;

    .line 48
    return-object p0
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
.end method

.method public static final m(Ljava/lang/String;Lcom/kubi/network/websocket/model/Message;)Z
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "heartbeat"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v1, "socket"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getTopic()Ljava/lang/String;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result p0

    .line 38
    .line 39
    if-eqz p0, :cond_0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 44
    return p0
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

.method public static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static final o(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/network/websocket/model/Message;)Lcom/kubi/flutter/proto/kline/CandleList;
    .locals 3

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl$Companion;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/kubi/flutter/proto/kline/CandleList;->newBuilder()Lcom/kubi/flutter/proto/kline/CandleList$b;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "newBuilder(...)"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/CandleList$b;)Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->c()Lcom/google/protobuf/kotlin/DslList;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->B(Lcom/kubi/network/websocket/model/Message;)Ljava/util/List;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, p0}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->b(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 35
    move-result-object p0

    .line 36
    .line 37
    const-string p1, "socket"

    .line 38
    .line 39
    .line 40
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    move-result p0

    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    sget-object p0, Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;->UPDATE_BY_PUSH:Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_0
    sget-object p0, Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;->UPDATE_BY_PULL:Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {v0, p0}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->d(Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/CandleList;

    .line 55
    move-result-object p0

    .line 56
    return-object p0
    .line 57
.end method

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/kubi/flutter/proto/kline/CandleList;
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Lcom/kubi/flutter/proto/kline/CandleList;

    .line 12
    return-object p0
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
.end method

.method public static synthetic w(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;",
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/OrderList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->label:I

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
    iput v1, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;-><init>(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lcom/kubi/flutter/widget/kline/c$b;

    .line 42
    .line 43
    iget-object p0, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p0

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    iput-object p2, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    iput-object p2, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    iput v3, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadActiveOrderData$1;->label:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1, v0}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->r(Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 78
    move-result-object p2

    .line 79
    .line 80
    if-ne p2, v1, :cond_3

    .line 81
    return-object v1

    .line 82
    .line 83
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    .line 84
    .line 85
    new-instance p0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$a;

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$a;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-static {p2, p0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 92
    move-result-object p0

    .line 93
    .line 94
    sget-object p1, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl$Companion;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lcom/kubi/flutter/proto/kline/OrderList;->newBuilder()Lcom/kubi/flutter/proto/kline/OrderList$b;

    .line 98
    move-result-object p2

    .line 99
    .line 100
    const-string v0, "newBuilder(...)"

    .line 101
    .line 102
    .line 103
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/OrderList$b;)Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->c()Lcom/google/protobuf/kotlin/DslList;

    .line 111
    move-result-object p2

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p2, p0}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->b(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V

    .line 115
    .line 116
    sget-object p0, Lcom/kubi/flutter/proto/kline/OrderList$OrderType;->ORDER_ACTIVE:Lcom/kubi/flutter/proto/kline/OrderList$OrderType;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p0}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->d(Lcom/kubi/flutter/proto/kline/OrderList$OrderType;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/OrderList;

    .line 123
    move-result-object p0

    .line 124
    return-object p0
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
.end method

.method public static synthetic x(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/flutter/widget/kline/c$a;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;",
            "Lcom/kubi/flutter/widget/kline/c$a;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/CandleList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-wide/from16 v0, p2

    .line 3
    .line 4
    move-object/from16 v2, p4

    .line 5
    .line 6
    instance-of v3, v2, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    move-object v3, v2

    .line 10
    .line 11
    check-cast v3, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;

    .line 12
    .line 13
    iget v4, v3, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->label:I

    .line 14
    .line 15
    const/high16 v5, -0x80000000

    .line 16
    .line 17
    and-int v6, v4, v5

    .line 18
    .line 19
    if-eqz v6, :cond_0

    .line 20
    sub-int/2addr v4, v5

    .line 21
    .line 22
    iput v4, v3, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->label:I

    .line 23
    .line 24
    move-object/from16 v4, p0

    .line 25
    :goto_0
    move-object v10, v3

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    new-instance v3, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;

    .line 29
    .line 30
    move-object/from16 v4, p0

    .line 31
    .line 32
    .line 33
    invoke-direct {v3, v4, v2}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;-><init>(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lkotlin/coroutines/Continuation;)V

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :goto_1
    iget-object v2, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->result:Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    iget v5, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->label:I

    .line 43
    .line 44
    const-string v11, ",end="

    .line 45
    .line 46
    const-string v12, ",begin="

    .line 47
    .line 48
    const-string v13, ",type="

    .line 49
    .line 50
    const-string v14, "fetchCdnKlineList,symbol="

    .line 51
    const/4 v6, 0x1

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    if-ne v5, v6, :cond_1

    .line 56
    .line 57
    iget-object v0, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lcom/kubi/flutter/widget/kline/d;

    .line 60
    .line 61
    iget-object v1, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Lcom/kubi/flutter/widget/kline/c$a;

    .line 64
    .line 65
    iget-object v3, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    .line 72
    goto/16 :goto_2

    .line 73
    .line 74
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    throw v0

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v0, v1}, Lcom/kubi/flutter/widget/kline/p;->c(Lcom/kubi/flutter/widget/kline/KLineType;J)Lcom/kubi/flutter/widget/kline/d;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    sget-object v5, Lcom/kubi/flutter/widget/kline/utils/g;->a:Lcom/kubi/flutter/widget/kline/utils/g;

    .line 94
    .line 95
    new-instance v7, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/flutter/widget/kline/c$a;->b()Ljava/lang/String;

    .line 105
    move-result-object v8

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 115
    move-result-object v8

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 119
    move-result-object v8

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/d;->a()J

    .line 129
    move-result-wide v8

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/d;->b()J

    .line 139
    move-result-wide v8

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    move-result-object v7

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v7}, Lcom/kubi/flutter/widget/kline/utils/g;->a(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/d;->a()J

    .line 153
    move-result-wide v7

    .line 154
    move-wide v15, v7

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/d;->b()J

    .line 158
    move-result-wide v8

    .line 159
    .line 160
    .line 161
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    move-result-object v5

    .line 163
    .line 164
    iput-object v5, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->L$0:Ljava/lang/Object;

    .line 165
    .line 166
    move-object/from16 v5, p1

    .line 167
    .line 168
    iput-object v5, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->L$1:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v2, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->L$2:Ljava/lang/Object;

    .line 171
    .line 172
    iput-wide v0, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->J$0:J

    .line 173
    .line 174
    iput v6, v10, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadCdnData$1;->label:I

    .line 175
    move-wide v6, v15

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v4 .. v10}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->s(Lcom/kubi/flutter/widget/kline/c$a;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 179
    move-result-object v0

    .line 180
    .line 181
    if-ne v0, v3, :cond_3

    .line 182
    return-object v3

    .line 183
    :cond_3
    move-object v1, v2

    .line 184
    move-object v2, v0

    .line 185
    move-object v0, v1

    .line 186
    .line 187
    move-object/from16 v1, p1

    .line 188
    .line 189
    :goto_2
    check-cast v2, Ljava/lang/Iterable;

    .line 190
    .line 191
    new-instance v3, Ljava/util/ArrayList;

    .line 192
    .line 193
    .line 194
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    move-result-object v2

    .line 199
    .line 200
    .line 201
    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    move-result v4

    .line 203
    .line 204
    if-eqz v4, :cond_5

    .line 205
    .line 206
    .line 207
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    move-result-object v4

    .line 209
    move-object v5, v4

    .line 210
    .line 211
    check-cast v5, Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Lcom/kubi/flutter/proto/kline/CandleItem;->getTime()J

    .line 215
    move-result-wide v5

    .line 216
    .line 217
    const-wide/16 v7, 0x0

    .line 218
    .line 219
    cmp-long v5, v5, v7

    .line 220
    .line 221
    if-eqz v5, :cond_4

    .line 222
    .line 223
    .line 224
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 225
    goto :goto_3

    .line 226
    .line 227
    :cond_5
    new-instance v2, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$b;

    .line 228
    .line 229
    .line 230
    invoke-direct {v2}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$b;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 234
    move-result-object v2

    .line 235
    .line 236
    sget-object v3, Lcom/kubi/flutter/widget/kline/utils/g;->a:Lcom/kubi/flutter/widget/kline/utils/g;

    .line 237
    .line 238
    new-instance v4, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/c$a;->b()Ljava/lang/String;

    .line 248
    move-result-object v5

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 258
    move-result-object v1

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 262
    move-result-object v1

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/d;->a()J

    .line 272
    move-result-wide v5

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Lcom/kubi/flutter/widget/kline/d;->b()J

    .line 282
    move-result-wide v0

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v0, ",list="

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 294
    move-result v0

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    move-result-object v0

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, v0}, Lcom/kubi/flutter/widget/kline/utils/g;->a(Ljava/lang/String;)V

    .line 305
    .line 306
    sget-object v0, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl$Companion;

    .line 307
    .line 308
    .line 309
    invoke-static {}, Lcom/kubi/flutter/proto/kline/CandleList;->newBuilder()Lcom/kubi/flutter/proto/kline/CandleList$b;

    .line 310
    move-result-object v1

    .line 311
    .line 312
    const-string v3, "newBuilder(...)"

    .line 313
    .line 314
    .line 315
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/CandleList$b;)Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;

    .line 319
    move-result-object v0

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->c()Lcom/google/protobuf/kotlin/DslList;

    .line 323
    move-result-object v1

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v1, v2}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->b(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V

    .line 327
    .line 328
    sget-object v1, Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;->LOAD_PAGE:Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->d(Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/CandleListKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/CandleList;

    .line 335
    move-result-object v0

    .line 336
    return-object v0
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
.end method

.method public static synthetic y(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;",
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/OrderList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p4, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p4

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->label:I

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
    iput v1, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p4}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;-><init>(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p4, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lcom/kubi/flutter/widget/kline/d;

    .line 42
    .line 43
    iget-object p0, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lcom/kubi/flutter/widget/kline/c$b;

    .line 46
    .line 47
    iget-object p0, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;

    .line 50
    .line 51
    .line 52
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p0

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/kubi/flutter/widget/kline/c$b;->h()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 68
    move-result-object p4

    .line 69
    .line 70
    .line 71
    invoke-static {p4, p2, p3}, Lcom/kubi/flutter/widget/kline/p;->c(Lcom/kubi/flutter/widget/kline/KLineType;J)Lcom/kubi/flutter/widget/kline/d;

    .line 72
    move-result-object p4

    .line 73
    .line 74
    .line 75
    invoke-virtual {p4}, Lcom/kubi/flutter/widget/kline/d;->a()J

    .line 76
    move-result-wide v4

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    iput-object v2, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    iput-object v2, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    move-result-object p4

    .line 93
    .line 94
    iput-object p4, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->L$2:Ljava/lang/Object;

    .line 95
    .line 96
    iput-wide p2, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->J$0:J

    .line 97
    .line 98
    iput v3, v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$loadHistoryOrderData$1;->label:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1, v4, v5, v0}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->t(Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 102
    move-result-object p4

    .line 103
    .line 104
    if-ne p4, v1, :cond_3

    .line 105
    return-object v1

    .line 106
    .line 107
    :cond_3
    :goto_1
    check-cast p4, Ljava/lang/Iterable;

    .line 108
    .line 109
    new-instance p0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$c;

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$c;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static {p4, p0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 116
    move-result-object p0

    .line 117
    .line 118
    sget-object p1, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl$Companion;

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lcom/kubi/flutter/proto/kline/OrderList;->newBuilder()Lcom/kubi/flutter/proto/kline/OrderList$b;

    .line 122
    move-result-object p2

    .line 123
    .line 124
    const-string p3, "newBuilder(...)"

    .line 125
    .line 126
    .line 127
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/OrderList$b;)Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;

    .line 131
    move-result-object p1

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->c()Lcom/google/protobuf/kotlin/DslList;

    .line 135
    move-result-object p2

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p2, p0}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->b(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V

    .line 139
    .line 140
    sget-object p0, Lcom/kubi/flutter/proto/kline/OrderList$OrderType;->ORDER_HISTORY:Lcom/kubi/flutter/proto/kline/OrderList$OrderType;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p0}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->d(Lcom/kubi/flutter/proto/kline/OrderList$OrderType;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/kubi/flutter/proto/kline/OrderListKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/OrderList;

    .line 147
    move-result-object p0

    .line 148
    return-object p0
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
.end method


# virtual methods
.method public final B(Lcom/kubi/network/websocket/model/Message;)Ljava/util/List;
    .locals 6
    .param p1    # Lcom/kubi/network/websocket/model/Message;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/network/websocket/model/Message;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/flutter/proto/kline/CandleItem;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
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
    .line 8
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "heartbeat"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 47
    .line 48
    new-instance v1, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$d;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$d;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 59
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    :catchall_0
    :cond_1
    :goto_0
    check-cast v2, Ljava/util/ArrayList;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    new-instance v0, Ljava/util/ArrayList;

    .line 66
    .line 67
    const/16 v1, 0xa

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 71
    move-result v1

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    move-result v2

    .line 83
    .line 84
    if-eqz v2, :cond_7

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    check-cast v2, [Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v2, v3}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->z([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 98
    move-result-object v2

    .line 99
    .line 100
    .line 101
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 102
    goto :goto_1

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 106
    move-result-object v0

    .line 107
    goto :goto_3

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 121
    move-result v0

    .line 122
    .line 123
    if-eqz v0, :cond_4

    .line 124
    goto :goto_2

    .line 125
    .line 126
    .line 127
    :cond_4
    :try_start_1
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getData()Ljava/lang/String;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    sget-object v1, Lcom/kubi/utils/x;->a:Lcom/kubi/utils/x;

    .line 134
    .line 135
    new-instance v1, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$e;

    .line 136
    .line 137
    .line 138
    invoke-direct {v1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$e;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    invoke-static {v0, v1}, Lcom/kubi/utils/x;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 146
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 147
    .line 148
    :catchall_1
    :cond_5
    :goto_2
    check-cast v2, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$WsCandlesEntity;

    .line 149
    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$WsCandlesEntity;->getCandles()[Ljava/lang/String;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    .line 160
    move-result-object p1

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v0, p1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->z([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    if-eqz p1, :cond_6

    .line 167
    .line 168
    .line 169
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 170
    move-result-object v0

    .line 171
    .line 172
    if-nez v0, :cond_7

    .line 173
    .line 174
    .line 175
    :cond_6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 176
    move-result-object v0

    .line 177
    .line 178
    :cond_7
    :goto_3
    new-instance p1, Ljava/util/ArrayList;

    .line 179
    .line 180
    .line 181
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    move-result v1

    .line 190
    .line 191
    if-eqz v1, :cond_9

    .line 192
    .line 193
    .line 194
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    move-result-object v1

    .line 196
    move-object v2, v1

    .line 197
    .line 198
    check-cast v2, Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Lcom/kubi/flutter/proto/kline/CandleItem;->getTime()J

    .line 202
    move-result-wide v2

    .line 203
    .line 204
    const-wide/16 v4, 0x0

    .line 205
    .line 206
    cmp-long v2, v2, v4

    .line 207
    .line 208
    if-eqz v2, :cond_8

    .line 209
    .line 210
    .line 211
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 212
    goto :goto_4

    .line 213
    .line 214
    :cond_9
    new-instance v0, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$f;

    .line 215
    .line 216
    .line 217
    invoke-direct {v0}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor$f;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 221
    move-result-object p1

    .line 222
    return-object p1
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
.end method

.method public a(Lcom/kubi/flutter/widget/kline/c$a;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/kubi/flutter/widget/kline/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$a;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/CandleList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->x(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/flutter/widget/kline/c$a;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public b(Lcom/kubi/flutter/widget/kline/c$a;)Lkotlinx/coroutines/flow/e;
    .locals 7
    .param p1    # Lcom/kubi/flutter/widget/kline/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$a;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/flutter/proto/kline/CandleList;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "param"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->v(Lcom/kubi/flutter/widget/kline/c$a;)Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lcom/kubi/flutter/widget/kline/interactor/c;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p1, p0, v0}, Lcom/kubi/flutter/widget/kline/interactor/c;-><init>(Lcom/kubi/flutter/widget/kline/c$a;Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Ljava/lang/String;)V

    .line 15
    .line 16
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    new-instance v4, Lcom/kubi/flutter/widget/kline/d;

    .line 28
    .line 29
    const-wide/16 v5, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct {v4, v5, v6, v5, v6}, Lcom/kubi/flutter/widget/kline/d;-><init>(JJ)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    new-instance v4, Lcom/kubi/flutter/widget/kline/utils/e;

    .line 38
    .line 39
    new-instance v5, Lcom/kubi/flutter/widget/kline/interactor/d;

    .line 40
    .line 41
    .line 42
    invoke-direct {v5, p1, v3, v2, v1}, Lcom/kubi/flutter/widget/kline/interactor/d;-><init>(Lcom/kubi/flutter/widget/kline/c$a;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function0;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v4, v5}, Lcom/kubi/flutter/widget/kline/utils/e;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    new-instance p1, Lcom/kubi/flutter/widget/kline/interactor/e;

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0}, Lcom/kubi/flutter/widget/kline/interactor/e;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    new-instance v0, Lcom/kubi/flutter/widget/kline/interactor/f;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, p1}, Lcom/kubi/flutter/widget/kline/interactor/f;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    new-instance v0, Lcom/kubi/flutter/widget/kline/interactor/g;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, p0}, Lcom/kubi/flutter/widget/kline/interactor/g;-><init>(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;)V

    .line 65
    .line 66
    new-instance v1, Lcom/kubi/flutter/widget/kline/interactor/h;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, v0}, Lcom/kubi/flutter/widget/kline/interactor/h;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    const-string v0, "map(...)"

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lkotlinx/coroutines/rx2/RxConvertKt;->b(Lio/reactivex/ObservableSource;)Lkotlinx/coroutines/flow/e;

    .line 82
    move-result-object p1

    .line 83
    return-object p1
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
.end method

.method public c(Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/kubi/flutter/widget/kline/c$b;
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
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/OrderList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->w(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public d(Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/kubi/flutter/widget/kline/c$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/proto/kline/OrderList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;->y(Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public abstract q(Lcom/kubi/flutter/widget/kline/c$a;JJ)Lokhttp3/Request;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract r(Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$b;
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
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/flutter/proto/kline/OrderItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract s(Lcom/kubi/flutter/widget/kline/c$a;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$a;",
            "JJ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/flutter/proto/kline/CandleItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract t(Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/flutter/proto/kline/OrderItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public u()Ler/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ler/b;->a()Ler/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public abstract v(Lcom/kubi/flutter/widget/kline/c$a;)Ljava/lang/String;
    .param p1    # Lcom/kubi/flutter/widget/kline/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract z([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
