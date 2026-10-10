.class final Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BundleManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/pkg/bundle/BundleManager;->Z(Landroid/content/Context;ILjava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/kubi/sdk/pkg/task/TaskStatus;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/m0;",
        "Lcom/kubi/sdk/pkg/task/TaskStatus;",
        "<anonymous>",
        "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3"
    f = "BundleManager.kt"
    i = {
        0x0,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x6,
        0x6
    }
    l = {
        0x1cd,
        0x1d1,
        0x39b,
        0x235,
        0x236,
        0x23f,
        0x240
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext",
        "$this$withContext",
        "pkgPlatformPlan",
        "cloudBatches",
        "$this$withLock_u24default$iv",
        "$this$withContext",
        "cloudBatches",
        "$this$withLock_u24default$iv",
        "semaphore",
        "normalStartGate",
        "pkgPlatformDeferred",
        "cloudCriticalTasks",
        "cloudCriticalScheduled",
        "$this$withContext",
        "cloudBatches",
        "$this$withLock_u24default$iv",
        "semaphore",
        "normalStartGate",
        "pkgPlatformDeferred",
        "cloudCriticalTasks",
        "$this$withLock_u24default$iv",
        "pkgPlatformDeferred",
        "$this$withLock_u24default$iv",
        "cloudStatuses"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBundleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,891:1\n1603#2,9:892\n1855#2:901\n1856#2:903\n1612#2:904\n1603#2,9:905\n1855#2:914\n1856#2:916\n1612#2:917\n288#2,2:926\n1549#2:929\n1620#2,2:930\n1622#2:933\n1#3:902\n1#3:915\n1#3:932\n108#4,8:918\n117#4:928\n*S KotlinDebug\n*F\n+ 1 BundleManager.kt\ncom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3\n*L\n481#1:892,9\n481#1:901\n481#1:903\n481#1:904\n492#1:905,9\n492#1:914\n492#1:916\n492#1:917\n581#1:926,2\n519#1:929\n519#1:930,2\n519#1:933\n481#1:902\n492#1:915\n496#1:918,8\n496#1:928\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $criticalBizList:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $maxSemaphore:I

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/util/Collection;Landroid/content/Context;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$criticalBizList:Ljava/util/Collection;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$context:Landroid/content/Context;

    .line 5
    .line 6
    iput p3, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$maxSemaphore:I

    .line 7
    const/4 p1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
.end method

.method public static final a(Lkotlinx/coroutines/m0;Lrg0/g;Landroid/content/Context;Ljava/util/List;Z)Lkotlin/Pair;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lrg0/g;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lkotlinx/coroutines/r0<",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;>;",
            "Ljava/util/List<",
            "Lkotlinx/coroutines/r0<",
            "Lkotlin/Unit;",
            ">;>;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    move-result v3

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    move-result-object v3

    .line 33
    move-object v8, v3

    .line 34
    .line 35
    check-cast v8, Ljava/lang/String;

    .line 36
    const/4 v3, 0x0

    .line 37
    .line 38
    if-eqz p4, :cond_0

    .line 39
    const/4 v4, 0x1

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v4, v3}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    :cond_0
    move-object v6, v3

    .line 48
    .line 49
    sget-object v11, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    .line 50
    .line 51
    new-instance v12, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1;

    .line 52
    const/4 v9, 0x0

    .line 53
    .line 54
    move-object/from16 v5, p1

    .line 55
    .line 56
    move-object/from16 v7, p2

    .line 57
    move-object v4, v12

    .line 58
    .line 59
    .line 60
    invoke-direct/range {v4 .. v9}, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$4$startCloudBatch$tasks$1$1;-><init>(Lrg0/g;Lkotlinx/coroutines/w;Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 61
    const/4 v13, 0x1

    .line 62
    const/4 v14, 0x0

    .line 63
    const/4 v10, 0x0

    .line 64
    move-object v9, p0

    .line 65
    .line 66
    .line 67
    invoke-static/range {v9 .. v14}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    .line 71
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    goto :goto_0

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 76
    move-result-object p0

    .line 77
    return-object p0
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$criticalBizList:Ljava/util/Collection;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$context:Landroid/content/Context;

    .line 7
    .line 8
    iget v3, p0, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$maxSemaphore:I

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;-><init>(Ljava/util/Collection;Landroid/content/Context;ILkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 14
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/m0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/m0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/sdk/pkg/task/TaskStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v4, p0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    move-result-object v7

    .line 7
    .line 8
    iget v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->label:I

    .line 9
    .line 10
    const-string v1, "loadBundle"

    .line 11
    .line 12
    const-string v8, ", msg="

    .line 13
    .line 14
    const-string v9, "startUpdateAll \u5305\u7ba1\u7406\u5e73\u53f0\u7ed3\u679c: code="

    .line 15
    .line 16
    const-string v10, "\u542f\u52a8\u66f4\u65b0\u53d6\u6d88,\u6ca1\u6709\u53ef\u7528\u7684\u4e0b\u8f7d\u5730\u5740"

    .line 17
    const/4 v2, 0x1

    .line 18
    .line 19
    const-string v11, "pkgPlatform"

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    throw v0

    .line 32
    .line 33
    :pswitch_0
    iget-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/util/List;

    .line 36
    .line 37
    iget-object v1, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lrg0/a;

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    move-object/from16 v2, p1

    .line 45
    .line 46
    goto/16 :goto_a

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    .line 49
    goto/16 :goto_d

    .line 50
    .line 51
    :pswitch_1
    iget-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lkotlinx/coroutines/r0;

    .line 54
    .line 55
    iget-object v1, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lrg0/a;

    .line 58
    .line 59
    .line 60
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    move-object v2, v0

    .line 62
    .line 63
    move-object/from16 v0, p1

    .line 64
    .line 65
    goto/16 :goto_8

    .line 66
    .line 67
    :pswitch_2
    iget-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$7:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/util/List;

    .line 70
    .line 71
    iget-object v2, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$6:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lkotlinx/coroutines/r0;

    .line 74
    .line 75
    iget-object v5, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$5:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v5, Lkotlinx/coroutines/w;

    .line 78
    .line 79
    iget-object v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$4:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v6, Lrg0/g;

    .line 82
    .line 83
    iget-object v10, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$3:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v10, Landroid/content/Context;

    .line 86
    .line 87
    iget-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$2:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v12, Lrg0/a;

    .line 90
    .line 91
    iget-object v13, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v13, Lcom/kubi/sdk/pkg/bundle/q;

    .line 94
    .line 95
    iget-object v14, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v14, Lkotlinx/coroutines/m0;

    .line 98
    .line 99
    .line 100
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    move-object v15, v14

    .line 102
    move-object v14, v5

    .line 103
    move-object v5, v12

    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    move-object v1, v12

    .line 108
    .line 109
    goto/16 :goto_d

    .line 110
    .line 111
    :pswitch_3
    iget-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$8:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Ljava/util/List;

    .line 114
    .line 115
    iget-object v2, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$7:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, Ljava/util/List;

    .line 118
    .line 119
    iget-object v5, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$6:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v5, Lkotlinx/coroutines/r0;

    .line 122
    .line 123
    iget-object v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$5:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v6, Lkotlinx/coroutines/w;

    .line 126
    .line 127
    iget-object v10, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$4:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v10, Lrg0/g;

    .line 130
    .line 131
    iget-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$3:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v12, Landroid/content/Context;

    .line 134
    .line 135
    iget-object v13, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$2:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v13, Lrg0/a;

    .line 138
    .line 139
    iget-object v14, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v14, Lcom/kubi/sdk/pkg/bundle/q;

    .line 142
    .line 143
    iget-object v15, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v15, Lkotlinx/coroutines/m0;

    .line 146
    .line 147
    .line 148
    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 149
    .line 150
    move-object/from16 v21, v6

    .line 151
    move-object v6, v5

    .line 152
    move-object v5, v13

    .line 153
    move-object v13, v14

    .line 154
    .line 155
    move-object/from16 v14, v21

    .line 156
    .line 157
    goto/16 :goto_6

    .line 158
    :catchall_2
    move-exception v0

    .line 159
    move-object v1, v13

    .line 160
    .line 161
    goto/16 :goto_d

    .line 162
    .line 163
    :pswitch_4
    iget v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->I$0:I

    .line 164
    .line 165
    iget-object v5, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$4:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v5, Landroid/content/Context;

    .line 168
    .line 169
    iget-object v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$3:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v6, Lrg0/a;

    .line 172
    .line 173
    iget-object v10, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$2:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v10, Lcom/kubi/sdk/pkg/bundle/q;

    .line 176
    .line 177
    iget-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v12, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;

    .line 180
    .line 181
    iget-object v13, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v13, Lkotlinx/coroutines/m0;

    .line 184
    .line 185
    .line 186
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 187
    move-object v14, v12

    .line 188
    move-object v12, v5

    .line 189
    move-object v5, v6

    .line 190
    :goto_0
    move-object v6, v13

    .line 191
    .line 192
    goto/16 :goto_5

    .line 193
    .line 194
    .line 195
    :pswitch_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 196
    .line 197
    move-object/from16 v0, p1

    .line 198
    goto :goto_2

    .line 199
    .line 200
    :pswitch_6
    iget-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 203
    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 206
    .line 207
    move-object/from16 v5, p1

    .line 208
    :cond_0
    move-object v13, v0

    .line 209
    goto :goto_1

    .line 210
    .line 211
    .line 212
    :pswitch_7
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 213
    .line 214
    iget-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 217
    .line 218
    sget-object v5, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 219
    .line 220
    new-instance v6, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    const-string v12, "startUpdateAll \u51c6\u5907\u5305\u7ba1\u7406\u5e73\u53f0\u6e05\u5355\uff0ccriticalBizList="

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    iget-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$criticalBizList:Ljava/util/Collection;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    move-result-object v6

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5, v11, v6}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    sget-object v5, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->a:Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;

    .line 243
    .line 244
    iget-object v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$context:Landroid/content/Context;

    .line 245
    .line 246
    iget-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$criticalBizList:Ljava/util/Collection;

    .line 247
    .line 248
    iput-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 249
    .line 250
    iput v2, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->label:I

    .line 251
    .line 252
    .line 253
    invoke-virtual {v5, v6, v12, v4}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;->s(Landroid/content/Context;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 254
    move-result-object v5

    .line 255
    .line 256
    if-ne v5, v7, :cond_0

    .line 257
    .line 258
    goto/16 :goto_9

    .line 259
    :goto_1
    move-object v0, v5

    .line 260
    .line 261
    check-cast v0, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;

    .line 262
    .line 263
    .line 264
    invoke-static {}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->r()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 265
    move-result-object v5

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    .line 269
    move-result v5

    .line 270
    .line 271
    if-eqz v5, :cond_2

    .line 272
    .line 273
    const-string v1, "bundle_load"

    .line 274
    .line 275
    .line 276
    invoke-static {v10, v1}, Lqq/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 279
    const/4 v1, 0x2

    .line 280
    .line 281
    iput v1, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->label:I

    .line 282
    const/4 v1, 0x0

    .line 283
    const/4 v2, 0x0

    .line 284
    const/4 v3, 0x0

    .line 285
    const/4 v5, 0x7

    .line 286
    const/4 v6, 0x0

    .line 287
    .line 288
    .line 289
    invoke-static/range {v0 .. v6}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;->b(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lrg0/g;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 290
    move-result-object v0

    .line 291
    .line 292
    if-ne v0, v7, :cond_1

    .line 293
    .line 294
    goto/16 :goto_9

    .line 295
    .line 296
    :cond_1
    :goto_2
    check-cast v0, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 297
    .line 298
    sget-object v1, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 299
    .line 300
    new-instance v2, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    .line 310
    move-result v3

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus;->f()Ljava/lang/String;

    .line 320
    move-result-object v0

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    move-result-object v0

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, v11, v0}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    sget-object v0, Lcom/kubi/sdk/pkg/task/TaskStatus;->e:Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;

    .line 333
    .line 334
    const/16 v1, 0x516

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v1, v10}, Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;->result(ILjava/lang/String;)Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 338
    move-result-object v0

    .line 339
    return-object v0

    .line 340
    .line 341
    .line 342
    :cond_2
    invoke-static {}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->r()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 343
    move-result-object v5

    .line 344
    .line 345
    .line 346
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 347
    move-result-object v5

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;->c()Ljava/util/Set;

    .line 351
    move-result-object v6

    .line 352
    .line 353
    sget-object v10, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$cloudFilterResult$1;->INSTANCE:Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$cloudFilterResult$1;

    .line 354
    .line 355
    .line 356
    invoke-static {v5, v6, v10}, Lcom/kubi/sdk/pkg/bundle/s;->b(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/pkg/bundle/r;

    .line 357
    move-result-object v5

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5}, Lcom/kubi/sdk/pkg/bundle/r;->b()Ljava/util/List;

    .line 361
    move-result-object v6

    .line 362
    .line 363
    .line 364
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 365
    move-result v6

    .line 366
    .line 367
    if-nez v6, :cond_5

    .line 368
    .line 369
    sget-object v6, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 370
    .line 371
    new-instance v10, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    const-string v12, "startUpdateAll \u4e91\u914d\u53bb\u91cd\uff0c\u8df3\u8fc7\u5305\u7ba1\u7406\u5e73\u53f0\u5df2\u4e0b\u53d1 Biz="

    .line 377
    .line 378
    .line 379
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5}, Lcom/kubi/sdk/pkg/bundle/r;->b()Ljava/util/List;

    .line 383
    move-result-object v12

    .line 384
    .line 385
    new-instance v14, Ljava/util/ArrayList;

    .line 386
    .line 387
    .line 388
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 389
    .line 390
    .line 391
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 392
    move-result-object v12

    .line 393
    .line 394
    .line 395
    :cond_3
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    move-result v15

    .line 397
    .line 398
    if-eqz v15, :cond_4

    .line 399
    .line 400
    .line 401
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    move-result-object v15

    .line 403
    .line 404
    check-cast v15, Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    invoke-static {v15}, Lcom/kubi/sdk/pkg/bundle/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    move-result-object v15

    .line 409
    .line 410
    if-eqz v15, :cond_3

    .line 411
    .line 412
    .line 413
    invoke-interface {v14, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 414
    goto :goto_3

    .line 415
    .line 416
    .line 417
    :cond_4
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    move-result-object v10

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6, v11, v10}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :cond_5
    invoke-virtual {v5}, Lcom/kubi/sdk/pkg/bundle/r;->a()Ljava/util/List;

    .line 428
    move-result-object v5

    .line 429
    .line 430
    iget-object v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$criticalBizList:Ljava/util/Collection;

    .line 431
    .line 432
    sget-object v10, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$cloudBatches$1;->INSTANCE:Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$cloudBatches$1;

    .line 433
    .line 434
    .line 435
    invoke-static {v5, v6, v10}, Lcom/kubi/sdk/pkg/bundle/s;->c(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/pkg/bundle/q;

    .line 436
    move-result-object v10

    .line 437
    .line 438
    sget-object v5, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 439
    .line 440
    new-instance v6, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 444
    .line 445
    const-string v12, "startUpdateAll \u5165\u961f\u5206\u7ec4 cloudCritical="

    .line 446
    .line 447
    .line 448
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/q;->a()Ljava/util/List;

    .line 452
    move-result-object v12

    .line 453
    .line 454
    new-instance v14, Ljava/util/ArrayList;

    .line 455
    .line 456
    .line 457
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    move-result-object v12

    .line 462
    .line 463
    .line 464
    :cond_6
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    move-result v15

    .line 466
    .line 467
    if-eqz v15, :cond_7

    .line 468
    .line 469
    .line 470
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    move-result-object v15

    .line 472
    .line 473
    check-cast v15, Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    invoke-static {v15}, Lcom/kubi/sdk/pkg/bundle/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 477
    move-result-object v15

    .line 478
    .line 479
    if-eqz v15, :cond_6

    .line 480
    .line 481
    .line 482
    invoke-interface {v14, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 483
    goto :goto_4

    .line 484
    .line 485
    .line 486
    :cond_7
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    const-string v12, ", cloudNormalCount="

    .line 489
    .line 490
    .line 491
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/q;->b()Ljava/util/List;

    .line 495
    move-result-object v12

    .line 496
    .line 497
    .line 498
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 499
    move-result v12

    .line 500
    .line 501
    .line 502
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    const-string v12, ", pkgPlatformBizCount="

    .line 505
    .line 506
    .line 507
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;->c()Ljava/util/Set;

    .line 511
    move-result-object v12

    .line 512
    .line 513
    .line 514
    invoke-interface {v12}, Ljava/util/Set;->size()I

    .line 515
    move-result v12

    .line 516
    .line 517
    .line 518
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    move-result-object v6

    .line 523
    .line 524
    .line 525
    invoke-virtual {v5, v1, v6}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-static {}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->q()Lrg0/a;

    .line 529
    move-result-object v5

    .line 530
    .line 531
    iget v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$maxSemaphore:I

    .line 532
    .line 533
    iget-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->$context:Landroid/content/Context;

    .line 534
    .line 535
    iput-object v13, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 536
    .line 537
    iput-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 538
    .line 539
    iput-object v10, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$2:Ljava/lang/Object;

    .line 540
    .line 541
    iput-object v5, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$3:Ljava/lang/Object;

    .line 542
    .line 543
    iput-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$4:Ljava/lang/Object;

    .line 544
    .line 545
    iput v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->I$0:I

    .line 546
    const/4 v14, 0x3

    .line 547
    .line 548
    iput v14, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->label:I

    .line 549
    .line 550
    .line 551
    invoke-interface {v5, v3, v4}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 552
    move-result-object v14

    .line 553
    .line 554
    if-ne v14, v7, :cond_8

    .line 555
    .line 556
    goto/16 :goto_9

    .line 557
    :cond_8
    move-object v14, v0

    .line 558
    move v0, v6

    .line 559
    .line 560
    goto/16 :goto_0

    .line 561
    .line 562
    .line 563
    :goto_5
    :try_start_4
    invoke-static {v0}, Lcom/kubi/sdk/pkg/task/TaskCommonKt;->i(I)Lrg0/g;

    .line 564
    move-result-object v15

    .line 565
    .line 566
    .line 567
    invoke-static {v3, v2, v3}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    .line 568
    move-result-object v17

    .line 569
    .line 570
    .line 571
    invoke-static {v3, v2, v3}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    .line 572
    move-result-object v16

    .line 573
    .line 574
    sget-object v0, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    .line 575
    .line 576
    new-instance v18, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1;

    .line 577
    .line 578
    move-object/from16 v13, v18

    .line 579
    .line 580
    const/16 v18, 0x0

    .line 581
    .line 582
    .line 583
    invoke-direct/range {v13 .. v18}, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1;-><init>(Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;Lrg0/g;Lkotlinx/coroutines/w;Lkotlinx/coroutines/w;Lkotlin/coroutines/Continuation;)V

    .line 584
    .line 585
    move-object/from16 v18, v13

    .line 586
    move-object v13, v15

    .line 587
    .line 588
    move-object/from16 v14, v17

    .line 589
    .line 590
    const/16 v19, 0x1

    .line 591
    .line 592
    const/16 v20, 0x0

    .line 593
    .line 594
    move-object/from16 v15, v16

    .line 595
    .line 596
    const/16 v16, 0x0

    .line 597
    .line 598
    move-object/from16 v17, v0

    .line 599
    move-object v0, v15

    .line 600
    move-object v15, v6

    .line 601
    .line 602
    .line 603
    invoke-static/range {v15 .. v20}, Lkotlinx/coroutines/h;->b(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/r0;

    .line 604
    move-result-object v6

    .line 605
    .line 606
    .line 607
    invoke-virtual {v10}, Lcom/kubi/sdk/pkg/bundle/q;->a()Ljava/util/List;

    .line 608
    move-result-object v3

    .line 609
    .line 610
    .line 611
    invoke-static {v15, v13, v12, v3, v2}, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->a(Lkotlinx/coroutines/m0;Lrg0/g;Landroid/content/Context;Ljava/util/List;Z)Lkotlin/Pair;

    .line 612
    move-result-object v2

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 616
    move-result-object v3

    .line 617
    .line 618
    check-cast v3, Ljava/util/List;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 622
    move-result-object v2

    .line 623
    .line 624
    check-cast v2, Ljava/util/List;

    .line 625
    .line 626
    iput-object v15, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 627
    .line 628
    iput-object v10, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 629
    .line 630
    iput-object v5, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$2:Ljava/lang/Object;

    .line 631
    .line 632
    iput-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$3:Ljava/lang/Object;

    .line 633
    .line 634
    iput-object v13, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$4:Ljava/lang/Object;

    .line 635
    .line 636
    iput-object v14, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$5:Ljava/lang/Object;

    .line 637
    .line 638
    iput-object v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$6:Ljava/lang/Object;

    .line 639
    .line 640
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$7:Ljava/lang/Object;

    .line 641
    .line 642
    iput-object v2, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$8:Ljava/lang/Object;

    .line 643
    .line 644
    move-object/from16 p1, v2

    .line 645
    const/4 v2, 0x4

    .line 646
    .line 647
    iput v2, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->label:I

    .line 648
    .line 649
    .line 650
    invoke-interface {v0, v4}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 651
    move-result-object v0

    .line 652
    .line 653
    if-ne v0, v7, :cond_9

    .line 654
    .line 655
    goto/16 :goto_9

    .line 656
    :cond_9
    move-object v0, v13

    .line 657
    move-object v13, v10

    .line 658
    move-object v10, v0

    .line 659
    .line 660
    move-object/from16 v0, p1

    .line 661
    move-object v2, v3

    .line 662
    .line 663
    :goto_6
    iput-object v15, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 664
    .line 665
    iput-object v13, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 666
    .line 667
    iput-object v5, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$2:Ljava/lang/Object;

    .line 668
    .line 669
    iput-object v12, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$3:Ljava/lang/Object;

    .line 670
    .line 671
    iput-object v10, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$4:Ljava/lang/Object;

    .line 672
    .line 673
    iput-object v14, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$5:Ljava/lang/Object;

    .line 674
    .line 675
    iput-object v6, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$6:Ljava/lang/Object;

    .line 676
    .line 677
    iput-object v2, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$7:Ljava/lang/Object;

    .line 678
    const/4 v3, 0x0

    .line 679
    .line 680
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$8:Ljava/lang/Object;

    .line 681
    const/4 v3, 0x5

    .line 682
    .line 683
    iput v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->label:I

    .line 684
    .line 685
    .line 686
    invoke-static {v0, v4}, Lkotlinx/coroutines/AwaitKt;->a(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 687
    move-result-object v0

    .line 688
    .line 689
    if-ne v0, v7, :cond_a

    .line 690
    goto :goto_9

    .line 691
    :cond_a
    move-object v0, v2

    .line 692
    move-object v2, v6

    .line 693
    move-object v6, v10

    .line 694
    move-object v10, v12

    .line 695
    .line 696
    :goto_7
    sget-object v3, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 697
    .line 698
    const-string v12, "startUpdateAll Critical \u5df2\u5168\u90e8\u83b7\u5f97\u6267\u884c\u540d\u989d/\u5165\u961f\uff0c\u653e\u884c\u666e\u901a Biz"

    .line 699
    .line 700
    .line 701
    invoke-virtual {v3, v1, v12}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    .line 703
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 704
    .line 705
    .line 706
    invoke-interface {v14, v1}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    invoke-virtual {v13}, Lcom/kubi/sdk/pkg/bundle/q;->b()Ljava/util/List;

    .line 710
    move-result-object v1

    .line 711
    const/4 v3, 0x0

    .line 712
    .line 713
    .line 714
    invoke-static {v15, v6, v10, v1, v3}, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->a(Lkotlinx/coroutines/m0;Lrg0/g;Landroid/content/Context;Ljava/util/List;Z)Lkotlin/Pair;

    .line 715
    move-result-object v1

    .line 716
    .line 717
    .line 718
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 719
    move-result-object v1

    .line 720
    .line 721
    check-cast v1, Ljava/util/List;

    .line 722
    .line 723
    .line 724
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 725
    move-result-object v0

    .line 726
    .line 727
    iput-object v5, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 728
    .line 729
    iput-object v2, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 730
    const/4 v3, 0x0

    .line 731
    .line 732
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$2:Ljava/lang/Object;

    .line 733
    .line 734
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$3:Ljava/lang/Object;

    .line 735
    .line 736
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$4:Ljava/lang/Object;

    .line 737
    .line 738
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$5:Ljava/lang/Object;

    .line 739
    .line 740
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$6:Ljava/lang/Object;

    .line 741
    .line 742
    iput-object v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$7:Ljava/lang/Object;

    .line 743
    const/4 v1, 0x6

    .line 744
    .line 745
    iput v1, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->label:I

    .line 746
    .line 747
    .line 748
    invoke-static {v0, v4}, Lkotlinx/coroutines/AwaitKt;->a(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 749
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 750
    .line 751
    if-ne v0, v7, :cond_b

    .line 752
    goto :goto_9

    .line 753
    :cond_b
    move-object v1, v5

    .line 754
    .line 755
    :goto_8
    :try_start_5
    check-cast v0, Ljava/util/List;

    .line 756
    .line 757
    iput-object v1, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$0:Ljava/lang/Object;

    .line 758
    .line 759
    iput-object v0, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->L$1:Ljava/lang/Object;

    .line 760
    const/4 v3, 0x7

    .line 761
    .line 762
    iput v3, v4, Lcom/kubi/sdk/pkg/bundle/BundleManager$startUpdateAll$3;->label:I

    .line 763
    .line 764
    .line 765
    invoke-interface {v2, v4}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 766
    move-result-object v2

    .line 767
    .line 768
    if-ne v2, v7, :cond_c

    .line 769
    :goto_9
    return-object v7

    .line 770
    .line 771
    :cond_c
    :goto_a
    check-cast v2, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 772
    .line 773
    sget-object v3, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 774
    .line 775
    new-instance v5, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/task/TaskStatus;->d()I

    .line 785
    move-result v6

    .line 786
    .line 787
    .line 788
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/task/TaskStatus;->f()Ljava/lang/String;

    .line 795
    move-result-object v2

    .line 796
    .line 797
    .line 798
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 802
    move-result-object v2

    .line 803
    .line 804
    .line 805
    invoke-virtual {v3, v11, v2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 809
    move-result-object v0

    .line 810
    .line 811
    .line 812
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 813
    move-result v2

    .line 814
    .line 815
    if-eqz v2, :cond_e

    .line 816
    .line 817
    .line 818
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 819
    move-result-object v2

    .line 820
    move-object v3, v2

    .line 821
    .line 822
    check-cast v3, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/task/TaskStatus;->h()Z

    .line 826
    move-result v3

    .line 827
    .line 828
    if-nez v3, :cond_d

    .line 829
    goto :goto_c

    .line 830
    :catchall_3
    move-exception v0

    .line 831
    :goto_b
    const/4 v3, 0x0

    .line 832
    goto :goto_d

    .line 833
    :cond_e
    const/4 v2, 0x0

    .line 834
    .line 835
    :goto_c
    check-cast v2, Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 836
    .line 837
    if-nez v2, :cond_f

    .line 838
    .line 839
    sget-object v0, Lcom/kubi/sdk/pkg/task/TaskStatus;->e:Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;->getOK()Lcom/kubi/sdk/pkg/task/TaskStatus;

    .line 843
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 844
    :cond_f
    const/4 v3, 0x0

    .line 845
    .line 846
    .line 847
    invoke-interface {v1, v3}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 848
    return-object v2

    .line 849
    :catchall_4
    move-exception v0

    .line 850
    move-object v1, v5

    .line 851
    goto :goto_b

    .line 852
    .line 853
    .line 854
    :goto_d
    invoke-interface {v1, v3}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 855
    throw v0

    .line 856
    nop

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
