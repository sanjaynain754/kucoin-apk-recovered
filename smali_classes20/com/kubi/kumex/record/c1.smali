.class public final Lcom/kubi/kumex/record/c1;
.super Lcom/kubi/kumex/record/a;
.source "RecordObjects.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/kubi/kumex/record/ProfitRecordObject;",
        "Lcom/kubi/kumex/record/BaseProfitRecordObject;",
        "record1",
        "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;",
        "<init>",
        "(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V",
        "getRecord1",
        "()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;",
        "green",
        "",
        "red",
        "precision",
        "profitSymbolText",
        "",
        "getProfitSymbolText",
        "()Ljava/lang/CharSequence;",
        "profitAmountText",
        "Lcom/kubi/utils/StyledText;",
        "getProfitAmountText",
        "()Lcom/kubi/utils/StyledText;",
        "realisedPnlRateText",
        "getRealisedPnlRateText",
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
        "SMAP\nRecordObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitRecordObject\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,1120:1\n24#2:1121\n16#2:1122\n*S KotlinDebug\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitRecordObject\n*L\n286#1:1121\n286#1:1122\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/CharSequence;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/kubi/utils/v0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lcom/kubi/utils/v0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V
    .locals 22
    .param p1    # Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "record1"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct/range {p0 .. p1}, Lcom/kubi/kumex/record/a;-><init>(Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;)V

    .line 13
    .line 14
    iput-object v1, v0, Lcom/kubi/kumex/record/c1;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/kubi/router/utils/b;->c()Landroid/content/Context;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const-string v2, "getTopActivityOrApp(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    .line 27
    move-result v1

    .line 28
    .line 29
    iput v1, v0, Lcom/kubi/kumex/record/c1;->g:I

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/kubi/router/utils/b;->c()Landroid/content/Context;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lcom/kubi/resources/g;->n(Landroid/content/Context;)I

    .line 40
    move-result v2

    .line 41
    .line 42
    iput v2, v0, Lcom/kubi/kumex/record/c1;->h:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getCurrency()Ljava/lang/String;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    sget-object v4, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 56
    move-result-object v5

    .line 57
    .line 58
    .line 59
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    move-result-object v3

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x2

    .line 63
    const/4 v8, 0x0

    .line 64
    .line 65
    .line 66
    invoke-static {v5, v3, v6, v7, v8}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 67
    move-result-object v3

    .line 68
    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 73
    move-result-object v3

    .line 74
    .line 75
    if-eqz v3, :cond_0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getDisplayPrecision()Ljava/lang/Integer;

    .line 79
    move-result-object v3

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move-object v3, v8

    .line 82
    .line 83
    :goto_0
    const/16 v5, 0x8

    .line 84
    .line 85
    .line 86
    invoke-static {v3, v5}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 87
    move-result v11

    .line 88
    .line 89
    iput v11, v0, Lcom/kubi/kumex/record/c1;->i:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 93
    move-result-object v3

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 97
    move-result-object v4

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getSymbol()Ljava/lang/String;

    .line 101
    move-result-object v4

    .line 102
    .line 103
    const-string v5, ""

    .line 104
    .line 105
    if-nez v4, :cond_1

    .line 106
    move-object v4, v5

    .line 107
    .line 108
    .line 109
    :cond_1
    invoke-static {v3, v4, v6, v7, v8}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 110
    move-result-object v3

    .line 111
    .line 112
    if-eqz v3, :cond_2

    .line 113
    .line 114
    sget-object v4, Lcom/kubi/futures/a;->a:Lcom/kubi/futures/a;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, v3}, Lcom/kubi/futures/a;->e(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lcom/kubi/utils/v0;

    .line 118
    move-result-object v3

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    move-object v3, v8

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 124
    move-result-object v4

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getSymbol()Ljava/lang/String;

    .line 128
    move-result-object v4

    .line 129
    .line 130
    if-nez v4, :cond_3

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    move-object v5, v4

    .line 133
    .line 134
    .line 135
    :goto_2
    invoke-static {v3, v5}, Lcom/kubi/utils/extensions/f;->g(Landroid/text/SpannableStringBuilder;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 136
    move-result-object v3

    .line 137
    .line 138
    iput-object v3, v0, Lcom/kubi/kumex/record/c1;->j:Ljava/lang/CharSequence;

    .line 139
    .line 140
    new-instance v3, Lcom/kubi/utils/v0;

    .line 141
    .line 142
    .line 143
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 147
    move-result-object v4

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRealisedPnl()Ljava/math/BigDecimal;

    .line 151
    move-result-object v4

    .line 152
    const/4 v5, 0x1

    .line 153
    .line 154
    .line 155
    invoke-static {v4, v8, v5, v8}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 156
    move-result-object v4

    .line 157
    .line 158
    const-wide/16 v19, 0x0

    .line 159
    .line 160
    .line 161
    invoke-static/range {v19 .. v20}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 162
    move-result-object v7

    .line 163
    .line 164
    const-string v9, "valueOf(...)"

    .line 165
    .line 166
    .line 167
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4, v7}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 171
    move-result v4

    .line 172
    .line 173
    if-ltz v4, :cond_4

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 177
    move-result-object v4

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRealisedPnl()Ljava/math/BigDecimal;

    .line 181
    move-result-object v4

    .line 182
    .line 183
    .line 184
    invoke-static {v4, v8, v5, v8}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 185
    move-result-object v4

    .line 186
    .line 187
    const/16 v17, 0x61

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    const/4 v10, 0x0

    .line 191
    const/4 v12, 0x1

    .line 192
    const/4 v13, 0x1

    .line 193
    const/4 v14, 0x1

    .line 194
    const/4 v15, 0x0

    .line 195
    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    move-object/from16 v21, v9

    .line 199
    move-object v9, v4

    .line 200
    .line 201
    move-object/from16 v4, v21

    .line 202
    .line 203
    .line 204
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 205
    move-result-object v7

    .line 206
    .line 207
    .line 208
    invoke-static {v7}, Lnf/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    move-result-object v9

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 213
    move-result-object v7

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getCurrency()Ljava/lang/String;

    .line 217
    move-result-object v7

    .line 218
    .line 219
    .line 220
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    move-result-object v7

    .line 222
    .line 223
    sget-object v10, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 224
    .line 225
    sget v11, Lcom/kubi/kumex/R$string;->stub:I

    .line 226
    .line 227
    new-array v12, v6, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10, v11, v12}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    move-result-object v10

    .line 232
    .line 233
    .line 234
    invoke-static {v7, v10}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    move-result-object v10

    .line 236
    const/4 v13, 0x4

    .line 237
    const/4 v14, 0x0

    .line 238
    const/4 v11, 0x1

    .line 239
    const/4 v12, 0x0

    .line 240
    .line 241
    .line 242
    invoke-static/range {v9 .. v14}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 243
    move-result-object v7

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3, v7, v1}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 247
    goto :goto_3

    .line 248
    :cond_4
    move-object v4, v9

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 252
    move-result-object v7

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRealisedPnl()Ljava/math/BigDecimal;

    .line 256
    move-result-object v7

    .line 257
    .line 258
    .line 259
    invoke-static {v7, v8, v5, v8}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 260
    move-result-object v9

    .line 261
    .line 262
    const/16 v17, 0x61

    .line 263
    .line 264
    const/16 v18, 0x0

    .line 265
    const/4 v10, 0x0

    .line 266
    const/4 v12, 0x1

    .line 267
    const/4 v13, 0x1

    .line 268
    const/4 v14, 0x1

    .line 269
    const/4 v15, 0x0

    .line 270
    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    .line 274
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 275
    move-result-object v7

    .line 276
    .line 277
    .line 278
    invoke-static {v7}, Lnf/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    move-result-object v9

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 283
    move-result-object v7

    .line 284
    .line 285
    .line 286
    invoke-virtual {v7}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getCurrency()Ljava/lang/String;

    .line 287
    move-result-object v7

    .line 288
    .line 289
    .line 290
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 291
    move-result-object v7

    .line 292
    .line 293
    sget-object v10, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 294
    .line 295
    sget v11, Lcom/kubi/kumex/R$string;->stub:I

    .line 296
    .line 297
    new-array v12, v6, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v10, v11, v12}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 301
    move-result-object v10

    .line 302
    .line 303
    .line 304
    invoke-static {v7, v10}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    move-result-object v10

    .line 306
    const/4 v13, 0x4

    .line 307
    const/4 v14, 0x0

    .line 308
    const/4 v11, 0x1

    .line 309
    const/4 v12, 0x0

    .line 310
    .line 311
    .line 312
    invoke-static/range {v9 .. v14}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 313
    move-result-object v7

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3, v7, v2}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 317
    .line 318
    :goto_3
    iput-object v3, v0, Lcom/kubi/kumex/record/c1;->k:Lcom/kubi/utils/v0;

    .line 319
    .line 320
    new-instance v3, Lcom/kubi/utils/v0;

    .line 321
    .line 322
    .line 323
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 327
    move-result-object v7

    .line 328
    .line 329
    .line 330
    invoke-virtual {v7}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRoe()Ljava/math/BigDecimal;

    .line 331
    move-result-object v9

    .line 332
    .line 333
    if-eqz v9, :cond_5

    .line 334
    .line 335
    const/16 v16, 0x23

    .line 336
    .line 337
    const/16 v17, 0x0

    .line 338
    const/4 v10, 0x0

    .line 339
    const/4 v11, 0x0

    .line 340
    const/4 v12, 0x2

    .line 341
    const/4 v13, 0x1

    .line 342
    const/4 v14, 0x1

    .line 343
    const/4 v15, 0x0

    .line 344
    .line 345
    .line 346
    invoke-static/range {v9 .. v17}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 347
    move-result-object v7

    .line 348
    .line 349
    if-nez v7, :cond_6

    .line 350
    .line 351
    :cond_5
    sget-object v7, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 352
    .line 353
    sget v9, Lcom/kubi/kumex/R$string;->stub:I

    .line 354
    .line 355
    new-array v6, v6, [Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v7, v9, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 359
    move-result-object v7

    .line 360
    .line 361
    .line 362
    :cond_6
    invoke-virtual {v0}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 363
    move-result-object v6

    .line 364
    .line 365
    .line 366
    invoke-virtual {v6}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getRoe()Ljava/math/BigDecimal;

    .line 367
    move-result-object v6

    .line 368
    .line 369
    .line 370
    invoke-static {v6, v8, v5, v8}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 371
    move-result-object v5

    .line 372
    .line 373
    .line 374
    invoke-static/range {v19 .. v20}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 375
    move-result-object v6

    .line 376
    .line 377
    .line 378
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v5, v6}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 382
    move-result v4

    .line 383
    .line 384
    if-ltz v4, :cond_7

    .line 385
    goto :goto_4

    .line 386
    :cond_7
    move v1, v2

    .line 387
    .line 388
    .line 389
    :goto_4
    invoke-virtual {v3, v7, v1}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 390
    .line 391
    iput-object v3, v0, Lcom/kubi/kumex/record/c1;->l:Lcom/kubi/utils/v0;

    .line 392
    return-void
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
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
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
    instance-of v1, p1, Lcom/kubi/kumex/record/c1;

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
    check-cast p1, Lcom/kubi/kumex/record/c1;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/kumex/record/c1;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/kubi/kumex/record/c1;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

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
    iget-object v0, p0, Lcom/kubi/kumex/record/c1;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

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

.method public final j()Lcom/kubi/utils/v0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/c1;->k:Lcom/kubi/utils/v0;

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

.method public final k()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/c1;->j:Ljava/lang/CharSequence;

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

.method public final l()Lcom/kubi/utils/v0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/c1;->l:Lcom/kubi/utils/v0;

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

.method public final m()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/c1;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

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
    const-string v1, "ProfitRecordObject(record1="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/kumex/record/c1;->f:Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

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
