.class public Lcom/horcrux/svg/t;
.super Ljava/lang/Object;
.source "ViewBox.java"


# direct methods
.method public static a(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;
    .locals 20

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    move/from16 v3, p3

    .line 9
    .line 10
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 11
    float-to-double v4, v4

    .line 12
    .line 13
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 14
    float-to-double v6, v6

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 18
    move-result v8

    .line 19
    float-to-double v8, v8

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 23
    move-result v0

    .line 24
    float-to-double v10, v0

    .line 25
    .line 26
    iget v0, v1, Landroid/graphics/RectF;->left:F

    .line 27
    float-to-double v12, v0

    .line 28
    .line 29
    iget v0, v1, Landroid/graphics/RectF;->top:F

    .line 30
    float-to-double v14, v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 34
    move-result v0

    .line 35
    float-to-double v0, v0

    .line 36
    .line 37
    move-wide/from16 v16, v0

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/RectF;->height()F

    .line 41
    move-result v0

    .line 42
    float-to-double v0, v0

    .line 43
    .line 44
    move-wide/from16 p0, v0

    .line 45
    .line 46
    div-double v0, v16, v8

    .line 47
    .line 48
    move-wide/from16 v18, v4

    .line 49
    .line 50
    div-double v4, p0, v10

    .line 51
    .line 52
    mul-double v18, v18, v0

    .line 53
    .line 54
    sub-double v12, v12, v18

    .line 55
    mul-double/2addr v6, v4

    .line 56
    sub-double/2addr v14, v6

    .line 57
    const/4 v6, 0x2

    .line 58
    .line 59
    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    .line 60
    .line 61
    if-ne v3, v6, :cond_1

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 65
    move-result-wide v0

    .line 66
    .line 67
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 68
    .line 69
    cmpl-double v2, v0, v2

    .line 70
    .line 71
    if-lez v2, :cond_0

    .line 72
    .line 73
    div-double v2, v16, v0

    .line 74
    sub-double/2addr v2, v8

    .line 75
    .line 76
    div-double v2, v2, v18

    .line 77
    sub-double/2addr v12, v2

    .line 78
    .line 79
    div-double v2, p0, v0

    .line 80
    sub-double/2addr v2, v10

    .line 81
    .line 82
    :goto_0
    div-double v2, v2, v18

    .line 83
    sub-double/2addr v14, v2

    .line 84
    goto :goto_1

    .line 85
    :cond_0
    mul-double/2addr v8, v0

    .line 86
    .line 87
    sub-double v2, v16, v8

    .line 88
    .line 89
    div-double v2, v2, v18

    .line 90
    sub-double/2addr v12, v2

    .line 91
    mul-double/2addr v10, v0

    .line 92
    .line 93
    sub-double v2, p0, v10

    .line 94
    goto :goto_0

    .line 95
    :goto_1
    move-wide v4, v0

    .line 96
    goto :goto_4

    .line 97
    .line 98
    :cond_1
    const-string v6, "none"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    move-result v7

    .line 103
    .line 104
    if-nez v7, :cond_2

    .line 105
    .line 106
    if-nez v3, :cond_2

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 110
    move-result-wide v0

    .line 111
    :goto_2
    move-wide v4, v0

    .line 112
    goto :goto_3

    .line 113
    .line 114
    .line 115
    :cond_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    move-result v6

    .line 117
    .line 118
    if-nez v6, :cond_3

    .line 119
    const/4 v6, 0x1

    .line 120
    .line 121
    if-ne v3, v6, :cond_3

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 125
    move-result-wide v0

    .line 126
    goto :goto_2

    .line 127
    .line 128
    :cond_3
    :goto_3
    const-string v3, "xMid"

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 132
    move-result v3

    .line 133
    .line 134
    if-eqz v3, :cond_4

    .line 135
    .line 136
    mul-double v6, v8, v0

    .line 137
    .line 138
    sub-double v6, v16, v6

    .line 139
    .line 140
    div-double v6, v6, v18

    .line 141
    add-double/2addr v12, v6

    .line 142
    .line 143
    :cond_4
    const-string v3, "xMax"

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 147
    move-result v3

    .line 148
    .line 149
    if-eqz v3, :cond_5

    .line 150
    mul-double/2addr v8, v0

    .line 151
    .line 152
    sub-double v6, v16, v8

    .line 153
    add-double/2addr v12, v6

    .line 154
    .line 155
    :cond_5
    const-string v3, "YMid"

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 159
    move-result v3

    .line 160
    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    mul-double v6, v10, v4

    .line 164
    .line 165
    sub-double v6, p0, v6

    .line 166
    .line 167
    div-double v6, v6, v18

    .line 168
    add-double/2addr v14, v6

    .line 169
    .line 170
    :cond_6
    const-string v3, "YMax"

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 174
    move-result v2

    .line 175
    .line 176
    if-eqz v2, :cond_7

    .line 177
    mul-double/2addr v10, v4

    .line 178
    .line 179
    sub-double v2, p0, v10

    .line 180
    add-double/2addr v14, v2

    .line 181
    .line 182
    :cond_7
    :goto_4
    new-instance v2, Landroid/graphics/Matrix;

    .line 183
    .line 184
    .line 185
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 186
    double-to-float v3, v12

    .line 187
    double-to-float v6, v14

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v3, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 191
    double-to-float v0, v0

    .line 192
    double-to-float v1, v4

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 196
    return-object v2
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
