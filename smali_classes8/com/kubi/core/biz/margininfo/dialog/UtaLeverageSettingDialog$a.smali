.class public final Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$a;
.super Ljava/lang/Object;
.source "UtaLeverageSettingDialog.kt"

# interfaces
.implements Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;->X4()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$initSeekBar$1$1",
        "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;",
        "format",
        "",
        "intValue",
        "",
        "floatValue",
        "",
        "isFloat",
        "",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$a;->a:Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(IFZ)Ljava/lang/String;
    .locals 19

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$a;->a:Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;->y4(Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;)Ljava/util/List;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 12
    move-result v1

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    const/16 v2, 0x78

    .line 17
    .line 18
    if-gtz v1, :cond_2

    .line 19
    .line 20
    iget-object v1, v0, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$a;->a:Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;->y4(Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;)Ljava/util/List;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    move-object v3, v1

    .line 30
    .line 31
    check-cast v3, Ljava/math/BigDecimal;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const/16 v11, 0x7d

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v3 .. v12}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object v1

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v1, 0x0

    .line 67
    .line 68
    :goto_0
    if-nez v1, :cond_1

    .line 69
    .line 70
    const-string v1, ""

    .line 71
    :cond_1
    return-object v1

    .line 72
    .line 73
    :cond_2
    const/high16 v3, 0x42c80000    # 100.0f

    .line 74
    int-to-float v4, v1

    .line 75
    div-float/2addr v3, v4

    .line 76
    .line 77
    div-float v4, p2, v3

    .line 78
    float-to-int v4, v4

    .line 79
    .line 80
    add-int/lit8 v5, v4, 0x1

    .line 81
    const/4 v6, 0x0

    .line 82
    .line 83
    .line 84
    invoke-static {v4, v6, v1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 85
    move-result v4

    .line 86
    .line 87
    .line 88
    invoke-static {v5, v6, v1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 89
    move-result v1

    .line 90
    .line 91
    iget-object v5, v0, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$a;->a:Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;

    .line 92
    .line 93
    .line 94
    invoke-static {v5}, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;->y4(Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;)Ljava/util/List;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    move-result-object v5

    .line 100
    .line 101
    check-cast v5, Ljava/math/BigDecimal;

    .line 102
    .line 103
    iget-object v7, v0, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$a;->a:Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;

    .line 104
    .line 105
    .line 106
    invoke-static {v7}, Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;->y4(Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;)Ljava/util/List;

    .line 107
    move-result-object v7

    .line 108
    .line 109
    .line 110
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    check-cast v1, Ljava/math/BigDecimal;

    .line 114
    int-to-float v4, v4

    .line 115
    mul-float/2addr v4, v3

    .line 116
    .line 117
    sub-float v4, p2, v4

    .line 118
    div-float/2addr v4, v3

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/math/BigDecimal;->floatValue()F

    .line 122
    move-result v3

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/math/BigDecimal;->floatValue()F

    .line 126
    move-result v1

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/math/BigDecimal;->floatValue()F

    .line 130
    move-result v5

    .line 131
    sub-float/2addr v1, v5

    .line 132
    mul-float/2addr v4, v1

    .line 133
    add-float/2addr v3, v4

    .line 134
    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    new-instance v4, Ljava/math/BigDecimal;

    .line 141
    float-to-double v7, v3

    .line 142
    .line 143
    .line 144
    invoke-direct {v4, v7, v8}, Ljava/math/BigDecimal;-><init>(D)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v6, v6}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    .line 148
    move-result-object v9

    .line 149
    .line 150
    const-string v3, "setScale(...)"

    .line 151
    .line 152
    .line 153
    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    const/16 v17, 0x7d

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    const/4 v10, 0x0

    .line 159
    const/4 v11, 0x0

    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x0

    .line 162
    const/4 v14, 0x0

    .line 163
    const/4 v15, 0x0

    .line 164
    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    .line 168
    invoke-static/range {v9 .. v18}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 169
    move-result-object v3

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    move-result-object v1

    .line 180
    return-object v1
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
.end method
