.class public final Lcom/kubi/kumex/data/trade/model/OrderEntity$a;
.super Ljava/lang/Object;
.source "OrderEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/kumex/data/trade/model/OrderEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/kumex/data/trade/model/OrderEntity;",
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
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/kumex/data/trade/model/OrderEntity;
    .locals 62

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
    new-instance v1, Lcom/kubi/kumex/data/trade/model/OrderEntity;

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
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 29
    move-result-object v0

    .line 30
    move-object v6, v0

    .line 31
    .line 32
    check-cast v6, Ljava/math/BigDecimal;

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 36
    move-result-object v7

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 40
    move-result-object v8

    .line 41
    .line 42
    .line 43
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 44
    move-result-object v9

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 48
    move-result-object v0

    .line 49
    move-object v10, v0

    .line 50
    .line 51
    check-cast v10, Ljava/math/BigDecimal;

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 55
    move-result-object v11

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 59
    move-result-object v12

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 63
    move-result-object v13

    .line 64
    .line 65
    .line 66
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 67
    move-result-object v14

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 71
    move-result-object v0

    .line 72
    move-object v15, v0

    .line 73
    .line 74
    check-cast v15, Ljava/math/BigDecimal;

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    move-object/from16 v16, v0

    .line 81
    .line 82
    check-cast v16, Ljava/math/BigDecimal;

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 86
    move-result-object v17

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 90
    move-result v0

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0x1

    .line 95
    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    if-nez v0, :cond_0

    .line 99
    .line 100
    move-object/from16 v0, v20

    .line 101
    goto :goto_1

    .line 102
    .line 103
    .line 104
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 105
    move-result v0

    .line 106
    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    move/from16 v0, v19

    .line 110
    goto :goto_0

    .line 111
    .line 112
    :cond_1
    move/from16 v0, v18

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 120
    move-result v21

    .line 121
    .line 122
    if-nez v21, :cond_2

    .line 123
    .line 124
    move-object/from16 v21, v20

    .line 125
    goto :goto_3

    .line 126
    .line 127
    .line 128
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 129
    move-result v21

    .line 130
    .line 131
    if-eqz v21, :cond_3

    .line 132
    .line 133
    move/from16 v21, v19

    .line 134
    goto :goto_2

    .line 135
    .line 136
    :cond_3
    move/from16 v21, v18

    .line 137
    .line 138
    .line 139
    :goto_2
    invoke-static/range {v21 .. v21}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    move-result-object v21

    .line 141
    .line 142
    .line 143
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 144
    move-result v22

    .line 145
    .line 146
    if-nez v22, :cond_4

    .line 147
    .line 148
    move-object/from16 v22, v20

    .line 149
    goto :goto_5

    .line 150
    .line 151
    .line 152
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 153
    move-result v22

    .line 154
    .line 155
    if-eqz v22, :cond_5

    .line 156
    .line 157
    move/from16 v22, v19

    .line 158
    goto :goto_4

    .line 159
    .line 160
    :cond_5
    move/from16 v22, v18

    .line 161
    .line 162
    .line 163
    :goto_4
    invoke-static/range {v22 .. v22}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    move-result-object v22

    .line 165
    .line 166
    .line 167
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 168
    move-result v23

    .line 169
    .line 170
    if-nez v23, :cond_6

    .line 171
    .line 172
    move-object/from16 v23, v20

    .line 173
    goto :goto_7

    .line 174
    .line 175
    .line 176
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 177
    move-result v23

    .line 178
    .line 179
    if-eqz v23, :cond_7

    .line 180
    .line 181
    move/from16 v23, v19

    .line 182
    goto :goto_6

    .line 183
    .line 184
    :cond_7
    move/from16 v23, v18

    .line 185
    .line 186
    .line 187
    :goto_6
    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 188
    move-result-object v23

    .line 189
    .line 190
    .line 191
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 192
    move-result v24

    .line 193
    .line 194
    if-nez v24, :cond_8

    .line 195
    .line 196
    move-object/from16 v24, v20

    .line 197
    goto :goto_9

    .line 198
    .line 199
    .line 200
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 201
    move-result v24

    .line 202
    .line 203
    if-eqz v24, :cond_9

    .line 204
    .line 205
    move/from16 v24, v19

    .line 206
    goto :goto_8

    .line 207
    .line 208
    :cond_9
    move/from16 v24, v18

    .line 209
    .line 210
    .line 211
    :goto_8
    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 212
    move-result-object v24

    .line 213
    .line 214
    .line 215
    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 216
    move-result v25

    .line 217
    .line 218
    if-nez v25, :cond_a

    .line 219
    .line 220
    move-object/from16 v25, v20

    .line 221
    goto :goto_b

    .line 222
    .line 223
    .line 224
    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 225
    move-result v25

    .line 226
    .line 227
    if-eqz v25, :cond_b

    .line 228
    .line 229
    move/from16 v25, v19

    .line 230
    goto :goto_a

    .line 231
    .line 232
    :cond_b
    move/from16 v25, v18

    .line 233
    .line 234
    .line 235
    :goto_a
    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 236
    move-result-object v25

    .line 237
    .line 238
    .line 239
    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 240
    move-result v26

    .line 241
    .line 242
    if-nez v26, :cond_c

    .line 243
    .line 244
    move-object/from16 v26, v20

    .line 245
    goto :goto_d

    .line 246
    .line 247
    .line 248
    :cond_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 249
    move-result v26

    .line 250
    .line 251
    if-eqz v26, :cond_d

    .line 252
    .line 253
    move/from16 v26, v19

    .line 254
    goto :goto_c

    .line 255
    .line 256
    :cond_d
    move/from16 v26, v18

    .line 257
    .line 258
    .line 259
    :goto_c
    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 260
    move-result-object v26

    .line 261
    .line 262
    .line 263
    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 264
    move-result v27

    .line 265
    .line 266
    if-nez v27, :cond_e

    .line 267
    .line 268
    move-object/from16 v27, v20

    .line 269
    goto :goto_f

    .line 270
    .line 271
    .line 272
    :cond_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 273
    move-result v27

    .line 274
    .line 275
    if-eqz v27, :cond_f

    .line 276
    .line 277
    move/from16 v27, v19

    .line 278
    goto :goto_e

    .line 279
    .line 280
    :cond_f
    move/from16 v27, v18

    .line 281
    .line 282
    .line 283
    :goto_e
    invoke-static/range {v27 .. v27}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 284
    move-result-object v27

    .line 285
    .line 286
    .line 287
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 288
    move-result v28

    .line 289
    .line 290
    if-nez v28, :cond_10

    .line 291
    .line 292
    move-object/from16 v28, v20

    .line 293
    goto :goto_11

    .line 294
    .line 295
    .line 296
    :cond_10
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 297
    move-result v28

    .line 298
    .line 299
    if-eqz v28, :cond_11

    .line 300
    .line 301
    move/from16 v28, v19

    .line 302
    goto :goto_10

    .line 303
    .line 304
    :cond_11
    move/from16 v28, v18

    .line 305
    .line 306
    .line 307
    :goto_10
    invoke-static/range {v28 .. v28}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 308
    move-result-object v28

    .line 309
    .line 310
    .line 311
    :goto_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 312
    move-result v29

    .line 313
    .line 314
    if-nez v29, :cond_12

    .line 315
    .line 316
    move-object/from16 v29, v20

    .line 317
    goto :goto_12

    .line 318
    .line 319
    .line 320
    :cond_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 321
    move-result-wide v29

    .line 322
    .line 323
    .line 324
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 325
    move-result-object v29

    .line 326
    .line 327
    .line 328
    :goto_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 329
    move-result-object v30

    .line 330
    .line 331
    check-cast v30, Ljava/math/BigDecimal;

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 335
    move-result-object v31

    .line 336
    .line 337
    check-cast v31, Ljava/math/BigDecimal;

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 341
    move-result-object v32

    .line 342
    .line 343
    check-cast v32, Ljava/math/BigDecimal;

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 347
    move-result-object v33

    .line 348
    .line 349
    check-cast v33, Ljava/math/BigDecimal;

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 353
    move-result-object v34

    .line 354
    .line 355
    check-cast v34, Ljava/math/BigDecimal;

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 359
    move-result-object v35

    .line 360
    .line 361
    check-cast v35, Ljava/math/BigDecimal;

    .line 362
    .line 363
    move-object/from16 v36, v20

    .line 364
    .line 365
    move-object/from16 v20, v22

    .line 366
    .line 367
    move-object/from16 v22, v24

    .line 368
    .line 369
    move-object/from16 v24, v26

    .line 370
    .line 371
    move-object/from16 v26, v28

    .line 372
    .line 373
    move-object/from16 v28, v30

    .line 374
    .line 375
    move-object/from16 v30, v32

    .line 376
    .line 377
    move-object/from16 v32, v34

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 381
    move-result-object v34

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 385
    move-result-object v37

    .line 386
    .line 387
    check-cast v37, Ljava/math/BigDecimal;

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 391
    move-result-object v38

    .line 392
    .line 393
    check-cast v38, Ljava/math/BigDecimal;

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 397
    move-result v39

    .line 398
    .line 399
    if-eqz v39, :cond_13

    .line 400
    .line 401
    move/from16 v18, v19

    .line 402
    .line 403
    :cond_13
    move-object/from16 v19, v36

    .line 404
    .line 405
    move-object/from16 v36, v38

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 409
    move-result-object v38

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 413
    move-result-object v39

    .line 414
    .line 415
    check-cast v39, Ljava/math/BigDecimal;

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 419
    move-result-object v40

    .line 420
    .line 421
    check-cast v40, Ljava/math/BigDecimal;

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 425
    move-result-object v41

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 429
    move-result v42

    .line 430
    .line 431
    if-nez v42, :cond_14

    .line 432
    .line 433
    move-object/from16 v42, v19

    .line 434
    goto :goto_13

    .line 435
    .line 436
    .line 437
    :cond_14
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 438
    move-result-wide v42

    .line 439
    .line 440
    .line 441
    invoke-static/range {v42 .. v43}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 442
    move-result-object v42

    .line 443
    .line 444
    .line 445
    :goto_13
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 446
    move-result-object v43

    .line 447
    .line 448
    check-cast v43, Ljava/math/BigDecimal;

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 452
    move-result-object v44

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 456
    move-result-object v45

    .line 457
    .line 458
    check-cast v45, Ljava/math/BigDecimal;

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 462
    move-result-object v46

    .line 463
    .line 464
    check-cast v46, Ljava/math/BigDecimal;

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 468
    move-result v47

    .line 469
    .line 470
    if-nez v47, :cond_15

    .line 471
    .line 472
    move-object/from16 v47, v19

    .line 473
    goto :goto_14

    .line 474
    .line 475
    .line 476
    :cond_15
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 477
    move-result-wide v47

    .line 478
    .line 479
    .line 480
    invoke-static/range {v47 .. v48}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 481
    move-result-object v47

    .line 482
    .line 483
    .line 484
    :goto_14
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 485
    move-result v48

    .line 486
    .line 487
    if-nez v48, :cond_16

    .line 488
    .line 489
    move-object/from16 v48, v19

    .line 490
    goto :goto_15

    .line 491
    .line 492
    .line 493
    :cond_16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 494
    move-result-wide v48

    .line 495
    .line 496
    .line 497
    invoke-static/range {v48 .. v49}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 498
    move-result-object v48

    .line 499
    .line 500
    .line 501
    :goto_15
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 502
    move-result v49

    .line 503
    .line 504
    if-nez v49, :cond_17

    .line 505
    .line 506
    move-object/from16 v49, v19

    .line 507
    goto :goto_16

    .line 508
    .line 509
    .line 510
    :cond_17
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 511
    move-result-wide v49

    .line 512
    .line 513
    .line 514
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    move-result-object v49

    .line 516
    .line 517
    .line 518
    :goto_16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 519
    move-result v50

    .line 520
    .line 521
    if-nez v50, :cond_18

    .line 522
    .line 523
    move-object/from16 v50, v19

    .line 524
    goto :goto_17

    .line 525
    .line 526
    .line 527
    :cond_18
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 528
    move-result-wide v50

    .line 529
    .line 530
    .line 531
    invoke-static/range {v50 .. v51}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 532
    move-result-object v50

    .line 533
    .line 534
    .line 535
    :goto_17
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 536
    move-result-object v51

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 540
    move-result-object v52

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 544
    move-result v53

    .line 545
    .line 546
    if-nez v53, :cond_19

    .line 547
    .line 548
    :goto_18
    move-object/from16 v53, v19

    .line 549
    goto :goto_19

    .line 550
    .line 551
    .line 552
    :cond_19
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 553
    move-result-object v19

    .line 554
    .line 555
    .line 556
    invoke-static/range {v19 .. v19}, Lcom/kubi/broker/MultiBizType;->valueOf(Ljava/lang/String;)Lcom/kubi/broker/MultiBizType;

    .line 557
    move-result-object v19

    .line 558
    goto :goto_18

    .line 559
    .line 560
    .line 561
    :goto_19
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 562
    move-result-object v19

    .line 563
    .line 564
    move-object/from16 v54, v19

    .line 565
    .line 566
    check-cast v54, Ljava/math/BigDecimal;

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 570
    move-result-object v55

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 574
    move-result-object v19

    .line 575
    .line 576
    move-object/from16 v56, v19

    .line 577
    .line 578
    check-cast v56, Ljava/math/BigDecimal;

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 582
    move-result-object v57

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 586
    move-result-object v19

    .line 587
    .line 588
    move-object/from16 v58, v19

    .line 589
    .line 590
    check-cast v58, Ljava/math/BigDecimal;

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 594
    move-result-object v59

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 598
    move-result-object v60

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 602
    move-result-object v61

    .line 603
    .line 604
    move-object/from16 v19, v21

    .line 605
    .line 606
    move-object/from16 v21, v23

    .line 607
    .line 608
    move-object/from16 v23, v25

    .line 609
    .line 610
    move-object/from16 v25, v27

    .line 611
    .line 612
    move-object/from16 v27, v29

    .line 613
    .line 614
    move-object/from16 v29, v31

    .line 615
    .line 616
    move-object/from16 v31, v33

    .line 617
    .line 618
    move-object/from16 v33, v35

    .line 619
    .line 620
    move-object/from16 v35, v37

    .line 621
    .line 622
    move/from16 v37, v18

    .line 623
    .line 624
    move-object/from16 v18, v0

    .line 625
    .line 626
    .line 627
    invoke-direct/range {v1 .. v61}, Lcom/kubi/kumex/data/trade/model/OrderEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/broker/MultiBizType;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 628
    return-object v1
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
.end method

.method public final b(I)[Lcom/kubi/kumex/data/trade/model/OrderEntity;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/kumex/data/trade/model/OrderEntity;

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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kumex/data/trade/model/OrderEntity$a;->a(Landroid/os/Parcel;)Lcom/kubi/kumex/data/trade/model/OrderEntity;

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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kumex/data/trade/model/OrderEntity$a;->b(I)[Lcom/kubi/kumex/data/trade/model/OrderEntity;

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
.end method
