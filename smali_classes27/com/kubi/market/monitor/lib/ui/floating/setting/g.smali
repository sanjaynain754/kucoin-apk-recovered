.class public final Lcom/kubi/market/monitor/lib/ui/floating/setting/g;
.super Ljava/lang/Object;
.source "FloatWindowSettingContract.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\u0008\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\u0008\u0010\u0018\u001a\u00020\u0017H\u0000\u001a\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u0008\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\u0008\u0010\u001d\u001a\u00020\u001cH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "TYPE_DATA_UPDATE_INTERVAL",
        "",
        "TYPE_DISPLAY_MODE",
        "TYPE_PAGING",
        "TYPE_TEXT_SIZE",
        "TYPE_THEME",
        "EVENT_REMOVE_SYMBOL",
        "",
        "EVENT_TOP_SYMBOL",
        "EVENT_UPDATE_DISPLAY_MODE",
        "EVENT_UPDATE_ACTIONBAR",
        "TYPE_DRAG",
        "TYPE_UP",
        "PAGE_ID_B4MORESHOWSETTING",
        "createThemeText",
        "theme",
        "createDisplayModeText",
        "displayMode",
        "createPagingModeText",
        "pagingMode",
        "createTextSizeModeText",
        "textSizeMode",
        "createPagingTime",
        "Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;",
        "createAutoScrollTime",
        "createUpdateIntervalTimeText",
        "time",
        "createPagingIntervalLayoutVisible",
        "",
        "createScrollIntervalLayoutVisible",
        "MarketMonitorLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a()Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;

    .line 3
    .line 4
    sget v1, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_interval_second:I

    .line 5
    const/4 v2, 0x3

    .line 6
    .line 7
    .line 8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    move-result-object v3

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v3}, Laq/b;->d(ILjava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x5

    .line 15
    .line 16
    .line 17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v5

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v5}, Laq/b;->d(ILjava/lang/Object;)Ljava/lang/String;

    .line 22
    move-result-object v5

    .line 23
    .line 24
    const/16 v6, 0xa

    .line 25
    .line 26
    .line 27
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v7

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v7}, Laq/b;->d(ILjava/lang/Object;)Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    sget-object v7, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 38
    move-result-object v8

    .line 39
    .line 40
    .line 41
    invoke-virtual {v8}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->getAutoScrollTime()I

    .line 42
    move-result v8

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x1

    .line 45
    .line 46
    if-ne v2, v8, :cond_0

    .line 47
    move v2, v4

    .line 48
    move v4, v10

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v2, v4

    .line 51
    move v4, v9

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {v7}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->getAutoScrollTime()I

    .line 59
    move-result v8

    .line 60
    .line 61
    if-ne v2, v8, :cond_1

    .line 62
    move-object v2, v5

    .line 63
    move v5, v10

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move-object v2, v5

    .line 66
    move v5, v9

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {v7}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 70
    move-result-object v7

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->getAutoScrollTime()I

    .line 74
    move-result v7

    .line 75
    .line 76
    if-ne v6, v7, :cond_2

    .line 77
    move-object v6, v3

    .line 78
    move-object v3, v1

    .line 79
    move-object v1, v6

    .line 80
    move v6, v10

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move-object v6, v3

    .line 83
    move-object v3, v1

    .line 84
    move-object v1, v6

    .line 85
    move v6, v9

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-direct/range {v0 .. v6}, Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 89
    return-object v0
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
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
.end method

.method public static final b(I)Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_expand:I

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_scroll:I

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-static {p0}, Laq/b;->c(I)Ljava/lang/String;

    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
.end method

.method public static final c()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->getPagingMode()I

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
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
.end method

.method public static final d(I)Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_auto_paging:I

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_manual_paging:I

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-static {p0}, Laq/b;->c(I)Ljava/lang/String;

    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
.end method

.method public static final e()Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;

    .line 3
    .line 4
    sget v1, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_interval_second:I

    .line 5
    const/4 v2, 0x3

    .line 6
    .line 7
    .line 8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    move-result-object v3

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v3}, Laq/b;->d(ILjava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v3

    .line 14
    const/4 v4, 0x5

    .line 15
    .line 16
    .line 17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v5

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v5}, Laq/b;->d(ILjava/lang/Object;)Ljava/lang/String;

    .line 22
    move-result-object v5

    .line 23
    .line 24
    const/16 v6, 0xa

    .line 25
    .line 26
    .line 27
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object v7

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v7}, Laq/b;->d(ILjava/lang/Object;)Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    sget-object v7, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 38
    move-result-object v8

    .line 39
    .line 40
    .line 41
    invoke-virtual {v8}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->getPageTurningTime()I

    .line 42
    move-result v8

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x1

    .line 45
    .line 46
    if-ne v2, v8, :cond_0

    .line 47
    move v2, v4

    .line 48
    move v4, v10

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v2, v4

    .line 51
    move v4, v9

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {v7}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->getPageTurningTime()I

    .line 59
    move-result v8

    .line 60
    .line 61
    if-ne v2, v8, :cond_1

    .line 62
    move-object v2, v5

    .line 63
    move v5, v10

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move-object v2, v5

    .line 66
    move v5, v9

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {v7}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 70
    move-result-object v7

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->getPageTurningTime()I

    .line 74
    move-result v7

    .line 75
    .line 76
    if-ne v6, v7, :cond_2

    .line 77
    move-object v6, v3

    .line 78
    move-object v3, v1

    .line 79
    move-object v1, v6

    .line 80
    move v6, v10

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move-object v6, v3

    .line 83
    move-object v3, v1

    .line 84
    move-object v1, v6

    .line 85
    move v6, v9

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-direct/range {v0 .. v6}, Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 89
    return-object v0
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
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
.end method

.method public static final f()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->a:Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/ui/floating/FloatingWindowConfigManager;->g()Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/entity/MarketFloatingWindowConfig;->getDisplayMode()I

    .line 10
    move-result v0

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
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
.end method

.method public static final g(I)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eq p0, v0, :cond_2

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    const/4 v0, 0x3

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_small_font:I

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Laq/b;->c(I)Ljava/lang/String;

    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    .line 18
    :cond_0
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_large_font:I

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Laq/b;->c(I)Ljava/lang/String;

    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    .line 25
    :cond_1
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_medium_font:I

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Laq/b;->c(I)Ljava/lang/String;

    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    .line 32
    :cond_2
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_small_font:I

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Laq/b;->c(I)Ljava/lang/String;

    .line 36
    move-result-object p0

    .line 37
    return-object p0
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
.end method

.method public static final h(I)Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_theme_dark:I

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget p0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_theme_light:I

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-static {p0}, Laq/b;->c(I)Ljava/lang/String;

    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
.end method

.method public static final i(I)Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x3c

    .line 3
    .line 4
    if-lt p0, v0, :cond_0

    .line 5
    .line 6
    sget v1, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_minute:I

    .line 7
    div-int/2addr p0, v0

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-static {v1, p0}, Laq/b;->d(ILjava/lang/Object;)Ljava/lang/String;

    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    .line 18
    :cond_0
    sget v0, Lcom/kubi/kucoin/market/monitor/lib/R$string;->floating_window_second:I

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    move-result-object p0

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p0}, Laq/b;->d(ILjava/lang/Object;)Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    return-object p0
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
.end method
