.class public final Lcom/google/android/gms/internal/measurement/zzjy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"


# static fields
.field private static volatile zza:Lcom/google/common/base/Optional;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method private constructor <init>()V
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

.method public static zza(Landroid/content/Context;)Lcom/google/common/base/Optional;
    .locals 16

    .line 1
    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzjy;->zza:Lcom/google/common/base/Optional;

    .line 3
    .line 4
    if-nez v0, :cond_c

    .line 5
    .line 6
    const-class v1, Lcom/google/android/gms/internal/measurement/zzjy;

    .line 7
    monitor-enter v1

    .line 8
    .line 9
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzjy;->zza:Lcom/google/common/base/Optional;

    .line 10
    .line 11
    if-nez v0, :cond_b

    .line 12
    .line 13
    sget-object v0, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v2, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 16
    .line 17
    sget v3, Lcom/google/android/gms/internal/measurement/zzka;->zza:I

    .line 18
    .line 19
    const-string v3, "eng"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result v3

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    .line 28
    const-string/jumbo v3, "userdebug"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    .line 38
    goto/16 :goto_c

    .line 39
    .line 40
    :cond_0
    :goto_0
    const-string v0, "dev-keys"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    move-result v0

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    .line 49
    const-string/jumbo v0, "test-keys"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    goto :goto_1

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    goto/16 :goto_9

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjm;->zza()Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    .line 71
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    .line 78
    move-result-object v0

    .line 79
    move-object v2, v0

    .line 80
    goto :goto_2

    .line 81
    .line 82
    :cond_3
    move-object/from16 v2, p0

    .line 83
    .line 84
    .line 85
    :goto_2
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 86
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    :try_start_1
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    const/4 v4, 0x0

    .line 91
    .line 92
    :try_start_2
    new-instance v0, Ljava/io/File;

    .line 93
    .line 94
    const-string v5, "phenotype_hermetic"

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v5, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 98
    move-result-object v5

    .line 99
    .line 100
    const-string v6, "overrides.txt"

    .line 101
    .line 102
    .line 103
    invoke-direct {v0, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    .line 106
    :try_start_3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 107
    move-result v5

    .line 108
    .line 109
    if-eqz v5, :cond_4

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    .line 113
    move-result-object v0

    .line 114
    goto :goto_3

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    .line 117
    goto/16 :goto_a

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    .line 121
    move-result-object v0

    .line 122
    goto :goto_3

    .line 123
    :catch_0
    move-exception v0

    .line 124
    .line 125
    const-string v5, "HermeticFileOverrides"

    .line 126
    .line 127
    const-string v6, "no data dir"

    .line 128
    .line 129
    .line 130
    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    .line 137
    :goto_3
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    .line 138
    move-result v5

    .line 139
    .line 140
    if-eqz v5, :cond_a

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    check-cast v0, Ljava/io/File;

    .line 147
    .line 148
    const-string v5, "Parsed "

    .line 149
    .line 150
    const-string v6, " for Android package "

    .line 151
    .line 152
    const-string v7, "Invalid: "
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 153
    .line 154
    :try_start_4
    new-instance v8, Ljava/io/BufferedReader;

    .line 155
    .line 156
    new-instance v9, Ljava/io/InputStreamReader;

    .line 157
    .line 158
    new-instance v10, Ljava/io/FileInputStream;

    .line 159
    .line 160
    .line 161
    invoke-direct {v10, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {v9, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 168
    .line 169
    :try_start_5
    new-instance v9, Landroidx/collection/SimpleArrayMap;

    .line 170
    .line 171
    .line 172
    invoke-direct {v9}, Landroidx/collection/SimpleArrayMap;-><init>()V

    .line 173
    .line 174
    new-instance v10, Ljava/util/HashMap;

    .line 175
    .line 176
    .line 177
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 178
    .line 179
    .line 180
    :goto_4
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 181
    move-result-object v11

    .line 182
    .line 183
    if-eqz v11, :cond_9

    .line 184
    .line 185
    const-string v12, " "

    .line 186
    const/4 v13, 0x3

    .line 187
    .line 188
    .line 189
    invoke-virtual {v11, v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 190
    move-result-object v12

    .line 191
    array-length v14, v12

    .line 192
    .line 193
    if-eq v14, v13, :cond_5

    .line 194
    .line 195
    const-string v12, "HermeticFileOverrides"

    .line 196
    .line 197
    .line 198
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 199
    move-result v13

    .line 200
    .line 201
    add-int/lit8 v13, v13, 0x9

    .line 202
    .line 203
    new-instance v14, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    move-result-object v11

    .line 217
    .line 218
    .line 219
    invoke-static {v12, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    goto :goto_4

    .line 221
    :catchall_2
    move-exception v0

    .line 222
    move-object v2, v0

    .line 223
    .line 224
    goto/16 :goto_5

    .line 225
    .line 226
    :cond_5
    aget-object v11, v12, v4

    .line 227
    .line 228
    new-instance v13, Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    invoke-direct {v13, v11}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 232
    const/4 v11, 0x1

    .line 233
    .line 234
    aget-object v11, v12, v11

    .line 235
    .line 236
    new-instance v14, Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    invoke-direct {v14, v11}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v14}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    move-result-object v11

    .line 244
    const/4 v14, 0x2

    .line 245
    .line 246
    aget-object v15, v12, v14

    .line 247
    .line 248
    .line 249
    invoke-interface {v10, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    move-result-object v15

    .line 251
    .line 252
    check-cast v15, Ljava/lang/String;

    .line 253
    .line 254
    if-nez v15, :cond_7

    .line 255
    .line 256
    aget-object v12, v12, v14

    .line 257
    .line 258
    new-instance v14, Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    invoke-direct {v14, v12}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v14}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    move-result-object v15

    .line 266
    .line 267
    .line 268
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 269
    move-result v12

    .line 270
    .line 271
    const/16 v4, 0x400

    .line 272
    .line 273
    if-lt v12, v4, :cond_6

    .line 274
    .line 275
    if-ne v15, v14, :cond_7

    .line 276
    .line 277
    .line 278
    :cond_6
    invoke-interface {v10, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    :cond_7
    invoke-virtual {v9, v13}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    move-result-object v4

    .line 283
    .line 284
    check-cast v4, Landroidx/collection/SimpleArrayMap;

    .line 285
    .line 286
    if-nez v4, :cond_8

    .line 287
    .line 288
    new-instance v4, Landroidx/collection/SimpleArrayMap;

    .line 289
    .line 290
    .line 291
    invoke-direct {v4}, Landroidx/collection/SimpleArrayMap;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v9, v13, v4}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    :cond_8
    invoke-virtual {v4, v11, v15}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    const/4 v4, 0x0

    .line 299
    goto :goto_4

    .line 300
    .line 301
    :cond_9
    const-string v4, "HermeticFileOverrides"

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 305
    move-result-object v0

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 309
    move-result-object v2

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 313
    move-result v7

    .line 314
    .line 315
    add-int/lit8 v7, v7, 0x1c

    .line 316
    .line 317
    .line 318
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 319
    move-result-object v10

    .line 320
    .line 321
    .line 322
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 323
    move-result v10

    .line 324
    add-int/2addr v7, v10

    .line 325
    .line 326
    new-instance v10, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    move-result-object v0

    .line 346
    .line 347
    .line 348
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 349
    .line 350
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjs;

    .line 351
    .line 352
    .line 353
    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/measurement/zzjs;-><init>(Landroidx/collection/SimpleArrayMap;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 354
    .line 355
    .line 356
    :try_start_6
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 357
    .line 358
    .line 359
    :try_start_7
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    .line 360
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 361
    goto :goto_8

    .line 362
    :catch_1
    move-exception v0

    .line 363
    goto :goto_7

    .line 364
    .line 365
    .line 366
    :goto_5
    :try_start_8
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 367
    goto :goto_6

    .line 368
    :catchall_3
    move-exception v0

    .line 369
    .line 370
    .line 371
    :try_start_9
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 372
    :goto_6
    throw v2
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 373
    .line 374
    :goto_7
    :try_start_a
    new-instance v2, Ljava/lang/RuntimeException;

    .line 375
    .line 376
    .line 377
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 378
    throw v2

    .line 379
    .line 380
    .line 381
    :cond_a
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    .line 382
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 383
    .line 384
    .line 385
    :goto_8
    :try_start_b
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 386
    .line 387
    :goto_9
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzjy;->zza:Lcom/google/common/base/Optional;

    .line 388
    goto :goto_b

    .line 389
    .line 390
    .line 391
    :goto_a
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 392
    throw v0

    .line 393
    :cond_b
    :goto_b
    monitor-exit v1

    .line 394
    return-object v0

    .line 395
    :goto_c
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 396
    throw v0

    .line 397
    :cond_c
    return-object v0
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
.end method
