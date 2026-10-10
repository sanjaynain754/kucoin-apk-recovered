.class public final enum Lcom/kubi/quotefacade/constant/ChainSortItemEnum;
.super Ljava/lang/Enum;
.source "ChainSortItemEnum.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/quotefacade/constant/ChainSortItemEnum$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kubi/quotefacade/constant/ChainSortItemEnum;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0086\u0081\u0002\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/kubi/quotefacade/constant/ChainSortItemEnum;",
        "",
        "constSortType",
        "",
        "resourceId",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;I)V",
        "getConstSortType",
        "()Ljava/lang/String;",
        "getResourceId",
        "()I",
        "CHAIN_SORT_TYPE_VOLUME",
        "CHAIN_SORT_TYPE_PRICE",
        "CHAIN_SORT_TYPE_CHANGE",
        "CHAIN_SORT_TYPE_TXCOUNT",
        "CHAIN_SORT_TYPE_MAKERS",
        "CHAIN_SORT_TYPE_HOLDERS",
        "CHAIN_SORT_TYPE_MARKET_CAP",
        "CHAIN_SORT_TYPE_FDV",
        "CHAIN_SORT_TYPE_TVL",
        "CHAIN_SORT_TYPE_CREATE_TIME",
        "CHAIN_SORT_TYPE_SAFELY",
        "Companion",
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


# static fields
.field public static final enum CHAIN_SORT_TYPE_CHANGE:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_CREATE_TIME:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_FDV:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_HOLDERS:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_MAKERS:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_MARKET_CAP:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_PRICE:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_SAFELY:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_TVL:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_TXCOUNT:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final enum CHAIN_SORT_TYPE_VOLUME:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final Companion:Lcom/kubi/quotefacade/constant/ChainSortItemEnum$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic b:[Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

.field public static final synthetic c:Lkotlin/enums/EnumEntries;


# instance fields
.field private final constSortType:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final resourceId:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 3
    .line 4
    const-string v1, "orderByVolume24h"

    .line 5
    .line 6
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_vol:I

    .line 7
    .line 8
    const-string v3, "CHAIN_SORT_TYPE_VOLUME"

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_VOLUME:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 17
    .line 18
    const-string v1, "orderByTokenPriceU"

    .line 19
    .line 20
    sget v2, Lcom/kubi/quotefacade/R$string;->price:I

    .line 21
    .line 22
    const-string v3, "CHAIN_SORT_TYPE_PRICE"

    .line 23
    const/4 v4, 0x1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 27
    .line 28
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_PRICE:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 29
    .line 30
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 31
    .line 32
    const-string v1, "orderByPriceChange24h"

    .line 33
    .line 34
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_sort_change:I

    .line 35
    .line 36
    const-string v3, "CHAIN_SORT_TYPE_CHANGE"

    .line 37
    const/4 v4, 0x2

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 41
    .line 42
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_CHANGE:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 43
    .line 44
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 45
    .line 46
    const-string v1, "orderByTxCount24h"

    .line 47
    .line 48
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_trade:I

    .line 49
    .line 50
    const-string v3, "CHAIN_SORT_TYPE_TXCOUNT"

    .line 51
    const/4 v4, 0x3

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 55
    .line 56
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_TXCOUNT:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 57
    .line 58
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 59
    .line 60
    const-string v1, "orderByMakers24h"

    .line 61
    .line 62
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_trade_adr:I

    .line 63
    .line 64
    const-string v3, "CHAIN_SORT_TYPE_MAKERS"

    .line 65
    const/4 v4, 0x4

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 69
    .line 70
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_MAKERS:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 71
    .line 72
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 73
    .line 74
    const-string v1, "orderByHolders"

    .line 75
    .line 76
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_hold_adr:I

    .line 77
    .line 78
    const-string v3, "CHAIN_SORT_TYPE_HOLDERS"

    .line 79
    const/4 v4, 0x5

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 83
    .line 84
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_HOLDERS:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 85
    .line 86
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 87
    .line 88
    const-string v1, "orderByMarketCap"

    .line 89
    .line 90
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_marmarket_value:I

    .line 91
    .line 92
    const-string v3, "CHAIN_SORT_TYPE_MARKET_CAP"

    .line 93
    const/4 v4, 0x6

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 97
    .line 98
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_MARKET_CAP:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 99
    .line 100
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 101
    .line 102
    const-string v1, "orderByFdv"

    .line 103
    .line 104
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_fdv_dilution:I

    .line 105
    .line 106
    const-string v3, "CHAIN_SORT_TYPE_FDV"

    .line 107
    const/4 v4, 0x7

    .line 108
    .line 109
    .line 110
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 111
    .line 112
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_FDV:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 113
    .line 114
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 115
    .line 116
    const-string v1, "orderByTvl"

    .line 117
    .line 118
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_mobility:I

    .line 119
    .line 120
    const-string v3, "CHAIN_SORT_TYPE_TVL"

    .line 121
    .line 122
    const/16 v4, 0x8

    .line 123
    .line 124
    .line 125
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 126
    .line 127
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_TVL:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 128
    .line 129
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 130
    .line 131
    const-string v1, "orderCreatedAt"

    .line 132
    .line 133
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_create_time:I

    .line 134
    .line 135
    const-string v3, "CHAIN_SORT_TYPE_CREATE_TIME"

    .line 136
    .line 137
    const/16 v4, 0x9

    .line 138
    .line 139
    .line 140
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 141
    .line 142
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_CREATE_TIME:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 143
    .line 144
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 145
    .line 146
    const-string v1, "safely"

    .line 147
    .line 148
    sget v2, Lcom/kubi/quotefacade/R$string;->quote_chain_filter_safe:I

    .line 149
    .line 150
    const-string v3, "CHAIN_SORT_TYPE_SAFELY"

    .line 151
    .line 152
    const/16 v4, 0xa

    .line 153
    .line 154
    .line 155
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 156
    .line 157
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_SAFELY:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 158
    .line 159
    .line 160
    invoke-static {}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->a()[Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->b:[Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 164
    .line 165
    .line 166
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->c:Lkotlin/enums/EnumEntries;

    .line 170
    .line 171
    new-instance v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum$Companion;

    .line 172
    const/4 v1, 0x0

    .line 173
    .line 174
    .line 175
    invoke-direct {v0, v1}, Lcom/kubi/quotefacade/constant/ChainSortItemEnum$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 176
    .line 177
    sput-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->Companion:Lcom/kubi/quotefacade/constant/ChainSortItemEnum$Companion;

    .line 178
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->constSortType:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->resourceId:I

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

.method public static final synthetic a()[Lcom/kubi/quotefacade/constant/ChainSortItemEnum;
    .locals 11

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_VOLUME:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_PRICE:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_CHANGE:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_TXCOUNT:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 9
    .line 10
    sget-object v4, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_MAKERS:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 11
    .line 12
    sget-object v5, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_HOLDERS:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 13
    .line 14
    sget-object v6, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_MARKET_CAP:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 15
    .line 16
    sget-object v7, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_FDV:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 17
    .line 18
    sget-object v8, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_TVL:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 19
    .line 20
    sget-object v9, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_CREATE_TIME:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 21
    .line 22
    sget-object v10, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->CHAIN_SORT_TYPE_SAFELY:Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 23
    .line 24
    .line 25
    filled-new-array/range {v0 .. v10}, [Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 26
    move-result-object v0

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
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/kubi/quotefacade/constant/ChainSortItemEnum;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->c:Lkotlin/enums/EnumEntries;

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

.method public static valueOf(Ljava/lang/String;)Lcom/kubi/quotefacade/constant/ChainSortItemEnum;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 9
    return-object p0
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

.method public static values()[Lcom/kubi/quotefacade/constant/ChainSortItemEnum;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->b:[Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/kubi/quotefacade/constant/ChainSortItemEnum;

    .line 9
    return-object v0
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


# virtual methods
.method public final getConstSortType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->constSortType:Ljava/lang/String;

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

.method public final getResourceId()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/quotefacade/constant/ChainSortItemEnum;->resourceId:I

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
