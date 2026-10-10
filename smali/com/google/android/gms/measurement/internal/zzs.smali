.class public final Lcom/google/android/gms/measurement/internal/zzs;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"

# interfaces
.implements Landroid/os/Parcelable$Creator;


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
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 51

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->validateObjectHeader(Landroid/os/Parcel;)I

    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    const-string v5, ""

    .line 12
    const/4 v6, 0x0

    .line 13
    .line 14
    const/16 v7, 0x64

    .line 15
    const/4 v8, 0x1

    .line 16
    .line 17
    .line 18
    const-wide/32 v9, -0x80000000

    .line 19
    .line 20
    move/from16 v22, v2

    .line 21
    .line 22
    move/from16 v28, v22

    .line 23
    .line 24
    move/from16 v30, v28

    .line 25
    .line 26
    move/from16 v38, v30

    .line 27
    .line 28
    move/from16 v43, v38

    .line 29
    .line 30
    move/from16 v50, v43

    .line 31
    .line 32
    move-wide/from16 v16, v3

    .line 33
    .line 34
    move-wide/from16 v18, v16

    .line 35
    .line 36
    move-wide/from16 v26, v18

    .line 37
    .line 38
    move-wide/from16 v32, v26

    .line 39
    .line 40
    move-wide/from16 v39, v32

    .line 41
    .line 42
    move-wide/from16 v44, v39

    .line 43
    .line 44
    move-wide/from16 v48, v44

    .line 45
    .line 46
    move-object/from16 v35, v5

    .line 47
    .line 48
    move-object/from16 v36, v35

    .line 49
    .line 50
    move-object/from16 v42, v36

    .line 51
    .line 52
    move-object/from16 v47, v42

    .line 53
    move-object v12, v6

    .line 54
    move-object v13, v12

    .line 55
    move-object v14, v13

    .line 56
    move-object v15, v14

    .line 57
    .line 58
    move-object/from16 v20, v15

    .line 59
    .line 60
    move-object/from16 v25, v20

    .line 61
    .line 62
    move-object/from16 v31, v25

    .line 63
    .line 64
    move-object/from16 v34, v31

    .line 65
    .line 66
    move-object/from16 v37, v34

    .line 67
    .line 68
    move-object/from16 v46, v37

    .line 69
    .line 70
    move/from16 v41, v7

    .line 71
    .line 72
    move/from16 v21, v8

    .line 73
    .line 74
    move/from16 v29, v21

    .line 75
    .line 76
    move-wide/from16 v23, v9

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 80
    move-result v2

    .line 81
    .line 82
    if-ge v2, v1, :cond_0

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readHeader(Landroid/os/Parcel;)I

    .line 86
    move-result v2

    .line 87
    .line 88
    .line 89
    invoke-static {v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->getFieldId(I)I

    .line 90
    move-result v3

    .line 91
    .line 92
    .line 93
    packed-switch v3, :pswitch_data_0

    .line 94
    .line 95
    .line 96
    :pswitch_0
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->skipUnknownField(Landroid/os/Parcel;I)V

    .line 97
    goto :goto_0

    .line 98
    .line 99
    .line 100
    :pswitch_1
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readInt(Landroid/os/Parcel;I)I

    .line 101
    move-result v2

    .line 102
    .line 103
    move/from16 v50, v2

    .line 104
    goto :goto_0

    .line 105
    .line 106
    .line 107
    :pswitch_2
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readLong(Landroid/os/Parcel;I)J

    .line 108
    move-result-wide v2

    .line 109
    .line 110
    move-wide/from16 v48, v2

    .line 111
    goto :goto_0

    .line 112
    .line 113
    .line 114
    :pswitch_3
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    move-object/from16 v47, v2

    .line 118
    goto :goto_0

    .line 119
    .line 120
    .line 121
    :pswitch_4
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    move-object/from16 v46, v2

    .line 125
    goto :goto_0

    .line 126
    .line 127
    .line 128
    :pswitch_5
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readLong(Landroid/os/Parcel;I)J

    .line 129
    move-result-wide v2

    .line 130
    .line 131
    move-wide/from16 v44, v2

    .line 132
    goto :goto_0

    .line 133
    .line 134
    .line 135
    :pswitch_6
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readInt(Landroid/os/Parcel;I)I

    .line 136
    move-result v2

    .line 137
    .line 138
    move/from16 v43, v2

    .line 139
    goto :goto_0

    .line 140
    .line 141
    .line 142
    :pswitch_7
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 143
    move-result-object v2

    .line 144
    .line 145
    move-object/from16 v42, v2

    .line 146
    goto :goto_0

    .line 147
    .line 148
    .line 149
    :pswitch_8
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readInt(Landroid/os/Parcel;I)I

    .line 150
    move-result v2

    .line 151
    .line 152
    move/from16 v41, v2

    .line 153
    goto :goto_0

    .line 154
    .line 155
    .line 156
    :pswitch_9
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readLong(Landroid/os/Parcel;I)J

    .line 157
    move-result-wide v2

    .line 158
    .line 159
    move-wide/from16 v39, v2

    .line 160
    goto :goto_0

    .line 161
    .line 162
    .line 163
    :pswitch_a
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readBoolean(Landroid/os/Parcel;I)Z

    .line 164
    move-result v2

    .line 165
    .line 166
    move/from16 v38, v2

    .line 167
    goto :goto_0

    .line 168
    .line 169
    .line 170
    :pswitch_b
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 171
    move-result-object v2

    .line 172
    .line 173
    move-object/from16 v37, v2

    .line 174
    goto :goto_0

    .line 175
    .line 176
    .line 177
    :pswitch_c
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 178
    move-result-object v2

    .line 179
    .line 180
    move-object/from16 v36, v2

    .line 181
    goto :goto_0

    .line 182
    .line 183
    .line 184
    :pswitch_d
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 185
    move-result-object v2

    .line 186
    .line 187
    move-object/from16 v35, v2

    .line 188
    goto :goto_0

    .line 189
    .line 190
    .line 191
    :pswitch_e
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createStringList(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 192
    move-result-object v2

    .line 193
    .line 194
    move-object/from16 v34, v2

    .line 195
    goto :goto_0

    .line 196
    .line 197
    .line 198
    :pswitch_f
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readLong(Landroid/os/Parcel;I)J

    .line 199
    move-result-wide v2

    .line 200
    .line 201
    move-wide/from16 v32, v2

    .line 202
    goto :goto_0

    .line 203
    .line 204
    .line 205
    :pswitch_10
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readBooleanObject(Landroid/os/Parcel;I)Ljava/lang/Boolean;

    .line 206
    move-result-object v2

    .line 207
    .line 208
    move-object/from16 v31, v2

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    .line 213
    :pswitch_11
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readBoolean(Landroid/os/Parcel;I)Z

    .line 214
    move-result v2

    .line 215
    .line 216
    move/from16 v30, v2

    .line 217
    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    .line 221
    :pswitch_12
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readBoolean(Landroid/os/Parcel;I)Z

    .line 222
    move-result v2

    .line 223
    .line 224
    move/from16 v29, v2

    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    .line 229
    :pswitch_13
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readInt(Landroid/os/Parcel;I)I

    .line 230
    move-result v2

    .line 231
    .line 232
    move/from16 v28, v2

    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    .line 237
    :pswitch_14
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readLong(Landroid/os/Parcel;I)J

    .line 238
    move-result-wide v2

    .line 239
    .line 240
    move-wide/from16 v26, v2

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    .line 245
    :pswitch_15
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 246
    move-result-object v2

    .line 247
    .line 248
    move-object/from16 v25, v2

    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    .line 253
    :pswitch_16
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readLong(Landroid/os/Parcel;I)J

    .line 254
    move-result-wide v2

    .line 255
    .line 256
    move-wide/from16 v23, v2

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    .line 261
    :pswitch_17
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readBoolean(Landroid/os/Parcel;I)Z

    .line 262
    move-result v2

    .line 263
    .line 264
    move/from16 v22, v2

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    .line 269
    :pswitch_18
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readBoolean(Landroid/os/Parcel;I)Z

    .line 270
    move-result v2

    .line 271
    .line 272
    move/from16 v21, v2

    .line 273
    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    .line 277
    :pswitch_19
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 278
    move-result-object v2

    .line 279
    .line 280
    move-object/from16 v20, v2

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    .line 285
    :pswitch_1a
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readLong(Landroid/os/Parcel;I)J

    .line 286
    move-result-wide v2

    .line 287
    .line 288
    move-wide/from16 v18, v2

    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    .line 293
    :pswitch_1b
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readLong(Landroid/os/Parcel;I)J

    .line 294
    move-result-wide v2

    .line 295
    .line 296
    move-wide/from16 v16, v2

    .line 297
    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    .line 301
    :pswitch_1c
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 302
    move-result-object v2

    .line 303
    move-object v15, v2

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    .line 308
    :pswitch_1d
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 309
    move-result-object v2

    .line 310
    move-object v14, v2

    .line 311
    .line 312
    goto/16 :goto_0

    .line 313
    .line 314
    .line 315
    :pswitch_1e
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 316
    move-result-object v2

    .line 317
    move-object v13, v2

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    .line 322
    :pswitch_1f
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 323
    move-result-object v2

    .line 324
    move-object v12, v2

    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    .line 329
    :cond_0
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->ensureAtEnd(Landroid/os/Parcel;I)V

    .line 330
    .line 331
    new-instance v11, Lcom/google/android/gms/measurement/internal/zzr;

    .line 332
    .line 333
    .line 334
    invoke-direct/range {v11 .. v50}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZZJLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    .line 335
    return-object v11

    .line 336
    nop

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
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/google/android/gms/measurement/internal/zzr;

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
.end method
