.class Lcom/horcrux/svg/EllipseView;
.super Lcom/horcrux/svg/RenderableView;
.source "EllipseView.java"


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
    iput-object p1, p0, Lcom/horcrux/svg/EllipseView;->b:Lcom/horcrux/svg/SVGLength;

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
    iput-object p1, p0, Lcom/horcrux/svg/EllipseView;->c:Lcom/horcrux/svg/SVGLength;

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
    .locals 20

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
    iget-object v2, v0, Lcom/horcrux/svg/EllipseView;->b:Lcom/horcrux/svg/SVGLength;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    iget-object v4, v0, Lcom/horcrux/svg/EllipseView;->c:Lcom/horcrux/svg/SVGLength;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 19
    move-result-wide v4

    .line 20
    .line 21
    iget-object v6, v0, Lcom/horcrux/svg/EllipseView;->d:Lcom/horcrux/svg/SVGLength;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v6}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 25
    move-result-wide v6

    .line 26
    .line 27
    iget-object v8, v0, Lcom/horcrux/svg/EllipseView;->e:Lcom/horcrux/svg/SVGLength;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v8}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 31
    move-result-wide v8

    .line 32
    .line 33
    new-instance v10, Landroid/graphics/RectF;

    .line 34
    .line 35
    sub-double v11, v2, v6

    .line 36
    double-to-float v13, v11

    .line 37
    .line 38
    sub-double v14, v4, v8

    .line 39
    .line 40
    move-wide/from16 p1, v6

    .line 41
    double-to-float v6, v14

    .line 42
    .line 43
    move-wide/from16 v16, v8

    .line 44
    .line 45
    add-double v7, v2, p1

    .line 46
    double-to-float v9, v7

    .line 47
    .line 48
    move-wide/from16 p1, v11

    .line 49
    .line 50
    add-double v11, v4, v16

    .line 51
    .line 52
    move-wide/from16 v16, v4

    .line 53
    double-to-float v4, v11

    .line 54
    .line 55
    .line 56
    invoke-direct {v10, v13, v6, v9, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 57
    .line 58
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v10, v4}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 62
    .line 63
    new-instance v4, Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    iput-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 69
    .line 70
    new-instance v5, Lcom/horcrux/svg/f;

    .line 71
    .line 72
    sget-object v6, Lcom/horcrux/svg/ElementType;->kCGPathElementMoveToPoint:Lcom/horcrux/svg/ElementType;

    .line 73
    .line 74
    new-instance v9, Lcom/horcrux/svg/h;

    .line 75
    .line 76
    .line 77
    invoke-direct {v9, v2, v3, v14, v15}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 78
    .line 79
    .line 80
    filled-new-array {v9}, [Lcom/horcrux/svg/h;

    .line 81
    move-result-object v9

    .line 82
    .line 83
    .line 84
    invoke-direct {v5, v6, v9}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 90
    .line 91
    new-instance v5, Lcom/horcrux/svg/f;

    .line 92
    .line 93
    sget-object v6, Lcom/horcrux/svg/ElementType;->kCGPathElementAddLineToPoint:Lcom/horcrux/svg/ElementType;

    .line 94
    .line 95
    new-instance v9, Lcom/horcrux/svg/h;

    .line 96
    .line 97
    .line 98
    invoke-direct {v9, v2, v3, v14, v15}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 99
    .line 100
    new-instance v10, Lcom/horcrux/svg/h;

    .line 101
    .line 102
    move-wide/from16 v18, v14

    .line 103
    .line 104
    move-wide/from16 v13, v16

    .line 105
    .line 106
    .line 107
    invoke-direct {v10, v7, v8, v13, v14}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 108
    .line 109
    .line 110
    filled-new-array {v9, v10}, [Lcom/horcrux/svg/h;

    .line 111
    move-result-object v9

    .line 112
    .line 113
    .line 114
    invoke-direct {v5, v6, v9}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 120
    .line 121
    new-instance v5, Lcom/horcrux/svg/f;

    .line 122
    .line 123
    new-instance v9, Lcom/horcrux/svg/h;

    .line 124
    .line 125
    .line 126
    invoke-direct {v9, v7, v8, v13, v14}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 127
    .line 128
    new-instance v7, Lcom/horcrux/svg/h;

    .line 129
    .line 130
    .line 131
    invoke-direct {v7, v2, v3, v11, v12}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 132
    .line 133
    .line 134
    filled-new-array {v9, v7}, [Lcom/horcrux/svg/h;

    .line 135
    move-result-object v7

    .line 136
    .line 137
    .line 138
    invoke-direct {v5, v6, v7}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 144
    .line 145
    new-instance v5, Lcom/horcrux/svg/f;

    .line 146
    .line 147
    new-instance v7, Lcom/horcrux/svg/h;

    .line 148
    .line 149
    .line 150
    invoke-direct {v7, v2, v3, v11, v12}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 151
    .line 152
    new-instance v8, Lcom/horcrux/svg/h;

    .line 153
    .line 154
    move-wide/from16 v9, p1

    .line 155
    .line 156
    .line 157
    invoke-direct {v8, v9, v10, v13, v14}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 158
    .line 159
    .line 160
    filled-new-array {v7, v8}, [Lcom/horcrux/svg/h;

    .line 161
    move-result-object v7

    .line 162
    .line 163
    .line 164
    invoke-direct {v5, v6, v7}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 170
    .line 171
    new-instance v5, Lcom/horcrux/svg/f;

    .line 172
    .line 173
    new-instance v7, Lcom/horcrux/svg/h;

    .line 174
    .line 175
    .line 176
    invoke-direct {v7, v9, v10, v13, v14}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 177
    .line 178
    new-instance v8, Lcom/horcrux/svg/h;

    .line 179
    .line 180
    move-wide/from16 v9, v18

    .line 181
    .line 182
    .line 183
    invoke-direct {v8, v2, v3, v9, v10}, Lcom/horcrux/svg/h;-><init>(DD)V

    .line 184
    .line 185
    .line 186
    filled-new-array {v7, v8}, [Lcom/horcrux/svg/h;

    .line 187
    move-result-object v2

    .line 188
    .line 189
    .line 190
    invoke-direct {v5, v6, v2}, Lcom/horcrux/svg/f;-><init>(Lcom/horcrux/svg/ElementType;[Lcom/horcrux/svg/h;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    return-object v1
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
    iput-object p1, p0, Lcom/horcrux/svg/EllipseView;->d:Lcom/horcrux/svg/SVGLength;

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
    iput-object p1, p0, Lcom/horcrux/svg/EllipseView;->e:Lcom/horcrux/svg/SVGLength;

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
