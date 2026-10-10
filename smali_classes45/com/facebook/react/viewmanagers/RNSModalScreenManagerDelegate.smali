.class public Lcom/facebook/react/viewmanagers/RNSModalScreenManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSModalScreenManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface<",
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
    .line 2
    const/16 v0, 0x18

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    const/high16 v1, -0x40800000    # -1.0f

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, -0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 15
    move-result v6

    .line 16
    .line 17
    .line 18
    sparse-switch v6, :sswitch_data_0

    .line 19
    :goto_0
    move v6, v5

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    .line 24
    :sswitch_0
    const-string/jumbo v6, "sheetExpandsWhenScrolledToEdge"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    move-result v6

    .line 29
    .line 30
    if-nez v6, :cond_0

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    const/16 v6, 0x1e

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :sswitch_1
    const-string v6, "nativeBackButtonDismissalEnabled"

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
    goto :goto_0

    .line 45
    .line 46
    :cond_1
    const/16 v6, 0x1d

    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    .line 51
    :sswitch_2
    const-string/jumbo v6, "statusBarAnimation"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    move-result v6

    .line 56
    .line 57
    if-nez v6, :cond_2

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :cond_2
    const/16 v6, 0x1c

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    .line 65
    :sswitch_3
    const-string/jumbo v6, "sheetGrabberVisible"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    move-result v6

    .line 70
    .line 71
    if-nez v6, :cond_3

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_3
    const/16 v6, 0x1b

    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    .line 79
    :sswitch_4
    const-string/jumbo v6, "sheetElevation"

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    move-result v6

    .line 84
    .line 85
    if-nez v6, :cond_4

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :cond_4
    const/16 v6, 0x1a

    .line 89
    .line 90
    goto/16 :goto_1

    .line 91
    .line 92
    :sswitch_5
    const-string v6, "navigationBarTranslucent"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    move-result v6

    .line 97
    .line 98
    if-nez v6, :cond_5

    .line 99
    goto :goto_0

    .line 100
    .line 101
    :cond_5
    const/16 v6, 0x19

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :sswitch_6
    const-string v6, "customAnimationOnSwipe"

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    move-result v6

    .line 110
    .line 111
    if-nez v6, :cond_6

    .line 112
    goto :goto_0

    .line 113
    :cond_6
    move v6, v0

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    .line 118
    :sswitch_7
    const-string/jumbo v6, "swipeDirection"

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    move-result v6

    .line 123
    .line 124
    if-nez v6, :cond_7

    .line 125
    goto :goto_0

    .line 126
    .line 127
    :cond_7
    const/16 v6, 0x17

    .line 128
    .line 129
    goto/16 :goto_1

    .line 130
    .line 131
    .line 132
    :sswitch_8
    const-string/jumbo v6, "transitionDuration"

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    move-result v6

    .line 137
    .line 138
    if-nez v6, :cond_8

    .line 139
    goto :goto_0

    .line 140
    .line 141
    :cond_8
    const/16 v6, 0x16

    .line 142
    .line 143
    goto/16 :goto_1

    .line 144
    .line 145
    .line 146
    :sswitch_9
    const-string/jumbo v6, "sheetLargestUndimmedDetent"

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    move-result v6

    .line 151
    .line 152
    if-nez v6, :cond_9

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_9
    const/16 v6, 0x15

    .line 157
    .line 158
    goto/16 :goto_1

    .line 159
    .line 160
    .line 161
    :sswitch_a
    const-string/jumbo v6, "screenOrientation"

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    move-result v6

    .line 166
    .line 167
    if-nez v6, :cond_a

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_a
    const/16 v6, 0x14

    .line 172
    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :sswitch_b
    const-string v6, "gestureResponseDistance"

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    move-result v6

    .line 180
    .line 181
    if-nez v6, :cond_b

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_b
    const/16 v6, 0x13

    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :sswitch_c
    const-string v6, "fullScreenSwipeEnabled"

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    move-result v6

    .line 194
    .line 195
    if-nez v6, :cond_c

    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_c
    const/16 v6, 0x12

    .line 200
    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    .line 204
    :sswitch_d
    const-string/jumbo v6, "statusBarHidden"

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    move-result v6

    .line 209
    .line 210
    if-nez v6, :cond_d

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_d
    const/16 v6, 0x11

    .line 215
    .line 216
    goto/16 :goto_1

    .line 217
    .line 218
    .line 219
    :sswitch_e
    const-string/jumbo v6, "preventNativeDismiss"

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    move-result v6

    .line 224
    .line 225
    if-nez v6, :cond_e

    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_e
    const/16 v6, 0x10

    .line 230
    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    .line 234
    :sswitch_f
    const-string/jumbo v6, "replaceAnimation"

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    move-result v6

    .line 239
    .line 240
    if-nez v6, :cond_f

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_f
    const/16 v6, 0xf

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    .line 249
    :sswitch_10
    const-string/jumbo v6, "sheetAllowedDetents"

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    move-result v6

    .line 254
    .line 255
    if-nez v6, :cond_10

    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_10
    const/16 v6, 0xe

    .line 260
    .line 261
    goto/16 :goto_1

    .line 262
    .line 263
    .line 264
    :sswitch_11
    const-string/jumbo v6, "sheetInitialDetent"

    .line 265
    .line 266
    .line 267
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    move-result v6

    .line 269
    .line 270
    if-nez v6, :cond_11

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_11
    const/16 v6, 0xd

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :sswitch_12
    const-string v6, "navigationBarColor"

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    move-result v6

    .line 283
    .line 284
    if-nez v6, :cond_12

    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_12
    const/16 v6, 0xc

    .line 289
    .line 290
    goto/16 :goto_1

    .line 291
    .line 292
    .line 293
    :sswitch_13
    const-string/jumbo v6, "stackAnimation"

    .line 294
    .line 295
    .line 296
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    move-result v6

    .line 298
    .line 299
    if-nez v6, :cond_13

    .line 300
    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :cond_13
    const/16 v6, 0xb

    .line 304
    .line 305
    goto/16 :goto_1

    .line 306
    .line 307
    :sswitch_14
    const-string v6, "fullScreenSwipeShadowEnabled"

    .line 308
    .line 309
    .line 310
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    move-result v6

    .line 312
    .line 313
    if-nez v6, :cond_14

    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_14
    const/16 v6, 0xa

    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    .line 322
    :sswitch_15
    const-string/jumbo v6, "statusBarStyle"

    .line 323
    .line 324
    .line 325
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    move-result v6

    .line 327
    .line 328
    if-nez v6, :cond_15

    .line 329
    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :cond_15
    const/16 v6, 0x9

    .line 333
    .line 334
    goto/16 :goto_1

    .line 335
    .line 336
    .line 337
    :sswitch_16
    const-string/jumbo v6, "statusBarColor"

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
    const/16 v6, 0x8

    .line 348
    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :sswitch_17
    const-string v6, "activityState"

    .line 352
    .line 353
    .line 354
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    move-result v6

    .line 356
    .line 357
    if-nez v6, :cond_17

    .line 358
    .line 359
    goto/16 :goto_0

    .line 360
    :cond_17
    const/4 v6, 0x7

    .line 361
    goto :goto_1

    .line 362
    .line 363
    .line 364
    :sswitch_18
    const-string/jumbo v6, "stackPresentation"

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    move-result v6

    .line 369
    .line 370
    if-nez v6, :cond_18

    .line 371
    .line 372
    goto/16 :goto_0

    .line 373
    :cond_18
    const/4 v6, 0x6

    .line 374
    goto :goto_1

    .line 375
    .line 376
    .line 377
    :sswitch_19
    const-string/jumbo v6, "statusBarTranslucent"

    .line 378
    .line 379
    .line 380
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    move-result v6

    .line 382
    .line 383
    if-nez v6, :cond_19

    .line 384
    .line 385
    goto/16 :goto_0

    .line 386
    :cond_19
    const/4 v6, 0x5

    .line 387
    goto :goto_1

    .line 388
    .line 389
    :sswitch_1a
    const-string v6, "navigationBarHidden"

    .line 390
    .line 391
    .line 392
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    move-result v6

    .line 394
    .line 395
    if-nez v6, :cond_1a

    .line 396
    .line 397
    goto/16 :goto_0

    .line 398
    :cond_1a
    const/4 v6, 0x4

    .line 399
    goto :goto_1

    .line 400
    .line 401
    .line 402
    :sswitch_1b
    const-string/jumbo v6, "sheetCornerRadius"

    .line 403
    .line 404
    .line 405
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 406
    move-result v6

    .line 407
    .line 408
    if-nez v6, :cond_1b

    .line 409
    .line 410
    goto/16 :goto_0

    .line 411
    :cond_1b
    const/4 v6, 0x3

    .line 412
    goto :goto_1

    .line 413
    .line 414
    :sswitch_1c
    const-string v6, "hideKeyboardOnSwipe"

    .line 415
    .line 416
    .line 417
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    move-result v6

    .line 419
    .line 420
    if-nez v6, :cond_1c

    .line 421
    .line 422
    goto/16 :goto_0

    .line 423
    :cond_1c
    const/4 v6, 0x2

    .line 424
    goto :goto_1

    .line 425
    .line 426
    :sswitch_1d
    const-string v6, "gestureEnabled"

    .line 427
    .line 428
    .line 429
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 430
    move-result v6

    .line 431
    .line 432
    if-nez v6, :cond_1d

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    :cond_1d
    move v6, v2

    .line 436
    goto :goto_1

    .line 437
    .line 438
    :sswitch_1e
    const-string v6, "homeIndicatorHidden"

    .line 439
    .line 440
    .line 441
    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    move-result v6

    .line 443
    .line 444
    if-nez v6, :cond_1e

    .line 445
    .line 446
    goto/16 :goto_0

    .line 447
    :cond_1e
    move v6, v4

    .line 448
    .line 449
    .line 450
    :goto_1
    packed-switch v6, :pswitch_data_0

    .line 451
    .line 452
    .line 453
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 454
    return-void

    .line 455
    .line 456
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 457
    .line 458
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 459
    .line 460
    if-nez p3, :cond_1f

    .line 461
    goto :goto_2

    .line 462
    .line 463
    :cond_1f
    check-cast p3, Ljava/lang/Boolean;

    .line 464
    .line 465
    .line 466
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 467
    move-result v4

    .line 468
    .line 469
    .line 470
    :goto_2
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetExpandsWhenScrolledToEdge(Landroid/view/View;Z)V

    .line 471
    return-void

    .line 472
    .line 473
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 474
    .line 475
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 476
    .line 477
    if-nez p3, :cond_20

    .line 478
    goto :goto_3

    .line 479
    .line 480
    :cond_20
    check-cast p3, Ljava/lang/Boolean;

    .line 481
    .line 482
    .line 483
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 484
    move-result v4

    .line 485
    .line 486
    .line 487
    :goto_3
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setNativeBackButtonDismissalEnabled(Landroid/view/View;Z)V

    .line 488
    return-void

    .line 489
    .line 490
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 491
    .line 492
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 493
    .line 494
    if-nez p3, :cond_21

    .line 495
    goto :goto_4

    .line 496
    :cond_21
    move-object v3, p3

    .line 497
    .line 498
    check-cast v3, Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    :goto_4
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 502
    return-void

    .line 503
    .line 504
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 505
    .line 506
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 507
    .line 508
    if-nez p3, :cond_22

    .line 509
    goto :goto_5

    .line 510
    .line 511
    :cond_22
    check-cast p3, Ljava/lang/Boolean;

    .line 512
    .line 513
    .line 514
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 515
    move-result v4

    .line 516
    .line 517
    .line 518
    :goto_5
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetGrabberVisible(Landroid/view/View;Z)V

    .line 519
    return-void

    .line 520
    .line 521
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 522
    .line 523
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 524
    .line 525
    if-nez p3, :cond_23

    .line 526
    goto :goto_6

    .line 527
    .line 528
    :cond_23
    check-cast p3, Ljava/lang/Double;

    .line 529
    .line 530
    .line 531
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 532
    move-result v0

    .line 533
    .line 534
    .line 535
    :goto_6
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetElevation(Landroid/view/View;I)V

    .line 536
    return-void

    .line 537
    .line 538
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 539
    .line 540
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 541
    .line 542
    if-nez p3, :cond_24

    .line 543
    goto :goto_7

    .line 544
    .line 545
    :cond_24
    check-cast p3, Ljava/lang/Boolean;

    .line 546
    .line 547
    .line 548
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 549
    move-result v4

    .line 550
    .line 551
    .line 552
    :goto_7
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setNavigationBarTranslucent(Landroid/view/View;Z)V

    .line 553
    return-void

    .line 554
    .line 555
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 556
    .line 557
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 558
    .line 559
    if-nez p3, :cond_25

    .line 560
    goto :goto_8

    .line 561
    .line 562
    :cond_25
    check-cast p3, Ljava/lang/Boolean;

    .line 563
    .line 564
    .line 565
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 566
    move-result v4

    .line 567
    .line 568
    .line 569
    :goto_8
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setCustomAnimationOnSwipe(Landroid/view/View;Z)V

    .line 570
    return-void

    .line 571
    .line 572
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 573
    .line 574
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 575
    .line 576
    check-cast p3, Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSwipeDirection(Landroid/view/View;Ljava/lang/String;)V

    .line 580
    return-void

    .line 581
    .line 582
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 583
    .line 584
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 585
    .line 586
    if-nez p3, :cond_26

    .line 587
    .line 588
    const/16 p3, 0x1f4

    .line 589
    goto :goto_9

    .line 590
    .line 591
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 592
    .line 593
    .line 594
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 595
    move-result p3

    .line 596
    .line 597
    .line 598
    :goto_9
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setTransitionDuration(Landroid/view/View;I)V

    .line 599
    return-void

    .line 600
    .line 601
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 602
    .line 603
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 604
    .line 605
    if-nez p3, :cond_27

    .line 606
    goto :goto_a

    .line 607
    .line 608
    :cond_27
    check-cast p3, Ljava/lang/Double;

    .line 609
    .line 610
    .line 611
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 612
    move-result v5

    .line 613
    .line 614
    .line 615
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetLargestUndimmedDetent(Landroid/view/View;I)V

    .line 616
    return-void

    .line 617
    .line 618
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 619
    .line 620
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 621
    .line 622
    if-nez p3, :cond_28

    .line 623
    goto :goto_b

    .line 624
    :cond_28
    move-object v3, p3

    .line 625
    .line 626
    check-cast v3, Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    :goto_b
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setScreenOrientation(Landroid/view/View;Ljava/lang/String;)V

    .line 630
    return-void

    .line 631
    .line 632
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 633
    .line 634
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 635
    .line 636
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 637
    .line 638
    .line 639
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setGestureResponseDistance(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 640
    return-void

    .line 641
    .line 642
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 643
    .line 644
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 645
    .line 646
    if-nez p3, :cond_29

    .line 647
    goto :goto_c

    .line 648
    .line 649
    :cond_29
    check-cast p3, Ljava/lang/Boolean;

    .line 650
    .line 651
    .line 652
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 653
    move-result v4

    .line 654
    .line 655
    .line 656
    :goto_c
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setFullScreenSwipeEnabled(Landroid/view/View;Z)V

    .line 657
    return-void

    .line 658
    .line 659
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 660
    .line 661
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 662
    .line 663
    if-nez p3, :cond_2a

    .line 664
    goto :goto_d

    .line 665
    .line 666
    :cond_2a
    check-cast p3, Ljava/lang/Boolean;

    .line 667
    .line 668
    .line 669
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 670
    move-result v4

    .line 671
    .line 672
    .line 673
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarHidden(Landroid/view/View;Z)V

    .line 674
    return-void

    .line 675
    .line 676
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 677
    .line 678
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 679
    .line 680
    if-nez p3, :cond_2b

    .line 681
    goto :goto_e

    .line 682
    .line 683
    :cond_2b
    check-cast p3, Ljava/lang/Boolean;

    .line 684
    .line 685
    .line 686
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 687
    move-result v4

    .line 688
    .line 689
    .line 690
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setPreventNativeDismiss(Landroid/view/View;Z)V

    .line 691
    return-void

    .line 692
    .line 693
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 694
    .line 695
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 696
    .line 697
    check-cast p3, Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setReplaceAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 701
    return-void

    .line 702
    .line 703
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 704
    .line 705
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 706
    .line 707
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 708
    .line 709
    .line 710
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetAllowedDetents(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 711
    return-void

    .line 712
    .line 713
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 714
    .line 715
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 716
    .line 717
    if-nez p3, :cond_2c

    .line 718
    goto :goto_f

    .line 719
    .line 720
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 721
    .line 722
    .line 723
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 724
    move-result v4

    .line 725
    .line 726
    .line 727
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetInitialDetent(Landroid/view/View;I)V

    .line 728
    return-void

    .line 729
    .line 730
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 731
    .line 732
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 733
    .line 734
    .line 735
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 736
    move-result-object v0

    .line 737
    .line 738
    .line 739
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 740
    move-result-object p3

    .line 741
    .line 742
    .line 743
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setNavigationBarColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 744
    return-void

    .line 745
    .line 746
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 747
    .line 748
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 749
    .line 750
    check-cast p3, Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStackAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 754
    return-void

    .line 755
    .line 756
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 757
    .line 758
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 759
    .line 760
    if-nez p3, :cond_2d

    .line 761
    goto :goto_10

    .line 762
    .line 763
    :cond_2d
    check-cast p3, Ljava/lang/Boolean;

    .line 764
    .line 765
    .line 766
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 767
    move-result v2

    .line 768
    .line 769
    .line 770
    :goto_10
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setFullScreenSwipeShadowEnabled(Landroid/view/View;Z)V

    .line 771
    return-void

    .line 772
    .line 773
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 774
    .line 775
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 776
    .line 777
    if-nez p3, :cond_2e

    .line 778
    goto :goto_11

    .line 779
    :cond_2e
    move-object v3, p3

    .line 780
    .line 781
    check-cast v3, Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    :goto_11
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 785
    return-void

    .line 786
    .line 787
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 788
    .line 789
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 790
    .line 791
    .line 792
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 793
    move-result-object v0

    .line 794
    .line 795
    .line 796
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 797
    move-result-object p3

    .line 798
    .line 799
    .line 800
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 801
    return-void

    .line 802
    .line 803
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 804
    .line 805
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 806
    .line 807
    if-nez p3, :cond_2f

    .line 808
    goto :goto_12

    .line 809
    .line 810
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 811
    .line 812
    .line 813
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 814
    move-result v1

    .line 815
    .line 816
    .line 817
    :goto_12
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setActivityState(Landroid/view/View;F)V

    .line 818
    return-void

    .line 819
    .line 820
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 821
    .line 822
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 823
    .line 824
    check-cast p3, Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStackPresentation(Landroid/view/View;Ljava/lang/String;)V

    .line 828
    return-void

    .line 829
    .line 830
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 831
    .line 832
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 833
    .line 834
    if-nez p3, :cond_30

    .line 835
    goto :goto_13

    .line 836
    .line 837
    :cond_30
    check-cast p3, Ljava/lang/Boolean;

    .line 838
    .line 839
    .line 840
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 841
    move-result v4

    .line 842
    .line 843
    .line 844
    :goto_13
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarTranslucent(Landroid/view/View;Z)V

    .line 845
    return-void

    .line 846
    .line 847
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 848
    .line 849
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 850
    .line 851
    if-nez p3, :cond_31

    .line 852
    goto :goto_14

    .line 853
    .line 854
    :cond_31
    check-cast p3, Ljava/lang/Boolean;

    .line 855
    .line 856
    .line 857
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 858
    move-result v4

    .line 859
    .line 860
    .line 861
    :goto_14
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setNavigationBarHidden(Landroid/view/View;Z)V

    .line 862
    return-void

    .line 863
    .line 864
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 865
    .line 866
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 867
    .line 868
    if-nez p3, :cond_32

    .line 869
    goto :goto_15

    .line 870
    .line 871
    :cond_32
    check-cast p3, Ljava/lang/Double;

    .line 872
    .line 873
    .line 874
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 875
    move-result v1

    .line 876
    .line 877
    .line 878
    :goto_15
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetCornerRadius(Landroid/view/View;F)V

    .line 879
    return-void

    .line 880
    .line 881
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 882
    .line 883
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 884
    .line 885
    if-nez p3, :cond_33

    .line 886
    goto :goto_16

    .line 887
    .line 888
    :cond_33
    check-cast p3, Ljava/lang/Boolean;

    .line 889
    .line 890
    .line 891
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 892
    move-result v4

    .line 893
    .line 894
    .line 895
    :goto_16
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setHideKeyboardOnSwipe(Landroid/view/View;Z)V

    .line 896
    return-void

    .line 897
    .line 898
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 899
    .line 900
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 901
    .line 902
    if-nez p3, :cond_34

    .line 903
    goto :goto_17

    .line 904
    .line 905
    :cond_34
    check-cast p3, Ljava/lang/Boolean;

    .line 906
    .line 907
    .line 908
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 909
    move-result v2

    .line 910
    .line 911
    .line 912
    :goto_17
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setGestureEnabled(Landroid/view/View;Z)V

    .line 913
    return-void

    .line 914
    .line 915
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 916
    .line 917
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 918
    .line 919
    if-nez p3, :cond_35

    .line 920
    goto :goto_18

    .line 921
    .line 922
    :cond_35
    check-cast p3, Ljava/lang/Boolean;

    .line 923
    .line 924
    .line 925
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 926
    move-result v4

    .line 927
    .line 928
    .line 929
    :goto_18
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setHomeIndicatorHidden(Landroid/view/View;Z)V

    .line 930
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x737a3646 -> :sswitch_1e
        -0x6e7b0e48 -> :sswitch_1d
        -0x675c3aee -> :sswitch_1c
        -0x506a6dba -> :sswitch_1b
        -0x4ecd6817 -> :sswitch_1a
        -0x44e94228 -> :sswitch_19
        -0x4496763e -> :sswitch_18
        -0x3e6b8d3e -> :sswitch_17
        -0x3a0986de -> :sswitch_16
        -0x39259890 -> :sswitch_15
        -0x38c1d7de -> :sswitch_14
        -0x226f2e24 -> :sswitch_13
        -0x1b948ebc -> :sswitch_12
        -0x16be52c3 -> :sswitch_11
        -0x1056680e -> :sswitch_10
        -0xf53acd0 -> :sswitch_f
        -0x9ea6485 -> :sswitch_e
        0x1088bcb -> :sswitch_d
        0x7befa22 -> :sswitch_c
        0xb3022bf -> :sswitch_b
        0xd90a1c4 -> :sswitch_a
        0xe6b0c52 -> :sswitch_9
        0x1955fa09 -> :sswitch_8
        0x40806965 -> :sswitch_7
        0x42362208 -> :sswitch_6
        0x4285947a -> :sswitch_5
        0x4ba38bbe -> :sswitch_4
        0x50f08f6e -> :sswitch_3
        0x52b16dc3 -> :sswitch_2
        0x670fd7dc -> :sswitch_1
        0x7d048c58 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
