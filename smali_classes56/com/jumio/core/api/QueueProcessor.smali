.class public final Lcom/jumio/core/api/QueueProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/Subscriber;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jumio/core/model/Subscriber<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u00020\u00172\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0017J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\u0016\u0010 \u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00152\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\u00172\n\u0010$\u001a\u0006\u0012\u0002\u0008\u00030\u000fJ\u0006\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u0017J\u001a\u0010\'\u001a\u00020\u00172\u0012\u0010(\u001a\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00150)J\u0016\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020\"J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"
    }
    d2 = {
        "Lcom/jumio/core/api/QueueProcessor;",
        "Lcom/jumio/core/model/Subscriber;",
        "",
        "sendThread",
        "Ljava/util/concurrent/ExecutorService;",
        "scopeProvider",
        "Lcom/jumio/core/scope/ScopeProviderInterface;",
        "apiCallSettings",
        "Lcom/jumio/core/network/ApiCallSettings;",
        "apiResult",
        "Lcom/jumio/core/network/ApiResult;",
        "<init>",
        "(Ljava/util/concurrent/ExecutorService;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/network/ApiResult;)V",
        "queue",
        "Ljava/util/concurrent/ConcurrentLinkedQueue;",
        "Lcom/jumio/core/models/ApiCallDataModel;",
        "queueLock",
        "executorService",
        "currentCallable",
        "Ljava/util/concurrent/Future;",
        "currentHead",
        "Lcom/jumio/core/network/ApiCall;",
        "proceed",
        "",
        "proceedDelayed",
        "delay",
        "",
        "onResult",
        "result",
        "onError",
        "error",
        "",
        "checkHead",
        "removeFromQueue",
        "",
        "addToQueue",
        "c",
        "abort",
        "clear",
        "cleanFromQueue",
        "clazz",
        "Ljava/lang/Class;",
        "persist",
        "persistor",
        "Lcom/jumio/core/persistence/PersistenceUtil$Persist;",
        "restore",
        "restorer",
        "Lcom/jumio/core/persistence/PersistenceUtil$Restore;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQueueProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueueProcessor.kt\ncom/jumio/core/api/QueueProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1863#2,2:156\n*S KotlinDebug\n*F\n+ 1 QueueProcessor.kt\ncom/jumio/core/api/QueueProcessor\n*L\n130#1:156,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/jumio/core/scope/ScopeProviderInterface;

.field public final b:Lcom/jumio/core/api/BackendManager;

.field public final c:Lcom/jumio/core/api/BackendManager;

.field public final d:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/util/concurrent/ExecutorService;

.field public g:Ljava/util/concurrent/Future;

.field public h:Lcom/jumio/core/network/ApiCall;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/api/BackendManager;Lcom/jumio/core/api/BackendManager;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "sendThread"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "scopeProvider"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "apiCallSettings"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "apiResult"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    iput-object p2, p0, Lcom/jumio/core/api/QueueProcessor;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 26
    .line 27
    iput-object p3, p0, Lcom/jumio/core/api/QueueProcessor;->b:Lcom/jumio/core/api/BackendManager;

    .line 28
    .line 29
    iput-object p4, p0, Lcom/jumio/core/api/QueueProcessor;->c:Lcom/jumio/core/api/BackendManager;

    .line 30
    .line 31
    new-instance p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 32
    .line 33
    .line 34
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 35
    .line 36
    iput-object p2, p0, Lcom/jumio/core/api/QueueProcessor;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 37
    .line 38
    new-instance p2, Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    iput-object p2, p0, Lcom/jumio/core/api/QueueProcessor;->e:Ljava/lang/Object;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/jumio/core/api/QueueProcessor;->f:Ljava/util/concurrent/ExecutorService;

    .line 46
    return-void
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

.method public static final a(JLcom/jumio/core/api/QueueProcessor;)V
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V

    const/4 p0, 0x0

    .line 2
    iput-object p0, p2, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;

    .line 3
    iget-object p1, p2, Lcom/jumio/core/api/QueueProcessor;->a:Lcom/jumio/core/scope/ScopeProviderInterface;

    new-instance v0, Ljumio/core/e3;

    invoke-direct {v0, p2, p0}, Ljumio/core/e3;-><init>(Lcom/jumio/core/api/QueueProcessor;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p1, v0}, Lcom/jumio/core/scope/ScopeProviderInterface;->runOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/jumio/core/network/ApiCall;
    .locals 4

    .line 4
    iget-object v0, p0, Lcom/jumio/core/api/QueueProcessor;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->h:Lcom/jumio/core/network/ApiCall;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;

    if-nez v1, :cond_0

    goto :goto_2

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v1}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    move-result-object v1

    iget-object v3, p0, Lcom/jumio/core/api/QueueProcessor;->h:Lcom/jumio/core/network/ApiCall;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v1, v3, :cond_2

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/jumio/core/api/QueueProcessor;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/ApiCallDataModel;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/jumio/core/api/QueueProcessor;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/ApiCallDataModel;

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/jumio/core/api/QueueProcessor;->h:Lcom/jumio/core/network/ApiCall;

    goto :goto_1

    :cond_2
    move-object p1, v2

    .line 10
    :goto_1
    iput-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;

    .line 11
    iput-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->h:Lcom/jumio/core/network/ApiCall;

    .line 12
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit v0

    return-object p1

    .line 14
    :cond_3
    :goto_2
    monitor-exit v0

    return-object v2

    .line 15
    :goto_3
    monitor-exit v0

    throw p1
.end method

.method public final a()V
    .locals 4

    .line 16
    iget-object v0, p0, Lcom/jumio/core/api/QueueProcessor;->e:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 17
    :try_start_0
    iget-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->h:Lcom/jumio/core/network/ApiCall;

    if-eqz v2, :cond_0

    invoke-virtual {v2, p0}, Ljumio/core/a3;->remove(Lcom/jumio/core/model/Subscriber;)Z

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_2

    .line 18
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :cond_1
    :try_start_1
    iput-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    .line 20
    :catch_0
    :try_start_2
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    :try_start_3
    iput-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 22
    :goto_1
    monitor-exit v0

    return-void

    .line 23
    :goto_2
    :try_start_4
    iput-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 24
    :goto_3
    monitor-exit v0

    throw v1
.end method

.method public final a(Ljumio/core/O2;Z)V
    .locals 1

    const-string v0, "persistor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/jumio/core/api/QueueProcessor;->e:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p2, :cond_0

    .line 26
    :try_start_0
    invoke-virtual {p0}, Lcom/jumio/core/api/QueueProcessor;->a()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iget-object p2, p0, Lcom/jumio/core/api/QueueProcessor;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1, p2}, Ljumio/core/O2;->a(Ljava/io/Serializable;)V

    .line 28
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final b()V
    .locals 6

    .line 1
    .line 2
    const-string v0, "proceed() starting "

    .line 3
    .line 4
    iget-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->e:Ljava/lang/Object;

    .line 5
    monitor-enter v1

    .line 6
    .line 7
    :try_start_0
    iget-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 11
    move-result v2

    .line 12
    .line 13
    if-nez v2, :cond_2

    .line 14
    .line 15
    iget-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lcom/jumio/core/models/ApiCallDataModel;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    const-class v4, Ljumio/core/f;

    .line 33
    .line 34
    const-class v5, Lcom/jumio/core/models/ApiCallDataModel;

    .line 35
    .line 36
    .line 37
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    iget-object v4, p0, Lcom/jumio/core/api/QueueProcessor;->b:Lcom/jumio/core/api/BackendManager;

    .line 45
    .line 46
    .line 47
    filled-new-array {v4, v2}, [Ljava/lang/Object;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    const-string v3, "null cannot be cast to non-null type com.jumio.core.network.ApiCall<*>"

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    check-cast v2, Lcom/jumio/core/network/ApiCall;

    .line 60
    .line 61
    iput-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->h:Lcom/jumio/core/network/ApiCall;

    .line 62
    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    const-string v3, "QueueProcessor"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 73
    move-result-object v4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-static {v3, v0}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    const-string v0, "null cannot be cast to non-null type com.jumio.core.model.Publisher<kotlin.Any>"

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, p0}, Ljumio/core/a3;->add(Lcom/jumio/core/model/Subscriber;)Z

    .line 89
    .line 90
    iget-object v0, p0, Lcom/jumio/core/api/QueueProcessor;->f:Ljava/util/concurrent/ExecutorService;

    .line 91
    .line 92
    iget-object v2, p0, Lcom/jumio/core/api/QueueProcessor;->h:Lcom/jumio/core/network/ApiCall;

    .line 93
    .line 94
    .line 95
    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    const-string v2, "null cannot be cast to non-null type java.util.concurrent.Future<com.jumio.core.network.ApiCall<*>>"

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    iput-object v0, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;

    .line 104
    .line 105
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    goto :goto_2

    .line 109
    :cond_1
    :goto_0
    monitor-exit v1

    .line 110
    return-void

    .line 111
    :cond_2
    :goto_1
    monitor-exit v1

    .line 112
    return-void

    .line 113
    :goto_2
    monitor-exit v1

    .line 114
    throw v0
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
.end method

.method public final c()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/api/QueueProcessor;->e:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->f:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    new-instance v2, Li9/c;

    .line 8
    .line 9
    const-wide/16 v3, 0xfa

    .line 10
    .line 11
    .line 12
    invoke-direct {v2, v3, v4, p0}, Li9/c;-><init>(JLcom/jumio/core/api/QueueProcessor;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    iput-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->g:Ljava/util/concurrent/Future;

    .line 19
    .line 20
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    monitor-exit v0

    .line 25
    throw v1
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/jumio/core/model/InvokeOnUiThread;
        value = true
    .end annotation

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/jumio/core/api/QueueProcessor;->a(Z)Lcom/jumio/core/network/ApiCall;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->c:Lcom/jumio/core/api/BackendManager;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/jumio/core/network/ApiCall;->getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v0, p1}, Ljumio/core/g;->onError(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Throwable;)V

    .line 23
    return-void
    .line 24
.end method

.method public onResult(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/jumio/core/model/InvokeOnUiThread;
        value = true
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/jumio/core/api/QueueProcessor;->a(Z)Lcom/jumio/core/network/ApiCall;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    iget-object v1, p0, Lcom/jumio/core/api/QueueProcessor;->c:Lcom/jumio/core/api/BackendManager;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/core/network/ApiCall;->getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v0, p1}, Ljumio/core/g;->onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/jumio/core/api/QueueProcessor;->b()V

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method
