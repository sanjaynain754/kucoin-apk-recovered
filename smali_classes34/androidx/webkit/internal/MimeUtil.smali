.class Landroidx/webkit/internal/MimeUtil;
.super Ljava/lang/Object;
.source "MimeUtil.java"


# direct methods
.method public constructor <init>()V
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
.end method

.method public static getMimeFromFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-static {p0}, Ljava/net/URLConnection;->guessContentTypeFromName(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    return-object v0

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-static {p0}, Landroidx/webkit/internal/MimeUtil;->guessHardcodedMime(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static guessHardcodedMime(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    const/16 v1, 0x2e

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 7
    move-result v2

    .line 8
    const/4 v3, -0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    return-object v4

    .line 13
    :cond_0
    add-int/2addr v2, v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 17
    move-result-object p0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 28
    move-result v2

    .line 29
    .line 30
    .line 31
    sparse-switch v2, :sswitch_data_0

    .line 32
    :goto_0
    move v0, v3

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    .line 37
    :sswitch_0
    const-string/jumbo v0, "xhtml"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    move-result p0

    .line 42
    .line 43
    if-nez p0, :cond_1

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    const/16 v0, 0x31

    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    .line 51
    :sswitch_1
    const-string/jumbo v0, "shtml"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    move-result p0

    .line 56
    .line 57
    if-nez p0, :cond_2

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :cond_2
    const/16 v0, 0x30

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    .line 65
    :sswitch_2
    const-string/jumbo v0, "pjpeg"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    move-result p0

    .line 70
    .line 71
    if-nez p0, :cond_3

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_3
    const/16 v0, 0x2f

    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :sswitch_3
    const-string v0, "mhtml"

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    move-result p0

    .line 83
    .line 84
    if-nez p0, :cond_4

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    move v0, v1

    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :sswitch_4
    const-string v0, "ehtml"

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result p0

    .line 95
    .line 96
    if-nez p0, :cond_5

    .line 97
    goto :goto_0

    .line 98
    .line 99
    :cond_5
    const/16 v0, 0x2d

    .line 100
    .line 101
    goto/16 :goto_1

    .line 102
    .line 103
    .line 104
    :sswitch_5
    const-string/jumbo v0, "xhtm"

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    move-result p0

    .line 109
    .line 110
    if-nez p0, :cond_6

    .line 111
    goto :goto_0

    .line 112
    .line 113
    :cond_6
    const/16 v0, 0x2c

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    .line 118
    :sswitch_6
    const-string/jumbo v0, "woff"

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    move-result p0

    .line 123
    .line 124
    if-nez p0, :cond_7

    .line 125
    goto :goto_0

    .line 126
    .line 127
    :cond_7
    const/16 v0, 0x2b

    .line 128
    .line 129
    goto/16 :goto_1

    .line 130
    .line 131
    .line 132
    :sswitch_7
    const-string/jumbo v0, "webp"

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    move-result p0

    .line 137
    .line 138
    if-nez p0, :cond_8

    .line 139
    goto :goto_0

    .line 140
    .line 141
    :cond_8
    const/16 v0, 0x2a

    .line 142
    .line 143
    goto/16 :goto_1

    .line 144
    .line 145
    .line 146
    :sswitch_8
    const-string/jumbo v0, "webm"

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    move-result p0

    .line 151
    .line 152
    if-nez p0, :cond_9

    .line 153
    goto :goto_0

    .line 154
    .line 155
    :cond_9
    const/16 v0, 0x29

    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    .line 160
    :sswitch_9
    const-string/jumbo v0, "wasm"

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    move-result p0

    .line 165
    .line 166
    if-nez p0, :cond_a

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_a
    const/16 v0, 0x28

    .line 171
    .line 172
    goto/16 :goto_1

    .line 173
    .line 174
    .line 175
    :sswitch_a
    const-string/jumbo v0, "tiff"

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    move-result p0

    .line 180
    .line 181
    if-nez p0, :cond_b

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_b
    const/16 v0, 0x27

    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    .line 190
    :sswitch_b
    const-string/jumbo v0, "svgz"

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    move-result p0

    .line 195
    .line 196
    if-nez p0, :cond_c

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_c
    const/16 v0, 0x26

    .line 201
    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    .line 205
    :sswitch_c
    const-string/jumbo v0, "shtm"

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    move-result p0

    .line 210
    .line 211
    if-nez p0, :cond_d

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_d
    const/16 v0, 0x25

    .line 216
    .line 217
    goto/16 :goto_1

    .line 218
    .line 219
    .line 220
    :sswitch_d
    const-string/jumbo v0, "opus"

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    move-result p0

    .line 225
    .line 226
    if-nez p0, :cond_e

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_e
    const/16 v0, 0x24

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :sswitch_e
    const-string v0, "mpeg"

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    move-result p0

    .line 239
    .line 240
    if-nez p0, :cond_f

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_f
    const/16 v0, 0x23

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :sswitch_f
    const-string v0, "json"

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    move-result p0

    .line 253
    .line 254
    if-nez p0, :cond_10

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_10
    const/16 v0, 0x22

    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :sswitch_10
    const-string v0, "jpeg"

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    move-result p0

    .line 267
    .line 268
    if-nez p0, :cond_11

    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_11
    const/16 v0, 0x21

    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :sswitch_11
    const-string v0, "jfif"

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    move-result p0

    .line 281
    .line 282
    if-nez p0, :cond_12

    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_12
    const/16 v0, 0x20

    .line 287
    .line 288
    goto/16 :goto_1

    .line 289
    .line 290
    :sswitch_12
    const-string v0, "html"

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    move-result p0

    .line 295
    .line 296
    if-nez p0, :cond_13

    .line 297
    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :cond_13
    const/16 v0, 0x1f

    .line 301
    .line 302
    goto/16 :goto_1

    .line 303
    .line 304
    :sswitch_13
    const-string v0, "flac"

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    move-result p0

    .line 309
    .line 310
    if-nez p0, :cond_14

    .line 311
    .line 312
    goto/16 :goto_0

    .line 313
    .line 314
    :cond_14
    const/16 v0, 0x1e

    .line 315
    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :sswitch_14
    const-string v0, "apng"

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 322
    move-result p0

    .line 323
    .line 324
    if-nez p0, :cond_15

    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :cond_15
    const/16 v0, 0x1d

    .line 329
    .line 330
    goto/16 :goto_1

    .line 331
    .line 332
    .line 333
    :sswitch_15
    const-string/jumbo v0, "zip"

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 337
    move-result p0

    .line 338
    .line 339
    if-nez p0, :cond_16

    .line 340
    .line 341
    goto/16 :goto_0

    .line 342
    .line 343
    :cond_16
    const/16 v0, 0x1c

    .line 344
    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    .line 348
    :sswitch_16
    const-string/jumbo v0, "xml"

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    move-result p0

    .line 353
    .line 354
    if-nez p0, :cond_17

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_17
    const/16 v0, 0x1b

    .line 359
    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    .line 363
    :sswitch_17
    const-string/jumbo v0, "xht"

    .line 364
    .line 365
    .line 366
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    move-result p0

    .line 368
    .line 369
    if-nez p0, :cond_18

    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_18
    const/16 v0, 0x1a

    .line 374
    .line 375
    goto/16 :goto_1

    .line 376
    .line 377
    .line 378
    :sswitch_18
    const-string/jumbo v0, "wav"

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    move-result p0

    .line 383
    .line 384
    if-nez p0, :cond_19

    .line 385
    .line 386
    goto/16 :goto_0

    .line 387
    .line 388
    :cond_19
    const/16 v0, 0x19

    .line 389
    .line 390
    goto/16 :goto_1

    .line 391
    .line 392
    .line 393
    :sswitch_19
    const-string/jumbo v0, "tif"

    .line 394
    .line 395
    .line 396
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    move-result p0

    .line 398
    .line 399
    if-nez p0, :cond_1a

    .line 400
    .line 401
    goto/16 :goto_0

    .line 402
    .line 403
    :cond_1a
    const/16 v0, 0x18

    .line 404
    .line 405
    goto/16 :goto_1

    .line 406
    .line 407
    .line 408
    :sswitch_1a
    const-string/jumbo v0, "tgz"

    .line 409
    .line 410
    .line 411
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    move-result p0

    .line 413
    .line 414
    if-nez p0, :cond_1b

    .line 415
    .line 416
    goto/16 :goto_0

    .line 417
    .line 418
    :cond_1b
    const/16 v0, 0x17

    .line 419
    .line 420
    goto/16 :goto_1

    .line 421
    .line 422
    .line 423
    :sswitch_1b
    const-string/jumbo v0, "svg"

    .line 424
    .line 425
    .line 426
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    move-result p0

    .line 428
    .line 429
    if-nez p0, :cond_1c

    .line 430
    .line 431
    goto/16 :goto_0

    .line 432
    .line 433
    :cond_1c
    const/16 v0, 0x16

    .line 434
    .line 435
    goto/16 :goto_1

    .line 436
    .line 437
    .line 438
    :sswitch_1c
    const-string/jumbo v0, "png"

    .line 439
    .line 440
    .line 441
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    move-result p0

    .line 443
    .line 444
    if-nez p0, :cond_1d

    .line 445
    .line 446
    goto/16 :goto_0

    .line 447
    .line 448
    :cond_1d
    const/16 v0, 0x15

    .line 449
    .line 450
    goto/16 :goto_1

    .line 451
    .line 452
    .line 453
    :sswitch_1d
    const-string/jumbo v0, "pjp"

    .line 454
    .line 455
    .line 456
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 457
    move-result p0

    .line 458
    .line 459
    if-nez p0, :cond_1e

    .line 460
    .line 461
    goto/16 :goto_0

    .line 462
    .line 463
    :cond_1e
    const/16 v0, 0x14

    .line 464
    .line 465
    goto/16 :goto_1

    .line 466
    .line 467
    .line 468
    :sswitch_1e
    const-string/jumbo v0, "pdf"

    .line 469
    .line 470
    .line 471
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    move-result p0

    .line 473
    .line 474
    if-nez p0, :cond_1f

    .line 475
    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :cond_1f
    const/16 v0, 0x13

    .line 479
    .line 480
    goto/16 :goto_1

    .line 481
    .line 482
    :sswitch_1f
    const-string v0, "ogv"

    .line 483
    .line 484
    .line 485
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 486
    move-result p0

    .line 487
    .line 488
    if-nez p0, :cond_20

    .line 489
    .line 490
    goto/16 :goto_0

    .line 491
    .line 492
    :cond_20
    const/16 v0, 0x12

    .line 493
    .line 494
    goto/16 :goto_1

    .line 495
    .line 496
    :sswitch_20
    const-string v0, "ogm"

    .line 497
    .line 498
    .line 499
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 500
    move-result p0

    .line 501
    .line 502
    if-nez p0, :cond_21

    .line 503
    .line 504
    goto/16 :goto_0

    .line 505
    .line 506
    :cond_21
    const/16 v0, 0x11

    .line 507
    .line 508
    goto/16 :goto_1

    .line 509
    .line 510
    :sswitch_21
    const-string v0, "ogg"

    .line 511
    .line 512
    .line 513
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 514
    move-result p0

    .line 515
    .line 516
    if-nez p0, :cond_22

    .line 517
    .line 518
    goto/16 :goto_0

    .line 519
    .line 520
    :cond_22
    const/16 v0, 0x10

    .line 521
    .line 522
    goto/16 :goto_1

    .line 523
    .line 524
    :sswitch_22
    const-string v0, "oga"

    .line 525
    .line 526
    .line 527
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    move-result p0

    .line 529
    .line 530
    if-nez p0, :cond_23

    .line 531
    .line 532
    goto/16 :goto_0

    .line 533
    .line 534
    :cond_23
    const/16 v0, 0xf

    .line 535
    .line 536
    goto/16 :goto_1

    .line 537
    .line 538
    :sswitch_23
    const-string v0, "mpg"

    .line 539
    .line 540
    .line 541
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 542
    move-result p0

    .line 543
    .line 544
    if-nez p0, :cond_24

    .line 545
    .line 546
    goto/16 :goto_0

    .line 547
    .line 548
    :cond_24
    const/16 v0, 0xe

    .line 549
    .line 550
    goto/16 :goto_1

    .line 551
    .line 552
    :sswitch_24
    const-string v0, "mp4"

    .line 553
    .line 554
    .line 555
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 556
    move-result p0

    .line 557
    .line 558
    if-nez p0, :cond_25

    .line 559
    .line 560
    goto/16 :goto_0

    .line 561
    .line 562
    :cond_25
    const/16 v0, 0xd

    .line 563
    .line 564
    goto/16 :goto_1

    .line 565
    .line 566
    :sswitch_25
    const-string v0, "mp3"

    .line 567
    .line 568
    .line 569
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 570
    move-result p0

    .line 571
    .line 572
    if-nez p0, :cond_26

    .line 573
    .line 574
    goto/16 :goto_0

    .line 575
    .line 576
    :cond_26
    const/16 v0, 0xc

    .line 577
    .line 578
    goto/16 :goto_1

    .line 579
    .line 580
    :sswitch_26
    const-string v0, "mjs"

    .line 581
    .line 582
    .line 583
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    move-result p0

    .line 585
    .line 586
    if-nez p0, :cond_27

    .line 587
    .line 588
    goto/16 :goto_0

    .line 589
    .line 590
    :cond_27
    const/16 v0, 0xb

    .line 591
    .line 592
    goto/16 :goto_1

    .line 593
    .line 594
    :sswitch_27
    const-string v0, "mht"

    .line 595
    .line 596
    .line 597
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    move-result p0

    .line 599
    .line 600
    if-nez p0, :cond_28

    .line 601
    .line 602
    goto/16 :goto_0

    .line 603
    .line 604
    :cond_28
    const/16 v0, 0xa

    .line 605
    .line 606
    goto/16 :goto_1

    .line 607
    .line 608
    :sswitch_28
    const-string v0, "m4v"

    .line 609
    .line 610
    .line 611
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    move-result p0

    .line 613
    .line 614
    if-nez p0, :cond_29

    .line 615
    .line 616
    goto/16 :goto_0

    .line 617
    .line 618
    :cond_29
    const/16 v0, 0x9

    .line 619
    .line 620
    goto/16 :goto_1

    .line 621
    .line 622
    :sswitch_29
    const-string v0, "m4a"

    .line 623
    .line 624
    .line 625
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 626
    move-result p0

    .line 627
    .line 628
    if-nez p0, :cond_2a

    .line 629
    .line 630
    goto/16 :goto_0

    .line 631
    .line 632
    :cond_2a
    const/16 v0, 0x8

    .line 633
    goto :goto_1

    .line 634
    .line 635
    :sswitch_2a
    const-string v0, "jpg"

    .line 636
    .line 637
    .line 638
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 639
    move-result p0

    .line 640
    .line 641
    if-nez p0, :cond_2b

    .line 642
    .line 643
    goto/16 :goto_0

    .line 644
    :cond_2b
    const/4 v0, 0x7

    .line 645
    goto :goto_1

    .line 646
    .line 647
    :sswitch_2b
    const-string v0, "ico"

    .line 648
    .line 649
    .line 650
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 651
    move-result p0

    .line 652
    .line 653
    if-nez p0, :cond_2c

    .line 654
    .line 655
    goto/16 :goto_0

    .line 656
    :cond_2c
    const/4 v0, 0x6

    .line 657
    goto :goto_1

    .line 658
    .line 659
    :sswitch_2c
    const-string v0, "htm"

    .line 660
    .line 661
    .line 662
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 663
    move-result p0

    .line 664
    .line 665
    if-nez p0, :cond_2d

    .line 666
    .line 667
    goto/16 :goto_0

    .line 668
    :cond_2d
    const/4 v0, 0x5

    .line 669
    goto :goto_1

    .line 670
    .line 671
    :sswitch_2d
    const-string v0, "gif"

    .line 672
    .line 673
    .line 674
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 675
    move-result p0

    .line 676
    .line 677
    if-nez p0, :cond_2e

    .line 678
    .line 679
    goto/16 :goto_0

    .line 680
    :cond_2e
    const/4 v0, 0x4

    .line 681
    goto :goto_1

    .line 682
    .line 683
    :sswitch_2e
    const-string v0, "css"

    .line 684
    .line 685
    .line 686
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 687
    move-result p0

    .line 688
    .line 689
    if-nez p0, :cond_2f

    .line 690
    .line 691
    goto/16 :goto_0

    .line 692
    :cond_2f
    const/4 v0, 0x3

    .line 693
    goto :goto_1

    .line 694
    .line 695
    :sswitch_2f
    const-string v0, "bmp"

    .line 696
    .line 697
    .line 698
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 699
    move-result p0

    .line 700
    .line 701
    if-nez p0, :cond_30

    .line 702
    .line 703
    goto/16 :goto_0

    .line 704
    :cond_30
    const/4 v0, 0x2

    .line 705
    goto :goto_1

    .line 706
    .line 707
    :sswitch_30
    const-string v1, "js"

    .line 708
    .line 709
    .line 710
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 711
    move-result p0

    .line 712
    .line 713
    if-nez p0, :cond_32

    .line 714
    .line 715
    goto/16 :goto_0

    .line 716
    .line 717
    :sswitch_31
    const-string v0, "gz"

    .line 718
    .line 719
    .line 720
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 721
    move-result p0

    .line 722
    .line 723
    if-nez p0, :cond_31

    .line 724
    .line 725
    goto/16 :goto_0

    .line 726
    :cond_31
    const/4 v0, 0x0

    .line 727
    .line 728
    .line 729
    :cond_32
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 730
    return-object v4

    .line 731
    .line 732
    :pswitch_0
    const-string p0, "application/font-woff"

    .line 733
    return-object p0

    .line 734
    .line 735
    :pswitch_1
    const-string p0, "image/webp"

    .line 736
    return-object p0

    .line 737
    .line 738
    .line 739
    :pswitch_2
    const-string/jumbo p0, "video/webm"

    .line 740
    return-object p0

    .line 741
    .line 742
    :pswitch_3
    const-string p0, "application/wasm"

    .line 743
    return-object p0

    .line 744
    .line 745
    :pswitch_4
    const-string p0, "application/json"

    .line 746
    return-object p0

    .line 747
    .line 748
    :pswitch_5
    const-string p0, "audio/flac"

    .line 749
    return-object p0

    .line 750
    .line 751
    :pswitch_6
    const-string p0, "image/apng"

    .line 752
    return-object p0

    .line 753
    .line 754
    :pswitch_7
    const-string p0, "application/zip"

    .line 755
    return-object p0

    .line 756
    .line 757
    .line 758
    :pswitch_8
    const-string/jumbo p0, "text/xml"

    .line 759
    return-object p0

    .line 760
    .line 761
    :pswitch_9
    const-string p0, "application/xhtml+xml"

    .line 762
    return-object p0

    .line 763
    .line 764
    :pswitch_a
    const-string p0, "audio/wav"

    .line 765
    return-object p0

    .line 766
    .line 767
    :pswitch_b
    const-string p0, "image/tiff"

    .line 768
    return-object p0

    .line 769
    .line 770
    :pswitch_c
    const-string p0, "image/svg+xml"

    .line 771
    return-object p0

    .line 772
    .line 773
    :pswitch_d
    const-string p0, "image/png"

    .line 774
    return-object p0

    .line 775
    .line 776
    :pswitch_e
    const-string p0, "application/pdf"

    .line 777
    return-object p0

    .line 778
    .line 779
    .line 780
    :pswitch_f
    const-string/jumbo p0, "video/ogg"

    .line 781
    return-object p0

    .line 782
    .line 783
    :pswitch_10
    const-string p0, "audio/ogg"

    .line 784
    return-object p0

    .line 785
    .line 786
    .line 787
    :pswitch_11
    const-string/jumbo p0, "video/mpeg"

    .line 788
    return-object p0

    .line 789
    .line 790
    :pswitch_12
    const-string p0, "audio/mpeg"

    .line 791
    return-object p0

    .line 792
    .line 793
    :pswitch_13
    const-string p0, "multipart/related"

    .line 794
    return-object p0

    .line 795
    .line 796
    .line 797
    :pswitch_14
    const-string/jumbo p0, "video/mp4"

    .line 798
    return-object p0

    .line 799
    .line 800
    :pswitch_15
    const-string p0, "audio/x-m4a"

    .line 801
    return-object p0

    .line 802
    .line 803
    :pswitch_16
    const-string p0, "image/jpeg"

    .line 804
    return-object p0

    .line 805
    .line 806
    :pswitch_17
    const-string p0, "image/x-icon"

    .line 807
    return-object p0

    .line 808
    .line 809
    .line 810
    :pswitch_18
    const-string/jumbo p0, "text/html"

    .line 811
    return-object p0

    .line 812
    .line 813
    :pswitch_19
    const-string p0, "image/gif"

    .line 814
    return-object p0

    .line 815
    .line 816
    .line 817
    :pswitch_1a
    const-string/jumbo p0, "text/css"

    .line 818
    return-object p0

    .line 819
    .line 820
    :pswitch_1b
    const-string p0, "image/bmp"

    .line 821
    return-object p0

    .line 822
    .line 823
    .line 824
    :pswitch_1c
    const-string/jumbo p0, "text/javascript"

    .line 825
    return-object p0

    .line 826
    .line 827
    :pswitch_1d
    const-string p0, "application/gzip"

    .line 828
    return-object p0

    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    :sswitch_data_0
    .sparse-switch
        0xcf3 -> :sswitch_31
        0xd49 -> :sswitch_30
        0x17d85 -> :sswitch_2f
        0x18203 -> :sswitch_2e
        0x18fc4 -> :sswitch_2d
        0x194e1 -> :sswitch_2c
        0x19695 -> :sswitch_2b
        0x19be1 -> :sswitch_2a
        0x19fda -> :sswitch_29
        0x19fef -> :sswitch_28
        0x1a639 -> :sswitch_27
        0x1a676 -> :sswitch_26
        0x1a6f0 -> :sswitch_25
        0x1a6f1 -> :sswitch_24
        0x1a724 -> :sswitch_23
        0x1ad89 -> :sswitch_22
        0x1ad8f -> :sswitch_21
        0x1ad95 -> :sswitch_20
        0x1ad9e -> :sswitch_1f
        0x1b0f2 -> :sswitch_1e
        0x1b1b6 -> :sswitch_1d
        0x1b229 -> :sswitch_1c
        0x1be64 -> :sswitch_1b
        0x1c067 -> :sswitch_1a
        0x1c091 -> :sswitch_19
        0x1caec -> :sswitch_18
        0x1cf84 -> :sswitch_17
        0x1d017 -> :sswitch_16
        0x1d721 -> :sswitch_15
        0x2dca28 -> :sswitch_14
        0x2fff68 -> :sswitch_13
        0x3107ab -> :sswitch_12
        0x31bb59 -> :sswitch_11
        0x31e068 -> :sswitch_10
        0x31ece8 -> :sswitch_f
        0x333d85 -> :sswitch_e
        0x34283f -> :sswitch_d
        0x35db8e -> :sswitch_c
        0x360e96 -> :sswitch_b
        0x3651f5 -> :sswitch_a
        0x3792a4 -> :sswitch_9
        0x379f99 -> :sswitch_8
        0x379f9c -> :sswitch_7
        0x37c598 -> :sswitch_6
        0x382169 -> :sswitch_5
        0x5c04d90 -> :sswitch_4
        0x6310998 -> :sswitch_3
        0x65c28d8 -> :sswitch_2
        0x685969e -> :sswitch_1
        0x6cc0c23 -> :sswitch_0
    .end sparse-switch

    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_1c
        :pswitch_12
        :pswitch_14
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_16
        :pswitch_d
        :pswitch_c
        :pswitch_1d
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_18
        :pswitch_16
        :pswitch_16
        :pswitch_4
        :pswitch_11
        :pswitch_10
        :pswitch_18
        :pswitch_c
        :pswitch_b
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_9
        :pswitch_18
        :pswitch_13
        :pswitch_16
        :pswitch_18
        :pswitch_9
    .end packed-switch
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method
