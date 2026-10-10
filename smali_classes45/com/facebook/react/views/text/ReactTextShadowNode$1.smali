.class Lcom/facebook/react/views/text/ReactTextShadowNode$1;
.super Ljava/lang/Object;
.source "ReactTextShadowNode.java"

# interfaces
.implements Ld7/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/ReactTextShadowNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/text/ReactTextShadowNode;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.method public measure(Lcom/facebook/yoga/a;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;)J
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    move-object/from16 v3, p5

    .line 9
    .line 10
    iget-object v4, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 11
    .line 12
    .line 13
    invoke-static {v4}, Lcom/facebook/react/views/text/ReactTextShadowNode;->a(Lcom/facebook/react/views/text/ReactTextShadowNode;)Landroid/text/Spannable;

    .line 14
    move-result-object v4

    .line 15
    .line 16
    const-string v5, "Spannable element has not been prepared in onBeforeLayout"

    .line 17
    .line 18
    .line 19
    invoke-static {v4, v5}, Lh6/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    check-cast v4, Landroid/text/Spannable;

    .line 23
    .line 24
    iget-object v5, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 25
    .line 26
    .line 27
    invoke-static {v5, v4, v1, v2}, Lcom/facebook/react/views/text/ReactTextShadowNode;->c(Lcom/facebook/react/views/text/ReactTextShadowNode;Landroid/text/Spannable;FLcom/facebook/yoga/YogaMeasureMode;)Landroid/text/Layout;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    iget-object v6, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 31
    .line 32
    iget-boolean v7, v6, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mAdjustsFontSizeToFit:Z

    .line 33
    const/4 v8, -0x1

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x1

    .line 36
    .line 37
    if-eqz v7, :cond_3

    .line 38
    .line 39
    iget-object v6, v6, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mTextAttributes:Lcom/facebook/react/views/text/TextAttributes;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    .line 43
    move-result v6

    .line 44
    .line 45
    iget-object v7, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 46
    .line 47
    iget-object v7, v7, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mTextAttributes:Lcom/facebook/react/views/text/TextAttributes;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    .line 51
    move-result v7

    .line 52
    .line 53
    iget-object v11, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 54
    .line 55
    iget v11, v11, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mMinimumFontScale:F

    .line 56
    int-to-float v6, v6

    .line 57
    mul-float/2addr v11, v6

    .line 58
    .line 59
    const/high16 v12, 0x40800000    # 4.0f

    .line 60
    .line 61
    .line 62
    invoke-static {v12}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 63
    move-result v12

    .line 64
    .line 65
    .line 66
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    .line 67
    move-result v11

    .line 68
    float-to-int v11, v11

    .line 69
    .line 70
    :goto_0
    if-le v7, v11, :cond_3

    .line 71
    .line 72
    iget-object v12, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 73
    .line 74
    iget v12, v12, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mNumberOfLines:I

    .line 75
    .line 76
    if-eq v12, v8, :cond_0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    .line 80
    move-result v12

    .line 81
    .line 82
    iget-object v13, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 83
    .line 84
    iget v13, v13, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mNumberOfLines:I

    .line 85
    .line 86
    if-gt v12, v13, :cond_1

    .line 87
    .line 88
    :cond_0
    sget-object v12, Lcom/facebook/yoga/YogaMeasureMode;->UNDEFINED:Lcom/facebook/yoga/YogaMeasureMode;

    .line 89
    .line 90
    if-eq v3, v12, :cond_3

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    .line 94
    move-result v12

    .line 95
    int-to-float v12, v12

    .line 96
    .line 97
    cmpl-float v12, v12, p4

    .line 98
    .line 99
    if-lez v12, :cond_3

    .line 100
    .line 101
    :cond_1
    const/high16 v5, 0x3f800000    # 1.0f

    .line 102
    .line 103
    .line 104
    invoke-static {v5}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 105
    move-result v5

    .line 106
    float-to-int v5, v5

    .line 107
    .line 108
    .line 109
    invoke-static {v10, v5}, Ljava/lang/Math;->max(II)I

    .line 110
    move-result v5

    .line 111
    sub-int/2addr v7, v5

    .line 112
    int-to-float v5, v7

    .line 113
    div-float/2addr v5, v6

    .line 114
    .line 115
    .line 116
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 117
    move-result v12

    .line 118
    .line 119
    const-class v13, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 120
    .line 121
    .line 122
    invoke-interface {v4, v9, v12, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 123
    move-result-object v12

    .line 124
    .line 125
    check-cast v12, [Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 126
    array-length v13, v12

    .line 127
    move v14, v9

    .line 128
    .line 129
    :goto_1
    if-ge v14, v13, :cond_2

    .line 130
    .line 131
    aget-object v15, v12, v14

    .line 132
    .line 133
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 134
    .line 135
    move/from16 v16, v10

    .line 136
    .line 137
    .line 138
    invoke-virtual {v15}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 139
    move-result v10

    .line 140
    int-to-float v10, v10

    .line 141
    mul-float/2addr v10, v5

    .line 142
    int-to-float v8, v11

    .line 143
    .line 144
    .line 145
    invoke-static {v10, v8}, Ljava/lang/Math;->max(FF)F

    .line 146
    move-result v8

    .line 147
    float-to-int v8, v8

    .line 148
    .line 149
    .line 150
    invoke-direct {v9, v8}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v4, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 154
    move-result v8

    .line 155
    .line 156
    .line 157
    invoke-interface {v4, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 158
    move-result v10

    .line 159
    .line 160
    move/from16 v17, v5

    .line 161
    .line 162
    .line 163
    invoke-interface {v4, v15}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 164
    move-result v5

    .line 165
    .line 166
    .line 167
    invoke-interface {v4, v9, v8, v10, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v4, v15}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 171
    .line 172
    add-int/lit8 v14, v14, 0x1

    .line 173
    .line 174
    move/from16 v10, v16

    .line 175
    .line 176
    move/from16 v5, v17

    .line 177
    const/4 v8, -0x1

    .line 178
    const/4 v9, 0x0

    .line 179
    goto :goto_1

    .line 180
    .line 181
    :cond_2
    move/from16 v16, v10

    .line 182
    .line 183
    iget-object v5, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 184
    .line 185
    .line 186
    invoke-static {v5, v4, v1, v2}, Lcom/facebook/react/views/text/ReactTextShadowNode;->c(Lcom/facebook/react/views/text/ReactTextShadowNode;Landroid/text/Spannable;FLcom/facebook/yoga/YogaMeasureMode;)Landroid/text/Layout;

    .line 187
    move-result-object v5

    .line 188
    const/4 v8, -0x1

    .line 189
    const/4 v9, 0x0

    .line 190
    goto :goto_0

    .line 191
    .line 192
    :cond_3
    move/from16 v16, v10

    .line 193
    .line 194
    iget-object v6, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 195
    .line 196
    .line 197
    invoke-static {v6}, Lcom/facebook/react/views/text/ReactTextShadowNode;->b(Lcom/facebook/react/views/text/ReactTextShadowNode;)Z

    .line 198
    move-result v6

    .line 199
    .line 200
    if-eqz v6, :cond_5

    .line 201
    .line 202
    iget-object v6, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->getThemedContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 206
    move-result-object v6

    .line 207
    .line 208
    .line 209
    invoke-static {}, Lcom/facebook/react/views/text/ReactTextShadowNode;->d()Landroid/text/TextPaint;

    .line 210
    move-result-object v7

    .line 211
    .line 212
    .line 213
    invoke-static {v4, v5, v7, v6}, Lcom/facebook/react/views/text/FontMetricsUtil;->getFontMetrics(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;

    .line 214
    move-result-object v7

    .line 215
    .line 216
    .line 217
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 218
    move-result-object v8

    .line 219
    .line 220
    const-string v9, "lines"

    .line 221
    .line 222
    .line 223
    invoke-interface {v8, v9, v7}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6}, Lcom/facebook/react/uimanager/ThemedReactContext;->hasActiveReactInstance()Z

    .line 227
    move-result v7

    .line 228
    .line 229
    if-eqz v7, :cond_4

    .line 230
    .line 231
    const-class v7, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v7}, Lcom/facebook/react/uimanager/ThemedReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 235
    move-result-object v6

    .line 236
    .line 237
    check-cast v6, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 238
    .line 239
    iget-object v7, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v7}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->getReactTag()I

    .line 243
    move-result v7

    .line 244
    .line 245
    .line 246
    const-string/jumbo v9, "topTextLayout"

    .line 247
    .line 248
    .line 249
    invoke-interface {v6, v7, v9, v8}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 250
    goto :goto_2

    .line 251
    .line 252
    :cond_4
    new-instance v6, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 253
    .line 254
    const-string v7, "Cannot get RCTEventEmitter, no CatalystInstance"

    .line 255
    .line 256
    .line 257
    invoke-direct {v6, v7}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    const-string v7, "ReactTextShadowNode"

    .line 260
    .line 261
    .line 262
    invoke-static {v7, v6}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    :cond_5
    :goto_2
    iget-object v6, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 265
    .line 266
    iget v6, v6, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mNumberOfLines:I

    .line 267
    const/4 v7, -0x1

    .line 268
    .line 269
    if-ne v6, v7, :cond_6

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    .line 273
    move-result v6

    .line 274
    goto :goto_3

    .line 275
    .line 276
    .line 277
    :cond_6
    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    .line 278
    move-result v7

    .line 279
    .line 280
    .line 281
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 282
    move-result v6

    .line 283
    .line 284
    :goto_3
    sget-object v7, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    .line 285
    .line 286
    if-ne v2, v7, :cond_7

    .line 287
    goto :goto_6

    .line 288
    :cond_7
    const/4 v7, 0x0

    .line 289
    const/4 v9, 0x0

    .line 290
    .line 291
    :goto_4
    if-ge v9, v6, :cond_a

    .line 292
    .line 293
    .line 294
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 295
    move-result v8

    .line 296
    .line 297
    if-lez v8, :cond_8

    .line 298
    .line 299
    .line 300
    invoke-virtual {v5, v9}, Landroid/text/Layout;->getLineEnd(I)I

    .line 301
    move-result v8

    .line 302
    .line 303
    add-int/lit8 v8, v8, -0x1

    .line 304
    .line 305
    .line 306
    invoke-interface {v4, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 307
    move-result v8

    .line 308
    .line 309
    const/16 v10, 0xa

    .line 310
    .line 311
    if-ne v8, v10, :cond_8

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5, v9}, Landroid/text/Layout;->getLineMax(I)F

    .line 315
    move-result v8

    .line 316
    goto :goto_5

    .line 317
    .line 318
    .line 319
    :cond_8
    invoke-virtual {v5, v9}, Landroid/text/Layout;->getLineWidth(I)F

    .line 320
    move-result v8

    .line 321
    .line 322
    :goto_5
    cmpl-float v10, v8, v7

    .line 323
    .line 324
    if-lez v10, :cond_9

    .line 325
    move v7, v8

    .line 326
    .line 327
    :cond_9
    add-int/lit8 v9, v9, 0x1

    .line 328
    goto :goto_4

    .line 329
    .line 330
    :cond_a
    sget-object v4, Lcom/facebook/yoga/YogaMeasureMode;->AT_MOST:Lcom/facebook/yoga/YogaMeasureMode;

    .line 331
    .line 332
    if-ne v2, v4, :cond_b

    .line 333
    .line 334
    cmpl-float v2, v7, v1

    .line 335
    .line 336
    if-lez v2, :cond_b

    .line 337
    goto :goto_6

    .line 338
    :cond_b
    move v1, v7

    .line 339
    .line 340
    :goto_6
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 341
    .line 342
    const/16 v4, 0x1d

    .line 343
    .line 344
    if-le v2, v4, :cond_c

    .line 345
    float-to-double v1, v1

    .line 346
    .line 347
    .line 348
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 349
    move-result-wide v1

    .line 350
    double-to-float v1, v1

    .line 351
    .line 352
    :cond_c
    sget-object v2, Lcom/facebook/yoga/YogaMeasureMode;->EXACTLY:Lcom/facebook/yoga/YogaMeasureMode;

    .line 353
    .line 354
    if-eq v3, v2, :cond_d

    .line 355
    .line 356
    add-int/lit8 v6, v6, -0x1

    .line 357
    .line 358
    .line 359
    invoke-virtual {v5, v6}, Landroid/text/Layout;->getLineBottom(I)I

    .line 360
    move-result v2

    .line 361
    int-to-float v2, v2

    .line 362
    .line 363
    sget-object v4, Lcom/facebook/yoga/YogaMeasureMode;->AT_MOST:Lcom/facebook/yoga/YogaMeasureMode;

    .line 364
    .line 365
    if-ne v3, v4, :cond_e

    .line 366
    .line 367
    cmpl-float v3, v2, p4

    .line 368
    .line 369
    if-lez v3, :cond_e

    .line 370
    .line 371
    :cond_d
    move/from16 v2, p4

    .line 372
    .line 373
    .line 374
    :cond_e
    invoke-static {v1, v2}, Ld7/h;->a(FF)J

    .line 375
    move-result-wide v1

    .line 376
    return-wide v1
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
.end method
