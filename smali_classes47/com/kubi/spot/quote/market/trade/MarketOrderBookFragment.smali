.class public final Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;
.super Lcom/kubi/sdk/base/ui/OldBaseFragment;
.source "MarketOrderBookFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 52\u00020\u0001:\u00015B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\"\u001a\u00020\u0019H\u0014J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0016J!\u0010)\u001a\u00020$2\u0012\u0010*\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020,0+\"\u00020,H\u0002\u00a2\u0006\u0002\u0010-J\u0008\u0010.\u001a\u00020$H\u0016J\u0008\u0010/\u001a\u00020$H\u0016J\u0010\u00100\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0002J\u0008\u00104\u001a\u00020$H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000f\u001a\u0004\u0008\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u000f\u001a\u0004\u0008\u001f\u0010 \u00a8\u00066"
    }
    d2 = {
        "Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;",
        "Lcom/kubi/sdk/base/ui/OldBaseFragment;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/spot/databinding/KucoinFragmentMarketOrderbookBinding;",
        "getBinding",
        "()Lcom/kubi/spot/databinding/KucoinFragmentMarketOrderbookBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "mBuyAdapter",
        "Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;",
        "getMBuyAdapter",
        "()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;",
        "mBuyAdapter$delegate",
        "Lkotlin/Lazy;",
        "mSellAdapter",
        "getMSellAdapter",
        "mSellAdapter$delegate",
        "tradeItem",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "getTradeItem",
        "()Lcom/kubi/data/entity/TradeItemBean;",
        "tradeItem$delegate",
        "precision",
        "",
        "precisionIndex",
        "wsDataHelper",
        "Lcom/kubi/sdk/websocket/WsDataHelper;",
        "mOrderBookHelper",
        "Lcom/kubi/spot/helper/NewOrderBookHelper;",
        "getMOrderBookHelper",
        "()Lcom/kubi/spot/helper/NewOrderBookHelper;",
        "mOrderBookHelper$delegate",
        "getLayout",
        "onViewCreated",
        "",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "initRecyclerView",
        "recyclerViews",
        "",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "([Landroidx/recyclerview/widget/RecyclerView;)V",
        "onShow",
        "onHide",
        "onPrecisionChanged",
        "onOrderBookDataReceived",
        "srcOrderEntity",
        "Lcom/kubi/data/entity/OrderBookEntity;",
        "showOrderBookAmountDialog",
        "Companion",
        "SpotLib_googleRelease"
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
        "SMAP\nMarketOrderBookFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketOrderBookFragment.kt\ncom/kubi/spot/quote/market/trade/MarketOrderBookFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,263:1\n147#2,16:264\n1#3:280\n81#4,2:281\n13537#5,3:283\n1573#6:286\n1604#6,4:287\n43#7,7:291\n*S KotlinDebug\n*F\n+ 1 MarketOrderBookFragment.kt\ncom/kubi/spot/quote/market/trade/MarketOrderBookFragment\n*L\n44#1:264,16\n138#1:281,2\n205#1:283,3\n99#1:286\n99#1:287,4\n154#1:291,7\n*E\n"
    }
.end annotation


# static fields
.field public static final c0:Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic d0:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final U:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final V:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final W:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final X:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Y:I

.field public Z:I

.field public final a0:Lg10/r;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getBinding()Lcom/kubi/spot/databinding/KucoinFragmentMarketOrderbookBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;

    .line 8
    .line 9
    const-string v4, "binding"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->d0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->c0:Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$Companion;

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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/spot/quote/market/trade/h;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/kubi/spot/quote/market/trade/h;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->V:Lkotlin/Lazy;

    .line 28
    .line 29
    new-instance v0, Lcom/kubi/spot/quote/market/trade/l;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Lcom/kubi/spot/quote/market/trade/l;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iput-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->W:Lkotlin/Lazy;

    .line 39
    .line 40
    new-instance v0, Lcom/kubi/spot/quote/market/trade/m;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, p0}, Lcom/kubi/spot/quote/market/trade/m;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->X:Lkotlin/Lazy;

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    iput v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 54
    .line 55
    new-instance v0, Lg10/r;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, p0}, Lg10/r;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    .line 59
    .line 60
    iput-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->a0:Lg10/r;

    .line 61
    .line 62
    new-instance v0, Lcom/kubi/spot/quote/market/trade/n;

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, p0}, Lcom/kubi/spot/quote/market/trade/n;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    iput-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->b0:Lkotlin/Lazy;

    .line 72
    return-void
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
.end method

.method private final C3()Lcom/kubi/data/entity/TradeItemBean;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->X:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/data/entity/TradeItemBean;

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method private final varargs D3([Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    const/4 v3, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 11
    .line 12
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    invoke-direct {v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
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
.end method

.method public static final E3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;-><init>(IILjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public static final F3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lcom/kubi/spot/helper/NewOrderBookHelper;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/spot/helper/NewOrderBookHelper;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->a0:Lg10/r;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    const-string v2, "getSymbol(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 31
    move-result v2

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    .line 39
    :goto_0
    const/16 v4, 0x8

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 43
    move-result v4

    .line 44
    .line 45
    new-instance v5, Lcom/kubi/spot/quote/market/trade/i;

    .line 46
    .line 47
    .line 48
    invoke-direct {v5, p0}, Lcom/kubi/spot/quote/market/trade/i;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 49
    move-object v2, p0

    .line 50
    .line 51
    .line 52
    invoke-direct/range {v0 .. v5}, Lcom/kubi/spot/helper/NewOrderBookHelper;-><init>(Lg10/r;Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;ILio/reactivex/functions/Consumer;)V

    .line 53
    return-object v0
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
.end method

.method public static final G3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lcom/kubi/data/entity/OrderBookEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->I3(Lcom/kubi/data/entity/OrderBookEntity;)V

    .line 7
    return-void
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
.end method

.method public static final H3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;-><init>(IILjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method private final I3(Lcom/kubi/data/entity/OrderBookEntity;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lt20/m0;->c:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getAsks()Ljava/util/List;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getBids()Ljava/util/List;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    goto :goto_1

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    iget-object v0, v0, Lt20/m0;->b:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 53
    goto :goto_2

    .line 54
    .line 55
    .line 56
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-object v0, v0, Lt20/m0;->b:Landroid/widget/LinearLayout;

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showContent()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getAsks()Ljava/util/List;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lcom/kubi/utils/extensions/b;->b(Ljava/util/List;)Ljava/util/List;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->p(Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getBids()Ljava/util/List;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, Lcom/kubi/utils/extensions/b;->b(Ljava/util/List;)Ljava/util/List;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->p(Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 111
    move-result-wide v1

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 115
    move-result-object v3

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 119
    move-result-wide v3

    .line 120
    .line 121
    .line 122
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 123
    move-result-wide v1

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1, v2}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->o(D)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 138
    move-result-wide v1

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 142
    move-result-object v3

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 146
    move-result-wide v3

    .line 147
    .line 148
    .line 149
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 150
    move-result-wide v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1, v2}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->o(D)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    if-eqz v0, :cond_6

    .line 160
    .line 161
    iget-object v0, v0, Lt20/m0;->c:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 162
    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getBids()Ljava/util/List;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    .line 170
    invoke-static {v1}, Lcom/kubi/utils/extensions/b;->b(Ljava/util/List;)Ljava/util/List;

    .line 171
    move-result-object v1

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/kubi/data/entity/OrderBookEntity;->getAsks()Ljava/util/List;

    .line 175
    move-result-object p1

    .line 176
    .line 177
    .line 178
    invoke-static {p1}, Lcom/kubi/utils/extensions/b;->b(Ljava/util/List;)Ljava/util/List;

    .line 179
    move-result-object p1

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1, p1}, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->d(Ljava/util/List;Ljava/util/List;)V

    .line 183
    :cond_6
    :goto_3
    return-void
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
.end method

.method public static final K3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->l0()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final L3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->A3()Lcom/kubi/spot/helper/NewOrderBookHelper;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "getSymbol(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 31
    move-result p0

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    move-result-object p0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    .line 39
    :goto_0
    const/16 v1, 0x8

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 43
    move-result p0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0, p0}, Lcom/kubi/spot/helper/NewOrderBookHelper;->o(Ljava/lang/String;I)V

    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    return-object p0
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
.end method

.method public static final M3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static final N3(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    const-string v0, "TradeSubmitFragment"

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lw20/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

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
.end method

.method public static final O3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public static final P3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lkotlin/Unit;
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;->a:Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;

    .line 5
    .line 6
    iget v2, v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, Lcom/kubi/spot/quote/market/trade/u;->a(I)Ljava/util/ArrayList;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    new-instance v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v4, 0xa

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 18
    move-result v4

    .line 19
    .line 20
    .line 21
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v2

    .line 26
    const/4 v4, 0x0

    .line 27
    move v5, v4

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v6

    .line 32
    .line 33
    if-eqz v6, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v6

    .line 38
    .line 39
    add-int/lit8 v7, v5, 0x1

    .line 40
    .line 41
    if-gez v5, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 45
    :cond_0
    move-object v10, v6

    .line 46
    .line 47
    check-cast v10, Ljava/lang/String;

    .line 48
    .line 49
    new-instance v8, Lcom/kubi/sdk/widget/dialog/a;

    .line 50
    .line 51
    iget v6, v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Z:I

    .line 52
    .line 53
    if-ne v5, v6, :cond_1

    .line 54
    const/4 v5, 0x1

    .line 55
    .line 56
    move/from16 v19, v5

    .line 57
    goto :goto_1

    .line 58
    .line 59
    :cond_1
    move/from16 v19, v4

    .line 60
    .line 61
    :goto_1
    const/16 v21, 0xbfd

    .line 62
    .line 63
    const/16 v22, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v13, 0x0

    .line 68
    const/4 v14, 0x0

    .line 69
    const/4 v15, 0x0

    .line 70
    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    const/16 v17, 0x0

    .line 74
    .line 75
    const/16 v18, 0x0

    .line 76
    .line 77
    const/16 v20, 0x0

    .line 78
    .line 79
    .line 80
    invoke-direct/range {v8 .. v22}, Lcom/kubi/sdk/widget/dialog/a;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    move v5, v7

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_2
    new-instance v2, Lcom/kubi/spot/quote/market/trade/k;

    .line 88
    .line 89
    .line 90
    invoke-direct {v2, v0}, Lcom/kubi/spot/quote/market/trade/k;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 91
    .line 92
    const/16 v8, 0x3c

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v4, 0x0

    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 98
    .line 99
    move-object/from16 v23, v3

    .line 100
    move-object v3, v2

    .line 101
    .line 102
    move-object/from16 v2, v23

    .line 103
    .line 104
    .line 105
    invoke-static/range {v1 .. v9}, Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;->B(Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;Ljava/util/List;Lio/reactivex/functions/BiConsumer;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    const-string v2, "getChildFragmentManager(...)"

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    const-string v2, "showPrecisionDialog"

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v0, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 121
    .line 122
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 123
    return-object v0
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
.end method

.method public static final Q3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iput v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Z:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lt20/m0;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;->getLabel()Ljava/lang/CharSequence;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 27
    move-result-object p2

    .line 28
    .line 29
    iget v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    .line 33
    move-result v1

    .line 34
    sub-int/2addr v0, v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->q(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    iget v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    .line 47
    move-result v1

    .line 48
    sub-int/2addr v0, v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->q(I)V

    .line 52
    .line 53
    iget p2, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    .line 57
    move-result p1

    .line 58
    sub-int/2addr p2, p1

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p2}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->J3(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 73
    move-result-wide v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 81
    move-result-wide v2

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 85
    move-result-wide v0

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0, v1}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->o(D)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 96
    move-result-object p2

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 100
    move-result-wide v0

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 104
    move-result-object p0

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->m()D

    .line 108
    move-result-wide v2

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 112
    move-result-wide v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0, v1}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->o(D)V

    .line 116
    return-void
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
.end method

.method public static final R3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;)V
    .locals 2

    .line 1
    .line 2
    sget-object p2, Lgf/b0;->a:Lgf/b0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lgf/b0;->y(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->u(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 28
    move-result p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p1}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->u(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 49
    move-result-object p1

    .line 50
    const/4 p2, 0x0

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p1, Lt20/m0;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 64
    move-result v0

    .line 65
    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    sget v0, Lcom/kubi/spot/R$string;->total_stub:I

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :cond_0
    sget v0, Lcom/kubi/spot/R$string;->amount_stub:I

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-direct {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 87
    move-result-object v1

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    move-object v1, p2

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    iget-object p1, p1, Lt20/m0;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 113
    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 122
    move-result v0

    .line 123
    .line 124
    if-nez v0, :cond_3

    .line 125
    .line 126
    sget v0, Lcom/kubi/spot/R$string;->total_stub:I

    .line 127
    goto :goto_2

    .line 128
    .line 129
    :cond_3
    sget v0, Lcom/kubi/spot/R$string;->amount_stub:I

    .line 130
    .line 131
    .line 132
    :goto_2
    invoke-direct {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    if-eqz v1, :cond_4

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 145
    move-result-object p2

    .line 146
    .line 147
    .line 148
    :cond_4
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    move-result-object p2

    .line 150
    .line 151
    .line 152
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 153
    move-result-object p2

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v0, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    move-result-object p0

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    :cond_5
    return-void
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
.end method

.method public static final S3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lcom/kubi/data/entity/TradeItemBean;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    const-string v0, "data"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/data/entity/TradeItemBean;

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object p0

    .line 19
    .line 20
    :cond_1
    :goto_0
    new-instance p0, Lcom/kubi/data/entity/TradeItemBean;

    .line 21
    .line 22
    const-string v0, "BTC-USDT"

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, Lcom/kubi/data/entity/TradeItemBean;-><init>(Ljava/lang/String;)V

    .line 26
    return-object p0
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
.end method

.method public static synthetic k3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Q3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;)V

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
.end method

.method private final l0()V
    .locals 22

    .line 1
    .line 2
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/BaseApplication;->Companion:Lcom/kubi/sdk/BaseApplication$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/sdk/BaseApplication$Companion;->get()Landroid/app/Application;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget v2, Lcom/kubi/spot/R$array;->kucoin_all_or_single:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v2, "getStringArray(...)"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    array-length v2, v0

    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    move v5, v4

    .line 31
    .line 32
    :goto_0
    if-ge v4, v2, :cond_1

    .line 33
    .line 34
    aget-object v8, v0, v4

    .line 35
    .line 36
    add-int/lit8 v21, v5, 0x1

    .line 37
    .line 38
    new-instance v6, Lcom/kubi/sdk/widget/dialog/a;

    .line 39
    .line 40
    .line 41
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 45
    move-result-object v7

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 49
    move-result v7

    .line 50
    .line 51
    if-ne v5, v7, :cond_0

    .line 52
    const/4 v5, 0x1

    .line 53
    .line 54
    move/from16 v17, v5

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_0
    move/from16 v17, v3

    .line 58
    .line 59
    :goto_1
    const/16 v19, 0xbfd

    .line 60
    .line 61
    const/16 v20, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v13, 0x0

    .line 68
    const/4 v14, 0x0

    .line 69
    const/4 v15, 0x0

    .line 70
    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    const/16 v18, 0x0

    .line 74
    .line 75
    .line 76
    invoke-direct/range {v6 .. v20}, Lcom/kubi/sdk/widget/dialog/a;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    move/from16 v5, v21

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_1
    sget-object v0, Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;->a:Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;

    .line 87
    .line 88
    new-instance v2, Lcom/kubi/spot/quote/market/trade/j;

    .line 89
    .line 90
    move-object/from16 v9, p0

    .line 91
    .line 92
    .line 93
    invoke-direct {v2, v9}, Lcom/kubi/spot/quote/market/trade/j;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 94
    .line 95
    const/16 v7, 0x3c

    .line 96
    const/4 v8, 0x0

    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    const/4 v6, 0x0

    .line 101
    .line 102
    .line 103
    invoke-static/range {v0 .. v8}, Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;->B(Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper;Ljava/util/List;Lio/reactivex/functions/BiConsumer;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/resources/dialog/DialogFragmentHelper;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    const-string v2, "getChildFragmentManager(...)"

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    const-string v2, "showOrderBookAmountDialog"

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 119
    return-void
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
.end method

.method public static synthetic l3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lcom/kubi/data/entity/OrderBookEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->G3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lcom/kubi/data/entity/OrderBookEntity;)V

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
.end method

.method public static synthetic m3(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->N3(Ljava/lang/Throwable;)Lkotlin/Unit;

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
.end method

.method public static synthetic n3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->H3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public static synthetic o3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->M3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic p3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->K3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic q3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->P3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic r3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->L3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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
.end method

.method public static synthetic s3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->E3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public static synthetic t3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lcom/kubi/spot/helper/NewOrderBookHelper;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->F3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lcom/kubi/spot/helper/NewOrderBookHelper;

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
.end method

.method public static synthetic u3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->O3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic v3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->R3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$a;)V

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
.end method

.method public static synthetic w3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lcom/kubi/data/entity/TradeItemBean;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->S3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lcom/kubi/data/entity/TradeItemBean;

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
.end method

.method public static final synthetic x3(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)Lt20/m0;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

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
.end method


# virtual methods
.method public final A3()Lcom/kubi/spot/helper/NewOrderBookHelper;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->b0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/spot/helper/NewOrderBookHelper;

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public final B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->W:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public final J3(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->A3()Lcom/kubi/spot/helper/NewOrderBookHelper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/kubi/spot/helper/NewOrderBookHelper;->e(I)V

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
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/spot/R$layout;->kucoin_fragment_market_orderbook:I

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public onHide()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseFragment;->onHide()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->a0:Lg10/r;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lg10/r;->i(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->A3()Lcom/kubi/spot/helper/NewOrderBookHelper;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/spot/helper/NewOrderBookHelper;->k()V

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
.end method

.method public onShow()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseFragment;->onShow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->A3()Lcom/kubi/spot/helper/NewOrderBookHelper;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/spot/helper/NewOrderBookHelper;->m()Lio/reactivex/disposables/Disposable;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getVisibleDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->A3()Lcom/kubi/spot/helper/NewOrderBookHelper;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/spot/helper/NewOrderBookHelper;->l()V

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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 17
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    const-string v2, "view"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    .line 10
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-super/range {p0 .. p2}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 24
    move-result-object v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    .line 28
    :goto_0
    if-eqz v2, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 32
    move-result v4

    .line 33
    .line 34
    iput v4, v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 42
    move-result v5

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v5}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->n(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 53
    move-result v5

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v5}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->n(I)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    iget-object v4, v4, Lt20/m0;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    iget v5, v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 69
    .line 70
    if-nez v5, :cond_2

    .line 71
    .line 72
    const-string v5, "1"

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :cond_2
    new-instance v5, Ljava/math/BigDecimal;

    .line 76
    .line 77
    const-string v6, "0.1"

    .line 78
    .line 79
    .line 80
    invoke-direct {v5, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    iget v6, v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v6}, Ljava/math/BigDecimal;->pow(I)Ljava/math/BigDecimal;

    .line 86
    move-result-object v7

    .line 87
    .line 88
    const-string v5, "pow(...)"

    .line 89
    .line 90
    .line 91
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    const/16 v15, 0x7d

    .line 94
    .line 95
    const/16 v16, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    .line 98
    const/16 v9, 0x14

    .line 99
    const/4 v10, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v13, 0x0

    .line 103
    const/4 v14, 0x0

    .line 104
    .line 105
    .line 106
    invoke-static/range {v7 .. v16}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 107
    move-result-object v5

    .line 108
    .line 109
    .line 110
    :goto_1
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 114
    move-result-object v4

    .line 115
    .line 116
    iget v5, v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v5}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->q(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 123
    move-result-object v4

    .line 124
    .line 125
    iget v5, v0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->Y:I

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v5}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->q(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 132
    move-result-object v4

    .line 133
    .line 134
    const-string v5, "null cannot be cast to non-null type com.kubi.spot.quote.market.trade.MarketTradeFragment"

    .line 135
    .line 136
    .line 137
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    check-cast v4, Lcom/kubi/spot/quote/market/trade/MarketTradeFragment;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Lcom/kubi/spot/quote/market/trade/MarketTradeFragment;->N3()I

    .line 143
    move-result v4

    .line 144
    .line 145
    const/high16 v5, 0x43820000    # 260.0f

    .line 146
    .line 147
    .line 148
    invoke-static {v5}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 149
    move-result v5

    .line 150
    sub-int/2addr v4, v5

    .line 151
    .line 152
    const/high16 v5, 0x41d00000    # 26.0f

    .line 153
    .line 154
    .line 155
    invoke-static {v5}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 156
    move-result v5

    .line 157
    div-int/2addr v4, v5

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 161
    move-result-object v5

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 165
    move-result-object v6

    .line 166
    .line 167
    const-string v7, "requireContext(...)"

    .line 168
    .line 169
    .line 170
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    const/16 v8, 0xc

    .line 173
    .line 174
    .line 175
    invoke-static {v6, v8}, Lcom/kubi/utils/extensions/c;->f(Landroid/content/Context;I)F

    .line 176
    move-result v6

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, v6}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->v(F)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 183
    move-result-object v5

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 187
    move-result-object v6

    .line 188
    .line 189
    .line 190
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v6, v8}, Lcom/kubi/utils/extensions/c;->f(Landroid/content/Context;I)F

    .line 194
    move-result v6

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5, v6}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->v(F)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 201
    move-result-object v5

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v4}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->t(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 208
    move-result-object v5

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v4}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->t(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 215
    move-result-object v4

    .line 216
    .line 217
    if-eqz v4, :cond_4

    .line 218
    .line 219
    iget-object v5, v4, Lt20/m0;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 220
    .line 221
    const-string v6, "recyclerviewOrderbookBuy"

    .line 222
    .line 223
    .line 224
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    .line 226
    iget-object v4, v4, Lt20/m0;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 227
    .line 228
    const-string v6, "recyclerViewOrderBookSell"

    .line 229
    .line 230
    .line 231
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    filled-new-array {v5, v4}, [Landroidx/recyclerview/widget/RecyclerView;

    .line 235
    move-result-object v4

    .line 236
    .line 237
    .line 238
    invoke-direct {v0, v4}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->D3([Landroidx/recyclerview/widget/RecyclerView;)V

    .line 239
    .line 240
    .line 241
    :cond_4
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 242
    move-result-object v4

    .line 243
    .line 244
    if-eqz v4, :cond_5

    .line 245
    .line 246
    iget-object v4, v4, Lt20/m0;->k:Landroidx/recyclerview/widget/RecyclerView;

    .line 247
    .line 248
    if-eqz v4, :cond_5

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 252
    move-result-object v5

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 256
    .line 257
    .line 258
    :cond_5
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 259
    move-result-object v4

    .line 260
    .line 261
    if-eqz v4, :cond_6

    .line 262
    .line 263
    iget-object v4, v4, Lt20/m0;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 264
    .line 265
    if-eqz v4, :cond_6

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->B3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 269
    move-result-object v5

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 273
    .line 274
    .line 275
    :cond_6
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 276
    move-result-object v4

    .line 277
    .line 278
    if-eqz v4, :cond_7

    .line 279
    .line 280
    iget-object v5, v4, Lt20/m0;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 281
    .line 282
    if-eqz v5, :cond_7

    .line 283
    .line 284
    new-instance v8, Lcom/kubi/spot/quote/market/trade/o;

    .line 285
    .line 286
    .line 287
    invoke-direct {v8, v0}, Lcom/kubi/spot/quote/market/trade/o;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 288
    const/4 v9, 0x1

    .line 289
    const/4 v10, 0x0

    .line 290
    .line 291
    const-wide/16 v6, 0x0

    .line 292
    .line 293
    .line 294
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_7
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 298
    move-result-object v4

    .line 299
    .line 300
    if-eqz v4, :cond_8

    .line 301
    .line 302
    iget-object v5, v4, Lt20/m0;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 303
    .line 304
    const-string v6, "tvAmountUnit"

    .line 305
    .line 306
    .line 307
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    iget-object v4, v4, Lt20/m0;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 310
    .line 311
    const-string v6, "tvAmountUnit1"

    .line 312
    .line 313
    .line 314
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    const/4 v6, 0x2

    .line 316
    .line 317
    new-array v6, v6, [Landroid/view/View;

    .line 318
    const/4 v7, 0x0

    .line 319
    .line 320
    aput-object v5, v6, v7

    .line 321
    .line 322
    aput-object v4, v6, v1

    .line 323
    .line 324
    new-instance v4, Lcom/kubi/spot/quote/market/trade/p;

    .line 325
    .line 326
    .line 327
    invoke-direct {v4, v0}, Lcom/kubi/spot/quote/market/trade/p;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v6, v4}, Lcom/kubi/utils/extensions/k;->D([Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 331
    .line 332
    .line 333
    :cond_8
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 334
    move-result-object v4

    .line 335
    .line 336
    if-eqz v4, :cond_b

    .line 337
    .line 338
    iget-object v4, v4, Lt20/m0;->l:Lcom/kubi/resources/widget/BaseTextView;

    .line 339
    .line 340
    if-eqz v4, :cond_b

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 344
    move-result-object v5

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 348
    move-result v5

    .line 349
    .line 350
    if-nez v5, :cond_9

    .line 351
    .line 352
    sget v5, Lcom/kubi/spot/R$string;->total_stub:I

    .line 353
    goto :goto_2

    .line 354
    .line 355
    :cond_9
    sget v5, Lcom/kubi/spot/R$string;->amount_stub:I

    .line 356
    .line 357
    .line 358
    :goto_2
    invoke-direct {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 359
    move-result-object v6

    .line 360
    .line 361
    if-eqz v6, :cond_a

    .line 362
    .line 363
    .line 364
    invoke-virtual {v6}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 365
    move-result-object v6

    .line 366
    .line 367
    if-eqz v6, :cond_a

    .line 368
    .line 369
    .line 370
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 371
    move-result-object v6

    .line 372
    goto :goto_3

    .line 373
    :cond_a
    move-object v6, v3

    .line 374
    .line 375
    .line 376
    :goto_3
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    move-result-object v6

    .line 378
    .line 379
    .line 380
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 381
    move-result-object v6

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v5, v6}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 385
    move-result-object v5

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    .line 390
    .line 391
    :cond_b
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 392
    move-result-object v4

    .line 393
    .line 394
    if-eqz v4, :cond_e

    .line 395
    .line 396
    iget-object v4, v4, Lt20/m0;->m:Lcom/kubi/resources/widget/BaseTextView;

    .line 397
    .line 398
    if-eqz v4, :cond_e

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

    .line 402
    move-result-object v5

    .line 403
    .line 404
    .line 405
    invoke-virtual {v5}, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;->l()I

    .line 406
    move-result v5

    .line 407
    .line 408
    if-nez v5, :cond_c

    .line 409
    .line 410
    sget v5, Lcom/kubi/spot/R$string;->total_stub:I

    .line 411
    goto :goto_4

    .line 412
    .line 413
    :cond_c
    sget v5, Lcom/kubi/spot/R$string;->amount_stub:I

    .line 414
    .line 415
    .line 416
    :goto_4
    invoke-direct {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 417
    move-result-object v6

    .line 418
    .line 419
    if-eqz v6, :cond_d

    .line 420
    .line 421
    .line 422
    invoke-virtual {v6}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 423
    move-result-object v6

    .line 424
    .line 425
    if-eqz v6, :cond_d

    .line 426
    .line 427
    .line 428
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 429
    move-result-object v6

    .line 430
    goto :goto_5

    .line 431
    :cond_d
    move-object v6, v3

    .line 432
    .line 433
    .line 434
    :goto_5
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 435
    move-result-object v6

    .line 436
    .line 437
    .line 438
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 439
    move-result-object v6

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v5, v6}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 443
    move-result-object v5

    .line 444
    .line 445
    .line 446
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 447
    .line 448
    .line 449
    :cond_e
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 450
    move-result-object v4

    .line 451
    .line 452
    if-eqz v4, :cond_10

    .line 453
    .line 454
    iget-object v4, v4, Lt20/m0;->o:Lcom/kubi/resources/widget/BaseTextView;

    .line 455
    .line 456
    if-eqz v4, :cond_10

    .line 457
    .line 458
    sget v5, Lcom/kubi/spot/R$string;->price_order:I

    .line 459
    .line 460
    .line 461
    invoke-direct {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->C3()Lcom/kubi/data/entity/TradeItemBean;

    .line 462
    move-result-object v6

    .line 463
    .line 464
    if-eqz v6, :cond_f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v6}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 468
    move-result-object v6

    .line 469
    .line 470
    if-eqz v6, :cond_f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrencyName()Ljava/lang/String;

    .line 474
    move-result-object v6

    .line 475
    goto :goto_6

    .line 476
    :cond_f
    move-object v6, v3

    .line 477
    .line 478
    .line 479
    :goto_6
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 480
    move-result-object v6

    .line 481
    .line 482
    .line 483
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 484
    move-result-object v6

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v5, v6}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 488
    move-result-object v5

    .line 489
    .line 490
    .line 491
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    .line 493
    .line 494
    :cond_10
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 495
    move-result-object v4

    .line 496
    .line 497
    if-eqz v4, :cond_12

    .line 498
    .line 499
    iget-object v4, v4, Lt20/m0;->c:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 500
    .line 501
    if-eqz v4, :cond_12

    .line 502
    .line 503
    if-eqz v2, :cond_11

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getPriceIncrementPrecision()I

    .line 507
    move-result v5

    .line 508
    .line 509
    .line 510
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    move-result-object v5

    .line 512
    goto :goto_7

    .line 513
    :cond_11
    move-object v5, v3

    .line 514
    .line 515
    .line 516
    :goto_7
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 517
    move-result v5

    .line 518
    .line 519
    .line 520
    invoke-virtual {v4, v5}, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->setPricePrecision(I)V

    .line 521
    .line 522
    .line 523
    :cond_12
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->y3()Lt20/m0;

    .line 524
    move-result-object v4

    .line 525
    .line 526
    if-eqz v4, :cond_14

    .line 527
    .line 528
    iget-object v4, v4, Lt20/m0;->c:Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;

    .line 529
    .line 530
    if-eqz v4, :cond_14

    .line 531
    .line 532
    if-eqz v2, :cond_13

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseIncrementPrecision()I

    .line 536
    move-result v2

    .line 537
    .line 538
    .line 539
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 540
    move-result-object v2

    .line 541
    goto :goto_8

    .line 542
    :cond_13
    move-object v2, v3

    .line 543
    .line 544
    .line 545
    :goto_8
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 546
    move-result v2

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4, v2}, Lcom/kubi/resources/widget/chart/depth/KuCoinDepthView;->setAmountPrecision(I)V

    .line 550
    .line 551
    .line 552
    :cond_14
    invoke-virtual {v0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showLoading()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->A3()Lcom/kubi/spot/helper/NewOrderBookHelper;

    .line 556
    move-result-object v2

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2}, Lcom/kubi/spot/helper/NewOrderBookHelper;->g()V

    .line 560
    .line 561
    sget-object v2, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2}, Lcom/kubi/event/api/b;->a()Z

    .line 565
    move-result v2

    .line 566
    .line 567
    const-string v4, "call_auction_process"

    .line 568
    .line 569
    if-eqz v2, :cond_15

    .line 570
    .line 571
    .line 572
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 573
    move-result v2

    .line 574
    .line 575
    :cond_15
    new-instance v2, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1;

    .line 576
    .line 577
    .line 578
    invoke-direct {v2, v4, v3, v0}, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment$onViewCreated$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 579
    .line 580
    .line 581
    invoke-static {v0, v1, v2}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0}, Lcom/kubi/sdk/BaseFragment;->getDestroyDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 585
    move-result-object v1

    .line 586
    .line 587
    sget-object v2, Lcom/kubi/core/biz/callauction/j;->a:Lcom/kubi/core/biz/callauction/j;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2}, Lcom/kubi/core/biz/callauction/j;->g()Lio/reactivex/subjects/PublishSubject;

    .line 591
    move-result-object v2

    .line 592
    .line 593
    new-instance v3, Lcom/kubi/spot/quote/market/trade/q;

    .line 594
    .line 595
    .line 596
    invoke-direct {v3, v0}, Lcom/kubi/spot/quote/market/trade/q;-><init>(Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;)V

    .line 597
    .line 598
    new-instance v4, Lcom/kubi/spot/quote/market/trade/r;

    .line 599
    .line 600
    .line 601
    invoke-direct {v4, v3}, Lcom/kubi/spot/quote/market/trade/r;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 602
    .line 603
    new-instance v3, Lcom/kubi/spot/quote/market/trade/s;

    .line 604
    .line 605
    .line 606
    invoke-direct {v3}, Lcom/kubi/spot/quote/market/trade/s;-><init>()V

    .line 607
    .line 608
    new-instance v5, Lcom/kubi/spot/quote/market/trade/t;

    .line 609
    .line 610
    .line 611
    invoke-direct {v5, v3}, Lcom/kubi/spot/quote/market/trade/t;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v4, v5}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 615
    move-result-object v2

    .line 616
    .line 617
    .line 618
    invoke-virtual {v1, v2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 619
    return-void
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
.end method

.method public final y3()Lt20/m0;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->d0:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lt20/m0;

    .line 14
    return-object v0
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
.end method

.method public final z3()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/quote/market/trade/MarketOrderBookFragment;->V:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;

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
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method
