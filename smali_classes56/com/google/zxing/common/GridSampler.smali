.class public abstract Lcom/google/zxing/common/GridSampler;
.super Ljava/lang/Object;
.source "GridSampler.java"


# static fields
.field private static gridSampler:Lcom/google/zxing/common/GridSampler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/zxing/common/DefaultGridSampler;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/zxing/common/DefaultGridSampler;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/google/zxing/common/GridSampler;->gridSampler:Lcom/google/zxing/common/GridSampler;

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
.end method

.method public static checkAndNudgePoints(Lcom/google/zxing/common/BitMatrix;[F)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    .line 8
    move-result p0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v4, v1

    .line 12
    move v3, v2

    .line 13
    :goto_0
    array-length v5, p1

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, -0x1

    .line 16
    .line 17
    if-ge v3, v5, :cond_5

    .line 18
    .line 19
    if-eqz v4, :cond_5

    .line 20
    .line 21
    aget v4, p1, v3

    .line 22
    float-to-int v4, v4

    .line 23
    .line 24
    add-int/lit8 v5, v3, 0x1

    .line 25
    .line 26
    aget v8, p1, v5

    .line 27
    float-to-int v8, v8

    .line 28
    .line 29
    if-lt v4, v7, :cond_4

    .line 30
    .line 31
    if-gt v4, v0, :cond_4

    .line 32
    .line 33
    if-lt v8, v7, :cond_4

    .line 34
    .line 35
    if-gt v8, p0, :cond_4

    .line 36
    .line 37
    if-ne v4, v7, :cond_0

    .line 38
    .line 39
    aput v6, p1, v3

    .line 40
    :goto_1
    move v4, v1

    .line 41
    goto :goto_2

    .line 42
    .line 43
    :cond_0
    if-ne v4, v0, :cond_1

    .line 44
    .line 45
    add-int/lit8 v4, v0, -0x1

    .line 46
    int-to-float v4, v4

    .line 47
    .line 48
    aput v4, p1, v3

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v4, v2

    .line 51
    .line 52
    :goto_2
    if-ne v8, v7, :cond_2

    .line 53
    .line 54
    aput v6, p1, v5

    .line 55
    :goto_3
    move v4, v1

    .line 56
    goto :goto_4

    .line 57
    .line 58
    :cond_2
    if-ne v8, p0, :cond_3

    .line 59
    .line 60
    add-int/lit8 v4, p0, -0x1

    .line 61
    int-to-float v4, v4

    .line 62
    .line 63
    aput v4, p1, v5

    .line 64
    goto :goto_3

    .line 65
    .line 66
    :cond_3
    :goto_4
    add-int/lit8 v3, v3, 0x2

    .line 67
    goto :goto_0

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 71
    move-result-object p0

    .line 72
    throw p0

    .line 73
    :cond_5
    array-length v3, p1

    .line 74
    .line 75
    add-int/lit8 v3, v3, -0x2

    .line 76
    move v4, v1

    .line 77
    .line 78
    :goto_5
    if-ltz v3, :cond_b

    .line 79
    .line 80
    if-eqz v4, :cond_b

    .line 81
    .line 82
    aget v4, p1, v3

    .line 83
    float-to-int v4, v4

    .line 84
    .line 85
    add-int/lit8 v5, v3, 0x1

    .line 86
    .line 87
    aget v8, p1, v5

    .line 88
    float-to-int v8, v8

    .line 89
    .line 90
    if-lt v4, v7, :cond_a

    .line 91
    .line 92
    if-gt v4, v0, :cond_a

    .line 93
    .line 94
    if-lt v8, v7, :cond_a

    .line 95
    .line 96
    if-gt v8, p0, :cond_a

    .line 97
    .line 98
    if-ne v4, v7, :cond_6

    .line 99
    .line 100
    aput v6, p1, v3

    .line 101
    :goto_6
    move v4, v1

    .line 102
    goto :goto_7

    .line 103
    .line 104
    :cond_6
    if-ne v4, v0, :cond_7

    .line 105
    .line 106
    add-int/lit8 v4, v0, -0x1

    .line 107
    int-to-float v4, v4

    .line 108
    .line 109
    aput v4, p1, v3

    .line 110
    goto :goto_6

    .line 111
    :cond_7
    move v4, v2

    .line 112
    .line 113
    :goto_7
    if-ne v8, v7, :cond_8

    .line 114
    .line 115
    aput v6, p1, v5

    .line 116
    :goto_8
    move v4, v1

    .line 117
    goto :goto_9

    .line 118
    .line 119
    :cond_8
    if-ne v8, p0, :cond_9

    .line 120
    .line 121
    add-int/lit8 v4, p0, -0x1

    .line 122
    int-to-float v4, v4

    .line 123
    .line 124
    aput v4, p1, v5

    .line 125
    goto :goto_8

    .line 126
    .line 127
    :cond_9
    :goto_9
    add-int/lit8 v3, v3, -0x2

    .line 128
    goto :goto_5

    .line 129
    .line 130
    .line 131
    :cond_a
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 132
    move-result-object p0

    .line 133
    throw p0

    .line 134
    :cond_b
    return-void
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
.end method

.method public static getInstance()Lcom/google/zxing/common/GridSampler;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/zxing/common/GridSampler;->gridSampler:Lcom/google/zxing/common/GridSampler;

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
.end method

.method public static setGridSampler(Lcom/google/zxing/common/GridSampler;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcom/google/zxing/common/GridSampler;->gridSampler:Lcom/google/zxing/common/GridSampler;

    .line 3
    return-void
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
.end method


# virtual methods
.method public abstract sampleGrid(Lcom/google/zxing/common/BitMatrix;IIFFFFFFFFFFFFFFFF)Lcom/google/zxing/common/BitMatrix;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation
.end method

.method public abstract sampleGrid(Lcom/google/zxing/common/BitMatrix;IILcom/google/zxing/common/PerspectiveTransform;)Lcom/google/zxing/common/BitMatrix;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation
.end method
