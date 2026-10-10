.class public final Lcom/kubi/tradingbotkit/model/StrategyListItemModel$a;
.super Ljava/lang/Object;
.source "StrategyListItemModel.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/tradingbotkit/model/StrategyListItemModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/tradingbotkit/model/StrategyListItemModel;",
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
.method public final a(Landroid/os/Parcel;)Lcom/kubi/tradingbotkit/model/StrategyListItemModel;
    .locals 72

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
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 27
    move-result-object v7

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
    move-result v1

    .line 57
    .line 58
    if-nez v1, :cond_1

    .line 59
    const/4 v11, 0x0

    .line 60
    goto :goto_1

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 64
    move-result-wide v11

    .line 65
    .line 66
    .line 67
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    move-result-object v1

    .line 69
    move-object v11, v1

    .line 70
    .line 71
    .line 72
    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 73
    move-result v1

    .line 74
    .line 75
    if-nez v1, :cond_2

    .line 76
    const/4 v12, 0x0

    .line 77
    goto :goto_2

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 81
    move-result-wide v12

    .line 82
    .line 83
    .line 84
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    move-result-object v1

    .line 86
    move-object v12, v1

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 90
    move-result-object v13

    .line 91
    .line 92
    .line 93
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
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 111
    move-result v1

    .line 112
    .line 113
    if-nez v1, :cond_4

    .line 114
    const/4 v15, 0x0

    .line 115
    goto :goto_4

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 119
    move-result v1

    .line 120
    .line 121
    .line 122
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    move-result-object v1

    .line 124
    move-object v15, v1

    .line 125
    .line 126
    .line 127
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 128
    move-result-object v16

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 132
    move-result-object v17

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 136
    move-result-object v18

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 140
    move-result v1

    .line 141
    .line 142
    const/16 v19, 0x0

    .line 143
    .line 144
    if-nez v1, :cond_5

    .line 145
    .line 146
    move-object/from16 v21, v3

    .line 147
    const/4 v2, 0x0

    .line 148
    goto :goto_6

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 152
    move-result v1

    .line 153
    .line 154
    new-instance v2, Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    move-object/from16 v21, v3

    .line 160
    .line 161
    move/from16 v3, v19

    .line 162
    .line 163
    :goto_5
    if-eq v3, v1, :cond_6

    .line 164
    .line 165
    move/from16 v22, v1

    .line 166
    .line 167
    sget-object v1, Lcom/kubi/tradingbotkit/model/StrategyListItemModel$Transfer;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 168
    .line 169
    .line 170
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 171
    move-result-object v1

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    add-int/lit8 v3, v3, 0x1

    .line 177
    .line 178
    move/from16 v1, v22

    .line 179
    goto :goto_5

    .line 180
    .line 181
    .line 182
    :cond_6
    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    check-cast v1, Ljava/math/BigDecimal;

    .line 186
    .line 187
    move-object/from16 v3, v21

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 191
    move-result-object v21

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 195
    move-result-object v22

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 199
    move-result v23

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 203
    move-result v24

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 207
    move-result v25

    .line 208
    .line 209
    if-nez v25, :cond_7

    .line 210
    .line 211
    const/16 v25, 0x0

    .line 212
    goto :goto_7

    .line 213
    .line 214
    .line 215
    :cond_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 216
    move-result v25

    .line 217
    .line 218
    .line 219
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    move-result-object v25

    .line 221
    .line 222
    .line 223
    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 224
    move-result v26

    .line 225
    .line 226
    if-nez v26, :cond_8

    .line 227
    .line 228
    const/16 v26, 0x0

    .line 229
    goto :goto_8

    .line 230
    .line 231
    .line 232
    :cond_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 233
    move-result v26

    .line 234
    .line 235
    .line 236
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    move-result-object v26

    .line 238
    .line 239
    .line 240
    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 241
    move-result-object v27

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 245
    move-result-object v28

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 249
    move-result v29

    .line 250
    .line 251
    if-nez v29, :cond_9

    .line 252
    .line 253
    const/16 v29, 0x0

    .line 254
    goto :goto_9

    .line 255
    .line 256
    .line 257
    :cond_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 258
    move-result v29

    .line 259
    .line 260
    .line 261
    invoke-static/range {v29 .. v29}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 262
    move-result-object v29

    .line 263
    .line 264
    .line 265
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 266
    move-result v30

    .line 267
    .line 268
    if-nez v30, :cond_a

    .line 269
    .line 270
    const/16 v30, 0x0

    .line 271
    goto :goto_a

    .line 272
    .line 273
    .line 274
    :cond_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 275
    move-result v30

    .line 276
    .line 277
    .line 278
    invoke-static/range {v30 .. v30}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 279
    move-result-object v30

    .line 280
    .line 281
    .line 282
    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 283
    move-result v31

    .line 284
    .line 285
    if-nez v31, :cond_b

    .line 286
    .line 287
    const/16 v31, 0x0

    .line 288
    goto :goto_b

    .line 289
    .line 290
    .line 291
    :cond_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 292
    move-result v31

    .line 293
    .line 294
    .line 295
    invoke-static/range {v31 .. v31}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 296
    move-result-object v31

    .line 297
    .line 298
    .line 299
    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 300
    move-result v32

    .line 301
    .line 302
    if-nez v32, :cond_c

    .line 303
    .line 304
    const/16 v32, 0x0

    .line 305
    goto :goto_c

    .line 306
    .line 307
    .line 308
    :cond_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 309
    move-result v32

    .line 310
    .line 311
    .line 312
    invoke-static/range {v32 .. v32}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 313
    move-result-object v32

    .line 314
    .line 315
    .line 316
    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 317
    move-result-object v33

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 321
    move-result-object v34

    .line 322
    .line 323
    check-cast v34, Ljava/math/BigDecimal;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 327
    move-result-object v35

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 331
    move-result-object v36

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 335
    move-result-object v37

    .line 336
    .line 337
    check-cast v37, Ljava/math/BigDecimal;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 341
    move-result v38

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 345
    move-result-object v39

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 349
    move-result-object v40

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 353
    move-result-object v41

    .line 354
    .line 355
    check-cast v41, Ljava/math/BigDecimal;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 359
    move-result v42

    .line 360
    .line 361
    if-nez v42, :cond_d

    .line 362
    .line 363
    const/16 v42, 0x0

    .line 364
    goto :goto_d

    .line 365
    .line 366
    .line 367
    :cond_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 368
    move-result v42

    .line 369
    .line 370
    .line 371
    invoke-static/range {v42 .. v42}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    move-result-object v42

    .line 373
    .line 374
    .line 375
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 376
    move-result-object v43

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 380
    move-result-object v44

    .line 381
    .line 382
    check-cast v44, Ljava/math/BigDecimal;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 386
    move-result-object v45

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 390
    move-result-object v46

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 394
    move-result-object v47

    .line 395
    .line 396
    check-cast v47, Ljava/math/BigDecimal;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 400
    move-result-object v48

    .line 401
    .line 402
    check-cast v48, Ljava/math/BigDecimal;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 406
    move-result-object v49

    .line 407
    .line 408
    check-cast v49, Ljava/math/BigDecimal;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 412
    move-result v50

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 416
    move-result v51

    .line 417
    .line 418
    if-nez v51, :cond_e

    .line 419
    .line 420
    const/16 v51, 0x0

    .line 421
    goto :goto_e

    .line 422
    .line 423
    .line 424
    :cond_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 425
    move-result v51

    .line 426
    .line 427
    .line 428
    invoke-static/range {v51 .. v51}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 429
    move-result-object v51

    .line 430
    .line 431
    .line 432
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 433
    move-result v52

    .line 434
    .line 435
    if-nez v52, :cond_f

    .line 436
    .line 437
    move-object/from16 v52, v1

    .line 438
    const/4 v1, 0x0

    .line 439
    goto :goto_f

    .line 440
    .line 441
    :cond_f
    move-object/from16 v52, v1

    .line 442
    .line 443
    sget-object v1, Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 444
    .line 445
    .line 446
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 447
    move-result-object v1

    .line 448
    .line 449
    :goto_f
    check-cast v1, Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 453
    move-result-object v53

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 457
    move-result-object v54

    .line 458
    .line 459
    check-cast v54, Ljava/math/BigDecimal;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 463
    move-result-object v55

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 467
    move-result v56

    .line 468
    .line 469
    if-nez v56, :cond_10

    .line 470
    .line 471
    const/16 v56, 0x0

    .line 472
    goto :goto_10

    .line 473
    .line 474
    .line 475
    :cond_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 476
    move-result v56

    .line 477
    .line 478
    if-eqz v56, :cond_11

    .line 479
    .line 480
    const/16 v19, 0x1

    .line 481
    .line 482
    .line 483
    :cond_11
    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 484
    move-result-object v19

    .line 485
    .line 486
    move-object/from16 v56, v19

    .line 487
    .line 488
    .line 489
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 490
    move-result v19

    .line 491
    .line 492
    if-nez v19, :cond_12

    .line 493
    .line 494
    const/16 v57, 0x0

    .line 495
    goto :goto_11

    .line 496
    .line 497
    .line 498
    :cond_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 499
    move-result-wide v57

    .line 500
    .line 501
    .line 502
    invoke-static/range {v57 .. v58}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 503
    move-result-object v19

    .line 504
    .line 505
    move-object/from16 v57, v19

    .line 506
    .line 507
    .line 508
    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 509
    move-result v19

    .line 510
    .line 511
    if-nez v19, :cond_13

    .line 512
    .line 513
    const/16 v58, 0x0

    .line 514
    goto :goto_12

    .line 515
    .line 516
    .line 517
    :cond_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 518
    move-result-wide v58

    .line 519
    .line 520
    .line 521
    invoke-static/range {v58 .. v59}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 522
    move-result-object v19

    .line 523
    .line 524
    move-object/from16 v58, v19

    .line 525
    .line 526
    .line 527
    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 528
    move-result-object v19

    .line 529
    .line 530
    move-object/from16 v59, v19

    .line 531
    .line 532
    check-cast v59, Ljava/math/BigDecimal;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 536
    move-result-object v60

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 540
    move-result-object v19

    .line 541
    .line 542
    move-object/from16 v61, v19

    .line 543
    .line 544
    check-cast v61, Ljava/math/BigDecimal;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 548
    move-result-object v62

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 552
    move-result-object v63

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 556
    move-result-object v64

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 560
    move-result-object v65

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 564
    move-result-object v66

    .line 565
    .line 566
    .line 567
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 568
    move-result-object v67

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 572
    move-result v19

    .line 573
    .line 574
    if-nez v19, :cond_14

    .line 575
    .line 576
    const/16 v68, 0x0

    .line 577
    goto :goto_13

    .line 578
    .line 579
    .line 580
    :cond_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 581
    move-result v19

    .line 582
    .line 583
    .line 584
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    move-result-object v19

    .line 586
    .line 587
    move-object/from16 v68, v19

    .line 588
    .line 589
    .line 590
    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 591
    move-result v69

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 595
    move-result-object v70

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 599
    move-result-object v71

    .line 600
    .line 601
    move-object/from16 v19, v2

    .line 602
    .line 603
    new-instance v2, Lcom/kubi/tradingbotkit/model/StrategyListItemModel;

    .line 604
    .line 605
    move-object/from16 v20, v52

    .line 606
    .line 607
    move-object/from16 v52, v1

    .line 608
    .line 609
    .line 610
    invoke-direct/range {v2 .. v71}, Lcom/kubi/tradingbotkit/model/StrategyListItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/lang/Integer;Lcom/kubi/tradingbotkit/model/StrategyListItemModel$CouponReward;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V

    .line 611
    return-object v2
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
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

.method public final b(I)[Lcom/kubi/tradingbotkit/model/StrategyListItemModel;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/tradingbotkit/model/StrategyListItemModel;

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
    invoke-virtual {p0, p1}, Lcom/kubi/tradingbotkit/model/StrategyListItemModel$a;->a(Landroid/os/Parcel;)Lcom/kubi/tradingbotkit/model/StrategyListItemModel;

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
    invoke-virtual {p0, p1}, Lcom/kubi/tradingbotkit/model/StrategyListItemModel$a;->b(I)[Lcom/kubi/tradingbotkit/model/StrategyListItemModel;

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
