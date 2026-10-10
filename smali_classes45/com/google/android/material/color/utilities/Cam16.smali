.class public final Lcom/google/android/material/color/utilities/Cam16;
.super Ljava/lang/Object;
.source "Cam16.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field static final CAM16RGB_TO_XYZ:[[D

.field static final XYZ_TO_CAM16RGB:[[D


# instance fields
.field private final astar:D

.field private final bstar:D

.field private final chroma:D

.field private final hue:D

.field private final j:D

.field private final jstar:D

.field private final m:D

.field private final q:D

.field private final s:D

.field private final tempArray:[D


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    new-array v1, v0, [D

    .line 4
    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    new-array v2, v0, [D

    .line 9
    .line 10
    .line 11
    fill-array-data v2, :array_1

    .line 12
    .line 13
    new-array v3, v0, [D

    .line 14
    .line 15
    .line 16
    fill-array-data v3, :array_2

    .line 17
    .line 18
    .line 19
    filled-new-array {v1, v2, v3}, [[D

    .line 20
    move-result-object v1

    .line 21
    .line 22
    sput-object v1, Lcom/google/android/material/color/utilities/Cam16;->XYZ_TO_CAM16RGB:[[D

    .line 23
    .line 24
    new-array v1, v0, [D

    .line 25
    .line 26
    .line 27
    fill-array-data v1, :array_3

    .line 28
    .line 29
    new-array v2, v0, [D

    .line 30
    .line 31
    .line 32
    fill-array-data v2, :array_4

    .line 33
    .line 34
    new-array v0, v0, [D

    .line 35
    .line 36
    .line 37
    fill-array-data v0, :array_5

    .line 38
    .line 39
    .line 40
    filled-new-array {v1, v2, v0}, [[D

    .line 41
    move-result-object v0

    .line 42
    .line 43
    sput-object v0, Lcom/google/android/material/color/utilities/Cam16;->CAM16RGB_TO_XYZ:[[D

    .line 44
    return-void

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
    :array_0
    .array-data 8
        0x3fd9aeb3dd11be6eL    # 0.401288
        0x3fe4ce379b77c02bL    # 0.650173
        -0x4055a6e75ff609ddL    # -0.051461
    .end array-data

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
    :array_1
    .array-data 8
        -0x402ffb9bed30f063L    # -0.250268
        0x3ff345479d4d8341L    # 1.204414
        0x3fa77a2cecc814d7L    # 0.045854
    .end array-data

    :array_2
    .array-data 8
        -0x409ef8055fbb517aL    # -0.002079
        0x3fa9103c8e25c811L    # 0.048952
        0x3fee800431bde82dL    # 0.953127
    .end array-data

    :array_3
    .array-data 8
        0x3ffdcb079afef467L    # 1.8620678
        -0x400fd1e697792de9L    # -1.0112547
        0x3fc3188d6a8c3ae1L    # 0.14918678
    .end array-data

    :array_4
    .array-data 8
        0x3fd8cd3c1de87346L    # 0.38752654
        0x3fe3e2e5bddf7419L    # 0.62144744
        -0x407d9f0ccb1490dcL    # -0.00897398
    .end array-data

    :array_5
    .array-data 8
        -0x406fc73eee525892L    # -0.0158415
        -0x405e8770215031c7L    # -0.03412294
        0x3ff0cca7787f6d9eL    # 1.0499644
    .end array-data
.end method

.method private constructor <init>(DDDDDDDDD)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x3

    .line 5
    .line 6
    new-array v0, v0, [D

    .line 7
    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/material/color/utilities/Cam16;->tempArray:[D

    .line 12
    .line 13
    iput-wide p1, p0, Lcom/google/android/material/color/utilities/Cam16;->hue:D

    .line 14
    .line 15
    iput-wide p3, p0, Lcom/google/android/material/color/utilities/Cam16;->chroma:D

    .line 16
    .line 17
    iput-wide p5, p0, Lcom/google/android/material/color/utilities/Cam16;->j:D

    .line 18
    .line 19
    iput-wide p7, p0, Lcom/google/android/material/color/utilities/Cam16;->q:D

    .line 20
    .line 21
    iput-wide p9, p0, Lcom/google/android/material/color/utilities/Cam16;->m:D

    .line 22
    .line 23
    iput-wide p11, p0, Lcom/google/android/material/color/utilities/Cam16;->s:D

    .line 24
    .line 25
    iput-wide p13, p0, Lcom/google/android/material/color/utilities/Cam16;->jstar:D

    .line 26
    .line 27
    move-wide/from16 p1, p15

    .line 28
    .line 29
    iput-wide p1, p0, Lcom/google/android/material/color/utilities/Cam16;->astar:D

    .line 30
    .line 31
    move-wide/from16 p1, p17

    .line 32
    .line 33
    iput-wide p1, p0, Lcom/google/android/material/color/utilities/Cam16;->bstar:D

    .line 34
    return-void

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
    :array_0
    .array-data 8
        0x0
        0x0
        0x0
    .end array-data
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
.end method

.method public static fromInt(I)Lcom/google/android/material/color/utilities/Cam16;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/material/color/utilities/ViewingConditions;->DEFAULT:Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lcom/google/android/material/color/utilities/Cam16;->fromIntInViewingConditions(ILcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.end method

.method public static fromIntInViewingConditions(ILcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;
    .locals 18

    .line 1
    .line 2
    move/from16 v0, p0

    .line 3
    .line 4
    const/high16 v1, 0xff0000

    .line 5
    and-int/2addr v1, v0

    .line 6
    .line 7
    shr-int/lit8 v1, v1, 0x10

    .line 8
    .line 9
    .line 10
    const v2, 0xff00

    .line 11
    and-int/2addr v2, v0

    .line 12
    .line 13
    shr-int/lit8 v2, v2, 0x8

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lcom/google/android/material/color/utilities/ColorUtils;->linearized(I)D

    .line 19
    move-result-wide v3

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lcom/google/android/material/color/utilities/ColorUtils;->linearized(I)D

    .line 23
    move-result-wide v1

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/material/color/utilities/ColorUtils;->linearized(I)D

    .line 27
    move-result-wide v5

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const-wide v7, 0x3fda63c2e8477c96L    # 0.41233895

    .line 33
    mul-double/2addr v7, v3

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide v9, 0x3fd6e341ae4b2c79L    # 0.35762064

    .line 39
    mul-double/2addr v9, v1

    .line 40
    add-double/2addr v7, v9

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide v9, 0x3fc71af7273e5d5eL    # 0.18051042

    .line 46
    mul-double/2addr v9, v5

    .line 47
    .line 48
    add-double v11, v7, v9

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const-wide v7, 0x3fcb367a0f9096bcL    # 0.2126

    .line 54
    mul-double/2addr v7, v3

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const-wide v9, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 60
    mul-double/2addr v9, v1

    .line 61
    add-double/2addr v7, v9

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    const-wide v9, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 67
    mul-double/2addr v9, v5

    .line 68
    .line 69
    add-double v13, v7, v9

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    const-wide v7, 0x3f93c8fde0401c25L    # 0.01932141

    .line 75
    mul-double/2addr v3, v7

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    const-wide v7, 0x3fbe818525c434ceL    # 0.11916382

    .line 81
    mul-double/2addr v1, v7

    .line 82
    add-double/2addr v3, v1

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    const-wide v0, 0x3fee693974c0c730L    # 0.95034478

    .line 88
    mul-double/2addr v5, v0

    .line 89
    .line 90
    add-double v15, v3, v5

    .line 91
    .line 92
    move-object/from16 v17, p1

    .line 93
    .line 94
    .line 95
    invoke-static/range {v11 .. v17}, Lcom/google/android/material/color/utilities/Cam16;->fromXyzInViewingConditions(DDDLcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;

    .line 96
    move-result-object v0

    .line 97
    return-object v0
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
.end method

.method public static fromJch(DDD)Lcom/google/android/material/color/utilities/Cam16;
    .locals 7

    .line 1
    .line 2
    sget-object v6, Lcom/google/android/material/color/utilities/ViewingConditions;->DEFAULT:Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 3
    move-wide v0, p0

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    .line 7
    .line 8
    invoke-static/range {v0 .. v6}, Lcom/google/android/material/color/utilities/Cam16;->fromJchInViewingConditions(DDDLcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method private static fromJchInViewingConditions(DDDLcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;
    .locals 27

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getC()D

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    .line 7
    .line 8
    div-double v0, v2, v0

    .line 9
    .line 10
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 11
    .line 12
    div-double v4, p0, v4

    .line 13
    .line 14
    .line 15
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 16
    move-result-wide v6

    .line 17
    mul-double/2addr v0, v6

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getAw()D

    .line 21
    move-result-wide v6

    .line 22
    add-double/2addr v6, v2

    .line 23
    mul-double/2addr v0, v6

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFlRoot()D

    .line 27
    move-result-wide v6

    .line 28
    .line 29
    mul-double v15, v0, v6

    .line 30
    .line 31
    .line 32
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFlRoot()D

    .line 33
    move-result-wide v0

    .line 34
    .line 35
    mul-double v17, p2, v0

    .line 36
    .line 37
    .line 38
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 39
    move-result-wide v0

    .line 40
    .line 41
    div-double v0, p2, v0

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getC()D

    .line 45
    move-result-wide v4

    .line 46
    mul-double/2addr v0, v4

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getAw()D

    .line 50
    move-result-wide v4

    .line 51
    add-double/2addr v4, v2

    .line 52
    div-double/2addr v0, v4

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 56
    move-result-wide v0

    .line 57
    .line 58
    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    .line 59
    .line 60
    mul-double v19, v0, v2

    .line 61
    .line 62
    .line 63
    invoke-static/range {p4 .. p5}, Ljava/lang/Math;->toRadians(D)D

    .line 64
    move-result-wide v0

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    const-wide v2, 0x3ffb333333333334L    # 1.7000000000000002

    .line 70
    .line 71
    mul-double v2, v2, p0

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    const-wide v4, 0x3f7cac083126e979L    # 0.007

    .line 77
    .line 78
    mul-double v4, v4, p0

    .line 79
    .line 80
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 81
    add-double/2addr v4, v6

    .line 82
    .line 83
    div-double v21, v2, v4

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    const-wide v2, 0x3f9758e219652bd4L    # 0.0228

    .line 89
    .line 90
    mul-double v2, v2, v17

    .line 91
    .line 92
    .line 93
    invoke-static {v2, v3}, Ljava/lang/Math;->log1p(D)D

    .line 94
    move-result-wide v2

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    const-wide v4, 0x4045ee08fb823ee0L    # 43.859649122807014

    .line 100
    mul-double/2addr v2, v4

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 104
    move-result-wide v4

    .line 105
    .line 106
    mul-double v23, v2, v4

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 110
    move-result-wide v0

    .line 111
    .line 112
    mul-double v25, v2, v0

    .line 113
    .line 114
    new-instance v8, Lcom/google/android/material/color/utilities/Cam16;

    .line 115
    .line 116
    move-wide/from16 v13, p0

    .line 117
    .line 118
    move-wide/from16 v11, p2

    .line 119
    .line 120
    move-wide/from16 v9, p4

    .line 121
    .line 122
    .line 123
    invoke-direct/range {v8 .. v26}, Lcom/google/android/material/color/utilities/Cam16;-><init>(DDDDDDDDD)V

    .line 124
    return-object v8
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
.end method

.method public static fromUcs(DDD)Lcom/google/android/material/color/utilities/Cam16;
    .locals 7

    .line 1
    .line 2
    sget-object v6, Lcom/google/android/material/color/utilities/ViewingConditions;->DEFAULT:Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 3
    move-wide v0, p0

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    .line 7
    .line 8
    invoke-static/range {v0 .. v6}, Lcom/google/android/material/color/utilities/Cam16;->fromUcsInViewingConditions(DDDLcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method public static fromUcsInViewingConditions(DDDLcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p2, p3, p4, p5}, Ljava/lang/Math;->hypot(DD)D

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-wide v2, 0x3f9758e219652bd4L    # 0.0228

    .line 10
    mul-double/2addr v0, v2

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->expm1(D)D

    .line 14
    move-result-wide v0

    .line 15
    div-double/2addr v0, v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFlRoot()D

    .line 19
    move-result-wide v2

    .line 20
    div-double/2addr v0, v2

    .line 21
    .line 22
    .line 23
    invoke-static {p4, p5, p2, p3}, Ljava/lang/Math;->atan2(DD)D

    .line 24
    move-result-wide p2

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const-wide p4, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 30
    mul-double/2addr p2, p4

    .line 31
    .line 32
    const-wide/16 p4, 0x0

    .line 33
    .line 34
    cmpg-double p4, p2, p4

    .line 35
    .line 36
    if-gez p4, :cond_0

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const-wide p4, 0x4076800000000000L    # 360.0

    .line 42
    add-double/2addr p2, p4

    .line 43
    :cond_0
    move-wide p4, p2

    .line 44
    .line 45
    const-wide/high16 p2, 0x4059000000000000L    # 100.0

    .line 46
    .line 47
    sub-double p2, p0, p2

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    const-wide v2, 0x3f7cac083126e979L    # 0.007

    .line 53
    mul-double/2addr p2, v2

    .line 54
    .line 55
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 56
    sub-double/2addr v2, p2

    .line 57
    div-double/2addr p0, v2

    .line 58
    move-wide p2, v0

    .line 59
    .line 60
    .line 61
    invoke-static/range {p0 .. p6}, Lcom/google/android/material/color/utilities/Cam16;->fromJchInViewingConditions(DDDLcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;

    .line 62
    move-result-object p0

    .line 63
    return-object p0
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
.end method

.method public static fromXyzInViewingConditions(DDDLcom/google/android/material/color/utilities/ViewingConditions;)Lcom/google/android/material/color/utilities/Cam16;
    .locals 35

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/material/color/utilities/Cam16;->XYZ_TO_CAM16RGB:[[D

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    aget-object v2, v0, v1

    .line 6
    .line 7
    aget-wide v3, v2, v1

    .line 8
    .line 9
    mul-double v3, v3, p0

    .line 10
    const/4 v5, 0x1

    .line 11
    .line 12
    aget-wide v6, v2, v5

    .line 13
    .line 14
    mul-double v6, v6, p2

    .line 15
    add-double/2addr v3, v6

    .line 16
    const/4 v6, 0x2

    .line 17
    .line 18
    aget-wide v7, v2, v6

    .line 19
    .line 20
    mul-double v7, v7, p4

    .line 21
    add-double/2addr v3, v7

    .line 22
    .line 23
    aget-object v2, v0, v5

    .line 24
    .line 25
    aget-wide v7, v2, v1

    .line 26
    .line 27
    mul-double v7, v7, p0

    .line 28
    .line 29
    aget-wide v9, v2, v5

    .line 30
    .line 31
    mul-double v9, v9, p2

    .line 32
    add-double/2addr v7, v9

    .line 33
    .line 34
    aget-wide v9, v2, v6

    .line 35
    .line 36
    mul-double v9, v9, p4

    .line 37
    add-double/2addr v7, v9

    .line 38
    .line 39
    aget-object v0, v0, v6

    .line 40
    .line 41
    aget-wide v9, v0, v1

    .line 42
    .line 43
    mul-double v9, v9, p0

    .line 44
    .line 45
    aget-wide v11, v0, v5

    .line 46
    .line 47
    mul-double v11, v11, p2

    .line 48
    add-double/2addr v9, v11

    .line 49
    .line 50
    aget-wide v11, v0, v6

    .line 51
    .line 52
    mul-double v11, v11, p4

    .line 53
    add-double/2addr v9, v11

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getRgbD()[D

    .line 57
    move-result-object v0

    .line 58
    .line 59
    aget-wide v1, v0, v1

    .line 60
    mul-double/2addr v1, v3

    .line 61
    .line 62
    .line 63
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getRgbD()[D

    .line 64
    move-result-object v0

    .line 65
    .line 66
    aget-wide v3, v0, v5

    .line 67
    mul-double/2addr v3, v7

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getRgbD()[D

    .line 71
    move-result-object v0

    .line 72
    .line 73
    aget-wide v5, v0, v6

    .line 74
    mul-double/2addr v5, v9

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFl()D

    .line 78
    move-result-wide v7

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 82
    move-result-wide v9

    .line 83
    mul-double/2addr v7, v9

    .line 84
    .line 85
    const-wide/high16 v9, 0x4059000000000000L    # 100.0

    .line 86
    div-double/2addr v7, v9

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    const-wide v11, 0x3fdae147ae147ae1L    # 0.42

    .line 92
    .line 93
    .line 94
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 95
    move-result-wide v7

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFl()D

    .line 99
    move-result-wide v13

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 103
    move-result-wide v15

    .line 104
    mul-double/2addr v13, v15

    .line 105
    div-double/2addr v13, v9

    .line 106
    .line 107
    .line 108
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 109
    move-result-wide v13

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFl()D

    .line 113
    move-result-wide v15

    .line 114
    .line 115
    .line 116
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 117
    move-result-wide v17

    .line 118
    .line 119
    mul-double v15, v15, v17

    .line 120
    .line 121
    move-wide/from16 p0, v9

    .line 122
    .line 123
    div-double v9, v15, p0

    .line 124
    .line 125
    .line 126
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 127
    move-result-wide v9

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v2}, Ljava/lang/Math;->signum(D)D

    .line 131
    move-result-wide v0

    .line 132
    .line 133
    const-wide/high16 v11, 0x4079000000000000L    # 400.0

    .line 134
    mul-double/2addr v0, v11

    .line 135
    mul-double/2addr v0, v7

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    const-wide v15, 0x403b2147ae147ae1L    # 27.13

    .line 141
    add-double/2addr v7, v15

    .line 142
    div-double/2addr v0, v7

    .line 143
    .line 144
    .line 145
    invoke-static {v3, v4}, Ljava/lang/Math;->signum(D)D

    .line 146
    move-result-wide v2

    .line 147
    mul-double/2addr v2, v11

    .line 148
    mul-double/2addr v2, v13

    .line 149
    add-double/2addr v13, v15

    .line 150
    div-double/2addr v2, v13

    .line 151
    .line 152
    .line 153
    invoke-static {v5, v6}, Ljava/lang/Math;->signum(D)D

    .line 154
    move-result-wide v4

    .line 155
    mul-double/2addr v4, v11

    .line 156
    mul-double/2addr v4, v9

    .line 157
    add-double/2addr v9, v15

    .line 158
    div-double/2addr v4, v9

    .line 159
    .line 160
    const-wide/high16 v6, 0x4026000000000000L    # 11.0

    .line 161
    .line 162
    mul-double v8, v0, v6

    .line 163
    .line 164
    const-wide/high16 v10, -0x3fd8000000000000L    # -12.0

    .line 165
    mul-double/2addr v10, v2

    .line 166
    add-double/2addr v8, v10

    .line 167
    add-double/2addr v8, v4

    .line 168
    div-double/2addr v8, v6

    .line 169
    .line 170
    add-double v6, v0, v2

    .line 171
    .line 172
    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    .line 173
    .line 174
    mul-double v12, v4, v10

    .line 175
    sub-double/2addr v6, v12

    .line 176
    .line 177
    const-wide/high16 v12, 0x4022000000000000L    # 9.0

    .line 178
    div-double/2addr v6, v12

    .line 179
    .line 180
    const-wide/high16 v12, 0x4034000000000000L    # 20.0

    .line 181
    .line 182
    mul-double v14, v0, v12

    .line 183
    mul-double/2addr v2, v12

    .line 184
    add-double/2addr v14, v2

    .line 185
    .line 186
    const-wide/high16 v16, 0x4035000000000000L    # 21.0

    .line 187
    .line 188
    mul-double v16, v16, v4

    .line 189
    .line 190
    add-double v14, v14, v16

    .line 191
    div-double/2addr v14, v12

    .line 192
    .line 193
    const-wide/high16 v16, 0x4044000000000000L    # 40.0

    .line 194
    .line 195
    mul-double v0, v0, v16

    .line 196
    add-double/2addr v0, v2

    .line 197
    add-double/2addr v0, v4

    .line 198
    div-double/2addr v0, v12

    .line 199
    .line 200
    .line 201
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    .line 202
    move-result-wide v2

    .line 203
    .line 204
    .line 205
    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    .line 206
    move-result-wide v2

    .line 207
    .line 208
    const-wide/16 v4, 0x0

    .line 209
    .line 210
    cmpg-double v4, v2, v4

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    const-wide v12, 0x4076800000000000L    # 360.0

    .line 216
    .line 217
    if-gez v4, :cond_1

    .line 218
    add-double/2addr v2, v12

    .line 219
    .line 220
    :cond_0
    :goto_0
    move-wide/from16 v17, v2

    .line 221
    goto :goto_1

    .line 222
    .line 223
    :cond_1
    cmpl-double v4, v2, v12

    .line 224
    .line 225
    if-ltz v4, :cond_0

    .line 226
    sub-double/2addr v2, v12

    .line 227
    goto :goto_0

    .line 228
    .line 229
    .line 230
    :goto_1
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->toRadians(D)D

    .line 231
    move-result-wide v2

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getNbb()D

    .line 235
    move-result-wide v4

    .line 236
    mul-double/2addr v0, v4

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getAw()D

    .line 240
    move-result-wide v4

    .line 241
    div-double/2addr v0, v4

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getC()D

    .line 245
    move-result-wide v4

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getZ()D

    .line 249
    move-result-wide v19

    .line 250
    .line 251
    mul-double v4, v4, v19

    .line 252
    .line 253
    .line 254
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 255
    move-result-wide v0

    .line 256
    .line 257
    mul-double v21, v0, p0

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getC()D

    .line 261
    move-result-wide v0

    .line 262
    .line 263
    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    .line 264
    .line 265
    div-double v0, v4, v0

    .line 266
    .line 267
    div-double v19, v21, p0

    .line 268
    .line 269
    .line 270
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sqrt(D)D

    .line 271
    move-result-wide v23

    .line 272
    .line 273
    mul-double v0, v0, v23

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getAw()D

    .line 277
    move-result-wide v23

    .line 278
    .line 279
    add-double v23, v23, v4

    .line 280
    .line 281
    mul-double v0, v0, v23

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFlRoot()D

    .line 285
    move-result-wide v23

    .line 286
    .line 287
    mul-double v23, v23, v0

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    const-wide v0, 0x403423d70a3d70a4L    # 20.14

    .line 293
    .line 294
    cmpg-double v0, v17, v0

    .line 295
    .line 296
    if-gez v0, :cond_2

    .line 297
    .line 298
    add-double v12, v17, v12

    .line 299
    goto :goto_2

    .line 300
    .line 301
    :cond_2
    move-wide/from16 v12, v17

    .line 302
    .line 303
    .line 304
    :goto_2
    invoke-static {v12, v13}, Ljava/lang/Math;->toRadians(D)D

    .line 305
    move-result-wide v0

    .line 306
    add-double/2addr v0, v10

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 310
    move-result-wide v0

    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    const-wide v10, 0x400e666666666666L    # 3.8

    .line 316
    add-double/2addr v0, v10

    .line 317
    .line 318
    const-wide/high16 v10, 0x3fd0000000000000L    # 0.25

    .line 319
    mul-double/2addr v0, v10

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    const-wide v10, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    .line 325
    mul-double/2addr v0, v10

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getNc()D

    .line 329
    move-result-wide v10

    .line 330
    mul-double/2addr v0, v10

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getNcb()D

    .line 334
    move-result-wide v10

    .line 335
    mul-double/2addr v0, v10

    .line 336
    .line 337
    .line 338
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->hypot(DD)D

    .line 339
    move-result-wide v6

    .line 340
    mul-double/2addr v0, v6

    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    const-wide v6, 0x3fd3851eb851eb85L    # 0.305

    .line 346
    add-double/2addr v14, v6

    .line 347
    div-double/2addr v0, v14

    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    const-wide v6, 0x3fd28f5c28f5c28fL    # 0.29

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getN()D

    .line 356
    move-result-wide v8

    .line 357
    .line 358
    .line 359
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 360
    move-result-wide v6

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    const-wide v8, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 366
    sub-double/2addr v8, v6

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    const-wide v6, 0x3fe75c28f5c28f5cL    # 0.73

    .line 372
    .line 373
    .line 374
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 375
    move-result-wide v6

    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    const-wide v8, 0x3feccccccccccccdL    # 0.9

    .line 381
    .line 382
    .line 383
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 384
    move-result-wide v0

    .line 385
    mul-double/2addr v6, v0

    .line 386
    .line 387
    .line 388
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sqrt(D)D

    .line 389
    move-result-wide v0

    .line 390
    .line 391
    mul-double v19, v6, v0

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFlRoot()D

    .line 395
    move-result-wide v0

    .line 396
    .line 397
    mul-double v25, v19, v0

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getC()D

    .line 401
    move-result-wide v0

    .line 402
    mul-double/2addr v6, v0

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/material/color/utilities/ViewingConditions;->getAw()D

    .line 406
    move-result-wide v0

    .line 407
    add-double/2addr v0, v4

    .line 408
    div-double/2addr v6, v0

    .line 409
    .line 410
    .line 411
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    .line 412
    move-result-wide v0

    .line 413
    .line 414
    const-wide/high16 v4, 0x4049000000000000L    # 50.0

    .line 415
    .line 416
    mul-double v27, v0, v4

    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    const-wide v0, 0x3ffb333333333334L    # 1.7000000000000002

    .line 422
    .line 423
    mul-double v0, v0, v21

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    const-wide v4, 0x3f7cac083126e979L    # 0.007

    .line 429
    .line 430
    mul-double v4, v4, v21

    .line 431
    .line 432
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 433
    add-double/2addr v4, v6

    .line 434
    .line 435
    div-double v29, v0, v4

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    const-wide v0, 0x3f9758e219652bd4L    # 0.0228

    .line 441
    .line 442
    mul-double v0, v0, v25

    .line 443
    .line 444
    .line 445
    invoke-static {v0, v1}, Ljava/lang/Math;->log1p(D)D

    .line 446
    move-result-wide v0

    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    const-wide v4, 0x4045ee08fb823ee0L    # 43.859649122807014

    .line 452
    mul-double/2addr v0, v4

    .line 453
    .line 454
    .line 455
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 456
    move-result-wide v4

    .line 457
    .line 458
    mul-double v31, v0, v4

    .line 459
    .line 460
    .line 461
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 462
    move-result-wide v2

    .line 463
    .line 464
    mul-double v33, v0, v2

    .line 465
    .line 466
    new-instance v16, Lcom/google/android/material/color/utilities/Cam16;

    .line 467
    .line 468
    .line 469
    invoke-direct/range {v16 .. v34}, Lcom/google/android/material/color/utilities/Cam16;-><init>(DDDDDDDDD)V

    .line 470
    return-object v16
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
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
.end method


# virtual methods
.method public distance(Lcom/google/android/material/color/utilities/Cam16;)D
    .locals 8
    .param p1    # Lcom/google/android/material/color/utilities/Cam16;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Cam16;->getJstar()D

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Cam16;->getJstar()D

    .line 8
    move-result-wide v2

    .line 9
    sub-double/2addr v0, v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Cam16;->getAstar()D

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Cam16;->getAstar()D

    .line 17
    move-result-wide v4

    .line 18
    sub-double/2addr v2, v4

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Cam16;->getBstar()D

    .line 22
    move-result-wide v4

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Cam16;->getBstar()D

    .line 26
    move-result-wide v6

    .line 27
    sub-double/2addr v4, v6

    .line 28
    mul-double/2addr v0, v0

    .line 29
    mul-double/2addr v2, v2

    .line 30
    add-double/2addr v0, v2

    .line 31
    mul-double/2addr v4, v4

    .line 32
    add-double/2addr v0, v4

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 36
    move-result-wide v0

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const-wide v2, 0x3fe428f5c28f5c29L    # 0.63

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 45
    move-result-wide v0

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const-wide v2, 0x3ff68f5c28f5c28fL    # 1.41

    .line 51
    mul-double/2addr v0, v2

    .line 52
    return-wide v0
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
.end method

.method public getAstar()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->astar:D

    .line 3
    return-wide v0
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

.method public getBstar()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->bstar:D

    .line 3
    return-wide v0
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

.method public getChroma()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->chroma:D

    .line 3
    return-wide v0
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

.method public getHue()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->hue:D

    .line 3
    return-wide v0
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

.method public getJ()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->j:D

    .line 3
    return-wide v0
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

.method public getJstar()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->jstar:D

    .line 3
    return-wide v0
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

.method public getM()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->m:D

    .line 3
    return-wide v0
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

.method public getQ()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->q:D

    .line 3
    return-wide v0
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

.method public getS()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/google/android/material/color/utilities/Cam16;->s:D

    .line 3
    return-wide v0
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

.method public toInt()I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/material/color/utilities/ViewingConditions;->DEFAULT:Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/Cam16;->viewed(Lcom/google/android/material/color/utilities/ViewingConditions;)I

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
.end method

.method public viewed(Lcom/google/android/material/color/utilities/ViewingConditions;)I
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/color/utilities/Cam16;->tempArray:[D

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/color/utilities/Cam16;->xyzInViewingConditions(Lcom/google/android/material/color/utilities/ViewingConditions;[D)[D

    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    aget-wide v1, p1, v0

    .line 10
    const/4 v0, 0x1

    .line 11
    .line 12
    aget-wide v3, p1, v0

    .line 13
    const/4 v0, 0x2

    .line 14
    .line 15
    aget-wide v5, p1, v0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v1 .. v6}, Lcom/google/android/material/color/utilities/ColorUtils;->argbFromXyz(DDD)I

    .line 19
    move-result p1

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
.end method

.method public xyzInViewingConditions(Lcom/google/android/material/color/utilities/ViewingConditions;[D)[D
    .locals 24

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/color/utilities/Cam16;->getChroma()D

    .line 4
    move-result-wide v3

    .line 5
    .line 6
    const-wide/16 v5, 0x0

    .line 7
    .line 8
    cmpl-double v3, v3, v5

    .line 9
    .line 10
    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/color/utilities/Cam16;->getJ()D

    .line 16
    move-result-wide v3

    .line 17
    .line 18
    cmpl-double v3, v3, v5

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/color/utilities/Cam16;->getChroma()D

    .line 25
    move-result-wide v3

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/color/utilities/Cam16;->getJ()D

    .line 29
    move-result-wide v9

    .line 30
    div-double/2addr v9, v7

    .line 31
    .line 32
    .line 33
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    .line 34
    move-result-wide v9

    .line 35
    div-double/2addr v3, v9

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    move-wide v3, v5

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getN()D

    .line 41
    move-result-wide v9

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    const-wide v11, 0x3fd28f5c28f5c28fL    # 0.29

    .line 47
    .line 48
    .line 49
    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 50
    move-result-wide v9

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    const-wide v11, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 56
    sub-double/2addr v11, v9

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    const-wide v9, 0x3fe75c28f5c28f5cL    # 0.73

    .line 62
    .line 63
    .line 64
    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 65
    move-result-wide v9

    .line 66
    div-double/2addr v3, v9

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    const-wide v9, 0x3ff1c71c71c71c72L    # 1.1111111111111112

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 75
    move-result-wide v3

    .line 76
    .line 77
    .line 78
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/color/utilities/Cam16;->getHue()D

    .line 79
    move-result-wide v9

    .line 80
    .line 81
    .line 82
    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    .line 83
    move-result-wide v9

    .line 84
    .line 85
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 86
    add-double/2addr v11, v9

    .line 87
    .line 88
    .line 89
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 90
    move-result-wide v11

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    const-wide v13, 0x400e666666666666L    # 3.8

    .line 96
    add-double/2addr v11, v13

    .line 97
    .line 98
    const-wide/high16 v13, 0x3fd0000000000000L    # 0.25

    .line 99
    mul-double/2addr v11, v13

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getAw()D

    .line 103
    move-result-wide v13

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/color/utilities/Cam16;->getJ()D

    .line 107
    move-result-wide v15

    .line 108
    .line 109
    const/16 v17, 0x2

    .line 110
    .line 111
    const/16 v18, 0x1

    .line 112
    .line 113
    div-double v0, v15, v7

    .line 114
    .line 115
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getC()D

    .line 119
    move-result-wide v19

    .line 120
    .line 121
    div-double v15, v15, v19

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getZ()D

    .line 125
    move-result-wide v19

    .line 126
    .line 127
    move-wide/from16 v22, v3

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    div-double v2, v15, v19

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 135
    move-result-wide v0

    .line 136
    mul-double/2addr v13, v0

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    const-wide v0, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    .line 142
    mul-double/2addr v11, v0

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getNc()D

    .line 146
    move-result-wide v0

    .line 147
    mul-double/2addr v11, v0

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getNcb()D

    .line 151
    move-result-wide v0

    .line 152
    mul-double/2addr v11, v0

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getNbb()D

    .line 156
    move-result-wide v0

    .line 157
    div-double/2addr v13, v0

    .line 158
    .line 159
    .line 160
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 161
    move-result-wide v0

    .line 162
    .line 163
    .line 164
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    .line 165
    move-result-wide v2

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    const-wide v9, 0x3fd3851eb851eb85L    # 0.305

    .line 171
    add-double/2addr v9, v13

    .line 172
    .line 173
    const-wide/high16 v15, 0x4037000000000000L    # 23.0

    .line 174
    mul-double/2addr v9, v15

    .line 175
    .line 176
    mul-double v9, v9, v22

    .line 177
    mul-double/2addr v11, v15

    .line 178
    .line 179
    const-wide/high16 v15, 0x4026000000000000L    # 11.0

    .line 180
    .line 181
    mul-double v15, v15, v22

    .line 182
    mul-double/2addr v15, v2

    .line 183
    add-double/2addr v11, v15

    .line 184
    .line 185
    const-wide/high16 v15, 0x405b000000000000L    # 108.0

    .line 186
    .line 187
    mul-double v15, v15, v22

    .line 188
    mul-double/2addr v15, v0

    .line 189
    add-double/2addr v11, v15

    .line 190
    div-double/2addr v9, v11

    .line 191
    mul-double/2addr v2, v9

    .line 192
    mul-double/2addr v9, v0

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    const-wide v0, 0x407cc00000000000L    # 460.0

    .line 198
    mul-double/2addr v13, v0

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    const-wide v0, 0x407c300000000000L    # 451.0

    .line 204
    mul-double/2addr v0, v2

    .line 205
    add-double/2addr v0, v13

    .line 206
    .line 207
    const-wide/high16 v11, 0x4072000000000000L    # 288.0

    .line 208
    mul-double/2addr v11, v9

    .line 209
    add-double/2addr v0, v11

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    const-wide v11, 0x4095ec0000000000L    # 1403.0

    .line 215
    div-double/2addr v0, v11

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    const-wide v15, 0x408bd80000000000L    # 891.0

    .line 221
    mul-double/2addr v15, v2

    .line 222
    .line 223
    sub-double v15, v13, v15

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    const-wide v19, 0x4070500000000000L    # 261.0

    .line 229
    .line 230
    mul-double v19, v19, v9

    .line 231
    .line 232
    sub-double v15, v15, v19

    .line 233
    div-double/2addr v15, v11

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    const-wide v19, 0x406b800000000000L    # 220.0

    .line 239
    .line 240
    mul-double v2, v2, v19

    .line 241
    sub-double/2addr v13, v2

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    const-wide v2, 0x40b89c0000000000L    # 6300.0

    .line 247
    mul-double/2addr v9, v2

    .line 248
    sub-double/2addr v13, v9

    .line 249
    div-double/2addr v13, v11

    .line 250
    .line 251
    .line 252
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 253
    move-result-wide v2

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    const-wide v9, 0x403b2147ae147ae1L    # 27.13

    .line 259
    mul-double/2addr v2, v9

    .line 260
    .line 261
    .line 262
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 263
    move-result-wide v11

    .line 264
    .line 265
    const-wide/high16 v19, 0x4079000000000000L    # 400.0

    .line 266
    .line 267
    sub-double v11, v19, v11

    .line 268
    div-double/2addr v2, v11

    .line 269
    .line 270
    .line 271
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 272
    move-result-wide v2

    .line 273
    .line 274
    .line 275
    invoke-static {v0, v1}, Ljava/lang/Math;->signum(D)D

    .line 276
    move-result-wide v0

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFl()D

    .line 280
    move-result-wide v11

    .line 281
    .line 282
    div-double v11, v7, v11

    .line 283
    mul-double/2addr v0, v11

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    const-wide v11, 0x40030c30c30c30c3L    # 2.380952380952381

    .line 289
    .line 290
    .line 291
    invoke-static {v2, v3, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 292
    move-result-wide v2

    .line 293
    mul-double/2addr v0, v2

    .line 294
    .line 295
    .line 296
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    .line 297
    move-result-wide v2

    .line 298
    mul-double/2addr v2, v9

    .line 299
    .line 300
    .line 301
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    .line 302
    move-result-wide v22

    .line 303
    .line 304
    sub-double v22, v19, v22

    .line 305
    .line 306
    div-double v2, v2, v22

    .line 307
    .line 308
    .line 309
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 310
    move-result-wide v2

    .line 311
    .line 312
    .line 313
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->signum(D)D

    .line 314
    move-result-wide v15

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFl()D

    .line 318
    move-result-wide v22

    .line 319
    .line 320
    div-double v22, v7, v22

    .line 321
    .line 322
    mul-double v15, v15, v22

    .line 323
    .line 324
    .line 325
    invoke-static {v2, v3, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 326
    move-result-wide v2

    .line 327
    mul-double/2addr v15, v2

    .line 328
    .line 329
    .line 330
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 331
    move-result-wide v2

    .line 332
    mul-double/2addr v2, v9

    .line 333
    .line 334
    .line 335
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 336
    move-result-wide v9

    .line 337
    .line 338
    sub-double v19, v19, v9

    .line 339
    .line 340
    div-double v2, v2, v19

    .line 341
    .line 342
    .line 343
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 344
    move-result-wide v2

    .line 345
    .line 346
    .line 347
    invoke-static {v13, v14}, Ljava/lang/Math;->signum(D)D

    .line 348
    move-result-wide v4

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getFl()D

    .line 352
    move-result-wide v9

    .line 353
    div-double/2addr v7, v9

    .line 354
    mul-double/2addr v4, v7

    .line 355
    .line 356
    .line 357
    invoke-static {v2, v3, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 358
    move-result-wide v2

    .line 359
    mul-double/2addr v4, v2

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getRgbD()[D

    .line 363
    move-result-object v2

    .line 364
    .line 365
    aget-wide v6, v2, v21

    .line 366
    div-double/2addr v0, v6

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getRgbD()[D

    .line 370
    move-result-object v2

    .line 371
    .line 372
    aget-wide v6, v2, v18

    .line 373
    div-double/2addr v15, v6

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/material/color/utilities/ViewingConditions;->getRgbD()[D

    .line 377
    move-result-object v2

    .line 378
    .line 379
    aget-wide v6, v2, v17

    .line 380
    div-double/2addr v4, v6

    .line 381
    .line 382
    sget-object v2, Lcom/google/android/material/color/utilities/Cam16;->CAM16RGB_TO_XYZ:[[D

    .line 383
    .line 384
    aget-object v3, v2, v21

    .line 385
    .line 386
    aget-wide v6, v3, v21

    .line 387
    mul-double/2addr v6, v0

    .line 388
    .line 389
    aget-wide v8, v3, v18

    .line 390
    mul-double/2addr v8, v15

    .line 391
    add-double/2addr v6, v8

    .line 392
    .line 393
    aget-wide v8, v3, v17

    .line 394
    mul-double/2addr v8, v4

    .line 395
    add-double/2addr v6, v8

    .line 396
    .line 397
    aget-object v3, v2, v18

    .line 398
    .line 399
    aget-wide v8, v3, v21

    .line 400
    mul-double/2addr v8, v0

    .line 401
    .line 402
    aget-wide v10, v3, v18

    .line 403
    mul-double/2addr v10, v15

    .line 404
    add-double/2addr v8, v10

    .line 405
    .line 406
    aget-wide v10, v3, v17

    .line 407
    mul-double/2addr v10, v4

    .line 408
    add-double/2addr v8, v10

    .line 409
    .line 410
    aget-object v2, v2, v17

    .line 411
    .line 412
    aget-wide v10, v2, v21

    .line 413
    mul-double/2addr v0, v10

    .line 414
    .line 415
    aget-wide v10, v2, v18

    .line 416
    mul-double/2addr v15, v10

    .line 417
    add-double/2addr v0, v15

    .line 418
    .line 419
    aget-wide v10, v2, v17

    .line 420
    mul-double/2addr v4, v10

    .line 421
    add-double/2addr v0, v4

    .line 422
    .line 423
    if-eqz p2, :cond_2

    .line 424
    .line 425
    aput-wide v6, p2, v21

    .line 426
    .line 427
    aput-wide v8, p2, v18

    .line 428
    .line 429
    aput-wide v0, p2, v17

    .line 430
    return-object p2

    .line 431
    :cond_2
    const/4 v2, 0x3

    .line 432
    .line 433
    new-array v2, v2, [D

    .line 434
    .line 435
    aput-wide v6, v2, v21

    .line 436
    .line 437
    aput-wide v8, v2, v18

    .line 438
    .line 439
    aput-wide v0, v2, v17

    .line 440
    return-object v2
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
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
.end method
