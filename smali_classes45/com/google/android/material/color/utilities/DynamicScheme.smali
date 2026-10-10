.class public Lcom/google/android/material/color/utilities/DynamicScheme;
.super Ljava/lang/Object;
.source "DynamicScheme.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# instance fields
.field public final contrastLevel:D

.field public final errorPalette:Lcom/google/android/material/color/utilities/TonalPalette;

.field public final isDark:Z

.field public final neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

.field public final neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

.field public final primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

.field public final secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

.field public final sourceColorArgb:I

.field public final sourceColorHct:Lcom/google/android/material/color/utilities/Hct;

.field public final tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

.field public final variant:Lcom/google/android/material/color/utilities/Variant;


# direct methods
.method public constructor <init>(Lcom/google/android/material/color/utilities/Hct;Lcom/google/android/material/color/utilities/Variant;ZDLcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/TonalPalette;Lcom/google/android/material/color/utilities/TonalPalette;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/material/color/utilities/Hct;->toInt()I

    .line 7
    move-result v0

    .line 8
    .line 9
    iput v0, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->sourceColorArgb:I

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->sourceColorHct:Lcom/google/android/material/color/utilities/Hct;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->variant:Lcom/google/android/material/color/utilities/Variant;

    .line 14
    .line 15
    iput-boolean p3, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->isDark:Z

    .line 16
    .line 17
    iput-wide p4, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->contrastLevel:D

    .line 18
    .line 19
    iput-object p6, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->primaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 20
    .line 21
    iput-object p7, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->secondaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 22
    .line 23
    iput-object p8, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->tertiaryPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 24
    .line 25
    iput-object p9, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 26
    .line 27
    iput-object p10, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->neutralVariantPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 28
    .line 29
    const-wide/high16 p1, 0x4039000000000000L    # 25.0

    .line 30
    .line 31
    const-wide/high16 p3, 0x4055000000000000L    # 84.0

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2, p3, p4}, Lcom/google/android/material/color/utilities/TonalPalette;->fromHueAndChroma(DD)Lcom/google/android/material/color/utilities/TonalPalette;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lcom/google/android/material/color/utilities/DynamicScheme;->errorPalette:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 38
    return-void
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
.end method

.method public static getRotatedHue(Lcom/google/android/material/color/utilities/Hct;[D[D)D
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    .line 4
    move-result-wide v0

    .line 5
    array-length p0, p2

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    if-ne p0, v2, :cond_0

    .line 10
    .line 11
    aget-wide p0, p2, v3

    .line 12
    add-double/2addr v0, p0

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesDouble(D)D

    .line 16
    move-result-wide p0

    .line 17
    return-wide p0

    .line 18
    :cond_0
    array-length p0, p1

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v2, p0, -0x2

    .line 21
    .line 22
    if-gt v3, v2, :cond_2

    .line 23
    .line 24
    aget-wide v4, p1, v3

    .line 25
    .line 26
    add-int/lit8 v2, v3, 0x1

    .line 27
    .line 28
    aget-wide v6, p1, v2

    .line 29
    .line 30
    cmpg-double v4, v4, v0

    .line 31
    .line 32
    if-gez v4, :cond_1

    .line 33
    .line 34
    cmpg-double v4, v0, v6

    .line 35
    .line 36
    if-gez v4, :cond_1

    .line 37
    .line 38
    aget-wide p0, p2, v3

    .line 39
    add-double/2addr v0, p0

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesDouble(D)D

    .line 43
    move-result-wide p0

    .line 44
    return-wide p0

    .line 45
    :cond_1
    move v3, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-wide v0
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
.end method


# virtual methods
.method public getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I
    .locals 0
    .param p1    # Lcom/google/android/material/color/utilities/DynamicColor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/google/android/material/color/utilities/DynamicColor;->getArgb(Lcom/google/android/material/color/utilities/DynamicScheme;)I

    .line 4
    move-result p1

    .line 5
    return p1
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
.end method

.method public getBackground()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->background()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getControlActivated()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->controlActivated()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getControlHighlight()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->controlHighlight()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getControlNormal()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->controlNormal()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getError()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->error()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getErrorContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->errorContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getHct(Lcom/google/android/material/color/utilities/DynamicColor;)Lcom/google/android/material/color/utilities/Hct;
    .locals 0
    .param p1    # Lcom/google/android/material/color/utilities/DynamicColor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/google/android/material/color/utilities/DynamicColor;->getHct(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/Hct;

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
.end method

.method public getInverseOnSurface()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->inverseOnSurface()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getInversePrimary()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->inversePrimary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getInverseSurface()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->inverseSurface()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getNeutralPaletteKeyColor()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->neutralPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getNeutralVariantPaletteKeyColor()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->neutralVariantPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnBackground()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onBackground()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnError()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onError()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnErrorContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onErrorContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnPrimary()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onPrimary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnPrimaryContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onPrimaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnPrimaryFixed()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onPrimaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnPrimaryFixedVariant()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onPrimaryFixedVariant()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnSecondary()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onSecondary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnSecondaryContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onSecondaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnSecondaryFixed()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onSecondaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnSecondaryFixedVariant()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onSecondaryFixedVariant()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnSurface()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onSurface()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnSurfaceVariant()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onSurfaceVariant()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnTertiary()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onTertiary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnTertiaryContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onTertiaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnTertiaryFixed()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onTertiaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOnTertiaryFixedVariant()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->onTertiaryFixedVariant()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOutline()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->outline()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getOutlineVariant()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->outlineVariant()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getPrimary()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getPrimaryContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getPrimaryFixed()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getPrimaryFixedDim()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getPrimaryPaletteKeyColor()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->primaryPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getScrim()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->scrim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSecondary()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSecondaryContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSecondaryFixed()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSecondaryFixedDim()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSecondaryPaletteKeyColor()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->secondaryPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getShadow()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->shadow()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurface()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surface()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceBright()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceBright()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceContainerHigh()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceContainerHigh()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceContainerHighest()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceContainerHighest()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceContainerLow()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceContainerLow()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceContainerLowest()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceContainerLowest()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceDim()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceTint()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceTint()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getSurfaceVariant()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->surfaceVariant()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTertiary()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiary()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTertiaryContainer()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryContainer()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTertiaryFixed()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixed()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTertiaryFixedDim()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryFixedDim()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTertiaryPaletteKeyColor()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->tertiaryPaletteKeyColor()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTextHintInverse()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->textHintInverse()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTextPrimaryInverse()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->textPrimaryInverse()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTextPrimaryInverseDisableOnly()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->textPrimaryInverseDisableOnly()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTextSecondaryAndTertiaryInverse()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->textSecondaryAndTertiaryInverse()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public getTextSecondaryAndTertiaryInverseDisabled()I
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->textSecondaryAndTertiaryInverseDisabled()Lcom/google/android/material/color/utilities/DynamicColor;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/material/color/utilities/DynamicScheme;->getArgb(Lcom/google/android/material/color/utilities/DynamicColor;)I

    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method
