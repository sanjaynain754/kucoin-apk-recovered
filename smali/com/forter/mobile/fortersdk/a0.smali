.class public final Lcom/forter/mobile/fortersdk/a0;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;)Landroid/net/NetworkInfo;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "connectivity"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
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

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 11
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    const-string v0, "connectivity"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 9
    .line 10
    if-eqz p0, :cond_e

    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 16
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    const-string v2, "VPN"

    .line 19
    .line 20
    const-string v3, "Ethernet"

    .line 21
    .line 22
    const-string v4, "Bluetooth"

    .line 23
    .line 24
    const-string v5, "WiFi"

    .line 25
    const/4 v6, 0x1

    .line 26
    .line 27
    const-string v7, "Mobile"

    .line 28
    .line 29
    const-string v8, "Offline"

    .line 30
    .line 31
    if-eqz v1, :cond_8

    .line 32
    .line 33
    .line 34
    :try_start_1
    invoke-virtual {p0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    if-eqz v1, :cond_8

    .line 38
    .line 39
    const/16 v9, 0xc

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v9}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 43
    move-result v9

    .line 44
    .line 45
    if-nez v9, :cond_0

    .line 46
    return-object v8

    .line 47
    .line 48
    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 52
    const/4 v10, 0x0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v10}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 56
    move-result v10

    .line 57
    .line 58
    if-eqz v10, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v1, v6}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 65
    move-result v10

    .line 66
    .line 67
    if-eqz v10, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_2
    const/4 v10, 0x2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v10}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 75
    move-result v10

    .line 76
    .line 77
    if-eqz v10, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_3
    const/4 v10, 0x3

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v10}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 85
    move-result v10

    .line 86
    .line 87
    if-eqz v10, :cond_4

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    :cond_4
    const/4 v10, 0x4

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v10}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 95
    move-result v10

    .line 96
    .line 97
    if-eqz v10, :cond_5

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    :cond_5
    const/16 v10, 0x1a

    .line 103
    .line 104
    if-lt v0, v10, :cond_6

    .line 105
    const/4 v10, 0x5

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v10}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 109
    move-result v10

    .line 110
    .line 111
    if-eqz v10, :cond_6

    .line 112
    .line 113
    const-string v10, "WiFiAware"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    :cond_6
    const/16 v10, 0x1b

    .line 119
    .line 120
    if-lt v0, v10, :cond_7

    .line 121
    const/4 v0, 0x6

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    const-string v0, "LoWPAN"

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_7
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 136
    move-result v0

    .line 137
    .line 138
    if-lez v0, :cond_8

    .line 139
    .line 140
    const-string p0, "_"

    .line 141
    .line 142
    .line 143
    invoke-static {p0, v9}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    .line 147
    .line 148
    :cond_8
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 149
    move-result-object p0

    .line 150
    .line 151
    if-eqz p0, :cond_d

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 155
    move-result v0

    .line 156
    .line 157
    if-eqz v0, :cond_d

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    .line 161
    move-result v0

    .line 162
    .line 163
    if-nez v0, :cond_9

    .line 164
    return-object v7

    .line 165
    .line 166
    .line 167
    :cond_9
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    .line 168
    move-result v0

    .line 169
    .line 170
    if-ne v0, v6, :cond_a

    .line 171
    return-object v5

    .line 172
    .line 173
    .line 174
    :cond_a
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    .line 175
    move-result v0

    .line 176
    const/4 v1, 0x7

    .line 177
    .line 178
    if-ne v0, v1, :cond_b

    .line 179
    return-object v4

    .line 180
    .line 181
    .line 182
    :cond_b
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    .line 183
    move-result v0

    .line 184
    .line 185
    const/16 v1, 0x9

    .line 186
    .line 187
    if-ne v0, v1, :cond_c

    .line 188
    return-object v3

    .line 189
    .line 190
    .line 191
    :cond_c
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    .line 192
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 193
    .line 194
    const/16 v0, 0x11

    .line 195
    .line 196
    if-ne p0, v0, :cond_d

    .line 197
    return-object v2

    .line 198
    :cond_d
    return-object v8

    .line 199
    .line 200
    :catch_0
    :cond_e
    const-string p0, "FAILURE"

    .line 201
    return-object p0
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
.end method
