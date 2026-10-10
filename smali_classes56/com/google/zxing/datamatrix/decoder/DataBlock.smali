.class final Lcom/google/zxing/datamatrix/decoder/DataBlock;
.super Ljava/lang/Object;
.source "DataBlock.java"


# instance fields
.field private final codewords:[B

.field private final numDataCodewords:I


# direct methods
.method private constructor <init>(I[B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/google/zxing/datamatrix/decoder/DataBlock;->numDataCodewords:I

    .line 6
    .line 7
    iput-object p2, p0, Lcom/google/zxing/datamatrix/decoder/DataBlock;->codewords:[B

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
.end method

.method public static getDataBlocks([BLcom/google/zxing/datamatrix/decoder/Version;)[Lcom/google/zxing/datamatrix/decoder/DataBlock;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/zxing/datamatrix/decoder/Version;->getECBlocks()Lcom/google/zxing/datamatrix/decoder/Version$ECBlocks;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/zxing/datamatrix/decoder/Version$ECBlocks;->getECBlocks()[Lcom/google/zxing/datamatrix/decoder/Version$ECB;

    .line 8
    move-result-object v1

    .line 9
    array-length v2, v1

    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    .line 14
    :goto_0
    if-ge v4, v2, :cond_0

    .line 15
    .line 16
    aget-object v6, v1, v4

    .line 17
    .line 18
    .line 19
    invoke-virtual {v6}, Lcom/google/zxing/datamatrix/decoder/Version$ECB;->getCount()I

    .line 20
    move-result v6

    .line 21
    add-int/2addr v5, v6

    .line 22
    .line 23
    add-int/lit8 v4, v4, 0x1

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    new-array v2, v5, [Lcom/google/zxing/datamatrix/decoder/DataBlock;

    .line 27
    array-length v4, v1

    .line 28
    move v5, v3

    .line 29
    move v6, v5

    .line 30
    .line 31
    :goto_1
    if-ge v5, v4, :cond_2

    .line 32
    .line 33
    aget-object v7, v1, v5

    .line 34
    move v8, v3

    .line 35
    .line 36
    .line 37
    :goto_2
    invoke-virtual {v7}, Lcom/google/zxing/datamatrix/decoder/Version$ECB;->getCount()I

    .line 38
    move-result v9

    .line 39
    .line 40
    if-ge v8, v9, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Lcom/google/zxing/datamatrix/decoder/Version$ECB;->getDataCodewords()I

    .line 44
    move-result v9

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/google/zxing/datamatrix/decoder/Version$ECBlocks;->getECCodewords()I

    .line 48
    move-result v10

    .line 49
    add-int/2addr v10, v9

    .line 50
    .line 51
    add-int/lit8 v11, v6, 0x1

    .line 52
    .line 53
    new-instance v12, Lcom/google/zxing/datamatrix/decoder/DataBlock;

    .line 54
    .line 55
    new-array v10, v10, [B

    .line 56
    .line 57
    .line 58
    invoke-direct {v12, v9, v10}, Lcom/google/zxing/datamatrix/decoder/DataBlock;-><init>(I[B)V

    .line 59
    .line 60
    aput-object v12, v2, v6

    .line 61
    .line 62
    add-int/lit8 v8, v8, 0x1

    .line 63
    move v6, v11

    .line 64
    goto :goto_2

    .line 65
    .line 66
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_2
    aget-object v1, v2, v3

    .line 70
    .line 71
    iget-object v1, v1, Lcom/google/zxing/datamatrix/decoder/DataBlock;->codewords:[B

    .line 72
    array-length v1, v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/google/zxing/datamatrix/decoder/Version$ECBlocks;->getECCodewords()I

    .line 76
    move-result v0

    .line 77
    sub-int/2addr v1, v0

    .line 78
    .line 79
    add-int/lit8 v0, v1, -0x1

    .line 80
    move v4, v3

    .line 81
    move v5, v4

    .line 82
    .line 83
    :goto_3
    if-ge v4, v0, :cond_4

    .line 84
    move v7, v3

    .line 85
    .line 86
    :goto_4
    if-ge v7, v6, :cond_3

    .line 87
    .line 88
    aget-object v8, v2, v7

    .line 89
    .line 90
    iget-object v8, v8, Lcom/google/zxing/datamatrix/decoder/DataBlock;->codewords:[B

    .line 91
    .line 92
    add-int/lit8 v9, v5, 0x1

    .line 93
    .line 94
    aget-byte v5, p0, v5

    .line 95
    .line 96
    aput-byte v5, v8, v4

    .line 97
    .line 98
    add-int/lit8 v7, v7, 0x1

    .line 99
    move v5, v9

    .line 100
    goto :goto_4

    .line 101
    .line 102
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 103
    goto :goto_3

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {p1}, Lcom/google/zxing/datamatrix/decoder/Version;->getVersionNumber()I

    .line 107
    move-result p1

    .line 108
    .line 109
    const/16 v4, 0x18

    .line 110
    .line 111
    if-ne p1, v4, :cond_5

    .line 112
    const/4 p1, 0x1

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    move p1, v3

    .line 115
    .line 116
    :goto_5
    if-eqz p1, :cond_6

    .line 117
    .line 118
    const/16 v4, 0x8

    .line 119
    goto :goto_6

    .line 120
    :cond_6
    move v4, v6

    .line 121
    :goto_6
    move v7, v3

    .line 122
    .line 123
    :goto_7
    if-ge v7, v4, :cond_7

    .line 124
    .line 125
    aget-object v8, v2, v7

    .line 126
    .line 127
    iget-object v8, v8, Lcom/google/zxing/datamatrix/decoder/DataBlock;->codewords:[B

    .line 128
    .line 129
    add-int/lit8 v9, v5, 0x1

    .line 130
    .line 131
    aget-byte v5, p0, v5

    .line 132
    .line 133
    aput-byte v5, v8, v0

    .line 134
    .line 135
    add-int/lit8 v7, v7, 0x1

    .line 136
    move v5, v9

    .line 137
    goto :goto_7

    .line 138
    .line 139
    :cond_7
    aget-object v0, v2, v3

    .line 140
    .line 141
    iget-object v0, v0, Lcom/google/zxing/datamatrix/decoder/DataBlock;->codewords:[B

    .line 142
    array-length v0, v0

    .line 143
    .line 144
    :goto_8
    if-ge v1, v0, :cond_b

    .line 145
    move v4, v3

    .line 146
    .line 147
    :goto_9
    if-ge v4, v6, :cond_a

    .line 148
    .line 149
    if-eqz p1, :cond_8

    .line 150
    .line 151
    add-int/lit8 v7, v4, 0x8

    .line 152
    rem-int/2addr v7, v6

    .line 153
    goto :goto_a

    .line 154
    :cond_8
    move v7, v4

    .line 155
    .line 156
    :goto_a
    if-eqz p1, :cond_9

    .line 157
    const/4 v8, 0x7

    .line 158
    .line 159
    if-le v7, v8, :cond_9

    .line 160
    .line 161
    add-int/lit8 v8, v1, -0x1

    .line 162
    goto :goto_b

    .line 163
    :cond_9
    move v8, v1

    .line 164
    .line 165
    :goto_b
    aget-object v7, v2, v7

    .line 166
    .line 167
    iget-object v7, v7, Lcom/google/zxing/datamatrix/decoder/DataBlock;->codewords:[B

    .line 168
    .line 169
    add-int/lit8 v9, v5, 0x1

    .line 170
    .line 171
    aget-byte v5, p0, v5

    .line 172
    .line 173
    aput-byte v5, v7, v8

    .line 174
    .line 175
    add-int/lit8 v4, v4, 0x1

    .line 176
    move v5, v9

    .line 177
    goto :goto_9

    .line 178
    .line 179
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 180
    goto :goto_8

    .line 181
    :cond_b
    array-length p0, p0

    .line 182
    .line 183
    if-ne v5, p0, :cond_c

    .line 184
    return-object v2

    .line 185
    .line 186
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 187
    .line 188
    .line 189
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 190
    throw p0
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


# virtual methods
.method public getCodewords()[B
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/datamatrix/decoder/DataBlock;->codewords:[B

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

.method public getNumDataCodewords()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/datamatrix/decoder/DataBlock;->numDataCodewords:I

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
.end method
