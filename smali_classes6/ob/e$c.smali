.class public final Lob/e$c;
.super Ljava/lang/Object;
.source "MessageBuilder.kt"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lob/e;->f(Lcom/kubi/chat/entity/ChatMessage;[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/kubi/chat/entity/UploadImage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\u000c\u001a\u00020\u00072\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "ob/e$c",
        "Lretrofit2/Callback;",
        "Lcom/kubi/chat/entity/UploadImage;",
        "Lretrofit2/Call;",
        "call",
        "Lretrofit2/Response;",
        "response",
        "",
        "onResponse",
        "(Lretrofit2/Call;Lretrofit2/Response;)V",
        "",
        "t",
        "onFailure",
        "(Lretrofit2/Call;Ljava/lang/Throwable;)V",
        "ImSDK_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/chat/entity/ChatMessage;


# direct methods
.method public constructor <init>(Lcom/kubi/chat/entity/ChatMessage;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lob/e$c;->b:Lcom/kubi/chat/entity/ChatMessage;

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
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Lretrofit2/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/kubi/chat/entity/UploadImage;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "call"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "t"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object p1, p0, Lob/e$c;->b:Lcom/kubi/chat/entity/ChatMessage;

    .line 13
    .line 14
    const-string v0, "Upload picture failed please retry."

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/kubi/chat/entity/ChatMessage;->setFailedInfo(Ljava/lang/String;)V

    .line 18
    .line 19
    sget-object p1, Lcom/kubi/chat/service/ChatClient;->d:Lcom/kubi/chat/service/ChatClient$Companion;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/chat/service/ChatClient$Companion;->get()Lcom/kubi/chat/service/ChatClient;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lob/e$c;->b:Lcom/kubi/chat/entity/ChatMessage;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/kubi/chat/service/ChatClient;->h(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 32
    .line 33
    :goto_0
    instance-of p1, p2, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    move-object p1, p2

    .line 37
    .line 38
    check-cast p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 41
    .line 42
    const-string v0, "t.code"

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    const-string v0, "uploadPic"

    .line 52
    const/4 v1, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, p1, p2}, Lub/a;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 56
    :cond_1
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 6
    .param p1    # Lretrofit2/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lretrofit2/Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/kubi/chat/entity/UploadImage;",
            ">;",
            "Lretrofit2/Response<",
            "Lcom/kubi/chat/entity/UploadImage;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "call"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "response"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object p1, p0, Lob/e$c;->b:Lcom/kubi/chat/entity/ChatMessage;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/chat/entity/ChatMessage;->getDataPro()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iget-object v0, p0, Lob/e$c;->b:Lcom/kubi/chat/entity/ChatMessage;

    .line 19
    .line 20
    sget-object v1, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->b:Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl$Companion;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    const-string v2, "this.toBuilder()"

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    check-cast p1, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl$Companion;->_create(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;)Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/chat/entity/ChatMessage;->getDataPro()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;->getMessage()Lcom/kubi/chat/proto/ImProtocol$Message;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    const-string v1, "chatMessage.getDataPro().message"

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    sget-object v1, Lcom/kubi/chat/proto/MessageKt$Dsl;->b:Lcom/kubi/chat/proto/MessageKt$Dsl$Companion;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    check-cast v0, Lcom/kubi/chat/proto/ImProtocol$Message$a;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Lcom/kubi/chat/proto/MessageKt$Dsl$Companion;->_create(Lcom/kubi/chat/proto/ImProtocol$Message$a;)Lcom/kubi/chat/proto/MessageKt$Dsl;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    check-cast p2, Lcom/kubi/chat/entity/UploadImage;

    .line 70
    .line 71
    if-nez p2, :cond_0

    .line 72
    const/4 p2, 0x0

    .line 73
    goto :goto_0

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/chat/entity/UploadImage;->getImgUrl()Ljava/lang/String;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-static {p2}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p2}, Lcom/kubi/chat/proto/MessageKt$Dsl;->b(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/kubi/chat/proto/MessageKt$Dsl;->a()Lcom/kubi/chat/proto/ImProtocol$Message;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->d(Lcom/kubi/chat/proto/ImProtocol$Message;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;->a()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    new-instance p2, Lcom/kubi/chat/entity/ChatMessage;

    .line 98
    .line 99
    .line 100
    invoke-direct {p2, p1}, Lcom/kubi/chat/entity/ChatMessage;-><init>(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;)V

    .line 101
    .line 102
    sget-object p1, Lcom/kubi/chat/service/ChatClient;->d:Lcom/kubi/chat/service/ChatClient$Companion;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/kubi/chat/service/ChatClient$Companion;->get()Lcom/kubi/chat/service/ChatClient;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    if-nez p1, :cond_1

    .line 109
    goto :goto_1

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-virtual {p1, p2}, Lcom/kubi/chat/service/ChatClient;->k(Lcom/kubi/chat/entity/ChatMessage;)V

    .line 113
    .line 114
    :goto_1
    const/16 v4, 0xe

    .line 115
    const/4 v5, 0x0

    .line 116
    .line 117
    const-string v0, "uploadPic"

    .line 118
    const/4 v1, 0x0

    .line 119
    const/4 v2, 0x0

    .line 120
    const/4 v3, 0x0

    .line 121
    .line 122
    .line 123
    invoke-static/range {v0 .. v5}, Lub/a;->b(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 124
    return-void
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
.end method
