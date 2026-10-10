.class public final Lcom/google/zxing/common/StringUtils;
.super Ljava/lang/Object;
.source "StringUtils.java"


# static fields
.field private static final ASSUME_SHIFT_JIS:Z

.field private static final EUC_JP:Ljava/lang/String; = "EUC_JP"

.field public static final GB2312:Ljava/lang/String; = "GB2312"

.field private static final ISO88591:Ljava/lang/String; = "ISO8859_1"

.field private static final PLATFORM_DEFAULT_ENCODING:Ljava/lang/String;

.field public static final SHIFT_JIS:Ljava/lang/String; = "SJIS"

.field private static final UTF8:Ljava/lang/String; = "UTF8"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sput-object v0, Lcom/google/zxing/common/StringUtils;->PLATFORM_DEFAULT_ENCODING:Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "SJIS"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    move-result v1

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const-string v1, "EUC_JP"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 31
    .line 32
    :goto_1
    sput-boolean v0, Lcom/google/zxing/common/StringUtils;->ASSUME_SHIFT_JIS:Z

    .line 33
    return-void
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

.method private constructor <init>()V
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

.method public static guessEncoding([BLjava/util/Map;)Ljava/lang/String;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/Map<",
            "Lcom/google/zxing/DecodeHintType;",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v2, Lcom/google/zxing/DecodeHintType;->CHARACTER_SET:Lcom/google/zxing/DecodeHintType;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    move-result v3

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    array-length v1, v0

    .line 25
    array-length v2, v0

    .line 26
    const/4 v3, 0x2

    .line 27
    const/4 v4, 0x3

    .line 28
    const/4 v5, 0x1

    .line 29
    const/4 v6, 0x0

    .line 30
    .line 31
    if-le v2, v4, :cond_1

    .line 32
    .line 33
    aget-byte v2, v0, v6

    .line 34
    .line 35
    const/16 v7, -0x11

    .line 36
    .line 37
    if-ne v2, v7, :cond_1

    .line 38
    .line 39
    aget-byte v2, v0, v5

    .line 40
    .line 41
    const/16 v7, -0x45

    .line 42
    .line 43
    if-ne v2, v7, :cond_1

    .line 44
    .line 45
    aget-byte v2, v0, v3

    .line 46
    .line 47
    const/16 v7, -0x41

    .line 48
    .line 49
    if-ne v2, v7, :cond_1

    .line 50
    move v2, v5

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move v2, v6

    .line 53
    :goto_0
    move v7, v5

    .line 54
    move v8, v7

    .line 55
    move v3, v6

    .line 56
    move v9, v3

    .line 57
    move v10, v9

    .line 58
    move v11, v10

    .line 59
    move v12, v11

    .line 60
    move v13, v12

    .line 61
    move v14, v13

    .line 62
    move v15, v14

    .line 63
    .line 64
    move/from16 v16, v15

    .line 65
    .line 66
    move/from16 v17, v16

    .line 67
    .line 68
    move/from16 v18, v17

    .line 69
    .line 70
    :goto_1
    if-ge v9, v1, :cond_2

    .line 71
    .line 72
    if-nez v5, :cond_3

    .line 73
    .line 74
    if-nez v7, :cond_3

    .line 75
    .line 76
    if-eqz v8, :cond_2

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :cond_2
    move/from16 v19, v2

    .line 80
    .line 81
    goto/16 :goto_b

    .line 82
    .line 83
    :cond_3
    :goto_2
    aget-byte v4, v0, v9

    .line 84
    .line 85
    and-int/lit16 v0, v4, 0xff

    .line 86
    .line 87
    if-eqz v8, :cond_4

    .line 88
    .line 89
    if-lez v10, :cond_6

    .line 90
    .line 91
    and-int/lit16 v4, v4, 0x80

    .line 92
    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    add-int/lit8 v10, v10, -0x1

    .line 96
    .line 97
    :cond_4
    move/from16 v19, v2

    .line 98
    goto :goto_5

    .line 99
    .line 100
    :cond_5
    move/from16 v19, v2

    .line 101
    goto :goto_4

    .line 102
    .line 103
    :cond_6
    move/from16 v19, v2

    .line 104
    .line 105
    and-int/lit16 v2, v4, 0x80

    .line 106
    .line 107
    if-eqz v2, :cond_a

    .line 108
    .line 109
    and-int/lit8 v2, v4, 0x40

    .line 110
    .line 111
    if-eqz v2, :cond_9

    .line 112
    .line 113
    add-int/lit8 v2, v10, 0x1

    .line 114
    .line 115
    and-int/lit8 v20, v4, 0x20

    .line 116
    .line 117
    if-nez v20, :cond_7

    .line 118
    .line 119
    add-int/lit8 v12, v12, 0x1

    .line 120
    :goto_3
    move v10, v2

    .line 121
    goto :goto_5

    .line 122
    .line 123
    :cond_7
    add-int/lit8 v2, v10, 0x2

    .line 124
    .line 125
    and-int/lit8 v20, v4, 0x10

    .line 126
    .line 127
    if-nez v20, :cond_8

    .line 128
    .line 129
    add-int/lit8 v13, v13, 0x1

    .line 130
    goto :goto_3

    .line 131
    .line 132
    :cond_8
    add-int/lit8 v10, v10, 0x3

    .line 133
    .line 134
    and-int/lit8 v2, v4, 0x8

    .line 135
    .line 136
    if-nez v2, :cond_9

    .line 137
    .line 138
    add-int/lit8 v14, v14, 0x1

    .line 139
    goto :goto_5

    .line 140
    :cond_9
    :goto_4
    const/4 v8, 0x0

    .line 141
    .line 142
    :cond_a
    :goto_5
    const/16 v2, 0xa0

    .line 143
    .line 144
    const/16 v4, 0x7f

    .line 145
    .line 146
    if-eqz v5, :cond_d

    .line 147
    .line 148
    if-le v0, v4, :cond_b

    .line 149
    .line 150
    if-ge v0, v2, :cond_b

    .line 151
    const/4 v5, 0x0

    .line 152
    goto :goto_6

    .line 153
    .line 154
    :cond_b
    const/16 v2, 0x9f

    .line 155
    .line 156
    if-le v0, v2, :cond_d

    .line 157
    .line 158
    const/16 v2, 0xc0

    .line 159
    .line 160
    if-lt v0, v2, :cond_c

    .line 161
    .line 162
    const/16 v2, 0xd7

    .line 163
    .line 164
    if-eq v0, v2, :cond_c

    .line 165
    .line 166
    const/16 v2, 0xf7

    .line 167
    .line 168
    if-ne v0, v2, :cond_d

    .line 169
    .line 170
    :cond_c
    add-int/lit8 v16, v16, 0x1

    .line 171
    .line 172
    :cond_d
    :goto_6
    if-eqz v7, :cond_16

    .line 173
    .line 174
    if-lez v11, :cond_10

    .line 175
    .line 176
    const/16 v2, 0x40

    .line 177
    .line 178
    if-lt v0, v2, :cond_f

    .line 179
    .line 180
    if-eq v0, v4, :cond_f

    .line 181
    .line 182
    const/16 v2, 0xfc

    .line 183
    .line 184
    if-le v0, v2, :cond_e

    .line 185
    goto :goto_7

    .line 186
    .line 187
    :cond_e
    add-int/lit8 v11, v11, -0x1

    .line 188
    goto :goto_a

    .line 189
    :cond_f
    :goto_7
    const/4 v7, 0x0

    .line 190
    goto :goto_a

    .line 191
    .line 192
    :cond_10
    const/16 v2, 0x80

    .line 193
    .line 194
    if-eq v0, v2, :cond_f

    .line 195
    .line 196
    const/16 v2, 0xa0

    .line 197
    .line 198
    if-eq v0, v2, :cond_f

    .line 199
    .line 200
    const/16 v4, 0xef

    .line 201
    .line 202
    if-le v0, v4, :cond_11

    .line 203
    goto :goto_7

    .line 204
    .line 205
    :cond_11
    if-le v0, v2, :cond_13

    .line 206
    .line 207
    const/16 v2, 0xe0

    .line 208
    .line 209
    if-ge v0, v2, :cond_13

    .line 210
    .line 211
    add-int/lit8 v3, v3, 0x1

    .line 212
    .line 213
    add-int/lit8 v0, v18, 0x1

    .line 214
    .line 215
    if-le v0, v15, :cond_12

    .line 216
    move v15, v0

    .line 217
    .line 218
    move/from16 v18, v15

    .line 219
    .line 220
    :goto_8
    const/16 v17, 0x0

    .line 221
    goto :goto_a

    .line 222
    .line 223
    :cond_12
    move/from16 v18, v0

    .line 224
    goto :goto_8

    .line 225
    .line 226
    :cond_13
    const/16 v2, 0x7f

    .line 227
    .line 228
    if-le v0, v2, :cond_15

    .line 229
    .line 230
    add-int/lit8 v11, v11, 0x1

    .line 231
    .line 232
    add-int/lit8 v0, v17, 0x1

    .line 233
    .line 234
    if-le v0, v6, :cond_14

    .line 235
    move v6, v0

    .line 236
    .line 237
    move/from16 v17, v6

    .line 238
    .line 239
    :goto_9
    const/16 v18, 0x0

    .line 240
    goto :goto_a

    .line 241
    .line 242
    :cond_14
    move/from16 v17, v0

    .line 243
    goto :goto_9

    .line 244
    .line 245
    :cond_15
    const/16 v17, 0x0

    .line 246
    goto :goto_9

    .line 247
    .line 248
    :cond_16
    :goto_a
    add-int/lit8 v9, v9, 0x1

    .line 249
    .line 250
    move-object/from16 v0, p0

    .line 251
    .line 252
    move/from16 v2, v19

    .line 253
    const/4 v4, 0x3

    .line 254
    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :goto_b
    if-eqz v8, :cond_17

    .line 258
    .line 259
    if-lez v10, :cond_17

    .line 260
    const/4 v8, 0x0

    .line 261
    .line 262
    :cond_17
    if-eqz v7, :cond_18

    .line 263
    .line 264
    if-lez v11, :cond_18

    .line 265
    const/4 v7, 0x0

    .line 266
    .line 267
    :cond_18
    const-string v0, "UTF8"

    .line 268
    .line 269
    if-eqz v8, :cond_1a

    .line 270
    .line 271
    if-nez v19, :cond_19

    .line 272
    add-int/2addr v12, v13

    .line 273
    add-int/2addr v12, v14

    .line 274
    .line 275
    if-lez v12, :cond_1a

    .line 276
    :cond_19
    return-object v0

    .line 277
    .line 278
    :cond_1a
    const-string v2, "SJIS"

    .line 279
    .line 280
    if-eqz v7, :cond_1c

    .line 281
    .line 282
    sget-boolean v4, Lcom/google/zxing/common/StringUtils;->ASSUME_SHIFT_JIS:Z

    .line 283
    .line 284
    if-nez v4, :cond_1b

    .line 285
    const/4 v4, 0x3

    .line 286
    .line 287
    if-ge v15, v4, :cond_1b

    .line 288
    .line 289
    if-lt v6, v4, :cond_1c

    .line 290
    :cond_1b
    return-object v2

    .line 291
    .line 292
    :cond_1c
    const-string v4, "ISO8859_1"

    .line 293
    .line 294
    if-eqz v5, :cond_20

    .line 295
    .line 296
    if-eqz v7, :cond_20

    .line 297
    const/4 v6, 0x2

    .line 298
    .line 299
    if-ne v15, v6, :cond_1d

    .line 300
    .line 301
    if-eq v3, v6, :cond_1e

    .line 302
    .line 303
    :cond_1d
    mul-int/lit8 v0, v16, 0xa

    .line 304
    .line 305
    if-lt v0, v1, :cond_1f

    .line 306
    :cond_1e
    return-object v2

    .line 307
    :cond_1f
    return-object v4

    .line 308
    .line 309
    :cond_20
    if-eqz v5, :cond_21

    .line 310
    return-object v4

    .line 311
    .line 312
    :cond_21
    if-eqz v7, :cond_22

    .line 313
    return-object v2

    .line 314
    .line 315
    :cond_22
    if-eqz v8, :cond_23

    .line 316
    return-object v0

    .line 317
    .line 318
    :cond_23
    sget-object v0, Lcom/google/zxing/common/StringUtils;->PLATFORM_DEFAULT_ENCODING:Ljava/lang/String;

    .line 319
    return-object v0
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
