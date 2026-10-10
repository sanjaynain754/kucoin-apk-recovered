.class public final Lcom/kubi/quotefacade/entity/AlphaItemEntity$a;
.super Ljava/lang/Object;
.source "AlphaMarketEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/quotefacade/entity/AlphaItemEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/quotefacade/entity/AlphaItemEntity;",
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
.method public final a(Landroid/os/Parcel;)Lcom/kubi/quotefacade/entity/AlphaItemEntity;
    .locals 36

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
    new-instance v1, Lcom/kubi/quotefacade/entity/AlphaItemEntity;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    move-object v0, v4

    .line 20
    goto :goto_1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    move v0, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v0, v2

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 37
    move-result v5

    .line 38
    .line 39
    if-nez v5, :cond_2

    .line 40
    move-object v5, v4

    .line 41
    goto :goto_2

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 45
    move-result v5

    .line 46
    .line 47
    .line 48
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 53
    move-result v6

    .line 54
    .line 55
    if-nez v6, :cond_3

    .line 56
    move-object v6, v4

    .line 57
    goto :goto_3

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 61
    move-result v6

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    move-result-object v6

    .line 66
    .line 67
    .line 68
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 69
    move-result v7

    .line 70
    .line 71
    if-nez v7, :cond_4

    .line 72
    move-object v7, v4

    .line 73
    goto :goto_4

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 77
    move-result v7

    .line 78
    .line 79
    .line 80
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    move-result-object v7

    .line 82
    .line 83
    .line 84
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 85
    move-result v8

    .line 86
    .line 87
    if-nez v8, :cond_5

    .line 88
    move-object v8, v4

    .line 89
    goto :goto_5

    .line 90
    .line 91
    .line 92
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 93
    move-result v8

    .line 94
    .line 95
    .line 96
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    move-result-object v8

    .line 98
    .line 99
    .line 100
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 101
    move-result v9

    .line 102
    .line 103
    if-nez v9, :cond_6

    .line 104
    move-object v9, v4

    .line 105
    move-object v10, v9

    .line 106
    :goto_6
    move-object v4, v6

    .line 107
    move-object v6, v8

    .line 108
    goto :goto_7

    .line 109
    .line 110
    .line 111
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 112
    move-result v9

    .line 113
    .line 114
    .line 115
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    move-result-object v9

    .line 117
    move-object v10, v4

    .line 118
    goto :goto_6

    .line 119
    .line 120
    .line 121
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 122
    move-result-object v8

    .line 123
    move v11, v3

    .line 124
    move-object v3, v5

    .line 125
    move-object v5, v7

    .line 126
    move-object v7, v9

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 130
    move-result-object v9

    .line 131
    move-object v12, v10

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 135
    move-result-object v10

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 139
    move-result v13

    .line 140
    .line 141
    if-nez v13, :cond_7

    .line 142
    move-object v13, v12

    .line 143
    move-object v14, v13

    .line 144
    goto :goto_8

    .line 145
    .line 146
    .line 147
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 148
    move-result-wide v13

    .line 149
    .line 150
    .line 151
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    move-result-object v13

    .line 153
    move-object v14, v12

    .line 154
    .line 155
    .line 156
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 157
    move-result-object v12

    .line 158
    move v15, v11

    .line 159
    move-object v11, v13

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 163
    move-result-object v13

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 167
    move-result v16

    .line 168
    .line 169
    if-eqz v16, :cond_8

    .line 170
    .line 171
    move-object/from16 v16, v14

    .line 172
    move v14, v15

    .line 173
    goto :goto_9

    .line 174
    .line 175
    :cond_8
    move-object/from16 v16, v14

    .line 176
    move v14, v2

    .line 177
    .line 178
    .line 179
    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 180
    move-result v17

    .line 181
    .line 182
    if-eqz v17, :cond_9

    .line 183
    .line 184
    move/from16 v17, v15

    .line 185
    goto :goto_a

    .line 186
    .line 187
    :cond_9
    move/from16 v17, v15

    .line 188
    move v15, v2

    .line 189
    .line 190
    .line 191
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 192
    move-result v18

    .line 193
    .line 194
    if-eqz v18, :cond_a

    .line 195
    .line 196
    move-object/from16 v18, v16

    .line 197
    .line 198
    move/from16 v16, v17

    .line 199
    goto :goto_b

    .line 200
    .line 201
    :cond_a
    move-object/from16 v18, v16

    .line 202
    .line 203
    move/from16 v16, v2

    .line 204
    .line 205
    .line 206
    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 207
    move-result v19

    .line 208
    .line 209
    if-eqz v19, :cond_b

    .line 210
    .line 211
    move/from16 v19, v17

    .line 212
    goto :goto_c

    .line 213
    .line 214
    :cond_b
    move/from16 v19, v17

    .line 215
    .line 216
    move/from16 v17, v2

    .line 217
    .line 218
    .line 219
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 220
    move-result v20

    .line 221
    .line 222
    if-eqz v20, :cond_c

    .line 223
    .line 224
    move-object/from16 v20, v18

    .line 225
    .line 226
    move/from16 v18, v19

    .line 227
    goto :goto_d

    .line 228
    .line 229
    :cond_c
    move-object/from16 v20, v18

    .line 230
    .line 231
    move/from16 v18, v2

    .line 232
    .line 233
    .line 234
    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 235
    move-result v21

    .line 236
    .line 237
    if-eqz v21, :cond_d

    .line 238
    .line 239
    move/from16 v21, v19

    .line 240
    goto :goto_e

    .line 241
    .line 242
    :cond_d
    move/from16 v21, v19

    .line 243
    .line 244
    move/from16 v19, v2

    .line 245
    .line 246
    .line 247
    :goto_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 248
    move-result v22

    .line 249
    .line 250
    if-nez v22, :cond_e

    .line 251
    goto :goto_f

    .line 252
    .line 253
    .line 254
    :cond_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 255
    move-result-wide v22

    .line 256
    .line 257
    .line 258
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 259
    move-result-object v20

    .line 260
    .line 261
    .line 262
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 263
    move-result v22

    .line 264
    .line 265
    if-eqz v22, :cond_f

    .line 266
    goto :goto_10

    .line 267
    .line 268
    :cond_f
    move/from16 v21, v2

    .line 269
    .line 270
    .line 271
    :goto_10
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 272
    move-result-object v22

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 276
    move-result-object v23

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 280
    move-result-object v24

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 284
    move-result-object v25

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 288
    move-result-object v26

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 292
    move-result-object v27

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 296
    move-result-object v28

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 300
    move-result-object v29

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 304
    move-result-object v2

    .line 305
    .line 306
    move-object/from16 v30, v2

    .line 307
    .line 308
    check-cast v30, Ljava/math/BigDecimal;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 312
    move-result-object v2

    .line 313
    .line 314
    move-object/from16 v31, v2

    .line 315
    .line 316
    check-cast v31, Ljava/math/BigDecimal;

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 320
    move-result-object v32

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 324
    move-result-object v33

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 328
    move-result-object v2

    .line 329
    .line 330
    move-object/from16 v34, v2

    .line 331
    .line 332
    check-cast v34, Ljava/math/BigDecimal;

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 336
    move-result-object v35

    .line 337
    move-object v2, v0

    .line 338
    .line 339
    .line 340
    invoke-direct/range {v1 .. v35}, Lcom/kubi/quotefacade/entity/AlphaItemEntity;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;)V

    .line 341
    return-object v1
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

.method public final b(I)[Lcom/kubi/quotefacade/entity/AlphaItemEntity;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/quotefacade/entity/AlphaItemEntity;

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
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity$a;->a(Landroid/os/Parcel;)Lcom/kubi/quotefacade/entity/AlphaItemEntity;

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
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/AlphaItemEntity$a;->b(I)[Lcom/kubi/quotefacade/entity/AlphaItemEntity;

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
