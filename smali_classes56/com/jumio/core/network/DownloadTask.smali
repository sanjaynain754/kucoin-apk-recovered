.class public abstract Lcom/jumio/core/network/DownloadTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/network/DownloadTask$ProgressListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0002#$B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001e\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u00a4@\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0008J\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00018\u0000H\u0082@\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0082@\u00a2\u0006\u0002\u0010\u001eJ\u0008\u0010 \u001a\u00020\u0004H\u0016J\u0016\u0010!\u001a\u00020\u00192\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0008X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006%"
    }
    d2 = {
        "Lcom/jumio/core/network/DownloadTask;",
        "Result",
        "Lcom/jumio/core/network/MonitorableCall;",
        "url",
        "",
        "timeout",
        "",
        "callbackDispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "<init>",
        "(Ljava/lang/String;ILkotlinx/coroutines/CoroutineDispatcher;)V",
        "getCallbackDispatcher",
        "()Lkotlinx/coroutines/CoroutineDispatcher;",
        "progressListener",
        "Lcom/jumio/core/network/DownloadTask$ProgressListener;",
        "getProgressListener",
        "()Lcom/jumio/core/network/DownloadTask$ProgressListener;",
        "setProgressListener",
        "(Lcom/jumio/core/network/DownloadTask$ProgressListener;)V",
        "processInputStream",
        "inputStream",
        "Ljava/io/InputStream;",
        "length",
        "(Ljava/io/InputStream;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "start",
        "",
        "dispatcher",
        "startSync",
        "()Ljava/lang/Object;",
        "execute",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "doInBackground",
        "getCallId",
        "setListener",
        "listener",
        "ProgressListener",
        "DefaultProgressListener",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lkotlinx/coroutines/j0;

.field public d:Lcom/jumio/core/network/DownloadTask$ProgressListener;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILkotlinx/coroutines/j0;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlinx/coroutines/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/jumio/core/network/DownloadTask;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/jumio/core/network/DownloadTask;->b:I

    .line 4
    iput-object p3, p0, Lcom/jumio/core/network/DownloadTask;->c:Lkotlinx/coroutines/j0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlinx/coroutines/j0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 5
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object p3

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/jumio/core/network/DownloadTask;-><init>(Ljava/lang/String;ILkotlinx/coroutines/j0;)V

    return-void
.end method

.method public static final a()Lcom/jumio/core/network/DownloadServiceInterface;
    .locals 1

    .line 20
    new-instance v0, Lcom/jumio/core/network/DownloadService;

    invoke-direct {v0}, Lcom/jumio/core/network/DownloadService;-><init>()V

    return-object v0
.end method

.method public static final synthetic access$doInBackground(Lcom/jumio/core/network/DownloadTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/jumio/core/network/DownloadTask;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final access$execute(Lcom/jumio/core/network/DownloadTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    instance-of v0, p1, Ljumio/core/Z0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    move-object v0, p1

    .line 9
    .line 10
    check-cast v0, Ljumio/core/Z0;

    .line 11
    .line 12
    iget v1, v0, Ljumio/core/Z0;->d:I

    .line 13
    .line 14
    const/high16 v2, -0x80000000

    .line 15
    .line 16
    and-int v3, v1, v2

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    sub-int/2addr v1, v2

    .line 20
    .line 21
    iput v1, v0, Ljumio/core/Z0;->d:I

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Ljumio/core/Z0;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0, p1}, Ljumio/core/Z0;-><init>(Lcom/jumio/core/network/DownloadTask;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    :goto_0
    iget-object p1, v0, Ljumio/core/Z0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    iget v2, v0, Ljumio/core/Z0;->d:I

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x3

    .line 38
    const/4 v5, 0x2

    .line 39
    const/4 v6, 0x1

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-eq v2, v6, :cond_2

    .line 44
    .line 45
    if-eq v2, v5, :cond_2

    .line 46
    .line 47
    if-ne v2, v4, :cond_1

    .line 48
    .line 49
    iget-object p0, v0, Ljumio/core/Z0;->a:Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    return-object p0

    .line 54
    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p0

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    iget p1, p0, Lcom/jumio/core/network/DownloadTask;->b:I

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    int-to-long v7, p1

    .line 74
    .line 75
    new-instance p1, Ljumio/core/b1;

    .line 76
    .line 77
    .line 78
    invoke-direct {p1, p0, v3}, Ljumio/core/b1;-><init>(Lcom/jumio/core/network/DownloadTask;Lkotlin/coroutines/Continuation;)V

    .line 79
    .line 80
    iput v6, v0, Ljumio/core/Z0;->d:I

    .line 81
    .line 82
    .line 83
    invoke-static {v7, v8, p1, v0}, Lkotlinx/coroutines/TimeoutKt;->d(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    if-ne p1, v1, :cond_5

    .line 87
    goto :goto_2

    .line 88
    .line 89
    :cond_4
    iput v5, v0, Ljumio/core/Z0;->d:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lcom/jumio/core/network/DownloadTask;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    if-ne p1, v1, :cond_5

    .line 96
    goto :goto_2

    .line 97
    .line 98
    :cond_5
    :goto_1
    iget-object v2, p0, Lcom/jumio/core/network/DownloadTask;->c:Lkotlinx/coroutines/j0;

    .line 99
    .line 100
    new-instance v5, Lcom/jumio/core/network/d;

    .line 101
    .line 102
    .line 103
    invoke-direct {v5, p0, p1, v3}, Lcom/jumio/core/network/d;-><init>(Lcom/jumio/core/network/DownloadTask;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    .line 104
    .line 105
    iput-object p1, v0, Ljumio/core/Z0;->a:Ljava/lang/Object;

    .line 106
    .line 107
    iput v4, v0, Ljumio/core/Z0;->d:I

    .line 108
    .line 109
    .line 110
    invoke-static {v2, v5, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 111
    move-result-object p0

    .line 112
    .line 113
    if-ne p0, v1, :cond_6

    .line 114
    :goto_2
    return-object v1

    .line 115
    :cond_6
    return-object p1
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
.end method

.method public static synthetic start$default(Lcom/jumio/core/network/DownloadTask;Lkotlinx/coroutines/j0;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    if-nez p3, :cond_1

    .line 3
    .line 4
    and-int/lit8 p2, p2, 0x1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jumio/core/network/DownloadTask;->start(Lkotlinx/coroutines/j0;)V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 17
    .line 18
    const-string p1, "Super calls with default arguments not supported in this target, function: start"

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    throw p0
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
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p1, Ljumio/core/Y0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljumio/core/Y0;

    iget v1, v0, Ljumio/core/Y0;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljumio/core/Y0;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljumio/core/Y0;

    invoke-direct {v0, p0, p1}, Ljumio/core/Y0;-><init>(Lcom/jumio/core/network/DownloadTask;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Ljumio/core/Y0;->e:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Ljumio/core/Y0;->g:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Ljumio/core/Y0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    iget-object v0, v0, Ljumio/core/Y0;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Ljumio/core/Y0;->d:I

    iget-object v4, v0, Ljumio/core/Y0;->c:Ljava/lang/Object;

    check-cast v4, Ljumio/core/W0;

    iget-object v4, v0, Ljumio/core/Y0;->b:Ljava/lang/Object;

    check-cast v4, Lcom/jumio/core/network/DownloadServiceInterface;

    iget-object v5, v0, Ljumio/core/Y0;->a:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    .line 2
    :cond_3
    iget v2, v0, Ljumio/core/Y0;->d:I

    iget-object v5, v0, Ljumio/core/Y0;->b:Ljava/lang/Object;

    check-cast v5, Lcom/jumio/core/network/DownloadServiceInterface;

    iget-object v7, v0, Ljumio/core/Y0;->a:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v4, v5

    move-object v5, v7

    goto/16 :goto_4

    .line 3
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Lcom/jumio/core/network/DownloadTask;->getCallId()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    .line 5
    :try_start_2
    iget-object v7, p0, Lcom/jumio/core/network/DownloadTask;->d:Lcom/jumio/core/network/DownloadTask$ProgressListener;

    if-eqz v7, :cond_6

    invoke-interface {v7}, Lcom/jumio/core/network/DownloadTask$ProgressListener;->isRateLimitExceeded()Z

    move-result v7

    if-eq v7, v5, :cond_5

    goto :goto_1

    .line 6
    :cond_5
    new-instance v4, Ljumio/core/T3;

    const-string v5, "Throttling limit reached"

    const/16 v7, 0x1ad

    invoke-direct {v4, v7, v5}, Ljumio/core/T3;-><init>(ILjava/lang/String;)V

    throw v4

    :catch_0
    move-exception v4

    goto/16 :goto_5

    .line 7
    :cond_6
    :goto_1
    sget-object v7, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    const-class v8, Lcom/jumio/core/network/DownloadServiceInterface;

    new-instance v9, Lt9/c;

    invoke-direct {v9}, Lt9/c;-><init>()V

    invoke-virtual {v7, v8, v9}, Lcom/jumio/core/ServiceLocator;->getServiceImplementation(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/jumio/core/network/DownloadServiceInterface;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 8
    :try_start_3
    iget-object v8, p0, Lcom/jumio/core/network/DownloadTask;->a:Ljava/lang/String;

    iget v9, p0, Lcom/jumio/core/network/DownloadTask;->b:I

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Ljumio/core/Y0;->a:Ljava/lang/Object;

    iput-object v7, v0, Ljumio/core/Y0;->b:Ljava/lang/Object;

    iput v2, v0, Ljumio/core/Y0;->d:I

    iput v5, v0, Ljumio/core/Y0;->g:I

    invoke-interface {v7, v8, v9, p1, v0}, Lcom/jumio/core/network/DownloadServiceInterface;->download(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v5, v1, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object v11, v7

    move-object v7, p1

    move-object p1, v5

    move-object v5, v11

    .line 9
    :goto_2
    :try_start_4
    check-cast p1, Ljumio/core/W0;

    .line 10
    iget v2, p1, Ljumio/core/W0;->a:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const/16 v8, 0xc8

    if-eq v2, v8, :cond_8

    .line 11
    :try_start_5
    invoke-interface {v5}, Lcom/jumio/core/network/DownloadServiceInterface;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    return-object v6

    :catch_1
    move-exception v4

    move-object p1, v7

    goto :goto_5

    .line 12
    :cond_8
    :try_start_6
    iget-object v8, p1, Ljumio/core/W0;->c:Ljava/io/InputStream;

    .line 13
    iget v9, p1, Ljumio/core/W0;->b:I

    .line 14
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Ljumio/core/Y0;->a:Ljava/lang/Object;

    iput-object v5, v0, Ljumio/core/Y0;->b:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Ljumio/core/Y0;->c:Ljava/lang/Object;

    iput v2, v0, Ljumio/core/Y0;->d:I

    iput v4, v0, Ljumio/core/Y0;->g:I

    invoke-virtual {p0, v8, v9, v0}, Lcom/jumio/core/network/DownloadTask;->processInputStream(Ljava/io/InputStream;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-ne p1, v1, :cond_9

    goto :goto_6

    :cond_9
    move-object v4, v5

    move-object v5, v7

    .line 15
    :goto_3
    :try_start_7
    invoke-interface {v4}, Lcom/jumio/core/network/DownloadServiceInterface;->close()V

    return-object p1

    :catch_2
    move-exception v4

    move-object p1, v5

    goto :goto_5

    :catchall_2
    move-exception v4

    move-object v5, p1

    move-object p1, v4

    move-object v4, v7

    .line 16
    :goto_4
    invoke-interface {v4}, Lcom/jumio/core/network/DownloadServiceInterface;->close()V

    throw p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 17
    :goto_5
    const-string v5, "DownloadTask"

    const-string v7, ""

    invoke-static {v5, v7, v4}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    iget-object v5, p0, Lcom/jumio/core/network/DownloadTask;->c:Lkotlinx/coroutines/j0;

    new-instance v7, Lcom/jumio/core/network/c;

    invoke-direct {v7, p0, v4, v6}, Lcom/jumio/core/network/c;-><init>(Lcom/jumio/core/network/DownloadTask;Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Ljumio/core/Y0;->a:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Ljumio/core/Y0;->b:Ljava/lang/Object;

    iput-object v6, v0, Ljumio/core/Y0;->c:Ljava/lang/Object;

    iput v2, v0, Ljumio/core/Y0;->d:I

    iput v3, v0, Ljumio/core/Y0;->g:I

    invoke-static {v5, v7, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_6
    return-object v1

    .line 19
    :cond_a
    :goto_7
    check-cast p1, Lkotlin/Unit;

    return-object v6
.end method

.method public getCallId()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "getSimpleName(...)"

    .line 3
    .line 4
    const-string v1, "DownloadTask"

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    return-object v1
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getCallbackDispatcher()Lkotlinx/coroutines/j0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/DownloadTask;->c:Lkotlinx/coroutines/j0;

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
.end method

.method public final getProgressListener()Lcom/jumio/core/network/DownloadTask$ProgressListener;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/jumio/core/network/DownloadTask$ProgressListener<",
            "TResult;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/DownloadTask;->d:Lcom/jumio/core/network/DownloadTask$ProgressListener;

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
.end method

.method public abstract processInputStream(Ljava/io/InputStream;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-TResult;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public final setListener(Lcom/jumio/core/network/DownloadTask$ProgressListener;)V
    .locals 0
    .param p1    # Lcom/jumio/core/network/DownloadTask$ProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/network/DownloadTask$ProgressListener<",
            "TResult;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/network/DownloadTask;->d:Lcom/jumio/core/network/DownloadTask$ProgressListener;

    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
.end method

.method public final setProgressListener(Lcom/jumio/core/network/DownloadTask$ProgressListener;)V
    .locals 0
    .param p1    # Lcom/jumio/core/network/DownloadTask$ProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/network/DownloadTask$ProgressListener<",
            "TResult;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/network/DownloadTask;->d:Lcom/jumio/core/network/DownloadTask$ProgressListener;

    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
.end method

.method public final start(Lkotlinx/coroutines/j0;)V
    .locals 7
    .param p1    # Lkotlinx/coroutines/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "dispatcher"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    new-instance v4, Ljumio/core/c1;

    .line 12
    const/4 p1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v4, p0, p1}, Ljumio/core/c1;-><init>(Lcom/jumio/core/network/DownloadTask;Lkotlin/coroutines/Continuation;)V

    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 23
    return-void
    .line 24
.end method

.method public final startSync()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljumio/core/d1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Ljumio/core/d1;-><init>(Lcom/jumio/core/network/DownloadTask;Lkotlin/coroutines/Continuation;)V

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0, v2, v1}, Lkotlinx/coroutines/h;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method
