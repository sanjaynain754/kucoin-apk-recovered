.class public final Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "StrategyAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002J\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "entryType",
        "",
        "viewModel",
        "Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;",
        "strategies",
        "",
        "strategiesNames",
        "",
        "",
        "<init>",
        "(Ljava/lang/String;Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;Ljava/util/List;Ljava/util/Map;)V",
        "getEntryType",
        "()Ljava/lang/String;",
        "getViewModel",
        "()Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;",
        "getStrategiesNames",
        "()Ljava/util/Map;",
        "convert",
        "",
        "helper",
        "item",
        "bindStartFailed",
        "strategy",
        "bindEmpty",
        "TradingBotKitLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final i:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;",
            "Ljava/util/List<",
            "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "entryType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "viewModel"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "strategies"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "strategiesNames"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p3}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(Ljava/util/List;)V

    .line 24
    .line 25
    iput-object p1, p0, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->i:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->j:Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;

    .line 28
    .line 29
    iput-object p4, p0, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->k:Ljava/util/Map;

    .line 30
    .line 31
    new-instance p1, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter$a;

    .line 32
    .line 33
    .line 34
    invoke-direct {p1}, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter$a;-><init>()V

    .line 35
    const/4 p2, 0x3

    .line 36
    .line 37
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_grid:I

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 41
    .line 42
    const/16 p2, 0xc

    .line 43
    .line 44
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_grid_martin_gale:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 48
    .line 49
    const/16 p2, 0xd

    .line 50
    .line 51
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_grid_cta:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 55
    .line 56
    const/16 p2, 0x9

    .line 57
    .line 58
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_grid_win_two_way:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 62
    const/4 p2, 0x1

    .line 63
    .line 64
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_spot:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 68
    .line 69
    const/16 p2, 0x8

    .line 70
    .line 71
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_spot_ai:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 75
    const/4 p2, 0x5

    .line 76
    .line 77
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_spot_infinity_grid:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 81
    const/4 p2, 0x7

    .line 82
    .line 83
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_spot_martin_gale:I

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 87
    .line 88
    const/16 p2, 0xb

    .line 89
    .line 90
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_spot_cta:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 94
    const/4 p2, 0x2

    .line 95
    .line 96
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_spot_aip:I

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 100
    .line 101
    const/16 p2, 0xa

    .line 102
    .line 103
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_margin_grid:I

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 107
    const/4 p2, 0x4

    .line 108
    .line 109
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_spot_position:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 113
    const/4 p2, -0x1

    .line 114
    .line 115
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_start_failed:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 119
    .line 120
    const/16 p2, -0x63

    .line 121
    .line 122
    sget p3, Lcom/kubi/tradingbotkit/R$layout;->btrading_bot_kit_strategy_item_empty:I

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2, p3}, Lio/chad/library/adapter/base/util/MultiTypeDelegate;->registerItemType(II)Lio/chad/library/adapter/base/util/MultiTypeDelegate;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setMultiTypeDelegate(Lio/chad/library/adapter/base/util/MultiTypeDelegate;)V

    .line 129
    return-void
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
.end method

.method public static synthetic g(Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->i(Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;)Lkotlin/Unit;

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
.end method

.method public static final i(Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;)Lkotlin/Unit;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x6

    .line 3
    .line 4
    const-string v2, ""

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {v2, v3, v0, v1, v3}, Lk50/a;->c(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->i:Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "futures"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    const-string v1, "grid_type"

    .line 19
    .line 20
    const-string v2, "createbtn"

    .line 21
    .line 22
    const-string v3, "botTab"

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object v0, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Lcom/kubi/kumex/api/IKuMexService;->I()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iget-object p0, p0, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->j:Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;->B()I

    .line 40
    move-result p0

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    move-result-object p0

    .line 45
    .line 46
    .line 47
    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    .line 51
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 52
    move-result-object p0

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v3, v2, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_0
    sget-object v0, Lcom/kubi/spot/api/ISpotService;->a:Lcom/kubi/spot/api/ISpotService$Companion;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/kubi/spot/api/ISpotService$Companion;->get()Lcom/kubi/spot/api/ISpotService;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Lcom/kubi/spot/api/ISpotService;->j()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    iget-object p0, p0, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->j:Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;->B()I

    .line 72
    move-result p0

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 76
    move-result-object p0

    .line 77
    .line 78
    .line 79
    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 80
    move-result-object p0

    .line 81
    .line 82
    .line 83
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 84
    move-result-object p0

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v3, v2, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 88
    .line 89
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    return-object p0
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


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)V

    .line 6
    return-void
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
.end method

.method public final h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)V
    .locals 7
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "strategy"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget p2, Lcom/kubi/tradingbotkit/R$id;->createBtn:I

    .line 13
    .line 14
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sget v1, Lcom/kubi/tradingbotkit/R$string;->HoldingPage_Bot_CreateButton:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    const-string p1, "getView(...)"

    .line 34
    .line 35
    .line 36
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    new-instance v4, Lcom/kubi/tradingbotkit/business/strategyList/a;

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, p0}, Lcom/kubi/tradingbotkit/business/strategyList/a;-><init>(Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;)V

    .line 42
    const/4 v5, 0x1

    .line 43
    const/4 v6, 0x0

    .line 44
    .line 45
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 49
    return-void
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
.end method

.method public final j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)V
    .locals 13
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "strategy"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->k:Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p2}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getType()Ljava/lang/Integer;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    const-string v2, "getView(...)"

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x1

    .line 40
    const/4 v5, 0x0

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    goto :goto_1

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 47
    move-result v1

    .line 48
    const/4 v6, 0x4

    .line 49
    .line 50
    if-ne v1, v6, :cond_3

    .line 51
    .line 52
    sget v1, Lcom/kubi/tradingbotkit/R$id;->tagFlow:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 56
    .line 57
    sget v1, Lcom/kubi/tradingbotkit/R$id;->tokensLl:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 61
    .line 62
    sget v1, Lcom/kubi/tradingbotkit/R$id;->symbolTv:I

    .line 63
    .line 64
    iget-object v4, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    move-result-object v4

    .line 69
    .line 70
    sget v5, Lcom/kubi/tradingbotkit/R$string;->kc_tb_spot_positions:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 74
    move-result-object v4

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 78
    .line 79
    sget v1, Lcom/kubi/tradingbotkit/R$id;->strategyNameTv:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 83
    .line 84
    sget v1, Lcom/kubi/tradingbotkit/R$id;->failedSymbolsTv:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getCurrencyInfo()Ljava/util/List;

    .line 88
    move-result-object v4

    .line 89
    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    const/16 v11, 0x3e

    .line 93
    const/4 v12, 0x0

    .line 94
    .line 95
    const-string v5, ","

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v9, 0x0

    .line 100
    const/4 v10, 0x0

    .line 101
    .line 102
    .line 103
    invoke-static/range {v4 .. v12}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 104
    move-result-object v3

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 108
    goto :goto_2

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_1
    invoke-static {p2}, Lcom/kubi/tradingbotkit/business/strategyList/b;->a(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Z

    .line 112
    move-result v1

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    sget v1, Lcom/kubi/tradingbotkit/R$id;->symbolTv:I

    .line 117
    .line 118
    sget-object v6, Lcom/kubi/tradingbotkit/service/b;->a:Lcom/kubi/tradingbotkit/service/b;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6}, Lcom/kubi/tradingbotkit/service/b;->c()Lcom/kubi/kumex/api/IKuMexService;

    .line 122
    move-result-object v6

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;->getSymbolCode()Ljava/lang/String;

    .line 126
    move-result-object v7

    .line 127
    .line 128
    .line 129
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    move-result-object v7

    .line 131
    const/4 v8, 0x2

    .line 132
    .line 133
    .line 134
    invoke-static {v6, v7, v5, v8, v3}, Lcom/kubi/kumex/api/IKuMexService;->T(Lcom/kubi/kumex/api/IKuMexService;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/utils/v0;

    .line 135
    move-result-object v3

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 143
    .line 144
    sget v1, Lcom/kubi/tradingbotkit/R$id;->tagFlow:I

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 148
    .line 149
    sget v1, Lcom/kubi/tradingbotkit/R$id;->tokensLl:I

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v1, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 153
    .line 154
    sget v1, Lcom/kubi/tradingbotkit/R$id;->sideTv:I

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    .line 161
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    check-cast v1, Lcom/kubi/resources/widget/BaseTextView;

    .line 164
    .line 165
    .line 166
    invoke-static {p2, v1}, Lj50/f;->e(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lcom/kubi/resources/widget/BaseTextView;)V

    .line 167
    .line 168
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 169
    goto :goto_2

    .line 170
    .line 171
    :cond_4
    sget v1, Lcom/kubi/tradingbotkit/R$id;->symbolTv:I

    .line 172
    .line 173
    sget-object v6, Lgf/n;->a:Lgf/n;

    .line 174
    .line 175
    .line 176
    invoke-static {p2}, Lj50/a0;->n(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)Ljava/lang/String;

    .line 177
    move-result-object p2

    .line 178
    .line 179
    .line 180
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object p2

    .line 182
    .line 183
    .line 184
    invoke-virtual {v6, p2}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 185
    move-result-object p2

    .line 186
    .line 187
    if-eqz p2, :cond_5

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 191
    move-result-object v3

    .line 192
    .line 193
    .line 194
    :cond_5
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    move-result-object p2

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 199
    .line 200
    sget p2, Lcom/kubi/tradingbotkit/R$id;->tagFlow:I

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, p2, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 204
    .line 205
    sget p2, Lcom/kubi/tradingbotkit/R$id;->tokensLl:I

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, p2, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 209
    .line 210
    :goto_2
    sget p2, Lcom/kubi/tradingbotkit/R$id;->strategyNameTv:I

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 214
    .line 215
    sget p2, Lcom/kubi/tradingbotkit/R$id;->detailTv:I

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    .line 222
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-static {p1}, Lj50/b1;->H(Landroid/view/View;)V

    .line 226
    return-void
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
.end method

.method public k(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)V
    .locals 2
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "item"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 14
    move-result v0

    .line 15
    .line 16
    const/16 v1, -0x63

    .line 17
    .line 18
    if-eq v0, v1, :cond_6

    .line 19
    const/4 v1, -0x1

    .line 20
    .line 21
    if-eq v0, v1, :cond_5

    .line 22
    const/4 v1, 0x1

    .line 23
    .line 24
    if-eq v0, v1, :cond_4

    .line 25
    const/4 v1, 0x2

    .line 26
    .line 27
    if-eq v0, v1, :cond_3

    .line 28
    const/4 v1, 0x3

    .line 29
    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    const/4 v1, 0x4

    .line 32
    .line 33
    if-eq v0, v1, :cond_1

    .line 34
    const/4 v1, 0x5

    .line 35
    .line 36
    if-eq v0, v1, :cond_0

    .line 37
    .line 38
    .line 39
    packed-switch v0, :pswitch_data_0

    .line 40
    return-void

    .line 41
    .line 42
    .line 43
    :pswitch_0
    invoke-static {p2, p1}, Lj50/c;->c(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :pswitch_1
    invoke-static {p2, p1}, Lj50/k;->e(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 48
    return-void

    .line 49
    .line 50
    .line 51
    :pswitch_2
    invoke-static {p2, p1}, Lj50/u;->a(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 52
    return-void

    .line 53
    .line 54
    .line 55
    :pswitch_3
    invoke-static {p2, p1}, Lj50/q;->c(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 56
    return-void

    .line 57
    .line 58
    .line 59
    :pswitch_4
    invoke-static {p2, p1}, Lj50/n;->c(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 60
    return-void

    .line 61
    .line 62
    .line 63
    :pswitch_5
    invoke-static {p2, p1}, Lj50/s;->b(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 64
    return-void

    .line 65
    .line 66
    .line 67
    :pswitch_6
    invoke-static {p2, p1}, Lj50/h0;->e(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 68
    return-void

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-static {p2, p1}, Lj50/c0;->b(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 72
    return-void

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-static {p2, p1}, Lj50/k0;->f(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 76
    return-void

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-static {p2, p1}, Lj50/f;->d(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 80
    return-void

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-static {p2, p1}, Lj50/t;->a(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 84
    return-void

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-static {p2, p1}, Lj50/a0;->l(Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 88
    return-void

    .line 89
    .line 90
    .line 91
    :cond_5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->j(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)V

    .line 92
    return-void

    .line 93
    .line 94
    .line 95
    :cond_6
    invoke-virtual {p0, p1, p2}, Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;)V

    .line 96
    return-void

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
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
