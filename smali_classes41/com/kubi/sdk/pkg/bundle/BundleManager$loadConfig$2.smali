.class final Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BundleManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/pkg/bundle/BundleManager;->T(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/m0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/m0;",
        "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;",
        "<anonymous>",
        "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.sdk.pkg.bundle.BundleManager$loadConfig$2"
    f = "BundleManager.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5
    }
    l = {
        0xa2,
        0xb1,
        0xc4,
        0xd3,
        0xe3,
        0x11d
    }
    m = "invokeSuspend"
    n = {
        "fromRemote",
        "fromPkgPlatform",
        "bundleInfo",
        "lockedUrl",
        "fromRemote",
        "fromPkgPlatform",
        "bundleInfo",
        "fromRemote",
        "fromPkgPlatform",
        "fromRemote",
        "fromPkgPlatform",
        "bundleInfo",
        "fromRemote",
        "fromPkgPlatform"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 4 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 5 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,891:1\n1#2:892\n28#3:893\n28#3:906\n28#3:915\n28#3:923\n28#3:928\n41#4:894\n37#4:895\n30#4:897\n41#4:907\n37#4:908\n30#4:910\n74#4:914\n41#4:916\n37#4:917\n30#4:919\n41#4:920\n37#4:921\n30#4:922\n41#4:924\n37#4:925\n30#4:927\n41#4:929\n37#4:930\n30#4:932\n62#5:896\n62#5:909\n62#5:918\n62#5:926\n62#5:931\n766#6:898\n857#6,2:899\n766#6:901\n857#6,2:902\n766#6:904\n857#6:905\n858#6:911\n288#6,2:912\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2\n*L\n248#1:893\n264#1:906\n301#1:915\n304#1:923\n307#1:928\n248#1:894\n248#1:895\n248#1:897\n264#1:907\n264#1:908\n264#1:910\n301#1:914\n301#1:916\n301#1:917\n301#1:919\n301#1:920\n301#1:921\n301#1:922\n304#1:924\n304#1:925\n304#1:927\n307#1:929\n307#1:930\n307#1:932\n248#1:896\n264#1:909\n301#1:918\n304#1:926\n307#1:931\n259#1:898\n259#1:899,2\n260#1:901\n260#1:902,2\n264#1:904\n264#1:905\n264#1:911\n267#1:912,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $biz:Ljava/lang/String;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $entry:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    .line 7
    const/4 p1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 11
    return-void
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
.end method

.method public static synthetic a(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/bundle/BundleInfo;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->f(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/bundle/BundleInfo;)I

    .line 4
    move-result p0

    .line 5
    return p0
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
    .line 558
    .line 559
.end method

.method public static final f(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Lcom/kubi/sdk/pkg/bundle/BundleInfo;)I
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0, p1}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->compareBundleVersion$Package_release(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    move-result p0

    .line 15
    return p0
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
    .line 558
    .line 559
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance p1, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 12
    return-object p1
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
    .line 558
    .line 559
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v5, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 1
    iget v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->label:I

    const-string v8, "]: code="

    const-string v11, "bundleInit"

    const-string v12, "pkgPlatform"

    const-string v13, ".android.hbc"

    const-string v14, "jsbundles"

    const/16 v15, 0x2d

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v0

    const/4 v8, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v0, p1

    goto/16 :goto_17

    :pswitch_1
    iget-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v4, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    move v10, v2

    const-wide/16 v16, 0x0

    goto/16 :goto_9

    :pswitch_2
    iget-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v0

    move v10, v2

    const-wide/16 v16, 0x0

    move-object/from16 v0, p1

    goto/16 :goto_8

    :pswitch_3
    iget-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v4, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v0

    move v10, v2

    move-object v6, v3

    move-object v15, v4

    const-wide/16 v16, 0x0

    move-object/from16 v0, p1

    goto/16 :goto_5

    :pswitch_4
    iget-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    iget-object v4, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    const-wide/16 v16, 0x0

    goto/16 :goto_1

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    iput v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->label:I

    invoke-virtual {v0, v3, v5}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->W(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    goto/16 :goto_16

    :cond_0
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 3
    sget-object v3, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "loadConfig \u52a0\u8f7d\u5185\u7f6eBundle\u5b8c\u6210: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", isWaited: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v11, v0}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v4, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 5
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 6
    sget-object v6, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    const-wide/16 v16, 0x0

    iget-object v9, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v10, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v6, v9, v10}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v6

    .line 7
    const-string v9, "]: "

    if-nez v6, :cond_f

    .line 8
    const-string v10, "loadConfig \u52a0\u8f7dBundle\u7684\u914d\u7f6e\u5931\u8d25,\u5c1d\u8bd5\u4e0b\u8f7d\u5e76\u7b49\u5f85"

    invoke-virtual {v3, v11, v10}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    sget-object v10, Lcom/kubi/sdk/pkg/bundle/b;->a:Lcom/kubi/sdk/pkg/bundle/b;

    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/b;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v10

    iget-object v15, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v10, v15}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_6

    .line 10
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "loadConfig \u4f7f\u7528\u626b\u7801\u9501\u5b9a URL["

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v12, v1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    sget-object v1, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->a:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    iput-object v4, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    iput-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    iput-object v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$2:Ljava/lang/Object;

    iput-object v10, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$3:Ljava/lang/Object;

    const/4 v9, 0x2

    iput v9, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->label:I

    invoke-virtual {v1, v3, v10, v5}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->w(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_1

    goto/16 :goto_16

    :cond_1
    move-object v3, v6

    move-object v6, v4

    move-object v4, v0

    move-object v0, v10

    .line 12
    :goto_1
    check-cast v1, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 13
    sget-object v9, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "loadConfig \u626b\u7801\u9501\u5b9a\u7ed3\u679c["

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    move-result v15

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, ", lockedVersion="

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/task/TaskStatus;->e()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v12, v10}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    move-result v9

    if-eqz v9, :cond_5

    .line 15
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/task/TaskStatus;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 16
    sget-object v3, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    invoke-virtual {v3, v1}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->parseVersion$Package_release(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    cmp-long v3, v9, v16

    if-ltz v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_3

    .line 17
    sget-object v3, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    iget-object v9, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v10, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    move-object/from16 p1, v0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v3, v9, v10, v0, v1}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->f(Ljava/lang/String;Ljava/lang/String;J)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    if-nez v0, :cond_4

    .line 18
    iget-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object/from16 p1, v0

    .line 19
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    .line 20
    :cond_4
    :goto_3
    iput-boolean v2, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 21
    iput-boolean v2, v4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    move-object v9, v0

    move-object v10, v4

    move-object v15, v6

    move-object/from16 v0, p1

    goto :goto_4

    :cond_5
    move-object/from16 p1, v0

    move-object v9, v3

    move-object v10, v4

    move-object v15, v6

    goto :goto_4

    :cond_6
    move-object v9, v10

    move-object v10, v0

    move-object v0, v9

    move-object v15, v4

    move-object v9, v6

    :goto_4
    if-nez v9, :cond_e

    if-nez v0, :cond_e

    .line 22
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->a:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    move v3, v2

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iput-object v15, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    iput-object v10, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    iput-object v9, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$2:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$3:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->label:I

    move v6, v3

    const/4 v3, 0x0

    const/4 v5, 0x4

    move/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 v4, p0

    move-object/from16 p1, v10

    move/from16 v10, v18

    invoke-static/range {v0 .. v6}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->v(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;Landroid/content/Context;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v4

    if-ne v0, v7, :cond_7

    goto/16 :goto_16

    :cond_7
    move-object/from16 v6, p1

    .line 23
    :goto_5
    check-cast v0, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 24
    sget-object v1, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadConfig \u5305\u7ba1\u7406\u5e73\u53f0\u963b\u585e\u7ed3\u679c["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v12, v2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 26
    sget-object v2, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v4, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v2

    .line 27
    iput-boolean v10, v15, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 28
    iput-boolean v10, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    goto :goto_6

    :cond_8
    move-object v2, v9

    :goto_6
    if-nez v2, :cond_d

    .line 29
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    move-result v2

    if-nez v2, :cond_9

    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadConfig \u5305\u7ba1\u7406\u5e73\u53f0\u5931\u8d25["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\uff0c\u8f6c\u4e91\u914d\u515c\u5e95"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    const/16 v23, 0x4

    const/16 v24, 0x0

    const-string v20, "pkgPlatform"

    const/16 v22, 0x0

    move-object/from16 v19, v1

    invoke-static/range {v19 .. v24}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_7

    :cond_9
    move-object v0, v1

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadConfig \u5305\u7ba1\u7406\u5e73\u53f0\u6210\u529f\u4f46\u672a\u83b7\u53d6\u5230\u6709\u6548\u5305["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]\uff0c\u8f6c\u4e91\u914d\u515c\u5e95"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :goto_7
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    sget-object v4, Lcom/kubi/sdk/pkg/task/DownloadPriority;->VERY_HIGH:Lcom/kubi/sdk/pkg/task/DownloadPriority;

    iput-object v15, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    iput-object v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$2:Ljava/lang/Object;

    const/4 v8, 0x4

    iput v8, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->label:I

    invoke-virtual/range {v0 .. v5}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->X(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_a

    goto/16 :goto_16

    :cond_a
    move-object v3, v15

    .line 33
    :goto_8
    check-cast v0, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 34
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 35
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    .line 36
    iput-boolean v10, v3, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    move-object/from16 v19, v0

    move-object v15, v3

    goto/16 :goto_d

    .line 37
    :cond_b
    new-instance v1, Lcom/kubi/sdk/pkg/task/TaskException;

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    move-result v2

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_c

    const-string v0, "\u52a0\u8f7dBundle\u7684\u914d\u7f6e\u5931\u8d25,\u66f4\u65b0\u5931\u8d25"

    :cond_c
    invoke-direct {v1, v2, v0}, Lcom/kubi/sdk/pkg/task/TaskException;-><init>(ILjava/lang/String;)V

    throw v1

    :cond_d
    move-object/from16 v19, v2

    goto/16 :goto_d

    :cond_e
    move-object/from16 p1, v10

    move v10, v2

    move-object/from16 v6, p1

    move-object/from16 v19, v9

    goto/16 :goto_d

    :cond_f
    move v10, v2

    .line 38
    sget-object v1, Lcom/kubi/sdk/pkg/bundle/b;->a:Lcom/kubi/sdk/pkg/bundle/b;

    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/b;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_15

    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "loadConfig \u5df2\u6709\u672c\u5730\u5305\uff0c\u4f46\u626b\u7801\u9501\u5b9a["

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v12, v2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    sget-object v2, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->a:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    iput-object v4, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    iput-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    iput-object v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$2:Ljava/lang/Object;

    const/4 v8, 0x5

    iput v8, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->label:I

    invoke-virtual {v2, v3, v1, v5}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->w(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_10

    goto/16 :goto_16

    :cond_10
    move-object v3, v0

    move-object v0, v6

    .line 41
    :goto_9
    check-cast v1, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 42
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    move-result v2

    if-eqz v2, :cond_14

    .line 43
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/task/TaskStatus;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 44
    sget-object v1, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    invoke-virtual {v1, v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->parseVersion$Package_release(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v0, v8, v16

    if-ltz v0, :cond_11

    goto :goto_a

    :cond_11
    const/4 v1, 0x0

    :goto_a
    if-eqz v1, :cond_13

    .line 45
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v0, v2, v6, v8, v9}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->f(Ljava/lang/String;Ljava/lang/String;J)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v1

    if-nez v1, :cond_12

    .line 46
    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    :goto_b
    move-object v6, v0

    goto :goto_c

    :cond_12
    move-object v6, v1

    goto :goto_c

    .line 47
    :cond_13
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    goto :goto_b

    .line 48
    :goto_c
    iput-boolean v10, v4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 49
    iput-boolean v10, v3, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    move-object v15, v4

    move-object/from16 v19, v6

    move-object v6, v3

    goto :goto_d

    :cond_14
    move-object/from16 v19, v0

    move-object v6, v3

    move-object v15, v4

    goto :goto_d

    .line 50
    :cond_15
    sget-object v1, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->s(Lcom/kubi/sdk/pkg/bundle/BundleManager;Landroid/content/Context;Ljava/lang/String;)V

    move-object v15, v4

    move-object/from16 v19, v6

    move-object v6, v0

    :goto_d
    if-eqz v19, :cond_16

    .line 51
    invoke-virtual/range {v19 .. v19}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBaseInfo()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    .line 52
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v0

    .line 53
    invoke-static {v1}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 54
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2d

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 57
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_e

    :cond_16
    const/4 v1, 0x0

    :goto_e
    if-eqz v1, :cond_27

    .line 59
    invoke-static {v1}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_27

    if-eqz v19, :cond_17

    .line 60
    invoke-virtual/range {v19 .. v19}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBaseVersion()Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :cond_17
    const/4 v1, 0x0

    :goto_f
    if-eqz v1, :cond_21

    .line 61
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    invoke-virtual {v0, v1}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->parseVersion$Package_release(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    .line 62
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->d()Ljava/util/List;

    move-result-object v0

    .line 63
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 64
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 65
    invoke-virtual {v12}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v12

    const-string v10, "krnbase"

    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_18

    .line 66
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_18
    const/4 v10, 0x1

    goto :goto_10

    .line 67
    :cond_19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1a
    :goto_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 69
    sget-object v12, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v10}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->parseVersion$Package_release(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v10

    invoke-virtual {v10}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 70
    sget-object v12, Lcom/kubi/sdk/pkg/util/VersionUtils;->a:Lcom/kubi/sdk/pkg/util/VersionUtils;

    invoke-virtual {v12, v10, v2}, Lcom/kubi/sdk/pkg/util/VersionUtils;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    if-nez v10, :cond_1a

    .line 71
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 72
    :cond_1b
    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    .line 73
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 74
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 75
    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v20, v0

    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v21, v2

    .line 76
    invoke-static/range {v21 .. v21}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    move-wide/from16 v22, v3

    .line 77
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 78
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v12, 0x2d

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 82
    invoke-static {v0}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 83
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1c
    move-object/from16 v0, v20

    move-object/from16 v2, v21

    move-wide/from16 v3, v22

    goto/16 :goto_12

    :cond_1d
    move-wide/from16 v22, v3

    cmp-long v0, v22, v16

    if-ltz v0, :cond_20

    .line 84
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    .line 85
    sget-object v4, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->Companion:Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;

    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;->parseVersion$Package_release(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    cmp-long v3, v3, v22

    if-nez v3, :cond_1e

    goto :goto_13

    :cond_1f
    const/4 v2, 0x0

    .line 86
    :goto_13
    move-object v0, v2

    check-cast v0, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    goto :goto_14

    .line 87
    :cond_20
    new-instance v0, Lcom/kubi/sdk/pkg/bundle/n;

    invoke-direct {v0}, Lcom/kubi/sdk/pkg/bundle/n;-><init>()V

    invoke-static {v8, v0}, Lkotlin/collections/CollectionsKt;->maxWithOrNull(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    goto :goto_14

    :cond_21
    const/4 v0, 0x0

    :goto_14
    if-eqz v0, :cond_23

    .line 88
    sget-object v2, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "loadConfig base\u6587\u4ef6\u8def\u5f84\u4e0d\u5b58\u5728\uff0c\u4f7f\u7528\u5339\u914d\u5230\u7684 base: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (required="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-virtual {v2, v11, v1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v19, :cond_22

    .line 91
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v23

    const/16 v29, 0xf7

    const/16 v30, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v19 .. v30}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->copy$default(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v1

    goto :goto_15

    :cond_22
    const/4 v1, 0x0

    :goto_15
    move-object/from16 v20, v1

    const/4 v8, 0x0

    goto :goto_19

    .line 92
    :cond_23
    sget-object v0, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    const-string v1, "loadConfig \u52a0\u8f7dBundle\u7684\u914d\u7f6e\u5931\u8d25, base\u6587\u4ef6\u4e0d\u5b58\u5728"

    invoke-virtual {v0, v11, v1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v3, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    sget-object v4, Lcom/kubi/sdk/pkg/task/DownloadPriority;->VERY_HIGH:Lcom/kubi/sdk/pkg/task/DownloadPriority;

    iput-object v15, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$0:Ljava/lang/Object;

    iput-object v6, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$1:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->L$3:Ljava/lang/Object;

    const/4 v9, 0x6

    iput v9, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->label:I

    invoke-virtual/range {v0 .. v5}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->X(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_24

    :goto_16
    return-object v7

    :cond_24
    move-object v3, v15

    .line 94
    :goto_17
    check-cast v0, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 95
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    move-result v1

    if-eqz v1, :cond_25

    .line 96
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    iget-object v2, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$entry:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/kubi/sdk/pkg/bundle/BundleVersionManager;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v19

    const/4 v10, 0x1

    .line 97
    iput-boolean v10, v3, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    move-object v15, v3

    :goto_18
    move-object/from16 v20, v19

    goto :goto_19

    .line 98
    :cond_25
    new-instance v1, Lcom/kubi/sdk/pkg/task/TaskException;

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    move-result v2

    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_26

    const-string v0, "\u52a0\u8f7dBundle\u7684\u914d\u7f6e\u5931\u8d25,\u66f4\u65b0baseBundle\u5931\u8d25"

    :cond_26
    invoke-direct {v1, v2, v0}, Lcom/kubi/sdk/pkg/task/TaskException;-><init>(ILjava/lang/String;)V

    throw v1

    :cond_27
    const/4 v8, 0x0

    goto :goto_18

    .line 99
    :goto_19
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->a:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;

    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$biz:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->n(Ljava/lang/String;)Z

    move-result v23

    if-eqz v20, :cond_2a

    .line 100
    iget-object v0, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    .line 101
    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v4

    .line 102
    invoke-static {v0}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 103
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 104
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v12, 0x2d

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-static {v1}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_29

    .line 109
    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBaseInfo()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v1

    if-eqz v1, :cond_28

    .line 110
    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v1

    .line 111
    invoke-static {v0}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 112
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v12, 0x2d

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 115
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 116
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-static {v0}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_1a

    :cond_28
    const/4 v0, 0x1

    :goto_1a
    if-eqz v0, :cond_29

    const/4 v0, 0x1

    :goto_1b
    const/4 v10, 0x1

    goto :goto_1c

    :cond_29
    const/4 v0, 0x0

    goto :goto_1b

    :goto_1c
    if-ne v0, v10, :cond_2a

    const/4 v0, 0x1

    goto :goto_1d

    :cond_2a
    const/4 v0, 0x0

    :goto_1d
    if-eqz v20, :cond_35

    .line 118
    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    .line 119
    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v7

    .line 120
    invoke-static {v1}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 121
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 122
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v12, 0x2d

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 124
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 126
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 127
    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBaseInfo()Lcom/kubi/sdk/pkg/bundle/BundleInfo;

    move-result-object v7

    if-eqz v7, :cond_2b

    .line 128
    invoke-virtual {v7}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v12

    .line 129
    invoke-static {v1}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x2d

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 133
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 134
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1e

    :cond_2b
    move-object v1, v8

    :goto_1e
    if-eqz v1, :cond_2c

    .line 135
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1f

    :cond_2c
    move-object v2, v8

    .line 136
    :goto_1f
    invoke-static {v3}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->b(Ljava/lang/String;)Z

    move-result v9

    if-eqz v1, :cond_2d

    .line 137
    invoke-static {v1}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->b(Ljava/lang/String;)Z

    move-result v10

    goto :goto_20

    :cond_2d
    const/4 v10, 0x1

    :goto_20
    if-eqz v9, :cond_2e

    if-nez v10, :cond_34

    .line 138
    :cond_2e
    sget-object v24, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 139
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "cause=LOAD_CONFIG_WITHOUT_HBC, biz="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getBiz()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ", entry="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getEntry()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ", version="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    invoke-virtual/range {v20 .. v20}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v12

    .line 141
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    const-string v12, ", bizPath="

    .line 143
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    const-string v3, ", bizVersionDirExists="

    .line 145
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_2f

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    const/4 v12, 0x1

    if-ne v3, v12, :cond_2f

    const/4 v3, 0x1

    goto :goto_21

    :cond_2f
    const/4 v3, 0x0

    .line 147
    :goto_21
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 148
    const-string v3, ", bizHbcExists="

    .line 149
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 150
    const-string v3, ", bizHbcIsFile="

    .line 151
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v3

    .line 153
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 154
    const-string v3, ", bizHbcLength="

    .line 155
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v3

    .line 157
    invoke-virtual {v11, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 158
    const-string v3, ", baseVersion="

    .line 159
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v7, :cond_30

    .line 160
    invoke-virtual {v7}, Lcom/kubi/sdk/pkg/bundle/BundleInfo;->getVersion()Ljava/lang/String;

    move-result-object v3

    goto :goto_22

    :cond_30
    move-object v3, v8

    .line 161
    :goto_22
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    const-string v3, ", basePath="

    .line 163
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    const-string v1, ", baseVersionDirExists="

    .line 165
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_31

    .line 166
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_31

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_31

    const/4 v1, 0x1

    goto :goto_23

    :cond_31
    const/4 v1, 0x0

    .line 167
    :goto_23
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 168
    const-string v1, ", baseHbcExists="

    .line 169
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 170
    const-string v1, ", baseHbcIsFile="

    .line 171
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_32

    .line 172
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v1

    const/4 v10, 0x1

    if-ne v1, v10, :cond_32

    goto :goto_24

    :cond_32
    const/4 v10, 0x0

    .line 173
    :goto_24
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 174
    const-string v1, ", baseHbcLength="

    .line 175
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_33

    .line 176
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v9

    goto :goto_25

    :cond_33
    move-wide/from16 v9, v16

    .line 177
    :goto_25
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    const-string v1, ", fromRemote="

    .line 179
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    iget-boolean v1, v15, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 181
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 182
    const-string v1, ", fromPkgPlatform="

    .line 183
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    iget-boolean v1, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 185
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 186
    const-string v1, ", isLocalBundle="

    .line 187
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 188
    const-string v1, ", action=RETURN_CONFIG"

    .line 189
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v28, 0x4

    const/16 v29, 0x0

    .line 190
    const-string v25, "hbcTrace"

    const/16 v27, 0x0

    invoke-static/range {v24 .. v29}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 191
    :cond_34
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_35
    if-eqz v20, :cond_36

    .line 192
    iget-object v1, v5, Lcom/kubi/sdk/pkg/bundle/BundleManager$loadConfig$2;->$context:Landroid/content/Context;

    sget-object v18, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->h:Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig$Companion;

    iget-boolean v2, v15, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    iget-boolean v3, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    move/from16 v24, v0

    move-object/from16 v19, v1

    move/from16 v21, v2

    move/from16 v22, v3

    invoke-virtual/range {v18 .. v24}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig$Companion;->create$Package_release(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/BundleInfo;ZZZZ)Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;

    move-result-object v0

    if-eqz v0, :cond_36

    return-object v0

    .line 193
    :cond_36
    new-instance v0, Lcom/kubi/sdk/pkg/task/TaskException;

    const/16 v1, 0x57c

    const-string v2, "\u52a0\u8f7dBundle\u7684\u914d\u7f6e\u5931\u8d25,\u627e\u4e0d\u5230Bundle\u914d\u7f6e"

    invoke-direct {v0, v1, v2}, Lcom/kubi/sdk/pkg/task/TaskException;-><init>(ILjava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
