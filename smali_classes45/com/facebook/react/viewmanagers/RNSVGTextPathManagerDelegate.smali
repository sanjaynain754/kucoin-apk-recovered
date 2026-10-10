.class public Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSVGTextPathManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface<",
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
    .locals 7
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
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, -0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 14
    move-result v6

    .line 15
    .line 16
    .line 17
    sparse-switch v6, :sswitch_data_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    .line 22
    :sswitch_0
    const-string/jumbo v6, "strokeWidth"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    move-result v6

    .line 27
    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_0
    const/16 v5, 0x2e

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    .line 37
    :sswitch_1
    const-string/jumbo v6, "responsible"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    move-result v6

    .line 42
    .line 43
    if-nez v6, :cond_1

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_1
    const/16 v5, 0x2d

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    .line 52
    :sswitch_2
    const-string/jumbo v6, "strokeLinejoin"

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    move-result v6

    .line 57
    .line 58
    if-nez v6, :cond_2

    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :cond_2
    const/16 v5, 0x2c

    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :sswitch_3
    const-string v6, "display"

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    move-result v6

    .line 71
    .line 72
    if-nez v6, :cond_3

    .line 73
    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :cond_3
    const/16 v5, 0x2b

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    .line 81
    :sswitch_4
    const-string/jumbo v6, "textLength"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    move-result v6

    .line 86
    .line 87
    if-nez v6, :cond_4

    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_4
    const/16 v5, 0x2a

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :sswitch_5
    const-string v6, "midLine"

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    move-result v6

    .line 100
    .line 101
    if-nez v6, :cond_5

    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_5
    const/16 v5, 0x29

    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    .line 110
    :sswitch_6
    const-string/jumbo v6, "strokeLinecap"

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    move-result v6

    .line 115
    .line 116
    if-nez v6, :cond_6

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_6
    const/16 v5, 0x28

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :sswitch_7
    const-string v6, "clipRule"

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    move-result v6

    .line 129
    .line 130
    if-nez v6, :cond_7

    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :cond_7
    const/16 v5, 0x27

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :sswitch_8
    const-string v6, "clipPath"

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    move-result v6

    .line 143
    .line 144
    if-nez v6, :cond_8

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_8
    const/16 v5, 0x26

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :sswitch_9
    const-string v6, "inlineSize"

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    move-result v6

    .line 157
    .line 158
    if-nez v6, :cond_9

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_9
    const/16 v5, 0x25

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    .line 167
    :sswitch_a
    const-string/jumbo v6, "strokeDasharray"

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    move-result v6

    .line 172
    .line 173
    if-nez v6, :cond_a

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_a
    const/16 v5, 0x24

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :sswitch_b
    const-string v6, "fontSize"

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    move-result v6

    .line 186
    .line 187
    if-nez v6, :cond_b

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_b
    const/16 v5, 0x23

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :sswitch_c
    const-string v6, "baselineShift"

    .line 196
    .line 197
    .line 198
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    move-result v6

    .line 200
    .line 201
    if-nez v6, :cond_c

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_c
    const/16 v5, 0x22

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :sswitch_d
    const-string v6, "markerStart"

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    move-result v6

    .line 214
    .line 215
    if-nez v6, :cond_d

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_d
    const/16 v5, 0x21

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    .line 224
    :sswitch_e
    const-string/jumbo v6, "vectorEffect"

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    move-result v6

    .line 229
    .line 230
    if-nez v6, :cond_e

    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_e
    const/16 v5, 0x20

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :sswitch_f
    const-string v6, "color"

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    move-result v6

    .line 243
    .line 244
    if-nez v6, :cond_f

    .line 245
    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_f
    const/16 v5, 0x1f

    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    .line 253
    :sswitch_10
    const-string/jumbo v6, "strokeMiterlimit"

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    move-result v6

    .line 258
    .line 259
    if-nez v6, :cond_10

    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_10
    const/16 v5, 0x1e

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    .line 268
    :sswitch_11
    const-string/jumbo v6, "side"

    .line 269
    .line 270
    .line 271
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    move-result v6

    .line 273
    .line 274
    if-nez v6, :cond_11

    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_11
    const/16 v5, 0x1d

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_12
    const-string v6, "name"

    .line 283
    .line 284
    .line 285
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    move-result v6

    .line 287
    .line 288
    if-nez v6, :cond_12

    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :cond_12
    const/16 v5, 0x1c

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_13
    const-string v6, "mask"

    .line 297
    .line 298
    .line 299
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    move-result v6

    .line 301
    .line 302
    if-nez v6, :cond_13

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_13
    const/16 v5, 0x1b

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_14
    const-string v6, "href"

    .line 311
    .line 312
    .line 313
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    move-result v6

    .line 315
    .line 316
    if-nez v6, :cond_14

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_14
    const/16 v5, 0x1a

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_15
    const-string v6, "font"

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    move-result v6

    .line 329
    .line 330
    if-nez v6, :cond_15

    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_15
    const/16 v5, 0x19

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_16
    const-string v6, "fill"

    .line 339
    .line 340
    .line 341
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    move-result v6

    .line 343
    .line 344
    if-nez v6, :cond_16

    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :cond_16
    const/16 v5, 0x18

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_17
    const-string v6, "dy"

    .line 353
    .line 354
    .line 355
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    move-result v6

    .line 357
    .line 358
    if-nez v6, :cond_17

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :cond_17
    const/16 v5, 0x17

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_18
    const-string v6, "dx"

    .line 367
    .line 368
    .line 369
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    move-result v6

    .line 371
    .line 372
    if-nez v6, :cond_18

    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :cond_18
    const/16 v5, 0x16

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    .line 381
    :sswitch_19
    const-string/jumbo v6, "y"

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    move-result v6

    .line 386
    .line 387
    if-nez v6, :cond_19

    .line 388
    .line 389
    goto/16 :goto_0

    .line 390
    .line 391
    :cond_19
    const/16 v5, 0x15

    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    .line 396
    :sswitch_1a
    const-string/jumbo v6, "x"

    .line 397
    .line 398
    .line 399
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 400
    move-result v6

    .line 401
    .line 402
    if-nez v6, :cond_1a

    .line 403
    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :cond_1a
    const/16 v5, 0x14

    .line 407
    .line 408
    goto/16 :goto_0

    .line 409
    .line 410
    .line 411
    :sswitch_1b
    const-string/jumbo v6, "strokeDashoffset"

    .line 412
    .line 413
    .line 414
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    move-result v6

    .line 416
    .line 417
    if-nez v6, :cond_1b

    .line 418
    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :cond_1b
    const/16 v5, 0x13

    .line 422
    .line 423
    goto/16 :goto_0

    .line 424
    .line 425
    :sswitch_1c
    const-string v6, "fillOpacity"

    .line 426
    .line 427
    .line 428
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    move-result v6

    .line 430
    .line 431
    if-nez v6, :cond_1c

    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :cond_1c
    const/16 v5, 0x12

    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    .line 440
    :sswitch_1d
    const-string/jumbo v6, "pointerEvents"

    .line 441
    .line 442
    .line 443
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 444
    move-result v6

    .line 445
    .line 446
    if-nez v6, :cond_1d

    .line 447
    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :cond_1d
    const/16 v5, 0x11

    .line 451
    .line 452
    goto/16 :goto_0

    .line 453
    .line 454
    .line 455
    :sswitch_1e
    const-string/jumbo v6, "strokeOpacity"

    .line 456
    .line 457
    .line 458
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 459
    move-result v6

    .line 460
    .line 461
    if-nez v6, :cond_1e

    .line 462
    .line 463
    goto/16 :goto_0

    .line 464
    .line 465
    :cond_1e
    const/16 v5, 0x10

    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :sswitch_1f
    const-string v6, "fillRule"

    .line 470
    .line 471
    .line 472
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    move-result v6

    .line 474
    .line 475
    if-nez v6, :cond_1f

    .line 476
    .line 477
    goto/16 :goto_0

    .line 478
    .line 479
    :cond_1f
    const/16 v5, 0xf

    .line 480
    .line 481
    goto/16 :goto_0

    .line 482
    .line 483
    :sswitch_20
    const-string v6, "fontWeight"

    .line 484
    .line 485
    .line 486
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    move-result v6

    .line 488
    .line 489
    if-nez v6, :cond_20

    .line 490
    .line 491
    goto/16 :goto_0

    .line 492
    .line 493
    :cond_20
    const/16 v5, 0xe

    .line 494
    .line 495
    goto/16 :goto_0

    .line 496
    .line 497
    .line 498
    :sswitch_21
    const-string/jumbo v6, "stroke"

    .line 499
    .line 500
    .line 501
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 502
    move-result v6

    .line 503
    .line 504
    if-nez v6, :cond_21

    .line 505
    .line 506
    goto/16 :goto_0

    .line 507
    .line 508
    :cond_21
    const/16 v5, 0xd

    .line 509
    .line 510
    goto/16 :goto_0

    .line 511
    .line 512
    .line 513
    :sswitch_22
    const-string/jumbo v6, "rotate"

    .line 514
    .line 515
    .line 516
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    move-result v6

    .line 518
    .line 519
    if-nez v6, :cond_22

    .line 520
    .line 521
    goto/16 :goto_0

    .line 522
    .line 523
    :cond_22
    const/16 v5, 0xc

    .line 524
    .line 525
    goto/16 :goto_0

    .line 526
    .line 527
    :sswitch_23
    const-string v6, "markerMid"

    .line 528
    .line 529
    .line 530
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 531
    move-result v6

    .line 532
    .line 533
    if-nez v6, :cond_23

    .line 534
    .line 535
    goto/16 :goto_0

    .line 536
    .line 537
    :cond_23
    const/16 v5, 0xb

    .line 538
    .line 539
    goto/16 :goto_0

    .line 540
    .line 541
    :sswitch_24
    const-string v6, "markerEnd"

    .line 542
    .line 543
    .line 544
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 545
    move-result v6

    .line 546
    .line 547
    if-nez v6, :cond_24

    .line 548
    .line 549
    goto/16 :goto_0

    .line 550
    .line 551
    :cond_24
    const/16 v5, 0xa

    .line 552
    .line 553
    goto/16 :goto_0

    .line 554
    .line 555
    .line 556
    :sswitch_25
    const-string/jumbo v6, "propList"

    .line 557
    .line 558
    .line 559
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 560
    move-result v6

    .line 561
    .line 562
    if-nez v6, :cond_25

    .line 563
    .line 564
    goto/16 :goto_0

    .line 565
    .line 566
    :cond_25
    const/16 v5, 0x9

    .line 567
    .line 568
    goto/16 :goto_0

    .line 569
    .line 570
    :sswitch_26
    const-string v6, "method"

    .line 571
    .line 572
    .line 573
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 574
    move-result v6

    .line 575
    .line 576
    if-nez v6, :cond_26

    .line 577
    .line 578
    goto/16 :goto_0

    .line 579
    .line 580
    :cond_26
    const/16 v5, 0x8

    .line 581
    .line 582
    goto/16 :goto_0

    .line 583
    .line 584
    :sswitch_27
    const-string v6, "matrix"

    .line 585
    .line 586
    .line 587
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 588
    move-result v6

    .line 589
    .line 590
    if-nez v6, :cond_27

    .line 591
    goto :goto_0

    .line 592
    :cond_27
    const/4 v5, 0x7

    .line 593
    goto :goto_0

    .line 594
    .line 595
    .line 596
    :sswitch_28
    const-string/jumbo v6, "verticalAlign"

    .line 597
    .line 598
    .line 599
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 600
    move-result v6

    .line 601
    .line 602
    if-nez v6, :cond_28

    .line 603
    goto :goto_0

    .line 604
    :cond_28
    const/4 v5, 0x6

    .line 605
    goto :goto_0

    .line 606
    .line 607
    :sswitch_29
    const-string v6, "alignmentBaseline"

    .line 608
    .line 609
    .line 610
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 611
    move-result v6

    .line 612
    .line 613
    if-nez v6, :cond_29

    .line 614
    goto :goto_0

    .line 615
    :cond_29
    const/4 v5, 0x5

    .line 616
    goto :goto_0

    .line 617
    .line 618
    :sswitch_2a
    const-string v6, "opacity"

    .line 619
    .line 620
    .line 621
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 622
    move-result v6

    .line 623
    .line 624
    if-nez v6, :cond_2a

    .line 625
    goto :goto_0

    .line 626
    :cond_2a
    const/4 v5, 0x4

    .line 627
    goto :goto_0

    .line 628
    .line 629
    :sswitch_2b
    const-string v6, "filter"

    .line 630
    .line 631
    .line 632
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 633
    move-result v6

    .line 634
    .line 635
    if-nez v6, :cond_2b

    .line 636
    goto :goto_0

    .line 637
    :cond_2b
    const/4 v5, 0x3

    .line 638
    goto :goto_0

    .line 639
    .line 640
    :sswitch_2c
    const-string v6, "lengthAdjust"

    .line 641
    .line 642
    .line 643
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 644
    move-result v6

    .line 645
    .line 646
    if-nez v6, :cond_2c

    .line 647
    goto :goto_0

    .line 648
    :cond_2c
    const/4 v5, 0x2

    .line 649
    goto :goto_0

    .line 650
    .line 651
    .line 652
    :sswitch_2d
    const-string/jumbo v6, "startOffset"

    .line 653
    .line 654
    .line 655
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 656
    move-result v6

    .line 657
    .line 658
    if-nez v6, :cond_2d

    .line 659
    goto :goto_0

    .line 660
    :cond_2d
    move v5, v0

    .line 661
    goto :goto_0

    .line 662
    .line 663
    .line 664
    :sswitch_2e
    const-string/jumbo v6, "spacing"

    .line 665
    .line 666
    .line 667
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 668
    move-result v6

    .line 669
    .line 670
    if-nez v6, :cond_2e

    .line 671
    goto :goto_0

    .line 672
    :cond_2e
    move v5, v3

    .line 673
    .line 674
    .line 675
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 676
    .line 677
    .line 678
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 679
    return-void

    .line 680
    .line 681
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 682
    .line 683
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 684
    .line 685
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 686
    .line 687
    .line 688
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 692
    return-void

    .line 693
    .line 694
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 695
    .line 696
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 697
    .line 698
    if-nez p3, :cond_2f

    .line 699
    goto :goto_1

    .line 700
    .line 701
    :cond_2f
    check-cast p3, Ljava/lang/Boolean;

    .line 702
    .line 703
    .line 704
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 705
    move-result v3

    .line 706
    .line 707
    .line 708
    :goto_1
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 709
    return-void

    .line 710
    .line 711
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 712
    .line 713
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 714
    .line 715
    if-nez p3, :cond_30

    .line 716
    goto :goto_2

    .line 717
    .line 718
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 719
    .line 720
    .line 721
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 722
    move-result v3

    .line 723
    .line 724
    .line 725
    :goto_2
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 726
    return-void

    .line 727
    .line 728
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 729
    .line 730
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 731
    .line 732
    if-nez p3, :cond_31

    .line 733
    goto :goto_3

    .line 734
    :cond_31
    move-object v4, p3

    .line 735
    .line 736
    check-cast v4, Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    :goto_3
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 740
    return-void

    .line 741
    .line 742
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 743
    .line 744
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 745
    .line 746
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 747
    .line 748
    .line 749
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setTextLength(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 753
    return-void

    .line 754
    .line 755
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 756
    .line 757
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 758
    .line 759
    if-nez p3, :cond_32

    .line 760
    goto :goto_4

    .line 761
    :cond_32
    move-object v4, p3

    .line 762
    .line 763
    check-cast v4, Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    :goto_4
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMidLine(Landroid/view/View;Ljava/lang/String;)V

    .line 767
    return-void

    .line 768
    .line 769
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 770
    .line 771
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 772
    .line 773
    if-nez p3, :cond_33

    .line 774
    goto :goto_5

    .line 775
    .line 776
    :cond_33
    check-cast p3, Ljava/lang/Double;

    .line 777
    .line 778
    .line 779
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 780
    move-result v3

    .line 781
    .line 782
    .line 783
    :goto_5
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 784
    return-void

    .line 785
    .line 786
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 787
    .line 788
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 789
    .line 790
    if-nez p3, :cond_34

    .line 791
    goto :goto_6

    .line 792
    .line 793
    :cond_34
    check-cast p3, Ljava/lang/Double;

    .line 794
    .line 795
    .line 796
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 797
    move-result v3

    .line 798
    .line 799
    .line 800
    :goto_6
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 801
    return-void

    .line 802
    .line 803
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 804
    .line 805
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 806
    .line 807
    if-nez p3, :cond_35

    .line 808
    goto :goto_7

    .line 809
    :cond_35
    move-object v4, p3

    .line 810
    .line 811
    check-cast v4, Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    :goto_7
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 815
    return-void

    .line 816
    .line 817
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 818
    .line 819
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 820
    .line 821
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 822
    .line 823
    .line 824
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setInlineSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 828
    return-void

    .line 829
    .line 830
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 831
    .line 832
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 833
    .line 834
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 835
    .line 836
    .line 837
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 841
    return-void

    .line 842
    .line 843
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 844
    .line 845
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 846
    .line 847
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 848
    .line 849
    .line 850
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 851
    .line 852
    .line 853
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFontSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 854
    return-void

    .line 855
    .line 856
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 857
    .line 858
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 859
    .line 860
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 861
    .line 862
    .line 863
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setBaselineShift(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 867
    return-void

    .line 868
    .line 869
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 870
    .line 871
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 872
    .line 873
    if-nez p3, :cond_36

    .line 874
    goto :goto_8

    .line 875
    :cond_36
    move-object v4, p3

    .line 876
    .line 877
    check-cast v4, Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    :goto_8
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 881
    return-void

    .line 882
    .line 883
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 884
    .line 885
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 886
    .line 887
    if-nez p3, :cond_37

    .line 888
    goto :goto_9

    .line 889
    .line 890
    :cond_37
    check-cast p3, Ljava/lang/Double;

    .line 891
    .line 892
    .line 893
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 894
    move-result v3

    .line 895
    .line 896
    .line 897
    :goto_9
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 898
    return-void

    .line 899
    .line 900
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 901
    .line 902
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 903
    .line 904
    .line 905
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 906
    move-result-object v0

    .line 907
    .line 908
    .line 909
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 910
    move-result-object p3

    .line 911
    .line 912
    .line 913
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 914
    return-void

    .line 915
    .line 916
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 917
    .line 918
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 919
    .line 920
    if-nez p3, :cond_38

    .line 921
    goto :goto_a

    .line 922
    .line 923
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 924
    .line 925
    .line 926
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 927
    move-result v1

    .line 928
    .line 929
    .line 930
    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 931
    return-void

    .line 932
    .line 933
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 934
    .line 935
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 936
    .line 937
    if-nez p3, :cond_39

    .line 938
    goto :goto_b

    .line 939
    :cond_39
    move-object v4, p3

    .line 940
    .line 941
    check-cast v4, Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    :goto_b
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setSide(Landroid/view/View;Ljava/lang/String;)V

    .line 945
    return-void

    .line 946
    .line 947
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 948
    .line 949
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 950
    .line 951
    if-nez p3, :cond_3a

    .line 952
    goto :goto_c

    .line 953
    :cond_3a
    move-object v4, p3

    .line 954
    .line 955
    check-cast v4, Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    :goto_c
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 959
    return-void

    .line 960
    .line 961
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 962
    .line 963
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 964
    .line 965
    if-nez p3, :cond_3b

    .line 966
    goto :goto_d

    .line 967
    :cond_3b
    move-object v4, p3

    .line 968
    .line 969
    check-cast v4, Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 973
    return-void

    .line 974
    .line 975
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 976
    .line 977
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 978
    .line 979
    if-nez p3, :cond_3c

    .line 980
    goto :goto_e

    .line 981
    :cond_3c
    move-object v4, p3

    .line 982
    .line 983
    check-cast v4, Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setHref(Landroid/view/View;Ljava/lang/String;)V

    .line 987
    return-void

    .line 988
    .line 989
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 990
    .line 991
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 992
    .line 993
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 994
    .line 995
    .line 996
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 997
    .line 998
    .line 999
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1000
    return-void

    .line 1001
    .line 1002
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1003
    .line 1004
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1005
    .line 1006
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1007
    .line 1008
    .line 1009
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1013
    return-void

    .line 1014
    .line 1015
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1016
    .line 1017
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1018
    .line 1019
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1020
    .line 1021
    .line 1022
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setDy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1026
    return-void

    .line 1027
    .line 1028
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1029
    .line 1030
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1031
    .line 1032
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1033
    .line 1034
    .line 1035
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setDx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1039
    return-void

    .line 1040
    .line 1041
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1042
    .line 1043
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1044
    .line 1045
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1046
    .line 1047
    .line 1048
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1052
    return-void

    .line 1053
    .line 1054
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1055
    .line 1056
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1057
    .line 1058
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1059
    .line 1060
    .line 1061
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1062
    .line 1063
    .line 1064
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1065
    return-void

    .line 1066
    .line 1067
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1068
    .line 1069
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1070
    .line 1071
    if-nez p3, :cond_3d

    .line 1072
    goto :goto_f

    .line 1073
    .line 1074
    :cond_3d
    check-cast p3, Ljava/lang/Double;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1078
    move-result v1

    .line 1079
    .line 1080
    .line 1081
    :goto_f
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 1082
    return-void

    .line 1083
    .line 1084
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1085
    .line 1086
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1087
    .line 1088
    if-nez p3, :cond_3e

    .line 1089
    goto :goto_10

    .line 1090
    .line 1091
    :cond_3e
    check-cast p3, Ljava/lang/Double;

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1095
    move-result v2

    .line 1096
    .line 1097
    .line 1098
    :goto_10
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 1099
    return-void

    .line 1100
    .line 1101
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1102
    .line 1103
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1104
    .line 1105
    if-nez p3, :cond_3f

    .line 1106
    goto :goto_11

    .line 1107
    :cond_3f
    move-object v4, p3

    .line 1108
    .line 1109
    check-cast v4, Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    :goto_11
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1113
    return-void

    .line 1114
    .line 1115
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1116
    .line 1117
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1118
    .line 1119
    if-nez p3, :cond_40

    .line 1120
    goto :goto_12

    .line 1121
    .line 1122
    :cond_40
    check-cast p3, Ljava/lang/Double;

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1126
    move-result v2

    .line 1127
    .line 1128
    .line 1129
    :goto_12
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 1130
    return-void

    .line 1131
    .line 1132
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1133
    .line 1134
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1135
    .line 1136
    if-nez p3, :cond_41

    .line 1137
    goto :goto_13

    .line 1138
    .line 1139
    :cond_41
    check-cast p3, Ljava/lang/Double;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1143
    move-result v0

    .line 1144
    .line 1145
    .line 1146
    :goto_13
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1147
    return-void

    .line 1148
    .line 1149
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1150
    .line 1151
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1152
    .line 1153
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1154
    .line 1155
    .line 1156
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1157
    .line 1158
    .line 1159
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFontWeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1160
    return-void

    .line 1161
    .line 1162
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1163
    .line 1164
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1165
    .line 1166
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1167
    .line 1168
    .line 1169
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1170
    .line 1171
    .line 1172
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1173
    return-void

    .line 1174
    .line 1175
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1176
    .line 1177
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1178
    .line 1179
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1180
    .line 1181
    .line 1182
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1183
    .line 1184
    .line 1185
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setRotate(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1186
    return-void

    .line 1187
    .line 1188
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1189
    .line 1190
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1191
    .line 1192
    if-nez p3, :cond_42

    .line 1193
    goto :goto_14

    .line 1194
    :cond_42
    move-object v4, p3

    .line 1195
    .line 1196
    check-cast v4, Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    :goto_14
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1200
    return-void

    .line 1201
    .line 1202
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1203
    .line 1204
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1205
    .line 1206
    if-nez p3, :cond_43

    .line 1207
    goto :goto_15

    .line 1208
    :cond_43
    move-object v4, p3

    .line 1209
    .line 1210
    check-cast v4, Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    :goto_15
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1214
    return-void

    .line 1215
    .line 1216
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1217
    .line 1218
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1219
    .line 1220
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1221
    .line 1222
    .line 1223
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1224
    return-void

    .line 1225
    .line 1226
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1227
    .line 1228
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1229
    .line 1230
    if-nez p3, :cond_44

    .line 1231
    goto :goto_16

    .line 1232
    :cond_44
    move-object v4, p3

    .line 1233
    .line 1234
    check-cast v4, Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    :goto_16
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMethod(Landroid/view/View;Ljava/lang/String;)V

    .line 1238
    return-void

    .line 1239
    .line 1240
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1241
    .line 1242
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1243
    .line 1244
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1245
    .line 1246
    .line 1247
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1248
    return-void

    .line 1249
    .line 1250
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1251
    .line 1252
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1253
    .line 1254
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1255
    .line 1256
    .line 1257
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1258
    .line 1259
    .line 1260
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setVerticalAlign(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1261
    return-void

    .line 1262
    .line 1263
    :pswitch_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1264
    .line 1265
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1266
    .line 1267
    if-nez p3, :cond_45

    .line 1268
    goto :goto_17

    .line 1269
    :cond_45
    move-object v4, p3

    .line 1270
    .line 1271
    check-cast v4, Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    :goto_17
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setAlignmentBaseline(Landroid/view/View;Ljava/lang/String;)V

    .line 1275
    return-void

    .line 1276
    .line 1277
    :pswitch_2a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1278
    .line 1279
    if-nez p3, :cond_46

    .line 1280
    goto :goto_18

    .line 1281
    .line 1282
    :cond_46
    check-cast p3, Ljava/lang/Double;

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1286
    move-result v2

    .line 1287
    .line 1288
    .line 1289
    :goto_18
    invoke-virtual {p2, p1, v2}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 1290
    return-void

    .line 1291
    .line 1292
    :pswitch_2b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1293
    .line 1294
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1295
    .line 1296
    if-nez p3, :cond_47

    .line 1297
    goto :goto_19

    .line 1298
    :cond_47
    move-object v4, p3

    .line 1299
    .line 1300
    check-cast v4, Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    :goto_19
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 1304
    return-void

    .line 1305
    .line 1306
    :pswitch_2c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1307
    .line 1308
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1309
    .line 1310
    if-nez p3, :cond_48

    .line 1311
    goto :goto_1a

    .line 1312
    :cond_48
    move-object v4, p3

    .line 1313
    .line 1314
    check-cast v4, Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    :goto_1a
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setLengthAdjust(Landroid/view/View;Ljava/lang/String;)V

    .line 1318
    return-void

    .line 1319
    .line 1320
    :pswitch_2d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1321
    .line 1322
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1323
    .line 1324
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1325
    .line 1326
    .line 1327
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1328
    .line 1329
    .line 1330
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setStartOffset(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1331
    return-void

    .line 1332
    .line 1333
    :pswitch_2e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1334
    .line 1335
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;

    .line 1336
    .line 1337
    if-nez p3, :cond_49

    .line 1338
    goto :goto_1b

    .line 1339
    :cond_49
    move-object v4, p3

    .line 1340
    .line 1341
    check-cast v4, Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    :goto_1b
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTextPathManagerInterface;->setSpacing(Landroid/view/View;Ljava/lang/String;)V

    .line 1345
    return-void

    .line 1346
    nop

    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
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
    :sswitch_data_0
    .sparse-switch
        -0x77ef1bbd -> :sswitch_2e
        -0x76d93c6b -> :sswitch_2d
        -0x5f8de5eb -> :sswitch_2c
        -0x4bf73488 -> :sswitch_2b
        -0x4b8807f5 -> :sswitch_2a
        -0x45d9a6b8 -> :sswitch_29
        -0x43f186d1 -> :sswitch_28
        -0x4072683f -> :sswitch_27
        -0x403a2f1f -> :sswitch_26
        -0x3b3da15f -> :sswitch_25
        -0x37a9a5bf -> :sswitch_24
        -0x37a98852 -> :sswitch_23
        -0x372522a5 -> :sswitch_22
        -0x352a89c8 -> :sswitch_21
        -0x2bc67c59 -> :sswitch_20
        -0x2b7578e1 -> :sswitch_1f
        -0x18d3d54d -> :sswitch_1e
        -0x117e564a -> :sswitch_1d
        -0x3330ef8 -> :sswitch_1c
        -0x2a83503 -> :sswitch_1b
        0x78 -> :sswitch_1a
        0x79 -> :sswitch_19
        0xc94 -> :sswitch_18
        0xc95 -> :sswitch_17
        0x2ff583 -> :sswitch_16
        0x300c4f -> :sswitch_15
        0x30ff2b -> :sswitch_14
        0x3306ec -> :sswitch_13
        0x337a8b -> :sswitch_12
        0x35dd57 -> :sswitch_11
        0x4b3162e -> :sswitch_10
        0x5a72f63 -> :sswitch_f
        0x63a48b4 -> :sswitch_e
        0xcf0d448 -> :sswitch_d
        0x1071b93d -> :sswitch_c
        0x15caa0f0 -> :sswitch_b
        0x17f096af -> :sswitch_a
        0x2e60023a -> :sswitch_9
        0x36b25395 -> :sswitch_8
        0x36b3866c -> :sswitch_7
        0x3d3f8e06 -> :sswitch_6
        0x3ed9665c -> :sswitch_5
        0x619a1673 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
