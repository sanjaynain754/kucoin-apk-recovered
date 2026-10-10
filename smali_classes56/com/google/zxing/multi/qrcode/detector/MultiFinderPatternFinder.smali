.class final Lcom/google/zxing/multi/qrcode/detector/MultiFinderPatternFinder;
.super Lcom/google/zxing/qrcode/detector/FinderPatternFinder;
.source "MultiFinderPatternFinder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/zxing/multi/qrcode/detector/MultiFinderPatternFinder$ModuleSizeComparator;
    }
.end annotation


# static fields
.field private static final DIFF_MODSIZE_CUTOFF:F = 0.5f

.field private static final DIFF_MODSIZE_CUTOFF_PERCENT:F = 0.05f

.field private static final EMPTY_RESULT_ARRAY:[Lcom/google/zxing/qrcode/detector/FinderPatternInfo;

.field private static final MAX_MODULE_COUNT_PER_EDGE:F = 180.0f

.field private static final MIN_MODULE_COUNT_PER_EDGE:F = 9.0f


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Lcom/google/zxing/qrcode/detector/FinderPatternInfo;

    .line 4
    .line 5
    sput-object v0, Lcom/google/zxing/multi/qrcode/detector/MultiFinderPatternFinder;->EMPTY_RESULT_ARRAY:[Lcom/google/zxing/qrcode/detector/FinderPatternInfo;

    .line 6
    return-void
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

.method public constructor <init>(Lcom/google/zxing/common/BitMatrix;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;-><init>(Lcom/google/zxing/common/BitMatrix;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/zxing/common/BitMatrix;Lcom/google/zxing/ResultPointCallback;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;-><init>(Lcom/google/zxing/common/BitMatrix;Lcom/google/zxing/ResultPointCallback;)V

    return-void
.end method

.method private selectMutipleBestPatterns()[[Lcom/google/zxing/qrcode/detector/FinderPattern;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->getPossibleCenters()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x3

    .line 10
    .line 11
    if-lt v1, v2, :cond_8

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 28
    const/4 v3, 0x2

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 35
    .line 36
    .line 37
    filled-new-array {v1, v2, v0}, [Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    filled-new-array {v0}, [[Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    .line 45
    :cond_0
    new-instance v2, Lcom/google/zxing/multi/qrcode/detector/MultiFinderPatternFinder$ModuleSizeComparator;

    .line 46
    const/4 v4, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v4}, Lcom/google/zxing/multi/qrcode/detector/MultiFinderPatternFinder$ModuleSizeComparator;-><init>(Lcom/google/zxing/multi/qrcode/detector/MultiFinderPatternFinder$1;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 53
    .line 54
    new-instance v2, Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    :goto_0
    add-int/lit8 v4, v1, -0x2

    .line 60
    .line 61
    if-ge v3, v4, :cond_6

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    move-result-object v4

    .line 66
    .line 67
    check-cast v4, Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 68
    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    add-int/lit8 v5, v3, 0x1

    .line 72
    .line 73
    :goto_1
    add-int/lit8 v6, v1, -0x1

    .line 74
    .line 75
    if-ge v5, v6, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    move-result-object v6

    .line 80
    .line 81
    check-cast v6, Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 82
    .line 83
    if-eqz v6, :cond_4

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 87
    move-result v7

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 91
    move-result v8

    .line 92
    sub-float/2addr v7, v8

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 96
    move-result v8

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 100
    move-result v9

    .line 101
    .line 102
    .line 103
    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    .line 104
    move-result v8

    .line 105
    div-float/2addr v7, v8

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 109
    move-result v8

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 113
    move-result v9

    .line 114
    sub-float/2addr v8, v9

    .line 115
    .line 116
    .line 117
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 118
    move-result v8

    .line 119
    .line 120
    const/high16 v9, 0x3f000000    # 0.5f

    .line 121
    .line 122
    cmpl-float v8, v8, v9

    .line 123
    .line 124
    .line 125
    const v10, 0x3d4ccccd    # 0.05f

    .line 126
    .line 127
    if-lez v8, :cond_1

    .line 128
    .line 129
    cmpl-float v7, v7, v10

    .line 130
    .line 131
    if-gez v7, :cond_5

    .line 132
    .line 133
    :cond_1
    add-int/lit8 v7, v5, 0x1

    .line 134
    .line 135
    :goto_2
    if-ge v7, v1, :cond_4

    .line 136
    .line 137
    .line 138
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    move-result-object v8

    .line 140
    .line 141
    check-cast v8, Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 142
    .line 143
    if-eqz v8, :cond_3

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 147
    move-result v11

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 151
    move-result v12

    .line 152
    sub-float/2addr v11, v12

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 156
    move-result v12

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 160
    move-result v13

    .line 161
    .line 162
    .line 163
    invoke-static {v12, v13}, Ljava/lang/Math;->min(FF)F

    .line 164
    move-result v12

    .line 165
    div-float/2addr v11, v12

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 169
    move-result v12

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 173
    move-result v13

    .line 174
    sub-float/2addr v12, v13

    .line 175
    .line 176
    .line 177
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 178
    move-result v12

    .line 179
    .line 180
    cmpl-float v12, v12, v9

    .line 181
    .line 182
    if-lez v12, :cond_2

    .line 183
    .line 184
    cmpl-float v11, v11, v10

    .line 185
    .line 186
    if-gez v11, :cond_4

    .line 187
    .line 188
    .line 189
    :cond_2
    filled-new-array {v4, v6, v8}, [Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 190
    move-result-object v8

    .line 191
    .line 192
    .line 193
    invoke-static {v8}, Lcom/google/zxing/ResultPoint;->orderBestPatterns([Lcom/google/zxing/ResultPoint;)V

    .line 194
    .line 195
    new-instance v11, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;

    .line 196
    .line 197
    .line 198
    invoke-direct {v11, v8}, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;-><init>([Lcom/google/zxing/qrcode/detector/FinderPattern;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v11}, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;->getTopLeft()Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 202
    move-result-object v12

    .line 203
    .line 204
    .line 205
    invoke-virtual {v11}, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;->getBottomLeft()Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 206
    move-result-object v13

    .line 207
    .line 208
    .line 209
    invoke-static {v12, v13}, Lcom/google/zxing/ResultPoint;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)F

    .line 210
    move-result v12

    .line 211
    .line 212
    .line 213
    invoke-virtual {v11}, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;->getTopRight()Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 214
    move-result-object v13

    .line 215
    .line 216
    .line 217
    invoke-virtual {v11}, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;->getBottomLeft()Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 218
    move-result-object v14

    .line 219
    .line 220
    .line 221
    invoke-static {v13, v14}, Lcom/google/zxing/ResultPoint;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)F

    .line 222
    move-result v13

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11}, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;->getTopLeft()Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 226
    move-result-object v14

    .line 227
    .line 228
    .line 229
    invoke-virtual {v11}, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;->getTopRight()Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 230
    move-result-object v11

    .line 231
    .line 232
    .line 233
    invoke-static {v14, v11}, Lcom/google/zxing/ResultPoint;->distance(Lcom/google/zxing/ResultPoint;Lcom/google/zxing/ResultPoint;)F

    .line 234
    move-result v11

    .line 235
    .line 236
    add-float v14, v12, v11

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, Lcom/google/zxing/qrcode/detector/FinderPattern;->getEstimatedModuleSize()F

    .line 240
    move-result v15

    .line 241
    .line 242
    const/high16 v16, 0x40000000    # 2.0f

    .line 243
    .line 244
    mul-float v15, v15, v16

    .line 245
    div-float/2addr v14, v15

    .line 246
    .line 247
    const/high16 v15, 0x43340000    # 180.0f

    .line 248
    .line 249
    cmpl-float v15, v14, v15

    .line 250
    .line 251
    if-gtz v15, :cond_3

    .line 252
    .line 253
    const/high16 v15, 0x41100000    # 9.0f

    .line 254
    .line 255
    cmpg-float v14, v14, v15

    .line 256
    .line 257
    if-ltz v14, :cond_3

    .line 258
    .line 259
    sub-float v14, v12, v11

    .line 260
    .line 261
    .line 262
    invoke-static {v12, v11}, Ljava/lang/Math;->min(FF)F

    .line 263
    move-result v15

    .line 264
    div-float/2addr v14, v15

    .line 265
    .line 266
    .line 267
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 268
    move-result v14

    .line 269
    .line 270
    .line 271
    const v15, 0x3dcccccd    # 0.1f

    .line 272
    .line 273
    cmpl-float v14, v14, v15

    .line 274
    .line 275
    if-gez v14, :cond_3

    .line 276
    mul-float/2addr v12, v12

    .line 277
    mul-float/2addr v11, v11

    .line 278
    add-float/2addr v12, v11

    .line 279
    float-to-double v11, v12

    .line 280
    .line 281
    .line 282
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 283
    move-result-wide v11

    .line 284
    double-to-float v11, v11

    .line 285
    .line 286
    sub-float v12, v13, v11

    .line 287
    .line 288
    .line 289
    invoke-static {v13, v11}, Ljava/lang/Math;->min(FF)F

    .line 290
    move-result v11

    .line 291
    div-float/2addr v12, v11

    .line 292
    .line 293
    .line 294
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 295
    move-result v11

    .line 296
    .line 297
    cmpl-float v11, v11, v15

    .line 298
    .line 299
    if-gez v11, :cond_3

    .line 300
    .line 301
    .line 302
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 305
    .line 306
    goto/16 :goto_2

    .line 307
    .line 308
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 309
    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    .line 317
    :cond_6
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 318
    move-result v0

    .line 319
    .line 320
    if-nez v0, :cond_7

    .line 321
    .line 322
    .line 323
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 324
    move-result v0

    .line 325
    .line 326
    new-array v0, v0, [[Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 327
    .line 328
    .line 329
    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 330
    move-result-object v0

    .line 331
    .line 332
    check-cast v0, [[Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 333
    return-object v0

    .line 334
    .line 335
    .line 336
    :cond_7
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 337
    move-result-object v0

    .line 338
    throw v0

    .line 339
    .line 340
    .line 341
    :cond_8
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 342
    move-result-object v0

    .line 343
    throw v0
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


# virtual methods
.method public findMulti(Ljava/util/Map;)[Lcom/google/zxing/qrcode/detector/FinderPatternInfo;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/google/zxing/DecodeHintType;",
            "*>;)[",
            "Lcom/google/zxing/qrcode/detector/FinderPatternInfo;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sget-object v2, Lcom/google/zxing/DecodeHintType;->TRY_HARDER:Lcom/google/zxing/DecodeHintType;

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    move-result p1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    move p1, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p1, v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->getImage()Lcom/google/zxing/common/BitMatrix;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    .line 23
    move-result v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    .line 27
    move-result v4

    .line 28
    .line 29
    mul-int/lit8 v5, v3, 0x3

    .line 30
    .line 31
    div-int/lit16 v5, v5, 0x184

    .line 32
    const/4 v6, 0x3

    .line 33
    .line 34
    if-lt v5, v6, :cond_1

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    :cond_1
    move v5, v6

    .line 38
    :cond_2
    const/4 p1, 0x5

    .line 39
    .line 40
    new-array p1, p1, [I

    .line 41
    .line 42
    add-int/lit8 v7, v5, -0x1

    .line 43
    .line 44
    :goto_1
    if-ge v7, v3, :cond_a

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->clearCounts([I)V

    .line 48
    move v8, v0

    .line 49
    move v9, v8

    .line 50
    .line 51
    :goto_2
    if-ge v8, v4, :cond_8

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v8, v7}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    .line 55
    move-result v10

    .line 56
    .line 57
    if-eqz v10, :cond_4

    .line 58
    .line 59
    and-int/lit8 v10, v9, 0x1

    .line 60
    .line 61
    if-ne v10, v1, :cond_3

    .line 62
    .line 63
    add-int/lit8 v9, v9, 0x1

    .line 64
    .line 65
    :cond_3
    aget v10, p1, v9

    .line 66
    add-int/2addr v10, v1

    .line 67
    .line 68
    aput v10, p1, v9

    .line 69
    goto :goto_3

    .line 70
    .line 71
    :cond_4
    and-int/lit8 v10, v9, 0x1

    .line 72
    .line 73
    if-nez v10, :cond_7

    .line 74
    const/4 v10, 0x4

    .line 75
    .line 76
    if-ne v9, v10, :cond_6

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->foundPatternCross([I)Z

    .line 80
    move-result v9

    .line 81
    .line 82
    if-eqz v9, :cond_5

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1, v7, v8}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->handlePossibleCenter([III)Z

    .line 86
    move-result v9

    .line 87
    .line 88
    if-eqz v9, :cond_5

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->clearCounts([I)V

    .line 92
    move v9, v0

    .line 93
    goto :goto_3

    .line 94
    .line 95
    .line 96
    :cond_5
    invoke-virtual {p0, p1}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->shiftCounts2([I)V

    .line 97
    move v9, v6

    .line 98
    goto :goto_3

    .line 99
    .line 100
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 101
    .line 102
    aget v10, p1, v9

    .line 103
    add-int/2addr v10, v1

    .line 104
    .line 105
    aput v10, p1, v9

    .line 106
    goto :goto_3

    .line 107
    .line 108
    :cond_7
    aget v10, p1, v9

    .line 109
    add-int/2addr v10, v1

    .line 110
    .line 111
    aput v10, p1, v9

    .line 112
    .line 113
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 114
    goto :goto_2

    .line 115
    .line 116
    .line 117
    :cond_8
    invoke-static {p1}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->foundPatternCross([I)Z

    .line 118
    move-result v8

    .line 119
    .line 120
    if-eqz v8, :cond_9

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, v7, v4}, Lcom/google/zxing/qrcode/detector/FinderPatternFinder;->handlePossibleCenter([III)Z

    .line 124
    :cond_9
    add-int/2addr v7, v5

    .line 125
    goto :goto_1

    .line 126
    .line 127
    .line 128
    :cond_a
    invoke-direct {p0}, Lcom/google/zxing/multi/qrcode/detector/MultiFinderPatternFinder;->selectMutipleBestPatterns()[[Lcom/google/zxing/qrcode/detector/FinderPattern;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    new-instance v1, Ljava/util/ArrayList;

    .line 132
    .line 133
    .line 134
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 135
    array-length v2, p1

    .line 136
    .line 137
    :goto_4
    if-ge v0, v2, :cond_b

    .line 138
    .line 139
    aget-object v3, p1, v0

    .line 140
    .line 141
    .line 142
    invoke-static {v3}, Lcom/google/zxing/ResultPoint;->orderBestPatterns([Lcom/google/zxing/ResultPoint;)V

    .line 143
    .line 144
    new-instance v4, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;

    .line 145
    .line 146
    .line 147
    invoke-direct {v4, v3}, Lcom/google/zxing/qrcode/detector/FinderPatternInfo;-><init>([Lcom/google/zxing/qrcode/detector/FinderPattern;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    add-int/lit8 v0, v0, 0x1

    .line 153
    goto :goto_4

    .line 154
    .line 155
    .line 156
    :cond_b
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 157
    move-result p1

    .line 158
    .line 159
    if-eqz p1, :cond_c

    .line 160
    .line 161
    sget-object p1, Lcom/google/zxing/multi/qrcode/detector/MultiFinderPatternFinder;->EMPTY_RESULT_ARRAY:[Lcom/google/zxing/qrcode/detector/FinderPatternInfo;

    .line 162
    return-object p1

    .line 163
    .line 164
    .line 165
    :cond_c
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 166
    move-result p1

    .line 167
    .line 168
    new-array p1, p1, [Lcom/google/zxing/qrcode/detector/FinderPatternInfo;

    .line 169
    .line 170
    .line 171
    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 172
    move-result-object p1

    .line 173
    .line 174
    check-cast p1, [Lcom/google/zxing/qrcode/detector/FinderPatternInfo;

    .line 175
    return-object p1
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
.end method
