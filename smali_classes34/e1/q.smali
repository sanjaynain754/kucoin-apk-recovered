.class public Le1/q;
.super Ljava/lang/Object;
.source "RoundedCornersContent.java"

# interfaces
.implements Le1/s;
.implements Lf1/a$b;


# instance fields
.field public final a:Lcom/airbnb/lottie/LottieDrawable;

.field public final b:Ljava/lang/String;

.field public final c:Lf1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lj1/i;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/LottieDrawable;Lcom/airbnb/lottie/model/layer/a;Lj1/h;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Le1/q;->a:Lcom/airbnb/lottie/LottieDrawable;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Lj1/h;->c()Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iput-object p1, p0, Le1/q;->b:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3}, Lj1/h;->b()Li1/m;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Li1/m;->a()Lf1/a;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Le1/q;->c:Lf1/a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/model/layer/a;->i(Lf1/a;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lf1/a;->a(Lf1/a$b;)V

    .line 28
    return-void
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
.end method

.method public static a(II)I
    .locals 2

    .line 1
    .line 2
    div-int v0, p0, p1

    .line 3
    .line 4
    xor-int v1, p0, p1

    .line 5
    .line 6
    if-gez v1, :cond_0

    .line 7
    mul-int/2addr p1, v0

    .line 8
    .line 9
    if-eq p1, p0, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    :cond_0
    return v0
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
.end method

.method public static c(II)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Le1/q;->a(II)I

    .line 4
    move-result v0

    .line 5
    mul-int/2addr v0, p1

    .line 6
    sub-int/2addr p0, v0

    .line 7
    return p0
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
.end method


# virtual methods
.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Le1/q;->a:Lcom/airbnb/lottie/LottieDrawable;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieDrawable;->invalidateSelf()V

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
    .line 17
    .line 18
.end method

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le1/c;",
            ">;",
            "Ljava/util/List<",
            "Le1/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public g()Lf1/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf1/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Le1/q;->c:Lf1/a;

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
    .line 17
    .line 18
.end method

.method public h(Lj1/i;)Lj1/i;
    .locals 18

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lj1/i;->a()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    .line 11
    if-gt v1, v2, :cond_0

    .line 12
    .line 13
    move-object/from16 v1, p0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    move-object/from16 v1, p0

    .line 17
    .line 18
    iget-object v2, v1, Le1/q;->c:Lf1/a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lf1/a;->h()Ljava/lang/Object;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    check-cast v2, Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    .line 31
    cmpl-float v3, v2, v3

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    :goto_0
    return-object p1

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual/range {p0 .. p1}, Le1/q;->i(Lj1/i;)Lj1/i;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p1 .. p1}, Lj1/i;->b()Landroid/graphics/PointF;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    iget v4, v4, Landroid/graphics/PointF;->x:F

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p1 .. p1}, Lj1/i;->b()Landroid/graphics/PointF;

    .line 48
    move-result-object v5

    .line 49
    .line 50
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v4, v5}, Lj1/i;->f(FF)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lj1/i;->a()Ljava/util/List;

    .line 57
    move-result-object v4

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {p1 .. p1}, Lj1/i;->d()Z

    .line 61
    move-result v5

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x0

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 67
    move-result v9

    .line 68
    .line 69
    if-ge v7, v9, :cond_8

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    move-result-object v9

    .line 74
    .line 75
    check-cast v9, Lh1/a;

    .line 76
    .line 77
    add-int/lit8 v10, v7, -0x1

    .line 78
    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 81
    move-result v11

    .line 82
    .line 83
    .line 84
    invoke-static {v10, v11}, Le1/q;->c(II)I

    .line 85
    move-result v10

    .line 86
    .line 87
    .line 88
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    move-result-object v10

    .line 90
    .line 91
    check-cast v10, Lh1/a;

    .line 92
    .line 93
    add-int/lit8 v11, v7, -0x2

    .line 94
    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 97
    move-result v12

    .line 98
    .line 99
    .line 100
    invoke-static {v11, v12}, Le1/q;->c(II)I

    .line 101
    move-result v11

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    move-result-object v11

    .line 106
    .line 107
    check-cast v11, Lh1/a;

    .line 108
    .line 109
    if-nez v7, :cond_2

    .line 110
    .line 111
    if-nez v5, :cond_2

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {p1 .. p1}, Lj1/i;->b()Landroid/graphics/PointF;

    .line 115
    move-result-object v12

    .line 116
    goto :goto_2

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-virtual {v10}, Lh1/a;->c()Landroid/graphics/PointF;

    .line 120
    move-result-object v12

    .line 121
    .line 122
    :goto_2
    if-nez v7, :cond_3

    .line 123
    .line 124
    if-nez v5, :cond_3

    .line 125
    move-object v13, v12

    .line 126
    goto :goto_3

    .line 127
    .line 128
    .line 129
    :cond_3
    invoke-virtual {v10}, Lh1/a;->b()Landroid/graphics/PointF;

    .line 130
    move-result-object v13

    .line 131
    .line 132
    .line 133
    :goto_3
    invoke-virtual {v9}, Lh1/a;->a()Landroid/graphics/PointF;

    .line 134
    move-result-object v14

    .line 135
    .line 136
    .line 137
    invoke-virtual {v11}, Lh1/a;->c()Landroid/graphics/PointF;

    .line 138
    move-result-object v11

    .line 139
    .line 140
    .line 141
    invoke-virtual {v9}, Lh1/a;->c()Landroid/graphics/PointF;

    .line 142
    move-result-object v15

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {p1 .. p1}, Lj1/i;->d()Z

    .line 146
    move-result v16

    .line 147
    .line 148
    if-nez v16, :cond_4

    .line 149
    .line 150
    const/16 v16, 0x1

    .line 151
    .line 152
    if-eqz v7, :cond_5

    .line 153
    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 156
    move-result v17

    .line 157
    .line 158
    add-int/lit8 v6, v17, -0x1

    .line 159
    .line 160
    if-ne v7, v6, :cond_4

    .line 161
    goto :goto_4

    .line 162
    .line 163
    :cond_4
    const/16 v16, 0x0

    .line 164
    .line 165
    .line 166
    :cond_5
    :goto_4
    invoke-virtual {v13, v12}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    .line 167
    move-result v6

    .line 168
    .line 169
    if-eqz v6, :cond_7

    .line 170
    .line 171
    .line 172
    invoke-virtual {v14, v12}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    .line 173
    move-result v6

    .line 174
    .line 175
    if-eqz v6, :cond_7

    .line 176
    .line 177
    if-nez v16, :cond_7

    .line 178
    .line 179
    iget v6, v12, Landroid/graphics/PointF;->x:F

    .line 180
    .line 181
    iget v9, v11, Landroid/graphics/PointF;->x:F

    .line 182
    .line 183
    sub-float v9, v6, v9

    .line 184
    .line 185
    iget v10, v12, Landroid/graphics/PointF;->y:F

    .line 186
    .line 187
    iget v13, v11, Landroid/graphics/PointF;->y:F

    .line 188
    .line 189
    sub-float v13, v10, v13

    .line 190
    .line 191
    iget v14, v15, Landroid/graphics/PointF;->x:F

    .line 192
    sub-float/2addr v14, v6

    .line 193
    .line 194
    iget v6, v15, Landroid/graphics/PointF;->y:F

    .line 195
    sub-float/2addr v6, v10

    .line 196
    float-to-double v9, v9

    .line 197
    .line 198
    move-object/from16 v16, v0

    .line 199
    float-to-double v0, v13

    .line 200
    .line 201
    .line 202
    invoke-static {v9, v10, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    .line 203
    move-result-wide v0

    .line 204
    double-to-float v0, v0

    .line 205
    float-to-double v9, v14

    .line 206
    float-to-double v13, v6

    .line 207
    .line 208
    .line 209
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 210
    move-result-wide v9

    .line 211
    double-to-float v1, v9

    .line 212
    .line 213
    div-float v0, v2, v0

    .line 214
    .line 215
    const/high16 v6, 0x3f000000    # 0.5f

    .line 216
    .line 217
    .line 218
    invoke-static {v0, v6}, Ljava/lang/Math;->min(FF)F

    .line 219
    move-result v0

    .line 220
    .line 221
    div-float v1, v2, v1

    .line 222
    .line 223
    .line 224
    invoke-static {v1, v6}, Ljava/lang/Math;->min(FF)F

    .line 225
    move-result v1

    .line 226
    .line 227
    iget v6, v12, Landroid/graphics/PointF;->x:F

    .line 228
    .line 229
    iget v9, v11, Landroid/graphics/PointF;->x:F

    .line 230
    sub-float/2addr v9, v6

    .line 231
    mul-float/2addr v9, v0

    .line 232
    add-float/2addr v9, v6

    .line 233
    .line 234
    iget v10, v12, Landroid/graphics/PointF;->y:F

    .line 235
    .line 236
    iget v11, v11, Landroid/graphics/PointF;->y:F

    .line 237
    sub-float/2addr v11, v10

    .line 238
    mul-float/2addr v11, v0

    .line 239
    add-float/2addr v11, v10

    .line 240
    .line 241
    iget v0, v15, Landroid/graphics/PointF;->x:F

    .line 242
    sub-float/2addr v0, v6

    .line 243
    mul-float/2addr v0, v1

    .line 244
    add-float/2addr v0, v6

    .line 245
    .line 246
    iget v12, v15, Landroid/graphics/PointF;->y:F

    .line 247
    sub-float/2addr v12, v10

    .line 248
    mul-float/2addr v12, v1

    .line 249
    add-float/2addr v12, v10

    .line 250
    .line 251
    sub-float v1, v9, v6

    .line 252
    .line 253
    .line 254
    const v13, 0x3f0d4952    # 0.5519f

    .line 255
    mul-float/2addr v1, v13

    .line 256
    .line 257
    sub-float v1, v9, v1

    .line 258
    .line 259
    sub-float v14, v11, v10

    .line 260
    mul-float/2addr v14, v13

    .line 261
    .line 262
    sub-float v14, v11, v14

    .line 263
    .line 264
    sub-float v6, v0, v6

    .line 265
    mul-float/2addr v6, v13

    .line 266
    .line 267
    sub-float v6, v0, v6

    .line 268
    .line 269
    sub-float v10, v12, v10

    .line 270
    mul-float/2addr v10, v13

    .line 271
    .line 272
    sub-float v10, v12, v10

    .line 273
    .line 274
    add-int/lit8 v13, v8, -0x1

    .line 275
    .line 276
    .line 277
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 278
    move-result v15

    .line 279
    .line 280
    .line 281
    invoke-static {v13, v15}, Le1/q;->c(II)I

    .line 282
    move-result v13

    .line 283
    .line 284
    .line 285
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    move-result-object v13

    .line 287
    .line 288
    check-cast v13, Lh1/a;

    .line 289
    .line 290
    .line 291
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    move-result-object v15

    .line 293
    .line 294
    check-cast v15, Lh1/a;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v13, v9, v11}, Lh1/a;->e(FF)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v13, v9, v11}, Lh1/a;->f(FF)V

    .line 301
    .line 302
    if-nez v7, :cond_6

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v9, v11}, Lj1/i;->f(FF)V

    .line 306
    .line 307
    .line 308
    :cond_6
    invoke-virtual {v15, v1, v14}, Lh1/a;->d(FF)V

    .line 309
    .line 310
    add-int/lit8 v1, v8, 0x1

    .line 311
    .line 312
    .line 313
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 314
    move-result-object v1

    .line 315
    .line 316
    check-cast v1, Lh1/a;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v15, v6, v10}, Lh1/a;->e(FF)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v15, v0, v12}, Lh1/a;->f(FF)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v0, v12}, Lh1/a;->d(FF)V

    .line 326
    .line 327
    add-int/lit8 v8, v8, 0x2

    .line 328
    goto :goto_5

    .line 329
    .line 330
    :cond_7
    move-object/from16 v16, v0

    .line 331
    .line 332
    add-int/lit8 v0, v8, -0x1

    .line 333
    .line 334
    .line 335
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 336
    move-result v1

    .line 337
    .line 338
    .line 339
    invoke-static {v0, v1}, Le1/q;->c(II)I

    .line 340
    move-result v0

    .line 341
    .line 342
    .line 343
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 344
    move-result-object v0

    .line 345
    .line 346
    check-cast v0, Lh1/a;

    .line 347
    .line 348
    .line 349
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 350
    move-result-object v1

    .line 351
    .line 352
    check-cast v1, Lh1/a;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v10}, Lh1/a;->b()Landroid/graphics/PointF;

    .line 356
    move-result-object v6

    .line 357
    .line 358
    iget v6, v6, Landroid/graphics/PointF;->x:F

    .line 359
    .line 360
    .line 361
    invoke-virtual {v10}, Lh1/a;->b()Landroid/graphics/PointF;

    .line 362
    move-result-object v11

    .line 363
    .line 364
    iget v11, v11, Landroid/graphics/PointF;->y:F

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v6, v11}, Lh1/a;->e(FF)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v10}, Lh1/a;->c()Landroid/graphics/PointF;

    .line 371
    move-result-object v6

    .line 372
    .line 373
    iget v6, v6, Landroid/graphics/PointF;->x:F

    .line 374
    .line 375
    .line 376
    invoke-virtual {v10}, Lh1/a;->c()Landroid/graphics/PointF;

    .line 377
    move-result-object v10

    .line 378
    .line 379
    iget v10, v10, Landroid/graphics/PointF;->y:F

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v6, v10}, Lh1/a;->f(FF)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v9}, Lh1/a;->a()Landroid/graphics/PointF;

    .line 386
    move-result-object v0

    .line 387
    .line 388
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 389
    .line 390
    .line 391
    invoke-virtual {v9}, Lh1/a;->a()Landroid/graphics/PointF;

    .line 392
    move-result-object v6

    .line 393
    .line 394
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v0, v6}, Lh1/a;->d(FF)V

    .line 398
    .line 399
    add-int/lit8 v8, v8, 0x1

    .line 400
    .line 401
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 402
    .line 403
    move-object/from16 v1, p0

    .line 404
    .line 405
    move-object/from16 v0, v16

    .line 406
    .line 407
    goto/16 :goto_1

    .line 408
    :cond_8
    return-object v3
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
.end method

.method public final i(Lj1/i;)Lj1/i;
    .locals 10
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lj1/i;->a()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lj1/i;->d()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    sub-int/2addr v2, v3

    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    .line 18
    :goto_0
    if-ltz v2, :cond_5

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    move-result-object v6

    .line 23
    .line 24
    check-cast v6, Lh1/a;

    .line 25
    .line 26
    add-int/lit8 v7, v2, -0x1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 30
    move-result v8

    .line 31
    .line 32
    .line 33
    invoke-static {v7, v8}, Le1/q;->c(II)I

    .line 34
    move-result v7

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    move-result-object v7

    .line 39
    .line 40
    check-cast v7, Lh1/a;

    .line 41
    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lj1/i;->b()Landroid/graphics/PointF;

    .line 48
    move-result-object v8

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {v7}, Lh1/a;->c()Landroid/graphics/PointF;

    .line 53
    move-result-object v8

    .line 54
    .line 55
    :goto_1
    if-nez v2, :cond_1

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    move-object v7, v8

    .line 59
    goto :goto_2

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {v7}, Lh1/a;->b()Landroid/graphics/PointF;

    .line 63
    move-result-object v7

    .line 64
    .line 65
    .line 66
    :goto_2
    invoke-virtual {v6}, Lh1/a;->a()Landroid/graphics/PointF;

    .line 67
    move-result-object v6

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lj1/i;->d()Z

    .line 71
    move-result v9

    .line 72
    .line 73
    if-nez v9, :cond_3

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 79
    move-result v9

    .line 80
    sub-int/2addr v9, v3

    .line 81
    .line 82
    if-ne v2, v9, :cond_3

    .line 83
    :cond_2
    move v9, v3

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    move v9, v4

    .line 86
    .line 87
    .line 88
    :goto_3
    invoke-virtual {v7, v8}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    .line 89
    move-result v7

    .line 90
    .line 91
    if-eqz v7, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v8}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    .line 95
    move-result v6

    .line 96
    .line 97
    if-eqz v6, :cond_4

    .line 98
    .line 99
    if-nez v9, :cond_4

    .line 100
    .line 101
    add-int/lit8 v5, v5, 0x2

    .line 102
    goto :goto_4

    .line 103
    .line 104
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    :goto_4
    add-int/lit8 v2, v2, -0x1

    .line 107
    goto :goto_0

    .line 108
    .line 109
    :cond_5
    iget-object p1, p0, Le1/q;->d:Lj1/i;

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lj1/i;->a()Ljava/util/List;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 119
    move-result p1

    .line 120
    .line 121
    if-eq p1, v5, :cond_8

    .line 122
    .line 123
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    invoke-direct {p1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    move v0, v4

    .line 128
    .line 129
    :goto_5
    if-ge v0, v5, :cond_7

    .line 130
    .line 131
    new-instance v2, Lh1/a;

    .line 132
    .line 133
    .line 134
    invoke-direct {v2}, Lh1/a;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    add-int/lit8 v0, v0, 0x1

    .line 140
    goto :goto_5

    .line 141
    .line 142
    :cond_7
    new-instance v0, Lj1/i;

    .line 143
    .line 144
    new-instance v2, Landroid/graphics/PointF;

    .line 145
    const/4 v3, 0x0

    .line 146
    .line 147
    .line 148
    invoke-direct {v2, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 149
    .line 150
    .line 151
    invoke-direct {v0, v2, v4, p1}, Lj1/i;-><init>(Landroid/graphics/PointF;ZLjava/util/List;)V

    .line 152
    .line 153
    iput-object v0, p0, Le1/q;->d:Lj1/i;

    .line 154
    .line 155
    :cond_8
    iget-object p1, p0, Le1/q;->d:Lj1/i;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v1}, Lj1/i;->e(Z)V

    .line 159
    .line 160
    iget-object p1, p0, Le1/q;->d:Lj1/i;

    .line 161
    return-object p1
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
