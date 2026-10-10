.class public final Lio/trtc/tuikit/atomicxcore/impl/search/p;
.super Lio/trtc/tuikit/atomicxcore/api/search/SearchStore;
.source "SourceFile"


# instance fields
.field public final a:Lkotlinx/coroutines/m0;

.field public b:Ljava/util/List;

.field public c:Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public final j:Lkotlinx/coroutines/flow/n;

.field public final k:Lkotlinx/coroutines/flow/n;

.field public final l:Lkotlinx/coroutines/flow/n;

.field public final m:Lkotlinx/coroutines/flow/n;

.field public final n:Lkotlinx/coroutines/flow/n;

.field public final o:Lkotlinx/coroutines/flow/n;

.field public final p:Lkotlinx/coroutines/flow/n;

.field public final q:Lkotlinx/coroutines/flow/n;

.field public final r:Lkotlinx/coroutines/flow/n;

.field public final s:Lkotlinx/coroutines/flow/n;

.field public final t:Lkotlinx/coroutines/flow/n;

.field public final u:Lkotlinx/coroutines/flow/n;

.field public final v:Lkotlinx/coroutines/flow/n;

.field public final w:Lio/trtc/tuikit/atomicxcore/api/search/SearchState;


# direct methods
.method public constructor <init>()V
    .locals 32

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/api/search/SearchStore;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, v1}, Lkotlinx/coroutines/q2;->b(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/z;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a:Lkotlinx/coroutines/m0;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->b:Ljava/util/List;

    .line 32
    .line 33
    const-string v1, ""

    .line 34
    .line 35
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->d:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->e:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->f:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->g:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->h:Lkotlinx/coroutines/flow/n;

    .line 52
    const/4 v2, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    iput-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->i:Lkotlinx/coroutines/flow/n;

    .line 63
    .line 64
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 68
    move-result-object v5

    .line 69
    .line 70
    iput-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->j:Lkotlinx/coroutines/flow/n;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 74
    move-result-object v6

    .line 75
    .line 76
    .line 77
    invoke-static {v6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 78
    move-result-object v6

    .line 79
    .line 80
    iput-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->k:Lkotlinx/coroutines/flow/n;

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 84
    move-result-object v7

    .line 85
    .line 86
    iput-object v7, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->l:Lkotlinx/coroutines/flow/n;

    .line 87
    .line 88
    .line 89
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 90
    move-result-object v8

    .line 91
    .line 92
    iput-object v8, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->m:Lkotlinx/coroutines/flow/n;

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 96
    move-result-object v9

    .line 97
    .line 98
    .line 99
    invoke-static {v9}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 100
    move-result-object v9

    .line 101
    .line 102
    iput-object v9, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->n:Lkotlinx/coroutines/flow/n;

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 106
    move-result-object v10

    .line 107
    .line 108
    iput-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->o:Lkotlinx/coroutines/flow/n;

    .line 109
    .line 110
    .line 111
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 112
    move-result-object v11

    .line 113
    .line 114
    iput-object v11, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->p:Lkotlinx/coroutines/flow/n;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 118
    move-result-object v12

    .line 119
    .line 120
    .line 121
    invoke-static {v12}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 122
    move-result-object v12

    .line 123
    .line 124
    iput-object v12, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->q:Lkotlinx/coroutines/flow/n;

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 128
    move-result-object v13

    .line 129
    .line 130
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->r:Lkotlinx/coroutines/flow/n;

    .line 131
    .line 132
    .line 133
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 134
    move-result-object v14

    .line 135
    .line 136
    iput-object v14, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->s:Lkotlinx/coroutines/flow/n;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 140
    move-result-object v15

    .line 141
    .line 142
    .line 143
    invoke-static {v15}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 144
    move-result-object v15

    .line 145
    .line 146
    iput-object v15, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->t:Lkotlinx/coroutines/flow/n;

    .line 147
    .line 148
    .line 149
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 150
    move-result-object v2

    .line 151
    .line 152
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->u:Lkotlinx/coroutines/flow/n;

    .line 153
    .line 154
    .line 155
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 156
    move-result-object v4

    .line 157
    .line 158
    iput-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->v:Lkotlinx/coroutines/flow/n;

    .line 159
    .line 160
    new-instance v16, Lio/trtc/tuikit/atomicxcore/api/search/SearchState;

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 164
    move-result-object v17

    .line 165
    .line 166
    .line 167
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 168
    move-result-object v18

    .line 169
    .line 170
    .line 171
    invoke-static {v5}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 172
    move-result-object v19

    .line 173
    .line 174
    .line 175
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 176
    move-result-object v20

    .line 177
    .line 178
    .line 179
    invoke-static {v7}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 180
    move-result-object v21

    .line 181
    .line 182
    .line 183
    invoke-static {v8}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 184
    move-result-object v22

    .line 185
    .line 186
    .line 187
    invoke-static {v9}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 188
    move-result-object v23

    .line 189
    .line 190
    .line 191
    invoke-static {v10}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 192
    move-result-object v24

    .line 193
    .line 194
    .line 195
    invoke-static {v11}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 196
    move-result-object v25

    .line 197
    .line 198
    .line 199
    invoke-static {v12}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 200
    move-result-object v26

    .line 201
    .line 202
    .line 203
    invoke-static {v13}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 204
    move-result-object v27

    .line 205
    .line 206
    .line 207
    invoke-static {v14}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 208
    move-result-object v28

    .line 209
    .line 210
    .line 211
    invoke-static {v15}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 212
    move-result-object v29

    .line 213
    .line 214
    .line 215
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 216
    move-result-object v30

    .line 217
    .line 218
    .line 219
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 220
    move-result-object v31

    .line 221
    .line 222
    .line 223
    invoke-direct/range {v16 .. v31}, Lio/trtc/tuikit/atomicxcore/api/search/SearchState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 224
    .line 225
    move-object/from16 v1, v16

    .line 226
    .line 227
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->w:Lio/trtc/tuikit/atomicxcore/api/search/SearchState;

    .line 228
    return-void
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
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lcom/tencent/imsdk/v2/V2TIMGroupInfo;)Lio/trtc/tuikit/atomicxcore/api/search/GroupSearchInfo;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getGroupID()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/search/GroupSearchInfo;

    .line 4
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/GroupType$Companion;

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getGroupType()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    invoke-virtual {p0, v2}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupType$Companion;->parse(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getGroupName()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    move-object p0, v3

    .line 6
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getMemberCount()I

    move-result v4

    .line 7
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getFaceUrl()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3

    move-object v5, v3

    .line 8
    :cond_3
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getIntroduction()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_4

    move-object v6, v3

    .line 9
    :cond_4
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption$Companion;

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getGroupAddOpt()I

    move-result v7

    invoke-virtual {v3, v7}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    move-result-object v7

    .line 10
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->getGroupApproveOpt()I

    move-result p1

    invoke-virtual {v3, p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    move-result-object v8

    move-object v3, p0

    .line 11
    invoke-direct/range {v0 .. v8}, Lio/trtc/tuikit/atomicxcore/api/search/GroupSearchInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;)V

    return-object v0
.end method

.method public static a(Lcom/tencent/imsdk/v2/V2TIMMessageSearchResultItem;)Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;
    .locals 7

    .line 129
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResultItem;->getConversationID()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v2, v0

    .line 130
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResultItem;->getMessageCount()I

    move-result v5

    .line 131
    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResultItem;->getMessageList()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 132
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 134
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 135
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lcom/tencent/imsdk/v2/V2TIMMessage;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v1

    .line 136
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    move-object v6, v0

    goto :goto_2

    .line 137
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 138
    :goto_2
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    const-string v3, ""

    const-string v4, ""

    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    return-object v1
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/search/p;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    instance-of v2, v1, Lio/trtc/tuikit/atomicxcore/impl/search/k;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;

    iget v3, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->i:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->i:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;

    invoke-direct {v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/search/k;-><init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->g:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 48
    iget v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->i:I

    const/16 v5, 0xa

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v11, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget v0, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->f:I

    iget v3, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->e:I

    iget v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->d:I

    iget v5, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->c:I

    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_18

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->d:I

    iget v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->c:I

    iget-object v7, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->b:Ljava/lang/Object;

    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;

    iget-object v8, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v12, v8

    move v8, v0

    move-object v0, v12

    move-object v12, v7

    goto/16 :goto_11

    :cond_3
    iget v0, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->f:I

    iget v3, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->e:I

    iget v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->d:I

    iget v5, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->c:I

    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_4
    iget v0, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->c:I

    iget-object v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->b:Ljava/lang/Object;

    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;

    iget-object v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v21, v4

    move v4, v0

    move-object/from16 v0, v21

    goto/16 :goto_6

    :cond_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;-><init>()V

    move-object/from16 v4, p1

    .line 50
    invoke-virtual {v1, v4}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setKeywordList(Ljava/util/List;)V

    .line 51
    invoke-virtual/range {p2 .. p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getMessageFilter()Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 52
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;->getConversationID()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setConversationID(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;->getSearchTimePosition()I

    move-result v12

    int-to-long v12, v12

    invoke-virtual {v1, v12, v13}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setSearchTimePosition(J)V

    .line 54
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;->getSearchTimePeriod()I

    move-result v12

    int-to-long v12, v12

    invoke-virtual {v1, v12, v13}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setSearchTimePeriod(J)V

    .line 55
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;->getSenderUserIDList()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v1, v12}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setSenderUserIDList(Ljava/util/List;)V

    .line 56
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;->getMessageTypeList()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 57
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 59
    check-cast v13, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 60
    sget-object v14, Lio/trtc/tuikit/atomicxcore/impl/search/a;->a:[I

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v13, v14, v13

    packed-switch v13, :pswitch_data_0

    move v13, v10

    goto :goto_2

    :pswitch_0
    move v13, v8

    goto :goto_2

    :pswitch_1
    const/16 v13, 0x9

    goto :goto_2

    :pswitch_2
    const/16 v13, 0x8

    goto :goto_2

    :pswitch_3
    const/4 v13, 0x6

    goto :goto_2

    :pswitch_4
    move v13, v6

    goto :goto_2

    :pswitch_5
    const/4 v13, 0x5

    goto :goto_2

    :pswitch_6
    move v13, v7

    goto :goto_2

    :pswitch_7
    move v13, v11

    .line 61
    :goto_2
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v13

    .line 62
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    move-object v12, v9

    .line 63
    :cond_7
    invoke-virtual {v1, v12}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setMessageTypeList(Ljava/util/List;)V

    .line 64
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getMessageFilter()Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchFilter;->getConversationID()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_9
    move-object v4, v9

    :goto_3
    if-eqz v4, :cond_b

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    move v4, v10

    goto :goto_5

    :cond_b
    :goto_4
    move v4, v11

    :goto_5
    xor-int/2addr v4, v11

    .line 65
    invoke-virtual/range {p2 .. p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->isCloudSearch()Z

    move-result v12

    if-eqz v12, :cond_18

    .line 66
    invoke-virtual/range {p2 .. p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchCount()I

    move-result v6

    invoke-virtual {v1, v6}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setSearchCount(I)V

    .line 67
    iget-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->g:Ljava/lang/String;

    invoke-virtual {v1, v6}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setSearchCursor(Ljava/lang/String;)V

    .line 68
    iput-object v0, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    iput-object v1, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->b:Ljava/lang/Object;

    iput v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->c:I

    iput v11, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->i:I

    new-instance v6, Lkotlin/coroutines/SafeContinuation;

    invoke-static {v2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v7

    invoke-direct {v6, v7}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 69
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    move-result-object v7

    .line 70
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/search/l;

    invoke-direct {v12, v6}, Lio/trtc/tuikit/atomicxcore/impl/search/l;-><init>(Lkotlin/coroutines/SafeContinuation;)V

    .line 71
    invoke-virtual {v7, v1, v12}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->searchCloudMessages(Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 72
    invoke-virtual {v6}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    if-ne v1, v6, :cond_c

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_c
    if-ne v1, v3, :cond_d

    goto/16 :goto_17

    :cond_d
    :goto_6
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResult;

    .line 73
    iget-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->g:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_e

    move v6, v11

    goto :goto_7

    :cond_e
    move v6, v10

    .line 74
    :goto_7
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResult;->getSearchCursor()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_f

    const-string v7, ""

    :cond_f
    iput-object v7, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->g:Ljava/lang/String;

    .line 75
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResult;->getMessageSearchResultItems()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_10

    .line 76
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v7, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v12, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 78
    check-cast v7, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResultItem;

    .line 79
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v7}, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a(Lcom/tencent/imsdk/v2/V2TIMMessageSearchResultItem;)Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    move-result-object v7

    .line 80
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 81
    :cond_10
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v12

    .line 82
    :cond_11
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResult;->getTotalCount()I

    move-result v1

    .line 83
    iget-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->g:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_12

    move v5, v11

    goto :goto_9

    :cond_12
    move v5, v10

    :goto_9
    if-nez v6, :cond_13

    if-eqz v4, :cond_13

    move-object v13, v0

    move/from16 v17, v1

    :goto_a
    move-object/from16 v16, v12

    goto :goto_c

    .line 84
    :cond_13
    iput-object v0, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    iput-object v9, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->b:Ljava/lang/Object;

    iput v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->c:I

    iput v6, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->d:I

    iput v1, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->e:I

    iput v5, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->f:I

    iput v8, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->i:I

    invoke-virtual {v0, v12, v2}, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_14

    goto/16 :goto_17

    :cond_14
    move v3, v1

    move-object v1, v2

    move-object v2, v0

    move v0, v5

    move v5, v4

    move v4, v6

    .line 85
    :goto_b
    move-object v12, v1

    check-cast v12, Ljava/util/List;

    move-object v13, v2

    move/from16 v17, v3

    move v6, v4

    move v4, v5

    move v5, v0

    goto :goto_a

    :goto_c
    if-eqz v6, :cond_15

    move v14, v11

    goto :goto_d

    :cond_15
    move v14, v10

    :goto_d
    if-eqz v4, :cond_16

    move v15, v11

    goto :goto_e

    :cond_16
    move v15, v10

    :goto_e
    if-eqz v5, :cond_17

    move/from16 v18, v11

    goto :goto_f

    :cond_17
    move/from16 v18, v10

    .line 86
    :goto_f
    invoke-virtual/range {v13 .. v18}, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a(ZZLjava/util/List;IZ)V

    goto/16 :goto_1d

    .line 87
    :cond_18
    iget-object v8, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->g:Ljava/lang/String;

    invoke-static {v8}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_19

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_10

    :cond_19
    move v8, v10

    .line 88
    :goto_10
    invoke-virtual {v1, v8}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setPageIndex(I)V

    .line 89
    invoke-virtual/range {p2 .. p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchCount()I

    move-result v12

    invoke-virtual {v1, v12}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;->setPageSize(I)V

    .line 90
    iput-object v0, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    move-object/from16 v12, p2

    iput-object v12, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->b:Ljava/lang/Object;

    iput v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->c:I

    iput v8, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->d:I

    iput v7, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->i:I

    new-instance v7, Lkotlin/coroutines/SafeContinuation;

    invoke-static {v2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v13

    invoke-direct {v7, v13}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 91
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    move-result-object v13

    .line 92
    new-instance v14, Lio/trtc/tuikit/atomicxcore/impl/search/m;

    invoke-direct {v14, v7}, Lio/trtc/tuikit/atomicxcore/impl/search/m;-><init>(Lkotlin/coroutines/SafeContinuation;)V

    .line 93
    invoke-virtual {v13, v1, v14}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->searchLocalMessages(Lcom/tencent/imsdk/v2/V2TIMMessageSearchParam;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 94
    invoke-virtual {v7}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    if-ne v1, v7, :cond_1a

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_1a
    if-ne v1, v3, :cond_1b

    goto/16 :goto_17

    :cond_1b
    :goto_11
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResult;

    if-nez v8, :cond_1c

    move v7, v11

    goto :goto_12

    :cond_1c
    move v7, v10

    .line 95
    :goto_12
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResult;->getMessageSearchResultItems()Ljava/util/List;

    move-result-object v13

    if-eqz v13, :cond_1d

    .line 96
    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v13, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v14, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 98
    check-cast v13, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResultItem;

    .line 99
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13}, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a(Lcom/tencent/imsdk/v2/V2TIMMessageSearchResultItem;)Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    move-result-object v13

    .line 100
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 101
    :cond_1d
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v14

    .line 102
    :cond_1e
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageSearchResult;->getTotalCount()I

    move-result v1

    .line 103
    invoke-virtual {v12}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchCount()I

    move-result v5

    .line 104
    rem-int v12, v1, v5

    if-nez v12, :cond_1f

    .line 105
    div-int v5, v1, v5

    goto :goto_14

    .line 106
    :cond_1f
    div-int v5, v1, v5

    add-int/2addr v5, v11

    :goto_14
    add-int/2addr v8, v11

    if-ge v8, v5, :cond_20

    move v5, v11

    goto :goto_15

    :cond_20
    move v5, v10

    .line 107
    :goto_15
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->g:Ljava/lang/String;

    if-nez v7, :cond_21

    if-eqz v4, :cond_21

    move-object v15, v0

    move/from16 v19, v1

    :goto_16
    move-object/from16 v18, v14

    goto :goto_19

    .line 108
    :cond_21
    iput-object v0, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    iput-object v9, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->b:Ljava/lang/Object;

    iput v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->c:I

    iput v7, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->d:I

    iput v1, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->e:I

    iput v5, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->f:I

    iput v6, v2, Lio/trtc/tuikit/atomicxcore/impl/search/k;->i:I

    invoke-virtual {v0, v14, v2}, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_22

    :goto_17
    return-object v3

    :cond_22
    move v3, v1

    move-object v1, v2

    move-object v2, v0

    move v0, v5

    move v5, v4

    move v4, v7

    .line 109
    :goto_18
    move-object v14, v1

    check-cast v14, Ljava/util/List;

    move-object v15, v2

    move/from16 v19, v3

    move v7, v4

    move v4, v5

    move v5, v0

    goto :goto_16

    :goto_19
    if-eqz v7, :cond_23

    move/from16 v16, v11

    goto :goto_1a

    :cond_23
    move/from16 v16, v10

    :goto_1a
    if-eqz v4, :cond_24

    move/from16 v17, v11

    goto :goto_1b

    :cond_24
    move/from16 v17, v10

    :goto_1b
    if-eqz v5, :cond_25

    move/from16 v20, v11

    goto :goto_1c

    :cond_25
    move/from16 v20, v10

    .line 110
    :goto_1c
    invoke-virtual/range {v15 .. v20}, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a(ZZLjava/util/List;IZ)V

    .line 111
    :goto_1d
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/search/p;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 3

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 25
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;-><init>()V

    .line 26
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setKeywordList(Ljava/util/List;)V

    .line 27
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getGroupMemberFilter()Lio/trtc/tuikit/atomicxcore/api/search/GroupMemberSearchFilter;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/GroupMemberSearchFilter;->getGroupIDList()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 28
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 29
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setGroupIDList(Ljava/util/List;)V

    .line 30
    :cond_0
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->isCloudSearch()Z

    move-result p1

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    .line 31
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchCount()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setSearchCount(I)V

    .line 32
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->f:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setSearchCursor(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getKeywordListMatchType()Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;

    move-result-object p1

    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;->OR:Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;

    if-ne p1, p2, :cond_1

    const/4 v2, 0x0

    .line 34
    :cond_1
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setKeywordListMatchType(I)V

    .line 35
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object p1

    .line 36
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/search/g;

    invoke-direct {p2, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/search/g;-><init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/SafeContinuation;)V

    .line 37
    invoke-virtual {p1, v1, p2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->searchCloudGroupMembers(Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setSearchMemberUserID(Z)V

    .line 39
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setSearchMemberNickName(Z)V

    .line 40
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setSearchMemberRemark(Z)V

    .line 41
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;->setSearchMemberNameCard(Z)V

    .line 42
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object p1

    .line 43
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/search/h;

    invoke-direct {p2, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/search/h;-><init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/SafeContinuation;)V

    .line 44
    invoke-virtual {p1, v1, p2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->searchGroupMembers(Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchParam;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 45
    :goto_0
    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/search/p;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/impl/search/d;)Ljava/lang/Object;
    .locals 3

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 14
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;-><init>()V

    .line 15
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->setKeywordList(Ljava/util/List;)V

    const/4 p1, 0x1

    .line 16
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->setSearchUserID(Z)V

    .line 17
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->setSearchNickName(Z)V

    .line 18
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;->setSearchRemark(Z)V

    .line 19
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    move-result-object p1

    .line 20
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/search/f;

    invoke-direct {v2, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/search/f;-><init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/SafeContinuation;)V

    .line 21
    invoke-virtual {p1, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->searchFriends(Lcom/tencent/imsdk/v2/V2TIMFriendSearchParam;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 22
    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/impl/search/p;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    .line 6
    .line 7
    .line 8
    invoke-static {p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->setKeywordList(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->isCloudSearch()Z

    .line 24
    move-result p1

    .line 25
    const/4 v2, 0x1

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchCount()I

    .line 31
    move-result p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->setSearchCount(I)V

    .line 35
    .line 36
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->e:Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->setSearchCursor(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getKeywordListMatchType()Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;->OR:Lio/trtc/tuikit/atomicxcore/api/search/KeywordListMatchType;

    .line 46
    .line 47
    if-ne p1, p2, :cond_0

    .line 48
    const/4 v2, 0x0

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->setKeywordListMatchType(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/search/i;

    .line 58
    .line 59
    .line 60
    invoke-direct {p2, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/search/i;-><init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/SafeContinuation;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1, p2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->searchCloudGroups(Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 64
    goto :goto_0

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->setSearchGroupID(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;->setSearchGroupName(Z)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/search/j;

    .line 77
    .line 78
    .line 79
    invoke-direct {p2, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/search/j;-><init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/SafeContinuation;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1, p2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->searchGroups(Lcom/tencent/imsdk/v2/V2TIMGroupSearchParam;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    .line 86
    move-result-object p0

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    if-ne p0, p1, :cond_2

    .line 93
    .line 94
    .line 95
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    if-ne p0, p1, :cond_3

    .line 102
    return-object p0

    .line 103
    .line 104
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 105
    return-object p0
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
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/impl/search/p;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    .line 6
    .line 7
    .line 8
    invoke-static {p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;->setKeywordList(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getUserFilter()Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;->getGender()Lio/trtc/tuikit/atomicxcore/api/login/Gender;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/login/Gender;->getValue()I

    .line 34
    move-result v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;->setGender(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;->getMinBirthday()I

    .line 41
    move-result v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;->setMinBirthday(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/UserSearchFilter;->getMaxBirthday()Ljava/lang/Integer;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 54
    move-result p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;->setMaxBirthday(I)V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchCount()I

    .line 61
    move-result p1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;->setSearchCount(I)V

    .line 65
    .line 66
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->d:Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;->setSearchCursor(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/search/o;

    .line 76
    .line 77
    .line 78
    invoke-direct {p2, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/search/o;-><init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/SafeContinuation;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v1, p2}, Lcom/tencent/imsdk/v2/V2TIMManager;->searchUsers(Lcom/tencent/imsdk/v2/V2TIMUserSearchParam;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    .line 85
    move-result-object p0

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    if-ne p0, p1, :cond_1

    .line 92
    .line 93
    .line 94
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    if-ne p0, p1, :cond_2

    .line 101
    return-object p0

    .line 102
    .line 103
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 104
    return-object p0
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
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/search/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/search/b;-><init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 139
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;->d:I

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 140
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_3

    .line 141
    :cond_3
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 142
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 143
    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    .line 144
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getConversationID()Ljava/lang/String;

    move-result-object v5

    .line 145
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 146
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 147
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    .line 148
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_5

    .line 149
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 150
    :cond_6
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    .line 151
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    :goto_3
    return-object p1

    .line 152
    :cond_7
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;->a:Ljava/util/List;

    iput v4, v0, Lio/trtc/tuikit/atomicxcore/impl/search/b;->d:I

    new-instance v2, Lkotlin/coroutines/SafeContinuation;

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v4

    invoke-direct {v2, v4}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 153
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    move-result-object v4

    .line 154
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/search/c;

    invoke-direct {v5, v2}, Lio/trtc/tuikit/atomicxcore/impl/search/c;-><init>(Lkotlin/coroutines/SafeContinuation;)V

    .line 155
    invoke-virtual {v4, p2, v5}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->getConversationList(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 156
    invoke-virtual {v2}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    if-ne p2, v2, :cond_8

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_8
    if-ne p2, v1, :cond_9

    return-object v1

    :cond_9
    :goto_4
    check-cast p2, Ljava/util/Map;

    .line 157
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 159
    move-object v2, v1

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    .line 160
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getConversationID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMConversation;

    if-eqz v1, :cond_c

    .line 161
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getShowName()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    if-nez v3, :cond_a

    move-object v3, v4

    goto :goto_6

    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 162
    :goto_6
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getFaceUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_b

    move-object v5, v4

    goto :goto_7

    :cond_b
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v5, v1

    :goto_7
    const/16 v8, 0x19

    const/4 v9, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 163
    invoke-static/range {v2 .. v9}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->copy$default(Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    move-result-object v2

    .line 164
    :cond_c
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_d
    return-object v0
.end method

.method public final a(ZZLjava/util/List;IZ)V
    .locals 7

    if-eqz p1, :cond_0

    .line 112
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->t:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1, p3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 113
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->t:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 114
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    .line 115
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    .line 116
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getMessageList()Ljava/util/List;

    move-result-object p2

    .line 117
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->t:Lkotlinx/coroutines/flow/n;

    .line 118
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    .line 119
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getConversationID()Ljava/lang/String;

    move-result-object v2

    .line 120
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getConversationShowName()Ljava/lang/String;

    move-result-object v3

    .line 121
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getConversationAvatarURL()Ljava/lang/String;

    move-result-object v4

    .line 122
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getMessageCount()I

    move-result v5

    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;

    invoke-virtual {p3}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getMessageCount()I

    move-result p3

    add-int/2addr v5, p3

    .line 123
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;->getMessageList()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    .line 124
    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/api/search/MessageSearchResultItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    .line 125
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    .line 126
    :cond_1
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->t:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2, p3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 127
    :cond_2
    :goto_0
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->u:Lkotlinx/coroutines/flow/n;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 128
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->v:Lkotlinx/coroutines/flow/n;

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final getSearchState()Lio/trtc/tuikit/atomicxcore/api/search/SearchState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->w:Lio/trtc/tuikit/atomicxcore/api/search/SearchState;

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
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final search(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "keywordList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "option"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/d;->f:Lio/trtc/tuikit/atomicxcore/impl/common/d;

    .line 13
    .line 14
    const-string v1, "componentType"

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    new-instance v0, Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    const/16 v1, 0x3ee

    .line 25
    int-to-long v3, v1

    .line 26
    .line 27
    const-string v1, "UIComponentType"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    const-string/jumbo v1, "toString(...)"

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/common/m;

    .line 47
    .line 48
    .line 49
    invoke-direct {v3}, Lio/trtc/tuikit/atomicxcore/impl/common/m;-><init>()V

    .line 50
    .line 51
    const-string v4, "reportTUIFeatureUsage"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v4, v0, v3}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 58
    move-result v0

    .line 59
    .line 60
    const/16 v1, 0x1781

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    if-eqz p3, :cond_2

    .line 65
    .line 66
    const-string p1, "Keyword list cannot be empty"

    .line 67
    .line 68
    .line 69
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 70
    return-void

    .line 71
    .line 72
    .line 73
    :cond_0
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchType()Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->getValue()I

    .line 78
    move-result v0

    .line 79
    .line 80
    if-nez v0, :cond_1

    .line 81
    .line 82
    if-eqz p3, :cond_2

    .line 83
    .line 84
    const-string p1, "Search type cannot be empty"

    .line 85
    .line 86
    .line 87
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 88
    return-void

    .line 89
    .line 90
    .line 91
    :cond_1
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchCount()I

    .line 92
    move-result v0

    .line 93
    .line 94
    if-nez v0, :cond_3

    .line 95
    .line 96
    if-eqz p3, :cond_2

    .line 97
    .line 98
    const-string p1, "Search count must be greater than 0"

    .line 99
    .line 100
    .line 101
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 102
    :cond_2
    return-void

    .line 103
    .line 104
    :cond_3
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->b:Ljava/util/List;

    .line 105
    .line 106
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->c:Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchType()Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->User:Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 116
    move-result v3

    .line 117
    .line 118
    const-string v4, ""

    .line 119
    const/4 v5, 0x0

    .line 120
    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->d:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->h:Lkotlinx/coroutines/flow/n;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 129
    move-result-object v6

    .line 130
    .line 131
    .line 132
    invoke-interface {v3, v6}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 133
    .line 134
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->i:Lkotlinx/coroutines/flow/n;

    .line 135
    .line 136
    .line 137
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    move-result-object v6

    .line 139
    .line 140
    .line 141
    invoke-interface {v3, v6}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->j:Lkotlinx/coroutines/flow/n;

    .line 144
    .line 145
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    invoke-interface {v3, v6}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    :cond_4
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->Friend:Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v3}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 154
    move-result v6

    .line 155
    .line 156
    if-eqz v6, :cond_5

    .line 157
    .line 158
    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->k:Lkotlinx/coroutines/flow/n;

    .line 159
    .line 160
    .line 161
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 162
    move-result-object v7

    .line 163
    .line 164
    .line 165
    invoke-interface {v6, v7}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 166
    .line 167
    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->l:Lkotlinx/coroutines/flow/n;

    .line 168
    .line 169
    .line 170
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    move-result-object v7

    .line 172
    .line 173
    .line 174
    invoke-interface {v6, v7}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->m:Lkotlinx/coroutines/flow/n;

    .line 177
    .line 178
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    invoke-interface {v6, v7}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 182
    .line 183
    :cond_5
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->Group:Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v6}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 187
    move-result v7

    .line 188
    .line 189
    if-eqz v7, :cond_6

    .line 190
    .line 191
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->e:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v7, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->n:Lkotlinx/coroutines/flow/n;

    .line 194
    .line 195
    .line 196
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 197
    move-result-object v8

    .line 198
    .line 199
    .line 200
    invoke-interface {v7, v8}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    iget-object v7, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->o:Lkotlinx/coroutines/flow/n;

    .line 203
    .line 204
    .line 205
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    move-result-object v8

    .line 207
    .line 208
    .line 209
    invoke-interface {v7, v8}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 210
    .line 211
    iget-object v7, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->p:Lkotlinx/coroutines/flow/n;

    .line 212
    .line 213
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    invoke-interface {v7, v8}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    :cond_6
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->GroupMember:Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v7}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 222
    move-result v8

    .line 223
    .line 224
    if-eqz v8, :cond_7

    .line 225
    .line 226
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->f:Ljava/lang/String;

    .line 227
    .line 228
    iget-object v8, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->q:Lkotlinx/coroutines/flow/n;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 232
    move-result-object v9

    .line 233
    .line 234
    .line 235
    invoke-interface {v8, v9}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 236
    .line 237
    iget-object v8, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->r:Lkotlinx/coroutines/flow/n;

    .line 238
    .line 239
    .line 240
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    move-result-object v9

    .line 242
    .line 243
    .line 244
    invoke-interface {v8, v9}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 245
    .line 246
    iget-object v8, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->s:Lkotlinx/coroutines/flow/n;

    .line 247
    .line 248
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 249
    .line 250
    .line 251
    invoke-interface {v8, v9}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 252
    .line 253
    :cond_7
    sget-object v8, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->Message:Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v8}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 257
    move-result v0

    .line 258
    .line 259
    if-eqz v0, :cond_8

    .line 260
    .line 261
    iput-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->g:Ljava/lang/String;

    .line 262
    .line 263
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->t:Lkotlinx/coroutines/flow/n;

    .line 264
    .line 265
    .line 266
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 267
    move-result-object v4

    .line 268
    .line 269
    .line 270
    invoke-interface {v0, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 271
    .line 272
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->u:Lkotlinx/coroutines/flow/n;

    .line 273
    .line 274
    .line 275
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    move-result-object v4

    .line 277
    .line 278
    .line 279
    invoke-interface {v0, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->v:Lkotlinx/coroutines/flow/n;

    .line 282
    .line 283
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 284
    .line 285
    .line 286
    invoke-interface {v0, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 287
    .line 288
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 289
    .line 290
    .line 291
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchType()Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 295
    move-result-object v4

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v1}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 299
    move-result v4

    .line 300
    .line 301
    if-eqz v4, :cond_9

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    :cond_9
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchType()Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 308
    move-result-object v1

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v3}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 312
    move-result v1

    .line 313
    .line 314
    if-eqz v1, :cond_a

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    :cond_a
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchType()Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 321
    move-result-object v1

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v6}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 325
    move-result v1

    .line 326
    .line 327
    if-eqz v1, :cond_b

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    :cond_b
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchType()Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 334
    move-result-object v1

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v7}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 338
    move-result v1

    .line 339
    .line 340
    if-eqz v1, :cond_c

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    :cond_c
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;->getSearchType()Lio/trtc/tuikit/atomicxcore/api/search/SearchType;

    .line 347
    move-result-object v1

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v8}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->contains(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;)Z

    .line 351
    move-result v1

    .line 352
    .line 353
    if-eqz v1, :cond_d

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    :cond_d
    iget-object v7, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a:Lkotlinx/coroutines/m0;

    .line 359
    .line 360
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/search/e;

    .line 361
    const/4 v6, 0x0

    .line 362
    move-object v3, p0

    .line 363
    move-object v4, p1

    .line 364
    move-object v2, p3

    .line 365
    move-object v1, v0

    .line 366
    move-object v0, v5

    .line 367
    move-object v5, p2

    .line 368
    .line 369
    .line 370
    invoke-direct/range {v0 .. v6}, Lio/trtc/tuikit/atomicxcore/impl/search/e;-><init>(Ljava/util/ArrayList;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/impl/search/p;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;Lkotlin/coroutines/Continuation;)V

    .line 371
    const/4 v6, 0x3

    .line 372
    move-object v2, v7

    .line 373
    const/4 v7, 0x0

    .line 374
    const/4 v3, 0x0

    .line 375
    const/4 v4, 0x0

    .line 376
    move-object v5, v0

    .line 377
    .line 378
    .line 379
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 380
    return-void
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
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final searchMore(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 11

    .line 1
    .line 2
    const-string v0, "searchType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->c:Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;

    .line 8
    .line 9
    const/16 v0, 0x1781

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    if-eqz p2, :cond_3

    .line 14
    .line 15
    const-string p1, "Please call search first"

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, v0, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->getValue()I

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/search/SearchType;->getValue()I

    .line 29
    move-result v1

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->bitCount(I)I

    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    .line 36
    if-eq v1, v2, :cond_2

    .line 37
    :cond_1
    move-object v5, p2

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a:Lkotlinx/coroutines/m0;

    .line 41
    .line 42
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/search/n;

    .line 43
    const/4 v6, 0x0

    .line 44
    move-object v3, p0

    .line 45
    move-object v2, p1

    .line 46
    move-object v5, p2

    .line 47
    .line 48
    .line 49
    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/impl/search/n;-><init>(Lio/trtc/tuikit/atomicxcore/api/search/SearchType;Lio/trtc/tuikit/atomicxcore/impl/search/p;Lio/trtc/tuikit/atomicxcore/api/search/SearchOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 50
    const/4 v9, 0x3

    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    move-object v5, v0

    .line 54
    move-object v8, v1

    .line 55
    .line 56
    .line 57
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 58
    return-void

    .line 59
    .line 60
    :goto_0
    if-eqz v5, :cond_3

    .line 61
    .line 62
    const-string p1, "searchMore only supports single search type"

    .line 63
    .line 64
    .line 65
    invoke-interface {v5, v0, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 66
    :cond_3
    return-void
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
.end method
