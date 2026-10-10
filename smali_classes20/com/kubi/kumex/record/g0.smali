.class public final Lcom/kubi/kumex/record/g0;
.super Lcom/kubi/kumex/record/a;
.source "RecordObjects.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\"\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00172\u0008\u0008\u0003\u0010\u001c\u001a\u00020\t2\u0008\u0008\u0003\u0010\u001d\u001a\u00020\tJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\tH\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/kubi/kumex/record/ProfitBrieflyObject;",
        "Lcom/kubi/kumex/record/BaseProfitRecordObject;",
        "record1",
        "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;",
        "<init>",
        "(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V",
        "getRecord1",
        "()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;",
        "totalSettleColor",
        "",
        "getTotalSettleColor",
        "()I",
        "symbolCurrencyText",
        "Lcom/kubi/utils/StyledText;",
        "getSymbolCurrencyText",
        "()Lcom/kubi/utils/StyledText;",
        "totalRealisedPnlText",
        "",
        "getTotalRealisedPnlText",
        "()Ljava/lang/CharSequence;",
        "totalRealisedPnlRate",
        "getTotalRealisedPnlRate",
        "closePnl",
        "Ljava/math/BigDecimal;",
        "getClosePnl",
        "()Ljava/math/BigDecimal;",
        "getSettleText",
        "number",
        "numColor",
        "currencyColor",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "KumexLib_googleRelease"
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
        "SMAP\nRecordObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitBrieflyObject\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,1120:1\n24#2:1121\n16#2:1122\n*S KotlinDebug\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitBrieflyObject\n*L\n450#1:1121\n450#1:1122\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field public final h:Lcom/kubi/utils/v0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Ljava/lang/CharSequence;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/kubi/utils/v0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final k:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V
    .locals 13
    .param p1    # Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "record1"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/kubi/kumex/record/a;-><init>(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/kumex/record/g0;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRealisedPnl()Ljava/math/BigDecimal;

    .line 18
    move-result-object p1

    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x1

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0, v1, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 28
    move-result-wide v2

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmpl-double p1, v2, v4

    .line 33
    .line 34
    const-string v2, "getTopActivityOrApp(...)"

    .line 35
    .line 36
    if-lez p1, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/kubi/router/utils/b;->c()Landroid/content/Context;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    .line 47
    move-result p1

    .line 48
    goto :goto_0

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRealisedPnl()Ljava/math/BigDecimal;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v0, v1, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 64
    move-result-wide v6

    .line 65
    .line 66
    cmpg-double p1, v6, v4

    .line 67
    .line 68
    if-gez p1, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lcom/kubi/router/utils/b;->c()Landroid/content/Context;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Lcom/kubi/resources/g;->n(Landroid/content/Context;)I

    .line 79
    move-result p1

    .line 80
    goto :goto_0

    .line 81
    .line 82
    :cond_1
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 83
    .line 84
    sget v2, Lcom/kubi/kumex/R$color;->emphasis:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 88
    move-result p1

    .line 89
    .line 90
    :goto_0
    iput p1, p0, Lcom/kubi/kumex/record/g0;->g:I

    .line 91
    .line 92
    sget-object v2, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getSymbol()Ljava/lang/String;

    .line 104
    move-result-object v3

    .line 105
    .line 106
    const-string v4, ""

    .line 107
    .line 108
    if-nez v3, :cond_2

    .line 109
    move-object v3, v4

    .line 110
    :cond_2
    const/4 v5, 0x0

    .line 111
    const/4 v6, 0x2

    .line 112
    .line 113
    .line 114
    invoke-static {v2, v3, v5, v6, v0}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    if-eqz v2, :cond_3

    .line 118
    .line 119
    sget-object v3, Lcom/kubi/futures/a;->a:Lcom/kubi/futures/a;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v2}, Lcom/kubi/futures/a;->e(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lcom/kubi/utils/v0;

    .line 123
    move-result-object v2

    .line 124
    .line 125
    if-eqz v2, :cond_3

    .line 126
    goto :goto_2

    .line 127
    .line 128
    :cond_3
    new-instance v2, Lcom/kubi/utils/v0;

    .line 129
    .line 130
    .line 131
    invoke-direct {v2}, Lcom/kubi/utils/v0;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 135
    move-result-object v3

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getSymbol()Ljava/lang/String;

    .line 139
    move-result-object v3

    .line 140
    .line 141
    if-nez v3, :cond_4

    .line 142
    goto :goto_1

    .line 143
    :cond_4
    move-object v4, v3

    .line 144
    .line 145
    .line 146
    :goto_1
    invoke-virtual {v2, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 147
    move-result-object v2

    .line 148
    .line 149
    const-string v3, "append(...)"

    .line 150
    .line 151
    .line 152
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    :goto_2
    iput-object v2, p0, Lcom/kubi/kumex/record/g0;->h:Lcom/kubi/utils/v0;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 158
    move-result-object v2

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRealisedPnl()Ljava/math/BigDecimal;

    .line 162
    move-result-object v2

    .line 163
    .line 164
    .line 165
    invoke-static {v2, v0, v1, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 166
    move-result-object v2

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v2, p1, p1}, Lcom/kubi/kumex/record/g0;->k(Ljava/math/BigDecimal;II)Ljava/lang/CharSequence;

    .line 170
    move-result-object v2

    .line 171
    .line 172
    iput-object v2, p0, Lcom/kubi/kumex/record/g0;->i:Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 176
    move-result-object v2

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRoe()Ljava/math/BigDecimal;

    .line 180
    move-result-object v2

    .line 181
    .line 182
    if-eqz v2, :cond_5

    .line 183
    .line 184
    new-instance v3, Lcom/kubi/utils/v0;

    .line 185
    .line 186
    .line 187
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-static {v2, v0, v1, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 191
    move-result-object v4

    .line 192
    .line 193
    const/16 v11, 0x23

    .line 194
    const/4 v12, 0x0

    .line 195
    const/4 v5, 0x0

    .line 196
    const/4 v6, 0x0

    .line 197
    const/4 v7, 0x2

    .line 198
    const/4 v8, 0x1

    .line 199
    const/4 v9, 0x1

    .line 200
    const/4 v10, 0x0

    .line 201
    .line 202
    .line 203
    invoke-static/range {v4 .. v12}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v0, p1}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 208
    move-object v0, v3

    .line 209
    .line 210
    :cond_5
    iput-object v0, p0, Lcom/kubi/kumex/record/g0;->j:Lcom/kubi/utils/v0;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 214
    move-result-object p1

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRealisedGrossCostNew()Ljava/math/BigDecimal;

    .line 218
    move-result-object p1

    .line 219
    .line 220
    if-nez p1, :cond_6

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 224
    move-result-object p1

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRealisedGrossCost()Ljava/math/BigDecimal;

    .line 228
    move-result-object p1

    .line 229
    .line 230
    .line 231
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 232
    move-result-object p1

    .line 233
    .line 234
    :cond_6
    iput-object p1, p0, Lcom/kubi/kumex/record/g0;->k:Ljava/math/BigDecimal;

    .line 235
    return-void
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
.end method

.method public static synthetic l(Lcom/kubi/kumex/record/g0;Ljava/math/BigDecimal;IIILjava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p5, p4, 0x2

    .line 3
    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    sget-object p2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 7
    .line 8
    sget p5, Lcom/kubi/kumex/R$color;->emphasis:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p5}, Lcom/kubi/utils/c;->a(I)I

    .line 12
    move-result p2

    .line 13
    .line 14
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 15
    .line 16
    if-eqz p4, :cond_1

    .line 17
    .line 18
    sget-object p3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 19
    .line 20
    sget p4, Lcom/kubi/kumex/R$color;->emphasis40:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3, p4}, Lcom/kubi/utils/c;->a(I)I

    .line 24
    move-result p3

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/kumex/record/g0;->k(Ljava/math/BigDecimal;II)Ljava/lang/CharSequence;

    .line 28
    move-result-object p0

    .line 29
    return-object p0
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
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/kubi/kumex/record/g0;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/kubi/kumex/record/g0;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/kumex/record/g0;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/kubi/kumex/record/g0;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-nez p1, :cond_2

    .line 23
    return v2

    .line 24
    :cond_2
    return v0
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

.method public hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/g0;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->hashCode()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final j()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/g0;->k:Ljava/math/BigDecimal;

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
.end method

.method public final k(Ljava/math/BigDecimal;II)Ljava/lang/CharSequence;
    .locals 12
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v1, "number"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/utils/v0;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/utils/v0;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getCurrency()Ljava/lang/String;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    sget-object v4, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object v3

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x2

    .line 31
    const/4 v7, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static {v4, v3, v5, v6, v7}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getDisplayPrecision()Ljava/lang/Integer;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    :cond_0
    const/16 v3, 0x8

    .line 50
    .line 51
    .line 52
    invoke-static {v7, v3}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 53
    move-result v4

    .line 54
    .line 55
    const/16 v10, 0x61

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v5, 0x1

    .line 59
    const/4 v6, 0x1

    .line 60
    const/4 v7, 0x1

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    move-object v2, p1

    .line 64
    .line 65
    .line 66
    invoke-static/range {v2 .. v11}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Lnf/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 74
    .line 75
    .line 76
    invoke-direct {v3, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 77
    .line 78
    .line 79
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 80
    move-result-object v3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2, v3}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    const-string v2, "append(...)"

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    new-instance v3, Lcom/kubi/utils/v0;

    .line 92
    .line 93
    .line 94
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 95
    .line 96
    new-instance v4, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    const/16 v5, 0x20

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 108
    move-result-object v5

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getCurrency()Ljava/lang/String;

    .line 112
    move-result-object v5

    .line 113
    .line 114
    .line 115
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object v5

    .line 117
    .line 118
    .line 119
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    move-result-object v5

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    move-result-object v4

    .line 128
    .line 129
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 130
    .line 131
    .line 132
    invoke-direct {v5, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 133
    .line 134
    .line 135
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 136
    move-result-object v5

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    new-instance v4, Lcom/kubi/utils/v0;

    .line 146
    .line 147
    .line 148
    invoke-direct {v4}, Lcom/kubi/utils/v0;-><init>()V

    .line 149
    .line 150
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 151
    .line 152
    .line 153
    invoke-direct {v5, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 154
    .line 155
    .line 156
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    const-string v5, " "

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v5, v0}, Lcom/kubi/utils/v0;->c(Ljava/lang/CharSequence;[Ljava/lang/Object;)Lcom/kubi/utils/v0;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    const/4 v2, 0x1

    .line 168
    .line 169
    .line 170
    invoke-static {v1, v3, v0, v2}, Lnf/b;->e(Lcom/kubi/utils/v0;Lcom/kubi/utils/v0;Lcom/kubi/utils/v0;Z)Lcom/kubi/utils/v0;

    .line 171
    move-result-object v0

    .line 172
    return-object v0
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
.end method

.method public final m()Lcom/kubi/utils/v0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/g0;->h:Lcom/kubi/utils/v0;

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
.end method

.method public final n()Lcom/kubi/utils/v0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/g0;->j:Lcom/kubi/utils/v0;

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
.end method

.method public final o()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/g0;->i:Ljava/lang/CharSequence;

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
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "ProfitBrieflyObject(record1="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/kumex/record/g0;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const/16 v1, 0x29

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
.end method
