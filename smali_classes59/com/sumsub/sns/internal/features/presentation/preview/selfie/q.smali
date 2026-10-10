.class public final Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;
.super Lcom/sumsub/sns/internal/features/presentation/preview/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic j:[Lkotlin/reflect/KProperty;


# instance fields
.field public final g:Lcom/sumsub/sns/internal/features/domain/v0;

.field public final h:Lkotlinx/coroutines/flow/w;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getIdDocType()Ljava/lang/String;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;

    .line 6
    .line 7
    const-string v3, "idDocType"

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
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->j:[Lkotlin/reflect/KProperty;

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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/v0;Lcom/sumsub/sns/internal/features/domain/e;)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p2

    .line 4
    move-object v3, p3

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p6

    .line 7
    .line 8
    .line 9
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/h;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/e;)V

    .line 10
    .line 11
    iput-object p5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->g:Lcom/sumsub/sns/internal/features/domain/v0;

    .line 12
    .line 13
    const-string p1, "KEY_FILE"

    .line 14
    const/4 p2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->h:Lkotlinx/coroutines/flow/w;

    .line 21
    .line 22
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 23
    .line 24
    const-string p2, "OTHER"

    .line 25
    const/4 p3, 0x0

    .line 26
    .line 27
    const-string p4, "KEY_ID_DOC_TYPE"

    .line 28
    .line 29
    .line 30
    invoke-direct {p1, v2, p4, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 31
    .line 32
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 33
    .line 34
    const-string p1, "Preview Selfie is created"

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 38
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 2
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    if-eqz p2, :cond_0

    .line 3
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    if-nez p2, :cond_1

    .line 4
    :cond_0
    const-string p2, "OTHER"

    .line 5
    :cond_1
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->j:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 6
    iget-object v0, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 7
    iget-object p3, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p3, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 9
    const-string p3, "KEY_FILE"

    invoke-virtual {p2, p3}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_2

    .line 10
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->c(Z)V

    .line 13
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;)V
    .locals 6

    if-nez p1, :cond_0

    .line 25
    const-string p1, "applicant null!"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 26
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object p1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {p1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object p1

    .line 27
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 28
    const-string v1, "SumSubVideoSelfie"

    const-string v2, "applicant null!"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 30
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object p1

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "showPicker: docSet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 32
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/m;->d:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 33
    :goto_0
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Enabled:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 34
    const-string/jumbo p1, "showPicker: show video selfie"

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 35
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/h;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/i;

    .line 36
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 37
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    .line 38
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 39
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->i:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->j:[Lkotlin/reflect/KProperty;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 40
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/i;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    :cond_2
    return-void
.end method

.method public final a(Ljava/io/File;Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "onHandleVideoSelfie. File - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", Phrase size - "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 16
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 17
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 18
    const-string v1, "KEY_FILE"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 20
    const-string v0, "KEY_PHRASE"

    invoke-virtual {p1, v0, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    const/4 p1, 0x1

    .line 22
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->c(Z)V

    return-void

    .line 23
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->h:Lkotlinx/coroutines/flow/w;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    if-nez p1, :cond_4

    .line 24
    sget-object v1, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public final c(Z)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/o;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/o;-><init>(ZLkotlin/coroutines/Continuation;)V

    .line 7
    const/4 p1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, v0, v2, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 12
    return-void
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

.method public final e()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v2, "Video Selfie uploaded successful. Document is "

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 29
    .line 30
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/b;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/b;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 37
    return-void
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

.method public final f()V
    .locals 15

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->h:Lkotlinx/coroutines/flow/w;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/io/File;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 13
    .line 14
    const-string v2, "KEY_PHRASE"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 26
    move-result v1

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/h;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    const-string v4, "Uploading video selfie fallback. File - "

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, ", Phrase - "

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/p;

    .line 80
    const/4 v1, 0x0

    .line 81
    .line 82
    .line 83
    invoke-direct {v5, p0, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/p;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    .line 84
    const/4 v6, 0x3

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v3, 0x0

    .line 87
    const/4 v4, 0x0

    .line 88
    .line 89
    .line 90
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 91
    return-void

    .line 92
    .line 93
    :cond_1
    :goto_0
    sget-object v9, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    .line 94
    .line 95
    const/16 v13, 0xe

    .line 96
    const/4 v14, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    const/4 v11, 0x0

    .line 99
    const/4 v12, 0x0

    .line 100
    move-object v8, p0

    .line 101
    .line 102
    .line 103
    invoke-static/range {v8 .. v14}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 104
    return-void
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
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
.end method

.method public final getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;

    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/j;-><init>(Ljava/io/File;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "Preview selfie error handling... "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/s;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->f()V

    .line 28
    return-void

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 32
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;->h:Lkotlinx/coroutines/flow/w;

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/l;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/l;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, v1}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 16
    .line 17
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/m;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/selfie/q;Lkotlin/coroutines/Continuation;)V

    .line 21
    const/4 v0, 0x0

    .line 22
    const/4 v1, 0x1

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0, p1, v1, v2}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/h;->onLoad()V

    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p1
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
