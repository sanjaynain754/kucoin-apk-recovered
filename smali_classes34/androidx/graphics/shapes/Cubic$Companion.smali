.class public final Landroidx/graphics/shapes/Cubic$Companion;
.super Ljava/lang/Object;
.source "Cubic.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/graphics/shapes/Cubic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J(\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/graphics/shapes/Cubic$Companion;",
        "",
        "()V",
        "circularArc",
        "Landroidx/graphics/shapes/Cubic;",
        "centerX",
        "",
        "centerY",
        "x0",
        "y0",
        "x1",
        "y1",
        "straightLine",
        "graphics-shapes_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/graphics/shapes/Cubic$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final circularArc(FFFFFF)Landroidx/graphics/shapes/Cubic;
    .locals 16
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move/from16 v0, p3

    .line 3
    .line 4
    move/from16 v1, p4

    .line 5
    .line 6
    move/from16 v6, p5

    .line 7
    .line 8
    move/from16 v7, p6

    .line 9
    .line 10
    sub-float v2, v0, p1

    .line 11
    .line 12
    sub-float v3, v1, p2

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Landroidx/graphics/shapes/Utils;->directionVector(FF)J

    .line 16
    move-result-wide v4

    .line 17
    .line 18
    sub-float v8, v6, p1

    .line 19
    .line 20
    sub-float v9, v7, p2

    .line 21
    .line 22
    .line 23
    invoke-static {v8, v9}, Landroidx/graphics/shapes/Utils;->directionVector(FF)J

    .line 24
    move-result-wide v10

    .line 25
    .line 26
    .line 27
    invoke-static {v4, v5}, Landroidx/graphics/shapes/Utils;->rotate90-DnnuFBc(J)J

    .line 28
    move-result-wide v12

    .line 29
    .line 30
    .line 31
    invoke-static {v10, v11}, Landroidx/graphics/shapes/Utils;->rotate90-DnnuFBc(J)J

    .line 32
    move-result-wide v14

    .line 33
    .line 34
    .line 35
    invoke-static {v12, v13, v8, v9}, Landroidx/graphics/shapes/PointKt;->dotProduct-5P9i7ZU(JFF)F

    .line 36
    move-result v8

    .line 37
    const/4 v9, 0x0

    .line 38
    .line 39
    cmpl-float v8, v8, v9

    .line 40
    const/4 v9, 0x1

    .line 41
    .line 42
    if-ltz v8, :cond_0

    .line 43
    move v8, v9

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v8, 0x0

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-static {v4, v5, v10, v11}, Landroidx/graphics/shapes/PointKt;->dotProduct-ybeJwSQ(JJ)F

    .line 49
    move-result v4

    .line 50
    .line 51
    .line 52
    const v5, 0x3f7fbe77    # 0.999f

    .line 53
    .line 54
    cmpl-float v5, v4, v5

    .line 55
    .line 56
    if-lez v5, :cond_1

    .line 57
    .line 58
    move-object/from16 v10, p0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v10, v0, v1, v6, v7}, Landroidx/graphics/shapes/Cubic$Companion;->straightLine(FFFF)Landroidx/graphics/shapes/Cubic;

    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    .line 65
    :cond_1
    move-object/from16 v10, p0

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v3}, Landroidx/graphics/shapes/Utils;->distance(FF)F

    .line 69
    move-result v2

    .line 70
    .line 71
    const/high16 v3, 0x40800000    # 4.0f

    .line 72
    mul-float/2addr v2, v3

    .line 73
    .line 74
    const/high16 v3, 0x40400000    # 3.0f

    .line 75
    div-float/2addr v2, v3

    .line 76
    const/4 v3, 0x2

    .line 77
    int-to-float v3, v3

    .line 78
    int-to-float v5, v9

    .line 79
    .line 80
    sub-float v9, v5, v4

    .line 81
    mul-float/2addr v3, v9

    .line 82
    float-to-double v0, v3

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 86
    move-result-wide v0

    .line 87
    double-to-float v0, v0

    .line 88
    mul-float/2addr v4, v4

    .line 89
    sub-float/2addr v5, v4

    .line 90
    float-to-double v3, v5

    .line 91
    .line 92
    .line 93
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 94
    move-result-wide v3

    .line 95
    double-to-float v1, v3

    .line 96
    sub-float/2addr v0, v1

    .line 97
    mul-float/2addr v2, v0

    .line 98
    div-float/2addr v2, v9

    .line 99
    .line 100
    if-eqz v8, :cond_2

    .line 101
    .line 102
    const/high16 v0, 0x3f800000    # 1.0f

    .line 103
    goto :goto_1

    .line 104
    .line 105
    :cond_2
    const/high16 v0, -0x40800000    # -1.0f

    .line 106
    :goto_1
    mul-float/2addr v2, v0

    .line 107
    .line 108
    .line 109
    invoke-static {v12, v13}, Landroidx/graphics/shapes/PointKt;->getX-DnnuFBc(J)F

    .line 110
    move-result v0

    .line 111
    mul-float/2addr v0, v2

    .line 112
    .line 113
    add-float v0, p3, v0

    .line 114
    .line 115
    .line 116
    invoke-static {v12, v13}, Landroidx/graphics/shapes/PointKt;->getY-DnnuFBc(J)F

    .line 117
    move-result v1

    .line 118
    mul-float/2addr v1, v2

    .line 119
    .line 120
    add-float v3, p4, v1

    .line 121
    .line 122
    .line 123
    invoke-static {v14, v15}, Landroidx/graphics/shapes/PointKt;->getX-DnnuFBc(J)F

    .line 124
    move-result v1

    .line 125
    mul-float/2addr v1, v2

    .line 126
    .line 127
    sub-float v4, v6, v1

    .line 128
    .line 129
    .line 130
    invoke-static {v14, v15}, Landroidx/graphics/shapes/PointKt;->getY-DnnuFBc(J)F

    .line 131
    move-result v1

    .line 132
    mul-float/2addr v1, v2

    .line 133
    .line 134
    sub-float v5, v7, v1

    .line 135
    .line 136
    move/from16 v1, p4

    .line 137
    move v2, v0

    .line 138
    .line 139
    move/from16 v0, p3

    .line 140
    .line 141
    .line 142
    invoke-static/range {v0 .. v7}, Landroidx/graphics/shapes/CubicKt;->Cubic(FFFFFFFF)Landroidx/graphics/shapes/Cubic;

    .line 143
    move-result-object v0

    .line 144
    return-object v0
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
.end method

.method public final straightLine(FFFF)Landroidx/graphics/shapes/Cubic;
    .locals 9
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const v0, 0x3eaaaaab

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p3, v0}, Landroidx/graphics/shapes/Utils;->interpolate(FFF)F

    .line 7
    move-result v3

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p4, v0}, Landroidx/graphics/shapes/Utils;->interpolate(FFF)F

    .line 11
    move-result v4

    .line 12
    .line 13
    .line 14
    const v0, 0x3f2aaaab

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p3, v0}, Landroidx/graphics/shapes/Utils;->interpolate(FFF)F

    .line 18
    move-result v5

    .line 19
    .line 20
    .line 21
    invoke-static {p2, p4, v0}, Landroidx/graphics/shapes/Utils;->interpolate(FFF)F

    .line 22
    move-result v6

    .line 23
    move v1, p1

    .line 24
    move v2, p2

    .line 25
    move v7, p3

    .line 26
    move v8, p4

    .line 27
    .line 28
    .line 29
    invoke-static/range {v1 .. v8}, Landroidx/graphics/shapes/CubicKt;->Cubic(FFFFFFFF)Landroidx/graphics/shapes/Cubic;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
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
.end method
