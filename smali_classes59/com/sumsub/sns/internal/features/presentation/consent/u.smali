.class public final Lcom/sumsub/sns/internal/features/presentation/consent/u;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic h:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

.field public final c:Lcom/sumsub/sns/internal/features/domain/W;

.field public final d:Lcom/sumsub/sns/internal/features/presentation/utils/e;

.field public final e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final f:Lkotlinx/coroutines/flow/w;

.field public final g:Lkotlinx/coroutines/flow/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getSelectedAgreement()Ljava/lang/Integer;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/consent/u;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v3, "selectedAgreement"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    aput-object v0, v2, v1

    .line 18
    .line 19
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/consent/u;->h:[Lkotlin/reflect/KProperty;

    .line 20
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/domain/W;Lcom/sumsub/sns/internal/core/domain/d;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/P;

    .line 3
    const/4 v1, 0x3

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/presentation/base/P;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1, p2, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->c:Lcom/sumsub/sns/internal/features/domain/W;

    .line 16
    .line 17
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/utils/e;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p5}, Lcom/sumsub/sns/internal/features/presentation/utils/e;-><init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;)V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->d:Lcom/sumsub/sns/internal/features/presentation/utils/e;

    .line 23
    .line 24
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 25
    const/4 p2, 0x0

    .line 26
    .line 27
    const-string p3, "consent_selected_agreement"

    .line 28
    const/4 p4, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p6, p3, p4, p2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 32
    .line 33
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p6, p3, p4}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->f:Lkotlinx/coroutines/flow/w;

    .line 40
    .line 41
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/consent/o;

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, p0, p4}, Lcom/sumsub/sns/internal/features/presentation/consent/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/u;Lkotlin/coroutines/Continuation;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->K(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->g:Lkotlinx/coroutines/flow/e;

    .line 51
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/consent/u;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/consent/r;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/consent/r;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/consent/r;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/consent/r;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/consent/r;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/consent/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/u;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/consent/r;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/consent/r;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->g:Lkotlinx/coroutines/flow/e;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/consent/r;->c:I

    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->H(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/consent/h;

    .line 3
    iget v2, v2, Lcom/sumsub/sns/internal/features/presentation/consent/h;->a:I

    .line 4
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/consent/u;->h:[Lkotlin/reflect/KProperty;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_5

    goto :goto_2

    .line 5
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v2, v3, :cond_4

    move-object v0, v1

    .line 6
    :cond_6
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/consent/h;

    :cond_7
    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/consent/u;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 7
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/consent/m;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/consent/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/consent/u;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/consent/s;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;->d:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;->d:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/consent/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/u;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;->b:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;->d:I

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget p0, v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;->a:I

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p0

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 58
    .line 59
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/consent/u;->h:[Lkotlin/reflect/KProperty;

    .line 60
    const/4 v5, 0x0

    .line 61
    .line 62
    aget-object v2, v2, v5

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    check-cast p1, Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 74
    move-result p1

    .line 75
    .line 76
    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;->a:I

    .line 77
    .line 78
    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/consent/s;->d:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->getStrings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 82
    move-result-object p0

    .line 83
    .line 84
    if-ne p0, v1, :cond_3

    .line 85
    return-object v1

    .line 86
    :cond_3
    move v6, p1

    .line 87
    move-object p1, p0

    .line 88
    move p0, v6

    .line 89
    .line 90
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 91
    .line 92
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->b:Ljava/util/List;

    .line 93
    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    .line 97
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 98
    move-result-object p0

    .line 99
    .line 100
    check-cast p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;

    .line 101
    .line 102
    if-eqz p0, :cond_4

    .line 103
    .line 104
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/i;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 105
    return-object p0

    .line 106
    :cond_4
    return-object v3
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
.end method


# virtual methods
.method public final buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->f:Lkotlinx/coroutines/flow/w;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->g:Lkotlinx/coroutines/flow/e;

    .line 5
    .line 6
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/consent/p;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v2, p1, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/consent/p;-><init>(Lcom/sumsub/sns/core/presentation/base/O;Lcom/sumsub/sns/internal/features/presentation/consent/u;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/flow/g;->m(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/consent/q;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/consent/q;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    .line 23
    move-result-object p1

    .line 24
    return-object p1
    .line 25
.end method

.method public final getDocumentType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "Agreements"

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

.method public final intent(Lcom/sumsub/sns/core/presentation/base/Q;)V
    .locals 11

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/consent/i;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/consent/t;

    .line 19
    const/4 p1, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v3, p0, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/consent/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/u;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/consent/u;)V

    .line 23
    const/4 v4, 0x2

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 29
    return-void

    .line 30
    .line 31
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/consent/k;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/consent/k;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/consent/k;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;->d:Lcom/sumsub/sns/internal/features/presentation/utils/e;

    .line 40
    .line 41
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/consent/z;

    .line 42
    .line 43
    .line 44
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/consent/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/u;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    new-instance v0, Lcom/sumsub/sns/internal/core/common/d1;

    .line 51
    const/4 v5, 0x0

    .line 52
    move-object v1, p0

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/common/d1;-><init>(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/presentation/utils/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 56
    const/4 v9, 0x3

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    move-object v5, p1

    .line 61
    move-object v8, v0

    .line 62
    .line 63
    .line 64
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 65
    return-void

    .line 66
    :cond_1
    move-object v1, p0

    .line 67
    .line 68
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/consent/j;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/consent/j;

    .line 73
    .line 74
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/consent/j;->a:I

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/consent/u;->e:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 81
    .line 82
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/consent/u;->h:[Lkotlin/reflect/KProperty;

    .line 83
    const/4 v3, 0x0

    .line 84
    .line 85
    aget-object v2, v2, v3

    .line 86
    .line 87
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 88
    .line 89
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    :cond_2
    return-void
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
.end method
