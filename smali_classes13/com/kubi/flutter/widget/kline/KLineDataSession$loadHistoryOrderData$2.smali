.class final Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "KLineDataSession.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/flutter/widget/kline/KLineDataSession;->p(Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/kubi/flutter/proto/kline/Response;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/kubi/flutter/proto/kline/Response;",
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
    c = "com.kubi.flutter.widget.kline.KLineDataSession$loadHistoryOrderData$2"
    f = "KLineDataSession.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x149,
        0xfb,
        0xfd
    }
    m = "invokeSuspend"
    n = {
        "$this$withLock_u24default$iv",
        "previousTime",
        "$i$f$withLock",
        "$this$withLock_u24default$iv",
        "previousTime",
        "$i$f$withLock",
        "$i$a$-withLock$default-KLineDataSession$loadHistoryOrderData$2$1",
        "$this$withLock_u24default$iv",
        "list",
        "realList",
        "previousTime",
        "$i$f$withLock",
        "$i$a$-withLock$default-KLineDataSession$loadHistoryOrderData$2$1"
    }
    s = {
        "L$0",
        "J$0",
        "I$0",
        "L$0",
        "J$0",
        "I$0",
        "I$1",
        "L$0",
        "L$3",
        "L$4",
        "J$0",
        "I$0",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKLineDataSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2\n+ 2 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,322:1\n8#2:323\n116#3,8:324\n125#3,2:348\n8#4:332\n8#4:334\n8#4:336\n8#4:338\n8#4:345\n1#5:333\n1#5:335\n1#5:337\n1#5:339\n1#5:340\n1#5:346\n1#5:347\n45#6,4:341\n*S KotlinDebug\n*F\n+ 1 KLineDataSession.kt\ncom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2\n*L\n228#1:323\n241#1:324,8\n241#1:348,2\n245#1:332\n256#1:334\n259#1:336\n263#1:338\n270#1:345\n245#1:333\n256#1:335\n259#1:337\n263#1:339\n270#1:346\n269#1:341,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $firstTime:J

.field final synthetic $orderParam:Lcom/kubi/flutter/widget/kline/c$b;

.field I$0:I

.field I$1:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;


# direct methods
.method public constructor <init>(JLcom/kubi/flutter/widget/kline/KLineDataSession;Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/kubi/flutter/widget/kline/KLineDataSession;",
            "Lcom/kubi/flutter/widget/kline/c$b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$firstTime:J

    .line 3
    .line 4
    iput-object p3, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 7
    const/4 p1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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
    new-instance v0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;

    .line 3
    .line 4
    iget-wide v1, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$firstTime:J

    .line 5
    .line 6
    iget-object v3, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 9
    move-object v5, p2

    .line 10
    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;-><init>(JLcom/kubi/flutter/widget/kline/KLineDataSession;Lcom/kubi/flutter/widget/kline/c$b;Lkotlin/coroutines/Continuation;)V

    .line 13
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/kubi/flutter/proto/kline/Response;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->label:I

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    const-string v5, ",previousTime="

    .line 12
    .line 13
    const-string v6, ",savedTime="

    .line 14
    const/4 v7, 0x3

    .line 15
    const/4 v8, 0x1

    .line 16
    .line 17
    const-string v9, "loadBS,symbol="

    .line 18
    .line 19
    const-string v10, ",type="

    .line 20
    const/4 v11, 0x2

    .line 21
    .line 22
    const-string v12, "newBuilder(...)"

    .line 23
    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    if-eq v2, v8, :cond_2

    .line 27
    .line 28
    if-eq v2, v11, :cond_1

    .line 29
    .line 30
    if-ne v2, v7, :cond_0

    .line 31
    .line 32
    iget-wide v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->J$0:J

    .line 33
    .line 34
    iget-object v0, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$4:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 37
    .line 38
    iget-object v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$3:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 41
    .line 42
    iget-object v4, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Lcom/kubi/flutter/widget/kline/c$b;

    .line 45
    .line 46
    iget-object v9, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v9, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 49
    .line 50
    iget-object v14, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v14, Lrg0/a;

    .line 53
    .line 54
    .line 55
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_a
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    goto/16 :goto_8

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    :goto_0
    const/4 v7, 0x0

    .line 60
    .line 61
    goto/16 :goto_f

    .line 62
    :catch_0
    move-exception v0

    .line 63
    :goto_1
    const/4 v7, 0x0

    .line 64
    .line 65
    goto/16 :goto_b

    .line 66
    :catch_1
    move-exception v0

    .line 67
    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    throw v0

    .line 77
    .line 78
    :cond_1
    iget v4, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->I$1:I

    .line 79
    .line 80
    iget v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->I$0:I

    .line 81
    .line 82
    iget-wide v8, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->J$0:J

    .line 83
    .line 84
    iget-object v14, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$2:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v14, Lcom/kubi/flutter/widget/kline/c$b;

    .line 87
    .line 88
    iget-object v15, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v15, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 91
    .line 92
    iget-object v3, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v3, Lrg0/a;

    .line 95
    .line 96
    .line 97
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    move-wide v7, v8

    .line 99
    move v9, v4

    .line 100
    .line 101
    move-object/from16 v4, p1

    .line 102
    .line 103
    goto/16 :goto_6

    .line 104
    :catchall_1
    move-exception v0

    .line 105
    move-object v14, v3

    .line 106
    goto :goto_0

    .line 107
    :catch_2
    move-exception v0

    .line 108
    move-object v14, v3

    .line 109
    goto :goto_1

    .line 110
    :catch_3
    move-exception v0

    .line 111
    move-object v14, v3

    .line 112
    .line 113
    goto/16 :goto_c

    .line 114
    :catch_4
    move-object v14, v3

    .line 115
    .line 116
    goto/16 :goto_d

    .line 117
    .line 118
    :cond_2
    iget v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->I$0:I

    .line 119
    .line 120
    iget-wide v14, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->J$0:J

    .line 121
    .line 122
    iget-object v3, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$2:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, Lcom/kubi/flutter/widget/kline/c$b;

    .line 125
    .line 126
    iget-object v8, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$1:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v8, Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 129
    .line 130
    iget-object v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v7, Lrg0/a;

    .line 133
    .line 134
    .line 135
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 136
    .line 137
    goto/16 :goto_4

    .line 138
    .line 139
    .line 140
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 141
    .line 142
    iget-wide v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$firstTime:J

    .line 143
    .line 144
    const-wide/16 v14, -0x1

    .line 145
    .line 146
    cmp-long v2, v2, v14

    .line 147
    .line 148
    if-nez v2, :cond_5

    .line 149
    .line 150
    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 152
    move-result-wide v2

    .line 153
    .line 154
    const/16 v7, 0x3e8

    .line 155
    int-to-long v14, v7

    .line 156
    div-long/2addr v2, v14

    .line 157
    .line 158
    iget-object v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 159
    .line 160
    .line 161
    invoke-static {v7}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->d(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lcom/kubi/flutter/widget/kline/c$a;

    .line 162
    move-result-object v7

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 166
    move-result-object v7

    .line 167
    .line 168
    .line 169
    invoke-static {v7, v2, v3}, Lcom/kubi/flutter/widget/kline/p;->c(Lcom/kubi/flutter/widget/kline/KLineType;J)Lcom/kubi/flutter/widget/kline/d;

    .line 170
    move-result-object v7

    .line 171
    .line 172
    iget-object v14, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 173
    .line 174
    .line 175
    invoke-static {v14}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->d(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lcom/kubi/flutter/widget/kline/c$a;

    .line 176
    move-result-object v14

    .line 177
    .line 178
    .line 179
    invoke-virtual {v14}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 180
    move-result-object v14

    .line 181
    .line 182
    .line 183
    invoke-static {v14, v2, v3}, Lcom/kubi/flutter/widget/kline/p;->a(Lcom/kubi/flutter/widget/kline/KLineType;J)J

    .line 184
    move-result-wide v14

    .line 185
    .line 186
    sget-object v11, Lcom/kubi/flutter/widget/kline/utils/g;->a:Lcom/kubi/flutter/widget/kline/utils/g;

    .line 187
    .line 188
    new-instance v13, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    iget-object v8, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8}, Lcom/kubi/flutter/widget/kline/c$b;->f()Ljava/lang/String;

    .line 200
    move-result-object v8

    .line 201
    .line 202
    .line 203
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    iget-object v8, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8}, Lcom/kubi/flutter/widget/kline/c$b;->h()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 212
    move-result-object v8

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 216
    move-result-object v8

    .line 217
    .line 218
    .line 219
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v8, ",cdnCandleCount="

    .line 222
    .line 223
    .line 224
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v13, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v8, ",cdnRange="

    .line 230
    .line 231
    .line 232
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    move-result-object v8

    .line 240
    .line 241
    .line 242
    invoke-virtual {v11, v8}, Lcom/kubi/flutter/widget/kline/utils/g;->a(Ljava/lang/String;)V

    .line 243
    .line 244
    const-wide/16 v17, 0x64

    .line 245
    .line 246
    cmp-long v8, v14, v17

    .line 247
    .line 248
    if-gez v8, :cond_4

    .line 249
    .line 250
    iget-object v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 251
    .line 252
    .line 253
    invoke-static {v7}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->d(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lcom/kubi/flutter/widget/kline/c$a;

    .line 254
    move-result-object v7

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 258
    move-result-object v7

    .line 259
    .line 260
    .line 261
    invoke-static {v7, v2, v3}, Lcom/kubi/flutter/widget/kline/p;->b(Lcom/kubi/flutter/widget/kline/KLineType;J)J

    .line 262
    move-result-wide v2

    .line 263
    :goto_2
    move-wide v14, v2

    .line 264
    goto :goto_3

    .line 265
    .line 266
    .line 267
    :cond_4
    invoke-virtual {v7}, Lcom/kubi/flutter/widget/kline/d;->a()J

    .line 268
    move-result-wide v2

    .line 269
    goto :goto_2

    .line 270
    .line 271
    :cond_5
    iget-object v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 272
    .line 273
    .line 274
    invoke-static {v2}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->d(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lcom/kubi/flutter/widget/kline/c$a;

    .line 275
    move-result-object v2

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Lcom/kubi/flutter/widget/kline/c$a;->c()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 279
    move-result-object v2

    .line 280
    .line 281
    iget-wide v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$firstTime:J

    .line 282
    .line 283
    .line 284
    invoke-static {v2, v7, v8}, Lcom/kubi/flutter/widget/kline/p;->b(Lcom/kubi/flutter/widget/kline/KLineType;J)J

    .line 285
    move-result-wide v2

    .line 286
    goto :goto_2

    .line 287
    .line 288
    :goto_3
    sget-object v2, Lcom/kubi/flutter/widget/kline/utils/g;->a:Lcom/kubi/flutter/widget/kline/utils/g;

    .line 289
    .line 290
    new-instance v3, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    iget-object v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v7}, Lcom/kubi/flutter/widget/kline/c$b;->f()Ljava/lang/String;

    .line 302
    move-result-object v7

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    iget-object v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v7}, Lcom/kubi/flutter/widget/kline/c$b;->h()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 314
    move-result-object v7

    .line 315
    .line 316
    .line 317
    invoke-virtual {v7}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 318
    move-result-object v7

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    iget-object v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 327
    .line 328
    .line 329
    invoke-static {v7}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->h(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Ljava/util/concurrent/atomic/AtomicLong;

    .line 330
    move-result-object v7

    .line 331
    .line 332
    .line 333
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 334
    move-result-wide v7

    .line 335
    .line 336
    .line 337
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    move-result-object v3

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v3}, Lcom/kubi/flutter/widget/kline/utils/g;->a(Ljava/lang/String;)V

    .line 351
    .line 352
    iget-object v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 353
    .line 354
    .line 355
    invoke-static {v2}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->e(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lrg0/a;

    .line 356
    move-result-object v2

    .line 357
    .line 358
    iget-object v8, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->this$0:Lcom/kubi/flutter/widget/kline/KLineDataSession;

    .line 359
    .line 360
    iget-object v3, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->$orderParam:Lcom/kubi/flutter/widget/kline/c$b;

    .line 361
    .line 362
    iput-object v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$0:Ljava/lang/Object;

    .line 363
    .line 364
    iput-object v8, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$1:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v3, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$2:Ljava/lang/Object;

    .line 367
    .line 368
    iput-wide v14, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->J$0:J

    .line 369
    .line 370
    iput v4, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->I$0:I

    .line 371
    const/4 v7, 0x1

    .line 372
    .line 373
    iput v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->label:I

    .line 374
    const/4 v7, 0x0

    .line 375
    .line 376
    .line 377
    invoke-interface {v2, v7, v1}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 378
    move-result-object v11

    .line 379
    .line 380
    if-ne v11, v0, :cond_6

    .line 381
    .line 382
    goto/16 :goto_7

    .line 383
    :cond_6
    move-object v7, v2

    .line 384
    move v2, v4

    .line 385
    .line 386
    .line 387
    :goto_4
    :try_start_2
    invoke-static {v8}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->h(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Ljava/util/concurrent/atomic/AtomicLong;

    .line 388
    move-result-object v11

    .line 389
    .line 390
    .line 391
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 392
    move-result-wide v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 393
    .line 394
    cmp-long v11, v16, v14

    .line 395
    .line 396
    const-string v13, "KLineDataSession"

    .line 397
    .line 398
    if-nez v11, :cond_7

    .line 399
    .line 400
    :try_start_3
    sget-object v11, Lcom/kubi/flutter/widget/kline/utils/g;->a:Lcom/kubi/flutter/widget/kline/utils/g;

    .line 401
    .line 402
    new-instance v4, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v3}, Lcom/kubi/flutter/widget/kline/c$b;->f()Ljava/lang/String;

    .line 412
    move-result-object v9

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3}, Lcom/kubi/flutter/widget/kline/c$b;->h()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 422
    move-result-object v9

    .line 423
    .line 424
    .line 425
    invoke-virtual {v9}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 426
    move-result-object v9

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    const-string v9, ",savedOrderPreviousTime=previousTime"

    .line 432
    .line 433
    .line 434
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 438
    move-result-object v4

    .line 439
    .line 440
    .line 441
    invoke-virtual {v11, v4}, Lcom/kubi/flutter/widget/kline/utils/g;->a(Ljava/lang/String;)V

    .line 442
    .line 443
    new-instance v4, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 447
    .line 448
    const-string v9, "loadHistoryOrderData error sametime: "

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v4, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    move-result-object v4

    .line 459
    .line 460
    .line 461
    invoke-static {v13, v4}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    .line 463
    sget-object v4, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 464
    .line 465
    .line 466
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 467
    move-result-object v9

    .line 468
    .line 469
    .line 470
    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v4, v9}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 474
    move-result-object v4

    .line 475
    .line 476
    const/16 v9, 0x191

    .line 477
    .line 478
    .line 479
    invoke-virtual {v4, v9}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b(I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v4}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 483
    goto :goto_5

    .line 484
    :catchall_2
    move-exception v0

    .line 485
    move-object v14, v7

    .line 486
    .line 487
    goto/16 :goto_0

    .line 488
    .line 489
    :cond_7
    :goto_5
    :try_start_4
    const-string v4, "loadHistoryOrderData"

    .line 490
    .line 491
    .line 492
    invoke-static {v13, v4}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    invoke-static {v8}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->f(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lcom/kubi/flutter/widget/kline/c;

    .line 496
    move-result-object v4

    .line 497
    .line 498
    iput-object v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$0:Ljava/lang/Object;

    .line 499
    .line 500
    iput-object v8, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$1:Ljava/lang/Object;

    .line 501
    .line 502
    iput-object v3, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$2:Ljava/lang/Object;

    .line 503
    .line 504
    iput-wide v14, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->J$0:J

    .line 505
    .line 506
    iput v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->I$0:I

    .line 507
    const/4 v9, 0x0

    .line 508
    .line 509
    iput v9, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->I$1:I

    .line 510
    const/4 v11, 0x2

    .line 511
    .line 512
    iput v11, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->label:I

    .line 513
    .line 514
    .line 515
    invoke-interface {v4, v3, v14, v15, v1}, Lcom/kubi/flutter/widget/kline/c;->d(Lcom/kubi/flutter/widget/kline/c$b;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 516
    move-result-object v4
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 517
    .line 518
    if-ne v4, v0, :cond_8

    .line 519
    goto :goto_7

    .line 520
    .line 521
    :cond_8
    move-wide/from16 v19, v14

    .line 522
    move-object v14, v3

    .line 523
    move-object v3, v7

    .line 524
    move-object v15, v8

    .line 525
    .line 526
    move-wide/from16 v7, v19

    .line 527
    .line 528
    :goto_6
    :try_start_5
    check-cast v4, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 529
    .line 530
    sget-object v11, Lcom/kubi/flutter/widget/kline/n;->a:Lcom/kubi/flutter/widget/kline/n;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v11, v14, v4}, Lcom/kubi/flutter/widget/kline/n;->b(Lcom/kubi/flutter/widget/kline/c$b;Lcom/kubi/flutter/proto/kline/OrderList;)Lcom/kubi/flutter/proto/kline/OrderList;

    .line 534
    move-result-object v11

    .line 535
    .line 536
    .line 537
    invoke-static {v15}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->b(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Lcom/kubi/flutter/widget/kline/a;

    .line 538
    move-result-object v13

    .line 539
    .line 540
    iput-object v3, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$0:Ljava/lang/Object;

    .line 541
    .line 542
    iput-object v15, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$1:Ljava/lang/Object;

    .line 543
    .line 544
    iput-object v14, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$2:Ljava/lang/Object;

    .line 545
    .line 546
    iput-object v4, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$3:Ljava/lang/Object;

    .line 547
    .line 548
    iput-object v11, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->L$4:Ljava/lang/Object;

    .line 549
    .line 550
    iput-wide v7, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->J$0:J

    .line 551
    .line 552
    iput v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->I$0:I

    .line 553
    .line 554
    iput v9, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->I$1:I

    .line 555
    const/4 v2, 0x3

    .line 556
    .line 557
    iput v2, v1, Lcom/kubi/flutter/widget/kline/KLineDataSession$loadHistoryOrderData$2;->label:I

    .line 558
    .line 559
    .line 560
    invoke-interface {v13, v11, v1}, Lcom/kubi/flutter/widget/kline/a;->a(Lcom/kubi/flutter/proto/kline/OrderList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 561
    move-result-object v2
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 562
    .line 563
    if-ne v2, v0, :cond_9

    .line 564
    :goto_7
    return-object v0

    .line 565
    :cond_9
    move-object v2, v4

    .line 566
    move-object v0, v11

    .line 567
    move-object v4, v14

    .line 568
    move-object v9, v15

    .line 569
    move-object v14, v3

    .line 570
    .line 571
    :goto_8
    :try_start_6
    sget-object v3, Lcom/kubi/flutter/widget/kline/utils/g;->a:Lcom/kubi/flutter/widget/kline/utils/g;

    .line 572
    .line 573
    new-instance v11, Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 577
    .line 578
    const-string v13, "loadBS_set_savedTime,symbol="

    .line 579
    .line 580
    .line 581
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v4}, Lcom/kubi/flutter/widget/kline/c$b;->f()Ljava/lang/String;

    .line 585
    move-result-object v13

    .line 586
    .line 587
    .line 588
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4}, Lcom/kubi/flutter/widget/kline/c$b;->h()Lcom/kubi/flutter/widget/kline/KLineType;

    .line 595
    move-result-object v4

    .line 596
    .line 597
    .line 598
    invoke-virtual {v4}, Lcom/kubi/flutter/widget/kline/KLineType;->r()Ljava/lang/String;

    .line 599
    move-result-object v4

    .line 600
    .line 601
    .line 602
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-static {v9}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->h(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Ljava/util/concurrent/atomic/AtomicLong;

    .line 609
    move-result-object v4

    .line 610
    .line 611
    move-object/from16 p1, v0

    .line 612
    .line 613
    .line 614
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 615
    move-result-wide v0

    .line 616
    .line 617
    .line 618
    invoke-virtual {v11, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v11, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    const-string v0, ", sendFlutter:"

    .line 627
    .line 628
    .line 629
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2}, Lcom/kubi/flutter/proto/kline/OrderList;->getItemsCount()I

    .line 633
    move-result v0

    .line 634
    .line 635
    .line 636
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    const-string v0, "(api),"

    .line 639
    .line 640
    .line 641
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/flutter/proto/kline/OrderList;->getItemsCount()I

    .line 645
    move-result v0

    .line 646
    .line 647
    .line 648
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    const-string v0, "(cached)"

    .line 651
    .line 652
    .line 653
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 657
    move-result-object v0

    .line 658
    .line 659
    .line 660
    invoke-virtual {v3, v0}, Lcom/kubi/flutter/widget/kline/utils/g;->a(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    invoke-static {v9}, Lcom/kubi/flutter/widget/kline/KLineDataSession;->h(Lcom/kubi/flutter/widget/kline/KLineDataSession;)Ljava/util/concurrent/atomic/AtomicLong;

    .line 664
    move-result-object v0

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 668
    .line 669
    sget-object v0, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 670
    .line 671
    .line 672
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 673
    move-result-object v1

    .line 674
    .line 675
    .line 676
    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 680
    move-result-object v0

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 684
    move-result-object v0
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_a
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 685
    :goto_9
    const/4 v7, 0x0

    .line 686
    .line 687
    goto/16 :goto_e

    .line 688
    :catch_5
    move-exception v0

    .line 689
    :goto_a
    const/4 v7, 0x0

    .line 690
    const/4 v11, 0x2

    .line 691
    goto :goto_b

    .line 692
    :catch_6
    move-exception v0

    .line 693
    move-object v14, v3

    .line 694
    goto :goto_a

    .line 695
    :catch_7
    move-exception v0

    .line 696
    move-object v14, v7

    .line 697
    goto :goto_a

    .line 698
    :catch_8
    move-exception v0

    .line 699
    move-object v14, v7

    .line 700
    goto :goto_c

    .line 701
    :catch_9
    move-object v14, v7

    .line 702
    goto :goto_d

    .line 703
    .line 704
    .line 705
    :goto_b
    :try_start_7
    invoke-static {v0, v7, v11, v7}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 706
    .line 707
    const-string v1, "loadHistoryOrderData error"

    .line 708
    .line 709
    .line 710
    invoke-static {v0}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 711
    move-result v2

    .line 712
    .line 713
    if-nez v2, :cond_a

    .line 714
    .line 715
    .line 716
    invoke-static {v0, v1}, Log/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 717
    .line 718
    :cond_a
    sget-object v1, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 719
    .line 720
    .line 721
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 722
    move-result-object v2

    .line 723
    .line 724
    .line 725
    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v1, v2}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 729
    move-result-object v1

    .line 730
    .line 731
    const/16 v2, 0x1f4

    .line 732
    .line 733
    .line 734
    invoke-virtual {v1, v2}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b(I)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 738
    move-result-object v0

    .line 739
    .line 740
    if-eqz v0, :cond_b

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->c(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    :cond_b
    invoke-virtual {v1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 747
    move-result-object v0

    .line 748
    goto :goto_9

    .line 749
    .line 750
    .line 751
    :goto_c
    invoke-virtual {v0}, Ljava/lang/reflect/UndeclaredThrowableException;->getUndeclaredThrowable()Ljava/lang/Throwable;

    .line 752
    move-result-object v1

    .line 753
    const/4 v7, 0x0

    .line 754
    const/4 v11, 0x2

    .line 755
    .line 756
    .line 757
    invoke-static {v0, v7, v11, v7}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 758
    .line 759
    sget-object v0, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 760
    .line 761
    .line 762
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 763
    move-result-object v2

    .line 764
    .line 765
    .line 766
    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v0, v2}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 770
    move-result-object v0

    .line 771
    .line 772
    const/16 v2, 0x1f4

    .line 773
    .line 774
    .line 775
    invoke-virtual {v0, v2}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b(I)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 779
    move-result-object v1

    .line 780
    .line 781
    if-eqz v1, :cond_c

    .line 782
    .line 783
    .line 784
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->c(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    :cond_c
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 788
    move-result-object v0

    .line 789
    goto :goto_9

    .line 790
    .line 791
    :catch_a
    :goto_d
    sget-object v0, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;

    .line 792
    .line 793
    .line 794
    invoke-static {}, Lcom/kubi/flutter/proto/kline/Response;->newBuilder()Lcom/kubi/flutter/proto/kline/Response$b;

    .line 795
    move-result-object v1

    .line 796
    .line 797
    .line 798
    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/Response$b;)Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;

    .line 802
    move-result-object v0

    .line 803
    .line 804
    const/16 v1, 0x12c

    .line 805
    .line 806
    .line 807
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->b(I)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/Response;

    .line 811
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 812
    goto :goto_9

    .line 813
    .line 814
    .line 815
    :goto_e
    invoke-interface {v14, v7}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 816
    return-object v0

    .line 817
    .line 818
    .line 819
    :goto_f
    invoke-interface {v14, v7}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 820
    throw v0
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
.end method
