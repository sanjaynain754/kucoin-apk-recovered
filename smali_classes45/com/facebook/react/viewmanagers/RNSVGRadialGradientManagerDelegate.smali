.class public Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSVGRadialGradientManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface<",
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
    .locals 4
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
    const/4 v2, -0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    sparse-switch v3, :sswitch_data_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    .line 18
    :sswitch_0
    const-string/jumbo v3, "responsible"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v3

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    const/16 v2, 0x14

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :sswitch_1
    const-string v3, "gradientTransform"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v3

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const/16 v2, 0x13

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :sswitch_2
    const-string v3, "display"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result v3

    .line 51
    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_2
    const/16 v2, 0x12

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :sswitch_3
    const-string v3, "clipRule"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result v3

    .line 65
    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :cond_3
    const/16 v2, 0x11

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :sswitch_4
    const-string v3, "clipPath"

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    move-result v3

    .line 79
    .line 80
    if-nez v3, :cond_4

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :cond_4
    const/16 v2, 0x10

    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :sswitch_5
    const-string v3, "markerStart"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    move-result v3

    .line 93
    .line 94
    if-nez v3, :cond_5

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :cond_5
    const/16 v2, 0xf

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :sswitch_6
    const-string v3, "gradient"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    move-result v3

    .line 107
    .line 108
    if-nez v3, :cond_6

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :cond_6
    const/16 v2, 0xe

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :sswitch_7
    const-string v3, "name"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    move-result v3

    .line 121
    .line 122
    if-nez v3, :cond_7

    .line 123
    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    :cond_7
    const/16 v2, 0xd

    .line 127
    .line 128
    goto/16 :goto_0

    .line 129
    .line 130
    :sswitch_8
    const-string v3, "mask"

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    move-result v3

    .line 135
    .line 136
    if-nez v3, :cond_8

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_8
    const/16 v2, 0xc

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    .line 145
    :sswitch_9
    const-string/jumbo v3, "ry"

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    move-result v3

    .line 150
    .line 151
    if-nez v3, :cond_9

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_9
    const/16 v2, 0xb

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    .line 160
    :sswitch_a
    const-string/jumbo v3, "rx"

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    move-result v3

    .line 165
    .line 166
    if-nez v3, :cond_a

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_a
    const/16 v2, 0xa

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :sswitch_b
    const-string v3, "fy"

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    move-result v3

    .line 179
    .line 180
    if-nez v3, :cond_b

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_b
    const/16 v2, 0x9

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :sswitch_c
    const-string v3, "fx"

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    move-result v3

    .line 193
    .line 194
    if-nez v3, :cond_c

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_c
    const/16 v2, 0x8

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :sswitch_d
    const-string v3, "cy"

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    move-result v3

    .line 207
    .line 208
    if-nez v3, :cond_d

    .line 209
    goto :goto_0

    .line 210
    :cond_d
    const/4 v2, 0x7

    .line 211
    goto :goto_0

    .line 212
    .line 213
    :sswitch_e
    const-string v3, "cx"

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    move-result v3

    .line 218
    .line 219
    if-nez v3, :cond_e

    .line 220
    goto :goto_0

    .line 221
    :cond_e
    const/4 v2, 0x6

    .line 222
    goto :goto_0

    .line 223
    .line 224
    .line 225
    :sswitch_f
    const-string/jumbo v3, "pointerEvents"

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    move-result v3

    .line 230
    .line 231
    if-nez v3, :cond_f

    .line 232
    goto :goto_0

    .line 233
    :cond_f
    const/4 v2, 0x5

    .line 234
    goto :goto_0

    .line 235
    .line 236
    :sswitch_10
    const-string v3, "markerMid"

    .line 237
    .line 238
    .line 239
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    move-result v3

    .line 241
    .line 242
    if-nez v3, :cond_10

    .line 243
    goto :goto_0

    .line 244
    :cond_10
    const/4 v2, 0x4

    .line 245
    goto :goto_0

    .line 246
    .line 247
    :sswitch_11
    const-string v3, "markerEnd"

    .line 248
    .line 249
    .line 250
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    move-result v3

    .line 252
    .line 253
    if-nez v3, :cond_11

    .line 254
    goto :goto_0

    .line 255
    :cond_11
    const/4 v2, 0x3

    .line 256
    goto :goto_0

    .line 257
    .line 258
    :sswitch_12
    const-string v3, "matrix"

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    move-result v3

    .line 263
    .line 264
    if-nez v3, :cond_12

    .line 265
    goto :goto_0

    .line 266
    :cond_12
    const/4 v2, 0x2

    .line 267
    goto :goto_0

    .line 268
    .line 269
    :sswitch_13
    const-string v3, "opacity"

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    move-result v3

    .line 274
    .line 275
    if-nez v3, :cond_13

    .line 276
    goto :goto_0

    .line 277
    :cond_13
    const/4 v2, 0x1

    .line 278
    goto :goto_0

    .line 279
    .line 280
    :sswitch_14
    const-string v3, "gradientUnits"

    .line 281
    .line 282
    .line 283
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    move-result v3

    .line 285
    .line 286
    if-nez v3, :cond_14

    .line 287
    goto :goto_0

    .line 288
    :cond_14
    move v2, v0

    .line 289
    .line 290
    .line 291
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 292
    .line 293
    .line 294
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 295
    return-void

    .line 296
    .line 297
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 298
    .line 299
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 300
    .line 301
    if-nez p3, :cond_15

    .line 302
    goto :goto_1

    .line 303
    .line 304
    :cond_15
    check-cast p3, Ljava/lang/Boolean;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 308
    move-result v0

    .line 309
    .line 310
    .line 311
    :goto_1
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 312
    return-void

    .line 313
    .line 314
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 315
    .line 316
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 317
    .line 318
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 319
    .line 320
    .line 321
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setGradientTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 322
    return-void

    .line 323
    .line 324
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 325
    .line 326
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 327
    .line 328
    if-nez p3, :cond_16

    .line 329
    goto :goto_2

    .line 330
    :cond_16
    move-object v1, p3

    .line 331
    .line 332
    check-cast v1, Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 336
    return-void

    .line 337
    .line 338
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 339
    .line 340
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 341
    .line 342
    if-nez p3, :cond_17

    .line 343
    goto :goto_3

    .line 344
    .line 345
    :cond_17
    check-cast p3, Ljava/lang/Double;

    .line 346
    .line 347
    .line 348
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 349
    move-result v0

    .line 350
    .line 351
    .line 352
    :goto_3
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 353
    return-void

    .line 354
    .line 355
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 356
    .line 357
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 358
    .line 359
    if-nez p3, :cond_18

    .line 360
    goto :goto_4

    .line 361
    :cond_18
    move-object v1, p3

    .line 362
    .line 363
    check-cast v1, Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    :goto_4
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 367
    return-void

    .line 368
    .line 369
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 370
    .line 371
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 372
    .line 373
    if-nez p3, :cond_19

    .line 374
    goto :goto_5

    .line 375
    :cond_19
    move-object v1, p3

    .line 376
    .line 377
    check-cast v1, Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    :goto_5
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 381
    return-void

    .line 382
    .line 383
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 384
    .line 385
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 386
    .line 387
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 388
    .line 389
    .line 390
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setGradient(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 391
    return-void

    .line 392
    .line 393
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 394
    .line 395
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 396
    .line 397
    if-nez p3, :cond_1a

    .line 398
    goto :goto_6

    .line 399
    :cond_1a
    move-object v1, p3

    .line 400
    .line 401
    check-cast v1, Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    :goto_6
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 405
    return-void

    .line 406
    .line 407
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 408
    .line 409
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 410
    .line 411
    if-nez p3, :cond_1b

    .line 412
    goto :goto_7

    .line 413
    :cond_1b
    move-object v1, p3

    .line 414
    .line 415
    check-cast v1, Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    :goto_7
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 419
    return-void

    .line 420
    .line 421
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 422
    .line 423
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 424
    .line 425
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 426
    .line 427
    .line 428
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setRy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 432
    return-void

    .line 433
    .line 434
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 435
    .line 436
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 437
    .line 438
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 439
    .line 440
    .line 441
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setRx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 445
    return-void

    .line 446
    .line 447
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 448
    .line 449
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 450
    .line 451
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 452
    .line 453
    .line 454
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setFy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 458
    return-void

    .line 459
    .line 460
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 461
    .line 462
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 463
    .line 464
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 465
    .line 466
    .line 467
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setFx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 471
    return-void

    .line 472
    .line 473
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 474
    .line 475
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 476
    .line 477
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 478
    .line 479
    .line 480
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setCy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 484
    return-void

    .line 485
    .line 486
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 487
    .line 488
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 489
    .line 490
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 491
    .line 492
    .line 493
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setCx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 497
    return-void

    .line 498
    .line 499
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 500
    .line 501
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 502
    .line 503
    if-nez p3, :cond_1c

    .line 504
    goto :goto_8

    .line 505
    :cond_1c
    move-object v1, p3

    .line 506
    .line 507
    check-cast v1, Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    :goto_8
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 511
    return-void

    .line 512
    .line 513
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 514
    .line 515
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 516
    .line 517
    if-nez p3, :cond_1d

    .line 518
    goto :goto_9

    .line 519
    :cond_1d
    move-object v1, p3

    .line 520
    .line 521
    check-cast v1, Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    :goto_9
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 525
    return-void

    .line 526
    .line 527
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 528
    .line 529
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 530
    .line 531
    if-nez p3, :cond_1e

    .line 532
    goto :goto_a

    .line 533
    :cond_1e
    move-object v1, p3

    .line 534
    .line 535
    check-cast v1, Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 539
    return-void

    .line 540
    .line 541
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 542
    .line 543
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 544
    .line 545
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 546
    .line 547
    .line 548
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 549
    return-void

    .line 550
    .line 551
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 552
    .line 553
    if-nez p3, :cond_1f

    .line 554
    .line 555
    const/high16 p3, 0x3f800000    # 1.0f

    .line 556
    goto :goto_b

    .line 557
    .line 558
    :cond_1f
    check-cast p3, Ljava/lang/Double;

    .line 559
    .line 560
    .line 561
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 562
    move-result p3

    .line 563
    .line 564
    .line 565
    :goto_b
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 566
    return-void

    .line 567
    .line 568
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 569
    .line 570
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;

    .line 571
    .line 572
    if-nez p3, :cond_20

    .line 573
    goto :goto_c

    .line 574
    .line 575
    :cond_20
    check-cast p3, Ljava/lang/Double;

    .line 576
    .line 577
    .line 578
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 579
    move-result v0

    .line 580
    .line 581
    .line 582
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRadialGradientManagerInterface;->setGradientUnits(Landroid/view/View;I)V

    .line 583
    return-void

    .line 584
    nop

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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    :sswitch_data_0
    .sparse-switch
        -0x732b91e1 -> :sswitch_14
        -0x4b8807f5 -> :sswitch_13
        -0x4072683f -> :sswitch_12
        -0x37a9a5bf -> :sswitch_11
        -0x37a98852 -> :sswitch_10
        -0x117e564a -> :sswitch_f
        0xc75 -> :sswitch_e
        0xc76 -> :sswitch_d
        0xcd2 -> :sswitch_c
        0xcd3 -> :sswitch_b
        0xe46 -> :sswitch_a
        0xe47 -> :sswitch_9
        0x3306ec -> :sswitch_8
        0x337a8b -> :sswitch_7
        0x557f730 -> :sswitch_6
        0xcf0d448 -> :sswitch_5
        0x36b25395 -> :sswitch_4
        0x36b3866c -> :sswitch_3
        0x63a518c2 -> :sswitch_2
        0x6ca3aa1c -> :sswitch_1
        0x6e2146f6 -> :sswitch_0
    .end sparse-switch

    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    :pswitch_data_0
    .packed-switch 0x0
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
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method
