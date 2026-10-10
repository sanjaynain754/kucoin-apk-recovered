.class public final Lgi0/l;
.super Ljava/lang/Object;
.source "OAIDFactory.java"


# static fields
.field public static a:Lfi0/d;


# direct methods
.method public static a(Landroid/content/Context;)Lfi0/d;
    .locals 1

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    instance-of v0, p0, Landroid/app/Application;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lgi0/l;->a:Lfi0/d;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    return-object v0

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-static {p0}, Lgi0/l;->b(Landroid/content/Context;)Lfi0/d;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sput-object v0, Lgi0/l;->a:Lfi0/d;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lfi0/d;->a()Z

    .line 27
    move-result v0

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    new-instance p0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    const-string v0, "Manufacturer interface has been found: "

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    sget-object v0, Lgi0/l;->a:Lfi0/d;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Lfi0/e;->a(Ljava/lang/Object;)V

    .line 60
    .line 61
    sget-object p0, Lgi0/l;->a:Lfi0/d;

    .line 62
    return-object p0

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-static {p0}, Lgi0/l;->c(Landroid/content/Context;)Lfi0/d;

    .line 66
    move-result-object p0

    .line 67
    .line 68
    sput-object p0, Lgi0/l;->a:Lfi0/d;

    .line 69
    return-object p0
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public static b(Landroid/content/Context;)Lfi0/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lfi0/f;->h()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_f

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lfi0/f;->k()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lfi0/f;->i()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lgi0/i;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0}, Lgi0/i;-><init>(Landroid/content/Context;)V

    .line 26
    return-object v0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {}, Lfi0/f;->l()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    new-instance v0, Lgi0/k;

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p0}, Lgi0/k;-><init>(Landroid/content/Context;)V

    .line 38
    return-object v0

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-static {}, Lfi0/f;->q()Z

    .line 42
    move-result v0

    .line 43
    .line 44
    if-nez v0, :cond_e

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lfi0/f;->j()Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-nez v0, :cond_e

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lfi0/f;->b()Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-static {}, Lfi0/f;->o()Z

    .line 62
    move-result v0

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    new-instance v0, Lgi0/o;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, p0}, Lgi0/o;-><init>(Landroid/content/Context;)V

    .line 70
    return-object v0

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-static {}, Lfi0/f;->p()Z

    .line 74
    move-result v0

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    new-instance v0, Lgi0/p;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, p0}, Lgi0/p;-><init>(Landroid/content/Context;)V

    .line 82
    return-object v0

    .line 83
    .line 84
    .line 85
    :cond_5
    invoke-static {}, Lfi0/f;->a()Z

    .line 86
    move-result v0

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    new-instance v0, Lgi0/a;

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, p0}, Lgi0/a;-><init>(Landroid/content/Context;)V

    .line 94
    return-object v0

    .line 95
    .line 96
    .line 97
    :cond_6
    invoke-static {}, Lfi0/f;->g()Z

    .line 98
    move-result v0

    .line 99
    .line 100
    if-nez v0, :cond_d

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lfi0/f;->e()Z

    .line 104
    move-result v0

    .line 105
    .line 106
    if-eqz v0, :cond_7

    .line 107
    goto :goto_1

    .line 108
    .line 109
    .line 110
    :cond_7
    invoke-static {}, Lfi0/f;->n()Z

    .line 111
    move-result v0

    .line 112
    .line 113
    if-nez v0, :cond_c

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lfi0/f;->m()Z

    .line 117
    move-result v0

    .line 118
    .line 119
    if-eqz v0, :cond_8

    .line 120
    goto :goto_0

    .line 121
    .line 122
    .line 123
    :cond_8
    invoke-static {p0}, Lfi0/f;->c(Landroid/content/Context;)Z

    .line 124
    move-result v0

    .line 125
    .line 126
    if-eqz v0, :cond_9

    .line 127
    .line 128
    new-instance v0, Lgi0/b;

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, p0}, Lgi0/b;-><init>(Landroid/content/Context;)V

    .line 132
    return-object v0

    .line 133
    .line 134
    .line 135
    :cond_9
    invoke-static {}, Lfi0/f;->d()Z

    .line 136
    move-result v0

    .line 137
    .line 138
    if-eqz v0, :cond_a

    .line 139
    .line 140
    new-instance v0, Lgi0/c;

    .line 141
    .line 142
    .line 143
    invoke-direct {v0, p0}, Lgi0/c;-><init>(Landroid/content/Context;)V

    .line 144
    return-object v0

    .line 145
    .line 146
    .line 147
    :cond_a
    invoke-static {}, Lfi0/f;->f()Z

    .line 148
    move-result v0

    .line 149
    .line 150
    if-eqz v0, :cond_b

    .line 151
    .line 152
    new-instance v0, Lgi0/e;

    .line 153
    .line 154
    .line 155
    invoke-direct {v0, p0}, Lgi0/e;-><init>(Landroid/content/Context;)V

    .line 156
    return-object v0

    .line 157
    :cond_b
    const/4 p0, 0x0

    .line 158
    return-object p0

    .line 159
    .line 160
    :cond_c
    :goto_0
    new-instance v0, Lgi0/n;

    .line 161
    .line 162
    .line 163
    invoke-direct {v0, p0}, Lgi0/n;-><init>(Landroid/content/Context;)V

    .line 164
    return-object v0

    .line 165
    .line 166
    :cond_d
    :goto_1
    new-instance v0, Lgi0/g;

    .line 167
    .line 168
    .line 169
    invoke-direct {v0, p0}, Lgi0/g;-><init>(Landroid/content/Context;)V

    .line 170
    return-object v0

    .line 171
    .line 172
    :cond_e
    :goto_2
    new-instance v0, Lgi0/q;

    .line 173
    .line 174
    .line 175
    invoke-direct {v0, p0}, Lgi0/q;-><init>(Landroid/content/Context;)V

    .line 176
    return-object v0

    .line 177
    .line 178
    :cond_f
    :goto_3
    new-instance v0, Lgi0/h;

    .line 179
    .line 180
    .line 181
    invoke-direct {v0, p0}, Lgi0/h;-><init>(Landroid/content/Context;)V

    .line 182
    return-object v0
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
.end method

.method public static c(Landroid/content/Context;)Lfi0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lgi0/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lgi0/j;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lfi0/d;->a()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance p0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const-string v1, "Mobile Security Alliance has been found: "

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-class v1, Lgi0/j;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Lfi0/e;->a(Ljava/lang/Object;)V

    .line 38
    return-object v0

    .line 39
    .line 40
    :cond_0
    new-instance v0, Lgi0/f;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, p0}, Lgi0/f;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Lfi0/d;->a()Z

    .line 47
    move-result p0

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    new-instance p0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    const-string v1, "Google Play Service has been found: "

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-class v1, Lgi0/f;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    move-result-object p0

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Lfi0/e;->a(Ljava/lang/Object;)V

    .line 76
    return-object v0

    .line 77
    .line 78
    :cond_1
    new-instance p0, Lgi0/d;

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, Lgi0/d;-><init>()V

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    const-string v1, "OAID/AAID was not supported: "

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-class v1, Lgi0/d;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lfi0/e;->a(Ljava/lang/Object;)V

    .line 108
    return-object p0
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
.end method
