.class public final Lio/trtc/tuikit/atomicxcore/impl/login/h;
.super Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;
.source "SourceFile"


# instance fields
.field public final a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

.field public b:Lio/trtc/tuikit/atomicxcore/impl/login/f;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Landroid/content/Context;

.field public final i:Lio/trtc/tuikit/atomicxcore/api/login/LoginState;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;-><init>()V

    .line 4
    .line 5
    const-string v0, "file"

    .line 6
    .line 7
    const-string v1, "AtomicXCore-Live"

    .line 8
    .line 9
    const-string v2, "LoginStoreImpl"

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/api/view/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 16
    .line 17
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;->UNLOGIN:Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->c:Lkotlinx/coroutines/flow/n;

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->d:Lkotlinx/coroutines/flow/n;

    .line 31
    .line 32
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 33
    .line 34
    .line 35
    invoke-direct {v2}, Lio/trtc/tuikit/atomicxcore/impl/common/q;-><init>()V

    .line 36
    .line 37
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 38
    .line 39
    const-string v2, ""

    .line 40
    .line 41
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->f:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->g:Ljava/lang/String;

    .line 44
    .line 45
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v0, v1}, Lio/trtc/tuikit/atomicxcore/api/login/LoginState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 57
    .line 58
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->i:Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

    .line 59
    return-void
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
.end method


# virtual methods
.method public final addLoginListener(Lio/trtc/tuikit/atomicxcore/api/login/LoginListener;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

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
.end method

.method public final getLoginState()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->i:Lio/trtc/tuikit/atomicxcore/api/login/LoginState;

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

.method public final login(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "userID"

    .line 9
    .line 10
    .line 11
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string/jumbo v0, "userSig"

    .line 15
    .line 16
    .line 17
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "API: login called with sdkAppID="

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, ", userID="

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    const-string v2, "message"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    const/4 v3, 0x0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 54
    .line 55
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMSDKConfig;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMSDKConfig;-><init>()V

    .line 59
    const/4 v1, 0x4

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMSDKConfig;->setLogLevel(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p1, p2, v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->initSDK(Landroid/content/Context;ILcom/tencent/imsdk/v2/V2TIMSDKConfig;)Z

    .line 70
    move-result v0

    .line 71
    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 75
    .line 76
    const-string p2, "API: login initSDK failed"

    .line 77
    const/4 p3, 0x2

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2, v2, p3, p2}, Lio/trtc/tuikit/atomicxcore/impl/barrage/b;->a(Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    if-eqz p5, :cond_0

    .line 83
    .line 84
    const/16 p1, 0x177d

    .line 85
    .line 86
    const-string p2, "Initialization failed"

    .line 87
    .line 88
    .line 89
    invoke-interface {p5, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 90
    :cond_0
    return-void

    .line 91
    .line 92
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->b:Lio/trtc/tuikit/atomicxcore/impl/login/f;

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    goto :goto_0

    .line 96
    .line 97
    :cond_2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/login/f;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/login/f;-><init>(Lio/trtc/tuikit/atomicxcore/impl/login/h;)V

    .line 101
    .line 102
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->b:Lio/trtc/tuikit/atomicxcore/impl/login/f;

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0}, Lcom/tencent/imsdk/v2/V2TIMManager;->addIMSDKListener(Lcom/tencent/imsdk/v2/V2TIMSDKListener;)V

    .line 110
    .line 111
    .line 112
    :goto_0
    invoke-virtual {p0, p2}, Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;->setSdkAppID(I)V

    .line 113
    .line 114
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->f:Ljava/lang/String;

    .line 115
    .line 116
    iput-object p4, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->g:Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->h:Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/login/b;

    .line 129
    .line 130
    .line 131
    invoke-direct {p2, p0, p5, p3}, Lio/trtc/tuikit/atomicxcore/impl/login/b;-><init>(Lio/trtc/tuikit/atomicxcore/impl/login/h;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, p3, p4, p2}, Lcom/tencent/imsdk/v2/V2TIMManager;->login(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 135
    return-void
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
.end method

.method public final logout(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    const-string v1, "message"

    .line 8
    .line 9
    const-string v2, "API: logout called"

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/login/c;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/login/c;-><init>(Lio/trtc/tuikit/atomicxcore/impl/login/h;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMManager;->logout(Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 29
    return-void
    .line 30
.end method

.method public final removeLoginListener(Lio/trtc/tuikit/atomicxcore/api/login/LoginListener;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->e:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

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
.end method

.method public final setSelfInfo(Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userProfile"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/login/h;->a:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "API: setSelfInfo called with userProfile="

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    const-string v2, "message"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const/4 v2, 0x0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 35
    .line 36
    new-instance v0, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getNickname()Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->setNickname(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getAvatarURL()Ljava/lang/String;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->setFaceUrl(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getSelfSignature()Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->setSelfSignature(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getGender()Lio/trtc/tuikit/atomicxcore/api/login/Gender;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/Gender;->getValue()I

    .line 76
    move-result v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->setGender(I)V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getRole()Ljava/lang/Integer;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 89
    move-result v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->setRole(I)V

    .line 93
    .line 94
    .line 95
    :cond_4
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getLevel()Ljava/lang/Integer;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    if-eqz v1, :cond_5

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 102
    move-result v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->setLevel(I)V

    .line 106
    .line 107
    .line 108
    :cond_5
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getBirthday()Ljava/lang/Long;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 115
    move-result-wide v1

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->setBirthday(J)V

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getAllowType()Lio/trtc/tuikit/atomicxcore/api/login/AllowType;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/login/AllowType;->getValue()I

    .line 128
    move-result v1

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->setAllowType(I)V

    .line 132
    .line 133
    .line 134
    :cond_7
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->getCustomInfo()Ljava/util/Map;

    .line 135
    move-result-object v1

    .line 136
    .line 137
    if-eqz v1, :cond_8

    .line 138
    .line 139
    new-instance v2, Ljava/util/HashMap;

    .line 140
    .line 141
    .line 142
    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->setCustomInfo(Ljava/util/HashMap;)V

    .line 146
    .line 147
    .line 148
    :cond_8
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/login/g;

    .line 152
    .line 153
    .line 154
    invoke-direct {v2, p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/login/g;-><init>(Lio/trtc/tuikit/atomicxcore/impl/login/h;Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->setSelfInfo(Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 158
    return-void
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
