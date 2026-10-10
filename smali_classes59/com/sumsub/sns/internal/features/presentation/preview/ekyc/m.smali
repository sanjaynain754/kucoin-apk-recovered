.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;
.super Lcom/sumsub/sns/internal/features/presentation/preview/a;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/form/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/a<",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;",
        ">;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/a;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;",
        "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;",
        "Lcom/sumsub/sns/internal/core/presentation/form/d;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/preview/ekyc/c",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSEkycFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEkycFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/SNSEkycFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,520:1\n106#2,15:521\n27#3,4:536\n27#3,4:591\n1#4:540\n49#5:541\n65#5,16:542\n93#5,3:558\n50#6,12:561\n50#6,12:579\n298#7,2:573\n256#7,2:575\n256#7,2:577\n*S KotlinDebug\n*F\n+ 1 SNSEkycFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/SNSEkycFragment\n*L\n61#1:521,15\n71#1:536,4\n63#1:591,4\n190#1:541\n190#1:542,16\n190#1:558,3\n275#1:561,12\n382#1:579,12\n328#1:573,2\n376#1:575,2\n377#1:577,2\n*E\n"
    }
.end annotation


# static fields
.field public static final v:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/c;

.field public static final synthetic w:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/sumsub/sns/internal/core/common/L;

.field public final c:Lcom/sumsub/sns/internal/core/common/L;

.field public final d:Lcom/sumsub/sns/internal/core/common/L;

.field public final e:Lcom/sumsub/sns/internal/core/common/L;

.field public final f:Lcom/sumsub/sns/internal/core/common/L;

.field public final g:Lcom/sumsub/sns/internal/core/common/L;

.field public final h:Lcom/sumsub/sns/internal/core/common/L;

.field public final i:Lcom/sumsub/sns/internal/core/common/L;

.field public final j:Lcom/sumsub/sns/internal/core/common/L;

.field public final k:Lcom/sumsub/sns/internal/core/common/L;

.field public final l:Lcom/sumsub/sns/internal/core/common/L;

.field public final m:Lcom/sumsub/sns/internal/core/common/L;

.field public n:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public final o:Lcom/sumsub/sns/internal/core/common/L;

.field public final p:Lcom/sumsub/sns/internal/core/common/L;

.field public final q:Lcom/sumsub/sns/internal/core/common/L;

.field public final r:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:Lcom/sumsub/sns/internal/core/analytics/Screen;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "primaryButton"

    .line 6
    .line 7
    const-string v2, "getPrimaryButton()Landroid/widget/Button;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    const-string v2, "btnSkip"

    .line 15
    .line 16
    const-string v4, "getBtnSkip()Landroid/widget/Button;"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    const-string/jumbo v4, "tvTitle"

    .line 24
    .line 25
    const-string v5, "getTvTitle()Landroid/widget/TextView;"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    .line 32
    const-string/jumbo v5, "tvSubtitle"

    .line 33
    .line 34
    const-string v6, "getTvSubtitle()Landroid/widget/TextView;"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    const-string v6, "formContainer"

    .line 41
    .line 42
    const-string v7, "getFormContainer()Landroid/view/ViewGroup;"

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    .line 49
    const-string/jumbo v7, "pinField"

    .line 50
    .line 51
    const-string v8, "getPinField()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;"

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 55
    move-result-object v7

    .line 56
    .line 57
    .line 58
    const-string/jumbo v8, "pinError"

    .line 59
    .line 60
    const-string v9, "getPinError()Landroid/widget/TextView;"

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v8, v9, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 64
    move-result-object v8

    .line 65
    .line 66
    const-string v9, "btnResendCode"

    .line 67
    .line 68
    const-string v10, "getBtnResendCode()Lcom/sumsub/sns/core/widget/SNSLinkButton;"

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v9, v10, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 72
    move-result-object v9

    .line 73
    .line 74
    const-string v10, "errorBottomSheet"

    .line 75
    .line 76
    const-string v11, "getErrorBottomSheet()Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;"

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v10, v11, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 80
    move-result-object v10

    .line 81
    .line 82
    .line 83
    const-string/jumbo v11, "webView"

    .line 84
    .line 85
    const-string v12, "getWebView()Landroid/webkit/WebView;"

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v11, v12, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 89
    move-result-object v11

    .line 90
    .line 91
    const-string v12, "bottomSheet"

    .line 92
    .line 93
    const-string v13, "getBottomSheet()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;"

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v12, v13, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 97
    move-result-object v12

    .line 98
    .line 99
    const-string v13, "externalBrowserStub"

    .line 100
    .line 101
    const-string v14, "getExternalBrowserStub()Landroid/view/ViewGroup;"

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v13, v14, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 105
    move-result-object v13

    .line 106
    .line 107
    const-string v14, "ivIcon"

    .line 108
    .line 109
    const-string v15, "getIvIcon()Landroid/widget/ImageView;"

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v14, v15, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 113
    move-result-object v14

    .line 114
    .line 115
    .line 116
    const-string/jumbo v15, "tvStatusTitle"

    .line 117
    .line 118
    move-object/from16 v16, v1

    .line 119
    .line 120
    const-string v1, "getTvStatusTitle()Landroid/widget/TextView;"

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v15, v1, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    .line 127
    const-string/jumbo v15, "tvStatusComment"

    .line 128
    .line 129
    move-object/from16 v17, v1

    .line 130
    .line 131
    const-string v1, "getTvStatusComment()Landroid/widget/TextView;"

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v15, v1, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    const/16 v1, 0xf

    .line 138
    .line 139
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 140
    .line 141
    aput-object v16, v1, v3

    .line 142
    const/4 v3, 0x1

    .line 143
    .line 144
    aput-object v2, v1, v3

    .line 145
    const/4 v2, 0x2

    .line 146
    .line 147
    aput-object v4, v1, v2

    .line 148
    const/4 v2, 0x3

    .line 149
    .line 150
    aput-object v5, v1, v2

    .line 151
    const/4 v2, 0x4

    .line 152
    .line 153
    aput-object v6, v1, v2

    .line 154
    const/4 v2, 0x5

    .line 155
    .line 156
    aput-object v7, v1, v2

    .line 157
    const/4 v2, 0x6

    .line 158
    .line 159
    aput-object v8, v1, v2

    .line 160
    const/4 v2, 0x7

    .line 161
    .line 162
    aput-object v9, v1, v2

    .line 163
    .line 164
    const/16 v2, 0x8

    .line 165
    .line 166
    aput-object v10, v1, v2

    .line 167
    .line 168
    const/16 v2, 0x9

    .line 169
    .line 170
    aput-object v11, v1, v2

    .line 171
    .line 172
    const/16 v2, 0xa

    .line 173
    .line 174
    aput-object v12, v1, v2

    .line 175
    .line 176
    const/16 v2, 0xb

    .line 177
    .line 178
    aput-object v13, v1, v2

    .line 179
    .line 180
    const/16 v2, 0xc

    .line 181
    .line 182
    aput-object v14, v1, v2

    .line 183
    .line 184
    const/16 v2, 0xd

    .line 185
    .line 186
    aput-object v17, v1, v2

    .line 187
    .line 188
    const/16 v2, 0xe

    .line 189
    .line 190
    aput-object v0, v1, v2

    .line 191
    .line 192
    sput-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 193
    .line 194
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/c;

    .line 195
    .line 196
    .line 197
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/c;-><init>()V

    .line 198
    .line 199
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->v:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/c;

    .line 200
    return-void
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
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/a;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/i;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/j;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/j;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/k;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/k;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget v0, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 49
    .line 50
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 54
    .line 55
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 56
    .line 57
    sget v0, Lcom/sumsub/sns/R$id;->sns_secondary_button:I

    .line 58
    .line 59
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 63
    .line 64
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 65
    .line 66
    sget v0, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 67
    .line 68
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 72
    .line 73
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 74
    .line 75
    sget v0, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 76
    .line 77
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 81
    .line 82
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 83
    .line 84
    sget v0, Lcom/sumsub/sns/R$id;->sns_form_container:I

    .line 85
    .line 86
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 90
    .line 91
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->f:Lcom/sumsub/sns/internal/core/common/L;

    .line 92
    .line 93
    sget v0, Lcom/sumsub/sns/R$id;->sns_pin_code:I

    .line 94
    .line 95
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 96
    .line 97
    .line 98
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 99
    .line 100
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->g:Lcom/sumsub/sns/internal/core/common/L;

    .line 101
    .line 102
    sget v0, Lcom/sumsub/sns/R$id;->sns_pin_error:I

    .line 103
    .line 104
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 108
    .line 109
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h:Lcom/sumsub/sns/internal/core/common/L;

    .line 110
    .line 111
    sget v0, Lcom/sumsub/sns/R$id;->sns_resend_verification_code:I

    .line 112
    .line 113
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 114
    .line 115
    .line 116
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 117
    .line 118
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i:Lcom/sumsub/sns/internal/core/common/L;

    .line 119
    .line 120
    sget v0, Lcom/sumsub/sns/R$id;->sns_error_bottom_sheet:I

    .line 121
    .line 122
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 123
    .line 124
    .line 125
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 126
    .line 127
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->j:Lcom/sumsub/sns/internal/core/common/L;

    .line 128
    .line 129
    sget v0, Lcom/sumsub/sns/R$id;->sns_webview:I

    .line 130
    .line 131
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 132
    .line 133
    .line 134
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 135
    .line 136
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->k:Lcom/sumsub/sns/internal/core/common/L;

    .line 137
    .line 138
    sget v0, Lcom/sumsub/sns/R$id;->sns_web_view_bottom_sheet:I

    .line 139
    .line 140
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 141
    .line 142
    .line 143
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 144
    .line 145
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->l:Lcom/sumsub/sns/internal/core/common/L;

    .line 146
    .line 147
    sget v0, Lcom/sumsub/sns/R$id;->sns_external_browser_stub:I

    .line 148
    .line 149
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 150
    .line 151
    .line 152
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 153
    .line 154
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m:Lcom/sumsub/sns/internal/core/common/L;

    .line 155
    .line 156
    sget v0, Lcom/sumsub/sns/R$id;->sns_status_icon:I

    .line 157
    .line 158
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 159
    .line 160
    .line 161
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 162
    .line 163
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o:Lcom/sumsub/sns/internal/core/common/L;

    .line 164
    .line 165
    sget v0, Lcom/sumsub/sns/R$id;->sns_status_title:I

    .line 166
    .line 167
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 168
    .line 169
    .line 170
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 171
    .line 172
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p:Lcom/sumsub/sns/internal/core/common/L;

    .line 173
    .line 174
    sget v0, Lcom/sumsub/sns/R$id;->sns_status_comment:I

    .line 175
    .line 176
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 177
    .line 178
    .line 179
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 180
    .line 181
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q:Lcom/sumsub/sns/internal/core/common/L;

    .line 182
    .line 183
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;

    .line 184
    .line 185
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q0;

    .line 186
    .line 187
    .line 188
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 189
    .line 190
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/r0;

    .line 191
    .line 192
    .line 193
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/r0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 194
    .line 195
    .line 196
    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 197
    .line 198
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->r:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;

    .line 199
    .line 200
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->Other:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 201
    .line 202
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->u:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 203
    return-void
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
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;
    .locals 2

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 3
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 4
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    move-result-object p0

    .line 5
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    .line 6
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;->i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Landroid/view/View;)V
    .locals 6

    .line 70
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 71
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->u:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 72
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 73
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->RetryButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 74
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->k()Ljava/util/LinkedHashMap;

    move-result-object v4

    const/16 v5, 0x10

    .line 75
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 76
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/V;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;Landroid/view/View;)V
    .locals 6

    .line 106
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 107
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->u:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 108
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 109
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 110
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->k()Ljava/util/LinkedHashMap;

    move-result-object v4

    const/16 v5, 0x10

    .line 111
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 112
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;->i:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/b;

    if-eqz p1, :cond_0

    .line 113
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->r:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->r()V

    return-void

    .line 114
    :cond_0
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 115
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/V;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 12

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 7
    sget-object v1, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    const-string v1, "fragment_result_key"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 9
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const/4 v3, -0x1

    const/4 v4, 0x4

    const/4 v5, 0x0

    if-ne v1, v3, :cond_1

    .line 10
    const-string/jumbo v1, "result_token"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 11
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 12
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/G;

    invoke-direct {p1, p0, p2, v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/G;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 15
    :cond_0
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 16
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "EKyc"

    const-string v7, "E-ID confirm cancelled"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 19
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 21
    invoke-virtual {p2, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    .line 22
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->f:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    aget-object v1, v1, v4

    invoke-virtual {p2, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    .line 23
    new-array p2, v0, [Landroid/view/View;

    aput-object p0, p2, p1

    invoke-static {p2}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    return-void

    :cond_1
    if-ne v2, v0, :cond_2

    .line 24
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 25
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "EKyc"

    const-string v8, "Restart eID"

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 28
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/V;

    invoke-direct {p1, p0, v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 29
    :cond_2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 30
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "EKyc"

    const-string v7, "E-ID confirm cancelled"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object v1

    .line 34
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 35
    invoke-virtual {p2, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    .line 36
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->f:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    aget-object v1, v1, v4

    invoke-virtual {p2, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    .line 37
    new-array p2, v0, [Landroid/view/View;

    aput-object p0, p2, p1

    invoke-static {p2}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)Lkotlin/Unit;
    .locals 2

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 9
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/V;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/V;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lkotlin/jvm/functions/Function1;)V

    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "EKyc"

    const-string/jumbo v2, "onTryAgainClick"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 6

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/u;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 3
    const-string v3, "ARGS_DOCUMENT"

    const-class v4, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-static {v1, v3, v4, v2}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    :cond_0
    move-object v1, v2

    .line 4
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v3

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->isForResult()Z

    move-result v5

    move-object v2, p0

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/u;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;Z)V

    return-object v0
.end method

.method public static final c(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Landroid/view/View;)V
    .locals 6

    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->u:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->getIdDocSetType()Ljava/lang/String;

    move-result-object v2

    .line 11
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->SkipButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 12
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->k()Ljava/util/LinkedHashMap;

    move-result-object v4

    const/16 v5, 0x10

    .line 13
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 14
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/Z;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final d(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Landroid/view/View;)V
    .locals 6

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 14
    const/4 v4, 0x4

    .line 15
    const/4 v5, 0x0

    .line 16
    .line 17
    const-string v1, "EKyc"

    .line 18
    .line 19
    .line 20
    const-string/jumbo v2, "onCloseOAuthClick"

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    .line 36
    return-void
    .line 37
.end method


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/core/presentation/form/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;)V
    .locals 11

    .line 117
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->j()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->r()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n()Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v5

    .line 118
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    move-result-object v6

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->l()Landroid/view/ViewGroup;

    move-result-object v8

    const/16 v9, 0x9

    new-array v9, v9, [Landroid/view/View;

    const/4 v10, 0x0

    aput-object v0, v9, v10

    const/4 v0, 0x1

    aput-object v1, v9, v0

    const/4 v1, 0x2

    aput-object v2, v9, v1

    const/4 v1, 0x3

    aput-object v3, v9, v1

    const/4 v1, 0x4

    aput-object v4, v9, v1

    const/4 v2, 0x5

    aput-object v5, v9, v2

    const/4 v2, 0x6

    aput-object v6, v9, v2

    const/4 v2, 0x7

    aput-object v7, v9, v2

    const/16 v2, 0x8

    aput-object v8, v9, v2

    .line 119
    invoke-static {v9}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 120
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 121
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 122
    invoke-static {v3, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v10, v1

    :goto_0
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 123
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m()Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    invoke-static {v1, v2}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    .line 126
    :cond_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m()Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-object v2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    .line 127
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;->c:Ljava/lang/String;

    .line 128
    invoke-interface {v2, v3, v4}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 129
    :cond_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    const/16 v3, 0xd

    aget-object v3, v2, v3

    invoke-virtual {v1, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_5

    .line 130
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;->a:Ljava/lang/CharSequence;

    .line 131
    invoke-static {v1, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 132
    :cond_5
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q:Lcom/sumsub/sns/internal/core/common/L;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-virtual {v1, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_6

    .line 133
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;->b:Ljava/lang/CharSequence;

    .line 134
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 135
    :cond_6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 136
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;->d:Ljava/lang/CharSequence;

    .line 137
    invoke-static {v1, p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 138
    :cond_7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 139
    :cond_8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;)V
    .locals 8

    .line 140
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/w;

    if-nez v0, :cond_4

    .line 141
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EkycOtpConfirmationScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    goto :goto_1

    .line 143
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/y;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EkycOauthConfirmationScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    goto :goto_1

    .line 144
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;

    if-eqz v0, :cond_3

    .line 145
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EkycFinishScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    if-nez v0, :cond_5

    .line 146
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->Other:Lcom/sumsub/sns/internal/core/analytics/Screen;

    goto :goto_1

    .line 147
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->Other:Lcom/sumsub/sns/internal/core/analytics/Screen;

    goto :goto_1

    .line 148
    :cond_4
    :goto_0
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->EkycFormScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 149
    :cond_5
    :goto_1
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->Other:Lcom/sumsub/sns/internal/core/analytics/Screen;

    if-ne v0, v1, :cond_6

    goto :goto_2

    .line 150
    :cond_6
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleAnalyticsScreenChange: nextScreen="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "EKyc"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 151
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;

    if-eqz v1, :cond_7

    .line 152
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;

    .line 153
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;->f:Ljava/lang/String;

    .line 154
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s:Ljava/lang/String;

    .line 155
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;->g:Ljava/lang/String;

    .line 156
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->t:Ljava/lang/String;

    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleAnalyticsScreenChange: country="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceId="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "EKyc"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 158
    :cond_7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->u:Lcom/sumsub/sns/internal/core/analytics/Screen;

    if-ne v0, p1, :cond_8

    :goto_2
    return-void

    .line 159
    :cond_8
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->u:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 160
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p1

    .line 161
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->u:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 162
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->getIdDocSetType()Ljava/lang/String;

    move-result-object v1

    .line 163
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->k()Ljava/util/LinkedHashMap;

    move-result-object v2

    const/16 v3, 0x8

    .line 164
    invoke-static {p1, v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x4

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->r()Landroid/widget/TextView;

    move-result-object v3

    const/16 v4, 0x8

    if-eqz v3, :cond_0

    .line 81
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 82
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q()Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 83
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 84
    :cond_1
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 85
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;->c:Ljava/lang/CharSequence;

    .line 86
    invoke-static {v3, v5}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 87
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->j()Landroid/widget/Button;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 88
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;->d:Ljava/lang/CharSequence;

    .line 89
    invoke-static {v3, v5}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 90
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    sget v5, Lcom/sumsub/sns/R$id;->sns_form_container:I

    invoke-virtual {v3, v5}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v3

    instance-of v6, v3, Lcom/sumsub/sns/core/presentation/form/f;

    if-eqz v6, :cond_4

    check-cast v3, Lcom/sumsub/sns/core/presentation/form/f;

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_5

    .line 91
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    .line 92
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v3

    .line 93
    sget-object v6, Lcom/sumsub/sns/core/presentation/form/f;->o:Lcom/sumsub/sns/core/presentation/form/b;

    .line 94
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->getIdDocSetType()Ljava/lang/String;

    move-result-object v7

    .line 95
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "EKyc"

    invoke-static {v6, v7}, Lcom/sumsub/sns/core/presentation/form/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/form/f;

    move-result-object v6

    .line 96
    invoke-virtual {v3, v5, v6}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 97
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentTransaction;->commitNow()V

    .line 98
    :cond_5
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->f:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    aget-object v6, v5, v2

    invoke-virtual {v3, p0, v6}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 99
    new-array v6, v1, [Landroid/view/View;

    aput-object v3, v6, v0

    invoke-static {v6}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    .line 100
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v6

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s()Landroid/webkit/WebView;

    move-result-object v8

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m()Landroid/widget/ImageView;

    move-result-object v9

    .line 101
    iget-object v10, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p:Lcom/sumsub/sns/internal/core/common/L;

    const/16 v11, 0xd

    aget-object v11, v5, v11

    invoke-virtual {v10, p0, v11}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    .line 102
    iget-object v11, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q:Lcom/sumsub/sns/internal/core/common/L;

    const/16 v12, 0xe

    aget-object v5, v5, v12

    invoke-virtual {v11, p0, v5}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 103
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    move-result-object v11

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->l()Landroid/view/ViewGroup;

    move-result-object v12

    const/16 v13, 0x9

    new-array v13, v13, [Landroid/view/View;

    aput-object v3, v13, v0

    aput-object v6, v13, v1

    const/4 v0, 0x2

    aput-object v7, v13, v0

    const/4 v0, 0x3

    aput-object v8, v13, v0

    aput-object v9, v13, v2

    const/4 v0, 0x5

    aput-object v10, v13, v0

    const/4 v0, 0x6

    aput-object v5, v13, v0

    const/4 v0, 0x7

    aput-object v11, v13, v0

    aput-object v12, v13, v4

    .line 104
    invoke-static {v13}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 105
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/o0;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/o0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;)V
    .locals 12

    .line 38
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->j()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->r()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s()Landroid/webkit/WebView;

    move-result-object v4

    .line 39
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m()Landroid/widget/ImageView;

    move-result-object v5

    .line 40
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p:Lcom/sumsub/sns/internal/core/common/L;

    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    const/16 v8, 0xd

    aget-object v8, v7, v8

    invoke-virtual {v6, p0, v8}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 41
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q:Lcom/sumsub/sns/internal/core/common/L;

    const/16 v9, 0xe

    aget-object v7, v7, v9

    invoke-virtual {v8, p0, v7}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 42
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    move-result-object v8

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->l()Landroid/view/ViewGroup;

    move-result-object v9

    const/16 v10, 0xa

    new-array v10, v10, [Landroid/view/View;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const/4 v0, 0x1

    aput-object v1, v10, v0

    const/4 v1, 0x2

    aput-object v2, v10, v1

    const/4 v2, 0x3

    aput-object v3, v10, v2

    const/4 v2, 0x4

    aput-object v4, v10, v2

    const/4 v2, 0x5

    aput-object v5, v10, v2

    const/4 v2, 0x6

    aput-object v6, v10, v2

    const/4 v2, 0x7

    aput-object v7, v10, v2

    const/16 v2, 0x8

    aput-object v8, v10, v2

    const/16 v2, 0x9

    aput-object v9, v10, v2

    .line 43
    invoke-static {v10}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 44
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object v3

    new-array v1, v1, [Landroid/view/View;

    aput-object v2, v1, v11

    aput-object v3, v1, v0

    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    .line 45
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->r()Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 46
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;->a:Ljava/lang/CharSequence;

    .line 47
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 48
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q()Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 49
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;->b:Ljava/lang/CharSequence;

    .line 50
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 51
    :cond_1
    iget-wide v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;->e:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-lez v1, :cond_3

    .line 52
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, v11}, Landroid/view/View;->setEnabled(Z)V

    .line 53
    :cond_2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 55
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/n0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 57
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;->c:Ljava/lang/CharSequence;

    .line 58
    invoke-static {v0, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 59
    :cond_6
    instance-of p2, p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    if-nez p2, :cond_a

    .line 60
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    :cond_7
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n()Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 62
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;->d:Ljava/lang/CharSequence;

    .line 63
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    :cond_8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;->f:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;

    if-eqz p1, :cond_9

    .line 65
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/A0;->e:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/S;

    if-eqz p1, :cond_9

    .line 66
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/S;->a:Ljava/lang/Integer;

    if-eqz p1, :cond_9

    .line 67
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 68
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p2, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setItemCount(I)V

    .line 69
    :cond_9
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    :cond_a
    return-void
.end method

.method public final getClosePayload()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->k()Ljava/util/LinkedHashMap;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v2, "ARGS_DOCUMENT"

    .line 10
    .line 11
    const-class v3, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2, v3, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 15
    move-result-object v0

    .line 16
    move-object v1, v0

    .line 17
    .line 18
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 19
    .line 20
    :cond_0
    if-eqz v1, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-object v0

    .line 33
    .line 34
    :cond_2
    :goto_0
    const-string v0, "TYPE_UNKNOWN"

    .line 35
    return-object v0
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

.method public final getLayoutId()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_ekyc:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final getOpenPayload()Ljava/util/Map;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->k()Ljava/util/LinkedHashMap;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final h()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->l:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0xa

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 9

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->j:Lcom/sumsub/sns/internal/core/common/L;

    .line 7
    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    aget-object v1, v1, v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    .line 19
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q;

    .line 24
    .line 25
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q;->a:Ljava/lang/CharSequence;

    .line 26
    .line 27
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/q;->b:Ljava/lang/CharSequence;

    .line 28
    .line 29
    const/16 v7, 0x1a

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v1 .. v8}, Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;->show$default(Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 37
    :cond_0
    return-void

    .line 38
    .line 39
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;->k:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a;

    .line 44
    .line 45
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p;

    .line 46
    .line 47
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p;->a:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p;->b:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p;->c:Ljava/lang/String;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/p;->d:Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;

    .line 59
    .line 60
    .line 61
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;-><init>()V

    .line 62
    .line 63
    new-instance v4, Landroid/os/Bundle;

    .line 64
    .line 65
    .line 66
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 67
    .line 68
    const-string v5, "eid_mobile_token"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    const-string v1, "eid_certificate_pem"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    const-string v1, "eid_url"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    const-string v1, "ekyc_confirmation_id"

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 90
    .line 91
    const-string p1, "eid_request_key"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 95
    move-result-object v2

    .line 96
    const/4 v5, 0x4

    .line 97
    const/4 v6, 0x0

    .line 98
    .line 99
    const-string v3, "SNSEidMainFragment"

    .line 100
    const/4 v4, 0x0

    .line 101
    move-object v1, p0

    .line 102
    .line 103
    .line 104
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 105
    return-void

    .line 106
    .line 107
    .line 108
    :cond_2
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/preview/a;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 109
    return-void
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

.method public final handleState(Lcom/sumsub/sns/core/presentation/base/s;Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 26

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const/16 v1, 0xb

    .line 5
    .line 6
    const/16 v8, 0xd

    .line 7
    .line 8
    const/16 v9, 0x8

    .line 9
    const/4 v10, 0x1

    .line 10
    const/4 v11, 0x0

    .line 11
    .line 12
    move-object/from16 v12, p1

    .line 13
    .line 14
    check-cast v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;

    .line 15
    .line 16
    move-object/from16 v13, p2

    .line 17
    .line 18
    check-cast v13, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v12}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;)V

    .line 22
    .line 23
    instance-of v14, v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/y;

    .line 24
    const/4 v15, 0x4

    .line 25
    .line 26
    const/16 p3, 0xa

    .line 27
    const/4 v2, 0x3

    .line 28
    .line 29
    const/16 v16, 0x9

    .line 30
    .line 31
    if-nez v14, :cond_0

    .line 32
    .line 33
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    .line 39
    move-result v3

    .line 40
    .line 41
    if-ne v3, v2, :cond_0

    .line 42
    .line 43
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v15}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 49
    .line 50
    :cond_0
    instance-of v3, v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;

    .line 51
    .line 52
    const/16 v17, 0x7

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    const/16 v18, 0x6

    .line 61
    .line 62
    sget v5, Lcom/sumsub/sns/R$id;->sns_form_container:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v5}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 66
    move-result-object v4

    .line 67
    .line 68
    instance-of v5, v4, Lcom/sumsub/sns/core/presentation/form/f;

    .line 69
    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    check-cast v4, Lcom/sumsub/sns/core/presentation/form/f;

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const/4 v4, 0x0

    .line 75
    .line 76
    :goto_0
    if-eqz v4, :cond_3

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v4}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Landroidx/fragment/app/FragmentTransaction;->commitNow()V

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :cond_2
    const/16 v18, 0x6

    .line 94
    .line 95
    :cond_3
    :goto_1
    instance-of v4, v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/x;

    .line 96
    .line 97
    if-eqz v4, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->j()Landroid/widget/Button;

    .line 105
    move-result-object v4

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->r()Landroid/widget/TextView;

    .line 109
    move-result-object v12

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q()Landroid/widget/TextView;

    .line 113
    move-result-object v13

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n()Landroid/widget/TextView;

    .line 117
    move-result-object v14

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 121
    move-result-object v19

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 125
    move-result-object v20

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s()Landroid/webkit/WebView;

    .line 129
    move-result-object v21

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m()Landroid/widget/ImageView;

    .line 133
    move-result-object v22

    .line 134
    .line 135
    const/16 p1, 0xe

    .line 136
    .line 137
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p:Lcom/sumsub/sns/internal/core/common/L;

    .line 138
    .line 139
    sget-object v23, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 140
    .line 141
    const/16 v24, 0x5

    .line 142
    .line 143
    aget-object v6, v23, v8

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v0, v6}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 147
    move-result-object v5

    .line 148
    .line 149
    check-cast v5, Landroid/widget/TextView;

    .line 150
    .line 151
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q:Lcom/sumsub/sns/internal/core/common/L;

    .line 152
    .line 153
    const/16 v25, 0x2

    .line 154
    .line 155
    aget-object v7, v23, p1

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v0, v7}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 159
    move-result-object v6

    .line 160
    .line 161
    check-cast v6, Landroid/widget/TextView;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    .line 165
    move-result-object v7

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->l()Landroid/view/ViewGroup;

    .line 169
    move-result-object v23

    .line 170
    .line 171
    new-array v8, v8, [Landroid/view/View;

    .line 172
    .line 173
    aput-object v3, v8, v11

    .line 174
    .line 175
    aput-object v4, v8, v10

    .line 176
    .line 177
    aput-object v12, v8, v25

    .line 178
    .line 179
    aput-object v13, v8, v2

    .line 180
    .line 181
    aput-object v14, v8, v15

    .line 182
    .line 183
    aput-object v19, v8, v24

    .line 184
    .line 185
    aput-object v20, v8, v18

    .line 186
    .line 187
    aput-object v21, v8, v17

    .line 188
    .line 189
    aput-object v22, v8, v9

    .line 190
    .line 191
    aput-object v5, v8, v16

    .line 192
    .line 193
    aput-object v6, v8, p3

    .line 194
    .line 195
    aput-object v7, v8, v1

    .line 196
    .line 197
    const/16 v1, 0xc

    .line 198
    .line 199
    aput-object v23, v8, v1

    .line 200
    .line 201
    .line 202
    invoke-static {v8}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 206
    move-result-object v1

    .line 207
    .line 208
    if-eqz v1, :cond_11

    .line 209
    .line 210
    .line 211
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 212
    return-void

    .line 213
    .line 214
    :cond_4
    const/16 p1, 0xe

    .line 215
    .line 216
    const/16 v24, 0x5

    .line 217
    .line 218
    const/16 v25, 0x2

    .line 219
    .line 220
    if-eqz v14, :cond_e

    .line 221
    .line 222
    check-cast v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/y;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p()Landroid/widget/Button;

    .line 226
    move-result-object v3

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->j()Landroid/widget/Button;

    .line 230
    move-result-object v4

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->r()Landroid/widget/TextView;

    .line 234
    move-result-object v5

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q()Landroid/widget/TextView;

    .line 238
    move-result-object v6

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n()Landroid/widget/TextView;

    .line 242
    move-result-object v7

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 246
    move-result-object v13

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i()Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 250
    move-result-object v14

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m()Landroid/widget/ImageView;

    .line 254
    move-result-object v19

    .line 255
    .line 256
    move/from16 v20, v8

    .line 257
    .line 258
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->p:Lcom/sumsub/sns/internal/core/common/L;

    .line 259
    .line 260
    sget-object v21, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 261
    .line 262
    move/from16 v22, v11

    .line 263
    .line 264
    aget-object v11, v21, v20

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8, v0, v11}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 268
    move-result-object v8

    .line 269
    .line 270
    check-cast v8, Landroid/widget/TextView;

    .line 271
    .line 272
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->q:Lcom/sumsub/sns/internal/core/common/L;

    .line 273
    .line 274
    move/from16 p2, v15

    .line 275
    .line 276
    aget-object v15, v21, p1

    .line 277
    .line 278
    .line 279
    invoke-virtual {v11, v0, v15}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 280
    move-result-object v11

    .line 281
    .line 282
    check-cast v11, Landroid/widget/TextView;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->l()Landroid/view/ViewGroup;

    .line 286
    move-result-object v15

    .line 287
    .line 288
    new-array v1, v1, [Landroid/view/View;

    .line 289
    .line 290
    aput-object v3, v1, v22

    .line 291
    .line 292
    aput-object v4, v1, v10

    .line 293
    .line 294
    aput-object v5, v1, v25

    .line 295
    .line 296
    aput-object v6, v1, v2

    .line 297
    .line 298
    aput-object v7, v1, p2

    .line 299
    .line 300
    aput-object v13, v1, v24

    .line 301
    .line 302
    aput-object v14, v1, v18

    .line 303
    .line 304
    aput-object v19, v1, v17

    .line 305
    .line 306
    aput-object v8, v1, v9

    .line 307
    .line 308
    aput-object v11, v1, v16

    .line 309
    .line 310
    aput-object v15, v1, p3

    .line 311
    .line 312
    .line 313
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/h;->a([Landroid/view/View;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 317
    move-result-object v1

    .line 318
    .line 319
    if-eqz v1, :cond_5

    .line 320
    .line 321
    .line 322
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 323
    .line 324
    :cond_5
    iget-boolean v1, v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/y;->c:Z

    .line 325
    .line 326
    if-nez v1, :cond_c

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    .line 330
    move-result-object v1

    .line 331
    .line 332
    new-array v3, v10, [Landroid/view/View;

    .line 333
    .line 334
    aput-object v1, v3, v22

    .line 335
    .line 336
    .line 337
    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 341
    move-result-object v1

    .line 342
    .line 343
    if-eqz v1, :cond_6

    .line 344
    .line 345
    .line 346
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 347
    .line 348
    .line 349
    :cond_6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s()Landroid/webkit/WebView;

    .line 350
    move-result-object v1

    .line 351
    .line 352
    if-eqz v1, :cond_8

    .line 353
    .line 354
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 355
    .line 356
    .line 357
    invoke-static {v3, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    move-result v3

    .line 359
    .line 360
    if-eqz v3, :cond_7

    .line 361
    .line 362
    move/from16 v11, v22

    .line 363
    goto :goto_2

    .line 364
    .line 365
    :cond_7
    move/from16 v11, p2

    .line 366
    .line 367
    .line 368
    :goto_2
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 369
    .line 370
    .line 371
    :cond_8
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s()Landroid/webkit/WebView;

    .line 372
    move-result-object v1

    .line 373
    .line 374
    if-eqz v1, :cond_9

    .line 375
    .line 376
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/g;

    .line 377
    .line 378
    .line 379
    invoke-direct {v3, v0, v12}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/y;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 383
    .line 384
    .line 385
    :cond_9
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s()Landroid/webkit/WebView;

    .line 386
    move-result-object v1

    .line 387
    .line 388
    if-eqz v1, :cond_a

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 392
    move-result-object v1

    .line 393
    .line 394
    if-eqz v1, :cond_a

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 398
    .line 399
    :cond_a
    iget-object v1, v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/y;->a:Ljava/lang/String;

    .line 400
    .line 401
    if-eqz v1, :cond_b

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s()Landroid/webkit/WebView;

    .line 405
    move-result-object v3

    .line 406
    .line 407
    if-eqz v3, :cond_b

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 411
    .line 412
    :cond_b
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 413
    .line 414
    if-eqz v1, :cond_11

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 418
    return-void

    .line 419
    .line 420
    .line 421
    :cond_c
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->l()Landroid/view/ViewGroup;

    .line 422
    move-result-object v1

    .line 423
    .line 424
    if-nez v1, :cond_d

    .line 425
    goto :goto_3

    .line 426
    .line 427
    .line 428
    :cond_d
    invoke-static {v1}, Lcom/sumsub/sns/databinding/x;->a(Landroid/view/View;)Lcom/sumsub/sns/databinding/x;

    .line 429
    move-result-object v1

    .line 430
    .line 431
    iget-object v2, v1, Lcom/sumsub/sns/databinding/x;->a:Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 432
    .line 433
    new-array v3, v10, [Landroid/view/View;

    .line 434
    .line 435
    aput-object v2, v3, v22

    .line 436
    .line 437
    .line 438
    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->b([Landroid/view/View;)V

    .line 439
    .line 440
    iget-object v2, v1, Lcom/sumsub/sns/databinding/x;->c:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 441
    .line 442
    iget-object v3, v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/y;->d:Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    invoke-static {v2, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 446
    .line 447
    iget-object v1, v1, Lcom/sumsub/sns/databinding/x;->b:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 451
    return-void

    .line 452
    .line 453
    :cond_e
    if-eqz v3, :cond_f

    .line 454
    .line 455
    check-cast v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v12}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/v;)V

    .line 459
    return-void

    .line 460
    .line 461
    :cond_f
    instance-of v1, v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    .line 462
    .line 463
    if-eqz v1, :cond_10

    .line 464
    .line 465
    check-cast v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v12, v13}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;)V

    .line 469
    return-void

    .line 470
    .line 471
    :cond_10
    instance-of v1, v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;

    .line 472
    .line 473
    if-eqz v1, :cond_11

    .line 474
    .line 475
    check-cast v12, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v12}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/A;)V

    .line 479
    :cond_11
    :goto_3
    return-void
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
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
.end method

.method public final i()Lcom/sumsub/sns/core/widget/SNSLinkButton;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->i:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x7

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final j()Landroid/widget/Button;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->c:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/widget/Button;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final k()Ljava/util/LinkedHashMap;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->Country:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->getText()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->t:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    const-string/jumbo v2, "sourceId"

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->u:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 31
    .line 32
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Screen;->EkycFinishScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 33
    .line 34
    if-ne v1, v2, :cond_2

    .line 35
    .line 36
    .line 37
    const-string/jumbo v1, "result"

    .line 38
    .line 39
    const-string v2, "failure"

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    :cond_2
    return-object v0
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

.method public final l()Landroid/view/ViewGroup;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->m:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0xb

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/view/ViewGroup;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final m()Landroid/widget/ImageView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0xc

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/widget/ImageView;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final n()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x6

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/widget/TextView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->g:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x5

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final onDestroyView()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->s()Landroid/webkit/WebView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/I;->onDestroyView()V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 18
    .line 19
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/common/t;

    .line 20
    const/4 v1, 0x1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_1
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->p:Lkotlinx/coroutines/x1;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->currentState()Lcom/sumsub/sns/core/presentation/base/s;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;

    .line 41
    .line 42
    instance-of v2, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/y;

    .line 43
    .line 44
    if-nez v2, :cond_4

    .line 45
    .line 46
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/z;

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 53
    return v1

    .line 54
    .line 55
    .line 56
    :cond_4
    :goto_1
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->d(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->f()Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->a(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/x1;

    .line 68
    const/4 p1, 0x0

    .line 69
    return p1
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

.method public final onPause()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    .line 20
    const-string v2, "EKyc"

    .line 21
    .line 22
    const-string v3, "On Pause"

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->d(Z)V

    .line 31
    return-void
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

.method public final onResume()V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/l;->onResume()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->a:Lkotlin/Lazy;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    .line 20
    const-string v2, "EKyc"

    .line 21
    .line 22
    const-string v3, "On Resume"

    .line 23
    const/4 v4, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 27
    .line 28
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 29
    .line 30
    sget-object v7, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->D:[Lkotlin/reflect/KProperty;

    .line 31
    const/4 v8, 0x3

    .line 32
    .line 33
    aget-object v3, v7, v8

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;

    .line 40
    .line 41
    if-nez v2, :cond_0

    .line 42
    return-void

    .line 43
    :cond_0
    const/4 v5, 0x4

    .line 44
    const/4 v6, 0x0

    .line 45
    .line 46
    const-string v2, "EKyc"

    .line 47
    .line 48
    const-string v3, "Starting oAuth polling"

    .line 49
    const/4 v4, 0x0

    .line 50
    .line 51
    .line 52
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 53
    .line 54
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->q:Lkotlinx/coroutines/x1;

    .line 55
    const/4 v3, 0x0

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    const/4 v4, 0x1

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v3, v4, v3}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 62
    .line 63
    :cond_1
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 64
    .line 65
    aget-object v4, v7, v8

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;

    .line 72
    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;->a:Ljava/lang/String;

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    move-object v2, v3

    .line 78
    .line 79
    :goto_0
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->x:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 80
    .line 81
    aget-object v5, v7, v8

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 85
    move-result-object v4

    .line 86
    .line 87
    check-cast v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;

    .line 88
    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/s;->b:Ljava/lang/String;

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move-object v4, v3

    .line 94
    .line 95
    :goto_1
    if-eqz v2, :cond_6

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 99
    move-result v5

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    goto :goto_2

    .line 103
    .line 104
    :cond_4
    if-eqz v4, :cond_6

    .line 105
    .line 106
    .line 107
    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 108
    move-result v5

    .line 109
    .line 110
    if-eqz v5, :cond_5

    .line 111
    goto :goto_2

    .line 112
    .line 113
    .line 114
    :cond_5
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 115
    move-result-object v6

    .line 116
    .line 117
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/a0;

    .line 118
    .line 119
    .line 120
    invoke-direct {v9, v0, v2, v4, v3}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 121
    const/4 v10, 0x3

    .line 122
    const/4 v11, 0x0

    .line 123
    const/4 v7, 0x0

    .line 124
    const/4 v8, 0x0

    .line 125
    .line 126
    .line 127
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 128
    move-result-object v1

    .line 129
    .line 130
    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;->q:Lkotlinx/coroutines/x1;

    .line 131
    return-void

    .line 132
    :cond_6
    :goto_2
    const/4 v5, 0x4

    .line 133
    const/4 v6, 0x0

    .line 134
    .line 135
    const-string v2, "EKyc"

    .line 136
    .line 137
    const-string v3, "Polling for oAuth result failed. applicantId or confirmationId is null"

    .line 138
    const/4 v4, 0x0

    .line 139
    .line 140
    .line 141
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 142
    return-void
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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/I;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 13
    move-result-object p1

    .line 14
    const/4 p2, 0x4

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setHideable(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setDraggable(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setPeekHeight(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setFitToContents(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setExpandedOffset(I)V

    .line 34
    .line 35
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->addBottomSheetCallback(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 45
    .line 46
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->n:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->h()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    sget p2, Lcom/sumsub/sns/R$id;->sns_bottomsheet_toolbar:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    check-cast p1, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 p1, 0x0

    .line 63
    .line 64
    :goto_0
    if-eqz p1, :cond_2

    .line 65
    .line 66
    sget-object p2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 70
    move-result-object p2

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->CLOSE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    .line 83
    invoke-interface {p2, v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 84
    move-result-object p2

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setCloseButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 88
    .line 89
    :cond_2
    if-eqz p1, :cond_3

    .line 90
    .line 91
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/k0;

    .line 92
    .line 93
    .line 94
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/k0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnCloseButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->j()Landroid/widget/Button;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/l0;

    .line 106
    .line 107
    .line 108
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/l0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    if-eqz p1, :cond_5

    .line 118
    .line 119
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/d;

    .line 120
    .line 121
    .line 122
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->o()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    if-eqz p1, :cond_6

    .line 132
    .line 133
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/f;

    .line 134
    .line 135
    .line 136
    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/f;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setOnTextCompleteListener(Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;)V

    .line 140
    :cond_6
    return-void
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

.method public final onViewModelPrepared(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/H;->onViewModelPrepared(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;)V

    .line 17
    .line 18
    const-string v1, "eid_request_key"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public final p()Landroid/widget/Button;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->b:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/widget/Button;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final q()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->e:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x3

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/widget/TextView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final r()Landroid/widget/TextView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->d:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x2

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/widget/TextView;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public final s()Landroid/webkit/WebView;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->k:Lcom/sumsub/sns/internal/core/common/L;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->w:[Lkotlin/reflect/KProperty;

    .line 5
    .line 6
    const/16 v2, 0x9

    .line 7
    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/webkit/WebView;

    .line 15
    return-object v0
    .line 16
    .line 17
.end method
