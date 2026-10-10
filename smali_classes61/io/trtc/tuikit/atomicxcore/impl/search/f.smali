.class public final Lio/trtc/tuikit/atomicxcore/impl/search/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

.field public final synthetic b:Lkotlin/coroutines/SafeContinuation;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/SafeContinuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/f;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/search/f;->b:Lkotlin/coroutines/SafeContinuation;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public final onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/f;->b:Lkotlin/coroutines/SafeContinuation;

    .line 3
    .line 4
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 5
    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/e;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const-string p2, "Friend search failed"

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {v1, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/e;-><init>(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lkotlin/coroutines/SafeContinuation;->resumeWith(Ljava/lang/Object;)V

    .line 25
    return-void
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
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 35

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    check-cast v1, Ljava/util/List;

    .line 7
    .line 8
    if-eqz v1, :cond_5

    .line 9
    .line 10
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/search/f;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 11
    .line 12
    new-instance v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v4

    .line 24
    .line 25
    if-eqz v4, :cond_6

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMFriendInfoResult;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFriendInfoResult;->getFriendInfo()Lcom/tencent/imsdk/v2/V2TIMFriendInfo;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    if-eqz v4, :cond_4

    .line 38
    .line 39
    .line 40
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserID()Ljava/lang/String;

    .line 47
    move-result-object v6

    .line 48
    .line 49
    if-nez v6, :cond_1

    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getFriendRemark()Ljava/lang/String;

    .line 55
    move-result-object v18

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getFriendAddTime()J

    .line 59
    move-result-wide v19

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getFriendCustomInfo()Ljava/util/HashMap;

    .line 63
    move-result-object v21

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFriendInfo;->getUserProfile()Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    .line 72
    const-string/jumbo v5, "v2UserInfo"

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    new-instance v22, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getUserID()Ljava/lang/String;

    .line 81
    move-result-object v5

    .line 82
    .line 83
    if-nez v5, :cond_2

    .line 84
    .line 85
    const-string v5, ""

    .line 86
    .line 87
    :cond_2
    move-object/from16 v23, v5

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getNickName()Ljava/lang/String;

    .line 91
    move-result-object v24

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getFaceUrl()Ljava/lang/String;

    .line 95
    move-result-object v25

    .line 96
    .line 97
    const/16 v33, 0x3f8

    .line 98
    .line 99
    const/16 v34, 0x0

    .line 100
    .line 101
    const/16 v26, 0x0

    .line 102
    .line 103
    const/16 v27, 0x0

    .line 104
    .line 105
    const/16 v28, 0x0

    .line 106
    .line 107
    const/16 v29, 0x0

    .line 108
    .line 109
    const/16 v30, 0x0

    .line 110
    .line 111
    const/16 v31, 0x0

    .line 112
    .line 113
    const/16 v32, 0x0

    .line 114
    .line 115
    .line 116
    invoke-direct/range {v22 .. v34}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/login/Gender;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/login/AllowType;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 117
    .line 118
    move-object/from16 v5, v22

    .line 119
    .line 120
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/login/Gender;->Companion:Lio/trtc/tuikit/atomicxcore/api/login/Gender$Companion;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getGender()I

    .line 124
    move-result v8

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, v8}, Lio/trtc/tuikit/atomicxcore/api/login/Gender$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/login/Gender;

    .line 128
    move-result-object v7

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v7}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->setGender(Lio/trtc/tuikit/atomicxcore/api/login/Gender;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserInfo;->getBirthday()J

    .line 135
    move-result-wide v7

    .line 136
    .line 137
    .line 138
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 139
    move-result-object v7

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v7}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->setBirthday(Ljava/lang/Long;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getLevel()I

    .line 146
    move-result v7

    .line 147
    .line 148
    .line 149
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    move-result-object v7

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5, v7}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->setLevel(Ljava/lang/Integer;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getRole()I

    .line 157
    move-result v7

    .line 158
    .line 159
    .line 160
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    move-result-object v7

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, v7}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->setRole(Ljava/lang/Integer;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getSelfSignature()Ljava/lang/String;

    .line 168
    move-result-object v7

    .line 169
    .line 170
    .line 171
    invoke-virtual {v5, v7}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->setSelfSignature(Ljava/lang/String;)V

    .line 172
    .line 173
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/login/AllowType;->Companion:Lio/trtc/tuikit/atomicxcore/api/login/AllowType$Companion;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getAllowType()I

    .line 177
    move-result v8

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v8}, Lio/trtc/tuikit/atomicxcore/api/login/AllowType$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/login/AllowType;

    .line 181
    move-result-object v7

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v7}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->setAllowType(Lio/trtc/tuikit/atomicxcore/api/login/AllowType;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;->getCustomInfo()Ljava/util/HashMap;

    .line 188
    move-result-object v4

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5, v4}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;->setCustomInfo(Ljava/util/Map;)V

    .line 192
    :goto_1
    move-object v11, v5

    .line 193
    goto :goto_2

    .line 194
    .line 195
    :cond_3
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;

    .line 196
    .line 197
    const/16 v16, 0x3fe

    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    const/4 v7, 0x0

    .line 201
    const/4 v8, 0x0

    .line 202
    const/4 v9, 0x0

    .line 203
    const/4 v10, 0x0

    .line 204
    const/4 v11, 0x0

    .line 205
    const/4 v12, 0x0

    .line 206
    const/4 v13, 0x0

    .line 207
    const/4 v14, 0x0

    .line 208
    const/4 v15, 0x0

    .line 209
    .line 210
    .line 211
    invoke-direct/range {v5 .. v17}, Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/login/Gender;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/login/AllowType;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 212
    goto :goto_1

    .line 213
    .line 214
    :goto_2
    new-instance v5, Lio/trtc/tuikit/atomicxcore/api/search/FriendSearchInfo;

    .line 215
    .line 216
    move-object/from16 v7, v18

    .line 217
    .line 218
    move-wide/from16 v8, v19

    .line 219
    .line 220
    move-object/from16 v10, v21

    .line 221
    .line 222
    .line 223
    invoke-direct/range {v5 .. v11}, Lio/trtc/tuikit/atomicxcore/api/search/FriendSearchInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;)V

    .line 224
    goto :goto_4

    .line 225
    :cond_4
    :goto_3
    const/4 v5, 0x0

    .line 226
    .line 227
    :goto_4
    if-eqz v5, :cond_0

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    .line 235
    :cond_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 236
    move-result-object v3

    .line 237
    .line 238
    :cond_6
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/f;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 239
    .line 240
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/search/p;->k:Lkotlinx/coroutines/flow/n;

    .line 241
    .line 242
    .line 243
    invoke-interface {v1, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 244
    .line 245
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/f;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 246
    .line 247
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/search/p;->l:Lkotlinx/coroutines/flow/n;

    .line 248
    .line 249
    .line 250
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 251
    move-result v2

    .line 252
    .line 253
    .line 254
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    move-result-object v2

    .line 256
    .line 257
    .line 258
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 259
    .line 260
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/f;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 261
    .line 262
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/search/p;->m:Lkotlinx/coroutines/flow/n;

    .line 263
    .line 264
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 265
    .line 266
    .line 267
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 268
    .line 269
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/f;->b:Lkotlin/coroutines/SafeContinuation;

    .line 270
    .line 271
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 272
    .line 273
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 274
    .line 275
    .line 276
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    move-result-object v2

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v2}, Lkotlin/coroutines/SafeContinuation;->resumeWith(Ljava/lang/Object;)V

    .line 281
    return-void
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
