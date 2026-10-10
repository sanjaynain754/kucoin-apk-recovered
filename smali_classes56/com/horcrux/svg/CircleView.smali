.class Lcom/horcrux/svg/CircleView;
.super Lcom/horcrux/svg/RenderableView;
.source "CircleView.java"


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
    iput-object p1, p0, Lcom/horcrux/svg/CircleView;->b:Lcom/horcrux/svg/SVGLength;

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
    iput-object p1, p0, Lcom/horcrux/svg/CircleView;->c:Lcom/horcrux/svg/SVGLength;

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
    .locals 16

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
    iget-object v2, v0, Lcom/horcrux/svg/CircleView;->b:Lcom/horcrux/svg/SVGLength;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    iget-object v4, v0, Lcom/horcrux/svg/CircleView;->c:Lcom/horcrux/svg/SVGLength;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 19
    move-result-wide v4

    .line 20
    .line 21
    iget-object v6, v0, Lcom/horcrux/svg/CircleView;->d:Lcom/horcrux/svg/SVGLength;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v6}, Lcom/horcrux/svg/VirtualView;->relativeOnOther(Lcom/horcrux/svg/SVGLength;)D

    .line 25
    move-result-wide v6

    .line 26
    double-to-float v8, v2

    .line 27
    double-to-float v9, v4

    .line 28
    double-to-float v10, v6

    .line 29
    .line 30
    sget-object v11, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v8, v9, v10, v11}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 34
    .line 35
    new-instance v8, Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    iput-object v8, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 41
    .line 42
    new-instance v9, Lcom/horcrux/svg/f;

    .line 43
    .line 44
    sget-object v10, Lcom/horcrux/svg/ElementType;->kCGPathElementMoveToPoint:Lcom/horcrux/svg/ElementType;

    .line 45
    .line 46
    new-instance v11, Lcom/horcrux/svg/h;

    .line 47
    .line 48
    sub-double v12, v4, v6

    .line 49
    .line 50
    .line 51
    invoke-direct {v11, v2, v3, v12, v13}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 52
    .line 53
    .line 54
    filled-new-array {v11}, [Lcom/horcrux/svg/h;

    .line 55
    move-result-object v11

    .line 56
    .line 57
    .line 58
    invoke-direct {v9, v10, v11}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    iget-object v8, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance v9, Lcom/horcrux/svg/f;

    .line 66
    .line 67
    sget-object v10, Lcom/horcrux/svg/ElementType;->kCGPathElementAddLineToPoint:Lcom/horcrux/svg/ElementType;

    .line 68
    .line 69
    new-instance v11, Lcom/horcrux/svg/h;

    .line 70
    .line 71
    .line 72
    invoke-direct {v11, v2, v3, v12, v13}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 73
    .line 74
    new-instance v14, Lcom/horcrux/svg/h;

    .line 75
    .line 76
    move-wide/from16 p1, v6

    .line 77
    .line 78
    add-double v6, v2, p1

    .line 79
    .line 80
    .line 81
    invoke-direct {v14, v6, v7, v4, v5}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 82
    .line 83
    .line 84
    filled-new-array {v11, v14}, [Lcom/horcrux/svg/h;

    .line 85
    move-result-object v11

    .line 86
    .line 87
    .line 88
    invoke-direct {v9, v10, v11}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    iget-object v8, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 94
    .line 95
    new-instance v9, Lcom/horcrux/svg/f;

    .line 96
    .line 97
    new-instance v11, Lcom/horcrux/svg/h;

    .line 98
    .line 99
    .line 100
    invoke-direct {v11, v6, v7, v4, v5}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 101
    .line 102
    new-instance v6, Lcom/horcrux/svg/h;

    .line 103
    .line 104
    add-double v14, v4, p1

    .line 105
    .line 106
    .line 107
    invoke-direct {v6, v2, v3, v14, v15}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 108
    .line 109
    .line 110
    filled-new-array {v11, v6}, [Lcom/horcrux/svg/h;

    .line 111
    move-result-object v6

    .line 112
    .line 113
    .line 114
    invoke-direct {v9, v10, v6}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    iget-object v6, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 120
    .line 121
    new-instance v7, Lcom/horcrux/svg/f;

    .line 122
    .line 123
    new-instance v8, Lcom/horcrux/svg/h;

    .line 124
    .line 125
    .line 126
    invoke-direct {v8, v2, v3, v14, v15}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 127
    .line 128
    new-instance v9, Lcom/horcrux/svg/h;

    .line 129
    .line 130
    sub-double v14, v2, p1

    .line 131
    .line 132
    .line 133
    invoke-direct {v9, v14, v15, v4, v5}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 134
    .line 135
    .line 136
    filled-new-array {v8, v9}, [Lcom/horcrux/svg/h;

    .line 137
    move-result-object v8

    .line 138
    .line 139
    .line 140
    invoke-direct {v7, v10, v8}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    iget-object v6, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 146
    .line 147
    new-instance v7, Lcom/horcrux/svg/f;

    .line 148
    .line 149
    new-instance v8, Lcom/horcrux/svg/h;

    .line 150
    .line 151
    .line 152
    invoke-direct {v8, v14, v15, v4, v5}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 153
    .line 154
    new-instance v4, Lcom/horcrux/svg/h;

    .line 155
    .line 156
    .line 157
    invoke-direct {v4, v2, v3, v12, v13}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 158
    .line 159
    .line 160
    filled-new-array {v8, v4}, [Lcom/horcrux/svg/h;

    .line 161
    move-result-object v2

    .line 162
    .line 163
    .line 164
    invoke-direct {v7, v10, v2}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    return-object v1
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
    iput-object p1, p0, Lcom/horcrux/svg/CircleView;->d:Lcom/horcrux/svg/SVGLength;

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
