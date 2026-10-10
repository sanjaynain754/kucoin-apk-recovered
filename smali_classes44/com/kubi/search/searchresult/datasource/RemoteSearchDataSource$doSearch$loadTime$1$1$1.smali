.class final Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RemoteSearchDataSource.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.kubi.search.searchresult.datasource.RemoteSearchDataSource$doSearch$loadTime$1$1$1"
    f = "RemoteSearchDataSource.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x4e
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext",
        "remoteSpot",
        "remoteFuture",
        "remoteEarn",
        "remoteWeb3",
        "remoteAlpha"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRemoteSearchDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSearchDataSource.kt\ncom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1869#2,2:171\n1#3:173\n*S KotlinDebug\n*F\n+ 1 RemoteSearchDataSource.kt\ncom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1\n*L\n61#1:171,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $alpha:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $depositInfo:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/kubi/search/entity/SearchItemDepositInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $earns:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $futures:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $key:Ljava/lang/String;

.field final synthetic $result:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchEntity;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $spots:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $web3:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchEntity;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/kubi/search/entity/SearchItemDepositInfo;",
            ">;",
            "Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/kubi/search/entity/SearchItemData;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$result:Ljava/util/List;

    iput-object p2, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$key:Ljava/lang/String;

    iput-object p3, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$depositInfo:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p4, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;

    iput-object p5, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$spots:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p6, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$futures:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p7, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$earns:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p8, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$web3:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p9, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$alpha:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 11
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
    new-instance v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$result:Ljava/util/List;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$key:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$depositInfo:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$spots:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$futures:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 15
    .line 16
    iget-object v7, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$earns:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 17
    .line 18
    iget-object v8, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$web3:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 19
    .line 20
    iget-object v9, p0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$alpha:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 21
    move-object v10, p2

    .line 22
    .line 23
    .line 24
    invoke-direct/range {v0 .. v10}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;-><init>(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    iput-object p1, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$0:Ljava/lang/Object;

    .line 27
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x1

    .line 5
    .line 6
    iget-object v7, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$0:Ljava/lang/Object;

    .line 7
    move-object v8, v7

    .line 8
    .line 9
    check-cast v8, Lkotlinx/coroutines/m0;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 13
    move-result-object v7

    .line 14
    .line 15
    iget v9, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->label:I

    .line 16
    const/4 v14, 0x0

    .line 17
    .line 18
    if-eqz v9, :cond_1

    .line 19
    .line 20
    if-ne v9, v6, :cond_0

    .line 21
    .line 22
    iget-object v7, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$5:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v7, Ljava/util/List;

    .line 25
    .line 26
    iget-object v7, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$4:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v7, Ljava/util/List;

    .line 29
    .line 30
    iget-object v7, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$3:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v7, Ljava/util/List;

    .line 33
    .line 34
    iget-object v7, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$2:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, Ljava/util/List;

    .line 37
    .line 38
    iget-object v7, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v7, Ljava/util/List;

    .line 41
    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    move-object/from16 v1, p1

    .line 46
    .line 47
    const/16 v16, 0x4

    .line 48
    .line 49
    const/16 v17, 0x5

    .line 50
    .line 51
    const/16 v18, 0x3

    .line 52
    .line 53
    const/16 v19, 0x2

    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    throw v1

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    .line 68
    new-instance v15, Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    new-instance v9, Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    new-instance v10, Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    new-instance v11, Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    new-instance v12, Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    iget-object v13, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$result:Ljava/util/List;

    .line 94
    .line 95
    if-eqz v13, :cond_9

    .line 96
    .line 97
    .line 98
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    move-result-object v13

    .line 100
    .line 101
    .line 102
    :cond_2
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    move-result v16

    .line 104
    .line 105
    if-eqz v16, :cond_9

    .line 106
    .line 107
    .line 108
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    move-result-object v16

    .line 110
    .line 111
    const/16 v17, 0x5

    .line 112
    .line 113
    move-object/from16 v1, v16

    .line 114
    .line 115
    check-cast v1, Lcom/kubi/search/entity/SearchEntity;

    .line 116
    .line 117
    const/16 v16, 0x4

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Lcom/kubi/search/entity/SearchEntity;->getResourceType()Ljava/lang/String;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    const/16 v18, 0x3

    .line 124
    .line 125
    if-eqz v2, :cond_3

    .line 126
    .line 127
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 128
    .line 129
    const/16 v19, 0x2

    .line 130
    .line 131
    const-string v4, "US"

    .line 132
    .line 133
    .line 134
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 138
    move-result-object v2

    .line 139
    .line 140
    const-string v3, "toLowerCase(...)"

    .line 141
    .line 142
    .line 143
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    goto :goto_1

    .line 145
    .line 146
    :cond_3
    const/16 v19, 0x2

    .line 147
    move-object v2, v14

    .line 148
    .line 149
    :goto_1
    if-eqz v2, :cond_2

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 153
    move-result v3

    .line 154
    .line 155
    .line 156
    sparse-switch v3, :sswitch_data_0

    .line 157
    goto :goto_0

    .line 158
    .line 159
    :sswitch_0
    const-string v3, "alpha"

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    move-result v2

    .line 164
    .line 165
    if-nez v2, :cond_4

    .line 166
    goto :goto_0

    .line 167
    .line 168
    .line 169
    :cond_4
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    goto :goto_0

    .line 171
    .line 172
    :sswitch_1
    const-string v3, "web3"

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    move-result v2

    .line 177
    .line 178
    if-nez v2, :cond_5

    .line 179
    goto :goto_0

    .line 180
    .line 181
    .line 182
    :cond_5
    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 183
    goto :goto_0

    .line 184
    .line 185
    :sswitch_2
    const-string v3, "spot"

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    move-result v2

    .line 190
    .line 191
    if-nez v2, :cond_6

    .line 192
    goto :goto_0

    .line 193
    .line 194
    .line 195
    :cond_6
    invoke-interface {v15, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    goto :goto_0

    .line 197
    .line 198
    :sswitch_3
    const-string v3, "earn"

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    move-result v2

    .line 203
    .line 204
    if-nez v2, :cond_7

    .line 205
    goto :goto_0

    .line 206
    .line 207
    .line 208
    :cond_7
    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    goto :goto_0

    .line 210
    .line 211
    :sswitch_4
    const-string v3, "future"

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    move-result v2

    .line 216
    .line 217
    if-nez v2, :cond_8

    .line 218
    goto :goto_0

    .line 219
    .line 220
    .line 221
    :cond_8
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    goto :goto_0

    .line 223
    .line 224
    :cond_9
    const/16 v16, 0x4

    .line 225
    .line 226
    const/16 v17, 0x5

    .line 227
    .line 228
    const/16 v18, 0x3

    .line 229
    .line 230
    const/16 v19, 0x2

    .line 231
    .line 232
    sget-object v1, Lcom/kubi/search/utils/f;->a:Lcom/kubi/search/utils/f;

    .line 233
    .line 234
    iget-object v2, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$key:Ljava/lang/String;

    .line 235
    .line 236
    const-string v3, "data_classify"

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v2, v3}, Lcom/kubi/search/utils/f;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    move-object v1, v11

    .line 241
    .line 242
    new-instance v11, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$1;

    .line 243
    .line 244
    iget-object v2, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;

    .line 245
    .line 246
    .line 247
    invoke-direct {v11, v2, v15, v14}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$1;-><init>(Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 248
    move-object v2, v12

    .line 249
    const/4 v12, 0x3

    .line 250
    const/4 v13, 0x0

    .line 251
    move-object v3, v9

    .line 252
    const/4 v9, 0x0

    .line 253
    move-object v4, v10

    .line 254
    const/4 v10, 0x0

    .line 255
    .line 256
    .line 257
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 258
    move-result-object v20

    .line 259
    .line 260
    new-instance v11, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$2;

    .line 261
    .line 262
    iget-object v9, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;

    .line 263
    .line 264
    .line 265
    invoke-direct {v11, v9, v3, v14}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$2;-><init>(Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 266
    const/4 v9, 0x0

    .line 267
    .line 268
    .line 269
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 270
    move-result-object v21

    .line 271
    .line 272
    new-instance v11, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$3;

    .line 273
    .line 274
    iget-object v9, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;

    .line 275
    .line 276
    .line 277
    invoke-direct {v11, v9, v4, v14}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$3;-><init>(Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 278
    const/4 v9, 0x0

    .line 279
    .line 280
    .line 281
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 282
    move-result-object v22

    .line 283
    .line 284
    new-instance v11, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4;

    .line 285
    .line 286
    iget-object v9, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;

    .line 287
    .line 288
    .line 289
    invoke-direct {v11, v9, v1, v14}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$4;-><init>(Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 290
    const/4 v9, 0x0

    .line 291
    .line 292
    .line 293
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 294
    move-result-object v23

    .line 295
    .line 296
    new-instance v11, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$5;

    .line 297
    .line 298
    iget-object v9, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;

    .line 299
    .line 300
    .line 301
    invoke-direct {v11, v9, v15, v14}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$5;-><init>(Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 302
    const/4 v9, 0x0

    .line 303
    .line 304
    .line 305
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 306
    move-result-object v24

    .line 307
    .line 308
    new-instance v11, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$6;

    .line 309
    .line 310
    iget-object v9, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->this$0:Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;

    .line 311
    .line 312
    .line 313
    invoke-direct {v11, v9, v2, v14}, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1$lists$6;-><init>(Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 314
    const/4 v9, 0x0

    .line 315
    .line 316
    .line 317
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 318
    move-result-object v9

    .line 319
    const/4 v10, 0x6

    .line 320
    .line 321
    new-array v10, v10, [Lkotlinx/coroutines/r0;

    .line 322
    .line 323
    aput-object v20, v10, v5

    .line 324
    .line 325
    aput-object v21, v10, v6

    .line 326
    .line 327
    aput-object v22, v10, v19

    .line 328
    .line 329
    aput-object v23, v10, v18

    .line 330
    .line 331
    aput-object v24, v10, v16

    .line 332
    .line 333
    aput-object v9, v10, v17

    .line 334
    .line 335
    .line 336
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 337
    move-result-object v9

    .line 338
    .line 339
    .line 340
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    move-result-object v8

    .line 342
    .line 343
    iput-object v8, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$0:Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    move-result-object v8

    .line 348
    .line 349
    iput-object v8, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$1:Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    move-result-object v3

    .line 354
    .line 355
    iput-object v3, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$2:Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    move-result-object v3

    .line 360
    .line 361
    iput-object v3, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$3:Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    move-result-object v1

    .line 366
    .line 367
    iput-object v1, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$4:Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    move-result-object v1

    .line 372
    .line 373
    iput-object v1, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->L$5:Ljava/lang/Object;

    .line 374
    .line 375
    iput v6, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->label:I

    .line 376
    .line 377
    .line 378
    invoke-static {v9, v0}, Lkotlinx/coroutines/AwaitKt;->a(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 379
    move-result-object v1

    .line 380
    .line 381
    if-ne v1, v7, :cond_a

    .line 382
    return-object v7

    .line 383
    .line 384
    :cond_a
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 385
    .line 386
    .line 387
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 388
    move-result-object v2

    .line 389
    .line 390
    instance-of v3, v2, Ljava/util/List;

    .line 391
    .line 392
    if-eqz v3, :cond_b

    .line 393
    .line 394
    check-cast v2, Ljava/util/List;

    .line 395
    goto :goto_3

    .line 396
    :cond_b
    move-object v2, v14

    .line 397
    .line 398
    :goto_3
    if-eqz v2, :cond_c

    .line 399
    .line 400
    iget-object v3, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$spots:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 401
    .line 402
    iput-object v2, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    :cond_c
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 406
    move-result-object v2

    .line 407
    .line 408
    instance-of v3, v2, Ljava/util/List;

    .line 409
    .line 410
    if-eqz v3, :cond_d

    .line 411
    .line 412
    check-cast v2, Ljava/util/List;

    .line 413
    goto :goto_4

    .line 414
    :cond_d
    move-object v2, v14

    .line 415
    .line 416
    :goto_4
    if-eqz v2, :cond_e

    .line 417
    .line 418
    iget-object v3, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$futures:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 419
    .line 420
    iput-object v2, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 421
    .line 422
    :cond_e
    move/from16 v2, v19

    .line 423
    .line 424
    .line 425
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    move-result-object v2

    .line 427
    .line 428
    instance-of v3, v2, Ljava/util/List;

    .line 429
    .line 430
    if-eqz v3, :cond_f

    .line 431
    .line 432
    check-cast v2, Ljava/util/List;

    .line 433
    goto :goto_5

    .line 434
    :cond_f
    move-object v2, v14

    .line 435
    .line 436
    :goto_5
    if-eqz v2, :cond_10

    .line 437
    .line 438
    iget-object v3, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$earns:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 439
    .line 440
    iput-object v2, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 441
    .line 442
    :cond_10
    move/from16 v2, v18

    .line 443
    .line 444
    .line 445
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    move-result-object v2

    .line 447
    .line 448
    instance-of v3, v2, Ljava/util/List;

    .line 449
    .line 450
    if-eqz v3, :cond_11

    .line 451
    .line 452
    check-cast v2, Ljava/util/List;

    .line 453
    goto :goto_6

    .line 454
    :cond_11
    move-object v2, v14

    .line 455
    .line 456
    :goto_6
    if-eqz v2, :cond_12

    .line 457
    .line 458
    iget-object v3, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$web3:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 459
    .line 460
    iput-object v2, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 461
    .line 462
    :cond_12
    iget-object v2, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$depositInfo:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 463
    .line 464
    move/from16 v3, v16

    .line 465
    .line 466
    .line 467
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 468
    move-result-object v3

    .line 469
    .line 470
    instance-of v4, v3, Lcom/kubi/search/entity/SearchItemDepositInfo;

    .line 471
    .line 472
    if-eqz v4, :cond_13

    .line 473
    .line 474
    check-cast v3, Lcom/kubi/search/entity/SearchItemDepositInfo;

    .line 475
    goto :goto_7

    .line 476
    :cond_13
    move-object v3, v14

    .line 477
    .line 478
    :goto_7
    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 479
    .line 480
    move/from16 v2, v17

    .line 481
    .line 482
    .line 483
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 484
    move-result-object v1

    .line 485
    .line 486
    instance-of v2, v1, Ljava/util/List;

    .line 487
    .line 488
    if-eqz v2, :cond_14

    .line 489
    move-object v14, v1

    .line 490
    .line 491
    check-cast v14, Ljava/util/List;

    .line 492
    .line 493
    :cond_14
    if-eqz v14, :cond_15

    .line 494
    .line 495
    iget-object v1, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$alpha:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 496
    .line 497
    iput-object v14, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 498
    .line 499
    :cond_15
    sget-object v1, Lcom/kubi/search/utils/f;->a:Lcom/kubi/search/utils/f;

    .line 500
    .line 501
    iget-object v2, v0, Lcom/kubi/search/searchresult/datasource/RemoteSearchDataSource$doSearch$loadTime$1$1$1;->$key:Ljava/lang/String;

    .line 502
    .line 503
    const-string v3, "data_convert"

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1, v2, v3}, Lcom/kubi/search/utils/f;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    .line 508
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 509
    return-object v1

    .line 510
    nop

    :sswitch_data_0
    .sparse-switch
        -0x4b4a723d -> :sswitch_4
        0x2f63d8 -> :sswitch_3
        0x35f902 -> :sswitch_2
        0x379f5f -> :sswitch_1
        0x589b15e -> :sswitch_0
    .end sparse-switch
.end method
