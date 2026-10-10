.class public final Lcom/kubi/home/common/a;
.super Ljava/lang/Object;
.source "HomeCardsRegistry.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/home/common/HomeCardsRegistry;",
        "",
        "<init>",
        "()V",
        "registry",
        "Ljava/util/HashMap;",
        "",
        "Lcom/kubi/kucoin/home/cards/ClassMapping;",
        "Lkotlin/collections/HashMap;",
        "getRegistry",
        "()Ljava/util/HashMap;",
        "HomeLib_googleRelease"
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
.field public static final a:Lcom/kubi/home/common/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/kubi/kucoin/home/cards/h;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/home/common/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/home/common/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/home/common/a;->a:Lcom/kubi/home/common/a;

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/kucoin/home/cards/h;

    .line 10
    .line 11
    const/16 v6, 0x8

    .line 12
    const/4 v7, 0x0

    .line 13
    .line 14
    const-class v2, Lcom/kubi/home/setting/SettingCardViewHolder;

    .line 15
    .line 16
    const-class v3, Lcom/kubi/home/setting/SettingCard;

    .line 17
    .line 18
    const-class v4, Lcom/kubi/home/setting/SettingCardData;

    .line 19
    const/4 v5, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v1 .. v7}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    const-string v0, "SETTING"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    new-instance v3, Lcom/kubi/kucoin/home/cards/h;

    .line 31
    .line 32
    const/16 v8, 0x8

    .line 33
    const/4 v9, 0x0

    .line 34
    .line 35
    const-class v4, Lcom/kubi/home/empty/EmptyCardViewHolder;

    .line 36
    .line 37
    const-class v5, Lcom/kubi/home/empty/EmptyCard;

    .line 38
    .line 39
    const-class v6, Lcom/kubi/home/empty/EmptyCardData;

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v3 .. v9}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    const-string v0, "EMPTY"

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    new-instance v4, Lcom/kubi/kucoin/home/cards/h;

    .line 51
    .line 52
    const/16 v9, 0x8

    .line 53
    const/4 v10, 0x0

    .line 54
    .line 55
    const-class v5, Lcom/kubi/home/search/SearchCardViewHolder;

    .line 56
    .line 57
    const-class v6, Lcom/kubi/home/search/SearchCard;

    .line 58
    .line 59
    const-class v7, Lcom/kubi/home/search/SearchCardData;

    .line 60
    const/4 v8, 0x0

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v4 .. v10}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    const-string v0, "SEARCH"

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    new-instance v5, Lcom/kubi/kucoin/home/cards/h;

    .line 72
    .line 73
    const/16 v10, 0x8

    .line 74
    const/4 v11, 0x0

    .line 75
    .line 76
    const-class v6, Lcom/kubi/home/banner/BannerCardViewHolder;

    .line 77
    .line 78
    const-class v7, Lcom/kubi/home/banner/BannerCard;

    .line 79
    .line 80
    const-class v8, Lcom/kubi/home/banner/BannerData;

    .line 81
    const/4 v9, 0x0

    .line 82
    .line 83
    .line 84
    invoke-direct/range {v5 .. v11}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 85
    .line 86
    const-string v0, "BANNER"

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 90
    move-result-object v5

    .line 91
    .line 92
    new-instance v6, Lcom/kubi/kucoin/home/cards/h;

    .line 93
    .line 94
    const/16 v11, 0x8

    .line 95
    const/4 v12, 0x0

    .line 96
    .line 97
    const-class v7, Lcom/kubi/home/trade/TradeCardViewHolder;

    .line 98
    .line 99
    const-class v8, Lcom/kubi/home/trade/TradeCard;

    .line 100
    .line 101
    const-class v9, Lcom/kubi/home/trade/TradeData;

    .line 102
    const/4 v10, 0x0

    .line 103
    .line 104
    .line 105
    invoke-direct/range {v6 .. v12}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 106
    .line 107
    const-string v0, "HOT_SYMBOL"

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 111
    move-result-object v6

    .line 112
    .line 113
    new-instance v7, Lcom/kubi/kucoin/home/cards/h;

    .line 114
    .line 115
    const/16 v12, 0x8

    .line 116
    const/4 v13, 0x0

    .line 117
    .line 118
    const-class v8, Lcom/kubi/home/mood/MoodCardViewHolder;

    .line 119
    .line 120
    const-class v9, Lcom/kubi/home/mood/MoodCard;

    .line 121
    .line 122
    const-class v10, Lcom/kubi/home/mood/MoodCardData;

    .line 123
    const/4 v11, 0x0

    .line 124
    .line 125
    .line 126
    invoke-direct/range {v7 .. v13}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 127
    .line 128
    const-string v0, "MARKETING_EMOTION"

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 132
    move-result-object v7

    .line 133
    .line 134
    new-instance v8, Lcom/kubi/kucoin/home/cards/h;

    .line 135
    .line 136
    const/16 v13, 0x8

    .line 137
    const/4 v14, 0x0

    .line 138
    .line 139
    const-class v9, Lcom/kubi/home/news/NewsCardViewHolder;

    .line 140
    .line 141
    const-class v10, Lcom/kubi/home/news/NewsCard;

    .line 142
    .line 143
    const-class v11, Lcom/kubi/home/news/NewsData;

    .line 144
    const/4 v12, 0x0

    .line 145
    .line 146
    .line 147
    invoke-direct/range {v8 .. v14}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 148
    .line 149
    const-string v0, "NEWS"

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 153
    move-result-object v8

    .line 154
    .line 155
    new-instance v9, Lcom/kubi/kucoin/home/cards/h;

    .line 156
    .line 157
    const/16 v14, 0x8

    .line 158
    const/4 v15, 0x0

    .line 159
    .line 160
    const-class v10, Lcom/kubi/home/shortcut/ShortcutCardViewHolder;

    .line 161
    .line 162
    const-class v11, Lcom/kubi/home/shortcut/ShortcutCard;

    .line 163
    .line 164
    const-class v12, Lcom/kubi/home/shortcut/ShortcutData;

    .line 165
    const/4 v13, 0x0

    .line 166
    .line 167
    .line 168
    invoke-direct/range {v9 .. v15}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 169
    .line 170
    const-string v0, "MENU"

    .line 171
    .line 172
    .line 173
    invoke-static {v0, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 174
    move-result-object v9

    .line 175
    .line 176
    new-instance v10, Lcom/kubi/kucoin/home/cards/h;

    .line 177
    .line 178
    const/16 v15, 0x8

    .line 179
    .line 180
    const/16 v16, 0x0

    .line 181
    .line 182
    const-class v11, Lcom/kubi/home/newcoin/NewCoinCardViewHolder;

    .line 183
    .line 184
    const-class v12, Lcom/kubi/home/newcoin/NewCoinCard;

    .line 185
    .line 186
    const-class v13, Lcom/kubi/home/newcoin/NewCoinData;

    .line 187
    const/4 v14, 0x0

    .line 188
    .line 189
    .line 190
    invoke-direct/range {v10 .. v16}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 191
    .line 192
    const-string v0, "CURRENCY_RECOMMEND"

    .line 193
    .line 194
    .line 195
    invoke-static {v0, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 196
    move-result-object v10

    .line 197
    .line 198
    new-instance v11, Lcom/kubi/kucoin/home/cards/h;

    .line 199
    .line 200
    const/16 v16, 0x8

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const-class v12, Lcom/kubi/home/rank/RankCardViewHolder;

    .line 205
    .line 206
    const-class v13, Lcom/kubi/home/rank/RankCard;

    .line 207
    .line 208
    const-class v14, Lcom/kubi/home/rank/RankData;

    .line 209
    const/4 v15, 0x0

    .line 210
    .line 211
    .line 212
    invoke-direct/range {v11 .. v17}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 213
    .line 214
    const-string v0, "RANKING_LIST"

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 218
    move-result-object v11

    .line 219
    .line 220
    new-instance v12, Lcom/kubi/kucoin/home/cards/h;

    .line 221
    .line 222
    const/16 v17, 0x8

    .line 223
    .line 224
    const/16 v18, 0x0

    .line 225
    .line 226
    const-class v13, Lcom/kubi/home/gembox/GemboxCardViewHolder;

    .line 227
    .line 228
    const-class v14, Lcom/kubi/home/gembox/GemboxCard;

    .line 229
    .line 230
    const-class v15, Lcom/kubi/home/gembox/GemboxCardData;

    .line 231
    .line 232
    const/16 v16, 0x0

    .line 233
    .line 234
    .line 235
    invoke-direct/range {v12 .. v18}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 236
    .line 237
    const-string v0, "GEM_BOX"

    .line 238
    .line 239
    .line 240
    invoke-static {v0, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 241
    move-result-object v12

    .line 242
    .line 243
    new-instance v13, Lcom/kubi/kucoin/home/cards/h;

    .line 244
    .line 245
    const/16 v18, 0x8

    .line 246
    .line 247
    const/16 v19, 0x0

    .line 248
    .line 249
    const-class v14, Lcom/kubi/home/buycrypto/BuyCryptoViewHolder;

    .line 250
    .line 251
    const-class v15, Lcom/kubi/home/buycrypto/BuyCryptoCard;

    .line 252
    .line 253
    const-class v16, Lcom/kubi/home/buycrypto/BuyCryptoCardData;

    .line 254
    .line 255
    const/16 v17, 0x0

    .line 256
    .line 257
    .line 258
    invoke-direct/range {v13 .. v19}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 259
    .line 260
    const-string v0, "BUY_CRYPTO"

    .line 261
    .line 262
    .line 263
    invoke-static {v0, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 264
    move-result-object v13

    .line 265
    .line 266
    new-instance v14, Lcom/kubi/kucoin/home/cards/h;

    .line 267
    .line 268
    const/16 v19, 0x8

    .line 269
    .line 270
    const/16 v20, 0x0

    .line 271
    .line 272
    const-class v15, Lcom/kubi/home/recommend/FunctionCardViewHolder;

    .line 273
    .line 274
    const-class v16, Lcom/kubi/home/recommend/FunctionCard;

    .line 275
    .line 276
    const-class v17, Lcom/kubi/home/recommend/FunctionCardData;

    .line 277
    .line 278
    const/16 v18, 0x0

    .line 279
    .line 280
    .line 281
    invoke-direct/range {v14 .. v20}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 282
    .line 283
    const-string v0, "RECOMMENDED_POSITION"

    .line 284
    .line 285
    .line 286
    invoke-static {v0, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 287
    move-result-object v14

    .line 288
    .line 289
    new-instance v15, Lcom/kubi/kucoin/home/cards/h;

    .line 290
    .line 291
    const/16 v20, 0x8

    .line 292
    .line 293
    const/16 v21, 0x0

    .line 294
    .line 295
    const-class v16, Lcom/kubi/home/recommend/FunctionCardLongViewHolder;

    .line 296
    .line 297
    const-class v17, Lcom/kubi/home/recommend/FunctionCardLong;

    .line 298
    .line 299
    const-class v18, Lcom/kubi/home/recommend/FunctionCardData;

    .line 300
    .line 301
    const/16 v19, 0x0

    .line 302
    .line 303
    .line 304
    invoke-direct/range {v15 .. v21}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 305
    .line 306
    const-string v0, "RECOMMENDED_POSITION_LONG"

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 310
    move-result-object v15

    .line 311
    .line 312
    new-instance v16, Lcom/kubi/kucoin/home/cards/h;

    .line 313
    .line 314
    const/16 v21, 0x8

    .line 315
    .line 316
    const/16 v22, 0x0

    .line 317
    .line 318
    const-class v17, Lcom/kubi/home/recommend/FunctionCardPrimaryViewHolder;

    .line 319
    .line 320
    const-class v18, Lcom/kubi/home/recommend/FunctionCardPrimary;

    .line 321
    .line 322
    const-class v19, Lcom/kubi/home/recommend/FunctionCardData;

    .line 323
    .line 324
    const/16 v20, 0x0

    .line 325
    .line 326
    .line 327
    invoke-direct/range {v16 .. v22}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 328
    .line 329
    move-object/from16 v0, v16

    .line 330
    .line 331
    const-string v1, "RECOMMENDED_POSITION_PRIMARY"

    .line 332
    .line 333
    .line 334
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 335
    move-result-object v16

    .line 336
    .line 337
    new-instance v0, Lcom/kubi/kucoin/home/cards/h;

    .line 338
    .line 339
    new-instance v1, Lcom/kubi/home/message/MessageBoxCardInterceptor;

    .line 340
    .line 341
    .line 342
    invoke-direct {v1}, Lcom/kubi/home/message/MessageBoxCardInterceptor;-><init>()V

    .line 343
    .line 344
    move-object/from16 v17, v2

    .line 345
    .line 346
    const-class v2, Lcom/kubi/home/message/MessageBoxCardViewHolder;

    .line 347
    .line 348
    move-object/from16 v18, v3

    .line 349
    .line 350
    const-class v3, Lcom/kubi/home/message/card/MessageBoxCard;

    .line 351
    .line 352
    move-object/from16 v19, v4

    .line 353
    .line 354
    const-class v4, Lcom/kubi/home/message/card/MessageBoxData;

    .line 355
    .line 356
    .line 357
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/kubi/kucoin/home/cards/h;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/g;)V

    .line 358
    .line 359
    const-string v1, "MESSAGE_BOX"

    .line 360
    .line 361
    .line 362
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 363
    move-result-object v0

    .line 364
    .line 365
    sget-object v1, Lcom/kubi/operation/api/IOperationService;->a:Lcom/kubi/operation/api/IOperationService$Companion;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1}, Lcom/kubi/operation/api/IOperationService$Companion;->get()Lcom/kubi/operation/api/IOperationService;

    .line 369
    move-result-object v2

    .line 370
    .line 371
    .line 372
    invoke-interface {v2}, Lcom/kubi/operation/api/IOperationService;->l()Lcom/kubi/kucoin/home/cards/h;

    .line 373
    move-result-object v2

    .line 374
    .line 375
    const-string v3, "BREAKING_NEWS"

    .line 376
    .line 377
    .line 378
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 379
    move-result-object v2

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1}, Lcom/kubi/operation/api/IOperationService$Companion;->get()Lcom/kubi/operation/api/IOperationService;

    .line 383
    move-result-object v3

    .line 384
    .line 385
    .line 386
    invoke-interface {v3}, Lcom/kubi/operation/api/IOperationService;->i()Lcom/kubi/kucoin/home/cards/h;

    .line 387
    move-result-object v3

    .line 388
    .line 389
    const-string v4, "WELFARE"

    .line 390
    .line 391
    .line 392
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 393
    move-result-object v3

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1}, Lcom/kubi/operation/api/IOperationService$Companion;->get()Lcom/kubi/operation/api/IOperationService;

    .line 397
    move-result-object v4

    .line 398
    .line 399
    .line 400
    invoke-interface {v4}, Lcom/kubi/operation/api/IOperationService;->e()Lcom/kubi/kucoin/home/cards/h;

    .line 401
    move-result-object v4

    .line 402
    .line 403
    move-object/from16 v20, v0

    .line 404
    .line 405
    const-string v0, "NO_LOGINED_WELFARE"

    .line 406
    .line 407
    .line 408
    invoke-static {v0, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 409
    move-result-object v0

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1}, Lcom/kubi/operation/api/IOperationService$Companion;->get()Lcom/kubi/operation/api/IOperationService;

    .line 413
    move-result-object v1

    .line 414
    .line 415
    .line 416
    invoke-interface {v1}, Lcom/kubi/operation/api/IOperationService;->c()Lcom/kubi/kucoin/home/cards/h;

    .line 417
    move-result-object v1

    .line 418
    .line 419
    const-string v4, "NO_LOGINED_CURRENCY"

    .line 420
    .line 421
    .line 422
    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 423
    move-result-object v21

    .line 424
    .line 425
    move-object/from16 v4, v19

    .line 426
    .line 427
    move-object/from16 v19, v3

    .line 428
    .line 429
    move-object/from16 v3, v18

    .line 430
    .line 431
    move-object/from16 v18, v2

    .line 432
    .line 433
    move-object/from16 v2, v17

    .line 434
    .line 435
    move-object/from16 v17, v20

    .line 436
    .line 437
    move-object/from16 v20, v0

    .line 438
    .line 439
    .line 440
    filled-new-array/range {v2 .. v21}, [Lkotlin/Pair;

    .line 441
    move-result-object v0

    .line 442
    .line 443
    .line 444
    invoke-static {v0}, Lkotlin/collections/MapsKt;->hashMapOf([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 445
    move-result-object v0

    .line 446
    .line 447
    sput-object v0, Lcom/kubi/home/common/a;->b:Ljava/util/HashMap;

    .line 448
    return-void
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
.end method


# virtual methods
.method public final a()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/kubi/kucoin/home/cards/h;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/common/a;->b:Ljava/util/HashMap;

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
.end method
