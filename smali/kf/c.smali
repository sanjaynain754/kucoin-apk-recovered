.class public Lkf/c;
.super Ljava/lang/Object;
.source "CurrencyConfig.java"


# static fields
.field public static a:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static b:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Ly70/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly70/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static d:Lcom/kubi/data/rate/CurrencyPrice;

.field public static e:Ljava/lang/String;

.field public static final f:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static h:Ljava/util/concurrent/ConcurrentSkipListMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListMap<",
            "Ljava/lang/String;",
            "Lcom/kubi/data/entity/FiatCurrencyEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-string v0, "CurrencyConfig"

    .line 3
    .line 4
    new-instance v1, Ly70/g;

    .line 5
    .line 6
    sget-object v2, Lcom/kubi/utils/storage/StorageType;->LocalSite:Lcom/kubi/utils/storage/StorageType;

    .line 7
    .line 8
    const-string v3, "currency_config"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v4, "sp_key_currency_unit_v2"

    .line 12
    const/4 v5, 0x1

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v3, v4, v2, v5}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 16
    .line 17
    sput-object v1, Lkf/c;->a:Ly70/g;

    .line 18
    .line 19
    new-instance v1, Ly70/g;

    .line 20
    .line 21
    .line 22
    const-string/jumbo v4, "sp_key_currency"

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v3, v4, v2, v5}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 26
    .line 27
    sput-object v1, Lkf/c;->b:Ly70/g;

    .line 28
    .line 29
    new-instance v1, Ly70/g;

    .line 30
    .line 31
    .line 32
    const-string/jumbo v4, "sp_key_currency_map"

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v3, v4, v2, v5}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 36
    .line 37
    sput-object v1, Lkf/c;->c:Ly70/g;

    .line 38
    .line 39
    new-instance v1, Lcom/kubi/data/rate/CurrencyPrice;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1}, Lcom/kubi/data/rate/CurrencyPrice;-><init>()V

    .line 43
    .line 44
    sput-object v1, Lkf/c;->d:Lcom/kubi/data/rate/CurrencyPrice;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lkf/c;->h()Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    sput-object v1, Lkf/c;->e:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    sput-object v1, Lkf/c;->f:Lio/reactivex/subjects/PublishSubject;

    .line 57
    .line 58
    new-instance v1, Ljava/util/HashMap;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 62
    .line 63
    sput-object v1, Lkf/c;->g:Ljava/util/HashMap;

    .line 64
    .line 65
    new-instance v1, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 66
    .line 67
    .line 68
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    .line 69
    .line 70
    sput-object v1, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 71
    .line 72
    sget-object v1, Lcom/kubi/data/p;->a:Lcom/kubi/data/p;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/kubi/data/p;->i()Lcom/kubi/data/p$a;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    .line 79
    invoke-interface {v2}, Lcom/kubi/data/p$a;->d()Ljava/lang/String;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 84
    move-result v2

    .line 85
    .line 86
    const-string v3, ""

    .line 87
    .line 88
    if-nez v2, :cond_0

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/kubi/data/p;->i()Lcom/kubi/data/p$a;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-interface {v1}, Lcom/kubi/data/p$a;->e()Ljava/lang/String;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    sput-object v1, Lkf/c;->e:Ljava/lang/String;

    .line 99
    goto :goto_0

    .line 100
    .line 101
    :cond_0
    sget-object v1, Lkf/c;->b:Ly70/g;

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v3}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 109
    move-result v2

    .line 110
    .line 111
    if-nez v2, :cond_1

    .line 112
    .line 113
    sput-object v1, Lkf/c;->e:Ljava/lang/String;

    .line 114
    .line 115
    :cond_1
    :goto_0
    sget-object v1, Lkf/c;->a:Ly70/g;

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v3}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    .line 122
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 123
    move-result v2

    .line 124
    .line 125
    if-eqz v2, :cond_2

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lcom/kubi/sdk/BaseApplication;->get()Landroid/app/Application;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    const-string v2, "currency_unit.json"

    .line 132
    .line 133
    .line 134
    invoke-static {v1, v2}, Lcom/kubi/utils/y;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    :cond_2
    :try_start_0
    new-instance v2, Lkf/c$a;

    .line 138
    .line 139
    .line 140
    invoke-direct {v2}, Lkf/c$a;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 144
    move-result-object v2

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v2}, Lcom/kubi/utils/x;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 148
    move-result-object v2

    .line 149
    .line 150
    check-cast v2, Ljava/util/List;

    .line 151
    .line 152
    if-eqz v2, :cond_4

    .line 153
    .line 154
    sget-object v4, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentSkipListMap;->clear()V

    .line 158
    .line 159
    .line 160
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 161
    move-result-object v2

    .line 162
    .line 163
    .line 164
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    move-result v4

    .line 166
    .line 167
    if-eqz v4, :cond_4

    .line 168
    .line 169
    .line 170
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    move-result-object v4

    .line 172
    .line 173
    check-cast v4, Lcom/kubi/data/entity/FiatCurrencyEntity;

    .line 174
    .line 175
    if-eqz v4, :cond_3

    .line 176
    .line 177
    sget-object v5, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Lcom/kubi/data/entity/FiatCurrencyEntity;->getName()Ljava/lang/String;

    .line 181
    move-result-object v6

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v6, v4}, Ljava/util/concurrent/ConcurrentSkipListMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    goto :goto_1

    .line 186
    :catchall_0
    move-exception v2

    .line 187
    .line 188
    new-instance v4, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    const-string v5, "json error = "

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 200
    move-result-object v2

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    move-result-object v2

    .line 208
    .line 209
    .line 210
    invoke-static {v0, v2}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    :cond_4
    sget-object v2, Lkf/c;->c:Ly70/g;

    .line 213
    .line 214
    .line 215
    invoke-static {v2, v3}, Ly70/a;->h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    move-result-object v2

    .line 217
    .line 218
    .line 219
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 220
    move-result v1

    .line 221
    .line 222
    if-nez v1, :cond_5

    .line 223
    .line 224
    :try_start_1
    const-class v1, Lcom/kubi/data/rate/CurrencyPrice;

    .line 225
    .line 226
    .line 227
    invoke-static {v2, v1}, Lcom/kubi/utils/x;->b(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 228
    move-result-object v1

    .line 229
    .line 230
    check-cast v1, Lcom/kubi/data/rate/CurrencyPrice;

    .line 231
    .line 232
    if-eqz v1, :cond_5

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Lcom/kubi/data/rate/CurrencyPrice;->getCurrencyUnit()Ljava/lang/String;

    .line 236
    move-result-object v2

    .line 237
    .line 238
    sget-object v3, Lkf/c;->e:Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    move-result v2

    .line 243
    .line 244
    if-eqz v2, :cond_5

    .line 245
    .line 246
    sput-object v1, Lkf/c;->d:Lcom/kubi/data/rate/CurrencyPrice;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 247
    goto :goto_2

    .line 248
    :catch_0
    move-exception v1

    .line 249
    .line 250
    .line 251
    invoke-static {v1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v1, v0}, Lif/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 255
    :cond_5
    :goto_2
    return-void
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
.end method

.method public static a()Lio/reactivex/subjects/PublishSubject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lkf/c;->f:Lio/reactivex/subjects/PublishSubject;

    .line 3
    return-object v0
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

.method public static b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->keySet()Ljava/util/NavigableSet;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public static c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkf/c;->e:Ljava/lang/String;

    .line 3
    return-object v0
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

.method public static d()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lkf/c;->e:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkf/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-string v0, "- -"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentSkipListMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    check-cast p0, Lcom/kubi/data/entity/FiatCurrencyEntity;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/data/entity/FiatCurrencyEntity;->getSymbol()Ljava/lang/String;

    .line 14
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    return-object v0

    .line 18
    :cond_0
    return-object p0

    .line 19
    :catch_0
    return-object v0
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

.method public static f()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lkf/c;->d:Lcom/kubi/data/rate/CurrencyPrice;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/data/rate/CurrencyPrice;->getPrice()Ljava/util/HashMap;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public static g(Ljava/lang/String;)Ljava/lang/Double;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkf/c;->e:Ljava/lang/String;

    .line 3
    .line 4
    sget-object v1, Lkf/c;->d:Lcom/kubi/data/rate/CurrencyPrice;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/data/rate/CurrencyPrice;->getCurrencyUnit()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lkf/c;->d:Lcom/kubi/data/rate/CurrencyPrice;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/kubi/data/rate/CurrencyPrice;->getPrice()Ljava/util/HashMap;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    check-cast p0, Ljava/lang/Double;

    .line 27
    return-object p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return-object p0
    .line 30
    .line 31
.end method

.method public static h()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const-string v0, "USD"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 5
    .line 6
    const-class v2, Lzf/d;

    .line 7
    .line 8
    sget-object v3, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2, v3}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lzf/d;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Lzf/d;->a()Ljava/lang/String;

    .line 24
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object v0

    .line 26
    :catch_0
    move-exception v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0

    .line 29
    .line 30
    :goto_0
    const-string v2, "CurrencyConfig-initDefaultCurrency"

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lif/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 34
    return-object v0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkf/c;->e:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lkf/c;->b:Ly70/g;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p0}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 16
    .line 17
    sput-object p0, Lkf/c;->e:Ljava/lang/String;

    .line 18
    .line 19
    sget-object p0, Lkf/c;->d:Lcom/kubi/data/rate/CurrencyPrice;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/data/rate/CurrencyPrice;->getPrice()Ljava/util/HashMap;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    const-string v0, "USD"

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p0, Lkf/c;->f:Lio/reactivex/subjects/PublishSubject;

    .line 32
    .line 33
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 37
    const/4 p0, 0x1

    .line 38
    return p0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
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
.end method

.method public static j(Lcom/kubi/data/rate/CurrencyPrice;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/rate/CurrencyPrice;->getCurrencyUnit()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lkf/c;->e:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lkf/c;->c:Ly70/g;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lcom/kubi/utils/x;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 23
    .line 24
    sput-object p0, Lkf/c;->d:Lcom/kubi/data/rate/CurrencyPrice;

    .line 25
    .line 26
    sget-object p0, Lkf/c;->f:Lio/reactivex/subjects/PublishSubject;

    .line 27
    .line 28
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 32
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
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
.end method

.method public static k(Ljava/util/List;Lio/reactivex/functions/Consumer;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/FiatCurrencyEntity;",
            ">;",
            "Lio/reactivex/functions/Consumer<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->clear()V

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    check-cast v1, Lcom/kubi/data/entity/FiatCurrencyEntity;

    .line 30
    .line 31
    sget-object v2, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/kubi/data/entity/FiatCurrencyEntity;->getName()Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentSkipListMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    sget-object v0, Lkf/c;->a:Ly70/g;

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Lcom/kubi/utils/x;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p0}, Ly70/a;->p(Ly70/g;Ljava/lang/String;)Ly70/a;

    .line 49
    .line 50
    :try_start_0
    sget-object p0, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 51
    .line 52
    sget-object v0, Lkf/c;->e:Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    check-cast p0, Lcom/kubi/data/entity/FiatCurrencyEntity;

    .line 59
    .line 60
    if-nez p0, :cond_2

    .line 61
    .line 62
    sget-object p0, Lkf/c;->h:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentSkipListMap;->firstEntry()Ljava/util/Map$Entry;

    .line 66
    move-result-object p0

    .line 67
    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    move-result-object p0

    .line 73
    .line 74
    check-cast p0, Lcom/kubi/data/entity/FiatCurrencyEntity;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/kubi/data/entity/FiatCurrencyEntity;->getName()Ljava/lang/String;

    .line 78
    move-result-object p0

    .line 79
    .line 80
    sput-object p0, Lkf/c;->e:Ljava/lang/String;

    .line 81
    goto :goto_1

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-static {}, Lkf/c;->h()Ljava/lang/String;

    .line 85
    move-result-object p0

    .line 86
    .line 87
    sput-object p0, Lkf/c;->e:Ljava/lang/String;

    .line 88
    .line 89
    :goto_1
    sget-object p0, Lkf/c;->e:Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, Lkf/c;->i(Ljava/lang/String;)Z

    .line 93
    .line 94
    sget-object p0, Lkf/c;->e:Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, p0}, Lio/reactivex/functions/Consumer;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    return-void

    .line 99
    :catch_0
    move-exception p0

    .line 100
    .line 101
    new-instance p1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string/jumbo v0, "updateCurrencyUnit:"

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 114
    move-result-object p0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    move-result-object p0

    .line 122
    .line 123
    .line 124
    invoke-static {p0}, Lro/b;->d(Ljava/lang/String;)V

    .line 125
    :cond_2
    return-void
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
.end method
