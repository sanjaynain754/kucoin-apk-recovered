.class final Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "QuoteFuturesFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->I3(Ljava/lang/String;Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.quotefacade.market.futures.QuoteFuturesFragment$updateAdapter$2"
    f = "QuoteFuturesFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQuoteFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFuturesFragment.kt\ncom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1573#2:322\n1604#2,3:323\n1607#2:327\n1573#2:328\n1604#2,4:329\n1#3:326\n*S KotlinDebug\n*F\n+ 1 QuoteFuturesFragment.kt\ncom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2\n*L\n257#1:322\n257#1:323,3\n257#1:327\n297#1:328\n297#1:329,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/FutureLevel2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $quoteCrypto:Ljava/lang/String;

.field final synthetic $selectIndex:I

.field final synthetic $tabLayout:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

.field final synthetic $viewPager:Landroidx/viewpager2/widget/ViewPager2;

.field label:I

.field final synthetic this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;Ljava/util/List;Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;ILcom/kubi/resources/widget/viewpager2/SlidingTabLayout;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/viewpager2/widget/ViewPager2;",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/FutureLevel2;",
            ">;",
            "Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;",
            "I",
            "Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$list:Ljava/util/List;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;

    .line 7
    .line 8
    iput p4, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$selectIndex:I

    .line 9
    .line 10
    iput-object p5, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$tabLayout:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$quoteCrypto:Ljava/lang/String;

    .line 13
    const/4 p1, 0x2

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method

.method public static synthetic a(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;Lcom/kubi/quotefacade/entity/FutureLevel2;Ljava/lang/String;I)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->f(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;Lcom/kubi/quotefacade/entity/FutureLevel2;Ljava/lang/String;I)Landroidx/fragment/app/Fragment;

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
.end method

.method public static final f(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;Lcom/kubi/quotefacade/entity/FutureLevel2;Ljava/lang/String;I)Landroidx/fragment/app/Fragment;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v2, "Adapter add index="

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string p3, " --> "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->u3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/ArrayList;

    .line 32
    move-result-object p3

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 36
    move-result p3

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object p3

    .line 44
    .line 45
    .line 46
    invoke-static {v0, p3}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getConcept()Ljava/lang/String;

    .line 50
    move-result-object p3

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->q3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    move-result p3

    .line 59
    .line 60
    if-eqz p3, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->u3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/ArrayList;

    .line 64
    move-result-object p3

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 68
    move-result p3

    .line 69
    const/4 v0, 0x1

    .line 70
    .line 71
    if-le p3, v0, :cond_0

    .line 72
    .line 73
    sget-object p3, Lcom/kubi/quotefacade/market/futures/FuturesListFragment;->j0:Lcom/kubi/quotefacade/market/futures/FuturesListFragment$Companion;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getConcept()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getCount()I

    .line 81
    move-result p1

    .line 82
    .line 83
    new-instance v1, Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-static {p0}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->v3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 90
    move-result-object p0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3, p2, v0, p1, v1}, Lcom/kubi/quotefacade/market/futures/FuturesListFragment$Companion;->newInstance(Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;)Lcom/kubi/quotefacade/market/futures/FuturesListFragment;

    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    .line 102
    :cond_0
    sget-object p0, Lcom/kubi/quotefacade/market/futures/FuturesListFragment;->j0:Lcom/kubi/quotefacade/market/futures/FuturesListFragment$Companion;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getConcept()Ljava/lang/String;

    .line 106
    move-result-object p3

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getCount()I

    .line 110
    move-result v0

    .line 111
    .line 112
    new-instance v1, Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getConcept()Ljava/lang/String;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p2, p3, v0, v1}, Lcom/kubi/quotefacade/market/futures/FuturesListFragment$Companion;->newInstance(Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;)Lcom/kubi/quotefacade/market/futures/FuturesListFragment;

    .line 128
    move-result-object p0

    .line 129
    return-object p0
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$list:Ljava/util/List;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;

    .line 9
    .line 10
    iget v4, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$selectIndex:I

    .line 11
    .line 12
    iget-object v5, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$tabLayout:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$quoteCrypto:Ljava/lang/String;

    .line 15
    move-object v7, p2

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v0 .. v7}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;-><init>(Landroidx/viewpager2/widget/ViewPager2;Ljava/util/List;Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;ILcom/kubi/resources/widget/viewpager2/SlidingTabLayout;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 19
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->label:I

    .line 6
    .line 7
    if-nez v0, :cond_c

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    iget-object p1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string v0, "null cannot be cast to non-null type com.kubi.resources.widget.viewpager2.ViewPager2Adapter"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    check-cast p1, Lfx/a;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$list:Ljava/util/List;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lfx/a;->clear()V

    .line 33
    .line 34
    iget-object v1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->u3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/ArrayList;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    iget-object v1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->v3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 51
    .line 52
    iget-object v1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;

    .line 53
    .line 54
    iget-object v2, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$quoteCrypto:Ljava/lang/String;

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 v4, 0xa

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 62
    move-result v5

    .line 63
    .line 64
    .line 65
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    move-result-object v5

    .line 70
    const/4 v6, 0x0

    .line 71
    move v7, v6

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    move-result v8

    .line 76
    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    .line 80
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    move-result-object v8

    .line 82
    .line 83
    add-int/lit8 v9, v7, 0x1

    .line 84
    .line 85
    if-gez v7, :cond_0

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 89
    .line 90
    :cond_0
    check-cast v8, Lcom/kubi/quotefacade/entity/FutureLevel2;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 94
    move-result-object v10

    .line 95
    .line 96
    new-instance v11, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    const-string v12, "updateAdapter "

    .line 102
    .line 103
    .line 104
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v7, " --> "

    .line 110
    .line 111
    .line 112
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    move-result-object v7

    .line 120
    .line 121
    .line 122
    invoke-static {v10, v7}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getEnabled()Z

    .line 126
    move-result v7

    .line 127
    .line 128
    if-eqz v7, :cond_5

    .line 129
    .line 130
    .line 131
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getNameAMultiLang()Ljava/lang/String;

    .line 132
    move-result-object v7

    .line 133
    .line 134
    if-eqz v7, :cond_5

    .line 135
    .line 136
    .line 137
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 138
    move-result v7

    .line 139
    .line 140
    if-nez v7, :cond_1

    .line 141
    .line 142
    goto/16 :goto_1

    .line 143
    .line 144
    .line 145
    :cond_1
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getConcept()Ljava/lang/String;

    .line 146
    move-result-object v7

    .line 147
    .line 148
    if-eqz v7, :cond_5

    .line 149
    .line 150
    .line 151
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 152
    move-result v7

    .line 153
    .line 154
    if-nez v7, :cond_2

    .line 155
    goto :goto_1

    .line 156
    .line 157
    .line 158
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 159
    move-result-wide v10

    .line 160
    .line 161
    .line 162
    invoke-static {v10, v11}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 163
    move-result-object v7

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8, v7}, Lcom/kubi/quotefacade/entity/FutureLevel2;->setTime(Ljava/lang/Long;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getNameAMultiLang()Ljava/lang/String;

    .line 170
    move-result-object v7

    .line 171
    .line 172
    if-eqz v7, :cond_3

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->u3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/ArrayList;

    .line 176
    move-result-object v10

    .line 177
    .line 178
    .line 179
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 183
    move-result-object v7

    .line 184
    .line 185
    new-instance v10, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    const-string v11, "titleList="

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-static {v1}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->u3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/ArrayList;

    .line 197
    move-result-object v11

    .line 198
    .line 199
    .line 200
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 201
    move-result v11

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    move-result-object v10

    .line 209
    .line 210
    .line 211
    invoke-static {v7, v10}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :cond_3
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getConcept()Ljava/lang/String;

    .line 215
    move-result-object v7

    .line 216
    .line 217
    .line 218
    invoke-static {v1}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->q3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/lang/String;

    .line 219
    move-result-object v10

    .line 220
    .line 221
    .line 222
    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    move-result v7

    .line 224
    .line 225
    if-nez v7, :cond_4

    .line 226
    .line 227
    .line 228
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getConcept()Ljava/lang/String;

    .line 229
    move-result-object v7

    .line 230
    .line 231
    .line 232
    invoke-static {v1}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->v3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 233
    move-result-object v10

    .line 234
    .line 235
    .line 236
    invoke-virtual {v10, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 240
    move-result-object v7

    .line 241
    .line 242
    new-instance v10, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    const-string v11, "wsList="

    .line 248
    .line 249
    .line 250
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-static {v1}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->v3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 254
    move-result-object v11

    .line 255
    .line 256
    .line 257
    invoke-virtual {v11}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 258
    move-result v11

    .line 259
    .line 260
    .line 261
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    move-result-object v10

    .line 266
    .line 267
    .line 268
    invoke-static {v7, v10}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    :cond_4
    new-instance v7, Lcom/kubi/quotefacade/market/futures/i;

    .line 271
    .line 272
    .line 273
    invoke-direct {v7, v1, v8, v2}, Lcom/kubi/quotefacade/market/futures/i;-><init>(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;Lcom/kubi/quotefacade/entity/FutureLevel2;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v7}, Lfx/a;->g(Lkotlin/jvm/functions/Function1;)Lfx/a;

    .line 277
    .line 278
    :cond_5
    :goto_1
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 279
    .line 280
    .line 281
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 282
    move v7, v9

    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_6
    iget-object v1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$viewPager:Landroidx/viewpager2/widget/ViewPager2;

    .line 287
    .line 288
    iget v2, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$selectIndex:I

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v2, v6}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, v0}, Lfx/a;->k(Ljava/util/List;)V

    .line 295
    .line 296
    iget-object p1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;

    .line 297
    .line 298
    .line 299
    invoke-static {p1}, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;->u3(Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;)Ljava/util/ArrayList;

    .line 300
    move-result-object p1

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 304
    move-result p1

    .line 305
    .line 306
    if-lez p1, :cond_7

    .line 307
    .line 308
    iget-object p1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$tabLayout:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->u()V

    .line 312
    .line 313
    :cond_7
    iget-object p1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->$tabLayout:Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;

    .line 314
    .line 315
    iget-object v1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;

    .line 316
    .line 317
    new-instance v2, Ljava/util/ArrayList;

    .line 318
    .line 319
    .line 320
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 321
    move-result v3

    .line 322
    .line 323
    .line 324
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 328
    move-result-object v0

    .line 329
    .line 330
    .line 331
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    move-result v3

    .line 333
    .line 334
    if-eqz v3, :cond_b

    .line 335
    .line 336
    .line 337
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    move-result-object v3

    .line 339
    .line 340
    add-int/lit8 v4, v6, 0x1

    .line 341
    .line 342
    if-gez v6, :cond_8

    .line 343
    .line 344
    .line 345
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 346
    .line 347
    :cond_8
    check-cast v3, Lcom/kubi/quotefacade/entity/FutureLevel2;

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, v6}, Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;->q(I)Landroid/view/View;

    .line 351
    move-result-object v5

    .line 352
    const/4 v6, 0x0

    .line 353
    .line 354
    if-eqz v5, :cond_a

    .line 355
    .line 356
    sget v7, Lcom/kubi/quotefacade/R$id;->tv_tab_title:I

    .line 357
    .line 358
    .line 359
    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 360
    move-result-object v5

    .line 361
    .line 362
    check-cast v5, Landroid/widget/TextView;

    .line 363
    .line 364
    if-eqz v5, :cond_a

    .line 365
    .line 366
    .line 367
    invoke-virtual {v3}, Lcom/kubi/quotefacade/entity/FutureLevel2;->getHot()Z

    .line 368
    move-result v3

    .line 369
    .line 370
    if-eqz v3, :cond_9

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 374
    move-result-object v3

    .line 375
    .line 376
    const-string v7, "show hot"

    .line 377
    .line 378
    .line 379
    invoke-static {v3, v7}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 383
    move-result-object v3

    .line 384
    .line 385
    sget v7, Lcom/kubi/quotefacade/R$mipmap;->ic_hot:I

    .line 386
    .line 387
    .line 388
    invoke-virtual {v3, v7}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 389
    move-result-object v3

    .line 390
    goto :goto_3

    .line 391
    .line 392
    .line 393
    :cond_9
    invoke-virtual {v1}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 394
    move-result-object v3

    .line 395
    .line 396
    const-string v7, "not show hot"

    .line 397
    .line 398
    .line 399
    invoke-static {v3, v7}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    move-object v3, v6

    .line 401
    .line 402
    .line 403
    :goto_3
    invoke-virtual {v5, v3, v6, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 404
    move-object v6, v5

    .line 405
    .line 406
    .line 407
    :cond_a
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 408
    move v6, v4

    .line 409
    goto :goto_2

    .line 410
    .line 411
    :cond_b
    iget-object p1, p0, Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$updateAdapter$2;->this$0:Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1}, Lcom/kubi/sdk/BaseFragment;->getTAG()Ljava/lang/String;

    .line 415
    move-result-object p1

    .line 416
    .line 417
    const-string v0, "updateAdapter done"

    .line 418
    .line 419
    .line 420
    invoke-static {p1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    .line 422
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 423
    return-object p1

    .line 424
    .line 425
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 426
    .line 427
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 428
    .line 429
    .line 430
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 431
    throw p1
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
.end method
