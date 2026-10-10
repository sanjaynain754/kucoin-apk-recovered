.class abstract Lcom/google/common/math/ToDoubleRounder;
.super Ljava/lang/Object;
.source "ToDoubleRounder.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtIncompatible;
.end annotation

.annotation runtime Lcom/google/common/math/ElementTypesAreNonnullByDefault;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<X:",
        "Ljava/lang/Number;",
        ":",
        "Ljava/lang/Comparable<",
        "TX;>;>",
        "Ljava/lang/Object;"
    }
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
.end method


# virtual methods
.method public abstract minus(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TX;TX;)TX;"
        }
    .end annotation
.end method

.method public final roundToDouble(Ljava/lang/Number;Ljava/math/RoundingMode;)D
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TX;",
            "Ljava/math/RoundingMode;",
            ")D"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "x"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    const-string v0, "mode"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/common/math/ToDoubleRounder;->roundToDoubleArbitrarily(Ljava/lang/Number;)D

    .line 14
    move-result-wide v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 18
    move-result v2

    .line 19
    .line 20
    const-wide/high16 v3, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 21
    .line 22
    const-wide/high16 v5, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    sget-object v2, Lcom/google/common/math/ToDoubleRounder$1;->$SwitchMap$java$math$RoundingMode:[I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 30
    move-result v7

    .line 31
    .line 32
    aget v2, v2, v7

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide v7, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 38
    .line 39
    .line 40
    packed-switch v2, :pswitch_data_0

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :pswitch_0
    new-instance p2, Ljava/lang/ArithmeticException;

    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p1, " cannot be represented precisely as a double"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-direct {p2, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p2

    .line 65
    .line 66
    :pswitch_1
    cmpl-double p1, v0, v5

    .line 67
    .line 68
    if-nez p1, :cond_0

    .line 69
    return-wide v5

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    :cond_0
    const-wide p1, -0x10000000000001L

    .line 75
    return-wide p1

    .line 76
    .line 77
    :pswitch_2
    cmpl-double p1, v0, v5

    .line 78
    .line 79
    if-nez p1, :cond_1

    .line 80
    return-wide v7

    .line 81
    :cond_1
    return-wide v3

    .line 82
    .line 83
    .line 84
    :pswitch_3
    invoke-virtual {p0, p1}, Lcom/google/common/math/ToDoubleRounder;->sign(Ljava/lang/Number;)I

    .line 85
    move-result p1

    .line 86
    int-to-double p1, p1

    .line 87
    mul-double/2addr p1, v7

    .line 88
    return-wide p1

    .line 89
    .line 90
    :cond_2
    :goto_0
    sget-object v2, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0, v1, v2}, Lcom/google/common/math/ToDoubleRounder;->toX(DLjava/math/RoundingMode;)Ljava/lang/Number;

    .line 94
    move-result-object v2

    .line 95
    move-object v7, p1

    .line 96
    .line 97
    check-cast v7, Ljava/lang/Comparable;

    .line 98
    .line 99
    .line 100
    invoke-interface {v7, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 101
    move-result v7

    .line 102
    .line 103
    sget-object v8, Lcom/google/common/math/ToDoubleRounder$1;->$SwitchMap$java$math$RoundingMode:[I

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 107
    move-result v9

    .line 108
    .line 109
    aget v9, v8, v9

    .line 110
    .line 111
    const-string v10, "impossible"

    .line 112
    .line 113
    .line 114
    packed-switch v9, :pswitch_data_1

    .line 115
    .line 116
    new-instance p1, Ljava/lang/AssertionError;

    .line 117
    .line 118
    .line 119
    invoke-direct {p1, v10}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 120
    throw p1

    .line 121
    .line 122
    :pswitch_4
    if-nez v7, :cond_3

    .line 123
    const/4 p1, 0x1

    .line 124
    goto :goto_1

    .line 125
    :cond_3
    const/4 p1, 0x0

    .line 126
    .line 127
    .line 128
    :goto_1
    invoke-static {p1}, Lcom/google/common/math/MathPreconditions;->checkRoundingUnnecessary(Z)V

    .line 129
    return-wide v0

    .line 130
    .line 131
    .line 132
    :pswitch_5
    invoke-virtual {p0, p1}, Lcom/google/common/math/ToDoubleRounder;->sign(Ljava/lang/Number;)I

    .line 133
    move-result p1

    .line 134
    .line 135
    if-ltz p1, :cond_5

    .line 136
    .line 137
    if-gtz v7, :cond_4

    .line 138
    .line 139
    goto/16 :goto_5

    .line 140
    .line 141
    .line 142
    :cond_4
    invoke-static {v0, v1}, Ljava/lang/Math;->nextUp(D)D

    .line 143
    move-result-wide p1

    .line 144
    return-wide p1

    .line 145
    .line 146
    :cond_5
    if-ltz v7, :cond_6

    .line 147
    .line 148
    goto/16 :goto_5

    .line 149
    .line 150
    .line 151
    :cond_6
    invoke-static {v0, v1}, Lcom/google/common/math/DoubleUtils;->nextDown(D)D

    .line 152
    move-result-wide p1

    .line 153
    return-wide p1

    .line 154
    .line 155
    :pswitch_6
    if-gtz v7, :cond_7

    .line 156
    .line 157
    goto/16 :goto_5

    .line 158
    .line 159
    .line 160
    :cond_7
    invoke-static {v0, v1}, Ljava/lang/Math;->nextUp(D)D

    .line 161
    move-result-wide p1

    .line 162
    return-wide p1

    .line 163
    .line 164
    :pswitch_7
    if-ltz v7, :cond_8

    .line 165
    .line 166
    goto/16 :goto_5

    .line 167
    .line 168
    .line 169
    :cond_8
    invoke-static {v0, v1}, Lcom/google/common/math/DoubleUtils;->nextDown(D)D

    .line 170
    move-result-wide p1

    .line 171
    return-wide p1

    .line 172
    .line 173
    :pswitch_8
    if-ltz v7, :cond_a

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v1}, Ljava/lang/Math;->nextUp(D)D

    .line 177
    move-result-wide v3

    .line 178
    .line 179
    cmpl-double v5, v3, v5

    .line 180
    .line 181
    if-nez v5, :cond_9

    .line 182
    .line 183
    goto/16 :goto_5

    .line 184
    .line 185
    :cond_9
    sget-object v5, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v3, v4, v5}, Lcom/google/common/math/ToDoubleRounder;->toX(DLjava/math/RoundingMode;)Ljava/lang/Number;

    .line 189
    move-result-object v5

    .line 190
    goto :goto_2

    .line 191
    .line 192
    .line 193
    :cond_a
    invoke-static {v0, v1}, Lcom/google/common/math/DoubleUtils;->nextDown(D)D

    .line 194
    move-result-wide v5

    .line 195
    .line 196
    cmpl-double v3, v5, v3

    .line 197
    .line 198
    if-nez v3, :cond_b

    .line 199
    .line 200
    goto/16 :goto_5

    .line 201
    .line 202
    :cond_b
    sget-object v3, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v5, v6, v3}, Lcom/google/common/math/ToDoubleRounder;->toX(DLjava/math/RoundingMode;)Ljava/lang/Number;

    .line 206
    move-result-object v3

    .line 207
    move-wide v11, v5

    .line 208
    move-object v5, v2

    .line 209
    move-object v2, v3

    .line 210
    move-wide v3, v0

    .line 211
    move-wide v0, v11

    .line 212
    .line 213
    .line 214
    :goto_2
    invoke-virtual {p0, p1, v2}, Lcom/google/common/math/ToDoubleRounder;->minus(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;

    .line 215
    move-result-object v2

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v5, p1}, Lcom/google/common/math/ToDoubleRounder;->minus(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;

    .line 219
    move-result-object v5

    .line 220
    .line 221
    check-cast v2, Ljava/lang/Comparable;

    .line 222
    .line 223
    .line 224
    invoke-interface {v2, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 225
    move-result v2

    .line 226
    .line 227
    if-gez v2, :cond_c

    .line 228
    goto :goto_3

    .line 229
    .line 230
    :cond_c
    if-lez v2, :cond_d

    .line 231
    goto :goto_4

    .line 232
    .line 233
    .line 234
    :cond_d
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 235
    move-result p2

    .line 236
    .line 237
    aget p2, v8, p2

    .line 238
    const/4 v2, 0x2

    .line 239
    .line 240
    if-eq p2, v2, :cond_10

    .line 241
    const/4 v2, 0x3

    .line 242
    .line 243
    if-eq p2, v2, :cond_f

    .line 244
    const/4 v2, 0x4

    .line 245
    .line 246
    if-ne p2, v2, :cond_e

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, p1}, Lcom/google/common/math/ToDoubleRounder;->sign(Ljava/lang/Number;)I

    .line 250
    move-result p1

    .line 251
    .line 252
    if-ltz p1, :cond_11

    .line 253
    goto :goto_4

    .line 254
    .line 255
    :cond_e
    new-instance p1, Ljava/lang/AssertionError;

    .line 256
    .line 257
    .line 258
    invoke-direct {p1, v10}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 259
    throw p1

    .line 260
    .line 261
    .line 262
    :cond_f
    invoke-virtual {p0, p1}, Lcom/google/common/math/ToDoubleRounder;->sign(Ljava/lang/Number;)I

    .line 263
    move-result p1

    .line 264
    .line 265
    if-ltz p1, :cond_12

    .line 266
    goto :goto_3

    .line 267
    .line 268
    .line 269
    :cond_10
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 270
    move-result-wide p1

    .line 271
    .line 272
    const-wide/16 v5, 0x1

    .line 273
    and-long/2addr p1, v5

    .line 274
    .line 275
    const-wide/16 v5, 0x0

    .line 276
    .line 277
    cmp-long p1, p1, v5

    .line 278
    .line 279
    if-nez p1, :cond_12

    .line 280
    :cond_11
    :goto_3
    return-wide v0

    .line 281
    :cond_12
    :goto_4
    return-wide v3

    .line 282
    .line 283
    .line 284
    :pswitch_9
    invoke-virtual {p0, p1}, Lcom/google/common/math/ToDoubleRounder;->sign(Ljava/lang/Number;)I

    .line 285
    move-result p1

    .line 286
    .line 287
    if-ltz p1, :cond_14

    .line 288
    .line 289
    if-ltz v7, :cond_13

    .line 290
    goto :goto_5

    .line 291
    .line 292
    .line 293
    :cond_13
    invoke-static {v0, v1}, Lcom/google/common/math/DoubleUtils;->nextDown(D)D

    .line 294
    move-result-wide p1

    .line 295
    return-wide p1

    .line 296
    .line 297
    :cond_14
    if-gtz v7, :cond_15

    .line 298
    :goto_5
    :pswitch_a
    return-wide v0

    .line 299
    .line 300
    .line 301
    :cond_15
    invoke-static {v0, v1}, Ljava/lang/Math;->nextUp(D)D

    .line 302
    move-result-wide p1

    .line 303
    return-wide p1

    .line 304
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_a
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
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
.end method

.method public abstract roundToDoubleArbitrarily(Ljava/lang/Number;)D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TX;)D"
        }
    .end annotation
.end method

.method public abstract sign(Ljava/lang/Number;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TX;)I"
        }
    .end annotation
.end method

.method public abstract toX(DLjava/math/RoundingMode;)Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Ljava/math/RoundingMode;",
            ")TX;"
        }
    .end annotation
.end method
