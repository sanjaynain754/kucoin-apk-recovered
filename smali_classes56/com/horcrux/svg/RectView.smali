.class Lcom/horcrux/svg/RectView;
.super Lcom/horcrux/svg/RenderableView;
.source "RectView.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field public b:Lcom/horcrux/svg/SVGLength;

.field public c:Lcom/horcrux/svg/SVGLength;

.field public d:Lcom/horcrux/svg/SVGLength;

.field public e:Lcom/horcrux/svg/SVGLength;

.field public f:Lcom/horcrux/svg/SVGLength;

.field public g:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public f(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/RectView;->e:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public g(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/RectView;->f:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Landroid/graphics/Path;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 8
    .line 9
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->b:Lcom/horcrux/svg/SVGLength;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 13
    move-result-wide v9

    .line 14
    .line 15
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->c:Lcom/horcrux/svg/SVGLength;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 19
    move-result-wide v11

    .line 20
    .line 21
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->d:Lcom/horcrux/svg/SVGLength;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 25
    move-result-wide v13

    .line 26
    .line 27
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->e:Lcom/horcrux/svg/SVGLength;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 31
    move-result-wide v15

    .line 32
    .line 33
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->f:Lcom/horcrux/svg/SVGLength;

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    iget-object v3, v0, Lcom/horcrux/svg/RectView;->g:Lcom/horcrux/svg/SVGLength;

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    double-to-float v2, v9

    .line 42
    double-to-float v3, v11

    .line 43
    .line 44
    add-double v4, v9, v13

    .line 45
    double-to-float v4, v4

    .line 46
    .line 47
    add-double v5, v11, v15

    .line 48
    double-to-float v5, v5

    .line 49
    .line 50
    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 57
    goto :goto_3

    .line 58
    .line 59
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 60
    .line 61
    iget-object v2, v0, Lcom/horcrux/svg/RectView;->g:Lcom/horcrux/svg/SVGLength;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 65
    move-result-wide v2

    .line 66
    :goto_1
    move-wide v4, v2

    .line 67
    goto :goto_2

    .line 68
    .line 69
    :cond_2
    iget-object v3, v0, Lcom/horcrux/svg/RectView;->g:Lcom/horcrux/svg/SVGLength;

    .line 70
    .line 71
    if-nez v3, :cond_3

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 75
    move-result-wide v2

    .line 76
    goto :goto_1

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 80
    move-result-wide v2

    .line 81
    .line 82
    iget-object v4, v0, Lcom/horcrux/svg/RectView;->g:Lcom/horcrux/svg/SVGLength;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 86
    move-result-wide v4

    .line 87
    .line 88
    :goto_2
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 89
    .line 90
    div-double v17, v13, v6

    .line 91
    .line 92
    cmpl-double v8, v2, v17

    .line 93
    .line 94
    if-lez v8, :cond_4

    .line 95
    .line 96
    move-wide/from16 v2, v17

    .line 97
    .line 98
    :cond_4
    div-double v6, v15, v6

    .line 99
    .line 100
    cmpl-double v8, v4, v6

    .line 101
    .line 102
    if-lez v8, :cond_5

    .line 103
    move-wide v4, v6

    .line 104
    :cond_5
    double-to-float v6, v9

    .line 105
    double-to-float v7, v11

    .line 106
    move v8, v6

    .line 107
    .line 108
    move/from16 v17, v7

    .line 109
    .line 110
    add-double v6, v9, v13

    .line 111
    double-to-float v6, v6

    .line 112
    .line 113
    move/from16 v18, v6

    .line 114
    .line 115
    add-double v6, v11, v15

    .line 116
    double-to-float v6, v6

    .line 117
    double-to-float v2, v2

    .line 118
    double-to-float v7, v4

    .line 119
    move v5, v6

    .line 120
    move v6, v2

    .line 121
    move v2, v8

    .line 122
    .line 123
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 124
    .line 125
    move/from16 v3, v17

    .line 126
    .line 127
    move/from16 v4, v18

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->addRoundRect(FFFFFFLandroid/graphics/Path$Direction;)V

    .line 131
    .line 132
    :goto_3
    new-instance v2, Ljava/util/ArrayList;

    .line 133
    .line 134
    .line 135
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    iput-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 138
    .line 139
    new-instance v3, Lcom/horcrux/svg/f;

    .line 140
    .line 141
    sget-object v4, Lcom/horcrux/svg/ElementType;->kCGPathElementMoveToPoint:Lcom/horcrux/svg/ElementType;

    .line 142
    .line 143
    new-instance v5, Lcom/horcrux/svg/h;

    .line 144
    .line 145
    .line 146
    invoke-direct {v5, v9, v10, v11, v12}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 147
    .line 148
    .line 149
    filled-new-array {v5}, [Lcom/horcrux/svg/h;

    .line 150
    move-result-object v5

    .line 151
    .line 152
    .line 153
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    iget-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 159
    .line 160
    new-instance v3, Lcom/horcrux/svg/f;

    .line 161
    .line 162
    sget-object v4, Lcom/horcrux/svg/ElementType;->kCGPathElementAddLineToPoint:Lcom/horcrux/svg/ElementType;

    .line 163
    .line 164
    new-instance v5, Lcom/horcrux/svg/h;

    .line 165
    add-double/2addr v13, v9

    .line 166
    .line 167
    .line 168
    invoke-direct {v5, v13, v14, v11, v12}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 169
    .line 170
    .line 171
    filled-new-array {v5}, [Lcom/horcrux/svg/h;

    .line 172
    move-result-object v5

    .line 173
    .line 174
    .line 175
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    iget-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 181
    .line 182
    new-instance v3, Lcom/horcrux/svg/f;

    .line 183
    .line 184
    new-instance v5, Lcom/horcrux/svg/h;

    .line 185
    .line 186
    add-double v6, v11, v15

    .line 187
    .line 188
    .line 189
    invoke-direct {v5, v13, v14, v6, v7}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 190
    .line 191
    .line 192
    filled-new-array {v5}, [Lcom/horcrux/svg/h;

    .line 193
    move-result-object v5

    .line 194
    .line 195
    .line 196
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    iget-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 202
    .line 203
    new-instance v3, Lcom/horcrux/svg/f;

    .line 204
    .line 205
    new-instance v5, Lcom/horcrux/svg/h;

    .line 206
    .line 207
    .line 208
    invoke-direct {v5, v9, v10, v6, v7}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 209
    .line 210
    .line 211
    filled-new-array {v5}, [Lcom/horcrux/svg/h;

    .line 212
    move-result-object v5

    .line 213
    .line 214
    .line 215
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    iget-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 221
    .line 222
    new-instance v3, Lcom/horcrux/svg/f;

    .line 223
    .line 224
    new-instance v5, Lcom/horcrux/svg/h;

    .line 225
    .line 226
    .line 227
    invoke-direct {v5, v9, v10, v11, v12}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 228
    .line 229
    .line 230
    filled-new-array {v5}, [Lcom/horcrux/svg/h;

    .line 231
    move-result-object v5

    .line 232
    .line 233
    .line 234
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    return-object v1
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

.method public h(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/RectView;->g:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public i(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/RectView;->d:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public j(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/RectView;->b:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method

.method public k(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/RectView;->c:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

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
.end method
