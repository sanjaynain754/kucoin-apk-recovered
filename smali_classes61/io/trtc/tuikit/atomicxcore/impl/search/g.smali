.class public final Lio/trtc/tuikit/atomicxcore/impl/search/g;
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
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/g;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/search/g;->b:Lkotlin/coroutines/SafeContinuation;

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
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/g;->b:Lkotlin/coroutines/SafeContinuation;

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
    const-string p2, "Group member search failed"

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
    .locals 23

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    check-cast v1, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchResult;

    .line 7
    .line 8
    if-eqz v1, :cond_7

    .line 9
    .line 10
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/search/g;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 11
    .line 12
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/search/g;->b:Lkotlin/coroutines/SafeContinuation;

    .line 13
    .line 14
    iget-object v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/p;->f:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x1

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    move v4, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v4, 0x0

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchResult;->getNextCursor()Ljava/lang/String;

    .line 28
    move-result-object v6

    .line 29
    .line 30
    if-nez v6, :cond_1

    .line 31
    .line 32
    const-string v6, ""

    .line 33
    goto :goto_1

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    .line 38
    :goto_1
    iput-object v6, v2, Lio/trtc/tuikit/atomicxcore/impl/search/p;->f:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    .line 43
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchResult;->getMemberList()Ljava/util/Map;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    if-eqz v7, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 56
    move-result-object v7

    .line 57
    .line 58
    .line 59
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    move-result-object v7

    .line 61
    .line 62
    .line 63
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    move-result v8

    .line 65
    .line 66
    if-eqz v8, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    move-result-object v8

    .line 71
    .line 72
    check-cast v8, Ljava/util/Map$Entry;

    .line 73
    .line 74
    .line 75
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    move-result-object v9

    .line 77
    .line 78
    check-cast v9, Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 82
    move-result-object v8

    .line 83
    .line 84
    check-cast v8, Ljava/util/List;

    .line 85
    .line 86
    .line 87
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 91
    .line 92
    new-instance v10, Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    move-result-object v8

    .line 100
    .line 101
    .line 102
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    move-result v11

    .line 104
    .line 105
    if-eqz v11, :cond_2

    .line 106
    .line 107
    .line 108
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    move-result-object v11

    .line 110
    .line 111
    check-cast v11, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;

    .line 112
    .line 113
    .line 114
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    const-string/jumbo v12, "v2Member"

    .line 118
    .line 119
    .line 120
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    new-instance v13, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v11}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getUserID()Ljava/lang/String;

    .line 126
    move-result-object v14

    .line 127
    .line 128
    const-string v12, "getUserID(...)"

    .line 129
    .line 130
    .line 131
    invoke-static {v14, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v11}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getNickName()Ljava/lang/String;

    .line 135
    move-result-object v15

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getFaceUrl()Ljava/lang/String;

    .line 139
    move-result-object v16

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getNameCard()Ljava/lang/String;

    .line 143
    move-result-object v17

    .line 144
    .line 145
    const/16 v21, 0x30

    .line 146
    .line 147
    const/16 v22, 0x0

    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    const-wide/16 v19, 0x0

    .line 152
    .line 153
    .line 154
    invoke-direct/range {v13 .. v22}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 155
    .line 156
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole$Companion;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v11}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;->getRole()I

    .line 160
    move-result v14

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v14}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;

    .line 164
    move-result-object v12

    .line 165
    .line 166
    .line 167
    invoke-virtual {v13, v12}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;->setRole(Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v11}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;->getMuteUntil()J

    .line 171
    move-result-wide v11

    .line 172
    .line 173
    .line 174
    invoke-virtual {v13, v11, v12}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;->setMuteUntil(J)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    goto :goto_3

    .line 179
    .line 180
    .line 181
    :cond_2
    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    goto :goto_2

    .line 183
    .line 184
    :cond_3
    if-eqz v4, :cond_4

    .line 185
    .line 186
    iget-object v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/p;->q:Lkotlinx/coroutines/flow/n;

    .line 187
    .line 188
    .line 189
    invoke-interface {v4, v6}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 190
    goto :goto_5

    .line 191
    .line 192
    :cond_4
    iget-object v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/p;->q:Lkotlinx/coroutines/flow/n;

    .line 193
    .line 194
    .line 195
    invoke-interface {v4}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 196
    move-result-object v4

    .line 197
    .line 198
    check-cast v4, Ljava/util/Map;

    .line 199
    .line 200
    .line 201
    invoke-static {v4}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 202
    move-result-object v4

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 206
    move-result-object v6

    .line 207
    .line 208
    .line 209
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 210
    move-result-object v6

    .line 211
    .line 212
    .line 213
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    move-result v7

    .line 215
    .line 216
    if-eqz v7, :cond_6

    .line 217
    .line 218
    .line 219
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    move-result-object v7

    .line 221
    .line 222
    check-cast v7, Ljava/util/Map$Entry;

    .line 223
    .line 224
    .line 225
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 226
    move-result-object v8

    .line 227
    .line 228
    check-cast v8, Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 232
    move-result-object v7

    .line 233
    .line 234
    check-cast v7, Ljava/util/List;

    .line 235
    .line 236
    .line 237
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    move-result-object v9

    .line 239
    .line 240
    check-cast v9, Ljava/util/List;

    .line 241
    .line 242
    if-nez v9, :cond_5

    .line 243
    .line 244
    .line 245
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 246
    move-result-object v9

    .line 247
    .line 248
    .line 249
    :cond_5
    invoke-static {v9, v7}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 250
    move-result-object v7

    .line 251
    .line 252
    .line 253
    invoke-interface {v4, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    goto :goto_4

    .line 255
    .line 256
    :cond_6
    iget-object v6, v2, Lio/trtc/tuikit/atomicxcore/impl/search/p;->q:Lkotlinx/coroutines/flow/n;

    .line 257
    .line 258
    .line 259
    invoke-interface {v6, v4}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 260
    .line 261
    :goto_5
    iget-object v4, v2, Lio/trtc/tuikit/atomicxcore/impl/search/p;->r:Lkotlinx/coroutines/flow/n;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchResult;->getTotalCount()I

    .line 265
    move-result v6

    .line 266
    .line 267
    .line 268
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    move-result-object v6

    .line 270
    .line 271
    .line 272
    invoke-interface {v4, v6}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 273
    .line 274
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/search/p;->s:Lkotlinx/coroutines/flow/n;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberSearchResult;->getIsFinished()Z

    .line 278
    move-result v1

    .line 279
    xor-int/2addr v1, v5

    .line 280
    .line 281
    .line 282
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 283
    move-result-object v1

    .line 284
    .line 285
    .line 286
    invoke-interface {v2, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 287
    .line 288
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 289
    .line 290
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 291
    .line 292
    .line 293
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    move-result-object v2

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3, v2}, Lkotlin/coroutines/SafeContinuation;->resumeWith(Ljava/lang/Object;)V

    .line 298
    goto :goto_6

    .line 299
    :cond_7
    const/4 v1, 0x0

    .line 300
    .line 301
    :goto_6
    if-nez v1, :cond_8

    .line 302
    .line 303
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/search/g;->b:Lkotlin/coroutines/SafeContinuation;

    .line 304
    .line 305
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 306
    .line 307
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/e;

    .line 308
    const/4 v3, -0x1

    .line 309
    .line 310
    const-string v4, "Internal error"

    .line 311
    .line 312
    .line 313
    invoke-direct {v2, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/e;-><init>(ILjava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 317
    move-result-object v2

    .line 318
    .line 319
    .line 320
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    move-result-object v2

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v2}, Lkotlin/coroutines/SafeContinuation;->resumeWith(Ljava/lang/Object;)V

    .line 325
    :cond_8
    return-void
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
