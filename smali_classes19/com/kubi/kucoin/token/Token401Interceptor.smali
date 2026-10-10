.class public final Lcom/kubi/kucoin/token/Token401Interceptor;
.super Ljava/lang/Object;
.source "Token401Interceptor.kt"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kucoin/token/Token401Interceptor$Companion;,
        Lcom/kubi/kucoin/token/Token401Interceptor$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J7\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/kubi/kucoin/token/Token401Interceptor;",
        "Lokhttp3/Interceptor;",
        "<init>",
        "()V",
        "intercept",
        "Lokhttp3/Response;",
        "chain",
        "Lokhttp3/Interceptor$Chain;",
        "monitorReplayResult",
        "",
        "request",
        "Lokhttp3/Request;",
        "refreshResult",
        "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;",
        "resultType",
        "",
        "duration",
        "",
        "name",
        "(Lokhttp3/Request;Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V",
        "elapsedSince",
        "start",
        "readTopLevelBusinessCode",
        "body",
        "Lokhttp3/ResponseBody;",
        "Companion",
        "LAppNet_googleRelease"
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
        "SMAP\nToken401Interceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Token401Interceptor.kt\ncom/kubi/kucoin/token/Token401Interceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/kucoin/token/Token401Interceptor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/token/Token401Interceptor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/kucoin/token/Token401Interceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/kucoin/token/Token401Interceptor;->a:Lcom/kubi/kucoin/token/Token401Interceptor$Companion;

    .line 9
    return-void
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
.end method

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
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr v0, p1

    .line 6
    .line 7
    const-wide/16 p1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, p1, p2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    .line 11
    move-result-wide p1

    .line 12
    return-wide p1
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
.end method

.method public final b(Lokhttp3/Request;Lcom/kubi/kucoin/token/l;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V
    .locals 14

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kucoin/token/y;->a:Lcom/kubi/kucoin/token/y;

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/l;->d()Ljava/lang/String;

    .line 6
    move-result-object v2

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/l;->h()Ljava/lang/String;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 18
    move-result-object v4

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/l;->e()Ljava/lang/String;

    .line 22
    move-result-object v7

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/l;->g()Ljava/lang/Boolean;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kucoin/token/l;->f()Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    :goto_0
    move-object v11, p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :goto_1
    const/16 v12, 0x220

    .line 39
    const/4 v13, 0x0

    .line 40
    .line 41
    const-string v1, "401"

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    .line 45
    move-object/from16 v8, p3

    .line 46
    .line 47
    move-object/from16 v9, p4

    .line 48
    .line 49
    move-object/from16 v5, p5

    .line 50
    .line 51
    .line 52
    invoke-static/range {v0 .. v13}, Lcom/kubi/kucoin/token/y;->b(Lcom/kubi/kucoin/token/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 53
    return-void
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
.end method

.method public final c(Lokhttp3/ResponseBody;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lokhttp3/MediaType;->charset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    :cond_1
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 21
    .line 22
    :cond_2
    :try_start_0
    new-instance v2, Lcom/google/gson/stream/JsonReader;

    .line 23
    .line 24
    new-instance v3, Ljava/io/InputStreamReader;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lokio/BufferedSource;->peek()Lokio/BufferedSource;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-direct {v3, p1, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, v3}, Lcom/google/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    :try_start_1
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    sget-object v1, Lcom/google/gson/stream/JsonToken;->BEGIN_OBJECT:Lcom/google/gson/stream/JsonToken;

    .line 49
    .line 50
    if-eq p1, v1, :cond_4

    .line 51
    :cond_3
    :goto_0
    move-object p1, v0

    .line 52
    goto :goto_3

    .line 53
    .line 54
    .line 55
    :cond_4
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->beginObject()V

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->hasNext()Z

    .line 59
    move-result p1

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->nextName()Ljava/lang/String;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    const-string v1, "code"

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    move-result p1

    .line 72
    .line 73
    if-eqz p1, :cond_8

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    const/4 p1, -0x1

    .line 81
    goto :goto_2

    .line 82
    .line 83
    :cond_5
    sget-object v1, Lcom/kubi/kucoin/token/Token401Interceptor$a;->$EnumSwitchMapping$0:[I

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 87
    move-result p1

    .line 88
    .line 89
    aget p1, v1, p1

    .line 90
    :goto_2
    const/4 v1, 0x1

    .line 91
    .line 92
    if-eq p1, v1, :cond_7

    .line 93
    const/4 v1, 0x2

    .line 94
    .line 95
    if-eq p1, v1, :cond_7

    .line 96
    const/4 v1, 0x3

    .line 97
    .line 98
    if-eq p1, v1, :cond_6

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->skipValue()V

    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception p1

    .line 104
    goto :goto_4

    .line 105
    .line 106
    .line 107
    :cond_6
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->nextNull()V

    .line 108
    goto :goto_0

    .line 109
    .line 110
    .line 111
    :cond_7
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    .line 112
    move-result-object p1

    .line 113
    goto :goto_3

    .line 114
    .line 115
    .line 116
    :cond_8
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->skipValue()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    goto :goto_1

    .line 118
    .line 119
    .line 120
    :goto_3
    :try_start_2
    invoke-static {v2, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 121
    return-object p1

    .line 122
    :goto_4
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 123
    :catchall_1
    move-exception v1

    .line 124
    .line 125
    .line 126
    :try_start_4
    invoke-static {v2, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 127
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 128
    :catch_0
    return-object v0
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
.end method

.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 24
    .param p1    # Lokhttp3/Interceptor$Chain;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    const-string v2, "chain"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    sget-object v3, Lcom/kubi/kucoin/token/o;->a:Lcom/kubi/kucoin/token/o;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v2}, Lcom/kubi/kucoin/token/o;->a(Lokhttp3/Request;)Z

    .line 19
    move-result v3

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v2}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {v0, v2}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 30
    move-result-object v7

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7}, Lokhttp3/Response;->request()Lokhttp3/Request;

    .line 34
    move-result-object v8

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Lokhttp3/Response;->code()I

    .line 38
    move-result v3

    .line 39
    .line 40
    const/16 v4, 0x191

    .line 41
    .line 42
    const-string v9, "TokenLifecycle"

    .line 43
    .line 44
    if-ne v3, v4, :cond_1

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    const-string v4, "HTTP 401 preserves existing behavior and skips token lifecycle refresh, path="

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v8}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    .line 72
    invoke-static {v9, v3}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    :cond_1
    sget-object v3, Liy/c;->a:Liy/c;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Liy/c;->g()Z

    .line 78
    move-result v3

    .line 79
    .line 80
    if-eqz v3, :cond_11

    .line 81
    .line 82
    sget-object v3, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 86
    move-result v3

    .line 87
    .line 88
    if-eqz v3, :cond_11

    .line 89
    .line 90
    const-class v3, Lcom/kubi/kucoin/token/m;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8, v3}, Lokhttp3/Request;->tag(Ljava/lang/Class;)Ljava/lang/Object;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    if-nez v3, :cond_11

    .line 97
    .line 98
    const-class v3, Lcom/kubi/kucoin/token/n;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v3}, Lokhttp3/Request;->tag(Ljava/lang/Class;)Ljava/lang/Object;

    .line 102
    move-result-object v3

    .line 103
    .line 104
    if-nez v3, :cond_11

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7}, Lokhttp3/Response;->isSuccessful()Z

    .line 108
    move-result v3

    .line 109
    .line 110
    if-nez v3, :cond_2

    .line 111
    .line 112
    goto/16 :goto_b

    .line 113
    .line 114
    .line 115
    :cond_2
    invoke-virtual {v7}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v3}, Lcom/kubi/kucoin/token/Token401Interceptor;->c(Lokhttp3/ResponseBody;)Ljava/lang/String;

    .line 120
    move-result-object v3

    .line 121
    .line 122
    const-string v4, "401"

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    move-result v3

    .line 127
    .line 128
    if-eqz v3, :cond_11

    .line 129
    .line 130
    sget-object v3, Lcom/kubi/utils/k0;->a:Lcom/kubi/utils/k0;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Lcom/kubi/utils/k0;->e()Z

    .line 134
    move-result v3

    .line 135
    .line 136
    if-nez v3, :cond_3

    .line 137
    .line 138
    goto/16 :goto_b

    .line 139
    .line 140
    :cond_3
    const-string v3, "X-APP-TOKEN"

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8, v3}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    move-result-object v4

    .line 145
    .line 146
    if-eqz v4, :cond_5

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    .line 150
    move-result-object v5

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5, v3, v4}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 154
    move-result-object v4

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 158
    move-result-object v4

    .line 159
    .line 160
    if-nez v4, :cond_4

    .line 161
    goto :goto_0

    .line 162
    :cond_4
    move-object v2, v4

    .line 163
    .line 164
    :cond_5
    :goto_0
    const-class v4, Lcom/kubi/kucoin/token/i;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8, v4}, Lokhttp3/Request;->tag(Ljava/lang/Class;)Ljava/lang/Object;

    .line 168
    move-result-object v4

    .line 169
    .line 170
    check-cast v4, Lcom/kubi/kucoin/token/i;

    .line 171
    .line 172
    if-eqz v4, :cond_7

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, Lcom/kubi/kucoin/token/i;->a()Ljava/lang/String;

    .line 176
    move-result-object v4

    .line 177
    .line 178
    if-nez v4, :cond_6

    .line 179
    goto :goto_2

    .line 180
    :cond_6
    :goto_1
    move-object v6, v4

    .line 181
    goto :goto_3

    .line 182
    .line 183
    :cond_7
    :goto_2
    sget-object v4, Lcom/kubi/kucoin/token/TokenLifecycleManager;->a:Lcom/kubi/kucoin/token/TokenLifecycleManager;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v3}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    move-result-object v3

    .line 188
    .line 189
    if-nez v3, :cond_8

    .line 190
    .line 191
    const-string v3, ""

    .line 192
    .line 193
    .line 194
    :cond_8
    invoke-virtual {v4, v3}, Lcom/kubi/kucoin/token/TokenLifecycleManager;->T(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    move-result-object v4

    .line 196
    goto :goto_1

    .line 197
    .line 198
    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    const-string v4, "Business 401 detected; starting fallback recovery, path="

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 210
    move-result-object v4

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 214
    move-result-object v4

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    move-result-object v3

    .line 222
    .line 223
    .line 224
    invoke-static {v9, v3}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 228
    move-result-wide v3

    .line 229
    .line 230
    sget-object v5, Lcom/kubi/kucoin/token/TokenLifecycleManager;->a:Lcom/kubi/kucoin/token/TokenLifecycleManager;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, v2}, Lcom/kubi/kucoin/token/TokenLifecycleManager;->b0(Lokhttp3/Request;)Lcom/kubi/kucoin/token/TokenLifecycleManager$c;

    .line 234
    move-result-object v10

    .line 235
    .line 236
    if-nez v10, :cond_9

    .line 237
    .line 238
    sget-object v10, Lcom/kubi/kucoin/token/y;->a:Lcom/kubi/kucoin/token/y;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 242
    move-result-object v0

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 246
    move-result-object v14

    .line 247
    .line 248
    const/16 v22, 0x760

    .line 249
    .line 250
    const/16 v23, 0x0

    .line 251
    .line 252
    const-string v11, "401"

    .line 253
    .line 254
    const-string v12, "currentUser"

    .line 255
    .line 256
    const-string v13, "noop"

    .line 257
    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    const/16 v17, 0x0

    .line 261
    .line 262
    const-string v18, "replay_dropped"

    .line 263
    .line 264
    const/16 v19, 0x0

    .line 265
    .line 266
    const/16 v20, 0x0

    .line 267
    .line 268
    const/16 v21, 0x0

    .line 269
    move-object v15, v6

    .line 270
    .line 271
    .line 272
    invoke-static/range {v10 .. v23}, Lcom/kubi/kucoin/token/y;->b(Lcom/kubi/kucoin/token/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 273
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    .line 279
    const-string v2, "Business 401 recovery skipped: access token is unavailable, path="

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v8}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 286
    move-result-object v2

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 290
    move-result-object v2

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    move-result-object v0

    .line 298
    .line 299
    .line 300
    invoke-static {v9, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    return-object v7

    .line 302
    .line 303
    .line 304
    :cond_9
    invoke-virtual {v10}, Lcom/kubi/kucoin/token/TokenLifecycleManager$c;->b()Lokhttp3/Request;

    .line 305
    move-result-object v5

    .line 306
    const/4 v11, 0x0

    .line 307
    .line 308
    if-nez v5, :cond_b

    .line 309
    .line 310
    .line 311
    invoke-virtual {v10}, Lcom/kubi/kucoin/token/TokenLifecycleManager$c;->a()Lcom/kubi/kucoin/token/l;

    .line 312
    move-result-object v0

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v3, v4}, Lcom/kubi/kucoin/token/Token401Interceptor;->a(J)J

    .line 316
    move-result-wide v3

    .line 317
    .line 318
    .line 319
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 320
    move-result-object v3

    .line 321
    .line 322
    .line 323
    invoke-virtual {v10}, Lcom/kubi/kucoin/token/TokenLifecycleManager$c;->a()Lcom/kubi/kucoin/token/l;

    .line 324
    move-result-object v4

    .line 325
    .line 326
    .line 327
    invoke-virtual {v4}, Lcom/kubi/kucoin/token/l;->f()Z

    .line 328
    move-result v4

    .line 329
    .line 330
    if-eqz v4, :cond_a

    .line 331
    move-object v5, v3

    .line 332
    goto :goto_4

    .line 333
    :cond_a
    move-object v5, v11

    .line 334
    .line 335
    :goto_4
    const-string v4, "replay_dropped"

    .line 336
    move-object v3, v0

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/kucoin/token/Token401Interceptor;->b(Lokhttp3/Request;Lcom/kubi/kucoin/token/l;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    .line 340
    .line 341
    new-instance v0, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 345
    .line 346
    const-string v2, "Business 401 recovery failed; returning original response, path="

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v8}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 353
    move-result-object v2

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 357
    move-result-object v2

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    move-result-object v0

    .line 365
    .line 366
    .line 367
    invoke-static {v9, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    return-object v7

    .line 369
    .line 370
    .line 371
    :cond_b
    invoke-virtual {v1, v3, v4}, Lcom/kubi/kucoin/token/Token401Interceptor;->a(J)J

    .line 372
    move-result-wide v3

    .line 373
    .line 374
    .line 375
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 376
    move-result-object v3

    .line 377
    .line 378
    .line 379
    invoke-virtual {v10}, Lcom/kubi/kucoin/token/TokenLifecycleManager$c;->a()Lcom/kubi/kucoin/token/l;

    .line 380
    move-result-object v4

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4}, Lcom/kubi/kucoin/token/l;->f()Z

    .line 384
    move-result v4

    .line 385
    .line 386
    if-eqz v4, :cond_c

    .line 387
    goto :goto_5

    .line 388
    :cond_c
    move-object v3, v11

    .line 389
    .line 390
    .line 391
    :goto_5
    invoke-virtual {v7}, Lokhttp3/Response;->close()V

    .line 392
    .line 393
    new-instance v4, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 397
    .line 398
    const-string v7, "Business 401 recovery succeeded; replaying request once, path="

    .line 399
    .line 400
    .line 401
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v8}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 405
    move-result-object v7

    .line 406
    .line 407
    .line 408
    invoke-virtual {v7}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 409
    move-result-object v7

    .line 410
    .line 411
    .line 412
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    move-result-object v4

    .line 417
    .line 418
    .line 419
    invoke-static {v9, v4}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :try_start_0
    invoke-interface {v0, v5}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 423
    move-result-object v0

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Lokhttp3/Response;->isSuccessful()Z

    .line 427
    move-result v4

    .line 428
    .line 429
    if-eqz v4, :cond_d

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 433
    move-result-object v4

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v4}, Lcom/kubi/kucoin/token/Token401Interceptor;->c(Lokhttp3/ResponseBody;)Ljava/lang/String;

    .line 437
    move-result-object v11

    .line 438
    goto :goto_6

    .line 439
    :catch_0
    move-exception v0

    .line 440
    move-object v5, v3

    .line 441
    goto :goto_a

    .line 442
    .line 443
    .line 444
    :cond_d
    :goto_6
    invoke-virtual {v0}, Lokhttp3/Response;->isSuccessful()Z

    .line 445
    move-result v4

    .line 446
    const/4 v5, 0x1

    .line 447
    .line 448
    if-eqz v4, :cond_f

    .line 449
    .line 450
    if-eqz v11, :cond_e

    .line 451
    .line 452
    const-string v4, "200"

    .line 453
    .line 454
    .line 455
    invoke-static {v11, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 457
    xor-int/2addr v4, v5

    .line 458
    .line 459
    if-ne v4, v5, :cond_e

    .line 460
    goto :goto_7

    .line 461
    :cond_e
    const/4 v5, 0x0

    .line 462
    :cond_f
    :goto_7
    move-object v11, v3

    .line 463
    .line 464
    .line 465
    :try_start_1
    invoke-virtual {v10}, Lcom/kubi/kucoin/token/TokenLifecycleManager$c;->a()Lcom/kubi/kucoin/token/l;

    .line 466
    move-result-object v3

    .line 467
    .line 468
    if-eqz v5, :cond_10

    .line 469
    .line 470
    const-string v4, "replay_fail"

    .line 471
    :goto_8
    move-object v5, v11

    .line 472
    goto :goto_9

    .line 473
    :catch_1
    move-exception v0

    .line 474
    move-object v5, v11

    .line 475
    goto :goto_a

    .line 476
    .line 477
    :cond_10
    const-string v4, "replay_ok"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 478
    goto :goto_8

    .line 479
    .line 480
    .line 481
    :goto_9
    :try_start_2
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/kucoin/token/Token401Interceptor;->b(Lokhttp3/Request;Lcom/kubi/kucoin/token/l;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 482
    return-object v0

    .line 483
    :catch_2
    move-exception v0

    .line 484
    .line 485
    .line 486
    :goto_a
    invoke-virtual {v10}, Lcom/kubi/kucoin/token/TokenLifecycleManager$c;->a()Lcom/kubi/kucoin/token/l;

    .line 487
    move-result-object v3

    .line 488
    .line 489
    const-string v4, "replay_fail"

    .line 490
    .line 491
    move-object/from16 v1, p0

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v1 .. v6}, Lcom/kubi/kucoin/token/Token401Interceptor;->b(Lokhttp3/Request;Lcom/kubi/kucoin/token/l;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    .line 495
    throw v0

    .line 496
    :cond_11
    :goto_b
    return-object v7
.end method
