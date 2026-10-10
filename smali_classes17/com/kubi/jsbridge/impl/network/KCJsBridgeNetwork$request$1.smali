.class final Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "KCJsBridgeNetwork.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;->b(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$request$1"
    f = "KCJsBridgeNetwork.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x99,
        0x9a,
        0x9b
    }
    m = "invokeSuspend"
    n = {
        "params",
        "reqHeaders",
        "reqUrl",
        "params",
        "reqHeaders",
        "reqUrl",
        "params",
        "reqHeaders",
        "reqUrl"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $method:Ljava/lang/String;

.field final synthetic $source:Ljava/lang/String;

.field final synthetic $url:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/lang/String;Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;-",
            "Lcom/kubi/sdk/protocol/ProtocolException;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$data:Ljava/util/Map;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$source:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$headers:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$url:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$method:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 15
    const/4 p1, 0x2

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$data:Ljava/util/Map;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$source:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$headers:Ljava/util/Map;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$url:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$method:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v7, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 17
    move-object v8, p2

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v0 .. v8}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;-><init>(Ljava/util/Map;Ljava/lang/String;Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    .line 21
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->label:I

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_0

    .line 14
    .line 15
    if-eq v1, v3, :cond_0

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/Map;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    move-object v11, p0

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    throw p1

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    iget-object p1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$data:Ljava/util/Map;

    .line 49
    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    :cond_3
    iget-object v1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$source:Ljava/lang/String;

    .line 57
    .line 58
    const-string v5, "rn"

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    iget-object v1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;

    .line 67
    .line 68
    .line 69
    invoke-static {v1, p1}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;->u(Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;Ljava/util/Map;)Ljava/util/Map;

    .line 70
    move-result-object p1

    .line 71
    :cond_4
    move-object v8, p1

    .line 72
    .line 73
    iget-object p1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;

    .line 74
    .line 75
    iget-object v1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$headers:Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v1}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;->m(Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;Ljava/util/Map;)Ljava/util/Map;

    .line 79
    move-result-object v9

    .line 80
    .line 81
    iget-object p1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;

    .line 82
    .line 83
    iget-object v1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$url:Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v1}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    move-result-object v6

    .line 88
    .line 89
    iget-object p1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$method:Ljava/lang/String;

    .line 90
    .line 91
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    const-string v1, "toUpperCase(...)"

    .line 98
    .line 99
    .line 100
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 104
    move-result v1

    .line 105
    .line 106
    .line 107
    const v5, 0x11336

    .line 108
    .line 109
    if-eq v1, v5, :cond_9

    .line 110
    .line 111
    .line 112
    const v4, 0x2590a0

    .line 113
    .line 114
    if-eq v1, v4, :cond_7

    .line 115
    .line 116
    .line 117
    const v3, 0x77f979ab

    .line 118
    .line 119
    if-eq v1, v3, :cond_5

    .line 120
    :goto_0
    move-object v11, p0

    .line 121
    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :cond_5
    const-string v1, "DELETE"

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    move-result p1

    .line 129
    .line 130
    if-nez p1, :cond_6

    .line 131
    goto :goto_0

    .line 132
    .line 133
    :cond_6
    iget-object v5, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 137
    move-result-object v7

    .line 138
    .line 139
    iget-object v10, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 140
    .line 141
    .line 142
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    iput-object p1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$0:Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    iput-object p1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$1:Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    iput-object p1, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$2:Ljava/lang/Object;

    .line 158
    .line 159
    iput v2, p0, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->label:I

    .line 160
    move-object v11, p0

    .line 161
    .line 162
    .line 163
    invoke-static/range {v5 .. v11}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;->v(Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    if-ne p1, v0, :cond_b

    .line 167
    goto :goto_1

    .line 168
    :cond_7
    move-object v11, p0

    .line 169
    .line 170
    const-string v1, "POST"

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    move-result p1

    .line 175
    .line 176
    if-nez p1, :cond_8

    .line 177
    goto :goto_2

    .line 178
    .line 179
    :cond_8
    iget-object v5, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;

    .line 180
    .line 181
    .line 182
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 183
    move-result-object v7

    .line 184
    .line 185
    iget-object v10, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 186
    .line 187
    .line 188
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    move-result-object p1

    .line 190
    .line 191
    iput-object p1, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$0:Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    move-result-object p1

    .line 196
    .line 197
    iput-object p1, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$1:Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    move-result-object p1

    .line 202
    .line 203
    iput-object p1, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$2:Ljava/lang/Object;

    .line 204
    .line 205
    iput v3, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->label:I

    .line 206
    .line 207
    .line 208
    invoke-static/range {v5 .. v11}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;->x(Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 209
    move-result-object p1

    .line 210
    .line 211
    if-ne p1, v0, :cond_b

    .line 212
    goto :goto_1

    .line 213
    :cond_9
    move-object v11, p0

    .line 214
    .line 215
    const-string v1, "GET"

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    move-result p1

    .line 220
    .line 221
    if-eqz p1, :cond_a

    .line 222
    .line 223
    iget-object v5, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->this$0:Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;

    .line 224
    move-object v7, v8

    .line 225
    move-object v8, v9

    .line 226
    .line 227
    iget-object v9, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 228
    .line 229
    .line 230
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    move-result-object p1

    .line 232
    .line 233
    iput-object p1, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$0:Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    move-result-object p1

    .line 238
    .line 239
    iput-object p1, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$1:Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    move-result-object p1

    .line 244
    .line 245
    iput-object p1, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->L$2:Ljava/lang/Object;

    .line 246
    .line 247
    iput v4, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->label:I

    .line 248
    move-object v10, v11

    .line 249
    .line 250
    .line 251
    invoke-static/range {v5 .. v10}, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;->w(Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 252
    move-result-object p1

    .line 253
    .line 254
    if-ne p1, v0, :cond_b

    .line 255
    :goto_1
    return-object v0

    .line 256
    .line 257
    :cond_a
    :goto_2
    iget-object p1, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$callback:Lkotlin/jvm/functions/Function2;

    .line 258
    .line 259
    new-instance v0, Lcom/kubi/sdk/protocol/ProtocolException;

    .line 260
    .line 261
    new-instance v1, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .line 266
    iget-object v2, v11, Lcom/kubi/jsbridge/impl/network/KCJsBridgeNetwork$request$1;->$method:Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string v2, " is not supported"

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    move-result-object v3

    .line 279
    .line 280
    const/16 v5, 0xa

    .line 281
    const/4 v6, 0x0

    .line 282
    .line 283
    const-string v1, "-9001"

    .line 284
    const/4 v2, 0x0

    .line 285
    const/4 v4, 0x0

    .line 286
    .line 287
    .line 288
    invoke-direct/range {v0 .. v6}, Lcom/kubi/sdk/protocol/ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 289
    const/4 v1, 0x0

    .line 290
    .line 291
    .line 292
    invoke-interface {p1, v1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    :cond_b
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 295
    return-object p1
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
.end method
