.class public Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSVGTSpanManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface<",
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
    const/16 v5, 0x29

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
    const/16 v5, 0x28

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
    const/16 v5, 0x27

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
    const/16 v5, 0x26

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
    const/16 v5, 0x25

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    .line 96
    :sswitch_5
    const-string/jumbo v6, "strokeLinecap"

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    move-result v6

    .line 101
    .line 102
    if-nez v6, :cond_5

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :cond_5
    const/16 v5, 0x24

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :sswitch_6
    const-string v6, "content"

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
    const/16 v5, 0x23

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
    const/16 v5, 0x22

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
    const/16 v5, 0x21

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
    const/16 v5, 0x20

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
    const/16 v5, 0x1f

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
    const/16 v5, 0x1e

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
    const/16 v5, 0x1d

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
    const/16 v5, 0x1c

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
    const/16 v5, 0x1b

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
    const/16 v5, 0x1a

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
    const/16 v5, 0x19

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :sswitch_11
    const-string v6, "name"

    .line 268
    .line 269
    .line 270
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    move-result v6

    .line 272
    .line 273
    if-nez v6, :cond_11

    .line 274
    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
    :cond_11
    const/16 v5, 0x18

    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :sswitch_12
    const-string v6, "mask"

    .line 282
    .line 283
    .line 284
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    move-result v6

    .line 286
    .line 287
    if-nez v6, :cond_12

    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_12
    const/16 v5, 0x17

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :sswitch_13
    const-string v6, "font"

    .line 296
    .line 297
    .line 298
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    move-result v6

    .line 300
    .line 301
    if-nez v6, :cond_13

    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_13
    const/16 v5, 0x16

    .line 306
    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :sswitch_14
    const-string v6, "fill"

    .line 310
    .line 311
    .line 312
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    move-result v6

    .line 314
    .line 315
    if-nez v6, :cond_14

    .line 316
    .line 317
    goto/16 :goto_0

    .line 318
    .line 319
    :cond_14
    const/16 v5, 0x15

    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :sswitch_15
    const-string v6, "dy"

    .line 324
    .line 325
    .line 326
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    move-result v6

    .line 328
    .line 329
    if-nez v6, :cond_15

    .line 330
    .line 331
    goto/16 :goto_0

    .line 332
    .line 333
    :cond_15
    const/16 v5, 0x14

    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :sswitch_16
    const-string v6, "dx"

    .line 338
    .line 339
    .line 340
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    move-result v6

    .line 342
    .line 343
    if-nez v6, :cond_16

    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :cond_16
    const/16 v5, 0x13

    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    .line 352
    :sswitch_17
    const-string/jumbo v6, "y"

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
    const/16 v5, 0x12

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    .line 367
    :sswitch_18
    const-string/jumbo v6, "x"

    .line 368
    .line 369
    .line 370
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    move-result v6

    .line 372
    .line 373
    if-nez v6, :cond_18

    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :cond_18
    const/16 v5, 0x11

    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    .line 382
    :sswitch_19
    const-string/jumbo v6, "strokeDashoffset"

    .line 383
    .line 384
    .line 385
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    move-result v6

    .line 387
    .line 388
    if-nez v6, :cond_19

    .line 389
    .line 390
    goto/16 :goto_0

    .line 391
    .line 392
    :cond_19
    const/16 v5, 0x10

    .line 393
    .line 394
    goto/16 :goto_0

    .line 395
    .line 396
    :sswitch_1a
    const-string v6, "fillOpacity"

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
    const/16 v5, 0xf

    .line 407
    .line 408
    goto/16 :goto_0

    .line 409
    .line 410
    .line 411
    :sswitch_1b
    const-string/jumbo v6, "pointerEvents"

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
    const/16 v5, 0xe

    .line 422
    .line 423
    goto/16 :goto_0

    .line 424
    .line 425
    .line 426
    :sswitch_1c
    const-string/jumbo v6, "strokeOpacity"

    .line 427
    .line 428
    .line 429
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 430
    move-result v6

    .line 431
    .line 432
    if-nez v6, :cond_1c

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :cond_1c
    const/16 v5, 0xd

    .line 437
    .line 438
    goto/16 :goto_0

    .line 439
    .line 440
    :sswitch_1d
    const-string v6, "fillRule"

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
    const/16 v5, 0xc

    .line 451
    .line 452
    goto/16 :goto_0

    .line 453
    .line 454
    :sswitch_1e
    const-string v6, "fontWeight"

    .line 455
    .line 456
    .line 457
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    move-result v6

    .line 459
    .line 460
    if-nez v6, :cond_1e

    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :cond_1e
    const/16 v5, 0xb

    .line 465
    .line 466
    goto/16 :goto_0

    .line 467
    .line 468
    .line 469
    :sswitch_1f
    const-string/jumbo v6, "stroke"

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
    const/16 v5, 0xa

    .line 480
    .line 481
    goto/16 :goto_0

    .line 482
    .line 483
    .line 484
    :sswitch_20
    const-string/jumbo v6, "rotate"

    .line 485
    .line 486
    .line 487
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 488
    move-result v6

    .line 489
    .line 490
    if-nez v6, :cond_20

    .line 491
    .line 492
    goto/16 :goto_0

    .line 493
    .line 494
    :cond_20
    const/16 v5, 0x9

    .line 495
    .line 496
    goto/16 :goto_0

    .line 497
    .line 498
    :sswitch_21
    const-string v6, "markerMid"

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
    const/16 v5, 0x8

    .line 509
    .line 510
    goto/16 :goto_0

    .line 511
    .line 512
    :sswitch_22
    const-string v6, "markerEnd"

    .line 513
    .line 514
    .line 515
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 516
    move-result v6

    .line 517
    .line 518
    if-nez v6, :cond_22

    .line 519
    goto :goto_0

    .line 520
    :cond_22
    const/4 v5, 0x7

    .line 521
    goto :goto_0

    .line 522
    .line 523
    .line 524
    :sswitch_23
    const-string/jumbo v6, "propList"

    .line 525
    .line 526
    .line 527
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    move-result v6

    .line 529
    .line 530
    if-nez v6, :cond_23

    .line 531
    goto :goto_0

    .line 532
    :cond_23
    const/4 v5, 0x6

    .line 533
    goto :goto_0

    .line 534
    .line 535
    :sswitch_24
    const-string v6, "matrix"

    .line 536
    .line 537
    .line 538
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    move-result v6

    .line 540
    .line 541
    if-nez v6, :cond_24

    .line 542
    goto :goto_0

    .line 543
    :cond_24
    const/4 v5, 0x5

    .line 544
    goto :goto_0

    .line 545
    .line 546
    .line 547
    :sswitch_25
    const-string/jumbo v6, "verticalAlign"

    .line 548
    .line 549
    .line 550
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 551
    move-result v6

    .line 552
    .line 553
    if-nez v6, :cond_25

    .line 554
    goto :goto_0

    .line 555
    :cond_25
    const/4 v5, 0x4

    .line 556
    goto :goto_0

    .line 557
    .line 558
    :sswitch_26
    const-string v6, "alignmentBaseline"

    .line 559
    .line 560
    .line 561
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 562
    move-result v6

    .line 563
    .line 564
    if-nez v6, :cond_26

    .line 565
    goto :goto_0

    .line 566
    :cond_26
    const/4 v5, 0x3

    .line 567
    goto :goto_0

    .line 568
    .line 569
    :sswitch_27
    const-string v6, "opacity"

    .line 570
    .line 571
    .line 572
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 573
    move-result v6

    .line 574
    .line 575
    if-nez v6, :cond_27

    .line 576
    goto :goto_0

    .line 577
    :cond_27
    const/4 v5, 0x2

    .line 578
    goto :goto_0

    .line 579
    .line 580
    :sswitch_28
    const-string v6, "filter"

    .line 581
    .line 582
    .line 583
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    move-result v6

    .line 585
    .line 586
    if-nez v6, :cond_28

    .line 587
    goto :goto_0

    .line 588
    :cond_28
    move v5, v0

    .line 589
    goto :goto_0

    .line 590
    .line 591
    :sswitch_29
    const-string v6, "lengthAdjust"

    .line 592
    .line 593
    .line 594
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 595
    move-result v6

    .line 596
    .line 597
    if-nez v6, :cond_29

    .line 598
    goto :goto_0

    .line 599
    :cond_29
    move v5, v3

    .line 600
    .line 601
    .line 602
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 603
    .line 604
    .line 605
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 606
    return-void

    .line 607
    .line 608
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 609
    .line 610
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 611
    .line 612
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 613
    .line 614
    .line 615
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 619
    return-void

    .line 620
    .line 621
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 622
    .line 623
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 624
    .line 625
    if-nez p3, :cond_2a

    .line 626
    goto :goto_1

    .line 627
    .line 628
    :cond_2a
    check-cast p3, Ljava/lang/Boolean;

    .line 629
    .line 630
    .line 631
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 632
    move-result v3

    .line 633
    .line 634
    .line 635
    :goto_1
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 636
    return-void

    .line 637
    .line 638
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 639
    .line 640
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 641
    .line 642
    if-nez p3, :cond_2b

    .line 643
    goto :goto_2

    .line 644
    .line 645
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 646
    .line 647
    .line 648
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 649
    move-result v3

    .line 650
    .line 651
    .line 652
    :goto_2
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 653
    return-void

    .line 654
    .line 655
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 656
    .line 657
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 658
    .line 659
    if-nez p3, :cond_2c

    .line 660
    goto :goto_3

    .line 661
    :cond_2c
    move-object v4, p3

    .line 662
    .line 663
    check-cast v4, Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    :goto_3
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 667
    return-void

    .line 668
    .line 669
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 670
    .line 671
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 672
    .line 673
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 674
    .line 675
    .line 676
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setTextLength(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 680
    return-void

    .line 681
    .line 682
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 683
    .line 684
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 685
    .line 686
    if-nez p3, :cond_2d

    .line 687
    goto :goto_4

    .line 688
    .line 689
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 690
    .line 691
    .line 692
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 693
    move-result v3

    .line 694
    .line 695
    .line 696
    :goto_4
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 697
    return-void

    .line 698
    .line 699
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 700
    .line 701
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 702
    .line 703
    if-nez p3, :cond_2e

    .line 704
    goto :goto_5

    .line 705
    :cond_2e
    move-object v4, p3

    .line 706
    .line 707
    check-cast v4, Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    :goto_5
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setContent(Landroid/view/View;Ljava/lang/String;)V

    .line 711
    return-void

    .line 712
    .line 713
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 714
    .line 715
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 716
    .line 717
    if-nez p3, :cond_2f

    .line 718
    goto :goto_6

    .line 719
    .line 720
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 721
    .line 722
    .line 723
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 724
    move-result v3

    .line 725
    .line 726
    .line 727
    :goto_6
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 728
    return-void

    .line 729
    .line 730
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 731
    .line 732
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 733
    .line 734
    if-nez p3, :cond_30

    .line 735
    goto :goto_7

    .line 736
    :cond_30
    move-object v4, p3

    .line 737
    .line 738
    check-cast v4, Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    :goto_7
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 742
    return-void

    .line 743
    .line 744
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 745
    .line 746
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 747
    .line 748
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 749
    .line 750
    .line 751
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setInlineSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 755
    return-void

    .line 756
    .line 757
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 758
    .line 759
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 760
    .line 761
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 762
    .line 763
    .line 764
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 768
    return-void

    .line 769
    .line 770
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 771
    .line 772
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 773
    .line 774
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 775
    .line 776
    .line 777
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFontSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 781
    return-void

    .line 782
    .line 783
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 784
    .line 785
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

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
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setBaselineShift(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 794
    return-void

    .line 795
    .line 796
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 797
    .line 798
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 799
    .line 800
    if-nez p3, :cond_31

    .line 801
    goto :goto_8

    .line 802
    :cond_31
    move-object v4, p3

    .line 803
    .line 804
    check-cast v4, Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    :goto_8
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 808
    return-void

    .line 809
    .line 810
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 811
    .line 812
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 813
    .line 814
    if-nez p3, :cond_32

    .line 815
    goto :goto_9

    .line 816
    .line 817
    :cond_32
    check-cast p3, Ljava/lang/Double;

    .line 818
    .line 819
    .line 820
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 821
    move-result v3

    .line 822
    .line 823
    .line 824
    :goto_9
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 825
    return-void

    .line 826
    .line 827
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 828
    .line 829
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 830
    .line 831
    .line 832
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 833
    move-result-object v0

    .line 834
    .line 835
    .line 836
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 837
    move-result-object p3

    .line 838
    .line 839
    .line 840
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 841
    return-void

    .line 842
    .line 843
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 844
    .line 845
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 846
    .line 847
    if-nez p3, :cond_33

    .line 848
    goto :goto_a

    .line 849
    .line 850
    :cond_33
    check-cast p3, Ljava/lang/Double;

    .line 851
    .line 852
    .line 853
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 854
    move-result v1

    .line 855
    .line 856
    .line 857
    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 858
    return-void

    .line 859
    .line 860
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 861
    .line 862
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 863
    .line 864
    if-nez p3, :cond_34

    .line 865
    goto :goto_b

    .line 866
    :cond_34
    move-object v4, p3

    .line 867
    .line 868
    check-cast v4, Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    :goto_b
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 872
    return-void

    .line 873
    .line 874
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 875
    .line 876
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 877
    .line 878
    if-nez p3, :cond_35

    .line 879
    goto :goto_c

    .line 880
    :cond_35
    move-object v4, p3

    .line 881
    .line 882
    check-cast v4, Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    :goto_c
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 886
    return-void

    .line 887
    .line 888
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 889
    .line 890
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 891
    .line 892
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 893
    .line 894
    .line 895
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 896
    .line 897
    .line 898
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 899
    return-void

    .line 900
    .line 901
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 902
    .line 903
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 904
    .line 905
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 906
    .line 907
    .line 908
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 909
    .line 910
    .line 911
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 912
    return-void

    .line 913
    .line 914
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 915
    .line 916
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 917
    .line 918
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 919
    .line 920
    .line 921
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setDy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 925
    return-void

    .line 926
    .line 927
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 928
    .line 929
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 930
    .line 931
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 932
    .line 933
    .line 934
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setDx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 938
    return-void

    .line 939
    .line 940
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 941
    .line 942
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 943
    .line 944
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 945
    .line 946
    .line 947
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 948
    .line 949
    .line 950
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 951
    return-void

    .line 952
    .line 953
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 954
    .line 955
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 956
    .line 957
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 958
    .line 959
    .line 960
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 961
    .line 962
    .line 963
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 964
    return-void

    .line 965
    .line 966
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 967
    .line 968
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 969
    .line 970
    if-nez p3, :cond_36

    .line 971
    goto :goto_d

    .line 972
    .line 973
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 974
    .line 975
    .line 976
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 977
    move-result v1

    .line 978
    .line 979
    .line 980
    :goto_d
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 981
    return-void

    .line 982
    .line 983
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 984
    .line 985
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 986
    .line 987
    if-nez p3, :cond_37

    .line 988
    goto :goto_e

    .line 989
    .line 990
    :cond_37
    check-cast p3, Ljava/lang/Double;

    .line 991
    .line 992
    .line 993
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 994
    move-result v2

    .line 995
    .line 996
    .line 997
    :goto_e
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 998
    return-void

    .line 999
    .line 1000
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1001
    .line 1002
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1003
    .line 1004
    if-nez p3, :cond_38

    .line 1005
    goto :goto_f

    .line 1006
    :cond_38
    move-object v4, p3

    .line 1007
    .line 1008
    check-cast v4, Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1012
    return-void

    .line 1013
    .line 1014
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1015
    .line 1016
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1017
    .line 1018
    if-nez p3, :cond_39

    .line 1019
    goto :goto_10

    .line 1020
    .line 1021
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1025
    move-result v2

    .line 1026
    .line 1027
    .line 1028
    :goto_10
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 1029
    return-void

    .line 1030
    .line 1031
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1032
    .line 1033
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1034
    .line 1035
    if-nez p3, :cond_3a

    .line 1036
    goto :goto_11

    .line 1037
    .line 1038
    :cond_3a
    check-cast p3, Ljava/lang/Double;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1042
    move-result v0

    .line 1043
    .line 1044
    .line 1045
    :goto_11
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1046
    return-void

    .line 1047
    .line 1048
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1049
    .line 1050
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1051
    .line 1052
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1053
    .line 1054
    .line 1055
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1056
    .line 1057
    .line 1058
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFontWeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1059
    return-void

    .line 1060
    .line 1061
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1062
    .line 1063
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1064
    .line 1065
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1066
    .line 1067
    .line 1068
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1069
    .line 1070
    .line 1071
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1072
    return-void

    .line 1073
    .line 1074
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1075
    .line 1076
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1077
    .line 1078
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1079
    .line 1080
    .line 1081
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1082
    .line 1083
    .line 1084
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setRotate(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1085
    return-void

    .line 1086
    .line 1087
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1088
    .line 1089
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1090
    .line 1091
    if-nez p3, :cond_3b

    .line 1092
    goto :goto_12

    .line 1093
    :cond_3b
    move-object v4, p3

    .line 1094
    .line 1095
    check-cast v4, Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    :goto_12
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1099
    return-void

    .line 1100
    .line 1101
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1102
    .line 1103
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1104
    .line 1105
    if-nez p3, :cond_3c

    .line 1106
    goto :goto_13

    .line 1107
    :cond_3c
    move-object v4, p3

    .line 1108
    .line 1109
    check-cast v4, Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    :goto_13
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1113
    return-void

    .line 1114
    .line 1115
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1116
    .line 1117
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1118
    .line 1119
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1120
    .line 1121
    .line 1122
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1123
    return-void

    .line 1124
    .line 1125
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1126
    .line 1127
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1128
    .line 1129
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1130
    .line 1131
    .line 1132
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1133
    return-void

    .line 1134
    .line 1135
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1136
    .line 1137
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1138
    .line 1139
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1140
    .line 1141
    .line 1142
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1143
    .line 1144
    .line 1145
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setVerticalAlign(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1146
    return-void

    .line 1147
    .line 1148
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1149
    .line 1150
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1151
    .line 1152
    if-nez p3, :cond_3d

    .line 1153
    goto :goto_14

    .line 1154
    :cond_3d
    move-object v4, p3

    .line 1155
    .line 1156
    check-cast v4, Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    :goto_14
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setAlignmentBaseline(Landroid/view/View;Ljava/lang/String;)V

    .line 1160
    return-void

    .line 1161
    .line 1162
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1163
    .line 1164
    if-nez p3, :cond_3e

    .line 1165
    goto :goto_15

    .line 1166
    .line 1167
    :cond_3e
    check-cast p3, Ljava/lang/Double;

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1171
    move-result v2

    .line 1172
    .line 1173
    .line 1174
    :goto_15
    invoke-virtual {p2, p1, v2}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 1175
    return-void

    .line 1176
    .line 1177
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1178
    .line 1179
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1180
    .line 1181
    if-nez p3, :cond_3f

    .line 1182
    goto :goto_16

    .line 1183
    :cond_3f
    move-object v4, p3

    .line 1184
    .line 1185
    check-cast v4, Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    :goto_16
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 1189
    return-void

    .line 1190
    .line 1191
    :pswitch_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1192
    .line 1193
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1194
    .line 1195
    if-nez p3, :cond_40

    .line 1196
    goto :goto_17

    .line 1197
    :cond_40
    move-object v4, p3

    .line 1198
    .line 1199
    check-cast v4, Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    :goto_17
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setLengthAdjust(Landroid/view/View;Ljava/lang/String;)V

    .line 1203
    return-void

    .line 1204
    nop

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
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
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
    :sswitch_data_0
    .sparse-switch
        -0x5f8de5eb -> :sswitch_29
        -0x4bf73488 -> :sswitch_28
        -0x4b8807f5 -> :sswitch_27
        -0x45d9a6b8 -> :sswitch_26
        -0x43f186d1 -> :sswitch_25
        -0x4072683f -> :sswitch_24
        -0x3b3da15f -> :sswitch_23
        -0x37a9a5bf -> :sswitch_22
        -0x37a98852 -> :sswitch_21
        -0x372522a5 -> :sswitch_20
        -0x352a89c8 -> :sswitch_1f
        -0x2bc67c59 -> :sswitch_1e
        -0x2b7578e1 -> :sswitch_1d
        -0x18d3d54d -> :sswitch_1c
        -0x117e564a -> :sswitch_1b
        -0x3330ef8 -> :sswitch_1a
        -0x2a83503 -> :sswitch_19
        0x78 -> :sswitch_18
        0x79 -> :sswitch_17
        0xc94 -> :sswitch_16
        0xc95 -> :sswitch_15
        0x2ff583 -> :sswitch_14
        0x300c4f -> :sswitch_13
        0x3306ec -> :sswitch_12
        0x337a8b -> :sswitch_11
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
        0x38b73479 -> :sswitch_6
        0x3d3f8e06 -> :sswitch_5
        0x619a1673 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
