.class public final Lcom/forter/mobile/fortersdk/t3$e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/forter/mobile/fortersdk/t3;->j(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/forter/mobile/fortersdk/t3$e;->b:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    .line 2
    const-string v0, "isMetered"

    .line 3
    .line 4
    const-string v1, "currentSSID"

    .line 5
    .line 6
    const-string v2, "app/network"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v3, "trafficStats"

    .line 10
    .line 11
    .line 12
    const-string/jumbo v4, "wifi"

    .line 13
    .line 14
    const-string v5, "networks"

    .line 15
    .line 16
    const-string v6, "app/network2"

    .line 17
    .line 18
    .line 19
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/b0;->a(Ljava/lang/String;)Lcom/forter/mobile/fortersdk/g;

    .line 20
    move-result-object v7

    .line 21
    .line 22
    const-string v8, "Failed generating event %s"

    .line 23
    .line 24
    const-string v9, "currentNetworkType"

    .line 25
    .line 26
    const-string v10, "proxy"

    .line 27
    .line 28
    const-string v11, "interfaces"

    .line 29
    .line 30
    if-eqz v7, :cond_4

    .line 31
    .line 32
    iget-object v7, v7, Lcom/forter/mobile/fortersdk/g;->c:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-static {v7}, Lcom/forter/mobile/fortersdk/b3;->f(Ljava/lang/String;)Z

    .line 36
    move-result v7

    .line 37
    .line 38
    if-eqz v7, :cond_4

    .line 39
    .line 40
    new-instance v0, Lcom/forter/mobile/fortersdk/q3;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    move-result-wide v1

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Lcom/forter/mobile/fortersdk/q3;-><init>(J)V

    .line 48
    .line 49
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/t3$e;->b:Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/b0;->b(Ljava/lang/String;)[Lcom/forter/mobile/fortersdk/h;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    if-eqz v2, :cond_c

    .line 56
    .line 57
    .line 58
    :try_start_0
    invoke-static {v2, v11}, Lcom/forter/mobile/fortersdk/b3;->h([Lcom/forter/mobile/fortersdk/h;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v5}, Lcom/forter/mobile/fortersdk/b3;->h([Lcom/forter/mobile/fortersdk/h;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 63
    move-result-object v12

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v4}, Lcom/forter/mobile/fortersdk/b3;->h([Lcom/forter/mobile/fortersdk/h;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 67
    move-result-object v13

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v10}, Lcom/forter/mobile/fortersdk/b3;->a([Lcom/forter/mobile/fortersdk/h;Ljava/lang/String;)Lcom/forter/mobile/fortersdk/h;

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v3}, Lcom/forter/mobile/fortersdk/b3;->a([Lcom/forter/mobile/fortersdk/h;Ljava/lang/String;)Lcom/forter/mobile/fortersdk/h;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    if-eqz v7, :cond_0

    .line 77
    .line 78
    iget-object v7, v0, Lcom/forter/mobile/fortersdk/q3;->b:Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lcom/forter/mobile/fortersdk/o2;->d()Lorg/json/JSONObject;

    .line 82
    move-result-object v10

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v1

    .line 88
    goto :goto_1

    .line 89
    .line 90
    :cond_0
    :goto_0
    if-eqz v12, :cond_1

    .line 91
    .line 92
    iget-object v7, v0, Lcom/forter/mobile/fortersdk/q3;->b:Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v12}, Lcom/forter/mobile/fortersdk/o2;->b(Landroid/content/Context;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    .line 96
    move-result-object v10

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v5, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    .line 101
    :cond_1
    if-eqz v13, :cond_2

    .line 102
    .line 103
    iget-object v5, v0, Lcom/forter/mobile/fortersdk/q3;->b:Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v13}, Lcom/forter/mobile/fortersdk/o2;->l(Landroid/content/Context;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 107
    move-result-object v7

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    :cond_2
    if-eqz v2, :cond_3

    .line 113
    .line 114
    .line 115
    invoke-static {}, Lcom/forter/mobile/fortersdk/o2;->k()Lorg/json/JSONObject;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    iget-object v4, v0, Lcom/forter/mobile/fortersdk/q3;->b:Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    :cond_3
    iget-object v2, v0, Lcom/forter/mobile/fortersdk/q3;->b:Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/a0;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 127
    move-result-object v1

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v9, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    goto/16 :goto_5

    .line 133
    .line 134
    .line 135
    :goto_1
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    .line 143
    invoke-static {v8, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    move-result-object v3

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v3, v1}, Lcom/forter/mobile/fortersdk/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    goto/16 :goto_5

    .line 154
    .line 155
    :cond_4
    new-instance v3, Lcom/forter/mobile/fortersdk/p3;

    .line 156
    .line 157
    .line 158
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 159
    move-result-wide v4

    .line 160
    .line 161
    .line 162
    invoke-direct {v3, v4, v5}, Lcom/forter/mobile/fortersdk/p3;-><init>(J)V

    .line 163
    .line 164
    iget-object v4, p0, Lcom/forter/mobile/fortersdk/t3$e;->b:Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    :try_start_1
    invoke-static {v2}, Lcom/forter/mobile/fortersdk/b0;->a(Ljava/lang/String;)Lcom/forter/mobile/fortersdk/g;

    .line 168
    move-result-object v5

    .line 169
    .line 170
    new-instance v6, Lcom/forter/mobile/fortersdk/f;

    .line 171
    .line 172
    .line 173
    invoke-direct {v6, v5}, Lcom/forter/mobile/fortersdk/f;-><init>(Lcom/forter/mobile/fortersdk/g;)V

    .line 174
    .line 175
    if-eqz v5, :cond_5

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5}, Lcom/forter/mobile/fortersdk/g;->a()Z

    .line 179
    move-result v5

    .line 180
    .line 181
    if-eqz v5, :cond_5

    .line 182
    .line 183
    goto/16 :goto_4

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    .line 186
    goto/16 :goto_3

    .line 187
    .line 188
    .line 189
    :cond_5
    invoke-virtual {v6, v10}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 190
    move-result v5

    .line 191
    .line 192
    if-eqz v5, :cond_7

    .line 193
    .line 194
    .line 195
    invoke-static {v4}, Lcom/forter/mobile/fortersdk/k2;->b(Landroid/content/Context;)[Ljava/lang/String;

    .line 196
    move-result-object v5

    .line 197
    .line 198
    if-eqz v5, :cond_7

    .line 199
    array-length v7, v5

    .line 200
    const/4 v12, 0x3

    .line 201
    const/4 v13, 0x1

    .line 202
    const/4 v14, 0x0

    .line 203
    .line 204
    if-ge v7, v12, :cond_6

    .line 205
    .line 206
    const-string v7, "%s:%s"

    .line 207
    .line 208
    aget-object v12, v5, v14

    .line 209
    .line 210
    aget-object v5, v5, v13

    .line 211
    .line 212
    .line 213
    filled-new-array {v12, v5}, [Ljava/lang/Object;

    .line 214
    move-result-object v5

    .line 215
    .line 216
    .line 217
    invoke-static {v7, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 218
    move-result-object v5

    .line 219
    goto :goto_2

    .line 220
    .line 221
    :cond_6
    const-string v7, "%s:%s|excl:%s"

    .line 222
    .line 223
    aget-object v12, v5, v14

    .line 224
    .line 225
    aget-object v13, v5, v13

    .line 226
    const/4 v14, 0x2

    .line 227
    .line 228
    aget-object v5, v5, v14

    .line 229
    .line 230
    .line 231
    filled-new-array {v12, v13, v5}, [Ljava/lang/Object;

    .line 232
    move-result-object v5

    .line 233
    .line 234
    .line 235
    invoke-static {v7, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 236
    move-result-object v5

    .line 237
    .line 238
    :goto_2
    iget-object v7, v3, Lcom/forter/mobile/fortersdk/p3;->b:Lorg/json/JSONObject;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7, v10, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 242
    .line 243
    .line 244
    :cond_7
    invoke-virtual {v6, v9}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 245
    move-result v5

    .line 246
    .line 247
    if-eqz v5, :cond_8

    .line 248
    .line 249
    iget-object v5, v3, Lcom/forter/mobile/fortersdk/p3;->b:Lorg/json/JSONObject;

    .line 250
    .line 251
    .line 252
    invoke-static {v4}, Lcom/forter/mobile/fortersdk/k2;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 253
    move-result-object v7

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 257
    .line 258
    .line 259
    :cond_8
    invoke-virtual {v6, v1}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 260
    move-result v5

    .line 261
    .line 262
    if-eqz v5, :cond_9

    .line 263
    .line 264
    iget-object v5, v3, Lcom/forter/mobile/fortersdk/p3;->b:Lorg/json/JSONObject;

    .line 265
    .line 266
    .line 267
    invoke-static {v4}, Lcom/forter/mobile/fortersdk/k2;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 268
    move-result-object v7

    .line 269
    .line 270
    .line 271
    invoke-virtual {v5, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 272
    .line 273
    .line 274
    :cond_9
    invoke-virtual {v6, v0}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 275
    move-result v1

    .line 276
    .line 277
    if-eqz v1, :cond_a

    .line 278
    .line 279
    iget-object v1, v3, Lcom/forter/mobile/fortersdk/p3;->b:Lorg/json/JSONObject;

    .line 280
    .line 281
    .line 282
    invoke-static {v4}, Lcom/forter/mobile/fortersdk/k2;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 283
    move-result-object v4

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 287
    .line 288
    .line 289
    :cond_a
    invoke-virtual {v6, v11}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 290
    move-result v0

    .line 291
    .line 292
    if-eqz v0, :cond_b

    .line 293
    .line 294
    iget-object v0, v3, Lcom/forter/mobile/fortersdk/p3;->b:Lorg/json/JSONObject;

    .line 295
    .line 296
    .line 297
    invoke-static {}, Lcom/forter/mobile/fortersdk/k2;->a()Lorg/json/JSONObject;

    .line 298
    move-result-object v1

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v11, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 302
    goto :goto_4

    .line 303
    .line 304
    .line 305
    :goto_3
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    .line 306
    move-result-object v1

    .line 307
    .line 308
    .line 309
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 310
    move-result-object v2

    .line 311
    .line 312
    .line 313
    invoke-static {v8, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 314
    move-result-object v2

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 318
    move-result-object v0

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, v2, v0}, Lcom/forter/mobile/fortersdk/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    :cond_b
    :goto_4
    move-object v0, v3

    .line 323
    .line 324
    .line 325
    :cond_c
    :goto_5
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    .line 326
    move-result-object v1

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1, v0}, Lcom/forter/mobile/fortersdk/b;->k(Lcom/forter/mobile/fortersdk/v3;)Z

    .line 330
    return-void
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
