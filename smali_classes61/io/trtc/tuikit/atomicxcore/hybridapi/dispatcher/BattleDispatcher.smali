.class public final Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;
.super Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\u0008\u0010\u000e\u001a\u00020\u0006H\u0016J\u0008\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;",
        "liveID",
        "",
        "eventEmitter",
        "Lkotlin/Function2;",
        "",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V",
        "baseKey",
        "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;",
        "eventListener",
        "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;",
        "dispatchCurrentState",
        "key",
        "startObserving",
        "stopObserving",
        "atomicxcore_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBattleDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,235:1\n35#2,2:236\n35#2,2:238\n35#2,2:240\n*S KotlinDebug\n*F\n+ 1 BattleDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher\n*L\n220#1:236,2\n224#1:238,2\n228#1:240,2\n*E\n"
    }
.end annotation


# instance fields
.field private final baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private eventListener:Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final liveID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "liveID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "eventEmitter"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p2}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->liveID:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 18
    .line 19
    const-string v4, ""

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    const-string/jumbo v2, "state"

    .line 24
    .line 25
    const-string v3, "BattleStore"

    .line 26
    move-object v5, p1

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 32
    return-void
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

.method public static final synthetic access$getBaseKey$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;)Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->baseKey:Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;

    .line 3
    return-object p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final synthetic access$getLiveID$p(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->liveID:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public dispatchCurrentState(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V
    .locals 5
    .param p1    # Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/BattleStore$Companion;

    .line 8
    .line 9
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->liveID:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;->getName()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    const v3, -0x4d4e1c21

    .line 29
    .line 30
    .line 31
    const-string/jumbo v4, "toJson(...)"

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    .line 36
    const v3, -0x2d5a4f46

    .line 37
    .line 38
    if-eq v2, v3, :cond_2

    .line 39
    .line 40
    .line 41
    const v3, -0x2d36ffd0

    .line 42
    .line 43
    if-eq v2, v3, :cond_0

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_0
    const-string v2, "battleUsers"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result v1

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getBattleUsers()Lkotlinx/coroutines/flow/w;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 84
    return-void

    .line 85
    .line 86
    :cond_2
    const-string v2, "battleScore"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    move-result v1

    .line 91
    .line 92
    if-nez v1, :cond_3

    .line 93
    goto :goto_0

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getBattleScore()Lkotlinx/coroutines/flow/w;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    .line 112
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 124
    return-void

    .line 125
    .line 126
    :cond_4
    const-string v2, "currentBattleInfo"

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    move-result v1

    .line 131
    .line 132
    if-nez v1, :cond_5

    .line 133
    :goto_0
    return-void

    .line 134
    .line 135
    .line 136
    :cond_5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getCurrentBattleInfo()Lkotlinx/coroutines/flow/w;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;

    .line 144
    .line 145
    if-eqz v0, :cond_6

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt;->getSharedGson()Lcom/google/gson/Gson;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    if-nez v0, :cond_7

    .line 159
    .line 160
    :cond_6
    const-string v0, "null"

    .line 161
    .line 162
    .line 163
    :cond_7
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->dispatchEvent(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V

    .line 172
    return-void
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

.method public startObserving()V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->getObserverScope()Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    new-instance v3, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher$startObserving$1;

    .line 11
    const/4 v6, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v3, p0, v6}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher$startObserving$1;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->getObserverScope()Lkotlinx/coroutines/m0;

    .line 24
    move-result-object v7

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 28
    move-result-object v8

    .line 29
    .line 30
    new-instance v10, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher$startObserving$2;

    .line 31
    .line 32
    .line 33
    invoke-direct {v10, p0, v6}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher$startObserving$2;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;Lkotlin/coroutines/Continuation;)V

    .line 34
    const/4 v11, 0x2

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->getObserverScope()Lkotlinx/coroutines/m0;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    new-instance v3, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher$startObserving$3;

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, p0, v6}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher$startObserving$3;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;Lkotlin/coroutines/Continuation;)V

    .line 53
    .line 54
    .line 55
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 56
    .line 57
    new-instance v0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher$startObserving$4;

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher$startObserving$4;-><init>(Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;)V

    .line 61
    .line 62
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->eventListener:Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;

    .line 63
    .line 64
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/BattleStore$Companion;

    .line 65
    .line 66
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->liveID:Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->addBattleListener(Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;)V

    .line 74
    return-void
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

.method public stopObserving()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->eventListener:Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/BattleStore$Companion;

    .line 7
    .line 8
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->liveID:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->removeBattleListener(Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;)V

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;->eventListener:Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;->getKeys()Ljava/util/Set;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 26
    return-void
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
.end method
