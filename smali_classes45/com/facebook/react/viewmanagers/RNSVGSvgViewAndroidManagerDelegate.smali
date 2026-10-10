.class public Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSVGSvgViewAndroidManagerDelegate.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U:",
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "TT;+",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        ">;:",
        "Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface<",
        "TT;>;>",
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate<",
        "TT;TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

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
.end method


# virtual methods
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 5
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, -0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v4

    .line 12
    .line 13
    .line 14
    sparse-switch v4, :sswitch_data_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :sswitch_0
    const-string v4, "borderStartColor"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v4

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    const/16 v3, 0x2f

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :sswitch_1
    const-string v4, "nextFocusRight"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v4

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const/16 v3, 0x2e

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :sswitch_2
    const-string v4, "meetOrSlice"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result v4

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_2
    const/16 v3, 0x2d

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :sswitch_3
    const-string v4, "nativeBackgroundAndroid"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result v4

    .line 65
    .line 66
    if-nez v4, :cond_3

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :cond_3
    const/16 v3, 0x2c

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :sswitch_4
    const-string v4, "borderEndEndRadius"

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    move-result v4

    .line 79
    .line 80
    if-nez v4, :cond_4

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :cond_4
    const/16 v3, 0x2b

    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :sswitch_5
    const-string v4, "needsOffscreenAlphaCompositing"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    move-result v4

    .line 93
    .line 94
    if-nez v4, :cond_5

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :cond_5
    const/16 v3, 0x2a

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :sswitch_6
    const-string v4, "focusable"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v4

    .line 107
    .line 108
    if-nez v4, :cond_6

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :cond_6
    const/16 v3, 0x29

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :sswitch_7
    const-string v4, "borderRadius"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    move-result v4

    .line 121
    .line 122
    if-nez v4, :cond_7

    .line 123
    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    :cond_7
    const/16 v3, 0x28

    .line 127
    .line 128
    goto/16 :goto_0

    .line 129
    .line 130
    :sswitch_8
    const-string v4, "borderEndColor"

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    move-result v4

    .line 135
    .line 136
    if-nez v4, :cond_8

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_8
    const/16 v3, 0x27

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :sswitch_9
    const-string v4, "hitSlop"

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    move-result v4

    .line 149
    .line 150
    if-nez v4, :cond_9

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_9
    const/16 v3, 0x26

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :sswitch_a
    const-string v4, "borderEndStartRadius"

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    move-result v4

    .line 163
    .line 164
    if-nez v4, :cond_a

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_a
    const/16 v3, 0x25

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :sswitch_b
    const-string v4, "borderBlockEndColor"

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    move-result v4

    .line 177
    .line 178
    if-nez v4, :cond_b

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_b
    const/16 v3, 0x24

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :sswitch_c
    const-string v4, "borderStyle"

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    move-result v4

    .line 191
    .line 192
    if-nez v4, :cond_c

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_c
    const/16 v3, 0x23

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :sswitch_d
    const-string v4, "borderColor"

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    move-result v4

    .line 205
    .line 206
    if-nez v4, :cond_d

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_d
    const/16 v3, 0x22

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :sswitch_e
    const-string v4, "borderBlockColor"

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    move-result v4

    .line 219
    .line 220
    if-nez v4, :cond_e

    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_e
    const/16 v3, 0x21

    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :sswitch_f
    const-string v4, "nextFocusUp"

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    move-result v4

    .line 233
    .line 234
    if-nez v4, :cond_f

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_f
    const/16 v3, 0x20

    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :sswitch_10
    const-string v4, "borderBottomRightRadius"

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    move-result v4

    .line 247
    .line 248
    if-nez v4, :cond_10

    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :cond_10
    const/16 v3, 0x1f

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :sswitch_11
    const-string v4, "borderBottomLeftRadius"

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    move-result v4

    .line 261
    .line 262
    if-nez v4, :cond_11

    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_11
    const/16 v3, 0x1e

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :sswitch_12
    const-string v4, "nextFocusForward"

    .line 271
    .line 272
    .line 273
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    move-result v4

    .line 275
    .line 276
    if-nez v4, :cond_12

    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_12
    const/16 v3, 0x1d

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :sswitch_13
    const-string v4, "borderTopRightRadius"

    .line 285
    .line 286
    .line 287
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    move-result v4

    .line 289
    .line 290
    if-nez v4, :cond_13

    .line 291
    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :cond_13
    const/16 v3, 0x1c

    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :sswitch_14
    const-string v4, "borderBlockStartColor"

    .line 299
    .line 300
    .line 301
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    move-result v4

    .line 303
    .line 304
    if-nez v4, :cond_14

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_14
    const/16 v3, 0x1b

    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    .line 313
    :sswitch_15
    const-string/jumbo v4, "vbWidth"

    .line 314
    .line 315
    .line 316
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    move-result v4

    .line 318
    .line 319
    if-nez v4, :cond_15

    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :cond_15
    const/16 v3, 0x1a

    .line 324
    .line 325
    goto/16 :goto_0

    .line 326
    .line 327
    :sswitch_16
    const-string v4, "color"

    .line 328
    .line 329
    .line 330
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 331
    move-result v4

    .line 332
    .line 333
    if-nez v4, :cond_16

    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :cond_16
    const/16 v3, 0x19

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :sswitch_17
    const-string v4, "align"

    .line 342
    .line 343
    .line 344
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    move-result v4

    .line 346
    .line 347
    if-nez v4, :cond_17

    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_17
    const/16 v3, 0x18

    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :sswitch_18
    const-string v4, "minY"

    .line 356
    .line 357
    .line 358
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    move-result v4

    .line 360
    .line 361
    if-nez v4, :cond_18

    .line 362
    .line 363
    goto/16 :goto_0

    .line 364
    .line 365
    :cond_18
    const/16 v3, 0x17

    .line 366
    .line 367
    goto/16 :goto_0

    .line 368
    .line 369
    :sswitch_19
    const-string v4, "minX"

    .line 370
    .line 371
    .line 372
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    move-result v4

    .line 374
    .line 375
    if-nez v4, :cond_19

    .line 376
    .line 377
    goto/16 :goto_0

    .line 378
    .line 379
    :cond_19
    const/16 v3, 0x16

    .line 380
    .line 381
    goto/16 :goto_0

    .line 382
    .line 383
    :sswitch_1a
    const-string v4, "borderStartStartRadius"

    .line 384
    .line 385
    .line 386
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 387
    move-result v4

    .line 388
    .line 389
    if-nez v4, :cond_1a

    .line 390
    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_1a
    const/16 v3, 0x15

    .line 394
    .line 395
    goto/16 :goto_0

    .line 396
    .line 397
    :sswitch_1b
    const-string v4, "nativeForegroundAndroid"

    .line 398
    .line 399
    .line 400
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 401
    move-result v4

    .line 402
    .line 403
    if-nez v4, :cond_1b

    .line 404
    .line 405
    goto/16 :goto_0

    .line 406
    .line 407
    :cond_1b
    const/16 v3, 0x14

    .line 408
    .line 409
    goto/16 :goto_0

    .line 410
    .line 411
    :sswitch_1c
    const-string v4, "borderBottomEndRadius"

    .line 412
    .line 413
    .line 414
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    move-result v4

    .line 416
    .line 417
    if-nez v4, :cond_1c

    .line 418
    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :cond_1c
    const/16 v3, 0x13

    .line 422
    .line 423
    goto/16 :goto_0

    .line 424
    .line 425
    :sswitch_1d
    const-string v4, "borderStartEndRadius"

    .line 426
    .line 427
    .line 428
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    move-result v4

    .line 430
    .line 431
    if-nez v4, :cond_1d

    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :cond_1d
    const/16 v3, 0x12

    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :sswitch_1e
    const-string v4, "borderLeftColor"

    .line 440
    .line 441
    .line 442
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    move-result v4

    .line 444
    .line 445
    if-nez v4, :cond_1e

    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :cond_1e
    const/16 v3, 0x11

    .line 450
    .line 451
    goto/16 :goto_0

    .line 452
    .line 453
    .line 454
    :sswitch_1f
    const-string/jumbo v4, "removeClippedSubviews"

    .line 455
    .line 456
    .line 457
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    move-result v4

    .line 459
    .line 460
    if-nez v4, :cond_1f

    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :cond_1f
    const/16 v3, 0x10

    .line 465
    .line 466
    goto/16 :goto_0

    .line 467
    .line 468
    .line 469
    :sswitch_20
    const-string/jumbo v4, "pointerEvents"

    .line 470
    .line 471
    .line 472
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    move-result v4

    .line 474
    .line 475
    if-nez v4, :cond_20

    .line 476
    .line 477
    goto/16 :goto_0

    .line 478
    .line 479
    :cond_20
    const/16 v3, 0xf

    .line 480
    .line 481
    goto/16 :goto_0

    .line 482
    .line 483
    :sswitch_21
    const-string v4, "bbWidth"

    .line 484
    .line 485
    .line 486
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    move-result v4

    .line 488
    .line 489
    if-nez v4, :cond_21

    .line 490
    .line 491
    goto/16 :goto_0

    .line 492
    .line 493
    :cond_21
    const/16 v3, 0xe

    .line 494
    .line 495
    goto/16 :goto_0

    .line 496
    .line 497
    :sswitch_22
    const-string v4, "borderTopEndRadius"

    .line 498
    .line 499
    .line 500
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    move-result v4

    .line 502
    .line 503
    if-nez v4, :cond_22

    .line 504
    .line 505
    goto/16 :goto_0

    .line 506
    .line 507
    :cond_22
    const/16 v3, 0xd

    .line 508
    .line 509
    goto/16 :goto_0

    .line 510
    .line 511
    :sswitch_23
    const-string v4, "nextFocusLeft"

    .line 512
    .line 513
    .line 514
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    move-result v4

    .line 516
    .line 517
    if-nez v4, :cond_23

    .line 518
    .line 519
    goto/16 :goto_0

    .line 520
    .line 521
    :cond_23
    const/16 v3, 0xc

    .line 522
    .line 523
    goto/16 :goto_0

    .line 524
    .line 525
    :sswitch_24
    const-string v4, "nextFocusDown"

    .line 526
    .line 527
    .line 528
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 529
    move-result v4

    .line 530
    .line 531
    if-nez v4, :cond_24

    .line 532
    .line 533
    goto/16 :goto_0

    .line 534
    .line 535
    :cond_24
    const/16 v3, 0xb

    .line 536
    .line 537
    goto/16 :goto_0

    .line 538
    .line 539
    :sswitch_25
    const-string v4, "hasTVPreferredFocus"

    .line 540
    .line 541
    .line 542
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 543
    move-result v4

    .line 544
    .line 545
    if-nez v4, :cond_25

    .line 546
    .line 547
    goto/16 :goto_0

    .line 548
    .line 549
    :cond_25
    const/16 v3, 0xa

    .line 550
    .line 551
    goto/16 :goto_0

    .line 552
    .line 553
    :sswitch_26
    const-string v4, "borderBottomStartRadius"

    .line 554
    .line 555
    .line 556
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    move-result v4

    .line 558
    .line 559
    if-nez v4, :cond_26

    .line 560
    .line 561
    goto/16 :goto_0

    .line 562
    .line 563
    :cond_26
    const/16 v3, 0x9

    .line 564
    .line 565
    goto/16 :goto_0

    .line 566
    .line 567
    :sswitch_27
    const-string v4, "borderTopStartRadius"

    .line 568
    .line 569
    .line 570
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    move-result v4

    .line 572
    .line 573
    if-nez v4, :cond_27

    .line 574
    .line 575
    goto/16 :goto_0

    .line 576
    .line 577
    :cond_27
    const/16 v3, 0x8

    .line 578
    .line 579
    goto/16 :goto_0

    .line 580
    .line 581
    :sswitch_28
    const-string v4, "accessible"

    .line 582
    .line 583
    .line 584
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 585
    move-result v4

    .line 586
    .line 587
    if-nez v4, :cond_28

    .line 588
    goto :goto_0

    .line 589
    :cond_28
    const/4 v3, 0x7

    .line 590
    goto :goto_0

    .line 591
    .line 592
    :sswitch_29
    const-string v4, "borderTopLeftRadius"

    .line 593
    .line 594
    .line 595
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 596
    move-result v4

    .line 597
    .line 598
    if-nez v4, :cond_29

    .line 599
    goto :goto_0

    .line 600
    :cond_29
    const/4 v3, 0x6

    .line 601
    goto :goto_0

    .line 602
    .line 603
    :sswitch_2a
    const-string v4, "borderBottomColor"

    .line 604
    .line 605
    .line 606
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 607
    move-result v4

    .line 608
    .line 609
    if-nez v4, :cond_2a

    .line 610
    goto :goto_0

    .line 611
    :cond_2a
    const/4 v3, 0x5

    .line 612
    goto :goto_0

    .line 613
    .line 614
    :sswitch_2b
    const-string v4, "borderTopColor"

    .line 615
    .line 616
    .line 617
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 618
    move-result v4

    .line 619
    .line 620
    if-nez v4, :cond_2b

    .line 621
    goto :goto_0

    .line 622
    :cond_2b
    const/4 v3, 0x4

    .line 623
    goto :goto_0

    .line 624
    .line 625
    .line 626
    :sswitch_2c
    const-string/jumbo v4, "vbHeight"

    .line 627
    .line 628
    .line 629
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 630
    move-result v4

    .line 631
    .line 632
    if-nez v4, :cond_2c

    .line 633
    goto :goto_0

    .line 634
    :cond_2c
    const/4 v3, 0x3

    .line 635
    goto :goto_0

    .line 636
    .line 637
    :sswitch_2d
    const-string v4, "backfaceVisibility"

    .line 638
    .line 639
    .line 640
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 641
    move-result v4

    .line 642
    .line 643
    if-nez v4, :cond_2d

    .line 644
    goto :goto_0

    .line 645
    :cond_2d
    const/4 v3, 0x2

    .line 646
    goto :goto_0

    .line 647
    .line 648
    :sswitch_2e
    const-string v4, "borderRightColor"

    .line 649
    .line 650
    .line 651
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 652
    move-result v4

    .line 653
    .line 654
    if-nez v4, :cond_2e

    .line 655
    goto :goto_0

    .line 656
    :cond_2e
    const/4 v3, 0x1

    .line 657
    goto :goto_0

    .line 658
    .line 659
    :sswitch_2f
    const-string v4, "bbHeight"

    .line 660
    .line 661
    .line 662
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 663
    move-result v4

    .line 664
    .line 665
    if-nez v4, :cond_2f

    .line 666
    goto :goto_0

    .line 667
    :cond_2f
    move v3, v2

    .line 668
    .line 669
    .line 670
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 671
    .line 672
    .line 673
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 674
    return-void

    .line 675
    .line 676
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 677
    .line 678
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 679
    .line 680
    .line 681
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 682
    move-result-object v0

    .line 683
    .line 684
    .line 685
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 686
    move-result-object p3

    .line 687
    .line 688
    .line 689
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderStartColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 690
    return-void

    .line 691
    .line 692
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 693
    .line 694
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 695
    .line 696
    if-nez p3, :cond_30

    .line 697
    goto :goto_1

    .line 698
    .line 699
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 700
    .line 701
    .line 702
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 703
    move-result v2

    .line 704
    .line 705
    .line 706
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusRight(Landroid/view/View;I)V

    .line 707
    return-void

    .line 708
    .line 709
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 710
    .line 711
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 712
    .line 713
    if-nez p3, :cond_31

    .line 714
    goto :goto_2

    .line 715
    .line 716
    :cond_31
    check-cast p3, Ljava/lang/Double;

    .line 717
    .line 718
    .line 719
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 720
    move-result v2

    .line 721
    .line 722
    .line 723
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setMeetOrSlice(Landroid/view/View;I)V

    .line 724
    return-void

    .line 725
    .line 726
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 727
    .line 728
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 729
    .line 730
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 731
    .line 732
    .line 733
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNativeBackgroundAndroid(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 734
    return-void

    .line 735
    .line 736
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 737
    .line 738
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 739
    .line 740
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 741
    .line 742
    .line 743
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderEndEndRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 747
    return-void

    .line 748
    .line 749
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 750
    .line 751
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 752
    .line 753
    if-nez p3, :cond_32

    .line 754
    goto :goto_3

    .line 755
    .line 756
    :cond_32
    check-cast p3, Ljava/lang/Boolean;

    .line 757
    .line 758
    .line 759
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 760
    move-result v2

    .line 761
    .line 762
    .line 763
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNeedsOffscreenAlphaCompositing(Landroid/view/View;Z)V

    .line 764
    return-void

    .line 765
    .line 766
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 767
    .line 768
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 769
    .line 770
    if-nez p3, :cond_33

    .line 771
    goto :goto_4

    .line 772
    .line 773
    :cond_33
    check-cast p3, Ljava/lang/Boolean;

    .line 774
    .line 775
    .line 776
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 777
    move-result v2

    .line 778
    .line 779
    .line 780
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setFocusable(Landroid/view/View;Z)V

    .line 781
    return-void

    .line 782
    .line 783
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 784
    .line 785
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 786
    .line 787
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 788
    .line 789
    .line 790
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 794
    return-void

    .line 795
    .line 796
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 797
    .line 798
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 799
    .line 800
    .line 801
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 802
    move-result-object v0

    .line 803
    .line 804
    .line 805
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 806
    move-result-object p3

    .line 807
    .line 808
    .line 809
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderEndColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 810
    return-void

    .line 811
    .line 812
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 813
    .line 814
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 815
    .line 816
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 817
    .line 818
    .line 819
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setHitSlop(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 823
    return-void

    .line 824
    .line 825
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 826
    .line 827
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 828
    .line 829
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 830
    .line 831
    .line 832
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderEndStartRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 836
    return-void

    .line 837
    .line 838
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 839
    .line 840
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 841
    .line 842
    .line 843
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 844
    move-result-object v0

    .line 845
    .line 846
    .line 847
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 848
    move-result-object p3

    .line 849
    .line 850
    .line 851
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBlockEndColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 852
    return-void

    .line 853
    .line 854
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 855
    .line 856
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 857
    .line 858
    if-nez p3, :cond_34

    .line 859
    goto :goto_5

    .line 860
    :cond_34
    move-object v1, p3

    .line 861
    .line 862
    check-cast v1, Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    :goto_5
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 866
    return-void

    .line 867
    .line 868
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 869
    .line 870
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 871
    .line 872
    .line 873
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 874
    move-result-object v0

    .line 875
    .line 876
    .line 877
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 878
    move-result-object p3

    .line 879
    .line 880
    .line 881
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 882
    return-void

    .line 883
    .line 884
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 885
    .line 886
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 887
    .line 888
    .line 889
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 890
    move-result-object v0

    .line 891
    .line 892
    .line 893
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 894
    move-result-object p3

    .line 895
    .line 896
    .line 897
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBlockColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 898
    return-void

    .line 899
    .line 900
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 901
    .line 902
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 903
    .line 904
    if-nez p3, :cond_35

    .line 905
    goto :goto_6

    .line 906
    .line 907
    :cond_35
    check-cast p3, Ljava/lang/Double;

    .line 908
    .line 909
    .line 910
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 911
    move-result v2

    .line 912
    .line 913
    .line 914
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusUp(Landroid/view/View;I)V

    .line 915
    return-void

    .line 916
    .line 917
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 918
    .line 919
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 920
    .line 921
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 922
    .line 923
    .line 924
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 925
    .line 926
    .line 927
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomRightRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 928
    return-void

    .line 929
    .line 930
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 931
    .line 932
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 933
    .line 934
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 935
    .line 936
    .line 937
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 938
    .line 939
    .line 940
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomLeftRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 941
    return-void

    .line 942
    .line 943
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 944
    .line 945
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 946
    .line 947
    if-nez p3, :cond_36

    .line 948
    goto :goto_7

    .line 949
    .line 950
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 951
    .line 952
    .line 953
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 954
    move-result v2

    .line 955
    .line 956
    .line 957
    :goto_7
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusForward(Landroid/view/View;I)V

    .line 958
    return-void

    .line 959
    .line 960
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 961
    .line 962
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 963
    .line 964
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 965
    .line 966
    .line 967
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopRightRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 971
    return-void

    .line 972
    .line 973
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 974
    .line 975
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 976
    .line 977
    .line 978
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 979
    move-result-object v0

    .line 980
    .line 981
    .line 982
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 983
    move-result-object p3

    .line 984
    .line 985
    .line 986
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBlockStartColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 987
    return-void

    .line 988
    .line 989
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 990
    .line 991
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 992
    .line 993
    if-nez p3, :cond_37

    .line 994
    goto :goto_8

    .line 995
    .line 996
    :cond_37
    check-cast p3, Ljava/lang/Double;

    .line 997
    .line 998
    .line 999
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1000
    move-result v0

    .line 1001
    .line 1002
    .line 1003
    :goto_8
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setVbWidth(Landroid/view/View;F)V

    .line 1004
    return-void

    .line 1005
    .line 1006
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1007
    .line 1008
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1012
    move-result-object v0

    .line 1013
    .line 1014
    .line 1015
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1016
    move-result-object p3

    .line 1017
    .line 1018
    .line 1019
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1020
    return-void

    .line 1021
    .line 1022
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1023
    .line 1024
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1025
    .line 1026
    if-nez p3, :cond_38

    .line 1027
    goto :goto_9

    .line 1028
    :cond_38
    move-object v1, p3

    .line 1029
    .line 1030
    check-cast v1, Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    :goto_9
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 1034
    return-void

    .line 1035
    .line 1036
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1037
    .line 1038
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1039
    .line 1040
    if-nez p3, :cond_39

    .line 1041
    goto :goto_a

    .line 1042
    .line 1043
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1047
    move-result v0

    .line 1048
    .line 1049
    .line 1050
    :goto_a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setMinY(Landroid/view/View;F)V

    .line 1051
    return-void

    .line 1052
    .line 1053
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1054
    .line 1055
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1056
    .line 1057
    if-nez p3, :cond_3a

    .line 1058
    goto :goto_b

    .line 1059
    .line 1060
    :cond_3a
    check-cast p3, Ljava/lang/Double;

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1064
    move-result v0

    .line 1065
    .line 1066
    .line 1067
    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setMinX(Landroid/view/View;F)V

    .line 1068
    return-void

    .line 1069
    .line 1070
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1071
    .line 1072
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1073
    .line 1074
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1075
    .line 1076
    .line 1077
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1078
    .line 1079
    .line 1080
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderStartStartRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1081
    return-void

    .line 1082
    .line 1083
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1084
    .line 1085
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1086
    .line 1087
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 1088
    .line 1089
    .line 1090
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNativeForegroundAndroid(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1091
    return-void

    .line 1092
    .line 1093
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1094
    .line 1095
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1096
    .line 1097
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1098
    .line 1099
    .line 1100
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1101
    .line 1102
    .line 1103
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomEndRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1104
    return-void

    .line 1105
    .line 1106
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1107
    .line 1108
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1109
    .line 1110
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1111
    .line 1112
    .line 1113
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1114
    .line 1115
    .line 1116
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderStartEndRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1117
    return-void

    .line 1118
    .line 1119
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1120
    .line 1121
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1125
    move-result-object v0

    .line 1126
    .line 1127
    .line 1128
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1129
    move-result-object p3

    .line 1130
    .line 1131
    .line 1132
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderLeftColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1133
    return-void

    .line 1134
    .line 1135
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1136
    .line 1137
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1138
    .line 1139
    if-nez p3, :cond_3b

    .line 1140
    goto :goto_c

    .line 1141
    .line 1142
    :cond_3b
    check-cast p3, Ljava/lang/Boolean;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1146
    move-result v2

    .line 1147
    .line 1148
    .line 1149
    :goto_c
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setRemoveClippedSubviews(Landroid/view/View;Z)V

    .line 1150
    return-void

    .line 1151
    .line 1152
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1153
    .line 1154
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1155
    .line 1156
    if-nez p3, :cond_3c

    .line 1157
    goto :goto_d

    .line 1158
    :cond_3c
    move-object v1, p3

    .line 1159
    .line 1160
    check-cast v1, Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    :goto_d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1164
    return-void

    .line 1165
    .line 1166
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1167
    .line 1168
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1169
    .line 1170
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1171
    .line 1172
    .line 1173
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1174
    .line 1175
    .line 1176
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBbWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1177
    return-void

    .line 1178
    .line 1179
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1180
    .line 1181
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1182
    .line 1183
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1184
    .line 1185
    .line 1186
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopEndRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1190
    return-void

    .line 1191
    .line 1192
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1193
    .line 1194
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1195
    .line 1196
    if-nez p3, :cond_3d

    .line 1197
    goto :goto_e

    .line 1198
    .line 1199
    :cond_3d
    check-cast p3, Ljava/lang/Double;

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1203
    move-result v2

    .line 1204
    .line 1205
    .line 1206
    :goto_e
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusLeft(Landroid/view/View;I)V

    .line 1207
    return-void

    .line 1208
    .line 1209
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1210
    .line 1211
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1212
    .line 1213
    if-nez p3, :cond_3e

    .line 1214
    goto :goto_f

    .line 1215
    .line 1216
    :cond_3e
    check-cast p3, Ljava/lang/Double;

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1220
    move-result v2

    .line 1221
    .line 1222
    .line 1223
    :goto_f
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setNextFocusDown(Landroid/view/View;I)V

    .line 1224
    return-void

    .line 1225
    .line 1226
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1227
    .line 1228
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1229
    .line 1230
    if-nez p3, :cond_3f

    .line 1231
    goto :goto_10

    .line 1232
    .line 1233
    :cond_3f
    check-cast p3, Ljava/lang/Boolean;

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1237
    move-result v2

    .line 1238
    .line 1239
    .line 1240
    :goto_10
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setHasTVPreferredFocus(Landroid/view/View;Z)V

    .line 1241
    return-void

    .line 1242
    .line 1243
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1244
    .line 1245
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1246
    .line 1247
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1248
    .line 1249
    .line 1250
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1251
    .line 1252
    .line 1253
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomStartRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1254
    return-void

    .line 1255
    .line 1256
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1257
    .line 1258
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1259
    .line 1260
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1261
    .line 1262
    .line 1263
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1264
    .line 1265
    .line 1266
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopStartRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1267
    return-void

    .line 1268
    .line 1269
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1270
    .line 1271
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1272
    .line 1273
    if-nez p3, :cond_40

    .line 1274
    goto :goto_11

    .line 1275
    .line 1276
    :cond_40
    check-cast p3, Ljava/lang/Boolean;

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1280
    move-result v2

    .line 1281
    .line 1282
    .line 1283
    :goto_11
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setAccessible(Landroid/view/View;Z)V

    .line 1284
    return-void

    .line 1285
    .line 1286
    :pswitch_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1287
    .line 1288
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1289
    .line 1290
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1291
    .line 1292
    .line 1293
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1294
    .line 1295
    .line 1296
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopLeftRadius(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1297
    return-void

    .line 1298
    .line 1299
    :pswitch_2a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1300
    .line 1301
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1305
    move-result-object v0

    .line 1306
    .line 1307
    .line 1308
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1309
    move-result-object p3

    .line 1310
    .line 1311
    .line 1312
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderBottomColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1313
    return-void

    .line 1314
    .line 1315
    :pswitch_2b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1316
    .line 1317
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1321
    move-result-object v0

    .line 1322
    .line 1323
    .line 1324
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1325
    move-result-object p3

    .line 1326
    .line 1327
    .line 1328
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderTopColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1329
    return-void

    .line 1330
    .line 1331
    :pswitch_2c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1332
    .line 1333
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1334
    .line 1335
    if-nez p3, :cond_41

    .line 1336
    goto :goto_12

    .line 1337
    .line 1338
    :cond_41
    check-cast p3, Ljava/lang/Double;

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1342
    move-result v0

    .line 1343
    .line 1344
    .line 1345
    :goto_12
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setVbHeight(Landroid/view/View;F)V

    .line 1346
    return-void

    .line 1347
    .line 1348
    :pswitch_2d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1349
    .line 1350
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1351
    .line 1352
    if-nez p3, :cond_42

    .line 1353
    goto :goto_13

    .line 1354
    :cond_42
    move-object v1, p3

    .line 1355
    .line 1356
    check-cast v1, Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    :goto_13
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBackfaceVisibility(Landroid/view/View;Ljava/lang/String;)V

    .line 1360
    return-void

    .line 1361
    .line 1362
    :pswitch_2e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1363
    .line 1364
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1368
    move-result-object v0

    .line 1369
    .line 1370
    .line 1371
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 1372
    move-result-object p3

    .line 1373
    .line 1374
    .line 1375
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBorderRightColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1376
    return-void

    .line 1377
    .line 1378
    :pswitch_2f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1379
    .line 1380
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;

    .line 1381
    .line 1382
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1383
    .line 1384
    .line 1385
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1386
    .line 1387
    .line 1388
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSvgViewAndroidManagerInterface;->setBbHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1389
    return-void

    .line 1390
    nop

    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    :sswitch_data_0
    .sparse-switch
        -0x7b0ca679 -> :sswitch_2f
        -0x7696880d -> :sswitch_2e
        -0x6532960a -> :sswitch_2d
        -0x5d75250d -> :sswitch_2c
        -0x57ab08a6 -> :sswitch_2b
        -0x4e0397d4 -> :sswitch_2a
        -0x4932ce1e -> :sswitch_29
        -0x4408644a -> :sswitch_28
        -0x42e281b5 -> :sswitch_27
        -0x33b27663 -> :sswitch_26
        -0x2881956d -> :sswitch_25
        -0x25a40819 -> :sswitch_24
        -0x25a08cb4 -> :sswitch_23
        -0x1cd17a3c -> :sswitch_22
        -0x13a7269a -> :sswitch_21
        -0x117e564a -> :sswitch_20
        -0xf06d417 -> :sswitch_1f
        -0xe70d730 -> :sswitch_1e
        -0xd4cc1a9 -> :sswitch_1d
        -0x8d2c26a -> :sswitch_1c
        -0x689bbab -> :sswitch_1b
        -0x1a9a1e2 -> :sswitch_1a
        0x332446 -> :sswitch_19
        0x332447 -> :sswitch_18
        0x5899705 -> :sswitch_17
        0x5a72f63 -> :sswitch_16
        0xe557a7a -> :sswitch_15
        0x124be2c2 -> :sswitch_14
        0x13dfc885 -> :sswitch_13
        0x1e013d60 -> :sswitch_12
        0x22a57450 -> :sswitch_11
        0x230fd3d7 -> :sswitch_10
        0x2762ef20 -> :sswitch_f
        0x28ce5422 -> :sswitch_e
        0x2b158697 -> :sswitch_d
        0x2bf974e5 -> :sswitch_c
        0x2d7a3629 -> :sswitch_b
        0x3647e705 -> :sswitch_a
        0x373ef02d -> :sswitch_9
        0x48c2f394 -> :sswitch_8
        0x506afbde -> :sswitch_7
        0x6118be32 -> :sswitch_6
        0x636835e4 -> :sswitch_5
        0x676fd4fe -> :sswitch_4
        0x682c2a0a -> :sswitch_3
        0x71baeb28 -> :sswitch_2
        0x71e55777 -> :sswitch_1
        0x7e5af16d -> :sswitch_0
    .end sparse-switch

    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
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
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
.end method
