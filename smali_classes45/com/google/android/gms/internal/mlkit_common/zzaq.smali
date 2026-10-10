.class final Lcom/google/android/gms/internal/mlkit_common/zzaq;
.super Lcom/google/android/gms/internal/mlkit_common/zzai;
.source "com.google.mlkit:common@@18.11.0"


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_common/zzai;


# instance fields
.field final transient zzb:[Ljava/lang/Object;

.field private final transient zzc:Ljava/lang/Object;

.field private final transient zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzaq;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    new-array v2, v1, [Ljava/lang/Object;

    .line 6
    const/4 v3, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v3, v2, v1}, Lcom/google/android/gms/internal/mlkit_common/zzaq;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 10
    .line 11
    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzai;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private constructor <init>(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzai;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzc:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:[Ljava/lang/Object;

    .line 8
    .line 9
    iput p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzd:I

    .line 10
    return-void
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
.end method

.method public static zzg(I[Ljava/lang/Object;Lcom/google/android/gms/internal/mlkit_common/zzah;)Lcom/google/android/gms/internal/mlkit_common/zzaq;
    .locals 19

    .line 1
    .line 2
    move/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zza:Lcom/google/android/gms/internal/mlkit_common/zzai;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/internal/mlkit_common/zzaq;

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    .line 18
    if-ne v0, v5, :cond_1

    .line 19
    .line 20
    aget-object v0, v1, v4

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    aget-object v2, v1, v5

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/mlkit_common/zzw;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzaq;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v3, v1, v5}, Lcom/google/android/gms/internal/mlkit_common/zzaq;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 37
    return-object v0

    .line 38
    :cond_1
    array-length v6, v1

    .line 39
    shr-int/2addr v6, v5

    .line 40
    .line 41
    const-string v7, "index"

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v6, v7}, Lcom/google/android/gms/internal/mlkit_common/zzt;->zzb(IILjava/lang/String;)I

    .line 45
    const/4 v6, 0x2

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 49
    move-result v7

    .line 50
    .line 51
    .line 52
    const v8, 0x2ccccccc

    .line 53
    .line 54
    if-ge v7, v8, :cond_2

    .line 55
    .line 56
    add-int/lit8 v8, v7, -0x1

    .line 57
    .line 58
    .line 59
    invoke-static {v8}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 60
    move-result v8

    .line 61
    :goto_0
    add-int/2addr v8, v8

    .line 62
    int-to-double v9, v8

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const-wide v11, 0x3fe6666666666666L    # 0.7

    .line 68
    mul-double/2addr v9, v11

    .line 69
    int-to-double v11, v7

    .line 70
    .line 71
    cmpg-double v9, v9, v11

    .line 72
    .line 73
    if-gez v9, :cond_3

    .line 74
    goto :goto_0

    .line 75
    .line 76
    :cond_2
    const/high16 v8, 0x40000000    # 2.0f

    .line 77
    .line 78
    if-ge v7, v8, :cond_18

    .line 79
    .line 80
    :cond_3
    if-ne v0, v5, :cond_4

    .line 81
    .line 82
    aget-object v0, v1, v4

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    aget-object v7, v1, v5

    .line 88
    .line 89
    .line 90
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v7}, Lcom/google/android/gms/internal/mlkit_common/zzw;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    move/from16 v16, v4

    .line 96
    move v0, v5

    .line 97
    .line 98
    move/from16 v17, v0

    .line 99
    .line 100
    :goto_1
    move/from16 v18, v6

    .line 101
    .line 102
    goto/16 :goto_c

    .line 103
    .line 104
    :cond_4
    add-int/lit8 v7, v8, -0x1

    .line 105
    .line 106
    const/16 v9, 0x80

    .line 107
    const/4 v10, 0x3

    .line 108
    const/4 v11, -0x1

    .line 109
    .line 110
    if-gt v8, v9, :cond_a

    .line 111
    .line 112
    new-array v8, v8, [B

    .line 113
    .line 114
    .line 115
    invoke-static {v8, v11}, Ljava/util/Arrays;->fill([BB)V

    .line 116
    move v9, v4

    .line 117
    move v11, v9

    .line 118
    .line 119
    :goto_2
    if-ge v9, v0, :cond_8

    .line 120
    .line 121
    add-int v12, v11, v11

    .line 122
    .line 123
    add-int v13, v9, v9

    .line 124
    .line 125
    aget-object v14, v1, v13

    .line 126
    .line 127
    .line 128
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    xor-int/2addr v13, v5

    .line 130
    .line 131
    aget-object v13, v1, v13

    .line 132
    .line 133
    .line 134
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    invoke-static {v14, v13}, Lcom/google/android/gms/internal/mlkit_common/zzw;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v14}, Ljava/lang/Object;->hashCode()I

    .line 141
    move-result v15

    .line 142
    .line 143
    .line 144
    invoke-static {v15}, Lcom/google/android/gms/internal/mlkit_common/zzy;->zza(I)I

    .line 145
    move-result v15

    .line 146
    :goto_3
    and-int/2addr v15, v7

    .line 147
    .line 148
    move/from16 v16, v4

    .line 149
    .line 150
    aget-byte v4, v8, v15

    .line 151
    .line 152
    move/from16 v17, v5

    .line 153
    .line 154
    const/16 v5, 0xff

    .line 155
    and-int/2addr v4, v5

    .line 156
    .line 157
    if-ne v4, v5, :cond_6

    .line 158
    int-to-byte v4, v12

    .line 159
    .line 160
    aput-byte v4, v8, v15

    .line 161
    .line 162
    if-ge v11, v9, :cond_5

    .line 163
    .line 164
    aput-object v14, v1, v12

    .line 165
    .line 166
    xor-int/lit8 v4, v12, 0x1

    .line 167
    .line 168
    aput-object v13, v1, v4

    .line 169
    .line 170
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 171
    goto :goto_4

    .line 172
    .line 173
    :cond_6
    aget-object v5, v1, v4

    .line 174
    .line 175
    .line 176
    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    move-result v5

    .line 178
    .line 179
    if-eqz v5, :cond_7

    .line 180
    .line 181
    xor-int/lit8 v3, v4, 0x1

    .line 182
    .line 183
    new-instance v4, Lcom/google/android/gms/internal/mlkit_common/zzag;

    .line 184
    .line 185
    aget-object v5, v1, v3

    .line 186
    .line 187
    .line 188
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    invoke-direct {v4, v14, v13, v5}, Lcom/google/android/gms/internal/mlkit_common/zzag;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    aput-object v13, v1, v3

    .line 194
    move-object v3, v4

    .line 195
    .line 196
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 197
    .line 198
    move/from16 v4, v16

    .line 199
    .line 200
    move/from16 v5, v17

    .line 201
    goto :goto_2

    .line 202
    .line 203
    :cond_7
    add-int/lit8 v15, v15, 0x1

    .line 204
    .line 205
    move/from16 v4, v16

    .line 206
    .line 207
    move/from16 v5, v17

    .line 208
    goto :goto_3

    .line 209
    .line 210
    :cond_8
    move/from16 v16, v4

    .line 211
    .line 212
    move/from16 v17, v5

    .line 213
    .line 214
    if-ne v11, v0, :cond_9

    .line 215
    .line 216
    move/from16 v18, v6

    .line 217
    move-object v3, v8

    .line 218
    .line 219
    goto/16 :goto_c

    .line 220
    .line 221
    :cond_9
    new-array v4, v10, [Ljava/lang/Object;

    .line 222
    .line 223
    aput-object v8, v4, v16

    .line 224
    .line 225
    .line 226
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    move-result-object v5

    .line 228
    .line 229
    aput-object v5, v4, v17

    .line 230
    .line 231
    aput-object v3, v4, v6

    .line 232
    :goto_5
    move-object v3, v4

    .line 233
    .line 234
    goto/16 :goto_1

    .line 235
    .line 236
    :cond_a
    move/from16 v16, v4

    .line 237
    .line 238
    move/from16 v17, v5

    .line 239
    .line 240
    .line 241
    const v4, 0x8000

    .line 242
    .line 243
    if-gt v8, v4, :cond_10

    .line 244
    .line 245
    new-array v4, v8, [S

    .line 246
    .line 247
    .line 248
    invoke-static {v4, v11}, Ljava/util/Arrays;->fill([SS)V

    .line 249
    .line 250
    move/from16 v5, v16

    .line 251
    move v8, v5

    .line 252
    .line 253
    :goto_6
    if-ge v5, v0, :cond_e

    .line 254
    .line 255
    add-int v9, v8, v8

    .line 256
    .line 257
    add-int v11, v5, v5

    .line 258
    .line 259
    aget-object v12, v1, v11

    .line 260
    .line 261
    .line 262
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    xor-int/lit8 v11, v11, 0x1

    .line 265
    .line 266
    aget-object v11, v1, v11

    .line 267
    .line 268
    .line 269
    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    invoke-static {v12, v11}, Lcom/google/android/gms/internal/mlkit_common/zzw;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    .line 276
    move-result v13

    .line 277
    .line 278
    .line 279
    invoke-static {v13}, Lcom/google/android/gms/internal/mlkit_common/zzy;->zza(I)I

    .line 280
    move-result v13

    .line 281
    :goto_7
    and-int/2addr v13, v7

    .line 282
    .line 283
    aget-short v14, v4, v13

    .line 284
    int-to-char v14, v14

    .line 285
    .line 286
    .line 287
    const v15, 0xffff

    .line 288
    .line 289
    if-ne v14, v15, :cond_c

    .line 290
    int-to-short v14, v9

    .line 291
    .line 292
    aput-short v14, v4, v13

    .line 293
    .line 294
    if-ge v8, v5, :cond_b

    .line 295
    .line 296
    aput-object v12, v1, v9

    .line 297
    .line 298
    xor-int/lit8 v9, v9, 0x1

    .line 299
    .line 300
    aput-object v11, v1, v9

    .line 301
    .line 302
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 303
    goto :goto_8

    .line 304
    .line 305
    :cond_c
    aget-object v15, v1, v14

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 309
    move-result v15

    .line 310
    .line 311
    if-eqz v15, :cond_d

    .line 312
    .line 313
    xor-int/lit8 v3, v14, 0x1

    .line 314
    .line 315
    new-instance v9, Lcom/google/android/gms/internal/mlkit_common/zzag;

    .line 316
    .line 317
    aget-object v13, v1, v3

    .line 318
    .line 319
    .line 320
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    invoke-direct {v9, v12, v11, v13}, Lcom/google/android/gms/internal/mlkit_common/zzag;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    .line 325
    aput-object v11, v1, v3

    .line 326
    move-object v3, v9

    .line 327
    .line 328
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 329
    goto :goto_6

    .line 330
    .line 331
    :cond_d
    add-int/lit8 v13, v13, 0x1

    .line 332
    goto :goto_7

    .line 333
    .line 334
    :cond_e
    if-ne v8, v0, :cond_f

    .line 335
    goto :goto_5

    .line 336
    .line 337
    :cond_f
    new-array v5, v10, [Ljava/lang/Object;

    .line 338
    .line 339
    aput-object v4, v5, v16

    .line 340
    .line 341
    .line 342
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 343
    move-result-object v4

    .line 344
    .line 345
    aput-object v4, v5, v17

    .line 346
    .line 347
    aput-object v3, v5, v6

    .line 348
    move-object v3, v5

    .line 349
    .line 350
    goto/16 :goto_1

    .line 351
    .line 352
    :cond_10
    new-array v4, v8, [I

    .line 353
    .line 354
    .line 355
    invoke-static {v4, v11}, Ljava/util/Arrays;->fill([II)V

    .line 356
    .line 357
    move/from16 v5, v16

    .line 358
    move v8, v5

    .line 359
    .line 360
    :goto_9
    if-ge v5, v0, :cond_14

    .line 361
    .line 362
    add-int v9, v8, v8

    .line 363
    .line 364
    add-int v12, v5, v5

    .line 365
    .line 366
    aget-object v13, v1, v12

    .line 367
    .line 368
    .line 369
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    xor-int/lit8 v12, v12, 0x1

    .line 372
    .line 373
    aget-object v12, v1, v12

    .line 374
    .line 375
    .line 376
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/mlkit_common/zzw;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 383
    move-result v14

    .line 384
    .line 385
    .line 386
    invoke-static {v14}, Lcom/google/android/gms/internal/mlkit_common/zzy;->zza(I)I

    .line 387
    move-result v14

    .line 388
    :goto_a
    and-int/2addr v14, v7

    .line 389
    .line 390
    aget v15, v4, v14

    .line 391
    .line 392
    if-ne v15, v11, :cond_12

    .line 393
    .line 394
    aput v9, v4, v14

    .line 395
    .line 396
    if-ge v8, v5, :cond_11

    .line 397
    .line 398
    aput-object v13, v1, v9

    .line 399
    .line 400
    xor-int/lit8 v9, v9, 0x1

    .line 401
    .line 402
    aput-object v12, v1, v9

    .line 403
    .line 404
    :cond_11
    add-int/lit8 v8, v8, 0x1

    .line 405
    .line 406
    move/from16 v18, v6

    .line 407
    goto :goto_b

    .line 408
    .line 409
    :cond_12
    move/from16 v18, v6

    .line 410
    .line 411
    aget-object v6, v1, v15

    .line 412
    .line 413
    .line 414
    invoke-virtual {v13, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 415
    move-result v6

    .line 416
    .line 417
    if-eqz v6, :cond_13

    .line 418
    .line 419
    xor-int/lit8 v3, v15, 0x1

    .line 420
    .line 421
    new-instance v6, Lcom/google/android/gms/internal/mlkit_common/zzag;

    .line 422
    .line 423
    aget-object v9, v1, v3

    .line 424
    .line 425
    .line 426
    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    invoke-direct {v6, v13, v12, v9}, Lcom/google/android/gms/internal/mlkit_common/zzag;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 430
    .line 431
    aput-object v12, v1, v3

    .line 432
    move-object v3, v6

    .line 433
    .line 434
    :goto_b
    add-int/lit8 v5, v5, 0x1

    .line 435
    .line 436
    move/from16 v6, v18

    .line 437
    goto :goto_9

    .line 438
    .line 439
    :cond_13
    add-int/lit8 v14, v14, 0x1

    .line 440
    .line 441
    move/from16 v6, v18

    .line 442
    goto :goto_a

    .line 443
    .line 444
    :cond_14
    move/from16 v18, v6

    .line 445
    .line 446
    if-ne v8, v0, :cond_15

    .line 447
    move-object v3, v4

    .line 448
    goto :goto_c

    .line 449
    .line 450
    :cond_15
    new-array v5, v10, [Ljava/lang/Object;

    .line 451
    .line 452
    aput-object v4, v5, v16

    .line 453
    .line 454
    .line 455
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 456
    move-result-object v4

    .line 457
    .line 458
    aput-object v4, v5, v17

    .line 459
    .line 460
    aput-object v3, v5, v18

    .line 461
    move-object v3, v5

    .line 462
    .line 463
    :goto_c
    instance-of v4, v3, [Ljava/lang/Object;

    .line 464
    .line 465
    if-eqz v4, :cond_17

    .line 466
    .line 467
    check-cast v3, [Ljava/lang/Object;

    .line 468
    .line 469
    aget-object v0, v3, v18

    .line 470
    .line 471
    check-cast v0, Lcom/google/android/gms/internal/mlkit_common/zzag;

    .line 472
    .line 473
    if-eqz v2, :cond_16

    .line 474
    .line 475
    iput-object v0, v2, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzag;

    .line 476
    .line 477
    aget-object v0, v3, v16

    .line 478
    .line 479
    aget-object v2, v3, v17

    .line 480
    .line 481
    check-cast v2, Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 485
    move-result v2

    .line 486
    .line 487
    add-int v3, v2, v2

    .line 488
    .line 489
    .line 490
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 491
    move-result-object v1

    .line 492
    move-object v3, v0

    .line 493
    move v0, v2

    .line 494
    goto :goto_d

    .line 495
    .line 496
    .line 497
    :cond_16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzag;->zza()Ljava/lang/IllegalArgumentException;

    .line 498
    move-result-object v0

    .line 499
    throw v0

    .line 500
    .line 501
    :cond_17
    :goto_d
    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzaq;

    .line 502
    .line 503
    .line 504
    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/internal/mlkit_common/zzaq;-><init>(Ljava/lang/Object;[Ljava/lang/Object;I)V

    .line 505
    return-object v2

    .line 506
    .line 507
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 508
    .line 509
    const-string v1, "collection too large"

    .line 510
    .line 511
    .line 512
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 513
    throw v0
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
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    :cond_0
    :goto_0
    move-object p1, v0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_1
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzd:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:[Ljava/lang/Object;

    .line 11
    const/4 v3, 0x1

    .line 12
    .line 13
    if-ne v1, v3, :cond_2

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    aget-object v1, v2, v1

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    aget-object p1, v2, v3

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzc:Ljava/lang/Object;

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_3
    instance-of v4, v1, [B

    .line 40
    const/4 v5, -0x1

    .line 41
    .line 42
    if-eqz v4, :cond_6

    .line 43
    move-object v4, v1

    .line 44
    .line 45
    check-cast v4, [B

    .line 46
    array-length v1, v4

    .line 47
    .line 48
    add-int/lit8 v6, v1, -0x1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 52
    move-result v1

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_common/zzy;->zza(I)I

    .line 56
    move-result v1

    .line 57
    :goto_1
    and-int/2addr v1, v6

    .line 58
    .line 59
    aget-byte v5, v4, v1

    .line 60
    .line 61
    const/16 v7, 0xff

    .line 62
    and-int/2addr v5, v7

    .line 63
    .line 64
    if-ne v5, v7, :cond_4

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :cond_4
    aget-object v7, v2, v5

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    move-result v7

    .line 72
    .line 73
    if-eqz v7, :cond_5

    .line 74
    .line 75
    xor-int/lit8 p1, v5, 0x1

    .line 76
    .line 77
    aget-object p1, v2, p1

    .line 78
    goto :goto_4

    .line 79
    .line 80
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_6
    instance-of v4, v1, [S

    .line 84
    .line 85
    if-eqz v4, :cond_9

    .line 86
    move-object v4, v1

    .line 87
    .line 88
    check-cast v4, [S

    .line 89
    array-length v1, v4

    .line 90
    .line 91
    add-int/lit8 v6, v1, -0x1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 95
    move-result v1

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_common/zzy;->zza(I)I

    .line 99
    move-result v1

    .line 100
    :goto_2
    and-int/2addr v1, v6

    .line 101
    .line 102
    aget-short v5, v4, v1

    .line 103
    int-to-char v5, v5

    .line 104
    .line 105
    .line 106
    const v7, 0xffff

    .line 107
    .line 108
    if-ne v5, v7, :cond_7

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :cond_7
    aget-object v7, v2, v5

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    move-result v7

    .line 116
    .line 117
    if-eqz v7, :cond_8

    .line 118
    .line 119
    xor-int/lit8 p1, v5, 0x1

    .line 120
    .line 121
    aget-object p1, v2, p1

    .line 122
    goto :goto_4

    .line 123
    .line 124
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 125
    goto :goto_2

    .line 126
    .line 127
    :cond_9
    check-cast v1, [I

    .line 128
    array-length v4, v1

    .line 129
    add-int/2addr v4, v5

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 133
    move-result v6

    .line 134
    .line 135
    .line 136
    invoke-static {v6}, Lcom/google/android/gms/internal/mlkit_common/zzy;->zza(I)I

    .line 137
    move-result v6

    .line 138
    :goto_3
    and-int/2addr v6, v4

    .line 139
    .line 140
    aget v7, v1, v6

    .line 141
    .line 142
    if-ne v7, v5, :cond_a

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_a
    aget-object v8, v2, v7

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    move-result v8

    .line 151
    .line 152
    if-eqz v8, :cond_c

    .line 153
    .line 154
    xor-int/lit8 p1, v7, 0x1

    .line 155
    .line 156
    aget-object p1, v2, p1

    .line 157
    .line 158
    :goto_4
    if-nez p1, :cond_b

    .line 159
    return-object v0

    .line 160
    :cond_b
    return-object p1

    .line 161
    .line 162
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 163
    goto :goto_3
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
.end method

.method public final size()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzd:I

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
    .line 17
    .line 18
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_common/zzab;
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzd:I

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzap;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:[Ljava/lang/Object;

    .line 7
    const/4 v3, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzap;-><init>([Ljava/lang/Object;II)V

    .line 11
    return-object v1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_common/zzaj;
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzd:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzan;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v2, p0, v1, v3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzan;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzai;[Ljava/lang/Object;II)V

    .line 11
    return-object v2
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final zze()Lcom/google/android/gms/internal/mlkit_common/zzaj;
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzd:I

    .line 3
    .line 4
    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzap;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:[Ljava/lang/Object;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzap;-><init>([Ljava/lang/Object;II)V

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzao;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzao;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzai;Lcom/google/android/gms/internal/mlkit_common/zzaf;)V

    .line 16
    return-object v0
    .line 17
    .line 18
.end method
