.class public final Lshark/internal/m$a;
.super Ljava/lang/Object;
.source "UnsortedByteEntries.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/internal/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0012\u0010\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "Lshark/internal/m$a;",
        "",
        "<init>",
        "(Lshark/internal/m;)V",
        "",
        "value",
        "",
        "a",
        "(B)V",
        "",
        "b",
        "(J)V",
        "",
        "c",
        "(I)V",
        "byteCount",
        "e",
        "(JI)V",
        "d",
        "shark-graph"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:Lshark/internal/m;


# direct methods
.method public constructor <init>(Lshark/internal/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

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
.end method


# virtual methods
.method public final a(B)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lshark/internal/m;->e(Lshark/internal/m;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lshark/internal/m;->e(Lshark/internal/m;)I

    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    add-int/2addr v2, v3

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2}, Lshark/internal/m;->h(Lshark/internal/m;I)V

    .line 18
    .line 19
    iget-object v1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 23
    move-result v1

    .line 24
    .line 25
    if-gez v0, :cond_0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    if-lt v1, v0, :cond_1

    .line 29
    move v1, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 32
    .line 33
    :goto_1
    if-eqz v1, :cond_3

    .line 34
    .line 35
    iget-object v1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lshark/internal/m;->a(Lshark/internal/m;)I

    .line 39
    move-result v1

    .line 40
    sub-int/2addr v1, v3

    .line 41
    .line 42
    iget-object v2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 46
    move-result v2

    .line 47
    mul-int/2addr v1, v2

    .line 48
    add-int/2addr v1, v0

    .line 49
    .line 50
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lshark/internal/m;->c(Lshark/internal/m;)[B

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 60
    .line 61
    :cond_2
    aput-byte p1, v0, v1

    .line 62
    return-void

    .line 63
    .line 64
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    const-string v1, "Index "

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, " should be between 0 and "

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 86
    move-result v0

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    throw v0
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
.end method

.method public final b(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lshark/internal/m;->d(Lshark/internal/m;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lshark/internal/m$a;->d(J)V

    .line 12
    return-void

    .line 13
    :cond_0
    long-to-int p1, p1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lshark/internal/m$a;->c(I)V

    .line 17
    return-void
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
.end method

.method public final c(I)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lshark/internal/m;->e(Lshark/internal/m;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lshark/internal/m;->e(Lshark/internal/m;)I

    .line 12
    move-result v2

    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x4

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2}, Lshark/internal/m;->h(Lshark/internal/m;I)V

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    if-ltz v0, :cond_0

    .line 21
    .line 22
    iget-object v2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 26
    move-result v2

    .line 27
    .line 28
    add-int/lit8 v2, v2, -0x4

    .line 29
    .line 30
    if-gt v0, v2, :cond_0

    .line 31
    move v2, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    .line 35
    :goto_0
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-object v2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lshark/internal/m;->a(Lshark/internal/m;)I

    .line 41
    move-result v2

    .line 42
    sub-int/2addr v2, v1

    .line 43
    .line 44
    iget-object v1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 48
    move-result v1

    .line 49
    mul-int/2addr v2, v1

    .line 50
    add-int/2addr v2, v0

    .line 51
    .line 52
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lshark/internal/m;->c(Lshark/internal/m;)[B

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 62
    .line 63
    :cond_1
    add-int/lit8 v1, v2, 0x1

    .line 64
    .line 65
    ushr-int/lit8 v3, p1, 0x18

    .line 66
    .line 67
    and-int/lit16 v3, v3, 0xff

    .line 68
    int-to-byte v3, v3

    .line 69
    .line 70
    aput-byte v3, v0, v2

    .line 71
    .line 72
    add-int/lit8 v3, v2, 0x2

    .line 73
    .line 74
    ushr-int/lit8 v4, p1, 0x10

    .line 75
    .line 76
    and-int/lit16 v4, v4, 0xff

    .line 77
    int-to-byte v4, v4

    .line 78
    .line 79
    aput-byte v4, v0, v1

    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x3

    .line 82
    .line 83
    ushr-int/lit8 v1, p1, 0x8

    .line 84
    .line 85
    and-int/lit16 v1, v1, 0xff

    .line 86
    int-to-byte v1, v1

    .line 87
    .line 88
    aput-byte v1, v0, v3

    .line 89
    .line 90
    and-int/lit16 p1, p1, 0xff

    .line 91
    int-to-byte p1, p1

    .line 92
    .line 93
    aput-byte p1, v0, v2

    .line 94
    return-void

    .line 95
    .line 96
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    const-string v1, "Index "

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v0, " should be between 0 and "

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 118
    move-result v0

    .line 119
    .line 120
    add-int/lit8 v0, v0, -0x4

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    .line 136
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    throw v0
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
.end method

.method public final d(J)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lshark/internal/m;->e(Lshark/internal/m;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lshark/internal/m;->e(Lshark/internal/m;)I

    .line 12
    move-result v2

    .line 13
    .line 14
    const/16 v3, 0x8

    .line 15
    add-int/2addr v2, v3

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lshark/internal/m;->h(Lshark/internal/m;I)V

    .line 19
    const/4 v1, 0x1

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 27
    move-result v2

    .line 28
    sub-int/2addr v2, v3

    .line 29
    .line 30
    if-gt v0, v2, :cond_0

    .line 31
    move v2, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    .line 35
    :goto_0
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-object v2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lshark/internal/m;->a(Lshark/internal/m;)I

    .line 41
    move-result v2

    .line 42
    sub-int/2addr v2, v1

    .line 43
    .line 44
    iget-object v1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 48
    move-result v1

    .line 49
    mul-int/2addr v2, v1

    .line 50
    add-int/2addr v2, v0

    .line 51
    .line 52
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lshark/internal/m;->c(Lshark/internal/m;)[B

    .line 56
    move-result-object v0

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 62
    .line 63
    :cond_1
    add-int/lit8 v1, v2, 0x1

    .line 64
    .line 65
    const/16 v4, 0x38

    .line 66
    .line 67
    ushr-long v4, p1, v4

    .line 68
    .line 69
    const-wide/16 v6, 0xff

    .line 70
    and-long/2addr v4, v6

    .line 71
    long-to-int v4, v4

    .line 72
    int-to-byte v4, v4

    .line 73
    .line 74
    aput-byte v4, v0, v2

    .line 75
    .line 76
    add-int/lit8 v4, v2, 0x2

    .line 77
    .line 78
    const/16 v5, 0x30

    .line 79
    .line 80
    ushr-long v8, p1, v5

    .line 81
    and-long/2addr v8, v6

    .line 82
    long-to-int v5, v8

    .line 83
    int-to-byte v5, v5

    .line 84
    .line 85
    aput-byte v5, v0, v1

    .line 86
    .line 87
    add-int/lit8 v1, v2, 0x3

    .line 88
    .line 89
    const/16 v5, 0x28

    .line 90
    .line 91
    ushr-long v8, p1, v5

    .line 92
    and-long/2addr v8, v6

    .line 93
    long-to-int v5, v8

    .line 94
    int-to-byte v5, v5

    .line 95
    .line 96
    aput-byte v5, v0, v4

    .line 97
    .line 98
    add-int/lit8 v4, v2, 0x4

    .line 99
    .line 100
    const/16 v5, 0x20

    .line 101
    .line 102
    ushr-long v8, p1, v5

    .line 103
    and-long/2addr v8, v6

    .line 104
    long-to-int v5, v8

    .line 105
    int-to-byte v5, v5

    .line 106
    .line 107
    aput-byte v5, v0, v1

    .line 108
    .line 109
    add-int/lit8 v1, v2, 0x5

    .line 110
    .line 111
    const/16 v5, 0x18

    .line 112
    .line 113
    ushr-long v8, p1, v5

    .line 114
    and-long/2addr v8, v6

    .line 115
    long-to-int v5, v8

    .line 116
    int-to-byte v5, v5

    .line 117
    .line 118
    aput-byte v5, v0, v4

    .line 119
    .line 120
    add-int/lit8 v4, v2, 0x6

    .line 121
    .line 122
    const/16 v5, 0x10

    .line 123
    .line 124
    ushr-long v8, p1, v5

    .line 125
    and-long/2addr v8, v6

    .line 126
    long-to-int v5, v8

    .line 127
    int-to-byte v5, v5

    .line 128
    .line 129
    aput-byte v5, v0, v1

    .line 130
    .line 131
    add-int/lit8 v2, v2, 0x7

    .line 132
    .line 133
    ushr-long v8, p1, v3

    .line 134
    and-long/2addr v8, v6

    .line 135
    long-to-int v1, v8

    .line 136
    int-to-byte v1, v1

    .line 137
    .line 138
    aput-byte v1, v0, v4

    .line 139
    and-long/2addr p1, v6

    .line 140
    long-to-int p1, p1

    .line 141
    int-to-byte p1, p1

    .line 142
    .line 143
    aput-byte p1, v0, v2

    .line 144
    return-void

    .line 145
    .line 146
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    const-string p2, "Index "

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string p2, " should be between 0 and "

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    iget-object p2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 165
    .line 166
    .line 167
    invoke-static {p2}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 168
    move-result p2

    .line 169
    sub-int/2addr p2, v3

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    .line 185
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 186
    throw p2
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
.end method

.method public final e(JI)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lshark/internal/m;->e(Lshark/internal/m;)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lshark/internal/m;->e(Lshark/internal/m;)I

    .line 12
    move-result v2

    .line 13
    add-int/2addr v2, p3

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lshark/internal/m;->h(Lshark/internal/m;I)V

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 25
    move-result v2

    .line 26
    sub-int/2addr v2, p3

    .line 27
    .line 28
    if-gt v0, v2, :cond_0

    .line 29
    move v2, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    .line 33
    :goto_0
    if-eqz v2, :cond_3

    .line 34
    .line 35
    iget-object v2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lshark/internal/m;->a(Lshark/internal/m;)I

    .line 39
    move-result v2

    .line 40
    sub-int/2addr v2, v1

    .line 41
    .line 42
    iget-object v3, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 46
    move-result v3

    .line 47
    mul-int/2addr v2, v3

    .line 48
    add-int/2addr v2, v0

    .line 49
    .line 50
    iget-object v0, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lshark/internal/m;->c(Lshark/internal/m;)[B

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 60
    :cond_1
    sub-int/2addr p3, v1

    .line 61
    .line 62
    const/16 v1, 0x8

    .line 63
    mul-int/2addr p3, v1

    .line 64
    .line 65
    :goto_1
    const-wide/16 v3, 0xff

    .line 66
    .line 67
    if-lt p3, v1, :cond_2

    .line 68
    .line 69
    add-int/lit8 v5, v2, 0x1

    .line 70
    .line 71
    ushr-long v6, p1, p3

    .line 72
    and-long/2addr v3, v6

    .line 73
    long-to-int v3, v3

    .line 74
    int-to-byte v3, v3

    .line 75
    .line 76
    aput-byte v3, v0, v2

    .line 77
    .line 78
    add-int/lit8 p3, p3, -0x8

    .line 79
    move v2, v5

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    and-long/2addr p1, v3

    .line 82
    long-to-int p1, p1

    .line 83
    int-to-byte p1, p1

    .line 84
    .line 85
    aput-byte p1, v0, v2

    .line 86
    return-void

    .line 87
    .line 88
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    const-string p2, "Index "

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string p2, " should be between 0 and "

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    iget-object p2, p0, Lshark/internal/m$a;->a:Lshark/internal/m;

    .line 107
    .line 108
    .line 109
    invoke-static {p2}, Lshark/internal/m;->b(Lshark/internal/m;)I

    .line 110
    move-result p2

    .line 111
    sub-int/2addr p2, p3

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    .line 127
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 128
    throw p2
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
