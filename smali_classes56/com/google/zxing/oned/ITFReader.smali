.class public final Lcom/google/zxing/oned/ITFReader;
.super Lcom/google/zxing/oned/OneDReader;
.source "ITFReader.java"


# static fields
.field private static final DEFAULT_ALLOWED_LENGTHS:[I

.field private static final END_PATTERN_REVERSED:[[I

.field private static final MAX_AVG_VARIANCE:F = 0.38f

.field private static final MAX_INDIVIDUAL_VARIANCE:F = 0.5f

.field private static final N:I = 0x1

.field private static final PATTERNS:[[I

.field private static final START_PATTERN:[I

.field private static final W:I = 0x3

.field private static final w:I = 0x2


# instance fields
.field private narrowLineWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    .line 2
    const/16 v0, 0xc

    .line 3
    .line 4
    const/16 v1, 0xe

    .line 5
    const/4 v2, 0x6

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/16 v4, 0xa

    .line 10
    .line 11
    .line 12
    filled-new-array {v2, v3, v4, v0, v1}, [I

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sput-object v0, Lcom/google/zxing/oned/ITFReader;->DEFAULT_ALLOWED_LENGTHS:[I

    .line 16
    const/4 v0, 0x1

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v0, v0, v0}, [I

    .line 20
    move-result-object v1

    .line 21
    .line 22
    sput-object v1, Lcom/google/zxing/oned/ITFReader;->START_PATTERN:[I

    .line 23
    const/4 v1, 0x2

    .line 24
    .line 25
    .line 26
    filled-new-array {v0, v0, v1}, [I

    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x3

    .line 29
    .line 30
    .line 31
    filled-new-array {v0, v0, v3}, [I

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    filled-new-array {v2, v4}, [[I

    .line 36
    move-result-object v2

    .line 37
    .line 38
    sput-object v2, Lcom/google/zxing/oned/ITFReader;->END_PATTERN_REVERSED:[[I

    .line 39
    .line 40
    .line 41
    filled-new-array {v0, v0, v1, v1, v0}, [I

    .line 42
    move-result-object v4

    .line 43
    .line 44
    .line 45
    filled-new-array {v1, v0, v0, v0, v1}, [I

    .line 46
    move-result-object v5

    .line 47
    .line 48
    .line 49
    filled-new-array {v0, v1, v0, v0, v1}, [I

    .line 50
    move-result-object v6

    .line 51
    .line 52
    .line 53
    filled-new-array {v1, v1, v0, v0, v0}, [I

    .line 54
    move-result-object v7

    .line 55
    .line 56
    .line 57
    filled-new-array {v0, v0, v1, v0, v1}, [I

    .line 58
    move-result-object v8

    .line 59
    .line 60
    .line 61
    filled-new-array {v1, v0, v1, v0, v0}, [I

    .line 62
    move-result-object v9

    .line 63
    .line 64
    .line 65
    filled-new-array {v0, v1, v1, v0, v0}, [I

    .line 66
    move-result-object v10

    .line 67
    .line 68
    .line 69
    filled-new-array {v0, v0, v0, v1, v1}, [I

    .line 70
    move-result-object v11

    .line 71
    .line 72
    .line 73
    filled-new-array {v1, v0, v0, v1, v0}, [I

    .line 74
    move-result-object v12

    .line 75
    .line 76
    .line 77
    filled-new-array {v0, v1, v0, v1, v0}, [I

    .line 78
    move-result-object v13

    .line 79
    .line 80
    .line 81
    filled-new-array {v0, v0, v3, v3, v0}, [I

    .line 82
    move-result-object v14

    .line 83
    .line 84
    .line 85
    filled-new-array {v3, v0, v0, v0, v3}, [I

    .line 86
    move-result-object v15

    .line 87
    .line 88
    .line 89
    filled-new-array {v0, v3, v0, v0, v3}, [I

    .line 90
    move-result-object v16

    .line 91
    .line 92
    .line 93
    filled-new-array {v3, v3, v0, v0, v0}, [I

    .line 94
    move-result-object v17

    .line 95
    .line 96
    .line 97
    filled-new-array {v0, v0, v3, v0, v3}, [I

    .line 98
    move-result-object v18

    .line 99
    .line 100
    .line 101
    filled-new-array {v3, v0, v3, v0, v0}, [I

    .line 102
    move-result-object v19

    .line 103
    .line 104
    .line 105
    filled-new-array {v0, v3, v3, v0, v0}, [I

    .line 106
    move-result-object v20

    .line 107
    .line 108
    .line 109
    filled-new-array {v0, v0, v0, v3, v3}, [I

    .line 110
    move-result-object v21

    .line 111
    .line 112
    .line 113
    filled-new-array {v3, v0, v0, v3, v0}, [I

    .line 114
    move-result-object v22

    .line 115
    .line 116
    .line 117
    filled-new-array {v0, v3, v0, v3, v0}, [I

    .line 118
    move-result-object v23

    .line 119
    .line 120
    .line 121
    filled-new-array/range {v4 .. v23}, [[I

    .line 122
    move-result-object v0

    .line 123
    .line 124
    sput-object v0, Lcom/google/zxing/oned/ITFReader;->PATTERNS:[[I

    .line 125
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/zxing/oned/OneDReader;-><init>()V

    .line 4
    const/4 v0, -0x1

    .line 5
    .line 6
    iput v0, p0, Lcom/google/zxing/oned/ITFReader;->narrowLineWidth:I

    .line 7
    return-void
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

.method private static decodeDigit([I)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/google/zxing/oned/ITFReader;->PATTERNS:[[I

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    .line 6
    const v1, 0x3ec28f5c    # 0.38f

    .line 7
    const/4 v2, -0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, v2

    .line 10
    .line 11
    :goto_0
    if-ge v3, v0, :cond_2

    .line 12
    .line 13
    sget-object v5, Lcom/google/zxing/oned/ITFReader;->PATTERNS:[[I

    .line 14
    .line 15
    aget-object v5, v5, v3

    .line 16
    .line 17
    const/high16 v6, 0x3f000000    # 0.5f

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v5, v6}, Lcom/google/zxing/oned/OneDReader;->patternMatchVariance([I[IF)F

    .line 21
    move-result v5

    .line 22
    .line 23
    cmpg-float v6, v5, v1

    .line 24
    .line 25
    if-gez v6, :cond_0

    .line 26
    move v4, v3

    .line 27
    move v1, v5

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_0
    cmpl-float v5, v5, v1

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    move v4, v2

    .line 34
    .line 35
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_2
    if-ltz v4, :cond_3

    .line 39
    .line 40
    rem-int/lit8 v4, v4, 0xa

    .line 41
    return v4

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 45
    move-result-object p0

    .line 46
    throw p0
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
.end method

.method private decodeEnd(Lcom/google/zxing/common/BitArray;)[I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/zxing/common/BitArray;->reverse()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lcom/google/zxing/oned/ITFReader;->skipWhiteSpace(Lcom/google/zxing/common/BitArray;)I

    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    :try_start_1
    sget-object v3, Lcom/google/zxing/oned/ITFReader;->END_PATTERN_REVERSED:[[I

    .line 12
    .line 13
    aget-object v3, v3, v2

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0, v3}, Lcom/google/zxing/oned/ITFReader;->findGuardPattern(Lcom/google/zxing/common/BitArray;I[I)[I

    .line 17
    move-result-object v0
    :try_end_1
    .catch Lcom/google/zxing/NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :catch_0
    :try_start_2
    sget-object v3, Lcom/google/zxing/oned/ITFReader;->END_PATTERN_REVERSED:[[I

    .line 23
    .line 24
    aget-object v3, v3, v1

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v3}, Lcom/google/zxing/oned/ITFReader;->findGuardPattern(Lcom/google/zxing/common/BitArray;I[I)[I

    .line 28
    move-result-object v0

    .line 29
    .line 30
    :goto_0
    aget v3, v0, v2

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, p1, v3}, Lcom/google/zxing/oned/ITFReader;->validateQuietZone(Lcom/google/zxing/common/BitArray;I)V

    .line 34
    .line 35
    aget v3, v0, v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/google/zxing/common/BitArray;->getSize()I

    .line 39
    move-result v4

    .line 40
    .line 41
    aget v5, v0, v1

    .line 42
    sub-int/2addr v4, v5

    .line 43
    .line 44
    aput v4, v0, v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/google/zxing/common/BitArray;->getSize()I

    .line 48
    move-result v2

    .line 49
    sub-int/2addr v2, v3

    .line 50
    .line 51
    aput v2, v0, v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/google/zxing/common/BitArray;->reverse()V

    .line 55
    return-object v0

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {p1}, Lcom/google/zxing/common/BitArray;->reverse()V

    .line 59
    throw v0
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
.end method

.method private static decodeMiddle(Lcom/google/zxing/common/BitArray;IILjava/lang/StringBuilder;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0xa

    .line 3
    .line 4
    new-array v1, v0, [I

    .line 5
    const/4 v2, 0x5

    .line 6
    .line 7
    new-array v3, v2, [I

    .line 8
    .line 9
    new-array v4, v2, [I

    .line 10
    .line 11
    :cond_0
    if-ge p1, p2, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1, v1}, Lcom/google/zxing/oned/OneDReader;->recordPattern(Lcom/google/zxing/common/BitArray;I[I)V

    .line 15
    const/4 v5, 0x0

    .line 16
    move v6, v5

    .line 17
    .line 18
    :goto_0
    if-ge v6, v2, :cond_1

    .line 19
    .line 20
    mul-int/lit8 v7, v6, 0x2

    .line 21
    .line 22
    aget v8, v1, v7

    .line 23
    .line 24
    aput v8, v3, v6

    .line 25
    .line 26
    add-int/lit8 v7, v7, 0x1

    .line 27
    .line 28
    aget v7, v1, v7

    .line 29
    .line 30
    aput v7, v4, v6

    .line 31
    .line 32
    add-int/lit8 v6, v6, 0x1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {v3}, Lcom/google/zxing/oned/ITFReader;->decodeDigit([I)I

    .line 37
    move-result v6

    .line 38
    .line 39
    add-int/lit8 v6, v6, 0x30

    .line 40
    int-to-char v6, v6

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-static {v4}, Lcom/google/zxing/oned/ITFReader;->decodeDigit([I)I

    .line 47
    move-result v6

    .line 48
    .line 49
    add-int/lit8 v6, v6, 0x30

    .line 50
    int-to-char v6, v6

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    :goto_1
    if-ge v5, v0, :cond_0

    .line 56
    .line 57
    aget v6, v1, v5

    .line 58
    add-int/2addr p1, v6

    .line 59
    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    return-void
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
.end method

.method private decodeStart(Lcom/google/zxing/common/BitArray;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/zxing/oned/ITFReader;->skipWhiteSpace(Lcom/google/zxing/common/BitArray;)I

    .line 4
    move-result v0

    .line 5
    .line 6
    sget-object v1, Lcom/google/zxing/oned/ITFReader;->START_PATTERN:[I

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Lcom/google/zxing/oned/ITFReader;->findGuardPattern(Lcom/google/zxing/common/BitArray;I[I)[I

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    aget v1, v0, v1

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    aget v2, v0, v2

    .line 17
    sub-int/2addr v1, v2

    .line 18
    .line 19
    div-int/lit8 v1, v1, 0x4

    .line 20
    .line 21
    iput v1, p0, Lcom/google/zxing/oned/ITFReader;->narrowLineWidth:I

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1, v2}, Lcom/google/zxing/oned/ITFReader;->validateQuietZone(Lcom/google/zxing/common/BitArray;I)V

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
.end method

.method private static findGuardPattern(Lcom/google/zxing/common/BitArray;I[I)[I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    array-length v0, p2

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/zxing/common/BitArray;->getSize()I

    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, p1

    .line 10
    move v5, v3

    .line 11
    move v6, v5

    .line 12
    .line 13
    :goto_0
    if-ge p1, v2, :cond_3

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/google/zxing/common/BitArray;->get(I)Z

    .line 17
    move-result v7

    .line 18
    const/4 v8, 0x1

    .line 19
    .line 20
    if-eq v7, v5, :cond_0

    .line 21
    .line 22
    aget v7, v1, v6

    .line 23
    add-int/2addr v7, v8

    .line 24
    .line 25
    aput v7, v1, v6

    .line 26
    goto :goto_2

    .line 27
    .line 28
    :cond_0
    add-int/lit8 v7, v0, -0x1

    .line 29
    .line 30
    if-ne v6, v7, :cond_2

    .line 31
    .line 32
    const/high16 v7, 0x3f000000    # 0.5f

    .line 33
    .line 34
    .line 35
    invoke-static {v1, p2, v7}, Lcom/google/zxing/oned/OneDReader;->patternMatchVariance([I[IF)F

    .line 36
    move-result v7

    .line 37
    .line 38
    .line 39
    const v9, 0x3ec28f5c    # 0.38f

    .line 40
    .line 41
    cmpg-float v7, v7, v9

    .line 42
    .line 43
    if-gez v7, :cond_1

    .line 44
    .line 45
    .line 46
    filled-new-array {v4, p1}, [I

    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    .line 50
    :cond_1
    aget v7, v1, v3

    .line 51
    .line 52
    aget v9, v1, v8

    .line 53
    add-int/2addr v7, v9

    .line 54
    add-int/2addr v4, v7

    .line 55
    .line 56
    add-int/lit8 v7, v6, -0x1

    .line 57
    const/4 v9, 0x2

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v9, v1, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    .line 62
    aput v3, v1, v7

    .line 63
    .line 64
    aput v3, v1, v6

    .line 65
    .line 66
    add-int/lit8 v6, v6, -0x1

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    :goto_1
    aput v8, v1, v6

    .line 72
    .line 73
    xor-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 76
    goto :goto_0

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 80
    move-result-object p0

    .line 81
    throw p0
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
.end method

.method private static skipWhiteSpace(Lcom/google/zxing/common/BitArray;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/zxing/common/BitArray;->getSize()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/google/zxing/common/BitArray;->getNextSet(I)I

    .line 9
    move-result p0

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    return p0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 16
    move-result-object p0

    .line 17
    throw p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private validateQuietZone(Lcom/google/zxing/common/BitArray;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/oned/ITFReader;->narrowLineWidth:I

    .line 3
    .line 4
    mul-int/lit8 v0, v0, 0xa

    .line 5
    .line 6
    if-ge v0, p2, :cond_0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, p2

    .line 9
    .line 10
    :goto_0
    add-int/lit8 p2, p2, -0x1

    .line 11
    .line 12
    :goto_1
    if-lez v0, :cond_1

    .line 13
    .line 14
    if-ltz p2, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lcom/google/zxing/common/BitArray;->get(I)Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    add-int/lit8 p2, p2, -0x1

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :cond_1
    if-nez v0, :cond_2

    .line 28
    return-void

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 32
    move-result-object p1

    .line 33
    throw p1
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


# virtual methods
.method public decodeRow(ILcom/google/zxing/common/BitArray;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/zxing/common/BitArray;",
            "Ljava/util/Map<",
            "Lcom/google/zxing/DecodeHintType;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/google/zxing/oned/ITFReader;->decodeStart(Lcom/google/zxing/common/BitArray;)[I

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/google/zxing/oned/ITFReader;->decodeEnd(Lcom/google/zxing/common/BitArray;)[I

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const/16 v3, 0x14

    .line 13
    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    const/4 v3, 0x1

    .line 17
    .line 18
    aget v4, v0, v3

    .line 19
    const/4 v5, 0x0

    .line 20
    .line 21
    aget v6, v1, v5

    .line 22
    .line 23
    .line 24
    invoke-static {p2, v4, v6, v2}, Lcom/google/zxing/oned/ITFReader;->decodeMiddle(Lcom/google/zxing/common/BitArray;IILjava/lang/StringBuilder;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p2

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    sget-object v4, Lcom/google/zxing/DecodeHintType;->ALLOWED_LENGTHS:Lcom/google/zxing/DecodeHintType;

    .line 34
    .line 35
    .line 36
    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    move-result-object p3

    .line 38
    .line 39
    check-cast p3, [I

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object p3, v2

    .line 42
    .line 43
    :goto_0
    if-nez p3, :cond_1

    .line 44
    .line 45
    sget-object p3, Lcom/google/zxing/oned/ITFReader;->DEFAULT_ALLOWED_LENGTHS:[I

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 49
    move-result v4

    .line 50
    array-length v6, p3

    .line 51
    move v7, v5

    .line 52
    move v8, v7

    .line 53
    .line 54
    :goto_1
    if-ge v7, v6, :cond_4

    .line 55
    .line 56
    aget v9, p3, v7

    .line 57
    .line 58
    if-ne v4, v9, :cond_2

    .line 59
    move p3, v3

    .line 60
    goto :goto_2

    .line 61
    .line 62
    :cond_2
    if-le v9, v8, :cond_3

    .line 63
    move v8, v9

    .line 64
    .line 65
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    move p3, v5

    .line 68
    .line 69
    :goto_2
    if-nez p3, :cond_5

    .line 70
    .line 71
    if-le v4, v8, :cond_5

    .line 72
    move p3, v3

    .line 73
    .line 74
    :cond_5
    if-eqz p3, :cond_6

    .line 75
    .line 76
    new-instance p3, Lcom/google/zxing/Result;

    .line 77
    .line 78
    new-instance v4, Lcom/google/zxing/ResultPoint;

    .line 79
    .line 80
    aget v0, v0, v3

    .line 81
    int-to-float v0, v0

    .line 82
    int-to-float p1, p1

    .line 83
    .line 84
    .line 85
    invoke-direct {v4, v0, p1}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 86
    .line 87
    new-instance v0, Lcom/google/zxing/ResultPoint;

    .line 88
    .line 89
    aget v1, v1, v5

    .line 90
    int-to-float v1, v1

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, v1, p1}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 94
    .line 95
    .line 96
    filled-new-array {v4, v0}, [Lcom/google/zxing/ResultPoint;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    sget-object v0, Lcom/google/zxing/BarcodeFormat;->ITF:Lcom/google/zxing/BarcodeFormat;

    .line 100
    .line 101
    .line 102
    invoke-direct {p3, p2, v2, p1, v0}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcom/google/zxing/ResultPoint;Lcom/google/zxing/BarcodeFormat;)V

    .line 103
    return-object p3

    .line 104
    .line 105
    .line 106
    :cond_6
    invoke-static {}, Lcom/google/zxing/FormatException;->getFormatInstance()Lcom/google/zxing/FormatException;

    .line 107
    move-result-object p1

    .line 108
    throw p1
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
.end method
