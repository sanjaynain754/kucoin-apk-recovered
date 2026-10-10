.class public final Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$a;
.super Ljava/lang/Object;
.source "FuturesGridRunningItemModel.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


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


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;
    .locals 86

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "parcel"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 11
    move-result-object v3

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 15
    move-result-object v4

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 19
    move-result-object v5

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 23
    move-result-object v6

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 27
    move-result v7

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 31
    move-result-object v8

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 35
    move-result-object v9

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 39
    move-result v1

    .line 40
    .line 41
    if-nez v1, :cond_0

    .line 42
    const/4 v10, 0x0

    .line 43
    goto :goto_0

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    move-result-object v1

    .line 52
    move-object v10, v1

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 56
    move-result v11

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 60
    move-result v1

    .line 61
    .line 62
    if-nez v1, :cond_1

    .line 63
    const/4 v12, 0x0

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 68
    move-result v1

    .line 69
    .line 70
    .line 71
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    move-result-object v1

    .line 73
    move-object v12, v1

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 77
    move-result v1

    .line 78
    .line 79
    if-nez v1, :cond_2

    .line 80
    const/4 v13, 0x0

    .line 81
    goto :goto_2

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 85
    move-result v1

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    move-result-object v1

    .line 90
    move-object v13, v1

    .line 91
    .line 92
    .line 93
    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 94
    move-result v1

    .line 95
    .line 96
    if-nez v1, :cond_3

    .line 97
    const/4 v14, 0x0

    .line 98
    goto :goto_3

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 102
    move-result v1

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    move-result-object v1

    .line 107
    move-object v14, v1

    .line 108
    .line 109
    .line 110
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 111
    move-result-object v15

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    move-object/from16 v16, v1

    .line 118
    .line 119
    check-cast v16, Ljava/math/BigDecimal;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 123
    move-result v17

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 127
    move-result-object v1

    .line 128
    .line 129
    move-object/from16 v18, v1

    .line 130
    .line 131
    check-cast v18, Ljava/math/BigDecimal;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 135
    move-result-object v19

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 139
    move-result v1

    .line 140
    .line 141
    if-nez v1, :cond_4

    .line 142
    .line 143
    const/16 v20, 0x0

    .line 144
    goto :goto_4

    .line 145
    .line 146
    .line 147
    :cond_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 148
    move-result-wide v20

    .line 149
    .line 150
    .line 151
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    move-object/from16 v20, v1

    .line 155
    .line 156
    .line 157
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 158
    move-result-object v21

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 162
    move-result-object v22

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 166
    move-result-object v23

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 170
    move-result-object v24

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 174
    move-result-object v25

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    move-object/from16 v26, v1

    .line 181
    .line 182
    check-cast v26, Ljava/math/BigDecimal;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 186
    move-result-object v27

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 190
    move-result-object v28

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 194
    move-result-object v1

    .line 195
    .line 196
    move-object/from16 v29, v1

    .line 197
    .line 198
    check-cast v29, Ljava/math/BigDecimal;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 202
    move-result v1

    .line 203
    .line 204
    if-nez v1, :cond_5

    .line 205
    .line 206
    const/16 v30, 0x0

    .line 207
    goto :goto_5

    .line 208
    .line 209
    .line 210
    :cond_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 211
    move-result v1

    .line 212
    .line 213
    .line 214
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    move-object/from16 v30, v1

    .line 218
    .line 219
    .line 220
    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 221
    move-result-object v31

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 225
    move-result-object v1

    .line 226
    .line 227
    move-object/from16 v32, v1

    .line 228
    .line 229
    check-cast v32, Ljava/math/BigDecimal;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 233
    move-result v1

    .line 234
    .line 235
    if-nez v1, :cond_6

    .line 236
    .line 237
    const/16 v33, 0x0

    .line 238
    goto :goto_6

    .line 239
    .line 240
    .line 241
    :cond_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 242
    move-result v1

    .line 243
    .line 244
    .line 245
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    move-result-object v1

    .line 247
    .line 248
    move-object/from16 v33, v1

    .line 249
    .line 250
    .line 251
    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 252
    move-result v1

    .line 253
    .line 254
    if-nez v1, :cond_7

    .line 255
    .line 256
    const/16 v34, 0x0

    .line 257
    goto :goto_7

    .line 258
    .line 259
    .line 260
    :cond_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 261
    move-result v1

    .line 262
    .line 263
    .line 264
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    move-result-object v1

    .line 266
    .line 267
    move-object/from16 v34, v1

    .line 268
    .line 269
    .line 270
    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 271
    move-result-object v35

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 275
    move-result-object v36

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 279
    move-result-object v1

    .line 280
    .line 281
    move-object/from16 v37, v1

    .line 282
    .line 283
    check-cast v37, Ljava/math/BigDecimal;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 287
    move-result-object v38

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 291
    move-result-object v1

    .line 292
    .line 293
    move-object/from16 v39, v1

    .line 294
    .line 295
    check-cast v39, Ljava/math/BigDecimal;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 299
    move-result-object v40

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 303
    move-result-object v1

    .line 304
    .line 305
    move-object/from16 v41, v1

    .line 306
    .line 307
    check-cast v41, Ljava/math/BigDecimal;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 311
    move-result-object v42

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 315
    move-result-object v1

    .line 316
    .line 317
    move-object/from16 v43, v1

    .line 318
    .line 319
    check-cast v43, Ljava/math/BigDecimal;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 323
    move-result-object v44

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 327
    move-result v1

    .line 328
    .line 329
    if-nez v1, :cond_8

    .line 330
    .line 331
    const/16 v45, 0x0

    .line 332
    goto :goto_8

    .line 333
    .line 334
    .line 335
    :cond_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 336
    move-result v1

    .line 337
    .line 338
    .line 339
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    move-result-object v1

    .line 341
    .line 342
    move-object/from16 v45, v1

    .line 343
    .line 344
    .line 345
    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 346
    move-result v46

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 350
    move-result-object v1

    .line 351
    .line 352
    move-object/from16 v47, v1

    .line 353
    .line 354
    check-cast v47, Ljava/math/BigDecimal;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 358
    move-result-object v1

    .line 359
    .line 360
    move-object/from16 v48, v1

    .line 361
    .line 362
    check-cast v48, Ljava/math/BigDecimal;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 366
    move-result-object v49

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 370
    move-result-object v50

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 374
    move-result-object v51

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 378
    move-result v1

    .line 379
    .line 380
    if-nez v1, :cond_9

    .line 381
    .line 382
    const/16 v52, 0x0

    .line 383
    goto :goto_9

    .line 384
    .line 385
    .line 386
    :cond_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 387
    move-result v1

    .line 388
    .line 389
    .line 390
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 391
    move-result-object v1

    .line 392
    .line 393
    move-object/from16 v52, v1

    .line 394
    .line 395
    .line 396
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 397
    move-result v1

    .line 398
    .line 399
    if-nez v1, :cond_a

    .line 400
    .line 401
    const/16 v53, 0x0

    .line 402
    goto :goto_a

    .line 403
    .line 404
    .line 405
    :cond_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 406
    move-result v1

    .line 407
    .line 408
    .line 409
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 410
    move-result-object v1

    .line 411
    .line 412
    move-object/from16 v53, v1

    .line 413
    .line 414
    .line 415
    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 416
    move-result v1

    .line 417
    .line 418
    if-nez v1, :cond_b

    .line 419
    .line 420
    const/16 v54, 0x0

    .line 421
    goto :goto_b

    .line 422
    .line 423
    .line 424
    :cond_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 425
    move-result v1

    .line 426
    .line 427
    .line 428
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 429
    move-result-object v1

    .line 430
    .line 431
    move-object/from16 v54, v1

    .line 432
    .line 433
    .line 434
    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 435
    move-result v1

    .line 436
    .line 437
    if-nez v1, :cond_c

    .line 438
    .line 439
    const/16 v55, 0x0

    .line 440
    goto :goto_c

    .line 441
    .line 442
    .line 443
    :cond_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 444
    move-result v1

    .line 445
    .line 446
    .line 447
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 448
    move-result-object v1

    .line 449
    .line 450
    move-object/from16 v55, v1

    .line 451
    .line 452
    .line 453
    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 454
    move-result v56

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 458
    move-result v57

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 462
    move-result v1

    .line 463
    .line 464
    if-nez v1, :cond_d

    .line 465
    .line 466
    const/16 v58, 0x0

    .line 467
    goto :goto_d

    .line 468
    .line 469
    .line 470
    :cond_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 471
    move-result v1

    .line 472
    .line 473
    .line 474
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    move-result-object v1

    .line 476
    .line 477
    move-object/from16 v58, v1

    .line 478
    .line 479
    .line 480
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 481
    move-result v1

    .line 482
    .line 483
    if-nez v1, :cond_e

    .line 484
    .line 485
    const/16 v59, 0x0

    .line 486
    goto :goto_e

    .line 487
    .line 488
    .line 489
    :cond_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 490
    move-result v1

    .line 491
    .line 492
    .line 493
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 494
    move-result-object v1

    .line 495
    .line 496
    move-object/from16 v59, v1

    .line 497
    .line 498
    .line 499
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 500
    move-result v1

    .line 501
    .line 502
    if-nez v1, :cond_f

    .line 503
    .line 504
    const/16 v60, 0x0

    .line 505
    goto :goto_f

    .line 506
    .line 507
    .line 508
    :cond_f
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 509
    move-result-wide v60

    .line 510
    .line 511
    .line 512
    invoke-static/range {v60 .. v61}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 513
    move-result-object v1

    .line 514
    .line 515
    move-object/from16 v60, v1

    .line 516
    .line 517
    .line 518
    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 519
    move-result-object v61

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 523
    move-result v1

    .line 524
    .line 525
    if-nez v1, :cond_10

    .line 526
    .line 527
    const/16 v62, 0x0

    .line 528
    goto :goto_10

    .line 529
    .line 530
    .line 531
    :cond_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 532
    move-result v1

    .line 533
    .line 534
    .line 535
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 536
    move-result-object v1

    .line 537
    .line 538
    move-object/from16 v62, v1

    .line 539
    .line 540
    .line 541
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 542
    move-result v1

    .line 543
    .line 544
    if-nez v1, :cond_11

    .line 545
    .line 546
    const/16 v63, 0x0

    .line 547
    goto :goto_11

    .line 548
    .line 549
    .line 550
    :cond_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 551
    move-result v1

    .line 552
    .line 553
    .line 554
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 555
    move-result-object v1

    .line 556
    .line 557
    move-object/from16 v63, v1

    .line 558
    .line 559
    .line 560
    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 561
    move-result v1

    .line 562
    .line 563
    if-nez v1, :cond_12

    .line 564
    .line 565
    const/16 v64, 0x0

    .line 566
    goto :goto_12

    .line 567
    .line 568
    .line 569
    :cond_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 570
    move-result v1

    .line 571
    .line 572
    .line 573
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    move-result-object v1

    .line 575
    .line 576
    move-object/from16 v64, v1

    .line 577
    .line 578
    .line 579
    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 580
    move-result-object v1

    .line 581
    .line 582
    move-object/from16 v65, v1

    .line 583
    .line 584
    check-cast v65, Ljava/math/BigDecimal;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 588
    move-result-object v66

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 592
    move-result v1

    .line 593
    .line 594
    if-nez v1, :cond_13

    .line 595
    .line 596
    const/16 v67, 0x0

    .line 597
    goto :goto_13

    .line 598
    .line 599
    .line 600
    :cond_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 601
    move-result-wide v67

    .line 602
    .line 603
    .line 604
    invoke-static/range {v67 .. v68}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 605
    move-result-object v1

    .line 606
    .line 607
    move-object/from16 v67, v1

    .line 608
    .line 609
    .line 610
    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 611
    move-result-object v68

    .line 612
    .line 613
    .line 614
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 615
    move-result-object v69

    .line 616
    .line 617
    .line 618
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 619
    move-result v1

    .line 620
    .line 621
    const/16 v70, 0x0

    .line 622
    .line 623
    const/16 v71, 0x1

    .line 624
    .line 625
    if-nez v1, :cond_14

    .line 626
    const/4 v1, 0x0

    .line 627
    goto :goto_15

    .line 628
    .line 629
    .line 630
    :cond_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 631
    move-result v1

    .line 632
    .line 633
    if-eqz v1, :cond_15

    .line 634
    .line 635
    move/from16 v1, v71

    .line 636
    goto :goto_14

    .line 637
    .line 638
    :cond_15
    move/from16 v1, v70

    .line 639
    .line 640
    .line 641
    :goto_14
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 642
    move-result-object v1

    .line 643
    .line 644
    .line 645
    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 646
    move-result v72

    .line 647
    .line 648
    if-nez v72, :cond_16

    .line 649
    .line 650
    const/16 v71, 0x0

    .line 651
    goto :goto_17

    .line 652
    .line 653
    .line 654
    :cond_16
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 655
    move-result v72

    .line 656
    .line 657
    if-eqz v72, :cond_17

    .line 658
    goto :goto_16

    .line 659
    .line 660
    :cond_17
    move/from16 v71, v70

    .line 661
    .line 662
    .line 663
    :goto_16
    invoke-static/range {v71 .. v71}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 664
    move-result-object v71

    .line 665
    .line 666
    .line 667
    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 668
    move-result-object v72

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 672
    move-result v73

    .line 673
    .line 674
    if-nez v73, :cond_18

    .line 675
    .line 676
    const/16 v73, 0x0

    .line 677
    goto :goto_18

    .line 678
    .line 679
    .line 680
    :cond_18
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 681
    move-result-wide v73

    .line 682
    .line 683
    .line 684
    invoke-static/range {v73 .. v74}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 685
    move-result-object v73

    .line 686
    .line 687
    .line 688
    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 689
    move-result-object v74

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 693
    move-result-object v75

    .line 694
    .line 695
    check-cast v75, Ljava/math/BigDecimal;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 699
    move-result-object v76

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 703
    move-result-object v77

    .line 704
    .line 705
    check-cast v77, Ljava/math/BigDecimal;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 709
    move-result-object v78

    .line 710
    .line 711
    .line 712
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 713
    move-result-object v79

    .line 714
    .line 715
    .line 716
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 717
    move-result-object v80

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 721
    move-result-object v81

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 725
    move-result-object v82

    .line 726
    .line 727
    .line 728
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 729
    move-result v83

    .line 730
    .line 731
    if-nez v83, :cond_19

    .line 732
    .line 733
    move-object/from16 v70, v1

    .line 734
    .line 735
    move-object/from16 v85, v3

    .line 736
    const/4 v1, 0x0

    .line 737
    goto :goto_1a

    .line 738
    .line 739
    .line 740
    :cond_19
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 741
    move-result v2

    .line 742
    .line 743
    move-object/from16 v84, v1

    .line 744
    .line 745
    new-instance v1, Ljava/util/ArrayList;

    .line 746
    .line 747
    .line 748
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 749
    .line 750
    move-object/from16 v85, v3

    .line 751
    .line 752
    move/from16 v3, v70

    .line 753
    .line 754
    :goto_19
    if-eq v3, v2, :cond_1a

    .line 755
    .line 756
    move/from16 v70, v2

    .line 757
    .line 758
    sget-object v2, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 759
    .line 760
    .line 761
    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 762
    move-result-object v2

    .line 763
    .line 764
    .line 765
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 766
    .line 767
    add-int/lit8 v3, v3, 0x1

    .line 768
    .line 769
    move/from16 v2, v70

    .line 770
    goto :goto_19

    .line 771
    .line 772
    :cond_1a
    move-object/from16 v70, v84

    .line 773
    .line 774
    .line 775
    :goto_1a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 776
    move-result v84

    .line 777
    .line 778
    .line 779
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 780
    move-result v2

    .line 781
    .line 782
    if-nez v2, :cond_1b

    .line 783
    const/4 v2, 0x0

    .line 784
    goto :goto_1b

    .line 785
    .line 786
    :cond_1b
    sget-object v2, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 787
    .line 788
    .line 789
    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 790
    move-result-object v2

    .line 791
    .line 792
    :goto_1b
    check-cast v2, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    .line 793
    .line 794
    move-object/from16 v3, v85

    .line 795
    .line 796
    move-object/from16 v85, v2

    .line 797
    .line 798
    new-instance v2, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;

    .line 799
    .line 800
    move-object/from16 v83, v1

    .line 801
    .line 802
    .line 803
    invoke-direct/range {v2 .. v85}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V

    .line 804
    return-object v2
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
.end method

.method public final b(I)[Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;

    .line 3
    return-object p1
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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$a;->a(Landroid/os/Parcel;)Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;

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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$a;->b(I)[Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;

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
.end method
