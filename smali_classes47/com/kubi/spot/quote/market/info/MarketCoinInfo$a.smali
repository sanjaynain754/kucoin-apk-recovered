.class public final Lcom/kubi/spot/quote/market/info/MarketCoinInfo$a;
.super Ljava/lang/Object;
.source "MarketInfoEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/spot/quote/market/info/MarketCoinInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;",
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
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/spot/quote/market/info/MarketCoinInfo;
    .locals 41

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
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    move-object v7, v3

    .line 17
    goto :goto_2

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 21
    move-result v1

    .line 22
    .line 23
    new-instance v4, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    move v5, v2

    .line 28
    .line 29
    :goto_0
    if-eq v5, v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 33
    move-result v6

    .line 34
    .line 35
    if-nez v6, :cond_1

    .line 36
    move-object v6, v3

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_1
    sget-object v6, Lcom/kubi/spot/quote/market/info/MarketBannerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 40
    .line 41
    .line 42
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v7, v4

    .line 51
    .line 52
    .line 53
    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 54
    move-result-object v8

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 62
    move-result-object v10

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 66
    move-result-object v11

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 70
    move-result-object v12

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 74
    move-result-object v13

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 78
    move-result-object v14

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 82
    move-result v1

    .line 83
    .line 84
    if-nez v1, :cond_3

    .line 85
    move-object v15, v3

    .line 86
    goto :goto_5

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 90
    move-result v1

    .line 91
    .line 92
    new-instance v4, Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    move v5, v2

    .line 97
    .line 98
    :goto_3
    if-eq v5, v1, :cond_5

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 102
    move-result v6

    .line 103
    .line 104
    if-nez v6, :cond_4

    .line 105
    move-object v6, v3

    .line 106
    goto :goto_4

    .line 107
    .line 108
    :cond_4
    sget-object v6, Lcom/kubi/spot/quote/market/info/MarketCoinInfoParagraph;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 109
    .line 110
    .line 111
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 112
    move-result-object v6

    .line 113
    .line 114
    .line 115
    :goto_4
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    add-int/lit8 v5, v5, 0x1

    .line 118
    goto :goto_3

    .line 119
    :cond_5
    move-object v15, v4

    .line 120
    .line 121
    .line 122
    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 123
    move-result v1

    .line 124
    .line 125
    if-nez v1, :cond_6

    .line 126
    move-object v1, v3

    .line 127
    goto :goto_6

    .line 128
    .line 129
    :cond_6
    sget-object v1, Lcom/kubi/spot/quote/market/info/MarketCoinInfoRecommend;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 130
    .line 131
    .line 132
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 133
    move-result-object v1

    .line 134
    .line 135
    :goto_6
    move-object/from16 v16, v1

    .line 136
    .line 137
    check-cast v16, Lcom/kubi/spot/quote/market/info/MarketCoinInfoRecommend;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 141
    move-result v1

    .line 142
    .line 143
    if-nez v1, :cond_7

    .line 144
    .line 145
    move-object/from16 v17, v3

    .line 146
    goto :goto_9

    .line 147
    .line 148
    .line 149
    :cond_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 150
    move-result v1

    .line 151
    .line 152
    new-instance v4, Ljava/util/ArrayList;

    .line 153
    .line 154
    .line 155
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    move v5, v2

    .line 157
    .line 158
    :goto_7
    if-eq v5, v1, :cond_9

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 162
    move-result v6

    .line 163
    .line 164
    if-nez v6, :cond_8

    .line 165
    move-object v6, v3

    .line 166
    goto :goto_8

    .line 167
    .line 168
    :cond_8
    sget-object v6, Lcom/kubi/spot/entity/Tag;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 169
    .line 170
    .line 171
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 172
    move-result-object v6

    .line 173
    .line 174
    .line 175
    :goto_8
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    add-int/lit8 v5, v5, 0x1

    .line 178
    goto :goto_7

    .line 179
    .line 180
    :cond_9
    move-object/from16 v17, v4

    .line 181
    .line 182
    .line 183
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 184
    move-result-object v18

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 188
    move-result-object v19

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 192
    move-result-object v20

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 196
    move-result v1

    .line 197
    .line 198
    if-nez v1, :cond_a

    .line 199
    .line 200
    move-object/from16 v21, v3

    .line 201
    goto :goto_c

    .line 202
    .line 203
    .line 204
    :cond_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 205
    move-result v1

    .line 206
    .line 207
    new-instance v4, Ljava/util/ArrayList;

    .line 208
    .line 209
    .line 210
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 211
    move v5, v2

    .line 212
    .line 213
    :goto_a
    if-eq v5, v1, :cond_c

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 217
    move-result v6

    .line 218
    .line 219
    if-nez v6, :cond_b

    .line 220
    move-object v6, v3

    .line 221
    goto :goto_b

    .line 222
    .line 223
    :cond_b
    sget-object v6, Lcom/kubi/spot/quote/market/info/MarketCoinInfoFAQ;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 224
    .line 225
    .line 226
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 227
    move-result-object v6

    .line 228
    .line 229
    .line 230
    :goto_b
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    add-int/lit8 v5, v5, 0x1

    .line 233
    goto :goto_a

    .line 234
    .line 235
    :cond_c
    move-object/from16 v21, v4

    .line 236
    .line 237
    .line 238
    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 239
    move-result-object v22

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 243
    move-result-object v23

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 247
    move-result-object v24

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 251
    move-result-object v25

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 255
    move-result-object v26

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 259
    move-result v1

    .line 260
    .line 261
    if-nez v1, :cond_d

    .line 262
    move-object v1, v3

    .line 263
    goto :goto_d

    .line 264
    .line 265
    :cond_d
    sget-object v1, Lcom/kubi/spot/quote/market/info/PriceLiveData;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 266
    .line 267
    .line 268
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 269
    move-result-object v1

    .line 270
    .line 271
    :goto_d
    move-object/from16 v27, v1

    .line 272
    .line 273
    check-cast v27, Lcom/kubi/spot/quote/market/info/PriceLiveData;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 277
    move-result-object v28

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 281
    move-result-object v29

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 285
    move-result-object v30

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 289
    move-result-object v31

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 293
    move-result v1

    .line 294
    .line 295
    if-nez v1, :cond_e

    .line 296
    .line 297
    move-object/from16 v32, v3

    .line 298
    goto :goto_10

    .line 299
    .line 300
    .line 301
    :cond_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 302
    move-result v1

    .line 303
    .line 304
    new-instance v4, Ljava/util/ArrayList;

    .line 305
    .line 306
    .line 307
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 308
    move v5, v2

    .line 309
    .line 310
    :goto_e
    if-eq v5, v1, :cond_10

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 314
    move-result v6

    .line 315
    .line 316
    if-nez v6, :cond_f

    .line 317
    move-object v6, v3

    .line 318
    goto :goto_f

    .line 319
    .line 320
    :cond_f
    sget-object v6, Lcom/kubi/spot/quote/market/info/MarketBannerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 321
    .line 322
    .line 323
    invoke-interface {v6, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 324
    move-result-object v6

    .line 325
    .line 326
    .line 327
    :goto_f
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    add-int/lit8 v5, v5, 0x1

    .line 330
    goto :goto_e

    .line 331
    .line 332
    :cond_10
    move-object/from16 v32, v4

    .line 333
    .line 334
    .line 335
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 336
    move-result-object v33

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 340
    move-result v1

    .line 341
    .line 342
    if-nez v1, :cond_11

    .line 343
    .line 344
    :goto_11
    move-object/from16 v34, v3

    .line 345
    goto :goto_12

    .line 346
    .line 347
    .line 348
    :cond_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 349
    move-result-wide v3

    .line 350
    .line 351
    .line 352
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 353
    move-result-object v3

    .line 354
    goto :goto_11

    .line 355
    .line 356
    .line 357
    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 358
    move-result v1

    .line 359
    const/4 v3, 0x1

    .line 360
    .line 361
    if-eqz v1, :cond_12

    .line 362
    .line 363
    move/from16 v35, v3

    .line 364
    goto :goto_13

    .line 365
    .line 366
    :cond_12
    move/from16 v35, v2

    .line 367
    .line 368
    .line 369
    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 370
    move-result v1

    .line 371
    .line 372
    if-eqz v1, :cond_13

    .line 373
    .line 374
    move/from16 v36, v3

    .line 375
    goto :goto_14

    .line 376
    .line 377
    :cond_13
    move/from16 v36, v2

    .line 378
    .line 379
    .line 380
    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 381
    move-result v1

    .line 382
    .line 383
    if-eqz v1, :cond_14

    .line 384
    .line 385
    move/from16 v37, v3

    .line 386
    goto :goto_15

    .line 387
    .line 388
    :cond_14
    move/from16 v37, v2

    .line 389
    .line 390
    .line 391
    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 392
    move-result v1

    .line 393
    .line 394
    if-eqz v1, :cond_15

    .line 395
    .line 396
    move/from16 v38, v3

    .line 397
    goto :goto_16

    .line 398
    .line 399
    :cond_15
    move/from16 v38, v2

    .line 400
    .line 401
    .line 402
    :goto_16
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 403
    move-result v1

    .line 404
    .line 405
    if-eqz v1, :cond_16

    .line 406
    .line 407
    move/from16 v39, v3

    .line 408
    goto :goto_17

    .line 409
    .line 410
    :cond_16
    move/from16 v39, v2

    .line 411
    .line 412
    .line 413
    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 414
    move-result v0

    .line 415
    .line 416
    if-eqz v0, :cond_17

    .line 417
    .line 418
    move/from16 v40, v3

    .line 419
    goto :goto_18

    .line 420
    .line 421
    :cond_17
    move/from16 v40, v2

    .line 422
    .line 423
    :goto_18
    new-instance v6, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

    .line 424
    .line 425
    .line 426
    invoke-direct/range {v6 .. v40}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/kubi/spot/quote/market/info/MarketCoinInfoRecommend;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/spot/quote/market/info/PriceLiveData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZZZZZZ)V

    .line 427
    return-object v6
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
.end method

.method public final b(I)[Lcom/kubi/spot/quote/market/info/MarketCoinInfo;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo$a;->a(Landroid/os/Parcel;)Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/spot/quote/market/info/MarketCoinInfo$a;->b(I)[Lcom/kubi/spot/quote/market/info/MarketCoinInfo;

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
.end method
