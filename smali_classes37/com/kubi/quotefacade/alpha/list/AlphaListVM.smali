.class public final Lcom/kubi/quotefacade/alpha/list/AlphaListVM;
.super Lcom/kubi/mvi/state/m;
.source "AlphaListVM.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/m<",
        "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0014\u001a\u00020\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0015H\u0016J\u0008\u0010\u0017\u001a\u00020\u0015H\u0014J\u0008\u0010\u0018\u001a\u00020\u0015H\u0002J\u0016\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0094@\u00a2\u0006\u0002\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@\u00a2\u0006\u0002\u0010%J&\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\u000c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@\u00a2\u0006\u0002\u0010(J0\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010 \u001a\u00020\u000c2\u0006\u0010+\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@\u00a2\u0006\u0002\u0010,J \u0010-\u001a\u00020.2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010/\u001a\u00020\u00152\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u000101H\u0002J\u001e\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u00106R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u00067"
    }
    d2 = {
        "Lcom/kubi/quotefacade/alpha/list/AlphaListVM;",
        "Lcom/kubi/mvi/state/SingleSimpleStateVM;",
        "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;",
        "<init>",
        "()V",
        "repository",
        "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;",
        "wsHelper",
        "Lcom/kubi/kucoin/manager/MarketWsHelper;",
        "currentRequestPage",
        "",
        "TAG",
        "",
        "lastFetchDataListIntent",
        "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;",
        "networkRecovery",
        "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;",
        "initState",
        "getInitState",
        "()Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;",
        "onShow",
        "",
        "onHide",
        "onCleared",
        "requestNetworkRecoveryRefresh",
        "dispatchIntent",
        "intent",
        "Lcom/kubi/mvi/state/IIntent;",
        "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchDataList",
        "resetRefresh",
        "",
        "alphaType",
        "menu",
        "Lcom/kubi/quotefacade/constant/AlphaMenu;",
        "localParam",
        "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;",
        "(ZLjava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadMoreDataList",
        "type",
        "(Ljava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadPage",
        "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;",
        "currentPage",
        "(Ljava/lang/String;ILcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "convertBodyParams",
        "Lcom/kubi/quotefacade/entity/AlphaListBodyParam;",
        "subscribeWs",
        "symbols",
        "",
        "favAlpha",
        "alphaItem",
        "Lcom/kubi/quotefacade/entity/AlphaItemEntity;",
        "position",
        "(Lcom/kubi/quotefacade/entity/AlphaItemEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "QuoteFacadeLib_googleRelease"
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
        "SMAP\nAlphaListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaListVM.kt\ncom/kubi/quotefacade/alpha/list/AlphaListVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n774#2:200\n865#2,2:201\n1#3:203\n*S KotlinDebug\n*F\n+ 1 AlphaListVM.kt\ncom/kubi/quotefacade/alpha/list/AlphaListVM\n*L\n103#1:200\n103#1:201,2\n*E\n"
    }
.end annotation


# instance fields
.field public final X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lcom/kubi/kucoin/manager/MarketWsHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:I

.field public final a0:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b0:Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c0:Lyz/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/m;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/kucoin/manager/MarketWsHelper;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/kubi/kucoin/manager/MarketWsHelper;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Y:Lcom/kubi/kucoin/manager/MarketWsHelper;

    .line 18
    const/4 v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Z:I

    .line 21
    .line 22
    const-string v0, "AlphaListVM"

    .line 23
    .line 24
    iput-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->a0:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v1, Lyz/a;

    .line 27
    .line 28
    new-instance v2, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$networkRecovery$1;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2, p0}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$networkRecovery$1;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v0, v2}, Lyz/a;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    iput-object v1, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->c0:Lyz/a;

    .line 37
    return-void
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
.end method

.method public static synthetic b(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->s(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;Ljava/util/List;)Lkotlin/Unit;

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
.end method

.method public static final synthetic d(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;Lcom/kubi/quotefacade/entity/AlphaItemEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->j(Lcom/kubi/quotefacade/entity/AlphaItemEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic e(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;ZLjava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->k(ZLjava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic f(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;Ljava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->o(Ljava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic g(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->q()V

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
.end method

.method public static final i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 3
    .line 4
    const/16 v5, 0xf

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;->setFilterBy(Ljava/lang/String;)V

    .line 16
    .line 17
    const-string p0, ""

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    move-object p1, p0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0, p1}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;->setGte(Ljava/lang/String;)V

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    move-object p2, p0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v0, p2}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;->setLte(Ljava/lang/String;)V

    .line 30
    return-object v0
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
.end method

.method public static final s(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/quotefacade/alpha/list/j;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/kubi/quotefacade/alpha/list/j;-><init>(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    return-object p0
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
.end method


# virtual methods
.method public dispatchIntent(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lcom/kubi/mvi/state/d;
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
            "Lcom/kubi/mvi/state/d;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->b0:Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;->getResetRefresh()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;->getAlphaType()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;->getMenu()Lcom/kubi/quotefacade/constant/AlphaMenu;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;->getParam()Lcom/kubi/quotefacade/alpha/a$a;

    .line 24
    move-result-object v4

    .line 25
    move-object v0, p0

    .line 26
    move-object v5, p2

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->k(ZLjava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    if-ne p1, p2, :cond_0

    .line 37
    return-object p1

    .line 38
    .line 39
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p1

    .line 41
    :cond_1
    move-object v0, p0

    .line 42
    move-object v5, p2

    .line 43
    .line 44
    instance-of p2, p1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$LoadMoreDataList;

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    check-cast p1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$LoadMoreDataList;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$LoadMoreDataList;->getAlphaType()Ljava/lang/String;

    .line 52
    move-result-object p2

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$LoadMoreDataList;->getMenu()Lcom/kubi/quotefacade/constant/AlphaMenu;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$LoadMoreDataList;->getParam()Lcom/kubi/quotefacade/alpha/a$a;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p2, v1, p1, v5}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->o(Ljava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    if-ne p1, p2, :cond_2

    .line 71
    return-object p1

    .line 72
    .line 73
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    return-object p1

    .line 75
    .line 76
    :cond_3
    instance-of p2, p1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchWsDataList;

    .line 77
    .line 78
    if-eqz p2, :cond_4

    .line 79
    .line 80
    check-cast p1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchWsDataList;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchWsDataList;->getSymbols()Ljava/util/List;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->r(Ljava/util/List;)V

    .line 88
    goto :goto_0

    .line 89
    .line 90
    :cond_4
    instance-of p2, p1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$CollectOrCancelChain;

    .line 91
    .line 92
    if-eqz p2, :cond_5

    .line 93
    .line 94
    check-cast p1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$CollectOrCancelChain;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$CollectOrCancelChain;->getAlphaItem()Lcom/kubi/quotefacade/entity/AlphaItemEntity;

    .line 98
    move-result-object p2

    .line 99
    .line 100
    if-eqz p2, :cond_5

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$CollectOrCancelChain;->getItemPosition()I

    .line 104
    move-result p1

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p2, p1, v5}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->j(Lcom/kubi/quotefacade/entity/AlphaItemEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    if-ne p1, p2, :cond_5

    .line 115
    return-object p1

    .line 116
    .line 117
    :cond_5
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 118
    return-object p1
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

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->n()Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;

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
.end method

.method public final h(ILcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;)Lcom/kubi/quotefacade/entity/AlphaListBodyParam;
    .locals 22

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Lcom/kubi/quotefacade/alpha/a$a;->a()Lcom/kubi/quotefacade/entity/ChainFilterData;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;

    .line 7
    .line 8
    const/16 v10, 0xff

    .line 9
    const/4 v11, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v1 .. v11}, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    sget-object v2, Lcom/kubi/quotefacade/alpha/a;->a:Lcom/kubi/quotefacade/alpha/a;

    .line 23
    .line 24
    move-object/from16 v3, p2

    .line 25
    .line 26
    move-object/from16 v4, p3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3, v4}, Lcom/kubi/quotefacade/alpha/a;->c(Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;)Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;->setL1Keyword(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Lcom/kubi/quotefacade/alpha/a$a;->g()Lcom/kubi/quotefacade/constant/TimeSelectedEnum;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/kubi/quotefacade/constant/TimeSelectedEnum;->getConstTimeTag()Ljava/lang/String;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    const-string v3, "5m"

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result v3

    .line 48
    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    const-string v2, "5min"

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;->setSpan(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Lcom/kubi/quotefacade/alpha/a$a;->e()Ljava/lang/String;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;->setOrderBy(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Lcom/kubi/quotefacade/alpha/a$a;->f()Ljava/lang/String;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;->setOrder(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;->setPageNum(Ljava/lang/Integer;)V

    .line 76
    .line 77
    const/16 v2, 0x32

    .line 78
    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;->setPageSize(Ljava/lang/Integer;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMinPriceChange24h()Ljava/lang/String;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMaxPriceChange24h()Ljava/lang/String;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    const-string v5, "priceRate"

    .line 95
    .line 96
    .line 97
    invoke-static {v5, v2, v3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 98
    move-result-object v6

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMinTxCount24h()Ljava/lang/String;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMaxTxCount24h()Ljava/lang/String;

    .line 106
    move-result-object v3

    .line 107
    .line 108
    const-string v5, "txCount"

    .line 109
    .line 110
    .line 111
    invoke-static {v5, v2, v3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 112
    move-result-object v7

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMinMakers24h()Ljava/lang/String;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMaxMakers24h()Ljava/lang/String;

    .line 120
    move-result-object v3

    .line 121
    .line 122
    const-string v5, "tradingAddressCount"

    .line 123
    .line 124
    .line 125
    invoke-static {v5, v2, v3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 126
    move-result-object v8

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMinHolders()Ljava/lang/String;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMaxHolders()Ljava/lang/String;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    const-string v5, "tokenHolderCount"

    .line 137
    .line 138
    .line 139
    invoke-static {v5, v2, v3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 140
    move-result-object v9

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMinVolume24h()Ljava/lang/String;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMaxVolume24h()Ljava/lang/String;

    .line 148
    move-result-object v3

    .line 149
    .line 150
    const-string v5, "tradingVolume"

    .line 151
    .line 152
    .line 153
    invoke-static {v5, v2, v3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 154
    move-result-object v10

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMinTvl()Ljava/lang/String;

    .line 158
    move-result-object v2

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMaxTvl()Ljava/lang/String;

    .line 162
    move-result-object v3

    .line 163
    .line 164
    const-string v5, "tokenLiquidity"

    .line 165
    .line 166
    .line 167
    invoke-static {v5, v2, v3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 168
    move-result-object v11

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMinFdv()Ljava/lang/String;

    .line 172
    move-result-object v2

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMaxFdv()Ljava/lang/String;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    const-string v5, "fdv"

    .line 179
    .line 180
    .line 181
    invoke-static {v5, v2, v3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 182
    move-result-object v12

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMinMarketCap()Ljava/lang/String;

    .line 186
    move-result-object v2

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getMaxMarketCap()Ljava/lang/String;

    .line 190
    move-result-object v3

    .line 191
    .line 192
    const-string v5, "marketCap"

    .line 193
    .line 194
    .line 195
    invoke-static {v5, v2, v3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 196
    move-result-object v13

    .line 197
    .line 198
    new-instance v14, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 199
    .line 200
    const/16 v19, 0xf

    .line 201
    .line 202
    const/16 v20, 0x0

    .line 203
    const/4 v15, 0x0

    .line 204
    .line 205
    const/16 v16, 0x0

    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    const/16 v18, 0x0

    .line 210
    .line 211
    .line 212
    invoke-direct/range {v14 .. v20}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 213
    .line 214
    const-string v2, "riskLevel"

    .line 215
    .line 216
    .line 217
    invoke-virtual {v14, v2}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;->setFilterBy(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/ChainFilterData;->getAve()Z

    .line 221
    move-result v0

    .line 222
    .line 223
    if-eqz v0, :cond_1

    .line 224
    .line 225
    const-string v0, "0"

    .line 226
    goto :goto_0

    .line 227
    .line 228
    :cond_1
    const-string v0, "-1"

    .line 229
    .line 230
    .line 231
    :goto_0
    invoke-virtual {v14, v0}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;->setEq(Ljava/lang/String;)V

    .line 232
    .line 233
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 234
    .line 235
    new-instance v15, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 236
    .line 237
    const/16 v20, 0xf

    .line 238
    .line 239
    const/16 v21, 0x0

    .line 240
    .line 241
    const/16 v16, 0x0

    .line 242
    .line 243
    const/16 v17, 0x0

    .line 244
    .line 245
    const/16 v18, 0x0

    .line 246
    .line 247
    const/16 v19, 0x0

    .line 248
    .line 249
    .line 250
    invoke-direct/range {v15 .. v21}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 251
    .line 252
    const-string v0, "network"

    .line 253
    .line 254
    .line 255
    invoke-virtual {v15, v0}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;->setFilterBy(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4}, Lcom/kubi/quotefacade/alpha/a$a;->d()Lcom/kubi/quotefacade/entity/AlphaNetworks;

    .line 259
    move-result-object v0

    .line 260
    .line 261
    if-eqz v0, :cond_2

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/AlphaNetworks;->getExternalChain()Ljava/lang/String;

    .line 265
    move-result-object v0

    .line 266
    .line 267
    if-nez v0, :cond_3

    .line 268
    .line 269
    :cond_2
    const-string v0, "ALL"

    .line 270
    .line 271
    .line 272
    :cond_3
    invoke-virtual {v15, v0}, Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;->setEq(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    filled-new-array/range {v6 .. v15}, [Lcom/kubi/quotefacade/entity/AlphaListBodyEntity;

    .line 276
    move-result-object v0

    .line 277
    .line 278
    .line 279
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 280
    move-result-object v0

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v0}, Lcom/kubi/quotefacade/entity/AlphaListBodyParam;->setItemFilters(Ljava/util/List;)V

    .line 284
    return-object v1
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
.end method

.method public final j(Lcom/kubi/quotefacade/entity/AlphaItemEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/AlphaItemEntity;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;-><init>(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->label:I

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
    iget p2, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->I$0:I

    .line 40
    .line 41
    iget-object p1, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/kubi/quotefacade/entity/AlphaItemEntity;

    .line 44
    .line 45
    .line 46
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    throw p1

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    iget-object p3, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 61
    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getToken()Ljava/lang/String;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const/16 v4, 0x2d

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getExternalChain()Ljava/lang/String;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    .line 91
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    iput-object p1, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput p2, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->I$0:I

    .line 97
    .line 98
    iput v3, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$favAlpha$1;->label:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p3, v2, v0}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->f(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 102
    move-result-object p3

    .line 103
    .line 104
    if-ne p3, v1, :cond_3

    .line 105
    return-object v1

    .line 106
    .line 107
    :cond_3
    :goto_1
    new-instance p3, Lcom/kubi/quotefacade/alpha/list/g;

    .line 108
    .line 109
    .line 110
    invoke-direct {p3, p1, p2}, Lcom/kubi/quotefacade/alpha/list/g;-><init>(Lcom/kubi/quotefacade/entity/AlphaItemEntity;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p3}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 114
    .line 115
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 116
    return-object p1
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
.end method

.method public final k(ZLjava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Lcom/kubi/quotefacade/constant/AlphaMenu;",
            "Lcom/kubi/quotefacade/alpha/a$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p5, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p5

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->label:I

    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p5}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;-><init>(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p5, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->label:I

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iget-object p1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->L$2:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/kubi/quotefacade/alpha/a$a;

    .line 44
    .line 45
    iget-object p1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->L$1:Ljava/lang/Object;

    .line 46
    move-object p3, p1

    .line 47
    .line 48
    check-cast p3, Lcom/kubi/quotefacade/constant/AlphaMenu;

    .line 49
    .line 50
    iget-object p1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    move-object v1, p0

    .line 57
    goto :goto_2

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    throw p1

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iput v2, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Z:I

    .line 73
    .line 74
    :cond_3
    iget v3, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Z:I

    .line 75
    .line 76
    .line 77
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    move-result-object p5

    .line 79
    .line 80
    iput-object p5, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p3, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    move-result-object p5

    .line 87
    .line 88
    iput-object p5, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->L$2:Ljava/lang/Object;

    .line 89
    .line 90
    iput-boolean p1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->Z$0:Z

    .line 91
    .line 92
    iput v2, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$fetchDataList$1;->label:I

    .line 93
    move-object v1, p0

    .line 94
    move-object v2, p2

    .line 95
    move-object v4, p3

    .line 96
    move-object v5, p4

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->p(Ljava/lang/String;ILcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 100
    move-result-object p5

    .line 101
    .line 102
    if-ne p5, v0, :cond_4

    .line 103
    return-object v0

    .line 104
    :cond_4
    move-object p3, v4

    .line 105
    .line 106
    :goto_2
    check-cast p5, Lcom/kubi/quotefacade/entity/AlphaMarketEntity;

    .line 107
    .line 108
    if-eqz p5, :cond_5

    .line 109
    .line 110
    .line 111
    invoke-virtual {p5}, Lcom/kubi/quotefacade/entity/AlphaMarketEntity;->getItems()Ljava/util/List;

    .line 112
    move-result-object p1

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    const/4 p1, 0x0

    .line 115
    .line 116
    :goto_3
    if-nez p1, :cond_6

    .line 117
    .line 118
    .line 119
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    :cond_6
    new-instance p2, Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    move-result p4

    .line 134
    .line 135
    if-eqz p4, :cond_9

    .line 136
    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    move-result-object p4

    .line 140
    move-object v0, p4

    .line 141
    .line 142
    check-cast v0, Lcom/kubi/quotefacade/entity/AlphaItemEntity;

    .line 143
    .line 144
    sget-object v2, Lcom/kubi/quotefacade/constant/AlphaMenu;->NEW:Lcom/kubi/quotefacade/constant/AlphaMenu;

    .line 145
    .line 146
    if-eq p3, v2, :cond_8

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;->getAlphaOpeningAt()Ljava/lang/Long;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-static {v0}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 154
    move-result-wide v2

    .line 155
    .line 156
    const-wide/16 v4, 0x0

    .line 157
    .line 158
    cmp-long v0, v2, v4

    .line 159
    .line 160
    if-gtz v0, :cond_7

    .line 161
    .line 162
    .line 163
    :cond_8
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 164
    goto :goto_4

    .line 165
    .line 166
    :cond_9
    new-instance p1, Lcom/kubi/quotefacade/alpha/list/h;

    .line 167
    .line 168
    if-eqz p5, :cond_a

    .line 169
    .line 170
    .line 171
    invoke-virtual {p5}, Lcom/kubi/quotefacade/entity/AlphaMarketEntity;->getItems()Ljava/util/List;

    .line 172
    move-result-object p2

    .line 173
    .line 174
    if-nez p2, :cond_b

    .line 175
    .line 176
    .line 177
    :cond_a
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 178
    move-result-object p2

    .line 179
    .line 180
    .line 181
    :cond_b
    invoke-direct {p1, p2}, Lcom/kubi/quotefacade/alpha/list/h;-><init>(Ljava/util/List;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 185
    .line 186
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 187
    return-object p1
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
.end method

.method public n()Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;-><init>()V

    .line 6
    return-object v0
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
.end method

.method public final o(Ljava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/quotefacade/constant/AlphaMenu;",
            "Lcom/kubi/quotefacade/alpha/a$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p4, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p4

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->label:I

    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p4}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;-><init>(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p4, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->label:I

    .line 35
    const/4 v7, 0x1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v7, :cond_1

    .line 40
    .line 41
    iget-object p1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->L$2:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/kubi/quotefacade/alpha/a$a;

    .line 44
    .line 45
    iget-object p1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lcom/kubi/quotefacade/constant/AlphaMenu;

    .line 48
    .line 49
    iget-object p1, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    move-object v1, p0

    .line 56
    goto :goto_2

    .line 57
    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p1

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    iget p4, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Z:I

    .line 70
    .line 71
    add-int/lit8 v3, p4, 0x1

    .line 72
    .line 73
    iput v3, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Z:I

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    move-result-object p4

    .line 78
    .line 79
    iput-object p4, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    move-result-object p4

    .line 84
    .line 85
    iput-object p4, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->L$1:Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    move-result-object p4

    .line 90
    .line 91
    iput-object p4, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->L$2:Ljava/lang/Object;

    .line 92
    .line 93
    iput v7, v6, Lcom/kubi/quotefacade/alpha/list/AlphaListVM$loadMoreDataList$1;->label:I

    .line 94
    move-object v1, p0

    .line 95
    move-object v2, p1

    .line 96
    move-object v4, p2

    .line 97
    move-object v5, p3

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->p(Ljava/lang/String;ILcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 101
    move-result-object p4

    .line 102
    .line 103
    if-ne p4, v0, :cond_3

    .line 104
    return-object v0

    .line 105
    .line 106
    :cond_3
    :goto_2
    check-cast p4, Lcom/kubi/quotefacade/entity/AlphaMarketEntity;

    .line 107
    const/4 p1, 0x0

    .line 108
    .line 109
    if-eqz p4, :cond_4

    .line 110
    .line 111
    .line 112
    invoke-virtual {p4}, Lcom/kubi/quotefacade/entity/AlphaMarketEntity;->getItems()Ljava/util/List;

    .line 113
    move-result-object p2

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    move-object p2, p1

    .line 116
    .line 117
    :goto_3
    if-nez p2, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    :cond_5
    if-eqz p4, :cond_6

    .line 124
    .line 125
    .line 126
    invoke-virtual {p4}, Lcom/kubi/quotefacade/entity/AlphaMarketEntity;->getCurrentPage()Ljava/lang/Integer;

    .line 127
    move-result-object p3

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    move-object p3, p1

    .line 130
    .line 131
    .line 132
    :goto_4
    invoke-static {p3}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 133
    move-result p3

    .line 134
    .line 135
    if-eqz p4, :cond_7

    .line 136
    .line 137
    .line 138
    invoke-virtual {p4}, Lcom/kubi/quotefacade/entity/AlphaMarketEntity;->getTotalPage()Ljava/lang/Integer;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 143
    move-result p1

    .line 144
    .line 145
    if-ge p3, p1, :cond_8

    .line 146
    goto :goto_5

    .line 147
    :cond_8
    const/4 v7, 0x0

    .line 148
    .line 149
    :goto_5
    new-instance p1, Lcom/kubi/quotefacade/alpha/list/i;

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, p2, v7}, Lcom/kubi/quotefacade/alpha/list/i;-><init>(Ljava/util/List;Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 156
    .line 157
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 158
    return-object p1
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

.method public onCleared()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->c0:Lyz/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lyz/a;->e()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateVM;->onCleared()V

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
.end method

.method public onHide()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->c0:Lyz/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lyz/a;->f()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onHide()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Y:Lcom/kubi/kucoin/manager/MarketWsHelper;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/kucoin/manager/MarketWsHelper;->F()V

    .line 14
    return-void
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
.end method

.method public onShow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onShow()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->c0:Lyz/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lyz/a;->g()V

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
.end method

.method public final p(Ljava/lang/String;ILcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/kubi/quotefacade/constant/AlphaMenu;",
            "Lcom/kubi/quotefacade/alpha/a$a;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->X:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 3
    .line 4
    iget v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Z:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, p3, p4}, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->h(ILcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;)Lcom/kubi/quotefacade/entity/AlphaListBodyParam;

    .line 8
    move-result-object p3

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p1, p3, p5}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->r(Ljava/lang/String;Lcom/kubi/quotefacade/entity/AlphaListBodyParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public final q()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->b0:Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->a0:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "network recovered: skip FetchDataList, no previous params"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance v1, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;->getAlphaType()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;->getMenu()Lcom/kubi/quotefacade/constant/AlphaMenu;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;->getParam()Lcom/kubi/quotefacade/alpha/a$a;

    .line 26
    move-result-object v0

    .line 27
    const/4 v4, 0x1

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v4, v2, v3, v0}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;-><init>(ZLjava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/a$a;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/kubi/mvi/state/BaseStateVM;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 34
    return-void
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
.end method

.method public final r(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->a0:Ljava/lang/String;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "symbols="

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->b0:Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;->getParam()Lcom/kubi/quotefacade/alpha/a$a;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/quotefacade/alpha/a$a;->g()Lcom/kubi/quotefacade/constant/TimeSelectedEnum;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/quotefacade/constant/TimeSelectedEnum;->getConstTimeTag()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lcom/kubi/kucoin/manager/i;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    :goto_0
    move-object v3, v0

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_1
    const-string v0, "24h"

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :goto_1
    iget-object v1, p0, Lcom/kubi/quotefacade/alpha/list/AlphaListVM;->Y:Lcom/kubi/kucoin/manager/MarketWsHelper;

    .line 61
    .line 62
    new-instance v6, Lcom/kubi/quotefacade/alpha/list/r0;

    .line 63
    .line 64
    .line 65
    invoke-direct {v6, p0}, Lcom/kubi/quotefacade/alpha/list/r0;-><init>(Lcom/kubi/quotefacade/alpha/list/AlphaListVM;)V

    .line 66
    const/4 v7, 0x4

    .line 67
    const/4 v8, 0x0

    .line 68
    .line 69
    const-wide/16 v4, 0x0

    .line 70
    move-object v2, p1

    .line 71
    .line 72
    .line 73
    invoke-static/range {v1 .. v8}, Lcom/kubi/kucoin/manager/MarketWsHelper;->x(Lcom/kubi/kucoin/manager/MarketWsHelper;Ljava/util/List;Ljava/lang/String;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 74
    return-void
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
.end method
