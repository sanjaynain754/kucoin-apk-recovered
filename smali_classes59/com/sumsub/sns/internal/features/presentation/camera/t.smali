.class public final Lcom/sumsub/sns/internal/features/presentation/camera/t;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic m:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Lkotlin/jvm/functions/Function0;

.field public final f:Ljava/lang/String;

.field public final g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

.field public final h:Lcom/sumsub/sns/internal/features/presentation/camera/d;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/android/v;

.field public final j:Lcom/sumsub/sns/internal/features/presentation/camera/C;

.field public final k:Lcom/sumsub/sns/internal/features/presentation/camera/c;

.field public final l:Lcom/sumsub/sns/internal/core/presentation/common/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "isPermissionChecked()Z"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/camera/t;

    .line 6
    .line 7
    const-string v3, "isPermissionChecked"

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 15
    .line 16
    aput-object v0, v2, v1

    .line 17
    .line 18
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/t;->m:[Lkotlin/reflect/KProperty;

    .line 19
    return-void
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 5
    .line 6
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->e:Lkotlin/jvm/functions/Function0;

    .line 7
    .line 8
    const-string p4, "FullCamera"

    .line 9
    .line 10
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->f:Ljava/lang/String;

    .line 11
    .line 12
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 13
    .line 14
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/z0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/z0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p4, p0, v0, p5, p6}, Lcom/sumsub/sns/internal/features/presentation/camera/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 21
    .line 22
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 23
    .line 24
    new-instance p4, Lcom/sumsub/sns/internal/features/presentation/camera/d;

    .line 25
    .line 26
    .line 27
    invoke-direct {p4, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V

    .line 28
    .line 29
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->h:Lcom/sumsub/sns/internal/features/presentation/camera/d;

    .line 30
    .line 31
    new-instance p4, Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 32
    .line 33
    sget-object p5, Lcom/sumsub/sns/internal/core/presentation/android/A;->e:Lcom/sumsub/sns/internal/core/presentation/android/A;

    .line 34
    .line 35
    .line 36
    invoke-static {p5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    .line 37
    move-result-object p5

    .line 38
    .line 39
    new-instance p6, Lcom/sumsub/sns/internal/features/presentation/camera/s;

    .line 40
    .line 41
    .line 42
    invoke-direct {p6, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/s;-><init>(Lcom/sumsub/sns/core/presentation/base/l;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p4, p0, p5, p3, p6}, Lcom/sumsub/sns/internal/core/presentation/android/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/camera/s;)V

    .line 46
    .line 47
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->i:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 48
    .line 49
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/C;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V

    .line 53
    .line 54
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->j:Lcom/sumsub/sns/internal/features/presentation/camera/C;

    .line 55
    .line 56
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/camera/c;

    .line 57
    .line 58
    new-instance p5, Lcom/sumsub/sns/internal/features/presentation/camera/a1;

    .line 59
    .line 60
    .line 61
    invoke-direct {p5, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/a1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V

    .line 62
    move-object p6, p9

    .line 63
    .line 64
    new-instance p9, Lcom/sumsub/sns/internal/features/presentation/camera/b;

    .line 65
    .line 66
    .line 67
    invoke-direct {p9}, Lcom/sumsub/sns/internal/features/presentation/camera/b;-><init>()V

    .line 68
    move-object p4, p0

    .line 69
    .line 70
    .line 71
    invoke-direct/range {p3 .. p9}, Lcom/sumsub/sns/internal/features/presentation/camera/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/camera/b;)V

    .line 72
    .line 73
    iput-object p3, p4, Lcom/sumsub/sns/internal/features/presentation/camera/t;->k:Lcom/sumsub/sns/internal/features/presentation/camera/c;

    .line 74
    .line 75
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/B;

    .line 76
    .line 77
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/camera/b1;

    .line 78
    .line 79
    .line 80
    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/b1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V

    .line 81
    .line 82
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/camera/c1;

    .line 83
    .line 84
    .line 85
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/c1;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V

    .line 86
    .line 87
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/camera/A;

    .line 88
    .line 89
    .line 90
    invoke-direct {v5}, Lcom/sumsub/sns/internal/features/presentation/camera/A;-><init>()V

    .line 91
    move-object v2, p2

    .line 92
    move-object v1, p4

    .line 93
    .line 94
    .line 95
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/camera/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/sumsub/sns/internal/features/presentation/camera/A;)V

    .line 96
    .line 97
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/w;

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/t;)V

    .line 101
    .line 102
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 103
    .line 104
    const-string p2, "PERMISSION_CHECKED"

    .line 105
    const/4 p3, 0x0

    .line 106
    .line 107
    .line 108
    invoke-direct {p1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/common/i;-><init>(Ljava/lang/String;Z)V

    .line 109
    .line 110
    iput-object p1, p4, Lcom/sumsub/sns/internal/features/presentation/camera/t;->l:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 111
    return-void
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/t;)Lcom/sumsub/sns/internal/features/presentation/camera/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->e:Lkotlin/jvm/functions/Function0;

    .line 2
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/r;

    .line 3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/r;->b:Lcom/sumsub/sns/internal/features/presentation/camera/a;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/t;Z)Lkotlin/Unit;
    .locals 5

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->m:Lcom/sumsub/sns/internal/core/presentation/camera/l;

    if-eqz v0, :cond_2

    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 7
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    const-string v2, "Enable flash"

    const/4 v3, 0x0

    const-string v4, "CameraX"

    invoke-virtual {v1, v4, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->n:Landroidx/camera/core/Camera;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 10
    :cond_0
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/camera/l;->k:Landroidx/camera/core/ImageCapture;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageCapture;->setFlashMode(I)V

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->l:Lcom/sumsub/sns/internal/core/presentation/common/i;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/h;->n:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 13
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/i;->a:Ljava/lang/String;

    .line 14
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 15
    invoke-virtual {v1, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 16
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/camera/t;)Lcom/sumsub/sns/internal/features/presentation/camera/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->e:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/r;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/r;->a:Lcom/sumsub/sns/internal/features/presentation/camera/e;

    .line 11
    return-object p0
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
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/camera/t;)Lcom/sumsub/sns/internal/features/presentation/camera/z;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->e:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/r;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/r;->c:Lcom/sumsub/sns/internal/features/presentation/camera/z;

    .line 11
    return-object p0
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
.end method


# virtual methods
.method public final a(Z)V
    .locals 5

    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->g:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 18
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 19
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/h;->n:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-virtual {v1, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/view/PreviewView;

    if-eqz v1, :cond_0

    .line 20
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 21
    :cond_0
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->j:Lcom/sumsub/sns/internal/core/presentation/common/k;

    const/4 v4, 0x1

    aget-object v2, v2, v4

    invoke-virtual {v1, v0, v2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    .line 22
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->k:Lcom/sumsub/sns/internal/features/presentation/camera/c;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/c;->a(Z)V

    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->f:Ljava/lang/String;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public final l()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->l:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/t;->m:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v3, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/common/i;->a(Lcom/sumsub/sns/internal/core/presentation/common/t;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->l:Lcom/sumsub/sns/internal/core/presentation/common/i;

    .line 16
    .line 17
    aget-object v1, v1, v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/i;->a:Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    const/4 v2, 0x1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/t;->i:Lcom/sumsub/sns/internal/core/presentation/android/v;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/android/v;->s()V

    .line 44
    :cond_1
    return-void
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
.end method
