.class public final Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor;
.super Ljava/lang/Object;
.source "BuyPreCheckInterceptor.kt"

# interfaces
.implements Lcom/kubi/payment/precheck/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor;",
        "Lcom/kubi/payment/precheck/IPreCheckInterceptor;",
        "<init>",
        "()V",
        "intercept",
        "Lcom/kubi/payment/precheck/PreCheckResult;",
        "param",
        "Lcom/kubi/payment/precheck/PreCheckRequest;",
        "(Lcom/kubi/payment/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method


# virtual methods
.method public a(Lcom/kubi/payment/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1    # Lcom/kubi/payment/precheck/PreCheckRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/precheck/PreCheckRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/precheck/PreCheckResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->label:I

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
    iput v1, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;-><init>(Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-boolean p1, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->Z$2:Z

    .line 40
    .line 41
    iget v1, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->I$2:I

    .line 42
    .line 43
    iget-boolean v2, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->Z$1:Z

    .line 44
    .line 45
    iget v3, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->I$1:I

    .line 46
    .line 47
    iget-boolean v4, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->Z$0:Z

    .line 48
    .line 49
    iget v5, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->I$0:I

    .line 50
    .line 51
    iget-object v6, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, Lcom/kubi/payment/precheck/PreCheckResult;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lcom/kubi/payment/precheck/PreCheckRequest;

    .line 58
    .line 59
    .line 60
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    move v8, v1

    .line 62
    move v7, v3

    .line 63
    move v1, p1

    .line 64
    move-object p1, v0

    .line 65
    move v3, v2

    .line 66
    :goto_1
    move v2, v4

    .line 67
    goto :goto_5

    .line 68
    .line 69
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    throw p1

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 79
    .line 80
    sget-object p2, Lcom/kubi/payment/precheck/PreCheckResult$Success;->INSTANCE:Lcom/kubi/payment/precheck/PreCheckResult$Success;

    .line 81
    .line 82
    instance-of v2, p1, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;

    .line 83
    .line 84
    if-eqz v2, :cond_8

    .line 85
    move-object v2, p1

    .line 86
    .line 87
    check-cast v2, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->getNeedCheckTradingPassword()Z

    .line 91
    move-result v4

    .line 92
    .line 93
    if-eqz v4, :cond_3

    .line 94
    .line 95
    sget-object v5, Lcom/kubi/payment/helper/PreCheckHelper;->a:Lcom/kubi/payment/helper/PreCheckHelper;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Lcom/kubi/payment/helper/PreCheckHelper;->h()Z

    .line 99
    move-result v5

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move v5, v3

    .line 102
    .line 103
    .line 104
    :goto_2
    invoke-virtual {v2}, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->getNeedCheckEmail()Z

    .line 105
    move-result v6

    .line 106
    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    sget-object v7, Lcom/kubi/payment/helper/PreCheckHelper;->a:Lcom/kubi/payment/helper/PreCheckHelper;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7}, Lcom/kubi/payment/helper/PreCheckHelper;->f()Z

    .line 113
    move-result v7

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    move v7, v3

    .line 116
    .line 117
    .line 118
    :goto_3
    invoke-virtual {v2}, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->getNeedCheckPhone()Z

    .line 119
    move-result v2

    .line 120
    .line 121
    if-eqz v2, :cond_5

    .line 122
    .line 123
    sget-object v8, Lcom/kubi/payment/helper/PreCheckHelper;->a:Lcom/kubi/payment/helper/PreCheckHelper;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Lcom/kubi/payment/helper/PreCheckHelper;->g()Z

    .line 127
    move-result v8

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    move v8, v3

    .line 130
    .line 131
    :goto_4
    sget-object v9, Lcom/kubi/payment/helper/PreCheckHelper;->a:Lcom/kubi/payment/helper/PreCheckHelper;

    .line 132
    .line 133
    iput-object p1, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    move-result-object p2

    .line 138
    .line 139
    iput-object p2, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    iput v5, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->I$0:I

    .line 142
    .line 143
    iput-boolean v4, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->Z$0:Z

    .line 144
    .line 145
    iput v7, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->I$1:I

    .line 146
    .line 147
    iput-boolean v6, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->Z$1:Z

    .line 148
    .line 149
    iput v8, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->I$2:I

    .line 150
    .line 151
    iput-boolean v2, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->Z$2:Z

    .line 152
    .line 153
    iput v3, v0, Lcom/kubi/payment/fasttradev2/buy/precheck/BuyPreCheckInterceptor$intercept$1;->label:I

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9, v0}, Lcom/kubi/payment/helper/PreCheckHelper;->j(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 157
    move-result-object p2

    .line 158
    .line 159
    if-ne p2, v1, :cond_6

    .line 160
    return-object v1

    .line 161
    :cond_6
    move v1, v2

    .line 162
    move v3, v6

    .line 163
    goto :goto_1

    .line 164
    .line 165
    :goto_5
    check-cast p2, Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    move-result p2

    .line 170
    .line 171
    if-eqz v5, :cond_7

    .line 172
    .line 173
    if-eqz v7, :cond_7

    .line 174
    .line 175
    if-eqz v8, :cond_7

    .line 176
    .line 177
    if-eqz p2, :cond_7

    .line 178
    .line 179
    sget-object p1, Lcom/kubi/payment/precheck/PreCheckResult$Success;->INSTANCE:Lcom/kubi/payment/precheck/PreCheckResult$Success;

    .line 180
    return-object p1

    .line 181
    .line 182
    :cond_7
    sget-object v9, Lcom/kubi/otc/security/SecuritySettingDialog;->x0:Lcom/kubi/otc/security/SecuritySettingDialog$Companion;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/kubi/payment/precheck/PreCheckRequest;->getFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 186
    move-result-object p1

    .line 187
    .line 188
    new-instance v0, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;

    .line 189
    .line 190
    .line 191
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 192
    move-result-object v6

    .line 193
    .line 194
    const/16 v7, 0x10

    .line 195
    const/4 v8, 0x0

    .line 196
    const/4 v4, 0x1

    .line 197
    const/4 v5, 0x0

    .line 198
    .line 199
    .line 200
    invoke-direct/range {v0 .. v8}, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;-><init>(ZZZZZLjava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v9, p1, v0}, Lcom/kubi/otc/security/SecuritySettingDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;)V

    .line 204
    .line 205
    sget-object p1, Lcom/kubi/payment/precheck/PreCheckResult$Fail;->INSTANCE:Lcom/kubi/payment/precheck/PreCheckResult$Fail;

    .line 206
    return-object p1

    .line 207
    :cond_8
    return-object p2
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
.end method
