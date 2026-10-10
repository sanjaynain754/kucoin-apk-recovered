.class public final Luk/d;
.super Ljava/lang/Object;
.source "TpSlCalculator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J=\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJC\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J=\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J=\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "Luk/d;",
        "",
        "<init>",
        "()V",
        "",
        "isInverse",
        "Lrk/b;",
        "multiplier",
        "qty",
        "openPrice",
        "posInit",
        "a",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "isBuy",
        "leverage",
        "pnlRate",
        "maxPrice",
        "c",
        "(ZZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "pnlPrice",
        "d",
        "(ZZLrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "closePrice",
        "closeQty",
        "b",
        "shared_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTpSlCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TpSlCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/TpSlCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,150:1\n52#2:151\n52#2:152\n52#2:153\n30#2,4:154\n18#2:158\n30#2,4:159\n30#2,4:163\n38#2,2:167\n55#2,2:169\n41#2:171\n52#2:172\n52#2:173\n30#2,4:174\n52#2:178\n30#2,4:179\n30#2,4:183\n52#2:187\n52#2:188\n52#2:189\n18#2:190\n30#2,4:191\n52#2:195\n52#2:196\n52#2:197\n18#2:198\n*S KotlinDebug\n*F\n+ 1 TpSlCalculator.kt\ncom/kubi/kmm/trade/futures/isolated/TpSlCalculator\n*L\n38#1:151\n39#1:152\n40#1:153\n42#1:154,4\n42#1:158\n43#1:159,4\n45#1:163,4\n46#1:167,2\n46#1:169,2\n46#1:171\n71#1:172\n72#1:173\n75#1:174,4\n76#1:178\n79#1:179,4\n82#1:183,4\n107#1:187\n108#1:188\n109#1:189\n112#1:190\n115#1:191,4\n140#1:195\n141#1:196\n142#1:197\n144#1:198\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Luk/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Luk/d;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Luk/d;-><init>()V

    .line 6
    .line 7
    sput-object v0, Luk/d;->a:Luk/d;

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
.end method


# virtual methods
.method public final a(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "0"

    .line 3
    .line 4
    const-string v1, "multiplier"

    .line 5
    .line 6
    .line 7
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 11
    .line 12
    if-eqz p3, :cond_5

    .line 13
    .line 14
    new-instance v2, Lrk/b;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, v2}, Lrk/b;->b(Lrk/b;)I

    .line 21
    move-result v2

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    if-eqz p5, :cond_5

    .line 28
    .line 29
    new-instance v2, Lrk/b;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p5, v2}, Lrk/b;->b(Lrk/b;)I

    .line 36
    move-result v2

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    goto :goto_2

    .line 40
    .line 41
    :cond_1
    if-eqz p4, :cond_5

    .line 42
    .line 43
    new-instance v2, Lrk/b;

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p4, v2}, Lrk/b;->b(Lrk/b;)I

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    goto :goto_2

    .line 54
    .line 55
    :cond_2
    const/16 v0, 0x14

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p5, p1, v0, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    new-instance p3, Lrk/b;

    .line 70
    .line 71
    const-string p5, "1"

    .line 72
    .line 73
    .line 74
    invoke-direct {p3, p5}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    const/16 p5, 0xa

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p1, p5, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p4, v0, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 84
    move-result-object p1

    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    goto :goto_3

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {p4, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p5, v0, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    :goto_0
    sget-object p2, Lrk/a;->a:Lrk/a;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Lrk/a;->b()Lrk/b;

    .line 107
    move-result-object p2

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 111
    move-result p2

    .line 112
    .line 113
    if-ltz p2, :cond_4

    .line 114
    goto :goto_1

    .line 115
    .line 116
    :cond_4
    new-instance p2, Lrk/b;

    .line 117
    .line 118
    const-string p3, "-1"

    .line 119
    .line 120
    .line 121
    invoke-direct {p2, p3}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    :goto_1
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->DOWN:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 128
    const/4 p3, 0x2

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p3, p2}, Lrk/b;->f(ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    .line 135
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    goto :goto_4

    .line 138
    :cond_5
    :goto_2
    return-object v1

    .line 139
    .line 140
    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 141
    .line 142
    .line 143
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    .line 147
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    .line 151
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 152
    move-result p2

    .line 153
    .line 154
    if-eqz p2, :cond_6

    .line 155
    goto :goto_5

    .line 156
    :cond_6
    move-object v1, p1

    .line 157
    .line 158
    :goto_5
    check-cast v1, Lrk/b;

    .line 159
    return-object v1
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
.end method

.method public final b(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 4
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "1"

    .line 3
    .line 4
    const-string v1, "0"

    .line 5
    .line 6
    const-string v2, "multiplier"

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 13
    .line 14
    if-eqz p4, :cond_4

    .line 15
    .line 16
    new-instance v3, Lrk/b;

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p4, v3}, Lrk/b;->b(Lrk/b;)I

    .line 23
    move-result v3

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    if-eqz p5, :cond_4

    .line 29
    .line 30
    new-instance v3, Lrk/b;

    .line 31
    .line 32
    .line 33
    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p5, v3}, Lrk/b;->b(Lrk/b;)I

    .line 37
    move-result v3

    .line 38
    .line 39
    if-nez v3, :cond_1

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_1
    if-eqz p3, :cond_4

    .line 43
    .line 44
    new-instance v3, Lrk/b;

    .line 45
    .line 46
    .line 47
    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, v3}, Lrk/b;->b(Lrk/b;)I

    .line 51
    move-result v1

    .line 52
    .line 53
    if-nez v1, :cond_2

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_2
    if-eqz p1, :cond_3

    .line 57
    .line 58
    new-instance p1, Lrk/b;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    sget-object v1, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 64
    .line 65
    const/16 v3, 0xa

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p4, v3, v1}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    new-instance p4, Lrk/b;

    .line 72
    .line 73
    .line 74
    invoke-direct {p4, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p4, p3, v3, v1}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 78
    move-result-object p3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    .line 82
    move-result-object p1

    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    goto :goto_2

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {p4, p3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-virtual {p5, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 93
    move-result-object p2

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    goto :goto_3

    .line 103
    :cond_4
    :goto_1
    return-object v2

    .line 104
    .line 105
    :goto_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object p1

    .line 114
    .line 115
    .line 116
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 117
    move-result p2

    .line 118
    .line 119
    if-eqz p2, :cond_5

    .line 120
    goto :goto_4

    .line 121
    :cond_5
    move-object v2, p1

    .line 122
    .line 123
    :goto_4
    check-cast v2, Lrk/b;

    .line 124
    return-object v2
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
.end method

.method public final c(ZZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "0"

    .line 3
    .line 4
    const-string v1, "pnlRate"

    .line 5
    .line 6
    .line 7
    invoke-static {p5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "maxPrice"

    .line 10
    .line 11
    .line 12
    invoke-static {p6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 16
    .line 17
    if-eqz p4, :cond_4

    .line 18
    .line 19
    new-instance v2, Lrk/b;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4, v2}, Lrk/b;->b(Lrk/b;)I

    .line 26
    move-result v2

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    goto :goto_1

    .line 30
    .line 31
    :cond_0
    if-eqz p3, :cond_4

    .line 32
    .line 33
    new-instance v2, Lrk/b;

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3, v2}, Lrk/b;->b(Lrk/b;)I

    .line 40
    move-result v2

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_1
    sget-object v2, Luk/a;->a:Luk/a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p2, p1}, Luk/a;->b(ZZ)Lrk/b;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    .line 52
    invoke-virtual {p5, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    const/16 p5, 0x14

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    new-instance p1, Lrk/b;

    .line 60
    .line 61
    const-string v2, "1"

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    sget-object v2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p4, p5, v2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    new-instance p2, Lrk/b;

    .line 77
    .line 78
    .line 79
    invoke-direct {p2, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 83
    move-result p2

    .line 84
    .line 85
    if-nez p2, :cond_2

    .line 86
    goto :goto_0

    .line 87
    .line 88
    .line 89
    :cond_2
    invoke-virtual {p3, p1, p5, v2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 90
    move-result-object p6

    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    goto :goto_2

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-virtual {p3, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p4, p5, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 107
    move-result-object p6

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-static {p6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    goto :goto_3

    .line 113
    :cond_4
    :goto_1
    return-object v1

    .line 114
    .line 115
    :goto_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 127
    move-result p2

    .line 128
    .line 129
    if-eqz p2, :cond_5

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    move-object v1, p1

    .line 132
    .line 133
    :goto_4
    check-cast v1, Lrk/b;

    .line 134
    return-object v1
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
.end method

.method public final d(ZZLrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 4
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "1"

    .line 3
    .line 4
    const-string v1, "0"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 8
    .line 9
    if-eqz p4, :cond_4

    .line 10
    .line 11
    new-instance v3, Lrk/b;

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p4, v3}, Lrk/b;->b(Lrk/b;)I

    .line 18
    move-result v3

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    if-eqz p3, :cond_4

    .line 24
    .line 25
    new-instance v3, Lrk/b;

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, v3}, Lrk/b;->b(Lrk/b;)I

    .line 32
    move-result v3

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_1
    if-eqz p5, :cond_4

    .line 38
    .line 39
    new-instance v3, Lrk/b;

    .line 40
    .line 41
    .line 42
    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p5, v3}, Lrk/b;->b(Lrk/b;)I

    .line 46
    move-result v1

    .line 47
    .line 48
    if-nez v1, :cond_2

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_2
    sget-object v1, Luk/a;->a:Luk/a;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p2, p1}, Luk/a;->b(ZZ)Lrk/b;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p4, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    new-instance p1, Lrk/b;

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    sget-object p4, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 69
    .line 70
    const/16 v1, 0xa

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p5, v1, p4}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    new-instance p5, Lrk/b;

    .line 77
    .line 78
    .line 79
    invoke-direct {p5, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p5, p3, v1, p4}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 83
    move-result-object p4

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p4}, Lrk/b;->g(Lrk/b;)Lrk/b;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 95
    move-result-object p1

    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    goto :goto_2

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-virtual {p5, p3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    sget-object p2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 109
    .line 110
    const/16 p4, 0x14

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p3, p4, p2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    :goto_0
    new-instance p2, Lrk/b;

    .line 117
    .line 118
    const-string p3, "100"

    .line 119
    .line 120
    .line 121
    invoke-direct {p2, p3}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    goto :goto_3

    .line 131
    :cond_4
    :goto_1
    return-object v2

    .line 132
    .line 133
    :goto_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    .line 144
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 145
    move-result p2

    .line 146
    .line 147
    if-eqz p2, :cond_5

    .line 148
    goto :goto_4

    .line 149
    :cond_5
    move-object v2, p1

    .line 150
    .line 151
    :goto_4
    check-cast v2, Lrk/b;

    .line 152
    return-object v2
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
.end method
