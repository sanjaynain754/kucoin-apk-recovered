.class public final Lcom/appsflyer/internal/AFf1rSDK;
.super Lcom/appsflyer/internal/AFe1cSDK;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1rSDK$AFa1ySDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1cSDK<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final AFInAppEventParameterName:Ljava/util/UUID;

.field public component1:Lcom/appsflyer/internal/AFf1rSDK$AFa1ySDK;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private copy:Ljava/lang/String;

.field private copydefault:Ljava/lang/String;

.field private final equals:Lcom/appsflyer/internal/AFd1mSDK;

.field private hashCode:Ljava/lang/String;

.field private final toString:Z


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1zSDK;Ljava/util/UUID;Landroid/net/Uri;)V
    .locals 10
    .param p1    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFe1oSDK;->areAllFieldsValid:Lcom/appsflyer/internal/AFe1oSDK;

    .line 3
    .line 4
    sget-object v1, Lcom/appsflyer/internal/AFe1oSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFe1oSDK;

    .line 5
    .line 6
    .line 7
    filled-new-array {v1}, [Lcom/appsflyer/internal/AFe1oSDK;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0, v1, p1, v2}, Lcom/appsflyer/internal/AFe1cSDK;-><init>(Lcom/appsflyer/internal/AFe1oSDK;[Lcom/appsflyer/internal/AFe1oSDK;Lcom/appsflyer/internal/AFd1zSDK;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1zSDK;->AFAdRevenueData()Lcom/appsflyer/internal/AFd1mSDK;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1rSDK;->equals:Lcom/appsflyer/internal/AFd1mSDK;

    .line 22
    .line 23
    iput-object p2, p0, Lcom/appsflyer/internal/AFf1rSDK;->AFInAppEventParameterName:Ljava/util/UUID;

    .line 24
    const/4 p2, 0x0

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/appsflyer/internal/AFk1wSDK;->AFAdRevenueData(Ljava/lang/String;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_8

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/appsflyer/internal/AFk1wSDK;->AFAdRevenueData(Ljava/lang/String;)Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-nez v0, :cond_8

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1zSDK;->e()Lcom/appsflyer/internal/AFa1qSDK;

    .line 48
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    const/4 v0, 0x2

    .line 50
    .line 51
    :try_start_1
    new-array v1, v0, [Ljava/lang/Object;

    .line 52
    const/4 v2, 0x1

    .line 53
    .line 54
    aput-object p1, v1, v2

    .line 55
    .line 56
    aput-object p3, v1, p2

    .line 57
    .line 58
    sget-object p1, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    const v3, 0xa3ed8bc

    .line 62
    .line 63
    .line 64
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    move-result-object v4

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    .line 72
    const v5, 0xefcc

    .line 73
    .line 74
    if-eqz v4, :cond_0

    .line 75
    goto :goto_0

    .line 76
    .line 77
    .line 78
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 79
    move-result v4

    .line 80
    .line 81
    shr-int/lit8 v4, v4, 0x10

    .line 82
    .line 83
    .line 84
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 85
    move-result v6

    .line 86
    .line 87
    sub-int v6, v5, v6

    .line 88
    int-to-char v6, v6

    .line 89
    .line 90
    .line 91
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 92
    move-result v7

    .line 93
    .line 94
    add-int/lit8 v7, v7, 0x24

    .line 95
    .line 96
    .line 97
    invoke-static {v4, v6, v7}, Lcom/appsflyer/internal/AFa1hSDK;->getMediationNetwork(ICI)Ljava/lang/Object;

    .line 98
    move-result-object v4

    .line 99
    .line 100
    check-cast v4, Ljava/lang/Class;

    .line 101
    .line 102
    const-class v6, Landroid/net/Uri;

    .line 103
    .line 104
    const-class v7, Lcom/appsflyer/internal/AFa1qSDK;

    .line 105
    .line 106
    .line 107
    filled-new-array {v6, v7}, [Ljava/lang/Class;

    .line 108
    move-result-object v6

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 112
    move-result-object v4

    .line 113
    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    .line 119
    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    :goto_0
    check-cast v4, Ljava/lang/reflect/Constructor;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 126
    .line 127
    .line 128
    const v3, 0x1123ef9e

    .line 129
    .line 130
    .line 131
    :try_start_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    move-result-object v4

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    move-result-object v4

    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    .line 140
    if-eqz v4, :cond_1

    .line 141
    goto :goto_1

    .line 142
    .line 143
    .line 144
    :cond_1
    invoke-static {p2, p2, p2, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 145
    move-result v4

    .line 146
    .line 147
    .line 148
    invoke-static {p2, v6, v6}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 149
    move-result v8

    .line 150
    .line 151
    cmpl-float v8, v8, v6

    .line 152
    add-int/2addr v8, v5

    .line 153
    int-to-char v5, v8

    .line 154
    .line 155
    .line 156
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 157
    move-result v8

    .line 158
    .line 159
    shr-int/lit8 v8, v8, 0x10

    .line 160
    .line 161
    rsub-int/lit8 v8, v8, 0x24

    .line 162
    .line 163
    .line 164
    invoke-static {v4, v5, v8}, Lcom/appsflyer/internal/AFa1hSDK;->getMediationNetwork(ICI)Ljava/lang/Object;

    .line 165
    move-result-object v4

    .line 166
    .line 167
    check-cast v4, Ljava/lang/Class;

    .line 168
    .line 169
    const-string v5, "getMonetizationNetwork"

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 173
    move-result-object v4

    .line 174
    .line 175
    .line 176
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    move-result-object v3

    .line 178
    .line 179
    .line 180
    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    :goto_1
    check-cast v4, Ljava/lang/reflect/Method;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 187
    .line 188
    .line 189
    const v3, 0x50e7f59b

    .line 190
    .line 191
    .line 192
    :try_start_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    move-result-object v4

    .line 194
    .line 195
    .line 196
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    move-result-object v4

    .line 198
    .line 199
    if-eqz v4, :cond_2

    .line 200
    goto :goto_2

    .line 201
    .line 202
    .line 203
    :cond_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 204
    move-result v4

    .line 205
    .line 206
    shr-int/lit8 v4, v4, 0x10

    .line 207
    .line 208
    add-int/lit8 v4, v4, 0x24

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 212
    move-result v5

    .line 213
    .line 214
    shr-int/lit8 v5, v5, 0x16

    .line 215
    int-to-char v5, v5

    .line 216
    .line 217
    .line 218
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 219
    move-result v8

    .line 220
    .line 221
    rsub-int/lit8 v8, v8, 0x33

    .line 222
    .line 223
    .line 224
    invoke-static {v4, v5, v8}, Lcom/appsflyer/internal/AFa1hSDK;->getMediationNetwork(ICI)Ljava/lang/Object;

    .line 225
    move-result-object v4

    .line 226
    .line 227
    check-cast v4, Ljava/lang/Class;

    .line 228
    .line 229
    const-string v5, "getMediationNetwork"

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 233
    move-result-object v4

    .line 234
    .line 235
    .line 236
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    move-result-object v3

    .line 238
    .line 239
    .line 240
    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    :goto_2
    check-cast v4, Ljava/lang/reflect/Method;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    move-result-object v3

    .line 247
    .line 248
    check-cast v3, Ljava/lang/Boolean;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 252
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 253
    .line 254
    .line 255
    const v4, 0x6bdc677b

    .line 256
    .line 257
    .line 258
    :try_start_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    move-result-object v5

    .line 260
    .line 261
    .line 262
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    move-result-object v5

    .line 264
    .line 265
    if-eqz v5, :cond_3

    .line 266
    goto :goto_3

    .line 267
    .line 268
    :cond_3
    const-string v5, ""

    .line 269
    .line 270
    .line 271
    invoke-static {v5, p2}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 272
    move-result v5

    .line 273
    .line 274
    add-int/lit8 v5, v5, 0x24

    .line 275
    .line 276
    .line 277
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 278
    move-result v8

    .line 279
    .line 280
    cmpl-float v8, v8, v6

    .line 281
    .line 282
    rsub-int/lit8 v8, v8, 0x1

    .line 283
    int-to-char v8, v8

    .line 284
    .line 285
    .line 286
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 287
    move-result v9

    .line 288
    .line 289
    cmpl-float v6, v9, v6

    .line 290
    .line 291
    rsub-int/lit8 v6, v6, 0x34

    .line 292
    .line 293
    .line 294
    invoke-static {v5, v8, v6}, Lcom/appsflyer/internal/AFa1hSDK;->getMediationNetwork(ICI)Ljava/lang/Object;

    .line 295
    move-result-object v5

    .line 296
    .line 297
    check-cast v5, Ljava/lang/Class;

    .line 298
    .line 299
    const-string v6, "getRevenue"

    .line 300
    .line 301
    .line 302
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 303
    move-result-object v5

    .line 304
    .line 305
    .line 306
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    move-result-object v4

    .line 308
    .line 309
    .line 310
    invoke-interface {p1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    :goto_3
    check-cast v5, Ljava/lang/reflect/Method;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    move-result-object p1

    .line 317
    .line 318
    check-cast p1, Ljava/lang/Boolean;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 322
    move-result p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 323
    .line 324
    .line 325
    :try_start_5
    invoke-virtual {p3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 326
    move-result-object p1

    .line 327
    .line 328
    const-string v1, "/"

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 332
    move-result-object p1

    .line 333
    .line 334
    if-eqz v3, :cond_8

    .line 335
    array-length v1, p1

    .line 336
    const/4 v3, 0x3

    .line 337
    .line 338
    if-ne v1, v3, :cond_8

    .line 339
    .line 340
    aget-object v1, p1, v2

    .line 341
    .line 342
    iput-object v1, p0, Lcom/appsflyer/internal/AFf1rSDK;->copydefault:Ljava/lang/String;

    .line 343
    .line 344
    aget-object p1, p1, v0

    .line 345
    .line 346
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1rSDK;->copy:Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 350
    move-result-object p1

    .line 351
    .line 352
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1rSDK;->hashCode:Ljava/lang/String;

    .line 353
    goto :goto_5

    .line 354
    :catch_0
    move-exception p1

    .line 355
    goto :goto_4

    .line 356
    :catchall_0
    move-exception p1

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 360
    move-result-object p3

    .line 361
    .line 362
    if-eqz p3, :cond_4

    .line 363
    throw p3

    .line 364
    :cond_4
    throw p1

    .line 365
    :catchall_1
    move-exception p1

    .line 366
    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 369
    move-result-object p3

    .line 370
    .line 371
    if-eqz p3, :cond_5

    .line 372
    throw p3

    .line 373
    :cond_5
    throw p1

    .line 374
    :catchall_2
    move-exception p1

    .line 375
    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 378
    move-result-object p3

    .line 379
    .line 380
    if-eqz p3, :cond_6

    .line 381
    throw p3

    .line 382
    :cond_6
    throw p1

    .line 383
    :catchall_3
    move-exception p1

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 387
    move-result-object p3

    .line 388
    .line 389
    if-eqz p3, :cond_7

    .line 390
    throw p3

    .line 391
    :cond_7
    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 392
    .line 393
    :goto_4
    const-string p3, "OneLinkValidator: reflection init failed"

    .line 394
    .line 395
    .line 396
    invoke-static {p3, p1}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 397
    .line 398
    :cond_8
    :goto_5
    iput-boolean p2, p0, Lcom/appsflyer/internal/AFf1rSDK;->toString:Z

    .line 399
    return-void
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
.end method


# virtual methods
.method public final AFAdRevenueData(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1iSDK;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1iSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1rSDK;->equals:Lcom/appsflyer/internal/AFd1mSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1rSDK;->copydefault:Ljava/lang/String;

    iget-object v2, p0, Lcom/appsflyer/internal/AFf1rSDK;->copy:Ljava/lang/String;

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1rSDK;->AFInAppEventParameterName:Ljava/util/UUID;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/appsflyer/internal/AFd1mSDK;->getMediationNetwork(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1iSDK;

    move-result-object p1

    return-object p1
.end method

.method public final AFAdRevenueData()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public final a_()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public final areAllFieldsValid()Lcom/appsflyer/attribution/AppsFlyerRequestListener;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public final copy()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFf1rSDK;->toString:Z

    .line 3
    return v0
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
.end method

.method public final copydefault()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1rSDK;->copydefault:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1rSDK;->copy:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1rSDK;->copydefault:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "app"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
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
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final equals()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public final getCurrencyIso4217Code()J
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0xbb8

    .line 3
    return-wide v0
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
.end method

.method public final getMonetizationNetwork()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1cSDK;->getMonetizationNetwork()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1rSDK;->component1:Lcom/appsflyer/internal/AFf1rSDK$AFa1ySDK;

    .line 6
    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1mSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFe1qSDK;

    .line 10
    .line 11
    sget-object v2, Lcom/appsflyer/internal/AFe1qSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFe1qSDK;

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1cSDK;->component2:Lcom/appsflyer/internal/AFe1zSDK;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFe1zSDK;->getBody()Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFf1rSDK$AFa1ySDK;->AFAdRevenueData(Ljava/util/Map;)V

    .line 27
    return-void

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1mSDK;->component4()Ljava/lang/Throwable;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    instance-of v2, v1, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    .line 34
    .line 35
    const-string v3, "Can\'t get OneLink data"

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    check-cast v1, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;->getRawResponse()Lcom/appsflyer/internal/AFe1zSDK;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFe1zSDK;->isSuccessful()Z

    .line 47
    move-result v1

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    const-string v1, "Can\'t parse one link data"

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFf1rSDK$AFa1ySDK;->getMediationNetwork(Ljava/lang/String;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1rSDK;->hashCode:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    move-object v3, v1

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-interface {v0, v3}, Lcom/appsflyer/internal/AFf1rSDK$AFa1ySDK;->getMediationNetwork(Ljava/lang/String;)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1rSDK;->hashCode:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    move-object v3, v1

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-interface {v0, v3}, Lcom/appsflyer/internal/AFf1rSDK$AFa1ySDK;->getMediationNetwork(Ljava/lang/String;)V

    .line 73
    :cond_5
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
.end method
