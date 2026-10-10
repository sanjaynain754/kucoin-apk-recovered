.class public Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSVGForeignObjectManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface<",
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
    const/16 v5, 0x21

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
    const/16 v5, 0x20

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
    const/16 v5, 0x1f

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
    const/16 v5, 0x1e

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    .line 81
    :sswitch_4
    const-string/jumbo v6, "strokeLinecap"

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
    const/16 v5, 0x1d

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :sswitch_5
    const-string v6, "clipRule"

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
    const/16 v5, 0x1c

    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :sswitch_6
    const-string v6, "clipPath"

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    move-result v6

    .line 114
    .line 115
    if-nez v6, :cond_6

    .line 116
    .line 117
    goto/16 :goto_0

    .line 118
    .line 119
    :cond_6
    const/16 v5, 0x1b

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    .line 124
    :sswitch_7
    const-string/jumbo v6, "strokeDasharray"

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
    const/16 v5, 0x1a

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :sswitch_8
    const-string v6, "fontSize"

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
    const/16 v5, 0x19

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :sswitch_9
    const-string v6, "markerStart"

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
    const/16 v5, 0x18

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    .line 167
    :sswitch_a
    const-string/jumbo v6, "width"

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
    const/16 v5, 0x17

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    .line 182
    :sswitch_b
    const-string/jumbo v6, "vectorEffect"

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    move-result v6

    .line 187
    .line 188
    if-nez v6, :cond_b

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_b
    const/16 v5, 0x16

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :sswitch_c
    const-string v6, "color"

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    move-result v6

    .line 201
    .line 202
    if-nez v6, :cond_c

    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_c
    const/16 v5, 0x15

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    .line 211
    :sswitch_d
    const-string/jumbo v6, "strokeMiterlimit"

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    move-result v6

    .line 216
    .line 217
    if-nez v6, :cond_d

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_d
    const/16 v5, 0x14

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :sswitch_e
    const-string v6, "name"

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    move-result v6

    .line 230
    .line 231
    if-nez v6, :cond_e

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_e
    const/16 v5, 0x13

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :sswitch_f
    const-string v6, "mask"

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    move-result v6

    .line 244
    .line 245
    if-nez v6, :cond_f

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_f
    const/16 v5, 0x12

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :sswitch_10
    const-string v6, "font"

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
    const/16 v5, 0x11

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :sswitch_11
    const-string v6, "fill"

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
    const/16 v5, 0x10

    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    .line 282
    :sswitch_12
    const-string/jumbo v6, "y"

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
    const/16 v5, 0xf

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    .line 297
    :sswitch_13
    const-string/jumbo v6, "x"

    .line 298
    .line 299
    .line 300
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    move-result v6

    .line 302
    .line 303
    if-nez v6, :cond_13

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_13
    const/16 v5, 0xe

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    .line 312
    :sswitch_14
    const-string/jumbo v6, "strokeDashoffset"

    .line 313
    .line 314
    .line 315
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    move-result v6

    .line 317
    .line 318
    if-nez v6, :cond_14

    .line 319
    .line 320
    goto/16 :goto_0

    .line 321
    .line 322
    :cond_14
    const/16 v5, 0xd

    .line 323
    .line 324
    goto/16 :goto_0

    .line 325
    .line 326
    :sswitch_15
    const-string v6, "fillOpacity"

    .line 327
    .line 328
    .line 329
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    move-result v6

    .line 331
    .line 332
    if-nez v6, :cond_15

    .line 333
    .line 334
    goto/16 :goto_0

    .line 335
    .line 336
    :cond_15
    const/16 v5, 0xc

    .line 337
    .line 338
    goto/16 :goto_0

    .line 339
    .line 340
    .line 341
    :sswitch_16
    const-string/jumbo v6, "pointerEvents"

    .line 342
    .line 343
    .line 344
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    move-result v6

    .line 346
    .line 347
    if-nez v6, :cond_16

    .line 348
    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_16
    const/16 v5, 0xb

    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    .line 356
    :sswitch_17
    const-string/jumbo v6, "strokeOpacity"

    .line 357
    .line 358
    .line 359
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    move-result v6

    .line 361
    .line 362
    if-nez v6, :cond_17

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :cond_17
    const/16 v5, 0xa

    .line 367
    .line 368
    goto/16 :goto_0

    .line 369
    .line 370
    :sswitch_18
    const-string v6, "fillRule"

    .line 371
    .line 372
    .line 373
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    move-result v6

    .line 375
    .line 376
    if-nez v6, :cond_18

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :cond_18
    const/16 v5, 0x9

    .line 381
    .line 382
    goto/16 :goto_0

    .line 383
    .line 384
    :sswitch_19
    const-string v6, "fontWeight"

    .line 385
    .line 386
    .line 387
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    move-result v6

    .line 389
    .line 390
    if-nez v6, :cond_19

    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :cond_19
    const/16 v5, 0x8

    .line 395
    .line 396
    goto/16 :goto_0

    .line 397
    .line 398
    .line 399
    :sswitch_1a
    const-string/jumbo v6, "stroke"

    .line 400
    .line 401
    .line 402
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    move-result v6

    .line 404
    .line 405
    if-nez v6, :cond_1a

    .line 406
    goto :goto_0

    .line 407
    :cond_1a
    const/4 v5, 0x7

    .line 408
    goto :goto_0

    .line 409
    .line 410
    :sswitch_1b
    const-string v6, "markerMid"

    .line 411
    .line 412
    .line 413
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    move-result v6

    .line 415
    .line 416
    if-nez v6, :cond_1b

    .line 417
    goto :goto_0

    .line 418
    :cond_1b
    const/4 v5, 0x6

    .line 419
    goto :goto_0

    .line 420
    .line 421
    :sswitch_1c
    const-string v6, "markerEnd"

    .line 422
    .line 423
    .line 424
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    move-result v6

    .line 426
    .line 427
    if-nez v6, :cond_1c

    .line 428
    goto :goto_0

    .line 429
    :cond_1c
    const/4 v5, 0x5

    .line 430
    goto :goto_0

    .line 431
    .line 432
    .line 433
    :sswitch_1d
    const-string/jumbo v6, "propList"

    .line 434
    .line 435
    .line 436
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    move-result v6

    .line 438
    .line 439
    if-nez v6, :cond_1d

    .line 440
    goto :goto_0

    .line 441
    :cond_1d
    const/4 v5, 0x4

    .line 442
    goto :goto_0

    .line 443
    .line 444
    :sswitch_1e
    const-string v6, "matrix"

    .line 445
    .line 446
    .line 447
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    move-result v6

    .line 449
    .line 450
    if-nez v6, :cond_1e

    .line 451
    goto :goto_0

    .line 452
    :cond_1e
    const/4 v5, 0x3

    .line 453
    goto :goto_0

    .line 454
    .line 455
    :sswitch_1f
    const-string v6, "height"

    .line 456
    .line 457
    .line 458
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 459
    move-result v6

    .line 460
    .line 461
    if-nez v6, :cond_1f

    .line 462
    goto :goto_0

    .line 463
    :cond_1f
    const/4 v5, 0x2

    .line 464
    goto :goto_0

    .line 465
    .line 466
    :sswitch_20
    const-string v6, "opacity"

    .line 467
    .line 468
    .line 469
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    move-result v6

    .line 471
    .line 472
    if-nez v6, :cond_20

    .line 473
    goto :goto_0

    .line 474
    :cond_20
    move v5, v0

    .line 475
    goto :goto_0

    .line 476
    .line 477
    :sswitch_21
    const-string v6, "filter"

    .line 478
    .line 479
    .line 480
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    move-result v6

    .line 482
    .line 483
    if-nez v6, :cond_21

    .line 484
    goto :goto_0

    .line 485
    :cond_21
    move v5, v3

    .line 486
    .line 487
    .line 488
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 489
    .line 490
    .line 491
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 492
    return-void

    .line 493
    .line 494
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 495
    .line 496
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 497
    .line 498
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 499
    .line 500
    .line 501
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 505
    return-void

    .line 506
    .line 507
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 508
    .line 509
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 510
    .line 511
    if-nez p3, :cond_22

    .line 512
    goto :goto_1

    .line 513
    .line 514
    :cond_22
    check-cast p3, Ljava/lang/Boolean;

    .line 515
    .line 516
    .line 517
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 518
    move-result v3

    .line 519
    .line 520
    .line 521
    :goto_1
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 522
    return-void

    .line 523
    .line 524
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 525
    .line 526
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 527
    .line 528
    if-nez p3, :cond_23

    .line 529
    goto :goto_2

    .line 530
    .line 531
    :cond_23
    check-cast p3, Ljava/lang/Double;

    .line 532
    .line 533
    .line 534
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 535
    move-result v3

    .line 536
    .line 537
    .line 538
    :goto_2
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 539
    return-void

    .line 540
    .line 541
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 542
    .line 543
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 544
    .line 545
    if-nez p3, :cond_24

    .line 546
    goto :goto_3

    .line 547
    :cond_24
    move-object v4, p3

    .line 548
    .line 549
    check-cast v4, Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    :goto_3
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 553
    return-void

    .line 554
    .line 555
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 556
    .line 557
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 558
    .line 559
    if-nez p3, :cond_25

    .line 560
    goto :goto_4

    .line 561
    .line 562
    :cond_25
    check-cast p3, Ljava/lang/Double;

    .line 563
    .line 564
    .line 565
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 566
    move-result v3

    .line 567
    .line 568
    .line 569
    :goto_4
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 570
    return-void

    .line 571
    .line 572
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 573
    .line 574
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 575
    .line 576
    if-nez p3, :cond_26

    .line 577
    goto :goto_5

    .line 578
    .line 579
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 580
    .line 581
    .line 582
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 583
    move-result v3

    .line 584
    .line 585
    .line 586
    :goto_5
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 587
    return-void

    .line 588
    .line 589
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 590
    .line 591
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 592
    .line 593
    if-nez p3, :cond_27

    .line 594
    goto :goto_6

    .line 595
    :cond_27
    move-object v4, p3

    .line 596
    .line 597
    check-cast v4, Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    :goto_6
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 601
    return-void

    .line 602
    .line 603
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 604
    .line 605
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 606
    .line 607
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 608
    .line 609
    .line 610
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 614
    return-void

    .line 615
    .line 616
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 617
    .line 618
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 619
    .line 620
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 621
    .line 622
    .line 623
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFontSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 627
    return-void

    .line 628
    .line 629
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 630
    .line 631
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 632
    .line 633
    if-nez p3, :cond_28

    .line 634
    goto :goto_7

    .line 635
    :cond_28
    move-object v4, p3

    .line 636
    .line 637
    check-cast v4, Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    :goto_7
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 641
    return-void

    .line 642
    .line 643
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 644
    .line 645
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 646
    .line 647
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 648
    .line 649
    .line 650
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 654
    return-void

    .line 655
    .line 656
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 657
    .line 658
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 659
    .line 660
    if-nez p3, :cond_29

    .line 661
    goto :goto_8

    .line 662
    .line 663
    :cond_29
    check-cast p3, Ljava/lang/Double;

    .line 664
    .line 665
    .line 666
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 667
    move-result v3

    .line 668
    .line 669
    .line 670
    :goto_8
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 671
    return-void

    .line 672
    .line 673
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 674
    .line 675
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 676
    .line 677
    .line 678
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 679
    move-result-object v0

    .line 680
    .line 681
    .line 682
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 683
    move-result-object p3

    .line 684
    .line 685
    .line 686
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 687
    return-void

    .line 688
    .line 689
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 690
    .line 691
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 692
    .line 693
    if-nez p3, :cond_2a

    .line 694
    goto :goto_9

    .line 695
    .line 696
    :cond_2a
    check-cast p3, Ljava/lang/Double;

    .line 697
    .line 698
    .line 699
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 700
    move-result v1

    .line 701
    .line 702
    .line 703
    :goto_9
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 704
    return-void

    .line 705
    .line 706
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 707
    .line 708
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 709
    .line 710
    if-nez p3, :cond_2b

    .line 711
    goto :goto_a

    .line 712
    :cond_2b
    move-object v4, p3

    .line 713
    .line 714
    check-cast v4, Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    :goto_a
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 718
    return-void

    .line 719
    .line 720
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 721
    .line 722
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 723
    .line 724
    if-nez p3, :cond_2c

    .line 725
    goto :goto_b

    .line 726
    :cond_2c
    move-object v4, p3

    .line 727
    .line 728
    check-cast v4, Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    :goto_b
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 732
    return-void

    .line 733
    .line 734
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 735
    .line 736
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 737
    .line 738
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 739
    .line 740
    .line 741
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 745
    return-void

    .line 746
    .line 747
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 748
    .line 749
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 750
    .line 751
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 752
    .line 753
    .line 754
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 758
    return-void

    .line 759
    .line 760
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 761
    .line 762
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 763
    .line 764
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 765
    .line 766
    .line 767
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 768
    .line 769
    .line 770
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 771
    return-void

    .line 772
    .line 773
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 774
    .line 775
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 776
    .line 777
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 778
    .line 779
    .line 780
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 784
    return-void

    .line 785
    .line 786
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 787
    .line 788
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 789
    .line 790
    if-nez p3, :cond_2d

    .line 791
    goto :goto_c

    .line 792
    .line 793
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 794
    .line 795
    .line 796
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 797
    move-result v1

    .line 798
    .line 799
    .line 800
    :goto_c
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 801
    return-void

    .line 802
    .line 803
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 804
    .line 805
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 806
    .line 807
    if-nez p3, :cond_2e

    .line 808
    goto :goto_d

    .line 809
    .line 810
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 811
    .line 812
    .line 813
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 814
    move-result v2

    .line 815
    .line 816
    .line 817
    :goto_d
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 818
    return-void

    .line 819
    .line 820
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 821
    .line 822
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 823
    .line 824
    if-nez p3, :cond_2f

    .line 825
    goto :goto_e

    .line 826
    :cond_2f
    move-object v4, p3

    .line 827
    .line 828
    check-cast v4, Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 832
    return-void

    .line 833
    .line 834
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 835
    .line 836
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 837
    .line 838
    if-nez p3, :cond_30

    .line 839
    goto :goto_f

    .line 840
    .line 841
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 842
    .line 843
    .line 844
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 845
    move-result v2

    .line 846
    .line 847
    .line 848
    :goto_f
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 849
    return-void

    .line 850
    .line 851
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 852
    .line 853
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 854
    .line 855
    if-nez p3, :cond_31

    .line 856
    goto :goto_10

    .line 857
    .line 858
    :cond_31
    check-cast p3, Ljava/lang/Double;

    .line 859
    .line 860
    .line 861
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 862
    move-result v0

    .line 863
    .line 864
    .line 865
    :goto_10
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 866
    return-void

    .line 867
    .line 868
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 869
    .line 870
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 871
    .line 872
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 873
    .line 874
    .line 875
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 876
    .line 877
    .line 878
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFontWeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 879
    return-void

    .line 880
    .line 881
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 882
    .line 883
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 884
    .line 885
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 886
    .line 887
    .line 888
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 892
    return-void

    .line 893
    .line 894
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 895
    .line 896
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 897
    .line 898
    if-nez p3, :cond_32

    .line 899
    goto :goto_11

    .line 900
    :cond_32
    move-object v4, p3

    .line 901
    .line 902
    check-cast v4, Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    :goto_11
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 906
    return-void

    .line 907
    .line 908
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 909
    .line 910
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 911
    .line 912
    if-nez p3, :cond_33

    .line 913
    goto :goto_12

    .line 914
    :cond_33
    move-object v4, p3

    .line 915
    .line 916
    check-cast v4, Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    :goto_12
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 920
    return-void

    .line 921
    .line 922
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 923
    .line 924
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 925
    .line 926
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 927
    .line 928
    .line 929
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 930
    return-void

    .line 931
    .line 932
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 933
    .line 934
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 935
    .line 936
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 937
    .line 938
    .line 939
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 940
    return-void

    .line 941
    .line 942
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 943
    .line 944
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 945
    .line 946
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 947
    .line 948
    .line 949
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 950
    .line 951
    .line 952
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 953
    return-void

    .line 954
    .line 955
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 956
    .line 957
    if-nez p3, :cond_34

    .line 958
    goto :goto_13

    .line 959
    .line 960
    :cond_34
    check-cast p3, Ljava/lang/Double;

    .line 961
    .line 962
    .line 963
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 964
    move-result v2

    .line 965
    .line 966
    .line 967
    :goto_13
    invoke-virtual {p2, p1, v2}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 968
    return-void

    .line 969
    .line 970
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 971
    .line 972
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;

    .line 973
    .line 974
    if-nez p3, :cond_35

    .line 975
    goto :goto_14

    .line 976
    :cond_35
    move-object v4, p3

    .line 977
    .line 978
    check-cast v4, Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    :goto_14
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGForeignObjectManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 982
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x4bf73488 -> :sswitch_21
        -0x4b8807f5 -> :sswitch_20
        -0x48c76ed9 -> :sswitch_1f
        -0x4072683f -> :sswitch_1e
        -0x3b3da15f -> :sswitch_1d
        -0x37a9a5bf -> :sswitch_1c
        -0x37a98852 -> :sswitch_1b
        -0x352a89c8 -> :sswitch_1a
        -0x2bc67c59 -> :sswitch_19
        -0x2b7578e1 -> :sswitch_18
        -0x18d3d54d -> :sswitch_17
        -0x117e564a -> :sswitch_16
        -0x3330ef8 -> :sswitch_15
        -0x2a83503 -> :sswitch_14
        0x78 -> :sswitch_13
        0x79 -> :sswitch_12
        0x2ff583 -> :sswitch_11
        0x300c4f -> :sswitch_10
        0x3306ec -> :sswitch_f
        0x337a8b -> :sswitch_e
        0x4b3162e -> :sswitch_d
        0x5a72f63 -> :sswitch_c
        0x63a48b4 -> :sswitch_b
        0x6be2dc6 -> :sswitch_a
        0xcf0d448 -> :sswitch_9
        0x15caa0f0 -> :sswitch_8
        0x17f096af -> :sswitch_7
        0x36b25395 -> :sswitch_6
        0x36b3866c -> :sswitch_5
        0x3d3f8e06 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
