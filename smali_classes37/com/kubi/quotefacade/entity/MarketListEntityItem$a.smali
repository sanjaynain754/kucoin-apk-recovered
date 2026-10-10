.class public final Lcom/kubi/quotefacade/entity/MarketListEntityItem$a;
.super Ljava/lang/Object;
.source "MarkekListEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/quotefacade/entity/MarketListEntityItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/quotefacade/entity/MarketListEntityItem;",
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
.method public final a(Landroid/os/Parcel;)Lcom/kubi/quotefacade/entity/MarketListEntityItem;
    .locals 38

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
    new-instance v1, Lcom/kubi/quotefacade/entity/MarketListEntityItem;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 25
    move-result-object v5

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 29
    move-result-object v6

    .line 30
    .line 31
    .line 32
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 33
    move-result-object v7

    .line 34
    .line 35
    .line 36
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 37
    move-result-object v8

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 41
    move-result-object v9

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 45
    move-result v0

    .line 46
    const/4 v10, 0x0

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    move-object v0, v10

    .line 50
    goto :goto_0

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 54
    move-result-wide v11

    .line 55
    .line 56
    .line 57
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 62
    move-result-object v11

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 66
    move-result-object v12

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 70
    move-result-object v13

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 74
    move-result-object v14

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 78
    move-result v15

    .line 79
    .line 80
    if-nez v15, :cond_1

    .line 81
    move-object v15, v10

    .line 82
    goto :goto_1

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 86
    move-result v15

    .line 87
    .line 88
    .line 89
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    move-result-object v15

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 94
    move-result v16

    .line 95
    .line 96
    if-nez v16, :cond_2

    .line 97
    .line 98
    move-object/from16 v16, v10

    .line 99
    goto :goto_2

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 103
    move-result v16

    .line 104
    .line 105
    .line 106
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    move-result-object v16

    .line 108
    .line 109
    .line 110
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 111
    move-result-object v17

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 115
    move-result v18

    .line 116
    .line 117
    const/16 v19, 0x0

    .line 118
    .line 119
    const/16 v20, 0x1

    .line 120
    .line 121
    if-eqz v18, :cond_3

    .line 122
    .line 123
    move/from16 v18, v20

    .line 124
    goto :goto_3

    .line 125
    .line 126
    :cond_3
    move/from16 v18, v19

    .line 127
    .line 128
    .line 129
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 130
    move-result v21

    .line 131
    .line 132
    if-nez v21, :cond_4

    .line 133
    .line 134
    move-object/from16 v21, v10

    .line 135
    goto :goto_4

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 139
    move-result v21

    .line 140
    .line 141
    .line 142
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    move-result-object v21

    .line 144
    .line 145
    .line 146
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 147
    move-result v22

    .line 148
    .line 149
    if-nez v22, :cond_5

    .line 150
    .line 151
    move-object/from16 v22, v10

    .line 152
    goto :goto_6

    .line 153
    .line 154
    .line 155
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 156
    move-result v22

    .line 157
    .line 158
    if-eqz v22, :cond_6

    .line 159
    .line 160
    move/from16 v22, v20

    .line 161
    goto :goto_5

    .line 162
    .line 163
    :cond_6
    move/from16 v22, v19

    .line 164
    .line 165
    .line 166
    :goto_5
    invoke-static/range {v22 .. v22}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 167
    move-result-object v22

    .line 168
    .line 169
    .line 170
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 171
    move-result v23

    .line 172
    .line 173
    if-nez v23, :cond_7

    .line 174
    .line 175
    move-object/from16 v23, v10

    .line 176
    goto :goto_8

    .line 177
    .line 178
    .line 179
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 180
    move-result v23

    .line 181
    .line 182
    if-eqz v23, :cond_8

    .line 183
    .line 184
    move/from16 v23, v20

    .line 185
    goto :goto_7

    .line 186
    .line 187
    :cond_8
    move/from16 v23, v19

    .line 188
    .line 189
    .line 190
    :goto_7
    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    move-result-object v23

    .line 192
    .line 193
    .line 194
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 195
    move-result v24

    .line 196
    .line 197
    if-nez v24, :cond_9

    .line 198
    .line 199
    move-object/from16 v24, v10

    .line 200
    goto :goto_a

    .line 201
    .line 202
    .line 203
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 204
    move-result v24

    .line 205
    .line 206
    if-eqz v24, :cond_a

    .line 207
    .line 208
    move/from16 v24, v20

    .line 209
    goto :goto_9

    .line 210
    .line 211
    :cond_a
    move/from16 v24, v19

    .line 212
    .line 213
    .line 214
    :goto_9
    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 215
    move-result-object v24

    .line 216
    .line 217
    .line 218
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 219
    move-result v25

    .line 220
    .line 221
    if-nez v25, :cond_b

    .line 222
    .line 223
    move-object/from16 v25, v10

    .line 224
    goto :goto_c

    .line 225
    .line 226
    .line 227
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 228
    move-result v25

    .line 229
    .line 230
    if-eqz v25, :cond_c

    .line 231
    .line 232
    move/from16 v25, v20

    .line 233
    goto :goto_b

    .line 234
    .line 235
    :cond_c
    move/from16 v25, v19

    .line 236
    .line 237
    .line 238
    :goto_b
    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 239
    move-result-object v25

    .line 240
    .line 241
    .line 242
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 243
    move-result v26

    .line 244
    .line 245
    if-nez v26, :cond_d

    .line 246
    .line 247
    move-object/from16 v26, v10

    .line 248
    goto :goto_d

    .line 249
    .line 250
    .line 251
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 252
    move-result-wide v26

    .line 253
    .line 254
    .line 255
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 256
    move-result-object v26

    .line 257
    .line 258
    .line 259
    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 260
    move-result v27

    .line 261
    .line 262
    if-nez v27, :cond_e

    .line 263
    .line 264
    move-object/from16 v27, v10

    .line 265
    goto :goto_f

    .line 266
    .line 267
    .line 268
    :cond_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 269
    move-result v27

    .line 270
    .line 271
    if-eqz v27, :cond_f

    .line 272
    .line 273
    move/from16 v27, v20

    .line 274
    goto :goto_e

    .line 275
    .line 276
    :cond_f
    move/from16 v27, v19

    .line 277
    .line 278
    .line 279
    :goto_e
    invoke-static/range {v27 .. v27}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 280
    move-result-object v27

    .line 281
    .line 282
    .line 283
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 284
    move-result v28

    .line 285
    .line 286
    if-eqz v28, :cond_10

    .line 287
    .line 288
    move/from16 v19, v20

    .line 289
    .line 290
    :cond_10
    move-object/from16 v20, v21

    .line 291
    .line 292
    move-object/from16 v21, v23

    .line 293
    .line 294
    move-object/from16 v23, v25

    .line 295
    .line 296
    move-object/from16 v25, v27

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 300
    move-result-object v27

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 304
    move-result v28

    .line 305
    .line 306
    if-nez v28, :cond_11

    .line 307
    .line 308
    move-object/from16 v28, v10

    .line 309
    goto :goto_10

    .line 310
    .line 311
    .line 312
    :cond_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 313
    move-result v28

    .line 314
    .line 315
    .line 316
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    move-result-object v28

    .line 318
    .line 319
    .line 320
    :goto_10
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 321
    move-result v29

    .line 322
    .line 323
    if-nez v29, :cond_12

    .line 324
    .line 325
    move-object/from16 v29, v10

    .line 326
    goto :goto_11

    .line 327
    .line 328
    .line 329
    :cond_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 330
    move-result v29

    .line 331
    .line 332
    .line 333
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 334
    move-result-object v29

    .line 335
    .line 336
    .line 337
    :goto_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 338
    move-result v30

    .line 339
    .line 340
    if-nez v30, :cond_13

    .line 341
    .line 342
    move-object/from16 v30, v10

    .line 343
    goto :goto_12

    .line 344
    .line 345
    .line 346
    :cond_13
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 347
    move-result v30

    .line 348
    .line 349
    .line 350
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    move-result-object v30

    .line 352
    .line 353
    .line 354
    :goto_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 355
    move-result v31

    .line 356
    .line 357
    if-nez v31, :cond_14

    .line 358
    .line 359
    :goto_13
    move-object/from16 v31, v10

    .line 360
    goto :goto_14

    .line 361
    .line 362
    .line 363
    :cond_14
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 364
    move-result v10

    .line 365
    .line 366
    .line 367
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    move-result-object v10

    .line 369
    goto :goto_13

    .line 370
    .line 371
    .line 372
    :goto_14
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 373
    move-result-object v32

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 377
    move-result-object v10

    .line 378
    .line 379
    move-object/from16 v33, v10

    .line 380
    .line 381
    check-cast v33, Ljava/math/BigDecimal;

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 385
    move-result-object v10

    .line 386
    .line 387
    move-object/from16 v34, v10

    .line 388
    .line 389
    check-cast v34, Ljava/math/BigDecimal;

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 393
    move-result-object v35

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 397
    move-result-object v36

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 401
    move-result-object v37

    .line 402
    .line 403
    move-object/from16 v10, v26

    .line 404
    .line 405
    move/from16 v26, v19

    .line 406
    .line 407
    move-object/from16 v19, v20

    .line 408
    .line 409
    move-object/from16 v20, v22

    .line 410
    .line 411
    move-object/from16 v22, v24

    .line 412
    .line 413
    move-object/from16 v24, v10

    .line 414
    move-object v10, v0

    .line 415
    .line 416
    .line 417
    invoke-direct/range {v1 .. v37}, Lcom/kubi/quotefacade/entity/MarketListEntityItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    return-object v1
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

.method public final b(I)[Lcom/kubi/quotefacade/entity/MarketListEntityItem;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/quotefacade/entity/MarketListEntityItem;

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
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem$a;->a(Landroid/os/Parcel;)Lcom/kubi/quotefacade/entity/MarketListEntityItem;

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
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/MarketListEntityItem$a;->b(I)[Lcom/kubi/quotefacade/entity/MarketListEntityItem;

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
