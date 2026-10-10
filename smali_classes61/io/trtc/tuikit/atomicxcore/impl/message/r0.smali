.class public final Lio/trtc/tuikit/atomicxcore/impl/message/r0;
.super Lio/trtc/tuikit/atomicxcore/api/message/MessageListStore;
.source "SourceFile"


# static fields
.field public static final synthetic n:I


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

.field public final c:Lkotlinx/coroutines/m0;

.field public final d:Lkotlinx/coroutines/m0;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public h:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;

.field public final i:Lkotlinx/coroutines/flow/m;

.field public final j:Lkotlinx/coroutines/flow/r;

.field public final k:Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;

.field public volatile l:Lio/trtc/tuikit/atomicxcore/impl/message/m0;

.field public volatile m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "conversationID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "messageListType"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageListStore;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;)V

    .line 14
    .line 15
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 21
    move-result-object p1

    .line 22
    const/4 p2, 0x0

    .line 23
    const/4 v0, 0x1

    .line 24
    .line 25
    .line 26
    invoke-static {p2, v0, p2}, Lkotlinx/coroutines/z1;->b(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/z;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->c:Lkotlinx/coroutines/m0;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-static {p2, v0, p2}, Lkotlinx/coroutines/z1;->b(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/z;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->d:Lkotlinx/coroutines/m0;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 66
    .line 67
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    iput-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->f:Lkotlinx/coroutines/flow/n;

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->g:Lkotlinx/coroutines/flow/n;

    .line 80
    .line 81
    sget-object v3, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 82
    const/4 v4, 0x0

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v4, v3}, Lkotlinx/coroutines/flow/s;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/m;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->i:Lkotlinx/coroutines/flow/m;

    .line 89
    .line 90
    .line 91
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->b(Lkotlinx/coroutines/flow/m;)Lkotlinx/coroutines/flow/r;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->j:Lkotlinx/coroutines/flow/r;

    .line 95
    .line 96
    new-instance v3, Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    .line 103
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    .line 111
    invoke-direct {v3, p1, v2, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 112
    .line 113
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->k:Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;

    .line 114
    .line 115
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/message/m0;

    .line 116
    .line 117
    .line 118
    invoke-direct {p1, p0}, Lio/trtc/tuikit/atomicxcore/impl/message/m0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;)V

    .line 119
    .line 120
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->l:Lio/trtc/tuikit/atomicxcore/impl/message/m0;

    .line 121
    .line 122
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/common/v;

    .line 123
    .line 124
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->l:Lio/trtc/tuikit/atomicxcore/impl/message/m0;

    .line 125
    .line 126
    .line 127
    invoke-direct {p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/v;-><init>(Lcom/tencent/imsdk/v2/V2TIMAdvancedMsgListener;)V

    .line 128
    .line 129
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 130
    .line 131
    .line 132
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/message/n0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;)V

    .line 133
    .line 134
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 135
    .line 136
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 137
    .line 138
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 139
    .line 140
    const-string v2, "onMessageSendBegin"

    .line 141
    .line 142
    .line 143
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 144
    .line 145
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 146
    .line 147
    const-string v2, "onMessageSendProgress"

    .line 148
    .line 149
    .line 150
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 151
    .line 152
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 153
    .line 154
    const-string v2, "onMessageSendSuccess"

    .line 155
    .line 156
    .line 157
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 158
    .line 159
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 160
    .line 161
    const-string v2, "onMessageSendFailed"

    .line 162
    .line 163
    .line 164
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 165
    .line 166
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 167
    .line 168
    const-string v2, "onMessageDeleted"

    .line 169
    .line 170
    .line 171
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 172
    .line 173
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 174
    .line 175
    const-string v2, "onMessageRecalled"

    .line 176
    .line 177
    .line 178
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 179
    .line 180
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 181
    .line 182
    const-string v2, "onChatHistoryMessageCleared"

    .line 183
    .line 184
    .line 185
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 186
    .line 187
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 188
    .line 189
    const-string v2, "onMessagePinned"

    .line 190
    .line 191
    .line 192
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 193
    .line 194
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 195
    .line 196
    const-string v2, "onMessageTranslated"

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 200
    .line 201
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 202
    .line 203
    const-string v2, "onVoiceConvertedToText"

    .line 204
    .line 205
    .line 206
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 207
    .line 208
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->m:Lio/trtc/tuikit/atomicxcore/impl/message/n0;

    .line 209
    .line 210
    const-string v2, "onConversationHistoryMessageCleared"

    .line 211
    .line 212
    .line 213
    invoke-static {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 214
    .line 215
    .line 216
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 217
    move-result-object v0

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, p1}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->addAdvancedMsgListener(Lcom/tencent/imsdk/v2/V2TIMAdvancedMsgListener;)V

    .line 221
    .line 222
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/message/t;

    .line 223
    .line 224
    .line 225
    invoke-direct {v4, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/t;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lkotlin/coroutines/Continuation;)V

    .line 226
    const/4 v5, 0x3

    .line 227
    const/4 v6, 0x0

    .line 228
    const/4 v2, 0x0

    .line 229
    const/4 v3, 0x0

    .line 230
    .line 231
    .line 232
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 233
    return-void
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/message/k0;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance p0, Lkotlinx/coroutines/o;

    invoke-static {p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 3
    invoke-virtual {p0}, Lkotlinx/coroutines/o;->E()V

    .line 4
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore$Companion;

    invoke-virtual {v0, p2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore;

    move-result-object p2

    .line 5
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/q0;

    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/impl/message/q0;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {p2, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore;->sendMessage(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 6
    invoke-virtual {p0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 8
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Ljava/lang/String;I)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez v1, :cond_0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 10
    :cond_0
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 11
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 13
    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 14
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move v4, v6

    :goto_1
    if-eq v4, v6, :cond_3

    .line 15
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    const v28, 0x3fff7f

    const/16 v29, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move/from16 v13, p2

    .line 16
    invoke-static/range {v5 .. v29}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v1

    .line 17
    invoke-interface {v2, v4, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Ljava/util/Map;)V
    .locals 2

    .line 19
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 20
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;->HISTORY:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "conversationID"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 22
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 24
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 25
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 26
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 27
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$DeleteMessages;

    invoke-direct {v0, p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent$DeleteMessages;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;)V
    .locals 6

    .line 63
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->c:Lkotlinx/coroutines/m0;

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/message/o0;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/o0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageEvent;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 18

    move-object/from16 v0, p0

    .line 28
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;-><init>()V

    .line 29
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

    .line 30
    const-string v8, "conversationID"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const-string v3, "c2c_"

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static {v2, v3, v9, v10, v11}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 32
    const-string v4, ""

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v11

    .line 33
    :goto_0
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;->setUserID(Ljava/lang/String;)V

    .line 34
    iget-object v12, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

    .line 35
    invoke-static {v12, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    const-string v13, "group_"

    invoke-static {v12, v13, v9, v10, v11}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v16, 0x4

    const/16 v17, 0x0

    .line 37
    const-string v14, ""

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v11

    .line 38
    :goto_1
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;->setGroupID(Ljava/lang/String;)V

    .line 39
    invoke-virtual/range {p1 .. p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getMessage()Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    move-result-object v11

    :cond_2
    invoke-virtual {v1, v11}, Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;->setLastMsg(Lcom/tencent/imsdk/v2/V2TIMMessage;)V

    .line 40
    invoke-virtual/range {p1 .. p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getPageCount()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;->setCount(I)V

    .line 41
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    invoke-virtual/range {p1 .. p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getFilterType()Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;

    move-result-object v3

    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;->Image:Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;

    invoke-virtual {v3, v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;->contains(Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;)Z

    move-result v3

    const/4 v4, 0x3

    if-eqz v3, :cond_3

    .line 43
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getFilterType()Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;

    move-result-object v3

    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;->Video:Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;

    invoke-virtual {v3, v5}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;->contains(Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x5

    .line 45
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    :cond_4
    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;->setMessageTypeList(Ljava/util/List;)V

    .line 47
    invoke-virtual/range {p1 .. p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getDirection()Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    move-result-object v3

    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->NEWER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    if-ne v3, v5, :cond_5

    .line 48
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v10, 0x4

    goto :goto_2

    .line 49
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    move v10, v4

    goto :goto_2

    :cond_6
    const/4 v10, 0x1

    .line 50
    :cond_7
    :goto_2
    invoke-virtual {v1, v10}, Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;->setGetType(I)V

    .line 51
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    move-result-object v2

    .line 52
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/message/e0;

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p3

    invoke-direct {v3, v4, v0, v5, v6}, Lio/trtc/tuikit/atomicxcore/impl/message/e0;-><init>(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;Lio/trtc/tuikit/atomicxcore/impl/message/r0;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    invoke-virtual {v2, v1, v3}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->getHistoryMessageList(Lcom/tencent/imsdk/v2/V2TIMMessageListGetOption;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    return-void
.end method

.method public final a(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lkotlin/jvm/functions/Function1;)V
    .locals 30

    move-object/from16 v0, p0

    .line 53
    invoke-virtual/range {p1 .. p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 54
    :cond_0
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 55
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 56
    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 57
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move v4, v6

    :goto_1
    if-eq v4, v6, :cond_4

    .line 58
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 59
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    move-result-object v1

    if-eqz v1, :cond_3

    move-object/from16 v3, p2

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    :goto_2
    move-object/from16 v17, v1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    goto :goto_2

    :goto_3
    const v28, 0x3ff77f

    const/16 v29, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x64

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    .line 60
    invoke-static/range {v5 .. v29}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    move-result-object v1

    .line 61
    invoke-interface {v2, v4, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    return-void
.end method

.method public final deleteMessages(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "messageList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    const/16 v1, 0x1781

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    if-eqz p2, :cond_4

    .line 16
    .line 17
    const-string p1, "messageList cannot be empty"

    .line 18
    .line 19
    .line 20
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    move-result v3

    .line 40
    .line 41
    if-eqz v3, :cond_5

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    const-string p1, "MessageInfo.rawMessage cannot be null"

    .line 58
    .line 59
    .line 60
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 61
    return-void

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMsgID()Ljava/lang/String;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 71
    move-result v5

    .line 72
    .line 73
    if-nez v5, :cond_2

    .line 74
    goto :goto_1

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    .line 84
    .line 85
    const-string p1, "MessageInfo.msgID cannot be null"

    .line 86
    .line 87
    .line 88
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 89
    :cond_4
    return-void

    .line 90
    .line 91
    .line 92
    :cond_5
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/message/v;

    .line 96
    .line 97
    .line 98
    invoke-direct {v1, v2, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/v;-><init>(Ljava/util/ArrayList;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0, v1}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->deleteMessages(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 102
    return-void
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
.end method

.method public final downloadMessageResource(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MessageMediaFileType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "resourceType"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    if-eqz p3, :cond_1d

    .line 19
    .line 20
    const/16 p1, 0x1781

    .line 21
    .line 22
    const-string p2, "Message not found for operation"

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_0
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/message/u;->c:[I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 32
    move-result p2

    .line 33
    .line 34
    aget p2, v1, p2

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    .line 38
    packed-switch p2, :pswitch_data_0

    .line 39
    .line 40
    goto/16 :goto_9

    .line 41
    .line 42
    :pswitch_0
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 43
    .line 44
    .line 45
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 46
    .line 47
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->FILE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->getFilePath()Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v3, v1

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFileElem()Lcom/tencent/imsdk/v2/V2TIMFileElem;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->getUUID()Ljava/lang/String;

    .line 69
    move-result-object v4

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v4, v1

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFileElem()Lcom/tencent/imsdk/v2/V2TIMFileElem;

    .line 75
    move-result-object v5

    .line 76
    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->getFileName()Ljava/lang/String;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    :cond_3
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/message/z;

    .line 84
    .line 85
    .line 86
    invoke-direct {v5, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/z;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v3, v4, v1, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    iget-boolean p2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 93
    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/w;

    .line 97
    .line 98
    .line 99
    invoke-direct {p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/w;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lkotlin/jvm/functions/Function1;)V

    .line 103
    .line 104
    if-eqz p3, :cond_1d

    .line 105
    .line 106
    .line 107
    invoke-interface {p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 108
    return-void

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getFileElem()Lcom/tencent/imsdk/v2/V2TIMFileElem;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    if-eqz p2, :cond_1d

    .line 115
    .line 116
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/y;

    .line 117
    .line 118
    .line 119
    invoke-direct {v0, p0, p1, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/y;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v1, v0}, Lcom/tencent/imsdk/v2/V2TIMFileElem;->downloadFile(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V

    .line 123
    return-void

    .line 124
    .line 125
    :pswitch_1
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 126
    .line 127
    .line 128
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 129
    .line 130
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->SOUND:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->getSoundPath()Ljava/lang/String;

    .line 140
    move-result-object v3

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move-object v3, v1

    .line 143
    .line 144
    .line 145
    :goto_2
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSoundElem()Lcom/tencent/imsdk/v2/V2TIMSoundElem;

    .line 146
    move-result-object v4

    .line 147
    .line 148
    if-eqz v4, :cond_6

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;->getUUID()Ljava/lang/String;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    :cond_6
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/message/L;

    .line 155
    .line 156
    .line 157
    invoke-direct {v4, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/L;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 158
    .line 159
    const-string v5, "amr"

    .line 160
    .line 161
    .line 162
    invoke-static {v2, v3, v1, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 163
    move-result-object v1

    .line 164
    .line 165
    iget-boolean p2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 166
    .line 167
    if-eqz p2, :cond_7

    .line 168
    .line 169
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/I;

    .line 170
    .line 171
    .line 172
    invoke-direct {p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/I;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lkotlin/jvm/functions/Function1;)V

    .line 176
    .line 177
    if-eqz p3, :cond_1d

    .line 178
    .line 179
    .line 180
    invoke-interface {p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 181
    return-void

    .line 182
    .line 183
    .line 184
    :cond_7
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getSoundElem()Lcom/tencent/imsdk/v2/V2TIMSoundElem;

    .line 185
    move-result-object p2

    .line 186
    .line 187
    if-eqz p2, :cond_1d

    .line 188
    .line 189
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/K;

    .line 190
    .line 191
    .line 192
    invoke-direct {v0, p0, p1, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/K;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2, v1, v0}, Lcom/tencent/imsdk/v2/V2TIMSoundElem;->downloadSound(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V

    .line 196
    return-void

    .line 197
    .line 198
    :pswitch_2
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 199
    .line 200
    .line 201
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 202
    .line 203
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->VIDEO:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 207
    move-result-object v3

    .line 208
    .line 209
    if-eqz v3, :cond_8

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->getVideoPath()Ljava/lang/String;

    .line 213
    move-result-object v3

    .line 214
    goto :goto_3

    .line 215
    :cond_8
    move-object v3, v1

    .line 216
    .line 217
    .line 218
    :goto_3
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getVideoElem()Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 219
    move-result-object v4

    .line 220
    .line 221
    if-eqz v4, :cond_9

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getVideoUUID()Ljava/lang/String;

    .line 225
    move-result-object v1

    .line 226
    .line 227
    :cond_9
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/message/U;

    .line 228
    .line 229
    .line 230
    invoke-direct {v4, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/U;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 231
    .line 232
    const-string v5, ""

    .line 233
    .line 234
    .line 235
    invoke-static {v2, v3, v1, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 236
    move-result-object v1

    .line 237
    .line 238
    iget-boolean p2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 239
    .line 240
    if-eqz p2, :cond_a

    .line 241
    .line 242
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/Q;

    .line 243
    .line 244
    .line 245
    invoke-direct {p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/Q;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lkotlin/jvm/functions/Function1;)V

    .line 249
    .line 250
    if-eqz p3, :cond_1d

    .line 251
    .line 252
    .line 253
    invoke-interface {p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 254
    return-void

    .line 255
    .line 256
    .line 257
    :cond_a
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getVideoElem()Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 258
    move-result-object p2

    .line 259
    .line 260
    if-eqz p2, :cond_1d

    .line 261
    .line 262
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/T;

    .line 263
    .line 264
    .line 265
    invoke-direct {v0, p0, p1, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/T;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p2, v1, v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->downloadVideo(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V

    .line 269
    return-void

    .line 270
    .line 271
    :pswitch_3
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 272
    .line 273
    .line 274
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 275
    .line 276
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->VIDEO:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 280
    move-result-object v3

    .line 281
    .line 282
    if-eqz v3, :cond_b

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->getVideoSnapshotPath()Ljava/lang/String;

    .line 286
    move-result-object v3

    .line 287
    goto :goto_4

    .line 288
    :cond_b
    move-object v3, v1

    .line 289
    .line 290
    .line 291
    :goto_4
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getVideoElem()Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 292
    move-result-object v4

    .line 293
    .line 294
    if-eqz v4, :cond_c

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->getSnapshotUUID()Ljava/lang/String;

    .line 298
    move-result-object v4

    .line 299
    goto :goto_5

    .line 300
    :cond_c
    move-object v4, v1

    .line 301
    .line 302
    :goto_5
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/message/Y;

    .line 303
    .line 304
    .line 305
    invoke-direct {v5, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/Y;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 306
    .line 307
    .line 308
    invoke-static {v2, v3, v4, v1, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 309
    move-result-object v1

    .line 310
    .line 311
    iget-boolean p2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 312
    .line 313
    if-eqz p2, :cond_d

    .line 314
    .line 315
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/V;

    .line 316
    .line 317
    .line 318
    invoke-direct {p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/V;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lkotlin/jvm/functions/Function1;)V

    .line 322
    .line 323
    if-eqz p3, :cond_1d

    .line 324
    .line 325
    .line 326
    invoke-interface {p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 327
    return-void

    .line 328
    .line 329
    .line 330
    :cond_d
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getVideoElem()Lcom/tencent/imsdk/v2/V2TIMVideoElem;

    .line 331
    move-result-object p2

    .line 332
    .line 333
    if-eqz p2, :cond_1d

    .line 334
    .line 335
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/X;

    .line 336
    .line 337
    .line 338
    invoke-direct {v0, p0, p1, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/X;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p2, v1, v0}, Lcom/tencent/imsdk/v2/V2TIMVideoElem;->downloadSnapshot(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V

    .line 342
    return-void

    .line 343
    .line 344
    .line 345
    :pswitch_4
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getImageElem()Lcom/tencent/imsdk/v2/V2TIMImageElem;

    .line 346
    move-result-object p2

    .line 347
    .line 348
    if-eqz p2, :cond_e

    .line 349
    .line 350
    .line 351
    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMImageElem;->getImageList()Ljava/util/List;

    .line 352
    move-result-object p2

    .line 353
    goto :goto_6

    .line 354
    :cond_e
    move-object p2, v1

    .line 355
    .line 356
    :goto_6
    if-nez p2, :cond_f

    .line 357
    .line 358
    .line 359
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 360
    move-result-object p2

    .line 361
    .line 362
    .line 363
    :cond_f
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 364
    move-result-object p2

    .line 365
    .line 366
    .line 367
    :cond_10
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    move-result v0

    .line 369
    .line 370
    if-eqz v0, :cond_1d

    .line 371
    .line 372
    .line 373
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    move-result-object v0

    .line 375
    .line 376
    check-cast v0, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    .line 380
    move-result v2

    .line 381
    .line 382
    if-nez v2, :cond_10

    .line 383
    .line 384
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 385
    .line 386
    .line 387
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 388
    .line 389
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->IMAGE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 393
    move-result-object v3

    .line 394
    .line 395
    if-eqz v3, :cond_11

    .line 396
    .line 397
    .line 398
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->getOriginalImagePath()Ljava/lang/String;

    .line 399
    move-result-object v1

    .line 400
    .line 401
    .line 402
    :cond_11
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getUUID()Ljava/lang/String;

    .line 403
    move-result-object v3

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    .line 407
    move-result v4

    .line 408
    .line 409
    .line 410
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 411
    move-result-object v4

    .line 412
    .line 413
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/message/H;

    .line 414
    .line 415
    .line 416
    invoke-direct {v5, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/H;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 417
    .line 418
    .line 419
    invoke-static {v2, v1, v3, v4, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 420
    move-result-object v1

    .line 421
    .line 422
    iget-boolean p2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 423
    .line 424
    if-eqz p2, :cond_12

    .line 425
    .line 426
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/E;

    .line 427
    .line 428
    .line 429
    invoke-direct {p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/E;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lkotlin/jvm/functions/Function1;)V

    .line 433
    .line 434
    if-eqz p3, :cond_1d

    .line 435
    .line 436
    .line 437
    invoke-interface {p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 438
    return-void

    .line 439
    .line 440
    :cond_12
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/G;

    .line 441
    .line 442
    .line 443
    invoke-direct {p2, p0, p1, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/G;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v1, p2}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->downloadImage(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V

    .line 447
    return-void

    .line 448
    .line 449
    .line 450
    :pswitch_5
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getImageElem()Lcom/tencent/imsdk/v2/V2TIMImageElem;

    .line 451
    move-result-object p2

    .line 452
    .line 453
    if-eqz p2, :cond_13

    .line 454
    .line 455
    .line 456
    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMImageElem;->getImageList()Ljava/util/List;

    .line 457
    move-result-object p2

    .line 458
    goto :goto_7

    .line 459
    :cond_13
    move-object p2, v1

    .line 460
    .line 461
    :goto_7
    if-nez p2, :cond_14

    .line 462
    .line 463
    .line 464
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 465
    move-result-object p2

    .line 466
    .line 467
    .line 468
    :cond_14
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 469
    move-result-object p2

    .line 470
    .line 471
    .line 472
    :cond_15
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    move-result v0

    .line 474
    .line 475
    if-eqz v0, :cond_1d

    .line 476
    .line 477
    .line 478
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    move-result-object v0

    .line 480
    .line 481
    check-cast v0, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    .line 485
    move-result v2

    .line 486
    const/4 v3, 0x2

    .line 487
    .line 488
    if-ne v2, v3, :cond_15

    .line 489
    .line 490
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 491
    .line 492
    .line 493
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 494
    .line 495
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->IMAGE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 496
    .line 497
    .line 498
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 499
    move-result-object v3

    .line 500
    .line 501
    if-eqz v3, :cond_16

    .line 502
    .line 503
    .line 504
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->getLargeImagePath()Ljava/lang/String;

    .line 505
    move-result-object v1

    .line 506
    .line 507
    .line 508
    :cond_16
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getUUID()Ljava/lang/String;

    .line 509
    move-result-object v3

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    .line 513
    move-result v4

    .line 514
    .line 515
    .line 516
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 517
    move-result-object v4

    .line 518
    .line 519
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/message/D;

    .line 520
    .line 521
    .line 522
    invoke-direct {v5, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/D;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 523
    .line 524
    .line 525
    invoke-static {v2, v1, v3, v4, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 526
    move-result-object v1

    .line 527
    .line 528
    iget-boolean p2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 529
    .line 530
    if-eqz p2, :cond_17

    .line 531
    .line 532
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/A;

    .line 533
    .line 534
    .line 535
    invoke-direct {p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/A;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lkotlin/jvm/functions/Function1;)V

    .line 539
    .line 540
    if-eqz p3, :cond_1d

    .line 541
    .line 542
    .line 543
    invoke-interface {p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 544
    return-void

    .line 545
    .line 546
    :cond_17
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/C;

    .line 547
    .line 548
    .line 549
    invoke-direct {p2, p0, p1, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/C;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0, v1, p2}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->downloadImage(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V

    .line 553
    return-void

    .line 554
    .line 555
    .line 556
    :pswitch_6
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getImageElem()Lcom/tencent/imsdk/v2/V2TIMImageElem;

    .line 557
    move-result-object p2

    .line 558
    .line 559
    if-eqz p2, :cond_18

    .line 560
    .line 561
    .line 562
    invoke-virtual {p2}, Lcom/tencent/imsdk/v2/V2TIMImageElem;->getImageList()Ljava/util/List;

    .line 563
    move-result-object p2

    .line 564
    goto :goto_8

    .line 565
    :cond_18
    move-object p2, v1

    .line 566
    .line 567
    :goto_8
    if-nez p2, :cond_19

    .line 568
    .line 569
    .line 570
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 571
    move-result-object p2

    .line 572
    .line 573
    .line 574
    :cond_19
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 575
    move-result-object p2

    .line 576
    .line 577
    .line 578
    :cond_1a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 579
    move-result v0

    .line 580
    .line 581
    if-eqz v0, :cond_1d

    .line 582
    .line 583
    .line 584
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 585
    move-result-object v0

    .line 586
    .line 587
    check-cast v0, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    .line 591
    move-result v2

    .line 592
    const/4 v3, 0x1

    .line 593
    .line 594
    if-ne v2, v3, :cond_1a

    .line 595
    .line 596
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 597
    .line 598
    .line 599
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 600
    .line 601
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->IMAGE:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 602
    .line 603
    .line 604
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 605
    move-result-object v3

    .line 606
    .line 607
    if-eqz v3, :cond_1b

    .line 608
    .line 609
    .line 610
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;->getThumbImagePath()Ljava/lang/String;

    .line 611
    move-result-object v1

    .line 612
    .line 613
    .line 614
    :cond_1b
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getUUID()Ljava/lang/String;

    .line 615
    move-result-object v3

    .line 616
    .line 617
    .line 618
    invoke-virtual {v0}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->getType()I

    .line 619
    move-result v4

    .line 620
    .line 621
    .line 622
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 623
    move-result-object v4

    .line 624
    .line 625
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/message/P;

    .line 626
    .line 627
    .line 628
    invoke-direct {v5, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/P;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 629
    .line 630
    .line 631
    invoke-static {v2, v1, v3, v4, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/l;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 632
    move-result-object v1

    .line 633
    .line 634
    iget-boolean p2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 635
    .line 636
    if-eqz p2, :cond_1c

    .line 637
    .line 638
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/M;

    .line 639
    .line 640
    .line 641
    invoke-direct {p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/M;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lkotlin/jvm/functions/Function1;)V

    .line 645
    .line 646
    if-eqz p3, :cond_1d

    .line 647
    .line 648
    .line 649
    invoke-interface {p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 650
    return-void

    .line 651
    .line 652
    :cond_1c
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/O;

    .line 653
    .line 654
    .line 655
    invoke-direct {p2, p0, p1, p3, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/O;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v1, p2}, Lcom/tencent/imsdk/v2/V2TIMImageElem$V2TIMImage;->downloadImage(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMDownloadCallback;)V

    .line 659
    :cond_1d
    :goto_9
    return-void

    .line 660
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final fetchMessageList(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "option"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/d;->a:Lio/trtc/tuikit/atomicxcore/impl/common/d;

    .line 8
    .line 9
    const-string v1, "componentType"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    new-instance v0, Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 18
    .line 19
    const/16 v1, 0x3e9

    .line 20
    int-to-long v1, v1

    .line 21
    .line 22
    const-string v3, "UIComponentType"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "toString(...)"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/m;

    .line 42
    .line 43
    .line 44
    invoke-direct {v2}, Lio/trtc/tuikit/atomicxcore/impl/common/m;-><init>()V

    .line 45
    .line 46
    const-string v3, "reportTUIFeatureUsage"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v3, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 50
    .line 51
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->h:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;

    .line 52
    .line 53
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->f:Lkotlinx/coroutines/flow/n;

    .line 63
    .line 64
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->g:Lkotlinx/coroutines/flow/n;

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/d0;

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/d0;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 78
    .line 79
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

    .line 80
    .line 81
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/message/u;->a:[I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 85
    move-result v1

    .line 86
    .line 87
    aget v1, v2, v1

    .line 88
    const/4 v2, 0x1

    .line 89
    const/4 v3, 0x0

    .line 90
    .line 91
    if-eq v1, v2, :cond_6

    .line 92
    const/4 v2, 0x2

    .line 93
    .line 94
    if-eq v1, v2, :cond_0

    .line 95
    goto :goto_1

    .line 96
    .line 97
    .line 98
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getMessage()Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    if-eqz v1, :cond_1

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 105
    move-result-object v3

    .line 106
    .line 107
    :cond_1
    const-string v1, "desc"

    .line 108
    .line 109
    const-string v2, "Invalid merged message"

    .line 110
    const/4 v4, -0x1

    .line 111
    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getElemType()I

    .line 116
    move-result v5

    .line 117
    .line 118
    const/16 v6, 0xa

    .line 119
    .line 120
    if-eq v5, v6, :cond_2

    .line 121
    goto :goto_0

    .line 122
    .line 123
    .line 124
    :cond_2
    invoke-virtual {v3}, Lcom/tencent/imsdk/v2/V2TIMMessage;->getMergerElem()Lcom/tencent/imsdk/v2/V2TIMMergerElem;

    .line 125
    move-result-object v3

    .line 126
    .line 127
    if-nez v3, :cond_3

    .line 128
    .line 129
    .line 130
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    if-eqz p2, :cond_5

    .line 133
    .line 134
    .line 135
    invoke-interface {p2, v4, v2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 136
    return-void

    .line 137
    .line 138
    :cond_3
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/message/Z;

    .line 139
    .line 140
    .line 141
    invoke-direct {p2, v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/message/Z;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/d0;Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, p2}, Lcom/tencent/imsdk/v2/V2TIMMergerElem;->downloadMergerMessage(Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 145
    return-void

    .line 146
    .line 147
    .line 148
    :cond_4
    :goto_0
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    if-eqz p2, :cond_5

    .line 151
    .line 152
    .line 153
    invoke-interface {p2, v4, v2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 154
    :cond_5
    :goto_1
    return-void

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getDirection()Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 158
    move-result-object p2

    .line 159
    .line 160
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->OLDER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 161
    .line 162
    if-eq p2, v1, :cond_8

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->getDirection()Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 166
    move-result-object p2

    .line 167
    .line 168
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;->NEWER:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;

    .line 169
    .line 170
    if-ne p2, v1, :cond_7

    .line 171
    goto :goto_2

    .line 172
    .line 173
    :cond_7
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->d:Lkotlinx/coroutines/m0;

    .line 174
    .line 175
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/message/i0;

    .line 176
    .line 177
    .line 178
    invoke-direct {v7, p0, p1, v0, v3}, Lio/trtc/tuikit/atomicxcore/impl/message/i0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;Lio/trtc/tuikit/atomicxcore/impl/message/d0;Lkotlin/coroutines/Continuation;)V

    .line 179
    const/4 v8, 0x3

    .line 180
    const/4 v9, 0x0

    .line 181
    const/4 v5, 0x0

    .line 182
    const/4 v6, 0x0

    .line 183
    .line 184
    .line 185
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 186
    return-void

    .line 187
    :cond_8
    :goto_2
    const/4 p2, 0x0

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 191
    return-void
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final fetchMessageReactions(Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "messageList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    const/16 v1, 0x1781

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    const-string p1, "messageList cannot be empty"

    .line 18
    .line 19
    .line 20
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    if-eqz p3, :cond_1

    .line 51
    .line 52
    const-string p1, "MessageInfo.rawMessage cannot be nil"

    .line 53
    .line 54
    .line 55
    invoke-interface {p3, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 56
    :cond_1
    return-void

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    goto :goto_0

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/message/b0;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, p3, p0}, Lio/trtc/tuikit/atomicxcore/impl/message/b0;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lio/trtc/tuikit/atomicxcore/impl/message/r0;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0, p2, v1}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->getMessageReactions(Ljava/util/List;ILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 73
    return-void
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
.end method

.method public final fetchMoreMessageList(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    const-string v2, "direction"

    .line 7
    .line 8
    move-object/from16 v7, p1

    .line 9
    .line 10
    .line 11
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->h:Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;

    .line 14
    .line 15
    const/16 v2, 0x1781

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    if-eqz v1, :cond_b

    .line 20
    .line 21
    const-string v3, "Please call fetchMessagesInternal first"

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    const/16 v10, 0x1b

    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    .line 31
    const-wide/16 v5, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v3 .. v11}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;JLio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;IILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;

    .line 37
    move-result-object v12

    .line 38
    .line 39
    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/message/u;->b:[I

    .line 40
    .line 41
    .line 42
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 43
    move-result v4

    .line 44
    .line 45
    aget v3, v3, v4

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x1

    .line 48
    .line 49
    if-eq v3, v5, :cond_6

    .line 50
    const/4 v6, 0x2

    .line 51
    .line 52
    if-eq v3, v6, :cond_1

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_1
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->g:Lkotlinx/coroutines/flow/n;

    .line 57
    .line 58
    .line 59
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    check-cast v3, Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    move-result v3

    .line 67
    .line 68
    const-string v6, "No more newer message"

    .line 69
    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    if-eqz v1, :cond_b

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2, v6}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 76
    return-void

    .line 77
    .line 78
    :cond_2
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 79
    .line 80
    .line 81
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    check-cast v3, Ljava/util/List;

    .line 85
    .line 86
    .line 87
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 88
    move-result v7

    .line 89
    .line 90
    .line 91
    invoke-interface {v3, v7}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 96
    move-result v7

    .line 97
    .line 98
    if-eqz v7, :cond_4

    .line 99
    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 102
    move-result-object v7

    .line 103
    move-object v8, v7

    .line 104
    .line 105
    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 109
    move-result-object v8

    .line 110
    .line 111
    if-eqz v8, :cond_3

    .line 112
    move-object v4, v7

    .line 113
    :cond_4
    move-object v13, v4

    .line 114
    .line 115
    check-cast v13, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 116
    .line 117
    if-eqz v13, :cond_5

    .line 118
    .line 119
    const/16 v19, 0x1e

    .line 120
    .line 121
    const/16 v20, 0x0

    .line 122
    .line 123
    const-wide/16 v14, 0x0

    .line 124
    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    .line 132
    invoke-static/range {v12 .. v20}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;JLio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;IILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;

    .line 133
    move-result-object v12

    .line 134
    goto :goto_0

    .line 135
    .line 136
    :cond_5
    if-eqz v1, :cond_b

    .line 137
    .line 138
    .line 139
    invoke-interface {v1, v2, v6}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 140
    return-void

    .line 141
    .line 142
    :cond_6
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->f:Lkotlinx/coroutines/flow/n;

    .line 143
    .line 144
    .line 145
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 146
    move-result-object v3

    .line 147
    .line 148
    check-cast v3, Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    move-result v3

    .line 153
    .line 154
    const-string v6, "No more older message"

    .line 155
    .line 156
    if-nez v3, :cond_7

    .line 157
    .line 158
    if-eqz v1, :cond_b

    .line 159
    .line 160
    .line 161
    invoke-interface {v1, v2, v6}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 162
    return-void

    .line 163
    .line 164
    :cond_7
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->e:Lkotlinx/coroutines/flow/n;

    .line 165
    .line 166
    .line 167
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    check-cast v3, Ljava/lang/Iterable;

    .line 171
    .line 172
    .line 173
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    move-result-object v3

    .line 175
    .line 176
    .line 177
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    move-result v7

    .line 179
    .line 180
    if-eqz v7, :cond_9

    .line 181
    .line 182
    .line 183
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    move-result-object v7

    .line 185
    move-object v8, v7

    .line 186
    .line 187
    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 191
    move-result-object v8

    .line 192
    .line 193
    if-eqz v8, :cond_8

    .line 194
    move-object v4, v7

    .line 195
    :cond_9
    move-object v13, v4

    .line 196
    .line 197
    check-cast v13, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 198
    .line 199
    if-eqz v13, :cond_a

    .line 200
    .line 201
    const/16 v19, 0x1e

    .line 202
    .line 203
    const/16 v20, 0x0

    .line 204
    .line 205
    const-wide/16 v14, 0x0

    .line 206
    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const/16 v18, 0x0

    .line 212
    .line 213
    .line 214
    invoke-static/range {v12 .. v20}, Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;->copy$default(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;JLio/trtc/tuikit/atomicxcore/api/message/MessageFetchDirection;Lio/trtc/tuikit/atomicxcore/api/message/MessageFilterType;IILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;

    .line 215
    move-result-object v12

    .line 216
    .line 217
    .line 218
    :goto_0
    invoke-virtual {v0, v12, v5, v1}, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a(Lio/trtc/tuikit/atomicxcore/api/message/MessageFetchOption;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 219
    return-void

    .line 220
    .line 221
    :cond_a
    if-eqz v1, :cond_b

    .line 222
    .line 223
    .line 224
    invoke-interface {v1, v2, v6}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 225
    :cond_b
    return-void
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method

.method public final forwardMessages(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardOption;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 67

    .line 1
    .line 2
    move-object/from16 v3, p0

    .line 3
    .line 4
    move-object/from16 v5, p3

    .line 5
    .line 6
    move-object/from16 v7, p4

    .line 7
    .line 8
    const-string v0, "messageList"

    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    const-string v0, "forwardOption"

    .line 16
    .line 17
    move-object/from16 v2, p2

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v0, "conversationID"

    .line 23
    .line 24
    .line 25
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 29
    move-result v0

    .line 30
    .line 31
    const/16 v8, 0x1781

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    if-eqz v7, :cond_f

    .line 36
    .line 37
    const-string v0, "messageList cannot be empty"

    .line 38
    .line 39
    .line 40
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 41
    return-void

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    move-result v4

    .line 50
    .line 51
    if-eqz v4, :cond_5

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 61
    move-result-object v6

    .line 62
    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    if-eqz v7, :cond_f

    .line 66
    .line 67
    const-string v0, "MessageInfo.rawMessage cannot be null"

    .line 68
    .line 69
    .line 70
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 71
    return-void

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 75
    move-result-object v6

    .line 76
    .line 77
    sget-object v9, Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;->SEND_SUCCESS:Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;

    .line 78
    .line 79
    if-eq v6, v9, :cond_3

    .line 80
    .line 81
    if-eqz v7, :cond_f

    .line 82
    .line 83
    const-string v0, "Only successfully sent messages can be forwarded"

    .line 84
    .line 85
    .line 86
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 87
    return-void

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageType()Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 91
    move-result-object v6

    .line 92
    .line 93
    sget-object v9, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->SYSTEM:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 94
    .line 95
    if-eq v6, v9, :cond_4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageType()Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 99
    move-result-object v4

    .line 100
    .line 101
    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->UNKNOWN:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 102
    .line 103
    if-ne v4, v6, :cond_1

    .line 104
    .line 105
    :cond_4
    if-eqz v7, :cond_f

    .line 106
    .line 107
    const-string v0, "System messages and unknown messages cannot be forwarded"

    .line 108
    .line 109
    .line 110
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 111
    return-void

    .line 112
    .line 113
    .line 114
    :cond_5
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 115
    move-result v0

    .line 116
    .line 117
    if-nez v0, :cond_6

    .line 118
    .line 119
    if-eqz v7, :cond_f

    .line 120
    .line 121
    const-string v0, "conversationID cannot be empty"

    .line 122
    .line 123
    .line 124
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 125
    return-void

    .line 126
    .line 127
    .line 128
    :cond_6
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardOption;->getForwardType()Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardType;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardType;->MERGED:Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardType;

    .line 132
    .line 133
    if-ne v0, v4, :cond_d

    .line 134
    .line 135
    .line 136
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 137
    move-result v0

    .line 138
    .line 139
    const/16 v4, 0x12c

    .line 140
    .line 141
    if-le v0, v4, :cond_7

    .line 142
    .line 143
    if-eqz v7, :cond_f

    .line 144
    .line 145
    const-string v0, "messageList count cannot exceed 300 when forwardType is MERGED"

    .line 146
    .line 147
    .line 148
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 149
    return-void

    .line 150
    .line 151
    .line 152
    :cond_7
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageForwardOption;->getMergedForwardInfo()Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    if-eqz v0, :cond_c

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getTitle()Ljava/lang/String;

    .line 159
    move-result-object v2

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 163
    move-result v2

    .line 164
    .line 165
    if-nez v2, :cond_8

    .line 166
    .line 167
    goto/16 :goto_1

    .line 168
    .line 169
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    move-result-object v1

    .line 177
    .line 178
    .line 179
    :cond_9
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    move-result v4

    .line 181
    .line 182
    if-eqz v4, :cond_a

    .line 183
    .line 184
    .line 185
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    move-result-object v4

    .line 187
    .line 188
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 192
    move-result-object v4

    .line 193
    .line 194
    if-eqz v4, :cond_9

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    goto :goto_0

    .line 199
    .line 200
    .line 201
    :cond_a
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getTitle()Ljava/lang/String;

    .line 206
    move-result-object v4

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getAbstractList()Ljava/util/List;

    .line 210
    move-result-object v6

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getCompatibleText()Ljava/lang/String;

    .line 214
    move-result-object v9

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v2, v4, v6, v9}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->createMergerMessage(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 218
    move-result-object v32

    .line 219
    .line 220
    if-nez v32, :cond_b

    .line 221
    .line 222
    if-eqz v7, :cond_f

    .line 223
    .line 224
    const-string v0, "Failed to create merger message"

    .line 225
    .line 226
    .line 227
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 228
    return-void

    .line 229
    .line 230
    :cond_b
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getTitle()Ljava/lang/String;

    .line 234
    move-result-object v2

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getAbstractList()Ljava/util/List;

    .line 238
    move-result-object v4

    .line 239
    .line 240
    .line 241
    invoke-direct {v1, v2, v4}, Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 242
    .line 243
    new-instance v33, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 244
    .line 245
    .line 246
    const v65, 0x3fffffff    # 1.9999999f

    .line 247
    .line 248
    const/16 v66, 0x0

    .line 249
    .line 250
    const/16 v34, 0x0

    .line 251
    .line 252
    const/16 v35, 0x0

    .line 253
    .line 254
    const/16 v36, 0x0

    .line 255
    .line 256
    const/16 v37, 0x0

    .line 257
    .line 258
    const/16 v38, 0x0

    .line 259
    .line 260
    const/16 v39, 0x0

    .line 261
    .line 262
    const/16 v40, 0x0

    .line 263
    .line 264
    const/16 v41, 0x0

    .line 265
    .line 266
    const/16 v42, 0x0

    .line 267
    .line 268
    const/16 v43, 0x0

    .line 269
    .line 270
    const/16 v44, 0x0

    .line 271
    .line 272
    const/16 v45, 0x0

    .line 273
    .line 274
    const/16 v46, 0x0

    .line 275
    .line 276
    const/16 v47, 0x0

    .line 277
    .line 278
    const/16 v48, 0x0

    .line 279
    .line 280
    const/16 v49, 0x0

    .line 281
    .line 282
    const/16 v50, 0x0

    .line 283
    .line 284
    const/16 v51, 0x0

    .line 285
    .line 286
    const/16 v52, 0x0

    .line 287
    .line 288
    const/16 v53, 0x0

    .line 289
    .line 290
    const/16 v54, 0x0

    .line 291
    .line 292
    const/16 v55, 0x0

    .line 293
    .line 294
    const/16 v56, 0x0

    .line 295
    .line 296
    const/16 v57, 0x0

    .line 297
    .line 298
    const/16 v58, 0x0

    .line 299
    .line 300
    const/16 v59, 0x0

    .line 301
    .line 302
    const/16 v60, 0x0

    .line 303
    .line 304
    const/16 v61, 0x0

    .line 305
    .line 306
    const/16 v62, 0x0

    .line 307
    .line 308
    const/16 v63, 0x0

    .line 309
    .line 310
    move-object/from16 v64, v1

    .line 311
    .line 312
    .line 313
    invoke-direct/range {v33 .. v66}, Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/CustomMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/MergedMessageInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 314
    .line 315
    new-instance v10, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 316
    .line 317
    sget-object v21, Lio/trtc/tuikit/atomicxcore/api/message/MessageType;->MERGED:Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getNeedReadReceipt()Z

    .line 321
    move-result v23

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getSupportExtension()Z

    .line 325
    move-result v25

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/message/MergedForwardInfo;->getOfflinePushInfo()Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 329
    move-result-object v31

    .line 330
    .line 331
    move-object/from16 v22, v33

    .line 332
    .line 333
    .line 334
    const v33, 0xfa3ff

    .line 335
    const/4 v11, 0x0

    .line 336
    const/4 v12, 0x0

    .line 337
    const/4 v13, 0x0

    .line 338
    const/4 v14, 0x0

    .line 339
    const/4 v15, 0x0

    .line 340
    .line 341
    const/16 v16, 0x0

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    const/16 v18, 0x0

    .line 346
    .line 347
    const/16 v19, 0x0

    .line 348
    .line 349
    const/16 v20, 0x0

    .line 350
    .line 351
    const/16 v24, 0x0

    .line 352
    .line 353
    const/16 v26, 0x0

    .line 354
    .line 355
    const/16 v27, 0x0

    .line 356
    .line 357
    const/16 v28, 0x0

    .line 358
    .line 359
    const/16 v29, 0x0

    .line 360
    .line 361
    const/16 v30, 0x0

    .line 362
    .line 363
    .line 364
    invoke-direct/range {v10 .. v34}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 365
    .line 366
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore$Companion;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v5}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore;

    .line 370
    move-result-object v0

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v10, v7}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInputStore;->sendMessage(Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 374
    return-void

    .line 375
    .line 376
    :cond_c
    :goto_1
    if-eqz v7, :cond_f

    .line 377
    .line 378
    const-string v0, "mergedForwardInfo and mergedForwardInfo.title cannot be empty when forwardType is MERGED"

    .line 379
    .line 380
    .line 381
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 382
    return-void

    .line 383
    .line 384
    :cond_d
    new-instance v9, Ljava/util/ArrayList;

    .line 385
    .line 386
    .line 387
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 391
    move-result-object v10

    .line 392
    const/4 v0, 0x0

    .line 393
    .line 394
    .line 395
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    move-result v1

    .line 397
    .line 398
    if-eqz v1, :cond_11

    .line 399
    .line 400
    add-int/lit8 v11, v0, 0x1

    .line 401
    .line 402
    .line 403
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    move-result-object v1

    .line 405
    .line 406
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 410
    move-result-object v2

    .line 411
    .line 412
    if-nez v2, :cond_e

    .line 413
    goto :goto_3

    .line 414
    .line 415
    .line 416
    :cond_e
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 417
    move-result-object v4

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4, v2}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->createForwardMessage(Lcom/tencent/imsdk/v2/V2TIMMessage;)Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 421
    move-result-object v34

    .line 422
    .line 423
    if-nez v34, :cond_10

    .line 424
    .line 425
    if-eqz v7, :cond_f

    .line 426
    .line 427
    const-string v0, "Failed to create forward message"

    .line 428
    .line 429
    .line 430
    invoke-interface {v7, v8, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 431
    :cond_f
    return-void

    .line 432
    .line 433
    :cond_10
    new-instance v12, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageType()Lio/trtc/tuikit/atomicxcore/api/message/MessageType;

    .line 437
    move-result-object v23

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getMessageBody()Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;

    .line 441
    move-result-object v24

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getNeedReadReceipt()Z

    .line 445
    move-result v25

    .line 446
    .line 447
    .line 448
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getSupportExtension()Z

    .line 449
    move-result v27

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getOfflinePushInfo()Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;

    .line 453
    move-result-object v33

    .line 454
    .line 455
    .line 456
    const v35, 0xfa3ff

    .line 457
    .line 458
    const/16 v36, 0x0

    .line 459
    const/4 v13, 0x0

    .line 460
    const/4 v14, 0x0

    .line 461
    const/4 v15, 0x0

    .line 462
    .line 463
    const/16 v16, 0x0

    .line 464
    .line 465
    const/16 v17, 0x0

    .line 466
    .line 467
    const/16 v18, 0x0

    .line 468
    .line 469
    const/16 v19, 0x0

    .line 470
    .line 471
    const/16 v20, 0x0

    .line 472
    .line 473
    const/16 v21, 0x0

    .line 474
    .line 475
    const/16 v22, 0x0

    .line 476
    .line 477
    const/16 v26, 0x0

    .line 478
    .line 479
    const/16 v28, 0x0

    .line 480
    .line 481
    const/16 v29, 0x0

    .line 482
    .line 483
    const/16 v30, 0x0

    .line 484
    .line 485
    const/16 v31, 0x0

    .line 486
    .line 487
    const/16 v32, 0x0

    .line 488
    .line 489
    .line 490
    invoke-direct/range {v12 .. v36}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/message/MessageSenderInfo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lio/trtc/tuikit/atomicxcore/api/message/MessageStatus;ILjava/util/List;ZLio/trtc/tuikit/atomicxcore/api/message/MessageType;Lio/trtc/tuikit/atomicxcore/api/message/MessageBody;ZLio/trtc/tuikit/atomicxcore/api/message/MessageReceipt;ZLjava/util/List;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;ILio/trtc/tuikit/atomicxcore/api/message/ReplyMessageInfo;Lio/trtc/tuikit/atomicxcore/api/message/OfflinePushInfo;Lcom/tencent/imsdk/v2/V2TIMMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 491
    int-to-long v0, v0

    .line 492
    .line 493
    const-wide/16 v13, 0x64

    .line 494
    .line 495
    mul-long v1, v0, v13

    .line 496
    .line 497
    iget-object v13, v3, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->d:Lkotlinx/coroutines/m0;

    .line 498
    .line 499
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/message/k0;

    .line 500
    const/4 v6, 0x0

    .line 501
    move-object v4, v12

    .line 502
    .line 503
    .line 504
    invoke-direct/range {v0 .. v6}, Lio/trtc/tuikit/atomicxcore/impl/message/k0;-><init>(JLio/trtc/tuikit/atomicxcore/impl/message/r0;Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 505
    .line 506
    const/16 v17, 0x3

    .line 507
    const/4 v14, 0x0

    .line 508
    const/4 v15, 0x0

    .line 509
    .line 510
    move-object/from16 v16, v0

    .line 511
    .line 512
    .line 513
    invoke-static/range {v13 .. v18}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 514
    move-result-object v0

    .line 515
    .line 516
    .line 517
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    :goto_3
    move-object/from16 v5, p3

    .line 520
    move v0, v11

    .line 521
    .line 522
    goto/16 :goto_2

    .line 523
    .line 524
    :cond_11
    iget-object v12, v3, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->d:Lkotlinx/coroutines/m0;

    .line 525
    .line 526
    new-instance v15, Lio/trtc/tuikit/atomicxcore/impl/message/j0;

    .line 527
    const/4 v0, 0x0

    .line 528
    .line 529
    .line 530
    invoke-direct {v15, v9, v7, v0}, Lio/trtc/tuikit/atomicxcore/impl/message/j0;-><init>(Ljava/util/ArrayList;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 531
    .line 532
    const/16 v16, 0x3

    .line 533
    .line 534
    const/16 v17, 0x0

    .line 535
    const/4 v13, 0x0

    .line 536
    const/4 v14, 0x0

    .line 537
    .line 538
    .line 539
    invoke-static/range {v12 .. v17}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 540
    return-void
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
.end method

.method public final getConversationID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->a:Ljava/lang/String;

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

.method public final getMessageEventFlow()Lkotlinx/coroutines/flow/r;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->j:Lkotlinx/coroutines/flow/r;

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

.method public final getMessageListState()Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->k:Lio/trtc/tuikit/atomicxcore/api/message/MessageListState;

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

.method public final getMessageListType()Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/message/r0;->b:Lio/trtc/tuikit/atomicxcore/api/message/MessageListType;

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

.method public final sendMessageReadReceipts(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "messageList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    const/16 v1, 0x1781

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    const-string p1, "messageList cannot be empty"

    .line 18
    .line 19
    .line 20
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/message/MessageInfo;->getRawMessage()Lcom/tencent/imsdk/v2/V2TIMMessage;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const-string p1, "MessageInfo.rawMessage cannot be null"

    .line 53
    .line 54
    .line 55
    invoke-interface {p2, v1, p1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 56
    :cond_1
    return-void

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    goto :goto_0

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    .line 64
    move-result-object p1

    .line 65
    .line 66
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/message/p0;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/message/p0;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0, v1}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->sendMessageReadReceipts(Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 73
    return-void
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
.end method
