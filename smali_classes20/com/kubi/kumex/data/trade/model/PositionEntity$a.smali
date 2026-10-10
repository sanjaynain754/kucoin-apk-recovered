.class public final Lcom/kubi/kumex/data/trade/model/PositionEntity$a;
.super Ljava/lang/Object;
.source "PositionEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/kumex/data/trade/model/PositionEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
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
.method public final a(Landroid/os/Parcel;)Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 53

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
    new-instance v2, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 13
    move-result-object v3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 21
    move-result v1

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x1

    .line 24
    const/4 v7, 0x0

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    move-object v1, v7

    .line 28
    goto :goto_1

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    move v1, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v1, v5

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 45
    move-result v8

    .line 46
    .line 47
    if-nez v8, :cond_2

    .line 48
    move-object v8, v7

    .line 49
    goto :goto_3

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 53
    move-result v8

    .line 54
    .line 55
    if-eqz v8, :cond_3

    .line 56
    move v8, v6

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    move v8, v5

    .line 59
    .line 60
    .line 61
    :goto_2
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    move-result-object v8

    .line 63
    .line 64
    .line 65
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 66
    move-result-object v9

    .line 67
    .line 68
    check-cast v9, Ljava/math/BigDecimal;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 72
    move-result-object v10

    .line 73
    .line 74
    check-cast v10, Ljava/math/BigDecimal;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 78
    move-result-object v11

    .line 79
    .line 80
    check-cast v11, Ljava/math/BigDecimal;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 84
    move-result-object v12

    .line 85
    .line 86
    check-cast v12, Ljava/math/BigDecimal;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 90
    move-result-object v13

    .line 91
    .line 92
    check-cast v13, Ljava/math/BigDecimal;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 96
    move-result-object v14

    .line 97
    .line 98
    check-cast v14, Ljava/math/BigDecimal;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 102
    move-result-object v15

    .line 103
    .line 104
    check-cast v15, Ljava/math/BigDecimal;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 108
    move-result-object v16

    .line 109
    .line 110
    check-cast v16, Ljava/math/BigDecimal;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 114
    move-result v17

    .line 115
    .line 116
    if-nez v17, :cond_4

    .line 117
    .line 118
    move-object/from16 v17, v7

    .line 119
    goto :goto_4

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 123
    move-result-wide v17

    .line 124
    .line 125
    .line 126
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 127
    move-result-object v17

    .line 128
    .line 129
    .line 130
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 131
    move-result-object v18

    .line 132
    .line 133
    check-cast v18, Ljava/math/BigDecimal;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 137
    move-result-object v19

    .line 138
    .line 139
    check-cast v19, Ljava/math/BigDecimal;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 143
    move-result-object v20

    .line 144
    .line 145
    check-cast v20, Ljava/math/BigDecimal;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 149
    move-result-object v21

    .line 150
    .line 151
    check-cast v21, Ljava/math/BigDecimal;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 155
    move-result-object v22

    .line 156
    .line 157
    check-cast v22, Ljava/math/BigDecimal;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 161
    move-result-object v23

    .line 162
    .line 163
    check-cast v23, Ljava/math/BigDecimal;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 167
    move-result-object v24

    .line 168
    .line 169
    check-cast v24, Ljava/math/BigDecimal;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 173
    move-result-object v25

    .line 174
    .line 175
    check-cast v25, Ljava/math/BigDecimal;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 179
    move-result-object v26

    .line 180
    .line 181
    check-cast v26, Ljava/math/BigDecimal;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 185
    move-result-object v27

    .line 186
    .line 187
    check-cast v27, Ljava/math/BigDecimal;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 191
    move-result-object v28

    .line 192
    .line 193
    check-cast v28, Ljava/math/BigDecimal;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 197
    move-result-object v29

    .line 198
    .line 199
    check-cast v29, Ljava/math/BigDecimal;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 203
    move-result-object v30

    .line 204
    .line 205
    check-cast v30, Ljava/math/BigDecimal;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 209
    move-result-object v31

    .line 210
    .line 211
    check-cast v31, Ljava/math/BigDecimal;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 215
    move-result-object v32

    .line 216
    .line 217
    check-cast v32, Ljava/math/BigDecimal;

    .line 218
    .line 219
    move-object/from16 v33, v7

    .line 220
    move-object v7, v9

    .line 221
    move-object v9, v11

    .line 222
    move-object v11, v13

    .line 223
    move-object v13, v15

    .line 224
    .line 225
    move-object/from16 v15, v17

    .line 226
    .line 227
    move-object/from16 v17, v19

    .line 228
    .line 229
    move-object/from16 v19, v21

    .line 230
    .line 231
    move-object/from16 v21, v23

    .line 232
    .line 233
    move-object/from16 v23, v25

    .line 234
    .line 235
    move-object/from16 v25, v27

    .line 236
    .line 237
    move-object/from16 v27, v29

    .line 238
    .line 239
    move-object/from16 v29, v31

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 243
    move-result-object v31

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 247
    move-result v34

    .line 248
    .line 249
    if-eqz v34, :cond_5

    .line 250
    move v5, v6

    .line 251
    .line 252
    :cond_5
    move-object/from16 v6, v33

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 256
    move-result-object v33

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 260
    move-result v34

    .line 261
    .line 262
    if-nez v34, :cond_6

    .line 263
    goto :goto_5

    .line 264
    .line 265
    :cond_6
    sget-object v6, Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 266
    .line 267
    .line 268
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 269
    move-result-object v6

    .line 270
    .line 271
    :goto_5
    check-cast v6, Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 275
    move-result v35

    .line 276
    .line 277
    move-object/from16 v34, v1

    .line 278
    .line 279
    if-nez v35, :cond_7

    .line 280
    const/4 v1, 0x0

    .line 281
    goto :goto_6

    .line 282
    .line 283
    :cond_7
    sget-object v1, Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 284
    .line 285
    .line 286
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 287
    move-result-object v1

    .line 288
    .line 289
    :goto_6
    move-object/from16 v35, v1

    .line 290
    .line 291
    check-cast v35, Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 295
    move-result-object v36

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 299
    move-result-object v1

    .line 300
    .line 301
    move-object/from16 v37, v1

    .line 302
    .line 303
    check-cast v37, Ljava/math/BigDecimal;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 307
    move-result-object v1

    .line 308
    .line 309
    move-object/from16 v38, v1

    .line 310
    .line 311
    check-cast v38, Ljava/math/BigDecimal;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 315
    move-result-object v1

    .line 316
    .line 317
    move-object/from16 v39, v1

    .line 318
    .line 319
    check-cast v39, Ljava/math/BigDecimal;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 323
    move-result-object v1

    .line 324
    .line 325
    move-object/from16 v40, v1

    .line 326
    .line 327
    check-cast v40, Ljava/math/BigDecimal;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 331
    move-result-object v1

    .line 332
    .line 333
    move-object/from16 v41, v1

    .line 334
    .line 335
    check-cast v41, Ljava/math/BigDecimal;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 339
    move-result-object v1

    .line 340
    .line 341
    move-object/from16 v42, v1

    .line 342
    .line 343
    check-cast v42, Ljava/math/BigDecimal;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 347
    move-result-object v1

    .line 348
    .line 349
    move-object/from16 v43, v1

    .line 350
    .line 351
    check-cast v43, Ljava/math/BigDecimal;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 355
    move-result-object v1

    .line 356
    .line 357
    move-object/from16 v44, v1

    .line 358
    .line 359
    check-cast v44, Ljava/math/BigDecimal;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 363
    move-result-object v1

    .line 364
    .line 365
    move-object/from16 v45, v1

    .line 366
    .line 367
    check-cast v45, Ljava/math/BigDecimal;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 371
    move-result-object v1

    .line 372
    .line 373
    move-object/from16 v46, v1

    .line 374
    .line 375
    check-cast v46, Ljava/math/BigDecimal;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 379
    move-result-object v1

    .line 380
    .line 381
    move-object/from16 v47, v1

    .line 382
    .line 383
    check-cast v47, Ljava/math/BigDecimal;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 387
    move-result-object v1

    .line 388
    .line 389
    move-object/from16 v48, v1

    .line 390
    .line 391
    check-cast v48, Ljava/math/BigDecimal;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 395
    move-result-object v49

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 399
    move-result-object v1

    .line 400
    .line 401
    move-object/from16 v50, v1

    .line 402
    .line 403
    check-cast v50, Ljava/math/BigDecimal;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 407
    move-result-object v0

    .line 408
    .line 409
    move-object/from16 v51, v0

    .line 410
    .line 411
    check-cast v51, Ljava/math/BigDecimal;

    .line 412
    .line 413
    move-object/from16 v52, v32

    .line 414
    .line 415
    move/from16 v32, v5

    .line 416
    .line 417
    move-object/from16 v5, v34

    .line 418
    .line 419
    move-object/from16 v34, v6

    .line 420
    move-object v6, v8

    .line 421
    move-object v8, v10

    .line 422
    move-object v10, v12

    .line 423
    move-object v12, v14

    .line 424
    .line 425
    move-object/from16 v14, v16

    .line 426
    .line 427
    move-object/from16 v16, v18

    .line 428
    .line 429
    move-object/from16 v18, v20

    .line 430
    .line 431
    move-object/from16 v20, v22

    .line 432
    .line 433
    move-object/from16 v22, v24

    .line 434
    .line 435
    move-object/from16 v24, v26

    .line 436
    .line 437
    move-object/from16 v26, v28

    .line 438
    .line 439
    move-object/from16 v28, v30

    .line 440
    .line 441
    move-object/from16 v30, v52

    .line 442
    .line 443
    .line 444
    invoke-direct/range {v2 .. v51}, Lcom/kubi/kumex/data/trade/model/PositionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V

    .line 445
    return-object v2
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
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
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
.end method

.method public final b(I)[Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/kumex/data/trade/model/PositionEntity;

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
    invoke-virtual {p0, p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity$a;->a(Landroid/os/Parcel;)Lcom/kubi/kumex/data/trade/model/PositionEntity;

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
    invoke-virtual {p0, p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity$a;->b(I)[Lcom/kubi/kumex/data/trade/model/PositionEntity;

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
