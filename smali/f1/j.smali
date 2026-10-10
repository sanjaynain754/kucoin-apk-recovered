.class public Lf1/j;
.super Lf1/g;
.source "PathKeyframeAnimation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1/g<",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Landroid/graphics/PointF;

.field public final j:[F

.field public final k:[F

.field public final l:Landroid/graphics/PathMeasure;

.field public m:Lf1/i;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lp1/a<",
            "Landroid/graphics/PointF;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lf1/g;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    new-instance p1, Landroid/graphics/PointF;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lf1/j;->i:Landroid/graphics/PointF;

    .line 11
    const/4 p1, 0x2

    .line 12
    .line 13
    new-array v0, p1, [F

    .line 14
    .line 15
    iput-object v0, p0, Lf1/j;->j:[F

    .line 16
    .line 17
    new-array p1, p1, [F

    .line 18
    .line 19
    iput-object p1, p0, Lf1/j;->k:[F

    .line 20
    .line 21
    new-instance p1, Landroid/graphics/PathMeasure;

    .line 22
    .line 23
    .line 24
    invoke-direct {p1}, Landroid/graphics/PathMeasure;-><init>()V

    .line 25
    .line 26
    iput-object p1, p0, Lf1/j;->l:Landroid/graphics/PathMeasure;

    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
.end method


# virtual methods
.method public bridge synthetic i(Lp1/a;F)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf1/j;->q(Lp1/a;F)Landroid/graphics/PointF;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public q(Lp1/a;F)Landroid/graphics/PointF;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/a<",
            "Landroid/graphics/PointF;",
            ">;F)",
            "Landroid/graphics/PointF;"
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    .line 3
    check-cast v0, Lf1/i;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lf1/i;->k()Landroid/graphics/Path;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Lp1/a;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/graphics/PointF;

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_0
    iget-object v2, p0, Lf1/a;->e:Lp1/c;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget v3, v0, Lp1/a;->g:F

    .line 21
    .line 22
    iget-object p1, v0, Lp1/a;->h:Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 26
    move-result v4

    .line 27
    .line 28
    iget-object p1, v0, Lp1/a;->b:Ljava/lang/Object;

    .line 29
    move-object v5, p1

    .line 30
    .line 31
    check-cast v5, Landroid/graphics/PointF;

    .line 32
    .line 33
    iget-object p1, v0, Lp1/a;->c:Ljava/lang/Object;

    .line 34
    move-object v6, p1

    .line 35
    .line 36
    check-cast v6, Landroid/graphics/PointF;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lf1/a;->e()F

    .line 40
    move-result v7

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lf1/a;->f()F

    .line 44
    move-result v9

    .line 45
    move v8, p2

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {v2 .. v9}, Lp1/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    check-cast p1, Landroid/graphics/PointF;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    return-object p1

    .line 55
    :cond_1
    move v8, p2

    .line 56
    .line 57
    :cond_2
    iget-object p1, p0, Lf1/j;->m:Lf1/i;

    .line 58
    const/4 p2, 0x0

    .line 59
    .line 60
    if-eq p1, v0, :cond_3

    .line 61
    .line 62
    iget-object p1, p0, Lf1/j;->l:Landroid/graphics/PathMeasure;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1, p2}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 66
    .line 67
    iput-object v0, p0, Lf1/j;->m:Lf1/i;

    .line 68
    .line 69
    :cond_3
    iget-object p1, p0, Lf1/j;->l:Landroid/graphics/PathMeasure;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 73
    move-result p1

    .line 74
    .line 75
    mul-float v0, v8, p1

    .line 76
    .line 77
    iget-object v1, p0, Lf1/j;->l:Landroid/graphics/PathMeasure;

    .line 78
    .line 79
    iget-object v2, p0, Lf1/j;->j:[F

    .line 80
    .line 81
    iget-object v3, p0, Lf1/j;->k:[F

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0, v2, v3}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 85
    .line 86
    iget-object v1, p0, Lf1/j;->i:Landroid/graphics/PointF;

    .line 87
    .line 88
    iget-object v2, p0, Lf1/j;->j:[F

    .line 89
    .line 90
    aget v3, v2, p2

    .line 91
    const/4 v4, 0x1

    .line 92
    .line 93
    aget v2, v2, v4

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 97
    const/4 v1, 0x0

    .line 98
    .line 99
    cmpg-float v1, v0, v1

    .line 100
    .line 101
    if-gez v1, :cond_4

    .line 102
    .line 103
    iget-object p1, p0, Lf1/j;->i:Landroid/graphics/PointF;

    .line 104
    .line 105
    iget-object v1, p0, Lf1/j;->k:[F

    .line 106
    .line 107
    aget p2, v1, p2

    .line 108
    mul-float/2addr p2, v0

    .line 109
    .line 110
    aget v1, v1, v4

    .line 111
    mul-float/2addr v1, v0

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p2, v1}, Landroid/graphics/PointF;->offset(FF)V

    .line 115
    goto :goto_0

    .line 116
    .line 117
    :cond_4
    cmpl-float v1, v0, p1

    .line 118
    .line 119
    if-lez v1, :cond_5

    .line 120
    .line 121
    iget-object v1, p0, Lf1/j;->i:Landroid/graphics/PointF;

    .line 122
    .line 123
    iget-object v2, p0, Lf1/j;->k:[F

    .line 124
    .line 125
    aget p2, v2, p2

    .line 126
    sub-float/2addr v0, p1

    .line 127
    mul-float/2addr p2, v0

    .line 128
    .line 129
    aget p1, v2, v4

    .line 130
    mul-float/2addr p1, v0

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, p2, p1}, Landroid/graphics/PointF;->offset(FF)V

    .line 134
    .line 135
    :cond_5
    :goto_0
    iget-object p1, p0, Lf1/j;->i:Landroid/graphics/PointF;

    .line 136
    return-object p1
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
.end method
