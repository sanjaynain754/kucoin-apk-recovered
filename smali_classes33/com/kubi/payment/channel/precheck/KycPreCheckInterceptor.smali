.class public final Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor;
.super Ljava/lang/Object;
.source "KycPreCheckInterceptor.kt"

# interfaces
.implements Lcom/kubi/payment/channel/precheck/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor;",
        "Lcom/kubi/payment/channel/precheck/IPreCheckInterceptor;",
        "<init>",
        "()V",
        "intercept",
        "Lcom/kubi/payment/channel/precheck/PreCheckResult;",
        "param",
        "Lcom/kubi/payment/channel/precheck/PreCheckRequest;",
        "(Lcom/kubi/payment/channel/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "launchFlutterKycPage",
        "",
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
.method public a(Lcom/kubi/payment/channel/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1    # Lcom/kubi/payment/channel/precheck/PreCheckRequest;
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
            "Lcom/kubi/payment/channel/precheck/PreCheckRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/channel/precheck/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->label:I

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
    iput v1, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;-><init>(Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->label:I

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
    iget-object p1, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->L$3:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/payment/data/source/a;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/payment/data/entities/UserInfo$Request;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/kubi/payment/channel/precheck/b;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lcom/kubi/payment/channel/precheck/PreCheckRequest;

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    move-object v8, p2

    .line 58
    move-object p2, p1

    .line 59
    move-object p1, v0

    .line 60
    move-object v0, v8

    .line 61
    goto :goto_1

    .line 62
    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    throw p1

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    .line 74
    sget-object p2, Lcom/kubi/payment/channel/precheck/b$c;->a:Lcom/kubi/payment/channel/precheck/b$c;

    .line 75
    .line 76
    new-instance v2, Lcom/kubi/payment/data/entities/UserInfo$Request;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getTradeType()Ljava/lang/String;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getFiatCurrency()Ljava/lang/String;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getPaymentMethodCode()Ljava/lang/String;

    .line 88
    move-result-object v6

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getChannelId()Ljava/lang/String;

    .line 92
    move-result-object v7

    .line 93
    .line 94
    .line 95
    invoke-direct {v2, v4, v5, v6, v7}, Lcom/kubi/payment/data/entities/UserInfo$Request;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    sget-object v4, Lcom/kubi/payment/a;->a:Lcom/kubi/payment/a;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Lcom/kubi/payment/a;->f()Lcom/kubi/payment/data/source/a;

    .line 101
    move-result-object v4

    .line 102
    .line 103
    iput-object p1, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p2, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->L$1:Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    move-result-object v5

    .line 110
    .line 111
    iput-object v5, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->L$2:Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object v5

    .line 116
    .line 117
    iput-object v5, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->L$3:Ljava/lang/Object;

    .line 118
    .line 119
    iput v3, v0, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor$intercept$1;->label:I

    .line 120
    .line 121
    .line 122
    invoke-interface {v4, v2, v0}, Lcom/kubi/payment/data/source/a;->E(Lcom/kubi/payment/data/entities/UserInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    if-ne v0, v1, :cond_3

    .line 126
    return-object v1

    .line 127
    .line 128
    :cond_3
    :goto_1
    check-cast v0, Lnt/k;

    .line 129
    .line 130
    instance-of v1, v0, Lnt/k$b;

    .line 131
    const/4 v2, 0x0

    .line 132
    .line 133
    if-eqz v1, :cond_a

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getTradeType()Ljava/lang/String;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    const-string v3, "RECHARGE"

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v1

    .line 144
    .line 145
    if-eqz v1, :cond_6

    .line 146
    .line 147
    check-cast v0, Lnt/k$b;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 151
    move-result-object p2

    .line 152
    .line 153
    check-cast p2, Lcom/kubi/payment/data/entities/UserInfo$Response;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Lcom/kubi/payment/data/entities/UserInfo$Response;->getPermission()Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;

    .line 157
    move-result-object p2

    .line 158
    .line 159
    if-eqz p2, :cond_4

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;->getCanRecharge()Ljava/lang/Boolean;

    .line 163
    move-result-object v2

    .line 164
    .line 165
    .line 166
    :cond_4
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 167
    move-result p2

    .line 168
    .line 169
    if-eqz p2, :cond_5

    .line 170
    .line 171
    sget-object p1, Lcom/kubi/payment/channel/precheck/b$c;->a:Lcom/kubi/payment/channel/precheck/b$c;

    .line 172
    return-object p1

    .line 173
    .line 174
    .line 175
    :cond_5
    invoke-virtual {p0, p1}, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor;->b(Lcom/kubi/payment/channel/precheck/PreCheckRequest;)V

    .line 176
    .line 177
    sget-object p1, Lcom/kubi/payment/channel/precheck/b$a;->a:Lcom/kubi/payment/channel/precheck/b$a;

    .line 178
    return-object p1

    .line 179
    .line 180
    .line 181
    :cond_6
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getTradeType()Ljava/lang/String;

    .line 182
    move-result-object v1

    .line 183
    .line 184
    const-string v3, "WITHDRAW"

    .line 185
    .line 186
    .line 187
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    move-result v1

    .line 189
    .line 190
    if-eqz v1, :cond_9

    .line 191
    .line 192
    check-cast v0, Lnt/k$b;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 196
    move-result-object p2

    .line 197
    .line 198
    check-cast p2, Lcom/kubi/payment/data/entities/UserInfo$Response;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2}, Lcom/kubi/payment/data/entities/UserInfo$Response;->getPermission()Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;

    .line 202
    move-result-object p2

    .line 203
    .line 204
    if-eqz p2, :cond_7

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2}, Lcom/kubi/payment/data/entities/UserInfo$UserPermissionResponse;->getCanWithdraw()Ljava/lang/Boolean;

    .line 208
    move-result-object v2

    .line 209
    .line 210
    .line 211
    :cond_7
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 212
    move-result p2

    .line 213
    .line 214
    if-eqz p2, :cond_8

    .line 215
    .line 216
    sget-object p1, Lcom/kubi/payment/channel/precheck/b$c;->a:Lcom/kubi/payment/channel/precheck/b$c;

    .line 217
    return-object p1

    .line 218
    .line 219
    .line 220
    :cond_8
    invoke-virtual {p0, p1}, Lcom/kubi/payment/channel/precheck/KycPreCheckInterceptor;->b(Lcom/kubi/payment/channel/precheck/PreCheckRequest;)V

    .line 221
    .line 222
    sget-object p1, Lcom/kubi/payment/channel/precheck/b$a;->a:Lcom/kubi/payment/channel/precheck/b$a;

    .line 223
    return-object p1

    .line 224
    :cond_9
    return-object p2

    .line 225
    .line 226
    :cond_a
    instance-of p1, v0, Lnt/k$a;

    .line 227
    .line 228
    if-eqz p1, :cond_b

    .line 229
    .line 230
    sget-object p1, Lcom/kubi/payment/channel/precheck/b$a;->a:Lcom/kubi/payment/channel/precheck/b$a;

    .line 231
    .line 232
    check-cast v0, Lnt/k$a;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Lnt/k$a;->a()Ljava/lang/Exception;

    .line 236
    move-result-object p2

    .line 237
    const/4 v0, 0x2

    .line 238
    .line 239
    .line 240
    invoke-static {p2, v2, v0, v2}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 241
    return-object p1

    .line 242
    .line 243
    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 244
    .line 245
    .line 246
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 247
    throw p1
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

.method public final b(Lcom/kubi/payment/channel/precheck/PreCheckRequest;)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/payment/flutter/e;->a:Lcom/kubi/payment/flutter/e;

    .line 5
    .line 6
    const-string v2, "payment/channel/kyc"

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2, v3, v4, v5}, Lcom/kubi/payment/flutter/e;->b(Lcom/kubi/payment/flutter/e;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getPaymentMethodCode()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    const-string v2, "paymentMethodCode"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getChannelId()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    const-string v2, "channelId"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getTradeType()Ljava/lang/String;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    const-string v2, "tradeType"

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getFiatCurrency()Ljava/lang/String;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    const-string v2, "fiatCurrency"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2, v1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getTradeType()Ljava/lang/String;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    const-string v1, "RECHARGE"

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    move-result p1

    .line 88
    .line 89
    if-eqz p1, :cond_0

    .line 90
    .line 91
    const-string p1, "B7FiatDepositMethod"

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :cond_0
    const-string p1, "B7FiatWithdraw"

    .line 95
    .line 96
    :goto_0
    const-string v1, "PaymentMethod"

    .line 97
    const/4 v2, 0x4

    .line 98
    .line 99
    .line 100
    invoke-static {p1, v1, v5, v2, v5}, Lqq/m;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    const-string v1, "spm"

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1, p1}, Lay/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lay/a;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lay/a;->k()Z

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
.end method
