.class public final Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity$a;
.super Ljava/lang/Object;
.source "FavMarketQuoteEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;",
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
.method public final a(Landroid/os/Parcel;)Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;
    .locals 39

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
    new-instance v1, Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    move-object v0, v2

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 22
    move-result v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    .line 33
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 34
    move-result v4

    .line 35
    .line 36
    if-nez v4, :cond_1

    .line 37
    move-object v4, v2

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 42
    move-result v4

    .line 43
    .line 44
    .line 45
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 50
    move-result v5

    .line 51
    .line 52
    if-nez v5, :cond_2

    .line 53
    move-object v5, v2

    .line 54
    goto :goto_2

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 58
    move-result v5

    .line 59
    .line 60
    .line 61
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    move-result-object v5

    .line 63
    .line 64
    .line 65
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 66
    move-result-object v6

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 70
    move-result-object v7

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 74
    move-result-object v8

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 78
    move-result v9

    .line 79
    .line 80
    if-nez v9, :cond_3

    .line 81
    move-object v9, v2

    .line 82
    goto :goto_3

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 86
    move-result v9

    .line 87
    .line 88
    .line 89
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    move-result-object v9

    .line 91
    .line 92
    .line 93
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 94
    move-result v10

    .line 95
    .line 96
    if-nez v10, :cond_4

    .line 97
    move-object v10, v2

    .line 98
    goto :goto_4

    .line 99
    .line 100
    .line 101
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 102
    move-result v10

    .line 103
    .line 104
    .line 105
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    move-result-object v10

    .line 107
    .line 108
    .line 109
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 110
    move-result v11

    .line 111
    .line 112
    if-nez v11, :cond_5

    .line 113
    move-object v11, v2

    .line 114
    goto :goto_5

    .line 115
    .line 116
    .line 117
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 118
    move-result-wide v11

    .line 119
    .line 120
    .line 121
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 122
    move-result-object v11

    .line 123
    .line 124
    .line 125
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 126
    move-result v12

    .line 127
    .line 128
    if-nez v12, :cond_6

    .line 129
    move-object v12, v2

    .line 130
    goto :goto_6

    .line 131
    .line 132
    .line 133
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 134
    move-result v12

    .line 135
    .line 136
    .line 137
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    move-result-object v12

    .line 139
    .line 140
    .line 141
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 142
    move-result-object v13

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 146
    move-result-object v14

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 150
    move-result-object v15

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 154
    move-result-object v16

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 158
    move-result v17

    .line 159
    .line 160
    const/16 v18, 0x0

    .line 161
    .line 162
    const/16 v19, 0x1

    .line 163
    .line 164
    if-nez v17, :cond_7

    .line 165
    .line 166
    move-object/from16 v17, v2

    .line 167
    goto :goto_8

    .line 168
    .line 169
    .line 170
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 171
    move-result v17

    .line 172
    .line 173
    if-eqz v17, :cond_8

    .line 174
    .line 175
    move/from16 v17, v19

    .line 176
    goto :goto_7

    .line 177
    .line 178
    :cond_8
    move/from16 v17, v18

    .line 179
    .line 180
    .line 181
    :goto_7
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    move-result-object v17

    .line 183
    .line 184
    .line 185
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 186
    move-result v20

    .line 187
    .line 188
    if-nez v20, :cond_9

    .line 189
    .line 190
    move-object/from16 v20, v2

    .line 191
    .line 192
    :goto_9
    move/from16 v21, v19

    .line 193
    goto :goto_a

    .line 194
    .line 195
    .line 196
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 197
    move-result v20

    .line 198
    .line 199
    .line 200
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    move-result-object v20

    .line 202
    goto :goto_9

    .line 203
    .line 204
    .line 205
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 206
    move-result-object v19

    .line 207
    .line 208
    move/from16 v22, v18

    .line 209
    .line 210
    move-object/from16 v18, v20

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 214
    move-result-object v20

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 218
    move-result v23

    .line 219
    .line 220
    if-nez v23, :cond_a

    .line 221
    .line 222
    move-object/from16 v23, v2

    .line 223
    goto :goto_b

    .line 224
    .line 225
    .line 226
    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 227
    move-result v23

    .line 228
    .line 229
    .line 230
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    move-result-object v23

    .line 232
    .line 233
    .line 234
    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 235
    move-result v24

    .line 236
    .line 237
    if-nez v24, :cond_b

    .line 238
    .line 239
    move-object/from16 v24, v2

    .line 240
    .line 241
    :goto_c
    move/from16 v25, v21

    .line 242
    .line 243
    move-object/from16 v21, v23

    .line 244
    goto :goto_d

    .line 245
    .line 246
    .line 247
    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 248
    move-result v24

    .line 249
    .line 250
    .line 251
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    move-result-object v24

    .line 253
    goto :goto_c

    .line 254
    .line 255
    .line 256
    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 257
    move-result-object v23

    .line 258
    .line 259
    move/from16 v26, v22

    .line 260
    .line 261
    move-object/from16 v22, v24

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 265
    move-result-object v24

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 269
    move-result v27

    .line 270
    .line 271
    if-nez v27, :cond_c

    .line 272
    .line 273
    move-object/from16 v27, v2

    .line 274
    .line 275
    :goto_e
    move/from16 v28, v26

    .line 276
    goto :goto_f

    .line 277
    .line 278
    .line 279
    :cond_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 280
    move-result v27

    .line 281
    .line 282
    .line 283
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    move-result-object v27

    .line 285
    goto :goto_e

    .line 286
    .line 287
    .line 288
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 289
    move-result-object v26

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 293
    move-result v29

    .line 294
    .line 295
    if-nez v29, :cond_d

    .line 296
    .line 297
    move-object/from16 v29, v2

    .line 298
    .line 299
    :goto_10
    move/from16 v30, v28

    .line 300
    goto :goto_12

    .line 301
    .line 302
    .line 303
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 304
    move-result v29

    .line 305
    .line 306
    if-eqz v29, :cond_e

    .line 307
    .line 308
    move/from16 v29, v25

    .line 309
    goto :goto_11

    .line 310
    .line 311
    :cond_e
    move/from16 v29, v28

    .line 312
    .line 313
    .line 314
    :goto_11
    invoke-static/range {v29 .. v29}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 315
    move-result-object v29

    .line 316
    goto :goto_10

    .line 317
    .line 318
    .line 319
    :goto_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 320
    move-result-object v28

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 324
    move-result v31

    .line 325
    .line 326
    if-nez v31, :cond_f

    .line 327
    .line 328
    move-object/from16 v31, v2

    .line 329
    goto :goto_14

    .line 330
    .line 331
    .line 332
    :cond_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 333
    move-result v31

    .line 334
    .line 335
    if-eqz v31, :cond_10

    .line 336
    .line 337
    move/from16 v31, v25

    .line 338
    goto :goto_13

    .line 339
    .line 340
    :cond_10
    move/from16 v31, v30

    .line 341
    .line 342
    .line 343
    :goto_13
    invoke-static/range {v31 .. v31}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 344
    move-result-object v31

    .line 345
    .line 346
    .line 347
    :goto_14
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 348
    move-result v32

    .line 349
    .line 350
    if-nez v32, :cond_11

    .line 351
    .line 352
    move-object/from16 v32, v2

    .line 353
    .line 354
    :goto_15
    move/from16 v33, v25

    .line 355
    .line 356
    move-object/from16 v25, v27

    .line 357
    .line 358
    move-object/from16 v27, v29

    .line 359
    .line 360
    move-object/from16 v29, v31

    .line 361
    goto :goto_16

    .line 362
    .line 363
    .line 364
    :cond_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    .line 365
    move-result-wide v32

    .line 366
    .line 367
    .line 368
    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 369
    move-result-object v32

    .line 370
    goto :goto_15

    .line 371
    .line 372
    .line 373
    :goto_16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 374
    move-result-object v31

    .line 375
    .line 376
    move/from16 v34, v30

    .line 377
    .line 378
    move-object/from16 v30, v32

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 382
    move-result-object v32

    .line 383
    .line 384
    move/from16 v35, v33

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 388
    move-result-object v33

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 392
    move-result v36

    .line 393
    .line 394
    if-nez v36, :cond_12

    .line 395
    .line 396
    move-object/from16 v34, v2

    .line 397
    goto :goto_17

    .line 398
    .line 399
    .line 400
    :cond_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 401
    move-result v36

    .line 402
    .line 403
    if-eqz v36, :cond_13

    .line 404
    .line 405
    move/from16 v34, v35

    .line 406
    .line 407
    .line 408
    :cond_13
    invoke-static/range {v34 .. v34}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 409
    move-result-object v34

    .line 410
    .line 411
    .line 412
    :goto_17
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 413
    move-result v35

    .line 414
    .line 415
    if-nez v35, :cond_14

    .line 416
    .line 417
    move-object/from16 v35, v2

    .line 418
    goto :goto_18

    .line 419
    .line 420
    .line 421
    :cond_14
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 422
    move-result v35

    .line 423
    .line 424
    .line 425
    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    move-result-object v35

    .line 427
    .line 428
    .line 429
    :goto_18
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 430
    move-result v36

    .line 431
    .line 432
    if-nez v36, :cond_15

    .line 433
    .line 434
    move-object/from16 v36, v2

    .line 435
    goto :goto_19

    .line 436
    .line 437
    .line 438
    :cond_15
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 439
    move-result v36

    .line 440
    .line 441
    .line 442
    invoke-static/range {v36 .. v36}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 443
    move-result-object v36

    .line 444
    .line 445
    .line 446
    :goto_19
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 447
    move-result v37

    .line 448
    .line 449
    if-nez v37, :cond_16

    .line 450
    .line 451
    move-object/from16 v37, v2

    .line 452
    goto :goto_1a

    .line 453
    .line 454
    .line 455
    :cond_16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 456
    move-result v37

    .line 457
    .line 458
    .line 459
    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    move-result-object v37

    .line 461
    .line 462
    .line 463
    :goto_1a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 464
    move-result v38

    .line 465
    .line 466
    if-nez v38, :cond_17

    .line 467
    .line 468
    :goto_1b
    move-object/from16 v38, v2

    .line 469
    move-object v2, v0

    .line 470
    goto :goto_1c

    .line 471
    .line 472
    .line 473
    :cond_17
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 474
    move-result v2

    .line 475
    .line 476
    .line 477
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    move-result-object v2

    .line 479
    goto :goto_1b

    .line 480
    .line 481
    .line 482
    :goto_1c
    invoke-direct/range {v1 .. v38}, Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 483
    return-object v1
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

.method public final b(I)[Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;

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
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity$a;->a(Landroid/os/Parcel;)Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;

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
    invoke-virtual {p0, p1}, Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity$a;->b(I)[Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;

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
