.class public final Lcom/jumio/core/models/CameraChallengeConfig$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/jumio/core/models/CameraChallengeConfig$Companion;",
        "",
        "<init>",
        "()V",
        "fromJson",
        "Lcom/jumio/core/models/CameraChallengeConfig;",
        "json",
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
        "SMAP\nCameraChallengeModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraChallengeModel.kt\ncom/jumio/core/models/CameraChallengeConfig$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n295#2,2:145\n*S KotlinDebug\n*F\n+ 1 CameraChallengeModel.kt\ncom/jumio/core/models/CameraChallengeConfig$Companion\n*L\n96#1:145,2\n*E\n"
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


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Ljumio/core/V;
    .locals 14
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "json"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "side"

    .line 8
    .line 9
    const-string v1, "FRONT"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-string v1, "manualEnabled"

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 20
    move-result v5

    .line 21
    .line 22
    const-string v1, "uploadImages"

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 27
    move-result v6

    .line 28
    .line 29
    const-string v1, "classifier"

    .line 30
    .line 31
    const-string v2, ""

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v7

    .line 36
    .line 37
    sget-object v8, Ljumio/core/Z;->f:Lcom/jumio/core/models/CameraChallengePart$Companion;

    .line 38
    .line 39
    const-string v1, "exposure"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    new-instance v1, Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 51
    :cond_0
    move-object v9, v1

    .line 52
    .line 53
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const-wide v12, 0x3fc999999999999aL    # 0.2

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {v8 .. v13}, Lcom/jumio/core/models/CameraChallengePart$Companion;->fromJson(Lorg/json/JSONObject;DD)Ljumio/core/Z;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    const-string v2, "focus"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    new-instance v2, Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 76
    :cond_1
    move-object v9, v2

    .line 77
    .line 78
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    const-wide v12, 0x3fb999999999999aL    # 0.1

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {v8 .. v13}, Lcom/jumio/core/models/CameraChallengePart$Companion;->fromJson(Lorg/json/JSONObject;DD)Ljumio/core/Z;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    const-string v3, "whiteBalance"

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    if-nez p1, :cond_2

    .line 96
    .line 97
    new-instance p1, Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 101
    :cond_2
    move-object v9, p1

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    const-wide v10, 0x3fd6666666666666L    # 0.35

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    const-wide v12, 0x3fc3333333333333L    # 0.15

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v8 .. v13}, Lcom/jumio/core/models/CameraChallengePart$Companion;->fromJson(Lorg/json/JSONObject;DD)Ljumio/core/Z;

    .line 115
    move-result-object v10

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lcom/jumio/sdk/enums/JumioCredentialPart;->getEntries()Lkotlin/enums/EnumEntries;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    move-result v3

    .line 128
    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    move-result-object v3

    .line 134
    move-object v4, v3

    .line 135
    .line 136
    check-cast v4, Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 140
    move-result-object v4

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 144
    .line 145
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 149
    move-result-object v8

    .line 150
    .line 151
    const-string v9, "toUpperCase(...)"

    .line 152
    .line 153
    .line 154
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    move-result v4

    .line 159
    .line 160
    if-eqz v4, :cond_3

    .line 161
    goto :goto_0

    .line 162
    :cond_4
    const/4 v3, 0x0

    .line 163
    .line 164
    :goto_0
    check-cast v3, Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 165
    .line 166
    if-nez v3, :cond_5

    .line 167
    .line 168
    sget-object v3, Lcom/jumio/sdk/enums/JumioCredentialPart;->FRONT:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 169
    :cond_5
    move-object v4, v3

    .line 170
    .line 171
    new-instance v3, Ljumio/core/V;

    .line 172
    .line 173
    .line 174
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 175
    move-object v8, v1

    .line 176
    move-object v9, v2

    .line 177
    .line 178
    .line 179
    invoke-direct/range {v3 .. v10}, Ljumio/core/V;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;ZZLjava/lang/String;Ljumio/core/Z;Ljumio/core/Z;Ljumio/core/Z;)V

    .line 180
    return-object v3
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
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
