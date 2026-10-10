.class public final Lcom/kubi/quotefacade/entity/ChainItemEntity$a;
.super Ljava/lang/Object;
.source "ChainMarketEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/quotefacade/entity/ChainItemEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/quotefacade/entity/ChainItemEntity;",
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
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/quotefacade/entity/ChainItemEntity;
    .locals 43

    .line 1
    .line 2
    const-string v0, "parcel"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/quotefacade/entity/ChainItemEntity;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 17
    move-result-object v0

    .line 18
    move-object v3, v0

    .line 19
    .line 20
    check-cast v3, Ljava/math/BigDecimal;

    .line 21
    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 24
    move-result-object v0

    .line 25
    move-object v4, v0

    .line 26
    .line 27
    check-cast v4, Ljava/math/BigDecimal;

    .line 28
    .line 29
    .line 30
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 31
    move-result-object v0

    .line 32
    move-object v5, v0

    .line 33
    .line 34
    check-cast v5, Ljava/math/BigDecimal;

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 38
    move-result-object v6

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 42
    move-result-object v7

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 46
    move-result-object v8

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 50
    move-result-object v9

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 54
    move-result-object v10

    .line 55
    .line 56
    .line 57
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 58
    move-result-object v11

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 62
    move-result-object v12

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 66
    move-result-object v13

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 70
    move-result-object v14

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 74
    move-result-object v15

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 78
    move-result-object v16

    .line 79
    .line 80
    .line 81
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 82
    move-result v0

    .line 83
    .line 84
    const/16 v17, 0x0

    .line 85
    .line 86
    if-nez v0, :cond_0

    .line 87
    .line 88
    move-object/from16 v0, v17

    .line 89
    goto :goto_0

    .line 90
    .line 91
    .line 92
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 93
    move-result v0

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 101
    move-result-object v18

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 105
    move-result v19

    .line 106
    .line 107
    if-nez v19, :cond_1

    .line 108
    .line 109
    move-object/from16 v19, v17

    .line 110
    goto :goto_1

    .line 111
    .line 112
    .line 113
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 114
    move-result-wide v19

    .line 115
    .line 116
    .line 117
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    move-result-object v19

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 122
    move-result v20

    .line 123
    .line 124
    if-nez v20, :cond_2

    .line 125
    .line 126
    move-object/from16 v20, v17

    .line 127
    goto :goto_2

    .line 128
    .line 129
    .line 130
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 131
    move-result-wide v20

    .line 132
    .line 133
    .line 134
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    move-result-object v20

    .line 136
    .line 137
    .line 138
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 139
    move-result v21

    .line 140
    .line 141
    if-nez v21, :cond_3

    .line 142
    .line 143
    move-object/from16 v21, v17

    .line 144
    goto :goto_3

    .line 145
    .line 146
    .line 147
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 148
    move-result-wide v21

    .line 149
    .line 150
    .line 151
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    move-result-object v21

    .line 153
    .line 154
    .line 155
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 156
    move-result-object v22

    .line 157
    .line 158
    check-cast v22, Ljava/math/BigDecimal;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 162
    move-result-object v23

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 166
    move-result v24

    .line 167
    .line 168
    if-nez v24, :cond_4

    .line 169
    .line 170
    move-object/from16 v24, v17

    .line 171
    goto :goto_4

    .line 172
    .line 173
    .line 174
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 175
    move-result v24

    .line 176
    .line 177
    .line 178
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    move-result-object v24

    .line 180
    .line 181
    .line 182
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 183
    move-result v25

    .line 184
    .line 185
    if-nez v25, :cond_5

    .line 186
    .line 187
    move-object/from16 v25, v17

    .line 188
    goto :goto_5

    .line 189
    .line 190
    .line 191
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 192
    move-result v25

    .line 193
    .line 194
    .line 195
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    move-result-object v25

    .line 197
    .line 198
    .line 199
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 200
    move-result v26

    .line 201
    .line 202
    if-nez v26, :cond_6

    .line 203
    .line 204
    move-object/from16 v26, v17

    .line 205
    goto :goto_6

    .line 206
    .line 207
    .line 208
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 209
    move-result v26

    .line 210
    .line 211
    .line 212
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    move-result-object v26

    .line 214
    .line 215
    .line 216
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 217
    move-result v27

    .line 218
    .line 219
    if-nez v27, :cond_7

    .line 220
    .line 221
    move-object/from16 v27, v17

    .line 222
    goto :goto_7

    .line 223
    .line 224
    .line 225
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 226
    move-result v27

    .line 227
    .line 228
    .line 229
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    move-result-object v27

    .line 231
    .line 232
    .line 233
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 234
    move-result v28

    .line 235
    .line 236
    if-nez v28, :cond_8

    .line 237
    .line 238
    move-object/from16 v28, v17

    .line 239
    goto :goto_8

    .line 240
    .line 241
    .line 242
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 243
    move-result v28

    .line 244
    .line 245
    .line 246
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    move-result-object v28

    .line 248
    .line 249
    .line 250
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 251
    move-result v29

    .line 252
    .line 253
    if-nez v29, :cond_9

    .line 254
    .line 255
    move-object/from16 v29, v17

    .line 256
    goto :goto_9

    .line 257
    .line 258
    .line 259
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 260
    move-result v29

    .line 261
    .line 262
    .line 263
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    move-result-object v29

    .line 265
    .line 266
    .line 267
    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 268
    move-result v30

    .line 269
    .line 270
    const/16 v31, 0x0

    .line 271
    .line 272
    const/16 v32, 0x1

    .line 273
    .line 274
    if-eqz v30, :cond_a

    .line 275
    .line 276
    move/from16 v30, v32

    .line 277
    goto :goto_a

    .line 278
    .line 279
    :cond_a
    move/from16 v30, v31

    .line 280
    .line 281
    .line 282
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 283
    move-result v33

    .line 284
    .line 285
    if-nez v33, :cond_b

    .line 286
    .line 287
    move-object/from16 v33, v17

    .line 288
    .line 289
    :goto_b
    move/from16 v34, v32

    .line 290
    goto :goto_c

    .line 291
    .line 292
    .line 293
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 294
    move-result v33

    .line 295
    .line 296
    .line 297
    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    move-result-object v33

    .line 299
    goto :goto_b

    .line 300
    .line 301
    .line 302
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 303
    move-result-object v32

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 307
    move-result v35

    .line 308
    .line 309
    if-nez v35, :cond_c

    .line 310
    .line 311
    move-object/from16 v35, v17

    .line 312
    goto :goto_d

    .line 313
    .line 314
    .line 315
    :cond_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 316
    move-result v35

    .line 317
    .line 318
    .line 319
    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    move-result-object v35

    .line 321
    .line 322
    .line 323
    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 324
    move-result v36

    .line 325
    .line 326
    if-nez v36, :cond_d

    .line 327
    goto :goto_f

    .line 328
    .line 329
    .line 330
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 331
    move-result v17

    .line 332
    .line 333
    if-eqz v17, :cond_e

    .line 334
    .line 335
    move/from16 v17, v34

    .line 336
    goto :goto_e

    .line 337
    .line 338
    :cond_e
    move/from16 v17, v31

    .line 339
    .line 340
    .line 341
    :goto_e
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 342
    move-result-object v17

    .line 343
    .line 344
    .line 345
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 346
    move-result v36

    .line 347
    .line 348
    if-eqz v36, :cond_f

    .line 349
    .line 350
    move/from16 v36, v31

    .line 351
    .line 352
    move-object/from16 v31, v33

    .line 353
    .line 354
    move-object/from16 v33, v35

    .line 355
    .line 356
    move/from16 v35, v34

    .line 357
    goto :goto_10

    .line 358
    .line 359
    :cond_f
    move/from16 v36, v31

    .line 360
    .line 361
    move-object/from16 v31, v33

    .line 362
    .line 363
    move-object/from16 v33, v35

    .line 364
    .line 365
    move/from16 v35, v36

    .line 366
    .line 367
    .line 368
    :goto_10
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 369
    move-result v37

    .line 370
    .line 371
    if-eqz v37, :cond_10

    .line 372
    .line 373
    move/from16 v37, v36

    .line 374
    .line 375
    move/from16 v36, v34

    .line 376
    goto :goto_11

    .line 377
    .line 378
    :cond_10
    move/from16 v37, v36

    .line 379
    .line 380
    .line 381
    :goto_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 382
    move-result-object v38

    .line 383
    .line 384
    move/from16 v39, v37

    .line 385
    .line 386
    move-object/from16 v37, v38

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 390
    move-result-object v38

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 394
    move-result v40

    .line 395
    .line 396
    if-eqz v40, :cond_11

    .line 397
    .line 398
    move/from16 v40, v39

    .line 399
    .line 400
    move/from16 v39, v34

    .line 401
    goto :goto_12

    .line 402
    .line 403
    :cond_11
    move/from16 v40, v39

    .line 404
    .line 405
    .line 406
    :goto_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 407
    move-result v41

    .line 408
    .line 409
    if-eqz v41, :cond_12

    .line 410
    .line 411
    move/from16 v41, v40

    .line 412
    .line 413
    move/from16 v40, v34

    .line 414
    goto :goto_13

    .line 415
    .line 416
    :cond_12
    move/from16 v41, v40

    .line 417
    .line 418
    .line 419
    :goto_13
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 420
    move-result v42

    .line 421
    .line 422
    if-eqz v42, :cond_13

    .line 423
    .line 424
    move/from16 v41, v34

    .line 425
    .line 426
    :cond_13
    move-object/from16 v34, v17

    .line 427
    .line 428
    move-object/from16 v17, v0

    .line 429
    .line 430
    .line 431
    invoke-direct/range {v1 .. v41}, Lcom/kubi/quotefacade/entity/ChainItemEntity;-><init>(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;ZZLjava/lang/String;Ljava/lang/String;ZZZ)V

    .line 432
    return-object v1
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
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
.end method

.method public final b(I)[Lcom/kubi/quotefacade/entity/ChainItemEntity;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/quotefacade/entity/ChainItemEntity;

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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/ChainItemEntity$a;->a(Landroid/os/Parcel;)Lcom/kubi/quotefacade/entity/ChainItemEntity;

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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/ChainItemEntity$a;->b(I)[Lcom/kubi/quotefacade/entity/ChainItemEntity;

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
.end method
