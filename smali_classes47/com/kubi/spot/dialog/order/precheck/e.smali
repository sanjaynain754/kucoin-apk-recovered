.class public final Lcom/kubi/spot/dialog/order/precheck/e;
.super Ljava/lang/Object;
.source "QuantityRangeValidator.kt"

# interfaces
.implements Lcom/kubi/spot/dialog/order/precheck/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0096@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/spot/dialog/order/precheck/QuantityRangeValidator;",
        "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;",
        "<init>",
        "()V",
        "validate",
        "Lcom/kubi/spot/dialog/order/model/ValidationResult;",
        "context",
        "Lcom/kubi/spot/dialog/order/model/AmendContext;",
        "entity",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "(Lcom/kubi/spot/dialog/order/model/AmendContext;Lcom/kubi/data/entity/SymbolInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# direct methods
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
.end method


# virtual methods
.method public a(Lcom/kubi/spot/dialog/order/model/AmendContext;Lcom/kubi/data/entity/SymbolInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19
    .param p1    # Lcom/kubi/spot/dialog/order/model/AmendContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/spot/dialog/order/model/AmendContext;",
            "Lcom/kubi/data/entity/SymbolInfoEntity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/spot/dialog/order/model/ValidationResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/spot/dialog/order/model/AmendContext;->getNewParams()Lcom/kubi/spot/dialog/order/model/AmendParams;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/spot/dialog/order/model/AmendParams;->getNewSize()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2, v1}, Lcom/kubi/utils/extensions/DowngradeExKt;->e(Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMinSize()D

    .line 20
    move-result-wide v3

    .line 21
    .line 22
    new-instance v5, Ljava/math/BigDecimal;

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-direct {v5, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v5, v1

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-static {v5, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMaxSize()D

    .line 41
    move-result-wide v4

    .line 42
    .line 43
    new-instance v6, Ljava/math/BigDecimal;

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    .line 50
    invoke-direct {v6, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v6, v1

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-static {v6, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 56
    move-result-object v4

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v3, v4}, Lh30/b;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z

    .line 60
    move-result v0

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    sget-object v3, Lcom/kubi/spot/dialog/order/model/ValidationResult;->e:Lcom/kubi/spot/dialog/order/model/ValidationResult$Companion;

    .line 65
    .line 66
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 67
    .line 68
    sget v4, Lcom/kubi/spot/R$string;->quantity_must_range:I

    .line 69
    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMinSize()D

    .line 74
    move-result-wide v5

    .line 75
    .line 76
    new-instance v7, Ljava/math/BigDecimal;

    .line 77
    .line 78
    .line 79
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    .line 83
    invoke-direct {v7, v5}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    move-object v7, v1

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-static {v7, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 89
    move-result-object v8

    .line 90
    .line 91
    const/16 v16, 0x7d

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    const/4 v9, 0x0

    .line 95
    .line 96
    const/16 v10, 0x14

    .line 97
    const/4 v11, 0x0

    .line 98
    const/4 v12, 0x0

    .line 99
    const/4 v13, 0x0

    .line 100
    const/4 v14, 0x0

    .line 101
    const/4 v15, 0x0

    .line 102
    .line 103
    .line 104
    invoke-static/range {v8 .. v17}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 105
    move-result-object v5

    .line 106
    .line 107
    if-eqz p2, :cond_3

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseMaxSize()D

    .line 111
    move-result-wide v6

    .line 112
    .line 113
    new-instance v8, Ljava/math/BigDecimal;

    .line 114
    .line 115
    .line 116
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 117
    move-result-object v6

    .line 118
    .line 119
    .line 120
    invoke-direct {v8, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    move-object v8, v1

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-static {v8, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 126
    move-result-object v9

    .line 127
    .line 128
    const/16 v17, 0x7d

    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    const/4 v10, 0x0

    .line 132
    .line 133
    const/16 v11, 0x14

    .line 134
    const/4 v12, 0x0

    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v14, 0x0

    .line 137
    const/4 v15, 0x0

    .line 138
    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    .line 142
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    .line 146
    filled-new-array {v5, v1}, [Ljava/lang/Object;

    .line 147
    move-result-object v1

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v4, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    move-result-object v5

    .line 152
    const/4 v7, 0x4

    .line 153
    const/4 v8, 0x0

    .line 154
    .line 155
    const-string v4, "20251002"

    .line 156
    const/4 v6, 0x0

    .line 157
    .line 158
    .line 159
    invoke-static/range {v3 .. v8}, Lcom/kubi/spot/dialog/order/model/ValidationResult$Companion;->failure$default(Lcom/kubi/spot/dialog/order/model/ValidationResult$Companion;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/spot/dialog/order/model/ValidationResult;

    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    .line 163
    :cond_4
    sget-object v0, Lcom/kubi/spot/dialog/order/model/ValidationResult;->e:Lcom/kubi/spot/dialog/order/model/ValidationResult$Companion;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Lcom/kubi/spot/dialog/order/model/ValidationResult$Companion;->success()Lcom/kubi/spot/dialog/order/model/ValidationResult;

    .line 167
    move-result-object v0

    .line 168
    return-object v0
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
