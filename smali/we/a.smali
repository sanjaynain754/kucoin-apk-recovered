.class public final Lwe/a;
.super Ljava/lang/Object;
.source "SpotDurationRuleSetting.kt"

# interfaces
.implements Lcom/kubi/monitor/duration/IDurationRuleSetting;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/core/spot/startup/SpotDurationRuleSetting;",
        "Lcom/kubi/monitor/duration/IDurationRuleSetting;",
        "<init>",
        "()V",
        "getRules",
        "",
        "Lcom/kubi/monitor/duration/DurationRule;",
        "TradeCoreBizLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSpotDurationRuleSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotDurationRuleSetting.kt\ncom/kubi/core/spot/startup/SpotDurationRuleSetting\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,135:1\n37#2:136\n37#2:137\n37#2:138\n37#2:139\n37#2:140\n37#2:141\n37#2:142\n37#2:143\n37#2:144\n*S KotlinDebug\n*F\n+ 1 SpotDurationRuleSetting.kt\ncom/kubi/core/spot/startup/SpotDurationRuleSetting\n*L\n26#1:136\n33#1:137\n41#1:138\n50#1:139\n58#1:140\n66#1:141\n74#1:142\n81#1:143\n89#1:144\n*E\n"
    }
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
.end method


# virtual methods
.method public getRules()Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/monitor/duration/DurationRule;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/duration/DurationRule;->f:Lcom/kubi/monitor/duration/DurationRule$Companion;

    .line 3
    .line 4
    new-instance v0, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "unified_click_spot_exchange"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 14
    .line 15
    sget-object v1, Lcom/kubi/monitor/duration/DurationCate;->click:Lcom/kubi/monitor/duration/DurationCate;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 19
    .line 20
    const-string v2, "click_start_btn"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 24
    .line 25
    const-string v3, "data_load_finish"

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v4}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 33
    .line 34
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    new-instance v0, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string/jumbo v4, "unified_click_submit_spot_order"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v4}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string/jumbo v4, "show_toast"

    .line 59
    .line 60
    .line 61
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 62
    move-result-object v6

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v6}, Lcom/kubi/monitor/duration/DurationRule$a;->j(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v6}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 76
    move-result-object v6

    .line 77
    .line 78
    new-instance v0, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string/jumbo v7, "unified_spot_cancel_order"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v7}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 97
    move-result-object v7

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v7}, Lcom/kubi/monitor/duration/DurationRule$a;->j(Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 104
    move-result-object v7

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v7}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 111
    move-result-object v7

    .line 112
    .line 113
    new-instance v0, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 114
    .line 115
    .line 116
    invoke-direct {v0}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 117
    .line 118
    const-string v8, "B5UnifyTrading"

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v8}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 122
    .line 123
    sget-object v8, Lcom/kubi/monitor/duration/DurationCate;->page_load:Lcom/kubi/monitor/duration/DurationCate;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v8}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 127
    .line 128
    const-string v9, "page_load_start"

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v9}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 135
    move-result-object v10

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v10}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 142
    move-result-object v0

    .line 143
    .line 144
    new-instance v10, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 145
    .line 146
    .line 147
    invoke-direct {v10}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string/jumbo v11, "unified_spot_kline_load"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10, v11}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v10, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v10, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 163
    move-result-object v11

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10, v11}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 170
    move-result-object v10

    .line 171
    .line 172
    new-instance v11, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 173
    .line 174
    .line 175
    invoke-direct {v11}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 176
    .line 177
    const-string v12, "B5markets"

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11, v12}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v11, v8}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v11, v9}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 190
    move-result-object v3

    .line 191
    .line 192
    .line 193
    invoke-virtual {v11, v3}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v11}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 197
    move-result-object v3

    .line 198
    .line 199
    new-instance v11, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 200
    .line 201
    .line 202
    invoke-direct {v11}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 203
    .line 204
    .line 205
    const-string/jumbo v12, "unified_click_submit_spot_order_without_pass"

    .line 206
    .line 207
    .line 208
    invoke-virtual {v11, v12}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v11, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v11, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 218
    move-result-object v2

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v11}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 225
    move-result-object v11

    .line 226
    .line 227
    new-instance v2, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 228
    .line 229
    .line 230
    invoke-direct {v2}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 231
    .line 232
    .line 233
    const-string/jumbo v4, "unified_refresh_delegation_list"

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v4}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 240
    .line 241
    .line 242
    const-string/jumbo v1, "unified_wait_socket"

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 246
    .line 247
    const-string v1, "receive_socket"

    .line 248
    .line 249
    .line 250
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 251
    move-result-object v1

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->j(Ljava/util/List;)V

    .line 255
    .line 256
    const-string v1, "receive_list"

    .line 257
    .line 258
    .line 259
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 260
    move-result-object v1

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 267
    move-result-object v12

    .line 268
    .line 269
    new-instance v1, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 270
    .line 271
    .line 272
    invoke-direct {v1}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 273
    .line 274
    .line 275
    const-string/jumbo v2, "spot_k_line_page_load"

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v8}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v9}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 285
    .line 286
    const-string v2, "page_load_end"

    .line 287
    .line 288
    .line 289
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 290
    move-result-object v2

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v2}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 297
    move-result-object v13

    .line 298
    move-object v8, v0

    .line 299
    move-object v9, v10

    .line 300
    move-object v10, v3

    .line 301
    .line 302
    .line 303
    filled-new-array/range {v5 .. v13}, [Lcom/kubi/monitor/duration/DurationRule;

    .line 304
    move-result-object v0

    .line 305
    .line 306
    .line 307
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 308
    move-result-object v0

    .line 309
    return-object v0
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
.end method
