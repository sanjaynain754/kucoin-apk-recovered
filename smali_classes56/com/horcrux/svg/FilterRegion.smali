.class public Lcom/horcrux/svg/FilterRegion;
.super Ljava/lang/Object;
.source "FilterRegion.java"


# instance fields
.field mH:Lcom/horcrux/svg/SVGLength;

.field mW:Lcom/horcrux/svg/SVGLength;

.field mX:Lcom/horcrux/svg/SVGLength;

.field mY:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>()V
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

.method private getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D
    .locals 2

    .line 1
    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    iget-object v0, p2, Lcom/horcrux/svg/SVGLength;->b:Lcom/horcrux/svg/SVGLength$UnitType;

    .line 5
    .line 6
    sget-object v1, Lcom/horcrux/svg/SVGLength$UnitType;->UNKNOWN:Lcom/horcrux/svg/SVGLength$UnitType;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/horcrux/svg/VirtualView;->relativeOn(Lcom/horcrux/svg/SVGLength;F)D

    .line 13
    move-result-wide p1

    .line 14
    return-wide p1

    .line 15
    :cond_1
    :goto_0
    return-wide p4
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


# virtual methods
.method public getCropRect(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/FilterProperties$Units;Landroid/graphics/RectF;)Landroid/graphics/Rect;
    .locals 12

    .line 1
    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    new-instance p1, Landroid/graphics/Rect;

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/horcrux/svg/FilterProperties$Units;->OBJECT_BOUNDING_BOX:Lcom/horcrux/svg/FilterProperties$Units;

    .line 12
    .line 13
    if-ne p2, v0, :cond_1

    .line 14
    .line 15
    iget p2, p3, Landroid/graphics/RectF;->left:F

    .line 16
    float-to-double v0, p2

    .line 17
    .line 18
    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 22
    move-result v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    .line 26
    move-result-wide v2

    .line 27
    add-double/2addr v0, v2

    .line 28
    .line 29
    iget p2, p3, Landroid/graphics/RectF;->top:F

    .line 30
    float-to-double v2, p2

    .line 31
    .line 32
    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    .line 36
    move-result v4

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    .line 40
    move-result-wide v4

    .line 41
    add-double/2addr v2, v4

    .line 42
    .line 43
    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 47
    move-result v4

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    .line 51
    move-result-wide v4

    .line 52
    .line 53
    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    .line 57
    move-result p3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2, p3}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    .line 61
    move-result-wide p1

    .line 62
    goto :goto_0

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/horcrux/svg/SvgView;->getCanvasWidth()F

    .line 70
    move-result v3

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 74
    move-result-object p2

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/horcrux/svg/SvgView;->getCanvasHeight()F

    .line 78
    move-result v7

    .line 79
    .line 80
    iget-object v2, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

    .line 81
    .line 82
    iget p2, p3, Landroid/graphics/RectF;->left:F

    .line 83
    float-to-double v4, p2

    .line 84
    move-object v0, p0

    .line 85
    move-object v1, p1

    .line 86
    .line 87
    .line 88
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/FilterRegion;->getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D

    .line 89
    move-result-wide p1

    .line 90
    .line 91
    iget-object v6, v0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

    .line 92
    .line 93
    iget v2, p3, Landroid/graphics/RectF;->top:F

    .line 94
    float-to-double v8, v2

    .line 95
    move-object v4, v0

    .line 96
    move-object v5, v1

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v4 .. v9}, Lcom/horcrux/svg/FilterRegion;->getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D

    .line 100
    move-result-wide v10

    .line 101
    .line 102
    iget-object v2, v0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 106
    move-result v4

    .line 107
    float-to-double v4, v4

    .line 108
    .line 109
    .line 110
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/FilterRegion;->getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D

    .line 111
    move-result-wide v2

    .line 112
    .line 113
    iget-object v6, v0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    .line 117
    move-result p3

    .line 118
    float-to-double v8, p3

    .line 119
    move-object v4, v0

    .line 120
    move-object v5, v1

    .line 121
    .line 122
    .line 123
    invoke-direct/range {v4 .. v9}, Lcom/horcrux/svg/FilterRegion;->getRelativeOrDefault(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/SVGLength;FD)D

    .line 124
    move-result-wide v0

    .line 125
    move-wide v4, v0

    .line 126
    move-wide v0, p1

    .line 127
    move-wide p1, v4

    .line 128
    move-wide v4, v2

    .line 129
    move-wide v2, v10

    .line 130
    .line 131
    :goto_0
    new-instance p3, Landroid/graphics/Rect;

    .line 132
    double-to-int v6, v0

    .line 133
    double-to-int v7, v2

    .line 134
    add-double/2addr v0, v4

    .line 135
    double-to-int v0, v0

    .line 136
    add-double/2addr v2, p1

    .line 137
    double-to-int p1, v2

    .line 138
    .line 139
    .line 140
    invoke-direct {p3, v6, v7, v0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 141
    return-object p3
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

.method public setHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setX(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setY(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
