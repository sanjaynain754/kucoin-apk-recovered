.class public final Lcom/jumio/core/models/SettingsModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/models/SettingsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/jumio/core/models/SettingsModel$Companion;",
        "",
        "<init>",
        "()V",
        "fromJson",
        "Lcom/jumio/core/models/SettingsModel;",
        "jsonObject",
        "Lorg/json/JSONObject;",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSettingsModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsModel.kt\ncom/jumio/core/models/SettingsModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
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
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    return-object p0
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
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/SettingsModel;
    .locals 38
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "jsonObject"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "configurations"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 21
    :cond_0
    move-object v8, v1

    .line 22
    .line 23
    const/16 v6, 0x1c

    .line 24
    const/4 v7, 0x0

    .line 25
    .line 26
    const-string v1, "timestamp"

    .line 27
    .line 28
    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.S\'Z\'"

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v0 .. v7}, Lcom/jumio/core/util/JsonUtilKt;->optDate$default(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/util/TimeZone;Ljava/util/Date;ILjava/lang/Object;)Ljava/util/Date;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 41
    move-result-wide v1

    .line 42
    :goto_0
    move-wide v10, v1

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_1
    const-wide/16 v1, 0x0

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :goto_1
    const-string v1, "merchantSettings"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    new-instance v1, Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 60
    .line 61
    :cond_2
    const-string v2, "brandingEnabled"

    .line 62
    const/4 v3, 0x1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 66
    move-result v12

    .line 67
    .line 68
    const-string v2, "returnImages"

    .line 69
    const/4 v4, 0x0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 73
    move-result v13

    .line 74
    .line 75
    const-string v2, "countryForIp"

    .line 76
    .line 77
    const-string v5, ""

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object v14

    .line 82
    .line 83
    const-string v2, "optString(...)"

    .line 84
    .line 85
    .line 86
    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    const-string v6, "stateForIp"

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v6, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object v15

    .line 93
    .line 94
    .line 95
    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    const-string v6, "analyticsEnabled"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v6, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 101
    move-result v18

    .line 102
    .line 103
    const-string v6, "additionalDataPoints"

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v6, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 107
    move-result v16

    .line 108
    .line 109
    const-string v6, "maxLivenessImages"

    .line 110
    .line 111
    const/16 v7, 0xa

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 115
    move-result v6

    .line 116
    .line 117
    .line 118
    invoke-static {v6, v4, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 119
    move-result v19

    .line 120
    .line 121
    const-string v6, "maxFileUploadSize"

    .line 122
    .line 123
    const/high16 v7, 0x300000

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 127
    move-result v25

    .line 128
    .line 129
    const-string v6, "keyPinning"

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v6, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 133
    move-result v22

    .line 134
    .line 135
    const-string v6, "workflowDefinitionKey"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v6, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    move-result-object v5

    .line 140
    .line 141
    .line 142
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    const-string v6, "skipDocTypeSelection"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v6, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 148
    move-result v28

    .line 149
    .line 150
    const-string v6, "docClassifierOverride"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v6, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 154
    move-result v29

    .line 155
    .line 156
    const-string v6, "networkThrottlingLimit"

    .line 157
    .line 158
    const/16 v7, 0x12c

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 162
    move-result v30

    .line 163
    .line 164
    const-string v6, "instantFeedback"

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8, v6, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 168
    move-result v23

    .line 169
    .line 170
    const-string v6, "maxRetries"

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8, v6, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 174
    move-result v24

    .line 175
    .line 176
    const-string v6, "automaticBarcodeExtraction"

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v6, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 180
    move-result v27

    .line 181
    .line 182
    const-string v3, "useCamera1"

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 186
    move-result v20

    .line 187
    .line 188
    const-string v3, "collectCameraStackTrace"

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 192
    move-result v21

    .line 193
    .line 194
    const-string v3, "imageCompressionQuality"

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    const-wide v6, 0x3feccccccccccccdL    # 0.9

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8, v3, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 203
    move-result-wide v6

    .line 204
    .line 205
    sget-object v3, Ljumio/core/M3;->a:Ljava/util/List;

    .line 206
    .line 207
    const/16 v3, 0x64

    .line 208
    .line 209
    move-object/from16 v26, v5

    .line 210
    int-to-double v4, v3

    .line 211
    mul-double/2addr v6, v4

    .line 212
    double-to-int v3, v6

    .line 213
    .line 214
    const-string v4, "skipStartScreen"

    .line 215
    const/4 v9, 0x0

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 219
    move-result v32

    .line 220
    .line 221
    const-string v4, "startMaxLoadingTime"

    .line 222
    .line 223
    const/16 v5, 0x1388

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 227
    move-result v33

    .line 228
    .line 229
    const-string v0, "sensorDataCollectionEnabled"

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v0, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 233
    move-result v34

    .line 234
    .line 235
    const-string v0, "sensorSamplingTime"

    .line 236
    .line 237
    const-string v4, "100"

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8, v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    move-result-object v0

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 248
    move-result v35

    .line 249
    .line 250
    const-string v0, "docProofAcquireModes"

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 254
    move-result-object v0

    .line 255
    .line 256
    if-eqz v0, :cond_4

    .line 257
    .line 258
    new-instance v4, Lr9/j;

    .line 259
    .line 260
    .line 261
    invoke-direct {v4}, Lr9/j;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v4}, Lcom/jumio/core/util/JsonUtilKt;->map(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 265
    move-result-object v0

    .line 266
    .line 267
    if-eqz v0, :cond_4

    .line 268
    .line 269
    .line 270
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 271
    move-result v4

    .line 272
    .line 273
    if-nez v4, :cond_3

    .line 274
    goto :goto_2

    .line 275
    :cond_3
    const/4 v0, 0x0

    .line 276
    .line 277
    :goto_2
    if-eqz v0, :cond_4

    .line 278
    .line 279
    :goto_3
    move-object/from16 v36, v0

    .line 280
    goto :goto_4

    .line 281
    .line 282
    :cond_4
    sget-object v0, Ljumio/core/M3;->a:Ljava/util/List;

    .line 283
    goto :goto_3

    .line 284
    .line 285
    :goto_4
    const-string v0, "faceCaptureMode"

    .line 286
    .line 287
    const-string v4, "front"

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    move-result-object v0

    .line 292
    .line 293
    .line 294
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    new-instance v9, Lcom/jumio/core/models/SettingsModel;

    .line 297
    .line 298
    const/16 v17, 0x1

    .line 299
    .line 300
    move-object/from16 v37, v0

    .line 301
    .line 302
    move/from16 v31, v3

    .line 303
    .line 304
    .line 305
    invoke-direct/range {v9 .. v37}, Lcom/jumio/core/models/SettingsModel;-><init>(JZZLjava/lang/String;Ljava/lang/String;ZZZIZZZZIILjava/lang/String;ZZZIIZIZILjava/util/List;Ljava/lang/String;)V

    .line 306
    return-object v9
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
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
.end method
