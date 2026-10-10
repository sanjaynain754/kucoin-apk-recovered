.class public Lcom/horcrux/svg/Brush;
.super Ljava/lang/Object;
.source "Brush.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/Brush$BrushType;,
        Lcom/horcrux/svg/Brush$BrushUnits;
    }
.end annotation


# instance fields
.field public final a:Lcom/horcrux/svg/Brush$BrushType;

.field public final b:[Lcom/horcrux/svg/SVGLength;

.field public c:Lcom/facebook/react/bridge/ReadableArray;

.field public final d:Z

.field public e:Z

.field public f:Landroid/graphics/Matrix;

.field public g:Landroid/graphics/Rect;

.field public h:Lcom/horcrux/svg/PatternView;


# direct methods
.method public constructor <init>(Lcom/horcrux/svg/Brush$BrushType;[Lcom/horcrux/svg/SVGLength;Lcom/horcrux/svg/Brush$BrushUnits;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->a:Lcom/horcrux/svg/Brush$BrushType;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    .line 8
    .line 9
    sget-object p1, Lcom/horcrux/svg/Brush$BrushUnits;->OBJECT_BOUNDING_BOX:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 10
    .line 11
    if-ne p3, p1, :cond_0

    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    .line 16
    :goto_0
    iput-boolean p1, p0, Lcom/horcrux/svg/Brush;->d:Z

    .line 17
    return-void
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
.end method

.method public static c(Lcom/facebook/react/bridge/ReadableArray;I[F[IF)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    if-ge v0, p1, :cond_0

    .line 4
    .line 5
    mul-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 9
    move-result-wide v2

    .line 10
    double-to-float v2, v2

    .line 11
    .line 12
    aput v2, p2, v0

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 18
    move-result v1

    .line 19
    .line 20
    ushr-int/lit8 v2, v1, 0x18

    .line 21
    int-to-float v2, v2

    .line 22
    mul-float/2addr v2, p4

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 26
    move-result v2

    .line 27
    .line 28
    shl-int/lit8 v2, v2, 0x18

    .line 29
    .line 30
    .line 31
    const v3, 0xffffff

    .line 32
    and-int/2addr v1, v3

    .line 33
    or-int/2addr v1, v2

    .line 34
    .line 35
    aput v1, p3, v0

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
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
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/horcrux/svg/Brush;->d:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    new-instance p1, Landroid/graphics/RectF;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/horcrux/svg/Brush;->g:Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 20
    move-result v1

    .line 21
    .line 22
    iget-boolean v2, p0, Lcom/horcrux/svg/Brush;->d:Z

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 27
    .line 28
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    move p1, v2

    .line 32
    .line 33
    :goto_1
    new-instance v3, Landroid/graphics/RectF;

    .line 34
    add-float/2addr v0, v2

    .line 35
    add-float/2addr v1, p1

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v2, p1, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 39
    return-object v3
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

.method public final b(Lcom/horcrux/svg/SVGLength;DFF)D
    .locals 10

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/horcrux/svg/Brush;->d:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p1, Lcom/horcrux/svg/SVGLength;->b:Lcom/horcrux/svg/SVGLength$UnitType;

    .line 7
    .line 8
    sget-object v2, Lcom/horcrux/svg/SVGLength$UnitType;->NUMBER:Lcom/horcrux/svg/SVGLength$UnitType;

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    move-wide v6, p2

    .line 12
    :goto_0
    move v0, p5

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    float-to-double v2, p4

    .line 15
    move-wide v6, v2

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    float-to-double v8, v0

    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    move-object v1, p1

    .line 21
    move-wide v2, p2

    .line 22
    .line 23
    .line 24
    invoke-static/range {v1 .. v9}, Lcom/horcrux/svg/i;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 25
    move-result-wide v0

    .line 26
    return-wide v0
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

.method public d(Lcom/horcrux/svg/Brush$BrushUnits;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/horcrux/svg/Brush$BrushUnits;->OBJECT_BOUNDING_BOX:Lcom/horcrux/svg/Brush$BrushUnits;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    .line 9
    :goto_0
    iput-boolean p1, p0, Lcom/horcrux/svg/Brush;->e:Z

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

.method public e(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->c:Lcom/facebook/react/bridge/ReadableArray;

    .line 3
    return-void
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
.end method

.method public f(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->f:Landroid/graphics/Matrix;

    .line 3
    return-void
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
.end method

.method public g(Lcom/horcrux/svg/PatternView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->h:Lcom/horcrux/svg/PatternView;

    .line 3
    return-void
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
.end method

.method public h(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/horcrux/svg/Brush;->g:Landroid/graphics/Rect;

    .line 3
    return-void
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
.end method

.method public i(Landroid/graphics/Paint;Landroid/graphics/RectF;FF)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v1, p2

    move/from16 v7, p4

    .line 1
    invoke-virtual {v0, v1}, Lcom/horcrux/svg/Brush;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v8

    .line 3
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v9

    .line 4
    iget v10, v1, Landroid/graphics/RectF;->left:F

    .line 5
    iget v11, v1, Landroid/graphics/RectF;->top:F

    .line 6
    invoke-virtual {v6}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    .line 7
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->a:Lcom/horcrux/svg/Brush$BrushType;

    sget-object v2, Lcom/horcrux/svg/Brush$BrushType;->PATTERN:Lcom/horcrux/svg/Brush$BrushType;

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-ne v1, v2, :cond_4

    .line 8
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v15

    float-to-double v2, v8

    move/from16 v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v10

    move-wide v15, v2

    .line 9
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v14

    float-to-double v2, v9

    const/16 p2, 0x3

    const/16 v17, 0x2

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v12

    move-wide/from16 v18, v2

    .line 10
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v17

    move-wide v2, v15

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v14

    .line 11
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, p2

    move-wide/from16 v2, v18

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpl-double v5, v14, v3

    if-lez v5, :cond_c

    cmpl-double v3, v1, v3

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    double-to-int v3, v14

    double-to-int v4, v1

    .line 12
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 13
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 14
    iget-object v5, v0, Lcom/horcrux/svg/Brush;->h:Lcom/horcrux/svg/PatternView;

    invoke-virtual {v5}, Lcom/horcrux/svg/PatternView;->getViewBox()Landroid/graphics/RectF;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 15
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v16

    const/16 v17, 0x0

    cmpl-float v16, v16, v17

    if-lez v16, :cond_1

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v16

    cmpl-float v16, v16, v17

    if-lez v16, :cond_1

    move/from16 v16, v9

    .line 16
    new-instance v9, Landroid/graphics/RectF;

    double-to-float v10, v10

    double-to-float v11, v12

    double-to-float v12, v14

    double-to-float v1, v1

    invoke-direct {v9, v10, v11, v12, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 17
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->h:Lcom/horcrux/svg/PatternView;

    iget-object v2, v1, Lcom/horcrux/svg/PatternView;->q:Ljava/lang/String;

    iget v1, v1, Lcom/horcrux/svg/PatternView;->r:I

    .line 18
    invoke-static {v5, v9, v2, v1}, Lcom/horcrux/svg/t;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;

    move-result-object v1

    .line 19
    invoke-virtual {v4, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    goto :goto_0

    :cond_1
    move/from16 v16, v9

    .line 20
    :goto_0
    iget-boolean v1, v0, Lcom/horcrux/svg/Brush;->e:Z

    if-eqz v1, :cond_2

    div-float v8, v8, p3

    div-float v9, v16, p3

    .line 21
    invoke-virtual {v4, v8, v9}, Landroid/graphics/Canvas;->scale(FF)V

    .line 22
    :cond_2
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->h:Lcom/horcrux/svg/PatternView;

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v1, v4, v2, v7}, Lcom/horcrux/svg/GroupView;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 23
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 24
    iget-object v2, v0, Lcom/horcrux/svg/Brush;->f:Landroid/graphics/Matrix;

    if-eqz v2, :cond_3

    .line 25
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 26
    :cond_3
    new-instance v2, Landroid/graphics/BitmapShader;

    sget-object v4, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-direct {v2, v3, v4, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 27
    invoke-virtual {v2, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 28
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    :cond_4
    move/from16 v16, v9

    const/16 p2, 0x3

    const/16 v17, 0x2

    .line 29
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->c:Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    .line 30
    const-string v2, "ReactNative"

    if-nez v1, :cond_5

    .line 31
    const-string v1, "Gradient contains no stops"

    invoke-static {v2, v1}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 32
    :cond_5
    div-int/lit8 v1, v1, 0x2

    .line 33
    new-array v3, v1, [I

    .line 34
    new-array v4, v1, [F

    .line 35
    iget-object v9, v0, Lcom/horcrux/svg/Brush;->c:Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {v9, v1, v4, v3, v7}, Lcom/horcrux/svg/Brush;->c(Lcom/facebook/react/bridge/ReadableArray;I[F[IF)V

    if-ne v1, v14, :cond_6

    move/from16 v1, v17

    .line 36
    new-array v7, v1, [I

    aget v9, v3, v15

    aput v9, v7, v15

    aget v3, v3, v15

    aput v3, v7, v14

    .line 37
    new-array v3, v1, [F

    aget v1, v4, v15

    aput v1, v3, v15

    aget v1, v4, v15

    aput v1, v3, v14

    .line 38
    const-string v1, "Gradient contains only one stop"

    invoke-static {v2, v1}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v24, v3

    move-object/from16 v23, v7

    goto :goto_1

    :cond_6
    move-object/from16 v23, v3

    move-object/from16 v24, v4

    .line 39
    :goto_1
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->a:Lcom/horcrux/svg/Brush$BrushType;

    sget-object v2, Lcom/horcrux/svg/Brush$BrushType;->LINEAR_GRADIENT:Lcom/horcrux/svg/Brush$BrushType;

    if-ne v1, v2, :cond_8

    .line 40
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v15

    float-to-double v2, v8

    move/from16 v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v7

    move-wide v12, v2

    float-to-double v9, v10

    add-double/2addr v7, v9

    .line 41
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, v14

    move/from16 v2, v16

    float-to-double v2, v2

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v14

    move-wide/from16 v18, v2

    float-to-double v1, v11

    add-double/2addr v14, v1

    .line 42
    iget-object v3, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    const/16 v17, 0x2

    aget-object v3, v3, v17

    move-wide/from16 v31, v1

    move-object v1, v3

    move-wide v2, v12

    move-wide/from16 v11, v31

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    add-double/2addr v9, v1

    .line 43
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, p2

    move-wide/from16 v2, v18

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    add-double/2addr v1, v11

    .line 44
    new-instance v18, Landroid/graphics/LinearGradient;

    double-to-float v3, v7

    double-to-float v4, v14

    double-to-float v5, v9

    double-to-float v1, v1

    sget-object v25, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move/from16 v22, v1

    move/from16 v19, v3

    move/from16 v20, v4

    move/from16 v21, v5

    invoke-direct/range {v18 .. v25}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v1, v18

    .line 45
    iget-object v2, v0, Lcom/horcrux/svg/Brush;->f:Landroid/graphics/Matrix;

    if-eqz v2, :cond_7

    .line 46
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 47
    iget-object v3, v0, Lcom/horcrux/svg/Brush;->f:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 48
    invoke-virtual {v1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 49
    :cond_7
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    :cond_8
    move/from16 v2, v16

    move-object/from16 v7, v23

    move-object/from16 v9, v24

    .line 50
    sget-object v3, Lcom/horcrux/svg/Brush$BrushType;->RADIAL_GRADIENT:Lcom/horcrux/svg/Brush$BrushType;

    if-ne v1, v3, :cond_c

    .line 51
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    const/16 v17, 0x2

    aget-object v1, v1, v17

    float-to-double v3, v8

    move v8, v2

    move-wide v2, v3

    move/from16 v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v12

    move-wide/from16 v18, v2

    .line 52
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    aget-object v1, v1, p2

    float-to-double v2, v8

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v20

    move-wide/from16 v22, v2

    const-wide/16 v1, 0x0

    cmpg-double v3, v12, v1

    if-lez v3, :cond_9

    cmpg-double v1, v20, v1

    if-gtz v1, :cond_a

    :cond_9
    const/4 v1, 0x2

    goto :goto_2

    :cond_a
    move-object/from16 v28, v7

    move-object/from16 v29, v9

    move-wide/from16 v2, v20

    goto :goto_3

    .line 53
    :goto_2
    new-array v2, v1, [F

    aget v3, v9, v15

    aput v3, v2, v15

    array-length v3, v9

    sub-int/2addr v3, v14

    aget v3, v9, v3

    aput v3, v2, v14

    .line 54
    new-array v1, v1, [I

    array-length v3, v7

    sub-int/2addr v3, v14

    aget v3, v7, v3

    aput v3, v1, v15

    array-length v3, v7

    sub-int/2addr v3, v14

    aget v3, v7, v3

    aput v3, v1, v14

    move-object/from16 v28, v1

    move-object/from16 v29, v2

    move-wide/from16 v12, v18

    move-wide/from16 v2, v22

    :goto_3
    div-double v7, v2, v12

    .line 55
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    move/from16 v4, p3

    move-wide/from16 v2, v18

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    float-to-double v3, v10

    add-double v9, v1, v3

    .line 56
    iget-object v1, v0, Lcom/horcrux/svg/Brush;->b:[Lcom/horcrux/svg/SVGLength;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    div-double v2, v22, v7

    move/from16 v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/horcrux/svg/Brush;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    move-result-wide v1

    float-to-double v3, v11

    div-double/2addr v3, v7

    add-double/2addr v1, v3

    .line 57
    new-instance v24, Landroid/graphics/RadialGradient;

    double-to-float v3, v9

    double-to-float v1, v1

    double-to-float v2, v12

    sget-object v30, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move/from16 v26, v1

    move/from16 v27, v2

    move/from16 v25, v3

    invoke-direct/range {v24 .. v30}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object/from16 v1, v24

    .line 58
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v3, 0x3f800000    # 1.0f

    double-to-float v4, v7

    .line 59
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 60
    iget-object v3, v0, Lcom/horcrux/svg/Brush;->f:Landroid/graphics/Matrix;

    if-eqz v3, :cond_b

    .line 61
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 62
    :cond_b
    invoke-virtual {v1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 63
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_c
    :goto_4
    return-void
.end method
