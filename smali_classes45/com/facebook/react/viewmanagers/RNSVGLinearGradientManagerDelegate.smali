.class public Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSVGLinearGradientManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface<",
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
    const/16 v2, 0x12

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
    const/16 v2, 0x11

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
    const/16 v2, 0x10

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
    const/16 v2, 0xf

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
    const/16 v2, 0xe

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
    const/16 v2, 0xd

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
    const/16 v2, 0xc

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
    const/16 v2, 0xb

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
    const/16 v2, 0xa

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    .line 145
    :sswitch_9
    const-string/jumbo v3, "y2"

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
    const/16 v2, 0x9

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    .line 160
    :sswitch_a
    const-string/jumbo v3, "y1"

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
    const/16 v2, 0x8

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    .line 175
    :sswitch_b
    const-string/jumbo v3, "x2"

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    move-result v3

    .line 180
    .line 181
    if-nez v3, :cond_b

    .line 182
    goto :goto_0

    .line 183
    :cond_b
    const/4 v2, 0x7

    .line 184
    goto :goto_0

    .line 185
    .line 186
    .line 187
    :sswitch_c
    const-string/jumbo v3, "x1"

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    move-result v3

    .line 192
    .line 193
    if-nez v3, :cond_c

    .line 194
    goto :goto_0

    .line 195
    :cond_c
    const/4 v2, 0x6

    .line 196
    goto :goto_0

    .line 197
    .line 198
    .line 199
    :sswitch_d
    const-string/jumbo v3, "pointerEvents"

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    move-result v3

    .line 204
    .line 205
    if-nez v3, :cond_d

    .line 206
    goto :goto_0

    .line 207
    :cond_d
    const/4 v2, 0x5

    .line 208
    goto :goto_0

    .line 209
    .line 210
    :sswitch_e
    const-string v3, "markerMid"

    .line 211
    .line 212
    .line 213
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    move-result v3

    .line 215
    .line 216
    if-nez v3, :cond_e

    .line 217
    goto :goto_0

    .line 218
    :cond_e
    const/4 v2, 0x4

    .line 219
    goto :goto_0

    .line 220
    .line 221
    :sswitch_f
    const-string v3, "markerEnd"

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    move-result v3

    .line 226
    .line 227
    if-nez v3, :cond_f

    .line 228
    goto :goto_0

    .line 229
    :cond_f
    const/4 v2, 0x3

    .line 230
    goto :goto_0

    .line 231
    .line 232
    :sswitch_10
    const-string v3, "matrix"

    .line 233
    .line 234
    .line 235
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    move-result v3

    .line 237
    .line 238
    if-nez v3, :cond_10

    .line 239
    goto :goto_0

    .line 240
    :cond_10
    const/4 v2, 0x2

    .line 241
    goto :goto_0

    .line 242
    .line 243
    :sswitch_11
    const-string v3, "opacity"

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    move-result v3

    .line 248
    .line 249
    if-nez v3, :cond_11

    .line 250
    goto :goto_0

    .line 251
    :cond_11
    const/4 v2, 0x1

    .line 252
    goto :goto_0

    .line 253
    .line 254
    :sswitch_12
    const-string v3, "gradientUnits"

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    move-result v3

    .line 259
    .line 260
    if-nez v3, :cond_12

    .line 261
    goto :goto_0

    .line 262
    :cond_12
    move v2, v0

    .line 263
    .line 264
    .line 265
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 266
    .line 267
    .line 268
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 269
    return-void

    .line 270
    .line 271
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 272
    .line 273
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 274
    .line 275
    if-nez p3, :cond_13

    .line 276
    goto :goto_1

    .line 277
    .line 278
    :cond_13
    check-cast p3, Ljava/lang/Boolean;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 282
    move-result v0

    .line 283
    .line 284
    .line 285
    :goto_1
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 286
    return-void

    .line 287
    .line 288
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 289
    .line 290
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 291
    .line 292
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 293
    .line 294
    .line 295
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setGradientTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 296
    return-void

    .line 297
    .line 298
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 299
    .line 300
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 301
    .line 302
    if-nez p3, :cond_14

    .line 303
    goto :goto_2

    .line 304
    :cond_14
    move-object v1, p3

    .line 305
    .line 306
    check-cast v1, Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 310
    return-void

    .line 311
    .line 312
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 313
    .line 314
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 315
    .line 316
    if-nez p3, :cond_15

    .line 317
    goto :goto_3

    .line 318
    .line 319
    :cond_15
    check-cast p3, Ljava/lang/Double;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 323
    move-result v0

    .line 324
    .line 325
    .line 326
    :goto_3
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 327
    return-void

    .line 328
    .line 329
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 330
    .line 331
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 332
    .line 333
    if-nez p3, :cond_16

    .line 334
    goto :goto_4

    .line 335
    :cond_16
    move-object v1, p3

    .line 336
    .line 337
    check-cast v1, Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    :goto_4
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 341
    return-void

    .line 342
    .line 343
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 344
    .line 345
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 346
    .line 347
    if-nez p3, :cond_17

    .line 348
    goto :goto_5

    .line 349
    :cond_17
    move-object v1, p3

    .line 350
    .line 351
    check-cast v1, Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    :goto_5
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 355
    return-void

    .line 356
    .line 357
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 358
    .line 359
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 360
    .line 361
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 362
    .line 363
    .line 364
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setGradient(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 365
    return-void

    .line 366
    .line 367
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 368
    .line 369
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 370
    .line 371
    if-nez p3, :cond_18

    .line 372
    goto :goto_6

    .line 373
    :cond_18
    move-object v1, p3

    .line 374
    .line 375
    check-cast v1, Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    :goto_6
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 379
    return-void

    .line 380
    .line 381
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 382
    .line 383
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 384
    .line 385
    if-nez p3, :cond_19

    .line 386
    goto :goto_7

    .line 387
    :cond_19
    move-object v1, p3

    .line 388
    .line 389
    check-cast v1, Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    :goto_7
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 393
    return-void

    .line 394
    .line 395
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 396
    .line 397
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 398
    .line 399
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 400
    .line 401
    .line 402
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setY2(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 406
    return-void

    .line 407
    .line 408
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 409
    .line 410
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 411
    .line 412
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 413
    .line 414
    .line 415
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setY1(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 419
    return-void

    .line 420
    .line 421
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 422
    .line 423
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

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
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setX2(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 432
    return-void

    .line 433
    .line 434
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 435
    .line 436
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

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
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setX1(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 445
    return-void

    .line 446
    .line 447
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 448
    .line 449
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 450
    .line 451
    if-nez p3, :cond_1a

    .line 452
    goto :goto_8

    .line 453
    :cond_1a
    move-object v1, p3

    .line 454
    .line 455
    check-cast v1, Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    :goto_8
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 459
    return-void

    .line 460
    .line 461
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 462
    .line 463
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 464
    .line 465
    if-nez p3, :cond_1b

    .line 466
    goto :goto_9

    .line 467
    :cond_1b
    move-object v1, p3

    .line 468
    .line 469
    check-cast v1, Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    :goto_9
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 473
    return-void

    .line 474
    .line 475
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 476
    .line 477
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 478
    .line 479
    if-nez p3, :cond_1c

    .line 480
    goto :goto_a

    .line 481
    :cond_1c
    move-object v1, p3

    .line 482
    .line 483
    check-cast v1, Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 487
    return-void

    .line 488
    .line 489
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 490
    .line 491
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 492
    .line 493
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 494
    .line 495
    .line 496
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 497
    return-void

    .line 498
    .line 499
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 500
    .line 501
    if-nez p3, :cond_1d

    .line 502
    .line 503
    const/high16 p3, 0x3f800000    # 1.0f

    .line 504
    goto :goto_b

    .line 505
    .line 506
    :cond_1d
    check-cast p3, Ljava/lang/Double;

    .line 507
    .line 508
    .line 509
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 510
    move-result p3

    .line 511
    .line 512
    .line 513
    :goto_b
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 514
    return-void

    .line 515
    .line 516
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 517
    .line 518
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;

    .line 519
    .line 520
    if-nez p3, :cond_1e

    .line 521
    goto :goto_c

    .line 522
    .line 523
    :cond_1e
    check-cast p3, Ljava/lang/Double;

    .line 524
    .line 525
    .line 526
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 527
    move-result v0

    .line 528
    .line 529
    .line 530
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGLinearGradientManagerInterface;->setGradientUnits(Landroid/view/View;I)V

    .line 531
    return-void

    .line 532
    nop

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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    :sswitch_data_0
    .sparse-switch
        -0x732b91e1 -> :sswitch_12
        -0x4b8807f5 -> :sswitch_11
        -0x4072683f -> :sswitch_10
        -0x37a9a5bf -> :sswitch_f
        -0x37a98852 -> :sswitch_e
        -0x117e564a -> :sswitch_d
        0xeb9 -> :sswitch_c
        0xeba -> :sswitch_b
        0xed8 -> :sswitch_a
        0xed9 -> :sswitch_9
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
    :pswitch_data_0
    .packed-switch 0x0
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
