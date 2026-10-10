.class public abstract Lcom/forter/mobile/fortersdk/i0;
.super Ljava/lang/Object;


# static fields
.field public static a:I = -0x1


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

.method public static a()Ljava/lang/String;
    .locals 11
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "generic"

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "unknown"

    .line 6
    .line 7
    const-string v2, "sdk"

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/i0;->b()Z

    .line 11
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    const-string/jumbo v4, "true"

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    return-object v4

    .line 18
    .line 19
    :cond_0
    :try_start_1
    sget v3, Lcom/forter/mobile/fortersdk/i0;->a:I

    .line 20
    .line 21
    if-gez v3, :cond_f

    .line 22
    .line 23
    sget-object v3, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 28
    .line 29
    .line 30
    const-string/jumbo v6, "vbox86p"

    .line 31
    .line 32
    const-string v7, "google_sdk"

    .line 33
    .line 34
    const-string v8, "remix_x86_64"

    .line 35
    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    .line 39
    :try_start_2
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    move-result v5

    .line 41
    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    const-string v5, "sdk_google_phone_x86"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    move-result v5

    .line 49
    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    const-string v5, "sdk_x86"

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    move-result v5

    .line 57
    .line 58
    if-nez v5, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    move-result v5

    .line 63
    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    move-result v5

    .line 69
    .line 70
    if-nez v5, :cond_2

    .line 71
    .line 72
    const-string v5, "gce_x86_phone"

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    move-result v3

    .line 77
    .line 78
    if-eqz v3, :cond_1

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/4 v3, 0x0

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 83
    .line 84
    :goto_1
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    move-result v9

    .line 89
    .line 90
    if-nez v9, :cond_3

    .line 91
    .line 92
    const-string v9, "Genymotion"

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    move-result v5

    .line 97
    .line 98
    if-eqz v5, :cond_4

    .line 99
    .line 100
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    :cond_4
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 107
    .line 108
    const-string v10, "generic_x86"

    .line 109
    .line 110
    if-nez v9, :cond_5

    .line 111
    .line 112
    .line 113
    :try_start_3
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    move-result v9

    .line 115
    .line 116
    if-nez v9, :cond_5

    .line 117
    .line 118
    const-string v9, "Jide"

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    move-result v5

    .line 123
    .line 124
    if-eqz v5, :cond_6

    .line 125
    .line 126
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    :cond_6
    sget-object v5, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 133
    .line 134
    const-string v9, "gce_x86"

    .line 135
    .line 136
    if-nez v0, :cond_7

    .line 137
    .line 138
    .line 139
    :try_start_4
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    move-result v0

    .line 141
    .line 142
    if-nez v0, :cond_7

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    move-result v0

    .line 147
    .line 148
    if-nez v0, :cond_7

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    move-result v0

    .line 153
    .line 154
    if-nez v0, :cond_7

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    move-result v0

    .line 159
    .line 160
    if-eqz v0, :cond_8

    .line 161
    .line 162
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    :cond_8
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    move-result v2

    .line 169
    .line 170
    if-nez v2, :cond_9

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    move-result v2

    .line 175
    .line 176
    if-nez v2, :cond_9

    .line 177
    .line 178
    const-string v2, "Android SDK built for x86"

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    move-result v2

    .line 183
    .line 184
    if-nez v2, :cond_9

    .line 185
    .line 186
    const-string v2, "GCE x86 phone"

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    move-result v0

    .line 191
    .line 192
    if-eqz v0, :cond_a

    .line 193
    .line 194
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 195
    .line 196
    :cond_a
    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 197
    .line 198
    const-string v2, "goldfish"

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    move-result v2

    .line 203
    .line 204
    if-nez v2, :cond_b

    .line 205
    .line 206
    .line 207
    const-string/jumbo v2, "vbox86"

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    move-result v2

    .line 212
    .line 213
    if-nez v2, :cond_b

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    move-result v2

    .line 218
    .line 219
    if-nez v2, :cond_b

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    move-result v0

    .line 224
    .line 225
    if-eqz v0, :cond_c

    .line 226
    .line 227
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 228
    .line 229
    :cond_c
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 230
    .line 231
    const-string v2, "generic/sdk/generic"

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 235
    move-result v2

    .line 236
    .line 237
    if-nez v2, :cond_d

    .line 238
    .line 239
    const-string v2, "generic_x86/sdk_x86/generic_x86"

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 243
    move-result v2

    .line 244
    .line 245
    if-nez v2, :cond_d

    .line 246
    .line 247
    const-string v2, "generic/google_sdk/generic"

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 251
    move-result v2

    .line 252
    .line 253
    if-nez v2, :cond_d

    .line 254
    .line 255
    const-string v2, "Android/sdk_google_phone_x86/generic_x86"

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 259
    move-result v2

    .line 260
    .line 261
    if-nez v2, :cond_d

    .line 262
    .line 263
    const-string v2, "generic/vbox86p/vbox86p"

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 267
    move-result v2

    .line 268
    .line 269
    if-nez v2, :cond_d

    .line 270
    .line 271
    const-string v2, "generic/gce_x86_phone/gce_x86"

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 275
    move-result v2

    .line 276
    .line 277
    if-nez v2, :cond_d

    .line 278
    .line 279
    const-string v2, "Jide/remix_x86_64/remix_x86_64:6.0.1"

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 283
    move-result v0

    .line 284
    .line 285
    if-eqz v0, :cond_e

    .line 286
    .line 287
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 288
    .line 289
    :cond_e
    sput v3, Lcom/forter/mobile/fortersdk/i0;->a:I

    .line 290
    .line 291
    :cond_f
    sget v0, Lcom/forter/mobile/fortersdk/i0;->a:I

    .line 292
    const/4 v2, 0x4

    .line 293
    .line 294
    if-le v0, v2, :cond_10

    .line 295
    return-object v4

    .line 296
    .line 297
    :cond_10
    const-string v0, "false"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 298
    return-object v0

    .line 299
    :catch_0
    return-object v1
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

.method public static b()Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HardwareIds"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "Nox"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "4.4.2"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    move-result v2

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "xiaomi"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 27
    .line 28
    const-string v3, "Lenovo"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    sget-object v2, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 40
    move-result v2

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    sget-object v2, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 48
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    const/4 v0, 0x1

    .line 52
    return v0

    .line 53
    :catch_0
    :cond_0
    return v1
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
