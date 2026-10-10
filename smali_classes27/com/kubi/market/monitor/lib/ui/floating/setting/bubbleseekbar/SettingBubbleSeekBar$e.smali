.class public Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;
.super Ljava/lang/Object;
.source "SettingBubbleSeekBar.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->autoAdjustSection()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;


# direct methods
.method public constructor <init>(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 12
    move-result p1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$702(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;F)F

    .line 16
    .line 17
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$900(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)F

    .line 21
    move-result v0

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$802(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;F)F

    .line 25
    .line 26
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1000(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Z

    .line 30
    move-result p1

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$600(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1200(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)F

    .line 50
    move-result v0

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1102(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;F)F

    .line 54
    .line 55
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1300(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Landroid/view/WindowManager$LayoutParams;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1100(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)F

    .line 65
    move-result v0

    .line 66
    .line 67
    const/high16 v1, 0x3f000000    # 0.5f

    .line 68
    add-float/2addr v0, v1

    .line 69
    float-to-int v0, v0

    .line 70
    .line 71
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 72
    .line 73
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1400(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Landroid/view/WindowManager;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$600(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    iget-object v1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1300(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Landroid/view/WindowManager$LayoutParams;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    .line 94
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$600(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1500(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Z

    .line 104
    move-result v0

    .line 105
    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 112
    move-result v0

    .line 113
    .line 114
    .line 115
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 116
    move-result-object v0

    .line 117
    goto :goto_0

    .line 118
    .line 119
    :cond_0
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 123
    move-result v0

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-virtual {p1, v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$BubbleView;->a(Ljava/lang/String;)V

    .line 131
    goto :goto_1

    .line 132
    .line 133
    :cond_1
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1600(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)F

    .line 137
    .line 138
    :goto_1
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 142
    .line 143
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1700(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 147
    move-result-object p1

    .line 148
    .line 149
    if-eqz p1, :cond_2

    .line 150
    .line 151
    iget-object p1, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->access$1700(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;)Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    iget-object v0, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgress()I

    .line 161
    move-result v1

    .line 162
    .line 163
    iget-object v2, p0, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$e;->b:Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;->getProgressFloat()F

    .line 167
    move-result v2

    .line 168
    const/4 v3, 0x1

    .line 169
    .line 170
    .line 171
    invoke-interface {p1, v0, v1, v2, v3}, Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$k;->c(Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;IFZ)V

    .line 172
    :cond_2
    return-void
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
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
.end method
