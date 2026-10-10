.class public final Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;
.super Lcom/kubi/mvi/state/BaseStateVM;
.source "FavAllViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/BaseStateVM<",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0094@\u00a2\u0006\u0002\u0010\u0019J\u0008\u0010\u001a\u001a\u00020\u0017H\u0002J\u0008\u0010\u001b\u001a\u00020\u0017H\u0014J,\u0010\u001c\u001a\u00020\u00172\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0008\u0010 \u001a\u0004\u0018\u00010\u0007H\u0082@\u00a2\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00172\u0008\u0008\u0002\u0010#\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0002\u0010$J\u0014\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\'0&H\u0082@\u00a2\u0006\u0002\u0010(J\u001c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\'0&2\u0006\u0010*\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u0010+J%\u0010,\u001a\u00020\u00172\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00070&2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\u00172\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010&H\u0002J\"\u00100\u001a\u00020\u00172\u0008\u00101\u001a\u0004\u0018\u0001022\u0008\u0008\u0002\u00103\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0002\u00104J\u0017\u00105\u001a\u00020\u00102\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0002\u00106J\u0008\u00107\u001a\u00020\u0017H\u0016J\u0008\u00108\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00038TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u00069"
    }
    d2 = {
        "Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;",
        "Lcom/kubi/mvi/state/BaseStateVM;",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;",
        "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;",
        "<init>",
        "()V",
        "TAG",
        "",
        "repository",
        "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;",
        "wsSpotDataController",
        "Lcom/kubi/quotefacade/helper/QuoteWSDataController;",
        "wsFutureDataController",
        "wsHelper",
        "Lcom/kubi/kucoin/manager/MarketWsHelper;",
        "isHide",
        "",
        "networkRecovery",
        "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;",
        "initState",
        "getInitState",
        "()Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;",
        "dispatchIntentOnIO",
        "",
        "intent",
        "(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "requestNetworkRecoveryRefresh",
        "onCleared",
        "pinFavDataTop",
        "favType",
        "",
        "symbol",
        "datasource",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleFavData",
        "needSubscribe",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getTradeListFromCache",
        "",
        "Lcom/kubi/quotefacade/entity/AllTradeItemBean;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getCacheFavorList",
        "type",
        "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "favPageDataSubscribe",
        "symbols",
        "(Ljava/util/List;Ljava/lang/Integer;)V",
        "subscribeAlphaWs",
        "alphaCollectOrCancelCoin",
        "item",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "itemPosition",
        "(Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isAlphaFavTab",
        "(Ljava/lang/Integer;)Z",
        "onHide",
        "onShow",
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
        "SMAP\nFavAllViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavAllViewModel.kt\ncom/kubi/quotefacade/favorites/all/FavAllViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1068#2:261\n774#2:262\n865#2,2:263\n1617#2,9:265\n1869#2:274\n1870#2:276\n1626#2:277\n774#2:278\n865#2,2:279\n1617#2,9:281\n1869#2:290\n1870#2:292\n1626#2:293\n774#2:294\n865#2,2:295\n1617#2,9:297\n1869#2:306\n1870#2:308\n1626#2:309\n774#2:310\n865#2,2:311\n774#2:313\n865#2,2:314\n774#2:316\n865#2,2:317\n1617#2,9:319\n1869#2:328\n1870#2:331\n1626#2:332\n774#2:333\n865#2,2:334\n1617#2,9:336\n1869#2:345\n1870#2:348\n1626#2:349\n774#2:350\n865#2,2:351\n1617#2,9:353\n1869#2:362\n1870#2:364\n1626#2:365\n1563#2:366\n1634#2,3:367\n1563#2:370\n1634#2,3:371\n1563#2:374\n1634#2,3:375\n1563#2:378\n1634#2,3:379\n1563#2:382\n1634#2,3:383\n1869#2:386\n1870#2:388\n1#3:275\n1#3:291\n1#3:307\n1#3:329\n1#3:330\n1#3:346\n1#3:347\n1#3:363\n1#3:387\n*S KotlinDebug\n*F\n+ 1 FavAllViewModel.kt\ncom/kubi/quotefacade/favorites/all/FavAllViewModel\n*L\n106#1:261\n109#1:262\n109#1:263,2\n109#1:265,9\n109#1:274\n109#1:276\n109#1:277\n110#1:278\n110#1:279,2\n110#1:281,9\n110#1:290\n110#1:292\n110#1:293\n111#1:294\n111#1:295,2\n111#1:297,9\n111#1:306\n111#1:308\n111#1:309\n133#1:310\n133#1:311,2\n135#1:313\n135#1:314,2\n138#1:316\n138#1:317,2\n138#1:319,9\n138#1:328\n138#1:331\n138#1:332\n139#1:333\n139#1:334,2\n139#1:336,9\n139#1:345\n139#1:348\n139#1:349\n140#1:350\n140#1:351,2\n140#1:353,9\n140#1:362\n140#1:364\n140#1:365\n174#1:366\n174#1:367,3\n175#1:370\n175#1:371,3\n177#1:374\n177#1:375,3\n177#1:378\n177#1:379,3\n184#1:382\n184#1:383,3\n187#1:386\n187#1:388\n109#1:275\n110#1:291\n111#1:307\n138#1:330\n139#1:347\n140#1:363\n*E\n"
    }
.end annotation


# instance fields
.field public final V:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final X:Lcom/kubi/quotefacade/helper/QuoteWSDataController;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Lcom/kubi/kucoin/manager/MarketWsHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Z

.field public final b0:Lyz/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/BaseStateVM;-><init>()V

    .line 4
    .line 5
    const-string v0, "FavAllViewModel"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->V:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;-><init>()V

    .line 13
    .line 14
    iput-object v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 15
    .line 16
    new-instance v1, Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;-><init>()V

    .line 20
    .line 21
    iput-object v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->X:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 22
    .line 23
    new-instance v1, Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;-><init>()V

    .line 27
    .line 28
    iput-object v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 29
    .line 30
    new-instance v1, Lcom/kubi/kucoin/manager/MarketWsHelper;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1}, Lcom/kubi/kucoin/manager/MarketWsHelper;-><init>()V

    .line 34
    .line 35
    iput-object v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->Z:Lcom/kubi/kucoin/manager/MarketWsHelper;

    .line 36
    .line 37
    new-instance v1, Lyz/a;

    .line 38
    .line 39
    new-instance v2, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$networkRecovery$1;

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, p0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$networkRecovery$1;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v0, v2}, Lyz/a;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    iput-object v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->b0:Lyz/a;

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
.end method

.method public static synthetic D(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x1

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->C(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method public static final E(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v2, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;->copy$default(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method public static final F(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v3, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v5, 0x5

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;->copy$default(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method public static final G(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$updateState"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v2, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v1, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;->copy$default(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;

    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method private final H(Ljava/lang/Integer;)Z
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 7
    move-result p1

    .line 8
    const/4 v0, 0x5

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 14
    return p1
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

.method private final I(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p2, p1, p3}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->X(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    new-instance v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$pinFavDataTop$2;

    .line 9
    const/4 p1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v3, p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$pinFavDataTop$2;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lkotlin/coroutines/Continuation;)V

    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v4, p4

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->e(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    return-object p1
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

.method private final J()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->V:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "network recovered: send FetchFavData (All)"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$FetchFavData;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$FetchFavData;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->sendIntent(Lcom/kubi/mvi/state/d;)V

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

.method public static final L(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;
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
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/d;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/kubi/quotefacade/favorites/all/d;-><init>(Ljava/util/List;)V

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

.method public static synthetic b(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->F(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;

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
.end method

.method public static synthetic d(Lcom/kubi/quotefacade/helper/g1;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->z(Lcom/kubi/quotefacade/helper/g1;)Ljava/lang/CharSequence;

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
.end method

.method public static synthetic e(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->L(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;

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

.method public static synthetic f(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->G(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;

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
.end method

.method public static synthetic g(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->E(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;)Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;

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
.end method

.method public static synthetic h(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->w(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;

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

.method public static synthetic i(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lcom/kubi/data/entity/TradeItemBean;IZ)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->t(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lcom/kubi/data/entity/TradeItemBean;IZ)Lkotlin/Unit;

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

.method public static synthetic j(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->x(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;

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

.method public static final synthetic k(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->y(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic n(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->B(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic o(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->C(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic p(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->J()V

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

.method public static final synthetic q(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ldr/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

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
.end method

.method public static final synthetic r(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lkotlin/jvm/functions/Function1;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

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

.method private final s(Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/data/entity/TradeItemBean;",
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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getFeeCode()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const/16 v2, 0x2d

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrement()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    sget-object v2, Lcom/kubi/quotefacade/helper/FavAlphaCacheManager;->a:Lcom/kubi/quotefacade/helper/FavAlphaCacheManager;

    .line 50
    .line 51
    new-instance v6, Lcom/kubi/quotefacade/favorites/all/i0;

    .line 52
    .line 53
    .line 54
    invoke-direct {v6, p0, p1, p2}, Lcom/kubi/quotefacade/favorites/all/i0;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lcom/kubi/data/entity/TradeItemBean;I)V

    .line 55
    const/4 v4, 0x1

    .line 56
    const/4 v5, 0x0

    .line 57
    move-object v7, p3

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {v2 .. v7}, Lcom/kubi/quotefacade/helper/FavAlphaCacheManager;->o(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 65
    move-result-object p2

    .line 66
    .line 67
    if-ne p1, p2, :cond_2

    .line 68
    return-object p1

    .line 69
    .line 70
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 71
    return-object p1
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

.method public static final t(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lcom/kubi/data/entity/TradeItemBean;IZ)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    new-instance p3, Lcom/kubi/quotefacade/favorites/all/b;

    .line 5
    .line 6
    new-instance v0, Lkotlin/Pair;

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p3, v0}, Lcom/kubi/quotefacade/favorites/all/b;-><init>(Lkotlin/Pair;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 20
    .line 21
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0
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

.method private final v(Ljava/util/List;Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    move-result p2

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    if-ne p2, v0, :cond_1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    move-result p2

    .line 17
    .line 18
    if-nez p2, :cond_3

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object p2, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->X:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 23
    .line 24
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/m0;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/kubi/quotefacade/favorites/all/m0;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1, v0}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->f(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_2
    iget-object p2, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 34
    .line 35
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/n0;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p0}, Lcom/kubi/quotefacade/favorites/all/n0;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1, v0}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->d(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_3
    if-eqz v0, :cond_4

    .line 45
    .line 46
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->X:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->c()V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_4
    iget-object p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->c()V

    .line 56
    return-void
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

.method public static final w(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/kubi/quotefacade/favorites/all/f;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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

.method public static final x(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/kubi/quotefacade/favorites/all/e;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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

.method public static final z(Lcom/kubi/quotefacade/helper/g1;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/quotefacade/helper/g1;->a()Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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


# virtual methods
.method public A()Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;

    .line 3
    const/4 v4, 0x7

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    return-object v0
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

.method public final B(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/AllTradeItemBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->label:I

    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object v1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/List;

    .line 48
    .line 49
    iget-object v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/util/List;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/util/List;

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    throw p1

    .line 69
    .line 70
    :cond_2
    iget v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->I$0:I

    .line 71
    .line 72
    iget-object v4, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$2:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Ljava/util/List;

    .line 75
    .line 76
    iget-object v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, Ljava/util/List;

    .line 79
    .line 80
    iget-object v6, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v6, Ljava/util/List;

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 86
    goto :goto_2

    .line 87
    .line 88
    :cond_3
    iget v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->I$0:I

    .line 89
    .line 90
    iget-object v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$2:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, Ljava/util/List;

    .line 93
    .line 94
    iget-object v6, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, Ljava/util/List;

    .line 97
    .line 98
    iget-object v7, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, Ljava/util/List;

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 104
    goto :goto_1

    .line 105
    .line 106
    .line 107
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    iput-object p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$2:Ljava/lang/Object;

    .line 118
    const/4 v2, 0x0

    .line 119
    .line 120
    iput v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->I$0:I

    .line 121
    .line 122
    iput v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->label:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v5, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->y(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 126
    move-result-object v5

    .line 127
    .line 128
    if-ne v5, v1, :cond_5

    .line 129
    goto :goto_3

    .line 130
    :cond_5
    move-object v6, p1

    .line 131
    move-object v7, v6

    .line 132
    move-object p1, v5

    .line 133
    move-object v5, v7

    .line 134
    .line 135
    :goto_1
    check-cast p1, Ljava/util/Collection;

    .line 136
    .line 137
    .line 138
    invoke-interface {v5, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 139
    .line 140
    iput-object v7, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$0:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v6, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$1:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v6, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$2:Ljava/lang/Object;

    .line 145
    .line 146
    iput v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->I$0:I

    .line 147
    .line 148
    iput v4, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->label:I

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v4, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->y(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    if-ne p1, v1, :cond_6

    .line 155
    goto :goto_3

    .line 156
    :cond_6
    move-object v4, v6

    .line 157
    move-object v5, v4

    .line 158
    move-object v6, v7

    .line 159
    .line 160
    :goto_2
    check-cast p1, Ljava/util/Collection;

    .line 161
    .line 162
    .line 163
    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 164
    .line 165
    sget-object p1, Lcom/kubi/quotefacade/helper/h2;->a:Lcom/kubi/quotefacade/helper/h2;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/kubi/quotefacade/helper/h2;->q()Z

    .line 169
    move-result p1

    .line 170
    .line 171
    if-eqz p1, :cond_8

    .line 172
    .line 173
    iput-object v6, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$0:Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    move-result-object p1

    .line 178
    .line 179
    iput-object p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$1:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->L$2:Ljava/lang/Object;

    .line 182
    .line 183
    iput v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->I$0:I

    .line 184
    .line 185
    iput v3, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getTradeListFromCache$1;->label:I

    .line 186
    const/4 p1, 0x5

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, p1, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->y(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 190
    move-result-object p1

    .line 191
    .line 192
    if-ne p1, v1, :cond_7

    .line 193
    :goto_3
    return-object v1

    .line 194
    :cond_7
    move-object v1, v5

    .line 195
    move-object v0, v6

    .line 196
    .line 197
    :goto_4
    check-cast p1, Ljava/util/Collection;

    .line 198
    .line 199
    .line 200
    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 201
    move-object v6, v0

    .line 202
    .line 203
    .line 204
    :cond_8
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    .line 205
    move-result-object p1

    .line 206
    return-object p1
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

.method public final C(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->label:I

    .line 33
    const/4 v3, 0x5

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    iget-boolean p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->Z$0:Z

    .line 44
    .line 45
    iget-object v0, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/List;

    .line 48
    .line 49
    .line 50
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    throw p1

    .line 61
    .line 62
    :cond_2
    iget-boolean p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->Z$0:Z

    .line 63
    .line 64
    iget-object v0, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/util/List;

    .line 67
    .line 68
    .line 69
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    goto :goto_1

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    new-instance p2, Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    sget-object v2, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    .line 87
    invoke-interface {v2}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 88
    move-result v2

    .line 89
    .line 90
    if-nez v2, :cond_12

    .line 91
    .line 92
    iput-object p2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput-boolean p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->Z$0:Z

    .line 95
    .line 96
    iput v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->label:I

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->B(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    if-ne v0, v1, :cond_4

    .line 103
    .line 104
    goto/16 :goto_8

    .line 105
    :cond_4
    move-object v10, v0

    .line 106
    move-object v0, p2

    .line 107
    move-object p2, v10

    .line 108
    .line 109
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 110
    .line 111
    iget-object v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->V:Ljava/lang/String;

    .line 112
    .line 113
    new-instance v2, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    const-string v6, "cache size: "

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 125
    move-result v6

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v6, " ==> "

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 147
    move-result v1

    .line 148
    .line 149
    if-nez v1, :cond_11

    .line 150
    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 153
    .line 154
    new-instance v1, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$a;

    .line 155
    .line 156
    .line 157
    invoke-direct {v1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$a;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    .line 164
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 165
    .line 166
    new-instance v1, Lcom/kubi/quotefacade/favorites/all/c;

    .line 167
    .line 168
    .line 169
    invoke-direct {v1, v0}, Lcom/kubi/quotefacade/favorites/all/c;-><init>(Ljava/util/List;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v1}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 173
    .line 174
    new-instance v0, Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    move-result-object v1

    .line 182
    .line 183
    .line 184
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    move-result v2

    .line 186
    .line 187
    if-eqz v2, :cond_6

    .line 188
    .line 189
    .line 190
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    move-result-object v2

    .line 192
    move-object v6, v2

    .line 193
    .line 194
    check-cast v6, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 198
    move-result v6

    .line 199
    .line 200
    if-ne v6, v4, :cond_5

    .line 201
    .line 202
    .line 203
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 204
    goto :goto_2

    .line 205
    .line 206
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 207
    .line 208
    .line 209
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    .line 216
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    move-result v2

    .line 218
    .line 219
    if-eqz v2, :cond_8

    .line 220
    .line 221
    .line 222
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    move-result-object v2

    .line 224
    .line 225
    check-cast v2, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 229
    move-result-object v2

    .line 230
    .line 231
    if-eqz v2, :cond_7

    .line 232
    .line 233
    .line 234
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 235
    goto :goto_3

    .line 236
    .line 237
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 238
    .line 239
    .line 240
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    move-result-object v2

    .line 245
    .line 246
    .line 247
    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    move-result v6

    .line 249
    .line 250
    if-eqz v6, :cond_a

    .line 251
    .line 252
    .line 253
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    move-result-object v6

    .line 255
    move-object v7, v6

    .line 256
    .line 257
    check-cast v7, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 261
    move-result v7

    .line 262
    .line 263
    if-ne v7, v3, :cond_9

    .line 264
    .line 265
    .line 266
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 267
    goto :goto_4

    .line 268
    .line 269
    :cond_a
    new-instance v2, Ljava/util/ArrayList;

    .line 270
    .line 271
    .line 272
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 276
    move-result-object v0

    .line 277
    .line 278
    .line 279
    :cond_b
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    move-result v3

    .line 281
    .line 282
    if-eqz v3, :cond_c

    .line 283
    .line 284
    .line 285
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    move-result-object v3

    .line 287
    .line 288
    check-cast v3, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 292
    move-result-object v3

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->getMarket()Ljava/lang/String;

    .line 296
    move-result-object v3

    .line 297
    .line 298
    if-eqz v3, :cond_b

    .line 299
    .line 300
    .line 301
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 302
    goto :goto_5

    .line 303
    .line 304
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 305
    .line 306
    .line 307
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 311
    move-result-object p2

    .line 312
    .line 313
    .line 314
    :cond_d
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    move-result v3

    .line 316
    .line 317
    if-eqz v3, :cond_e

    .line 318
    .line 319
    .line 320
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    move-result-object v3

    .line 322
    move-object v6, v3

    .line 323
    .line 324
    check-cast v6, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 328
    move-result v6

    .line 329
    .line 330
    if-ne v6, v5, :cond_d

    .line 331
    .line 332
    .line 333
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 334
    goto :goto_6

    .line 335
    .line 336
    :cond_e
    new-instance p2, Ljava/util/ArrayList;

    .line 337
    .line 338
    .line 339
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 343
    move-result-object v0

    .line 344
    .line 345
    .line 346
    :cond_f
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    move-result v3

    .line 348
    .line 349
    if-eqz v3, :cond_10

    .line 350
    .line 351
    .line 352
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    move-result-object v3

    .line 354
    .line 355
    check-cast v3, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 359
    move-result-object v3

    .line 360
    .line 361
    if-eqz v3, :cond_f

    .line 362
    .line 363
    .line 364
    invoke-interface {p2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 365
    goto :goto_7

    .line 366
    .line 367
    :cond_10
    if-eqz p1, :cond_29

    .line 368
    .line 369
    .line 370
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 371
    move-result-object p1

    .line 372
    .line 373
    .line 374
    invoke-direct {p0, p2, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->v(Ljava/util/List;Ljava/lang/Integer;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 378
    move-result-object p1

    .line 379
    .line 380
    .line 381
    invoke-direct {p0, v1, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->v(Ljava/util/List;Ljava/lang/Integer;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {p0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->K(Ljava/util/List;)V

    .line 385
    .line 386
    goto/16 :goto_14

    .line 387
    .line 388
    :cond_11
    new-instance p1, Lcom/kubi/quotefacade/favorites/all/j0;

    .line 389
    .line 390
    .line 391
    invoke-direct {p1}, Lcom/kubi/quotefacade/favorites/all/j0;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 395
    move-result p1

    .line 396
    .line 397
    .line 398
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 399
    .line 400
    goto/16 :goto_14

    .line 401
    .line 402
    .line 403
    :cond_12
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 404
    .line 405
    :try_start_1
    iget-object v2, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 406
    .line 407
    .line 408
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    move-result-object p2

    .line 410
    .line 411
    iput-object p2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->L$0:Ljava/lang/Object;

    .line 412
    .line 413
    iput-boolean p1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->Z$0:Z

    .line 414
    .line 415
    iput v4, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$handleFavData$1;->label:I

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v0}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->y(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 419
    move-result-object p2

    .line 420
    .line 421
    if-ne p2, v1, :cond_13

    .line 422
    :goto_8
    return-object v1

    .line 423
    .line 424
    :cond_13
    :goto_9
    check-cast p2, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 425
    .line 426
    if-eqz p2, :cond_2a

    .line 427
    .line 428
    .line 429
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 430
    move-result v0

    .line 431
    .line 432
    if-eqz v0, :cond_14

    .line 433
    .line 434
    goto/16 :goto_15

    .line 435
    .line 436
    :cond_14
    new-instance v0, Ljava/util/ArrayList;

    .line 437
    .line 438
    .line 439
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 440
    .line 441
    .line 442
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 443
    move-result-object p2

    .line 444
    .line 445
    .line 446
    :cond_15
    :goto_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    move-result v1

    .line 448
    .line 449
    if-eqz v1, :cond_16

    .line 450
    .line 451
    .line 452
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    move-result-object v1

    .line 454
    move-object v2, v1

    .line 455
    .line 456
    check-cast v2, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 457
    .line 458
    .line 459
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 460
    move-result-object v6

    .line 461
    .line 462
    .line 463
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 464
    move-result-object v7

    .line 465
    .line 466
    .line 467
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 468
    move-result-object v8

    .line 469
    .line 470
    .line 471
    filled-new-array {v6, v7, v8}, [Ljava/lang/Integer;

    .line 472
    move-result-object v6

    .line 473
    .line 474
    .line 475
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 476
    move-result-object v6

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 480
    move-result v2

    .line 481
    .line 482
    .line 483
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 484
    move-result-object v2

    .line 485
    .line 486
    .line 487
    invoke-interface {v6, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 488
    move-result v2

    .line 489
    .line 490
    if-eqz v2, :cond_15

    .line 491
    .line 492
    .line 493
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 494
    goto :goto_a

    .line 495
    .line 496
    :cond_16
    sget-object p2, Lcom/kubi/quotefacade/helper/h2;->a:Lcom/kubi/quotefacade/helper/h2;

    .line 497
    .line 498
    .line 499
    invoke-virtual {p2}, Lcom/kubi/quotefacade/helper/h2;->q()Z

    .line 500
    move-result p2

    .line 501
    .line 502
    if-nez p2, :cond_19

    .line 503
    .line 504
    new-instance p2, Ljava/util/ArrayList;

    .line 505
    .line 506
    .line 507
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 508
    .line 509
    .line 510
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 511
    move-result-object v0

    .line 512
    .line 513
    .line 514
    :cond_17
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 515
    move-result v1

    .line 516
    .line 517
    if-eqz v1, :cond_18

    .line 518
    .line 519
    .line 520
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 521
    move-result-object v1

    .line 522
    move-object v2, v1

    .line 523
    .line 524
    check-cast v2, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 528
    move-result v2

    .line 529
    .line 530
    if-eq v2, v3, :cond_17

    .line 531
    .line 532
    .line 533
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 534
    goto :goto_b

    .line 535
    :cond_18
    move-object v0, p2

    .line 536
    .line 537
    :cond_19
    new-instance p2, Ljava/util/ArrayList;

    .line 538
    .line 539
    .line 540
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 541
    .line 542
    .line 543
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 544
    move-result-object v1

    .line 545
    .line 546
    .line 547
    :cond_1a
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 548
    move-result v2

    .line 549
    .line 550
    if-eqz v2, :cond_1b

    .line 551
    .line 552
    .line 553
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 554
    move-result-object v2

    .line 555
    move-object v6, v2

    .line 556
    .line 557
    check-cast v6, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v6}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 561
    move-result v6

    .line 562
    .line 563
    if-ne v6, v5, :cond_1a

    .line 564
    .line 565
    .line 566
    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 567
    goto :goto_c

    .line 568
    .line 569
    :cond_1b
    new-instance v1, Ljava/util/ArrayList;

    .line 570
    .line 571
    .line 572
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 573
    .line 574
    .line 575
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 576
    move-result-object p2

    .line 577
    .line 578
    .line 579
    :cond_1c
    :goto_d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 580
    move-result v2

    .line 581
    const/4 v6, 0x0

    .line 582
    .line 583
    if-eqz v2, :cond_1e

    .line 584
    .line 585
    .line 586
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 587
    move-result-object v2

    .line 588
    .line 589
    check-cast v2, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 593
    move-result-object v2

    .line 594
    .line 595
    .line 596
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 597
    move-result v7

    .line 598
    .line 599
    if-nez v7, :cond_1d

    .line 600
    goto :goto_e

    .line 601
    :cond_1d
    move-object v6, v2

    .line 602
    .line 603
    :goto_e
    if-eqz v6, :cond_1c

    .line 604
    .line 605
    .line 606
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 607
    goto :goto_d

    .line 608
    .line 609
    :cond_1e
    new-instance p2, Ljava/util/ArrayList;

    .line 610
    .line 611
    .line 612
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 613
    .line 614
    .line 615
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 616
    move-result-object v2

    .line 617
    .line 618
    .line 619
    :cond_1f
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 620
    move-result v7

    .line 621
    .line 622
    if-eqz v7, :cond_20

    .line 623
    .line 624
    .line 625
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 626
    move-result-object v7

    .line 627
    move-object v8, v7

    .line 628
    .line 629
    check-cast v8, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v8}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 633
    move-result v8

    .line 634
    .line 635
    if-ne v8, v4, :cond_1f

    .line 636
    .line 637
    .line 638
    invoke-interface {p2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 639
    goto :goto_f

    .line 640
    .line 641
    :cond_20
    new-instance v2, Ljava/util/ArrayList;

    .line 642
    .line 643
    .line 644
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 645
    .line 646
    .line 647
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 648
    move-result-object p2

    .line 649
    .line 650
    .line 651
    :cond_21
    :goto_10
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 652
    move-result v7

    .line 653
    .line 654
    if-eqz v7, :cond_23

    .line 655
    .line 656
    .line 657
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 658
    move-result-object v7

    .line 659
    .line 660
    check-cast v7, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v7}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 664
    move-result-object v7

    .line 665
    .line 666
    .line 667
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 668
    move-result v8

    .line 669
    .line 670
    if-nez v8, :cond_22

    .line 671
    move-object v7, v6

    .line 672
    .line 673
    :cond_22
    if-eqz v7, :cond_21

    .line 674
    .line 675
    .line 676
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 677
    goto :goto_10

    .line 678
    .line 679
    :cond_23
    new-instance p2, Ljava/util/ArrayList;

    .line 680
    .line 681
    .line 682
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 683
    .line 684
    .line 685
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 686
    move-result-object v7

    .line 687
    .line 688
    .line 689
    :cond_24
    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 690
    move-result v8

    .line 691
    .line 692
    if-eqz v8, :cond_25

    .line 693
    .line 694
    .line 695
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    move-result-object v8

    .line 697
    move-object v9, v8

    .line 698
    .line 699
    check-cast v9, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v9}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 703
    move-result v9

    .line 704
    .line 705
    if-ne v9, v3, :cond_24

    .line 706
    .line 707
    .line 708
    invoke-interface {p2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 709
    goto :goto_11

    .line 710
    .line 711
    :cond_25
    new-instance v3, Ljava/util/ArrayList;

    .line 712
    .line 713
    .line 714
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 715
    .line 716
    .line 717
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 718
    move-result-object p2

    .line 719
    .line 720
    .line 721
    :cond_26
    :goto_12
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    move-result v7

    .line 723
    .line 724
    if-eqz v7, :cond_28

    .line 725
    .line 726
    .line 727
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 728
    move-result-object v7

    .line 729
    .line 730
    check-cast v7, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v7}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 734
    move-result-object v7

    .line 735
    .line 736
    if-eqz v7, :cond_27

    .line 737
    .line 738
    .line 739
    invoke-virtual {v7}, Lcom/kubi/data/entity/SymbolInfoEntity;->getMarket()Ljava/lang/String;

    .line 740
    move-result-object v7

    .line 741
    goto :goto_13

    .line 742
    :cond_27
    move-object v7, v6

    .line 743
    .line 744
    :goto_13
    if-eqz v7, :cond_26

    .line 745
    .line 746
    .line 747
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 748
    goto :goto_12

    .line 749
    .line 750
    :cond_28
    new-instance p2, Lcom/kubi/quotefacade/favorites/all/c;

    .line 751
    .line 752
    .line 753
    invoke-direct {p2, v0}, Lcom/kubi/quotefacade/favorites/all/c;-><init>(Ljava/util/List;)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {p0, p2}, Lcom/kubi/mvi/state/BaseStateVM;->send(Ldr/a;)V

    .line 757
    .line 758
    if-eqz p1, :cond_29

    .line 759
    .line 760
    .line 761
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 762
    move-result-object p1

    .line 763
    .line 764
    .line 765
    invoke-direct {p0, v1, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->v(Ljava/util/List;Ljava/lang/Integer;)V

    .line 766
    .line 767
    .line 768
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 769
    move-result-object p1

    .line 770
    .line 771
    .line 772
    invoke-direct {p0, v2, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->v(Ljava/util/List;Ljava/lang/Integer;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {p0, v3}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->K(Ljava/util/List;)V

    .line 776
    .line 777
    :cond_29
    :goto_14
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 778
    return-object p1

    .line 779
    .line 780
    :cond_2a
    :goto_15
    new-instance p1, Lcom/kubi/quotefacade/favorites/all/l0;

    .line 781
    .line 782
    .line 783
    invoke-direct {p1}, Lcom/kubi/quotefacade/favorites/all/l0;-><init>()V

    .line 784
    .line 785
    .line 786
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 787
    .line 788
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 789
    return-object p1

    .line 790
    .line 791
    :catch_0
    new-instance p1, Lcom/kubi/quotefacade/favorites/all/k0;

    .line 792
    .line 793
    .line 794
    invoke-direct {p1}, Lcom/kubi/quotefacade/favorites/all/k0;-><init>()V

    .line 795
    .line 796
    .line 797
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateVM;->updateState(Lkotlin/jvm/functions/Function1;)Z

    .line 798
    .line 799
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 800
    return-object p1
.end method

.method public final K(Ljava/util/List;)V
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
    iget-boolean v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->a0:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->Z:Lcom/kubi/kucoin/manager/MarketWsHelper;

    .line 10
    .line 11
    new-instance v6, Lcom/kubi/quotefacade/favorites/all/h0;

    .line 12
    .line 13
    .line 14
    invoke-direct {v6, p0}, Lcom/kubi/quotefacade/favorites/all/h0;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;)V

    .line 15
    const/4 v7, 0x6

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    move-object v2, p1

    .line 21
    .line 22
    .line 23
    invoke-static/range {v1 .. v8}, Lcom/kubi/kucoin/manager/MarketWsHelper;->x(Lcom/kubi/kucoin/manager/MarketWsHelper;Ljava/util/List;Ljava/lang/String;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 24
    :cond_1
    :goto_0
    return-void
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

.method public bridge synthetic dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->u(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public bridge synthetic getInitState()Lcom/kubi/mvi/state/f;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->A()Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;

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

.method public onCleared()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->b0:Lyz/a;

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
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->b0:Lyz/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lyz/a;->f()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lcom/kubi/mvi/vm/BaseVM;->onHide()V

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->a0:Z

    .line 12
    .line 13
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->X:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->c()V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->Y:Lcom/kubi/quotefacade/helper/QuoteWSDataController;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/quotefacade/helper/QuoteWSDataController;->c()V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->Z:Lcom/kubi/kucoin/manager/MarketWsHelper;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/kucoin/manager/MarketWsHelper;->F()V

    .line 27
    return-void
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
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->a0:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->b0:Lyz/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lyz/a;->g()V

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
.end method

.method public u(Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1    # Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;
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
            "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;",
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
    instance-of v0, p2, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->label:I

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
    iput v1, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->label:I

    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->label:I

    .line 35
    const/4 v2, 0x5

    .line 36
    const/4 v3, 0x4

    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    .line 41
    if-eqz v1, :cond_6

    .line 42
    .line 43
    if-eq v1, v7, :cond_5

    .line 44
    .line 45
    if-eq v1, v6, :cond_4

    .line 46
    .line 47
    if-eq v1, v5, :cond_3

    .line 48
    .line 49
    if-eq v1, v3, :cond_2

    .line 50
    .line 51
    if-ne v1, v2, :cond_1

    .line 52
    .line 53
    iget-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    throw p1

    .line 69
    .line 70
    :cond_2
    iget-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_3
    iget-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;

    .line 82
    .line 83
    .line 84
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 85
    goto :goto_4

    .line 86
    .line 87
    :cond_4
    iget-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;

    .line 90
    .line 91
    .line 92
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 93
    goto :goto_3

    .line 94
    .line 95
    :cond_5
    iget-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    goto :goto_2

    .line 102
    .line 103
    .line 104
    :cond_6
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    .line 106
    iput-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 107
    .line 108
    iput v7, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->label:I

    .line 109
    .line 110
    .line 111
    invoke-super {p0, p1, v4}, Lcom/kubi/mvi/state/BaseStateVM;->dispatchIntentOnIO(Lcom/kubi/mvi/state/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    if-ne p2, v0, :cond_7

    .line 115
    .line 116
    goto/16 :goto_7

    .line 117
    .line 118
    :cond_7
    :goto_2
    instance-of p2, p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$FetchFavData;

    .line 119
    .line 120
    if-eqz p2, :cond_9

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    iput-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 127
    .line 128
    iput v6, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->label:I

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v7, v4}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->C(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    if-ne p1, v0, :cond_8

    .line 135
    .line 136
    goto/16 :goto_7

    .line 137
    .line 138
    :cond_8
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 139
    return-object p1

    .line 140
    .line 141
    :cond_9
    instance-of p2, p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;

    .line 142
    .line 143
    if-eqz p2, :cond_b

    .line 144
    move-object p2, p1

    .line 145
    .line 146
    check-cast p2, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;->getFavType()Ljava/lang/Integer;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;->getSymbol()Ljava/lang/String;

    .line 154
    move-result-object v2

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$PinItemToTop;->getDatasource()Ljava/lang/String;

    .line 158
    move-result-object p2

    .line 159
    .line 160
    .line 161
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    iput-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 165
    .line 166
    iput v5, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->label:I

    .line 167
    .line 168
    .line 169
    invoke-direct {p0, v1, v2, p2, v4}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->I(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    if-ne p1, v0, :cond_a

    .line 173
    goto :goto_7

    .line 174
    .line 175
    :cond_a
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 176
    return-object p1

    .line 177
    .line 178
    :cond_b
    instance-of p2, p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;

    .line 179
    .line 180
    if-eqz p2, :cond_f

    .line 181
    move-object p2, p1

    .line 182
    .line 183
    check-cast p2, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;->getFavType()Ljava/lang/Integer;

    .line 187
    move-result-object v1

    .line 188
    .line 189
    .line 190
    invoke-direct {p0, v1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->H(Ljava/lang/Integer;)Z

    .line 191
    move-result v1

    .line 192
    .line 193
    if-eqz v1, :cond_d

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 197
    move-result-object v1

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;->getItemPosition()I

    .line 201
    move-result p2

    .line 202
    .line 203
    .line 204
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    move-result-object p1

    .line 206
    .line 207
    iput-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 208
    .line 209
    iput v3, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->label:I

    .line 210
    .line 211
    .line 212
    invoke-direct {p0, v1, p2, v4}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->s(Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 213
    move-result-object p1

    .line 214
    .line 215
    if-ne p1, v0, :cond_c

    .line 216
    goto :goto_7

    .line 217
    .line 218
    :cond_c
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 219
    return-object p1

    .line 220
    .line 221
    :cond_d
    iget-object v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;->getTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 225
    move-result-object v3

    .line 226
    const/4 v5, 0x0

    .line 227
    .line 228
    if-eqz v3, :cond_e

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 232
    move-result-object v3

    .line 233
    goto :goto_6

    .line 234
    :cond_e
    move-object v3, v5

    .line 235
    .line 236
    .line 237
    :goto_6
    invoke-virtual {p2}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$CollectOrCancelCoin;->getFavType()Ljava/lang/Integer;

    .line 238
    move-result-object p2

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v3, p2}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->h(Ljava/lang/String;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/e;

    .line 242
    move-result-object v1

    .line 243
    .line 244
    new-instance v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$2;

    .line 245
    .line 246
    .line 247
    invoke-direct {v3, p0, p1, v5}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$2;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;Lkotlin/coroutines/Continuation;)V

    .line 248
    .line 249
    .line 250
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    move-result-object p1

    .line 252
    .line 253
    iput-object p1, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->L$0:Ljava/lang/Object;

    .line 254
    .line 255
    iput v2, v4, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$dispatchIntentOnIO$1;->label:I

    .line 256
    const/4 v2, 0x0

    .line 257
    const/4 v5, 0x1

    .line 258
    const/4 v6, 0x0

    .line 259
    .line 260
    .line 261
    invoke-static/range {v1 .. v6}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->g(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 262
    move-result-object p1

    .line 263
    .line 264
    if-ne p1, v0, :cond_11

    .line 265
    :goto_7
    return-object v0

    .line 266
    .line 267
    :cond_f
    instance-of p2, p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;

    .line 268
    .line 269
    if-eqz p2, :cond_10

    .line 270
    .line 271
    check-cast p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;->getSymbols()Ljava/util/List;

    .line 275
    move-result-object p2

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribe;->getFavType()Ljava/lang/Integer;

    .line 279
    move-result-object p1

    .line 280
    .line 281
    .line 282
    invoke-direct {p0, p2, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->v(Ljava/util/List;Ljava/lang/Integer;)V

    .line 283
    .line 284
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 285
    goto :goto_8

    .line 286
    .line 287
    :cond_10
    instance-of p2, p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribeAlpha;

    .line 288
    .line 289
    if-eqz p2, :cond_12

    .line 290
    .line 291
    check-cast p1, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribeAlpha;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1}, Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent$UpdateSubscribeAlpha;->getTokenBridgeId()Ljava/util/List;

    .line 295
    move-result-object p1

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->K(Ljava/util/List;)V

    .line 299
    .line 300
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 301
    .line 302
    :cond_11
    :goto_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 303
    return-object p1

    .line 304
    .line 305
    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 306
    .line 307
    .line 308
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 309
    throw p1
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
.end method

.method public final y(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/AllTradeItemBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    instance-of v3, v2, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    move-object v3, v2

    .line 12
    .line 13
    check-cast v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;

    .line 14
    .line 15
    iget v4, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->label:I

    .line 16
    .line 17
    const/high16 v5, -0x80000000

    .line 18
    .line 19
    and-int v6, v4, v5

    .line 20
    .line 21
    if-eqz v6, :cond_0

    .line 22
    sub-int/2addr v4, v5

    .line 23
    .line 24
    iput v4, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->label:I

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    new-instance v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;

    .line 28
    .line 29
    .line 30
    invoke-direct {v3, v0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;-><init>(Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    :goto_0
    iget-object v2, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    iget v5, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->label:I

    .line 39
    const/4 v6, 0x5

    .line 40
    const/4 v7, 0x4

    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v9, 0x2

    .line 43
    const/4 v10, 0x1

    .line 44
    .line 45
    const/16 v11, 0xa

    .line 46
    .line 47
    if-eqz v5, :cond_5

    .line 48
    .line 49
    if-eq v5, v10, :cond_4

    .line 50
    .line 51
    if-eq v5, v9, :cond_3

    .line 52
    .line 53
    if-eq v5, v8, :cond_2

    .line 54
    .line 55
    if-ne v5, v7, :cond_1

    .line 56
    .line 57
    iget v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->I$0:I

    .line 58
    .line 59
    iget-object v4, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v3, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Ljava/util/List;

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    throw v1

    .line 79
    .line 80
    :cond_2
    iget v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->I$0:I

    .line 81
    .line 82
    iget-object v4, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    iget-object v3, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Ljava/util/List;

    .line 89
    .line 90
    .line 91
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 92
    .line 93
    goto/16 :goto_a

    .line 94
    .line 95
    :cond_3
    iget-object v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Ljava/lang/String;

    .line 98
    .line 99
    iget-object v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$0:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Ljava/util/List;

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_4
    iget-object v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$1:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    iget-object v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Ljava/util/List;

    .line 115
    .line 116
    .line 117
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 118
    .line 119
    goto/16 :goto_7

    .line 120
    .line 121
    .line 122
    :cond_5
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 123
    .line 124
    sget-object v2, Lcom/kubi/quotefacade/helper/l1;->a:Lcom/kubi/quotefacade/helper/l1;

    .line 125
    .line 126
    .line 127
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 128
    move-result-object v5

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v5}, Lcom/kubi/quotefacade/helper/l1;->c(Ljava/lang/Integer;)Ljava/util/List;

    .line 132
    move-result-object v12

    .line 133
    .line 134
    iget-object v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->V:Ljava/lang/String;

    .line 135
    .line 136
    new-instance v5, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    const-string v13, "getCacheFavorList type="

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v13, ". favItems="

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    move-result-object v5

    .line 160
    .line 161
    .line 162
    invoke-static {v2, v5}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 166
    move-result v2

    .line 167
    .line 168
    if-eqz v2, :cond_6

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 172
    move-result-object v1

    .line 173
    return-object v1

    .line 174
    .line 175
    :cond_6
    new-instance v18, Lcom/kubi/quotefacade/favorites/all/o0;

    .line 176
    .line 177
    .line 178
    invoke-direct/range {v18 .. v18}, Lcom/kubi/quotefacade/favorites/all/o0;-><init>()V

    .line 179
    .line 180
    const/16 v19, 0x1e

    .line 181
    .line 182
    const/16 v20, 0x0

    .line 183
    .line 184
    const-string v13, ","

    .line 185
    const/4 v14, 0x0

    .line 186
    const/4 v15, 0x0

    .line 187
    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    .line 193
    invoke-static/range {v12 .. v20}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 194
    move-result-object v2

    .line 195
    .line 196
    iget-object v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->V:Ljava/lang/String;

    .line 197
    .line 198
    new-instance v13, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    const-string v14, "joinedSymbols = "

    .line 204
    .line 205
    .line 206
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    move-result-object v13

    .line 214
    .line 215
    .line 216
    invoke-static {v5, v13}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    if-eq v1, v10, :cond_e

    .line 219
    .line 220
    if-eq v1, v9, :cond_c

    .line 221
    .line 222
    if-eq v1, v6, :cond_8

    .line 223
    .line 224
    iget-object v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 225
    .line 226
    .line 227
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 228
    move-result-object v6

    .line 229
    .line 230
    iput-object v12, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$0:Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    move-result-object v8

    .line 235
    .line 236
    iput-object v8, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$1:Ljava/lang/Object;

    .line 237
    .line 238
    iput v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->I$0:I

    .line 239
    .line 240
    iput v7, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->label:I

    .line 241
    .line 242
    const-string v7, "android/trade_list"

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v2, v7, v6, v3}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 246
    move-result-object v2

    .line 247
    .line 248
    if-ne v2, v4, :cond_7

    .line 249
    .line 250
    goto/16 :goto_9

    .line 251
    :cond_7
    move-object v3, v12

    .line 252
    .line 253
    :goto_1
    check-cast v2, Ljava/lang/Iterable;

    .line 254
    .line 255
    new-instance v4, Ljava/util/ArrayList;

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 259
    move-result v5

    .line 260
    .line 261
    .line 262
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 266
    move-result-object v2

    .line 267
    .line 268
    .line 269
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    move-result v5

    .line 271
    .line 272
    if-eqz v5, :cond_12

    .line 273
    .line 274
    .line 275
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    move-result-object v5

    .line 277
    .line 278
    check-cast v5, Lcom/kubi/data/entity/TradeItemBean;

    .line 279
    .line 280
    new-instance v6, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 281
    const/4 v11, 0x7

    .line 282
    const/4 v12, 0x0

    .line 283
    const/4 v7, 0x0

    .line 284
    .line 285
    const-wide/16 v8, 0x0

    .line 286
    const/4 v10, 0x0

    .line 287
    .line 288
    .line 289
    invoke-direct/range {v6 .. v12}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;-><init>(IJLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v6, v5, v1}, Lkv/e;->a(Lcom/kubi/quotefacade/entity/AllTradeItemBean;Lcom/kubi/data/entity/TradeItemBean;I)Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 293
    move-result-object v5

    .line 294
    .line 295
    .line 296
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 297
    goto :goto_2

    .line 298
    .line 299
    :cond_8
    iget-object v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 300
    .line 301
    new-instance v7, Ljava/util/ArrayList;

    .line 302
    .line 303
    .line 304
    invoke-static {v12, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 305
    move-result v8

    .line 306
    .line 307
    .line 308
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 312
    move-result-object v8

    .line 313
    .line 314
    .line 315
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    move-result v10

    .line 317
    .line 318
    if-eqz v10, :cond_9

    .line 319
    .line 320
    .line 321
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    move-result-object v10

    .line 323
    .line 324
    check-cast v10, Lcom/kubi/quotefacade/helper/g1;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10}, Lcom/kubi/quotefacade/helper/g1;->a()Ljava/lang/String;

    .line 328
    move-result-object v10

    .line 329
    .line 330
    .line 331
    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 332
    goto :goto_3

    .line 333
    .line 334
    :cond_9
    iput-object v12, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$0:Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    move-result-object v2

    .line 339
    .line 340
    iput-object v2, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$1:Ljava/lang/Object;

    .line 341
    .line 342
    iput v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->I$0:I

    .line 343
    .line 344
    iput v9, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->label:I

    .line 345
    .line 346
    const-string v1, "Alpha"

    .line 347
    .line 348
    .line 349
    invoke-virtual {v5, v1, v7, v3}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->s(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 350
    move-result-object v2

    .line 351
    .line 352
    if-ne v2, v4, :cond_a

    .line 353
    .line 354
    goto/16 :goto_9

    .line 355
    :cond_a
    move-object v1, v12

    .line 356
    .line 357
    :goto_4
    check-cast v2, Ljava/lang/Iterable;

    .line 358
    .line 359
    new-instance v4, Ljava/util/ArrayList;

    .line 360
    .line 361
    .line 362
    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 363
    move-result v3

    .line 364
    .line 365
    .line 366
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 367
    .line 368
    .line 369
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    move-result-object v2

    .line 371
    .line 372
    .line 373
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    move-result v3

    .line 375
    .line 376
    if-eqz v3, :cond_b

    .line 377
    .line 378
    .line 379
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    move-result-object v3

    .line 381
    .line 382
    check-cast v3, Lcom/kubi/quotefacade/entity/AlphaItemEntity;

    .line 383
    .line 384
    new-instance v7, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 385
    const/4 v12, 0x7

    .line 386
    const/4 v13, 0x0

    .line 387
    const/4 v8, 0x0

    .line 388
    .line 389
    const-wide/16 v9, 0x0

    .line 390
    const/4 v11, 0x0

    .line 391
    .line 392
    .line 393
    invoke-direct/range {v7 .. v13}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;-><init>(IJLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 394
    .line 395
    .line 396
    invoke-static {v7, v3, v6}, Lkv/e;->b(Lcom/kubi/quotefacade/entity/AllTradeItemBean;Lcom/kubi/quotefacade/entity/AlphaItemEntity;I)Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 397
    move-result-object v3

    .line 398
    .line 399
    .line 400
    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 401
    goto :goto_5

    .line 402
    :cond_b
    :goto_6
    move-object v3, v1

    .line 403
    .line 404
    goto/16 :goto_c

    .line 405
    .line 406
    :cond_c
    iget-object v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 407
    .line 408
    iput-object v12, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$0:Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    move-result-object v6

    .line 413
    .line 414
    iput-object v6, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$1:Ljava/lang/Object;

    .line 415
    .line 416
    iput v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->I$0:I

    .line 417
    .line 418
    iput v10, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->label:I

    .line 419
    .line 420
    .line 421
    invoke-virtual {v5, v2, v3}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->O(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 422
    move-result-object v2

    .line 423
    .line 424
    if-ne v2, v4, :cond_d

    .line 425
    goto :goto_9

    .line 426
    :cond_d
    move-object v1, v12

    .line 427
    :goto_7
    move-object v4, v2

    .line 428
    .line 429
    check-cast v4, Ljava/util/List;

    .line 430
    goto :goto_6

    .line 431
    .line 432
    :cond_e
    iget-object v5, v0, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;->W:Lcom/kubi/quotefacade/repository/QuoteMarketRepository;

    .line 433
    .line 434
    new-instance v6, Ljava/util/ArrayList;

    .line 435
    .line 436
    .line 437
    invoke-static {v12, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 438
    move-result v7

    .line 439
    .line 440
    .line 441
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 442
    .line 443
    .line 444
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 445
    move-result-object v7

    .line 446
    .line 447
    .line 448
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 449
    move-result v9

    .line 450
    .line 451
    if-eqz v9, :cond_f

    .line 452
    .line 453
    .line 454
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 455
    move-result-object v9

    .line 456
    .line 457
    check-cast v9, Lcom/kubi/quotefacade/helper/g1;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v9}, Lcom/kubi/quotefacade/helper/g1;->a()Ljava/lang/String;

    .line 461
    move-result-object v9

    .line 462
    .line 463
    .line 464
    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 465
    goto :goto_8

    .line 466
    .line 467
    :cond_f
    iput-object v12, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$0:Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    move-result-object v2

    .line 472
    .line 473
    iput-object v2, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->L$1:Ljava/lang/Object;

    .line 474
    .line 475
    iput v1, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->I$0:I

    .line 476
    .line 477
    iput v8, v3, Lcom/kubi/quotefacade/favorites/all/FavAllViewModel$getCacheFavorList$1;->label:I

    .line 478
    .line 479
    .line 480
    invoke-virtual {v5, v6, v3}, Lcom/kubi/quotefacade/repository/QuoteMarketRepository;->U(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 481
    move-result-object v2

    .line 482
    .line 483
    if-ne v2, v4, :cond_10

    .line 484
    :goto_9
    return-object v4

    .line 485
    :cond_10
    move-object v3, v12

    .line 486
    .line 487
    :goto_a
    check-cast v2, Lcom/kubi/quotefacade/entity/TradeSymbolEntity;

    .line 488
    .line 489
    if-eqz v2, :cond_11

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/TradeSymbolEntity;->getSpots()Ljava/util/List;

    .line 493
    move-result-object v2

    .line 494
    .line 495
    if-eqz v2, :cond_11

    .line 496
    .line 497
    new-instance v4, Ljava/util/ArrayList;

    .line 498
    .line 499
    .line 500
    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 501
    move-result v5

    .line 502
    .line 503
    .line 504
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 508
    move-result-object v2

    .line 509
    .line 510
    .line 511
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 512
    move-result v5

    .line 513
    .line 514
    if-eqz v5, :cond_12

    .line 515
    .line 516
    .line 517
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 518
    move-result-object v5

    .line 519
    .line 520
    check-cast v5, Lcom/kubi/quotefacade/entity/MarketListEntityItem;

    .line 521
    .line 522
    new-instance v6, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 523
    const/4 v11, 0x7

    .line 524
    const/4 v12, 0x0

    .line 525
    const/4 v7, 0x0

    .line 526
    .line 527
    const-wide/16 v8, 0x0

    .line 528
    const/4 v10, 0x0

    .line 529
    .line 530
    .line 531
    invoke-direct/range {v6 .. v12}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;-><init>(IJLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 532
    .line 533
    .line 534
    invoke-static {v6, v5, v1}, Lkv/e;->c(Lcom/kubi/quotefacade/entity/AllTradeItemBean;Lcom/kubi/quotefacade/entity/MarketListEntityItem;I)Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 535
    move-result-object v5

    .line 536
    .line 537
    .line 538
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 539
    goto :goto_b

    .line 540
    .line 541
    .line 542
    :cond_11
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 543
    move-result-object v4

    .line 544
    .line 545
    .line 546
    :cond_12
    :goto_c
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 547
    move-result v1

    .line 548
    .line 549
    if-eqz v1, :cond_13

    .line 550
    .line 551
    .line 552
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 553
    move-result-object v1

    .line 554
    return-object v1

    .line 555
    .line 556
    .line 557
    :cond_13
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 558
    move-result-object v1

    .line 559
    .line 560
    .line 561
    :cond_14
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 562
    move-result v2

    .line 563
    .line 564
    if-eqz v2, :cond_17

    .line 565
    .line 566
    .line 567
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 568
    move-result-object v2

    .line 569
    .line 570
    check-cast v2, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 571
    .line 572
    .line 573
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 574
    move-result-object v5

    .line 575
    .line 576
    .line 577
    :cond_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 578
    move-result v6

    .line 579
    .line 580
    if-eqz v6, :cond_16

    .line 581
    .line 582
    .line 583
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 584
    move-result-object v6

    .line 585
    move-object v7, v6

    .line 586
    .line 587
    check-cast v7, Lcom/kubi/quotefacade/helper/g1;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v7}, Lcom/kubi/quotefacade/helper/g1;->a()Ljava/lang/String;

    .line 591
    move-result-object v7

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 595
    move-result-object v8

    .line 596
    .line 597
    .line 598
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 599
    move-result v7

    .line 600
    .line 601
    if-eqz v7, :cond_15

    .line 602
    goto :goto_e

    .line 603
    :cond_16
    const/4 v6, 0x0

    .line 604
    .line 605
    :goto_e
    check-cast v6, Lcom/kubi/quotefacade/helper/g1;

    .line 606
    .line 607
    if-eqz v6, :cond_14

    .line 608
    .line 609
    .line 610
    invoke-virtual {v6}, Lcom/kubi/quotefacade/helper/g1;->b()J

    .line 611
    move-result-wide v5

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v5, v6}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->setTimestamp(J)V

    .line 615
    goto :goto_d

    .line 616
    :cond_17
    return-object v4
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
.end method
